// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.inputs.FlexClusterProviderSettingsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlexClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlexClusterArgs Empty = new FlexClusterArgs();

    /**
     * Human-readable label that identifies the instance.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Human-readable label that identifies the instance.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Unique 24-hexadecimal character string that identifies the project.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal character string that identifies the project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * Group of cloud provider settings that configure the provisioned MongoDB flex cluster.
     * 
     */
    @Import(name="providerSettings", required=true)
    private Output<FlexClusterProviderSettingsArgs> providerSettings;

    /**
     * @return Group of cloud provider settings that configure the provisioned MongoDB flex cluster.
     * 
     */
    public Output<FlexClusterProviderSettingsArgs> providerSettings() {
        return this.providerSettings;
    }

    /**
     * Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the instance.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the instance.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Flag that indicates whether termination protection is enabled on the cluster. If set to `true`, MongoDB Cloud won&#39;t delete the cluster. If set to `false`, MongoDB Cloud will delete the cluster.
     * 
     */
    @Import(name="terminationProtectionEnabled")
    private @Nullable Output<Boolean> terminationProtectionEnabled;

    /**
     * @return Flag that indicates whether termination protection is enabled on the cluster. If set to `true`, MongoDB Cloud won&#39;t delete the cluster. If set to `false`, MongoDB Cloud will delete the cluster.
     * 
     */
    public Optional<Output<Boolean>> terminationProtectionEnabled() {
        return Optional.ofNullable(this.terminationProtectionEnabled);
    }

    private FlexClusterArgs() {}

    private FlexClusterArgs(FlexClusterArgs $) {
        this.name = $.name;
        this.projectId = $.projectId;
        this.providerSettings = $.providerSettings;
        this.tags = $.tags;
        this.terminationProtectionEnabled = $.terminationProtectionEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlexClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexClusterArgs $;

        public Builder() {
            $ = new FlexClusterArgs();
        }

        public Builder(FlexClusterArgs defaults) {
            $ = new FlexClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Human-readable label that identifies the instance.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Human-readable label that identifies the instance.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId Unique 24-hexadecimal character string that identifies the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique 24-hexadecimal character string that identifies the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param providerSettings Group of cloud provider settings that configure the provisioned MongoDB flex cluster.
         * 
         * @return builder
         * 
         */
        public Builder providerSettings(Output<FlexClusterProviderSettingsArgs> providerSettings) {
            $.providerSettings = providerSettings;
            return this;
        }

        /**
         * @param providerSettings Group of cloud provider settings that configure the provisioned MongoDB flex cluster.
         * 
         * @return builder
         * 
         */
        public Builder providerSettings(FlexClusterProviderSettingsArgs providerSettings) {
            return providerSettings(Output.of(providerSettings));
        }

        /**
         * @param tags Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the instance.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the instance.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param terminationProtectionEnabled Flag that indicates whether termination protection is enabled on the cluster. If set to `true`, MongoDB Cloud won&#39;t delete the cluster. If set to `false`, MongoDB Cloud will delete the cluster.
         * 
         * @return builder
         * 
         */
        public Builder terminationProtectionEnabled(@Nullable Output<Boolean> terminationProtectionEnabled) {
            $.terminationProtectionEnabled = terminationProtectionEnabled;
            return this;
        }

        /**
         * @param terminationProtectionEnabled Flag that indicates whether termination protection is enabled on the cluster. If set to `true`, MongoDB Cloud won&#39;t delete the cluster. If set to `false`, MongoDB Cloud will delete the cluster.
         * 
         * @return builder
         * 
         */
        public Builder terminationProtectionEnabled(Boolean terminationProtectionEnabled) {
            return terminationProtectionEnabled(Output.of(terminationProtectionEnabled));
        }

        public FlexClusterArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("FlexClusterArgs", "projectId");
            }
            if ($.providerSettings == null) {
                throw new MissingRequiredPropertyException("FlexClusterArgs", "providerSettings");
            }
            return $;
        }
    }

}
