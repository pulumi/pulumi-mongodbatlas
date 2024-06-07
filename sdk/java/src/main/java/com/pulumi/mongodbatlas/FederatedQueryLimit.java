// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.FederatedQueryLimitArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.FederatedQueryLimitState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * `mongodbatlas.FederatedQueryLimit` provides a Federated Database Instance Query Limits resource. To learn more about Atlas Data Federation see https://www.mongodb.com/docs/atlas/data-federation/overview/.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
 * 
 * ## Example Usage
 * 
 * ### S
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.FederatedQueryLimit;
 * import com.pulumi.mongodbatlas.FederatedQueryLimitArgs;
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
 *         var test = new FederatedQueryLimit("test", FederatedQueryLimitArgs.builder()
 *             .projectId("64707f06c519c20c3a2b1b03")
 *             .tenantName("FederatedDatabseInstance0")
 *             .limitName("bytesProcessed.weekly")
 *             .overrunPolicy("BLOCK")
 *             .value(5147483648)
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
 * The Federated Database Instance Query Limit can be imported using project ID, name of the instance and limit name, in the format:
 * `project_id`--`tenant_name`--`limit_name`, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/federatedQueryLimit:FederatedQueryLimit example 1112222b3bf99403840e8934--FederatedDatabaseInstance0--bytesProcessed.daily
 * ```
 * See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createOneDataFederationQueryLimit) Documentation for more information.
 * 
 */
@ResourceType(type="mongodbatlas:index/federatedQueryLimit:FederatedQueryLimit")
public class FederatedQueryLimit extends com.pulumi.resources.CustomResource {
    /**
     * Amount that indicates the current usage of the limit.
     * 
     */
    @Export(name="currentUsage", refs={Integer.class}, tree="[0]")
    private Output<Integer> currentUsage;

    /**
     * @return Amount that indicates the current usage of the limit.
     * 
     */
    public Output<Integer> currentUsage() {
        return this.currentUsage;
    }
    /**
     * Default value of the limit.
     * * `lastModifiedDate` - Only used for Data Federation limits. Timestamp that indicates when this usage limit was last modified. This field uses the ISO 8601 timestamp format in UTC.
     * * `maximumLimit` - Maximum value of the limit.
     * 
     */
    @Export(name="defaultLimit", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> defaultLimit;

    /**
     * @return Default value of the limit.
     * * `lastModifiedDate` - Only used for Data Federation limits. Timestamp that indicates when this usage limit was last modified. This field uses the ISO 8601 timestamp format in UTC.
     * * `maximumLimit` - Maximum value of the limit.
     * 
     */
    public Output<Optional<Integer>> defaultLimit() {
        return Codegen.optional(this.defaultLimit);
    }
    @Export(name="lastModifiedDate", refs={String.class}, tree="[0]")
    private Output<String> lastModifiedDate;

    public Output<String> lastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * String enum that indicates whether the identity provider is active or not. Accepted values are:
     * * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
     * * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
     * * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
     * * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
     * 
     */
    @Export(name="limitName", refs={String.class}, tree="[0]")
    private Output<String> limitName;

    /**
     * @return String enum that indicates whether the identity provider is active or not. Accepted values are:
     * * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
     * * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
     * * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
     * * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
     * 
     */
    public Output<String> limitName() {
        return this.limitName;
    }
    @Export(name="maximumLimit", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maximumLimit;

    public Output<Optional<Integer>> maximumLimit() {
        return Codegen.optional(this.maximumLimit);
    }
    /**
     * String enum that identifies action to take when the usage limit is exceeded. If limit span is set to QUERY, this is ignored because MongoDB Cloud stops the query when it exceeds the usage limit. Accepted values are &#34;BLOCK&#34; OR &#34;BLOCK_AND_KILL&#34;
     * 
     */
    @Export(name="overrunPolicy", refs={String.class}, tree="[0]")
    private Output<String> overrunPolicy;

    /**
     * @return String enum that identifies action to take when the usage limit is exceeded. If limit span is set to QUERY, this is ignored because MongoDB Cloud stops the query when it exceeds the usage limit. Accepted values are &#34;BLOCK&#34; OR &#34;BLOCK_AND_KILL&#34;
     * 
     */
    public Output<String> overrunPolicy() {
        return this.overrunPolicy;
    }
    /**
     * The unique ID for the project to create a Federated Database Instance.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The unique ID for the project to create a Federated Database Instance.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Name of the Atlas Federated Database Instance.
     * 
     */
    @Export(name="tenantName", refs={String.class}, tree="[0]")
    private Output<String> tenantName;

    /**
     * @return Name of the Atlas Federated Database Instance.
     * 
     */
    public Output<String> tenantName() {
        return this.tenantName;
    }
    /**
     * Amount to set the limit to.
     * 
     */
    @Export(name="value", refs={Integer.class}, tree="[0]")
    private Output<Integer> value;

    /**
     * @return Amount to set the limit to.
     * 
     */
    public Output<Integer> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FederatedQueryLimit(String name) {
        this(name, FederatedQueryLimitArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FederatedQueryLimit(String name, FederatedQueryLimitArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FederatedQueryLimit(String name, FederatedQueryLimitArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/federatedQueryLimit:FederatedQueryLimit", name, args == null ? FederatedQueryLimitArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FederatedQueryLimit(String name, Output<String> id, @Nullable FederatedQueryLimitState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/federatedQueryLimit:FederatedQueryLimit", name, state, makeResourceOptions(options, id));
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
    public static FederatedQueryLimit get(String name, Output<String> id, @Nullable FederatedQueryLimitState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FederatedQueryLimit(name, id, state, options);
    }
}
