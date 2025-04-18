// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.BackupCompliancePolicyOnDemandPolicyItemArgs;
import com.pulumi.mongodbatlas.inputs.BackupCompliancePolicyPolicyItemDailyArgs;
import com.pulumi.mongodbatlas.inputs.BackupCompliancePolicyPolicyItemHourlyArgs;
import com.pulumi.mongodbatlas.inputs.BackupCompliancePolicyPolicyItemMonthlyArgs;
import com.pulumi.mongodbatlas.inputs.BackupCompliancePolicyPolicyItemWeeklyArgs;
import com.pulumi.mongodbatlas.inputs.BackupCompliancePolicyPolicyItemYearlyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupCompliancePolicyState extends com.pulumi.resources.ResourceArgs {

    public static final BackupCompliancePolicyState Empty = new BackupCompliancePolicyState();

    /**
     * Email address of a security or legal representative for the Backup Compliance Policy who is authorized to update the Backup Compliance Policy settings.
     * 
     */
    @Import(name="authorizedEmail")
    private @Nullable Output<String> authorizedEmail;

    /**
     * @return Email address of a security or legal representative for the Backup Compliance Policy who is authorized to update the Backup Compliance Policy settings.
     * 
     */
    public Optional<Output<String>> authorizedEmail() {
        return Optional.ofNullable(this.authorizedEmail);
    }

    /**
     * First name of the user who authorized to update the Backup Compliance Policy settings.
     * 
     */
    @Import(name="authorizedUserFirstName")
    private @Nullable Output<String> authorizedUserFirstName;

    /**
     * @return First name of the user who authorized to update the Backup Compliance Policy settings.
     * 
     */
    public Optional<Output<String>> authorizedUserFirstName() {
        return Optional.ofNullable(this.authorizedUserFirstName);
    }

    /**
     * Last name of the user who authorized to update the Backup Compliance Policy settings.
     * 
     */
    @Import(name="authorizedUserLastName")
    private @Nullable Output<String> authorizedUserLastName;

    /**
     * @return Last name of the user who authorized to update the Backup Compliance Policy settings.
     * 
     */
    public Optional<Output<String>> authorizedUserLastName() {
        return Optional.ofNullable(this.authorizedUserLastName);
    }

    /**
     * Flag that indicates whether to enable additional backup copies for the cluster. If unspecified, this value defaults to false.
     * 
     */
    @Import(name="copyProtectionEnabled")
    private @Nullable Output<Boolean> copyProtectionEnabled;

    /**
     * @return Flag that indicates whether to enable additional backup copies for the cluster. If unspecified, this value defaults to false.
     * 
     */
    public Optional<Output<Boolean>> copyProtectionEnabled() {
        return Optional.ofNullable(this.copyProtectionEnabled);
    }

    /**
     * Flag that indicates whether Encryption at Rest using Customer Key Management is required for all clusters with a Backup Compliance Policy. If unspecified, this value defaults to false.
     * 
     */
    @Import(name="encryptionAtRestEnabled")
    private @Nullable Output<Boolean> encryptionAtRestEnabled;

    /**
     * @return Flag that indicates whether Encryption at Rest using Customer Key Management is required for all clusters with a Backup Compliance Policy. If unspecified, this value defaults to false.
     * 
     */
    public Optional<Output<Boolean>> encryptionAtRestEnabled() {
        return Optional.ofNullable(this.encryptionAtRestEnabled);
    }

    /**
     * Specifications for on-demand policy.
     * 
     */
    @Import(name="onDemandPolicyItem")
    private @Nullable Output<BackupCompliancePolicyOnDemandPolicyItemArgs> onDemandPolicyItem;

    /**
     * @return Specifications for on-demand policy.
     * 
     */
    public Optional<Output<BackupCompliancePolicyOnDemandPolicyItemArgs>> onDemandPolicyItem() {
        return Optional.ofNullable(this.onDemandPolicyItem);
    }

    /**
     * Flag that indicates whether the cluster uses Continuous Cloud Backups with a Backup Compliance Policy. If unspecified, this value defaults to false.
     * 
     */
    @Import(name="pitEnabled")
    private @Nullable Output<Boolean> pitEnabled;

    /**
     * @return Flag that indicates whether the cluster uses Continuous Cloud Backups with a Backup Compliance Policy. If unspecified, this value defaults to false.
     * 
     */
    public Optional<Output<Boolean>> pitEnabled() {
        return Optional.ofNullable(this.pitEnabled);
    }

    /**
     * Scheduled policy using a daily frequency type, see block fields.
     * 
     */
    @Import(name="policyItemDaily")
    private @Nullable Output<BackupCompliancePolicyPolicyItemDailyArgs> policyItemDaily;

    /**
     * @return Scheduled policy using a daily frequency type, see block fields.
     * 
     */
    public Optional<Output<BackupCompliancePolicyPolicyItemDailyArgs>> policyItemDaily() {
        return Optional.ofNullable(this.policyItemDaily);
    }

    /**
     * Scheduled policy using an hourly frequency type, see block fields.
     * 
     */
    @Import(name="policyItemHourly")
    private @Nullable Output<BackupCompliancePolicyPolicyItemHourlyArgs> policyItemHourly;

    /**
     * @return Scheduled policy using an hourly frequency type, see block fields.
     * 
     */
    public Optional<Output<BackupCompliancePolicyPolicyItemHourlyArgs>> policyItemHourly() {
        return Optional.ofNullable(this.policyItemHourly);
    }

    /**
     * Scheduled policy using a monthly frequency type, see block fields.
     * 
     */
    @Import(name="policyItemMonthlies")
    private @Nullable Output<List<BackupCompliancePolicyPolicyItemMonthlyArgs>> policyItemMonthlies;

    /**
     * @return Scheduled policy using a monthly frequency type, see block fields.
     * 
     */
    public Optional<Output<List<BackupCompliancePolicyPolicyItemMonthlyArgs>>> policyItemMonthlies() {
        return Optional.ofNullable(this.policyItemMonthlies);
    }

    /**
     * Scheduled policy using a weekly frequency type, see block fields.
     * 
     */
    @Import(name="policyItemWeeklies")
    private @Nullable Output<List<BackupCompliancePolicyPolicyItemWeeklyArgs>> policyItemWeeklies;

    /**
     * @return Scheduled policy using a weekly frequency type, see block fields.
     * 
     */
    public Optional<Output<List<BackupCompliancePolicyPolicyItemWeeklyArgs>>> policyItemWeeklies() {
        return Optional.ofNullable(this.policyItemWeeklies);
    }

    /**
     * Scheduled policy using a yearly frequency type, see block fields.
     * 
     */
    @Import(name="policyItemYearlies")
    private @Nullable Output<List<BackupCompliancePolicyPolicyItemYearlyArgs>> policyItemYearlies;

    /**
     * @return Scheduled policy using a yearly frequency type, see block fields.
     * 
     */
    public Optional<Output<List<BackupCompliancePolicyPolicyItemYearlyArgs>>> policyItemYearlies() {
        return Optional.ofNullable(this.policyItemYearlies);
    }

    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Number of previous days that you can restore back to with Continuous Cloud Backup with a Backup Compliance Policy. You must specify a positive, non-zero integer, and the maximum retention window can&#39;t exceed the hourly retention time. This parameter applies only to Continuous Cloud Backups with a Backup Compliance Policy.
     * 
     */
    @Import(name="restoreWindowDays")
    private @Nullable Output<Integer> restoreWindowDays;

    /**
     * @return Number of previous days that you can restore back to with Continuous Cloud Backup with a Backup Compliance Policy. You must specify a positive, non-zero integer, and the maximum retention window can&#39;t exceed the hourly retention time. This parameter applies only to Continuous Cloud Backups with a Backup Compliance Policy.
     * 
     */
    public Optional<Output<Integer>> restoreWindowDays() {
        return Optional.ofNullable(this.restoreWindowDays);
    }

    /**
     * Label that indicates the state of the Backup Compliance Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Label that indicates the state of the Backup Compliance Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * ISO 8601 timestamp format in UTC that indicates when the user updated the Data Protection Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
     * 
     */
    @Import(name="updatedDate")
    private @Nullable Output<String> updatedDate;

    /**
     * @return ISO 8601 timestamp format in UTC that indicates when the user updated the Data Protection Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
     * 
     */
    public Optional<Output<String>> updatedDate() {
        return Optional.ofNullable(this.updatedDate);
    }

    /**
     * Email address that identifies the user who updated the Backup Compliance Policy settings. MongoDB Cloud ignores this email setting when you enable or update the Backup Compliance Policy settings.
     * 
     */
    @Import(name="updatedUser")
    private @Nullable Output<String> updatedUser;

    /**
     * @return Email address that identifies the user who updated the Backup Compliance Policy settings. MongoDB Cloud ignores this email setting when you enable or update the Backup Compliance Policy settings.
     * 
     */
    public Optional<Output<String>> updatedUser() {
        return Optional.ofNullable(this.updatedUser);
    }

    private BackupCompliancePolicyState() {}

    private BackupCompliancePolicyState(BackupCompliancePolicyState $) {
        this.authorizedEmail = $.authorizedEmail;
        this.authorizedUserFirstName = $.authorizedUserFirstName;
        this.authorizedUserLastName = $.authorizedUserLastName;
        this.copyProtectionEnabled = $.copyProtectionEnabled;
        this.encryptionAtRestEnabled = $.encryptionAtRestEnabled;
        this.onDemandPolicyItem = $.onDemandPolicyItem;
        this.pitEnabled = $.pitEnabled;
        this.policyItemDaily = $.policyItemDaily;
        this.policyItemHourly = $.policyItemHourly;
        this.policyItemMonthlies = $.policyItemMonthlies;
        this.policyItemWeeklies = $.policyItemWeeklies;
        this.policyItemYearlies = $.policyItemYearlies;
        this.projectId = $.projectId;
        this.restoreWindowDays = $.restoreWindowDays;
        this.state = $.state;
        this.updatedDate = $.updatedDate;
        this.updatedUser = $.updatedUser;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupCompliancePolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupCompliancePolicyState $;

        public Builder() {
            $ = new BackupCompliancePolicyState();
        }

        public Builder(BackupCompliancePolicyState defaults) {
            $ = new BackupCompliancePolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizedEmail Email address of a security or legal representative for the Backup Compliance Policy who is authorized to update the Backup Compliance Policy settings.
         * 
         * @return builder
         * 
         */
        public Builder authorizedEmail(@Nullable Output<String> authorizedEmail) {
            $.authorizedEmail = authorizedEmail;
            return this;
        }

        /**
         * @param authorizedEmail Email address of a security or legal representative for the Backup Compliance Policy who is authorized to update the Backup Compliance Policy settings.
         * 
         * @return builder
         * 
         */
        public Builder authorizedEmail(String authorizedEmail) {
            return authorizedEmail(Output.of(authorizedEmail));
        }

        /**
         * @param authorizedUserFirstName First name of the user who authorized to update the Backup Compliance Policy settings.
         * 
         * @return builder
         * 
         */
        public Builder authorizedUserFirstName(@Nullable Output<String> authorizedUserFirstName) {
            $.authorizedUserFirstName = authorizedUserFirstName;
            return this;
        }

        /**
         * @param authorizedUserFirstName First name of the user who authorized to update the Backup Compliance Policy settings.
         * 
         * @return builder
         * 
         */
        public Builder authorizedUserFirstName(String authorizedUserFirstName) {
            return authorizedUserFirstName(Output.of(authorizedUserFirstName));
        }

        /**
         * @param authorizedUserLastName Last name of the user who authorized to update the Backup Compliance Policy settings.
         * 
         * @return builder
         * 
         */
        public Builder authorizedUserLastName(@Nullable Output<String> authorizedUserLastName) {
            $.authorizedUserLastName = authorizedUserLastName;
            return this;
        }

        /**
         * @param authorizedUserLastName Last name of the user who authorized to update the Backup Compliance Policy settings.
         * 
         * @return builder
         * 
         */
        public Builder authorizedUserLastName(String authorizedUserLastName) {
            return authorizedUserLastName(Output.of(authorizedUserLastName));
        }

        /**
         * @param copyProtectionEnabled Flag that indicates whether to enable additional backup copies for the cluster. If unspecified, this value defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder copyProtectionEnabled(@Nullable Output<Boolean> copyProtectionEnabled) {
            $.copyProtectionEnabled = copyProtectionEnabled;
            return this;
        }

        /**
         * @param copyProtectionEnabled Flag that indicates whether to enable additional backup copies for the cluster. If unspecified, this value defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder copyProtectionEnabled(Boolean copyProtectionEnabled) {
            return copyProtectionEnabled(Output.of(copyProtectionEnabled));
        }

        /**
         * @param encryptionAtRestEnabled Flag that indicates whether Encryption at Rest using Customer Key Management is required for all clusters with a Backup Compliance Policy. If unspecified, this value defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder encryptionAtRestEnabled(@Nullable Output<Boolean> encryptionAtRestEnabled) {
            $.encryptionAtRestEnabled = encryptionAtRestEnabled;
            return this;
        }

        /**
         * @param encryptionAtRestEnabled Flag that indicates whether Encryption at Rest using Customer Key Management is required for all clusters with a Backup Compliance Policy. If unspecified, this value defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder encryptionAtRestEnabled(Boolean encryptionAtRestEnabled) {
            return encryptionAtRestEnabled(Output.of(encryptionAtRestEnabled));
        }

        /**
         * @param onDemandPolicyItem Specifications for on-demand policy.
         * 
         * @return builder
         * 
         */
        public Builder onDemandPolicyItem(@Nullable Output<BackupCompliancePolicyOnDemandPolicyItemArgs> onDemandPolicyItem) {
            $.onDemandPolicyItem = onDemandPolicyItem;
            return this;
        }

        /**
         * @param onDemandPolicyItem Specifications for on-demand policy.
         * 
         * @return builder
         * 
         */
        public Builder onDemandPolicyItem(BackupCompliancePolicyOnDemandPolicyItemArgs onDemandPolicyItem) {
            return onDemandPolicyItem(Output.of(onDemandPolicyItem));
        }

        /**
         * @param pitEnabled Flag that indicates whether the cluster uses Continuous Cloud Backups with a Backup Compliance Policy. If unspecified, this value defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder pitEnabled(@Nullable Output<Boolean> pitEnabled) {
            $.pitEnabled = pitEnabled;
            return this;
        }

        /**
         * @param pitEnabled Flag that indicates whether the cluster uses Continuous Cloud Backups with a Backup Compliance Policy. If unspecified, this value defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder pitEnabled(Boolean pitEnabled) {
            return pitEnabled(Output.of(pitEnabled));
        }

        /**
         * @param policyItemDaily Scheduled policy using a daily frequency type, see block fields.
         * 
         * @return builder
         * 
         */
        public Builder policyItemDaily(@Nullable Output<BackupCompliancePolicyPolicyItemDailyArgs> policyItemDaily) {
            $.policyItemDaily = policyItemDaily;
            return this;
        }

        /**
         * @param policyItemDaily Scheduled policy using a daily frequency type, see block fields.
         * 
         * @return builder
         * 
         */
        public Builder policyItemDaily(BackupCompliancePolicyPolicyItemDailyArgs policyItemDaily) {
            return policyItemDaily(Output.of(policyItemDaily));
        }

        /**
         * @param policyItemHourly Scheduled policy using an hourly frequency type, see block fields.
         * 
         * @return builder
         * 
         */
        public Builder policyItemHourly(@Nullable Output<BackupCompliancePolicyPolicyItemHourlyArgs> policyItemHourly) {
            $.policyItemHourly = policyItemHourly;
            return this;
        }

        /**
         * @param policyItemHourly Scheduled policy using an hourly frequency type, see block fields.
         * 
         * @return builder
         * 
         */
        public Builder policyItemHourly(BackupCompliancePolicyPolicyItemHourlyArgs policyItemHourly) {
            return policyItemHourly(Output.of(policyItemHourly));
        }

        /**
         * @param policyItemMonthlies Scheduled policy using a monthly frequency type, see block fields.
         * 
         * @return builder
         * 
         */
        public Builder policyItemMonthlies(@Nullable Output<List<BackupCompliancePolicyPolicyItemMonthlyArgs>> policyItemMonthlies) {
            $.policyItemMonthlies = policyItemMonthlies;
            return this;
        }

        /**
         * @param policyItemMonthlies Scheduled policy using a monthly frequency type, see block fields.
         * 
         * @return builder
         * 
         */
        public Builder policyItemMonthlies(List<BackupCompliancePolicyPolicyItemMonthlyArgs> policyItemMonthlies) {
            return policyItemMonthlies(Output.of(policyItemMonthlies));
        }

        /**
         * @param policyItemMonthlies Scheduled policy using a monthly frequency type, see block fields.
         * 
         * @return builder
         * 
         */
        public Builder policyItemMonthlies(BackupCompliancePolicyPolicyItemMonthlyArgs... policyItemMonthlies) {
            return policyItemMonthlies(List.of(policyItemMonthlies));
        }

        /**
         * @param policyItemWeeklies Scheduled policy using a weekly frequency type, see block fields.
         * 
         * @return builder
         * 
         */
        public Builder policyItemWeeklies(@Nullable Output<List<BackupCompliancePolicyPolicyItemWeeklyArgs>> policyItemWeeklies) {
            $.policyItemWeeklies = policyItemWeeklies;
            return this;
        }

        /**
         * @param policyItemWeeklies Scheduled policy using a weekly frequency type, see block fields.
         * 
         * @return builder
         * 
         */
        public Builder policyItemWeeklies(List<BackupCompliancePolicyPolicyItemWeeklyArgs> policyItemWeeklies) {
            return policyItemWeeklies(Output.of(policyItemWeeklies));
        }

        /**
         * @param policyItemWeeklies Scheduled policy using a weekly frequency type, see block fields.
         * 
         * @return builder
         * 
         */
        public Builder policyItemWeeklies(BackupCompliancePolicyPolicyItemWeeklyArgs... policyItemWeeklies) {
            return policyItemWeeklies(List.of(policyItemWeeklies));
        }

        /**
         * @param policyItemYearlies Scheduled policy using a yearly frequency type, see block fields.
         * 
         * @return builder
         * 
         */
        public Builder policyItemYearlies(@Nullable Output<List<BackupCompliancePolicyPolicyItemYearlyArgs>> policyItemYearlies) {
            $.policyItemYearlies = policyItemYearlies;
            return this;
        }

        /**
         * @param policyItemYearlies Scheduled policy using a yearly frequency type, see block fields.
         * 
         * @return builder
         * 
         */
        public Builder policyItemYearlies(List<BackupCompliancePolicyPolicyItemYearlyArgs> policyItemYearlies) {
            return policyItemYearlies(Output.of(policyItemYearlies));
        }

        /**
         * @param policyItemYearlies Scheduled policy using a yearly frequency type, see block fields.
         * 
         * @return builder
         * 
         */
        public Builder policyItemYearlies(BackupCompliancePolicyPolicyItemYearlyArgs... policyItemYearlies) {
            return policyItemYearlies(List.of(policyItemYearlies));
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param restoreWindowDays Number of previous days that you can restore back to with Continuous Cloud Backup with a Backup Compliance Policy. You must specify a positive, non-zero integer, and the maximum retention window can&#39;t exceed the hourly retention time. This parameter applies only to Continuous Cloud Backups with a Backup Compliance Policy.
         * 
         * @return builder
         * 
         */
        public Builder restoreWindowDays(@Nullable Output<Integer> restoreWindowDays) {
            $.restoreWindowDays = restoreWindowDays;
            return this;
        }

        /**
         * @param restoreWindowDays Number of previous days that you can restore back to with Continuous Cloud Backup with a Backup Compliance Policy. You must specify a positive, non-zero integer, and the maximum retention window can&#39;t exceed the hourly retention time. This parameter applies only to Continuous Cloud Backups with a Backup Compliance Policy.
         * 
         * @return builder
         * 
         */
        public Builder restoreWindowDays(Integer restoreWindowDays) {
            return restoreWindowDays(Output.of(restoreWindowDays));
        }

        /**
         * @param state Label that indicates the state of the Backup Compliance Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Label that indicates the state of the Backup Compliance Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param updatedDate ISO 8601 timestamp format in UTC that indicates when the user updated the Data Protection Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
         * 
         * @return builder
         * 
         */
        public Builder updatedDate(@Nullable Output<String> updatedDate) {
            $.updatedDate = updatedDate;
            return this;
        }

        /**
         * @param updatedDate ISO 8601 timestamp format in UTC that indicates when the user updated the Data Protection Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
         * 
         * @return builder
         * 
         */
        public Builder updatedDate(String updatedDate) {
            return updatedDate(Output.of(updatedDate));
        }

        /**
         * @param updatedUser Email address that identifies the user who updated the Backup Compliance Policy settings. MongoDB Cloud ignores this email setting when you enable or update the Backup Compliance Policy settings.
         * 
         * @return builder
         * 
         */
        public Builder updatedUser(@Nullable Output<String> updatedUser) {
            $.updatedUser = updatedUser;
            return this;
        }

        /**
         * @param updatedUser Email address that identifies the user who updated the Backup Compliance Policy settings. MongoDB Cloud ignores this email setting when you enable or update the Backup Compliance Policy settings.
         * 
         * @return builder
         * 
         */
        public Builder updatedUser(String updatedUser) {
            return updatedUser(Output.of(updatedUser));
        }

        public BackupCompliancePolicyState build() {
            return $;
        }
    }

}
