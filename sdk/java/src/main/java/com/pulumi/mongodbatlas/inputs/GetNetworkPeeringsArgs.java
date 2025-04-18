// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkPeeringsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkPeeringsArgs Empty = new GetNetworkPeeringsArgs();

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

    private GetNetworkPeeringsArgs() {}

    private GetNetworkPeeringsArgs(GetNetworkPeeringsArgs $) {
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkPeeringsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkPeeringsArgs $;

        public Builder() {
            $ = new GetNetworkPeeringsArgs();
        }

        public Builder(GetNetworkPeeringsArgs defaults) {
            $ = new GetNetworkPeeringsArgs(Objects.requireNonNull(defaults));
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

        public GetNetworkPeeringsArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetNetworkPeeringsArgs", "projectId");
            }
            return $;
        }
    }

}
