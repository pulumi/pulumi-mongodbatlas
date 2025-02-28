// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Data Source: mongodbatlas.EncryptionAtRest
 *
 * `mongodbatlas.EncryptionAtRest` describes encryption at rest configuration for an Atlas project with one of the following providers:
 *
 * [Amazon Web Services Key Management Service](https://docs.atlas.mongodb.com/security-aws-kms/#security-aws-kms)
 * [Azure Key Vault](https://docs.atlas.mongodb.com/security-azure-kms/#security-azure-kms)
 * [Google Cloud KMS](https://docs.atlas.mongodb.com/security-gcp-kms/#security-gcp-kms)
 *
 * > **IMPORTANT** By default, Atlas enables encryption at rest for all cluster storage and snapshot volumes.
 *
 * > **IMPORTANT** Atlas limits this feature to dedicated cluster tiers of M10 and greater. For more information see: https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Encryption-at-Rest-using-Customer-Key-Management
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * ### S
 *
 * ### Configuring encryption at rest using customer key management in AWS
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const setupOnly = new mongodbatlas.CloudProviderAccessSetup("setup_only", {
 *     projectId: atlasProjectId,
 *     providerName: "AWS",
 * });
 * const authRole = new mongodbatlas.CloudProviderAccessAuthorization("auth_role", {
 *     projectId: atlasProjectId,
 *     roleId: setupOnly.roleId,
 *     aws: {
 *         iamAssumedRoleArn: testRole.arn,
 *     },
 * });
 * const testEncryptionAtRest = new mongodbatlas.EncryptionAtRest("test", {
 *     projectId: atlasProjectId,
 *     awsKmsConfig: {
 *         enabled: true,
 *         customerMasterKeyId: kmsKey.id,
 *         region: atlasRegion,
 *         roleId: authRole.roleId,
 *     },
 * });
 * const cluster = new mongodbatlas.AdvancedCluster("cluster", {
 *     projectId: testEncryptionAtRest.projectId,
 *     name: "MyCluster",
 *     clusterType: "REPLICASET",
 *     backupEnabled: true,
 *     encryptionAtRestProvider: "AWS",
 *     replicationSpecs: [{
 *         regionConfigs: [{
 *             priority: 7,
 *             providerName: "AWS",
 *             regionName: "US_EAST_1",
 *             electableSpecs: {
 *                 instanceSize: "M10",
 *                 nodeCount: 3,
 *             },
 *         }],
 *     }],
 * });
 * const test = mongodbatlas.getEncryptionAtRestOutput({
 *     projectId: testEncryptionAtRest.projectId,
 * });
 * export const isAwsKmsEncryptionAtRestValid = test.apply(test => test.awsKmsConfig?.valid);
 * ```
 *
 * ### Configuring encryption at rest using customer key management in Azure
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testEncryptionAtRest = new mongodbatlas.EncryptionAtRest("test", {
 *     projectId: atlasProjectId,
 *     azureKeyVaultConfig: {
 *         enabled: true,
 *         azureEnvironment: "AZURE",
 *         tenantId: azureTenantId,
 *         subscriptionId: azureSubscriptionId,
 *         clientId: azureClientId,
 *         secret: azureClientSecret,
 *         resourceGroupName: azureResourceGroupName,
 *         keyVaultName: azureKeyVaultName,
 *         keyIdentifier: azureKeyIdentifier,
 *     },
 * });
 * const test = mongodbatlas.getEncryptionAtRestOutput({
 *     projectId: testEncryptionAtRest.projectId,
 * });
 * export const isAzureEncryptionAtRestValid = test.apply(test => test.azureKeyVaultConfig?.valid);
 * ```
 *
 * > **NOTE:** It is possible to configure Atlas Encryption at Rest to communicate with Customer Managed Keys (Azure Key Vault or AWS KMS) over private network interfaces (Azure Private Link or AWS PrivateLink). This requires enabling the `azure_key_vault_config.require_private_networking` or the `aws_kms_config.require_private_networking` attribute, together with the configuration of the `mongodbatlas.EncryptionAtRestPrivateEndpoint` resource. Please review the `mongodbatlas.EncryptionAtRestPrivateEndpoint` resource for details.
 *
 * ### Configuring encryption at rest using customer key management in GCP
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testEncryptionAtRest = new mongodbatlas.EncryptionAtRest("test", {
 *     projectId: atlasProjectId,
 *     googleCloudKmsConfig: {
 *         enabled: true,
 *         serviceAccountKey: "{\"type\": \"service_account\",\"project_id\": \"my-project-common-0\",\"private_key_id\": \"e120598ea4f88249469fcdd75a9a785c1bb3\",\"private_key\": \"-----BEGIN PRIVATE KEY-----\\nMIIEuwIBA(truncated)SfecnS0mT94D9\\n-----END PRIVATE KEY-----\\n\",\"client_email\": \"my-email-kms-0@my-project-common-0.iam.gserviceaccount.com\",\"client_id\": \"10180967717292066\",\"auth_uri\": \"https://accounts.google.com/o/oauth2/auth\",\"token_uri\": \"https://accounts.google.com/o/oauth2/token\",\"auth_provider_x509_cert_url\": \"https://www.googleapis.com/oauth2/v1/certs\",\"client_x509_cert_url\": \"https://www.googleapis.com/robot/v1/metadata/x509/my-email-kms-0%40my-project-common-0.iam.gserviceaccount.com\"}",
 *         keyVersionResourceId: "projects/my-project-common-0/locations/us-east4/keyRings/my-key-ring-0/cryptoKeys/my-key-0/cryptoKeyVersions/1",
 *     },
 * });
 * const test = mongodbatlas.getEncryptionAtRestOutput({
 *     projectId: testEncryptionAtRest.projectId,
 * });
 * export const isGcpEncryptionAtRestValid = test.apply(test => test.googleCloudKmsConfig?.valid);
 * ```
 */
export function getEncryptionAtRest(args: GetEncryptionAtRestArgs, opts?: pulumi.InvokeOptions): Promise<GetEncryptionAtRestResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getEncryptionAtRest:getEncryptionAtRest", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getEncryptionAtRest.
 */
export interface GetEncryptionAtRestArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     */
    projectId: string;
}

/**
 * A collection of values returned by getEncryptionAtRest.
 */
export interface GetEncryptionAtRestResult {
    /**
     * Amazon Web Services (AWS) KMS configuration details and encryption at rest configuration set for the specified project.
     */
    readonly awsKmsConfig: outputs.GetEncryptionAtRestAwsKmsConfig;
    /**
     * Details that define the configuration of Encryption at Rest using Azure Key Vault (AKV).
     */
    readonly azureKeyVaultConfig: outputs.GetEncryptionAtRestAzureKeyVaultConfig;
    /**
     * Details that define the configuration of Encryption at Rest using Google Cloud Key Management Service (KMS).
     */
    readonly googleCloudKmsConfig: outputs.GetEncryptionAtRestGoogleCloudKmsConfig;
    /**
     * The ID of this resource.
     */
    readonly id: string;
    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     */
    readonly projectId: string;
}
/**
 * ## # Data Source: mongodbatlas.EncryptionAtRest
 *
 * `mongodbatlas.EncryptionAtRest` describes encryption at rest configuration for an Atlas project with one of the following providers:
 *
 * [Amazon Web Services Key Management Service](https://docs.atlas.mongodb.com/security-aws-kms/#security-aws-kms)
 * [Azure Key Vault](https://docs.atlas.mongodb.com/security-azure-kms/#security-azure-kms)
 * [Google Cloud KMS](https://docs.atlas.mongodb.com/security-gcp-kms/#security-gcp-kms)
 *
 * > **IMPORTANT** By default, Atlas enables encryption at rest for all cluster storage and snapshot volumes.
 *
 * > **IMPORTANT** Atlas limits this feature to dedicated cluster tiers of M10 and greater. For more information see: https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Encryption-at-Rest-using-Customer-Key-Management
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * ### S
 *
 * ### Configuring encryption at rest using customer key management in AWS
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const setupOnly = new mongodbatlas.CloudProviderAccessSetup("setup_only", {
 *     projectId: atlasProjectId,
 *     providerName: "AWS",
 * });
 * const authRole = new mongodbatlas.CloudProviderAccessAuthorization("auth_role", {
 *     projectId: atlasProjectId,
 *     roleId: setupOnly.roleId,
 *     aws: {
 *         iamAssumedRoleArn: testRole.arn,
 *     },
 * });
 * const testEncryptionAtRest = new mongodbatlas.EncryptionAtRest("test", {
 *     projectId: atlasProjectId,
 *     awsKmsConfig: {
 *         enabled: true,
 *         customerMasterKeyId: kmsKey.id,
 *         region: atlasRegion,
 *         roleId: authRole.roleId,
 *     },
 * });
 * const cluster = new mongodbatlas.AdvancedCluster("cluster", {
 *     projectId: testEncryptionAtRest.projectId,
 *     name: "MyCluster",
 *     clusterType: "REPLICASET",
 *     backupEnabled: true,
 *     encryptionAtRestProvider: "AWS",
 *     replicationSpecs: [{
 *         regionConfigs: [{
 *             priority: 7,
 *             providerName: "AWS",
 *             regionName: "US_EAST_1",
 *             electableSpecs: {
 *                 instanceSize: "M10",
 *                 nodeCount: 3,
 *             },
 *         }],
 *     }],
 * });
 * const test = mongodbatlas.getEncryptionAtRestOutput({
 *     projectId: testEncryptionAtRest.projectId,
 * });
 * export const isAwsKmsEncryptionAtRestValid = test.apply(test => test.awsKmsConfig?.valid);
 * ```
 *
 * ### Configuring encryption at rest using customer key management in Azure
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testEncryptionAtRest = new mongodbatlas.EncryptionAtRest("test", {
 *     projectId: atlasProjectId,
 *     azureKeyVaultConfig: {
 *         enabled: true,
 *         azureEnvironment: "AZURE",
 *         tenantId: azureTenantId,
 *         subscriptionId: azureSubscriptionId,
 *         clientId: azureClientId,
 *         secret: azureClientSecret,
 *         resourceGroupName: azureResourceGroupName,
 *         keyVaultName: azureKeyVaultName,
 *         keyIdentifier: azureKeyIdentifier,
 *     },
 * });
 * const test = mongodbatlas.getEncryptionAtRestOutput({
 *     projectId: testEncryptionAtRest.projectId,
 * });
 * export const isAzureEncryptionAtRestValid = test.apply(test => test.azureKeyVaultConfig?.valid);
 * ```
 *
 * > **NOTE:** It is possible to configure Atlas Encryption at Rest to communicate with Customer Managed Keys (Azure Key Vault or AWS KMS) over private network interfaces (Azure Private Link or AWS PrivateLink). This requires enabling the `azure_key_vault_config.require_private_networking` or the `aws_kms_config.require_private_networking` attribute, together with the configuration of the `mongodbatlas.EncryptionAtRestPrivateEndpoint` resource. Please review the `mongodbatlas.EncryptionAtRestPrivateEndpoint` resource for details.
 *
 * ### Configuring encryption at rest using customer key management in GCP
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const testEncryptionAtRest = new mongodbatlas.EncryptionAtRest("test", {
 *     projectId: atlasProjectId,
 *     googleCloudKmsConfig: {
 *         enabled: true,
 *         serviceAccountKey: "{\"type\": \"service_account\",\"project_id\": \"my-project-common-0\",\"private_key_id\": \"e120598ea4f88249469fcdd75a9a785c1bb3\",\"private_key\": \"-----BEGIN PRIVATE KEY-----\\nMIIEuwIBA(truncated)SfecnS0mT94D9\\n-----END PRIVATE KEY-----\\n\",\"client_email\": \"my-email-kms-0@my-project-common-0.iam.gserviceaccount.com\",\"client_id\": \"10180967717292066\",\"auth_uri\": \"https://accounts.google.com/o/oauth2/auth\",\"token_uri\": \"https://accounts.google.com/o/oauth2/token\",\"auth_provider_x509_cert_url\": \"https://www.googleapis.com/oauth2/v1/certs\",\"client_x509_cert_url\": \"https://www.googleapis.com/robot/v1/metadata/x509/my-email-kms-0%40my-project-common-0.iam.gserviceaccount.com\"}",
 *         keyVersionResourceId: "projects/my-project-common-0/locations/us-east4/keyRings/my-key-ring-0/cryptoKeys/my-key-0/cryptoKeyVersions/1",
 *     },
 * });
 * const test = mongodbatlas.getEncryptionAtRestOutput({
 *     projectId: testEncryptionAtRest.projectId,
 * });
 * export const isGcpEncryptionAtRestValid = test.apply(test => test.googleCloudKmsConfig?.valid);
 * ```
 */
export function getEncryptionAtRestOutput(args: GetEncryptionAtRestOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetEncryptionAtRestResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getEncryptionAtRest:getEncryptionAtRest", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getEncryptionAtRest.
 */
export interface GetEncryptionAtRestOutputArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     */
    projectId: pulumi.Input<string>;
}
