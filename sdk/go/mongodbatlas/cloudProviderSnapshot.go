// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// `CloudProviderSnapshot` provides a resource to take a cloud backup snapshot on demand.
// On-demand snapshots happen immediately, unlike scheduled snapshots which occur at regular intervals. If there is already an on-demand snapshot with a status of queued or inProgress, you must wait until Atlas has completed the on-demand snapshot before taking another.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-mongodbatlas/sdk/go/mongodbatlas"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
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
// 			ProviderBackupEnabled:    pulumi.Bool(true),
// 			ProviderDiskIops:         pulumi.Int(100),
// 			ProviderEncryptEbsVolume: pulumi.Bool(false),
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
// 			DeliveryType: &mongodbatlas.CloudProviderSnapshotRestoreJobDeliveryTypeArgs{
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
type CloudProviderSnapshot struct {
	pulumi.CustomResourceState

	// The name of the Atlas cluster that contains the snapshots you want to retrieve.
	ClusterName pulumi.StringOutput `pulumi:"clusterName"`
	// UTC ISO 8601 formatted point in time when Atlas took the snapshot.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Description of the on-demand snapshot.
	Description pulumi.StringOutput `pulumi:"description"`
	// UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
	ExpiresAt pulumi.StringOutput `pulumi:"expiresAt"`
	// Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
	MasterKeyUuid pulumi.StringOutput `pulumi:"masterKeyUuid"`
	// Version of the MongoDB server.
	MongodVersion pulumi.StringOutput `pulumi:"mongodVersion"`
	// The unique identifier of the project for the Atlas cluster.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
	RetentionInDays pulumi.IntOutput `pulumi:"retentionInDays"`
	// Unique identifier of the snapshot.
	SnapshotId pulumi.StringOutput `pulumi:"snapshotId"`
	// Specified the type of snapshot. Valid values are onDemand and scheduled.
	SnapshotType pulumi.StringOutput `pulumi:"snapshotType"`
	// Current status of the snapshot. One of the following values will be returned: queued, inProgress, completed, failed.
	Status pulumi.StringOutput `pulumi:"status"`
	// Specifies the size of the snapshot in bytes.
	StorageSizeBytes pulumi.IntOutput `pulumi:"storageSizeBytes"`
	// Specifies the type of cluster: replicaSet or shardedCluster.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewCloudProviderSnapshot registers a new resource with the given unique name, arguments, and options.
func NewCloudProviderSnapshot(ctx *pulumi.Context,
	name string, args *CloudProviderSnapshotArgs, opts ...pulumi.ResourceOption) (*CloudProviderSnapshot, error) {
	if args == nil || args.ClusterName == nil {
		return nil, errors.New("missing required argument 'ClusterName'")
	}
	if args == nil || args.Description == nil {
		return nil, errors.New("missing required argument 'Description'")
	}
	if args == nil || args.ProjectId == nil {
		return nil, errors.New("missing required argument 'ProjectId'")
	}
	if args == nil || args.RetentionInDays == nil {
		return nil, errors.New("missing required argument 'RetentionInDays'")
	}
	if args == nil {
		args = &CloudProviderSnapshotArgs{}
	}
	var resource CloudProviderSnapshot
	err := ctx.RegisterResource("mongodbatlas:index/cloudProviderSnapshot:CloudProviderSnapshot", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCloudProviderSnapshot gets an existing CloudProviderSnapshot resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCloudProviderSnapshot(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CloudProviderSnapshotState, opts ...pulumi.ResourceOption) (*CloudProviderSnapshot, error) {
	var resource CloudProviderSnapshot
	err := ctx.ReadResource("mongodbatlas:index/cloudProviderSnapshot:CloudProviderSnapshot", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CloudProviderSnapshot resources.
type cloudProviderSnapshotState struct {
	// The name of the Atlas cluster that contains the snapshots you want to retrieve.
	ClusterName *string `pulumi:"clusterName"`
	// UTC ISO 8601 formatted point in time when Atlas took the snapshot.
	CreatedAt *string `pulumi:"createdAt"`
	// Description of the on-demand snapshot.
	Description *string `pulumi:"description"`
	// UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
	ExpiresAt *string `pulumi:"expiresAt"`
	// Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
	MasterKeyUuid *string `pulumi:"masterKeyUuid"`
	// Version of the MongoDB server.
	MongodVersion *string `pulumi:"mongodVersion"`
	// The unique identifier of the project for the Atlas cluster.
	ProjectId *string `pulumi:"projectId"`
	// The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
	RetentionInDays *int `pulumi:"retentionInDays"`
	// Unique identifier of the snapshot.
	SnapshotId *string `pulumi:"snapshotId"`
	// Specified the type of snapshot. Valid values are onDemand and scheduled.
	SnapshotType *string `pulumi:"snapshotType"`
	// Current status of the snapshot. One of the following values will be returned: queued, inProgress, completed, failed.
	Status *string `pulumi:"status"`
	// Specifies the size of the snapshot in bytes.
	StorageSizeBytes *int `pulumi:"storageSizeBytes"`
	// Specifies the type of cluster: replicaSet or shardedCluster.
	Type *string `pulumi:"type"`
}

type CloudProviderSnapshotState struct {
	// The name of the Atlas cluster that contains the snapshots you want to retrieve.
	ClusterName pulumi.StringPtrInput
	// UTC ISO 8601 formatted point in time when Atlas took the snapshot.
	CreatedAt pulumi.StringPtrInput
	// Description of the on-demand snapshot.
	Description pulumi.StringPtrInput
	// UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
	ExpiresAt pulumi.StringPtrInput
	// Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
	MasterKeyUuid pulumi.StringPtrInput
	// Version of the MongoDB server.
	MongodVersion pulumi.StringPtrInput
	// The unique identifier of the project for the Atlas cluster.
	ProjectId pulumi.StringPtrInput
	// The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
	RetentionInDays pulumi.IntPtrInput
	// Unique identifier of the snapshot.
	SnapshotId pulumi.StringPtrInput
	// Specified the type of snapshot. Valid values are onDemand and scheduled.
	SnapshotType pulumi.StringPtrInput
	// Current status of the snapshot. One of the following values will be returned: queued, inProgress, completed, failed.
	Status pulumi.StringPtrInput
	// Specifies the size of the snapshot in bytes.
	StorageSizeBytes pulumi.IntPtrInput
	// Specifies the type of cluster: replicaSet or shardedCluster.
	Type pulumi.StringPtrInput
}

func (CloudProviderSnapshotState) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudProviderSnapshotState)(nil)).Elem()
}

type cloudProviderSnapshotArgs struct {
	// The name of the Atlas cluster that contains the snapshots you want to retrieve.
	ClusterName string `pulumi:"clusterName"`
	// Description of the on-demand snapshot.
	Description string `pulumi:"description"`
	// The unique identifier of the project for the Atlas cluster.
	ProjectId string `pulumi:"projectId"`
	// The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
	RetentionInDays int `pulumi:"retentionInDays"`
}

// The set of arguments for constructing a CloudProviderSnapshot resource.
type CloudProviderSnapshotArgs struct {
	// The name of the Atlas cluster that contains the snapshots you want to retrieve.
	ClusterName pulumi.StringInput
	// Description of the on-demand snapshot.
	Description pulumi.StringInput
	// The unique identifier of the project for the Atlas cluster.
	ProjectId pulumi.StringInput
	// The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
	RetentionInDays pulumi.IntInput
}

func (CloudProviderSnapshotArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudProviderSnapshotArgs)(nil)).Elem()
}
