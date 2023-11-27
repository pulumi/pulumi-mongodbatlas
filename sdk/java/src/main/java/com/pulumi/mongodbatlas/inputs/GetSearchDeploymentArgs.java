// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSearchDeploymentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSearchDeploymentArgs Empty = new GetSearchDeploymentArgs();

    /**
     * The name of the cluster containing a search node deployment.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the cluster containing a search node deployment.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private GetSearchDeploymentArgs() {}

    private GetSearchDeploymentArgs(GetSearchDeploymentArgs $) {
        this.clusterName = $.clusterName;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSearchDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSearchDeploymentArgs $;

        public Builder() {
            $ = new GetSearchDeploymentArgs();
        }

        public Builder(GetSearchDeploymentArgs defaults) {
            $ = new GetSearchDeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the cluster containing a search node deployment.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the cluster containing a search node deployment.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param projectId The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetSearchDeploymentArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}