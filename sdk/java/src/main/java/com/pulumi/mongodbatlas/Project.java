// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.ProjectArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.ProjectState;
import com.pulumi.mongodbatlas.outputs.ProjectIpAddresses;
import com.pulumi.mongodbatlas.outputs.ProjectLimit;
import com.pulumi.mongodbatlas.outputs.ProjectTeam;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## # Resource: mongodbatlas.Project
 * 
 * `mongodbatlas.Project` provides a Project resource. This allows project to be created.
 * 
 * &gt; **NOTE:** If Backup Compliance Policy is enabled for the project for which this backup schedule is defined, you cannot delete the Atlas project if any snapshots exist.  See [Backup Compliance Policy Prohibited Actions and Considerations](https://www.mongodb.com/docs/atlas/backup/cloud-backup/backup-compliance-policy/#configure-a-backup-compliance-policy).
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.MongodbatlasFunctions;
 * import com.pulumi.mongodbatlas.Project;
 * import com.pulumi.mongodbatlas.ProjectArgs;
 * import com.pulumi.mongodbatlas.inputs.ProjectTeamArgs;
 * import com.pulumi.mongodbatlas.inputs.ProjectLimitArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var test = MongodbatlasFunctions.getRolesOrgId();
 * 
 *         var testProject = new Project("testProject", ProjectArgs.builder()
 *             .name("project-name")
 *             .orgId(test.applyValue(getRolesOrgIdResult -> getRolesOrgIdResult.orgId()))
 *             .projectOwnerId("<OWNER_ACCOUNT_ID>")
 *             .teams(            
 *                 ProjectTeamArgs.builder()
 *                     .teamId("5e0fa8c99ccf641c722fe645")
 *                     .roleNames("GROUP_OWNER")
 *                     .build(),
 *                 ProjectTeamArgs.builder()
 *                     .teamId("5e1dd7b4f2a30ba80a70cd4rw")
 *                     .roleNames(                    
 *                         "GROUP_READ_ONLY",
 *                         "GROUP_DATA_ACCESS_READ_WRITE")
 *                     .build())
 *             .limits(            
 *                 ProjectLimitArgs.builder()
 *                     .name("atlas.project.deployment.clusters")
 *                     .value(26)
 *                     .build(),
 *                 ProjectLimitArgs.builder()
 *                     .name("atlas.project.deployment.nodesPerPrivateLinkRegion")
 *                     .value(51)
 *                     .build())
 *             .isCollectDatabaseSpecificsStatisticsEnabled(true)
 *             .isDataExplorerEnabled(true)
 *             .isExtendedStorageSizesEnabled(true)
 *             .isPerformanceAdvisorEnabled(true)
 *             .isRealtimePerformancePanelEnabled(true)
 *             .isSchemaAdvisorEnabled(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Project must be imported using project ID, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/project:Project my_project 5d09d6a59ccf6445652a444a
 * ```
 * For more information see: [MongoDB Atlas Admin API Projects](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Projects) and [MongoDB Atlas Admin API Teams](https://docs.atlas.mongodb.com/reference/api/teams/) Documentation for more information.
 * 
 */
@ResourceType(type="mongodbatlas:index/project:Project")
public class Project extends com.pulumi.resources.CustomResource {
    /**
     * The number of Atlas clusters deployed in the project.
     * 
     */
    @Export(name="clusterCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> clusterCount;

    /**
     * @return The number of Atlas clusters deployed in the project.
     * 
     */
    public Output<Integer> clusterCount() {
        return this.clusterCount;
    }
    /**
     * The ISO-8601-formatted timestamp of when Atlas created the project.
     * 
     */
    @Export(name="created", refs={String.class}, tree="[0]")
    private Output<String> created;

    /**
     * @return The ISO-8601-formatted timestamp of when Atlas created the project.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * IP addresses in a project categorized by services. See IP Addresses.
     * 
     */
    @Export(name="ipAddresses", refs={ProjectIpAddresses.class}, tree="[0]")
    private Output<ProjectIpAddresses> ipAddresses;

    /**
     * @return IP addresses in a project categorized by services. See IP Addresses.
     * 
     */
    public Output<ProjectIpAddresses> ipAddresses() {
        return this.ipAddresses;
    }
    /**
     * Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project. By default, this flag is set to true.
     * 
     */
    @Export(name="isCollectDatabaseSpecificsStatisticsEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isCollectDatabaseSpecificsStatisticsEnabled;

    /**
     * @return Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project. By default, this flag is set to true.
     * 
     */
    public Output<Boolean> isCollectDatabaseSpecificsStatisticsEnabled() {
        return this.isCollectDatabaseSpecificsStatisticsEnabled;
    }
    /**
     * Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh). By default, this flag is set to true.
     * 
     */
    @Export(name="isDataExplorerEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isDataExplorerEnabled;

    /**
     * @return Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh). By default, this flag is set to true.
     * 
     */
    public Output<Boolean> isDataExplorerEnabled() {
        return this.isDataExplorerEnabled;
    }
    /**
     * Flag that indicates whether to enable extended storage sizes for the specified project. Clusters with extended storage sizes must be on AWS or GCP, and cannot span multiple regions. When extending storage size, initial syncs and cross-project snapshot restores will be slow. This setting should only be used as a measure of temporary relief; consider sharding if more storage is required.
     * 
     */
    @Export(name="isExtendedStorageSizesEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isExtendedStorageSizesEnabled;

    /**
     * @return Flag that indicates whether to enable extended storage sizes for the specified project. Clusters with extended storage sizes must be on AWS or GCP, and cannot span multiple regions. When extending storage size, initial syncs and cross-project snapshot restores will be slow. This setting should only be used as a measure of temporary relief; consider sharding if more storage is required.
     * 
     */
    public Output<Boolean> isExtendedStorageSizesEnabled() {
        return this.isExtendedStorageSizesEnabled;
    }
    /**
     * Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements. By default, this flag is set to true.
     * 
     */
    @Export(name="isPerformanceAdvisorEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isPerformanceAdvisorEnabled;

    /**
     * @return Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements. By default, this flag is set to true.
     * 
     */
    public Output<Boolean> isPerformanceAdvisorEnabled() {
        return this.isPerformanceAdvisorEnabled;
    }
    /**
     * Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database. By default, this flag is set to true.
     * 
     */
    @Export(name="isRealtimePerformancePanelEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isRealtimePerformancePanelEnabled;

    /**
     * @return Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database. By default, this flag is set to true.
     * 
     */
    public Output<Boolean> isRealtimePerformancePanelEnabled() {
        return this.isRealtimePerformancePanelEnabled;
    }
    /**
     * Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui). By default, this flag is set to true.
     * 
     */
    @Export(name="isSchemaAdvisorEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isSchemaAdvisorEnabled;

    /**
     * @return Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui). By default, this flag is set to true.
     * 
     */
    public Output<Boolean> isSchemaAdvisorEnabled() {
        return this.isSchemaAdvisorEnabled;
    }
    @Export(name="limits", refs={List.class,ProjectLimit.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ProjectLimit>> limits;

    public Output<Optional<List<ProjectLimit>>> limits() {
        return Codegen.optional(this.limits);
    }
    /**
     * The name of the project you want to create.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the project you want to create.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the organization you want to create the project within.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
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
    @Export(name="projectOwnerId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> projectOwnerId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the Atlas user account to be granted the [Project Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Project-Owner) role on the specified project. If you set this parameter, it overrides the default value of the oldest [Organization Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Organization-Owner).
     * 
     */
    public Output<Optional<String>> projectOwnerId() {
        return Codegen.optional(this.projectOwnerId);
    }
    /**
     * Designates that this project can be used for government regions only.  If not set the project will default to standard regions.   You cannot deploy clusters across government and standard regions in the same project. AWS is the only cloud provider for AtlasGov.  For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
     * 
     */
    @Export(name="regionUsageRestrictions", refs={String.class}, tree="[0]")
    private Output<String> regionUsageRestrictions;

    /**
     * @return Designates that this project can be used for government regions only.  If not set the project will default to standard regions.   You cannot deploy clusters across government and standard regions in the same project. AWS is the only cloud provider for AtlasGov.  For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
     * 
     */
    public Output<String> regionUsageRestrictions() {
        return this.regionUsageRestrictions;
    }
    /**
     * Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the project. See below.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the project. See below.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="teams", refs={List.class,ProjectTeam.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ProjectTeam>> teams;

    public Output<Optional<List<ProjectTeam>>> teams() {
        return Codegen.optional(this.teams);
    }
    /**
     * It allows users to disable the creation of the default alert settings. By default, this flag is set to true.
     * 
     */
    @Export(name="withDefaultAlertsSettings", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> withDefaultAlertsSettings;

    /**
     * @return It allows users to disable the creation of the default alert settings. By default, this flag is set to true.
     * 
     */
    public Output<Boolean> withDefaultAlertsSettings() {
        return this.withDefaultAlertsSettings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Project(java.lang.String name) {
        this(name, ProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Project(java.lang.String name, ProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Project(java.lang.String name, ProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/project:Project", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Project(java.lang.String name, Output<java.lang.String> id, @Nullable ProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/project:Project", name, state, makeResourceOptions(options, id), false);
    }

    private static ProjectArgs makeArgs(ProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProjectArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Project get(java.lang.String name, Output<java.lang.String> id, @Nullable ProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Project(name, id, state, options);
    }
}
