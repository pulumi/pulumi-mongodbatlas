// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCloudBackupSchedulePolicyItemMonthly {
    /**
     * @return Desired frequency of the new backup policy item specified by `frequency_type` (monthly in this case). The supported values for weekly policies are
     * 
     */
    private Integer frequencyInterval;
    /**
     * @return Frequency associated with the backup policy item. For monthly policies, the frequency type is defined as `monthly`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
     * 
     */
    private String frequencyType;
    /**
     * @return Unique identifier of the backup policy item.
     * 
     */
    private String id;
    /**
     * @return Scope of the backup policy item: `days`, `weeks`, or `months`.
     * 
     */
    private String retentionUnit;
    /**
     * @return Value to associate with `retention_unit`. Monthly policy must have retention days of at least 31 days or 5 weeks or 1 month. Note that for less frequent policy items, Atlas requires that you specify a retention period greater than or equal to the retention period specified for more frequent policy items. For example: If the weekly policy item specifies a retention of two weeks, the montly retention policy must specify two weeks or greater.
     * 
     */
    private Integer retentionValue;

    private GetCloudBackupSchedulePolicyItemMonthly() {}
    /**
     * @return Desired frequency of the new backup policy item specified by `frequency_type` (monthly in this case). The supported values for weekly policies are
     * 
     */
    public Integer frequencyInterval() {
        return this.frequencyInterval;
    }
    /**
     * @return Frequency associated with the backup policy item. For monthly policies, the frequency type is defined as `monthly`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
     * 
     */
    public String frequencyType() {
        return this.frequencyType;
    }
    /**
     * @return Unique identifier of the backup policy item.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Scope of the backup policy item: `days`, `weeks`, or `months`.
     * 
     */
    public String retentionUnit() {
        return this.retentionUnit;
    }
    /**
     * @return Value to associate with `retention_unit`. Monthly policy must have retention days of at least 31 days or 5 weeks or 1 month. Note that for less frequent policy items, Atlas requires that you specify a retention period greater than or equal to the retention period specified for more frequent policy items. For example: If the weekly policy item specifies a retention of two weeks, the montly retention policy must specify two weeks or greater.
     * 
     */
    public Integer retentionValue() {
        return this.retentionValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudBackupSchedulePolicyItemMonthly defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer frequencyInterval;
        private String frequencyType;
        private String id;
        private String retentionUnit;
        private Integer retentionValue;
        public Builder() {}
        public Builder(GetCloudBackupSchedulePolicyItemMonthly defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequencyInterval = defaults.frequencyInterval;
    	      this.frequencyType = defaults.frequencyType;
    	      this.id = defaults.id;
    	      this.retentionUnit = defaults.retentionUnit;
    	      this.retentionValue = defaults.retentionValue;
        }

        @CustomType.Setter
        public Builder frequencyInterval(Integer frequencyInterval) {
            if (frequencyInterval == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSchedulePolicyItemMonthly", "frequencyInterval");
            }
            this.frequencyInterval = frequencyInterval;
            return this;
        }
        @CustomType.Setter
        public Builder frequencyType(String frequencyType) {
            if (frequencyType == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSchedulePolicyItemMonthly", "frequencyType");
            }
            this.frequencyType = frequencyType;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSchedulePolicyItemMonthly", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder retentionUnit(String retentionUnit) {
            if (retentionUnit == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSchedulePolicyItemMonthly", "retentionUnit");
            }
            this.retentionUnit = retentionUnit;
            return this;
        }
        @CustomType.Setter
        public Builder retentionValue(Integer retentionValue) {
            if (retentionValue == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSchedulePolicyItemMonthly", "retentionValue");
            }
            this.retentionValue = retentionValue;
            return this;
        }
        public GetCloudBackupSchedulePolicyItemMonthly build() {
            final var _resultValue = new GetCloudBackupSchedulePolicyItemMonthly();
            _resultValue.frequencyInterval = frequencyInterval;
            _resultValue.frequencyType = frequencyType;
            _resultValue.id = id;
            _resultValue.retentionUnit = retentionUnit;
            _resultValue.retentionValue = retentionValue;
            return _resultValue;
        }
    }
}
