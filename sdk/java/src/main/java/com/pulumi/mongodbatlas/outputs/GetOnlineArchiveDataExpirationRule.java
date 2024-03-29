// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetOnlineArchiveDataExpirationRule {
    private Integer expireAfterDays;

    private GetOnlineArchiveDataExpirationRule() {}
    public Integer expireAfterDays() {
        return this.expireAfterDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOnlineArchiveDataExpirationRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer expireAfterDays;
        public Builder() {}
        public Builder(GetOnlineArchiveDataExpirationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expireAfterDays = defaults.expireAfterDays;
        }

        @CustomType.Setter
        public Builder expireAfterDays(Integer expireAfterDays) {
            if (expireAfterDays == null) {
              throw new MissingRequiredPropertyException("GetOnlineArchiveDataExpirationRule", "expireAfterDays");
            }
            this.expireAfterDays = expireAfterDays;
            return this;
        }
        public GetOnlineArchiveDataExpirationRule build() {
            final var _resultValue = new GetOnlineArchiveDataExpirationRule();
            _resultValue.expireAfterDays = expireAfterDays;
            return _resultValue;
        }
    }
}
