// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.DatabaseUser` provides a Database User resource. This represents a database user which will be applied to all clusters within the project.
 *
 * Each user has a set of roles that provide access to the project’s databases. User's roles apply to all the clusters in the project: if two clusters have a `products` database and a user has a role granting `read` access on the products database, the user has that access on both clusters.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * > **IMPORTANT:** All arguments including the password will be stored in the raw state as plain-text. Read more about sensitive data in state.
 *
 * ## Example Usage
 *
 * ## Import
 *
 * Database users can be imported using project ID and username, in the format `project_id`-`username`-`auth_database_name`, e.g.
 *
 * ```sh
 *  $ pulumi import mongodbatlas:index/databaseUser:DatabaseUser my_user 1112222b3bf99403840e8934-my_user-admin
 * ```
 *  ~> __NOTE:__ Terraform will want to change the password after importing the user if a `password` argument is specified.
 */
export class DatabaseUser extends pulumi.CustomResource {
    /**
     * Get an existing DatabaseUser resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseUserState, opts?: pulumi.CustomResourceOptions): DatabaseUser {
        return new DatabaseUser(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/databaseUser:DatabaseUser';

    /**
     * Returns true if the given object is an instance of DatabaseUser.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DatabaseUser {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DatabaseUser.__pulumiType;
    }

    /**
     * Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
     * Accepted values include:
     */
    public readonly authDatabaseName!: pulumi.Output<string>;
    /**
     * If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
     */
    public readonly awsIamType!: pulumi.Output<string>;
    public readonly labels!: pulumi.Output<outputs.DatabaseUserLabel[] | undefined>;
    /**
     * Method by which the provided `username` is authenticated. If no value is given, Atlas uses the default value of `NONE`.
     */
    public readonly ldapAuthType!: pulumi.Output<string>;
    /**
     * Human-readable label that indicates whether the new database user authenticates with OIDC (OpenID Connect) federated authentication. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
     */
    public readonly oidcAuthType!: pulumi.Output<string>;
    public readonly password!: pulumi.Output<string | undefined>;
    /**
     * The unique ID for the project to create the database user.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
     */
    public readonly roles!: pulumi.Output<outputs.DatabaseUserRole[] | undefined>;
    public readonly scopes!: pulumi.Output<outputs.DatabaseUserScope[] | undefined>;
    /**
     * Username for authenticating to MongoDB. USER_ARN or ROLE_ARN if `awsIamType` is USER or ROLE.
     */
    public readonly username!: pulumi.Output<string>;
    /**
     * X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
     */
    public readonly x509Type!: pulumi.Output<string>;

    /**
     * Create a DatabaseUser resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseUserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseUserArgs | DatabaseUserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseUserState | undefined;
            resourceInputs["authDatabaseName"] = state ? state.authDatabaseName : undefined;
            resourceInputs["awsIamType"] = state ? state.awsIamType : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["ldapAuthType"] = state ? state.ldapAuthType : undefined;
            resourceInputs["oidcAuthType"] = state ? state.oidcAuthType : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
            resourceInputs["scopes"] = state ? state.scopes : undefined;
            resourceInputs["username"] = state ? state.username : undefined;
            resourceInputs["x509Type"] = state ? state.x509Type : undefined;
        } else {
            const args = argsOrState as DatabaseUserArgs | undefined;
            if ((!args || args.authDatabaseName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'authDatabaseName'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.username === undefined) && !opts.urn) {
                throw new Error("Missing required property 'username'");
            }
            resourceInputs["authDatabaseName"] = args ? args.authDatabaseName : undefined;
            resourceInputs["awsIamType"] = args ? args.awsIamType : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["ldapAuthType"] = args ? args.ldapAuthType : undefined;
            resourceInputs["oidcAuthType"] = args ? args.oidcAuthType : undefined;
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
            resourceInputs["scopes"] = args ? args.scopes : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
            resourceInputs["x509Type"] = args ? args.x509Type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(DatabaseUser.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabaseUser resources.
 */
export interface DatabaseUserState {
    /**
     * Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
     * Accepted values include:
     */
    authDatabaseName?: pulumi.Input<string>;
    /**
     * If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
     */
    awsIamType?: pulumi.Input<string>;
    labels?: pulumi.Input<pulumi.Input<inputs.DatabaseUserLabel>[]>;
    /**
     * Method by which the provided `username` is authenticated. If no value is given, Atlas uses the default value of `NONE`.
     */
    ldapAuthType?: pulumi.Input<string>;
    /**
     * Human-readable label that indicates whether the new database user authenticates with OIDC (OpenID Connect) federated authentication. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
     */
    oidcAuthType?: pulumi.Input<string>;
    password?: pulumi.Input<string>;
    /**
     * The unique ID for the project to create the database user.
     */
    projectId?: pulumi.Input<string>;
    /**
     * List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
     */
    roles?: pulumi.Input<pulumi.Input<inputs.DatabaseUserRole>[]>;
    scopes?: pulumi.Input<pulumi.Input<inputs.DatabaseUserScope>[]>;
    /**
     * Username for authenticating to MongoDB. USER_ARN or ROLE_ARN if `awsIamType` is USER or ROLE.
     */
    username?: pulumi.Input<string>;
    /**
     * X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
     */
    x509Type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DatabaseUser resource.
 */
export interface DatabaseUserArgs {
    /**
     * Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
     * Accepted values include:
     */
    authDatabaseName: pulumi.Input<string>;
    /**
     * If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
     */
    awsIamType?: pulumi.Input<string>;
    labels?: pulumi.Input<pulumi.Input<inputs.DatabaseUserLabel>[]>;
    /**
     * Method by which the provided `username` is authenticated. If no value is given, Atlas uses the default value of `NONE`.
     */
    ldapAuthType?: pulumi.Input<string>;
    /**
     * Human-readable label that indicates whether the new database user authenticates with OIDC (OpenID Connect) federated authentication. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
     */
    oidcAuthType?: pulumi.Input<string>;
    password?: pulumi.Input<string>;
    /**
     * The unique ID for the project to create the database user.
     */
    projectId: pulumi.Input<string>;
    /**
     * List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
     */
    roles?: pulumi.Input<pulumi.Input<inputs.DatabaseUserRole>[]>;
    scopes?: pulumi.Input<pulumi.Input<inputs.DatabaseUserScope>[]>;
    /**
     * Username for authenticating to MongoDB. USER_ARN or ROLE_ARN if `awsIamType` is USER or ROLE.
     */
    username: pulumi.Input<string>;
    /**
     * X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
     */
    x509Type?: pulumi.Input<string>;
}
