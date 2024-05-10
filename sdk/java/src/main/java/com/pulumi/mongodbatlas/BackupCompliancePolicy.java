// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.BackupCompliancePolicyArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.BackupCompliancePolicyState;
import com.pulumi.mongodbatlas.outputs.BackupCompliancePolicyOnDemandPolicyItem;
import com.pulumi.mongodbatlas.outputs.BackupCompliancePolicyPolicyItemDaily;
import com.pulumi.mongodbatlas.outputs.BackupCompliancePolicyPolicyItemHourly;
import com.pulumi.mongodbatlas.outputs.BackupCompliancePolicyPolicyItemMonthly;
import com.pulumi.mongodbatlas.outputs.BackupCompliancePolicyPolicyItemWeekly;
import com.pulumi.mongodbatlas.outputs.BackupCompliancePolicyPolicyItemYearly;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
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
 * import com.pulumi.mongodbatlas.Cluster;
 * import com.pulumi.mongodbatlas.ClusterArgs;
 * import com.pulumi.mongodbatlas.CloudBackupSchedule;
 * import com.pulumi.mongodbatlas.CloudBackupScheduleArgs;
 * import com.pulumi.mongodbatlas.inputs.CloudBackupSchedulePolicyItemHourlyArgs;
 * import com.pulumi.mongodbatlas.inputs.CloudBackupSchedulePolicyItemDailyArgs;
 * import com.pulumi.mongodbatlas.inputs.CloudBackupSchedulePolicyItemWeeklyArgs;
 * import com.pulumi.mongodbatlas.inputs.CloudBackupSchedulePolicyItemMonthlyArgs;
 * import com.pulumi.mongodbatlas.inputs.CloudBackupSchedulePolicyItemYearlyArgs;
 * import com.pulumi.mongodbatlas.MongodbatlasFunctions;
 * import com.pulumi.mongodbatlas.inputs.GetCloudBackupScheduleArgs;
 * import com.pulumi.mongodbatlas.inputs.GetBackupCompliancePolicyArgs;
 * import com.pulumi.mongodbatlas.BackupCompliancePolicy;
 * import com.pulumi.mongodbatlas.BackupCompliancePolicyArgs;
 * import com.pulumi.mongodbatlas.inputs.BackupCompliancePolicyOnDemandPolicyItemArgs;
 * import com.pulumi.mongodbatlas.inputs.BackupCompliancePolicyPolicyItemHourlyArgs;
 * import com.pulumi.mongodbatlas.inputs.BackupCompliancePolicyPolicyItemDailyArgs;
 * import com.pulumi.mongodbatlas.inputs.BackupCompliancePolicyPolicyItemWeeklyArgs;
 * import com.pulumi.mongodbatlas.inputs.BackupCompliancePolicyPolicyItemMonthlyArgs;
 * import com.pulumi.mongodbatlas.inputs.BackupCompliancePolicyPolicyItemYearlyArgs;
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
 *         var myCluster = new Cluster("myCluster", ClusterArgs.builder()        
 *             .projectId("<PROJECT-ID>")
 *             .name("clusterTest")
 *             .providerName("AWS")
 *             .providerRegionName("EU_CENTRAL_1")
 *             .providerInstanceSizeName("M10")
 *             .cloudBackup(true)
 *             .build());
 * 
 *         var testCloudBackupSchedule = new CloudBackupSchedule("testCloudBackupSchedule", CloudBackupScheduleArgs.builder()        
 *             .projectId(myCluster.projectId())
 *             .clusterName(myCluster.name())
 *             .referenceHourOfDay(3)
 *             .referenceMinuteOfHour(45)
 *             .restoreWindowDays(4)
 *             .policyItemHourly(CloudBackupSchedulePolicyItemHourlyArgs.builder()
 *                 .frequencyInterval(1)
 *                 .retentionUnit("days")
 *                 .retentionValue(7)
 *                 .build())
 *             .policyItemDaily(CloudBackupSchedulePolicyItemDailyArgs.builder()
 *                 .frequencyInterval(1)
 *                 .retentionUnit("days")
 *                 .retentionValue(7)
 *                 .build())
 *             .policyItemWeeklies(CloudBackupSchedulePolicyItemWeeklyArgs.builder()
 *                 .frequencyInterval(1)
 *                 .retentionUnit("weeks")
 *                 .retentionValue(4)
 *                 .build())
 *             .policyItemMonthlies(CloudBackupSchedulePolicyItemMonthlyArgs.builder()
 *                 .frequencyInterval(1)
 *                 .retentionUnit("months")
 *                 .retentionValue(12)
 *                 .build())
 *             .policyItemYearlies(CloudBackupSchedulePolicyItemYearlyArgs.builder()
 *                 .frequencyInterval(1)
 *                 .retentionUnit("years")
 *                 .retentionValue(1)
 *                 .build())
 *             .build());
 * 
 *         final var test = MongodbatlasFunctions.getCloudBackupSchedule(GetCloudBackupScheduleArgs.builder()
 *             .projectId(testCloudBackupSchedule.projectId())
 *             .clusterName(testCloudBackupSchedule.clusterName())
 *             .build());
 * 
 *         final var backupPolicy = MongodbatlasFunctions.getBackupCompliancePolicy(GetBackupCompliancePolicyArgs.builder()
 *             .projectId(testCloudBackupSchedule.projectId())
 *             .build());
 * 
 *         var backupPolicyBackupCompliancePolicy = new BackupCompliancePolicy("backupPolicyBackupCompliancePolicy", BackupCompliancePolicyArgs.builder()        
 *             .projectId("<PROJECT-ID>")
 *             .authorizedEmail("user{@literal @}email.com")
 *             .authorizedUserFirstName("First")
 *             .authorizedUserLastName("Last")
 *             .copyProtectionEnabled(false)
 *             .pitEnabled(false)
 *             .encryptionAtRestEnabled(false)
 *             .restoreWindowDays(7)
 *             .onDemandPolicyItem(BackupCompliancePolicyOnDemandPolicyItemArgs.builder()
 *                 .frequencyInterval(1)
 *                 .retentionUnit("days")
 *                 .retentionValue(3)
 *                 .build())
 *             .policyItemHourly(BackupCompliancePolicyPolicyItemHourlyArgs.builder()
 *                 .frequencyInterval(1)
 *                 .retentionUnit("days")
 *                 .retentionValue(7)
 *                 .build())
 *             .policyItemDaily(BackupCompliancePolicyPolicyItemDailyArgs.builder()
 *                 .frequencyInterval(1)
 *                 .retentionUnit("days")
 *                 .retentionValue(7)
 *                 .build())
 *             .policyItemWeeklies(BackupCompliancePolicyPolicyItemWeeklyArgs.builder()
 *                 .frequencyInterval(1)
 *                 .retentionUnit("weeks")
 *                 .retentionValue(4)
 *                 .build())
 *             .policyItemMonthlies(BackupCompliancePolicyPolicyItemMonthlyArgs.builder()
 *                 .frequencyInterval(1)
 *                 .retentionUnit("months")
 *                 .retentionValue(12)
 *                 .build())
 *             .policyItemYearlies(BackupCompliancePolicyPolicyItemYearlyArgs.builder()
 *                 .frequencyInterval(1)
 *                 .retentionUnit("years")
 *                 .retentionValue(1)
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
 * Backup Compliance Policy entries can be imported using project project_id  in the format `project_id`, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/backupCompliancePolicy:BackupCompliancePolicy backup_policy 5d0f1f73cf09a29120e173cf
 * ```
 * For more information see: [MongoDB Atlas API Reference](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Cloud-Backups/operation/updateDataProtectionSettings) and [Backup Compliance Policy Prohibited Actions](https://www.mongodb.com/docs/atlas/backup/cloud-backup/backup-compliance-policy/#prohibited-actions).
 * 
 */
@ResourceType(type="mongodbatlas:index/backupCompliancePolicy:BackupCompliancePolicy")
public class BackupCompliancePolicy extends com.pulumi.resources.CustomResource {
    /**
     * Email address of a security or legal representative for the Backup Compliance Policy who is authorized to update the Backup Compliance Policy settings.
     * 
     */
    @Export(name="authorizedEmail", refs={String.class}, tree="[0]")
    private Output<String> authorizedEmail;

    /**
     * @return Email address of a security or legal representative for the Backup Compliance Policy who is authorized to update the Backup Compliance Policy settings.
     * 
     */
    public Output<String> authorizedEmail() {
        return this.authorizedEmail;
    }
    /**
     * First name of the user who authorized to update the Backup Compliance Policy settings.
     * 
     */
    @Export(name="authorizedUserFirstName", refs={String.class}, tree="[0]")
    private Output<String> authorizedUserFirstName;

    /**
     * @return First name of the user who authorized to update the Backup Compliance Policy settings.
     * 
     */
    public Output<String> authorizedUserFirstName() {
        return this.authorizedUserFirstName;
    }
    /**
     * Last name of the user who authorized to update the Backup Compliance Policy settings.
     * 
     */
    @Export(name="authorizedUserLastName", refs={String.class}, tree="[0]")
    private Output<String> authorizedUserLastName;

    /**
     * @return Last name of the user who authorized to update the Backup Compliance Policy settings.
     * 
     */
    public Output<String> authorizedUserLastName() {
        return this.authorizedUserLastName;
    }
    /**
     * Flag that indicates whether to enable additional backup copies for the cluster. If unspecified, this value defaults to false.
     * 
     */
    @Export(name="copyProtectionEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> copyProtectionEnabled;

    /**
     * @return Flag that indicates whether to enable additional backup copies for the cluster. If unspecified, this value defaults to false.
     * 
     */
    public Output<Optional<Boolean>> copyProtectionEnabled() {
        return Codegen.optional(this.copyProtectionEnabled);
    }
    /**
     * Flag that indicates whether Encryption at Rest using Customer Key Management is required for all clusters with a Backup Compliance Policy. If unspecified, this value defaults to false.
     * 
     */
    @Export(name="encryptionAtRestEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> encryptionAtRestEnabled;

    /**
     * @return Flag that indicates whether Encryption at Rest using Customer Key Management is required for all clusters with a Backup Compliance Policy. If unspecified, this value defaults to false.
     * 
     */
    public Output<Optional<Boolean>> encryptionAtRestEnabled() {
        return Codegen.optional(this.encryptionAtRestEnabled);
    }
    @Export(name="onDemandPolicyItem", refs={BackupCompliancePolicyOnDemandPolicyItem.class}, tree="[0]")
    private Output<BackupCompliancePolicyOnDemandPolicyItem> onDemandPolicyItem;

    public Output<BackupCompliancePolicyOnDemandPolicyItem> onDemandPolicyItem() {
        return this.onDemandPolicyItem;
    }
    /**
     * Flag that indicates whether the cluster uses Continuous Cloud Backups with a Backup Compliance Policy. If unspecified, this value defaults to false.
     * 
     */
    @Export(name="pitEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> pitEnabled;

    /**
     * @return Flag that indicates whether the cluster uses Continuous Cloud Backups with a Backup Compliance Policy. If unspecified, this value defaults to false.
     * 
     */
    public Output<Optional<Boolean>> pitEnabled() {
        return Codegen.optional(this.pitEnabled);
    }
    @Export(name="policyItemDaily", refs={BackupCompliancePolicyPolicyItemDaily.class}, tree="[0]")
    private Output</* @Nullable */ BackupCompliancePolicyPolicyItemDaily> policyItemDaily;

    public Output<Optional<BackupCompliancePolicyPolicyItemDaily>> policyItemDaily() {
        return Codegen.optional(this.policyItemDaily);
    }
    @Export(name="policyItemHourly", refs={BackupCompliancePolicyPolicyItemHourly.class}, tree="[0]")
    private Output</* @Nullable */ BackupCompliancePolicyPolicyItemHourly> policyItemHourly;

    public Output<Optional<BackupCompliancePolicyPolicyItemHourly>> policyItemHourly() {
        return Codegen.optional(this.policyItemHourly);
    }
    @Export(name="policyItemMonthlies", refs={List.class,BackupCompliancePolicyPolicyItemMonthly.class}, tree="[0,1]")
    private Output</* @Nullable */ List<BackupCompliancePolicyPolicyItemMonthly>> policyItemMonthlies;

    public Output<Optional<List<BackupCompliancePolicyPolicyItemMonthly>>> policyItemMonthlies() {
        return Codegen.optional(this.policyItemMonthlies);
    }
    @Export(name="policyItemWeeklies", refs={List.class,BackupCompliancePolicyPolicyItemWeekly.class}, tree="[0,1]")
    private Output</* @Nullable */ List<BackupCompliancePolicyPolicyItemWeekly>> policyItemWeeklies;

    public Output<Optional<List<BackupCompliancePolicyPolicyItemWeekly>>> policyItemWeeklies() {
        return Codegen.optional(this.policyItemWeeklies);
    }
    @Export(name="policyItemYearlies", refs={List.class,BackupCompliancePolicyPolicyItemYearly.class}, tree="[0,1]")
    private Output</* @Nullable */ List<BackupCompliancePolicyPolicyItemYearly>> policyItemYearlies;

    public Output<Optional<List<BackupCompliancePolicyPolicyItemYearly>>> policyItemYearlies() {
        return Codegen.optional(this.policyItemYearlies);
    }
    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Number of previous days that you can restore back to with Continuous Cloud Backup with a Backup Compliance Policy. You must specify a positive, non-zero integer, and the maximum retention window can&#39;t exceed the hourly retention time. This parameter applies only to Continuous Cloud Backups with a Backup Compliance Policy.
     * 
     */
    @Export(name="restoreWindowDays", refs={Integer.class}, tree="[0]")
    private Output<Integer> restoreWindowDays;

    /**
     * @return Number of previous days that you can restore back to with Continuous Cloud Backup with a Backup Compliance Policy. You must specify a positive, non-zero integer, and the maximum retention window can&#39;t exceed the hourly retention time. This parameter applies only to Continuous Cloud Backups with a Backup Compliance Policy.
     * 
     */
    public Output<Integer> restoreWindowDays() {
        return this.restoreWindowDays;
    }
    /**
     * Label that indicates the state of the Backup Compliance Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return Label that indicates the state of the Backup Compliance Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * ISO 8601 timestamp format in UTC that indicates when the user updated the Data Protection Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
     * 
     */
    @Export(name="updatedDate", refs={String.class}, tree="[0]")
    private Output<String> updatedDate;

    /**
     * @return ISO 8601 timestamp format in UTC that indicates when the user updated the Data Protection Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
     * 
     */
    public Output<String> updatedDate() {
        return this.updatedDate;
    }
    /**
     * Email address that identifies the user who updated the Backup Compliance Policy settings. MongoDB Cloud ignores this email setting when you enable or update the Backup Compliance Policy settings.
     * 
     */
    @Export(name="updatedUser", refs={String.class}, tree="[0]")
    private Output<String> updatedUser;

    /**
     * @return Email address that identifies the user who updated the Backup Compliance Policy settings. MongoDB Cloud ignores this email setting when you enable or update the Backup Compliance Policy settings.
     * 
     */
    public Output<String> updatedUser() {
        return this.updatedUser;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BackupCompliancePolicy(String name) {
        this(name, BackupCompliancePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BackupCompliancePolicy(String name, BackupCompliancePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackupCompliancePolicy(String name, BackupCompliancePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/backupCompliancePolicy:BackupCompliancePolicy", name, args == null ? BackupCompliancePolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BackupCompliancePolicy(String name, Output<String> id, @Nullable BackupCompliancePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/backupCompliancePolicy:BackupCompliancePolicy", name, state, makeResourceOptions(options, id));
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
    public static BackupCompliancePolicy get(String name, Output<String> id, @Nullable BackupCompliancePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BackupCompliancePolicy(name, id, state, options);
    }
}
