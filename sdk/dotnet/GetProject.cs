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
        public readonly ImmutableArray<Outputs.GetProjectApiKeyResult> ApiKeys;
        /// <summary>
        /// The number of Atlas clusters deployed in the project.
        /// </summary>
        public readonly int ClusterCount;
        /// <summary>
        /// The ISO-8601-formatted timestamp of when Atlas created the project.
        /// * `teams.#.team_id` - The unique identifier of the team you want to associate with the project. The team and project must share the same parent organization.
        /// * `teams.#.role_names` - Each string in the array represents a project role assigned to the team. Every user associated with the team inherits these roles. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
        /// * `api_keys.#.api_key_id` - The unique identifier of the programmatic API key you want to associate with the project. The programmatic API key and project must share the same parent organization.
        /// * `api_keys.#.role_names` - Each string in the array represents a project role assigned to the programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
        /// </summary>
        public readonly string Created;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
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
        /// The name of the project you want to create.
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
        public readonly ImmutableArray<Outputs.GetProjectTeamResult> Teams;

        [OutputConstructor]
        private GetProjectResult(
            ImmutableArray<Outputs.GetProjectApiKeyResult> apiKeys,

            int clusterCount,

            string created,

            string id,

            bool isCollectDatabaseSpecificsStatisticsEnabled,

            bool isDataExplorerEnabled,

            bool isExtendedStorageSizesEnabled,

            bool isPerformanceAdvisorEnabled,

            bool isRealtimePerformancePanelEnabled,

            bool isSchemaAdvisorEnabled,

            string? name,

            string orgId,

            string? projectId,

            string regionUsageRestrictions,

            ImmutableArray<Outputs.GetProjectTeamResult> teams)
        {
            ApiKeys = apiKeys;
            ClusterCount = clusterCount;
            Created = created;
            Id = id;
            IsCollectDatabaseSpecificsStatisticsEnabled = isCollectDatabaseSpecificsStatisticsEnabled;
            IsDataExplorerEnabled = isDataExplorerEnabled;
            IsExtendedStorageSizesEnabled = isExtendedStorageSizesEnabled;
            IsPerformanceAdvisorEnabled = isPerformanceAdvisorEnabled;
            IsRealtimePerformancePanelEnabled = isRealtimePerformancePanelEnabled;
            IsSchemaAdvisorEnabled = isSchemaAdvisorEnabled;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            RegionUsageRestrictions = regionUsageRestrictions;
            Teams = teams;
        }
    }
}
