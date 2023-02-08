// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class PrivateIpModeArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateIpModeArgs Empty = new PrivateIpModeArgs();

    /**
     * Indicates whether Connect via Peering Only mode is enabled or disabled for an Atlas project
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Indicates whether Connect via Peering Only mode is enabled or disabled for an Atlas project
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The unique ID for the project to enable Only Private IP Mode.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The unique ID for the project to enable Only Private IP Mode.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private PrivateIpModeArgs() {}

    private PrivateIpModeArgs(PrivateIpModeArgs $) {
        this.enabled = $.enabled;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateIpModeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateIpModeArgs $;

        public Builder() {
            $ = new PrivateIpModeArgs();
        }

        public Builder(PrivateIpModeArgs defaults) {
            $ = new PrivateIpModeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Indicates whether Connect via Peering Only mode is enabled or disabled for an Atlas project
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Indicates whether Connect via Peering Only mode is enabled or disabled for an Atlas project
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param projectId The unique ID for the project to enable Only Private IP Mode.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique ID for the project to enable Only Private IP Mode.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public PrivateIpModeArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}