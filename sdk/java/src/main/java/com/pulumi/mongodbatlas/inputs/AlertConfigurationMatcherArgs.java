// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertConfigurationMatcherArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertConfigurationMatcherArgs Empty = new AlertConfigurationMatcherArgs();

    /**
     * Name of the field in the target object to match on.
     * 
     */
    @Import(name="fieldName")
    private @Nullable Output<String> fieldName;

    /**
     * @return Name of the field in the target object to match on.
     * 
     */
    public Optional<Output<String>> fieldName() {
        return Optional.ofNullable(this.fieldName);
    }

    /**
     * If omitted, the configuration is disabled.
     * Accepted values are:
     * Accepted values are:
     * Accepted values are:
     * 
     */
    @Import(name="operator")
    private @Nullable Output<String> operator;

    /**
     * @return If omitted, the configuration is disabled.
     * Accepted values are:
     * Accepted values are:
     * Accepted values are:
     * 
     */
    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
    }

    /**
     * If omitted, the configuration is disabled.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return If omitted, the configuration is disabled.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private AlertConfigurationMatcherArgs() {}

    private AlertConfigurationMatcherArgs(AlertConfigurationMatcherArgs $) {
        this.fieldName = $.fieldName;
        this.operator = $.operator;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertConfigurationMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertConfigurationMatcherArgs $;

        public Builder() {
            $ = new AlertConfigurationMatcherArgs();
        }

        public Builder(AlertConfigurationMatcherArgs defaults) {
            $ = new AlertConfigurationMatcherArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fieldName Name of the field in the target object to match on.
         * 
         * @return builder
         * 
         */
        public Builder fieldName(@Nullable Output<String> fieldName) {
            $.fieldName = fieldName;
            return this;
        }

        /**
         * @param fieldName Name of the field in the target object to match on.
         * 
         * @return builder
         * 
         */
        public Builder fieldName(String fieldName) {
            return fieldName(Output.of(fieldName));
        }

        /**
         * @param operator If omitted, the configuration is disabled.
         * Accepted values are:
         * Accepted values are:
         * Accepted values are:
         * 
         * @return builder
         * 
         */
        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator If omitted, the configuration is disabled.
         * Accepted values are:
         * Accepted values are:
         * Accepted values are:
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param value If omitted, the configuration is disabled.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value If omitted, the configuration is disabled.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public AlertConfigurationMatcherArgs build() {
            return $;
        }
    }

}
