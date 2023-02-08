// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLdapConfigurationUserToDnMapping {
    private String ldapQuery;
    private String match;
    private String substitution;

    private GetLdapConfigurationUserToDnMapping() {}
    public String ldapQuery() {
        return this.ldapQuery;
    }
    public String match() {
        return this.match;
    }
    public String substitution() {
        return this.substitution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLdapConfigurationUserToDnMapping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ldapQuery;
        private String match;
        private String substitution;
        public Builder() {}
        public Builder(GetLdapConfigurationUserToDnMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ldapQuery = defaults.ldapQuery;
    	      this.match = defaults.match;
    	      this.substitution = defaults.substitution;
        }

        @CustomType.Setter
        public Builder ldapQuery(String ldapQuery) {
            this.ldapQuery = Objects.requireNonNull(ldapQuery);
            return this;
        }
        @CustomType.Setter
        public Builder match(String match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }
        @CustomType.Setter
        public Builder substitution(String substitution) {
            this.substitution = Objects.requireNonNull(substitution);
            return this;
        }
        public GetLdapConfigurationUserToDnMapping build() {
            final var o = new GetLdapConfigurationUserToDnMapping();
            o.ldapQuery = ldapQuery;
            o.match = match;
            o.substitution = substitution;
            return o;
        }
    }
}