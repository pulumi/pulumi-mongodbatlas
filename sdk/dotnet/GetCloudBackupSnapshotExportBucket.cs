// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetCloudBackupSnapshotExportBucket
    {
        /// <summary>
        /// `mongodbatlas.CloudBackupSnapshotExportBucket` datasource allows you to retrieve all the buckets for the specified project.
        /// 
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testCloudBackupSnapshotExportBucket = new Mongodbatlas.CloudBackupSnapshotExportBucket("test", new()
        ///     {
        ///         ProjectId = "{PROJECT_ID}",
        ///         IamRoleId = "{IAM_ROLE_ID}",
        ///         BucketName = "example-bucket",
        ///         CloudProvider = "AWS",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetCloudBackupSnapshotExportBucket.Invoke(new()
        ///     {
        ///         ProjectId = "{PROJECT_ID}",
        ///         ExportBucketId = testCloudBackupSnapshotExportBucket.ExportBucketId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetCloudBackupSnapshotExportBucketResult> InvokeAsync(GetCloudBackupSnapshotExportBucketArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCloudBackupSnapshotExportBucketResult>("mongodbatlas:index/getCloudBackupSnapshotExportBucket:getCloudBackupSnapshotExportBucket", args ?? new GetCloudBackupSnapshotExportBucketArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.CloudBackupSnapshotExportBucket` datasource allows you to retrieve all the buckets for the specified project.
        /// 
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testCloudBackupSnapshotExportBucket = new Mongodbatlas.CloudBackupSnapshotExportBucket("test", new()
        ///     {
        ///         ProjectId = "{PROJECT_ID}",
        ///         IamRoleId = "{IAM_ROLE_ID}",
        ///         BucketName = "example-bucket",
        ///         CloudProvider = "AWS",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetCloudBackupSnapshotExportBucket.Invoke(new()
        ///     {
        ///         ProjectId = "{PROJECT_ID}",
        ///         ExportBucketId = testCloudBackupSnapshotExportBucket.ExportBucketId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCloudBackupSnapshotExportBucketResult> Invoke(GetCloudBackupSnapshotExportBucketInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudBackupSnapshotExportBucketResult>("mongodbatlas:index/getCloudBackupSnapshotExportBucket:getCloudBackupSnapshotExportBucket", args ?? new GetCloudBackupSnapshotExportBucketInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCloudBackupSnapshotExportBucketArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the snapshot export bucket.
        /// </summary>
        [Input("exportBucketId", required: true)]
        public string ExportBucketId { get; set; } = null!;

        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// The unique identifier of the project for the Atlas cluster.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetCloudBackupSnapshotExportBucketArgs()
        {
        }
        public static new GetCloudBackupSnapshotExportBucketArgs Empty => new GetCloudBackupSnapshotExportBucketArgs();
    }

    public sealed class GetCloudBackupSnapshotExportBucketInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the snapshot export bucket.
        /// </summary>
        [Input("exportBucketId", required: true)]
        public Input<string> ExportBucketId { get; set; } = null!;

        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The unique identifier of the project for the Atlas cluster.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetCloudBackupSnapshotExportBucketInvokeArgs()
        {
        }
        public static new GetCloudBackupSnapshotExportBucketInvokeArgs Empty => new GetCloudBackupSnapshotExportBucketInvokeArgs();
    }


    [OutputType]
    public sealed class GetCloudBackupSnapshotExportBucketResult
    {
        /// <summary>
        /// Name of the bucket that the provided role ID is authorized to access. You must also specify the `iam_role_id`.
        /// </summary>
        public readonly string BucketName;
        /// <summary>
        /// Name of the provider of the cloud service where Atlas can access the S3 bucket. Atlas only supports `AWS`.
        /// </summary>
        public readonly string CloudProvider;
        public readonly string ExportBucketId;
        /// <summary>
        /// Unique identifier of the role that Atlas can use to access the bucket. You must also specify the `bucket_name`.
        /// </summary>
        public readonly string IamRoleId;
        public readonly string Id;
        public readonly string ProjectId;

        [OutputConstructor]
        private GetCloudBackupSnapshotExportBucketResult(
            string bucketName,

            string cloudProvider,

            string exportBucketId,

            string iamRoleId,

            string id,

            string projectId)
        {
            BucketName = bucketName;
            CloudProvider = cloudProvider;
            ExportBucketId = exportBucketId;
            IamRoleId = iamRoleId;
            Id = id;
            ProjectId = projectId;
        }
    }
}
