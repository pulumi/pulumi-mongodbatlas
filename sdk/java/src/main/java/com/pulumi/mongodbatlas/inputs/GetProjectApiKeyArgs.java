// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetProjectApiKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectApiKeyArgs Empty = new GetProjectApiKeyArgs();

    /**
     * Unique identifier for this Project API key.
     * 
     */
    @Import(name="apiKeyId", required=true)
    private Output<String> apiKeyId;

    /**
     * @return Unique identifier for this Project API key.
     * 
     */
    public Output<String> apiKeyId() {
        return this.apiKeyId;
    }

    /**
     * The unique ID for the project.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The unique ID for the project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private GetProjectApiKeyArgs() {}

    private GetProjectApiKeyArgs(GetProjectApiKeyArgs $) {
        this.apiKeyId = $.apiKeyId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectApiKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectApiKeyArgs $;

        public Builder() {
            $ = new GetProjectApiKeyArgs();
        }

        public Builder(GetProjectApiKeyArgs defaults) {
            $ = new GetProjectApiKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiKeyId Unique identifier for this Project API key.
         * 
         * @return builder
         * 
         */
        public Builder apiKeyId(Output<String> apiKeyId) {
            $.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * @param apiKeyId Unique identifier for this Project API key.
         * 
         * @return builder
         * 
         */
        public Builder apiKeyId(String apiKeyId) {
            return apiKeyId(Output.of(apiKeyId));
        }

        /**
         * @param projectId The unique ID for the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique ID for the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetProjectApiKeyArgs build() {
            if ($.apiKeyId == null) {
                throw new MissingRequiredPropertyException("GetProjectApiKeyArgs", "apiKeyId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetProjectApiKeyArgs", "projectId");
            }
            return $;
        }
    }

}
