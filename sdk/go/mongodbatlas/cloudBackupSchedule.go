// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Cloud Backup Schedule entries can be imported using project_id and cluster_name, in the format `PROJECTID-CLUSTERNAME`, e.g.
//
// ```sh
//
//	$ pulumi import mongodbatlas:index/cloudBackupSchedule:CloudBackupSchedule test 5d0f1f73cf09a29120e173cf-MyClusterTest
//
// ```
//
//	For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/schedule/modify-one-schedule/)
type CloudBackupSchedule struct {
	pulumi.CustomResourceState

	// Flag that indicates whether automatic export of cloud backup snapshots to the AWS bucket is enabled. Value can be one of the following:
	//
	// true - enables automatic export of cloud backup snapshots to the AWS bucket
	// false - disables automatic export of cloud backup snapshots to the AWS bucket (default)
	AutoExportEnabled pulumi.BoolOutput `pulumi:"autoExportEnabled"`
	// Unique identifier of the Atlas cluster.
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
	ClusterName  pulumi.StringOutput                       `pulumi:"clusterName"`
	CopySettings CloudBackupScheduleCopySettingArrayOutput `pulumi:"copySettings"`
	Export       CloudBackupScheduleExportOutput           `pulumi:"export"`
	// Unique identifier of the backup policy.
	IdPolicy pulumi.StringOutput `pulumi:"idPolicy"`
	// Timestamp in the number of seconds that have elapsed since the UNIX epoch when Atlas takes the next snapshot.
	NextSnapshot pulumi.StringOutput `pulumi:"nextSnapshot"`
	// Daily policy item
	PolicyItemDaily CloudBackupSchedulePolicyItemDailyPtrOutput `pulumi:"policyItemDaily"`
	// Hourly policy item
	PolicyItemHourly CloudBackupSchedulePolicyItemHourlyPtrOutput `pulumi:"policyItemHourly"`
	// Monthly policy item
	PolicyItemMonthlies CloudBackupSchedulePolicyItemMonthlyArrayOutput `pulumi:"policyItemMonthlies"`
	// Weekly policy item
	PolicyItemWeeklies CloudBackupSchedulePolicyItemWeeklyArrayOutput `pulumi:"policyItemWeeklies"`
	// The unique identifier of the project for the Atlas cluster.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
	ReferenceHourOfDay pulumi.IntOutput `pulumi:"referenceHourOfDay"`
	// UTC Minutes after `referenceHourOfDay` that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
	ReferenceMinuteOfHour pulumi.IntOutput `pulumi:"referenceMinuteOfHour"`
	// Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
	RestoreWindowDays pulumi.IntOutput  `pulumi:"restoreWindowDays"`
	UpdateSnapshots   pulumi.BoolOutput `pulumi:"updateSnapshots"`
	// Specify true to use organization and project names instead of organization and project UUIDs in the path for the metadata files that Atlas uploads to your S3 bucket after it finishes exporting the snapshots. To learn more about the metadata files that Atlas uploads, see [Export Cloud Backup Snapshot](https://www.mongodb.com/docs/atlas/backup/cloud-backup/export/#std-label-cloud-provider-snapshot-export).
	UseOrgAndGroupNamesInExportPrefix pulumi.BoolOutput `pulumi:"useOrgAndGroupNamesInExportPrefix"`
}

