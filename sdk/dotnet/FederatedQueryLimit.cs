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
    /// `mongodbatlas.FederatedQueryLimit` provides a Federated Database Instance Query Limits resource. To learn more about Atlas Data Federation see https://www.mongodb.com/docs/atlas/data-federation/overview/.
    /// 
    /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
    /// 
    /// ## Example Usage
    /// 
    /// ### S
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.FederatedQueryLimit("test", new()
    ///     {
    ///         LimitName = "bytesProcessed.weekly",
    ///         OverrunPolicy = "BLOCK",
    ///         ProjectId = "64707f06c519c20c3a2b1b03",
    ///         TenantName = "FederatedDatabseInstance0",
    ///         Value = 5147483648,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// The Federated Database Instance Query Limit can be imported using project ID, name of the instance and limit name, in the format:
    /// `project_id`--`tenant_name`--`limit_name`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import mongodbatlas:index/federatedQueryLimit:FederatedQueryLimit example 1112222b3bf99403840e8934--FederatedDatabaseInstance0--bytesProcessed.daily
    /// ```
    /// See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createOneDataFederationQueryLimit) Documentation for more information.
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/federatedQueryLimit:FederatedQueryLimit")]
    public partial class FederatedQueryLimit : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amount that indicates the current usage of the limit.
        /// </summary>
        [Output("currentUsage")]
        public Output<int> CurrentUsage { get; private set; } = null!;

        /// <summary>
        /// Default value of the limit.
        /// </summary>
        [Output("defaultLimit")]
        public Output<int?> DefaultLimit { get; private set; } = null!;

        [Output("lastModifiedDate")]
        public Output<string> LastModifiedDate { get; private set; } = null!;

        /// <summary>
        /// String enum that indicates whether the identity provider is active or not. Accepted values are:
        /// * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
        /// * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
        /// * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
        /// * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
        /// </summary>
        [Output("limitName")]
        public Output<string> LimitName { get; private set; } = null!;

        [Output("maximumLimit")]
        public Output<int?> MaximumLimit { get; private set; } = null!;

        /// <summary>
        /// String enum that identifies action to take when the usage limit is exceeded. If limit span is set to QUERY, this is ignored because MongoDB Cloud stops the query when it exceeds the usage limit. Accepted values are "BLOCK" OR "BLOCK_AND_KILL"
        /// </summary>
        [Output("overrunPolicy")]
        public Output<string> OverrunPolicy { get; private set; } = null!;

        /// <summary>
        /// The unique ID for the project to create a Federated Database Instance.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Name of the Atlas Federated Database Instance.
        /// </summary>
        [Output("tenantName")]
        public Output<string> TenantName { get; private set; } = null!;

        /// <summary>
        /// Amount to set the limit to.
        /// </summary>
        [Output("value")]
        public Output<int> Value { get; private set; } = null!;


        /// <summary>
        /// Create a FederatedQueryLimit resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FederatedQueryLimit(string name, FederatedQueryLimitArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/federatedQueryLimit:FederatedQueryLimit", name, args ?? new FederatedQueryLimitArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FederatedQueryLimit(string name, Input<string> id, FederatedQueryLimitState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/federatedQueryLimit:FederatedQueryLimit", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FederatedQueryLimit resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FederatedQueryLimit Get(string name, Input<string> id, FederatedQueryLimitState? state = null, CustomResourceOptions? options = null)
        {
            return new FederatedQueryLimit(name, id, state, options);
        }
    }

    public sealed class FederatedQueryLimitArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Default value of the limit.
        /// </summary>
        [Input("defaultLimit")]
        public Input<int>? DefaultLimit { get; set; }

        /// <summary>
        /// String enum that indicates whether the identity provider is active or not. Accepted values are:
        /// * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
        /// * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
        /// * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
        /// * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
        /// </summary>
        [Input("limitName", required: true)]
        public Input<string> LimitName { get; set; } = null!;

        [Input("maximumLimit")]
        public Input<int>? MaximumLimit { get; set; }

        /// <summary>
        /// String enum that identifies action to take when the usage limit is exceeded. If limit span is set to QUERY, this is ignored because MongoDB Cloud stops the query when it exceeds the usage limit. Accepted values are "BLOCK" OR "BLOCK_AND_KILL"
        /// </summary>
        [Input("overrunPolicy", required: true)]
        public Input<string> OverrunPolicy { get; set; } = null!;

        /// <summary>
        /// The unique ID for the project to create a Federated Database Instance.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Name of the Atlas Federated Database Instance.
        /// </summary>
        [Input("tenantName", required: true)]
        public Input<string> TenantName { get; set; } = null!;

        /// <summary>
        /// Amount to set the limit to.
        /// </summary>
        [Input("value", required: true)]
        public Input<int> Value { get; set; } = null!;

        public FederatedQueryLimitArgs()
        {
        }
        public static new FederatedQueryLimitArgs Empty => new FederatedQueryLimitArgs();
    }

    public sealed class FederatedQueryLimitState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amount that indicates the current usage of the limit.
        /// </summary>
        [Input("currentUsage")]
        public Input<int>? CurrentUsage { get; set; }

        /// <summary>
        /// Default value of the limit.
        /// </summary>
        [Input("defaultLimit")]
        public Input<int>? DefaultLimit { get; set; }

        [Input("lastModifiedDate")]
        public Input<string>? LastModifiedDate { get; set; }

        /// <summary>
        /// String enum that indicates whether the identity provider is active or not. Accepted values are:
        /// * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
        /// * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
        /// * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
        /// * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
        /// </summary>
        [Input("limitName")]
        public Input<string>? LimitName { get; set; }

        [Input("maximumLimit")]
        public Input<int>? MaximumLimit { get; set; }

        /// <summary>
        /// String enum that identifies action to take when the usage limit is exceeded. If limit span is set to QUERY, this is ignored because MongoDB Cloud stops the query when it exceeds the usage limit. Accepted values are "BLOCK" OR "BLOCK_AND_KILL"
        /// </summary>
        [Input("overrunPolicy")]
        public Input<string>? OverrunPolicy { get; set; }

        /// <summary>
        /// The unique ID for the project to create a Federated Database Instance.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Name of the Atlas Federated Database Instance.
        /// </summary>
        [Input("tenantName")]
        public Input<string>? TenantName { get; set; }

        /// <summary>
        /// Amount to set the limit to.
        /// </summary>
        [Input("value")]
        public Input<int>? Value { get; set; }

        public FederatedQueryLimitState()
        {
        }
        public static new FederatedQueryLimitState Empty => new FederatedQueryLimitState();
    }
}
