// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkPeeringArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkPeeringArgs Empty = new GetNetworkPeeringArgs();

    /**
     * Atlas assigned unique ID for the peering connection.
     * 
     */
    @Import(name="peeringId", required=true)
    private Output<String> peeringId;

    /**
     * @return Atlas assigned unique ID for the peering connection.
     * 
     */
    public Output<String> peeringId() {
        return this.peeringId;
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

    private GetNetworkPeeringArgs() {}

    private GetNetworkPeeringArgs(GetNetworkPeeringArgs $) {
        this.peeringId = $.peeringId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkPeeringArgs $;

        public Builder() {
            $ = new GetNetworkPeeringArgs();
        }

        public Builder(GetNetworkPeeringArgs defaults) {
            $ = new GetNetworkPeeringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param peeringId Atlas assigned unique ID for the peering connection.
         * 
         * @return builder
         * 
         */
        public Builder peeringId(Output<String> peeringId) {
            $.peeringId = peeringId;
            return this;
        }

        /**
         * @param peeringId Atlas assigned unique ID for the peering connection.
         * 
         * @return builder
         * 
         */
        public Builder peeringId(String peeringId) {
            return peeringId(Output.of(peeringId));
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

        public GetNetworkPeeringArgs build() {
            if ($.peeringId == null) {
                throw new MissingRequiredPropertyException("GetNetworkPeeringArgs", "peeringId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetNetworkPeeringArgs", "projectId");
            }
            return $;
        }
    }

}
