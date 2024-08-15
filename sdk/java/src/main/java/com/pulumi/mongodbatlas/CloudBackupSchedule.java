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
import com.pulumi.mongodbatlas.outputs.CloudBackupScheduleCopySetting;
import com.pulumi.mongodbatlas.outputs.CloudBackupScheduleExport;
import com.pulumi.mongodbatlas.outputs.CloudBackupSchedulePolicyItemDaily;
import com.pulumi.mongodbatlas.outputs.CloudBackupSchedulePolicyItemHourly;
import com.pulumi.mongodbatlas.outputs.CloudBackupSchedulePolicyItemMonthly;
import com.pulumi.mongodbatlas.outputs.CloudBackupSchedulePolicyItemWeekly;
import com.pulumi.mongodbatlas.outputs.CloudBackupSchedulePolicyItemYearly;
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
 * $ pulumi import mongodbatlas:index/cloudBackupSchedule:CloudBackupSchedule test 5d0f1f73cf09a29120e173cf-MyClusterTest
 * ```
 * For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/schedule/modify-one-schedule/)
 * 
 */
@ResourceType(type="mongodbatlas:index/cloudBackupSchedule:CloudBackupSchedule")
public class CloudBackupSchedule extends com.pulumi.resources.CustomResource {
    /**
     * Flag that indicates whether automatic export of cloud backup snapshots to the AWS bucket is enabled. Value can be one of the following:
     * * true - enables automatic export of cloud backup snapshots to the AWS bucket
     * * false - disables automatic export of cloud backup snapshots to the AWS bucket (default)
     * 
     */
    @Export(name="autoExportEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> autoExportEnabled;

    /**
     * @return Flag that indicates whether automatic export of cloud backup snapshots to the AWS bucket is enabled. Value can be one of the following:
     * * true - enables automatic export of cloud backup snapshots to the AWS bucket
     * * false - disables automatic export of cloud backup snapshots to the AWS bucket (default)
     * 
     */
    public Output<Boolean> autoExportEnabled() {
        return this.autoExportEnabled;
    }
    /**
     * Unique identifier of the Atlas cluster.
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
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
    @Export(name="clusterName", refs={String.class}, tree="[0]")
    private Output<String> clusterName;

    /**
     * @return The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    /**
     * List that contains a document for each copy setting item in the desired backup policy. See below
     * 
     */
    @Export(name="copySettings", refs={List.class,CloudBackupScheduleCopySetting.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CloudBackupScheduleCopySetting>> copySettings;

    /**
     * @return List that contains a document for each copy setting item in the desired backup policy. See below
     * 
     */
    public Output<Optional<List<CloudBackupScheduleCopySetting>>> copySettings() {
        return Codegen.optional(this.copySettings);
    }
    /**
     * Policy for automatically exporting Cloud Backup Snapshots. See below
     * 
     */
    @Export(name="export", refs={CloudBackupScheduleExport.class}, tree="[0]")
    private Output<CloudBackupScheduleExport> export;

    /**
     * @return Policy for automatically exporting Cloud Backup Snapshots. See below
     * 
     */
    public Output<CloudBackupScheduleExport> export() {
        return this.export;
    }
    /**
     * Unique identifier of the backup policy.
     * 
     */
    @Export(name="idPolicy", refs={String.class}, tree="[0]")
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
    @Export(name="nextSnapshot", refs={String.class}, tree="[0]")
    private Output<String> nextSnapshot;

    /**
     * @return Timestamp in the number of seconds that have elapsed since the UNIX epoch when Atlas takes the next snapshot.
     * 
     */
    public Output<String> nextSnapshot() {
        return this.nextSnapshot;
    }
    /**
     * Daily policy item. See below
     * 
     */
    @Export(name="policyItemDaily", refs={CloudBackupSchedulePolicyItemDaily.class}, tree="[0]")
    private Output</* @Nullable */ CloudBackupSchedulePolicyItemDaily> policyItemDaily;

    /**
     * @return Daily policy item. See below
     * 
     */
    public Output<Optional<CloudBackupSchedulePolicyItemDaily>> policyItemDaily() {
        return Codegen.optional(this.policyItemDaily);
    }
    /**
     * Hourly policy item. See below
     * 
     */
    @Export(name="policyItemHourly", refs={CloudBackupSchedulePolicyItemHourly.class}, tree="[0]")
    private Output</* @Nullable */ CloudBackupSchedulePolicyItemHourly> policyItemHourly;

    /**
     * @return Hourly policy item. See below
     * 
     */
    public Output<Optional<CloudBackupSchedulePolicyItemHourly>> policyItemHourly() {
        return Codegen.optional(this.policyItemHourly);
    }
    /**
     * Monthly policy item. See below
     * 
     */
    @Export(name="policyItemMonthlies", refs={List.class,CloudBackupSchedulePolicyItemMonthly.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CloudBackupSchedulePolicyItemMonthly>> policyItemMonthlies;

    /**
     * @return Monthly policy item. See below
     * 
     */
    public Output<Optional<List<CloudBackupSchedulePolicyItemMonthly>>> policyItemMonthlies() {
        return Codegen.optional(this.policyItemMonthlies);
    }
    /**
     * Weekly policy item. See below
     * 
     */
    @Export(name="policyItemWeeklies", refs={List.class,CloudBackupSchedulePolicyItemWeekly.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CloudBackupSchedulePolicyItemWeekly>> policyItemWeeklies;

    /**
     * @return Weekly policy item. See below
     * 
     */
    public Output<Optional<List<CloudBackupSchedulePolicyItemWeekly>>> policyItemWeeklies() {
        return Codegen.optional(this.policyItemWeeklies);
    }
    /**
     * Yearly policy item. See below
     * 
     */
    @Export(name="policyItemYearlies", refs={List.class,CloudBackupSchedulePolicyItemYearly.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CloudBackupSchedulePolicyItemYearly>> policyItemYearlies;

    /**
     * @return Yearly policy item. See below
     * 
     */
    public Output<Optional<List<CloudBackupSchedulePolicyItemYearly>>> policyItemYearlies() {
        return Codegen.optional(this.policyItemYearlies);
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
     * UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
     * 
     */
    @Export(name="referenceHourOfDay", refs={Integer.class}, tree="[0]")
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
    @Export(name="referenceMinuteOfHour", refs={Integer.class}, tree="[0]")
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
    @Export(name="restoreWindowDays", refs={Integer.class}, tree="[0]")
    private Output<Integer> restoreWindowDays;

    /**
     * @return Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
     * 
     */
    public Output<Integer> restoreWindowDays() {
        return this.restoreWindowDays;
    }
    @Export(name="updateSnapshots", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> updateSnapshots;

    public Output<Boolean> updateSnapshots() {
        return this.updateSnapshots;
    }
    /**
     * Specify true to use organization and project names instead of organization and project UUIDs in the path for the metadata files that Atlas uploads to your S3 bucket after it finishes exporting the snapshots. To learn more about the metadata files that Atlas uploads, see [Export Cloud Backup Snapshot](https://www.mongodb.com/docs/atlas/backup/cloud-backup/export/#std-label-cloud-provider-snapshot-export).
     * 
     */
    @Export(name="useOrgAndGroupNamesInExportPrefix", refs={Boolean.class}, tree="[0]")
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
    public CloudBackupSchedule(java.lang.String name) {
        this(name, CloudBackupScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudBackupSchedule(java.lang.String name, CloudBackupScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudBackupSchedule(java.lang.String name, CloudBackupScheduleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/cloudBackupSchedule:CloudBackupSchedule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CloudBackupSchedule(java.lang.String name, Output<java.lang.String> id, @Nullable CloudBackupScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/cloudBackupSchedule:CloudBackupSchedule", name, state, makeResourceOptions(options, id), false);
    }

    private static CloudBackupScheduleArgs makeArgs(CloudBackupScheduleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CloudBackupScheduleArgs.Empty : args;
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
    public static CloudBackupSchedule get(java.lang.String name, Output<java.lang.String> id, @Nullable CloudBackupScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloudBackupSchedule(name, id, state, options);
    }
}
