// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.CloudProviderSnapshotBackupPolicyArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.CloudProviderSnapshotBackupPolicyState;
import com.pulumi.mongodbatlas.outputs.CloudProviderSnapshotBackupPolicyPolicy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Cloud Backup Snapshot Policy entries can be imported using project project_id and cluster_name, in the format `PROJECTID-CLUSTERNAME`, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/cloudProviderSnapshotBackupPolicy:CloudProviderSnapshotBackupPolicy test 5d0f1f73cf09a29120e173cf-MyClusterTest
 * ```
 * 
 *  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/schedule/modify-one-schedule/)
 * 
 */
@ResourceType(type="mongodbatlas:index/cloudProviderSnapshotBackupPolicy:CloudProviderSnapshotBackupPolicy")
public class CloudProviderSnapshotBackupPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Unique identifier of the Atlas cluster.
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return Unique identifier of the Atlas cluster.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
     * 
     */
    @Export(name="clusterName", type=String.class, parameters={})
    private Output<String> clusterName;

    /**
     * @return The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    /**
     * Timestamp in the number of seconds that have elapsed since the UNIX epoch when Atlas takes the next snapshot.
     * 
     */
    @Export(name="nextSnapshot", type=String.class, parameters={})
    private Output<String> nextSnapshot;

    /**
     * @return Timestamp in the number of seconds that have elapsed since the UNIX epoch when Atlas takes the next snapshot.
     * 
     */
    public Output<String> nextSnapshot() {
        return this.nextSnapshot;
    }
    /**
     * Contains a document for each backup policy item in the desired updated backup policy.
     * * `policies.#.id` - (Required) Unique identifier of the backup policy that you want to update. policies.#.id is a value obtained via the mongodbatlas.Cluster resource. provider_backup_enabled of the mongodbatlas.Cluster resource must be set to true. See the example above for how to refer to the mongodbatlas.Cluster resource for policies.#.id
     * 
     */
    @Export(name="policies", type=List.class, parameters={CloudProviderSnapshotBackupPolicyPolicy.class})
    private Output<List<CloudProviderSnapshotBackupPolicyPolicy>> policies;

    /**
     * @return Contains a document for each backup policy item in the desired updated backup policy.
     * * `policies.#.id` - (Required) Unique identifier of the backup policy that you want to update. policies.#.id is a value obtained via the mongodbatlas.Cluster resource. provider_backup_enabled of the mongodbatlas.Cluster resource must be set to true. See the example above for how to refer to the mongodbatlas.Cluster resource for policies.#.id
     * 
     */
    public Output<List<CloudProviderSnapshotBackupPolicyPolicy>> policies() {
        return this.policies;
    }
    /**
     * The unique identifier of the project for the Atlas cluster.
     * 
     */
    @Export(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return The unique identifier of the project for the Atlas cluster.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
     * 
     */
    @Export(name="referenceHourOfDay", type=Integer.class, parameters={})
    private Output<Integer> referenceHourOfDay;

    /**
     * @return UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
     * 
     */
    public Output<Integer> referenceHourOfDay() {
        return this.referenceHourOfDay;
    }
    /**
     * UTC Minutes after referenceHourOfDay that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
     * 
     */
    @Export(name="referenceMinuteOfHour", type=Integer.class, parameters={})
    private Output<Integer> referenceMinuteOfHour;

    /**
     * @return UTC Minutes after referenceHourOfDay that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
     * 
     */
    public Output<Integer> referenceMinuteOfHour() {
        return this.referenceMinuteOfHour;
    }
    /**
     * Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
     * 
     */
    @Export(name="restoreWindowDays", type=Integer.class, parameters={})
    private Output<Integer> restoreWindowDays;

    /**
     * @return Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
     * 
     */
    public Output<Integer> restoreWindowDays() {
        return this.restoreWindowDays;
    }
    /**
     * Specify true to apply the retention changes in the updated backup policy to snapshots that Atlas took previously.
     * 
     */
    @Export(name="updateSnapshots", type=Boolean.class, parameters={})
    private Output<Boolean> updateSnapshots;

    /**
     * @return Specify true to apply the retention changes in the updated backup policy to snapshots that Atlas took previously.
     * 
     */
    public Output<Boolean> updateSnapshots() {
        return this.updateSnapshots;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudProviderSnapshotBackupPolicy(String name) {
        this(name, CloudProviderSnapshotBackupPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudProviderSnapshotBackupPolicy(String name, CloudProviderSnapshotBackupPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudProviderSnapshotBackupPolicy(String name, CloudProviderSnapshotBackupPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/cloudProviderSnapshotBackupPolicy:CloudProviderSnapshotBackupPolicy", name, args == null ? CloudProviderSnapshotBackupPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CloudProviderSnapshotBackupPolicy(String name, Output<String> id, @Nullable CloudProviderSnapshotBackupPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/cloudProviderSnapshotBackupPolicy:CloudProviderSnapshotBackupPolicy", name, state, makeResourceOptions(options, id));
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
    public static CloudProviderSnapshotBackupPolicy get(String name, Output<String> id, @Nullable CloudProviderSnapshotBackupPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloudProviderSnapshotBackupPolicy(name, id, state, options);
    }
}
