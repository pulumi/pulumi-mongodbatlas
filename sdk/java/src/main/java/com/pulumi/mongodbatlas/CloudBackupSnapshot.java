// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.CloudBackupSnapshotArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.CloudBackupSnapshotState;
import com.pulumi.mongodbatlas.outputs.CloudBackupSnapshotMember;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * `mongodbatlas.CloudBackupSnapshot` provides a resource to take a cloud backup snapshot on demand.
 * On-demand snapshots happen immediately, unlike scheduled snapshots which occur at regular intervals. If there is already an on-demand snapshot with a status of queued or inProgress, you must wait until Atlas has completed the on-demand snapshot before taking another.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 * 
 * &gt; **NOTE:** If Backup Compliance Policy is enabled for the project for which this backup schedule is defined, you cannot delete a backup snapshot or decrease the retention time for a snapshot after it&#39;s taken.  See [Backup Compliance Policy Prohibited Actions and Considerations](https://www.mongodb.com/docs/atlas/backup/cloud-backup/backup-compliance-policy/#configure-a-backup-compliance-policy).
 * 
 * ## Example Usage
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
 * import com.pulumi.mongodbatlas.CloudBackupSnapshot;
 * import com.pulumi.mongodbatlas.CloudBackupSnapshotArgs;
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
 *             .providerName(&#34;AWS&#34;)
 *             .providerRegionName(&#34;EU_WEST_2&#34;)
 *             .providerInstanceSizeName(&#34;M10&#34;)
 *             .cloudBackup(true)
 *             .build());
 * 
 *         var testCloudBackupSnapshot = new CloudBackupSnapshot(&#34;testCloudBackupSnapshot&#34;, CloudBackupSnapshotArgs.builder()        
 *             .projectId(myCluster.projectId())
 *             .clusterName(myCluster.name())
 *             .description(&#34;myDescription&#34;)
 *             .retentionInDays(1)
 *             .build());
 * 
 *         var testCloudBackupSnapshotRestoreJob = new CloudBackupSnapshotRestoreJob(&#34;testCloudBackupSnapshotRestoreJob&#34;, CloudBackupSnapshotRestoreJobArgs.builder()        
 *             .projectId(testCloudBackupSnapshot.projectId())
 *             .clusterName(testCloudBackupSnapshot.clusterName())
 *             .snapshotId(testCloudBackupSnapshot.snapshotId())
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
 * ## Import
 * 
 * Cloud Backup Snapshot entries can be imported using project project_id, cluster_name and snapshot_id (Unique identifier of the snapshot), in the format `PROJECTID-CLUSTERNAME-SNAPSHOTID`, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/cloudBackupSnapshot:CloudBackupSnapshot test 5d0f1f73cf09a29120e173cf-MyClusterTest-5d116d82014b764445b2f9b5
 * ```
 * For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/backup/backups/)
 * 
 */
@ResourceType(type="mongodbatlas:index/cloudBackupSnapshot:CloudBackupSnapshot")
public class CloudBackupSnapshot extends com.pulumi.resources.CustomResource {
    /**
     * Cloud provider that stores this snapshot.
     * 
     */
    @Export(name="cloudProvider", refs={String.class}, tree="[0]")
    private Output<String> cloudProvider;

    /**
     * @return Cloud provider that stores this snapshot.
     * 
     */
    public Output<String> cloudProvider() {
        return this.cloudProvider;
    }
    /**
     * The name of the Atlas cluster that contains the snapshots you want to retrieve.
     * 
     */
    @Export(name="clusterName", refs={String.class}, tree="[0]")
    private Output<String> clusterName;

    /**
     * @return The name of the Atlas cluster that contains the snapshots you want to retrieve.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    /**
     * UTC ISO 8601 formatted point in time when Atlas took the snapshot.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return UTC ISO 8601 formatted point in time when Atlas took the snapshot.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Description of the on-demand snapshot.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Description of the on-demand snapshot.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
     * 
     */
    @Export(name="expiresAt", refs={String.class}, tree="[0]")
    private Output<String> expiresAt;

    /**
     * @return UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
     * 
     */
    public Output<String> expiresAt() {
        return this.expiresAt;
    }
    /**
     * Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
     * 
     */
    @Export(name="masterKeyUuid", refs={String.class}, tree="[0]")
    private Output<String> masterKeyUuid;

    /**
     * @return Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
     * 
     */
    public Output<String> masterKeyUuid() {
        return this.masterKeyUuid;
    }
    /**
     * Block of List of snapshots and the cloud provider where the snapshots are stored. Atlas returns this parameter when `type` is `shardedCluster`. See below
     * 
     */
    @Export(name="members", refs={List.class,CloudBackupSnapshotMember.class}, tree="[0,1]")
    private Output<List<CloudBackupSnapshotMember>> members;

    /**
     * @return Block of List of snapshots and the cloud provider where the snapshots are stored. Atlas returns this parameter when `type` is `shardedCluster`. See below
     * 
     */
    public Output<List<CloudBackupSnapshotMember>> members() {
        return this.members;
    }
    /**
     * Version of the MongoDB server.
     * 
     */
    @Export(name="mongodVersion", refs={String.class}, tree="[0]")
    private Output<String> mongodVersion;

    /**
     * @return Version of the MongoDB server.
     * 
     */
    public Output<String> mongodVersion() {
        return this.mongodVersion;
    }
    /**
     * The unique identifier of the project for the Atlas cluster.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The unique identifier of the project for the Atlas cluster.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Label given to a shard or config server from which Atlas took this snapshot.
     * 
     */
    @Export(name="replicaSetName", refs={String.class}, tree="[0]")
    private Output<String> replicaSetName;

    /**
     * @return Label given to a shard or config server from which Atlas took this snapshot.
     * 
     */
    public Output<String> replicaSetName() {
        return this.replicaSetName;
    }
    /**
     * The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
     * 
     */
    @Export(name="retentionInDays", refs={Integer.class}, tree="[0]")
    private Output<Integer> retentionInDays;

    /**
     * @return The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
     * 
     */
    public Output<Integer> retentionInDays() {
        return this.retentionInDays;
    }
    /**
     * Unique identifier of the snapshot.
     * 
     */
    @Export(name="snapshotId", refs={String.class}, tree="[0]")
    private Output<String> snapshotId;

    /**
     * @return Unique identifier of the snapshot.
     * 
     */
    public Output<String> snapshotId() {
        return this.snapshotId;
    }
    /**
     * Unique identifiers of the snapshots created for the shards and config server for a sharded cluster. Atlas returns this parameter when `type` is `shardedCluster`. These identifiers should match those given in the `members[n].id` parameters. This allows you to map a snapshot to its shard or config server name.
     * 
     */
    @Export(name="snapshotIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> snapshotIds;

    /**
     * @return Unique identifiers of the snapshots created for the shards and config server for a sharded cluster. Atlas returns this parameter when `type` is `shardedCluster`. These identifiers should match those given in the `members[n].id` parameters. This allows you to map a snapshot to its shard or config server name.
     * 
     */
    public Output<List<String>> snapshotIds() {
        return this.snapshotIds;
    }
    /**
     * Specified the type of snapshot. Valid values are onDemand and scheduled.
     * 
     */
    @Export(name="snapshotType", refs={String.class}, tree="[0]")
    private Output<String> snapshotType;

    /**
     * @return Specified the type of snapshot. Valid values are onDemand and scheduled.
     * 
     */
    public Output<String> snapshotType() {
        return this.snapshotType;
    }
    /**
     * Current status of the snapshot. One of the following values will be returned: queued, inProgress, completed, failed.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Current status of the snapshot. One of the following values will be returned: queued, inProgress, completed, failed.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Specifies the size of the snapshot in bytes.
     * 
     */
    @Export(name="storageSizeBytes", refs={Integer.class}, tree="[0]")
    private Output<Integer> storageSizeBytes;

    /**
     * @return Specifies the size of the snapshot in bytes.
     * 
     */
    public Output<Integer> storageSizeBytes() {
        return this.storageSizeBytes;
    }
    /**
     * Specifies the type of cluster: replicaSet or shardedCluster.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Specifies the type of cluster: replicaSet or shardedCluster.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudBackupSnapshot(String name) {
        this(name, CloudBackupSnapshotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudBackupSnapshot(String name, CloudBackupSnapshotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudBackupSnapshot(String name, CloudBackupSnapshotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/cloudBackupSnapshot:CloudBackupSnapshot", name, args == null ? CloudBackupSnapshotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CloudBackupSnapshot(String name, Output<String> id, @Nullable CloudBackupSnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/cloudBackupSnapshot:CloudBackupSnapshot", name, state, makeResourceOptions(options, id));
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
    public static CloudBackupSnapshot get(String name, Output<String> id, @Nullable CloudBackupSnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloudBackupSnapshot(name, id, state, options);
    }
}
