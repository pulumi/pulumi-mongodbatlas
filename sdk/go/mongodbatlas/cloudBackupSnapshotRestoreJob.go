// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `CloudBackupSnapshotRestoreJob` provides a resource to create a new restore job from a cloud backup snapshot of a specified cluster. The restore job can be one of three types:
// * **automated:** Atlas automatically restores the snapshot with snapshotId to the Atlas cluster with name targetClusterName in the Atlas project with targetGroupId.
//
// * **download:** Atlas provides a URL to download a .tar.gz of the snapshot with snapshotId. The contents of the archive contain the data files for your Atlas cluster.
//
// * **pointInTime:**  Atlas performs a Continuous Cloud Backup restore.
//
// > **Important:** If you specify `deliveryType` : `automated` or `deliveryType` : `pointInTime` in your request body to create an automated restore job, Atlas removes all existing data on the target cluster prior to the restore.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
//
// ## Example Usage
// ### Example automated delivery type.
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		myCluster, err := mongodbatlas.NewCluster(ctx, "myCluster", &mongodbatlas.ClusterArgs{
// 			ProjectId:                pulumi.String("5cf5a45a9ccf6400e60981b6"),
// 			DiskSizeGb:               pulumi.Float64(5),
// 			ProviderName:             pulumi.String("AWS"),
// 			ProviderRegionName:       pulumi.String("EU_WEST_2"),
// 			ProviderInstanceSizeName: pulumi.String("M10"),
// 			CloudBackup:              pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		testCloudProviderSnapshot, err := mongodbatlas.NewCloudProviderSnapshot(ctx, "testCloudProviderSnapshot", &mongodbatlas.CloudProviderSnapshotArgs{
// 			ProjectId:       myCluster.ProjectId,
// 			ClusterName:     myCluster.Name,
// 			Description:     pulumi.String("myDescription"),
// 			RetentionInDays: pulumi.Int(1),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = mongodbatlas.NewCloudBackupSnapshotRestoreJob(ctx, "testCloudBackupSnapshotRestoreJob", &mongodbatlas.CloudBackupSnapshotRestoreJobArgs{
// 			ProjectId:   testCloudProviderSnapshot.ProjectId,
// 			ClusterName: testCloudProviderSnapshot.ClusterName,
// 			SnapshotId:  testCloudProviderSnapshot.SnapshotId,
// 			DeliveryTypeConfig: &CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs{
// 				Automated:         pulumi.Bool(true),
// 				TargetClusterName: pulumi.String("MyCluster"),
// 				TargetProjectId:   pulumi.String("5cf5a45a9ccf6400e60981b6"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Example download delivery type.
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		myCluster, err := mongodbatlas.NewCluster(ctx, "myCluster", &mongodbatlas.ClusterArgs{
// 			ProjectId:                pulumi.String("5cf5a45a9ccf6400e60981b6"),
// 			DiskSizeGb:               pulumi.Float64(5),
// 			ProviderName:             pulumi.String("AWS"),
// 			ProviderRegionName:       pulumi.String("EU_WEST_2"),
// 			ProviderInstanceSizeName: pulumi.String("M10"),
// 			CloudBackup:              pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		testCloudProviderSnapshot, err := mongodbatlas.NewCloudProviderSnapshot(ctx, "testCloudProviderSnapshot", &mongodbatlas.CloudProviderSnapshotArgs{
// 			ProjectId:       myCluster.ProjectId,
// 			ClusterName:     myCluster.Name,
// 			Description:     pulumi.String("myDescription"),
// 			RetentionInDays: pulumi.Int(1),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = mongodbatlas.NewCloudBackupSnapshotRestoreJob(ctx, "testCloudBackupSnapshotRestoreJob", &mongodbatlas.CloudBackupSnapshotRestoreJobArgs{
// 			ProjectId:   testCloudProviderSnapshot.ProjectId,
// 			ClusterName: testCloudProviderSnapshot.ClusterName,
// 			SnapshotId:  testCloudProviderSnapshot.SnapshotId,
// 			DeliveryTypeConfig: &CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs{
// 				Download: pulumi.Bool(true),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Cloud Backup Snapshot Restore Job entries can be imported using project project_id, cluster_name and snapshot_id (Unique identifier of the snapshot), in the format `PROJECTID-CLUSTERNAME-JOBID`, e.g.
//
// ```sh
//  $ pulumi import mongodbatlas:index/cloudBackupSnapshotRestoreJob:CloudBackupSnapshotRestoreJob test 5cf5a45a9ccf6400e60981b6-MyCluster-5d1b654ecf09a24b888f4c79
// ```
//
//  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/restore/restores/)
type CloudBackupSnapshotRestoreJob struct {
	pulumi.CustomResourceState

	// Indicates whether the restore job was canceled.
	Cancelled pulumi.BoolOutput `pulumi:"cancelled"`
	// The name of the Atlas cluster whose snapshot you want to restore.
	ClusterName pulumi.StringOutput `pulumi:"clusterName"`
	// UTC ISO 8601 formatted point in time when Atlas created the restore job.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Deprecated: use delivery_type_config instead
	DeliveryType pulumi.StringMapOutput `pulumi:"deliveryType"`
	// Type of restore job to create. Possible values are: **download** or **automated**, only one must be set it in ``true``.
	DeliveryTypeConfig CloudBackupSnapshotRestoreJobDeliveryTypeConfigPtrOutput `pulumi:"deliveryTypeConfig"`
	// One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
	DeliveryUrls pulumi.StringArrayOutput `pulumi:"deliveryUrls"`
	// Indicates whether the restore job expired.
	Expired pulumi.BoolOutput `pulumi:"expired"`
	// UTC ISO 8601 formatted point in time when the restore job expires.
	ExpiresAt pulumi.StringOutput `pulumi:"expiresAt"`
	// UTC ISO 8601 formatted point in time when the restore job completed.
	FinishedAt pulumi.StringOutput `pulumi:"finishedAt"`
	// The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Unique identifier of the snapshot to restore.
	SnapshotId pulumi.StringOutput `pulumi:"snapshotId"`
	// The unique identifier of the restore job.
	SnapshotRestoreJobId pulumi.StringOutput `pulumi:"snapshotRestoreJobId"`
	// Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
	Timestamp pulumi.StringOutput `pulumi:"timestamp"`
}

// NewCloudBackupSnapshotRestoreJob registers a new resource with the given unique name, arguments, and options.
func NewCloudBackupSnapshotRestoreJob(ctx *pulumi.Context,
	name string, args *CloudBackupSnapshotRestoreJobArgs, opts ...pulumi.ResourceOption) (*CloudBackupSnapshotRestoreJob, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterName == nil {
		return nil, errors.New("invalid value for required argument 'ClusterName'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.SnapshotId == nil {
		return nil, errors.New("invalid value for required argument 'SnapshotId'")
	}
	var resource CloudBackupSnapshotRestoreJob
	err := ctx.RegisterResource("mongodbatlas:index/cloudBackupSnapshotRestoreJob:CloudBackupSnapshotRestoreJob", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCloudBackupSnapshotRestoreJob gets an existing CloudBackupSnapshotRestoreJob resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCloudBackupSnapshotRestoreJob(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CloudBackupSnapshotRestoreJobState, opts ...pulumi.ResourceOption) (*CloudBackupSnapshotRestoreJob, error) {
	var resource CloudBackupSnapshotRestoreJob
	err := ctx.ReadResource("mongodbatlas:index/cloudBackupSnapshotRestoreJob:CloudBackupSnapshotRestoreJob", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CloudBackupSnapshotRestoreJob resources.
type cloudBackupSnapshotRestoreJobState struct {
	// Indicates whether the restore job was canceled.
	Cancelled *bool `pulumi:"cancelled"`
	// The name of the Atlas cluster whose snapshot you want to restore.
	ClusterName *string `pulumi:"clusterName"`
	// UTC ISO 8601 formatted point in time when Atlas created the restore job.
	CreatedAt *string `pulumi:"createdAt"`
	// Deprecated: use delivery_type_config instead
	DeliveryType map[string]string `pulumi:"deliveryType"`
	// Type of restore job to create. Possible values are: **download** or **automated**, only one must be set it in ``true``.
	DeliveryTypeConfig *CloudBackupSnapshotRestoreJobDeliveryTypeConfig `pulumi:"deliveryTypeConfig"`
	// One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
	DeliveryUrls []string `pulumi:"deliveryUrls"`
	// Indicates whether the restore job expired.
	Expired *bool `pulumi:"expired"`
	// UTC ISO 8601 formatted point in time when the restore job expires.
	ExpiresAt *string `pulumi:"expiresAt"`
	// UTC ISO 8601 formatted point in time when the restore job completed.
	FinishedAt *string `pulumi:"finishedAt"`
	// The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
	ProjectId *string `pulumi:"projectId"`
	// Unique identifier of the snapshot to restore.
	SnapshotId *string `pulumi:"snapshotId"`
	// The unique identifier of the restore job.
	SnapshotRestoreJobId *string `pulumi:"snapshotRestoreJobId"`
	// Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
	Timestamp *string `pulumi:"timestamp"`
}

type CloudBackupSnapshotRestoreJobState struct {
	// Indicates whether the restore job was canceled.
	Cancelled pulumi.BoolPtrInput
	// The name of the Atlas cluster whose snapshot you want to restore.
	ClusterName pulumi.StringPtrInput
	// UTC ISO 8601 formatted point in time when Atlas created the restore job.
	CreatedAt pulumi.StringPtrInput
	// Deprecated: use delivery_type_config instead
	DeliveryType pulumi.StringMapInput
	// Type of restore job to create. Possible values are: **download** or **automated**, only one must be set it in ``true``.
	DeliveryTypeConfig CloudBackupSnapshotRestoreJobDeliveryTypeConfigPtrInput
	// One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
	DeliveryUrls pulumi.StringArrayInput
	// Indicates whether the restore job expired.
	Expired pulumi.BoolPtrInput
	// UTC ISO 8601 formatted point in time when the restore job expires.
	ExpiresAt pulumi.StringPtrInput
	// UTC ISO 8601 formatted point in time when the restore job completed.
	FinishedAt pulumi.StringPtrInput
	// The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
	ProjectId pulumi.StringPtrInput
	// Unique identifier of the snapshot to restore.
	SnapshotId pulumi.StringPtrInput
	// The unique identifier of the restore job.
	SnapshotRestoreJobId pulumi.StringPtrInput
	// Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
	Timestamp pulumi.StringPtrInput
}

func (CloudBackupSnapshotRestoreJobState) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudBackupSnapshotRestoreJobState)(nil)).Elem()
}

type cloudBackupSnapshotRestoreJobArgs struct {
	// The name of the Atlas cluster whose snapshot you want to restore.
	ClusterName string `pulumi:"clusterName"`
	// Deprecated: use delivery_type_config instead
	DeliveryType map[string]string `pulumi:"deliveryType"`
	// Type of restore job to create. Possible values are: **download** or **automated**, only one must be set it in ``true``.
	DeliveryTypeConfig *CloudBackupSnapshotRestoreJobDeliveryTypeConfig `pulumi:"deliveryTypeConfig"`
	// The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
	ProjectId string `pulumi:"projectId"`
	// Unique identifier of the snapshot to restore.
	SnapshotId string `pulumi:"snapshotId"`
}

// The set of arguments for constructing a CloudBackupSnapshotRestoreJob resource.
type CloudBackupSnapshotRestoreJobArgs struct {
	// The name of the Atlas cluster whose snapshot you want to restore.
	ClusterName pulumi.StringInput
	// Deprecated: use delivery_type_config instead
	DeliveryType pulumi.StringMapInput
	// Type of restore job to create. Possible values are: **download** or **automated**, only one must be set it in ``true``.
	DeliveryTypeConfig CloudBackupSnapshotRestoreJobDeliveryTypeConfigPtrInput
	// The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
	ProjectId pulumi.StringInput
	// Unique identifier of the snapshot to restore.
	SnapshotId pulumi.StringInput
}

func (CloudBackupSnapshotRestoreJobArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudBackupSnapshotRestoreJobArgs)(nil)).Elem()
}

type CloudBackupSnapshotRestoreJobInput interface {
	pulumi.Input

	ToCloudBackupSnapshotRestoreJobOutput() CloudBackupSnapshotRestoreJobOutput
	ToCloudBackupSnapshotRestoreJobOutputWithContext(ctx context.Context) CloudBackupSnapshotRestoreJobOutput
}

func (*CloudBackupSnapshotRestoreJob) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudBackupSnapshotRestoreJob)(nil)).Elem()
}

func (i *CloudBackupSnapshotRestoreJob) ToCloudBackupSnapshotRestoreJobOutput() CloudBackupSnapshotRestoreJobOutput {
	return i.ToCloudBackupSnapshotRestoreJobOutputWithContext(context.Background())
}

func (i *CloudBackupSnapshotRestoreJob) ToCloudBackupSnapshotRestoreJobOutputWithContext(ctx context.Context) CloudBackupSnapshotRestoreJobOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudBackupSnapshotRestoreJobOutput)
}

