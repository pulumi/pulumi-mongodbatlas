// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.FederatedDatabaseInstanceCloudProviderConfigAwsArgs;
import java.util.Objects;


public final class FederatedDatabaseInstanceCloudProviderConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FederatedDatabaseInstanceCloudProviderConfigArgs Empty = new FederatedDatabaseInstanceCloudProviderConfigArgs();

    @Import(name="aws", required=true)
    private Output<FederatedDatabaseInstanceCloudProviderConfigAwsArgs> aws;

    public Output<FederatedDatabaseInstanceCloudProviderConfigAwsArgs> aws() {
        return this.aws;
    }

    private FederatedDatabaseInstanceCloudProviderConfigArgs() {}

    private FederatedDatabaseInstanceCloudProviderConfigArgs(FederatedDatabaseInstanceCloudProviderConfigArgs $) {
        this.aws = $.aws;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FederatedDatabaseInstanceCloudProviderConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FederatedDatabaseInstanceCloudProviderConfigArgs $;

        public Builder() {
            $ = new FederatedDatabaseInstanceCloudProviderConfigArgs();
        }

        public Builder(FederatedDatabaseInstanceCloudProviderConfigArgs defaults) {
            $ = new FederatedDatabaseInstanceCloudProviderConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder aws(Output<FederatedDatabaseInstanceCloudProviderConfigAwsArgs> aws) {
            $.aws = aws;
            return this;
        }

        public Builder aws(FederatedDatabaseInstanceCloudProviderConfigAwsArgs aws) {
            return aws(Output.of(aws));
        }

        public FederatedDatabaseInstanceCloudProviderConfigArgs build() {
            $.aws = Objects.requireNonNull($.aws, "expected parameter 'aws' to be non-null");
            return $;
        }
    }

}
