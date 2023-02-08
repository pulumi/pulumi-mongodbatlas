// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.CloudBackupScheduleArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.CloudBackupScheduleState;
import com.pulumi.mongodbatlas.outputs.CloudBackupScheduleExport;
import com.pulumi.mongodbatlas.outputs.CloudBackupSchedulePolicyItemDaily;
import com.pulumi.mongodbatlas.outputs.CloudBackupSchedulePolicyItemHourly;
import com.pulumi.mongodbatlas.outputs.CloudBackupSchedulePolicyItemMonthly;
import com.pulumi.mongodbatlas.outputs.CloudBackupSchedulePolicyItemWeekly;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Cloud Backup Schedule entries can be imported using project_id and cluster_name, in the format `PROJECTID-CLUSTERNAME`, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/cloudBackupSchedule:CloudBackupSchedule test 5d0f1f73cf09a29120e173cf-MyClusterTest
 * ```
 * 
 *  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/schedule/modify-one-schedule/)
 * 
 */
@ResourceType(type="mongodbatlas:index/cloudBackupSchedule:CloudBackupSchedule")
public class CloudBackupSchedule extends com.pulumi.resources.CustomResource {
    /**
     * Flag that indicates whether automatic export of cloud backup snapshots to the AWS bucket is enabled. Value can be one of the following:
     * 
     */
    @Export(name="autoExportEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> autoExportEnabled;

    /**
     * @return Flag that indicates whether automatic export of cloud backup snapshots to the AWS bucket is enabled. Value can be one of the following:
     * 
     */
    public Output<Boolean> autoExportEnabled() {
        return this.autoExportEnabled;
    }
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
    @Export(name="export", type=CloudBackupScheduleExport.class, parameters={})
    private Output<CloudBackupScheduleExport> export;

    public Output<CloudBackupScheduleExport> export() {
        return this.export;
    }
    /**
     * Unique identifier of the backup policy.
     * 
     */
    @Export(name="idPolicy", type=String.class, parameters={})
    private Output<String> idPolicy;

    /**
     * @return Unique identifier of the backup policy.
     * 
     */
    public Output<String> idPolicy() {
        return this.idPolicy;
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
     * Daily policy item
     * 
     */
    @Export(name="policyItemDaily", type=CloudBackupSchedulePolicyItemDaily.class, parameters={})
    private Output</* @Nullable */ CloudBackupSchedulePolicyItemDaily> policyItemDaily;

    /**
     * @return Daily policy item
     * 
     */
    public Output<Optional<CloudBackupSchedulePolicyItemDaily>> policyItemDaily() {
        return Codegen.optional(this.policyItemDaily);
    }
    /**
     * Hourly policy item
     * 
     */
    @Export(name="policyItemHourly", type=CloudBackupSchedulePolicyItemHourly.class, parameters={})
    private Output</* @Nullable */ CloudBackupSchedulePolicyItemHourly> policyItemHourly;

    /**
     * @return Hourly policy item
     * 
     */
    public Output<Optional<CloudBackupSchedulePolicyItemHourly>> policyItemHourly() {
        return Codegen.optional(this.policyItemHourly);
    }
    /**
     * Monthly policy item
     * 
     */
    @Export(name="policyItemMonthlies", type=List.class, parameters={CloudBackupSchedulePolicyItemMonthly.class})
    private Output</* @Nullable */ List<CloudBackupSchedulePolicyItemMonthly>> policyItemMonthlies;

    /**
     * @return Monthly policy item
     * 
     */
    public Output<Optional<List<CloudBackupSchedulePolicyItemMonthly>>> policyItemMonthlies() {
        return Codegen.optional(this.policyItemMonthlies);
    }
    /**
     * Weekly policy item
     * 
     */
    @Export(name="policyItemWeeklies", type=List.class, parameters={CloudBackupSchedulePolicyItemWeekly.class})
    private Output</* @Nullable */ List<CloudBackupSchedulePolicyItemWeekly>> policyItemWeeklies;

    /**
     * @return Weekly policy item
     * 
     */
    public Output<Optional<List<CloudBackupSchedulePolicyItemWeekly>>> policyItemWeeklies() {
        return Codegen.optional(this.policyItemWeeklies);
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
     * UTC Minutes after `reference_hour_of_day` that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
     * 
     */
    @Export(name="referenceMinuteOfHour", type=Integer.class, parameters={})
    private Output<Integer> referenceMinuteOfHour;

    /**
     * @return UTC Minutes after `reference_hour_of_day` that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
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
     * Specify true to use organization and project names instead of organization and project UUIDs in the path for the metadata files that Atlas uploads to your S3 bucket after it finishes exporting the snapshots. To learn more about the metadata files that Atlas uploads, see [Export Cloud Backup Snapshot](https://www.mongodb.com/docs/atlas/backup/cloud-backup/export/#std-label-cloud-provider-snapshot-export).
     * 
     */
    @Export(name="useOrgAndGroupNamesInExportPrefix", type=Boolean.class, parameters={})
    private Output<Boolean> useOrgAndGroupNamesInExportPrefix;

    /**
     * @return Specify true to use organization and project names instead of organization and project UUIDs in the path for the metadata files that Atlas uploads to your S3 bucket after it finishes exporting the snapshots. To learn more about the metadata files that Atlas uploads, see [Export Cloud Backup Snapshot](https://www.mongodb.com/docs/atlas/backup/cloud-backup/export/#std-label-cloud-provider-snapshot-export).
     * 
     */
    public Output<Boolean> useOrgAndGroupNamesInExportPrefix() {
        return this.useOrgAndGroupNamesInExportPrefix;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudBackupSchedule(String name) {
        this(name, CloudBackupScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudBackupSchedule(String name, CloudBackupScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudBackupSchedule(String name, CloudBackupScheduleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/cloudBackupSchedule:CloudBackupSchedule", name, args == null ? CloudBackupScheduleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CloudBackupSchedule(String name, Output<String> id, @Nullable CloudBackupScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/cloudBackupSchedule:CloudBackupSchedule", name, state, makeResourceOptions(options, id));
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
    public static CloudBackupSchedule get(String name, Output<String> id, @Nullable CloudBackupScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloudBackupSchedule(name, id, state, options);
    }
}