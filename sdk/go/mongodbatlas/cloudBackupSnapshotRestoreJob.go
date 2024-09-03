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

// ## Example Usage
//
// ### Example automated delivery type
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
//				Name:          pulumi.String("MyCluster"),
//				ClusterType:   pulumi.String("REPLICASET"),
//				BackupEnabled: pulumi.Bool(true),
//				ReplicationSpecs: mongodbatlas.AdvancedClusterReplicationSpecArray{
//					&mongodbatlas.AdvancedClusterReplicationSpecArgs{
//						RegionConfigs: mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArray{
//							&mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArgs{
//								Priority:     pulumi.Int(7),
//								ProviderName: pulumi.String("AWS"),
//								RegionName:   pulumi.String("EU_WEST_2"),
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
//			test, err := mongodbatlas.NewCloudProviderSnapshot(ctx, "test", &mongodbatlas.CloudProviderSnapshotArgs{
//				ProjectId:       myCluster.ProjectId,
//				ClusterName:     myCluster.Name,
//				Description:     "myDescription",
//				RetentionInDays: 1,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.NewCloudBackupSnapshotRestoreJob(ctx, "test", &mongodbatlas.CloudBackupSnapshotRestoreJobArgs{
//				ProjectId:   test.ProjectId,
//				ClusterName: test.ClusterName,
//				SnapshotId:  test.SnapshotId,
//				DeliveryTypeConfig: &mongodbatlas.CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs{
//					Automated:         pulumi.Bool(true),
//					TargetClusterName: pulumi.String("MyCluster"),
//					TargetProjectId:   pulumi.String("5cf5a45a9ccf6400e60981b6"),
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
//
// ### Example download delivery type
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
//				Name:          pulumi.String("MyCluster"),
//				ClusterType:   pulumi.String("REPLICASET"),
//				BackupEnabled: pulumi.Bool(true),
//				ReplicationSpecs: mongodbatlas.AdvancedClusterReplicationSpecArray{
//					&mongodbatlas.AdvancedClusterReplicationSpecArgs{
//						RegionConfigs: mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArray{
//							&mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArgs{
//								Priority:     pulumi.Int(7),
//								ProviderName: pulumi.String("AWS"),
//								RegionName:   pulumi.String("EU_WEST_2"),
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
//			test, err := mongodbatlas.NewCloudProviderSnapshot(ctx, "test", &mongodbatlas.CloudProviderSnapshotArgs{
//				ProjectId:       myCluster.ProjectId,
//				ClusterName:     myCluster.Name,
//				Description:     "myDescription",
//				RetentionInDays: 1,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.NewCloudBackupSnapshotRestoreJob(ctx, "test", &mongodbatlas.CloudBackupSnapshotRestoreJobArgs{
//				ProjectId:   test.ProjectId,
//				ClusterName: test.ClusterName,
//				SnapshotId:  test.SnapshotId,
//				DeliveryTypeConfig: &mongodbatlas.CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs{
//					Download: pulumi.Bool(true),
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
//
// ### Example of a point in time restore
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
//			_, err := mongodbatlas.NewAdvancedCluster(ctx, "my_cluster", &mongodbatlas.AdvancedClusterArgs{
//				ProjectId:     pulumi.String("<PROJECT-ID>"),
//				Name:          pulumi.String("MyCluster"),
//				ClusterType:   pulumi.String("REPLICASET"),
//				BackupEnabled: pulumi.Bool(true),
//				ReplicationSpecs: mongodbatlas.AdvancedClusterReplicationSpecArray{
//					&mongodbatlas.AdvancedClusterReplicationSpecArgs{
//						RegionConfigs: mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArray{
//							&mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArgs{
//								Priority:     pulumi.Int(7),
//								ProviderName: pulumi.String("AWS"),
//								RegionName:   pulumi.String("EU_WEST_2"),
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
//			test, err := mongodbatlas.NewCloudBackupSnapshot(ctx, "test", &mongodbatlas.CloudBackupSnapshotArgs{
//				ProjectId:       pulumi.Any(clusterTest.ProjectId),
//				ClusterName:     pulumi.Any(clusterTest.Name),
//				Description:     pulumi.String("My description"),
//				RetentionInDays: pulumi.Int(1),
//			})
//			if err != nil {
//				return err
//			}
//			var tmp0 float64
//			if pointInTimeUtcSeconds == 0 {
//				tmp0 = 0
//			} else {
//				tmp0 = 1
//			}
//			var testCloudBackupSnapshotRestoreJob []*mongodbatlas.CloudBackupSnapshotRestoreJob
//			for index := 0; index < tmp0; index++ {
//				key0 := index
//				_ := index
//				__res, err := mongodbatlas.NewCloudBackupSnapshotRestoreJob(ctx, fmt.Sprintf("test-%v", key0), &mongodbatlas.CloudBackupSnapshotRestoreJobArgs{
//					ProjectId:   test.ProjectId,
//					ClusterName: test.ClusterName,
//					SnapshotId:  test.ID(),
//					DeliveryTypeConfig: &mongodbatlas.CloudBackupSnapshotRestoreJobDeliveryTypeConfigArgs{
//						PointInTime:           pulumi.Bool(true),
//						TargetClusterName:     pulumi.Any(clusterTest.Name),
//						TargetProjectId:       pulumi.Any(clusterTest.ProjectId),
//						PointInTimeUtcSeconds: pulumi.Any(pointInTimeUtcSeconds),
//					},
//				})
//				if err != nil {
//					return err
//				}
//				testCloudBackupSnapshotRestoreJob = append(testCloudBackupSnapshotRestoreJob, __res)
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### Available complete examples
// - Restore from backup snapshot at point in time
// - Restore from backup snapshot using an advanced cluster resource
//
// ## Import
//
// Cloud Backup Snapshot Restore Job entries can be imported using project project_id, cluster_name and snapshot_id (Unique identifier of the snapshot), in the format `PROJECTID-CLUSTERNAME-JOBID`, e.g.
//
// ```sh
// $ pulumi import mongodbatlas:index/cloudBackupSnapshotRestoreJob:CloudBackupSnapshotRestoreJob test 5cf5a45a9ccf6400e60981b6-MyCluster-5d1b654ecf09a24b888f4c79
// ```
// For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/restore/restores/)
type CloudBackupSnapshotRestoreJob struct {
	pulumi.CustomResourceState

	// Indicates whether the restore job was canceled.
	Cancelled pulumi.BoolOutput `pulumi:"cancelled"`
	// The name of the Atlas cluster whose snapshot you want to restore.
	ClusterName pulumi.StringOutput `pulumi:"clusterName"`
	// Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in `true`.
	// * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
	// * `delivery_type_config.download` - Set to `true` to use the download configuration.
	// * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplogTs` and `oplogInc`, or `pointInTimeUtcSeconds`.
	// * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
	// * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
	// * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
	// * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplogTs`.
	// * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
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
	// Optional setting for **pointInTime** configuration. Unique identifier of the snapshot to restore.
	SnapshotId pulumi.StringPtrOutput `pulumi:"snapshotId"`
	// The unique identifier of the restore job.
	SnapshotRestoreJobId pulumi.StringOutput `pulumi:"snapshotRestoreJobId"`
	// Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
	// * `oplogTs` - Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot.
	//   Three conditions apply to this parameter:
	// * Enable Continuous Cloud Backup on your cluster.
	// * Specify oplogInc.
	// * Specify either oplogTs and oplogInc or pointInTimeUTCSeconds, but not both.
	// * `oplogInc` - Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp.
	//   Three conditions apply to this parameter:
	// * Enable Continuous Cloud Backup on your cluster.
	// * Specify oplogTs.
	// * Specify either oplogTs and oplogInc or pointInTimeUTCSeconds, but not both.
	// * `pointInTimeUTCSeconds` - Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot.
	//   Two conditions apply to this parameter:
	// * Enable Continuous Cloud Backup on your cluster.
	// * Specify either pointInTimeUTCSeconds or oplogTs and oplogInc, but not both.
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
	opts = internal.PkgResourceDefaultOpts(opts)
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
	// Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in `true`.
	// * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
	// * `delivery_type_config.download` - Set to `true` to use the download configuration.
	// * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplogTs` and `oplogInc`, or `pointInTimeUtcSeconds`.
	// * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
	// * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
	// * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
	// * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplogTs`.
	// * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
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
	// Optional setting for **pointInTime** configuration. Unique identifier of the snapshot to restore.
	SnapshotId *string `pulumi:"snapshotId"`
	// The unique identifier of the restore job.
	SnapshotRestoreJobId *string `pulumi:"snapshotRestoreJobId"`
	// Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
	// * `oplogTs` - Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot.
	//   Three conditions apply to this parameter:
	// * Enable Continuous Cloud Backup on your cluster.
	// * Specify oplogInc.
	// * Specify either oplogTs and oplogInc or pointInTimeUTCSeconds, but not both.
	// * `oplogInc` - Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp.
	//   Three conditions apply to this parameter:
	// * Enable Continuous Cloud Backup on your cluster.
	// * Specify oplogTs.
	// * Specify either oplogTs and oplogInc or pointInTimeUTCSeconds, but not both.
	// * `pointInTimeUTCSeconds` - Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot.
	//   Two conditions apply to this parameter:
	// * Enable Continuous Cloud Backup on your cluster.
	// * Specify either pointInTimeUTCSeconds or oplogTs and oplogInc, but not both.
	Timestamp *string `pulumi:"timestamp"`
}

