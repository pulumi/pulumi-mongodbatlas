// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.StreamConnectionNetworkingAccess;
import java.util.Objects;

@CustomType
public final class StreamConnectionNetworking {
    /**
     * @return Information about the networking access. See access.
     * 
     */
    private StreamConnectionNetworkingAccess access;

    private StreamConnectionNetworking() {}
    /**
     * @return Information about the networking access. See access.
     * 
     */
    public StreamConnectionNetworkingAccess access() {
        return this.access;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamConnectionNetworking defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private StreamConnectionNetworkingAccess access;
        public Builder() {}
        public Builder(StreamConnectionNetworking defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
        }

        @CustomType.Setter
        public Builder access(StreamConnectionNetworkingAccess access) {
            if (access == null) {
              throw new MissingRequiredPropertyException("StreamConnectionNetworking", "access");
            }
            this.access = access;
            return this;
        }
        public StreamConnectionNetworking build() {
            final var _resultValue = new StreamConnectionNetworking();
            _resultValue.access = access;
            return _resultValue;
        }
    }
}