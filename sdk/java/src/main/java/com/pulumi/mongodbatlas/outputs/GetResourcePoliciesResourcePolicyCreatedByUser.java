// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResourcePoliciesResourcePolicyCreatedByUser {
    /**
     * @return Unique 24-hexadecimal character string that identifies a user.
     * 
     */
    private String id;
    /**
     * @return Human-readable label that describes a user.
     * 
     */
    private String name;

    private GetResourcePoliciesResourcePolicyCreatedByUser() {}
    /**
     * @return Unique 24-hexadecimal character string that identifies a user.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Human-readable label that describes a user.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePoliciesResourcePolicyCreatedByUser defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetResourcePoliciesResourcePolicyCreatedByUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetResourcePoliciesResourcePolicyCreatedByUser", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetResourcePoliciesResourcePolicyCreatedByUser", "name");
            }
            this.name = name;
            return this;
        }
        public GetResourcePoliciesResourcePolicyCreatedByUser build() {
            final var _resultValue = new GetResourcePoliciesResourcePolicyCreatedByUser();
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