type CloudBackupSnapshotRestoreJobState struct {
	// Indicates whether the restore job was canceled.
	Cancelled pulumi.BoolPtrInput
	// The name of the Atlas cluster whose snapshot you want to restore.
	ClusterName pulumi.StringPtrInput
	// Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in `true`.
	// * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
	// * `delivery_type_config.download` - Set to `true` to use the download configuration.
	// * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplogTs` and `oplogInc`, or `pointInTimeUtcSeconds`.
	// * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
	// * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
	// * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
	// * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplogTs`.
	// * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
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
	// Optional setting for **pointInTime** configuration. Unique identifier of the snapshot to restore.
	SnapshotId pulumi.StringPtrInput
	// The unique identifier of the restore job.
	SnapshotRestoreJobId pulumi.StringPtrInput
	// Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
	// * `oplogTs` - Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot.
	//   Three conditions apply to this parameter:
	// * Enable Continuous Cloud Backup on your cluster.
	// * Specify oplogInc.
	// * Specify either oplogTs and oplogInc or pointInTimeUTCSeconds, but not both.
	// * `oplogInc` - Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp.
	//   Three conditions apply to this parameter:
	// * Enable Continuous Cloud Backup on your cluster.
	// * Specify oplogTs.
	// * Specify either oplogTs and oplogInc or pointInTimeUTCSeconds, but not both.
	// * `pointInTimeUTCSeconds` - Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot.
	//   Two conditions apply to this parameter:
	// * Enable Continuous Cloud Backup on your cluster.
	// * Specify either pointInTimeUTCSeconds or oplogTs and oplogInc, but not both.
	Timestamp pulumi.StringPtrInput
}

