// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.ProjectIpAddressesArgs;
import com.pulumi.mongodbatlas.inputs.ProjectLimitArgs;
import com.pulumi.mongodbatlas.inputs.ProjectTeamArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectState extends com.pulumi.resources.ResourceArgs {

    public static final ProjectState Empty = new ProjectState();

    /**
     * The number of Atlas clusters deployed in the project.
     * 
     */
    @Import(name="clusterCount")
    private @Nullable Output<Integer> clusterCount;

    /**
     * @return The number of Atlas clusters deployed in the project.
     * 
     */
    public Optional<Output<Integer>> clusterCount() {
        return Optional.ofNullable(this.clusterCount);
    }

    /**
     * The ISO-8601-formatted timestamp of when Atlas created the project.
     * 
     */
    @Import(name="created")
    private @Nullable Output<String> created;

    /**
     * @return The ISO-8601-formatted timestamp of when Atlas created the project.
     * 
     */
    public Optional<Output<String>> created() {
        return Optional.ofNullable(this.created);
    }

    /**
     * IP addresses in a project categorized by services. See IP Addresses. **WARNING:** this attribute is deprecated and will be removed in version 1.21.0. Use the `mongodbatlas.getProjectIpAddresses` data source instead.
     * 
     * @deprecated
     * This parameter is deprecated and will be removed in version 1.21.0. Please transition to mongodbatlas.getProjectIpAddresses data source.
     * 
     */
    @Deprecated /* This parameter is deprecated and will be removed in version 1.21.0. Please transition to mongodbatlas.getProjectIpAddresses data source. */
    @Import(name="ipAddresses")
    private @Nullable Output<ProjectIpAddressesArgs> ipAddresses;

    /**
     * @return IP addresses in a project categorized by services. See IP Addresses. **WARNING:** this attribute is deprecated and will be removed in version 1.21.0. Use the `mongodbatlas.getProjectIpAddresses` data source instead.
     * 
     * @deprecated
     * This parameter is deprecated and will be removed in version 1.21.0. Please transition to mongodbatlas.getProjectIpAddresses data source.
     * 
     */
    @Deprecated /* This parameter is deprecated and will be removed in version 1.21.0. Please transition to mongodbatlas.getProjectIpAddresses data source. */
    public Optional<Output<ProjectIpAddressesArgs>> ipAddresses() {
        return Optional.ofNullable(this.ipAddresses);
    }

    /**
     * Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project. By default, this flag is set to true.
     * 
     */
    @Import(name="isCollectDatabaseSpecificsStatisticsEnabled")
    private @Nullable Output<Boolean> isCollectDatabaseSpecificsStatisticsEnabled;

    /**
     * @return Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project. By default, this flag is set to true.
     * 
     */
    public Optional<Output<Boolean>> isCollectDatabaseSpecificsStatisticsEnabled() {
        return Optional.ofNullable(this.isCollectDatabaseSpecificsStatisticsEnabled);
    }

    /**
     * Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh). By default, this flag is set to true.
     * 
     */
    @Import(name="isDataExplorerEnabled")
    private @Nullable Output<Boolean> isDataExplorerEnabled;

    /**
     * @return Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh). By default, this flag is set to true.
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
     * Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements. By default, this flag is set to true.
     * 
     */
    @Import(name="isPerformanceAdvisorEnabled")
    private @Nullable Output<Boolean> isPerformanceAdvisorEnabled;

    /**
     * @return Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements. By default, this flag is set to true.
     * 
     */
    public Optional<Output<Boolean>> isPerformanceAdvisorEnabled() {
        return Optional.ofNullable(this.isPerformanceAdvisorEnabled);
    }

    /**
     * Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database. By default, this flag is set to true.
     * 
     */
    @Import(name="isRealtimePerformancePanelEnabled")
    private @Nullable Output<Boolean> isRealtimePerformancePanelEnabled;

    /**
     * @return Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database. By default, this flag is set to true.
     * 
     */
    public Optional<Output<Boolean>> isRealtimePerformancePanelEnabled() {
        return Optional.ofNullable(this.isRealtimePerformancePanelEnabled);
    }

    /**
     * Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui). By default, this flag is set to true.
     * 
     */
    @Import(name="isSchemaAdvisorEnabled")
    private @Nullable Output<Boolean> isSchemaAdvisorEnabled;

    /**
     * @return Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui). By default, this flag is set to true.
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
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return The ID of the organization you want to create the project within.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
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

    /**
     * Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the project. See below.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the project. See below.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
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

    private ProjectState() {}

    private ProjectState(ProjectState $) {
        this.clusterCount = $.clusterCount;
        this.created = $.created;
        this.ipAddresses = $.ipAddresses;
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
        this.tags = $.tags;
        this.teams = $.teams;
        this.withDefaultAlertsSettings = $.withDefaultAlertsSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectState $;

        public Builder() {
            $ = new ProjectState();
        }

        public Builder(ProjectState defaults) {
            $ = new ProjectState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterCount The number of Atlas clusters deployed in the project.
         * 
         * @return builder
         * 
         */
        public Builder clusterCount(@Nullable Output<Integer> clusterCount) {
            $.clusterCount = clusterCount;
            return this;
        }

        /**
         * @param clusterCount The number of Atlas clusters deployed in the project.
         * 
         * @return builder
         * 
         */
        public Builder clusterCount(Integer clusterCount) {
            return clusterCount(Output.of(clusterCount));
        }

        /**
         * @param created The ISO-8601-formatted timestamp of when Atlas created the project.
         * 
         * @return builder
         * 
         */
        public Builder created(@Nullable Output<String> created) {
            $.created = created;
            return this;
        }

        /**
         * @param created The ISO-8601-formatted timestamp of when Atlas created the project.
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            return created(Output.of(created));
        }

        /**
         * @param ipAddresses IP addresses in a project categorized by services. See IP Addresses. **WARNING:** this attribute is deprecated and will be removed in version 1.21.0. Use the `mongodbatlas.getProjectIpAddresses` data source instead.
         * 
         * @return builder
         * 
         * @deprecated
         * This parameter is deprecated and will be removed in version 1.21.0. Please transition to mongodbatlas.getProjectIpAddresses data source.
         * 
         */
        @Deprecated /* This parameter is deprecated and will be removed in version 1.21.0. Please transition to mongodbatlas.getProjectIpAddresses data source. */
        public Builder ipAddresses(@Nullable Output<ProjectIpAddressesArgs> ipAddresses) {
            $.ipAddresses = ipAddresses;
            return this;
        }

        /**
         * @param ipAddresses IP addresses in a project categorized by services. See IP Addresses. **WARNING:** this attribute is deprecated and will be removed in version 1.21.0. Use the `mongodbatlas.getProjectIpAddresses` data source instead.
         * 
         * @return builder
         * 
         * @deprecated
         * This parameter is deprecated and will be removed in version 1.21.0. Please transition to mongodbatlas.getProjectIpAddresses data source.
         * 
         */
        @Deprecated /* This parameter is deprecated and will be removed in version 1.21.0. Please transition to mongodbatlas.getProjectIpAddresses data source. */
        public Builder ipAddresses(ProjectIpAddressesArgs ipAddresses) {
            return ipAddresses(Output.of(ipAddresses));
        }

        /**
         * @param isCollectDatabaseSpecificsStatisticsEnabled Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project. By default, this flag is set to true.
         * 
         * @return builder
         * 
         */
        public Builder isCollectDatabaseSpecificsStatisticsEnabled(@Nullable Output<Boolean> isCollectDatabaseSpecificsStatisticsEnabled) {
            $.isCollectDatabaseSpecificsStatisticsEnabled = isCollectDatabaseSpecificsStatisticsEnabled;
            return this;
        }

        /**
         * @param isCollectDatabaseSpecificsStatisticsEnabled Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project. By default, this flag is set to true.
         * 
         * @return builder
         * 
         */
        public Builder isCollectDatabaseSpecificsStatisticsEnabled(Boolean isCollectDatabaseSpecificsStatisticsEnabled) {
            return isCollectDatabaseSpecificsStatisticsEnabled(Output.of(isCollectDatabaseSpecificsStatisticsEnabled));
        }

        /**
         * @param isDataExplorerEnabled Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh). By default, this flag is set to true.
         * 
         * @return builder
         * 
         */
        public Builder isDataExplorerEnabled(@Nullable Output<Boolean> isDataExplorerEnabled) {
            $.isDataExplorerEnabled = isDataExplorerEnabled;
            return this;
        }

        /**
         * @param isDataExplorerEnabled Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh). By default, this flag is set to true.
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
         * @param isPerformanceAdvisorEnabled Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements. By default, this flag is set to true.
         * 
         * @return builder
         * 
         */
        public Builder isPerformanceAdvisorEnabled(@Nullable Output<Boolean> isPerformanceAdvisorEnabled) {
            $.isPerformanceAdvisorEnabled = isPerformanceAdvisorEnabled;
            return this;
        }

        /**
         * @param isPerformanceAdvisorEnabled Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements. By default, this flag is set to true.
         * 
         * @return builder
         * 
         */
        public Builder isPerformanceAdvisorEnabled(Boolean isPerformanceAdvisorEnabled) {
            return isPerformanceAdvisorEnabled(Output.of(isPerformanceAdvisorEnabled));
        }

        /**
         * @param isRealtimePerformancePanelEnabled Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database. By default, this flag is set to true.
         * 
         * @return builder
         * 
         */
        public Builder isRealtimePerformancePanelEnabled(@Nullable Output<Boolean> isRealtimePerformancePanelEnabled) {
            $.isRealtimePerformancePanelEnabled = isRealtimePerformancePanelEnabled;
            return this;
        }

        /**
         * @param isRealtimePerformancePanelEnabled Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database. By default, this flag is set to true.
         * 
         * @return builder
         * 
         */
        public Builder isRealtimePerformancePanelEnabled(Boolean isRealtimePerformancePanelEnabled) {
            return isRealtimePerformancePanelEnabled(Output.of(isRealtimePerformancePanelEnabled));
        }

        /**
         * @param isSchemaAdvisorEnabled Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui). By default, this flag is set to true.
         * 
         * @return builder
         * 
         */
        public Builder isSchemaAdvisorEnabled(@Nullable Output<Boolean> isSchemaAdvisorEnabled) {
            $.isSchemaAdvisorEnabled = isSchemaAdvisorEnabled;
            return this;
        }

        /**
         * @param isSchemaAdvisorEnabled Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui). By default, this flag is set to true.
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
        public Builder orgId(@Nullable Output<String> orgId) {
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

        /**
         * @param tags Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the project. See below.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the project. See below.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
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

        public ProjectState build() {
            return $;
        }
    }

}
