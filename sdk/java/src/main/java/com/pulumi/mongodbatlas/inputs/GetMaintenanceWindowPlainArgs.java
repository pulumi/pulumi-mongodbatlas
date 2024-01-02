// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetMaintenanceWindowPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMaintenanceWindowPlainArgs Empty = new GetMaintenanceWindowPlainArgs();

    /**
     * The unique identifier of the project for the Maintenance Window.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return The unique identifier of the project for the Maintenance Window.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetMaintenanceWindowPlainArgs() {}

    private GetMaintenanceWindowPlainArgs(GetMaintenanceWindowPlainArgs $) {
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMaintenanceWindowPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMaintenanceWindowPlainArgs $;

        public Builder() {
            $ = new GetMaintenanceWindowPlainArgs();
        }

        public Builder(GetMaintenanceWindowPlainArgs defaults) {
            $ = new GetMaintenanceWindowPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectId The unique identifier of the project for the Maintenance Window.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetMaintenanceWindowPlainArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetMaintenanceWindowPlainArgs", "projectId");
            }
            return $;
        }
    }

}
