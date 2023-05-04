// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetBackupCompliancePolicyPolicyItemHourly extends com.pulumi.resources.InvokeArgs {

    public static final GetBackupCompliancePolicyPolicyItemHourly Empty = new GetBackupCompliancePolicyPolicyItemHourly();

    /**
     * Desired frequency of the new backup policy item specified by `frequency_type` (monthly in this case). The supported values for weekly policies are
     * 
     */
    @Import(name="frequencyInterval", required=true)
    private Integer frequencyInterval;

    /**
     * @return Desired frequency of the new backup policy item specified by `frequency_type` (monthly in this case). The supported values for weekly policies are
     * 
     */
    public Integer frequencyInterval() {
        return this.frequencyInterval;
    }

    /**
     * Frequency associated with the backup policy item. For monthly policies, the frequency type is defined as `monthly`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
     * 
     */
    @Import(name="frequencyType", required=true)
    private String frequencyType;

    /**
     * @return Frequency associated with the backup policy item. For monthly policies, the frequency type is defined as `monthly`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
     * 
     */
    public String frequencyType() {
        return this.frequencyType;
    }

    /**
     * Unique identifier of the backup policy item.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Unique identifier of the backup policy item.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * Scope of the backup policy item: `days`, `weeks`, or `months`.
     * 
     */
    @Import(name="retentionUnit", required=true)
    private String retentionUnit;

    /**
     * @return Scope of the backup policy item: `days`, `weeks`, or `months`.
     * 
     */
    public String retentionUnit() {
        return this.retentionUnit;
    }

    /**
     * Value to associate with `retention_unit`. Monthly policy must have retention days of at least 31 days or 5 weeks or 1 month. Note that for less frequent policy items, Atlas requires that you specify a retention period greater than or equal to the retention period specified for more frequent policy items. For example: If the weekly policy item specifies a retention of two weeks, the montly retention policy must specify two weeks or greater.
     * 
     */
    @Import(name="retentionValue", required=true)
    private Integer retentionValue;

    /**
     * @return Value to associate with `retention_unit`. Monthly policy must have retention days of at least 31 days or 5 weeks or 1 month. Note that for less frequent policy items, Atlas requires that you specify a retention period greater than or equal to the retention period specified for more frequent policy items. For example: If the weekly policy item specifies a retention of two weeks, the montly retention policy must specify two weeks or greater.
     * 
     */
    public Integer retentionValue() {
        return this.retentionValue;
    }

    private GetBackupCompliancePolicyPolicyItemHourly() {}

    private GetBackupCompliancePolicyPolicyItemHourly(GetBackupCompliancePolicyPolicyItemHourly $) {
        this.frequencyInterval = $.frequencyInterval;
        this.frequencyType = $.frequencyType;
        this.id = $.id;
        this.retentionUnit = $.retentionUnit;
        this.retentionValue = $.retentionValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackupCompliancePolicyPolicyItemHourly defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackupCompliancePolicyPolicyItemHourly $;

        public Builder() {
            $ = new GetBackupCompliancePolicyPolicyItemHourly();
        }

        public Builder(GetBackupCompliancePolicyPolicyItemHourly defaults) {
            $ = new GetBackupCompliancePolicyPolicyItemHourly(Objects.requireNonNull(defaults));
        }

        /**
         * @param frequencyInterval Desired frequency of the new backup policy item specified by `frequency_type` (monthly in this case). The supported values for weekly policies are
         * 
         * @return builder
         * 
         */
        public Builder frequencyInterval(Integer frequencyInterval) {
            $.frequencyInterval = frequencyInterval;
            return this;
        }

        /**
         * @param frequencyType Frequency associated with the backup policy item. For monthly policies, the frequency type is defined as `monthly`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
         * 
         * @return builder
         * 
         */
        public Builder frequencyType(String frequencyType) {
            $.frequencyType = frequencyType;
            return this;
        }

        /**
         * @param id Unique identifier of the backup policy item.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param retentionUnit Scope of the backup policy item: `days`, `weeks`, or `months`.
         * 
         * @return builder
         * 
         */
        public Builder retentionUnit(String retentionUnit) {
            $.retentionUnit = retentionUnit;
            return this;
        }

        /**
         * @param retentionValue Value to associate with `retention_unit`. Monthly policy must have retention days of at least 31 days or 5 weeks or 1 month. Note that for less frequent policy items, Atlas requires that you specify a retention period greater than or equal to the retention period specified for more frequent policy items. For example: If the weekly policy item specifies a retention of two weeks, the montly retention policy must specify two weeks or greater.
         * 
         * @return builder
         * 
         */
        public Builder retentionValue(Integer retentionValue) {
            $.retentionValue = retentionValue;
            return this;
        }

        public GetBackupCompliancePolicyPolicyItemHourly build() {
            $.frequencyInterval = Objects.requireNonNull($.frequencyInterval, "expected parameter 'frequencyInterval' to be non-null");
            $.frequencyType = Objects.requireNonNull($.frequencyType, "expected parameter 'frequencyType' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.retentionUnit = Objects.requireNonNull($.retentionUnit, "expected parameter 'retentionUnit' to be non-null");
            $.retentionValue = Objects.requireNonNull($.retentionValue, "expected parameter 'retentionValue' to be non-null");
            return $;
        }
    }

}
