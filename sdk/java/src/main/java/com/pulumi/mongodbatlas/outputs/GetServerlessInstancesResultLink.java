// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServerlessInstancesResultLink {
    private String href;
    private String rel;

    private GetServerlessInstancesResultLink() {}
    public String href() {
        return this.href;
    }
    public String rel() {
        return this.rel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerlessInstancesResultLink defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String href;
        private String rel;
        public Builder() {}
        public Builder(GetServerlessInstancesResultLink defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.href = defaults.href;
    	      this.rel = defaults.rel;
        }

        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetServerlessInstancesResultLink", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder rel(String rel) {
            if (rel == null) {
              throw new MissingRequiredPropertyException("GetServerlessInstancesResultLink", "rel");
            }
            this.rel = rel;
            return this;
        }
        public GetServerlessInstancesResultLink build() {
            final var _resultValue = new GetServerlessInstancesResultLink();
            _resultValue.href = href;
            _resultValue.rel = rel;
            return _resultValue;
        }
    }
}