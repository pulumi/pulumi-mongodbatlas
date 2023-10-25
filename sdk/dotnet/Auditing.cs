// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    /// <summary>
    /// `mongodbatlas.Auditing` provides an Auditing resource. This allows auditing to be created.
    /// 
    /// ## Import
    /// 
    /// Auditing must be imported using auditing ID, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import mongodbatlas:index/auditing:Auditing my_auditing 5d09d6a59ccf6445652a444a
    /// ```
    ///  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/auditing/)
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/auditing:Auditing")]
    public partial class Auditing : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Indicates whether the auditing system captures successful authentication attempts for audit filters using the "atype" : "authCheck" auditing event. For more information, see [auditAuthorizationSuccess](https://docs.mongodb.com/manual/reference/parameters/#param.auditAuthorizationSuccess).  **Warning! Enabling Audit authorization successes can severely impact cluster performance. Enable this option with caution.**
        /// </summary>
        [Output("auditAuthorizationSuccess")]
        public Output<bool> AuditAuthorizationSuccess { get; private set; } = null!;

        /// <summary>
        /// JSON-formatted audit filter. For complete documentation on custom auditing filters, see [Configure Audit Filters](https://docs.mongodb.com/manual/tutorial/configure-audit-filters/).
        /// </summary>
        [Output("auditFilter")]
        public Output<string> AuditFilter { get; private set; } = null!;

        /// <summary>
        /// Denotes the configuration method for the audit filter. Possible values are: 
        /// * NONE - auditing not configured for the project.
        /// * FILTER_BUILDER - auditing configured via Atlas UI filter builder.
        /// * FILTER_JSON - auditing configured via Atlas custom filter or API.
        /// </summary>
        [Output("configurationType")]
        public Output<string> ConfigurationType { get; private set; } = null!;

        /// <summary>
        /// Denotes whether or not the project associated with the {project_id} has database auditing enabled.  Defaults to false.
        /// 
        /// &gt; **NOTE:** Auditing created by API Keys must belong to an existing organization.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// The unique ID for the project to configure auditing. **Note: When changing this value to a different project_id it will delete the current audit settings for the original project that was assigned to.**
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;


        /// <summary>
        /// Create a Auditing resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Auditing(string name, AuditingArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/auditing:Auditing", name, args ?? new AuditingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Auditing(string name, Input<string> id, AuditingState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/auditing:Auditing", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Auditing resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Auditing Get(string name, Input<string> id, AuditingState? state = null, CustomResourceOptions? options = null)
        {
            return new Auditing(name, id, state, options);
        }
    }

    public sealed class AuditingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether the auditing system captures successful authentication attempts for audit filters using the "atype" : "authCheck" auditing event. For more information, see [auditAuthorizationSuccess](https://docs.mongodb.com/manual/reference/parameters/#param.auditAuthorizationSuccess).  **Warning! Enabling Audit authorization successes can severely impact cluster performance. Enable this option with caution.**
        /// </summary>
        [Input("auditAuthorizationSuccess")]
        public Input<bool>? AuditAuthorizationSuccess { get; set; }

        /// <summary>
        /// JSON-formatted audit filter. For complete documentation on custom auditing filters, see [Configure Audit Filters](https://docs.mongodb.com/manual/tutorial/configure-audit-filters/).
        /// </summary>
        [Input("auditFilter")]
        public Input<string>? AuditFilter { get; set; }

        /// <summary>
        /// Denotes whether or not the project associated with the {project_id} has database auditing enabled.  Defaults to false.
        /// 
        /// &gt; **NOTE:** Auditing created by API Keys must belong to an existing organization.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The unique ID for the project to configure auditing. **Note: When changing this value to a different project_id it will delete the current audit settings for the original project that was assigned to.**
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public AuditingArgs()
        {
        }
        public static new AuditingArgs Empty => new AuditingArgs();
    }

    public sealed class AuditingState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether the auditing system captures successful authentication attempts for audit filters using the "atype" : "authCheck" auditing event. For more information, see [auditAuthorizationSuccess](https://docs.mongodb.com/manual/reference/parameters/#param.auditAuthorizationSuccess).  **Warning! Enabling Audit authorization successes can severely impact cluster performance. Enable this option with caution.**
        /// </summary>
        [Input("auditAuthorizationSuccess")]
        public Input<bool>? AuditAuthorizationSuccess { get; set; }

        /// <summary>
        /// JSON-formatted audit filter. For complete documentation on custom auditing filters, see [Configure Audit Filters](https://docs.mongodb.com/manual/tutorial/configure-audit-filters/).
        /// </summary>
        [Input("auditFilter")]
        public Input<string>? AuditFilter { get; set; }

        /// <summary>
        /// Denotes the configuration method for the audit filter. Possible values are: 
        /// * NONE - auditing not configured for the project.
        /// * FILTER_BUILDER - auditing configured via Atlas UI filter builder.
        /// * FILTER_JSON - auditing configured via Atlas custom filter or API.
        /// </summary>
        [Input("configurationType")]
        public Input<string>? ConfigurationType { get; set; }

        /// <summary>
        /// Denotes whether or not the project associated with the {project_id} has database auditing enabled.  Defaults to false.
        /// 
        /// &gt; **NOTE:** Auditing created by API Keys must belong to an existing organization.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The unique ID for the project to configure auditing. **Note: When changing this value to a different project_id it will delete the current audit settings for the original project that was assigned to.**
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public AuditingState()
        {
        }
        public static new AuditingState Empty => new AuditingState();
    }
}
