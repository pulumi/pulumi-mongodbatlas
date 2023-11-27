// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SearchDeploymentTimeoutsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SearchDeploymentTimeoutsArgs Empty = new SearchDeploymentTimeoutsArgs();

    @Import(name="create")
    private @Nullable Output<String> create;

    public Optional<Output<String>> create() {
        return Optional.ofNullable(this.create);
    }

    @Import(name="delete")
    private @Nullable Output<String> delete;

    public Optional<Output<String>> delete() {
        return Optional.ofNullable(this.delete);
    }

    @Import(name="update")
    private @Nullable Output<String> update;

    public Optional<Output<String>> update() {
        return Optional.ofNullable(this.update);
    }

    private SearchDeploymentTimeoutsArgs() {}

    private SearchDeploymentTimeoutsArgs(SearchDeploymentTimeoutsArgs $) {
        this.create = $.create;
        this.delete = $.delete;
        this.update = $.update;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SearchDeploymentTimeoutsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SearchDeploymentTimeoutsArgs $;

        public Builder() {
            $ = new SearchDeploymentTimeoutsArgs();
        }

        public Builder(SearchDeploymentTimeoutsArgs defaults) {
            $ = new SearchDeploymentTimeoutsArgs(Objects.requireNonNull(defaults));
        }

        public Builder create(@Nullable Output<String> create) {
            $.create = create;
            return this;
        }

        public Builder create(String create) {
            return create(Output.of(create));
        }

        public Builder delete(@Nullable Output<String> delete) {
            $.delete = delete;
            return this;
        }

        public Builder delete(String delete) {
            return delete(Output.of(delete));
        }

        public Builder update(@Nullable Output<String> update) {
            $.update = update;
            return this;
        }

        public Builder update(String update) {
            return update(Output.of(update));
        }

        public SearchDeploymentTimeoutsArgs build() {
            return $;
        }
    }

}