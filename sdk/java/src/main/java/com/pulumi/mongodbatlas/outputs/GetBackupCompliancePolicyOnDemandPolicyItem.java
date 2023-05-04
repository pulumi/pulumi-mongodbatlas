// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBackupCompliancePolicyOnDemandPolicyItem {
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

    private GetBackupCompliancePolicyOnDemandPolicyItem() {}
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

    public static Builder builder(GetBackupCompliancePolicyOnDemandPolicyItem defaults) {
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
        public Builder(GetBackupCompliancePolicyOnDemandPolicyItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequencyInterval = defaults.frequencyInterval;
    	      this.frequencyType = defaults.frequencyType;
    	      this.id = defaults.id;
    	      this.retentionUnit = defaults.retentionUnit;
    	      this.retentionValue = defaults.retentionValue;
        }

        @CustomType.Setter
        public Builder frequencyInterval(Integer frequencyInterval) {
            this.frequencyInterval = Objects.requireNonNull(frequencyInterval);
            return this;
        }
        @CustomType.Setter
        public Builder frequencyType(String frequencyType) {
            this.frequencyType = Objects.requireNonNull(frequencyType);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder retentionUnit(String retentionUnit) {
            this.retentionUnit = Objects.requireNonNull(retentionUnit);
            return this;
        }
        @CustomType.Setter
        public Builder retentionValue(Integer retentionValue) {
            this.retentionValue = Objects.requireNonNull(retentionValue);
            return this;
        }
        public GetBackupCompliancePolicyOnDemandPolicyItem build() {
            final var o = new GetBackupCompliancePolicyOnDemandPolicyItem();
            o.frequencyInterval = frequencyInterval;
            o.frequencyType = frequencyType;
            o.id = id;
            o.retentionUnit = retentionUnit;
            o.retentionValue = retentionValue;
            return o;
        }
    }
}
