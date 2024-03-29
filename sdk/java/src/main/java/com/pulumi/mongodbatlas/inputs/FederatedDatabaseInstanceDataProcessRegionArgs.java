// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class FederatedDatabaseInstanceDataProcessRegionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FederatedDatabaseInstanceDataProcessRegionArgs Empty = new FederatedDatabaseInstanceDataProcessRegionArgs();

    /**
     * Name of the cloud service provider. Atlas Federated Database only supports AWS.
     * 
     */
    @Import(name="cloudProvider", required=true)
    private Output<String> cloudProvider;

    /**
     * @return Name of the cloud service provider. Atlas Federated Database only supports AWS.
     * 
     */
    public Output<String> cloudProvider() {
        return this.cloudProvider;
    }

    /**
     * Name of the region to which the Federanted Instnace routes client connections for data processing. See the [documention](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createFederatedDatabase) for the available region.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return Name of the region to which the Federanted Instnace routes client connections for data processing. See the [documention](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createFederatedDatabase) for the available region.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    private FederatedDatabaseInstanceDataProcessRegionArgs() {}

    private FederatedDatabaseInstanceDataProcessRegionArgs(FederatedDatabaseInstanceDataProcessRegionArgs $) {
        this.cloudProvider = $.cloudProvider;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FederatedDatabaseInstanceDataProcessRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FederatedDatabaseInstanceDataProcessRegionArgs $;

        public Builder() {
            $ = new FederatedDatabaseInstanceDataProcessRegionArgs();
        }

        public Builder(FederatedDatabaseInstanceDataProcessRegionArgs defaults) {
            $ = new FederatedDatabaseInstanceDataProcessRegionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudProvider Name of the cloud service provider. Atlas Federated Database only supports AWS.
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(Output<String> cloudProvider) {
            $.cloudProvider = cloudProvider;
            return this;
        }

        /**
         * @param cloudProvider Name of the cloud service provider. Atlas Federated Database only supports AWS.
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(String cloudProvider) {
            return cloudProvider(Output.of(cloudProvider));
        }

        /**
         * @param region Name of the region to which the Federanted Instnace routes client connections for data processing. See the [documention](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createFederatedDatabase) for the available region.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Name of the region to which the Federanted Instnace routes client connections for data processing. See the [documention](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createFederatedDatabase) for the available region.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public FederatedDatabaseInstanceDataProcessRegionArgs build() {
            if ($.cloudProvider == null) {
                throw new MissingRequiredPropertyException("FederatedDatabaseInstanceDataProcessRegionArgs", "cloudProvider");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("FederatedDatabaseInstanceDataProcessRegionArgs", "region");
            }
            return $;
        }
    }

}
