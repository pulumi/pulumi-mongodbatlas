// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// **WARNING:** This resource is deprecated, use `CloudBackupSnapshotRestoreJob`
//
// `CloudProviderSnapshotRestoreJob` provides a resource to create a new restore job from a cloud backup snapshot of a specified cluster. The restore job can be one of three types:
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
// 		_, err = mongodbatlas.NewCloudProviderSnapshotRestoreJob(ctx, "testCloudProviderSnapshotRestoreJob", &mongodbatlas.CloudProviderSnapshotRestoreJobArgs{
// 			ProjectId:   testCloudProviderSnapshot.ProjectId,
// 			ClusterName: testCloudProviderSnapshot.ClusterName,
// 			SnapshotId:  testCloudProviderSnapshot.SnapshotId,
// 			DeliveryTypeConfig: &CloudProviderSnapshotRestoreJobDeliveryTypeConfigArgs{
// 				Automated:         pulumi.Bool(true),
// 				TargetClusterName: pulumi.String("MyCluster"),
// 				TargetProjectId:   pulumi.String("5cf5a45a9ccf6400e60981b6"),
// 			},
// 		}, pulumi.DependsOn([]pulumi.Resource{
// 			testCloudProviderSnapshot,
// 		}))
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
// 		_, err = mongodbatlas.NewCloudProviderSnapshotRestoreJob(ctx, "testCloudProviderSnapshotRestoreJob", &mongodbatlas.CloudProviderSnapshotRestoreJobArgs{
// 			ProjectId:   testCloudProviderSnapshot.ProjectId,
// 			ClusterName: testCloudProviderSnapshot.ClusterName,
// 			SnapshotId:  testCloudProviderSnapshot.SnapshotId,
// 			DeliveryTypeConfig: &CloudProviderSnapshotRestoreJobDeliveryTypeConfigArgs{
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
//  $ pulumi import mongodbatlas:index/cloudProviderSnapshotRestoreJob:CloudProviderSnapshotRestoreJob test 5cf5a45a9ccf6400e60981b6-MyCluster-5d1b654ecf09a24b888f4c79
// ```
//
//  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/restore/restores/)
type CloudProviderSnapshotRestoreJob struct {
	pulumi.CustomResourceState

	// Indicates whether the restore job was canceled.
	Cancelled pulumi.BoolOutput `pulumi:"cancelled"`
	// The name of the Atlas cluster whose snapshot you want to restore.
	ClusterName pulumi.StringOutput `pulumi:"clusterName"`
	// UTC ISO 8601 formatted point in time when Atlas created the restore job.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Type of restore job to create. Possible values are: **download** or **automated**, only one must be set it in ``true``.
	//
	// Deprecated: use delivery_type_config instead
	DeliveryType pulumi.StringMapOutput `pulumi:"deliveryType"`
	// Type of restore job to create. Possible values are: automated and download.
	DeliveryTypeConfig CloudProviderSnapshotRestoreJobDeliveryTypeConfigPtrOutput `pulumi:"deliveryTypeConfig"`
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

// NewCloudProviderSnapshotRestoreJob registers a new resource with the given unique name, arguments, and options.
func NewCloudProviderSnapshotRestoreJob(ctx *pulumi.Context,
	name string, args *CloudProviderSnapshotRestoreJobArgs, opts ...pulumi.ResourceOption) (*CloudProviderSnapshotRestoreJob, error) {
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
	var resource CloudProviderSnapshotRestoreJob
	err := ctx.RegisterResource("mongodbatlas:index/cloudProviderSnapshotRestoreJob:CloudProviderSnapshotRestoreJob", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCloudProviderSnapshotRestoreJob gets an existing CloudProviderSnapshotRestoreJob resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCloudProviderSnapshotRestoreJob(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CloudProviderSnapshotRestoreJobState, opts ...pulumi.ResourceOption) (*CloudProviderSnapshotRestoreJob, error) {
	var resource CloudProviderSnapshotRestoreJob
	err := ctx.ReadResource("mongodbatlas:index/cloudProviderSnapshotRestoreJob:CloudProviderSnapshotRestoreJob", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CloudProviderSnapshotRestoreJob resources.
type cloudProviderSnapshotRestoreJobState struct {
	// Indicates whether the restore job was canceled.
	Cancelled *bool `pulumi:"cancelled"`
	// The name of the Atlas cluster whose snapshot you want to restore.
	ClusterName *string `pulumi:"clusterName"`
	// UTC ISO 8601 formatted point in time when Atlas created the restore job.
	CreatedAt *string `pulumi:"createdAt"`
	// Type of restore job to create. Possible values are: **download** or **automated**, only one must be set it in ``true``.
	//
	// Deprecated: use delivery_type_config instead
	DeliveryType map[string]string `pulumi:"deliveryType"`
	// Type of restore job to create. Possible values are: automated and download.
	DeliveryTypeConfig *CloudProviderSnapshotRestoreJobDeliveryTypeConfig `pulumi:"deliveryTypeConfig"`
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

type CloudProviderSnapshotRestoreJobState struct {
	// Indicates whether the restore job was canceled.
	Cancelled pulumi.BoolPtrInput
	// The name of the Atlas cluster whose snapshot you want to restore.
	ClusterName pulumi.StringPtrInput
	// UTC ISO 8601 formatted point in time when Atlas created the restore job.
	CreatedAt pulumi.StringPtrInput
	// Type of restore job to create. Possible values are: **download** or **automated**, only one must be set it in ``true``.
	//
	// Deprecated: use delivery_type_config instead
	DeliveryType pulumi.StringMapInput
	// Type of restore job to create. Possible values are: automated and download.
	DeliveryTypeConfig CloudProviderSnapshotRestoreJobDeliveryTypeConfigPtrInput
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

func (CloudProviderSnapshotRestoreJobState) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudProviderSnapshotRestoreJobState)(nil)).Elem()
}

type cloudProviderSnapshotRestoreJobArgs struct {
	// The name of the Atlas cluster whose snapshot you want to restore.
	ClusterName string `pulumi:"clusterName"`
	// Type of restore job to create. Possible values are: **download** or **automated**, only one must be set it in ``true``.
	//
	// Deprecated: use delivery_type_config instead
	DeliveryType map[string]string `pulumi:"deliveryType"`
	// Type of restore job to create. Possible values are: automated and download.
	DeliveryTypeConfig *CloudProviderSnapshotRestoreJobDeliveryTypeConfig `pulumi:"deliveryTypeConfig"`
	// The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
	ProjectId string `pulumi:"projectId"`
	// Unique identifier of the snapshot to restore.
	SnapshotId string `pulumi:"snapshotId"`
}

// The set of arguments for constructing a CloudProviderSnapshotRestoreJob resource.
type CloudProviderSnapshotRestoreJobArgs struct {
	// The name of the Atlas cluster whose snapshot you want to restore.
	ClusterName pulumi.StringInput
	// Type of restore job to create. Possible values are: **download** or **automated**, only one must be set it in ``true``.
	//
	// Deprecated: use delivery_type_config instead
	DeliveryType pulumi.StringMapInput
	// Type of restore job to create. Possible values are: automated and download.
	DeliveryTypeConfig CloudProviderSnapshotRestoreJobDeliveryTypeConfigPtrInput
	// The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
	ProjectId pulumi.StringInput
	// Unique identifier of the snapshot to restore.
	SnapshotId pulumi.StringInput
}

func (CloudProviderSnapshotRestoreJobArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudProviderSnapshotRestoreJobArgs)(nil)).Elem()
}

type CloudProviderSnapshotRestoreJobInput interface {
	pulumi.Input

	ToCloudProviderSnapshotRestoreJobOutput() CloudProviderSnapshotRestoreJobOutput
	ToCloudProviderSnapshotRestoreJobOutputWithContext(ctx context.Context) CloudProviderSnapshotRestoreJobOutput
}

func (*CloudProviderSnapshotRestoreJob) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudProviderSnapshotRestoreJob)(nil)).Elem()
}

