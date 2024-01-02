// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetPrivatelinkEndpointServiceDataFederationOnlineArchivesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivatelinkEndpointServiceDataFederationOnlineArchivesPlainArgs Empty = new GetPrivatelinkEndpointServiceDataFederationOnlineArchivesPlainArgs();

    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetPrivatelinkEndpointServiceDataFederationOnlineArchivesPlainArgs() {}

    private GetPrivatelinkEndpointServiceDataFederationOnlineArchivesPlainArgs(GetPrivatelinkEndpointServiceDataFederationOnlineArchivesPlainArgs $) {
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivatelinkEndpointServiceDataFederationOnlineArchivesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivatelinkEndpointServiceDataFederationOnlineArchivesPlainArgs $;

        public Builder() {
            $ = new GetPrivatelinkEndpointServiceDataFederationOnlineArchivesPlainArgs();
        }

        public Builder(GetPrivatelinkEndpointServiceDataFederationOnlineArchivesPlainArgs defaults) {
            $ = new GetPrivatelinkEndpointServiceDataFederationOnlineArchivesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetPrivatelinkEndpointServiceDataFederationOnlineArchivesPlainArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetPrivatelinkEndpointServiceDataFederationOnlineArchivesPlainArgs", "projectId");
            }
            return $;
        }
    }

}