// CloudBackupSnapshotRestoreJobArrayInput is an input type that accepts CloudBackupSnapshotRestoreJobArray and CloudBackupSnapshotRestoreJobArrayOutput values.
// You can construct a concrete instance of `CloudBackupSnapshotRestoreJobArrayInput` via:
//
//          CloudBackupSnapshotRestoreJobArray{ CloudBackupSnapshotRestoreJobArgs{...} }
type CloudBackupSnapshotRestoreJobArrayInput interface {
	pulumi.Input

	ToCloudBackupSnapshotRestoreJobArrayOutput() CloudBackupSnapshotRestoreJobArrayOutput
	ToCloudBackupSnapshotRestoreJobArrayOutputWithContext(context.Context) CloudBackupSnapshotRestoreJobArrayOutput
}

type CloudBackupSnapshotRestoreJobArray []CloudBackupSnapshotRestoreJobInput

func (CloudBackupSnapshotRestoreJobArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudBackupSnapshotRestoreJob)(nil)).Elem()
}

func (i CloudBackupSnapshotRestoreJobArray) ToCloudBackupSnapshotRestoreJobArrayOutput() CloudBackupSnapshotRestoreJobArrayOutput {
	return i.ToCloudBackupSnapshotRestoreJobArrayOutputWithContext(context.Background())
}

