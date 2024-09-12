// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    /// <summary>
    /// ## # Resource: mongodbatlas.EncryptionAtRestPrivateEndpoint
    /// 
    /// `mongodbatlas.EncryptionAtRestPrivateEndpoint` provides a resource for managing a private endpoint used for encryption at rest with customer-managed keys. This ensures all traffic between Atlas and customer key management systems take place over private network interfaces.
    /// 
    /// &gt; **IMPORTANT** The Encryption at Rest using Azure Key Vault over Private Endpoints feature is available by request. To request this functionality for your Atlas deployments, contact your Account Manager.
    /// To learn more about existing limitations, see [Manage Customer Keys with Azure Key Vault Over Private Endpoints](https://www.mongodb.com/docs/atlas/security/azure-kms-over-private-endpoint/#manage-customer-keys-with-azure-key-vault-over-private-endpoints).
    /// 
    /// &gt; **NOTE:** As a prerequisite to configuring a private endpoint for Azure Key Vault, the corresponding `mongodbatlas.EncryptionAtRest` resource has to be adjust by configuring `azure_key_vault_config.require_private_networking` to true. This attribute should be updated in place, ensuring the customer-managed keys encryption is never disabled.
    /// 
    /// &gt; **NOTE:** This resource does not support update operations. To modify values of a private endpoint the existing resource must be deleted and a new one can be created with the modified values.
    /// 
    /// ## Example Usage
    /// 
    /// ### S
    /// 
    /// &gt; **NOTE:** Only Azure Key Vault with Azure Private Link is supported at this time.
    /// 
    /// ### Configuring Atlas Encryption at Rest using Azure Key Vault with Azure Private Link
    /// 
    /// Make sure to reference the complete example section for detailed steps and considerations.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Azapi = Pulumi.Azapi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var ear = new Mongodbatlas.EncryptionAtRest("ear", new()
    ///     {
    ///         ProjectId = atlasProjectId,
    ///         AzureKeyVaultConfig = new Mongodbatlas.Inputs.EncryptionAtRestAzureKeyVaultConfigArgs
    ///         {
    ///             RequirePrivateNetworking = true,
    ///             Enabled = true,
    ///             AzureEnvironment = "AZURE",
    ///             TenantId = azureTenantId,
    ///             SubscriptionId = azureSubscriptionId,
    ///             ClientId = azureClientId,
    ///             Secret = azureClientSecret,
    ///             ResourceGroupName = azureResourceGroupName,
    ///             KeyVaultName = azureKeyVaultName,
    ///             KeyIdentifier = azureKeyIdentifier,
    ///         },
    ///     });
    /// 
    ///     // Creates private endpoint
    ///     var endpoint = new Mongodbatlas.EncryptionAtRestPrivateEndpoint("endpoint", new()
    ///     {
    ///         ProjectId = ear.ProjectId,
    ///         CloudProvider = "AZURE",
    ///         RegionName = azureRegionName,
    ///     });
    /// 
    ///     var keyVaultResourceId = $"/subscriptions/{azureSubscriptionId}/resourceGroups/{azureResourceGroupName}/providers/Microsoft.KeyVault/vaults/{azureKeyVaultName}";
    /// 
    ///     // Approves private endpoint connection from Azure Key Vault
    ///     var approval = new Azapi.Index.UpdateResource("approval", new()
    ///     {
    ///         Type = "Microsoft.KeyVault/Vaults/PrivateEndpointConnections@2023-07-01",
    ///         Name = endpoint.PrivateEndpointConnectionName,
    ///         ParentId = keyVaultResourceId,
    ///         Body = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["properties"] = new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 ["privateLinkServiceConnectionState"] = new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["description"] = "Approved via Terraform",
    ///                     ["status"] = "Approved",
    ///                 },
    ///             },
    ///         }),
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/encryptionAtRestPrivateEndpoint:EncryptionAtRestPrivateEndpoint")]
    public partial class EncryptionAtRestPrivateEndpoint : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Label that identifies the cloud provider for the Encryption At Rest private endpoint.
        /// </summary>
        [Output("cloudProvider")]
        public Output<string> CloudProvider { get; private set; } = null!;

        /// <summary>
        /// Error message for failures associated with the Encryption At Rest private endpoint.
        /// </summary>
        [Output("errorMessage")]
        public Output<string> ErrorMessage { get; private set; } = null!;

        /// <summary>
        /// Connection name of the Azure Private Endpoint.
        /// </summary>
        [Output("privateEndpointConnectionName")]
        public Output<string> PrivateEndpointConnectionName { get; private set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Cloud provider region in which the Encryption At Rest private endpoint is located.
        /// </summary>
        [Output("regionName")]
        public Output<string> RegionName { get; private set; } = null!;

        /// <summary>
        /// State of the Encryption At Rest private endpoint.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a EncryptionAtRestPrivateEndpoint resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EncryptionAtRestPrivateEndpoint(string name, EncryptionAtRestPrivateEndpointArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/encryptionAtRestPrivateEndpoint:EncryptionAtRestPrivateEndpoint", name, args ?? new EncryptionAtRestPrivateEndpointArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EncryptionAtRestPrivateEndpoint(string name, Input<string> id, EncryptionAtRestPrivateEndpointState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/encryptionAtRestPrivateEndpoint:EncryptionAtRestPrivateEndpoint", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing EncryptionAtRestPrivateEndpoint resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EncryptionAtRestPrivateEndpoint Get(string name, Input<string> id, EncryptionAtRestPrivateEndpointState? state = null, CustomResourceOptions? options = null)
        {
            return new EncryptionAtRestPrivateEndpoint(name, id, state, options);
        }
    }

    public sealed class EncryptionAtRestPrivateEndpointArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Label that identifies the cloud provider for the Encryption At Rest private endpoint.
        /// </summary>
        [Input("cloudProvider", required: true)]
        public Input<string> CloudProvider { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Cloud provider region in which the Encryption At Rest private endpoint is located.
        /// </summary>
        [Input("regionName", required: true)]
        public Input<string> RegionName { get; set; } = null!;

        public EncryptionAtRestPrivateEndpointArgs()
        {
        }
        public static new EncryptionAtRestPrivateEndpointArgs Empty => new EncryptionAtRestPrivateEndpointArgs();
    }

    public sealed class EncryptionAtRestPrivateEndpointState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Label that identifies the cloud provider for the Encryption At Rest private endpoint.
        /// </summary>
        [Input("cloudProvider")]
        public Input<string>? CloudProvider { get; set; }

        /// <summary>
        /// Error message for failures associated with the Encryption At Rest private endpoint.
        /// </summary>
        [Input("errorMessage")]
        public Input<string>? ErrorMessage { get; set; }

        /// <summary>
        /// Connection name of the Azure Private Endpoint.
        /// </summary>
        [Input("privateEndpointConnectionName")]
        public Input<string>? PrivateEndpointConnectionName { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Cloud provider region in which the Encryption At Rest private endpoint is located.
        /// </summary>
        [Input("regionName")]
        public Input<string>? RegionName { get; set; }

        /// <summary>
        /// State of the Encryption At Rest private endpoint.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public EncryptionAtRestPrivateEndpointState()
        {
        }
        public static new EncryptionAtRestPrivateEndpointState Empty => new EncryptionAtRestPrivateEndpointState();
    }
}
