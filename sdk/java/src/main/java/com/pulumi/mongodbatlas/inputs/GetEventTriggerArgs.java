// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetEventTriggerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventTriggerArgs Empty = new GetEventTriggerArgs();

    /**
     * The ObjectID of your application.
     * * For more details on `project_id` and `app_id` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
     * 
     */
    @Import(name="appId", required=true)
    private Output<String> appId;

    /**
     * @return The ObjectID of your application.
     * * For more details on `project_id` and `app_id` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }

    /**
     * The unique ID for the project to create the trigger.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The unique ID for the project to create the trigger.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * The unique ID of the trigger.
     * 
     */
    @Import(name="triggerId", required=true)
    private Output<String> triggerId;

    /**
     * @return The unique ID of the trigger.
     * 
     */
    public Output<String> triggerId() {
        return this.triggerId;
    }

    private GetEventTriggerArgs() {}

    private GetEventTriggerArgs(GetEventTriggerArgs $) {
        this.appId = $.appId;
        this.projectId = $.projectId;
        this.triggerId = $.triggerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventTriggerArgs $;

        public Builder() {
            $ = new GetEventTriggerArgs();
        }

        public Builder(GetEventTriggerArgs defaults) {
            $ = new GetEventTriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The ObjectID of your application.
         * * For more details on `project_id` and `app_id` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
         * 
         * @return builder
         * 
         */
        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The ObjectID of your application.
         * * For more details on `project_id` and `app_id` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param projectId The unique ID for the project to create the trigger.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique ID for the project to create the trigger.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param triggerId The unique ID of the trigger.
         * 
         * @return builder
         * 
         */
        public Builder triggerId(Output<String> triggerId) {
            $.triggerId = triggerId;
            return this;
        }

        /**
         * @param triggerId The unique ID of the trigger.
         * 
         * @return builder
         * 
         */
        public Builder triggerId(String triggerId) {
            return triggerId(Output.of(triggerId));
        }

        public GetEventTriggerArgs build() {
            if ($.appId == null) {
                throw new MissingRequiredPropertyException("GetEventTriggerArgs", "appId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetEventTriggerArgs", "projectId");
            }
            if ($.triggerId == null) {
                throw new MissingRequiredPropertyException("GetEventTriggerArgs", "triggerId");
            }
            return $;
        }
    }

}