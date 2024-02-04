// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectIpAddressesServicesClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectIpAddressesServicesClusterArgs Empty = new ProjectIpAddressesServicesClusterArgs();

    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    @Import(name="inbounds")
    private @Nullable Output<List<String>> inbounds;

    public Optional<Output<List<String>>> inbounds() {
        return Optional.ofNullable(this.inbounds);
    }

    @Import(name="outbounds")
    private @Nullable Output<List<String>> outbounds;

    public Optional<Output<List<String>>> outbounds() {
        return Optional.ofNullable(this.outbounds);
    }

    private ProjectIpAddressesServicesClusterArgs() {}

    private ProjectIpAddressesServicesClusterArgs(ProjectIpAddressesServicesClusterArgs $) {
        this.clusterName = $.clusterName;
        this.inbounds = $.inbounds;
        this.outbounds = $.outbounds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectIpAddressesServicesClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectIpAddressesServicesClusterArgs $;

        public Builder() {
            $ = new ProjectIpAddressesServicesClusterArgs();
        }

        public Builder(ProjectIpAddressesServicesClusterArgs defaults) {
            $ = new ProjectIpAddressesServicesClusterArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        public Builder inbounds(@Nullable Output<List<String>> inbounds) {
            $.inbounds = inbounds;
            return this;
        }

        public Builder inbounds(List<String> inbounds) {
            return inbounds(Output.of(inbounds));
        }

        public Builder inbounds(String... inbounds) {
            return inbounds(List.of(inbounds));
        }

        public Builder outbounds(@Nullable Output<List<String>> outbounds) {
            $.outbounds = outbounds;
            return this;
        }

        public Builder outbounds(List<String> outbounds) {
            return outbounds(Output.of(outbounds));
        }

        public Builder outbounds(String... outbounds) {
            return outbounds(List.of(outbounds));
        }

        public ProjectIpAddressesServicesClusterArgs build() {
            return $;
        }
    }

}
