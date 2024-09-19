// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const myCluster = new mongodbatlas.AdvancedCluster("my_cluster", {
 *     projectId: "<PROJECT-ID>",
 *     name: "clusterTest",
 *     clusterType: "REPLICASET",
 *     backupEnabled: true,
 *     replicationSpecs: [{
 *         regionConfigs: [{
 *             priority: 7,
 *             providerName: "AWS",
 *             regionName: "EU_CENTRAL_1",
 *             electableSpecs: {
 *                 instanceSize: "M10",
 *                 nodeCount: 3,
 *             },
 *         }],
 *     }],
 * });
 * const testCloudBackupSchedule = new mongodbatlas.CloudBackupSchedule("test", {
 *     projectId: myCluster.projectId,
 *     clusterName: myCluster.name,
 *     referenceHourOfDay: 3,
 *     referenceMinuteOfHour: 45,
 *     restoreWindowDays: 4,
 *     policyItemHourly: {
 *         frequencyInterval: 1,
 *         retentionUnit: "days",
 *         retentionValue: 1,
 *     },
 *     policyItemDaily: {
 *         frequencyInterval: 1,
 *         retentionUnit: "days",
 *         retentionValue: 2,
 *     },
 *     policyItemWeeklies: [{
 *         frequencyInterval: 4,
 *         retentionUnit: "weeks",
 *         retentionValue: 3,
 *     }],
 *     policyItemMonthlies: [{
 *         frequencyInterval: 5,
 *         retentionUnit: "months",
 *         retentionValue: 4,
 *     }],
 *     policyItemYearlies: [{
 *         frequencyInterval: 1,
 *         retentionUnit: "years",
 *         retentionValue: 1,
 *     }],
 * });
 * const test = mongodbatlas.getCloudBackupScheduleOutput({
 *     projectId: testCloudBackupSchedule.projectId,
 *     clusterName: testCloudBackupSchedule.clusterName,
 * });
 * const backupPolicy = mongodbatlas.getBackupCompliancePolicyOutput({
 *     projectId: testCloudBackupSchedule.id,
 * });
 * const backupPolicyBackupCompliancePolicy = new mongodbatlas.BackupCompliancePolicy("backup_policy", {
 *     projectId: "<PROJECT-ID>",
 *     authorizedEmail: "user@email.com",
 *     authorizedUserFirstName: "First",
 *     authorizedUserLastName: "Last",
 *     copyProtectionEnabled: false,
 *     pitEnabled: false,
 *     encryptionAtRestEnabled: false,
 *     restoreWindowDays: 7,
 *     onDemandPolicyItem: {
 *         frequencyInterval: 0,
 *         retentionUnit: "days",
 *         retentionValue: 3,
 *     },
 *     policyItemHourly: {
 *         frequencyInterval: 6,
 *         retentionUnit: "days",
 *         retentionValue: 7,
 *     },
 *     policyItemDaily: {
 *         frequencyInterval: 0,
 *         retentionUnit: "days",
 *         retentionValue: 7,
 *     },
 *     policyItemWeeklies: [{
 *         frequencyInterval: 0,
 *         retentionUnit: "weeks",
 *         retentionValue: 4,
 *     }],
 *     policyItemMonthlies: [{
 *         frequencyInterval: 0,
 *         retentionUnit: "months",
 *         retentionValue: 12,
 *     }],
 *     policyItemYearlies: [{
 *         frequencyInterval: 1,
 *         retentionUnit: "years",
 *         retentionValue: 1,
 *     }],
 * });
 * ```
 */
export function getBackupCompliancePolicy(args: GetBackupCompliancePolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetBackupCompliancePolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getBackupCompliancePolicy:getBackupCompliancePolicy", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getBackupCompliancePolicy.
 */
export interface GetBackupCompliancePolicyArgs {
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
    readonly onDemandPolicyItem: outputs.GetBackupCompliancePolicyOnDemandPolicyItem;
    /**
     * Flag that indicates whether the cluster uses Continuous Cloud Backups with a Backup Compliance Policy. If unspecified, this value defaults to false.
     */
    readonly pitEnabled: boolean;
    readonly policyItemDaily: outputs.GetBackupCompliancePolicyPolicyItemDaily;
    readonly policyItemHourly: outputs.GetBackupCompliancePolicyPolicyItemHourly;
    readonly policyItemMonthlies: outputs.GetBackupCompliancePolicyPolicyItemMonthly[];
    readonly policyItemWeeklies: outputs.GetBackupCompliancePolicyPolicyItemWeekly[];
    readonly policyItemYearlies: outputs.GetBackupCompliancePolicyPolicyItemYearly[];
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
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const myCluster = new mongodbatlas.AdvancedCluster("my_cluster", {
 *     projectId: "<PROJECT-ID>",
 *     name: "clusterTest",
 *     clusterType: "REPLICASET",
 *     backupEnabled: true,
 *     replicationSpecs: [{
 *         regionConfigs: [{
 *             priority: 7,
 *             providerName: "AWS",
 *             regionName: "EU_CENTRAL_1",
 *             electableSpecs: {
 *                 instanceSize: "M10",
 *                 nodeCount: 3,
 *             },
 *         }],
 *     }],
 * });
 * const testCloudBackupSchedule = new mongodbatlas.CloudBackupSchedule("test", {
 *     projectId: myCluster.projectId,
 *     clusterName: myCluster.name,
 *     referenceHourOfDay: 3,
 *     referenceMinuteOfHour: 45,
 *     restoreWindowDays: 4,
 *     policyItemHourly: {
 *         frequencyInterval: 1,
 *         retentionUnit: "days",
 *         retentionValue: 1,
 *     },
 *     policyItemDaily: {
 *         frequencyInterval: 1,
 *         retentionUnit: "days",
 *         retentionValue: 2,
 *     },
 *     policyItemWeeklies: [{
 *         frequencyInterval: 4,
 *         retentionUnit: "weeks",
 *         retentionValue: 3,
 *     }],
 *     policyItemMonthlies: [{
 *         frequencyInterval: 5,
 *         retentionUnit: "months",
 *         retentionValue: 4,
 *     }],
 *     policyItemYearlies: [{
 *         frequencyInterval: 1,
 *         retentionUnit: "years",
 *         retentionValue: 1,
 *     }],
 * });
 * const test = mongodbatlas.getCloudBackupScheduleOutput({
 *     projectId: testCloudBackupSchedule.projectId,
 *     clusterName: testCloudBackupSchedule.clusterName,
 * });
 * const backupPolicy = mongodbatlas.getBackupCompliancePolicyOutput({
 *     projectId: testCloudBackupSchedule.id,
 * });
 * const backupPolicyBackupCompliancePolicy = new mongodbatlas.BackupCompliancePolicy("backup_policy", {
 *     projectId: "<PROJECT-ID>",
 *     authorizedEmail: "user@email.com",
 *     authorizedUserFirstName: "First",
 *     authorizedUserLastName: "Last",
 *     copyProtectionEnabled: false,
 *     pitEnabled: false,
 *     encryptionAtRestEnabled: false,
 *     restoreWindowDays: 7,
 *     onDemandPolicyItem: {
 *         frequencyInterval: 0,
 *         retentionUnit: "days",
 *         retentionValue: 3,
 *     },
 *     policyItemHourly: {
 *         frequencyInterval: 6,
 *         retentionUnit: "days",
 *         retentionValue: 7,
 *     },
 *     policyItemDaily: {
 *         frequencyInterval: 0,
 *         retentionUnit: "days",
 *         retentionValue: 7,
 *     },
 *     policyItemWeeklies: [{
 *         frequencyInterval: 0,
 *         retentionUnit: "weeks",
 *         retentionValue: 4,
 *     }],
 *     policyItemMonthlies: [{
 *         frequencyInterval: 0,
 *         retentionUnit: "months",
 *         retentionValue: 12,
 *     }],
 *     policyItemYearlies: [{
 *         frequencyInterval: 1,
 *         retentionUnit: "years",
 *         retentionValue: 1,
 *     }],
 * });
 * ```
 */
export function getBackupCompliancePolicyOutput(args: GetBackupCompliancePolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBackupCompliancePolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getBackupCompliancePolicy:getBackupCompliancePolicy", {
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getBackupCompliancePolicy.
 */
export interface GetBackupCompliancePolicyOutputArgs {
    /**
     * Unique 24-hexadecimal digit string that identifies your project
     */
    projectId: pulumi.Input<string>;
}
