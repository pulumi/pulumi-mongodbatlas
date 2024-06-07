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
    /// `mongodbatlas.PushBasedLogExport` provides a resource for push-based log export feature. The resource lets you configure, enable &amp; disable the project level settings for the push-based log export feature. Using this resource you
    /// can continually push logs from mongod, mongos, and audit logs to an Amazon S3 bucket. Atlas exports logs every 5 minutes.
    /// 
    /// ## Example Usage
    /// 
    /// ### S
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var project_tf = new Mongodbatlas.Project("project-tf", new()
    ///     {
    ///         Name = atlasProjectName,
    ///         OrgId = atlasOrgId,
    ///     });
    /// 
    ///     // Set up cloud provider access in Atlas using the created IAM role
    ///     var setupOnly = new Mongodbatlas.CloudProviderAccessSetup("setup_only", new()
    ///     {
    ///         ProjectId = project_tf.Id,
    ///         ProviderName = "AWS",
    ///     });
    /// 
    ///     var authRole = new Mongodbatlas.CloudProviderAccessAuthorization("auth_role", new()
    ///     {
    ///         ProjectId = project_tf.Id,
    ///         RoleId = setupOnly.RoleId,
    ///         Aws = new Mongodbatlas.Inputs.CloudProviderAccessAuthorizationAwsArgs
    ///         {
    ///             IamAssumedRoleArn = testRole.Arn,
    ///         },
    ///     });
    /// 
    ///     // Set up push-based log export with authorized IAM role
    ///     var test = new Mongodbatlas.PushBasedLogExport("test", new()
    ///     {
    ///         ProjectId = project_tf.Id,
    ///         BucketName = logBucket.Bucket,
    ///         IamRoleId = authRole.RoleId,
    ///         PrefixPath = "push-based-log-test",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/pushBasedLogExport:PushBasedLogExport")]
    public partial class PushBasedLogExport : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the bucket to which the agent sends the logs to.
        /// </summary>
        [Output("bucketName")]
        public Output<string> BucketName { get; private set; } = null!;

        /// <summary>
        /// Date and time that this feature was enabled on.
        /// </summary>
        [Output("createDate")]
        public Output<string> CreateDate { get; private set; } = null!;

        /// <summary>
        /// ID of the AWS IAM role that is used to write to the S3 bucket.
        /// </summary>
        [Output("iamRoleId")]
        public Output<string> IamRoleId { get; private set; } = null!;

        /// <summary>
        /// S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
        /// </summary>
        [Output("prefixPath")]
        public Output<string> PrefixPath { get; private set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Describes whether or not the feature is enabled and what status it is in.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        [Output("timeouts")]
        public Output<Outputs.PushBasedLogExportTimeouts?> Timeouts { get; private set; } = null!;


        /// <summary>
        /// Create a PushBasedLogExport resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PushBasedLogExport(string name, PushBasedLogExportArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/pushBasedLogExport:PushBasedLogExport", name, args ?? new PushBasedLogExportArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PushBasedLogExport(string name, Input<string> id, PushBasedLogExportState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/pushBasedLogExport:PushBasedLogExport", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PushBasedLogExport resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PushBasedLogExport Get(string name, Input<string> id, PushBasedLogExportState? state = null, CustomResourceOptions? options = null)
        {
            return new PushBasedLogExport(name, id, state, options);
        }
    }

    public sealed class PushBasedLogExportArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the bucket to which the agent sends the logs to.
        /// </summary>
        [Input("bucketName", required: true)]
        public Input<string> BucketName { get; set; } = null!;

        /// <summary>
        /// ID of the AWS IAM role that is used to write to the S3 bucket.
        /// </summary>
        [Input("iamRoleId", required: true)]
        public Input<string> IamRoleId { get; set; } = null!;

        /// <summary>
        /// S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
        /// </summary>
        [Input("prefixPath")]
        public Input<string>? PrefixPath { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        [Input("timeouts")]
        public Input<Inputs.PushBasedLogExportTimeoutsArgs>? Timeouts { get; set; }

        public PushBasedLogExportArgs()
        {
        }
        public static new PushBasedLogExportArgs Empty => new PushBasedLogExportArgs();
    }

    public sealed class PushBasedLogExportState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the bucket to which the agent sends the logs to.
        /// </summary>
        [Input("bucketName")]
        public Input<string>? BucketName { get; set; }

        /// <summary>
        /// Date and time that this feature was enabled on.
        /// </summary>
        [Input("createDate")]
        public Input<string>? CreateDate { get; set; }

        /// <summary>
        /// ID of the AWS IAM role that is used to write to the S3 bucket.
        /// </summary>
        [Input("iamRoleId")]
        public Input<string>? IamRoleId { get; set; }

        /// <summary>
        /// S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
        /// </summary>
        [Input("prefixPath")]
        public Input<string>? PrefixPath { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Describes whether or not the feature is enabled and what status it is in.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("timeouts")]
        public Input<Inputs.PushBasedLogExportTimeoutsGetArgs>? Timeouts { get; set; }

        public PushBasedLogExportState()
        {
        }
        public static new PushBasedLogExportState Empty => new PushBasedLogExportState();
    }
}
