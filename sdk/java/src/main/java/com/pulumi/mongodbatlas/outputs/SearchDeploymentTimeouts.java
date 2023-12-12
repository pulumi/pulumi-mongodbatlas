// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SearchDeploymentTimeouts {
    private @Nullable String create;
    private @Nullable String delete;
    private @Nullable String update;

    private SearchDeploymentTimeouts() {}
    public Optional<String> create() {
        return Optional.ofNullable(this.create);
    }
    public Optional<String> delete() {
        return Optional.ofNullable(this.delete);
    }
    public Optional<String> update() {
        return Optional.ofNullable(this.update);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SearchDeploymentTimeouts defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String create;
        private @Nullable String delete;
        private @Nullable String update;
        public Builder() {}
        public Builder(SearchDeploymentTimeouts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.create = defaults.create;
    	      this.delete = defaults.delete;
    	      this.update = defaults.update;
        }

        @CustomType.Setter
        public Builder create(@Nullable String create) {
            this.create = create;
            return this;
        }
        @CustomType.Setter
        public Builder delete(@Nullable String delete) {
            this.delete = delete;
            return this;
        }
        @CustomType.Setter
        public Builder update(@Nullable String update) {
            this.update = update;
            return this;
        }
        public SearchDeploymentTimeouts build() {
            final var _resultValue = new SearchDeploymentTimeouts();
            _resultValue.create = create;
            _resultValue.delete = delete;
            _resultValue.update = update;
            return _resultValue;
        }
    }
}
