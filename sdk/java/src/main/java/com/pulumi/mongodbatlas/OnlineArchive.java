// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.OnlineArchiveArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.OnlineArchiveState;
import com.pulumi.mongodbatlas.outputs.OnlineArchiveCriteria;
import com.pulumi.mongodbatlas.outputs.OnlineArchiveDataExpirationRule;
import com.pulumi.mongodbatlas.outputs.OnlineArchiveDataProcessRegion;
import com.pulumi.mongodbatlas.outputs.OnlineArchivePartitionField;
import com.pulumi.mongodbatlas.outputs.OnlineArchiveSchedule;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * `mongodbatlas.OnlineArchive` resource provides access to create, edit, pause and resume an online archive for a collection.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
 * 
 * &gt; **IMPORTANT:** The collection must exists before performing an online archive.
 * 
 * &gt; **IMPORTANT:** There are fields that are immutable after creation, i.e if `date_field` value does not exist in the collection, the online archive state will be pending forever, and this field cannot be updated, that means a destroy is required, known error `ONLINE_ARCHIVE_CANNOT_MODIFY_FIELD`
 * 
 * ## Example Usage
 * ### S
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.OnlineArchive;
 * import com.pulumi.mongodbatlas.OnlineArchiveArgs;
 * import com.pulumi.mongodbatlas.inputs.OnlineArchivePartitionFieldArgs;
 * import com.pulumi.mongodbatlas.inputs.OnlineArchiveCriteriaArgs;
 * import com.pulumi.mongodbatlas.inputs.OnlineArchiveScheduleArgs;
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
 *         var test = new OnlineArchive(&#34;test&#34;, OnlineArchiveArgs.builder()        
 *             .projectId(var_.project_id())
 *             .clusterName(var_.cluster_name())
 *             .collName(var_.collection_name())
 *             .dbName(var_.database_name())
 *             .partitionFields(            
 *                 OnlineArchivePartitionFieldArgs.builder()
 *                     .fieldName(&#34;firstName&#34;)
 *                     .order(0)
 *                     .build(),
 *                 OnlineArchivePartitionFieldArgs.builder()
 *                     .fieldName(&#34;lastName&#34;)
 *                     .order(1)
 *                     .build())
 *             .criteria(OnlineArchiveCriteriaArgs.builder()
 *                 .type(&#34;DATE&#34;)
 *                 .dateField(&#34;created&#34;)
 *                 .expireAfterDays(5)
 *                 .build())
 *             .schedule(OnlineArchiveScheduleArgs.builder()
 *                 .type(&#34;DAILY&#34;)
 *                 .endHour(1)
 *                 .endMinute(1)
 *                 .startHour(1)
 *                 .startMinute(1)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * For custom criteria example
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.OnlineArchive;
 * import com.pulumi.mongodbatlas.OnlineArchiveArgs;
 * import com.pulumi.mongodbatlas.inputs.OnlineArchivePartitionFieldArgs;
 * import com.pulumi.mongodbatlas.inputs.OnlineArchiveCriteriaArgs;
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
 *         var test = new OnlineArchive(&#34;test&#34;, OnlineArchiveArgs.builder()        
 *             .projectId(var_.project_id())
 *             .clusterName(var_.cluster_name())
 *             .collName(var_.collection_name())
 *             .dbName(var_.database_name())
 *             .partitionFields(            
 *                 OnlineArchivePartitionFieldArgs.builder()
 *                     .fieldName(&#34;firstName&#34;)
 *                     .order(0)
 *                     .build(),
 *                 OnlineArchivePartitionFieldArgs.builder()
 *                     .fieldName(&#34;secondName&#34;)
 *                     .order(1)
 *                     .build())
 *             .criteria(OnlineArchiveCriteriaArgs.builder()
 *                 .type(&#34;CUSTOM&#34;)
 *                 .query(&#34;{ \&#34;department\&#34;: \&#34;engineering\&#34; }&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="mongodbatlas:index/onlineArchive:OnlineArchive")
public class OnlineArchive extends com.pulumi.resources.CustomResource {
    /**
     * ID of the online archive.
     * 
     */
    @Export(name="archiveId", refs={String.class}, tree="[0]")
    private Output<String> archiveId;

    /**
     * @return ID of the online archive.
     * 
     */
    public Output<String> archiveId() {
        return this.archiveId;
    }
    /**
     * Name of the cluster that contains the collection.
     * 
     */
    @Export(name="clusterName", refs={String.class}, tree="[0]")
    private Output<String> clusterName;

    /**
     * @return Name of the cluster that contains the collection.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    /**
     * Name of the collection.
     * 
     */
    @Export(name="collName", refs={String.class}, tree="[0]")
    private Output<String> collName;

    /**
     * @return Name of the collection.
     * 
     */
    public Output<String> collName() {
        return this.collName;
    }
    /**
     * Type of MongoDB collection that you want to return. This value can be &#34;TIMESERIES&#34; or &#34;STANDARD&#34;. Default is &#34;STANDARD&#34;.
     * 
     */
    @Export(name="collectionType", refs={String.class}, tree="[0]")
    private Output<String> collectionType;

    /**
     * @return Type of MongoDB collection that you want to return. This value can be &#34;TIMESERIES&#34; or &#34;STANDARD&#34;. Default is &#34;STANDARD&#34;.
     * 
     */
    public Output<String> collectionType() {
        return this.collectionType;
    }
    /**
     * Criteria to use for archiving data. See criteria.
     * 
     */
    @Export(name="criteria", refs={OnlineArchiveCriteria.class}, tree="[0]")
    private Output<OnlineArchiveCriteria> criteria;

    /**
     * @return Criteria to use for archiving data. See criteria.
     * 
     */
    public Output<OnlineArchiveCriteria> criteria() {
        return this.criteria;
    }
    /**
     * Rule for specifying when data should be deleted from the archive. See data expiration rule.
     * 
     */
    @Export(name="dataExpirationRule", refs={OnlineArchiveDataExpirationRule.class}, tree="[0]")
    private Output</* @Nullable */ OnlineArchiveDataExpirationRule> dataExpirationRule;

    /**
     * @return Rule for specifying when data should be deleted from the archive. See data expiration rule.
     * 
     */
    public Output<Optional<OnlineArchiveDataExpirationRule>> dataExpirationRule() {
        return Codegen.optional(this.dataExpirationRule);
    }
    /**
     * Settings to configure the region where you wish to store your archived data. See data process region. This field is immutable hence cannot be updated.
     * 
     */
    @Export(name="dataProcessRegion", refs={OnlineArchiveDataProcessRegion.class}, tree="[0]")
    private Output<OnlineArchiveDataProcessRegion> dataProcessRegion;

    /**
     * @return Settings to configure the region where you wish to store your archived data. See data process region. This field is immutable hence cannot be updated.
     * 
     */
    public Output<OnlineArchiveDataProcessRegion> dataProcessRegion() {
        return this.dataProcessRegion;
    }
    /**
     * Name of the database that contains the collection.
     * 
     */
    @Export(name="dbName", refs={String.class}, tree="[0]")
    private Output<String> dbName;

    /**
     * @return Name of the database that contains the collection.
     * 
     */
    public Output<String> dbName() {
        return this.dbName;
    }
    /**
     * Fields to use to partition data. You can specify up to two frequently queried fields to use for partitioning data. Queries that don’t contain the specified fields require a full collection scan of all archived documents, which takes longer and increases your costs. To learn more about how partition improves query performance, see [Data Structure in S3](https://docs.mongodb.com/datalake/admin/optimize-query-performance/#data-structure-in-s3). The value of a partition field can be up to a maximum of 700 characters. Documents with values exceeding 700 characters are not archived. See partition fields.
     * 
     */
    @Export(name="partitionFields", refs={List.class,OnlineArchivePartitionField.class}, tree="[0,1]")
    private Output<List<OnlineArchivePartitionField>> partitionFields;

    /**
     * @return Fields to use to partition data. You can specify up to two frequently queried fields to use for partitioning data. Queries that don’t contain the specified fields require a full collection scan of all archived documents, which takes longer and increases your costs. To learn more about how partition improves query performance, see [Data Structure in S3](https://docs.mongodb.com/datalake/admin/optimize-query-performance/#data-structure-in-s3). The value of a partition field can be up to a maximum of 700 characters. Documents with values exceeding 700 characters are not archived. See partition fields.
     * 
     */
    public Output<List<OnlineArchivePartitionField>> partitionFields() {
        return this.partitionFields;
    }
    /**
     * State of the online archive. This is required for pausing an active online archive or resuming a paused online archive. If the collection has another active online archive, the resume request fails.
     * 
     */
    @Export(name="paused", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> paused;

    /**
     * @return State of the online archive. This is required for pausing an active online archive or resuming a paused online archive. If the collection has another active online archive, the resume request fails.
     * 
     */
    public Output<Boolean> paused() {
        return this.paused;
    }
    /**
     * The unique ID for the project
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The unique ID for the project
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Regular frequency and duration when archiving process occurs. See schedule.
     * 
     */
    @Export(name="schedule", refs={OnlineArchiveSchedule.class}, tree="[0]")
    private Output</* @Nullable */ OnlineArchiveSchedule> schedule;

    /**
     * @return Regular frequency and duration when archiving process occurs. See schedule.
     * 
     */
    public Output<Optional<OnlineArchiveSchedule>> schedule() {
        return Codegen.optional(this.schedule);
    }
    /**
     * Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return Status of the online archive. Valid values are: Pending, Archiving, Idle, Pausing, Paused, Orphaned and Deleted
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    @Export(name="syncCreation", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> syncCreation;

    public Output<Optional<Boolean>> syncCreation() {
        return Codegen.optional(this.syncCreation);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OnlineArchive(String name) {
        this(name, OnlineArchiveArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OnlineArchive(String name, OnlineArchiveArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OnlineArchive(String name, OnlineArchiveArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/onlineArchive:OnlineArchive", name, args == null ? OnlineArchiveArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OnlineArchive(String name, Output<String> id, @Nullable OnlineArchiveState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/onlineArchive:OnlineArchive", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static OnlineArchive get(String name, Output<String> id, @Nullable OnlineArchiveState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OnlineArchive(name, id, state, options);
    }
}
