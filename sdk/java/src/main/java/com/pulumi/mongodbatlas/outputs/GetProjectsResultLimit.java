// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetProjectsResultLimit {
    private Integer currentUsage;
    private Integer defaultLimit;
    private Integer maximumLimit;
    /**
     * @return The name of the project you want to create.
     * 
     */
    private String name;
    private Integer value;

    private GetProjectsResultLimit() {}
    public Integer currentUsage() {
        return this.currentUsage;
    }
    public Integer defaultLimit() {
        return this.defaultLimit;
    }
    public Integer maximumLimit() {
        return this.maximumLimit;
    }
    /**
     * @return The name of the project you want to create.
     * 
     */
    public String name() {
        return this.name;
    }
    public Integer value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectsResultLimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer currentUsage;
        private Integer defaultLimit;
        private Integer maximumLimit;
        private String name;
        private Integer value;
        public Builder() {}
        public Builder(GetProjectsResultLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentUsage = defaults.currentUsage;
    	      this.defaultLimit = defaults.defaultLimit;
    	      this.maximumLimit = defaults.maximumLimit;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder currentUsage(Integer currentUsage) {
            this.currentUsage = Objects.requireNonNull(currentUsage);
            return this;
        }
        @CustomType.Setter
        public Builder defaultLimit(Integer defaultLimit) {
            this.defaultLimit = Objects.requireNonNull(defaultLimit);
            return this;
        }
        @CustomType.Setter
        public Builder maximumLimit(Integer maximumLimit) {
            this.maximumLimit = Objects.requireNonNull(maximumLimit);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder value(Integer value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetProjectsResultLimit build() {
            final var _resultValue = new GetProjectsResultLimit();
            _resultValue.currentUsage = currentUsage;
            _resultValue.defaultLimit = defaultLimit;
            _resultValue.maximumLimit = maximumLimit;
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
