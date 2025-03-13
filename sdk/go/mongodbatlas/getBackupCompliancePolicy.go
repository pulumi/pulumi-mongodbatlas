// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			myCluster, err := mongodbatlas.NewAdvancedCluster(ctx, "my_cluster", &mongodbatlas.AdvancedClusterArgs{
//				ProjectId:     pulumi.String("<PROJECT-ID>"),
//				Name:          pulumi.String("clusterTest"),
//				ClusterType:   pulumi.String("REPLICASET"),
//				BackupEnabled: pulumi.Bool(true),
//				ReplicationSpecs: mongodbatlas.AdvancedClusterReplicationSpecArray{
//					&mongodbatlas.AdvancedClusterReplicationSpecArgs{
//						RegionConfigs: mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArray{
//							&mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArgs{
//								Priority:     pulumi.Int(7),
//								ProviderName: pulumi.String("AWS"),
//								RegionName:   pulumi.String("EU_CENTRAL_1"),
//								ElectableSpecs: &mongodbatlas.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs{
//									InstanceSize: pulumi.String("M10"),
//									NodeCount:    pulumi.Int(3),
//								},
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			testCloudBackupSchedule, err := mongodbatlas.NewCloudBackupSchedule(ctx, "test", &mongodbatlas.CloudBackupScheduleArgs{
//				ProjectId:             myCluster.ProjectId,
//				ClusterName:           myCluster.Name,
//				ReferenceHourOfDay:    pulumi.Int(3),
//				ReferenceMinuteOfHour: pulumi.Int(45),
//				RestoreWindowDays:     pulumi.Int(4),
//				PolicyItemHourly: &mongodbatlas.CloudBackupSchedulePolicyItemHourlyArgs{
//					FrequencyInterval: pulumi.Int(1),
//					RetentionUnit:     pulumi.String("days"),
//					RetentionValue:    pulumi.Int(1),
//				},
//				PolicyItemDaily: &mongodbatlas.CloudBackupSchedulePolicyItemDailyArgs{
//					FrequencyInterval: pulumi.Int(1),
//					RetentionUnit:     pulumi.String("days"),
//					RetentionValue:    pulumi.Int(2),
//				},
//				PolicyItemWeeklies: mongodbatlas.CloudBackupSchedulePolicyItemWeeklyArray{
//					&mongodbatlas.CloudBackupSchedulePolicyItemWeeklyArgs{
//						FrequencyInterval: pulumi.Int(4),
//						RetentionUnit:     pulumi.String("weeks"),
//						RetentionValue:    pulumi.Int(3),
//					},
//				},
//				PolicyItemMonthlies: mongodbatlas.CloudBackupSchedulePolicyItemMonthlyArray{
//					&mongodbatlas.CloudBackupSchedulePolicyItemMonthlyArgs{
//						FrequencyInterval: pulumi.Int(5),
//						RetentionUnit:     pulumi.String("months"),
//						RetentionValue:    pulumi.Int(4),
//					},
//				},
//				PolicyItemYearlies: mongodbatlas.CloudBackupSchedulePolicyItemYearlyArray{
//					&mongodbatlas.CloudBackupSchedulePolicyItemYearlyArgs{
//						FrequencyInterval: pulumi.Int(1),
//						RetentionUnit:     pulumi.String("years"),
//						RetentionValue:    pulumi.Int(1),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupCloudBackupScheduleOutput(ctx, mongodbatlas.GetCloudBackupScheduleOutputArgs{
//				ProjectId:   testCloudBackupSchedule.ProjectId,
//				ClusterName: testCloudBackupSchedule.ClusterName,
//			}, nil)
//			_ = mongodbatlas.LookupBackupCompliancePolicyOutput(ctx, mongodbatlas.GetBackupCompliancePolicyOutputArgs{
//				ProjectId: testCloudBackupSchedule.ID(),
//			}, nil)
//			_, err = mongodbatlas.NewBackupCompliancePolicy(ctx, "backup_policy", &mongodbatlas.BackupCompliancePolicyArgs{
//				ProjectId:               pulumi.String("<PROJECT-ID>"),
//				AuthorizedEmail:         pulumi.String("user@email.com"),
//				AuthorizedUserFirstName: pulumi.String("First"),
//				AuthorizedUserLastName:  pulumi.String("Last"),
//				CopyProtectionEnabled:   pulumi.Bool(false),
//				PitEnabled:              pulumi.Bool(false),
//				EncryptionAtRestEnabled: pulumi.Bool(false),
//				RestoreWindowDays:       pulumi.Int(7),
//				OnDemandPolicyItem: &mongodbatlas.BackupCompliancePolicyOnDemandPolicyItemArgs{
//					FrequencyInterval: pulumi.Int(0),
//					RetentionUnit:     pulumi.String("days"),
//					RetentionValue:    pulumi.Int(3),
//				},
//				PolicyItemHourly: &mongodbatlas.BackupCompliancePolicyPolicyItemHourlyArgs{
//					FrequencyInterval: pulumi.Int(6),
//					RetentionUnit:     pulumi.String("days"),
//					RetentionValue:    pulumi.Int(7),
//				},
//				PolicyItemDaily: &mongodbatlas.BackupCompliancePolicyPolicyItemDailyArgs{
//					FrequencyInterval: pulumi.Int(0),
//					RetentionUnit:     pulumi.String("days"),
//					RetentionValue:    pulumi.Int(7),
//				},
//				PolicyItemWeeklies: mongodbatlas.BackupCompliancePolicyPolicyItemWeeklyArray{
//					&mongodbatlas.BackupCompliancePolicyPolicyItemWeeklyArgs{
//						FrequencyInterval: pulumi.Int(0),
//						RetentionUnit:     pulumi.String("weeks"),
//						RetentionValue:    pulumi.Int(4),
//					},
//				},
//				PolicyItemMonthlies: mongodbatlas.BackupCompliancePolicyPolicyItemMonthlyArray{
//					&mongodbatlas.BackupCompliancePolicyPolicyItemMonthlyArgs{
//						FrequencyInterval: pulumi.Int(0),
//						RetentionUnit:     pulumi.String("months"),
//						RetentionValue:    pulumi.Int(12),
//					},
//				},
//				PolicyItemYearlies: mongodbatlas.BackupCompliancePolicyPolicyItemYearlyArray{
//					&mongodbatlas.BackupCompliancePolicyPolicyItemYearlyArgs{
//						FrequencyInterval: pulumi.Int(1),
//						RetentionUnit:     pulumi.String("years"),
//						RetentionValue:    pulumi.Int(1),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupBackupCompliancePolicy(ctx *pulumi.Context, args *LookupBackupCompliancePolicyArgs, opts ...pulumi.InvokeOption) (*LookupBackupCompliancePolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupBackupCompliancePolicyResult
	err := ctx.Invoke("mongodbatlas:index/getBackupCompliancePolicy:getBackupCompliancePolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBackupCompliancePolicy.
type LookupBackupCompliancePolicyArgs struct {
	// Unique 24-hexadecimal digit string that identifies your project
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getBackupCompliancePolicy.
type LookupBackupCompliancePolicyResult struct {
	// Email address of the user who is authorized to update the Backup Compliance Policy settings.
	AuthorizedEmail string `pulumi:"authorizedEmail"`
	// First name of the user who authorized to update the Backup Compliance Policy settings.
	AuthorizedUserFirstName string `pulumi:"authorizedUserFirstName"`
	// Last name of the user who authorized to update the Backup Compliance Policy settings.
	AuthorizedUserLastName string `pulumi:"authorizedUserLastName"`
	// Flag that indicates whether to enable additional backup copies for the cluster. If unspecified, this value defaults to false.
	CopyProtectionEnabled bool `pulumi:"copyProtectionEnabled"`
	// Flag that indicates whether Encryption at Rest using Customer Key Management is required for all clusters with a Backup Compliance Policy. If unspecified, this value defaults to false.
	EncryptionAtRestEnabled bool `pulumi:"encryptionAtRestEnabled"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Specifications for on-demand policy.
	OnDemandPolicyItem GetBackupCompliancePolicyOnDemandPolicyItem `pulumi:"onDemandPolicyItem"`
	// Flag that indicates whether the cluster uses Continuous Cloud Backups with a Backup Compliance Policy. If unspecified, this value defaults to false.
	PitEnabled bool `pulumi:"pitEnabled"`
	// Scheduled policy using a daily frequency type, see block fields.
	PolicyItemDaily GetBackupCompliancePolicyPolicyItemDaily `pulumi:"policyItemDaily"`
	// Scheduled policy using an hourly frequency type, see block fields.
	PolicyItemHourly GetBackupCompliancePolicyPolicyItemHourly `pulumi:"policyItemHourly"`
	// Scheduled policy using a monthly frequency type, see block fields.
	PolicyItemMonthlies []GetBackupCompliancePolicyPolicyItemMonthly `pulumi:"policyItemMonthlies"`
	// Scheduled policy using a weekly frequency type, see block fields.
	PolicyItemWeeklies []GetBackupCompliancePolicyPolicyItemWeekly `pulumi:"policyItemWeeklies"`
	// Scheduled policy using a yearly frequency type, see block fields.
	PolicyItemYearlies []GetBackupCompliancePolicyPolicyItemYearly `pulumi:"policyItemYearlies"`
	ProjectId          string                                      `pulumi:"projectId"`
	// Number of previous days that you can restore back to with Continuous Cloud Backup with a Backup Compliance Policy. You must specify a positive, non-zero integer, and the maximum retention window can't exceed the hourly retention time. This parameter applies only to Continuous Cloud Backups with a Backup Compliance Policy.
	RestoreWindowDays int `pulumi:"restoreWindowDays"`
	// Label that indicates the state of the Backup Compliance Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
	State string `pulumi:"state"`
	// ISO 8601 timestamp format in UTC that indicates when the user updated the Data Protection Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
	UpdatedDate string `pulumi:"updatedDate"`
	// Email address that identifies the user who updated the Backup Compliance Policy settings. MongoDB Cloud ignores this email setting when you enable or update the Backup Compliance Policy settings.
	UpdatedUser string `pulumi:"updatedUser"`
}

func LookupBackupCompliancePolicyOutput(ctx *pulumi.Context, args LookupBackupCompliancePolicyOutputArgs, opts ...pulumi.InvokeOption) LookupBackupCompliancePolicyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupBackupCompliancePolicyResultOutput, error) {
			args := v.(LookupBackupCompliancePolicyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getBackupCompliancePolicy:getBackupCompliancePolicy", args, LookupBackupCompliancePolicyResultOutput{}, options).(LookupBackupCompliancePolicyResultOutput), nil
		}).(LookupBackupCompliancePolicyResultOutput)
}

// A collection of arguments for invoking getBackupCompliancePolicy.
type LookupBackupCompliancePolicyOutputArgs struct {
	// Unique 24-hexadecimal digit string that identifies your project
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupBackupCompliancePolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBackupCompliancePolicyArgs)(nil)).Elem()
}

// A collection of values returned by getBackupCompliancePolicy.
type LookupBackupCompliancePolicyResultOutput struct{ *pulumi.OutputState }

func (LookupBackupCompliancePolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBackupCompliancePolicyResult)(nil)).Elem()
}

func (o LookupBackupCompliancePolicyResultOutput) ToLookupBackupCompliancePolicyResultOutput() LookupBackupCompliancePolicyResultOutput {
	return o
}

func (o LookupBackupCompliancePolicyResultOutput) ToLookupBackupCompliancePolicyResultOutputWithContext(ctx context.Context) LookupBackupCompliancePolicyResultOutput {
	return o
}

// Email address of the user who is authorized to update the Backup Compliance Policy settings.
func (o LookupBackupCompliancePolicyResultOutput) AuthorizedEmail() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBackupCompliancePolicyResult) string { return v.AuthorizedEmail }).(pulumi.StringOutput)
}

// First name of the user who authorized to update the Backup Compliance Policy settings.
func (o LookupBackupCompliancePolicyResultOutput) AuthorizedUserFirstName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBackupCompliancePolicyResult) string { return v.AuthorizedUserFirstName }).(pulumi.StringOutput)
}

// Last name of the user who authorized to update the Backup Compliance Policy settings.
func (o LookupBackupCompliancePolicyResultOutput) AuthorizedUserLastName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBackupCompliancePolicyResult) string { return v.AuthorizedUserLastName }).(pulumi.StringOutput)
}

// Flag that indicates whether to enable additional backup copies for the cluster. If unspecified, this value defaults to false.
func (o LookupBackupCompliancePolicyResultOutput) CopyProtectionEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBackupCompliancePolicyResult) bool { return v.CopyProtectionEnabled }).(pulumi.BoolOutput)
}

// Flag that indicates whether Encryption at Rest using Customer Key Management is required for all clusters with a Backup Compliance Policy. If unspecified, this value defaults to false.
func (o LookupBackupCompliancePolicyResultOutput) EncryptionAtRestEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBackupCompliancePolicyResult) bool { return v.EncryptionAtRestEnabled }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupBackupCompliancePolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBackupCompliancePolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// Specifications for on-demand policy.
func (o LookupBackupCompliancePolicyResultOutput) OnDemandPolicyItem() GetBackupCompliancePolicyOnDemandPolicyItemOutput {
	return o.ApplyT(func(v LookupBackupCompliancePolicyResult) GetBackupCompliancePolicyOnDemandPolicyItem {
		return v.OnDemandPolicyItem
	}).(GetBackupCompliancePolicyOnDemandPolicyItemOutput)
}

// Flag that indicates whether the cluster uses Continuous Cloud Backups with a Backup Compliance Policy. If unspecified, this value defaults to false.
func (o LookupBackupCompliancePolicyResultOutput) PitEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupBackupCompliancePolicyResult) bool { return v.PitEnabled }).(pulumi.BoolOutput)
}

// Scheduled policy using a daily frequency type, see block fields.
func (o LookupBackupCompliancePolicyResultOutput) PolicyItemDaily() GetBackupCompliancePolicyPolicyItemDailyOutput {
	return o.ApplyT(func(v LookupBackupCompliancePolicyResult) GetBackupCompliancePolicyPolicyItemDaily {
		return v.PolicyItemDaily
	}).(GetBackupCompliancePolicyPolicyItemDailyOutput)
}

// Scheduled policy using an hourly frequency type, see block fields.
func (o LookupBackupCompliancePolicyResultOutput) PolicyItemHourly() GetBackupCompliancePolicyPolicyItemHourlyOutput {
	return o.ApplyT(func(v LookupBackupCompliancePolicyResult) GetBackupCompliancePolicyPolicyItemHourly {
		return v.PolicyItemHourly
	}).(GetBackupCompliancePolicyPolicyItemHourlyOutput)
}

// Scheduled policy using a monthly frequency type, see block fields.
func (o LookupBackupCompliancePolicyResultOutput) PolicyItemMonthlies() GetBackupCompliancePolicyPolicyItemMonthlyArrayOutput {
	return o.ApplyT(func(v LookupBackupCompliancePolicyResult) []GetBackupCompliancePolicyPolicyItemMonthly {
		return v.PolicyItemMonthlies
	}).(GetBackupCompliancePolicyPolicyItemMonthlyArrayOutput)
}

// Scheduled policy using a weekly frequency type, see block fields.
func (o LookupBackupCompliancePolicyResultOutput) PolicyItemWeeklies() GetBackupCompliancePolicyPolicyItemWeeklyArrayOutput {
	return o.ApplyT(func(v LookupBackupCompliancePolicyResult) []GetBackupCompliancePolicyPolicyItemWeekly {
		return v.PolicyItemWeeklies
	}).(GetBackupCompliancePolicyPolicyItemWeeklyArrayOutput)
}

// Scheduled policy using a yearly frequency type, see block fields.
func (o LookupBackupCompliancePolicyResultOutput) PolicyItemYearlies() GetBackupCompliancePolicyPolicyItemYearlyArrayOutput {
	return o.ApplyT(func(v LookupBackupCompliancePolicyResult) []GetBackupCompliancePolicyPolicyItemYearly {
		return v.PolicyItemYearlies
	}).(GetBackupCompliancePolicyPolicyItemYearlyArrayOutput)
}

func (o LookupBackupCompliancePolicyResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBackupCompliancePolicyResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Number of previous days that you can restore back to with Continuous Cloud Backup with a Backup Compliance Policy. You must specify a positive, non-zero integer, and the maximum retention window can't exceed the hourly retention time. This parameter applies only to Continuous Cloud Backups with a Backup Compliance Policy.
func (o LookupBackupCompliancePolicyResultOutput) RestoreWindowDays() pulumi.IntOutput {
	return o.ApplyT(func(v LookupBackupCompliancePolicyResult) int { return v.RestoreWindowDays }).(pulumi.IntOutput)
}

// Label that indicates the state of the Backup Compliance Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
func (o LookupBackupCompliancePolicyResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBackupCompliancePolicyResult) string { return v.State }).(pulumi.StringOutput)
}

// ISO 8601 timestamp format in UTC that indicates when the user updated the Data Protection Policy settings. MongoDB Cloud ignores this setting when you enable or update the Backup Compliance Policy settings.
func (o LookupBackupCompliancePolicyResultOutput) UpdatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBackupCompliancePolicyResult) string { return v.UpdatedDate }).(pulumi.StringOutput)
}

// Email address that identifies the user who updated the Backup Compliance Policy settings. MongoDB Cloud ignores this email setting when you enable or update the Backup Compliance Policy settings.
func (o LookupBackupCompliancePolicyResultOutput) UpdatedUser() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBackupCompliancePolicyResult) string { return v.UpdatedUser }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupBackupCompliancePolicyResultOutput{})
}
