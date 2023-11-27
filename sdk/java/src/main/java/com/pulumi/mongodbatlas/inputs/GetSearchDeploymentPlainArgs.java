// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSearchDeploymentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSearchDeploymentPlainArgs Empty = new GetSearchDeploymentPlainArgs();

    /**
     * The name of the cluster containing a search node deployment.
     * 
     */
    @Import(name="clusterName", required=true)
    private String clusterName;

    /**
     * @return The name of the cluster containing a search node deployment.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }

    /**
     * The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetSearchDeploymentPlainArgs() {}

    private GetSearchDeploymentPlainArgs(GetSearchDeploymentPlainArgs $) {
        this.clusterName = $.clusterName;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSearchDeploymentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSearchDeploymentPlainArgs $;

        public Builder() {
            $ = new GetSearchDeploymentPlainArgs();
        }

        public Builder(GetSearchDeploymentPlainArgs defaults) {
            $ = new GetSearchDeploymentPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the cluster containing a search node deployment.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param projectId The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetSearchDeploymentPlainArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}