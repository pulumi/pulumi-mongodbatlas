// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupCompliancePolicyPolicyItemDailyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupCompliancePolicyPolicyItemDailyArgs Empty = new BackupCompliancePolicyPolicyItemDailyArgs();

    /**
     * Desired frequency of the new backup policy item specified by `frequency_type` (monthly in this case). The supported values for weekly policies are
     * 
     */
    @Import(name="frequencyInterval", required=true)
    private Output<Integer> frequencyInterval;

    /**
     * @return Desired frequency of the new backup policy item specified by `frequency_type` (monthly in this case). The supported values for weekly policies are
     * 
     */
    public Output<Integer> frequencyInterval() {
        return this.frequencyInterval;
    }

    /**
     * Frequency associated with the backup policy item. For monthly policies, the frequency type is defined as `monthly`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
     * 
     */
    @Import(name="frequencyType")
    private @Nullable Output<String> frequencyType;

    /**
     * @return Frequency associated with the backup policy item. For monthly policies, the frequency type is defined as `monthly`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
     * 
     */
    public Optional<Output<String>> frequencyType() {
        return Optional.ofNullable(this.frequencyType);
    }

    /**
     * Unique identifier of the backup policy item.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Unique identifier of the backup policy item.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Scope of the backup policy item: `days`, `weeks`, or `months`.
     * 
     */
    @Import(name="retentionUnit", required=true)
    private Output<String> retentionUnit;

    /**
     * @return Scope of the backup policy item: `days`, `weeks`, or `months`.
     * 
     */
    public Output<String> retentionUnit() {
        return this.retentionUnit;
    }

    /**
     * Value to associate with `retention_unit`. Monthly policy must have retention days of at least 31 days or 5 weeks or 1 month. Note that for less frequent policy items, Atlas requires that you specify a retention period greater than or equal to the retention period specified for more frequent policy items. For example: If the weekly policy item specifies a retention of two weeks, the montly retention policy must specify two weeks or greater.
     * 
     */
    @Import(name="retentionValue", required=true)
    private Output<Integer> retentionValue;

    /**
     * @return Value to associate with `retention_unit`. Monthly policy must have retention days of at least 31 days or 5 weeks or 1 month. Note that for less frequent policy items, Atlas requires that you specify a retention period greater than or equal to the retention period specified for more frequent policy items. For example: If the weekly policy item specifies a retention of two weeks, the montly retention policy must specify two weeks or greater.
     * 
     */
    public Output<Integer> retentionValue() {
        return this.retentionValue;
    }

    private BackupCompliancePolicyPolicyItemDailyArgs() {}

    private BackupCompliancePolicyPolicyItemDailyArgs(BackupCompliancePolicyPolicyItemDailyArgs $) {
        this.frequencyInterval = $.frequencyInterval;
        this.frequencyType = $.frequencyType;
        this.id = $.id;
        this.retentionUnit = $.retentionUnit;
        this.retentionValue = $.retentionValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupCompliancePolicyPolicyItemDailyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupCompliancePolicyPolicyItemDailyArgs $;

        public Builder() {
            $ = new BackupCompliancePolicyPolicyItemDailyArgs();
        }

        public Builder(BackupCompliancePolicyPolicyItemDailyArgs defaults) {
            $ = new BackupCompliancePolicyPolicyItemDailyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param frequencyInterval Desired frequency of the new backup policy item specified by `frequency_type` (monthly in this case). The supported values for weekly policies are
         * 
         * @return builder
         * 
         */
        public Builder frequencyInterval(Output<Integer> frequencyInterval) {
            $.frequencyInterval = frequencyInterval;
            return this;
        }

        /**
         * @param frequencyInterval Desired frequency of the new backup policy item specified by `frequency_type` (monthly in this case). The supported values for weekly policies are
         * 
         * @return builder
         * 
         */
        public Builder frequencyInterval(Integer frequencyInterval) {
            return frequencyInterval(Output.of(frequencyInterval));
        }

        /**
         * @param frequencyType Frequency associated with the backup policy item. For monthly policies, the frequency type is defined as `monthly`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
         * 
         * @return builder
         * 
         */
        public Builder frequencyType(@Nullable Output<String> frequencyType) {
            $.frequencyType = frequencyType;
            return this;
        }

        /**
         * @param frequencyType Frequency associated with the backup policy item. For monthly policies, the frequency type is defined as `monthly`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
         * 
         * @return builder
         * 
         */
        public Builder frequencyType(String frequencyType) {
            return frequencyType(Output.of(frequencyType));
        }

        /**
         * @param id Unique identifier of the backup policy item.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Unique identifier of the backup policy item.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param retentionUnit Scope of the backup policy item: `days`, `weeks`, or `months`.
         * 
         * @return builder
         * 
         */
        public Builder retentionUnit(Output<String> retentionUnit) {
            $.retentionUnit = retentionUnit;
            return this;
        }

        /**
         * @param retentionUnit Scope of the backup policy item: `days`, `weeks`, or `months`.
         * 
         * @return builder
         * 
         */
        public Builder retentionUnit(String retentionUnit) {
            return retentionUnit(Output.of(retentionUnit));
        }

        /**
         * @param retentionValue Value to associate with `retention_unit`. Monthly policy must have retention days of at least 31 days or 5 weeks or 1 month. Note that for less frequent policy items, Atlas requires that you specify a retention period greater than or equal to the retention period specified for more frequent policy items. For example: If the weekly policy item specifies a retention of two weeks, the montly retention policy must specify two weeks or greater.
         * 
         * @return builder
         * 
         */
        public Builder retentionValue(Output<Integer> retentionValue) {
            $.retentionValue = retentionValue;
            return this;
        }

        /**
         * @param retentionValue Value to associate with `retention_unit`. Monthly policy must have retention days of at least 31 days or 5 weeks or 1 month. Note that for less frequent policy items, Atlas requires that you specify a retention period greater than or equal to the retention period specified for more frequent policy items. For example: If the weekly policy item specifies a retention of two weeks, the montly retention policy must specify two weeks or greater.
         * 
         * @return builder
         * 
         */
        public Builder retentionValue(Integer retentionValue) {
            return retentionValue(Output.of(retentionValue));
        }

        public BackupCompliancePolicyPolicyItemDailyArgs build() {
            $.frequencyInterval = Objects.requireNonNull($.frequencyInterval, "expected parameter 'frequencyInterval' to be non-null");
            $.retentionUnit = Objects.requireNonNull($.retentionUnit, "expected parameter 'retentionUnit' to be non-null");
            $.retentionValue = Objects.requireNonNull($.retentionValue, "expected parameter 'retentionValue' to be non-null");
            return $;
        }
    }

}
