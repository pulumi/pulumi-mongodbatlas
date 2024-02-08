// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.AccessListApiKeyArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.AccessListApiKeyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Using CIDR Block
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.AccessListApiKey;
 * import com.pulumi.mongodbatlas.AccessListApiKeyArgs;
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
 *         var test = new AccessListApiKey(&#34;test&#34;, AccessListApiKeyArgs.builder()        
 *             .apiKeyId(&#34;a29120e123cd&#34;)
 *             .cidrBlock(&#34;1.2.3.4/32&#34;)
 *             .orgId(&#34;&lt;ORG-ID&gt;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Using IP Address
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.AccessListApiKey;
 * import com.pulumi.mongodbatlas.AccessListApiKeyArgs;
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
 *         var test = new AccessListApiKey(&#34;test&#34;, AccessListApiKeyArgs.builder()        
 *             .apiKeyId(&#34;a29120e123cd&#34;)
 *             .ipAddress(&#34;2.3.4.5&#34;)
 *             .orgId(&#34;&lt;ORG-ID&gt;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * IP Access List entries can be imported using the `org_id` , `api_key_id` and `cidr_block` or `ip_address`, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/accessListApiKey:AccessListApiKey test 5d0f1f74cf09a29120e123cd-a29120e123cd-10.242.88.0/21
 * ```
 *  For more information see: [MongoDB Atlas API Reference.](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Programmatic-API-Keys/operation/createApiKeyAccessList)
 * 
 */
@ResourceType(type="mongodbatlas:index/accessListApiKey:AccessListApiKey")
public class AccessListApiKey extends com.pulumi.resources.CustomResource {
    /**
     * Unique identifier for the Organization API Key for which you want to create a new access list entry.
     * 
     * &gt; **NOTE:** One of the following attributes must set: `cidr_block`  or `ip_address` but not both.
     * 
     */
    @Export(name="apiKeyId", refs={String.class}, tree="[0]")
    private Output<String> apiKeyId;

    /**
     * @return Unique identifier for the Organization API Key for which you want to create a new access list entry.
     * 
     * &gt; **NOTE:** One of the following attributes must set: `cidr_block`  or `ip_address` but not both.
     * 
     */
    public Output<String> apiKeyId() {
        return this.apiKeyId;
    }
    /**
     * Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `cidrBlock`, or one `ipAddress`.
     * 
     */
    @Export(name="cidrBlock", refs={String.class}, tree="[0]")
    private Output<String> cidrBlock;

    /**
     * @return Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `cidrBlock`, or one `ipAddress`.
     * 
     */
    public Output<String> cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * Single IP address to be added to the access list.
     * 
     */
    @Export(name="ipAddress", refs={String.class}, tree="[0]")
    private Output<String> ipAddress;

    /**
     * @return Single IP address to be added to the access list.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessListApiKey(String name) {
        this(name, AccessListApiKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessListApiKey(String name, AccessListApiKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessListApiKey(String name, AccessListApiKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/accessListApiKey:AccessListApiKey", name, args == null ? AccessListApiKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessListApiKey(String name, Output<String> id, @Nullable AccessListApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/accessListApiKey:AccessListApiKey", name, state, makeResourceOptions(options, id));
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
    public static AccessListApiKey get(String name, Output<String> id, @Nullable AccessListApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessListApiKey(name, id, state, options);
    }
}
