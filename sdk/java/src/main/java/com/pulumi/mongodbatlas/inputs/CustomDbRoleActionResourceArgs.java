// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomDbRoleActionResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomDbRoleActionResourceArgs Empty = new CustomDbRoleActionResourceArgs();

    /**
     * `resources.#.cluster`	(Optional) Set to true to indicate that the action is granted on the cluster resource.
     * 
     * &gt; **NOTE** This field is mutually exclusive with the `actions.resources.collection` and `actions.resources.db fields`.
     * 
     */
    @Import(name="cluster")
    private @Nullable Output<Boolean> cluster;

    /**
     * @return `resources.#.cluster`	(Optional) Set to true to indicate that the action is granted on the cluster resource.
     * 
     * &gt; **NOTE** This field is mutually exclusive with the `actions.resources.collection` and `actions.resources.db fields`.
     * 
     */
    public Optional<Output<Boolean>> cluster() {
        return Optional.ofNullable(this.cluster);
    }

    /**
     * `resources.#.collection_name` - (Optional) Collection on which the action is granted. If this value is an empty string, the action is granted on all collections within the database specified in the actions.resources.db field.
     * 
     * &gt; **NOTE** This field is mutually exclusive with the `actions.resources.cluster` field.
     * 
     */
    @Import(name="collectionName")
    private @Nullable Output<String> collectionName;

    /**
     * @return `resources.#.collection_name` - (Optional) Collection on which the action is granted. If this value is an empty string, the action is granted on all collections within the database specified in the actions.resources.db field.
     * 
     * &gt; **NOTE** This field is mutually exclusive with the `actions.resources.cluster` field.
     * 
     */
    public Optional<Output<String>> collectionName() {
        return Optional.ofNullable(this.collectionName);
    }

    /**
     * `resources.#.database_name`	Database on which the action is granted.
     * 
     * &gt; **NOTE** This field is mutually exclusive with the `actions.resources.cluster` field.
     * 
     */
    @Import(name="databaseName")
    private @Nullable Output<String> databaseName;

    /**
     * @return `resources.#.database_name`	Database on which the action is granted.
     * 
     * &gt; **NOTE** This field is mutually exclusive with the `actions.resources.cluster` field.
     * 
     */
    public Optional<Output<String>> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }

    private CustomDbRoleActionResourceArgs() {}

    private CustomDbRoleActionResourceArgs(CustomDbRoleActionResourceArgs $) {
        this.cluster = $.cluster;
        this.collectionName = $.collectionName;
        this.databaseName = $.databaseName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDbRoleActionResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDbRoleActionResourceArgs $;

        public Builder() {
            $ = new CustomDbRoleActionResourceArgs();
        }

        public Builder(CustomDbRoleActionResourceArgs defaults) {
            $ = new CustomDbRoleActionResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cluster `resources.#.cluster`	(Optional) Set to true to indicate that the action is granted on the cluster resource.
         * 
         * &gt; **NOTE** This field is mutually exclusive with the `actions.resources.collection` and `actions.resources.db fields`.
         * 
         * @return builder
         * 
         */
        public Builder cluster(@Nullable Output<Boolean> cluster) {
            $.cluster = cluster;
            return this;
        }

        /**
         * @param cluster `resources.#.cluster`	(Optional) Set to true to indicate that the action is granted on the cluster resource.
         * 
         * &gt; **NOTE** This field is mutually exclusive with the `actions.resources.collection` and `actions.resources.db fields`.
         * 
         * @return builder
         * 
         */
        public Builder cluster(Boolean cluster) {
            return cluster(Output.of(cluster));
        }

        /**
         * @param collectionName `resources.#.collection_name` - (Optional) Collection on which the action is granted. If this value is an empty string, the action is granted on all collections within the database specified in the actions.resources.db field.
         * 
         * &gt; **NOTE** This field is mutually exclusive with the `actions.resources.cluster` field.
         * 
         * @return builder
         * 
         */
        public Builder collectionName(@Nullable Output<String> collectionName) {
            $.collectionName = collectionName;
            return this;
        }

        /**
         * @param collectionName `resources.#.collection_name` - (Optional) Collection on which the action is granted. If this value is an empty string, the action is granted on all collections within the database specified in the actions.resources.db field.
         * 
         * &gt; **NOTE** This field is mutually exclusive with the `actions.resources.cluster` field.
         * 
         * @return builder
         * 
         */
        public Builder collectionName(String collectionName) {
            return collectionName(Output.of(collectionName));
        }

        /**
         * @param databaseName `resources.#.database_name`	Database on which the action is granted.
         * 
         * &gt; **NOTE** This field is mutually exclusive with the `actions.resources.cluster` field.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(@Nullable Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName `resources.#.database_name`	Database on which the action is granted.
         * 
         * &gt; **NOTE** This field is mutually exclusive with the `actions.resources.cluster` field.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        public CustomDbRoleActionResourceArgs build() {
            return $;
        }
    }

}
