// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AlertConfigurationMatcher {
    private String fieldName;
    private String operator;
    private String value;

    private AlertConfigurationMatcher() {}
    public String fieldName() {
        return this.fieldName;
    }
    public String operator() {
        return this.operator;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertConfigurationMatcher defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String fieldName;
        private String operator;
        private String value;
        public Builder() {}
        public Builder(AlertConfigurationMatcher defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldName = defaults.fieldName;
    	      this.operator = defaults.operator;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder fieldName(String fieldName) {
            if (fieldName == null) {
              throw new MissingRequiredPropertyException("AlertConfigurationMatcher", "fieldName");
            }
            this.fieldName = fieldName;
            return this;
        }
        @CustomType.Setter
        public Builder operator(String operator) {
            if (operator == null) {
              throw new MissingRequiredPropertyException("AlertConfigurationMatcher", "operator");
            }
            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("AlertConfigurationMatcher", "value");
            }
            this.value = value;
            return this;
        }
        public AlertConfigurationMatcher build() {
            final var _resultValue = new AlertConfigurationMatcher();
            _resultValue.fieldName = fieldName;
            _resultValue.operator = operator;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
