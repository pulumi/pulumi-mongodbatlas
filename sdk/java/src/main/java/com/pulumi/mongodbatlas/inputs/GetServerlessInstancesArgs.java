// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetServerlessInstancesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerlessInstancesArgs Empty = new GetServerlessInstancesArgs();

    /**
     * Unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private GetServerlessInstancesArgs() {}

    private GetServerlessInstancesArgs(GetServerlessInstancesArgs $) {
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerlessInstancesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerlessInstancesArgs $;

        public Builder() {
            $ = new GetServerlessInstancesArgs();
        }

        public Builder(GetServerlessInstancesArgs defaults) {
            $ = new GetServerlessInstancesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectId Unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetServerlessInstancesArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetServerlessInstancesArgs", "projectId");
            }
            return $;
        }
    }

}
