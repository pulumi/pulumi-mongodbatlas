// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Outputs
{

    [OutputType]
    public sealed class GetProjectsResultResult
    {
        /// <summary>
        /// The number of Atlas clusters deployed in the project.
        /// </summary>
        public readonly int ClusterCount;
        /// <summary>
        /// The ISO-8601-formatted timestamp of when Atlas created the project.
        /// </summary>
        public readonly string Created;
        /// <summary>
        /// Autogenerated Unique ID for this data source.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// IP addresses in a project categorized by services. See IP Addresses. **WARNING:** this attribute is deprecated and will be removed in version 1.21.0. Use the `mongodbatlas.getProjectIpAddresses` data source instead.
        /// </summary>
        public readonly Outputs.GetProjectsResultIpAddressesResult IpAddresses;
        /// <summary>
        /// Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project.
        /// </summary>
        public readonly bool IsCollectDatabaseSpecificsStatisticsEnabled;
        /// <summary>
        /// Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.
        /// </summary>
        public readonly bool IsDataExplorerEnabled;
        /// <summary>
        /// Flag that indicates whether to enable extended storage sizes for the specified project.
        /// </summary>
        public readonly bool IsExtendedStorageSizesEnabled;
        /// <summary>
        /// Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements.
        /// </summary>
        public readonly bool IsPerformanceAdvisorEnabled;
        /// <summary>
        /// Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database.
        /// </summary>
        public readonly bool IsRealtimePerformancePanelEnabled;
        /// <summary>
        /// Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui).
        /// </summary>
        public readonly bool IsSchemaAdvisorEnabled;
        /// <summary>
        /// Flag that enables MongoDB Cloud to use its slow operation threshold for the specified project. The threshold determines which operations the Performance Advisor and Query Profiler considers slow. When enabled, MongoDB Cloud uses the average execution time for operations on your cluster to determine slow-running queries. As a result, the threshold is more pertinent to your cluster workload. The slow operation threshold is enabled by default for dedicated clusters (M10+). When disabled, MongoDB Cloud considers any operation that takes longer than 100 milliseconds to be slow. To use this resource, the requesting API Key must have the Project Owner role.
        /// </summary>
        public readonly bool IsSlowOperationThresholdingEnabled;
        /// <summary>
        /// The limits for the specified project. See Limits.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetProjectsResultLimitResult> Limits;
        public readonly string Name;
        /// <summary>
        /// The ID of the organization you want to create the project within.
        /// </summary>
        public readonly string OrgId;
        public readonly string ProjectId;
        /// <summary>
        /// If GOV_REGIONS_ONLY the project can be used for government regions only, otherwise defaults to standard regions. For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
        /// </summary>
        public readonly string RegionUsageRestrictions;
        /// <summary>
        /// Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the project. To learn more, see [Resource Tags](https://www.mongodb.com/docs/atlas/tags/)
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Returns all teams to which the authenticated user has access in the project. See Teams.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetProjectsResultTeamResult> Teams;

        [OutputConstructor]
        private GetProjectsResultResult(
            int clusterCount,

            string created,

            string id,

            Outputs.GetProjectsResultIpAddressesResult ipAddresses,

            bool isCollectDatabaseSpecificsStatisticsEnabled,

            bool isDataExplorerEnabled,

            bool isExtendedStorageSizesEnabled,

            bool isPerformanceAdvisorEnabled,

            bool isRealtimePerformancePanelEnabled,

            bool isSchemaAdvisorEnabled,

            bool isSlowOperationThresholdingEnabled,

            ImmutableArray<Outputs.GetProjectsResultLimitResult> limits,

            string name,

            string orgId,

            string projectId,

            string regionUsageRestrictions,

            ImmutableDictionary<string, string> tags,

            ImmutableArray<Outputs.GetProjectsResultTeamResult> teams)
        {
            ClusterCount = clusterCount;
            Created = created;
            Id = id;
            IpAddresses = ipAddresses;
            IsCollectDatabaseSpecificsStatisticsEnabled = isCollectDatabaseSpecificsStatisticsEnabled;
            IsDataExplorerEnabled = isDataExplorerEnabled;
            IsExtendedStorageSizesEnabled = isExtendedStorageSizesEnabled;
            IsPerformanceAdvisorEnabled = isPerformanceAdvisorEnabled;
            IsRealtimePerformancePanelEnabled = isRealtimePerformancePanelEnabled;
            IsSchemaAdvisorEnabled = isSchemaAdvisorEnabled;
            IsSlowOperationThresholdingEnabled = isSlowOperationThresholdingEnabled;
            Limits = limits;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            RegionUsageRestrictions = regionUsageRestrictions;
            Tags = tags;
            Teams = teams;
        }
    }
}
