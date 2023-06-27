// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFederatedDatabaseInstancesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFederatedDatabaseInstancesArgs Empty = new GetFederatedDatabaseInstancesArgs();

    /**
     * The unique ID for the project to create a Federated Database Instance.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The unique ID for the project to create a Federated Database Instance.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private GetFederatedDatabaseInstancesArgs() {}

    private GetFederatedDatabaseInstancesArgs(GetFederatedDatabaseInstancesArgs $) {
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFederatedDatabaseInstancesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFederatedDatabaseInstancesArgs $;

        public Builder() {
            $ = new GetFederatedDatabaseInstancesArgs();
        }

        public Builder(GetFederatedDatabaseInstancesArgs defaults) {
            $ = new GetFederatedDatabaseInstancesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectId The unique ID for the project to create a Federated Database Instance.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique ID for the project to create a Federated Database Instance.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetFederatedDatabaseInstancesArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}
