// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.FederatedSettingsOrgConfigArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.FederatedSettingsOrgConfigState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="mongodbatlas:index/federatedSettingsOrgConfig:FederatedSettingsOrgConfig")
public class FederatedSettingsOrgConfig extends com.pulumi.resources.CustomResource {
    @Export(name="domainAllowLists", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> domainAllowLists;

    public Output<Optional<List<String>>> domainAllowLists() {
        return Codegen.optional(this.domainAllowLists);
    }
    @Export(name="domainRestrictionEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> domainRestrictionEnabled;

    public Output<Boolean> domainRestrictionEnabled() {
        return this.domainRestrictionEnabled;
    }
    @Export(name="federationSettingsId", refs={String.class}, tree="[0]")
    private Output<String> federationSettingsId;

    public Output<String> federationSettingsId() {
        return this.federationSettingsId;
    }
    @Export(name="identityProviderId", refs={String.class}, tree="[0]")
    private Output<String> identityProviderId;

    public Output<String> identityProviderId() {
        return this.identityProviderId;
    }
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }
    @Export(name="postAuthRoleGrants", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> postAuthRoleGrants;

    public Output<Optional<List<String>>> postAuthRoleGrants() {
        return Codegen.optional(this.postAuthRoleGrants);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FederatedSettingsOrgConfig(String name) {
        this(name, FederatedSettingsOrgConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FederatedSettingsOrgConfig(String name, FederatedSettingsOrgConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FederatedSettingsOrgConfig(String name, FederatedSettingsOrgConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/federatedSettingsOrgConfig:FederatedSettingsOrgConfig", name, args == null ? FederatedSettingsOrgConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FederatedSettingsOrgConfig(String name, Output<String> id, @Nullable FederatedSettingsOrgConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/federatedSettingsOrgConfig:FederatedSettingsOrgConfig", name, state, makeResourceOptions(options, id));
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
    public static FederatedSettingsOrgConfig get(String name, Output<String> id, @Nullable FederatedSettingsOrgConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FederatedSettingsOrgConfig(name, id, state, options);
    }
}
