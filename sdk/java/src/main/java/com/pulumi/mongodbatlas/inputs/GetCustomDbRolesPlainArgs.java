// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetCustomDbRolesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCustomDbRolesPlainArgs Empty = new GetCustomDbRolesPlainArgs();

    /**
     * The unique ID for the project to get all custom db roles.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return The unique ID for the project to get all custom db roles.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetCustomDbRolesPlainArgs() {}

    private GetCustomDbRolesPlainArgs(GetCustomDbRolesPlainArgs $) {
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCustomDbRolesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCustomDbRolesPlainArgs $;

        public Builder() {
            $ = new GetCustomDbRolesPlainArgs();
        }

        public Builder(GetCustomDbRolesPlainArgs defaults) {
            $ = new GetCustomDbRolesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectId The unique ID for the project to get all custom db roles.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetCustomDbRolesPlainArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetCustomDbRolesPlainArgs", "projectId");
            }
            return $;
        }
    }

}
