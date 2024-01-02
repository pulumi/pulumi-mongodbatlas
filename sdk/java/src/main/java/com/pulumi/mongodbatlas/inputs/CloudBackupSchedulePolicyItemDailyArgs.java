// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudBackupSchedulePolicyItemDailyArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudBackupSchedulePolicyItemDailyArgs Empty = new CloudBackupSchedulePolicyItemDailyArgs();

    /**
     * Desired frequency of the new backup policy item specified by `frequency_type` (daily in this case). The only supported value for daily policies is `1` day.
     * 
     */
    @Import(name="frequencyInterval", required=true)
    private Output<Integer> frequencyInterval;

    /**
     * @return Desired frequency of the new backup policy item specified by `frequency_type` (daily in this case). The only supported value for daily policies is `1` day.
     * 
     */
    public Output<Integer> frequencyInterval() {
        return this.frequencyInterval;
    }

    /**
     * Frequency associated with the backup policy item. For daily policies, the frequency type is defined as `daily`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
     * 
     */
    @Import(name="frequencyType")
    private @Nullable Output<String> frequencyType;

    /**
     * @return Frequency associated with the backup policy item. For daily policies, the frequency type is defined as `daily`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
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
     * Value to associate with `retention_unit`.  Note that for less frequent policy items, Atlas requires that you specify a retention period greater than or equal to the retention period specified for more frequent policy items. For example: If the hourly policy item specifies a retention of two days, the daily retention policy must specify two days or greater.
     * 
     */
    @Import(name="retentionValue", required=true)
    private Output<Integer> retentionValue;

    /**
     * @return Value to associate with `retention_unit`.  Note that for less frequent policy items, Atlas requires that you specify a retention period greater than or equal to the retention period specified for more frequent policy items. For example: If the hourly policy item specifies a retention of two days, the daily retention policy must specify two days or greater.
     * 
     */
    public Output<Integer> retentionValue() {
        return this.retentionValue;
    }

    private CloudBackupSchedulePolicyItemDailyArgs() {}

    private CloudBackupSchedulePolicyItemDailyArgs(CloudBackupSchedulePolicyItemDailyArgs $) {
        this.frequencyInterval = $.frequencyInterval;
        this.frequencyType = $.frequencyType;
        this.id = $.id;
        this.retentionUnit = $.retentionUnit;
        this.retentionValue = $.retentionValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudBackupSchedulePolicyItemDailyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudBackupSchedulePolicyItemDailyArgs $;

        public Builder() {
            $ = new CloudBackupSchedulePolicyItemDailyArgs();
        }

        public Builder(CloudBackupSchedulePolicyItemDailyArgs defaults) {
            $ = new CloudBackupSchedulePolicyItemDailyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param frequencyInterval Desired frequency of the new backup policy item specified by `frequency_type` (daily in this case). The only supported value for daily policies is `1` day.
         * 
         * @return builder
         * 
         */
        public Builder frequencyInterval(Output<Integer> frequencyInterval) {
            $.frequencyInterval = frequencyInterval;
            return this;
        }

        /**
         * @param frequencyInterval Desired frequency of the new backup policy item specified by `frequency_type` (daily in this case). The only supported value for daily policies is `1` day.
         * 
         * @return builder
         * 
         */
        public Builder frequencyInterval(Integer frequencyInterval) {
            return frequencyInterval(Output.of(frequencyInterval));
        }

        /**
         * @param frequencyType Frequency associated with the backup policy item. For daily policies, the frequency type is defined as `daily`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
         * 
         * @return builder
         * 
         */
        public Builder frequencyType(@Nullable Output<String> frequencyType) {
            $.frequencyType = frequencyType;
            return this;
        }

        /**
         * @param frequencyType Frequency associated with the backup policy item. For daily policies, the frequency type is defined as `daily`. Note that this is a read-only value and not required in plan files - its value is implied from the policy resource type.
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
         * @param retentionValue Value to associate with `retention_unit`.  Note that for less frequent policy items, Atlas requires that you specify a retention period greater than or equal to the retention period specified for more frequent policy items. For example: If the hourly policy item specifies a retention of two days, the daily retention policy must specify two days or greater.
         * 
         * @return builder
         * 
         */
        public Builder retentionValue(Output<Integer> retentionValue) {
            $.retentionValue = retentionValue;
            return this;
        }

        /**
         * @param retentionValue Value to associate with `retention_unit`.  Note that for less frequent policy items, Atlas requires that you specify a retention period greater than or equal to the retention period specified for more frequent policy items. For example: If the hourly policy item specifies a retention of two days, the daily retention policy must specify two days or greater.
         * 
         * @return builder
         * 
         */
        public Builder retentionValue(Integer retentionValue) {
            return retentionValue(Output.of(retentionValue));
        }

        public CloudBackupSchedulePolicyItemDailyArgs build() {
            if ($.frequencyInterval == null) {
                throw new MissingRequiredPropertyException("CloudBackupSchedulePolicyItemDailyArgs", "frequencyInterval");
            }
            if ($.retentionUnit == null) {
                throw new MissingRequiredPropertyException("CloudBackupSchedulePolicyItemDailyArgs", "retentionUnit");
            }
            if ($.retentionValue == null) {
                throw new MissingRequiredPropertyException("CloudBackupSchedulePolicyItemDailyArgs", "retentionValue");
            }
            return $;
        }
    }

}
