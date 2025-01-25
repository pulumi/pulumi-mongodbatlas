// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OnlineArchiveDataProcessRegionArgs extends com.pulumi.resources.ResourceArgs {

    public static final OnlineArchiveDataProcessRegionArgs Empty = new OnlineArchiveDataProcessRegionArgs();

    /**
     * Human-readable label that identifies the Cloud service provider where you wish to store your archived data. `AZURE` may be selected only if Azure is the Cloud service provider for the cluster and no AWS online archive has been created for the cluster.
     * 
     */
    @Import(name="cloudProvider")
    private @Nullable Output<String> cloudProvider;

    /**
     * @return Human-readable label that identifies the Cloud service provider where you wish to store your archived data. `AZURE` may be selected only if Azure is the Cloud service provider for the cluster and no AWS online archive has been created for the cluster.
     * 
     */
    public Optional<Output<String>> cloudProvider() {
        return Optional.ofNullable(this.cloudProvider);
    }

    /**
     * Human-readable label that identifies the geographic location of the region where you wish to store your archived data. For allowed values, see [MongoDB Atlas API documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Online-Archive/operation/createOnlineArchive)
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Human-readable label that identifies the geographic location of the region where you wish to store your archived data. For allowed values, see [MongoDB Atlas API documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Online-Archive/operation/createOnlineArchive)
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private OnlineArchiveDataProcessRegionArgs() {}

    private OnlineArchiveDataProcessRegionArgs(OnlineArchiveDataProcessRegionArgs $) {
        this.cloudProvider = $.cloudProvider;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OnlineArchiveDataProcessRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OnlineArchiveDataProcessRegionArgs $;

        public Builder() {
            $ = new OnlineArchiveDataProcessRegionArgs();
        }

        public Builder(OnlineArchiveDataProcessRegionArgs defaults) {
            $ = new OnlineArchiveDataProcessRegionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudProvider Human-readable label that identifies the Cloud service provider where you wish to store your archived data. `AZURE` may be selected only if Azure is the Cloud service provider for the cluster and no AWS online archive has been created for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(@Nullable Output<String> cloudProvider) {
            $.cloudProvider = cloudProvider;
            return this;
        }

        /**
         * @param cloudProvider Human-readable label that identifies the Cloud service provider where you wish to store your archived data. `AZURE` may be selected only if Azure is the Cloud service provider for the cluster and no AWS online archive has been created for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(String cloudProvider) {
            return cloudProvider(Output.of(cloudProvider));
        }

        /**
         * @param region Human-readable label that identifies the geographic location of the region where you wish to store your archived data. For allowed values, see [MongoDB Atlas API documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Online-Archive/operation/createOnlineArchive)
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Human-readable label that identifies the geographic location of the region where you wish to store your archived data. For allowed values, see [MongoDB Atlas API documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Online-Archive/operation/createOnlineArchive)
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public OnlineArchiveDataProcessRegionArgs build() {
            return $;
        }
    }

}