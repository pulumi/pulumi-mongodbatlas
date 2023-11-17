// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFederatedQueryLimitPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFederatedQueryLimitPlainArgs Empty = new GetFederatedQueryLimitPlainArgs();

    /**
     * String enum that indicates whether the identity provider is active or not. Accepted values are:
     * 
     */
    @Import(name="limitName", required=true)
    private String limitName;

    /**
     * @return String enum that indicates whether the identity provider is active or not. Accepted values are:
     * 
     */
    public String limitName() {
        return this.limitName;
    }

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

    private GetFederatedQueryLimitPlainArgs() {}

    private GetFederatedQueryLimitPlainArgs(GetFederatedQueryLimitPlainArgs $) {
        this.limitName = $.limitName;
        this.projectId = $.projectId;
        this.tenantName = $.tenantName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFederatedQueryLimitPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFederatedQueryLimitPlainArgs $;

        public Builder() {
            $ = new GetFederatedQueryLimitPlainArgs();
        }

        public Builder(GetFederatedQueryLimitPlainArgs defaults) {
            $ = new GetFederatedQueryLimitPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param limitName String enum that indicates whether the identity provider is active or not. Accepted values are:
         * 
         * @return builder
         * 
         */
        public Builder limitName(String limitName) {
            $.limitName = limitName;
            return this;
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

        public GetFederatedQueryLimitPlainArgs build() {
            $.limitName = Objects.requireNonNull($.limitName, "expected parameter 'limitName' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.tenantName = Objects.requireNonNull($.tenantName, "expected parameter 'tenantName' to be non-null");
            return $;
        }
    }

}
