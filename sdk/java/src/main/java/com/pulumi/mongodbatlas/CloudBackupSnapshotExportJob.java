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
 * ## Example Usage
 * ```java
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
 *         var testCloudBackupSnapshotExportBucket = new CloudBackupSnapshotExportBucket(&#34;testCloudBackupSnapshotExportBucket&#34;, CloudBackupSnapshotExportBucketArgs.builder()        
 *             .projectId(&#34;{PROJECT_ID}&#34;)
 *             .iamRoleId(&#34;{IAM_ROLE_ID}&#34;)
 *             .bucketName(&#34;example_bucket&#34;)
 *             .cloudProvider(&#34;AWS&#34;)
 *             .build());
 * 
 *         var testCloudBackupSnapshotExportJob = new CloudBackupSnapshotExportJob(&#34;testCloudBackupSnapshotExportJob&#34;, CloudBackupSnapshotExportJobArgs.builder()        
 *             .projectId(&#34;{PROJECT_ID}&#34;)
 *             .clusterName(&#34;{CLUSTER_NAME}&#34;)
 *             .snapshotId(&#34;{SNAPSHOT_ID}&#34;)
 *             .exportBucketId(testCloudBackupSnapshotExportBucket.exportBucketId())
 *             .customDatas(CloudBackupSnapshotExportJobCustomDataArgs.builder()
 *                 .key(&#34;exported by&#34;)
 *                 .value(&#34;myName&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cloud Backup Snapshot Export Backup entries can be imported using project project_id, cluster_name and export_job_id (Unique identifier of the snapshot export job), in the format `PROJECTID-CLUSTERNAME-EXPORTJOBID`, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/cloudBackupSnapshotExportJob:CloudBackupSnapshotExportJob test 5d0f1f73cf09a29120e173cf-5d116d82014b764445b2f9b5-5d116d82014b764445b2f9b5
 * ```
 * 
 *  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/export/create-one-export-job/)
 * 
 */
@ResourceType(type="mongodbatlas:index/cloudBackupSnapshotExportJob:CloudBackupSnapshotExportJob")
public class CloudBackupSnapshotExportJob extends com.pulumi.resources.CustomResource {
    /**
     * Name of the Atlas cluster whose snapshot you want to export.
     * 
     */
    @Export(name="clusterName", type=String.class, parameters={})
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
    @Export(name="components", type=List.class, parameters={CloudBackupSnapshotExportJobComponent.class})
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
    @Export(name="createdAt", type=String.class, parameters={})
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
    @Export(name="customDatas", type=List.class, parameters={CloudBackupSnapshotExportJobCustomData.class})
    private Output<List<CloudBackupSnapshotExportJobCustomData>> customDatas;

    /**
     * @return Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
     * 
     */
    public Output<List<CloudBackupSnapshotExportJobCustomData>> customDatas() {
        return this.customDatas;
    }
    /**
     * Error message, only if the export job failed.
     * 
     */
    @Export(name="errMsg", type=String.class, parameters={})
    private Output<String> errMsg;

    /**
     * @return Error message, only if the export job failed.
     * 
     */
    public Output<String> errMsg() {
        return this.errMsg;
    }
    /**
     * Unique identifier of the AWS bucket to export the Cloud Backup snapshot to. If necessary, use the Get All Snapshot Export Buckets
     * 
     */
    @Export(name="exportBucketId", type=String.class, parameters={})
    private Output<String> exportBucketId;

    /**
     * @return Unique identifier of the AWS bucket to export the Cloud Backup snapshot to. If necessary, use the Get All Snapshot Export Buckets
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
    @Export(name="exportJobId", type=String.class, parameters={})
    private Output<String> exportJobId;

    /**
     * @return Unique identifier of the export job.
     * * ` prefix  ` - Full path on the cloud provider bucket to the folder where the snapshot is exported. The path is in the following format:`/exported_snapshots/{ORG-NAME}/{PROJECT-NAME}/{CLUSTER-NAME}/{SNAPSHOT-INITIATION-DATE}/{TIMESTAMP}`
     * 
     */
    public Output<String> exportJobId() {
        return this.exportJobId;
    }
    @Export(name="exportStatusExportedCollections", type=Integer.class, parameters={})
    private Output<Integer> exportStatusExportedCollections;

    public Output<Integer> exportStatusExportedCollections() {
        return this.exportStatusExportedCollections;
    }
    @Export(name="exportStatusTotalCollections", type=Integer.class, parameters={})
    private Output<Integer> exportStatusTotalCollections;

    public Output<Integer> exportStatusTotalCollections() {
        return this.exportStatusTotalCollections;
    }
    /**
     * Timestamp in ISO 8601 date and time format in UTC when the export job completes.
     * 
     */
    @Export(name="finishedAt", type=String.class, parameters={})
    private Output<String> finishedAt;

    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when the export job completes.
     * 
     */
    public Output<String> finishedAt() {
        return this.finishedAt;
    }
    @Export(name="prefix", type=String.class, parameters={})
    private Output<String> prefix;

    public Output<String> prefix() {
        return this.prefix;
    }
    /**
     * Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to export.
     * 
     */
    @Export(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to export.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Unique identifier of the Cloud Backup snapshot to export. If necessary, use the Get All Cloud Backups
     * 
     */
    @Export(name="snapshotId", type=String.class, parameters={})
    private Output<String> snapshotId;

    /**
     * @return Unique identifier of the Cloud Backup snapshot to export. If necessary, use the Get All Cloud Backups
     * 
     */
    public Output<String> snapshotId() {
        return this.snapshotId;
    }
    /**
     * Status of the export job. Value can be one of the following:
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Status of the export job. Value can be one of the following:
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudBackupSnapshotExportJob(String name) {
        this(name, CloudBackupSnapshotExportJobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudBackupSnapshotExportJob(String name, CloudBackupSnapshotExportJobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudBackupSnapshotExportJob(String name, CloudBackupSnapshotExportJobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/cloudBackupSnapshotExportJob:CloudBackupSnapshotExportJob", name, args == null ? CloudBackupSnapshotExportJobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CloudBackupSnapshotExportJob(String name, Output<String> id, @Nullable CloudBackupSnapshotExportJobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/cloudBackupSnapshotExportJob:CloudBackupSnapshotExportJob", name, state, makeResourceOptions(options, id));
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
    public static CloudBackupSnapshotExportJob get(String name, Output<String> id, @Nullable CloudBackupSnapshotExportJobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloudBackupSnapshotExportJob(name, id, state, options);
    }
}
