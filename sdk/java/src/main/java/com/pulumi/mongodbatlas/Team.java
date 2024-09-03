// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.TeamArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.TeamState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * # Resource: mongodbatlas.Team
 * 
 * `mongodbatlas.Team` provides a Team resource. The resource lets you create, edit and delete Teams. Also, Teams can be assigned to multiple projects, and team members’ access to the project is determined by the team’s project role.
 * 
 * &gt; **IMPORTANT:** MongoDB Atlas Team are limited to a maximum of 250 teams in an organization and 100 teams per project.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
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
 * import com.pulumi.mongodbatlas.Team;
 * import com.pulumi.mongodbatlas.TeamArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var test = new Team("test", TeamArgs.builder()
 *             .orgId("<ORGANIZATION-ID>")
 *             .name("myNewTeam")
 *             .usernames(            
 *                 "user1}{@literal @}{@code email.com",
 *                 "user2}{@literal @}{@code email.com",
 *                 "user3}{@literal @}{@code email.com")
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Teams can be imported using the organization ID and team id, in the format ORGID-TEAMID, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/team:Team my_team 1112222b3bf99403840e8934-1112222b3bf99403840e8935
 * ```
 * See detailed information for arguments and attributes: [MongoDB API Teams](https://docs.atlas.mongodb.com/reference/api/teams-create-one/)
 * 
 */
@ResourceType(type="mongodbatlas:index/team:Team")
public class Team extends com.pulumi.resources.CustomResource {
    /**
     * The name of the team you want to create.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the team you want to create.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The unique identifier for the organization you want to associate the team with.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    /**
     * @return The unique identifier for the organization you want to associate the team with.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * The unique identifier for the team.
     * 
     */
    @Export(name="teamId", refs={String.class}, tree="[0]")
    private Output<String> teamId;

    /**
     * @return The unique identifier for the team.
     * 
     */
    public Output<String> teamId() {
        return this.teamId;
    }
    /**
     * The Atlas usernames (email address). You can only add Atlas users who are part of the organization. Users who have not accepted an invitation to join the organization cannot be added as team members. There is a maximum of 250 Atlas users per team.
     * 
     */
    @Export(name="usernames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> usernames;

    /**
     * @return The Atlas usernames (email address). You can only add Atlas users who are part of the organization. Users who have not accepted an invitation to join the organization cannot be added as team members. There is a maximum of 250 Atlas users per team.
     * 
     */
    public Output<List<String>> usernames() {
        return this.usernames;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Team(java.lang.String name) {
        this(name, TeamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Team(java.lang.String name, TeamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Team(java.lang.String name, TeamArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/team:Team", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Team(java.lang.String name, Output<java.lang.String> id, @Nullable TeamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/team:Team", name, state, makeResourceOptions(options, id), false);
    }

    private static TeamArgs makeArgs(TeamArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TeamArgs.Empty : args;
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
    public static Team get(java.lang.String name, Output<java.lang.String> id, @Nullable TeamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Team(name, id, state, options);
    }
}
