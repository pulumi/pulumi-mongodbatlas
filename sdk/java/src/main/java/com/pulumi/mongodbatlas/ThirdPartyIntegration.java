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
 * &gt; **Note:** Field types NEW_RELIC, FLOWDOCK have now been fully deprecated as part of v1.10.0 release
 * 
 * &gt; **NOTE:** Slack integrations now use the OAuth2 verification method and must be initially configured, or updated from a legacy integration, through the Atlas third-party service integrations page. Legacy tokens will soon no longer be supported.[Read more about slack setup](https://docs.atlas.mongodb.com/tutorial/third-party-service-integrations/)
 * 
 * &gt; **IMPORTANT** Each project can only have one configuration per {INTEGRATION-TYPE}.
 * 
 * &gt; **IMPORTANT:** All arguments including the secrets will be stored in the raw state as plain-text. Read more about sensitive data in state.
 * 
 * ## Example Usage
 * 
 * ```java
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
 *         var testFlowdock = new ThirdPartyIntegration(&#34;testFlowdock&#34;, ThirdPartyIntegrationArgs.builder()        
 *             .apiToken(&#34;&lt;API-TOKEN&gt;&#34;)
 *             .flowName(&#34;&lt;FLOW-NAME&gt;&#34;)
 *             .orgName(&#34;&lt;ORG-NAME&gt;&#34;)
 *             .projectId(&#34;&lt;PROJECT-ID&gt;&#34;)
 *             .type(&#34;FLOWDOCK&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Third-Party Integration Settings can be imported using project ID and the integration type, in the format `project_id`-`type`, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/thirdPartyIntegration:ThirdPartyIntegration my_user 1112222b3bf99403840e8934-OPS_GENIE
 * ```
 *  See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Third-Party-Integrations/operation/createThirdPartyIntegration) Documentation for more information.
 * 
 */
@ResourceType(type="mongodbatlas:index/thirdPartyIntegration:ThirdPartyIntegration")
public class ThirdPartyIntegration extends com.pulumi.resources.CustomResource {
    /**
     * Your API Key.
     * 
     */
    @Export(name="apiKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> apiKey;

    /**
     * @return Your API Key.
     * 
     */
    public Output<Optional<String>> apiKey() {
        return Codegen.optional(this.apiKey);
    }
    @Export(name="channelName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> channelName;

    public Output<Optional<String>> channelName() {
        return Codegen.optional(this.channelName);
    }
    /**
     * Whether your cluster has Prometheus enabled.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether your cluster has Prometheus enabled.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Your Microsoft Teams incoming webhook URL.
     * 
     */
    @Export(name="microsoftTeamsWebhookUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> microsoftTeamsWebhookUrl;

    /**
     * @return Your Microsoft Teams incoming webhook URL.
     * 
     */
    public Output<Optional<String>> microsoftTeamsWebhookUrl() {
        return Codegen.optional(this.microsoftTeamsWebhookUrl);
    }
    /**
     * Your Prometheus password.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> password;

    /**
     * @return Your Prometheus password.
     * 
     */
    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
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
    /**
     * Indicates which API URL to use, either &#34;US&#34; or &#34;EU&#34;. OpsGenie will use &#34;US&#34; by default.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return Indicates which API URL to use, either &#34;US&#34; or &#34;EU&#34;. OpsGenie will use &#34;US&#34; by default.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * An optional field for your Routing Key.
     * 
     */
    @Export(name="routingKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> routingKey;

    /**
     * @return An optional field for your Routing Key.
     * 
     */
    public Output<Optional<String>> routingKey() {
        return Codegen.optional(this.routingKey);
    }
    /**
     * Your Prometheus protocol scheme configured for requests.
     * 
     */
    @Export(name="scheme", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scheme;

    /**
     * @return Your Prometheus protocol scheme configured for requests.
     * 
     */
    public Output<Optional<String>> scheme() {
        return Codegen.optional(this.scheme);
    }
    /**
     * An optional field for your webhook secret.
     * 
     */
    @Export(name="secret", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> secret;

    /**
     * @return An optional field for your webhook secret.
     * 
     */
    public Output<Optional<String>> secret() {
        return Codegen.optional(this.secret);
    }
    /**
     * Indicates which service discovery method is used, either file or http.
     * 
     */
    @Export(name="serviceDiscovery", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> serviceDiscovery;

    /**
     * @return Indicates which service discovery method is used, either file or http.
     * 
     */
    public Output<Optional<String>> serviceDiscovery() {
        return Codegen.optional(this.serviceDiscovery);
    }
    /**
     * Your Service Key.
     * 
     */
    @Export(name="serviceKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> serviceKey;

    /**
     * @return Your Service Key.
     * 
     */
    public Output<Optional<String>> serviceKey() {
        return Codegen.optional(this.serviceKey);
    }
    @Export(name="teamName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> teamName;

    public Output<Optional<String>> teamName() {
        return Codegen.optional(this.teamName);
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
     * * NEW_RELIC*
     * * FLOWDOCK*
     * 
     * *resource has now been fully deprecated as part of v1.10.0 release
     * 
     * Additional values based on Type
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
     * * NEW_RELIC*
     * * FLOWDOCK*
     * 
     * *resource has now been fully deprecated as part of v1.10.0 release
     * 
     * Additional values based on Type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Your webhook URL.
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> url;

    /**
     * @return Your webhook URL.
     * 
     */
    public Output<Optional<String>> url() {
        return Codegen.optional(this.url);
    }
    /**
     * Your Prometheus username.
     * 
     */
    @Export(name="userName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userName;

    /**
     * @return Your Prometheus username.
     * 
     */
    public Output<Optional<String>> userName() {
        return Codegen.optional(this.userName);
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
