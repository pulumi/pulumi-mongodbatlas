// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getBackupCompliancePolicy(args: GetBackupCompliancePolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetBackupCompliancePolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getBackupCompliancePolicy:getBackupCompliancePolicy", {
        "onDemandPolicyItem": args.onDemandPolicyItem,
        "policyItemDaily": args.policyItemDaily,
        "policyItemHourly": args.policyItemHourly,
        "policyItemMonthlies": args.policyItemMonthlies,
        "policyItemWeeklies": args.policyItemWeeklies,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getBackupCompliancePolicy.
 */
export interface GetBackupCompliancePolicyArgs {
    onDemandPolicyItem?: inputs.GetBackupCompliancePolicyOnDemandPolicyItem;
    policyItemDaily?: inputs.GetBackupCompliancePolicyPolicyItemDaily;
    policyItemHourly?: inputs.GetBackupCompliancePolicyPolicyItemHourly;
    policyItemMonthlies?: inputs.GetBackupCompliancePolicyPolicyItemMonthly[];
    policyItemWeeklies?: inputs.GetBackupCompliancePolicyPolicyItemWeekly[];
    /**
     * Unique 24-hexadecimal digit string that identifies your project
     */
    projectId: string;
}

/**
 * A collection of values returned by getBackupCompliancePolicy.
 */
export interface GetBackupCompliancePolicyResult {
    /**
     * Email address of the user who is authorized to update the Backup Compliance Policy settings.
     */
    readonly authorizedEmail: string;
    /**
     * First name of the user who authorized to update the Backup Compliance Policy settings.
     */
    readonly authorizedUserFirstName: string;
    /**
     * Last name of the user who authorized to update the Backup Compliance Policy settings.
     */
    readonly authorizedUserLastName: string;
    /**
     * Flag that indicates whether to enable additional backup copies for the cluster. If unspecified, this value defaults to false.
     */
    readonly copyProtectionEnabled: boolean;
    /**
     * Flag that indicates whether Encryption at Rest using Customer Key Management is required for all clusters with a Backup Compliance Policy. If unspecified, this value defaults to false.
     */
    readonly encryptionAtRestEnabled: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly onDemandPolicyItem?: outputs.GetBackupCompliancePolicyOnDemandPolicyItem;
    /**
     * Flag that indicates whether the cluster uses Continuous Cloud Backups with a Backup Compliance Policy. If unspecified, this value defaults to false.
     */
    readonly pitEnabled: boolean;
    readonly policyItemDaily?: outputs.GetBackupCompliancePolicyPolicyItemDaily;
    readonly policyItemHourly?: outputs.GetBackupCompliancePolicyPolicyItemHourly;
    readonly policyItemMonthlies?: outputs.GetBackupCompliancePolicyPolicyItemMonthly[];
    readonly policyItemWeeklies?: outputs.GetBackupCompliancePolicyPolicyItemWeekly[];
    readonly projectId: string;
    /**
     * Number of previous days that you can restore back to with Continuous Cloud Backup with a Backup Compliance Policy. You must specify a positive, non-zero integer, and the maximum retention window can't exceed the hourly retention time. This parameter applies only to Continuous Cloud Backups with a Backup Compliance Policy.
     */
    readonly restoreWindowDays: number;
    /**
     * Label that indicates the state of the Backup Compliance Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
     */
    readonly state: string;
    /**
     * ISO 8601 timestamp format in UTC that indicates when the user updated the Data Protection Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
     */
    readonly updatedDate: string;
    /**
     * Email address that identifies the user who updated the Backup Compliance Policy settings. MongoDB Cloud ignores this email setting when you enable or update the Backup Compliance Policy settings.
     */
    readonly updatedUser: string;
}
export function getBackupCompliancePolicyOutput(args: GetBackupCompliancePolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBackupCompliancePolicyResult> {
    return pulumi.output(args).apply((a: any) => getBackupCompliancePolicy(a, opts))
}

/**
 * A collection of arguments for invoking getBackupCompliancePolicy.
 */
export interface GetBackupCompliancePolicyOutputArgs {
    onDemandPolicyItem?: pulumi.Input<inputs.GetBackupCompliancePolicyOnDemandPolicyItemArgs>;
    policyItemDaily?: pulumi.Input<inputs.GetBackupCompliancePolicyPolicyItemDailyArgs>;
    policyItemHourly?: pulumi.Input<inputs.GetBackupCompliancePolicyPolicyItemHourlyArgs>;
    policyItemMonthlies?: pulumi.Input<pulumi.Input<inputs.GetBackupCompliancePolicyPolicyItemMonthlyArgs>[]>;
    policyItemWeeklies?: pulumi.Input<pulumi.Input<inputs.GetBackupCompliancePolicyPolicyItemWeeklyArgs>[]>;
    /**
     * Unique 24-hexadecimal digit string that identifies your project
     */
    projectId: pulumi.Input<string>;
}
