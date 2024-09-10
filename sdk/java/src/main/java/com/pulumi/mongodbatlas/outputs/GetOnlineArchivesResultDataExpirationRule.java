// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetOnlineArchivesResultDataExpirationRule {
    private Integer expireAfterDays;

    private GetOnlineArchivesResultDataExpirationRule() {}
    public Integer expireAfterDays() {
        return this.expireAfterDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOnlineArchivesResultDataExpirationRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer expireAfterDays;
        public Builder() {}
        public Builder(GetOnlineArchivesResultDataExpirationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expireAfterDays = defaults.expireAfterDays;
        }

        @CustomType.Setter
        public Builder expireAfterDays(Integer expireAfterDays) {
            if (expireAfterDays == null) {
              throw new MissingRequiredPropertyException("GetOnlineArchivesResultDataExpirationRule", "expireAfterDays");
            }
            this.expireAfterDays = expireAfterDays;
            return this;
        }
        public GetOnlineArchivesResultDataExpirationRule build() {
            final var _resultValue = new GetOnlineArchivesResultDataExpirationRule();
            _resultValue.expireAfterDays = expireAfterDays;
            return _resultValue;
        }
    }
}