// NewCloudBackupSchedule registers a new resource with the given unique name, arguments, and options.
func NewCloudBackupSchedule(ctx *pulumi.Context,
	name string, args *CloudBackupScheduleArgs, opts ...pulumi.ResourceOption) (*CloudBackupSchedule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterName == nil {
		return nil, errors.New("invalid value for required argument 'ClusterName'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CloudBackupSchedule
	err := ctx.RegisterResource("mongodbatlas:index/cloudBackupSchedule:CloudBackupSchedule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCloudBackupSchedule gets an existing CloudBackupSchedule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCloudBackupSchedule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CloudBackupScheduleState, opts ...pulumi.ResourceOption) (*CloudBackupSchedule, error) {
	var resource CloudBackupSchedule
	err := ctx.ReadResource("mongodbatlas:index/cloudBackupSchedule:CloudBackupSchedule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CloudBackupSchedule resources.
type cloudBackupScheduleState struct {
	// Flag that indicates whether automatic export of cloud backup snapshots to the AWS bucket is enabled. Value can be one of the following:
	//
	// true - enables automatic export of cloud backup snapshots to the AWS bucket
	// false - disables automatic export of cloud backup snapshots to the AWS bucket (default)
	AutoExportEnabled *bool `pulumi:"autoExportEnabled"`
	// Unique identifier of the Atlas cluster.
	ClusterId *string `pulumi:"clusterId"`
	// The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
	ClusterName  *string                          `pulumi:"clusterName"`
	CopySettings []CloudBackupScheduleCopySetting `pulumi:"copySettings"`
	Export       *CloudBackupScheduleExport       `pulumi:"export"`
	// Unique identifier of the backup policy.
	IdPolicy *string `pulumi:"idPolicy"`
	// Timestamp in the number of seconds that have elapsed since the UNIX epoch when Atlas takes the next snapshot.
	NextSnapshot *string `pulumi:"nextSnapshot"`
	// Daily policy item
	PolicyItemDaily *CloudBackupSchedulePolicyItemDaily `pulumi:"policyItemDaily"`
	// Hourly policy item
	PolicyItemHourly *CloudBackupSchedulePolicyItemHourly `pulumi:"policyItemHourly"`
	// Monthly policy item
	PolicyItemMonthlies []CloudBackupSchedulePolicyItemMonthly `pulumi:"policyItemMonthlies"`
	// Weekly policy item
	PolicyItemWeeklies []CloudBackupSchedulePolicyItemWeekly `pulumi:"policyItemWeeklies"`
	// The unique identifier of the project for the Atlas cluster.
	ProjectId *string `pulumi:"projectId"`
	// UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
	ReferenceHourOfDay *int `pulumi:"referenceHourOfDay"`
	// UTC Minutes after `referenceHourOfDay` that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
	ReferenceMinuteOfHour *int `pulumi:"referenceMinuteOfHour"`
	// Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
	RestoreWindowDays *int  `pulumi:"restoreWindowDays"`
	UpdateSnapshots   *bool `pulumi:"updateSnapshots"`
	// Specify true to use organization and project names instead of organization and project UUIDs in the path for the metadata files that Atlas uploads to your S3 bucket after it finishes exporting the snapshots. To learn more about the metadata files that Atlas uploads, see [Export Cloud Backup Snapshot](https://www.mongodb.com/docs/atlas/backup/cloud-backup/export/#std-label-cloud-provider-snapshot-export).
	UseOrgAndGroupNamesInExportPrefix *bool `pulumi:"useOrgAndGroupNamesInExportPrefix"`
}

type CloudBackupScheduleState struct {
	// Flag that indicates whether automatic export of cloud backup snapshots to the AWS bucket is enabled. Value can be one of the following:
	//
	// true - enables automatic export of cloud backup snapshots to the AWS bucket
	// false - disables automatic export of cloud backup snapshots to the AWS bucket (default)
	AutoExportEnabled pulumi.BoolPtrInput
	// Unique identifier of the Atlas cluster.
	ClusterId pulumi.StringPtrInput
	// The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
	ClusterName  pulumi.StringPtrInput
	CopySettings CloudBackupScheduleCopySettingArrayInput
	Export       CloudBackupScheduleExportPtrInput
	// Unique identifier of the backup policy.
	IdPolicy pulumi.StringPtrInput
	// Timestamp in the number of seconds that have elapsed since the UNIX epoch when Atlas takes the next snapshot.
	NextSnapshot pulumi.StringPtrInput
	// Daily policy item
	PolicyItemDaily CloudBackupSchedulePolicyItemDailyPtrInput
	// Hourly policy item
	PolicyItemHourly CloudBackupSchedulePolicyItemHourlyPtrInput
	// Monthly policy item
	PolicyItemMonthlies CloudBackupSchedulePolicyItemMonthlyArrayInput
	// Weekly policy item
	PolicyItemWeeklies CloudBackupSchedulePolicyItemWeeklyArrayInput
	// The unique identifier of the project for the Atlas cluster.
	ProjectId pulumi.StringPtrInput
	// UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
	ReferenceHourOfDay pulumi.IntPtrInput
	// UTC Minutes after `referenceHourOfDay` that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
	ReferenceMinuteOfHour pulumi.IntPtrInput
	// Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
	RestoreWindowDays pulumi.IntPtrInput
	UpdateSnapshots   pulumi.BoolPtrInput
	// Specify true to use organization and project names instead of organization and project UUIDs in the path for the metadata files that Atlas uploads to your S3 bucket after it finishes exporting the snapshots. To learn more about the metadata files that Atlas uploads, see [Export Cloud Backup Snapshot](https://www.mongodb.com/docs/atlas/backup/cloud-backup/export/#std-label-cloud-provider-snapshot-export).
	UseOrgAndGroupNamesInExportPrefix pulumi.BoolPtrInput
}

func (CloudBackupScheduleState) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudBackupScheduleState)(nil)).Elem()
}

type cloudBackupScheduleArgs struct {
	// Flag that indicates whether automatic export of cloud backup snapshots to the AWS bucket is enabled. Value can be one of the following:
	//
	// true - enables automatic export of cloud backup snapshots to the AWS bucket
	// false - disables automatic export of cloud backup snapshots to the AWS bucket (default)
	AutoExportEnabled *bool `pulumi:"autoExportEnabled"`
	// The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
	ClusterName  string                           `pulumi:"clusterName"`
	CopySettings []CloudBackupScheduleCopySetting `pulumi:"copySettings"`
	Export       *CloudBackupScheduleExport       `pulumi:"export"`
	// Daily policy item
	PolicyItemDaily *CloudBackupSchedulePolicyItemDaily `pulumi:"policyItemDaily"`
	// Hourly policy item
	PolicyItemHourly *CloudBackupSchedulePolicyItemHourly `pulumi:"policyItemHourly"`
	// Monthly policy item
	PolicyItemMonthlies []CloudBackupSchedulePolicyItemMonthly `pulumi:"policyItemMonthlies"`
	// Weekly policy item
	PolicyItemWeeklies []CloudBackupSchedulePolicyItemWeekly `pulumi:"policyItemWeeklies"`
	// The unique identifier of the project for the Atlas cluster.
	ProjectId string `pulumi:"projectId"`
	// UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
	ReferenceHourOfDay *int `pulumi:"referenceHourOfDay"`
	// UTC Minutes after `referenceHourOfDay` that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
	ReferenceMinuteOfHour *int `pulumi:"referenceMinuteOfHour"`
	// Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
	RestoreWindowDays *int  `pulumi:"restoreWindowDays"`
	UpdateSnapshots   *bool `pulumi:"updateSnapshots"`
	// Specify true to use organization and project names instead of organization and project UUIDs in the path for the metadata files that Atlas uploads to your S3 bucket after it finishes exporting the snapshots. To learn more about the metadata files that Atlas uploads, see [Export Cloud Backup Snapshot](https://www.mongodb.com/docs/atlas/backup/cloud-backup/export/#std-label-cloud-provider-snapshot-export).
	UseOrgAndGroupNamesInExportPrefix *bool `pulumi:"useOrgAndGroupNamesInExportPrefix"`
}

// The set of arguments for constructing a CloudBackupSchedule resource.
type CloudBackupScheduleArgs struct {
	// Flag that indicates whether automatic export of cloud backup snapshots to the AWS bucket is enabled. Value can be one of the following:
	//
	// true - enables automatic export of cloud backup snapshots to the AWS bucket
	// false - disables automatic export of cloud backup snapshots to the AWS bucket (default)
	AutoExportEnabled pulumi.BoolPtrInput
	// The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
	ClusterName  pulumi.StringInput
	CopySettings CloudBackupScheduleCopySettingArrayInput
	Export       CloudBackupScheduleExportPtrInput
	// Daily policy item
	PolicyItemDaily CloudBackupSchedulePolicyItemDailyPtrInput
	// Hourly policy item
	PolicyItemHourly CloudBackupSchedulePolicyItemHourlyPtrInput
	// Monthly policy item
	PolicyItemMonthlies CloudBackupSchedulePolicyItemMonthlyArrayInput
	// Weekly policy item
	PolicyItemWeeklies CloudBackupSchedulePolicyItemWeeklyArrayInput
	// The unique identifier of the project for the Atlas cluster.
	ProjectId pulumi.StringInput
	// UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
	ReferenceHourOfDay pulumi.IntPtrInput
	// UTC Minutes after `referenceHourOfDay` that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
	ReferenceMinuteOfHour pulumi.IntPtrInput
	// Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
	RestoreWindowDays pulumi.IntPtrInput
	UpdateSnapshots   pulumi.BoolPtrInput
	// Specify true to use organization and project names instead of organization and project UUIDs in the path for the metadata files that Atlas uploads to your S3 bucket after it finishes exporting the snapshots. To learn more about the metadata files that Atlas uploads, see [Export Cloud Backup Snapshot](https://www.mongodb.com/docs/atlas/backup/cloud-backup/export/#std-label-cloud-provider-snapshot-export).
	UseOrgAndGroupNamesInExportPrefix pulumi.BoolPtrInput
}

func (CloudBackupScheduleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudBackupScheduleArgs)(nil)).Elem()
}

