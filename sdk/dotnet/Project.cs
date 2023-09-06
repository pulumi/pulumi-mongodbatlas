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
    /// `mongodbatlas.Project` provides a Project resource. This allows project to be created.
    /// 
    /// &gt; **NOTE:** If Backup Compliance Policy is enabled for the project for which this backup schedule is defined, you cannot delete the Atlas project if any snapshots exist.  See [Backup Compliance Policy Prohibited Actions and Considerations](https://www.mongodb.com/docs/atlas/backup/cloud-backup/backup-compliance-policy/#configure-a-backup-compliance-policy).
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
    ///     var testRolesOrgId = Mongodbatlas.GetRolesOrgId.Invoke();
    /// 
    ///     var testProject = new Mongodbatlas.Project("testProject", new()
    ///     {
    ///         OrgId = testRolesOrgId.Apply(getRolesOrgIdResult =&gt; getRolesOrgIdResult.OrgId),
    ///         ProjectOwnerId = "&lt;OWNER_ACCOUNT_ID&gt;",
    ///         Teams = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.ProjectTeamArgs
    ///             {
    ///                 TeamId = "5e0fa8c99ccf641c722fe645",
    ///                 RoleNames = new[]
    ///                 {
    ///                     "GROUP_OWNER",
    ///                 },
    ///             },
    ///             new Mongodbatlas.Inputs.ProjectTeamArgs
    ///             {
    ///                 TeamId = "5e1dd7b4f2a30ba80a70cd4rw",
    ///                 RoleNames = new[]
    ///                 {
    ///                     "GROUP_READ_ONLY",
    ///                     "GROUP_DATA_ACCESS_READ_WRITE",
    ///                 },
    ///             },
    ///         },
    ///         ApiKeys = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.ProjectApiKeyArgs
    ///             {
    ///                 ApiKeyId = "61003b299dda8d54a9d7d10c",
    ///                 RoleNames = new[]
    ///                 {
    ///                     "GROUP_READ_ONLY",
    ///                 },
    ///             },
    ///         },
    ///         Limits = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.ProjectLimitArgs
    ///             {
    ///                 Name = "atlas.project.deployment.clusters",
    ///                 Value = 26,
    ///             },
    ///             new Mongodbatlas.Inputs.ProjectLimitArgs
    ///             {
    ///                 Name = "atlas.project.deployment.nodesPerPrivateLinkRegion",
    ///                 Value = 51,
    ///             },
    ///         },
    ///         IsCollectDatabaseSpecificsStatisticsEnabled = true,
    ///         IsDataExplorerEnabled = true,
    ///         IsExtendedStorageSizesEnabled = true,
    ///         IsPerformanceAdvisorEnabled = true,
    ///         IsRealtimePerformancePanelEnabled = true,
    ///         IsSchemaAdvisorEnabled = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Project must be imported using project ID, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import mongodbatlas:index/project:Project my_project 5d09d6a59ccf6445652a444a
    /// ```
    ///  For more information see[MongoDB Atlas Admin API Projects](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Projects) and [MongoDB Atlas Admin API Teams](https://docs.atlas.mongodb.com/reference/api/teams/) Documentation for more information.
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/project:Project")]
    public partial class Project : global::Pulumi.CustomResource
    {
        [Output("apiKeys")]
        public Output<ImmutableArray<Outputs.ProjectApiKey>> ApiKeys { get; private set; } = null!;

        /// <summary>
        /// The number of Atlas clusters deployed in the project..
        /// </summary>
        [Output("clusterCount")]
        public Output<int> ClusterCount { get; private set; } = null!;

        /// <summary>
        /// The ISO-8601-formatted timestamp of when Atlas created the project..
        /// </summary>
        [Output("created")]
        public Output<string> Created { get; private set; } = null!;

        /// <summary>
        /// Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project.
        /// </summary>
        [Output("isCollectDatabaseSpecificsStatisticsEnabled")]
        public Output<bool> IsCollectDatabaseSpecificsStatisticsEnabled { get; private set; } = null!;

        /// <summary>
        /// Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh).
        /// </summary>
        [Output("isDataExplorerEnabled")]
        public Output<bool> IsDataExplorerEnabled { get; private set; } = null!;

        /// <summary>
        /// Flag that indicates whether to enable extended storage sizes for the specified project. Clusters with extended storage sizes must be on AWS or GCP, and cannot span multiple regions. When extending storage size, initial syncs and cross-project snapshot restores will be slow. This setting should only be used as a measure of temporary relief; consider sharding if more storage is required.
        /// </summary>
        [Output("isExtendedStorageSizesEnabled")]
        public Output<bool> IsExtendedStorageSizesEnabled { get; private set; } = null!;

        /// <summary>
        /// Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements.
        /// </summary>
        [Output("isPerformanceAdvisorEnabled")]
        public Output<bool> IsPerformanceAdvisorEnabled { get; private set; } = null!;

        /// <summary>
        /// Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database.
        /// </summary>
        [Output("isRealtimePerformancePanelEnabled")]
        public Output<bool> IsRealtimePerformancePanelEnabled { get; private set; } = null!;

        /// <summary>
        /// Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui).
        /// </summary>
        [Output("isSchemaAdvisorEnabled")]
        public Output<bool> IsSchemaAdvisorEnabled { get; private set; } = null!;

        [Output("limits")]
        public Output<ImmutableArray<Outputs.ProjectLimit>> Limits { get; private set; } = null!;

        /// <summary>
        /// The name of the project you want to create.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the organization you want to create the project within.
        /// </summary>
        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the Atlas user account to be granted the [Project Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Project-Owner) role on the specified project. If you set this parameter, it overrides the default value of the oldest [Organization Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Organization-Owner).
        /// </summary>
        [Output("projectOwnerId")]
        public Output<string?> ProjectOwnerId { get; private set; } = null!;

        /// <summary>
        /// Designates that this project can be used for government regions only.  If not set the project will default to standard regions.   You cannot deploy clusters across government and standard regions in the same project. AWS is the only cloud provider for AtlasGov.  For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
        /// </summary>
        [Output("regionUsageRestrictions")]
        public Output<string> RegionUsageRestrictions { get; private set; } = null!;

        [Output("teams")]
        public Output<ImmutableArray<Outputs.ProjectTeam>> Teams { get; private set; } = null!;

        /// <summary>
        /// It allows users to disable the creation of the default alert settings. By default, this flag is set to true.
        /// </summary>
        [Output("withDefaultAlertsSettings")]
        public Output<bool?> WithDefaultAlertsSettings { get; private set; } = null!;


        /// <summary>
        /// Create a Project resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Project(string name, ProjectArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/project:Project", name, args ?? new ProjectArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Project(string name, Input<string> id, ProjectState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/project:Project", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Project resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Project Get(string name, Input<string> id, ProjectState? state = null, CustomResourceOptions? options = null)
        {
            return new Project(name, id, state, options);
        }
    }

    public sealed class ProjectArgs : global::Pulumi.ResourceArgs
    {
        [Input("apiKeys")]
        private InputList<Inputs.ProjectApiKeyArgs>? _apiKeys;
        [Obsolete(@"this parameter is deprecated and will be removed in v1.12.0, please transition to mongodbatlas_project_api_key")]
        public InputList<Inputs.ProjectApiKeyArgs> ApiKeys
        {
            get => _apiKeys ?? (_apiKeys = new InputList<Inputs.ProjectApiKeyArgs>());
            set => _apiKeys = value;
        }

        /// <summary>
        /// Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project.
        /// </summary>
        [Input("isCollectDatabaseSpecificsStatisticsEnabled")]
        public Input<bool>? IsCollectDatabaseSpecificsStatisticsEnabled { get; set; }

        /// <summary>
        /// Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh).
        /// </summary>
        [Input("isDataExplorerEnabled")]
        public Input<bool>? IsDataExplorerEnabled { get; set; }

        /// <summary>
        /// Flag that indicates whether to enable extended storage sizes for the specified project. Clusters with extended storage sizes must be on AWS or GCP, and cannot span multiple regions. When extending storage size, initial syncs and cross-project snapshot restores will be slow. This setting should only be used as a measure of temporary relief; consider sharding if more storage is required.
        /// </summary>
        [Input("isExtendedStorageSizesEnabled")]
        public Input<bool>? IsExtendedStorageSizesEnabled { get; set; }

        /// <summary>
        /// Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements.
        /// </summary>
        [Input("isPerformanceAdvisorEnabled")]
        public Input<bool>? IsPerformanceAdvisorEnabled { get; set; }

        /// <summary>
        /// Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database.
        /// </summary>
        [Input("isRealtimePerformancePanelEnabled")]
        public Input<bool>? IsRealtimePerformancePanelEnabled { get; set; }

        /// <summary>
        /// Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui).
        /// </summary>
        [Input("isSchemaAdvisorEnabled")]
        public Input<bool>? IsSchemaAdvisorEnabled { get; set; }

        [Input("limits")]
        private InputList<Inputs.ProjectLimitArgs>? _limits;
        public InputList<Inputs.ProjectLimitArgs> Limits
        {
            get => _limits ?? (_limits = new InputList<Inputs.ProjectLimitArgs>());
            set => _limits = value;
        }

        /// <summary>
        /// The name of the project you want to create.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the organization you want to create the project within.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the Atlas user account to be granted the [Project Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Project-Owner) role on the specified project. If you set this parameter, it overrides the default value of the oldest [Organization Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Organization-Owner).
        /// </summary>
        [Input("projectOwnerId")]
        public Input<string>? ProjectOwnerId { get; set; }

        /// <summary>
        /// Designates that this project can be used for government regions only.  If not set the project will default to standard regions.   You cannot deploy clusters across government and standard regions in the same project. AWS is the only cloud provider for AtlasGov.  For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
        /// </summary>
        [Input("regionUsageRestrictions")]
        public Input<string>? RegionUsageRestrictions { get; set; }

        [Input("teams")]
        private InputList<Inputs.ProjectTeamArgs>? _teams;
        public InputList<Inputs.ProjectTeamArgs> Teams
        {
            get => _teams ?? (_teams = new InputList<Inputs.ProjectTeamArgs>());
            set => _teams = value;
        }

        /// <summary>
        /// It allows users to disable the creation of the default alert settings. By default, this flag is set to true.
        /// </summary>
        [Input("withDefaultAlertsSettings")]
        public Input<bool>? WithDefaultAlertsSettings { get; set; }

        public ProjectArgs()
        {
        }
        public static new ProjectArgs Empty => new ProjectArgs();
    }

    public sealed class ProjectState : global::Pulumi.ResourceArgs
    {
        [Input("apiKeys")]
        private InputList<Inputs.ProjectApiKeyGetArgs>? _apiKeys;
        [Obsolete(@"this parameter is deprecated and will be removed in v1.12.0, please transition to mongodbatlas_project_api_key")]
        public InputList<Inputs.ProjectApiKeyGetArgs> ApiKeys
        {
            get => _apiKeys ?? (_apiKeys = new InputList<Inputs.ProjectApiKeyGetArgs>());
            set => _apiKeys = value;
        }

        /// <summary>
        /// The number of Atlas clusters deployed in the project..
        /// </summary>
        [Input("clusterCount")]
        public Input<int>? ClusterCount { get; set; }

        /// <summary>
        /// The ISO-8601-formatted timestamp of when Atlas created the project..
        /// </summary>
        [Input("created")]
        public Input<string>? Created { get; set; }

        /// <summary>
        /// Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project.
        /// </summary>
        [Input("isCollectDatabaseSpecificsStatisticsEnabled")]
        public Input<bool>? IsCollectDatabaseSpecificsStatisticsEnabled { get; set; }

        /// <summary>
        /// Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh).
        /// </summary>
        [Input("isDataExplorerEnabled")]
        public Input<bool>? IsDataExplorerEnabled { get; set; }

        /// <summary>
        /// Flag that indicates whether to enable extended storage sizes for the specified project. Clusters with extended storage sizes must be on AWS or GCP, and cannot span multiple regions. When extending storage size, initial syncs and cross-project snapshot restores will be slow. This setting should only be used as a measure of temporary relief; consider sharding if more storage is required.
        /// </summary>
        [Input("isExtendedStorageSizesEnabled")]
        public Input<bool>? IsExtendedStorageSizesEnabled { get; set; }

        /// <summary>
        /// Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements.
        /// </summary>
        [Input("isPerformanceAdvisorEnabled")]
        public Input<bool>? IsPerformanceAdvisorEnabled { get; set; }

        /// <summary>
        /// Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database.
        /// </summary>
        [Input("isRealtimePerformancePanelEnabled")]
        public Input<bool>? IsRealtimePerformancePanelEnabled { get; set; }

        /// <summary>
        /// Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui).
        /// </summary>
        [Input("isSchemaAdvisorEnabled")]
        public Input<bool>? IsSchemaAdvisorEnabled { get; set; }

        [Input("limits")]
        private InputList<Inputs.ProjectLimitGetArgs>? _limits;
        public InputList<Inputs.ProjectLimitGetArgs> Limits
        {
            get => _limits ?? (_limits = new InputList<Inputs.ProjectLimitGetArgs>());
            set => _limits = value;
        }

        /// <summary>
        /// The name of the project you want to create.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the organization you want to create the project within.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the Atlas user account to be granted the [Project Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Project-Owner) role on the specified project. If you set this parameter, it overrides the default value of the oldest [Organization Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Organization-Owner).
        /// </summary>
        [Input("projectOwnerId")]
        public Input<string>? ProjectOwnerId { get; set; }

        /// <summary>
        /// Designates that this project can be used for government regions only.  If not set the project will default to standard regions.   You cannot deploy clusters across government and standard regions in the same project. AWS is the only cloud provider for AtlasGov.  For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
        /// </summary>
        [Input("regionUsageRestrictions")]
        public Input<string>? RegionUsageRestrictions { get; set; }

        [Input("teams")]
        private InputList<Inputs.ProjectTeamGetArgs>? _teams;
        public InputList<Inputs.ProjectTeamGetArgs> Teams
        {
            get => _teams ?? (_teams = new InputList<Inputs.ProjectTeamGetArgs>());
            set => _teams = value;
        }

        /// <summary>
        /// It allows users to disable the creation of the default alert settings. By default, this flag is set to true.
        /// </summary>
        [Input("withDefaultAlertsSettings")]
        public Input<bool>? WithDefaultAlertsSettings { get; set; }

        public ProjectState()
        {
        }
        public static new ProjectState Empty => new ProjectState();
    }
}
