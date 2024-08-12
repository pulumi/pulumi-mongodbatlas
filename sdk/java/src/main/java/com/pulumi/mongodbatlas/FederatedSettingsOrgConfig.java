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
import com.pulumi.mongodbatlas.outputs.FederatedSettingsOrgConfigUserConflict;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## # Resource: mongodbatlas.FederatedSettingsOrgConfig
 * 
 * `mongodbatlas.FederatedSettingsOrgConfig` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Identity Providers provides federated settings outputs for the configured Identity Providers.
 * 
 * ## Example Usage
 * 
 * &gt; **IMPORTANT** You **MUST** import this resource before you can manage it with this provider.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.FederatedSettingsOrgConfig;
 * import com.pulumi.mongodbatlas.FederatedSettingsOrgConfigArgs;
 * import com.pulumi.mongodbatlas.MongodbatlasFunctions;
 * import com.pulumi.mongodbatlas.inputs.GetFederatedSettingsOrgConfigsArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var orgConnection = new FederatedSettingsOrgConfig("orgConnection", FederatedSettingsOrgConfigArgs.builder()
 *             .federationSettingsId("627a9687f7f7f7f774de306f14")
 *             .orgId("627a9683ea7ff7f74de306f14")
 *             .dataAccessIdentityProviderIds("64d613677e1ad50839cce4db")
 *             .domainRestrictionEnabled(false)
 *             .domainAllowLists("mydomain.com")
 *             .postAuthRoleGrants("ORG_MEMBER")
 *             .identityProviderId("0oaqyt9fc2ySTWnA0357")
 *             .build());
 * 
 *         final var orgConfigsDs = MongodbatlasFunctions.getFederatedSettingsOrgConfigs(GetFederatedSettingsOrgConfigsArgs.builder()
 *             .federationSettingsId(orgConnectionMongodbatlasFederatedSettingsOrgConfig.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * FederatedSettingsOrgConfig must be imported using federation_settings_id-org_id, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/federatedSettingsOrgConfig:FederatedSettingsOrgConfig org_connection 627a9687f7f7f7f774de306f14-627a9683ea7ff7f74de306f14
 * ```
 * For more information see: [MongoDB Atlas API Reference.](https://www.mongodb.com/docs/atlas/reference/api/federation-configuration/)
 * 
 */
@ResourceType(type="mongodbatlas:index/federatedSettingsOrgConfig:FederatedSettingsOrgConfig")
public class FederatedSettingsOrgConfig extends com.pulumi.resources.CustomResource {
    /**
     * The collection of unique ids representing the identity providers that can be used for data access in this organization.
     * 
     */
    @Export(name="dataAccessIdentityProviderIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> dataAccessIdentityProviderIds;

    /**
     * @return The collection of unique ids representing the identity providers that can be used for data access in this organization.
     * 
     */
    public Output<Optional<List<String>>> dataAccessIdentityProviderIds() {
        return Codegen.optional(this.dataAccessIdentityProviderIds);
    }
    /**
     * List that contains the approved domains from which organization users can log in.
     * 
     */
    @Export(name="domainAllowLists", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> domainAllowLists;

    /**
     * @return List that contains the approved domains from which organization users can log in.
     * 
     */
    public Output<Optional<List<String>>> domainAllowLists() {
        return Codegen.optional(this.domainAllowLists);
    }
    /**
     * Flag that indicates whether domain restriction is enabled for the connected organization.
     * 
     */
    @Export(name="domainRestrictionEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> domainRestrictionEnabled;

    /**
     * @return Flag that indicates whether domain restriction is enabled for the connected organization.
     * 
     */
    public Output<Boolean> domainRestrictionEnabled() {
        return this.domainRestrictionEnabled;
    }
    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     * 
     */
    @Export(name="federationSettingsId", refs={String.class}, tree="[0]")
    private Output<String> federationSettingsId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     * 
     */
    public Output<String> federationSettingsId() {
        return this.federationSettingsId;
    }
    /**
     * Legacy 20-hexadecimal digit string that identifies the SAML access identity provider that this connected org config is associated with. Removing the attribute or providing the value `&#34;&#34;` will detach/remove the SAML identity provider. This id can be found in two ways:
     * 1. Within the Federation Management UI in Atlas in the Identity Providers tab by clicking the info icon in the IdP ID row of a configured SAML identity provider
     * 2. `okta_idp_id` on the `mongodbatlas.FederatedSettingsIdentityProvider` resource
     * 
     */
    @Export(name="identityProviderId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> identityProviderId;

    /**
     * @return Legacy 20-hexadecimal digit string that identifies the SAML access identity provider that this connected org config is associated with. Removing the attribute or providing the value `&#34;&#34;` will detach/remove the SAML identity provider. This id can be found in two ways:
     * 1. Within the Federation Management UI in Atlas in the Identity Providers tab by clicking the info icon in the IdP ID row of a configured SAML identity provider
     * 2. `okta_idp_id` on the `mongodbatlas.FederatedSettingsIdentityProvider` resource
     * 
     */
    public Output<Optional<String>> identityProviderId() {
        return Codegen.optional(this.identityProviderId);
    }
    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * List that contains the default [roles](https://www.mongodb.com/docs/atlas/reference/user-roles/#std-label-organization-roles) granted to users who authenticate through the IdP in a connected organization.
     * 
     */
    @Export(name="postAuthRoleGrants", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> postAuthRoleGrants;

    /**
     * @return List that contains the default [roles](https://www.mongodb.com/docs/atlas/reference/user-roles/#std-label-organization-roles) granted to users who authenticate through the IdP in a connected organization.
     * 
     */
    public Output<Optional<List<String>>> postAuthRoleGrants() {
        return Codegen.optional(this.postAuthRoleGrants);
    }
    /**
     * List that contains the users who have an email address that doesn&#39;t match any domain on the allowed list. See below
     * 
     */
    @Export(name="userConflicts", refs={List.class,FederatedSettingsOrgConfigUserConflict.class}, tree="[0,1]")
    private Output<List<FederatedSettingsOrgConfigUserConflict>> userConflicts;

    /**
     * @return List that contains the users who have an email address that doesn&#39;t match any domain on the allowed list. See below
     * 
     */
    public Output<List<FederatedSettingsOrgConfigUserConflict>> userConflicts() {
        return this.userConflicts;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FederatedSettingsOrgConfig(java.lang.String name) {
        this(name, FederatedSettingsOrgConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FederatedSettingsOrgConfig(java.lang.String name, FederatedSettingsOrgConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FederatedSettingsOrgConfig(java.lang.String name, FederatedSettingsOrgConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/federatedSettingsOrgConfig:FederatedSettingsOrgConfig", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private FederatedSettingsOrgConfig(java.lang.String name, Output<java.lang.String> id, @Nullable FederatedSettingsOrgConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/federatedSettingsOrgConfig:FederatedSettingsOrgConfig", name, state, makeResourceOptions(options, id), false);
    }

    private static FederatedSettingsOrgConfigArgs makeArgs(FederatedSettingsOrgConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FederatedSettingsOrgConfigArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static FederatedSettingsOrgConfig get(java.lang.String name, Output<java.lang.String> id, @Nullable FederatedSettingsOrgConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FederatedSettingsOrgConfig(name, id, state, options);
    }
}
