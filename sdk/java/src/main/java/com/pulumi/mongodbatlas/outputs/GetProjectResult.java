// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetProjectApiKey;
import com.pulumi.mongodbatlas.outputs.GetProjectLimit;
import com.pulumi.mongodbatlas.outputs.GetProjectTeam;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetProjectResult {
    private List<GetProjectApiKey> apiKeys;
    /**
     * @return The number of Atlas clusters deployed in the project.
     * 
     */
    private Integer clusterCount;
    /**
     * @return The ISO-8601-formatted timestamp of when Atlas created the project.
     * * `teams.#.team_id` - The unique identifier of the team you want to associate with the project. The team and project must share the same parent organization.
     * * `teams.#.role_names` - Each string in the array represents a project role assigned to the team. Every user associated with the team inherits these roles. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
     * * `api_keys.#.api_key_id` - The unique identifier of the programmatic API key you want to associate with the project. The programmatic API key and project must share the same parent organization.
     * * `api_keys.#.role_names` - Each string in the array represents a project role assigned to the programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
     * * `limits.#.name` - Human-readable label that identifies this project limit.
     * * `limits.#.value` - Amount the limit is set to.
     * * `limits.#.current_usage` - Amount that indicates the current usage of the limit.
     * * `limits.#.default_limit` - Default value of the limit.
     * * `limits.#.maximum_limit` - Maximum value of the limit.
     * 
     */
    private String created;
    /**
     * @return The provider-assigned unique ID for this managed resource.
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
    private List<GetProjectLimit> limits;
    /**
     * @return The name of the project you want to create.
     * 
     */
    private @Nullable String name;
    /**
     * @return The ID of the organization you want to create the project within.
     * 
     */
    private String orgId;
    private @Nullable String projectId;
    /**
     * @return If GOV_REGIONS_ONLY the project can be used for government regions only, otherwise defaults to standard regions. For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
     * 
     */
    private String regionUsageRestrictions;
    private List<GetProjectTeam> teams;

    private GetProjectResult() {}
    public List<GetProjectApiKey> apiKeys() {
        return this.apiKeys;
    }
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
     * * `api_keys.#.api_key_id` - The unique identifier of the programmatic API key you want to associate with the project. The programmatic API key and project must share the same parent organization.
     * * `api_keys.#.role_names` - Each string in the array represents a project role assigned to the programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
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
     * @return The provider-assigned unique ID for this managed resource.
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
    public List<GetProjectLimit> limits() {
        return this.limits;
    }
    /**
     * @return The name of the project you want to create.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The ID of the organization you want to create the project within.
     * 
     */
    public String orgId() {
        return this.orgId;
    }
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return If GOV_REGIONS_ONLY the project can be used for government regions only, otherwise defaults to standard regions. For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
     * 
     */
    public String regionUsageRestrictions() {
        return this.regionUsageRestrictions;
    }
    public List<GetProjectTeam> teams() {
        return this.teams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetProjectApiKey> apiKeys;
        private Integer clusterCount;
        private String created;
        private String id;
        private Boolean isCollectDatabaseSpecificsStatisticsEnabled;
        private Boolean isDataExplorerEnabled;
        private Boolean isExtendedStorageSizesEnabled;
        private Boolean isPerformanceAdvisorEnabled;
        private Boolean isRealtimePerformancePanelEnabled;
        private Boolean isSchemaAdvisorEnabled;
        private List<GetProjectLimit> limits;
        private @Nullable String name;
        private String orgId;
        private @Nullable String projectId;
        private String regionUsageRestrictions;
        private List<GetProjectTeam> teams;
        public Builder() {}
        public Builder(GetProjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeys = defaults.apiKeys;
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
        public Builder apiKeys(List<GetProjectApiKey> apiKeys) {
            this.apiKeys = Objects.requireNonNull(apiKeys);
            return this;
        }
        public Builder apiKeys(GetProjectApiKey... apiKeys) {
            return apiKeys(List.of(apiKeys));
        }
        @CustomType.Setter
        public Builder clusterCount(Integer clusterCount) {
            this.clusterCount = Objects.requireNonNull(clusterCount);
            return this;
        }
        @CustomType.Setter
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder isCollectDatabaseSpecificsStatisticsEnabled(Boolean isCollectDatabaseSpecificsStatisticsEnabled) {
            this.isCollectDatabaseSpecificsStatisticsEnabled = Objects.requireNonNull(isCollectDatabaseSpecificsStatisticsEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder isDataExplorerEnabled(Boolean isDataExplorerEnabled) {
            this.isDataExplorerEnabled = Objects.requireNonNull(isDataExplorerEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder isExtendedStorageSizesEnabled(Boolean isExtendedStorageSizesEnabled) {
            this.isExtendedStorageSizesEnabled = Objects.requireNonNull(isExtendedStorageSizesEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder isPerformanceAdvisorEnabled(Boolean isPerformanceAdvisorEnabled) {
            this.isPerformanceAdvisorEnabled = Objects.requireNonNull(isPerformanceAdvisorEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder isRealtimePerformancePanelEnabled(Boolean isRealtimePerformancePanelEnabled) {
            this.isRealtimePerformancePanelEnabled = Objects.requireNonNull(isRealtimePerformancePanelEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder isSchemaAdvisorEnabled(Boolean isSchemaAdvisorEnabled) {
            this.isSchemaAdvisorEnabled = Objects.requireNonNull(isSchemaAdvisorEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder limits(List<GetProjectLimit> limits) {
            this.limits = Objects.requireNonNull(limits);
            return this;
        }
        public Builder limits(GetProjectLimit... limits) {
            return limits(List.of(limits));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            this.orgId = Objects.requireNonNull(orgId);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder regionUsageRestrictions(String regionUsageRestrictions) {
            this.regionUsageRestrictions = Objects.requireNonNull(regionUsageRestrictions);
            return this;
        }
        @CustomType.Setter
        public Builder teams(List<GetProjectTeam> teams) {
            this.teams = Objects.requireNonNull(teams);
            return this;
        }
        public Builder teams(GetProjectTeam... teams) {
            return teams(List.of(teams));
        }
        public GetProjectResult build() {
            final var o = new GetProjectResult();
            o.apiKeys = apiKeys;
            o.clusterCount = clusterCount;
            o.created = created;
            o.id = id;
            o.isCollectDatabaseSpecificsStatisticsEnabled = isCollectDatabaseSpecificsStatisticsEnabled;
            o.isDataExplorerEnabled = isDataExplorerEnabled;
            o.isExtendedStorageSizesEnabled = isExtendedStorageSizesEnabled;
            o.isPerformanceAdvisorEnabled = isPerformanceAdvisorEnabled;
            o.isRealtimePerformancePanelEnabled = isRealtimePerformancePanelEnabled;
            o.isSchemaAdvisorEnabled = isSchemaAdvisorEnabled;
            o.limits = limits;
            o.name = name;
            o.orgId = orgId;
            o.projectId = projectId;
            o.regionUsageRestrictions = regionUsageRestrictions;
            o.teams = teams;
            return o;
        }
    }
}