type CloudBackupScheduleInput interface {
	pulumi.Input

	ToCloudBackupScheduleOutput() CloudBackupScheduleOutput
	ToCloudBackupScheduleOutputWithContext(ctx context.Context) CloudBackupScheduleOutput
}

func (*CloudBackupSchedule) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudBackupSchedule)(nil)).Elem()
}

func (i *CloudBackupSchedule) ToCloudBackupScheduleOutput() CloudBackupScheduleOutput {
	return i.ToCloudBackupScheduleOutputWithContext(context.Background())
}

func (i *CloudBackupSchedule) ToCloudBackupScheduleOutputWithContext(ctx context.Context) CloudBackupScheduleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudBackupScheduleOutput)
}

// CloudBackupScheduleArrayInput is an input type that accepts CloudBackupScheduleArray and CloudBackupScheduleArrayOutput values.
// You can construct a concrete instance of `CloudBackupScheduleArrayInput` via:
//
//	CloudBackupScheduleArray{ CloudBackupScheduleArgs{...} }
type CloudBackupScheduleArrayInput interface {
	pulumi.Input

	ToCloudBackupScheduleArrayOutput() CloudBackupScheduleArrayOutput
	ToCloudBackupScheduleArrayOutputWithContext(context.Context) CloudBackupScheduleArrayOutput
}

