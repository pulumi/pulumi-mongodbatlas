// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetEncryptionAtRest
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.EncryptionAtRest
        /// 
        /// `mongodbatlas.EncryptionAtRest` describes encryption at rest configuration for an Atlas project with one of the following providers:
        /// 
        /// [Amazon Web Services Key Management Service](https://docs.atlas.mongodb.com/security-aws-kms/#security-aws-kms)
        /// [Azure Key Vault](https://docs.atlas.mongodb.com/security-azure-kms/#security-azure-kms)
        /// [Google Cloud KMS](https://docs.atlas.mongodb.com/security-gcp-kms/#security-gcp-kms)
        /// 
        /// 
        /// &gt; **IMPORTANT** By default, Atlas enables encryption at rest for all cluster storage and snapshot volumes.
        /// 
        /// &gt; **IMPORTANT** Atlas limits this feature to dedicated cluster tiers of M10 and greater. For more information see: https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Encryption-at-Rest-using-Customer-Key-Management
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ### S
        /// 
        /// ### Configuring encryption at rest using customer key management in AWS
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var setupOnly = new Mongodbatlas.CloudProviderAccessSetup("setup_only", new()
        ///     {
        ///         ProjectId = atlasProjectId,
        ///         ProviderName = "AWS",
        ///     });
        /// 
        ///     var authRole = new Mongodbatlas.CloudProviderAccessAuthorization("auth_role", new()
        ///     {
        ///         ProjectId = atlasProjectId,
        ///         RoleId = setupOnly.RoleId,
        ///         Aws = new Mongodbatlas.Inputs.CloudProviderAccessAuthorizationAwsArgs
        ///         {
        ///             IamAssumedRoleArn = testRole.Arn,
        ///         },
        ///     });
        /// 
        ///     var testEncryptionAtRest = new Mongodbatlas.EncryptionAtRest("test", new()
        ///     {
        ///         ProjectId = atlasProjectId,
        ///         AwsKmsConfig = new Mongodbatlas.Inputs.EncryptionAtRestAwsKmsConfigArgs
        ///         {
        ///             Enabled = true,
        ///             CustomerMasterKeyId = kmsKey.Id,
        ///             Region = atlasRegion,
        ///             RoleId = authRole.RoleId,
        ///         },
        ///     });
        /// 
        ///     var cluster = new Mongodbatlas.AdvancedCluster("cluster", new()
        ///     {
        ///         ProjectId = testEncryptionAtRest.ProjectId,
        ///         Name = "MyCluster",
        ///         ClusterType = "REPLICASET",
        ///         BackupEnabled = true,
        ///         EncryptionAtRestProvider = "AWS",
        ///         ReplicationSpecs = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         Priority = 7,
        ///                         ProviderName = "AWS",
        ///                         RegionName = "US_EAST_1",
        ///                         ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
        ///                         {
        ///                             InstanceSize = "M10",
        ///                             NodeCount = 3,
        ///                         },
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetEncryptionAtRest.Invoke(new()
        ///     {
        ///         ProjectId = testEncryptionAtRest.ProjectId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["isAwsKmsEncryptionAtRestValid"] = test.Apply(getEncryptionAtRestResult =&gt; getEncryptionAtRestResult.AwsKmsConfig?.Valid),
        ///     };
        /// });
        /// ```
        /// 
        /// ### Configuring encryption at rest using customer key management in Azure
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testEncryptionAtRest = new Mongodbatlas.EncryptionAtRest("test", new()
        ///     {
        ///         ProjectId = atlasProjectId,
        ///         AzureKeyVaultConfig = new Mongodbatlas.Inputs.EncryptionAtRestAzureKeyVaultConfigArgs
        ///         {
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
        ///     var test = Mongodbatlas.GetEncryptionAtRest.Invoke(new()
        ///     {
        ///         ProjectId = testEncryptionAtRest.ProjectId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["isAzureEncryptionAtRestValid"] = test.Apply(getEncryptionAtRestResult =&gt; getEncryptionAtRestResult.AzureKeyVaultConfig?.Valid),
        ///     };
        /// });
        /// ```
        /// 
        /// &gt; **NOTE:** It is possible to configure Atlas Encryption at Rest to communicate with Azure Key Vault using Azure Private Link, ensuring that all traffic between Atlas and Key Vault takes place over Azure’s private network interfaces. Please review `mongodbatlas.EncryptionAtRestPrivateEndpoint` resource for details.
        /// 
        /// ### Configuring encryption at rest using customer key management in GCP
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testEncryptionAtRest = new Mongodbatlas.EncryptionAtRest("test", new()
        ///     {
        ///         ProjectId = atlasProjectId,
        ///         GoogleCloudKmsConfig = new Mongodbatlas.Inputs.EncryptionAtRestGoogleCloudKmsConfigArgs
        ///         {
        ///             Enabled = true,
        ///             ServiceAccountKey = "{\"type\": \"service_account\",\"project_id\": \"my-project-common-0\",\"private_key_id\": \"e120598ea4f88249469fcdd75a9a785c1bb3\",\"private_key\": \"-----BEGIN PRIVATE KEY-----\\nMIIEuwIBA(truncated)SfecnS0mT94D9\\n-----END PRIVATE KEY-----\\n\",\"client_email\": \"my-email-kms-0@my-project-common-0.iam.gserviceaccount.com\",\"client_id\": \"10180967717292066\",\"auth_uri\": \"https://accounts.google.com/o/oauth2/auth\",\"token_uri\": \"https://accounts.google.com/o/oauth2/token\",\"auth_provider_x509_cert_url\": \"https://www.googleapis.com/oauth2/v1/certs\",\"client_x509_cert_url\": \"https://www.googleapis.com/robot/v1/metadata/x509/my-email-kms-0%40my-project-common-0.iam.gserviceaccount.com\"}",
        ///             KeyVersionResourceId = "projects/my-project-common-0/locations/us-east4/keyRings/my-key-ring-0/cryptoKeys/my-key-0/cryptoKeyVersions/1",
        ///         },
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetEncryptionAtRest.Invoke(new()
        ///     {
        ///         ProjectId = testEncryptionAtRest.ProjectId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["isGcpEncryptionAtRestValid"] = test.Apply(getEncryptionAtRestResult =&gt; getEncryptionAtRestResult.GoogleCloudKmsConfig?.Valid),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetEncryptionAtRestResult> InvokeAsync(GetEncryptionAtRestArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEncryptionAtRestResult>("mongodbatlas:index/getEncryptionAtRest:getEncryptionAtRest", args ?? new GetEncryptionAtRestArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.EncryptionAtRest
        /// 
        /// `mongodbatlas.EncryptionAtRest` describes encryption at rest configuration for an Atlas project with one of the following providers:
        /// 
        /// [Amazon Web Services Key Management Service](https://docs.atlas.mongodb.com/security-aws-kms/#security-aws-kms)
        /// [Azure Key Vault](https://docs.atlas.mongodb.com/security-azure-kms/#security-azure-kms)
        /// [Google Cloud KMS](https://docs.atlas.mongodb.com/security-gcp-kms/#security-gcp-kms)
        /// 
        /// 
        /// &gt; **IMPORTANT** By default, Atlas enables encryption at rest for all cluster storage and snapshot volumes.
        /// 
        /// &gt; **IMPORTANT** Atlas limits this feature to dedicated cluster tiers of M10 and greater. For more information see: https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Encryption-at-Rest-using-Customer-Key-Management
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ### S
        /// 
        /// ### Configuring encryption at rest using customer key management in AWS
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var setupOnly = new Mongodbatlas.CloudProviderAccessSetup("setup_only", new()
        ///     {
        ///         ProjectId = atlasProjectId,
        ///         ProviderName = "AWS",
        ///     });
        /// 
        ///     var authRole = new Mongodbatlas.CloudProviderAccessAuthorization("auth_role", new()
        ///     {
        ///         ProjectId = atlasProjectId,
        ///         RoleId = setupOnly.RoleId,
        ///         Aws = new Mongodbatlas.Inputs.CloudProviderAccessAuthorizationAwsArgs
        ///         {
        ///             IamAssumedRoleArn = testRole.Arn,
        ///         },
        ///     });
        /// 
        ///     var testEncryptionAtRest = new Mongodbatlas.EncryptionAtRest("test", new()
        ///     {
        ///         ProjectId = atlasProjectId,
        ///         AwsKmsConfig = new Mongodbatlas.Inputs.EncryptionAtRestAwsKmsConfigArgs
        ///         {
        ///             Enabled = true,
        ///             CustomerMasterKeyId = kmsKey.Id,
        ///             Region = atlasRegion,
        ///             RoleId = authRole.RoleId,
        ///         },
        ///     });
        /// 
        ///     var cluster = new Mongodbatlas.AdvancedCluster("cluster", new()
        ///     {
        ///         ProjectId = testEncryptionAtRest.ProjectId,
        ///         Name = "MyCluster",
        ///         ClusterType = "REPLICASET",
        ///         BackupEnabled = true,
        ///         EncryptionAtRestProvider = "AWS",
        ///         ReplicationSpecs = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         Priority = 7,
        ///                         ProviderName = "AWS",
        ///                         RegionName = "US_EAST_1",
        ///                         ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
        ///                         {
        ///                             InstanceSize = "M10",
        ///                             NodeCount = 3,
        ///                         },
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetEncryptionAtRest.Invoke(new()
        ///     {
        ///         ProjectId = testEncryptionAtRest.ProjectId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["isAwsKmsEncryptionAtRestValid"] = test.Apply(getEncryptionAtRestResult =&gt; getEncryptionAtRestResult.AwsKmsConfig?.Valid),
        ///     };
        /// });
        /// ```
        /// 
        /// ### Configuring encryption at rest using customer key management in Azure
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testEncryptionAtRest = new Mongodbatlas.EncryptionAtRest("test", new()
        ///     {
        ///         ProjectId = atlasProjectId,
        ///         AzureKeyVaultConfig = new Mongodbatlas.Inputs.EncryptionAtRestAzureKeyVaultConfigArgs
        ///         {
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
        ///     var test = Mongodbatlas.GetEncryptionAtRest.Invoke(new()
        ///     {
        ///         ProjectId = testEncryptionAtRest.ProjectId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["isAzureEncryptionAtRestValid"] = test.Apply(getEncryptionAtRestResult =&gt; getEncryptionAtRestResult.AzureKeyVaultConfig?.Valid),
        ///     };
        /// });
        /// ```
        /// 
        /// &gt; **NOTE:** It is possible to configure Atlas Encryption at Rest to communicate with Azure Key Vault using Azure Private Link, ensuring that all traffic between Atlas and Key Vault takes place over Azure’s private network interfaces. Please review `mongodbatlas.EncryptionAtRestPrivateEndpoint` resource for details.
        /// 
        /// ### Configuring encryption at rest using customer key management in GCP
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testEncryptionAtRest = new Mongodbatlas.EncryptionAtRest("test", new()
        ///     {
        ///         ProjectId = atlasProjectId,
        ///         GoogleCloudKmsConfig = new Mongodbatlas.Inputs.EncryptionAtRestGoogleCloudKmsConfigArgs
        ///         {
        ///             Enabled = true,
        ///             ServiceAccountKey = "{\"type\": \"service_account\",\"project_id\": \"my-project-common-0\",\"private_key_id\": \"e120598ea4f88249469fcdd75a9a785c1bb3\",\"private_key\": \"-----BEGIN PRIVATE KEY-----\\nMIIEuwIBA(truncated)SfecnS0mT94D9\\n-----END PRIVATE KEY-----\\n\",\"client_email\": \"my-email-kms-0@my-project-common-0.iam.gserviceaccount.com\",\"client_id\": \"10180967717292066\",\"auth_uri\": \"https://accounts.google.com/o/oauth2/auth\",\"token_uri\": \"https://accounts.google.com/o/oauth2/token\",\"auth_provider_x509_cert_url\": \"https://www.googleapis.com/oauth2/v1/certs\",\"client_x509_cert_url\": \"https://www.googleapis.com/robot/v1/metadata/x509/my-email-kms-0%40my-project-common-0.iam.gserviceaccount.com\"}",
        ///             KeyVersionResourceId = "projects/my-project-common-0/locations/us-east4/keyRings/my-key-ring-0/cryptoKeys/my-key-0/cryptoKeyVersions/1",
        ///         },
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetEncryptionAtRest.Invoke(new()
        ///     {
        ///         ProjectId = testEncryptionAtRest.ProjectId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["isGcpEncryptionAtRestValid"] = test.Apply(getEncryptionAtRestResult =&gt; getEncryptionAtRestResult.GoogleCloudKmsConfig?.Valid),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetEncryptionAtRestResult> Invoke(GetEncryptionAtRestInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEncryptionAtRestResult>("mongodbatlas:index/getEncryptionAtRest:getEncryptionAtRest", args ?? new GetEncryptionAtRestInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.EncryptionAtRest
        /// 
        /// `mongodbatlas.EncryptionAtRest` describes encryption at rest configuration for an Atlas project with one of the following providers:
        /// 
        /// [Amazon Web Services Key Management Service](https://docs.atlas.mongodb.com/security-aws-kms/#security-aws-kms)
        /// [Azure Key Vault](https://docs.atlas.mongodb.com/security-azure-kms/#security-azure-kms)
        /// [Google Cloud KMS](https://docs.atlas.mongodb.com/security-gcp-kms/#security-gcp-kms)
        /// 
        /// 
        /// &gt; **IMPORTANT** By default, Atlas enables encryption at rest for all cluster storage and snapshot volumes.
        /// 
        /// &gt; **IMPORTANT** Atlas limits this feature to dedicated cluster tiers of M10 and greater. For more information see: https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Encryption-at-Rest-using-Customer-Key-Management
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ### S
        /// 
        /// ### Configuring encryption at rest using customer key management in AWS
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var setupOnly = new Mongodbatlas.CloudProviderAccessSetup("setup_only", new()
        ///     {
        ///         ProjectId = atlasProjectId,
        ///         ProviderName = "AWS",
        ///     });
        /// 
        ///     var authRole = new Mongodbatlas.CloudProviderAccessAuthorization("auth_role", new()
        ///     {
        ///         ProjectId = atlasProjectId,
        ///         RoleId = setupOnly.RoleId,
        ///         Aws = new Mongodbatlas.Inputs.CloudProviderAccessAuthorizationAwsArgs
        ///         {
        ///             IamAssumedRoleArn = testRole.Arn,
        ///         },
        ///     });
        /// 
        ///     var testEncryptionAtRest = new Mongodbatlas.EncryptionAtRest("test", new()
        ///     {
        ///         ProjectId = atlasProjectId,
        ///         AwsKmsConfig = new Mongodbatlas.Inputs.EncryptionAtRestAwsKmsConfigArgs
        ///         {
        ///             Enabled = true,
        ///             CustomerMasterKeyId = kmsKey.Id,
        ///             Region = atlasRegion,
        ///             RoleId = authRole.RoleId,
        ///         },
        ///     });
        /// 
        ///     var cluster = new Mongodbatlas.AdvancedCluster("cluster", new()
        ///     {
        ///         ProjectId = testEncryptionAtRest.ProjectId,
        ///         Name = "MyCluster",
        ///         ClusterType = "REPLICASET",
        ///         BackupEnabled = true,
        ///         EncryptionAtRestProvider = "AWS",
        ///         ReplicationSpecs = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
        ///             {
        ///                 RegionConfigs = new[]
        ///                 {
        ///                     new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
        ///                     {
        ///                         Priority = 7,
        ///                         ProviderName = "AWS",
        ///                         RegionName = "US_EAST_1",
        ///                         ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
        ///                         {
        ///                             InstanceSize = "M10",
        ///                             NodeCount = 3,
        ///                         },
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetEncryptionAtRest.Invoke(new()
        ///     {
        ///         ProjectId = testEncryptionAtRest.ProjectId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["isAwsKmsEncryptionAtRestValid"] = test.Apply(getEncryptionAtRestResult =&gt; getEncryptionAtRestResult.AwsKmsConfig?.Valid),
        ///     };
        /// });
        /// ```
        /// 
        /// ### Configuring encryption at rest using customer key management in Azure
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testEncryptionAtRest = new Mongodbatlas.EncryptionAtRest("test", new()
        ///     {
        ///         ProjectId = atlasProjectId,
        ///         AzureKeyVaultConfig = new Mongodbatlas.Inputs.EncryptionAtRestAzureKeyVaultConfigArgs
        ///         {
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
        ///     var test = Mongodbatlas.GetEncryptionAtRest.Invoke(new()
        ///     {
        ///         ProjectId = testEncryptionAtRest.ProjectId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["isAzureEncryptionAtRestValid"] = test.Apply(getEncryptionAtRestResult =&gt; getEncryptionAtRestResult.AzureKeyVaultConfig?.Valid),
        ///     };
        /// });
        /// ```
        /// 
        /// &gt; **NOTE:** It is possible to configure Atlas Encryption at Rest to communicate with Azure Key Vault using Azure Private Link, ensuring that all traffic between Atlas and Key Vault takes place over Azure’s private network interfaces. Please review `mongodbatlas.EncryptionAtRestPrivateEndpoint` resource for details.
        /// 
        /// ### Configuring encryption at rest using customer key management in GCP
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testEncryptionAtRest = new Mongodbatlas.EncryptionAtRest("test", new()
        ///     {
        ///         ProjectId = atlasProjectId,
        ///         GoogleCloudKmsConfig = new Mongodbatlas.Inputs.EncryptionAtRestGoogleCloudKmsConfigArgs
        ///         {
        ///             Enabled = true,
        ///             ServiceAccountKey = "{\"type\": \"service_account\",\"project_id\": \"my-project-common-0\",\"private_key_id\": \"e120598ea4f88249469fcdd75a9a785c1bb3\",\"private_key\": \"-----BEGIN PRIVATE KEY-----\\nMIIEuwIBA(truncated)SfecnS0mT94D9\\n-----END PRIVATE KEY-----\\n\",\"client_email\": \"my-email-kms-0@my-project-common-0.iam.gserviceaccount.com\",\"client_id\": \"10180967717292066\",\"auth_uri\": \"https://accounts.google.com/o/oauth2/auth\",\"token_uri\": \"https://accounts.google.com/o/oauth2/token\",\"auth_provider_x509_cert_url\": \"https://www.googleapis.com/oauth2/v1/certs\",\"client_x509_cert_url\": \"https://www.googleapis.com/robot/v1/metadata/x509/my-email-kms-0%40my-project-common-0.iam.gserviceaccount.com\"}",
        ///             KeyVersionResourceId = "projects/my-project-common-0/locations/us-east4/keyRings/my-key-ring-0/cryptoKeys/my-key-0/cryptoKeyVersions/1",
        ///         },
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetEncryptionAtRest.Invoke(new()
        ///     {
        ///         ProjectId = testEncryptionAtRest.ProjectId,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["isGcpEncryptionAtRestValid"] = test.Apply(getEncryptionAtRestResult =&gt; getEncryptionAtRestResult.GoogleCloudKmsConfig?.Valid),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetEncryptionAtRestResult> Invoke(GetEncryptionAtRestInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetEncryptionAtRestResult>("mongodbatlas:index/getEncryptionAtRest:getEncryptionAtRest", args ?? new GetEncryptionAtRestInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEncryptionAtRestArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetEncryptionAtRestArgs()
        {
        }
        public static new GetEncryptionAtRestArgs Empty => new GetEncryptionAtRestArgs();
    }

    public sealed class GetEncryptionAtRestInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetEncryptionAtRestInvokeArgs()
        {
        }
        public static new GetEncryptionAtRestInvokeArgs Empty => new GetEncryptionAtRestInvokeArgs();
    }


    [OutputType]
    public sealed class GetEncryptionAtRestResult
    {
        /// <summary>
        /// Amazon Web Services (AWS) KMS configuration details and encryption at rest configuration set for the specified project.
        /// </summary>
        public readonly Outputs.GetEncryptionAtRestAwsKmsConfigResult AwsKmsConfig;
        /// <summary>
        /// Details that define the configuration of Encryption at Rest using Azure Key Vault (AKV).
        /// </summary>
        public readonly Outputs.GetEncryptionAtRestAzureKeyVaultConfigResult AzureKeyVaultConfig;
        /// <summary>
        /// Details that define the configuration of Encryption at Rest using Google Cloud Key Management Service (KMS).
        /// </summary>
        public readonly Outputs.GetEncryptionAtRestGoogleCloudKmsConfigResult GoogleCloudKmsConfig;
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        public readonly string ProjectId;

        [OutputConstructor]
        private GetEncryptionAtRestResult(
            Outputs.GetEncryptionAtRestAwsKmsConfigResult awsKmsConfig,

            Outputs.GetEncryptionAtRestAzureKeyVaultConfigResult azureKeyVaultConfig,

            Outputs.GetEncryptionAtRestGoogleCloudKmsConfigResult googleCloudKmsConfig,

            string id,

            string projectId)
        {
            AwsKmsConfig = awsKmsConfig;
            AzureKeyVaultConfig = azureKeyVaultConfig;
            GoogleCloudKmsConfig = googleCloudKmsConfig;
            Id = id;
            ProjectId = projectId;
        }
    }
}
