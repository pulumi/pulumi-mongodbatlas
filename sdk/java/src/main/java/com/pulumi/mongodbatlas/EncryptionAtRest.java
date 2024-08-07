// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.EncryptionAtRestArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.EncryptionAtRestState;
import com.pulumi.mongodbatlas.outputs.EncryptionAtRestAwsKmsConfig;
import com.pulumi.mongodbatlas.outputs.EncryptionAtRestAzureKeyVaultConfig;
import com.pulumi.mongodbatlas.outputs.EncryptionAtRestGoogleCloudKmsConfig;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Encryption at Rest Settings can be imported using project ID, in the format `project_id`, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/encryptionAtRest:EncryptionAtRest example 1112222b3bf99403840e8934
 * ```
 * For more information see: [MongoDB Atlas API Reference for Encryption at Rest using Customer Key Management.](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Encryption-at-Rest-using-Customer-Key-Management)
 * 
 */
@ResourceType(type="mongodbatlas:index/encryptionAtRest:EncryptionAtRest")
public class EncryptionAtRest extends com.pulumi.resources.CustomResource {
    @Export(name="awsKmsConfig", refs={EncryptionAtRestAwsKmsConfig.class}, tree="[0]")
    private Output</* @Nullable */ EncryptionAtRestAwsKmsConfig> awsKmsConfig;

    public Output<Optional<EncryptionAtRestAwsKmsConfig>> awsKmsConfig() {
        return Codegen.optional(this.awsKmsConfig);
    }
    @Export(name="azureKeyVaultConfig", refs={EncryptionAtRestAzureKeyVaultConfig.class}, tree="[0]")
    private Output</* @Nullable */ EncryptionAtRestAzureKeyVaultConfig> azureKeyVaultConfig;

    public Output<Optional<EncryptionAtRestAzureKeyVaultConfig>> azureKeyVaultConfig() {
        return Codegen.optional(this.azureKeyVaultConfig);
    }
    @Export(name="googleCloudKmsConfig", refs={EncryptionAtRestGoogleCloudKmsConfig.class}, tree="[0]")
    private Output</* @Nullable */ EncryptionAtRestGoogleCloudKmsConfig> googleCloudKmsConfig;

    public Output<Optional<EncryptionAtRestGoogleCloudKmsConfig>> googleCloudKmsConfig() {
        return Codegen.optional(this.googleCloudKmsConfig);
    }
    /**
     * The unique identifier for the project.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The unique identifier for the project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EncryptionAtRest(String name) {
        this(name, EncryptionAtRestArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EncryptionAtRest(String name, EncryptionAtRestArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EncryptionAtRest(String name, EncryptionAtRestArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/encryptionAtRest:EncryptionAtRest", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private EncryptionAtRest(String name, Output<String> id, @Nullable EncryptionAtRestState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/encryptionAtRest:EncryptionAtRest", name, state, makeResourceOptions(options, id));
    }

    private static EncryptionAtRestArgs makeArgs(EncryptionAtRestArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EncryptionAtRestArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EncryptionAtRest get(String name, Output<String> id, @Nullable EncryptionAtRestState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EncryptionAtRest(name, id, state, options);
    }
}
