// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.X509AuthenticationDatabaseUser` describe a X509 Authentication Database User. This represents a X509 Authentication Database User.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 *
 * ### S
 */
/** @deprecated mongodbatlas.index/get509authenticationdatabaseuser.get509AuthenticationDatabaseUser has been deprecated in favor of mongodbatlas.index/getx509authenticationdatabaseuser.getX509AuthenticationDatabaseUser */
export function get509AuthenticationDatabaseUser(args: Get509AuthenticationDatabaseUserArgs, opts?: pulumi.InvokeOptions): Promise<Get509AuthenticationDatabaseUserResult> {
    pulumi.log.warn("get509AuthenticationDatabaseUser is deprecated: mongodbatlas.index/get509authenticationdatabaseuser.get509AuthenticationDatabaseUser has been deprecated in favor of mongodbatlas.index/getx509authenticationdatabaseuser.getX509AuthenticationDatabaseUser")

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/get509AuthenticationDatabaseUser:get509AuthenticationDatabaseUser", {
        "projectId": args.projectId,
        "username": args.username,
    }, opts);
}

/**
 * A collection of arguments for invoking get509AuthenticationDatabaseUser.
 */
export interface Get509AuthenticationDatabaseUserArgs {
    /**
     * Identifier for the Atlas project associated with the X.509 configuration.
     */
    projectId: string;
    /**
     * Username of the database user to create a certificate for.
     */
    username?: string;
}

/**
 * A collection of values returned by get509AuthenticationDatabaseUser.
 */
export interface Get509AuthenticationDatabaseUserResult {
    /**
     * Array of objects where each details one unexpired database user certificate.
     */
    readonly certificates: outputs.Get509AuthenticationDatabaseUserCertificate[];
    readonly customerX509Cas: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly projectId: string;
    readonly username?: string;
}
/**
 * `mongodbatlas.X509AuthenticationDatabaseUser` describe a X509 Authentication Database User. This represents a X509 Authentication Database User.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
 *
 * ## Example Usage
 *
 * ### S
 */
/** @deprecated mongodbatlas.index/get509authenticationdatabaseuser.get509AuthenticationDatabaseUser has been deprecated in favor of mongodbatlas.index/getx509authenticationdatabaseuser.getX509AuthenticationDatabaseUser */
export function get509AuthenticationDatabaseUserOutput(args: Get509AuthenticationDatabaseUserOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<Get509AuthenticationDatabaseUserResult> {
    return pulumi.output(args).apply((a: any) => get509AuthenticationDatabaseUser(a, opts))
}

/**
 * A collection of arguments for invoking get509AuthenticationDatabaseUser.
 */
export interface Get509AuthenticationDatabaseUserOutputArgs {
    /**
     * Identifier for the Atlas project associated with the X.509 configuration.
     */
    projectId: pulumi.Input<string>;
    /**
     * Username of the database user to create a certificate for.
     */
    username?: pulumi.Input<string>;
}
