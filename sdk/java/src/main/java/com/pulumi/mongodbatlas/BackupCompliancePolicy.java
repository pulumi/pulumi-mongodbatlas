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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Backup Compliance Policy entries can be imported using project project_id
 * 
 * in the format `project_id`, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/backupCompliancePolicy:BackupCompliancePolicy backup_policy 5d0f1f73cf09a29120e173cf
 * ```
 * 
 *  For more information see[MongoDB Atlas API Reference](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Cloud-Backups/operation/updateDataProtectionSettings) and [Backup Compliance Policy Prohibited Actions](https://www.mongodb.com/docs/atlas/backup/cloud-backup/backup-compliance-policy/#prohibited-actions).
 * 
 */
@ResourceType(type="mongodbatlas:index/backupCompliancePolicy:BackupCompliancePolicy")
public class BackupCompliancePolicy extends com.pulumi.resources.CustomResource {
    /**
     * Email address of a security or legal representative for the Backup Compliance Policy who is authorized to update the Backup Compliance Policy settings.
     * 
     */
    @Export(name="authorizedEmail", type=String.class, parameters={})
    private Output<String> authorizedEmail;

    /**
     * @return Email address of a security or legal representative for the Backup Compliance Policy who is authorized to update the Backup Compliance Policy settings.
     * 
     */
    public Output<String> authorizedEmail() {
        return this.authorizedEmail;
    }
    /**
     * Flag that indicates whether to enable additional backup copies for the cluster. If unspecified, this value defaults to false.
     * 
     */
    @Export(name="copyProtectionEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> copyProtectionEnabled;

    /**
     * @return Flag that indicates whether to enable additional backup copies for the cluster. If unspecified, this value defaults to false.
     * 
     */
    public Output<Boolean> copyProtectionEnabled() {
        return this.copyProtectionEnabled;
    }
    /**
     * Flag that indicates whether Encryption at Rest using Customer Key Management is required for all clusters with a Backup Compliance Policy. If unspecified, this value defaults to false.
     * 
     */
    @Export(name="encryptionAtRestEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> encryptionAtRestEnabled;

    /**
     * @return Flag that indicates whether Encryption at Rest using Customer Key Management is required for all clusters with a Backup Compliance Policy. If unspecified, this value defaults to false.
     * 
     */
    public Output<Boolean> encryptionAtRestEnabled() {
        return this.encryptionAtRestEnabled;
    }
    @Export(name="onDemandPolicyItem", type=BackupCompliancePolicyOnDemandPolicyItem.class, parameters={})
    private Output<BackupCompliancePolicyOnDemandPolicyItem> onDemandPolicyItem;

    public Output<BackupCompliancePolicyOnDemandPolicyItem> onDemandPolicyItem() {
        return this.onDemandPolicyItem;
    }
    /**
     * Flag that indicates whether the cluster uses Continuous Cloud Backups with a Backup Compliance Policy. If unspecified, this value defaults to false.
     * 
     */
    @Export(name="pitEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> pitEnabled;

    /**
     * @return Flag that indicates whether the cluster uses Continuous Cloud Backups with a Backup Compliance Policy. If unspecified, this value defaults to false.
     * 
     */
    public Output<Boolean> pitEnabled() {
        return this.pitEnabled;
    }
    @Export(name="policyItemDaily", type=BackupCompliancePolicyPolicyItemDaily.class, parameters={})
    private Output</* @Nullable */ BackupCompliancePolicyPolicyItemDaily> policyItemDaily;

    public Output<Optional<BackupCompliancePolicyPolicyItemDaily>> policyItemDaily() {
        return Codegen.optional(this.policyItemDaily);
    }
    @Export(name="policyItemHourly", type=BackupCompliancePolicyPolicyItemHourly.class, parameters={})
    private Output</* @Nullable */ BackupCompliancePolicyPolicyItemHourly> policyItemHourly;

    public Output<Optional<BackupCompliancePolicyPolicyItemHourly>> policyItemHourly() {
        return Codegen.optional(this.policyItemHourly);
    }
    @Export(name="policyItemMonthlies", type=List.class, parameters={BackupCompliancePolicyPolicyItemMonthly.class})
    private Output</* @Nullable */ List<BackupCompliancePolicyPolicyItemMonthly>> policyItemMonthlies;

    public Output<Optional<List<BackupCompliancePolicyPolicyItemMonthly>>> policyItemMonthlies() {
        return Codegen.optional(this.policyItemMonthlies);
    }
    @Export(name="policyItemWeeklies", type=List.class, parameters={BackupCompliancePolicyPolicyItemWeekly.class})
    private Output</* @Nullable */ List<BackupCompliancePolicyPolicyItemWeekly>> policyItemWeeklies;

    public Output<Optional<List<BackupCompliancePolicyPolicyItemWeekly>>> policyItemWeeklies() {
        return Codegen.optional(this.policyItemWeeklies);
    }
    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    @Export(name="projectId", type=String.class, parameters={})
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
    @Export(name="restoreWindowDays", type=Integer.class, parameters={})
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
    @Export(name="state", type=String.class, parameters={})
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
    @Export(name="updatedDate", type=String.class, parameters={})
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
    @Export(name="updatedUser", type=String.class, parameters={})
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
