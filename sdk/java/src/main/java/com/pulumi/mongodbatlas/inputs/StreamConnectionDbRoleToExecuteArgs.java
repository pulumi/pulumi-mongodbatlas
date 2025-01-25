// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class StreamConnectionDbRoleToExecuteArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamConnectionDbRoleToExecuteArgs Empty = new StreamConnectionDbRoleToExecuteArgs();

    /**
     * The name of the role to use. Value can be  `atlasAdmin`, `readWriteAnyDatabase`, or `readAnyDatabase` if `type` is set to `BUILT_IN`, or the name of a user-defined role if `type` is set to `CUSTOM`.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The name of the role to use. Value can be  `atlasAdmin`, `readWriteAnyDatabase`, or `readAnyDatabase` if `type` is set to `BUILT_IN`, or the name of a user-defined role if `type` is set to `CUSTOM`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     * Type of connection. Can be either `Cluster`, `Kafka` or `Sample`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of connection. Can be either `Cluster`, `Kafka` or `Sample`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private StreamConnectionDbRoleToExecuteArgs() {}

    private StreamConnectionDbRoleToExecuteArgs(StreamConnectionDbRoleToExecuteArgs $) {
        this.role = $.role;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamConnectionDbRoleToExecuteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamConnectionDbRoleToExecuteArgs $;

        public Builder() {
            $ = new StreamConnectionDbRoleToExecuteArgs();
        }

        public Builder(StreamConnectionDbRoleToExecuteArgs defaults) {
            $ = new StreamConnectionDbRoleToExecuteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param role The name of the role to use. Value can be  `atlasAdmin`, `readWriteAnyDatabase`, or `readAnyDatabase` if `type` is set to `BUILT_IN`, or the name of a user-defined role if `type` is set to `CUSTOM`.
         * 
         * @return builder
         * 
         */
        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The name of the role to use. Value can be  `atlasAdmin`, `readWriteAnyDatabase`, or `readAnyDatabase` if `type` is set to `BUILT_IN`, or the name of a user-defined role if `type` is set to `CUSTOM`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param type Type of connection. Can be either `Cluster`, `Kafka` or `Sample`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of connection. Can be either `Cluster`, `Kafka` or `Sample`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public StreamConnectionDbRoleToExecuteArgs build() {
            if ($.role == null) {
                throw new MissingRequiredPropertyException("StreamConnectionDbRoleToExecuteArgs", "role");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("StreamConnectionDbRoleToExecuteArgs", "type");
            }
            return $;
        }
    }

}