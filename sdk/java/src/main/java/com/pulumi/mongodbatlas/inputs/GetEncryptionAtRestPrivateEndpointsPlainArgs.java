// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetEncryptionAtRestPrivateEndpointsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEncryptionAtRestPrivateEndpointsPlainArgs Empty = new GetEncryptionAtRestPrivateEndpointsPlainArgs();

    /**
     * Human-readable label that identifies the cloud provider for the private endpoints to return.
     * 
     */
    @Import(name="cloudProvider", required=true)
    private String cloudProvider;

    /**
     * @return Human-readable label that identifies the cloud provider for the private endpoints to return.
     * 
     */
    public String cloudProvider() {
        return this.cloudProvider;
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

    private GetEncryptionAtRestPrivateEndpointsPlainArgs() {}

    private GetEncryptionAtRestPrivateEndpointsPlainArgs(GetEncryptionAtRestPrivateEndpointsPlainArgs $) {
        this.cloudProvider = $.cloudProvider;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEncryptionAtRestPrivateEndpointsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEncryptionAtRestPrivateEndpointsPlainArgs $;

        public Builder() {
            $ = new GetEncryptionAtRestPrivateEndpointsPlainArgs();
        }

        public Builder(GetEncryptionAtRestPrivateEndpointsPlainArgs defaults) {
            $ = new GetEncryptionAtRestPrivateEndpointsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudProvider Human-readable label that identifies the cloud provider for the private endpoints to return.
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(String cloudProvider) {
            $.cloudProvider = cloudProvider;
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

        public GetEncryptionAtRestPrivateEndpointsPlainArgs build() {
            if ($.cloudProvider == null) {
                throw new MissingRequiredPropertyException("GetEncryptionAtRestPrivateEndpointsPlainArgs", "cloudProvider");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetEncryptionAtRestPrivateEndpointsPlainArgs", "projectId");
            }
            return $;
        }
    }

}
