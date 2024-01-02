// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClustersResultLabel {
    /**
     * @return The key that you want to write.
     * 
     */
    private String key;
    /**
     * @return The value that you want to write.
     * 
     */
    private String value;

    private GetClustersResultLabel() {}
    /**
     * @return The key that you want to write.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The value that you want to write.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClustersResultLabel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String value;
        public Builder() {}
        public Builder(GetClustersResultLabel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetClustersResultLabel", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetClustersResultLabel", "value");
            }
            this.value = value;
            return this;
        }
        public GetClustersResultLabel build() {
            final var _resultValue = new GetClustersResultLabel();
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