func (CloudBackupSnapshotRestoreJobState) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudBackupSnapshotRestoreJobState)(nil)).Elem()
}

type cloudBackupSnapshotRestoreJobArgs struct {
	// The name of the Atlas cluster whose snapshot you want to restore.
	ClusterName string `pulumi:"clusterName"`
	// Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in `true`.
	// * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
	// * `delivery_type_config.download` - Set to `true` to use the download configuration.
	// * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplogTs` and `oplogInc`, or `pointInTimeUtcSeconds`.
	// * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
	// * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
	// * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
	// * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplogTs`.
	// * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
	DeliveryTypeConfig *CloudBackupSnapshotRestoreJobDeliveryTypeConfig `pulumi:"deliveryTypeConfig"`
	// The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
	ProjectId string `pulumi:"projectId"`
	// Optional setting for **pointInTime** configuration. Unique identifier of the snapshot to restore.
	SnapshotId *string `pulumi:"snapshotId"`
}

// The set of arguments for constructing a CloudBackupSnapshotRestoreJob resource.
type CloudBackupSnapshotRestoreJobArgs struct {
	// The name of the Atlas cluster whose snapshot you want to restore.
	ClusterName pulumi.StringInput
	// Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in `true`.
	// * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
	// * `delivery_type_config.download` - Set to `true` to use the download configuration.
	// * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplogTs` and `oplogInc`, or `pointInTimeUtcSeconds`.
	// * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
	// * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
	// * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
	// * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplogTs`.
	// * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
	DeliveryTypeConfig CloudBackupSnapshotRestoreJobDeliveryTypeConfigPtrInput
	// The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
	ProjectId pulumi.StringInput
	// Optional setting for **pointInTime** configuration. Unique identifier of the snapshot to restore.
	SnapshotId pulumi.StringPtrInput
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
//	CloudBackupSnapshotRestoreJobArray{ CloudBackupSnapshotRestoreJobArgs{...} }
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
//	CloudBackupSnapshotRestoreJobMap{ "key": CloudBackupSnapshotRestoreJobArgs{...} }
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

// Indicates whether the restore job was canceled.
func (o CloudBackupSnapshotRestoreJobOutput) Cancelled() pulumi.BoolOutput {
	return o.ApplyT(func(v *CloudBackupSnapshotRestoreJob) pulumi.BoolOutput { return v.Cancelled }).(pulumi.BoolOutput)
}

// The name of the Atlas cluster whose snapshot you want to restore.
func (o CloudBackupSnapshotRestoreJobOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshotRestoreJob) pulumi.StringOutput { return v.ClusterName }).(pulumi.StringOutput)
}

// Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in `true`.
// * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
// * `delivery_type_config.download` - Set to `true` to use the download configuration.
// * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplogTs` and `oplogInc`, or `pointInTimeUtcSeconds`.
// * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
// * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
// * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
// * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplogTs`.
// * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
func (o CloudBackupSnapshotRestoreJobOutput) DeliveryTypeConfig() CloudBackupSnapshotRestoreJobDeliveryTypeConfigPtrOutput {
	return o.ApplyT(func(v *CloudBackupSnapshotRestoreJob) CloudBackupSnapshotRestoreJobDeliveryTypeConfigPtrOutput {
		return v.DeliveryTypeConfig
	}).(CloudBackupSnapshotRestoreJobDeliveryTypeConfigPtrOutput)
}

// One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
func (o CloudBackupSnapshotRestoreJobOutput) DeliveryUrls() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CloudBackupSnapshotRestoreJob) pulumi.StringArrayOutput { return v.DeliveryUrls }).(pulumi.StringArrayOutput)
}

// Indicates whether the restore job expired.
func (o CloudBackupSnapshotRestoreJobOutput) Expired() pulumi.BoolOutput {
	return o.ApplyT(func(v *CloudBackupSnapshotRestoreJob) pulumi.BoolOutput { return v.Expired }).(pulumi.BoolOutput)
}

// UTC ISO 8601 formatted point in time when the restore job expires.
func (o CloudBackupSnapshotRestoreJobOutput) ExpiresAt() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshotRestoreJob) pulumi.StringOutput { return v.ExpiresAt }).(pulumi.StringOutput)
}

// UTC ISO 8601 formatted point in time when the restore job completed.
func (o CloudBackupSnapshotRestoreJobOutput) FinishedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshotRestoreJob) pulumi.StringOutput { return v.FinishedAt }).(pulumi.StringOutput)
}

// The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
func (o CloudBackupSnapshotRestoreJobOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshotRestoreJob) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Optional setting for **pointInTime** configuration. Unique identifier of the snapshot to restore.
func (o CloudBackupSnapshotRestoreJobOutput) SnapshotId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CloudBackupSnapshotRestoreJob) pulumi.StringPtrOutput { return v.SnapshotId }).(pulumi.StringPtrOutput)
}

// The unique identifier of the restore job.
func (o CloudBackupSnapshotRestoreJobOutput) SnapshotRestoreJobId() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshotRestoreJob) pulumi.StringOutput { return v.SnapshotRestoreJobId }).(pulumi.StringOutput)
}

// Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
//   - `oplogTs` - Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot.
//     Three conditions apply to this parameter:
//   - Enable Continuous Cloud Backup on your cluster.
//   - Specify oplogInc.
//   - Specify either oplogTs and oplogInc or pointInTimeUTCSeconds, but not both.
//   - `oplogInc` - Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp.
//     Three conditions apply to this parameter:
//   - Enable Continuous Cloud Backup on your cluster.
//   - Specify oplogTs.
//   - Specify either oplogTs and oplogInc or pointInTimeUTCSeconds, but not both.
//   - `pointInTimeUTCSeconds` - Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot.
//     Two conditions apply to this parameter:
//   - Enable Continuous Cloud Backup on your cluster.
//   - Specify either pointInTimeUTCSeconds or oplogTs and oplogInc, but not both.
func (o CloudBackupSnapshotRestoreJobOutput) Timestamp() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshotRestoreJob) pulumi.StringOutput { return v.Timestamp }).(pulumi.StringOutput)
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
