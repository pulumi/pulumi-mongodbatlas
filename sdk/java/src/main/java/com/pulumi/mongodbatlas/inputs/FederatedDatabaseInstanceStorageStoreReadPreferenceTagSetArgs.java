// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.inputs.FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTagArgs;
import java.util.List;
import java.util.Objects;


public final class FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetArgs Empty = new FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetArgs();

    @Import(name="tags", required=true)
    private Output<List<FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTagArgs>> tags;

    public Output<List<FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTagArgs>> tags() {
        return this.tags;
    }

    private FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetArgs() {}

    private FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetArgs(FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetArgs $) {
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetArgs $;

        public Builder() {
            $ = new FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetArgs();
        }

        public Builder(FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetArgs defaults) {
            $ = new FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder tags(Output<List<FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetTagArgs... tags) {
            return tags(List.of(tags));
        }

        public FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetArgs build() {
            if ($.tags == null) {
                throw new MissingRequiredPropertyException("FederatedDatabaseInstanceStorageStoreReadPreferenceTagSetArgs", "tags");
            }
            return $;
        }
    }

}
