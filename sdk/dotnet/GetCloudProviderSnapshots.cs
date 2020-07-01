// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetCloudProviderSnapshots
    {
        /// <summary>
        /// `mongodbatlas.getCloudProviderSnapshots` provides an Cloud Backup Snapshot datasource. Atlas Cloud Backup Snapshots provide localized backup storage using the native snapshot functionality of the cluster’s cloud service.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// </summary>
        public static Task<GetCloudProviderSnapshotsResult> InvokeAsync(GetCloudProviderSnapshotsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetCloudProviderSnapshotsResult>("mongodbatlas:index/getCloudProviderSnapshots:getCloudProviderSnapshots", args ?? new GetCloudProviderSnapshotsArgs(), options.WithVersion());
    }


    public sealed class GetCloudProviderSnapshotsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Atlas cluster that contains the snapshot you want to retrieve.
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

        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetCloudProviderSnapshotsArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetCloudProviderSnapshotsResult
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
        /// Includes cloudProviderSnapshot object for each item detailed in the results array section.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudProviderSnapshotsResultResult> Results;
        public readonly int TotalCount;

        [OutputConstructor]
        private GetCloudProviderSnapshotsResult(
            string clusterName,

            string id,

            int? itemsPerPage,

            int? pageNum,

            string projectId,

            ImmutableArray<Outputs.GetCloudProviderSnapshotsResultResult> results,

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
