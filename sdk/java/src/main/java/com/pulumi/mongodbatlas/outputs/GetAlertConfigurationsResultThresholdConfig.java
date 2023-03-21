// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAlertConfigurationsResultThresholdConfig {
    private String operator;
    private Double threshold;
    private String units;

    private GetAlertConfigurationsResultThresholdConfig() {}
    public String operator() {
        return this.operator;
    }
    public Double threshold() {
        return this.threshold;
    }
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
        public GetAlertConfigurationsResultThresholdConfig build() {
            final var o = new GetAlertConfigurationsResultThresholdConfig();
            o.operator = operator;
            o.threshold = threshold;
            o.units = units;
            return o;
        }
    }
}