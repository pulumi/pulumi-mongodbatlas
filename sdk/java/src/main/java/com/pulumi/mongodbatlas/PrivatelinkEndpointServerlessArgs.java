// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PrivatelinkEndpointServerlessArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivatelinkEndpointServerlessArgs Empty = new PrivatelinkEndpointServerlessArgs();

    /**
     * Human-readable label that identifies the serverless instance.
     * 
     */
    @Import(name="instanceName", required=true)
    private Output<String> instanceName;

    /**
     * @return Human-readable label that identifies the serverless instance.
     * 
     */
    public Output<String> instanceName() {
        return this.instanceName;
    }

    /**
     * Unique 24-digit hexadecimal string that identifies the project.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique 24-digit hexadecimal string that identifies the project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * Cloud provider name; AWS is currently supported
     * 
     */
    @Import(name="providerName", required=true)
    private Output<String> providerName;

    /**
     * @return Cloud provider name; AWS is currently supported
     * 
     */
    public Output<String> providerName() {
        return this.providerName;
    }

    private PrivatelinkEndpointServerlessArgs() {}

    private PrivatelinkEndpointServerlessArgs(PrivatelinkEndpointServerlessArgs $) {
        this.instanceName = $.instanceName;
        this.projectId = $.projectId;
        this.providerName = $.providerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivatelinkEndpointServerlessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivatelinkEndpointServerlessArgs $;

        public Builder() {
            $ = new PrivatelinkEndpointServerlessArgs();
        }

        public Builder(PrivatelinkEndpointServerlessArgs defaults) {
            $ = new PrivatelinkEndpointServerlessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceName Human-readable label that identifies the serverless instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName Human-readable label that identifies the serverless instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        /**
         * @param projectId Unique 24-digit hexadecimal string that identifies the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique 24-digit hexadecimal string that identifies the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param providerName Cloud provider name; AWS is currently supported
         * 
         * @return builder
         * 
         */
        public Builder providerName(Output<String> providerName) {
            $.providerName = providerName;
            return this;
        }

        /**
         * @param providerName Cloud provider name; AWS is currently supported
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            return providerName(Output.of(providerName));
        }

        public PrivatelinkEndpointServerlessArgs build() {
            $.instanceName = Objects.requireNonNull($.instanceName, "expected parameter 'instanceName' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.providerName = Objects.requireNonNull($.providerName, "expected parameter 'providerName' to be non-null");
            return $;
        }
    }

}
