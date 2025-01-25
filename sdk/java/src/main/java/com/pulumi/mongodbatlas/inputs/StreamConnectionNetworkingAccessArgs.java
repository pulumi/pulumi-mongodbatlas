// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamConnectionNetworkingAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamConnectionNetworkingAccessArgs Empty = new StreamConnectionNetworkingAccessArgs();

    /**
     * Id of the Private Link connection when type is `PRIVATE_LINK`.
     * 
     */
    @Import(name="connectionId")
    private @Nullable Output<String> connectionId;

    /**
     * @return Id of the Private Link connection when type is `PRIVATE_LINK`.
     * 
     */
    public Optional<Output<String>> connectionId() {
        return Optional.ofNullable(this.connectionId);
    }

    /**
     * Selected networking type. Either `PUBLIC`, `VPC` or `PRIVATE_LINK`. Defaults to `PUBLIC`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Selected networking type. Either `PUBLIC`, `VPC` or `PRIVATE_LINK`. Defaults to `PUBLIC`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private StreamConnectionNetworkingAccessArgs() {}

    private StreamConnectionNetworkingAccessArgs(StreamConnectionNetworkingAccessArgs $) {
        this.connectionId = $.connectionId;
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
         * @param connectionId Id of the Private Link connection when type is `PRIVATE_LINK`.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(@Nullable Output<String> connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param connectionId Id of the Private Link connection when type is `PRIVATE_LINK`.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(String connectionId) {
            return connectionId(Output.of(connectionId));
        }

        /**
         * @param type Selected networking type. Either `PUBLIC`, `VPC` or `PRIVATE_LINK`. Defaults to `PUBLIC`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Selected networking type. Either `PUBLIC`, `VPC` or `PRIVATE_LINK`. Defaults to `PUBLIC`.
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
