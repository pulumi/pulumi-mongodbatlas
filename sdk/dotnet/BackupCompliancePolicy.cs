// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    /// <summary>
    /// ## Import
    /// 
    /// Backup Compliance Policy entries can be imported using project project_id
    /// 
    /// in the format `project_id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import mongodbatlas:index/backupCompliancePolicy:BackupCompliancePolicy backup_policy 5d0f1f73cf09a29120e173cf
    /// ```
    ///  For more information see: [MongoDB Atlas API Reference](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Cloud-Backups/operation/updateDataProtectionSettings) and [Backup Compliance Policy Prohibited Actions](https://www.mongodb.com/docs/atlas/backup/cloud-backup/backup-compliance-policy/#prohibited-actions).
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/backupCompliancePolicy:BackupCompliancePolicy")]
    public partial class BackupCompliancePolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Email address of a security or legal representative for the Backup Compliance Policy who is authorized to update the Backup Compliance Policy settings.
        /// </summary>
        [Output("authorizedEmail")]
        public Output<string> AuthorizedEmail { get; private set; } = null!;

        /// <summary>
        /// First name of the user who authorized to update the Backup Compliance Policy settings.
        /// </summary>
        [Output("authorizedUserFirstName")]
        public Output<string> AuthorizedUserFirstName { get; private set; } = null!;

        /// <summary>
        /// Last name of the user who authorized to update the Backup Compliance Policy settings.
        /// </summary>
        [Output("authorizedUserLastName")]
        public Output<string> AuthorizedUserLastName { get; private set; } = null!;

        /// <summary>
        /// Flag that indicates whether to enable additional backup copies for the cluster. If unspecified, this value defaults to false.
        /// </summary>
        [Output("copyProtectionEnabled")]
        public Output<bool?> CopyProtectionEnabled { get; private set; } = null!;

        /// <summary>
        /// Flag that indicates whether Encryption at Rest using Customer Key Management is required for all clusters with a Backup Compliance Policy. If unspecified, this value defaults to false.
        /// </summary>
        [Output("encryptionAtRestEnabled")]
        public Output<bool?> EncryptionAtRestEnabled { get; private set; } = null!;

        [Output("onDemandPolicyItem")]
        public Output<Outputs.BackupCompliancePolicyOnDemandPolicyItem> OnDemandPolicyItem { get; private set; } = null!;

        /// <summary>
        /// Flag that indicates whether the cluster uses Continuous Cloud Backups with a Backup Compliance Policy. If unspecified, this value defaults to false.
        /// </summary>
        [Output("pitEnabled")]
        public Output<bool?> PitEnabled { get; private set; } = null!;

        [Output("policyItemDaily")]
        public Output<Outputs.BackupCompliancePolicyPolicyItemDaily?> PolicyItemDaily { get; private set; } = null!;

        [Output("policyItemHourly")]
        public Output<Outputs.BackupCompliancePolicyPolicyItemHourly?> PolicyItemHourly { get; private set; } = null!;

        [Output("policyItemMonthlies")]
        public Output<ImmutableArray<Outputs.BackupCompliancePolicyPolicyItemMonthly>> PolicyItemMonthlies { get; private set; } = null!;

        [Output("policyItemWeeklies")]
        public Output<ImmutableArray<Outputs.BackupCompliancePolicyPolicyItemWeekly>> PolicyItemWeeklies { get; private set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Number of previous days that you can restore back to with Continuous Cloud Backup with a Backup Compliance Policy. You must specify a positive, non-zero integer, and the maximum retention window can't exceed the hourly retention time. This parameter applies only to Continuous Cloud Backups with a Backup Compliance Policy.
        /// </summary>
        [Output("restoreWindowDays")]
        public Output<int> RestoreWindowDays { get; private set; } = null!;

        /// <summary>
        /// Label that indicates the state of the Backup Compliance Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// ISO 8601 timestamp format in UTC that indicates when the user updated the Data Protection Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
        /// </summary>
        [Output("updatedDate")]
        public Output<string> UpdatedDate { get; private set; } = null!;

        /// <summary>
        /// Email address that identifies the user who updated the Backup Compliance Policy settings. MongoDB Cloud ignores this email setting when you enable or update the Backup Compliance Policy settings.
        /// </summary>
        [Output("updatedUser")]
        public Output<string> UpdatedUser { get; private set; } = null!;


        /// <summary>
        /// Create a BackupCompliancePolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BackupCompliancePolicy(string name, BackupCompliancePolicyArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/backupCompliancePolicy:BackupCompliancePolicy", name, args ?? new BackupCompliancePolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BackupCompliancePolicy(string name, Input<string> id, BackupCompliancePolicyState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/backupCompliancePolicy:BackupCompliancePolicy", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing BackupCompliancePolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BackupCompliancePolicy Get(string name, Input<string> id, BackupCompliancePolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new BackupCompliancePolicy(name, id, state, options);
        }
    }

    public sealed class BackupCompliancePolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Email address of a security or legal representative for the Backup Compliance Policy who is authorized to update the Backup Compliance Policy settings.
        /// </summary>
        [Input("authorizedEmail", required: true)]
        public Input<string> AuthorizedEmail { get; set; } = null!;

        /// <summary>
        /// First name of the user who authorized to update the Backup Compliance Policy settings.
        /// </summary>
        [Input("authorizedUserFirstName", required: true)]
        public Input<string> AuthorizedUserFirstName { get; set; } = null!;

        /// <summary>
        /// Last name of the user who authorized to update the Backup Compliance Policy settings.
        /// </summary>
        [Input("authorizedUserLastName", required: true)]
        public Input<string> AuthorizedUserLastName { get; set; } = null!;

        /// <summary>
        /// Flag that indicates whether to enable additional backup copies for the cluster. If unspecified, this value defaults to false.
        /// </summary>
        [Input("copyProtectionEnabled")]
        public Input<bool>? CopyProtectionEnabled { get; set; }

        /// <summary>
        /// Flag that indicates whether Encryption at Rest using Customer Key Management is required for all clusters with a Backup Compliance Policy. If unspecified, this value defaults to false.
        /// </summary>
        [Input("encryptionAtRestEnabled")]
        public Input<bool>? EncryptionAtRestEnabled { get; set; }

        [Input("onDemandPolicyItem", required: true)]
        public Input<Inputs.BackupCompliancePolicyOnDemandPolicyItemArgs> OnDemandPolicyItem { get; set; } = null!;

        /// <summary>
        /// Flag that indicates whether the cluster uses Continuous Cloud Backups with a Backup Compliance Policy. If unspecified, this value defaults to false.
        /// </summary>
        [Input("pitEnabled")]
        public Input<bool>? PitEnabled { get; set; }

        [Input("policyItemDaily")]
        public Input<Inputs.BackupCompliancePolicyPolicyItemDailyArgs>? PolicyItemDaily { get; set; }

        [Input("policyItemHourly")]
        public Input<Inputs.BackupCompliancePolicyPolicyItemHourlyArgs>? PolicyItemHourly { get; set; }

        [Input("policyItemMonthlies")]
        private InputList<Inputs.BackupCompliancePolicyPolicyItemMonthlyArgs>? _policyItemMonthlies;
        public InputList<Inputs.BackupCompliancePolicyPolicyItemMonthlyArgs> PolicyItemMonthlies
        {
            get => _policyItemMonthlies ?? (_policyItemMonthlies = new InputList<Inputs.BackupCompliancePolicyPolicyItemMonthlyArgs>());
            set => _policyItemMonthlies = value;
        }

        [Input("policyItemWeeklies")]
        private InputList<Inputs.BackupCompliancePolicyPolicyItemWeeklyArgs>? _policyItemWeeklies;
        public InputList<Inputs.BackupCompliancePolicyPolicyItemWeeklyArgs> PolicyItemWeeklies
        {
            get => _policyItemWeeklies ?? (_policyItemWeeklies = new InputList<Inputs.BackupCompliancePolicyPolicyItemWeeklyArgs>());
            set => _policyItemWeeklies = value;
        }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Number of previous days that you can restore back to with Continuous Cloud Backup with a Backup Compliance Policy. You must specify a positive, non-zero integer, and the maximum retention window can't exceed the hourly retention time. This parameter applies only to Continuous Cloud Backups with a Backup Compliance Policy.
        /// </summary>
        [Input("restoreWindowDays")]
        public Input<int>? RestoreWindowDays { get; set; }

        public BackupCompliancePolicyArgs()
        {
        }
        public static new BackupCompliancePolicyArgs Empty => new BackupCompliancePolicyArgs();
    }

    public sealed class BackupCompliancePolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Email address of a security or legal representative for the Backup Compliance Policy who is authorized to update the Backup Compliance Policy settings.
        /// </summary>
        [Input("authorizedEmail")]
        public Input<string>? AuthorizedEmail { get; set; }

        /// <summary>
        /// First name of the user who authorized to update the Backup Compliance Policy settings.
        /// </summary>
        [Input("authorizedUserFirstName")]
        public Input<string>? AuthorizedUserFirstName { get; set; }

        /// <summary>
        /// Last name of the user who authorized to update the Backup Compliance Policy settings.
        /// </summary>
        [Input("authorizedUserLastName")]
        public Input<string>? AuthorizedUserLastName { get; set; }

        /// <summary>
        /// Flag that indicates whether to enable additional backup copies for the cluster. If unspecified, this value defaults to false.
        /// </summary>
        [Input("copyProtectionEnabled")]
        public Input<bool>? CopyProtectionEnabled { get; set; }

        /// <summary>
        /// Flag that indicates whether Encryption at Rest using Customer Key Management is required for all clusters with a Backup Compliance Policy. If unspecified, this value defaults to false.
        /// </summary>
        [Input("encryptionAtRestEnabled")]
        public Input<bool>? EncryptionAtRestEnabled { get; set; }

        [Input("onDemandPolicyItem")]
        public Input<Inputs.BackupCompliancePolicyOnDemandPolicyItemGetArgs>? OnDemandPolicyItem { get; set; }

        /// <summary>
        /// Flag that indicates whether the cluster uses Continuous Cloud Backups with a Backup Compliance Policy. If unspecified, this value defaults to false.
        /// </summary>
        [Input("pitEnabled")]
        public Input<bool>? PitEnabled { get; set; }

        [Input("policyItemDaily")]
        public Input<Inputs.BackupCompliancePolicyPolicyItemDailyGetArgs>? PolicyItemDaily { get; set; }

        [Input("policyItemHourly")]
        public Input<Inputs.BackupCompliancePolicyPolicyItemHourlyGetArgs>? PolicyItemHourly { get; set; }

        [Input("policyItemMonthlies")]
        private InputList<Inputs.BackupCompliancePolicyPolicyItemMonthlyGetArgs>? _policyItemMonthlies;
        public InputList<Inputs.BackupCompliancePolicyPolicyItemMonthlyGetArgs> PolicyItemMonthlies
        {
            get => _policyItemMonthlies ?? (_policyItemMonthlies = new InputList<Inputs.BackupCompliancePolicyPolicyItemMonthlyGetArgs>());
            set => _policyItemMonthlies = value;
        }

        [Input("policyItemWeeklies")]
        private InputList<Inputs.BackupCompliancePolicyPolicyItemWeeklyGetArgs>? _policyItemWeeklies;
        public InputList<Inputs.BackupCompliancePolicyPolicyItemWeeklyGetArgs> PolicyItemWeeklies
        {
            get => _policyItemWeeklies ?? (_policyItemWeeklies = new InputList<Inputs.BackupCompliancePolicyPolicyItemWeeklyGetArgs>());
            set => _policyItemWeeklies = value;
        }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Number of previous days that you can restore back to with Continuous Cloud Backup with a Backup Compliance Policy. You must specify a positive, non-zero integer, and the maximum retention window can't exceed the hourly retention time. This parameter applies only to Continuous Cloud Backups with a Backup Compliance Policy.
        /// </summary>
        [Input("restoreWindowDays")]
        public Input<int>? RestoreWindowDays { get; set; }

        /// <summary>
        /// Label that indicates the state of the Backup Compliance Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// ISO 8601 timestamp format in UTC that indicates when the user updated the Data Protection Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
        /// </summary>
        [Input("updatedDate")]
        public Input<string>? UpdatedDate { get; set; }

        /// <summary>
        /// Email address that identifies the user who updated the Backup Compliance Policy settings. MongoDB Cloud ignores this email setting when you enable or update the Backup Compliance Policy settings.
        /// </summary>
        [Input("updatedUser")]
        public Input<string>? UpdatedUser { get; set; }

        public BackupCompliancePolicyState()
        {
        }
        public static new BackupCompliancePolicyState Empty => new BackupCompliancePolicyState();
    }
}