type CloudBackupScheduleArray []CloudBackupScheduleInput

func (CloudBackupScheduleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudBackupSchedule)(nil)).Elem()
}

func (i CloudBackupScheduleArray) ToCloudBackupScheduleArrayOutput() CloudBackupScheduleArrayOutput {
	return i.ToCloudBackupScheduleArrayOutputWithContext(context.Background())
}

func (i CloudBackupScheduleArray) ToCloudBackupScheduleArrayOutputWithContext(ctx context.Context) CloudBackupScheduleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudBackupScheduleArrayOutput)
}

// CloudBackupScheduleMapInput is an input type that accepts CloudBackupScheduleMap and CloudBackupScheduleMapOutput values.
// You can construct a concrete instance of `CloudBackupScheduleMapInput` via:
//
//	CloudBackupScheduleMap{ "key": CloudBackupScheduleArgs{...} }
type CloudBackupScheduleMapInput interface {
	pulumi.Input

	ToCloudBackupScheduleMapOutput() CloudBackupScheduleMapOutput
	ToCloudBackupScheduleMapOutputWithContext(context.Context) CloudBackupScheduleMapOutput
}

type CloudBackupScheduleMap map[string]CloudBackupScheduleInput

func (CloudBackupScheduleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudBackupSchedule)(nil)).Elem()
}

func (i CloudBackupScheduleMap) ToCloudBackupScheduleMapOutput() CloudBackupScheduleMapOutput {
	return i.ToCloudBackupScheduleMapOutputWithContext(context.Background())
}

