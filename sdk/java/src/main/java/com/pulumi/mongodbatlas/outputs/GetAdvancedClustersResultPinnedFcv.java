// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAdvancedClustersResultPinnedFcv {
    /**
     * @return Expiration date of the fixed FCV. This value is in the ISO 8601 timestamp format (e.g. &#34;2024-12-04T16:25:00Z&#34;).
     * 
     */
    private String expirationDate;
    /**
     * @return Feature compatibility version of the cluster.
     * 
     */
    private String version;

    private GetAdvancedClustersResultPinnedFcv() {}
    /**
     * @return Expiration date of the fixed FCV. This value is in the ISO 8601 timestamp format (e.g. &#34;2024-12-04T16:25:00Z&#34;).
     * 
     */
    public String expirationDate() {
        return this.expirationDate;
    }
    /**
     * @return Feature compatibility version of the cluster.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdvancedClustersResultPinnedFcv defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String expirationDate;
        private String version;
        public Builder() {}
        public Builder(GetAdvancedClustersResultPinnedFcv defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationDate = defaults.expirationDate;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder expirationDate(String expirationDate) {
            if (expirationDate == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultPinnedFcv", "expirationDate");
            }
            this.expirationDate = expirationDate;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultPinnedFcv", "version");
            }
            this.version = version;
            return this;
        }
        public GetAdvancedClustersResultPinnedFcv build() {
            final var _resultValue = new GetAdvancedClustersResultPinnedFcv();
            _resultValue.expirationDate = expirationDate;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
