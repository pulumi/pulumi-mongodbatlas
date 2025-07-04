// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.OrgInvitationArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.OrgInvitationState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
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
 * import com.pulumi.mongodbatlas.OrgInvitation;
 * import com.pulumi.mongodbatlas.OrgInvitationArgs;
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
 *         var test0 = new OrgInvitation("test0", OrgInvitationArgs.builder()
 *             .username("test0-acc-username")
 *             .orgId("<ORG_ID>")
 *             .roles("ORG_OWNER")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.OrgInvitation;
 * import com.pulumi.mongodbatlas.OrgInvitationArgs;
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
 *         var test0 = new OrgInvitation("test0", OrgInvitationArgs.builder()
 *             .username("test0-acc-username")
 *             .orgId("<ORG_ID>")
 *             .roles(            
 *                 "ORG_MEMBER",
 *                 "ORG_BILLING_ADMIN")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.OrgInvitation;
 * import com.pulumi.mongodbatlas.OrgInvitationArgs;
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
 *         var test1 = new OrgInvitation("test1", OrgInvitationArgs.builder()
 *             .username("test1-acc-username")
 *             .orgId("<ORG_ID>")
 *             .teamsIds(            
 *                 "<TEAM-0-ID>",
 *                 "<TEAM-1-ID>")
 *             .roles("ORG_MEMBER")
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
 * ~&gt; __IMPORTANT:__
 * An organization invitation can __not__ be imported once it has been accepted.
 * 
 * Import a user&#39;s invitation to an organization by separating the `org_id` and the `username` with a hyphen:
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/orgInvitation:OrgInvitation my_user 1112222b3bf99403840e8934-my_user{@literal @}mongodb.com
 * ```
 * 
 */
@ResourceType(type="mongodbatlas:index/orgInvitation:OrgInvitation")
public class OrgInvitation extends com.pulumi.resources.CustomResource {
    /**
     * Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
     * 
     */
    @Export(name="expiresAt", refs={String.class}, tree="[0]")
    private Output<String> expiresAt;

    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
     * 
     */
    public Output<String> expiresAt() {
        return this.expiresAt;
    }
    /**
     * Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
     * 
     */
    @Export(name="invitationId", refs={String.class}, tree="[0]")
    private Output<String> invitationId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
     * 
     */
    public Output<String> invitationId() {
        return this.invitationId;
    }
    /**
     * Atlas user who invited `username` to the organization.
     * 
     */
    @Export(name="inviterUsername", refs={String.class}, tree="[0]")
    private Output<String> inviterUsername;

    /**
     * @return Atlas user who invited `username` to the organization.
     * 
     */
    public Output<String> inviterUsername() {
        return this.inviterUsername;
    }
    /**
     * Unique 24-hexadecimal digit string that identifies the organization to which you want to invite a user.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the organization to which you want to invite a user.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
     * 
     */
    @Export(name="roles", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> roles;

    /**
     * @return Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
     * 
     */
    public Output<List<String>> roles() {
        return this.roles;
    }
    /**
     * An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
     * 
     */
    @Export(name="teamsIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> teamsIds;

    /**
     * @return An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
     * 
     */
    public Output<List<String>> teamsIds() {
        return this.teamsIds;
    }
    /**
     * Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output<String> username;

    /**
     * @return Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrgInvitation(java.lang.String name) {
        this(name, OrgInvitationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrgInvitation(java.lang.String name, OrgInvitationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrgInvitation(java.lang.String name, OrgInvitationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/orgInvitation:OrgInvitation", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private OrgInvitation(java.lang.String name, Output<java.lang.String> id, @Nullable OrgInvitationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/orgInvitation:OrgInvitation", name, state, makeResourceOptions(options, id), false);
    }

    private static OrgInvitationArgs makeArgs(OrgInvitationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? OrgInvitationArgs.Empty : args;
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
    public static OrgInvitation get(java.lang.String name, Output<java.lang.String> id, @Nullable OrgInvitationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OrgInvitation(name, id, state, options);
    }
}
