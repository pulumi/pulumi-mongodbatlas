// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetSearchDeploymentSpec;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSearchDeploymentResult {
    private String clusterName;
    private String id;
    private String projectId;
    /**
     * @return List of settings that configure the search nodes for your cluster. See specs.
     * 
     */
    private List<GetSearchDeploymentSpec> specs;
    /**
     * @return Human-readable label that indicates the current operating condition of this search node deployment.
     * 
     */
    private String stateName;

    private GetSearchDeploymentResult() {}
    public String clusterName() {
        return this.clusterName;
    }
    public String id() {
        return this.id;
    }
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return List of settings that configure the search nodes for your cluster. See specs.
     * 
     */
    public List<GetSearchDeploymentSpec> specs() {
        return this.specs;
    }
    /**
     * @return Human-readable label that indicates the current operating condition of this search node deployment.
     * 
     */
    public String stateName() {
        return this.stateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSearchDeploymentResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clusterName;
        private String id;
        private String projectId;
        private List<GetSearchDeploymentSpec> specs;
        private String stateName;
        public Builder() {}
        public Builder(GetSearchDeploymentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.id = defaults.id;
    	      this.projectId = defaults.projectId;
    	      this.specs = defaults.specs;
    	      this.stateName = defaults.stateName;
        }

        @CustomType.Setter
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder specs(List<GetSearchDeploymentSpec> specs) {
            this.specs = Objects.requireNonNull(specs);
            return this;
        }
        public Builder specs(GetSearchDeploymentSpec... specs) {
            return specs(List.of(specs));
        }
        @CustomType.Setter
        public Builder stateName(String stateName) {
            this.stateName = Objects.requireNonNull(stateName);
            return this;
        }
        public GetSearchDeploymentResult build() {
            final var o = new GetSearchDeploymentResult();
            o.clusterName = clusterName;
            o.id = id;
            o.projectId = projectId;
            o.specs = specs;
            o.stateName = stateName;
            return o;
        }
    }
}