func (i CloudBackupSnapshotRestoreJobArray) ToCloudBackupSnapshotRestoreJobArrayOutputWithContext(ctx context.Context) CloudBackupSnapshotRestoreJobArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudBackupSnapshotRestoreJobArrayOutput)
}

// CloudBackupSnapshotRestoreJobMapInput is an input type that accepts CloudBackupSnapshotRestoreJobMap and CloudBackupSnapshotRestoreJobMapOutput values.
// You can construct a concrete instance of `CloudBackupSnapshotRestoreJobMapInput` via:
//
//          CloudBackupSnapshotRestoreJobMap{ "key": CloudBackupSnapshotRestoreJobArgs{...} }
type CloudBackupSnapshotRestoreJobMapInput interface {
	pulumi.Input

	ToCloudBackupSnapshotRestoreJobMapOutput() CloudBackupSnapshotRestoreJobMapOutput
	ToCloudBackupSnapshotRestoreJobMapOutputWithContext(context.Context) CloudBackupSnapshotRestoreJobMapOutput
}

type CloudBackupSnapshotRestoreJobMap map[string]CloudBackupSnapshotRestoreJobInput

func (CloudBackupSnapshotRestoreJobMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudBackupSnapshotRestoreJob)(nil)).Elem()
}

func (i CloudBackupSnapshotRestoreJobMap) ToCloudBackupSnapshotRestoreJobMapOutput() CloudBackupSnapshotRestoreJobMapOutput {
	return i.ToCloudBackupSnapshotRestoreJobMapOutputWithContext(context.Background())
}

