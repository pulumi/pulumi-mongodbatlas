// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.ProviderArgs;
import com.pulumi.mongodbatlas.Utilities;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The provider type for the mongodbatlas package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 * 
 */
@ResourceType(type="pulumi:providers:mongodbatlas")
public class Provider extends com.pulumi.resources.ProviderResource {
    /**
     * AWS API Access Key.
     * 
     */
    @Export(name="awsAccessKeyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> awsAccessKeyId;

    /**
     * @return AWS API Access Key.
     * 
     */
    public Output<Optional<String>> awsAccessKeyId() {
        return Codegen.optional(this.awsAccessKeyId);
    }
    /**
     * AWS API Access Secret Key.
     * 
     */
    @Export(name="awsSecretAccessKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> awsSecretAccessKey;

    /**
     * @return AWS API Access Secret Key.
     * 
     */
    public Output<Optional<String>> awsSecretAccessKey() {
        return Codegen.optional(this.awsSecretAccessKey);
    }
    /**
     * AWS Security Token Service provided session token.
     * 
     */
    @Export(name="awsSessionToken", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> awsSessionToken;

    /**
     * @return AWS Security Token Service provided session token.
     * 
     */
    public Output<Optional<String>> awsSessionToken() {
        return Codegen.optional(this.awsSessionToken);
    }
    /**
     * MongoDB Atlas Base URL
     * 
     */
    @Export(name="baseUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> baseUrl;

    /**
     * @return MongoDB Atlas Base URL
     * 
     */
    public Output<Optional<String>> baseUrl() {
        return Codegen.optional(this.baseUrl);
    }
    /**
     * MongoDB Atlas Programmatic Private Key
     * 
     */
    @Export(name="privateKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privateKey;

    /**
     * @return MongoDB Atlas Programmatic Private Key
     * 
     */
    public Output<Optional<String>> privateKey() {
        return Codegen.optional(this.privateKey);
    }
    /**
     * MongoDB Atlas Programmatic Public Key
     * 
     */
    @Export(name="publicKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> publicKey;

    /**
     * @return MongoDB Atlas Programmatic Public Key
     * 
     */
    public Output<Optional<String>> publicKey() {
        return Codegen.optional(this.publicKey);
    }
    /**
     * MongoDB Realm Base URL
     * 
     */
    @Export(name="realmBaseUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> realmBaseUrl;

    /**
     * @return MongoDB Realm Base URL
     * 
     */
    public Output<Optional<String>> realmBaseUrl() {
        return Codegen.optional(this.realmBaseUrl);
    }
    /**
     * Region where secret is stored as part of AWS Secret Manager.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> region;

    /**
     * @return Region where secret is stored as part of AWS Secret Manager.
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }
    /**
     * Name of secret stored in AWS Secret Manager.
     * 
     */
    @Export(name="secretName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> secretName;

    /**
     * @return Name of secret stored in AWS Secret Manager.
     * 
     */
    public Output<Optional<String>> secretName() {
        return Codegen.optional(this.secretName);
    }
    /**
     * AWS Security Token Service endpoint. Required for cross-AWS region or cross-AWS account secrets.
     * 
     */
    @Export(name="stsEndpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> stsEndpoint;

    /**
     * @return AWS Security Token Service endpoint. Required for cross-AWS region or cross-AWS account secrets.
     * 
     */
    public Output<Optional<String>> stsEndpoint() {
        return Codegen.optional(this.stsEndpoint);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(String name, @Nullable ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(String name, @Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private static ProviderArgs makeArgs(@Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProviderArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "privateKey"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
