// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEventTriggersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventTriggersArgs Empty = new GetEventTriggersArgs();

    /**
     * The ObjectID of your application.
     * 
     */
    @Import(name="appId", required=true)
    private Output<String> appId;

    /**
     * @return The ObjectID of your application.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }

    /**
     * The unique ID for the project to get all event triggers.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The unique ID for the project to get all event triggers.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private GetEventTriggersArgs() {}

    private GetEventTriggersArgs(GetEventTriggersArgs $) {
        this.appId = $.appId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventTriggersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventTriggersArgs $;

        public Builder() {
            $ = new GetEventTriggersArgs();
        }

        public Builder(GetEventTriggersArgs defaults) {
            $ = new GetEventTriggersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The ObjectID of your application.
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
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param projectId The unique ID for the project to get all event triggers.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique ID for the project to get all event triggers.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetEventTriggersArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}