// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSearchDeploymentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSearchDeploymentPlainArgs Empty = new GetSearchDeploymentPlainArgs();

    /**
     * Label that identifies the cluster to return the search nodes for.
     * 
     */
    @Import(name="clusterName", required=true)
    private String clusterName;

    /**
     * @return Label that identifies the cluster to return the search nodes for.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }

    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
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
         * @param clusterName Label that identifies the cluster to return the search nodes for.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetSearchDeploymentPlainArgs build() {
            if ($.clusterName == null) {
                throw new MissingRequiredPropertyException("GetSearchDeploymentPlainArgs", "clusterName");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetSearchDeploymentPlainArgs", "projectId");
            }
            return $;
        }
    }

}
