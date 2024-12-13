// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetCloudBackupSnapshotExportJobs
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.getCloudBackupSnapshotExportJobs
        /// 
        /// `mongodbatlas.getCloudBackupSnapshotExportJobs` datasource allows you to retrieve all the buckets for the specified project.
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
        ///         BucketName = "example_bucket",
        ///         CloudProvider = "AWS",
        ///     });
        /// 
        ///     var testCloudBackupSnapshotExportJob = new Mongodbatlas.CloudBackupSnapshotExportJob("test", new()
        ///     {
        ///         ProjectId = "{PROJECT_ID}",
        ///         ClusterName = "{CLUSTER_NAME}",
        ///         SnapshotId = "{SNAPSHOT_ID}",
        ///         ExportBucketId = testCloudBackupSnapshotExportBucket.ExportBucketId,
        ///         CustomDatas = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.CloudBackupSnapshotExportJobCustomDataArgs
        ///             {
        ///                 Key = "exported by",
        ///                 Value = "myName",
        ///             },
        ///         },
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetCloudBackupSnapshotExportJobs.Invoke(new()
        ///     {
        ///         ProjectId = "{PROJECT_ID}",
        ///         ClusterName = "{CLUSTER_NAME}",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetCloudBackupSnapshotExportJobsResult> InvokeAsync(GetCloudBackupSnapshotExportJobsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCloudBackupSnapshotExportJobsResult>("mongodbatlas:index/getCloudBackupSnapshotExportJobs:getCloudBackupSnapshotExportJobs", args ?? new GetCloudBackupSnapshotExportJobsArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getCloudBackupSnapshotExportJobs
        /// 
        /// `mongodbatlas.getCloudBackupSnapshotExportJobs` datasource allows you to retrieve all the buckets for the specified project.
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
        ///         BucketName = "example_bucket",
        ///         CloudProvider = "AWS",
        ///     });
        /// 
        ///     var testCloudBackupSnapshotExportJob = new Mongodbatlas.CloudBackupSnapshotExportJob("test", new()
        ///     {
        ///         ProjectId = "{PROJECT_ID}",
        ///         ClusterName = "{CLUSTER_NAME}",
        ///         SnapshotId = "{SNAPSHOT_ID}",
        ///         ExportBucketId = testCloudBackupSnapshotExportBucket.ExportBucketId,
        ///         CustomDatas = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.CloudBackupSnapshotExportJobCustomDataArgs
        ///             {
        ///                 Key = "exported by",
        ///                 Value = "myName",
        ///             },
        ///         },
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetCloudBackupSnapshotExportJobs.Invoke(new()
        ///     {
        ///         ProjectId = "{PROJECT_ID}",
        ///         ClusterName = "{CLUSTER_NAME}",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCloudBackupSnapshotExportJobsResult> Invoke(GetCloudBackupSnapshotExportJobsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudBackupSnapshotExportJobsResult>("mongodbatlas:index/getCloudBackupSnapshotExportJobs:getCloudBackupSnapshotExportJobs", args ?? new GetCloudBackupSnapshotExportJobsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getCloudBackupSnapshotExportJobs
        /// 
        /// `mongodbatlas.getCloudBackupSnapshotExportJobs` datasource allows you to retrieve all the buckets for the specified project.
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
        ///         BucketName = "example_bucket",
        ///         CloudProvider = "AWS",
        ///     });
        /// 
        ///     var testCloudBackupSnapshotExportJob = new Mongodbatlas.CloudBackupSnapshotExportJob("test", new()
        ///     {
        ///         ProjectId = "{PROJECT_ID}",
        ///         ClusterName = "{CLUSTER_NAME}",
        ///         SnapshotId = "{SNAPSHOT_ID}",
        ///         ExportBucketId = testCloudBackupSnapshotExportBucket.ExportBucketId,
        ///         CustomDatas = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.CloudBackupSnapshotExportJobCustomDataArgs
        ///             {
        ///                 Key = "exported by",
        ///                 Value = "myName",
        ///             },
        ///         },
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetCloudBackupSnapshotExportJobs.Invoke(new()
        ///     {
        ///         ProjectId = "{PROJECT_ID}",
        ///         ClusterName = "{CLUSTER_NAME}",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCloudBackupSnapshotExportJobsResult> Invoke(GetCloudBackupSnapshotExportJobsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudBackupSnapshotExportJobsResult>("mongodbatlas:index/getCloudBackupSnapshotExportJobs:getCloudBackupSnapshotExportJobs", args ?? new GetCloudBackupSnapshotExportJobsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCloudBackupSnapshotExportJobsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the Atlas cluster whose export job you want to retrieve.
        /// </summary>
        [Input("clusterName", required: true)]
        public string ClusterName { get; set; } = null!;

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

        public GetCloudBackupSnapshotExportJobsArgs()
        {
        }
        public static new GetCloudBackupSnapshotExportJobsArgs Empty => new GetCloudBackupSnapshotExportJobsArgs();
    }

    public sealed class GetCloudBackupSnapshotExportJobsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the Atlas cluster whose export job you want to retrieve.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

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

        public GetCloudBackupSnapshotExportJobsInvokeArgs()
        {
        }
        public static new GetCloudBackupSnapshotExportJobsInvokeArgs Empty => new GetCloudBackupSnapshotExportJobsInvokeArgs();
    }


    [OutputType]
    public sealed class GetCloudBackupSnapshotExportJobsResult
    {
        public readonly string ClusterName;
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
        /// Includes CloudProviderSnapshotExportJob object for each item detailed in the results array section.
        /// * `totalCount` - Count of the total number of items in the result set. It may be greater than the number of objects in the results array if the entire result set is paginated.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudBackupSnapshotExportJobsResultResult> Results;
        public readonly int TotalCount;

        [OutputConstructor]
        private GetCloudBackupSnapshotExportJobsResult(
            string clusterName,

            string id,

            int? itemsPerPage,

            int? pageNum,

            string projectId,

            ImmutableArray<Outputs.GetCloudBackupSnapshotExportJobsResultResult> results,

            int totalCount)
        {
            ClusterName = clusterName;
            Id = id;
            ItemsPerPage = itemsPerPage;
            PageNum = pageNum;
            ProjectId = projectId;
            Results = results;
            TotalCount = totalCount;
        }
    }
}
