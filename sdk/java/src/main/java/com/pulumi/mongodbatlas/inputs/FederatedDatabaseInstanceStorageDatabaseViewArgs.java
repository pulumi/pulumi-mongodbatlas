// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FederatedDatabaseInstanceStorageDatabaseViewArgs extends com.pulumi.resources.ResourceArgs {

    public static final FederatedDatabaseInstanceStorageDatabaseViewArgs Empty = new FederatedDatabaseInstanceStorageDatabaseViewArgs();

    /**
     * Name of the Atlas Federated Database Instance.
     * ### `cloud_provider_config` - (Optional) Cloud provider linked to this data federated instance.
     * #### `aws` - (Required) AWS provider of the cloud service where the Federated Database Instance can access the S3 Bucket. Note this parameter is only required if using `cloud_provider_config` since AWS is currently the only supported Cloud vendor on this feature at this time.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Atlas Federated Database Instance.
     * ### `cloud_provider_config` - (Optional) Cloud provider linked to this data federated instance.
     * #### `aws` - (Required) AWS provider of the cloud service where the Federated Database Instance can access the S3 Bucket. Note this parameter is only required if using `cloud_provider_config` since AWS is currently the only supported Cloud vendor on this feature at this time.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="pipeline")
    private @Nullable Output<String> pipeline;

    public Optional<Output<String>> pipeline() {
        return Optional.ofNullable(this.pipeline);
    }

    @Import(name="source")
    private @Nullable Output<String> source;

    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    private FederatedDatabaseInstanceStorageDatabaseViewArgs() {}

    private FederatedDatabaseInstanceStorageDatabaseViewArgs(FederatedDatabaseInstanceStorageDatabaseViewArgs $) {
        this.name = $.name;
        this.pipeline = $.pipeline;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FederatedDatabaseInstanceStorageDatabaseViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FederatedDatabaseInstanceStorageDatabaseViewArgs $;

        public Builder() {
            $ = new FederatedDatabaseInstanceStorageDatabaseViewArgs();
        }

        public Builder(FederatedDatabaseInstanceStorageDatabaseViewArgs defaults) {
            $ = new FederatedDatabaseInstanceStorageDatabaseViewArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the Atlas Federated Database Instance.
         * ### `cloud_provider_config` - (Optional) Cloud provider linked to this data federated instance.
         * #### `aws` - (Required) AWS provider of the cloud service where the Federated Database Instance can access the S3 Bucket. Note this parameter is only required if using `cloud_provider_config` since AWS is currently the only supported Cloud vendor on this feature at this time.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Atlas Federated Database Instance.
         * ### `cloud_provider_config` - (Optional) Cloud provider linked to this data federated instance.
         * #### `aws` - (Required) AWS provider of the cloud service where the Federated Database Instance can access the S3 Bucket. Note this parameter is only required if using `cloud_provider_config` since AWS is currently the only supported Cloud vendor on this feature at this time.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder pipeline(@Nullable Output<String> pipeline) {
            $.pipeline = pipeline;
            return this;
        }

        public Builder pipeline(String pipeline) {
            return pipeline(Output.of(pipeline));
        }

        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public FederatedDatabaseInstanceStorageDatabaseViewArgs build() {
            return $;
        }
    }

}