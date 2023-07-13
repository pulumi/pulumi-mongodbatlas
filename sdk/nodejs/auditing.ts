// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `mongodbatlas.Auditing` provides an Auditing resource. This allows auditing to be created.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.Auditing("test", {
 *     auditAuthorizationSuccess: false,
 *     auditFilter: "{ 'atype': 'authenticate', 'param': {   'user': 'auditAdmin',   'db': 'admin',   'mechanism': 'SCRAM-SHA-1' }}",
 *     enabled: true,
 *     projectId: "<project-id>",
 * });
 * ```
 *
 * ## Import
 *
 * Auditing must be imported using auditing ID, e.g.
 *
 * ```sh
 *  $ pulumi import mongodbatlas:index/auditing:Auditing my_auditing 5d09d6a59ccf6445652a444a
 * ```
 *
 *  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/auditing/)
 */
export class Auditing extends pulumi.CustomResource {
    /**
     * Get an existing Auditing resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AuditingState, opts?: pulumi.CustomResourceOptions): Auditing {
        return new Auditing(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/auditing:Auditing';

    /**
     * Returns true if the given object is an instance of Auditing.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Auditing {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Auditing.__pulumiType;
    }

    /**
     * Indicates whether the auditing system captures successful authentication attempts for audit filters using the "atype" : "authCheck" auditing event. For more information, see [auditAuthorizationSuccess](https://docs.mongodb.com/manual/reference/parameters/#param.auditAuthorizationSuccess).  **Warning! Enabling Audit authorization successes can severely impact cluster performance. Enable this option with caution.**
     */
    public readonly auditAuthorizationSuccess!: pulumi.Output<boolean>;
    /**
     * JSON-formatted audit filter. For complete documentation on custom auditing filters, see [Configure Audit Filters](https://docs.mongodb.com/manual/tutorial/configure-audit-filters/).
     */
    public readonly auditFilter!: pulumi.Output<string>;
    /**
     * Denotes the configuration method for the audit filter. Possible values are: 
     * * NONE - auditing not configured for the project.
     * * FILTER_BUILDER - auditing configured via Atlas UI filter builder.
     * * FILTER_JSON - auditing configured via Atlas custom filter or API.
     */
    public /*out*/ readonly configurationType!: pulumi.Output<string>;
    /**
     * Denotes whether or not the project associated with the {project_id} has database auditing enabled.  Defaults to false.
     *
     * > **NOTE:** Auditing created by API Keys must belong to an existing organization.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * The unique ID for the project to configure auditing. **Note: When changing this value to a different projectId it will delete the current audit settings for the original project that was assigned to.**
     */
    public readonly projectId!: pulumi.Output<string>;

    /**
     * Create a Auditing resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AuditingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AuditingArgs | AuditingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AuditingState | undefined;
            resourceInputs["auditAuthorizationSuccess"] = state ? state.auditAuthorizationSuccess : undefined;
            resourceInputs["auditFilter"] = state ? state.auditFilter : undefined;
            resourceInputs["configurationType"] = state ? state.configurationType : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
        } else {
            const args = argsOrState as AuditingArgs | undefined;
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["auditAuthorizationSuccess"] = args ? args.auditAuthorizationSuccess : undefined;
            resourceInputs["auditFilter"] = args ? args.auditFilter : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["configurationType"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Auditing.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Auditing resources.
 */
export interface AuditingState {
    /**
     * Indicates whether the auditing system captures successful authentication attempts for audit filters using the "atype" : "authCheck" auditing event. For more information, see [auditAuthorizationSuccess](https://docs.mongodb.com/manual/reference/parameters/#param.auditAuthorizationSuccess).  **Warning! Enabling Audit authorization successes can severely impact cluster performance. Enable this option with caution.**
     */
    auditAuthorizationSuccess?: pulumi.Input<boolean>;
    /**
     * JSON-formatted audit filter. For complete documentation on custom auditing filters, see [Configure Audit Filters](https://docs.mongodb.com/manual/tutorial/configure-audit-filters/).
     */
    auditFilter?: pulumi.Input<string>;
    /**
     * Denotes the configuration method for the audit filter. Possible values are: 
     * * NONE - auditing not configured for the project.
     * * FILTER_BUILDER - auditing configured via Atlas UI filter builder.
     * * FILTER_JSON - auditing configured via Atlas custom filter or API.
     */
    configurationType?: pulumi.Input<string>;
    /**
     * Denotes whether or not the project associated with the {project_id} has database auditing enabled.  Defaults to false.
     *
     * > **NOTE:** Auditing created by API Keys must belong to an existing organization.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The unique ID for the project to configure auditing. **Note: When changing this value to a different projectId it will delete the current audit settings for the original project that was assigned to.**
     */
    projectId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Auditing resource.
 */
export interface AuditingArgs {
    /**
     * Indicates whether the auditing system captures successful authentication attempts for audit filters using the "atype" : "authCheck" auditing event. For more information, see [auditAuthorizationSuccess](https://docs.mongodb.com/manual/reference/parameters/#param.auditAuthorizationSuccess).  **Warning! Enabling Audit authorization successes can severely impact cluster performance. Enable this option with caution.**
     */
    auditAuthorizationSuccess?: pulumi.Input<boolean>;
    /**
     * JSON-formatted audit filter. For complete documentation on custom auditing filters, see [Configure Audit Filters](https://docs.mongodb.com/manual/tutorial/configure-audit-filters/).
     */
    auditFilter?: pulumi.Input<string>;
    /**
     * Denotes whether or not the project associated with the {project_id} has database auditing enabled.  Defaults to false.
     *
     * > **NOTE:** Auditing created by API Keys must belong to an existing organization.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The unique ID for the project to configure auditing. **Note: When changing this value to a different projectId it will delete the current audit settings for the original project that was assigned to.**
     */
    projectId: pulumi.Input<string>;
}
