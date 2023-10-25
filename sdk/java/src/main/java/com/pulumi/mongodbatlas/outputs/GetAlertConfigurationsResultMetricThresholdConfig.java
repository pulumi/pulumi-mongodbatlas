// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAlertConfigurationsResultMetricThresholdConfig {
    /**
     * @return Name of the metric to check. The full list being quite large, please refer to atlas docs [here for general metrics](https://docs.atlas.mongodb.com/reference/alert-host-metrics/#measurement-types) and [here for serverless metrics](https://www.mongodb.com/docs/atlas/reference/api/alert-configurations-create-config/#serverless-measurements)
     * 
     */
    private String metricName;
    /**
     * @return This must be set to AVERAGE. Atlas computes the current metric value as an average.
     * 
     */
    private String mode;
    /**
     * @return The operator to apply when checking the current metric value against the threshold value.
     * Accepted values are:
     * 
     */
    private String operator;
    /**
     * @return Threshold value outside of which an alert will be triggered.
     * 
     */
    private Double threshold;
    /**
     * @return The units for the threshold value. Depends on the type of metric.
     * Refer to the [MongoDB API Alert Configuration documentation](https://www.mongodb.com/docs/atlas/reference/api/alert-configurations-get-config/#request-body-parameters) for a list of accepted values.
     * 
     */
    private String units;

    private GetAlertConfigurationsResultMetricThresholdConfig() {}
    /**
     * @return Name of the metric to check. The full list being quite large, please refer to atlas docs [here for general metrics](https://docs.atlas.mongodb.com/reference/alert-host-metrics/#measurement-types) and [here for serverless metrics](https://www.mongodb.com/docs/atlas/reference/api/alert-configurations-create-config/#serverless-measurements)
     * 
     */
    public String metricName() {
        return this.metricName;
    }
    /**
     * @return This must be set to AVERAGE. Atlas computes the current metric value as an average.
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return The operator to apply when checking the current metric value against the threshold value.
     * Accepted values are:
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return Threshold value outside of which an alert will be triggered.
     * 
     */
    public Double threshold() {
        return this.threshold;
    }
    /**
     * @return The units for the threshold value. Depends on the type of metric.
     * Refer to the [MongoDB API Alert Configuration documentation](https://www.mongodb.com/docs/atlas/reference/api/alert-configurations-get-config/#request-body-parameters) for a list of accepted values.
     * 
     */
    public String units() {
        return this.units;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertConfigurationsResultMetricThresholdConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String metricName;
        private String mode;
        private String operator;
        private Double threshold;
        private String units;
        public Builder() {}
        public Builder(GetAlertConfigurationsResultMetricThresholdConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricName = defaults.metricName;
    	      this.mode = defaults.mode;
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
    	      this.units = defaults.units;
        }

        @CustomType.Setter
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        @CustomType.Setter
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        @CustomType.Setter
        public Builder threshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        @CustomType.Setter
        public Builder units(String units) {
            this.units = Objects.requireNonNull(units);
            return this;
        }
        public GetAlertConfigurationsResultMetricThresholdConfig build() {
            final var o = new GetAlertConfigurationsResultMetricThresholdConfig();
            o.metricName = metricName;
            o.mode = mode;
            o.operator = operator;
            o.threshold = threshold;
            o.units = units;
            return o;
        }
    }
}
