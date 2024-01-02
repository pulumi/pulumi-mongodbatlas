// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EncryptionAtRestAzureKeyVaultConfig {
    /**
     * @return The Azure environment where the Azure account credentials reside. Valid values are the following: AZURE, AZURE_CHINA, AZURE_GERMANY
     * 
     */
    private @Nullable String azureEnvironment;
    /**
     * @return The client ID, also known as the application ID, for an Azure application associated with the Azure AD tenant.
     * 
     */
    private @Nullable String clientId;
    /**
     * @return Specifies whether Encryption at Rest is enabled for an Atlas project. To disable Encryption at Rest, pass only this parameter with a value of false. When you disable Encryption at Rest, Atlas also removes the configuration details.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The unique identifier of a key in an Azure Key Vault.
     * 
     */
    private @Nullable String keyIdentifier;
    /**
     * @return The name of an Azure Key Vault containing your key.
     * 
     */
    private @Nullable String keyVaultName;
    /**
     * @return The name of the Azure Resource group that contains an Azure Key Vault.
     * 
     */
    private @Nullable String resourceGroupName;
    /**
     * @return The secret associated with the Azure Key Vault specified by azureKeyVault.tenantID.
     * 
     */
    private @Nullable String secret;
    /**
     * @return The unique identifier associated with an Azure subscription.
     * 
     */
    private @Nullable String subscriptionId;
    /**
     * @return The unique identifier for an Azure AD tenant within an Azure subscription.
     * 
     */
    private @Nullable String tenantId;

    private EncryptionAtRestAzureKeyVaultConfig() {}
    /**
     * @return The Azure environment where the Azure account credentials reside. Valid values are the following: AZURE, AZURE_CHINA, AZURE_GERMANY
     * 
     */
    public Optional<String> azureEnvironment() {
        return Optional.ofNullable(this.azureEnvironment);
    }
    /**
     * @return The client ID, also known as the application ID, for an Azure application associated with the Azure AD tenant.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return Specifies whether Encryption at Rest is enabled for an Atlas project. To disable Encryption at Rest, pass only this parameter with a value of false. When you disable Encryption at Rest, Atlas also removes the configuration details.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The unique identifier of a key in an Azure Key Vault.
     * 
     */
    public Optional<String> keyIdentifier() {
        return Optional.ofNullable(this.keyIdentifier);
    }
    /**
     * @return The name of an Azure Key Vault containing your key.
     * 
     */
    public Optional<String> keyVaultName() {
        return Optional.ofNullable(this.keyVaultName);
    }
    /**
     * @return The name of the Azure Resource group that contains an Azure Key Vault.
     * 
     */
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }
    /**
     * @return The secret associated with the Azure Key Vault specified by azureKeyVault.tenantID.
     * 
     */
    public Optional<String> secret() {
        return Optional.ofNullable(this.secret);
    }
    /**
     * @return The unique identifier associated with an Azure subscription.
     * 
     */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }
    /**
     * @return The unique identifier for an Azure AD tenant within an Azure subscription.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionAtRestAzureKeyVaultConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String azureEnvironment;
        private @Nullable String clientId;
        private @Nullable Boolean enabled;
        private @Nullable String keyIdentifier;
        private @Nullable String keyVaultName;
        private @Nullable String resourceGroupName;
        private @Nullable String secret;
        private @Nullable String subscriptionId;
        private @Nullable String tenantId;
        public Builder() {}
        public Builder(EncryptionAtRestAzureKeyVaultConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureEnvironment = defaults.azureEnvironment;
    	      this.clientId = defaults.clientId;
    	      this.enabled = defaults.enabled;
    	      this.keyIdentifier = defaults.keyIdentifier;
    	      this.keyVaultName = defaults.keyVaultName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secret = defaults.secret;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenantId = defaults.tenantId;
        }

        @CustomType.Setter
        public Builder azureEnvironment(@Nullable String azureEnvironment) {

            this.azureEnvironment = azureEnvironment;
            return this;
        }
        @CustomType.Setter
        public Builder clientId(@Nullable String clientId) {

            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder keyIdentifier(@Nullable String keyIdentifier) {

            this.keyIdentifier = keyIdentifier;
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultName(@Nullable String keyVaultName) {

            this.keyVaultName = keyVaultName;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(@Nullable String resourceGroupName) {

            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder secret(@Nullable String secret) {

            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder subscriptionId(@Nullable String subscriptionId) {

            this.subscriptionId = subscriptionId;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(@Nullable String tenantId) {

            this.tenantId = tenantId;
            return this;
        }
        public EncryptionAtRestAzureKeyVaultConfig build() {
            final var _resultValue = new EncryptionAtRestAzureKeyVaultConfig();
            _resultValue.azureEnvironment = azureEnvironment;
            _resultValue.clientId = clientId;
            _resultValue.enabled = enabled;
            _resultValue.keyIdentifier = keyIdentifier;
            _resultValue.keyVaultName = keyVaultName;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.secret = secret;
            _resultValue.subscriptionId = subscriptionId;
            _resultValue.tenantId = tenantId;
            return _resultValue;
        }
    }
}
