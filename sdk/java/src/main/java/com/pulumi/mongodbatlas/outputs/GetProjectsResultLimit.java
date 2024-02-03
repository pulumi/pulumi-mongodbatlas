// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetProjectsResultLimit {
    /**
     * @return Amount that indicates the current usage of the limit.
     * 
     */
    private Integer currentUsage;
    /**
     * @return Default value of the limit.
     * 
     */
    private Integer defaultLimit;
    /**
     * @return Maximum value of the limit.
     * 
     */
    private Integer maximumLimit;
    /**
     * @return Human-readable label that identifies this project limit.
     * 
     */
    private String name;
    /**
     * @return Amount the limit is set to.
     * 
     */
    private Integer value;

    private GetProjectsResultLimit() {}
    /**
     * @return Amount that indicates the current usage of the limit.
     * 
     */
    public Integer currentUsage() {
        return this.currentUsage;
    }
    /**
     * @return Default value of the limit.
     * 
     */
    public Integer defaultLimit() {
        return this.defaultLimit;
    }
    /**
     * @return Maximum value of the limit.
     * 
     */
    public Integer maximumLimit() {
        return this.maximumLimit;
    }
    /**
     * @return Human-readable label that identifies this project limit.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Amount the limit is set to.
     * 
     */
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
            if (currentUsage == null) {
              throw new MissingRequiredPropertyException("GetProjectsResultLimit", "currentUsage");
            }
            this.currentUsage = currentUsage;
            return this;
        }
        @CustomType.Setter
        public Builder defaultLimit(Integer defaultLimit) {
            if (defaultLimit == null) {
              throw new MissingRequiredPropertyException("GetProjectsResultLimit", "defaultLimit");
            }
            this.defaultLimit = defaultLimit;
            return this;
        }
        @CustomType.Setter
        public Builder maximumLimit(Integer maximumLimit) {
            if (maximumLimit == null) {
              throw new MissingRequiredPropertyException("GetProjectsResultLimit", "maximumLimit");
            }
            this.maximumLimit = maximumLimit;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetProjectsResultLimit", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(Integer value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetProjectsResultLimit", "value");
            }
            this.value = value;
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
