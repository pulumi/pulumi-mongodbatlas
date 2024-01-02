// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetCloudProviderAccessSetupAzureConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetCloudProviderAccessSetupAzureConfigArgs Empty = new GetCloudProviderAccessSetupAzureConfigArgs();

    /**
     * Azure Active Directory Application ID of Atlas.
     * 
     */
    @Import(name="atlasAzureAppId", required=true)
    private Output<String> atlasAzureAppId;

    /**
     * @return Azure Active Directory Application ID of Atlas.
     * 
     */
    public Output<String> atlasAzureAppId() {
        return this.atlasAzureAppId;
    }

    /**
     * UUID string that identifies the Azure Service Principal.
     * 
     */
    @Import(name="servicePrincipalId", required=true)
    private Output<String> servicePrincipalId;

    /**
     * @return UUID string that identifies the Azure Service Principal.
     * 
     */
    public Output<String> servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * UUID String that identifies the Azure Active Directory Tenant ID.
     * 
     */
    @Import(name="tenantId", required=true)
    private Output<String> tenantId;

    /**
     * @return UUID String that identifies the Azure Active Directory Tenant ID.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    private GetCloudProviderAccessSetupAzureConfigArgs() {}

    private GetCloudProviderAccessSetupAzureConfigArgs(GetCloudProviderAccessSetupAzureConfigArgs $) {
        this.atlasAzureAppId = $.atlasAzureAppId;
        this.servicePrincipalId = $.servicePrincipalId;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudProviderAccessSetupAzureConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudProviderAccessSetupAzureConfigArgs $;

        public Builder() {
            $ = new GetCloudProviderAccessSetupAzureConfigArgs();
        }

        public Builder(GetCloudProviderAccessSetupAzureConfigArgs defaults) {
            $ = new GetCloudProviderAccessSetupAzureConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param atlasAzureAppId Azure Active Directory Application ID of Atlas.
         * 
         * @return builder
         * 
         */
        public Builder atlasAzureAppId(Output<String> atlasAzureAppId) {
            $.atlasAzureAppId = atlasAzureAppId;
            return this;
        }

        /**
         * @param atlasAzureAppId Azure Active Directory Application ID of Atlas.
         * 
         * @return builder
         * 
         */
        public Builder atlasAzureAppId(String atlasAzureAppId) {
            return atlasAzureAppId(Output.of(atlasAzureAppId));
        }

        /**
         * @param servicePrincipalId UUID string that identifies the Azure Service Principal.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(Output<String> servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        /**
         * @param servicePrincipalId UUID string that identifies the Azure Service Principal.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(String servicePrincipalId) {
            return servicePrincipalId(Output.of(servicePrincipalId));
        }

        /**
         * @param tenantId UUID String that identifies the Azure Active Directory Tenant ID.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId UUID String that identifies the Azure Active Directory Tenant ID.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public GetCloudProviderAccessSetupAzureConfigArgs build() {
            if ($.atlasAzureAppId == null) {
                throw new MissingRequiredPropertyException("GetCloudProviderAccessSetupAzureConfigArgs", "atlasAzureAppId");
            }
            if ($.servicePrincipalId == null) {
                throw new MissingRequiredPropertyException("GetCloudProviderAccessSetupAzureConfigArgs", "servicePrincipalId");
            }
            if ($.tenantId == null) {
                throw new MissingRequiredPropertyException("GetCloudProviderAccessSetupAzureConfigArgs", "tenantId");
            }
            return $;
        }
    }

}
