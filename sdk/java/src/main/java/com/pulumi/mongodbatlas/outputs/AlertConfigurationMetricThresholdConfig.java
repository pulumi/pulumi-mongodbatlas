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
public final class AlertConfigurationMetricThresholdConfig {
    /**
     * @return Name of the metric to check. The full list being quite large, please refer to atlas docs [here for general metrics](https://docs.atlas.mongodb.com/reference/alert-host-metrics/#measurement-types) and [here for serverless metrics](https://www.mongodb.com/docs/atlas/reference/api/alert-configurations-create-config/#serverless-measurements)
     * 
     */
    private @Nullable String metricName;
    /**
     * @return This must be set to AVERAGE. Atlas computes the current metric value as an average.
     * 
     */
    private @Nullable String mode;
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

    private AlertConfigurationMetricThresholdConfig() {}
    /**
     * @return Name of the metric to check. The full list being quite large, please refer to atlas docs [here for general metrics](https://docs.atlas.mongodb.com/reference/alert-host-metrics/#measurement-types) and [here for serverless metrics](https://www.mongodb.com/docs/atlas/reference/api/alert-configurations-create-config/#serverless-measurements)
     * 
     */
    public Optional<String> metricName() {
        return Optional.ofNullable(this.metricName);
    }
    /**
     * @return This must be set to AVERAGE. Atlas computes the current metric value as an average.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
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

    public static Builder builder(AlertConfigurationMetricThresholdConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String metricName;
        private @Nullable String mode;
        private @Nullable String operator;
        private @Nullable Double threshold;
        private @Nullable String units;
        public Builder() {}
        public Builder(AlertConfigurationMetricThresholdConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricName = defaults.metricName;
    	      this.mode = defaults.mode;
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
    	      this.units = defaults.units;
        }

        @CustomType.Setter
        public Builder metricName(@Nullable String metricName) {
            this.metricName = metricName;
            return this;
        }
        @CustomType.Setter
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
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
        public AlertConfigurationMetricThresholdConfig build() {
            final var o = new AlertConfigurationMetricThresholdConfig();
            o.metricName = metricName;
            o.mode = mode;
            o.operator = operator;
            o.threshold = threshold;
            o.units = units;
            return o;
        }
    }
}