func (i CloudBackupScheduleMap) ToCloudBackupScheduleMapOutputWithContext(ctx context.Context) CloudBackupScheduleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudBackupScheduleMapOutput)
}

type CloudBackupScheduleOutput struct{ *pulumi.OutputState }

func (CloudBackupScheduleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudBackupSchedule)(nil)).Elem()
}

func (o CloudBackupScheduleOutput) ToCloudBackupScheduleOutput() CloudBackupScheduleOutput {
	return o
}

func (o CloudBackupScheduleOutput) ToCloudBackupScheduleOutputWithContext(ctx context.Context) CloudBackupScheduleOutput {
	return o
}

// Flag that indicates whether automatic export of cloud backup snapshots to the AWS bucket is enabled. Value can be one of the following:
//
// true - enables automatic export of cloud backup snapshots to the AWS bucket
// false - disables automatic export of cloud backup snapshots to the AWS bucket (default)
func (o CloudBackupScheduleOutput) AutoExportEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *CloudBackupSchedule) pulumi.BoolOutput { return v.AutoExportEnabled }).(pulumi.BoolOutput)
}

// Unique identifier of the Atlas cluster.
func (o CloudBackupScheduleOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSchedule) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
func (o CloudBackupScheduleOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSchedule) pulumi.StringOutput { return v.ClusterName }).(pulumi.StringOutput)
}

func (o CloudBackupScheduleOutput) CopySettings() CloudBackupScheduleCopySettingArrayOutput {
	return o.ApplyT(func(v *CloudBackupSchedule) CloudBackupScheduleCopySettingArrayOutput { return v.CopySettings }).(CloudBackupScheduleCopySettingArrayOutput)
}

func (o CloudBackupScheduleOutput) Export() CloudBackupScheduleExportOutput {
	return o.ApplyT(func(v *CloudBackupSchedule) CloudBackupScheduleExportOutput { return v.Export }).(CloudBackupScheduleExportOutput)
}

// Unique identifier of the backup policy.
func (o CloudBackupScheduleOutput) IdPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSchedule) pulumi.StringOutput { return v.IdPolicy }).(pulumi.StringOutput)
}

// Timestamp in the number of seconds that have elapsed since the UNIX epoch when Atlas takes the next snapshot.
func (o CloudBackupScheduleOutput) NextSnapshot() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSchedule) pulumi.StringOutput { return v.NextSnapshot }).(pulumi.StringOutput)
}

// Daily policy item
func (o CloudBackupScheduleOutput) PolicyItemDaily() CloudBackupSchedulePolicyItemDailyPtrOutput {
	return o.ApplyT(func(v *CloudBackupSchedule) CloudBackupSchedulePolicyItemDailyPtrOutput { return v.PolicyItemDaily }).(CloudBackupSchedulePolicyItemDailyPtrOutput)
}

// Hourly policy item
func (o CloudBackupScheduleOutput) PolicyItemHourly() CloudBackupSchedulePolicyItemHourlyPtrOutput {
	return o.ApplyT(func(v *CloudBackupSchedule) CloudBackupSchedulePolicyItemHourlyPtrOutput { return v.PolicyItemHourly }).(CloudBackupSchedulePolicyItemHourlyPtrOutput)
}

// Monthly policy item
func (o CloudBackupScheduleOutput) PolicyItemMonthlies() CloudBackupSchedulePolicyItemMonthlyArrayOutput {
	return o.ApplyT(func(v *CloudBackupSchedule) CloudBackupSchedulePolicyItemMonthlyArrayOutput {
		return v.PolicyItemMonthlies
	}).(CloudBackupSchedulePolicyItemMonthlyArrayOutput)
}

// Weekly policy item
func (o CloudBackupScheduleOutput) PolicyItemWeeklies() CloudBackupSchedulePolicyItemWeeklyArrayOutput {
	return o.ApplyT(func(v *CloudBackupSchedule) CloudBackupSchedulePolicyItemWeeklyArrayOutput {
		return v.PolicyItemWeeklies
	}).(CloudBackupSchedulePolicyItemWeeklyArrayOutput)
}

