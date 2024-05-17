// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAlertConfigurationOutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetAlertConfigurationOutputArgs Empty = new GetAlertConfigurationOutputArgs();

    @Import(name="label")
    private @Nullable Output<String> label;

    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Value to test with the specified operator. If `field_name` is set to TYPE_NAME, you can match on the following values:
     * - `PRIMARY`
     * - `SECONDARY`
     * - `STANDALONE`
     * - `CONFIG`
     * - `MONGOS`
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Value to test with the specified operator. If `field_name` is set to TYPE_NAME, you can match on the following values:
     * - `PRIMARY`
     * - `SECONDARY`
     * - `STANDALONE`
     * - `CONFIG`
     * - `MONGOS`
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private GetAlertConfigurationOutputArgs() {}

    private GetAlertConfigurationOutputArgs(GetAlertConfigurationOutputArgs $) {
        this.label = $.label;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertConfigurationOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertConfigurationOutputArgs $;

        public Builder() {
            $ = new GetAlertConfigurationOutputArgs();
        }

        public Builder(GetAlertConfigurationOutputArgs defaults) {
            $ = new GetAlertConfigurationOutputArgs(Objects.requireNonNull(defaults));
        }

        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        public Builder label(String label) {
            return label(Output.of(label));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value Value to test with the specified operator. If `field_name` is set to TYPE_NAME, you can match on the following values:
         * - `PRIMARY`
         * - `SECONDARY`
         * - `STANDALONE`
         * - `CONFIG`
         * - `MONGOS`
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value to test with the specified operator. If `field_name` is set to TYPE_NAME, you can match on the following values:
         * - `PRIMARY`
         * - `SECONDARY`
         * - `STANDALONE`
         * - `CONFIG`
         * - `MONGOS`
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GetAlertConfigurationOutputArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetAlertConfigurationOutputArgs", "type");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("GetAlertConfigurationOutputArgs", "value");
            }
            return $;
        }
    }

}
