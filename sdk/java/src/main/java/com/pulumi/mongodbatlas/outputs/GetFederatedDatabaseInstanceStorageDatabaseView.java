// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFederatedDatabaseInstanceStorageDatabaseView {
    /**
     * @return Name of the Atlas Federated Database Instance.
     * 
     */
    private String name;
    private String pipeline;
    private String source;

    private GetFederatedDatabaseInstanceStorageDatabaseView() {}
    /**
     * @return Name of the Atlas Federated Database Instance.
     * 
     */
    public String name() {
        return this.name;
    }
    public String pipeline() {
        return this.pipeline;
    }
    public String source() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFederatedDatabaseInstanceStorageDatabaseView defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String pipeline;
        private String source;
        public Builder() {}
        public Builder(GetFederatedDatabaseInstanceStorageDatabaseView defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.pipeline = defaults.pipeline;
    	      this.source = defaults.source;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstanceStorageDatabaseView", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder pipeline(String pipeline) {
            if (pipeline == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstanceStorageDatabaseView", "pipeline");
            }
            this.pipeline = pipeline;
            return this;
        }
        @CustomType.Setter
        public Builder source(String source) {
            if (source == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstanceStorageDatabaseView", "source");
            }
            this.source = source;
            return this;
        }
        public GetFederatedDatabaseInstanceStorageDatabaseView build() {
            final var _resultValue = new GetFederatedDatabaseInstanceStorageDatabaseView();
            _resultValue.name = name;
            _resultValue.pipeline = pipeline;
            _resultValue.source = source;
            return _resultValue;
        }
    }
}