func (i *CloudProviderSnapshotRestoreJob) ToCloudProviderSnapshotRestoreJobOutput() CloudProviderSnapshotRestoreJobOutput {
	return i.ToCloudProviderSnapshotRestoreJobOutputWithContext(context.Background())
}

func (i *CloudProviderSnapshotRestoreJob) ToCloudProviderSnapshotRestoreJobOutputWithContext(ctx context.Context) CloudProviderSnapshotRestoreJobOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudProviderSnapshotRestoreJobOutput)
}

// CloudProviderSnapshotRestoreJobArrayInput is an input type that accepts CloudProviderSnapshotRestoreJobArray and CloudProviderSnapshotRestoreJobArrayOutput values.
// You can construct a concrete instance of `CloudProviderSnapshotRestoreJobArrayInput` via:
//
//          CloudProviderSnapshotRestoreJobArray{ CloudProviderSnapshotRestoreJobArgs{...} }
type CloudProviderSnapshotRestoreJobArrayInput interface {
	pulumi.Input

	ToCloudProviderSnapshotRestoreJobArrayOutput() CloudProviderSnapshotRestoreJobArrayOutput
	ToCloudProviderSnapshotRestoreJobArrayOutputWithContext(context.Context) CloudProviderSnapshotRestoreJobArrayOutput
}

type CloudProviderSnapshotRestoreJobArray []CloudProviderSnapshotRestoreJobInput

func (CloudProviderSnapshotRestoreJobArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudProviderSnapshotRestoreJob)(nil)).Elem()
}

func (i CloudProviderSnapshotRestoreJobArray) ToCloudProviderSnapshotRestoreJobArrayOutput() CloudProviderSnapshotRestoreJobArrayOutput {
	return i.ToCloudProviderSnapshotRestoreJobArrayOutputWithContext(context.Background())
}

func (i CloudProviderSnapshotRestoreJobArray) ToCloudProviderSnapshotRestoreJobArrayOutputWithContext(ctx context.Context) CloudProviderSnapshotRestoreJobArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudProviderSnapshotRestoreJobArrayOutput)
}

