// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetCloudProviderSnapshotRestoreJobs
    {
        /// <summary>
        /// **WARNING:** This datasource is deprecated, use `mongodbatlas_cloud_backup_snapshots_restore_jobs`
        /// 
        /// `mongodbatlas.getCloudProviderSnapshotRestoreJobs` provides a Cloud Backup Snapshot Restore Jobs datasource. Gets all the cloud backup snapshot restore jobs for the specified cluster.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// </summary>
        public static Task<GetCloudProviderSnapshotRestoreJobsResult> InvokeAsync(GetCloudProviderSnapshotRestoreJobsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetCloudProviderSnapshotRestoreJobsResult>("mongodbatlas:index/getCloudProviderSnapshotRestoreJobs:getCloudProviderSnapshotRestoreJobs", args ?? new GetCloudProviderSnapshotRestoreJobsArgs(), options.WithDefaults());

        /// <summary>
        /// **WARNING:** This datasource is deprecated, use `mongodbatlas_cloud_backup_snapshots_restore_jobs`
        /// 
        /// `mongodbatlas.getCloudProviderSnapshotRestoreJobs` provides a Cloud Backup Snapshot Restore Jobs datasource. Gets all the cloud backup snapshot restore jobs for the specified cluster.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// </summary>
        public static Output<GetCloudProviderSnapshotRestoreJobsResult> Invoke(GetCloudProviderSnapshotRestoreJobsInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetCloudProviderSnapshotRestoreJobsResult>("mongodbatlas:index/getCloudProviderSnapshotRestoreJobs:getCloudProviderSnapshotRestoreJobs", args ?? new GetCloudProviderSnapshotRestoreJobsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCloudProviderSnapshotRestoreJobsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Atlas cluster for which you want to retrieve restore jobs.
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

        public GetCloudProviderSnapshotRestoreJobsArgs()
        {
        }
        public static new GetCloudProviderSnapshotRestoreJobsArgs Empty => new GetCloudProviderSnapshotRestoreJobsArgs();
    }

    public sealed class GetCloudProviderSnapshotRestoreJobsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Atlas cluster for which you want to retrieve restore jobs.
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

        public GetCloudProviderSnapshotRestoreJobsInvokeArgs()
        {
        }
        public static new GetCloudProviderSnapshotRestoreJobsInvokeArgs Empty => new GetCloudProviderSnapshotRestoreJobsInvokeArgs();
    }


    [OutputType]
    public sealed class GetCloudProviderSnapshotRestoreJobsResult
    {
        public readonly string ClusterName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly int? ItemsPerPage;
        public readonly int? PageNum;
        public readonly string ProjectId;
        /// <summary>
        /// Includes cloudProviderSnapshotRestoreJob object for each item detailed in the results array section.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudProviderSnapshotRestoreJobsResultResult> Results;
        public readonly int TotalCount;

        [OutputConstructor]
        private GetCloudProviderSnapshotRestoreJobsResult(
            string clusterName,

            string id,

            int? itemsPerPage,

            int? pageNum,

            string projectId,

            ImmutableArray<Outputs.GetCloudProviderSnapshotRestoreJobsResultResult> results,

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
