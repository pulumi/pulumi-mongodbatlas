// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAlertConfigurationThresholdConfig {
    /**
     * @return Operator to apply when checking the current metric value against the threshold value.
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

    private GetAlertConfigurationThresholdConfig() {}
    /**
     * @return Operator to apply when checking the current metric value against the threshold value.
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

    public static Builder builder(GetAlertConfigurationThresholdConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String operator;
        private Double threshold;
        private String units;
        public Builder() {}
        public Builder(GetAlertConfigurationThresholdConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
    	      this.units = defaults.units;
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
        public GetAlertConfigurationThresholdConfig build() {
            final var o = new GetAlertConfigurationThresholdConfig();
            o.operator = operator;
            o.threshold = threshold;
            o.units = units;
            return o;
        }
    }
}