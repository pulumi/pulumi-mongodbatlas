// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetStreamPrivatelinkEndpointsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStreamPrivatelinkEndpointsPlainArgs Empty = new GetStreamPrivatelinkEndpointsPlainArgs();

    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.\n\n**NOTE**: Groups and projects are synonymous terms. Your group id is the same as your project id. For existing groups, your group or project id remains the same. The resource and corresponding endpoints use the term groups.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.\n\n**NOTE**: Groups and projects are synonymous terms. Your group id is the same as your project id. For existing groups, your group or project id remains the same. The resource and corresponding endpoints use the term groups.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetStreamPrivatelinkEndpointsPlainArgs() {}

    private GetStreamPrivatelinkEndpointsPlainArgs(GetStreamPrivatelinkEndpointsPlainArgs $) {
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamPrivatelinkEndpointsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamPrivatelinkEndpointsPlainArgs $;

        public Builder() {
            $ = new GetStreamPrivatelinkEndpointsPlainArgs();
        }

        public Builder(GetStreamPrivatelinkEndpointsPlainArgs defaults) {
            $ = new GetStreamPrivatelinkEndpointsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.\n\n**NOTE**: Groups and projects are synonymous terms. Your group id is the same as your project id. For existing groups, your group or project id remains the same. The resource and corresponding endpoints use the term groups.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetStreamPrivatelinkEndpointsPlainArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetStreamPrivatelinkEndpointsPlainArgs", "projectId");
            }
            return $;
        }
    }

}
