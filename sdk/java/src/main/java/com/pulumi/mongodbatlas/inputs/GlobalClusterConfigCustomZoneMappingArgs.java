// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalClusterConfigCustomZoneMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalClusterConfigCustomZoneMappingArgs Empty = new GlobalClusterConfigCustomZoneMappingArgs();

    /**
     * The ISO location code to which you want to map a zone in your Global Cluster. You can find a list of all supported location codes [here](https://cloud.mongodb.com/static/atlas/country_iso_codes.txt).
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The ISO location code to which you want to map a zone in your Global Cluster. You can find a list of all supported location codes [here](https://cloud.mongodb.com/static/atlas/country_iso_codes.txt).
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the zone in your Global Cluster that you want to map to location.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return The name of the zone in your Global Cluster that you want to map to location.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private GlobalClusterConfigCustomZoneMappingArgs() {}

    private GlobalClusterConfigCustomZoneMappingArgs(GlobalClusterConfigCustomZoneMappingArgs $) {
        this.location = $.location;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalClusterConfigCustomZoneMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalClusterConfigCustomZoneMappingArgs $;

        public Builder() {
            $ = new GlobalClusterConfigCustomZoneMappingArgs();
        }

        public Builder(GlobalClusterConfigCustomZoneMappingArgs defaults) {
            $ = new GlobalClusterConfigCustomZoneMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The ISO location code to which you want to map a zone in your Global Cluster. You can find a list of all supported location codes [here](https://cloud.mongodb.com/static/atlas/country_iso_codes.txt).
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The ISO location code to which you want to map a zone in your Global Cluster. You can find a list of all supported location codes [here](https://cloud.mongodb.com/static/atlas/country_iso_codes.txt).
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param zone The name of the zone in your Global Cluster that you want to map to location.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The name of the zone in your Global Cluster that you want to map to location.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public GlobalClusterConfigCustomZoneMappingArgs build() {
            return $;
        }
    }

}