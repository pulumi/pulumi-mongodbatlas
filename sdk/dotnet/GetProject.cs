// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetProject
    {
        /// <summary>
        /// `mongodbatlas.Project` describes a MongoDB Atlas Project. This represents a project that has been created.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetProjectResult> InvokeAsync(GetProjectArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProjectResult>("mongodbatlas:index/getProject:getProject", args ?? new GetProjectArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.Project` describes a MongoDB Atlas Project. This represents a project that has been created.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetProjectResult> Invoke(GetProjectInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProjectResult>("mongodbatlas:index/getProject:getProject", args ?? new GetProjectInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProjectArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project.
        /// 
        /// &gt; **IMPORTANT:** Either `project_id` or `name` must be configurated.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The unique ID for the project.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        public GetProjectArgs()
        {
        }
        public static new GetProjectArgs Empty => new GetProjectArgs();
    }

    public sealed class GetProjectInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project.
        /// 
        /// &gt; **IMPORTANT:** Either `project_id` or `name` must be configurated.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The unique ID for the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public GetProjectInvokeArgs()
        {
        }
        public static new GetProjectInvokeArgs Empty => new GetProjectInvokeArgs();
    }


    [OutputType]
    public sealed class GetProjectResult
    {
        /// <summary>
        /// The number of Atlas clusters deployed in the project.
        /// </summary>
        public readonly int ClusterCount;
        /// <summary>
        /// The ISO-8601-formatted timestamp of when Atlas created the project.
        /// </summary>
        public readonly string Created;
        public readonly string Id;
        /// <summary>
        /// IP addresses in a project categorized by services. See IP Addresses.
        /// </summary>
        public readonly Outputs.GetProjectIpAddressesResult IpAddresses;
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
        /// The limits for the specified project. See Limits.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetProjectLimitResult> Limits;
        /// <summary>
        /// Human-readable label that identifies this project limit.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The ID of the organization you want to create the project within.
        /// </summary>
        public readonly string OrgId;
        public readonly string? ProjectId;
        /// <summary>
        /// If GOV_REGIONS_ONLY the project can be used for government regions only, otherwise defaults to standard regions. For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
        /// </summary>
        public readonly string RegionUsageRestrictions;
        /// <summary>
        /// Returns all teams to which the authenticated user has access in the project. See Teams.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetProjectTeamResult> Teams;

        [OutputConstructor]
        private GetProjectResult(
            int clusterCount,

            string created,

            string id,

            Outputs.GetProjectIpAddressesResult ipAddresses,

            bool isCollectDatabaseSpecificsStatisticsEnabled,

            bool isDataExplorerEnabled,

            bool isExtendedStorageSizesEnabled,

            bool isPerformanceAdvisorEnabled,

            bool isRealtimePerformancePanelEnabled,

            bool isSchemaAdvisorEnabled,

            ImmutableArray<Outputs.GetProjectLimitResult> limits,

            string? name,

            string orgId,

            string? projectId,

            string regionUsageRestrictions,

            ImmutableArray<Outputs.GetProjectTeamResult> teams)
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
            Limits = limits;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            RegionUsageRestrictions = regionUsageRestrictions;
            Teams = teams;
        }
    }
}
