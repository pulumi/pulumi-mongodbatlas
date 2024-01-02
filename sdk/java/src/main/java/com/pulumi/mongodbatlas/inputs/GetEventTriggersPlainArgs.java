// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetEventTriggersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventTriggersPlainArgs Empty = new GetEventTriggersPlainArgs();

    /**
     * The ObjectID of your application.
     * * For more details on `project_id` and `app_id` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
     * 
     */
    @Import(name="appId", required=true)
    private String appId;

    /**
     * @return The ObjectID of your application.
     * * For more details on `project_id` and `app_id` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
     * 
     */
    public String appId() {
        return this.appId;
    }

    /**
     * The unique ID for the project to get all event triggers.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return The unique ID for the project to get all event triggers.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetEventTriggersPlainArgs() {}

    private GetEventTriggersPlainArgs(GetEventTriggersPlainArgs $) {
        this.appId = $.appId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventTriggersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventTriggersPlainArgs $;

        public Builder() {
            $ = new GetEventTriggersPlainArgs();
        }

        public Builder(GetEventTriggersPlainArgs defaults) {
            $ = new GetEventTriggersPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The ObjectID of your application.
         * * For more details on `project_id` and `app_id` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param projectId The unique ID for the project to get all event triggers.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetEventTriggersPlainArgs build() {
            if ($.appId == null) {
                throw new MissingRequiredPropertyException("GetEventTriggersPlainArgs", "appId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetEventTriggersPlainArgs", "projectId");
            }
            return $;
        }
    }

}
