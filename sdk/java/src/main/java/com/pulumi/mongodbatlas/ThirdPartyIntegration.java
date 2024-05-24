// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.ThirdPartyIntegrationArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.ThirdPartyIntegrationState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * `mongodbatlas.ThirdPartyIntegration` Provides a Third-Party Integration Settings for the given type.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 * 
 * &gt; **NOTE:** Slack integrations now use the OAuth2 verification method and must be initially configured, or updated from a legacy integration, through the Atlas third-party service integrations page. Legacy tokens will soon no longer be supported.[Read more about slack setup](https://docs.atlas.mongodb.com/tutorial/third-party-service-integrations/)
 * 
 * &gt; **IMPORTANT** Each project can only have one configuration per {INTEGRATION-TYPE}.
 * 
 * &gt; **IMPORTANT:** All arguments including the secrets will be stored in the raw state as plain-text. Read more about sensitive data in state.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.ThirdPartyIntegration;
 * import com.pulumi.mongodbatlas.ThirdPartyIntegrationArgs;
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
 *         var testDatadog = new ThirdPartyIntegration("testDatadog", ThirdPartyIntegrationArgs.builder()
 *             .projectId("<PROJECT-ID>")
 *             .type("DATADOG")
 *             .apiKey("<API-KEY>")
 *             .region("<REGION>")
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
 * Third-Party Integration Settings can be imported using project ID and the integration type, in the format `project_id`-`type`, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/thirdPartyIntegration:ThirdPartyIntegration test_datadog 1112222b3bf99403840e8934-DATADOG
 * ```
 * See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Third-Party-Integrations/operation/createThirdPartyIntegration) Documentation for more information.
 * 
 */
@ResourceType(type="mongodbatlas:index/thirdPartyIntegration:ThirdPartyIntegration")
public class ThirdPartyIntegration extends com.pulumi.resources.CustomResource {
    @Export(name="apiKey", refs={String.class}, tree="[0]")
    private Output<String> apiKey;

    public Output<String> apiKey() {
        return this.apiKey;
    }
    @Export(name="channelName", refs={String.class}, tree="[0]")
    private Output<String> channelName;

    public Output<String> channelName() {
        return this.channelName;
    }
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }
    @Export(name="microsoftTeamsWebhookUrl", refs={String.class}, tree="[0]")
    private Output<String> microsoftTeamsWebhookUrl;

    public Output<String> microsoftTeamsWebhookUrl() {
        return this.microsoftTeamsWebhookUrl;
    }
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output<String> password;

    public Output<String> password() {
        return this.password;
    }
    /**
     * The unique ID for the project to get all Third-Party service integrations
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The unique ID for the project to get all Third-Party service integrations
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }
    @Export(name="routingKey", refs={String.class}, tree="[0]")
    private Output<String> routingKey;

    public Output<String> routingKey() {
        return this.routingKey;
    }
    /**
     * @deprecated
     * This parameter is deprecated and will be removed in version 1.18.0.
     * 
     */
    @Deprecated /* This parameter is deprecated and will be removed in version 1.18.0. */
    @Export(name="scheme", refs={String.class}, tree="[0]")
    private Output<String> scheme;

    public Output<String> scheme() {
        return this.scheme;
    }
    @Export(name="secret", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> secret;

    public Output<Optional<String>> secret() {
        return Codegen.optional(this.secret);
    }
    @Export(name="serviceDiscovery", refs={String.class}, tree="[0]")
    private Output<String> serviceDiscovery;

    public Output<String> serviceDiscovery() {
        return this.serviceDiscovery;
    }
    @Export(name="serviceKey", refs={String.class}, tree="[0]")
    private Output<String> serviceKey;

    public Output<String> serviceKey() {
        return this.serviceKey;
    }
    @Export(name="teamName", refs={String.class}, tree="[0]")
    private Output<String> teamName;

    public Output<String> teamName() {
        return this.teamName;
    }
    /**
     * Third-Party Integration Settings type
     * * PAGER_DUTY
     * * DATADOG
     * * OPS_GENIE
     * * VICTOR_OPS
     * * WEBHOOK
     * * MICROSOFT_TEAMS
     * * PROMETHEUS
     * 
     * * `PAGER_DUTY`
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Third-Party Integration Settings type
     * * PAGER_DUTY
     * * DATADOG
     * * OPS_GENIE
     * * VICTOR_OPS
     * * WEBHOOK
     * * MICROSOFT_TEAMS
     * * PROMETHEUS
     * 
     * * `PAGER_DUTY`
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    public Output<String> url() {
        return this.url;
    }
    @Export(name="userName", refs={String.class}, tree="[0]")
    private Output<String> userName;

    public Output<String> userName() {
        return this.userName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ThirdPartyIntegration(String name) {
        this(name, ThirdPartyIntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ThirdPartyIntegration(String name, ThirdPartyIntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ThirdPartyIntegration(String name, ThirdPartyIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/thirdPartyIntegration:ThirdPartyIntegration", name, args == null ? ThirdPartyIntegrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ThirdPartyIntegration(String name, Output<String> id, @Nullable ThirdPartyIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/thirdPartyIntegration:ThirdPartyIntegration", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "apiKey",
                "microsoftTeamsWebhookUrl",
                "password",
                "routingKey",
                "secret",
                "serviceDiscovery",
                "serviceKey",
                "userName"
            ))
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
    public static ThirdPartyIntegration get(String name, Output<String> id, @Nullable ThirdPartyIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ThirdPartyIntegration(name, id, state, options);
    }
}
