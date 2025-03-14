// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAdvancedClusterBiConnectorConfig {
    /**
     * @return Specifies whether or not BI Connector for Atlas is enabled on the cluster.
     * 
     */
    private Boolean enabled;
    /**
     * @return Specifies the read preference to be used by BI Connector for Atlas on the cluster. Each BI Connector for Atlas read preference contains a distinct combination of [readPreference](https://docs.mongodb.com/manual/core/read-preference/) and [readPreferenceTags](https://docs.mongodb.com/manual/core/read-preference/#tag-sets) options. For details on BI Connector for Atlas read preferences, refer to the [BI Connector Read Preferences Table](https://docs.atlas.mongodb.com/tutorial/create-global-writes-cluster/#bic-read-preferences).
     * 
     */
    private String readPreference;

    private GetAdvancedClusterBiConnectorConfig() {}
    /**
     * @return Specifies whether or not BI Connector for Atlas is enabled on the cluster.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Specifies the read preference to be used by BI Connector for Atlas on the cluster. Each BI Connector for Atlas read preference contains a distinct combination of [readPreference](https://docs.mongodb.com/manual/core/read-preference/) and [readPreferenceTags](https://docs.mongodb.com/manual/core/read-preference/#tag-sets) options. For details on BI Connector for Atlas read preferences, refer to the [BI Connector Read Preferences Table](https://docs.atlas.mongodb.com/tutorial/create-global-writes-cluster/#bic-read-preferences).
     * 
     */
    public String readPreference() {
        return this.readPreference;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdvancedClusterBiConnectorConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String readPreference;
        public Builder() {}
        public Builder(GetAdvancedClusterBiConnectorConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.readPreference = defaults.readPreference;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterBiConnectorConfig", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder readPreference(String readPreference) {
            if (readPreference == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterBiConnectorConfig", "readPreference");
            }
            this.readPreference = readPreference;
            return this;
        }
        public GetAdvancedClusterBiConnectorConfig build() {
            final var _resultValue = new GetAdvancedClusterBiConnectorConfig();
            _resultValue.enabled = enabled;
            _resultValue.readPreference = readPreference;
            return _resultValue;
        }
    }
}
