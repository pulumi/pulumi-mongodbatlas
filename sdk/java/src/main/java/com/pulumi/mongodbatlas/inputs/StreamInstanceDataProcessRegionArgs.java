// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class StreamInstanceDataProcessRegionArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamInstanceDataProcessRegionArgs Empty = new StreamInstanceDataProcessRegionArgs();

    /**
     * Label that identifies the cloud service provider where MongoDB Cloud performs stream processing. The [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) describes the valid values.
     * 
     */
    @Import(name="cloudProvider", required=true)
    private Output<String> cloudProvider;

    /**
     * @return Label that identifies the cloud service provider where MongoDB Cloud performs stream processing. The [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) describes the valid values.
     * 
     */
    public Output<String> cloudProvider() {
        return this.cloudProvider;
    }

    /**
     * Name of the cloud provider region hosting Atlas Stream Processing. The [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) describes the valid values.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return Name of the cloud provider region hosting Atlas Stream Processing. The [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) describes the valid values.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    private StreamInstanceDataProcessRegionArgs() {}

    private StreamInstanceDataProcessRegionArgs(StreamInstanceDataProcessRegionArgs $) {
        this.cloudProvider = $.cloudProvider;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamInstanceDataProcessRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamInstanceDataProcessRegionArgs $;

        public Builder() {
            $ = new StreamInstanceDataProcessRegionArgs();
        }

        public Builder(StreamInstanceDataProcessRegionArgs defaults) {
            $ = new StreamInstanceDataProcessRegionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudProvider Label that identifies the cloud service provider where MongoDB Cloud performs stream processing. The [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) describes the valid values.
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(Output<String> cloudProvider) {
            $.cloudProvider = cloudProvider;
            return this;
        }

        /**
         * @param cloudProvider Label that identifies the cloud service provider where MongoDB Cloud performs stream processing. The [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) describes the valid values.
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(String cloudProvider) {
            return cloudProvider(Output.of(cloudProvider));
        }

        /**
         * @param region Name of the cloud provider region hosting Atlas Stream Processing. The [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) describes the valid values.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Name of the cloud provider region hosting Atlas Stream Processing. The [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) describes the valid values.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public StreamInstanceDataProcessRegionArgs build() {
            if ($.cloudProvider == null) {
                throw new MissingRequiredPropertyException("StreamInstanceDataProcessRegionArgs", "cloudProvider");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("StreamInstanceDataProcessRegionArgs", "region");
            }
            return $;
        }
    }

}
