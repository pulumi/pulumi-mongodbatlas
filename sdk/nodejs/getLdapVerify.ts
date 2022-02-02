// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.LdapVerify` describes a LDAP Verify.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
 */
export function getLdapVerify(args: GetLdapVerifyArgs, opts?: pulumi.InvokeOptions): Promise<GetLdapVerifyResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("mongodbatlas:index/getLdapVerify:getLdapVerify", {
        "projectId": args.projectId,
        "requestId": args.requestId,
    }, opts);
}

/**
 * A collection of arguments for invoking getLdapVerify.
 */
export interface GetLdapVerifyArgs {
    /**
     * Unique identifier for the Atlas project associated with the verification request.
     */
    projectId: string;
    /**
     * Unique identifier of a request to verify an LDAP configuration.
     */
    requestId: string;
}

/**
 * A collection of values returned by getLdapVerify.
 */
export interface GetLdapVerifyResult {
    /**
     * The user DN that Atlas uses to connect to the LDAP server.
     */
    readonly bindUsername: string;
    /**
     * (Required) The hostname or IP address of the LDAP server.
     */
    readonly hostname: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * One or more links to sub-resources. The relations in the URLs are explained in the Web Linking Specification.
     */
    readonly links: outputs.GetLdapVerifyLink[];
    /**
     * LDAP ConfigurationThe port to which the LDAP server listens for client connections.
     */
    readonly port: number;
    readonly projectId: string;
    /**
     * The unique identifier for the request to verify the LDAP over TLS/SSL configuration.
     */
    readonly requestId: string;
    /**
     * The current status of the LDAP over TLS/SSL configuration.
     */
    readonly status: string;
    /**
     * Array of validation messages related to the verification of the provided LDAP over TLS/SSL configuration details.
     */
    readonly validations: outputs.GetLdapVerifyValidation[];
}

export function getLdapVerifyOutput(args: GetLdapVerifyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLdapVerifyResult> {
    return pulumi.output(args).apply(a => getLdapVerify(a, opts))
}

/**
 * A collection of arguments for invoking getLdapVerify.
 */
export interface GetLdapVerifyOutputArgs {
    /**
     * Unique identifier for the Atlas project associated with the verification request.
     */
    projectId: pulumi.Input<string>;
    /**
     * Unique identifier of a request to verify an LDAP configuration.
     */
    requestId: pulumi.Input<string>;
}
