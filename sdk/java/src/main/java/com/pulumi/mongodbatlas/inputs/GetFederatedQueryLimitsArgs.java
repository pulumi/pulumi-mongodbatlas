// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFederatedQueryLimitsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFederatedQueryLimitsArgs Empty = new GetFederatedQueryLimitsArgs();

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

    /**
     * Name of the Atlas Federated Database Instance.
     * 
     */
    @Import(name="tenantName", required=true)
    private Output<String> tenantName;

    /**
     * @return Name of the Atlas Federated Database Instance.
     * 
     */
    public Output<String> tenantName() {
        return this.tenantName;
    }

    private GetFederatedQueryLimitsArgs() {}

    private GetFederatedQueryLimitsArgs(GetFederatedQueryLimitsArgs $) {
        this.projectId = $.projectId;
        this.tenantName = $.tenantName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFederatedQueryLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFederatedQueryLimitsArgs $;

        public Builder() {
            $ = new GetFederatedQueryLimitsArgs();
        }

        public Builder(GetFederatedQueryLimitsArgs defaults) {
            $ = new GetFederatedQueryLimitsArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param tenantName Name of the Atlas Federated Database Instance.
         * 
         * @return builder
         * 
         */
        public Builder tenantName(Output<String> tenantName) {
            $.tenantName = tenantName;
            return this;
        }

        /**
         * @param tenantName Name of the Atlas Federated Database Instance.
         * 
         * @return builder
         * 
         */
        public Builder tenantName(String tenantName) {
            return tenantName(Output.of(tenantName));
        }

        public GetFederatedQueryLimitsArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.tenantName = Objects.requireNonNull($.tenantName, "expected parameter 'tenantName' to be non-null");
            return $;
        }
    }

}
