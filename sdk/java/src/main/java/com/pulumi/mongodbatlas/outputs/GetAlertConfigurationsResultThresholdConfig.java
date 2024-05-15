// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAlertConfigurationsResultThresholdConfig {
    /**
     * @return The operator to apply when checking the current metric value against the threshold value.
     * Accepted values are:
     * - `GREATER_THAN`
     * - `LESS_THAN`
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

    private GetAlertConfigurationsResultThresholdConfig() {}
    /**
     * @return The operator to apply when checking the current metric value against the threshold value.
     * Accepted values are:
     * - `GREATER_THAN`
     * - `LESS_THAN`
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

    public static Builder builder(GetAlertConfigurationsResultThresholdConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String operator;
        private Double threshold;
        private String units;
        public Builder() {}
        public Builder(GetAlertConfigurationsResultThresholdConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
    	      this.units = defaults.units;
        }

        @CustomType.Setter
        public Builder operator(String operator) {
            if (operator == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationsResultThresholdConfig", "operator");
            }
            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder threshold(Double threshold) {
            if (threshold == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationsResultThresholdConfig", "threshold");
            }
            this.threshold = threshold;
            return this;
        }
        @CustomType.Setter
        public Builder units(String units) {
            if (units == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationsResultThresholdConfig", "units");
            }
            this.units = units;
            return this;
        }
        public GetAlertConfigurationsResultThresholdConfig build() {
            final var _resultValue = new GetAlertConfigurationsResultThresholdConfig();
            _resultValue.operator = operator;
            _resultValue.threshold = threshold;
            _resultValue.units = units;
            return _resultValue;
        }
    }
}
