// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("mongodbatlas");

export declare const assumeRole: outputs.config.AssumeRole | undefined;
Object.defineProperty(exports, "assumeRole", {
    get() {
        return __config.getObject<outputs.config.AssumeRole>("assumeRole");
    },
    enumerable: true,
});

/**
 * AWS API Access Key.
 */
export declare const awsAccessKeyId: string | undefined;
Object.defineProperty(exports, "awsAccessKeyId", {
    get() {
        return __config.get("awsAccessKeyId");
    },
    enumerable: true,
});

/**
 * AWS API Access Secret Key.
 */
export declare const awsSecretAccessKey: string | undefined;
Object.defineProperty(exports, "awsSecretAccessKey", {
    get() {
        return __config.get("awsSecretAccessKey");
    },
    enumerable: true,
});

/**
 * AWS Security Token Service provided session token.
 */
export declare const awsSessionToken: string | undefined;
Object.defineProperty(exports, "awsSessionToken", {
    get() {
        return __config.get("awsSessionToken");
    },
    enumerable: true,
});

/**
 * MongoDB Atlas Base URL
 */
export declare const baseUrl: string | undefined;
Object.defineProperty(exports, "baseUrl", {
    get() {
        return __config.get("baseUrl");
    },
    enumerable: true,
});

/**
 * MongoDB Atlas Base URL default to gov
 */
export declare const isMongodbgovCloud: boolean | undefined;
Object.defineProperty(exports, "isMongodbgovCloud", {
    get() {
        return __config.getObject<boolean>("isMongodbgovCloud");
    },
    enumerable: true,
});

/**
 * MongoDB Atlas Programmatic Private Key
 */
export declare const privateKey: string | undefined;
Object.defineProperty(exports, "privateKey", {
    get() {
        return __config.get("privateKey");
    },
    enumerable: true,
});

/**
 * MongoDB Atlas Programmatic Public Key
 */
export declare const publicKey: string | undefined;
Object.defineProperty(exports, "publicKey", {
    get() {
        return __config.get("publicKey");
    },
    enumerable: true,
});

/**
 * MongoDB Realm Base URL
 */
export declare const realmBaseUrl: string | undefined;
Object.defineProperty(exports, "realmBaseUrl", {
    get() {
        return __config.get("realmBaseUrl");
    },
    enumerable: true,
});

/**
 * Region where secret is stored as part of AWS Secret Manager.
 */
export declare const region: string | undefined;
Object.defineProperty(exports, "region", {
    get() {
        return __config.get("region");
    },
    enumerable: true,
});

/**
 * Name of secret stored in AWS Secret Manager.
 */
export declare const secretName: string | undefined;
Object.defineProperty(exports, "secretName", {
    get() {
        return __config.get("secretName");
    },
    enumerable: true,
});

/**
 * AWS Security Token Service endpoint. Required for cross-AWS region or cross-AWS account secrets.
 */
export declare const stsEndpoint: string | undefined;
Object.defineProperty(exports, "stsEndpoint", {
    get() {
        return __config.get("stsEndpoint");
    },
    enumerable: true,
});

