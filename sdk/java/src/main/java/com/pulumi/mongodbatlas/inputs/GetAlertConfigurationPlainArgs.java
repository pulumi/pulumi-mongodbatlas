// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.inputs.GetAlertConfigurationOutput;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAlertConfigurationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAlertConfigurationPlainArgs Empty = new GetAlertConfigurationPlainArgs();

    /**
     * Unique identifier for the alert configuration.
     * 
     */
    @Import(name="alertConfigurationId", required=true)
    private String alertConfigurationId;

    /**
     * @return Unique identifier for the alert configuration.
     * 
     */
    public String alertConfigurationId() {
        return this.alertConfigurationId;
    }

    /**
     * List of formatted output requested for this alert configuration
     * * `output.#.type` - (Required) If the output is requested, you must specify its type. The format is computed as `output.#.value`, the following are the supported types:
     * 
     */
    @Import(name="outputs")
    private @Nullable List<GetAlertConfigurationOutput> outputs;

    /**
     * @return List of formatted output requested for this alert configuration
     * * `output.#.type` - (Required) If the output is requested, you must specify its type. The format is computed as `output.#.value`, the following are the supported types:
     * 
     */
    public Optional<List<GetAlertConfigurationOutput>> outputs() {
        return Optional.ofNullable(this.outputs);
    }

    /**
     * The ID of the project where the alert configuration will create.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return The ID of the project where the alert configuration will create.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetAlertConfigurationPlainArgs() {}

    private GetAlertConfigurationPlainArgs(GetAlertConfigurationPlainArgs $) {
        this.alertConfigurationId = $.alertConfigurationId;
        this.outputs = $.outputs;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertConfigurationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertConfigurationPlainArgs $;

        public Builder() {
            $ = new GetAlertConfigurationPlainArgs();
        }

        public Builder(GetAlertConfigurationPlainArgs defaults) {
            $ = new GetAlertConfigurationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertConfigurationId Unique identifier for the alert configuration.
         * 
         * @return builder
         * 
         */
        public Builder alertConfigurationId(String alertConfigurationId) {
            $.alertConfigurationId = alertConfigurationId;
            return this;
        }

        /**
         * @param outputs List of formatted output requested for this alert configuration
         * * `output.#.type` - (Required) If the output is requested, you must specify its type. The format is computed as `output.#.value`, the following are the supported types:
         * 
         * @return builder
         * 
         */
        public Builder outputs(@Nullable List<GetAlertConfigurationOutput> outputs) {
            $.outputs = outputs;
            return this;
        }

        /**
         * @param outputs List of formatted output requested for this alert configuration
         * * `output.#.type` - (Required) If the output is requested, you must specify its type. The format is computed as `output.#.value`, the following are the supported types:
         * 
         * @return builder
         * 
         */
        public Builder outputs(GetAlertConfigurationOutput... outputs) {
            return outputs(List.of(outputs));
        }

        /**
         * @param projectId The ID of the project where the alert configuration will create.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetAlertConfigurationPlainArgs build() {
            if ($.alertConfigurationId == null) {
                throw new MissingRequiredPropertyException("GetAlertConfigurationPlainArgs", "alertConfigurationId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetAlertConfigurationPlainArgs", "projectId");
            }
            return $;
        }
    }

}
