// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.CloudBackupSnapshotExportJobArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.CloudBackupSnapshotExportJobState;
import com.pulumi.mongodbatlas.outputs.CloudBackupSnapshotExportJobComponent;
import com.pulumi.mongodbatlas.outputs.CloudBackupSnapshotExportJobCustomData;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## # Resource: mongodbatlas.CloudBackupSnapshotExportJob
 * 
 * `mongodbatlas.CloudBackupSnapshotExportJob` allows you to create a cloud backup snapshot export job for the specified project.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 * 
 * ## Example Usage
 * 
 * ### Export one snapshot
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.CloudBackupSnapshotExportBucket;
 * import com.pulumi.mongodbatlas.CloudBackupSnapshotExportBucketArgs;
 * import com.pulumi.mongodbatlas.CloudBackupSnapshotExportJob;
 * import com.pulumi.mongodbatlas.CloudBackupSnapshotExportJobArgs;
 * import com.pulumi.mongodbatlas.inputs.CloudBackupSnapshotExportJobCustomDataArgs;
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
 *         var test = new CloudBackupSnapshotExportBucket("test", CloudBackupSnapshotExportBucketArgs.builder()
 *             .projectId("{PROJECT_ID}")
 *             .iamRoleId("{IAM_ROLE_ID}")
 *             .bucketName("example_bucket")
 *             .cloudProvider("AWS")
 *             .build());
 * 
 *         var testCloudBackupSnapshotExportJob = new CloudBackupSnapshotExportJob("testCloudBackupSnapshotExportJob", CloudBackupSnapshotExportJobArgs.builder()
 *             .projectId("{PROJECT_ID}")
 *             .clusterName("{CLUSTER_NAME}")
 *             .snapshotId("{SNAPSHOT_ID}")
 *             .exportBucketId(test.exportBucketId())
 *             .customDatas(CloudBackupSnapshotExportJobCustomDataArgs.builder()
 *                 .key("exported by")
 *                 .value("myName")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Create backup and automatic snapshot export policies
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.CloudBackupSnapshotExportBucket;
 * import com.pulumi.mongodbatlas.CloudBackupSnapshotExportBucketArgs;
 * import com.pulumi.mongodbatlas.CloudBackupSchedule;
 * import com.pulumi.mongodbatlas.CloudBackupScheduleArgs;
 * import com.pulumi.mongodbatlas.inputs.CloudBackupScheduleExportArgs;
 * import com.pulumi.mongodbatlas.inputs.CloudBackupSchedulePolicyItemHourlyArgs;
 * import com.pulumi.mongodbatlas.inputs.CloudBackupSchedulePolicyItemDailyArgs;
 * import com.pulumi.mongodbatlas.inputs.CloudBackupSchedulePolicyItemWeeklyArgs;
 * import com.pulumi.mongodbatlas.inputs.CloudBackupSchedulePolicyItemMonthlyArgs;
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
 *         var export = new CloudBackupSnapshotExportBucket("export", CloudBackupSnapshotExportBucketArgs.builder()
 *             .projectId("{PROJECT_ID}")
 *             .iamRoleId("{IAM_ROLE_ID}")
 *             .bucketName("example_bucket")
 *             .cloudProvider("AWS")
 *             .build());
 * 
 *         var backup = new CloudBackupSchedule("backup", CloudBackupScheduleArgs.builder()
 *             .projectId("{PROJECT_ID}")
 *             .clusterName("{CLUSTER_NAME}")
 *             .autoExportEnabled(true)
 *             .export(CloudBackupScheduleExportArgs.builder()
 *                 .exportBucketId(export.exportBucketId())
 *                 .frequencyType("daily")
 *                 .build())
 *             .useOrgAndGroupNamesInExportPrefix(true)
 *             .referenceHourOfDay(7)
 *             .referenceMinuteOfHour(0)
 *             .restoreWindowDays(5)
 *             .policyItemHourly(CloudBackupSchedulePolicyItemHourlyArgs.builder()
 *                 .frequencyInterval(6)
 *                 .retentionUnit("days")
 *                 .retentionValue(7)
 *                 .build())
 *             .policyItemDaily(CloudBackupSchedulePolicyItemDailyArgs.builder()
 *                 .frequencyInterval(1)
 *                 .retentionUnit("days")
 *                 .retentionValue(7)
 *                 .build())
 *             .policyItemWeeklies(CloudBackupSchedulePolicyItemWeeklyArgs.builder()
 *                 .frequencyInterval(6)
 *                 .retentionUnit("weeks")
 *                 .retentionValue(4)
 *                 .build())
 *             .policyItemMonthlies(CloudBackupSchedulePolicyItemMonthlyArgs.builder()
 *                 .frequencyInterval(28)
 *                 .retentionUnit("months")
 *                 .retentionValue(12)
 *                 .build())
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
 * Cloud Backup Snapshot Export Backup entries can be imported using project project_id, cluster_name and export_job_id (Unique identifier of the snapshot export job), in the format `PROJECTID-CLUSTERNAME-EXPORTJOBID`, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/cloudBackupSnapshotExportJob:CloudBackupSnapshotExportJob test 5d0f1f73cf09a29120e173cf-5d116d82014b764445b2f9b5-5d116d82014b764445b2f9b5
 * ```
 * For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/export/create-one-export-job/)
 * 
 */
@ResourceType(type="mongodbatlas:index/cloudBackupSnapshotExportJob:CloudBackupSnapshotExportJob")
public class CloudBackupSnapshotExportJob extends com.pulumi.resources.CustomResource {
    /**
     * Name of the Atlas cluster whose snapshot you want to export.
     * 
     */
    @Export(name="clusterName", refs={String.class}, tree="[0]")
    private Output<String> clusterName;

    /**
     * @return Name of the Atlas cluster whose snapshot you want to export.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    /**
     * _Returned for sharded clusters only._ Export job details for each replica set in the sharded cluster.
     * 
     */
    @Export(name="components", refs={List.class,CloudBackupSnapshotExportJobComponent.class}, tree="[0,1]")
    private Output<List<CloudBackupSnapshotExportJobComponent>> components;

    /**
     * @return _Returned for sharded clusters only._ Export job details for each replica set in the sharded cluster.
     * 
     */
    public Output<List<CloudBackupSnapshotExportJobComponent>> components() {
        return this.components;
    }
    /**
     * Timestamp in ISO 8601 date and time format in UTC when the export job was created.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when the export job was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
     * 
     */
    @Export(name="customDatas", refs={List.class,CloudBackupSnapshotExportJobCustomData.class}, tree="[0,1]")
    private Output<List<CloudBackupSnapshotExportJobCustomData>> customDatas;

    /**
     * @return Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
     * 
     */
    public Output<List<CloudBackupSnapshotExportJobCustomData>> customDatas() {
        return this.customDatas;
    }
    /**
     * Unique identifier of the AWS bucket to export the Cloud Backup snapshot to. If necessary, use the [Get All Snapshot Export Buckets](https://docs.atlas.mongodb.com/reference/api/cloud-backup/export/get-all-export-buckets/) API to retrieve the IDs of all available export buckets for a project or use the data source mongodbatlas_cloud_backup_snapshot_export_buckets
     * 
     */
    @Export(name="exportBucketId", refs={String.class}, tree="[0]")
    private Output<String> exportBucketId;

    /**
     * @return Unique identifier of the AWS bucket to export the Cloud Backup snapshot to. If necessary, use the [Get All Snapshot Export Buckets](https://docs.atlas.mongodb.com/reference/api/cloud-backup/export/get-all-export-buckets/) API to retrieve the IDs of all available export buckets for a project or use the data source mongodbatlas_cloud_backup_snapshot_export_buckets
     * 
     */
    public Output<String> exportBucketId() {
        return this.exportBucketId;
    }
    /**
     * Unique identifier of the export job.
     * * ` prefix  ` - Full path on the cloud provider bucket to the folder where the snapshot is exported. The path is in the following format:`/exported_snapshots/{ORG-NAME}/{PROJECT-NAME}/{CLUSTER-NAME}/{SNAPSHOT-INITIATION-DATE}/{TIMESTAMP}`
     * 
     */
    @Export(name="exportJobId", refs={String.class}, tree="[0]")
    private Output<String> exportJobId;

    /**
     * @return Unique identifier of the export job.
     * * ` prefix  ` - Full path on the cloud provider bucket to the folder where the snapshot is exported. The path is in the following format:`/exported_snapshots/{ORG-NAME}/{PROJECT-NAME}/{CLUSTER-NAME}/{SNAPSHOT-INITIATION-DATE}/{TIMESTAMP}`
     * 
     */
    public Output<String> exportJobId() {
        return this.exportJobId;
    }
    @Export(name="exportStatusExportedCollections", refs={Integer.class}, tree="[0]")
    private Output<Integer> exportStatusExportedCollections;

    public Output<Integer> exportStatusExportedCollections() {
        return this.exportStatusExportedCollections;
    }
    @Export(name="exportStatusTotalCollections", refs={Integer.class}, tree="[0]")
    private Output<Integer> exportStatusTotalCollections;

    public Output<Integer> exportStatusTotalCollections() {
        return this.exportStatusTotalCollections;
    }
    /**
     * Timestamp in ISO 8601 date and time format in UTC when the export job completes.
     * 
     */
    @Export(name="finishedAt", refs={String.class}, tree="[0]")
    private Output<String> finishedAt;

    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when the export job completes.
     * 
     */
    public Output<String> finishedAt() {
        return this.finishedAt;
    }
    @Export(name="prefix", refs={String.class}, tree="[0]")
    private Output<String> prefix;

    public Output<String> prefix() {
        return this.prefix;
    }
    /**
     * Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to export.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to export.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Unique identifier of the Cloud Backup snapshot to export. If necessary, use the [Get All Cloud Backups](https://docs.atlas.mongodb.com/reference/api/cloud-backup/backup/get-all-backups/) API to retrieve the list of snapshot IDs for a cluster or use the data source mongodbatlas_cloud_cloud_backup_snapshots
     * 
     */
    @Export(name="snapshotId", refs={String.class}, tree="[0]")
    private Output<String> snapshotId;

    /**
     * @return Unique identifier of the Cloud Backup snapshot to export. If necessary, use the [Get All Cloud Backups](https://docs.atlas.mongodb.com/reference/api/cloud-backup/backup/get-all-backups/) API to retrieve the list of snapshot IDs for a cluster or use the data source mongodbatlas_cloud_cloud_backup_snapshots
     * 
     */
    public Output<String> snapshotId() {
        return this.snapshotId;
    }
    /**
     * Status of the export job. Value can be one of the following:
     * * `Queued` - indicates that the export job is queued
     * * `InProgress` - indicates that the snapshot is being exported
     * * `Successful` - indicates that the export job has completed successfully
     * * `Failed` - indicates that the export job has failed
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return Status of the export job. Value can be one of the following:
     * * `Queued` - indicates that the export job is queued
     * * `InProgress` - indicates that the snapshot is being exported
     * * `Successful` - indicates that the export job has completed successfully
     * * `Failed` - indicates that the export job has failed
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudBackupSnapshotExportJob(java.lang.String name) {
        this(name, CloudBackupSnapshotExportJobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudBackupSnapshotExportJob(java.lang.String name, CloudBackupSnapshotExportJobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudBackupSnapshotExportJob(java.lang.String name, CloudBackupSnapshotExportJobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/cloudBackupSnapshotExportJob:CloudBackupSnapshotExportJob", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CloudBackupSnapshotExportJob(java.lang.String name, Output<java.lang.String> id, @Nullable CloudBackupSnapshotExportJobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/cloudBackupSnapshotExportJob:CloudBackupSnapshotExportJob", name, state, makeResourceOptions(options, id), false);
    }

    private static CloudBackupSnapshotExportJobArgs makeArgs(CloudBackupSnapshotExportJobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CloudBackupSnapshotExportJobArgs.Empty : args;
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
    public static CloudBackupSnapshotExportJob get(java.lang.String name, Output<java.lang.String> id, @Nullable CloudBackupSnapshotExportJobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloudBackupSnapshotExportJob(name, id, state, options);
    }
}