func (i CloudBackupSnapshotRestoreJobMap) ToCloudBackupSnapshotRestoreJobMapOutputWithContext(ctx context.Context) CloudBackupSnapshotRestoreJobMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudBackupSnapshotRestoreJobMapOutput)
}

type CloudBackupSnapshotRestoreJobOutput struct{ *pulumi.OutputState }

func (CloudBackupSnapshotRestoreJobOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudBackupSnapshotRestoreJob)(nil)).Elem()
}

func (o CloudBackupSnapshotRestoreJobOutput) ToCloudBackupSnapshotRestoreJobOutput() CloudBackupSnapshotRestoreJobOutput {
	return o
}

func (o CloudBackupSnapshotRestoreJobOutput) ToCloudBackupSnapshotRestoreJobOutputWithContext(ctx context.Context) CloudBackupSnapshotRestoreJobOutput {
	return o
}

type CloudBackupSnapshotRestoreJobArrayOutput struct{ *pulumi.OutputState }

func (CloudBackupSnapshotRestoreJobArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudBackupSnapshotRestoreJob)(nil)).Elem()
}

func (o CloudBackupSnapshotRestoreJobArrayOutput) ToCloudBackupSnapshotRestoreJobArrayOutput() CloudBackupSnapshotRestoreJobArrayOutput {
	return o
}

