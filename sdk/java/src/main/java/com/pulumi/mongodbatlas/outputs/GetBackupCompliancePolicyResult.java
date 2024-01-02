// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetBackupCompliancePolicyOnDemandPolicyItem;
import com.pulumi.mongodbatlas.outputs.GetBackupCompliancePolicyPolicyItemDaily;
import com.pulumi.mongodbatlas.outputs.GetBackupCompliancePolicyPolicyItemHourly;
import com.pulumi.mongodbatlas.outputs.GetBackupCompliancePolicyPolicyItemMonthly;
import com.pulumi.mongodbatlas.outputs.GetBackupCompliancePolicyPolicyItemWeekly;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBackupCompliancePolicyResult {
    /**
     * @return Email address of the user who is authorized to update the Backup Compliance Policy settings.
     * 
     */
    private String authorizedEmail;
    /**
     * @return First name of the user who authorized to update the Backup Compliance Policy settings.
     * 
     */
    private String authorizedUserFirstName;
    /**
     * @return Last name of the user who authorized to update the Backup Compliance Policy settings.
     * 
     */
    private String authorizedUserLastName;
    /**
     * @return Flag that indicates whether to enable additional backup copies for the cluster. If unspecified, this value defaults to false.
     * 
     */
    private Boolean copyProtectionEnabled;
    /**
     * @return Flag that indicates whether Encryption at Rest using Customer Key Management is required for all clusters with a Backup Compliance Policy. If unspecified, this value defaults to false.
     * 
     */
    private Boolean encryptionAtRestEnabled;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable GetBackupCompliancePolicyOnDemandPolicyItem onDemandPolicyItem;
    /**
     * @return Flag that indicates whether the cluster uses Continuous Cloud Backups with a Backup Compliance Policy. If unspecified, this value defaults to false.
     * 
     */
    private Boolean pitEnabled;
    private @Nullable GetBackupCompliancePolicyPolicyItemDaily policyItemDaily;
    private @Nullable GetBackupCompliancePolicyPolicyItemHourly policyItemHourly;
    private @Nullable List<GetBackupCompliancePolicyPolicyItemMonthly> policyItemMonthlies;
    private @Nullable List<GetBackupCompliancePolicyPolicyItemWeekly> policyItemWeeklies;
    private String projectId;
    /**
     * @return Number of previous days that you can restore back to with Continuous Cloud Backup with a Backup Compliance Policy. You must specify a positive, non-zero integer, and the maximum retention window can&#39;t exceed the hourly retention time. This parameter applies only to Continuous Cloud Backups with a Backup Compliance Policy.
     * 
     */
    private Integer restoreWindowDays;
    /**
     * @return Label that indicates the state of the Backup Compliance Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
     * 
     */
    private String state;
    /**
     * @return ISO 8601 timestamp format in UTC that indicates when the user updated the Data Protection Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
     * 
     */
    private String updatedDate;
    /**
     * @return Email address that identifies the user who updated the Backup Compliance Policy settings. MongoDB Cloud ignores this email setting when you enable or update the Backup Compliance Policy settings.
     * 
     */
    private String updatedUser;

    private GetBackupCompliancePolicyResult() {}
    /**
     * @return Email address of the user who is authorized to update the Backup Compliance Policy settings.
     * 
     */
    public String authorizedEmail() {
        return this.authorizedEmail;
    }
    /**
     * @return First name of the user who authorized to update the Backup Compliance Policy settings.
     * 
     */
    public String authorizedUserFirstName() {
        return this.authorizedUserFirstName;
    }
    /**
     * @return Last name of the user who authorized to update the Backup Compliance Policy settings.
     * 
     */
    public String authorizedUserLastName() {
        return this.authorizedUserLastName;
    }
    /**
     * @return Flag that indicates whether to enable additional backup copies for the cluster. If unspecified, this value defaults to false.
     * 
     */
    public Boolean copyProtectionEnabled() {
        return this.copyProtectionEnabled;
    }
    /**
     * @return Flag that indicates whether Encryption at Rest using Customer Key Management is required for all clusters with a Backup Compliance Policy. If unspecified, this value defaults to false.
     * 
     */
    public Boolean encryptionAtRestEnabled() {
        return this.encryptionAtRestEnabled;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<GetBackupCompliancePolicyOnDemandPolicyItem> onDemandPolicyItem() {
        return Optional.ofNullable(this.onDemandPolicyItem);
    }
    /**
     * @return Flag that indicates whether the cluster uses Continuous Cloud Backups with a Backup Compliance Policy. If unspecified, this value defaults to false.
     * 
     */
    public Boolean pitEnabled() {
        return this.pitEnabled;
    }
    public Optional<GetBackupCompliancePolicyPolicyItemDaily> policyItemDaily() {
        return Optional.ofNullable(this.policyItemDaily);
    }
    public Optional<GetBackupCompliancePolicyPolicyItemHourly> policyItemHourly() {
        return Optional.ofNullable(this.policyItemHourly);
    }
    public List<GetBackupCompliancePolicyPolicyItemMonthly> policyItemMonthlies() {
        return this.policyItemMonthlies == null ? List.of() : this.policyItemMonthlies;
    }
    public List<GetBackupCompliancePolicyPolicyItemWeekly> policyItemWeeklies() {
        return this.policyItemWeeklies == null ? List.of() : this.policyItemWeeklies;
    }
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Number of previous days that you can restore back to with Continuous Cloud Backup with a Backup Compliance Policy. You must specify a positive, non-zero integer, and the maximum retention window can&#39;t exceed the hourly retention time. This parameter applies only to Continuous Cloud Backups with a Backup Compliance Policy.
     * 
     */
    public Integer restoreWindowDays() {
        return this.restoreWindowDays;
    }
    /**
     * @return Label that indicates the state of the Backup Compliance Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return ISO 8601 timestamp format in UTC that indicates when the user updated the Data Protection Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
     * 
     */
    public String updatedDate() {
        return this.updatedDate;
    }
    /**
     * @return Email address that identifies the user who updated the Backup Compliance Policy settings. MongoDB Cloud ignores this email setting when you enable or update the Backup Compliance Policy settings.
     * 
     */
    public String updatedUser() {
        return this.updatedUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupCompliancePolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authorizedEmail;
        private String authorizedUserFirstName;
        private String authorizedUserLastName;
        private Boolean copyProtectionEnabled;
        private Boolean encryptionAtRestEnabled;
        private String id;
        private @Nullable GetBackupCompliancePolicyOnDemandPolicyItem onDemandPolicyItem;
        private Boolean pitEnabled;
        private @Nullable GetBackupCompliancePolicyPolicyItemDaily policyItemDaily;
        private @Nullable GetBackupCompliancePolicyPolicyItemHourly policyItemHourly;
        private @Nullable List<GetBackupCompliancePolicyPolicyItemMonthly> policyItemMonthlies;
        private @Nullable List<GetBackupCompliancePolicyPolicyItemWeekly> policyItemWeeklies;
        private String projectId;
        private Integer restoreWindowDays;
        private String state;
        private String updatedDate;
        private String updatedUser;
        public Builder() {}
        public Builder(GetBackupCompliancePolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedEmail = defaults.authorizedEmail;
    	      this.authorizedUserFirstName = defaults.authorizedUserFirstName;
    	      this.authorizedUserLastName = defaults.authorizedUserLastName;
    	      this.copyProtectionEnabled = defaults.copyProtectionEnabled;
    	      this.encryptionAtRestEnabled = defaults.encryptionAtRestEnabled;
    	      this.id = defaults.id;
    	      this.onDemandPolicyItem = defaults.onDemandPolicyItem;
    	      this.pitEnabled = defaults.pitEnabled;
    	      this.policyItemDaily = defaults.policyItemDaily;
    	      this.policyItemHourly = defaults.policyItemHourly;
    	      this.policyItemMonthlies = defaults.policyItemMonthlies;
    	      this.policyItemWeeklies = defaults.policyItemWeeklies;
    	      this.projectId = defaults.projectId;
    	      this.restoreWindowDays = defaults.restoreWindowDays;
    	      this.state = defaults.state;
    	      this.updatedDate = defaults.updatedDate;
    	      this.updatedUser = defaults.updatedUser;
        }

        @CustomType.Setter
        public Builder authorizedEmail(String authorizedEmail) {
            if (authorizedEmail == null) {
              throw new MissingRequiredPropertyException("GetBackupCompliancePolicyResult", "authorizedEmail");
            }
            this.authorizedEmail = authorizedEmail;
            return this;
        }
        @CustomType.Setter
        public Builder authorizedUserFirstName(String authorizedUserFirstName) {
            if (authorizedUserFirstName == null) {
              throw new MissingRequiredPropertyException("GetBackupCompliancePolicyResult", "authorizedUserFirstName");
            }
            this.authorizedUserFirstName = authorizedUserFirstName;
            return this;
        }
        @CustomType.Setter
        public Builder authorizedUserLastName(String authorizedUserLastName) {
            if (authorizedUserLastName == null) {
              throw new MissingRequiredPropertyException("GetBackupCompliancePolicyResult", "authorizedUserLastName");
            }
            this.authorizedUserLastName = authorizedUserLastName;
            return this;
        }
        @CustomType.Setter
        public Builder copyProtectionEnabled(Boolean copyProtectionEnabled) {
            if (copyProtectionEnabled == null) {
              throw new MissingRequiredPropertyException("GetBackupCompliancePolicyResult", "copyProtectionEnabled");
            }
            this.copyProtectionEnabled = copyProtectionEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder encryptionAtRestEnabled(Boolean encryptionAtRestEnabled) {
            if (encryptionAtRestEnabled == null) {
              throw new MissingRequiredPropertyException("GetBackupCompliancePolicyResult", "encryptionAtRestEnabled");
            }
            this.encryptionAtRestEnabled = encryptionAtRestEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBackupCompliancePolicyResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder onDemandPolicyItem(@Nullable GetBackupCompliancePolicyOnDemandPolicyItem onDemandPolicyItem) {

            this.onDemandPolicyItem = onDemandPolicyItem;
            return this;
        }
        @CustomType.Setter
        public Builder pitEnabled(Boolean pitEnabled) {
            if (pitEnabled == null) {
              throw new MissingRequiredPropertyException("GetBackupCompliancePolicyResult", "pitEnabled");
            }
            this.pitEnabled = pitEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder policyItemDaily(@Nullable GetBackupCompliancePolicyPolicyItemDaily policyItemDaily) {

            this.policyItemDaily = policyItemDaily;
            return this;
        }
        @CustomType.Setter
        public Builder policyItemHourly(@Nullable GetBackupCompliancePolicyPolicyItemHourly policyItemHourly) {

            this.policyItemHourly = policyItemHourly;
            return this;
        }
        @CustomType.Setter
        public Builder policyItemMonthlies(@Nullable List<GetBackupCompliancePolicyPolicyItemMonthly> policyItemMonthlies) {

            this.policyItemMonthlies = policyItemMonthlies;
            return this;
        }
        public Builder policyItemMonthlies(GetBackupCompliancePolicyPolicyItemMonthly... policyItemMonthlies) {
            return policyItemMonthlies(List.of(policyItemMonthlies));
        }
        @CustomType.Setter
        public Builder policyItemWeeklies(@Nullable List<GetBackupCompliancePolicyPolicyItemWeekly> policyItemWeeklies) {

            this.policyItemWeeklies = policyItemWeeklies;
            return this;
        }
        public Builder policyItemWeeklies(GetBackupCompliancePolicyPolicyItemWeekly... policyItemWeeklies) {
            return policyItemWeeklies(List.of(policyItemWeeklies));
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetBackupCompliancePolicyResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder restoreWindowDays(Integer restoreWindowDays) {
            if (restoreWindowDays == null) {
              throw new MissingRequiredPropertyException("GetBackupCompliancePolicyResult", "restoreWindowDays");
            }
            this.restoreWindowDays = restoreWindowDays;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetBackupCompliancePolicyResult", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder updatedDate(String updatedDate) {
            if (updatedDate == null) {
              throw new MissingRequiredPropertyException("GetBackupCompliancePolicyResult", "updatedDate");
            }
            this.updatedDate = updatedDate;
            return this;
        }
        @CustomType.Setter
        public Builder updatedUser(String updatedUser) {
            if (updatedUser == null) {
              throw new MissingRequiredPropertyException("GetBackupCompliancePolicyResult", "updatedUser");
            }
            this.updatedUser = updatedUser;
            return this;
        }
        public GetBackupCompliancePolicyResult build() {
            final var _resultValue = new GetBackupCompliancePolicyResult();
            _resultValue.authorizedEmail = authorizedEmail;
            _resultValue.authorizedUserFirstName = authorizedUserFirstName;
            _resultValue.authorizedUserLastName = authorizedUserLastName;
            _resultValue.copyProtectionEnabled = copyProtectionEnabled;
            _resultValue.encryptionAtRestEnabled = encryptionAtRestEnabled;
            _resultValue.id = id;
            _resultValue.onDemandPolicyItem = onDemandPolicyItem;
            _resultValue.pitEnabled = pitEnabled;
            _resultValue.policyItemDaily = policyItemDaily;
            _resultValue.policyItemHourly = policyItemHourly;
            _resultValue.policyItemMonthlies = policyItemMonthlies;
            _resultValue.policyItemWeeklies = policyItemWeeklies;
            _resultValue.projectId = projectId;
            _resultValue.restoreWindowDays = restoreWindowDays;
            _resultValue.state = state;
            _resultValue.updatedDate = updatedDate;
            _resultValue.updatedUser = updatedUser;
            return _resultValue;
        }
    }
}
