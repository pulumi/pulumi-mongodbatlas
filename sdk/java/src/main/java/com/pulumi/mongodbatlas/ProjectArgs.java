// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.ProjectLimitArgs;
import com.pulumi.mongodbatlas.inputs.ProjectTeamArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    /**
     * Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project.
     * 
     */
    @Import(name="isCollectDatabaseSpecificsStatisticsEnabled")
    private @Nullable Output<Boolean> isCollectDatabaseSpecificsStatisticsEnabled;

    /**
     * @return Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project.
     * 
     */
    public Optional<Output<Boolean>> isCollectDatabaseSpecificsStatisticsEnabled() {
        return Optional.ofNullable(this.isCollectDatabaseSpecificsStatisticsEnabled);
    }

    /**
     * Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh).
     * 
     */
    @Import(name="isDataExplorerEnabled")
    private @Nullable Output<Boolean> isDataExplorerEnabled;

    /**
     * @return Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh).
     * 
     */
    public Optional<Output<Boolean>> isDataExplorerEnabled() {
        return Optional.ofNullable(this.isDataExplorerEnabled);
    }

    /**
     * Flag that indicates whether to enable extended storage sizes for the specified project. Clusters with extended storage sizes must be on AWS or GCP, and cannot span multiple regions. When extending storage size, initial syncs and cross-project snapshot restores will be slow. This setting should only be used as a measure of temporary relief; consider sharding if more storage is required.
     * 
     */
    @Import(name="isExtendedStorageSizesEnabled")
    private @Nullable Output<Boolean> isExtendedStorageSizesEnabled;

    /**
     * @return Flag that indicates whether to enable extended storage sizes for the specified project. Clusters with extended storage sizes must be on AWS or GCP, and cannot span multiple regions. When extending storage size, initial syncs and cross-project snapshot restores will be slow. This setting should only be used as a measure of temporary relief; consider sharding if more storage is required.
     * 
     */
    public Optional<Output<Boolean>> isExtendedStorageSizesEnabled() {
        return Optional.ofNullable(this.isExtendedStorageSizesEnabled);
    }

    /**
     * Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements.
     * 
     */
    @Import(name="isPerformanceAdvisorEnabled")
    private @Nullable Output<Boolean> isPerformanceAdvisorEnabled;

    /**
     * @return Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements.
     * 
     */
    public Optional<Output<Boolean>> isPerformanceAdvisorEnabled() {
        return Optional.ofNullable(this.isPerformanceAdvisorEnabled);
    }

    /**
     * Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database.
     * 
     */
    @Import(name="isRealtimePerformancePanelEnabled")
    private @Nullable Output<Boolean> isRealtimePerformancePanelEnabled;

    /**
     * @return Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database.
     * 
     */
    public Optional<Output<Boolean>> isRealtimePerformancePanelEnabled() {
        return Optional.ofNullable(this.isRealtimePerformancePanelEnabled);
    }

    /**
     * Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui).
     * 
     */
    @Import(name="isSchemaAdvisorEnabled")
    private @Nullable Output<Boolean> isSchemaAdvisorEnabled;

    /**
     * @return Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui).
     * 
     */
    public Optional<Output<Boolean>> isSchemaAdvisorEnabled() {
        return Optional.ofNullable(this.isSchemaAdvisorEnabled);
    }

    @Import(name="limits")
    private @Nullable Output<List<ProjectLimitArgs>> limits;

    public Optional<Output<List<ProjectLimitArgs>>> limits() {
        return Optional.ofNullable(this.limits);
    }

    /**
     * The name of the project you want to create.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the project you want to create.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the organization you want to create the project within.
     * 
     */
    @Import(name="orgId", required=true)
    private Output<String> orgId;

    /**
     * @return The ID of the organization you want to create the project within.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     * Unique 24-hexadecimal digit string that identifies the Atlas user account to be granted the [Project Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Project-Owner) role on the specified project. If you set this parameter, it overrides the default value of the oldest [Organization Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Organization-Owner).
     * 
     */
    @Import(name="projectOwnerId")
    private @Nullable Output<String> projectOwnerId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the Atlas user account to be granted the [Project Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Project-Owner) role on the specified project. If you set this parameter, it overrides the default value of the oldest [Organization Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Organization-Owner).
     * 
     */
    public Optional<Output<String>> projectOwnerId() {
        return Optional.ofNullable(this.projectOwnerId);
    }

    /**
     * Designates that this project can be used for government regions only.  If not set the project will default to standard regions.   You cannot deploy clusters across government and standard regions in the same project. AWS is the only cloud provider for AtlasGov.  For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
     * 
     */
    @Import(name="regionUsageRestrictions")
    private @Nullable Output<String> regionUsageRestrictions;

    /**
     * @return Designates that this project can be used for government regions only.  If not set the project will default to standard regions.   You cannot deploy clusters across government and standard regions in the same project. AWS is the only cloud provider for AtlasGov.  For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
     * 
     */
    public Optional<Output<String>> regionUsageRestrictions() {
        return Optional.ofNullable(this.regionUsageRestrictions);
    }

    @Import(name="teams")
    private @Nullable Output<List<ProjectTeamArgs>> teams;

    public Optional<Output<List<ProjectTeamArgs>>> teams() {
        return Optional.ofNullable(this.teams);
    }

    /**
     * It allows users to disable the creation of the default alert settings. By default, this flag is set to true.
     * 
     */
    @Import(name="withDefaultAlertsSettings")
    private @Nullable Output<Boolean> withDefaultAlertsSettings;

    /**
     * @return It allows users to disable the creation of the default alert settings. By default, this flag is set to true.
     * 
     */
    public Optional<Output<Boolean>> withDefaultAlertsSettings() {
        return Optional.ofNullable(this.withDefaultAlertsSettings);
    }

    private ProjectArgs() {}

    private ProjectArgs(ProjectArgs $) {
        this.isCollectDatabaseSpecificsStatisticsEnabled = $.isCollectDatabaseSpecificsStatisticsEnabled;
        this.isDataExplorerEnabled = $.isDataExplorerEnabled;
        this.isExtendedStorageSizesEnabled = $.isExtendedStorageSizesEnabled;
        this.isPerformanceAdvisorEnabled = $.isPerformanceAdvisorEnabled;
        this.isRealtimePerformancePanelEnabled = $.isRealtimePerformancePanelEnabled;
        this.isSchemaAdvisorEnabled = $.isSchemaAdvisorEnabled;
        this.limits = $.limits;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectOwnerId = $.projectOwnerId;
        this.regionUsageRestrictions = $.regionUsageRestrictions;
        this.teams = $.teams;
        this.withDefaultAlertsSettings = $.withDefaultAlertsSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectArgs $;

        public Builder() {
            $ = new ProjectArgs();
        }

        public Builder(ProjectArgs defaults) {
            $ = new ProjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isCollectDatabaseSpecificsStatisticsEnabled Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project.
         * 
         * @return builder
         * 
         */
        public Builder isCollectDatabaseSpecificsStatisticsEnabled(@Nullable Output<Boolean> isCollectDatabaseSpecificsStatisticsEnabled) {
            $.isCollectDatabaseSpecificsStatisticsEnabled = isCollectDatabaseSpecificsStatisticsEnabled;
            return this;
        }

        /**
         * @param isCollectDatabaseSpecificsStatisticsEnabled Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project.
         * 
         * @return builder
         * 
         */
        public Builder isCollectDatabaseSpecificsStatisticsEnabled(Boolean isCollectDatabaseSpecificsStatisticsEnabled) {
            return isCollectDatabaseSpecificsStatisticsEnabled(Output.of(isCollectDatabaseSpecificsStatisticsEnabled));
        }

        /**
         * @param isDataExplorerEnabled Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh).
         * 
         * @return builder
         * 
         */
        public Builder isDataExplorerEnabled(@Nullable Output<Boolean> isDataExplorerEnabled) {
            $.isDataExplorerEnabled = isDataExplorerEnabled;
            return this;
        }

        /**
         * @param isDataExplorerEnabled Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh).
         * 
         * @return builder
         * 
         */
        public Builder isDataExplorerEnabled(Boolean isDataExplorerEnabled) {
            return isDataExplorerEnabled(Output.of(isDataExplorerEnabled));
        }

        /**
         * @param isExtendedStorageSizesEnabled Flag that indicates whether to enable extended storage sizes for the specified project. Clusters with extended storage sizes must be on AWS or GCP, and cannot span multiple regions. When extending storage size, initial syncs and cross-project snapshot restores will be slow. This setting should only be used as a measure of temporary relief; consider sharding if more storage is required.
         * 
         * @return builder
         * 
         */
        public Builder isExtendedStorageSizesEnabled(@Nullable Output<Boolean> isExtendedStorageSizesEnabled) {
            $.isExtendedStorageSizesEnabled = isExtendedStorageSizesEnabled;
            return this;
        }

        /**
         * @param isExtendedStorageSizesEnabled Flag that indicates whether to enable extended storage sizes for the specified project. Clusters with extended storage sizes must be on AWS or GCP, and cannot span multiple regions. When extending storage size, initial syncs and cross-project snapshot restores will be slow. This setting should only be used as a measure of temporary relief; consider sharding if more storage is required.
         * 
         * @return builder
         * 
         */
        public Builder isExtendedStorageSizesEnabled(Boolean isExtendedStorageSizesEnabled) {
            return isExtendedStorageSizesEnabled(Output.of(isExtendedStorageSizesEnabled));
        }

        /**
         * @param isPerformanceAdvisorEnabled Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements.
         * 
         * @return builder
         * 
         */
        public Builder isPerformanceAdvisorEnabled(@Nullable Output<Boolean> isPerformanceAdvisorEnabled) {
            $.isPerformanceAdvisorEnabled = isPerformanceAdvisorEnabled;
            return this;
        }

        /**
         * @param isPerformanceAdvisorEnabled Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements.
         * 
         * @return builder
         * 
         */
        public Builder isPerformanceAdvisorEnabled(Boolean isPerformanceAdvisorEnabled) {
            return isPerformanceAdvisorEnabled(Output.of(isPerformanceAdvisorEnabled));
        }

        /**
         * @param isRealtimePerformancePanelEnabled Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database.
         * 
         * @return builder
         * 
         */
        public Builder isRealtimePerformancePanelEnabled(@Nullable Output<Boolean> isRealtimePerformancePanelEnabled) {
            $.isRealtimePerformancePanelEnabled = isRealtimePerformancePanelEnabled;
            return this;
        }

        /**
         * @param isRealtimePerformancePanelEnabled Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database.
         * 
         * @return builder
         * 
         */
        public Builder isRealtimePerformancePanelEnabled(Boolean isRealtimePerformancePanelEnabled) {
            return isRealtimePerformancePanelEnabled(Output.of(isRealtimePerformancePanelEnabled));
        }

        /**
         * @param isSchemaAdvisorEnabled Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui).
         * 
         * @return builder
         * 
         */
        public Builder isSchemaAdvisorEnabled(@Nullable Output<Boolean> isSchemaAdvisorEnabled) {
            $.isSchemaAdvisorEnabled = isSchemaAdvisorEnabled;
            return this;
        }

        /**
         * @param isSchemaAdvisorEnabled Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui).
         * 
         * @return builder
         * 
         */
        public Builder isSchemaAdvisorEnabled(Boolean isSchemaAdvisorEnabled) {
            return isSchemaAdvisorEnabled(Output.of(isSchemaAdvisorEnabled));
        }

        public Builder limits(@Nullable Output<List<ProjectLimitArgs>> limits) {
            $.limits = limits;
            return this;
        }

        public Builder limits(List<ProjectLimitArgs> limits) {
            return limits(Output.of(limits));
        }

        public Builder limits(ProjectLimitArgs... limits) {
            return limits(List.of(limits));
        }

        /**
         * @param name The name of the project you want to create.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the project you want to create.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orgId The ID of the organization you want to create the project within.
         * 
         * @return builder
         * 
         */
        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId The ID of the organization you want to create the project within.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectOwnerId Unique 24-hexadecimal digit string that identifies the Atlas user account to be granted the [Project Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Project-Owner) role on the specified project. If you set this parameter, it overrides the default value of the oldest [Organization Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Organization-Owner).
         * 
         * @return builder
         * 
         */
        public Builder projectOwnerId(@Nullable Output<String> projectOwnerId) {
            $.projectOwnerId = projectOwnerId;
            return this;
        }

        /**
         * @param projectOwnerId Unique 24-hexadecimal digit string that identifies the Atlas user account to be granted the [Project Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Project-Owner) role on the specified project. If you set this parameter, it overrides the default value of the oldest [Organization Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Organization-Owner).
         * 
         * @return builder
         * 
         */
        public Builder projectOwnerId(String projectOwnerId) {
            return projectOwnerId(Output.of(projectOwnerId));
        }

        /**
         * @param regionUsageRestrictions Designates that this project can be used for government regions only.  If not set the project will default to standard regions.   You cannot deploy clusters across government and standard regions in the same project. AWS is the only cloud provider for AtlasGov.  For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
         * 
         * @return builder
         * 
         */
        public Builder regionUsageRestrictions(@Nullable Output<String> regionUsageRestrictions) {
            $.regionUsageRestrictions = regionUsageRestrictions;
            return this;
        }

        /**
         * @param regionUsageRestrictions Designates that this project can be used for government regions only.  If not set the project will default to standard regions.   You cannot deploy clusters across government and standard regions in the same project. AWS is the only cloud provider for AtlasGov.  For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
         * 
         * @return builder
         * 
         */
        public Builder regionUsageRestrictions(String regionUsageRestrictions) {
            return regionUsageRestrictions(Output.of(regionUsageRestrictions));
        }

        public Builder teams(@Nullable Output<List<ProjectTeamArgs>> teams) {
            $.teams = teams;
            return this;
        }

        public Builder teams(List<ProjectTeamArgs> teams) {
            return teams(Output.of(teams));
        }

        public Builder teams(ProjectTeamArgs... teams) {
            return teams(List.of(teams));
        }

        /**
         * @param withDefaultAlertsSettings It allows users to disable the creation of the default alert settings. By default, this flag is set to true.
         * 
         * @return builder
         * 
         */
        public Builder withDefaultAlertsSettings(@Nullable Output<Boolean> withDefaultAlertsSettings) {
            $.withDefaultAlertsSettings = withDefaultAlertsSettings;
            return this;
        }

        /**
         * @param withDefaultAlertsSettings It allows users to disable the creation of the default alert settings. By default, this flag is set to true.
         * 
         * @return builder
         * 
         */
        public Builder withDefaultAlertsSettings(Boolean withDefaultAlertsSettings) {
            return withDefaultAlertsSettings(Output.of(withDefaultAlertsSettings));
        }

        public ProjectArgs build() {
            $.orgId = Objects.requireNonNull($.orgId, "expected parameter 'orgId' to be non-null");
            return $;
        }
    }

}