func (o CloudBackupSnapshotRestoreJobArrayOutput) ToCloudBackupSnapshotRestoreJobArrayOutputWithContext(ctx context.Context) CloudBackupSnapshotRestoreJobArrayOutput {
	return o
}

func (o CloudBackupSnapshotRestoreJobArrayOutput) Index(i pulumi.IntInput) CloudBackupSnapshotRestoreJobOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CloudBackupSnapshotRestoreJob {
		return vs[0].([]*CloudBackupSnapshotRestoreJob)[vs[1].(int)]
	}).(CloudBackupSnapshotRestoreJobOutput)
}

type CloudBackupSnapshotRestoreJobMapOutput struct{ *pulumi.OutputState }

func (CloudBackupSnapshotRestoreJobMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudBackupSnapshotRestoreJob)(nil)).Elem()
}

func (o CloudBackupSnapshotRestoreJobMapOutput) ToCloudBackupSnapshotRestoreJobMapOutput() CloudBackupSnapshotRestoreJobMapOutput {
	return o
}

func (o CloudBackupSnapshotRestoreJobMapOutput) ToCloudBackupSnapshotRestoreJobMapOutputWithContext(ctx context.Context) CloudBackupSnapshotRestoreJobMapOutput {
	return o
}

func (o CloudBackupSnapshotRestoreJobMapOutput) MapIndex(k pulumi.StringInput) CloudBackupSnapshotRestoreJobOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CloudBackupSnapshotRestoreJob {
		return vs[0].(map[string]*CloudBackupSnapshotRestoreJob)[vs[1].(string)]
	}).(CloudBackupSnapshotRestoreJobOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CloudBackupSnapshotRestoreJobInput)(nil)).Elem(), &CloudBackupSnapshotRestoreJob{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudBackupSnapshotRestoreJobArrayInput)(nil)).Elem(), CloudBackupSnapshotRestoreJobArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudBackupSnapshotRestoreJobMapInput)(nil)).Elem(), CloudBackupSnapshotRestoreJobMap{})
	pulumi.RegisterOutputType(CloudBackupSnapshotRestoreJobOutput{})
	pulumi.RegisterOutputType(CloudBackupSnapshotRestoreJobArrayOutput{})
	pulumi.RegisterOutputType(CloudBackupSnapshotRestoreJobMapOutput{})
}
