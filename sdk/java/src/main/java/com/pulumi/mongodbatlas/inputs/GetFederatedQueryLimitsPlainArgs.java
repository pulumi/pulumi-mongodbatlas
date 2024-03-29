// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetFederatedQueryLimitsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFederatedQueryLimitsPlainArgs Empty = new GetFederatedQueryLimitsPlainArgs();

    /**
     * The unique ID for the project to create a Federated Database Instance.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return The unique ID for the project to create a Federated Database Instance.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    /**
     * Name of the Atlas Federated Database Instance.
     * 
     */
    @Import(name="tenantName", required=true)
    private String tenantName;

    /**
     * @return Name of the Atlas Federated Database Instance.
     * 
     */
    public String tenantName() {
        return this.tenantName;
    }

    private GetFederatedQueryLimitsPlainArgs() {}

    private GetFederatedQueryLimitsPlainArgs(GetFederatedQueryLimitsPlainArgs $) {
        this.projectId = $.projectId;
        this.tenantName = $.tenantName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFederatedQueryLimitsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFederatedQueryLimitsPlainArgs $;

        public Builder() {
            $ = new GetFederatedQueryLimitsPlainArgs();
        }

        public Builder(GetFederatedQueryLimitsPlainArgs defaults) {
            $ = new GetFederatedQueryLimitsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectId The unique ID for the project to create a Federated Database Instance.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param tenantName Name of the Atlas Federated Database Instance.
         * 
         * @return builder
         * 
         */
        public Builder tenantName(String tenantName) {
            $.tenantName = tenantName;
            return this;
        }

        public GetFederatedQueryLimitsPlainArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetFederatedQueryLimitsPlainArgs", "projectId");
            }
            if ($.tenantName == null) {
                throw new MissingRequiredPropertyException("GetFederatedQueryLimitsPlainArgs", "tenantName");
            }
            return $;
        }
    }

}
