// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetOrganizationsResultLink {
    private String href;
    private String rel;

    private GetOrganizationsResultLink() {}
    public String href() {
        return this.href;
    }
    public String rel() {
        return this.rel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationsResultLink defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String href;
        private String rel;
        public Builder() {}
        public Builder(GetOrganizationsResultLink defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.href = defaults.href;
    	      this.rel = defaults.rel;
        }

        @CustomType.Setter
        public Builder href(String href) {
            this.href = Objects.requireNonNull(href);
            return this;
        }
        @CustomType.Setter
        public Builder rel(String rel) {
            this.rel = Objects.requireNonNull(rel);
            return this;
        }
        public GetOrganizationsResultLink build() {
            final var o = new GetOrganizationsResultLink();
            o.href = href;
            o.rel = rel;
            return o;
        }
    }
}
