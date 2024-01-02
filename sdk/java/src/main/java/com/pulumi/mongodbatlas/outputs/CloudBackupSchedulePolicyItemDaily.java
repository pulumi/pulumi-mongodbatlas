// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloudBackupSchedulePolicyItemDaily {
    /**
     * @return Desired frequency of the new backup policy item specified by `frequency_type` (daily in this case). The only supported value for daily policies is `1` day.
     * 
     */
    private Integer frequencyInterval;
    /**
     * @return Frequency associated with the backup policy item. For daily policies, the frequency type is defined as `daily`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
     * 
     */
    private @Nullable String frequencyType;
    /**
     * @return Unique identifier of the backup policy item.
     * 
     */
    private @Nullable String id;
    /**
     * @return Scope of the backup policy item: `days`, `weeks`, or `months`.
     * 
     */
    private String retentionUnit;
    /**
     * @return Value to associate with `retention_unit`.  Note that for less frequent policy items, Atlas requires that you specify a retention period greater than or equal to the retention period specified for more frequent policy items. For example: If the hourly policy item specifies a retention of two days, the daily retention policy must specify two days or greater.
     * 
     */
    private Integer retentionValue;

    private CloudBackupSchedulePolicyItemDaily() {}
    /**
     * @return Desired frequency of the new backup policy item specified by `frequency_type` (daily in this case). The only supported value for daily policies is `1` day.
     * 
     */
    public Integer frequencyInterval() {
        return this.frequencyInterval;
    }
    /**
     * @return Frequency associated with the backup policy item. For daily policies, the frequency type is defined as `daily`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
     * 
     */
    public Optional<String> frequencyType() {
        return Optional.ofNullable(this.frequencyType);
    }
    /**
     * @return Unique identifier of the backup policy item.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Scope of the backup policy item: `days`, `weeks`, or `months`.
     * 
     */
    public String retentionUnit() {
        return this.retentionUnit;
    }
    /**
     * @return Value to associate with `retention_unit`.  Note that for less frequent policy items, Atlas requires that you specify a retention period greater than or equal to the retention period specified for more frequent policy items. For example: If the hourly policy item specifies a retention of two days, the daily retention policy must specify two days or greater.
     * 
     */
    public Integer retentionValue() {
        return this.retentionValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudBackupSchedulePolicyItemDaily defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer frequencyInterval;
        private @Nullable String frequencyType;
        private @Nullable String id;
        private String retentionUnit;
        private Integer retentionValue;
        public Builder() {}
        public Builder(CloudBackupSchedulePolicyItemDaily defaults) {
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
              throw new MissingRequiredPropertyException("CloudBackupSchedulePolicyItemDaily", "frequencyInterval");
            }
            this.frequencyInterval = frequencyInterval;
            return this;
        }
        @CustomType.Setter
        public Builder frequencyType(@Nullable String frequencyType) {

            this.frequencyType = frequencyType;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder retentionUnit(String retentionUnit) {
            if (retentionUnit == null) {
              throw new MissingRequiredPropertyException("CloudBackupSchedulePolicyItemDaily", "retentionUnit");
            }
            this.retentionUnit = retentionUnit;
            return this;
        }
        @CustomType.Setter
        public Builder retentionValue(Integer retentionValue) {
            if (retentionValue == null) {
              throw new MissingRequiredPropertyException("CloudBackupSchedulePolicyItemDaily", "retentionValue");
            }
            this.retentionValue = retentionValue;
            return this;
        }
        public CloudBackupSchedulePolicyItemDaily build() {
            final var _resultValue = new CloudBackupSchedulePolicyItemDaily();
            _resultValue.frequencyInterval = frequencyInterval;
            _resultValue.frequencyType = frequencyType;
            _resultValue.id = id;
            _resultValue.retentionUnit = retentionUnit;
            _resultValue.retentionValue = retentionValue;
            return _resultValue;
        }
    }
}
