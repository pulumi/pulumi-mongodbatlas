// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class StreamConnectionNetworkingAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamConnectionNetworkingAccessArgs Empty = new StreamConnectionNetworkingAccessArgs();

    /**
     * Selected networking type. Either `PUBLIC` or `VPC`. Defaults to `PUBLIC`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Selected networking type. Either `PUBLIC` or `VPC`. Defaults to `PUBLIC`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private StreamConnectionNetworkingAccessArgs() {}

    private StreamConnectionNetworkingAccessArgs(StreamConnectionNetworkingAccessArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamConnectionNetworkingAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamConnectionNetworkingAccessArgs $;

        public Builder() {
            $ = new StreamConnectionNetworkingAccessArgs();
        }

        public Builder(StreamConnectionNetworkingAccessArgs defaults) {
            $ = new StreamConnectionNetworkingAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Selected networking type. Either `PUBLIC` or `VPC`. Defaults to `PUBLIC`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Selected networking type. Either `PUBLIC` or `VPC`. Defaults to `PUBLIC`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public StreamConnectionNetworkingAccessArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("StreamConnectionNetworkingAccessArgs", "type");
            }
            return $;
        }
    }

}
