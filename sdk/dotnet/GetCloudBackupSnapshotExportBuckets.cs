// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetCloudBackupSnapshotExportBuckets
    {
        /// <summary>
        /// `mongodbatlas.getCloudBackupSnapshotExportBuckets` datasource allows you to retrieve all the buckets for the specified project.
        /// 
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testCloudBackupSnapshotExportBucket = new Mongodbatlas.CloudBackupSnapshotExportBucket("testCloudBackupSnapshotExportBucket", new()
        ///     {
        ///         BucketName = "example-bucket",
        ///         CloudProvider = "AWS",
        ///         IamRoleId = "{IAM_ROLE_ID}",
        ///         ProjectId = "{PROJECT_ID}",
        ///     });
        /// 
        ///     var testCloudBackupSnapshotExportBuckets = Mongodbatlas.GetCloudBackupSnapshotExportBuckets.Invoke(new()
        ///     {
        ///         ProjectId = "{PROJECT_ID}",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCloudBackupSnapshotExportBucketsResult> InvokeAsync(GetCloudBackupSnapshotExportBucketsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCloudBackupSnapshotExportBucketsResult>("mongodbatlas:index/getCloudBackupSnapshotExportBuckets:getCloudBackupSnapshotExportBuckets", args ?? new GetCloudBackupSnapshotExportBucketsArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.getCloudBackupSnapshotExportBuckets` datasource allows you to retrieve all the buckets for the specified project.
        /// 
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testCloudBackupSnapshotExportBucket = new Mongodbatlas.CloudBackupSnapshotExportBucket("testCloudBackupSnapshotExportBucket", new()
        ///     {
        ///         BucketName = "example-bucket",
        ///         CloudProvider = "AWS",
        ///         IamRoleId = "{IAM_ROLE_ID}",
        ///         ProjectId = "{PROJECT_ID}",
        ///     });
        /// 
        ///     var testCloudBackupSnapshotExportBuckets = Mongodbatlas.GetCloudBackupSnapshotExportBuckets.Invoke(new()
        ///     {
        ///         ProjectId = "{PROJECT_ID}",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetCloudBackupSnapshotExportBucketsResult> Invoke(GetCloudBackupSnapshotExportBucketsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudBackupSnapshotExportBucketsResult>("mongodbatlas:index/getCloudBackupSnapshotExportBuckets:getCloudBackupSnapshotExportBuckets", args ?? new GetCloudBackupSnapshotExportBucketsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCloudBackupSnapshotExportBucketsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
        /// </summary>
        [Input("itemsPerPage")]
        public int? ItemsPerPage { get; set; }

        /// <summary>
        /// The page to return. Defaults to `1`.
        /// </summary>
        [Input("pageNum")]
        public int? PageNum { get; set; }

        /// <summary>
        /// The unique identifier of the project for the Atlas cluster.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetCloudBackupSnapshotExportBucketsArgs()
        {
        }
        public static new GetCloudBackupSnapshotExportBucketsArgs Empty => new GetCloudBackupSnapshotExportBucketsArgs();
    }

    public sealed class GetCloudBackupSnapshotExportBucketsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
        /// </summary>
        [Input("itemsPerPage")]
        public Input<int>? ItemsPerPage { get; set; }

        /// <summary>
        /// The page to return. Defaults to `1`.
        /// </summary>
        [Input("pageNum")]
        public Input<int>? PageNum { get; set; }

        /// <summary>
        /// The unique identifier of the project for the Atlas cluster.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetCloudBackupSnapshotExportBucketsInvokeArgs()
        {
        }
        public static new GetCloudBackupSnapshotExportBucketsInvokeArgs Empty => new GetCloudBackupSnapshotExportBucketsInvokeArgs();
    }


    [OutputType]
    public sealed class GetCloudBackupSnapshotExportBucketsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly int? ItemsPerPage;
        public readonly int? PageNum;
        /// <summary>
        /// The unique identifier of the project for the Atlas cluster.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// Includes CloudProviderSnapshotExportBucket object for each item detailed in the results array section.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudBackupSnapshotExportBucketsResultResult> Results;
        public readonly int TotalCount;

        [OutputConstructor]
        private GetCloudBackupSnapshotExportBucketsResult(
            string id,

            int? itemsPerPage,

            int? pageNum,

            string projectId,

            ImmutableArray<Outputs.GetCloudBackupSnapshotExportBucketsResultResult> results,

            int totalCount)
        {
            Id = id;
            ItemsPerPage = itemsPerPage;
            PageNum = pageNum;
            ProjectId = projectId;
            Results = results;
            TotalCount = totalCount;
        }
    }
}
