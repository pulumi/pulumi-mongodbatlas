// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.ProjectIpAccessListArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.ProjectIpAccessListState;
import com.pulumi.mongodbatlas.outputs.ProjectIpAccessListTimeouts;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * # Resource: mongodbatlas.ProjectIpAccessList
 * 
 * `mongodbatlas.ProjectIpAccessList` provides an IP Access List entry resource. The access list grants access from IPs, CIDRs or AWS Security Groups (if VPC Peering is enabled) to clusters within the Project.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 * 
 * &gt; **IMPORTANT:**
 * When you remove an entry from the access list, existing connections from the removed address(es) may remain open for a variable amount of time. How much time passes before Atlas closes the connection depends on several factors, including how the connection was established, the particular behavior of the application or driver using the address, and the connection protocol (e.g., TCP or UDP). This is particularly important to consider when changing an existing IP address or CIDR block as they cannot be updated via the Provider (comments can however), hence a change will force the destruction and recreation of entries.
 * 
 * ## Example Usage
 * 
 * ### Using CIDR Block
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.ProjectIpAccessList;
 * import com.pulumi.mongodbatlas.ProjectIpAccessListArgs;
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
 *         var test = new ProjectIpAccessList("test", ProjectIpAccessListArgs.builder()
 *             .projectId("<PROJECT-ID>")
 *             .cidrBlock("1.2.3.4/32")
 *             .comment("cidr block for tf acc testing")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Using IP Address
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.ProjectIpAccessList;
 * import com.pulumi.mongodbatlas.ProjectIpAccessListArgs;
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
 *         var test = new ProjectIpAccessList("test", ProjectIpAccessListArgs.builder()
 *             .projectId("<PROJECT-ID>")
 *             .ipAddress("2.3.4.5")
 *             .comment("ip address for tf acc testing")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Using an AWS Security Group
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.NetworkContainer;
 * import com.pulumi.mongodbatlas.NetworkContainerArgs;
 * import com.pulumi.mongodbatlas.NetworkPeering;
 * import com.pulumi.mongodbatlas.NetworkPeeringArgs;
 * import com.pulumi.mongodbatlas.ProjectIpAccessList;
 * import com.pulumi.mongodbatlas.ProjectIpAccessListArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var test = new NetworkContainer("test", NetworkContainerArgs.builder()
 *             .projectId("<PROJECT-ID>")
 *             .atlasCidrBlock("192.168.208.0/21")
 *             .providerName("AWS")
 *             .regionName("US_EAST_1")
 *             .build());
 * 
 *         var testNetworkPeering = new NetworkPeering("testNetworkPeering", NetworkPeeringArgs.builder()
 *             .projectId("<PROJECT-ID>")
 *             .containerId(test.containerId())
 *             .accepterRegionName("us-east-1")
 *             .providerName("AWS")
 *             .routeTableCidrBlock("172.31.0.0/16")
 *             .vpcId("vpc-0d93d6f69f1578bd8")
 *             .awsAccountId("232589400519")
 *             .build());
 * 
 *         var testProjectIpAccessList = new ProjectIpAccessList("testProjectIpAccessList", ProjectIpAccessListArgs.builder()
 *             .projectId("<PROJECT-ID>")
 *             .awsSecurityGroup("sg-0026348ec11780bd1")
 *             .comment("TestAcc for awsSecurityGroup")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(testNetworkPeering)
 *                 .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * &gt; **IMPORTANT:** In order to use AWS Security Group(s) VPC Peering must be enabled like above example.
 * 
 * ## Import
 * 
 * IP Access List entries can be imported using the `project_id` and `cidr_block` or `ip_address`, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/projectIpAccessList:ProjectIpAccessList test 5d0f1f74cf09a29120e123cd-10.242.88.0/21
 * ```
 * For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/access-lists/)
 * 
 */
@ResourceType(type="mongodbatlas:index/projectIpAccessList:ProjectIpAccessList")
public class ProjectIpAccessList extends com.pulumi.resources.CustomResource {
    /**
     * Unique identifier of the AWS security group to add to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
     * 
     */
    @Export(name="awsSecurityGroup", refs={String.class}, tree="[0]")
    private Output<String> awsSecurityGroup;

    /**
     * @return Unique identifier of the AWS security group to add to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
     * 
     */
    public Output<String> awsSecurityGroup() {
        return this.awsSecurityGroup;
    }
    /**
     * Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
     * 
     */
    @Export(name="cidrBlock", refs={String.class}, tree="[0]")
    private Output<String> cidrBlock;

    /**
     * @return Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
     * 
     */
    public Output<String> cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * Comment to add to the access list entry.
     * 
     * &gt; **NOTE:** One of the following attributes must set:  `aws_security_group`, `cidr_block`  or `ip_address`.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output<String> comment;

    /**
     * @return Comment to add to the access list entry.
     * 
     * &gt; **NOTE:** One of the following attributes must set:  `aws_security_group`, `cidr_block`  or `ip_address`.
     * 
     */
    public Output<String> comment() {
        return this.comment;
    }
    /**
     * Single IP address to be added to the access list. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
     * 
     */
    @Export(name="ipAddress", refs={String.class}, tree="[0]")
    private Output<String> ipAddress;

    /**
     * @return Single IP address to be added to the access list. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }
    /**
     * Unique identifier for the project to which you want to add one or more access list entries.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Unique identifier for the project to which you want to add one or more access list entries.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    @Export(name="timeouts", refs={ProjectIpAccessListTimeouts.class}, tree="[0]")
    private Output</* @Nullable */ ProjectIpAccessListTimeouts> timeouts;

    public Output<Optional<ProjectIpAccessListTimeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProjectIpAccessList(java.lang.String name) {
        this(name, ProjectIpAccessListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProjectIpAccessList(java.lang.String name, ProjectIpAccessListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProjectIpAccessList(java.lang.String name, ProjectIpAccessListArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/projectIpAccessList:ProjectIpAccessList", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ProjectIpAccessList(java.lang.String name, Output<java.lang.String> id, @Nullable ProjectIpAccessListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/projectIpAccessList:ProjectIpAccessList", name, state, makeResourceOptions(options, id), false);
    }

    private static ProjectIpAccessListArgs makeArgs(ProjectIpAccessListArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProjectIpAccessListArgs.Empty : args;
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
    public static ProjectIpAccessList get(java.lang.String name, Output<java.lang.String> id, @Nullable ProjectIpAccessListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProjectIpAccessList(name, id, state, options);
    }
}
