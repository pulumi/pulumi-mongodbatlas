// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.CloudBackupSnapshotRestoreJobArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.CloudBackupSnapshotRestoreJobState;
import com.pulumi.mongodbatlas.outputs.CloudBackupSnapshotRestoreJobDeliveryTypeConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### Example automated delivery type
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.Cluster;
 * import com.pulumi.mongodbatlas.ClusterArgs;
 * import com.pulumi.mongodbatlas.cloudProviderSnapshot;
 * import com.pulumi.mongodbatlas.CloudProviderSnapshotArgs;
 * import com.pulumi.mongodbatlas.CloudBackupSnapshotRestoreJob;
 * import com.pulumi.mongodbatlas.CloudBackupSnapshotRestoreJobArgs;
 * import com.pulumi.mongodbatlas.inputs.CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs;
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
 *         var myCluster = new Cluster(&#34;myCluster&#34;, ClusterArgs.builder()        
 *             .projectId(&#34;5cf5a45a9ccf6400e60981b6&#34;)
 *             .name(&#34;MyCluster&#34;)
 *             .providerName(&#34;AWS&#34;)
 *             .providerRegionName(&#34;EU_WEST_2&#34;)
 *             .providerInstanceSizeName(&#34;M10&#34;)
 *             .cloudBackup(true)
 *             .build());
 * 
 *         var test = new CloudProviderSnapshot(&#34;test&#34;, CloudProviderSnapshotArgs.builder()        
 *             .projectId(myCluster.projectId())
 *             .clusterName(myCluster.name())
 *             .description(&#34;myDescription&#34;)
 *             .retentionInDays(1)
 *             .build());
 * 
 *         var testCloudBackupSnapshotRestoreJob = new CloudBackupSnapshotRestoreJob(&#34;testCloudBackupSnapshotRestoreJob&#34;, CloudBackupSnapshotRestoreJobArgs.builder()        
 *             .projectId(test.projectId())
 *             .clusterName(test.clusterName())
 *             .snapshotId(test.snapshotId())
 *             .deliveryTypeConfig(CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs.builder()
 *                 .automated(true)
 *                 .targetClusterName(&#34;MyCluster&#34;)
 *                 .targetProjectId(&#34;5cf5a45a9ccf6400e60981b6&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example download delivery type
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.Cluster;
 * import com.pulumi.mongodbatlas.ClusterArgs;
 * import com.pulumi.mongodbatlas.cloudProviderSnapshot;
 * import com.pulumi.mongodbatlas.CloudProviderSnapshotArgs;
 * import com.pulumi.mongodbatlas.CloudBackupSnapshotRestoreJob;
 * import com.pulumi.mongodbatlas.CloudBackupSnapshotRestoreJobArgs;
 * import com.pulumi.mongodbatlas.inputs.CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs;
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
 *         var myCluster = new Cluster(&#34;myCluster&#34;, ClusterArgs.builder()        
 *             .projectId(&#34;5cf5a45a9ccf6400e60981b6&#34;)
 *             .name(&#34;MyCluster&#34;)
 *             .providerName(&#34;AWS&#34;)
 *             .providerRegionName(&#34;EU_WEST_2&#34;)
 *             .providerInstanceSizeName(&#34;M10&#34;)
 *             .cloudBackup(true)
 *             .build());
 * 
 *         var test = new CloudProviderSnapshot(&#34;test&#34;, CloudProviderSnapshotArgs.builder()        
 *             .projectId(myCluster.projectId())
 *             .clusterName(myCluster.name())
 *             .description(&#34;myDescription&#34;)
 *             .retentionInDays(1)
 *             .build());
 * 
 *         var testCloudBackupSnapshotRestoreJob = new CloudBackupSnapshotRestoreJob(&#34;testCloudBackupSnapshotRestoreJob&#34;, CloudBackupSnapshotRestoreJobArgs.builder()        
 *             .projectId(test.projectId())
 *             .clusterName(test.clusterName())
 *             .snapshotId(test.snapshotId())
 *             .deliveryTypeConfig(CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs.builder()
 *                 .download(true)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example of a point in time restore
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.Cluster;
 * import com.pulumi.mongodbatlas.ClusterArgs;
 * import com.pulumi.mongodbatlas.CloudBackupSnapshot;
 * import com.pulumi.mongodbatlas.CloudBackupSnapshotArgs;
 * import com.pulumi.mongodbatlas.CloudBackupSnapshotRestoreJob;
 * import com.pulumi.mongodbatlas.CloudBackupSnapshotRestoreJobArgs;
 * import com.pulumi.mongodbatlas.inputs.CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs;
 * import com.pulumi.codegen.internal.KeyedValue;
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
 *         var clusterTest = new Cluster(&#34;clusterTest&#34;, ClusterArgs.builder()        
 *             .projectId(projectTest.id())
 *             .name(clusterName)
 *             .providerName(&#34;AWS&#34;)
 *             .providerRegionName(&#34;US_EAST_1&#34;)
 *             .providerInstanceSizeName(&#34;M10&#34;)
 *             .cloudBackup(true)
 *             .pitEnabled(true)
 *             .build());
 * 
 *         var test = new CloudBackupSnapshot(&#34;test&#34;, CloudBackupSnapshotArgs.builder()        
 *             .projectId(clusterTest.projectId())
 *             .clusterName(clusterTest.name())
 *             .description(&#34;My description&#34;)
 *             .retentionInDays(&#34;1&#34;)
 *             .build());
 * 
 *         for (var i = 0; i &lt; (pointInTimeUtcSeconds == 0 ? 0 : 1); i++) {
 *             new CloudBackupSnapshotRestoreJob(&#34;testCloudBackupSnapshotRestoreJob-&#34; + i, CloudBackupSnapshotRestoreJobArgs.builder()            
 *                 .projectId(test.projectId())
 *                 .clusterName(test.clusterName())
 *                 .snapshotId(test.id())
 *                 .deliveryTypeConfig(CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs.builder()
 *                     .pointInTime(true)
 *                     .targetClusterName(clusterTest.name())
 *                     .targetProjectId(clusterTest.projectId())
 *                     .pointInTimeUtcSeconds(pointInTimeUtcSeconds)
 *                     .build())
 *                 .build());
 * 
 *         
 * }
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Available complete examples
 * - Restore from backup snapshot at point in time
 * - Restore from backup snapshot using an advanced cluster resource
 * 
 * ## Import
 * 
 * Cloud Backup Snapshot Restore Job entries can be imported using project project_id, cluster_name and snapshot_id (Unique identifier of the snapshot), in the format `PROJECTID-CLUSTERNAME-JOBID`, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/cloudBackupSnapshotRestoreJob:CloudBackupSnapshotRestoreJob test 5cf5a45a9ccf6400e60981b6-MyCluster-5d1b654ecf09a24b888f4c79
 * ```
 * For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/restore/restores/)
 * 
 */
@ResourceType(type="mongodbatlas:index/cloudBackupSnapshotRestoreJob:CloudBackupSnapshotRestoreJob")
public class CloudBackupSnapshotRestoreJob extends com.pulumi.resources.CustomResource {
    /**
     * Indicates whether the restore job was canceled.
     * 
     */
    @Export(name="cancelled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> cancelled;

    /**
     * @return Indicates whether the restore job was canceled.
     * 
     */
    public Output<Boolean> cancelled() {
        return this.cancelled;
    }
    /**
     * The name of the Atlas cluster whose snapshot you want to restore.
     * 
     */
    @Export(name="clusterName", refs={String.class}, tree="[0]")
    private Output<String> clusterName;

    /**
     * @return The name of the Atlas cluster whose snapshot you want to restore.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    /**
     * UTC ISO 8601 formatted point in time when Atlas created the restore job.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return UTC ISO 8601 formatted point in time when Atlas created the restore job.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in ``true``.
     * * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
     * * `delivery_type_config.download` - Set to `true` to use the download configuration.
     * * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplog_ts` and `oplog_inc`, or `point_in_time_utc_seconds`.
     * * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
     * * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
     * * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
     * * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplog_ts`.
     * * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
     * 
     */
    @Export(name="deliveryTypeConfig", refs={CloudBackupSnapshotRestoreJobDeliveryTypeConfig.class}, tree="[0]")
    private Output</* @Nullable */ CloudBackupSnapshotRestoreJobDeliveryTypeConfig> deliveryTypeConfig;

    /**
     * @return Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in ``true``.
     * * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
     * * `delivery_type_config.download` - Set to `true` to use the download configuration.
     * * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplog_ts` and `oplog_inc`, or `point_in_time_utc_seconds`.
     * * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
     * * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
     * * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
     * * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplog_ts`.
     * * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
     * 
     */
    public Output<Optional<CloudBackupSnapshotRestoreJobDeliveryTypeConfig>> deliveryTypeConfig() {
        return Codegen.optional(this.deliveryTypeConfig);
    }
    /**
     * One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
     * 
     */
    @Export(name="deliveryUrls", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> deliveryUrls;

    /**
     * @return One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
     * 
     */
    public Output<List<String>> deliveryUrls() {
        return this.deliveryUrls;
    }
    /**
     * Indicates whether the restore job expired.
     * 
     */
    @Export(name="expired", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> expired;

    /**
     * @return Indicates whether the restore job expired.
     * 
     */
    public Output<Boolean> expired() {
        return this.expired;
    }
    /**
     * UTC ISO 8601 formatted point in time when the restore job expires.
     * 
     */
    @Export(name="expiresAt", refs={String.class}, tree="[0]")
    private Output<String> expiresAt;

    /**
     * @return UTC ISO 8601 formatted point in time when the restore job expires.
     * 
     */
    public Output<String> expiresAt() {
        return this.expiresAt;
    }
    /**
     * UTC ISO 8601 formatted point in time when the restore job completed.
     * 
     */
    @Export(name="finishedAt", refs={String.class}, tree="[0]")
    private Output<String> finishedAt;

    /**
     * @return UTC ISO 8601 formatted point in time when the restore job completed.
     * 
     */
    public Output<String> finishedAt() {
        return this.finishedAt;
    }
    /**
     * The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Optional setting for **pointInTime** configuration. Unique identifier of the snapshot to restore.
     * 
     */
    @Export(name="snapshotId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> snapshotId;

    /**
     * @return Optional setting for **pointInTime** configuration. Unique identifier of the snapshot to restore.
     * 
     */
    public Output<Optional<String>> snapshotId() {
        return Codegen.optional(this.snapshotId);
    }
    /**
     * The unique identifier of the restore job.
     * 
     */
    @Export(name="snapshotRestoreJobId", refs={String.class}, tree="[0]")
    private Output<String> snapshotRestoreJobId;

    /**
     * @return The unique identifier of the restore job.
     * 
     */
    public Output<String> snapshotRestoreJobId() {
        return this.snapshotRestoreJobId;
    }
    /**
     * Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
     * 
     */
    @Export(name="timestamp", refs={String.class}, tree="[0]")
    private Output<String> timestamp;

    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
     * 
     */
    public Output<String> timestamp() {
        return this.timestamp;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudBackupSnapshotRestoreJob(String name) {
        this(name, CloudBackupSnapshotRestoreJobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudBackupSnapshotRestoreJob(String name, CloudBackupSnapshotRestoreJobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudBackupSnapshotRestoreJob(String name, CloudBackupSnapshotRestoreJobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/cloudBackupSnapshotRestoreJob:CloudBackupSnapshotRestoreJob", name, args == null ? CloudBackupSnapshotRestoreJobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CloudBackupSnapshotRestoreJob(String name, Output<String> id, @Nullable CloudBackupSnapshotRestoreJobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/cloudBackupSnapshotRestoreJob:CloudBackupSnapshotRestoreJob", name, state, makeResourceOptions(options, id));
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
    public static CloudBackupSnapshotRestoreJob get(String name, Output<String> id, @Nullable CloudBackupSnapshotRestoreJobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloudBackupSnapshotRestoreJob(name, id, state, options);
    }
}
