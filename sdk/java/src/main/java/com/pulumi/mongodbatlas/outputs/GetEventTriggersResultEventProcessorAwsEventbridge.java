// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEventTriggersResultEventProcessorAwsEventbridge {
    private String configAccountId;
    private String configRegion;

    private GetEventTriggersResultEventProcessorAwsEventbridge() {}
    public String configAccountId() {
        return this.configAccountId;
    }
    public String configRegion() {
        return this.configRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventTriggersResultEventProcessorAwsEventbridge defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String configAccountId;
        private String configRegion;
        public Builder() {}
        public Builder(GetEventTriggersResultEventProcessorAwsEventbridge defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configAccountId = defaults.configAccountId;
    	      this.configRegion = defaults.configRegion;
        }

        @CustomType.Setter
        public Builder configAccountId(String configAccountId) {
            this.configAccountId = Objects.requireNonNull(configAccountId);
            return this;
        }
        @CustomType.Setter
        public Builder configRegion(String configRegion) {
            this.configRegion = Objects.requireNonNull(configRegion);
            return this;
        }
        public GetEventTriggersResultEventProcessorAwsEventbridge build() {
            final var _resultValue = new GetEventTriggersResultEventProcessorAwsEventbridge();
            _resultValue.configAccountId = configAccountId;
            _resultValue.configRegion = configRegion;
            return _resultValue;
        }
    }
}
