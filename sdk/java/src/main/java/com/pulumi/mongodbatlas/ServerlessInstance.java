// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.ServerlessInstanceArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.ServerlessInstanceState;
import com.pulumi.mongodbatlas.outputs.ServerlessInstanceLink;
import com.pulumi.mongodbatlas.outputs.ServerlessInstanceTag;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Serverless Instance can be imported using the group ID and serverless instance name, in the format `GROUP_ID-SERVERLESS_INSTANCE_NAME`, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/serverlessInstance:ServerlessInstance my_serverless_instance 1112222b3bf99403840e8934-My Serverless Instance
 * ```
 * 
 *  For more information see[MongoDB Atlas API - Serverless Instance](https://docs.atlas.mongodb.com/reference/api/serverless-instances/) Documentation.
 * 
 */
@ResourceType(type="mongodbatlas:index/serverlessInstance:ServerlessInstance")
public class ServerlessInstance extends com.pulumi.resources.CustomResource {
    /**
     * List of Serverless Private Endpoint Connections
     * 
     */
    @Export(name="connectionStringsPrivateEndpointSrvs", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> connectionStringsPrivateEndpointSrvs;

    /**
     * @return List of Serverless Private Endpoint Connections
     * 
     */
    public Output<List<String>> connectionStringsPrivateEndpointSrvs() {
        return this.connectionStringsPrivateEndpointSrvs;
    }
    /**
     * Public `mongodb+srv://` connection string that you can use to connect to this serverless instance.
     * 
     */
    @Export(name="connectionStringsStandardSrv", refs={String.class}, tree="[0]")
    private Output<String> connectionStringsStandardSrv;

    /**
     * @return Public `mongodb+srv://` connection string that you can use to connect to this serverless instance.
     * 
     */
    public Output<String> connectionStringsStandardSrv() {
        return this.connectionStringsStandardSrv;
    }
    /**
     * Flag that indicates whether the serverless instance uses [Serverless Continuous Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup). If this parameter is false or not used, the serverless instance uses [Basic Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup).
     * 
     */
    @Export(name="continuousBackupEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> continuousBackupEnabled;

    /**
     * @return Flag that indicates whether the serverless instance uses [Serverless Continuous Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup). If this parameter is false or not used, the serverless instance uses [Basic Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup).
     * 
     */
    public Output<Boolean> continuousBackupEnabled() {
        return this.continuousBackupEnabled;
    }
    /**
     * Timestamp that indicates when MongoDB Cloud created the serverless instance. The timestamp displays in the ISO 8601 date and time format in UTC.
     * 
     */
    @Export(name="createDate", refs={String.class}, tree="[0]")
    private Output<String> createDate;

    /**
     * @return Timestamp that indicates when MongoDB Cloud created the serverless instance. The timestamp displays in the ISO 8601 date and time format in UTC.
     * 
     */
    public Output<String> createDate() {
        return this.createDate;
    }
    @Export(name="links", refs={List.class,ServerlessInstanceLink.class}, tree="[0,1]")
    private Output<List<ServerlessInstanceLink>> links;

    public Output<List<ServerlessInstanceLink>> links() {
        return this.links;
    }
    /**
     * Version of MongoDB that the serverless instance runs, in `&lt;major version&gt;`.`&lt;minor version&gt;` format.
     * 
     */
    @Export(name="mongoDbVersion", refs={String.class}, tree="[0]")
    private Output<String> mongoDbVersion;

    /**
     * @return Version of MongoDB that the serverless instance runs, in `&lt;major version&gt;`.`&lt;minor version&gt;` format.
     * 
     */
    public Output<String> mongoDbVersion() {
        return this.mongoDbVersion;
    }
    /**
     * Human-readable label that identifies the serverless instance.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Human-readable label that identifies the serverless instance.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the organization or project you want to create the serverless instance within.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The ID of the organization or project you want to create the serverless instance within.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Cloud service provider on which MongoDB Cloud provisioned the serverless instance.
     * 
     */
    @Export(name="providerSettingsBackingProviderName", refs={String.class}, tree="[0]")
    private Output<String> providerSettingsBackingProviderName;

    /**
     * @return Cloud service provider on which MongoDB Cloud provisioned the serverless instance.
     * 
     */
    public Output<String> providerSettingsBackingProviderName() {
        return this.providerSettingsBackingProviderName;
    }
    /**
     * Cloud service provider that applies to the provisioned the serverless instance.
     * 
     */
    @Export(name="providerSettingsProviderName", refs={String.class}, tree="[0]")
    private Output<String> providerSettingsProviderName;

    /**
     * @return Cloud service provider that applies to the provisioned the serverless instance.
     * 
     */
    public Output<String> providerSettingsProviderName() {
        return this.providerSettingsProviderName;
    }
    /**
     * Human-readable label that identifies the physical location of your MongoDB serverless instance. The region you choose can affect network latency for clients accessing your databases.
     * 
     */
    @Export(name="providerSettingsRegionName", refs={String.class}, tree="[0]")
    private Output<String> providerSettingsRegionName;

    /**
     * @return Human-readable label that identifies the physical location of your MongoDB serverless instance. The region you choose can affect network latency for clients accessing your databases.
     * 
     */
    public Output<String> providerSettingsRegionName() {
        return this.providerSettingsRegionName;
    }
    /**
     * Stage of deployment of this serverless instance when the resource made its request.
     * 
     */
    @Export(name="stateName", refs={String.class}, tree="[0]")
    private Output<String> stateName;

    /**
     * @return Stage of deployment of this serverless instance when the resource made its request.
     * 
     */
    public Output<String> stateName() {
        return this.stateName;
    }
    /**
     * Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below.
     * 
     */
    @Export(name="tags", refs={List.class,ServerlessInstanceTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ServerlessInstanceTag>> tags;

    /**
     * @return Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below.
     * 
     */
    public Output<Optional<List<ServerlessInstanceTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won&#39;t delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
     * 
     */
    @Export(name="terminationProtectionEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> terminationProtectionEnabled;

    /**
     * @return Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won&#39;t delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
     * 
     */
    public Output<Boolean> terminationProtectionEnabled() {
        return this.terminationProtectionEnabled;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerlessInstance(String name) {
        this(name, ServerlessInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerlessInstance(String name, ServerlessInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerlessInstance(String name, ServerlessInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/serverlessInstance:ServerlessInstance", name, args == null ? ServerlessInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerlessInstance(String name, Output<String> id, @Nullable ServerlessInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/serverlessInstance:ServerlessInstance", name, state, makeResourceOptions(options, id));
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
    public static ServerlessInstance get(String name, Output<String> id, @Nullable ServerlessInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerlessInstance(name, id, state, options);
    }
}
