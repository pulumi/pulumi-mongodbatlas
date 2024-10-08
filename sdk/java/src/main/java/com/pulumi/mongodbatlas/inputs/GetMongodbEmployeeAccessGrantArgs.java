// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetMongodbEmployeeAccessGrantArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMongodbEmployeeAccessGrantArgs Empty = new GetMongodbEmployeeAccessGrantArgs();

    /**
     * Human-readable label that identifies this cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return Human-readable label that identifies this cluster.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private GetMongodbEmployeeAccessGrantArgs() {}

    private GetMongodbEmployeeAccessGrantArgs(GetMongodbEmployeeAccessGrantArgs $) {
        this.clusterName = $.clusterName;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMongodbEmployeeAccessGrantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMongodbEmployeeAccessGrantArgs $;

        public Builder() {
            $ = new GetMongodbEmployeeAccessGrantArgs();
        }

        public Builder(GetMongodbEmployeeAccessGrantArgs defaults) {
            $ = new GetMongodbEmployeeAccessGrantArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName Human-readable label that identifies this cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName Human-readable label that identifies this cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetMongodbEmployeeAccessGrantArgs build() {
            if ($.clusterName == null) {
                throw new MissingRequiredPropertyException("GetMongodbEmployeeAccessGrantArgs", "clusterName");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetMongodbEmployeeAccessGrantArgs", "projectId");
            }
            return $;
        }
    }

}
