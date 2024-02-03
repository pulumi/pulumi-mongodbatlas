// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSearchDeploymentSpec {
    /**
     * @return Hardware specification for the search node instance sizes. The [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Atlas-Search/operation/createAtlasSearchDeployment) describes the valid values. More details can also be found in the [Search Node Documentation](https://www.mongodb.com/docs/atlas/cluster-config/multi-cloud-distribution/#search-tier).
     * 
     */
    private String instanceSize;
    /**
     * @return Number of search nodes in the cluster.
     * 
     */
    private Integer nodeCount;

    private GetSearchDeploymentSpec() {}
    /**
     * @return Hardware specification for the search node instance sizes. The [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Atlas-Search/operation/createAtlasSearchDeployment) describes the valid values. More details can also be found in the [Search Node Documentation](https://www.mongodb.com/docs/atlas/cluster-config/multi-cloud-distribution/#search-tier).
     * 
     */
    public String instanceSize() {
        return this.instanceSize;
    }
    /**
     * @return Number of search nodes in the cluster.
     * 
     */
    public Integer nodeCount() {
        return this.nodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSearchDeploymentSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String instanceSize;
        private Integer nodeCount;
        public Builder() {}
        public Builder(GetSearchDeploymentSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceSize = defaults.instanceSize;
    	      this.nodeCount = defaults.nodeCount;
        }

        @CustomType.Setter
        public Builder instanceSize(String instanceSize) {
            if (instanceSize == null) {
              throw new MissingRequiredPropertyException("GetSearchDeploymentSpec", "instanceSize");
            }
            this.instanceSize = instanceSize;
            return this;
        }
        @CustomType.Setter
        public Builder nodeCount(Integer nodeCount) {
            if (nodeCount == null) {
              throw new MissingRequiredPropertyException("GetSearchDeploymentSpec", "nodeCount");
            }
            this.nodeCount = nodeCount;
            return this;
        }
        public GetSearchDeploymentSpec build() {
            final var _resultValue = new GetSearchDeploymentSpec();
            _resultValue.instanceSize = instanceSize;
            _resultValue.nodeCount = nodeCount;
            return _resultValue;
        }
    }
}
