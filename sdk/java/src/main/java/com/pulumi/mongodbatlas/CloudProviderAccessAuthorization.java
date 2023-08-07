// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.CloudProviderAccessAuthorizationArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.CloudProviderAccessAuthorizationState;
import com.pulumi.mongodbatlas.outputs.CloudProviderAccessAuthorizationAws;
import com.pulumi.mongodbatlas.outputs.CloudProviderAccessAuthorizationAzure;
import com.pulumi.mongodbatlas.outputs.CloudProviderAccessAuthorizationFeatureUsage;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="mongodbatlas:index/cloudProviderAccessAuthorization:CloudProviderAccessAuthorization")
public class CloudProviderAccessAuthorization extends com.pulumi.resources.CustomResource {
    @Export(name="authorizedDate", refs={String.class}, tree="[0]")
    private Output<String> authorizedDate;

    public Output<String> authorizedDate() {
        return this.authorizedDate;
    }
    @Export(name="aws", refs={CloudProviderAccessAuthorizationAws.class}, tree="[0]")
    private Output</* @Nullable */ CloudProviderAccessAuthorizationAws> aws;

    public Output<Optional<CloudProviderAccessAuthorizationAws>> aws() {
        return Codegen.optional(this.aws);
    }
    @Export(name="azure", refs={CloudProviderAccessAuthorizationAzure.class}, tree="[0]")
    private Output</* @Nullable */ CloudProviderAccessAuthorizationAzure> azure;

    public Output<Optional<CloudProviderAccessAuthorizationAzure>> azure() {
        return Codegen.optional(this.azure);
    }
    @Export(name="featureUsages", refs={List.class,CloudProviderAccessAuthorizationFeatureUsage.class}, tree="[0,1]")
    private Output<List<CloudProviderAccessAuthorizationFeatureUsage>> featureUsages;

    public Output<List<CloudProviderAccessAuthorizationFeatureUsage>> featureUsages() {
        return this.featureUsages;
    }
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    public Output<String> projectId() {
        return this.projectId;
    }
    @Export(name="roleId", refs={String.class}, tree="[0]")
    private Output<String> roleId;

    public Output<String> roleId() {
        return this.roleId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudProviderAccessAuthorization(String name) {
        this(name, CloudProviderAccessAuthorizationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudProviderAccessAuthorization(String name, CloudProviderAccessAuthorizationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudProviderAccessAuthorization(String name, CloudProviderAccessAuthorizationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/cloudProviderAccessAuthorization:CloudProviderAccessAuthorization", name, args == null ? CloudProviderAccessAuthorizationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CloudProviderAccessAuthorization(String name, Output<String> id, @Nullable CloudProviderAccessAuthorizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/cloudProviderAccessAuthorization:CloudProviderAccessAuthorization", name, state, makeResourceOptions(options, id));
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
    public static CloudProviderAccessAuthorization get(String name, Output<String> id, @Nullable CloudProviderAccessAuthorizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloudProviderAccessAuthorization(name, id, state, options);
    }
}
