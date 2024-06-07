// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamInstanceStreamConfig {
    /**
     * @return Selected tier for the Stream Instance. Configures Memory / VCPU allowances. The [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) describes the valid values.
     * 
     */
    private @Nullable String tier;

    private StreamInstanceStreamConfig() {}
    /**
     * @return Selected tier for the Stream Instance. Configures Memory / VCPU allowances. The [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) describes the valid values.
     * 
     */
    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamInstanceStreamConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String tier;
        public Builder() {}
        public Builder(StreamInstanceStreamConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tier = defaults.tier;
        }

        @CustomType.Setter
        public Builder tier(@Nullable String tier) {

            this.tier = tier;
            return this;
        }
        public StreamInstanceStreamConfig build() {
            final var _resultValue = new StreamInstanceStreamConfig();
            _resultValue.tier = tier;
            return _resultValue;
        }
    }
}
