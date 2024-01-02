// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.inputs.GetCloudProviderAccessSetupAzureConfig;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudProviderAccessSetupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudProviderAccessSetupPlainArgs Empty = new GetCloudProviderAccessSetupPlainArgs();

    /**
     * azure related configurations
     * 
     */
    @Import(name="azureConfigs")
    private @Nullable List<GetCloudProviderAccessSetupAzureConfig> azureConfigs;

    /**
     * @return azure related configurations
     * 
     */
    public Optional<List<GetCloudProviderAccessSetupAzureConfig>> azureConfigs() {
        return Optional.ofNullable(this.azureConfigs);
    }

    /**
     * The unique ID for the project to get all Cloud Provider Access
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return The unique ID for the project to get all Cloud Provider Access
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    /**
     * cloud provider name, currently only AWS is supported
     * 
     */
    @Import(name="providerName", required=true)
    private String providerName;

    /**
     * @return cloud provider name, currently only AWS is supported
     * 
     */
    public String providerName() {
        return this.providerName;
    }

    /**
     * unique role id among all the aws roles provided by mongodb atlas
     * 
     */
    @Import(name="roleId", required=true)
    private String roleId;

    /**
     * @return unique role id among all the aws roles provided by mongodb atlas
     * 
     */
    public String roleId() {
        return this.roleId;
    }

    private GetCloudProviderAccessSetupPlainArgs() {}

    private GetCloudProviderAccessSetupPlainArgs(GetCloudProviderAccessSetupPlainArgs $) {
        this.azureConfigs = $.azureConfigs;
        this.projectId = $.projectId;
        this.providerName = $.providerName;
        this.roleId = $.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudProviderAccessSetupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudProviderAccessSetupPlainArgs $;

        public Builder() {
            $ = new GetCloudProviderAccessSetupPlainArgs();
        }

        public Builder(GetCloudProviderAccessSetupPlainArgs defaults) {
            $ = new GetCloudProviderAccessSetupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureConfigs azure related configurations
         * 
         * @return builder
         * 
         */
        public Builder azureConfigs(@Nullable List<GetCloudProviderAccessSetupAzureConfig> azureConfigs) {
            $.azureConfigs = azureConfigs;
            return this;
        }

        /**
         * @param azureConfigs azure related configurations
         * 
         * @return builder
         * 
         */
        public Builder azureConfigs(GetCloudProviderAccessSetupAzureConfig... azureConfigs) {
            return azureConfigs(List.of(azureConfigs));
        }

        /**
         * @param projectId The unique ID for the project to get all Cloud Provider Access
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param providerName cloud provider name, currently only AWS is supported
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            $.providerName = providerName;
            return this;
        }

        /**
         * @param roleId unique role id among all the aws roles provided by mongodb atlas
         * 
         * @return builder
         * 
         */
        public Builder roleId(String roleId) {
            $.roleId = roleId;
            return this;
        }

        public GetCloudProviderAccessSetupPlainArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetCloudProviderAccessSetupPlainArgs", "projectId");
            }
            if ($.providerName == null) {
                throw new MissingRequiredPropertyException("GetCloudProviderAccessSetupPlainArgs", "providerName");
            }
            if ($.roleId == null) {
                throw new MissingRequiredPropertyException("GetCloudProviderAccessSetupPlainArgs", "roleId");
            }
            return $;
        }
    }

}
