// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseUserScopeArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseUserScopeArgs Empty = new DatabaseUserScopeArgs();

    /**
     * Name of the cluster or Atlas Data Lake that the user has access to.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the cluster or Atlas Data Lake that the user has access to.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Type of resource that the user has access to. Valid values are: `CLUSTER` and `DATA_LAKE`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of resource that the user has access to. Valid values are: `CLUSTER` and `DATA_LAKE`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private DatabaseUserScopeArgs() {}

    private DatabaseUserScopeArgs(DatabaseUserScopeArgs $) {
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseUserScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseUserScopeArgs $;

        public Builder() {
            $ = new DatabaseUserScopeArgs();
        }

        public Builder(DatabaseUserScopeArgs defaults) {
            $ = new DatabaseUserScopeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the cluster or Atlas Data Lake that the user has access to.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the cluster or Atlas Data Lake that the user has access to.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Type of resource that the user has access to. Valid values are: `CLUSTER` and `DATA_LAKE`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of resource that the user has access to. Valid values are: `CLUSTER` and `DATA_LAKE`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DatabaseUserScopeArgs build() {
            return $;
        }
    }

}
