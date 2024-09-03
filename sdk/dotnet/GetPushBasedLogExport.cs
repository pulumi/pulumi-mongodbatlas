// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetPushBasedLogExport
    {
        /// <summary>
        /// # Data Source: mongodbatlas.PushBasedLogExport
        /// 
        /// `mongodbatlas.PushBasedLogExport` describes the configured project level settings for the push-based log export feature.
        /// 
        /// ## Example Usage
        /// 
        /// ### s
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
        ///     var testPushBasedLogExport = new Mongodbatlas.PushBasedLogExport("test", new()
        ///     {
        ///         ProjectId = project_tf.Id,
        ///         BucketName = logBucket.Bucket,
        ///         IamRoleId = authRole.RoleId,
        ///         PrefixPath = "push-based-log-test",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetPushBasedLogExport.Invoke(new()
        ///     {
        ///         ProjectId = testPushBasedLogExport.ProjectId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["test"] = test.Apply(getPushBasedLogExportResult =&gt; getPushBasedLogExportResult.PrefixPath),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetPushBasedLogExportResult> InvokeAsync(GetPushBasedLogExportArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPushBasedLogExportResult>("mongodbatlas:index/getPushBasedLogExport:getPushBasedLogExport", args ?? new GetPushBasedLogExportArgs(), options.WithDefaults());

        /// <summary>
        /// # Data Source: mongodbatlas.PushBasedLogExport
        /// 
        /// `mongodbatlas.PushBasedLogExport` describes the configured project level settings for the push-based log export feature.
        /// 
        /// ## Example Usage
        /// 
        /// ### s
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
        ///     var testPushBasedLogExport = new Mongodbatlas.PushBasedLogExport("test", new()
        ///     {
        ///         ProjectId = project_tf.Id,
        ///         BucketName = logBucket.Bucket,
        ///         IamRoleId = authRole.RoleId,
        ///         PrefixPath = "push-based-log-test",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetPushBasedLogExport.Invoke(new()
        ///     {
        ///         ProjectId = testPushBasedLogExport.ProjectId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["test"] = test.Apply(getPushBasedLogExportResult =&gt; getPushBasedLogExportResult.PrefixPath),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetPushBasedLogExportResult> Invoke(GetPushBasedLogExportInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPushBasedLogExportResult>("mongodbatlas:index/getPushBasedLogExport:getPushBasedLogExport", args ?? new GetPushBasedLogExportInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPushBasedLogExportArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetPushBasedLogExportArgs()
        {
        }
        public static new GetPushBasedLogExportArgs Empty => new GetPushBasedLogExportArgs();
    }

    public sealed class GetPushBasedLogExportInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetPushBasedLogExportInvokeArgs()
        {
        }
        public static new GetPushBasedLogExportInvokeArgs Empty => new GetPushBasedLogExportInvokeArgs();
    }


    [OutputType]
    public sealed class GetPushBasedLogExportResult
    {
        public readonly string BucketName;
        public readonly string CreateDate;
        public readonly string IamRoleId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string PrefixPath;
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        /// </summary>
        public readonly string ProjectId;
        public readonly string State;

        [OutputConstructor]
        private GetPushBasedLogExportResult(
            string bucketName,

            string createDate,

            string iamRoleId,

            string id,

            string prefixPath,

            string projectId,

            string state)
        {
            BucketName = bucketName;
            CreateDate = createDate;
            IamRoleId = iamRoleId;
            Id = id;
            PrefixPath = prefixPath;
            ProjectId = projectId;
            State = state;
        }
    }
}
