// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAlertConfigurationOutput {
    private @Nullable String label;
    private String type;
    /**
     * @return Value to test with the specified operator. If `field_name` is set to TYPE_NAME, you can match on the following values:
     * - `PRIMARY`
     * - `SECONDARY`
     * - `STANDALONE`
     * - `CONFIG`
     * - `MONGOS`
     * 
     */
    private String value;

    private GetAlertConfigurationOutput() {}
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    public String type() {
        return this.type;
    }
    /**
     * @return Value to test with the specified operator. If `field_name` is set to TYPE_NAME, you can match on the following values:
     * - `PRIMARY`
     * - `SECONDARY`
     * - `STANDALONE`
     * - `CONFIG`
     * - `MONGOS`
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertConfigurationOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String label;
        private String type;
        private String value;
        public Builder() {}
        public Builder(GetAlertConfigurationOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder label(@Nullable String label) {

            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationOutput", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetAlertConfigurationOutput", "value");
            }
            this.value = value;
            return this;
        }
        public GetAlertConfigurationOutput build() {
            final var _resultValue = new GetAlertConfigurationOutput();
            _resultValue.label = label;
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
