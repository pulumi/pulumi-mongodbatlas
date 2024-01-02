// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetProjectsResultLimit;
import com.pulumi.mongodbatlas.outputs.GetProjectsResultTeam;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetProjectsResult {
    /**
     * @return The number of Atlas clusters deployed in the project.
     * 
     */
    private Integer clusterCount;
    /**
     * @return The ISO-8601-formatted timestamp of when Atlas created the project.
     * * `teams.#.team_id` - The unique identifier of the team you want to associate with the project. The team and project must share the same parent organization.
     * * `teams.#.role_names` - Each string in the array represents a project role assigned to the team. Every user associated with the team inherits these roles. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
     * * `limits.#.name` - Human-readable label that identifies this project limit.
     * * `limits.#.value` - Amount the limit is set to.
     * * `limits.#.current_usage` - Amount that indicates the current usage of the limit.
     * * `limits.#.default_limit` - Default value of the limit.
     * * `limits.#.maximum_limit` - Maximum value of the limit.
     * 
     */
    private String created;
    /**
     * @return Autogenerated Unique ID for this data source.
     * 
     */
    private String id;
    /**
     * @return Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project.
     * 
     */
    private Boolean isCollectDatabaseSpecificsStatisticsEnabled;
    /**
     * @return Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.
     * 
     */
    private Boolean isDataExplorerEnabled;
    /**
     * @return Flag that indicates whether to enable extended storage sizes for the specified project.
     * 
     */
    private Boolean isExtendedStorageSizesEnabled;
    /**
     * @return Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements.
     * 
     */
    private Boolean isPerformanceAdvisorEnabled;
    /**
     * @return Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database.
     * 
     */
    private Boolean isRealtimePerformancePanelEnabled;
    /**
     * @return Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui).
     * 
     */
    private Boolean isSchemaAdvisorEnabled;
    private List<GetProjectsResultLimit> limits;
    /**
     * @return The name of the project you want to create.
     * 
     */
    private String name;
    /**
     * @return The ID of the organization you want to create the project within.
     * 
     */
    private String orgId;
    private String projectId;
    /**
     * @return If GOV_REGIONS_ONLY the project can be used for government regions only, otherwise defaults to standard regions. For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
     * 
     * See [MongoDB Atlas API - Projects](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Projects) - [and MongoDB Atlas API - Teams](https://docs.atlas.mongodb.com/reference/api/project-get-teams/) Documentation for more information.
     * 
     */
    private String regionUsageRestrictions;
    private List<GetProjectsResultTeam> teams;

    private GetProjectsResult() {}
    /**
     * @return The number of Atlas clusters deployed in the project.
     * 
     */
    public Integer clusterCount() {
        return this.clusterCount;
    }
    /**
     * @return The ISO-8601-formatted timestamp of when Atlas created the project.
     * * `teams.#.team_id` - The unique identifier of the team you want to associate with the project. The team and project must share the same parent organization.
     * * `teams.#.role_names` - Each string in the array represents a project role assigned to the team. Every user associated with the team inherits these roles. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
     * * `limits.#.name` - Human-readable label that identifies this project limit.
     * * `limits.#.value` - Amount the limit is set to.
     * * `limits.#.current_usage` - Amount that indicates the current usage of the limit.
     * * `limits.#.default_limit` - Default value of the limit.
     * * `limits.#.maximum_limit` - Maximum value of the limit.
     * 
     */
    public String created() {
        return this.created;
    }
    /**
     * @return Autogenerated Unique ID for this data source.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project.
     * 
     */
    public Boolean isCollectDatabaseSpecificsStatisticsEnabled() {
        return this.isCollectDatabaseSpecificsStatisticsEnabled;
    }
    /**
     * @return Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.
     * 
     */
    public Boolean isDataExplorerEnabled() {
        return this.isDataExplorerEnabled;
    }
    /**
     * @return Flag that indicates whether to enable extended storage sizes for the specified project.
     * 
     */
    public Boolean isExtendedStorageSizesEnabled() {
        return this.isExtendedStorageSizesEnabled;
    }
    /**
     * @return Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements.
     * 
     */
    public Boolean isPerformanceAdvisorEnabled() {
        return this.isPerformanceAdvisorEnabled;
    }
    /**
     * @return Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database.
     * 
     */
    public Boolean isRealtimePerformancePanelEnabled() {
        return this.isRealtimePerformancePanelEnabled;
    }
    /**
     * @return Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui).
     * 
     */
    public Boolean isSchemaAdvisorEnabled() {
        return this.isSchemaAdvisorEnabled;
    }
    public List<GetProjectsResultLimit> limits() {
        return this.limits;
    }
    /**
     * @return The name of the project you want to create.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the organization you want to create the project within.
     * 
     */
    public String orgId() {
        return this.orgId;
    }
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return If GOV_REGIONS_ONLY the project can be used for government regions only, otherwise defaults to standard regions. For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
     * 
     * See [MongoDB Atlas API - Projects](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Projects) - [and MongoDB Atlas API - Teams](https://docs.atlas.mongodb.com/reference/api/project-get-teams/) Documentation for more information.
     * 
     */
    public String regionUsageRestrictions() {
        return this.regionUsageRestrictions;
    }
    public List<GetProjectsResultTeam> teams() {
        return this.teams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer clusterCount;
        private String created;
        private String id;
        private Boolean isCollectDatabaseSpecificsStatisticsEnabled;
        private Boolean isDataExplorerEnabled;
        private Boolean isExtendedStorageSizesEnabled;
        private Boolean isPerformanceAdvisorEnabled;
        private Boolean isRealtimePerformancePanelEnabled;
        private Boolean isSchemaAdvisorEnabled;
        private List<GetProjectsResultLimit> limits;
        private String name;
        private String orgId;
        private String projectId;
        private String regionUsageRestrictions;
        private List<GetProjectsResultTeam> teams;
        public Builder() {}
        public Builder(GetProjectsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterCount = defaults.clusterCount;
    	      this.created = defaults.created;
    	      this.id = defaults.id;
    	      this.isCollectDatabaseSpecificsStatisticsEnabled = defaults.isCollectDatabaseSpecificsStatisticsEnabled;
    	      this.isDataExplorerEnabled = defaults.isDataExplorerEnabled;
    	      this.isExtendedStorageSizesEnabled = defaults.isExtendedStorageSizesEnabled;
    	      this.isPerformanceAdvisorEnabled = defaults.isPerformanceAdvisorEnabled;
    	      this.isRealtimePerformancePanelEnabled = defaults.isRealtimePerformancePanelEnabled;
    	      this.isSchemaAdvisorEnabled = defaults.isSchemaAdvisorEnabled;
    	      this.limits = defaults.limits;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.regionUsageRestrictions = defaults.regionUsageRestrictions;
    	      this.teams = defaults.teams;
        }

        @CustomType.Setter
        public Builder clusterCount(Integer clusterCount) {
            if (clusterCount == null) {
              throw new MissingRequiredPropertyException("GetProjectsResult", "clusterCount");
            }
            this.clusterCount = clusterCount;
            return this;
        }
        @CustomType.Setter
        public Builder created(String created) {
            if (created == null) {
              throw new MissingRequiredPropertyException("GetProjectsResult", "created");
            }
            this.created = created;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetProjectsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isCollectDatabaseSpecificsStatisticsEnabled(Boolean isCollectDatabaseSpecificsStatisticsEnabled) {
            if (isCollectDatabaseSpecificsStatisticsEnabled == null) {
              throw new MissingRequiredPropertyException("GetProjectsResult", "isCollectDatabaseSpecificsStatisticsEnabled");
            }
            this.isCollectDatabaseSpecificsStatisticsEnabled = isCollectDatabaseSpecificsStatisticsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder isDataExplorerEnabled(Boolean isDataExplorerEnabled) {
            if (isDataExplorerEnabled == null) {
              throw new MissingRequiredPropertyException("GetProjectsResult", "isDataExplorerEnabled");
            }
            this.isDataExplorerEnabled = isDataExplorerEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder isExtendedStorageSizesEnabled(Boolean isExtendedStorageSizesEnabled) {
            if (isExtendedStorageSizesEnabled == null) {
              throw new MissingRequiredPropertyException("GetProjectsResult", "isExtendedStorageSizesEnabled");
            }
            this.isExtendedStorageSizesEnabled = isExtendedStorageSizesEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder isPerformanceAdvisorEnabled(Boolean isPerformanceAdvisorEnabled) {
            if (isPerformanceAdvisorEnabled == null) {
              throw new MissingRequiredPropertyException("GetProjectsResult", "isPerformanceAdvisorEnabled");
            }
            this.isPerformanceAdvisorEnabled = isPerformanceAdvisorEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder isRealtimePerformancePanelEnabled(Boolean isRealtimePerformancePanelEnabled) {
            if (isRealtimePerformancePanelEnabled == null) {
              throw new MissingRequiredPropertyException("GetProjectsResult", "isRealtimePerformancePanelEnabled");
            }
            this.isRealtimePerformancePanelEnabled = isRealtimePerformancePanelEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder isSchemaAdvisorEnabled(Boolean isSchemaAdvisorEnabled) {
            if (isSchemaAdvisorEnabled == null) {
              throw new MissingRequiredPropertyException("GetProjectsResult", "isSchemaAdvisorEnabled");
            }
            this.isSchemaAdvisorEnabled = isSchemaAdvisorEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder limits(List<GetProjectsResultLimit> limits) {
            if (limits == null) {
              throw new MissingRequiredPropertyException("GetProjectsResult", "limits");
            }
            this.limits = limits;
            return this;
        }
        public Builder limits(GetProjectsResultLimit... limits) {
            return limits(List.of(limits));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetProjectsResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetProjectsResult", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetProjectsResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder regionUsageRestrictions(String regionUsageRestrictions) {
            if (regionUsageRestrictions == null) {
              throw new MissingRequiredPropertyException("GetProjectsResult", "regionUsageRestrictions");
            }
            this.regionUsageRestrictions = regionUsageRestrictions;
            return this;
        }
        @CustomType.Setter
        public Builder teams(List<GetProjectsResultTeam> teams) {
            if (teams == null) {
              throw new MissingRequiredPropertyException("GetProjectsResult", "teams");
            }
            this.teams = teams;
            return this;
        }
        public Builder teams(GetProjectsResultTeam... teams) {
            return teams(List.of(teams));
        }
        public GetProjectsResult build() {
            final var _resultValue = new GetProjectsResult();
            _resultValue.clusterCount = clusterCount;
            _resultValue.created = created;
            _resultValue.id = id;
            _resultValue.isCollectDatabaseSpecificsStatisticsEnabled = isCollectDatabaseSpecificsStatisticsEnabled;
            _resultValue.isDataExplorerEnabled = isDataExplorerEnabled;
            _resultValue.isExtendedStorageSizesEnabled = isExtendedStorageSizesEnabled;
            _resultValue.isPerformanceAdvisorEnabled = isPerformanceAdvisorEnabled;
            _resultValue.isRealtimePerformancePanelEnabled = isRealtimePerformancePanelEnabled;
            _resultValue.isSchemaAdvisorEnabled = isSchemaAdvisorEnabled;
            _resultValue.limits = limits;
            _resultValue.name = name;
            _resultValue.orgId = orgId;
            _resultValue.projectId = projectId;
            _resultValue.regionUsageRestrictions = regionUsageRestrictions;
            _resultValue.teams = teams;
            return _resultValue;
        }
    }
}
