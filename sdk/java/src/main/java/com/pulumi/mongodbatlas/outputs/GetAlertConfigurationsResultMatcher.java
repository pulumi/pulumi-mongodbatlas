// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAlertConfigurationsResultMatcher {
    /**
     * @return Name of the field in the target object to match on.
     * 
     */
    private String fieldName;
    /**
     * @return The operator to apply when checking the current metric value against the threshold value.
     * Accepted values are:
     * 
     */
    private String operator;
    /**
     * @return Value to test with the specified operator. If `field_name` is set to TYPE_NAME, you can match on the following values:
     * 
     */
    private String value;

    private GetAlertConfigurationsResultMatcher() {}
    /**
     * @return Name of the field in the target object to match on.
     * 
     */
    public String fieldName() {
        return this.fieldName;
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
     * @return Value to test with the specified operator. If `field_name` is set to TYPE_NAME, you can match on the following values:
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertConfigurationsResultMatcher defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String fieldName;
        private String operator;
        private String value;
        public Builder() {}
        public Builder(GetAlertConfigurationsResultMatcher defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldName = defaults.fieldName;
    	      this.operator = defaults.operator;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder fieldName(String fieldName) {
            if (fieldName == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationsResultMatcher", "fieldName");
            }
            this.fieldName = fieldName;
            return this;
        }
        @CustomType.Setter
        public Builder operator(String operator) {
            if (operator == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationsResultMatcher", "operator");
            }
            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationsResultMatcher", "value");
            }
            this.value = value;
            return this;
        }
        public GetAlertConfigurationsResultMatcher build() {
            final var _resultValue = new GetAlertConfigurationsResultMatcher();
            _resultValue.fieldName = fieldName;
            _resultValue.operator = operator;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
