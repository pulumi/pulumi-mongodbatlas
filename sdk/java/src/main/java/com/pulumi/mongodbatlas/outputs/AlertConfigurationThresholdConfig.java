// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertConfigurationThresholdConfig {
    /**
     * @return Operator to apply when checking the current metric value against the threshold value.
     * Accepted values are:
     * - `GREATER_THAN`
     * - `LESS_THAN`
     * 
     */
    private @Nullable String operator;
    /**
     * @return Threshold value outside of which an alert will be triggered.
     * 
     */
    private @Nullable Double threshold;
    /**
     * @return The units for the threshold value. Depends on the type of metric.
     * Accepted values are:
     * - `RAW`
     * - `BITS`
     * - `BYTES`
     * - `KILOBITS`
     * - `KILOBYTES`
     * - `MEGABITS`
     * - `MEGABYTES`
     * - `GIGABITS`
     * - `GIGABYTES`
     * - `TERABYTES`
     * - `PETABYTES`
     * - `MILLISECONDS`
     * - `SECONDS`
     * - `MINUTES`
     * - `HOURS`
     * - `DAYS`
     * 
     */
    private @Nullable String units;

    private AlertConfigurationThresholdConfig() {}
    /**
     * @return Operator to apply when checking the current metric value against the threshold value.
     * Accepted values are:
     * - `GREATER_THAN`
     * - `LESS_THAN`
     * 
     */
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * @return Threshold value outside of which an alert will be triggered.
     * 
     */
    public Optional<Double> threshold() {
        return Optional.ofNullable(this.threshold);
    }
    /**
     * @return The units for the threshold value. Depends on the type of metric.
     * Accepted values are:
     * - `RAW`
     * - `BITS`
     * - `BYTES`
     * - `KILOBITS`
     * - `KILOBYTES`
     * - `MEGABITS`
     * - `MEGABYTES`
     * - `GIGABITS`
     * - `GIGABYTES`
     * - `TERABYTES`
     * - `PETABYTES`
     * - `MILLISECONDS`
     * - `SECONDS`
     * - `MINUTES`
     * - `HOURS`
     * - `DAYS`
     * 
     */
    public Optional<String> units() {
        return Optional.ofNullable(this.units);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertConfigurationThresholdConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String operator;
        private @Nullable Double threshold;
        private @Nullable String units;
        public Builder() {}
        public Builder(AlertConfigurationThresholdConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
    	      this.units = defaults.units;
        }

        @CustomType.Setter
        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder threshold(@Nullable Double threshold) {
            this.threshold = threshold;
            return this;
        }
        @CustomType.Setter
        public Builder units(@Nullable String units) {
            this.units = units;
            return this;
        }
        public AlertConfigurationThresholdConfig build() {
            final var o = new AlertConfigurationThresholdConfig();
            o.operator = operator;
            o.threshold = threshold;
            o.units = units;
            return o;
        }
    }
}
