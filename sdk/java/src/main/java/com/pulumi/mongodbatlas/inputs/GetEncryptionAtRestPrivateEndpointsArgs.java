// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetEncryptionAtRestPrivateEndpointsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEncryptionAtRestPrivateEndpointsArgs Empty = new GetEncryptionAtRestPrivateEndpointsArgs();

    /**
     * Human-readable label that identifies the cloud provider for the private endpoints to return.
     * 
     */
    @Import(name="cloudProvider", required=true)
    private Output<String> cloudProvider;

    /**
     * @return Human-readable label that identifies the cloud provider for the private endpoints to return.
     * 
     */
    public Output<String> cloudProvider() {
        return this.cloudProvider;
    }

    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private GetEncryptionAtRestPrivateEndpointsArgs() {}

    private GetEncryptionAtRestPrivateEndpointsArgs(GetEncryptionAtRestPrivateEndpointsArgs $) {
        this.cloudProvider = $.cloudProvider;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEncryptionAtRestPrivateEndpointsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEncryptionAtRestPrivateEndpointsArgs $;

        public Builder() {
            $ = new GetEncryptionAtRestPrivateEndpointsArgs();
        }

        public Builder(GetEncryptionAtRestPrivateEndpointsArgs defaults) {
            $ = new GetEncryptionAtRestPrivateEndpointsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudProvider Human-readable label that identifies the cloud provider for the private endpoints to return.
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(Output<String> cloudProvider) {
            $.cloudProvider = cloudProvider;
            return this;
        }

        /**
         * @param cloudProvider Human-readable label that identifies the cloud provider for the private endpoints to return.
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(String cloudProvider) {
            return cloudProvider(Output.of(cloudProvider));
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetEncryptionAtRestPrivateEndpointsArgs build() {
            if ($.cloudProvider == null) {
                throw new MissingRequiredPropertyException("GetEncryptionAtRestPrivateEndpointsArgs", "cloudProvider");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetEncryptionAtRestPrivateEndpointsArgs", "projectId");
            }
            return $;
        }
    }

}