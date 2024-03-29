// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCustomDbRoleActionResource {
    private Boolean cluster;
    private String collectionName;
    /**
     * @return (Required) Database on which the inherited role is granted.
     * 
     */
    private String databaseName;

    private GetCustomDbRoleActionResource() {}
    public Boolean cluster() {
        return this.cluster;
    }
    public String collectionName() {
        return this.collectionName;
    }
    /**
     * @return (Required) Database on which the inherited role is granted.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomDbRoleActionResource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean cluster;
        private String collectionName;
        private String databaseName;
        public Builder() {}
        public Builder(GetCustomDbRoleActionResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.collectionName = defaults.collectionName;
    	      this.databaseName = defaults.databaseName;
        }

        @CustomType.Setter
        public Builder cluster(Boolean cluster) {
            if (cluster == null) {
              throw new MissingRequiredPropertyException("GetCustomDbRoleActionResource", "cluster");
            }
            this.cluster = cluster;
            return this;
        }
        @CustomType.Setter
        public Builder collectionName(String collectionName) {
            if (collectionName == null) {
              throw new MissingRequiredPropertyException("GetCustomDbRoleActionResource", "collectionName");
            }
            this.collectionName = collectionName;
            return this;
        }
        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            if (databaseName == null) {
              throw new MissingRequiredPropertyException("GetCustomDbRoleActionResource", "databaseName");
            }
            this.databaseName = databaseName;
            return this;
        }
        public GetCustomDbRoleActionResource build() {
            final var _resultValue = new GetCustomDbRoleActionResource();
            _resultValue.cluster = cluster;
            _resultValue.collectionName = collectionName;
            _resultValue.databaseName = databaseName;
            return _resultValue;
        }
    }
}