// CloudProviderSnapshotRestoreJobMapInput is an input type that accepts CloudProviderSnapshotRestoreJobMap and CloudProviderSnapshotRestoreJobMapOutput values.
// You can construct a concrete instance of `CloudProviderSnapshotRestoreJobMapInput` via:
//
//          CloudProviderSnapshotRestoreJobMap{ "key": CloudProviderSnapshotRestoreJobArgs{...} }
type CloudProviderSnapshotRestoreJobMapInput interface {
	pulumi.Input

	ToCloudProviderSnapshotRestoreJobMapOutput() CloudProviderSnapshotRestoreJobMapOutput
	ToCloudProviderSnapshotRestoreJobMapOutputWithContext(context.Context) CloudProviderSnapshotRestoreJobMapOutput
}

type CloudProviderSnapshotRestoreJobMap map[string]CloudProviderSnapshotRestoreJobInput

func (CloudProviderSnapshotRestoreJobMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudProviderSnapshotRestoreJob)(nil)).Elem()
}

func (i CloudProviderSnapshotRestoreJobMap) ToCloudProviderSnapshotRestoreJobMapOutput() CloudProviderSnapshotRestoreJobMapOutput {
	return i.ToCloudProviderSnapshotRestoreJobMapOutputWithContext(context.Background())
}

func (i CloudProviderSnapshotRestoreJobMap) ToCloudProviderSnapshotRestoreJobMapOutputWithContext(ctx context.Context) CloudProviderSnapshotRestoreJobMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudProviderSnapshotRestoreJobMapOutput)
}

type CloudProviderSnapshotRestoreJobOutput struct{ *pulumi.OutputState }

func (CloudProviderSnapshotRestoreJobOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudProviderSnapshotRestoreJob)(nil)).Elem()
}

func (o CloudProviderSnapshotRestoreJobOutput) ToCloudProviderSnapshotRestoreJobOutput() CloudProviderSnapshotRestoreJobOutput {
	return o
}

func (o CloudProviderSnapshotRestoreJobOutput) ToCloudProviderSnapshotRestoreJobOutputWithContext(ctx context.Context) CloudProviderSnapshotRestoreJobOutput {
	return o
}

type CloudProviderSnapshotRestoreJobArrayOutput struct{ *pulumi.OutputState }

func (CloudProviderSnapshotRestoreJobArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudProviderSnapshotRestoreJob)(nil)).Elem()
}

func (o CloudProviderSnapshotRestoreJobArrayOutput) ToCloudProviderSnapshotRestoreJobArrayOutput() CloudProviderSnapshotRestoreJobArrayOutput {
	return o
}

func (o CloudProviderSnapshotRestoreJobArrayOutput) ToCloudProviderSnapshotRestoreJobArrayOutputWithContext(ctx context.Context) CloudProviderSnapshotRestoreJobArrayOutput {
	return o
}

func (o CloudProviderSnapshotRestoreJobArrayOutput) Index(i pulumi.IntInput) CloudProviderSnapshotRestoreJobOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CloudProviderSnapshotRestoreJob {
		return vs[0].([]*CloudProviderSnapshotRestoreJob)[vs[1].(int)]
	}).(CloudProviderSnapshotRestoreJobOutput)
}

type CloudProviderSnapshotRestoreJobMapOutput struct{ *pulumi.OutputState }

func (CloudProviderSnapshotRestoreJobMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudProviderSnapshotRestoreJob)(nil)).Elem()
}

func (o CloudProviderSnapshotRestoreJobMapOutput) ToCloudProviderSnapshotRestoreJobMapOutput() CloudProviderSnapshotRestoreJobMapOutput {
	return o
}

func (o CloudProviderSnapshotRestoreJobMapOutput) ToCloudProviderSnapshotRestoreJobMapOutputWithContext(ctx context.Context) CloudProviderSnapshotRestoreJobMapOutput {
	return o
}

func (o CloudProviderSnapshotRestoreJobMapOutput) MapIndex(k pulumi.StringInput) CloudProviderSnapshotRestoreJobOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CloudProviderSnapshotRestoreJob {
		return vs[0].(map[string]*CloudProviderSnapshotRestoreJob)[vs[1].(string)]
	}).(CloudProviderSnapshotRestoreJobOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CloudProviderSnapshotRestoreJobInput)(nil)).Elem(), &CloudProviderSnapshotRestoreJob{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudProviderSnapshotRestoreJobArrayInput)(nil)).Elem(), CloudProviderSnapshotRestoreJobArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudProviderSnapshotRestoreJobMapInput)(nil)).Elem(), CloudProviderSnapshotRestoreJobMap{})
	pulumi.RegisterOutputType(CloudProviderSnapshotRestoreJobOutput{})
	pulumi.RegisterOutputType(CloudProviderSnapshotRestoreJobArrayOutput{})
	pulumi.RegisterOutputType(CloudProviderSnapshotRestoreJobMapOutput{})
}
