// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.X509AuthenticationDatabaseUser` provides a X509 Authentication Database User resource. The mongodbatlas.X509AuthenticationDatabaseUser resource lets you manage MongoDB users who authenticate using X.509 certificates. You can manage these X.509 certificates or let Atlas do it for you.
 *
 * | Management  | Description  |
 * |---|---|
 * | Atlas  | Atlas manages your Certificate Authority and can generate certificates for your MongoDB users. No additional X.509 configuration is required.  |
 * | Customer  |  You must provide a Certificate Authority and generate certificates for your MongoDB users. |
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * > **NOTE:** Before provider version 1.14.0, Self-managed X.509 Authentication was disabled for the project when this resource was deleted. Starting from that version onward, it will not be disabled, allowing other users to continue using X.509 within the same project.
 *
 * ## Example Usage
 *
 * ### S
 *
 * ## Import
 *
 * X.509 Certificates for a User can be imported using project ID and username, in the format `project_id-username`, e.g.
 *
 * ```sh
 * $ pulumi import mongodbatlas:index/x509AuthenticationDatabaseUser:X509AuthenticationDatabaseUser test 1112222b3bf99403840e8934-myUsername
 * ```
 * For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/x509-configuration-get-certificates/)
 *
 * Current X.509 Configuration can be imported using project ID, in the format `project_id`, e.g.
 *
 * ```sh
 * $ pulumi import mongodbatlas:index/x509AuthenticationDatabaseUser:X509AuthenticationDatabaseUser test 1112222b3bf99403840e8934
 * ```
 * For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/x509-configuration-get-certificates/)
 */
export class X509AuthenticationDatabaseUser extends pulumi.CustomResource {
    /**
     * Get an existing X509AuthenticationDatabaseUser resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: X509AuthenticationDatabaseUserState, opts?: pulumi.CustomResourceOptions): X509AuthenticationDatabaseUser {
        return new X509AuthenticationDatabaseUser(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/x509AuthenticationDatabaseUser:X509AuthenticationDatabaseUser';

    /**
     * Returns true if the given object is an instance of X509AuthenticationDatabaseUser.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is X509AuthenticationDatabaseUser {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === X509AuthenticationDatabaseUser.__pulumiType;
    }

    /**
     * Array of objects where each details one unexpired database user certificate.
     */
    public /*out*/ readonly certificates!: pulumi.Output<outputs.X509AuthenticationDatabaseUserCertificate[]>;
    /**
     * Contains the last X.509 certificate and private key created for a database user.
     */
    public /*out*/ readonly currentCertificate!: pulumi.Output<string>;
    /**
     * PEM string containing one or more customer CAs for database user authentication.
     */
    public readonly customerX509Cas!: pulumi.Output<string | undefined>;
    /**
     * A number of months that the created certificate is valid for before expiry, up to 24 months. By default is 3.
     */
    public readonly monthsUntilExpiration!: pulumi.Output<number | undefined>;
    /**
     * Identifier for the Atlas project associated with the X.509 configuration.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Username of the database user to create a certificate for.
     */
    public readonly username!: pulumi.Output<string | undefined>;

    /**
     * Create a X509AuthenticationDatabaseUser resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: X509AuthenticationDatabaseUserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: X509AuthenticationDatabaseUserArgs | X509AuthenticationDatabaseUserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as X509AuthenticationDatabaseUserState | undefined;
            resourceInputs["certificates"] = state ? state.certificates : undefined;
            resourceInputs["currentCertificate"] = state ? state.currentCertificate : undefined;
            resourceInputs["customerX509Cas"] = state ? state.customerX509Cas : undefined;
            resourceInputs["monthsUntilExpiration"] = state ? state.monthsUntilExpiration : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["username"] = state ? state.username : undefined;
        } else {
            const args = argsOrState as X509AuthenticationDatabaseUserArgs | undefined;
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["customerX509Cas"] = args?.customerX509Cas ? pulumi.secret(args.customerX509Cas) : undefined;
            resourceInputs["monthsUntilExpiration"] = args ? args.monthsUntilExpiration : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
            resourceInputs["certificates"] = undefined /*out*/;
            resourceInputs["currentCertificate"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["currentCertificate", "customerX509Cas"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(X509AuthenticationDatabaseUser.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering X509AuthenticationDatabaseUser resources.
 */
export interface X509AuthenticationDatabaseUserState {
    /**
     * Array of objects where each details one unexpired database user certificate.
     */
    certificates?: pulumi.Input<pulumi.Input<inputs.X509AuthenticationDatabaseUserCertificate>[]>;
    /**
     * Contains the last X.509 certificate and private key created for a database user.
     */
    currentCertificate?: pulumi.Input<string>;
    /**
     * PEM string containing one or more customer CAs for database user authentication.
     */
    customerX509Cas?: pulumi.Input<string>;
    /**
     * A number of months that the created certificate is valid for before expiry, up to 24 months. By default is 3.
     */
    monthsUntilExpiration?: pulumi.Input<number>;
    /**
     * Identifier for the Atlas project associated with the X.509 configuration.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Username of the database user to create a certificate for.
     */
    username?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a X509AuthenticationDatabaseUser resource.
 */
export interface X509AuthenticationDatabaseUserArgs {
    /**
     * PEM string containing one or more customer CAs for database user authentication.
     */
    customerX509Cas?: pulumi.Input<string>;
    /**
     * A number of months that the created certificate is valid for before expiry, up to 24 months. By default is 3.
     */
    monthsUntilExpiration?: pulumi.Input<number>;
    /**
     * Identifier for the Atlas project associated with the X.509 configuration.
     */
    projectId: pulumi.Input<string>;
    /**
     * Username of the database user to create a certificate for.
     */
    username?: pulumi.Input<string>;
}
