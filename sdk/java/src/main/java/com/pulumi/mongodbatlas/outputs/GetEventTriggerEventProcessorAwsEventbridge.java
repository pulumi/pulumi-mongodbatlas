// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEventTriggerEventProcessorAwsEventbridge {
    /**
     * @return AWS Account ID.
     * 
     */
    private String configAccountId;
    /**
     * @return Region of AWS Account.
     * 
     */
    private String configRegion;

    private GetEventTriggerEventProcessorAwsEventbridge() {}
    /**
     * @return AWS Account ID.
     * 
     */
    public String configAccountId() {
        return this.configAccountId;
    }
    /**
     * @return Region of AWS Account.
     * 
     */
    public String configRegion() {
        return this.configRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventTriggerEventProcessorAwsEventbridge defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String configAccountId;
        private String configRegion;
        public Builder() {}
        public Builder(GetEventTriggerEventProcessorAwsEventbridge defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configAccountId = defaults.configAccountId;
    	      this.configRegion = defaults.configRegion;
        }

        @CustomType.Setter
        public Builder configAccountId(String configAccountId) {
            if (configAccountId == null) {
              throw new MissingRequiredPropertyException("GetEventTriggerEventProcessorAwsEventbridge", "configAccountId");
            }
            this.configAccountId = configAccountId;
            return this;
        }
        @CustomType.Setter
        public Builder configRegion(String configRegion) {
            if (configRegion == null) {
              throw new MissingRequiredPropertyException("GetEventTriggerEventProcessorAwsEventbridge", "configRegion");
            }
            this.configRegion = configRegion;
            return this;
        }
        public GetEventTriggerEventProcessorAwsEventbridge build() {
            final var _resultValue = new GetEventTriggerEventProcessorAwsEventbridge();
            _resultValue.configAccountId = configAccountId;
            _resultValue.configRegion = configRegion;
            return _resultValue;
        }
    }
}
