// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.inputs.GetFederatedDatabaseInstanceCloudProviderConfigAws;
import java.util.Objects;


public final class GetFederatedDatabaseInstanceCloudProviderConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetFederatedDatabaseInstanceCloudProviderConfig Empty = new GetFederatedDatabaseInstanceCloudProviderConfig();

    @Import(name="aws", required=true)
    private GetFederatedDatabaseInstanceCloudProviderConfigAws aws;

    public GetFederatedDatabaseInstanceCloudProviderConfigAws aws() {
        return this.aws;
    }

    private GetFederatedDatabaseInstanceCloudProviderConfig() {}

    private GetFederatedDatabaseInstanceCloudProviderConfig(GetFederatedDatabaseInstanceCloudProviderConfig $) {
        this.aws = $.aws;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFederatedDatabaseInstanceCloudProviderConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFederatedDatabaseInstanceCloudProviderConfig $;

        public Builder() {
            $ = new GetFederatedDatabaseInstanceCloudProviderConfig();
        }

        public Builder(GetFederatedDatabaseInstanceCloudProviderConfig defaults) {
            $ = new GetFederatedDatabaseInstanceCloudProviderConfig(Objects.requireNonNull(defaults));
        }

        public Builder aws(GetFederatedDatabaseInstanceCloudProviderConfigAws aws) {
            $.aws = aws;
            return this;
        }

        public GetFederatedDatabaseInstanceCloudProviderConfig build() {
            if ($.aws == null) {
                throw new MissingRequiredPropertyException("GetFederatedDatabaseInstanceCloudProviderConfig", "aws");
            }
            return $;
        }
    }

}
