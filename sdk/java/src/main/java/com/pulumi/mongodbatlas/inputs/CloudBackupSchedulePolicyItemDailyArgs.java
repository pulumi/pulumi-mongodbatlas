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


public final class CloudBackupSchedulePolicyItemDailyArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudBackupSchedulePolicyItemDailyArgs Empty = new CloudBackupSchedulePolicyItemDailyArgs();

    /**
     * Desired frequency of the new backup policy item specified by `frequency_type`.
     * 
     */
    @Import(name="frequencyInterval", required=true)
    private Output<Integer> frequencyInterval;

    /**
     * @return Desired frequency of the new backup policy item specified by `frequency_type`.
     * 
     */
    public Output<Integer> frequencyInterval() {
        return this.frequencyInterval;
    }

    /**
     * Frequency associated with the export snapshot item.
     * 
     */
    @Import(name="frequencyType")
    private @Nullable Output<String> frequencyType;

    /**
     * @return Frequency associated with the export snapshot item.
     * 
     */
    public Optional<Output<String>> frequencyType() {
        return Optional.ofNullable(this.frequencyType);
    }

    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Scope of the backup policy item: days, weeks, or months.
     * 
     */
    @Import(name="retentionUnit", required=true)
    private Output<String> retentionUnit;

    /**
     * @return Scope of the backup policy item: days, weeks, or months.
     * 
     */
    public Output<String> retentionUnit() {
        return this.retentionUnit;
    }

    /**
     * Value to associate with `retention_unit`.
     * 
     */
    @Import(name="retentionValue", required=true)
    private Output<Integer> retentionValue;

    /**
     * @return Value to associate with `retention_unit`.
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
         * @param frequencyInterval Desired frequency of the new backup policy item specified by `frequency_type`.
         * 
         * @return builder
         * 
         */
        public Builder frequencyInterval(Output<Integer> frequencyInterval) {
            $.frequencyInterval = frequencyInterval;
            return this;
        }

        /**
         * @param frequencyInterval Desired frequency of the new backup policy item specified by `frequency_type`.
         * 
         * @return builder
         * 
         */
        public Builder frequencyInterval(Integer frequencyInterval) {
            return frequencyInterval(Output.of(frequencyInterval));
        }

        /**
         * @param frequencyType Frequency associated with the export snapshot item.
         * 
         * @return builder
         * 
         */
        public Builder frequencyType(@Nullable Output<String> frequencyType) {
            $.frequencyType = frequencyType;
            return this;
        }

        /**
         * @param frequencyType Frequency associated with the export snapshot item.
         * 
         * @return builder
         * 
         */
        public Builder frequencyType(String frequencyType) {
            return frequencyType(Output.of(frequencyType));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param retentionUnit Scope of the backup policy item: days, weeks, or months.
         * 
         * @return builder
         * 
         */
        public Builder retentionUnit(Output<String> retentionUnit) {
            $.retentionUnit = retentionUnit;
            return this;
        }

        /**
         * @param retentionUnit Scope of the backup policy item: days, weeks, or months.
         * 
         * @return builder
         * 
         */
        public Builder retentionUnit(String retentionUnit) {
            return retentionUnit(Output.of(retentionUnit));
        }

        /**
         * @param retentionValue Value to associate with `retention_unit`.
         * 
         * @return builder
         * 
         */
        public Builder retentionValue(Output<Integer> retentionValue) {
            $.retentionValue = retentionValue;
            return this;
        }

        /**
         * @param retentionValue Value to associate with `retention_unit`.
         * 
         * @return builder
         * 
         */
        public Builder retentionValue(Integer retentionValue) {
            return retentionValue(Output.of(retentionValue));
        }

        public CloudBackupSchedulePolicyItemDailyArgs build() {
            $.frequencyInterval = Objects.requireNonNull($.frequencyInterval, "expected parameter 'frequencyInterval' to be non-null");
            $.retentionUnit = Objects.requireNonNull($.retentionUnit, "expected parameter 'retentionUnit' to be non-null");
            $.retentionValue = Objects.requireNonNull($.retentionValue, "expected parameter 'retentionValue' to be non-null");
            return $;
        }
    }

}
