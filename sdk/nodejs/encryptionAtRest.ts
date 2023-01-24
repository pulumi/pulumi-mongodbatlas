// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class EncryptionAtRest extends pulumi.CustomResource {
    /**
     * Get an existing EncryptionAtRest resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EncryptionAtRestState, opts?: pulumi.CustomResourceOptions): EncryptionAtRest {
        return new EncryptionAtRest(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/encryptionAtRest:EncryptionAtRest';

    /**
     * Returns true if the given object is an instance of EncryptionAtRest.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EncryptionAtRest {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EncryptionAtRest.__pulumiType;
    }

    /**
     * Specifies AWS KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
     *
     * @deprecated use aws_kms_config instead
     */
    public readonly awsKms!: pulumi.Output<{[key: string]: string} | undefined>;
    public readonly awsKmsConfig!: pulumi.Output<outputs.EncryptionAtRestAwsKmsConfig | undefined>;
    /**
     * Specifies Azure Key Vault configuration details and whether Encryption at Rest is enabled for an Atlas project.
     *
     * @deprecated use azure_key_vault_config instead
     */
    public readonly azureKeyVault!: pulumi.Output<{[key: string]: string} | undefined>;
    public readonly azureKeyVaultConfig!: pulumi.Output<outputs.EncryptionAtRestAzureKeyVaultConfig | undefined>;
    /**
     * Specifies GCP KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
     *
     * @deprecated use google_cloud_kms_config instead
     */
    public readonly googleCloudKms!: pulumi.Output<{[key: string]: string} | undefined>;
    public readonly googleCloudKmsConfig!: pulumi.Output<outputs.EncryptionAtRestGoogleCloudKmsConfig | undefined>;
    /**
     * The unique identifier for the project.
     */
    public readonly projectId!: pulumi.Output<string>;

    /**
     * Create a EncryptionAtRest resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EncryptionAtRestArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EncryptionAtRestArgs | EncryptionAtRestState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EncryptionAtRestState | undefined;
            resourceInputs["awsKms"] = state ? state.awsKms : undefined;
            resourceInputs["awsKmsConfig"] = state ? state.awsKmsConfig : undefined;
            resourceInputs["azureKeyVault"] = state ? state.azureKeyVault : undefined;
            resourceInputs["azureKeyVaultConfig"] = state ? state.azureKeyVaultConfig : undefined;
            resourceInputs["googleCloudKms"] = state ? state.googleCloudKms : undefined;
            resourceInputs["googleCloudKmsConfig"] = state ? state.googleCloudKmsConfig : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
        } else {
            const args = argsOrState as EncryptionAtRestArgs | undefined;
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["awsKms"] = args?.awsKms ? pulumi.secret(args.awsKms) : undefined;
            resourceInputs["awsKmsConfig"] = args?.awsKmsConfig ? pulumi.secret(args.awsKmsConfig) : undefined;
            resourceInputs["azureKeyVault"] = args?.azureKeyVault ? pulumi.secret(args.azureKeyVault) : undefined;
            resourceInputs["azureKeyVaultConfig"] = args?.azureKeyVaultConfig ? pulumi.secret(args.azureKeyVaultConfig) : undefined;
            resourceInputs["googleCloudKms"] = args?.googleCloudKms ? pulumi.secret(args.googleCloudKms) : undefined;
            resourceInputs["googleCloudKmsConfig"] = args?.googleCloudKmsConfig ? pulumi.secret(args.googleCloudKmsConfig) : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["awsKms", "awsKmsConfig", "azureKeyVault", "azureKeyVaultConfig", "googleCloudKms", "googleCloudKmsConfig"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(EncryptionAtRest.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EncryptionAtRest resources.
 */
export interface EncryptionAtRestState {
    /**
     * Specifies AWS KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
     *
     * @deprecated use aws_kms_config instead
     */
    awsKms?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    awsKmsConfig?: pulumi.Input<inputs.EncryptionAtRestAwsKmsConfig>;
    /**
     * Specifies Azure Key Vault configuration details and whether Encryption at Rest is enabled for an Atlas project.
     *
     * @deprecated use azure_key_vault_config instead
     */
    azureKeyVault?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    azureKeyVaultConfig?: pulumi.Input<inputs.EncryptionAtRestAzureKeyVaultConfig>;
    /**
     * Specifies GCP KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
     *
     * @deprecated use google_cloud_kms_config instead
     */
    googleCloudKms?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    googleCloudKmsConfig?: pulumi.Input<inputs.EncryptionAtRestGoogleCloudKmsConfig>;
    /**
     * The unique identifier for the project.
     */
    projectId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EncryptionAtRest resource.
 */
export interface EncryptionAtRestArgs {
    /**
     * Specifies AWS KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
     *
     * @deprecated use aws_kms_config instead
     */
    awsKms?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    awsKmsConfig?: pulumi.Input<inputs.EncryptionAtRestAwsKmsConfig>;
    /**
     * Specifies Azure Key Vault configuration details and whether Encryption at Rest is enabled for an Atlas project.
     *
     * @deprecated use azure_key_vault_config instead
     */
    azureKeyVault?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    azureKeyVaultConfig?: pulumi.Input<inputs.EncryptionAtRestAzureKeyVaultConfig>;
    /**
     * Specifies GCP KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
     *
     * @deprecated use google_cloud_kms_config instead
     */
    googleCloudKms?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    googleCloudKmsConfig?: pulumi.Input<inputs.EncryptionAtRestGoogleCloudKmsConfig>;
    /**
     * The unique identifier for the project.
     */
    projectId: pulumi.Input<string>;
}