// The unique identifier of the project for the Atlas cluster.
func (o CloudBackupScheduleOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSchedule) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
func (o CloudBackupScheduleOutput) ReferenceHourOfDay() pulumi.IntOutput {
	return o.ApplyT(func(v *CloudBackupSchedule) pulumi.IntOutput { return v.ReferenceHourOfDay }).(pulumi.IntOutput)
}

// UTC Minutes after `referenceHourOfDay` that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
func (o CloudBackupScheduleOutput) ReferenceMinuteOfHour() pulumi.IntOutput {
	return o.ApplyT(func(v *CloudBackupSchedule) pulumi.IntOutput { return v.ReferenceMinuteOfHour }).(pulumi.IntOutput)
}

// Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
func (o CloudBackupScheduleOutput) RestoreWindowDays() pulumi.IntOutput {
	return o.ApplyT(func(v *CloudBackupSchedule) pulumi.IntOutput { return v.RestoreWindowDays }).(pulumi.IntOutput)
}

func (o CloudBackupScheduleOutput) UpdateSnapshots() pulumi.BoolOutput {
	return o.ApplyT(func(v *CloudBackupSchedule) pulumi.BoolOutput { return v.UpdateSnapshots }).(pulumi.BoolOutput)
}

// Specify true to use organization and project names instead of organization and project UUIDs in the path for the metadata files that Atlas uploads to your S3 bucket after it finishes exporting the snapshots. To learn more about the metadata files that Atlas uploads, see [Export Cloud Backup Snapshot](https://www.mongodb.com/docs/atlas/backup/cloud-backup/export/#std-label-cloud-provider-snapshot-export).
func (o CloudBackupScheduleOutput) UseOrgAndGroupNamesInExportPrefix() pulumi.BoolOutput {
	return o.ApplyT(func(v *CloudBackupSchedule) pulumi.BoolOutput { return v.UseOrgAndGroupNamesInExportPrefix }).(pulumi.BoolOutput)
}

type CloudBackupScheduleArrayOutput struct{ *pulumi.OutputState }

func (CloudBackupScheduleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudBackupSchedule)(nil)).Elem()
}

func (o CloudBackupScheduleArrayOutput) ToCloudBackupScheduleArrayOutput() CloudBackupScheduleArrayOutput {
	return o
}

func (o CloudBackupScheduleArrayOutput) ToCloudBackupScheduleArrayOutputWithContext(ctx context.Context) CloudBackupScheduleArrayOutput {
	return o
}

func (o CloudBackupScheduleArrayOutput) Index(i pulumi.IntInput) CloudBackupScheduleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CloudBackupSchedule {
		return vs[0].([]*CloudBackupSchedule)[vs[1].(int)]
	}).(CloudBackupScheduleOutput)
}

type CloudBackupScheduleMapOutput struct{ *pulumi.OutputState }

func (CloudBackupScheduleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudBackupSchedule)(nil)).Elem()
}

func (o CloudBackupScheduleMapOutput) ToCloudBackupScheduleMapOutput() CloudBackupScheduleMapOutput {
	return o
}

func (o CloudBackupScheduleMapOutput) ToCloudBackupScheduleMapOutputWithContext(ctx context.Context) CloudBackupScheduleMapOutput {
	return o
}

func (o CloudBackupScheduleMapOutput) MapIndex(k pulumi.StringInput) CloudBackupScheduleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CloudBackupSchedule {
		return vs[0].(map[string]*CloudBackupSchedule)[vs[1].(string)]
	}).(CloudBackupScheduleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CloudBackupScheduleInput)(nil)).Elem(), &CloudBackupSchedule{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudBackupScheduleArrayInput)(nil)).Elem(), CloudBackupScheduleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudBackupScheduleMapInput)(nil)).Elem(), CloudBackupScheduleMap{})
	pulumi.RegisterOutputType(CloudBackupScheduleOutput{})
	pulumi.RegisterOutputType(CloudBackupScheduleArrayOutput{})
	pulumi.RegisterOutputType(CloudBackupScheduleMapOutput{})
}
