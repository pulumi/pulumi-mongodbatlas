// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// `CloudBackupSnapshot` provides a resource to take a cloud backup snapshot on demand.
// On-demand snapshots happen immediately, unlike scheduled snapshots which occur at regular intervals. If there is already an on-demand snapshot with a status of queued or inProgress, you must wait until Atlas has completed the on-demand snapshot before taking another.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
//
// > **NOTE:** If Backup Compliance Policy is enabled for the project for which this backup schedule is defined, you cannot delete a backup snapshot or decrease the retention time for a snapshot after it's taken.  See [Backup Compliance Policy Prohibited Actions and Considerations](https://www.mongodb.com/docs/atlas/backup/cloud-backup/backup-compliance-policy/#configure-a-backup-compliance-policy).
//
// ## Import
//
// Cloud Backup Snapshot entries can be imported using project project_id, cluster_name and snapshot_id (Unique identifier of the snapshot), in the format `PROJECTID-CLUSTERNAME-SNAPSHOTID`, e.g.
//
// ```sh
//
//	$ pulumi import mongodbatlas:index/cloudBackupSnapshot:CloudBackupSnapshot test 5d0f1f73cf09a29120e173cf-MyClusterTest-5d116d82014b764445b2f9b5
//
// ```
//
//	For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/backup/backups/)
type CloudBackupSnapshot struct {
	pulumi.CustomResourceState

	// Cloud provider that stores this snapshot.
	CloudProvider pulumi.StringOutput `pulumi:"cloudProvider"`
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
	// Block of List of snapshots and the cloud provider where the snapshots are stored. Atlas returns this parameter when `type` is `shardedCluster`. See below
	Members CloudBackupSnapshotMemberArrayOutput `pulumi:"members"`
	// Version of the MongoDB server.
	MongodVersion pulumi.StringOutput `pulumi:"mongodVersion"`
	// The unique identifier of the project for the Atlas cluster.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Label given to a shard or config server from which Atlas took this snapshot.
	ReplicaSetName pulumi.StringOutput `pulumi:"replicaSetName"`
	// The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
	RetentionInDays pulumi.IntOutput `pulumi:"retentionInDays"`
	// Unique identifier of the snapshot.
	SnapshotId pulumi.StringOutput `pulumi:"snapshotId"`
	// Unique identifiers of the snapshots created for the shards and config server for a sharded cluster. Atlas returns this parameter when `type` is `shardedCluster`. These identifiers should match those given in the `members[n].id` parameters. This allows you to map a snapshot to its shard or config server name.
	SnapshotIds pulumi.StringArrayOutput `pulumi:"snapshotIds"`
	// Specified the type of snapshot. Valid values are onDemand and scheduled.
	SnapshotType pulumi.StringOutput `pulumi:"snapshotType"`
	// Current status of the snapshot. One of the following values will be returned: queued, inProgress, completed, failed.
	Status pulumi.StringOutput `pulumi:"status"`
	// Specifies the size of the snapshot in bytes.
	StorageSizeBytes pulumi.IntOutput `pulumi:"storageSizeBytes"`
	// Specifies the type of cluster: replicaSet or shardedCluster.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewCloudBackupSnapshot registers a new resource with the given unique name, arguments, and options.
func NewCloudBackupSnapshot(ctx *pulumi.Context,
	name string, args *CloudBackupSnapshotArgs, opts ...pulumi.ResourceOption) (*CloudBackupSnapshot, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterName == nil {
		return nil, errors.New("invalid value for required argument 'ClusterName'")
	}
	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.RetentionInDays == nil {
		return nil, errors.New("invalid value for required argument 'RetentionInDays'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CloudBackupSnapshot
	err := ctx.RegisterResource("mongodbatlas:index/cloudBackupSnapshot:CloudBackupSnapshot", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCloudBackupSnapshot gets an existing CloudBackupSnapshot resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCloudBackupSnapshot(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CloudBackupSnapshotState, opts ...pulumi.ResourceOption) (*CloudBackupSnapshot, error) {
	var resource CloudBackupSnapshot
	err := ctx.ReadResource("mongodbatlas:index/cloudBackupSnapshot:CloudBackupSnapshot", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CloudBackupSnapshot resources.
type cloudBackupSnapshotState struct {
	// Cloud provider that stores this snapshot.
	CloudProvider *string `pulumi:"cloudProvider"`
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
	// Block of List of snapshots and the cloud provider where the snapshots are stored. Atlas returns this parameter when `type` is `shardedCluster`. See below
	Members []CloudBackupSnapshotMember `pulumi:"members"`
	// Version of the MongoDB server.
	MongodVersion *string `pulumi:"mongodVersion"`
	// The unique identifier of the project for the Atlas cluster.
	ProjectId *string `pulumi:"projectId"`
	// Label given to a shard or config server from which Atlas took this snapshot.
	ReplicaSetName *string `pulumi:"replicaSetName"`
	// The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
	RetentionInDays *int `pulumi:"retentionInDays"`
	// Unique identifier of the snapshot.
	SnapshotId *string `pulumi:"snapshotId"`
	// Unique identifiers of the snapshots created for the shards and config server for a sharded cluster. Atlas returns this parameter when `type` is `shardedCluster`. These identifiers should match those given in the `members[n].id` parameters. This allows you to map a snapshot to its shard or config server name.
	SnapshotIds []string `pulumi:"snapshotIds"`
	// Specified the type of snapshot. Valid values are onDemand and scheduled.
	SnapshotType *string `pulumi:"snapshotType"`
	// Current status of the snapshot. One of the following values will be returned: queued, inProgress, completed, failed.
	Status *string `pulumi:"status"`
	// Specifies the size of the snapshot in bytes.
	StorageSizeBytes *int `pulumi:"storageSizeBytes"`
	// Specifies the type of cluster: replicaSet or shardedCluster.
	Type *string `pulumi:"type"`
}

type CloudBackupSnapshotState struct {
	// Cloud provider that stores this snapshot.
	CloudProvider pulumi.StringPtrInput
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
	// Block of List of snapshots and the cloud provider where the snapshots are stored. Atlas returns this parameter when `type` is `shardedCluster`. See below
	Members CloudBackupSnapshotMemberArrayInput
	// Version of the MongoDB server.
	MongodVersion pulumi.StringPtrInput
	// The unique identifier of the project for the Atlas cluster.
	ProjectId pulumi.StringPtrInput
	// Label given to a shard or config server from which Atlas took this snapshot.
	ReplicaSetName pulumi.StringPtrInput
	// The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
	RetentionInDays pulumi.IntPtrInput
	// Unique identifier of the snapshot.
	SnapshotId pulumi.StringPtrInput
	// Unique identifiers of the snapshots created for the shards and config server for a sharded cluster. Atlas returns this parameter when `type` is `shardedCluster`. These identifiers should match those given in the `members[n].id` parameters. This allows you to map a snapshot to its shard or config server name.
	SnapshotIds pulumi.StringArrayInput
	// Specified the type of snapshot. Valid values are onDemand and scheduled.
	SnapshotType pulumi.StringPtrInput
	// Current status of the snapshot. One of the following values will be returned: queued, inProgress, completed, failed.
	Status pulumi.StringPtrInput
	// Specifies the size of the snapshot in bytes.
	StorageSizeBytes pulumi.IntPtrInput
	// Specifies the type of cluster: replicaSet or shardedCluster.
	Type pulumi.StringPtrInput
}

func (CloudBackupSnapshotState) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudBackupSnapshotState)(nil)).Elem()
}

type cloudBackupSnapshotArgs struct {
	// The name of the Atlas cluster that contains the snapshots you want to retrieve.
	ClusterName string `pulumi:"clusterName"`
	// Description of the on-demand snapshot.
	Description string `pulumi:"description"`
	// The unique identifier of the project for the Atlas cluster.
	ProjectId string `pulumi:"projectId"`
	// The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
	RetentionInDays int `pulumi:"retentionInDays"`
}

// The set of arguments for constructing a CloudBackupSnapshot resource.
type CloudBackupSnapshotArgs struct {
	// The name of the Atlas cluster that contains the snapshots you want to retrieve.
	ClusterName pulumi.StringInput
	// Description of the on-demand snapshot.
	Description pulumi.StringInput
	// The unique identifier of the project for the Atlas cluster.
	ProjectId pulumi.StringInput
	// The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
	RetentionInDays pulumi.IntInput
}

func (CloudBackupSnapshotArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudBackupSnapshotArgs)(nil)).Elem()
}

type CloudBackupSnapshotInput interface {
	pulumi.Input

	ToCloudBackupSnapshotOutput() CloudBackupSnapshotOutput
	ToCloudBackupSnapshotOutputWithContext(ctx context.Context) CloudBackupSnapshotOutput
}

func (*CloudBackupSnapshot) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudBackupSnapshot)(nil)).Elem()
}

func (i *CloudBackupSnapshot) ToCloudBackupSnapshotOutput() CloudBackupSnapshotOutput {
	return i.ToCloudBackupSnapshotOutputWithContext(context.Background())
}

func (i *CloudBackupSnapshot) ToCloudBackupSnapshotOutputWithContext(ctx context.Context) CloudBackupSnapshotOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudBackupSnapshotOutput)
}

func (i *CloudBackupSnapshot) ToOutput(ctx context.Context) pulumix.Output[*CloudBackupSnapshot] {
	return pulumix.Output[*CloudBackupSnapshot]{
		OutputState: i.ToCloudBackupSnapshotOutputWithContext(ctx).OutputState,
	}
}

// CloudBackupSnapshotArrayInput is an input type that accepts CloudBackupSnapshotArray and CloudBackupSnapshotArrayOutput values.
// You can construct a concrete instance of `CloudBackupSnapshotArrayInput` via:
//
//	CloudBackupSnapshotArray{ CloudBackupSnapshotArgs{...} }
type CloudBackupSnapshotArrayInput interface {
	pulumi.Input

	ToCloudBackupSnapshotArrayOutput() CloudBackupSnapshotArrayOutput
	ToCloudBackupSnapshotArrayOutputWithContext(context.Context) CloudBackupSnapshotArrayOutput
}

type CloudBackupSnapshotArray []CloudBackupSnapshotInput

func (CloudBackupSnapshotArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudBackupSnapshot)(nil)).Elem()
}

func (i CloudBackupSnapshotArray) ToCloudBackupSnapshotArrayOutput() CloudBackupSnapshotArrayOutput {
	return i.ToCloudBackupSnapshotArrayOutputWithContext(context.Background())
}

func (i CloudBackupSnapshotArray) ToCloudBackupSnapshotArrayOutputWithContext(ctx context.Context) CloudBackupSnapshotArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudBackupSnapshotArrayOutput)
}

func (i CloudBackupSnapshotArray) ToOutput(ctx context.Context) pulumix.Output[[]*CloudBackupSnapshot] {
	return pulumix.Output[[]*CloudBackupSnapshot]{
		OutputState: i.ToCloudBackupSnapshotArrayOutputWithContext(ctx).OutputState,
	}
}

// CloudBackupSnapshotMapInput is an input type that accepts CloudBackupSnapshotMap and CloudBackupSnapshotMapOutput values.
// You can construct a concrete instance of `CloudBackupSnapshotMapInput` via:
//
//	CloudBackupSnapshotMap{ "key": CloudBackupSnapshotArgs{...} }
type CloudBackupSnapshotMapInput interface {
	pulumi.Input

	ToCloudBackupSnapshotMapOutput() CloudBackupSnapshotMapOutput
	ToCloudBackupSnapshotMapOutputWithContext(context.Context) CloudBackupSnapshotMapOutput
}

type CloudBackupSnapshotMap map[string]CloudBackupSnapshotInput

func (CloudBackupSnapshotMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudBackupSnapshot)(nil)).Elem()
}

func (i CloudBackupSnapshotMap) ToCloudBackupSnapshotMapOutput() CloudBackupSnapshotMapOutput {
	return i.ToCloudBackupSnapshotMapOutputWithContext(context.Background())
}

func (i CloudBackupSnapshotMap) ToCloudBackupSnapshotMapOutputWithContext(ctx context.Context) CloudBackupSnapshotMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudBackupSnapshotMapOutput)
}

func (i CloudBackupSnapshotMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*CloudBackupSnapshot] {
	return pulumix.Output[map[string]*CloudBackupSnapshot]{
		OutputState: i.ToCloudBackupSnapshotMapOutputWithContext(ctx).OutputState,
	}
}

type CloudBackupSnapshotOutput struct{ *pulumi.OutputState }

func (CloudBackupSnapshotOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudBackupSnapshot)(nil)).Elem()
}

func (o CloudBackupSnapshotOutput) ToCloudBackupSnapshotOutput() CloudBackupSnapshotOutput {
	return o
}

func (o CloudBackupSnapshotOutput) ToCloudBackupSnapshotOutputWithContext(ctx context.Context) CloudBackupSnapshotOutput {
	return o
}

func (o CloudBackupSnapshotOutput) ToOutput(ctx context.Context) pulumix.Output[*CloudBackupSnapshot] {
	return pulumix.Output[*CloudBackupSnapshot]{
		OutputState: o.OutputState,
	}
}

// Cloud provider that stores this snapshot.
func (o CloudBackupSnapshotOutput) CloudProvider() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshot) pulumi.StringOutput { return v.CloudProvider }).(pulumi.StringOutput)
}

// The name of the Atlas cluster that contains the snapshots you want to retrieve.
func (o CloudBackupSnapshotOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshot) pulumi.StringOutput { return v.ClusterName }).(pulumi.StringOutput)
}

// UTC ISO 8601 formatted point in time when Atlas took the snapshot.
func (o CloudBackupSnapshotOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshot) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// Description of the on-demand snapshot.
func (o CloudBackupSnapshotOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshot) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
func (o CloudBackupSnapshotOutput) ExpiresAt() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshot) pulumi.StringOutput { return v.ExpiresAt }).(pulumi.StringOutput)
}

// Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
func (o CloudBackupSnapshotOutput) MasterKeyUuid() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshot) pulumi.StringOutput { return v.MasterKeyUuid }).(pulumi.StringOutput)
}

// Block of List of snapshots and the cloud provider where the snapshots are stored. Atlas returns this parameter when `type` is `shardedCluster`. See below
func (o CloudBackupSnapshotOutput) Members() CloudBackupSnapshotMemberArrayOutput {
	return o.ApplyT(func(v *CloudBackupSnapshot) CloudBackupSnapshotMemberArrayOutput { return v.Members }).(CloudBackupSnapshotMemberArrayOutput)
}

// Version of the MongoDB server.
func (o CloudBackupSnapshotOutput) MongodVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshot) pulumi.StringOutput { return v.MongodVersion }).(pulumi.StringOutput)
}

// The unique identifier of the project for the Atlas cluster.
func (o CloudBackupSnapshotOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshot) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Label given to a shard or config server from which Atlas took this snapshot.
func (o CloudBackupSnapshotOutput) ReplicaSetName() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshot) pulumi.StringOutput { return v.ReplicaSetName }).(pulumi.StringOutput)
}

// The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
func (o CloudBackupSnapshotOutput) RetentionInDays() pulumi.IntOutput {
	return o.ApplyT(func(v *CloudBackupSnapshot) pulumi.IntOutput { return v.RetentionInDays }).(pulumi.IntOutput)
}

// Unique identifier of the snapshot.
func (o CloudBackupSnapshotOutput) SnapshotId() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshot) pulumi.StringOutput { return v.SnapshotId }).(pulumi.StringOutput)
}

// Unique identifiers of the snapshots created for the shards and config server for a sharded cluster. Atlas returns this parameter when `type` is `shardedCluster`. These identifiers should match those given in the `members[n].id` parameters. This allows you to map a snapshot to its shard or config server name.
func (o CloudBackupSnapshotOutput) SnapshotIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CloudBackupSnapshot) pulumi.StringArrayOutput { return v.SnapshotIds }).(pulumi.StringArrayOutput)
}

// Specified the type of snapshot. Valid values are onDemand and scheduled.
func (o CloudBackupSnapshotOutput) SnapshotType() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshot) pulumi.StringOutput { return v.SnapshotType }).(pulumi.StringOutput)
}

// Current status of the snapshot. One of the following values will be returned: queued, inProgress, completed, failed.
func (o CloudBackupSnapshotOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshot) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Specifies the size of the snapshot in bytes.
func (o CloudBackupSnapshotOutput) StorageSizeBytes() pulumi.IntOutput {
	return o.ApplyT(func(v *CloudBackupSnapshot) pulumi.IntOutput { return v.StorageSizeBytes }).(pulumi.IntOutput)
}

// Specifies the type of cluster: replicaSet or shardedCluster.
func (o CloudBackupSnapshotOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshot) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type CloudBackupSnapshotArrayOutput struct{ *pulumi.OutputState }

func (CloudBackupSnapshotArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudBackupSnapshot)(nil)).Elem()
}

func (o CloudBackupSnapshotArrayOutput) ToCloudBackupSnapshotArrayOutput() CloudBackupSnapshotArrayOutput {
	return o
}

func (o CloudBackupSnapshotArrayOutput) ToCloudBackupSnapshotArrayOutputWithContext(ctx context.Context) CloudBackupSnapshotArrayOutput {
	return o
}

func (o CloudBackupSnapshotArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*CloudBackupSnapshot] {
	return pulumix.Output[[]*CloudBackupSnapshot]{
		OutputState: o.OutputState,
	}
}

func (o CloudBackupSnapshotArrayOutput) Index(i pulumi.IntInput) CloudBackupSnapshotOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CloudBackupSnapshot {
		return vs[0].([]*CloudBackupSnapshot)[vs[1].(int)]
	}).(CloudBackupSnapshotOutput)
}

type CloudBackupSnapshotMapOutput struct{ *pulumi.OutputState }

func (CloudBackupSnapshotMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudBackupSnapshot)(nil)).Elem()
}

func (o CloudBackupSnapshotMapOutput) ToCloudBackupSnapshotMapOutput() CloudBackupSnapshotMapOutput {
	return o
}

func (o CloudBackupSnapshotMapOutput) ToCloudBackupSnapshotMapOutputWithContext(ctx context.Context) CloudBackupSnapshotMapOutput {
	return o
}

func (o CloudBackupSnapshotMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*CloudBackupSnapshot] {
	return pulumix.Output[map[string]*CloudBackupSnapshot]{
		OutputState: o.OutputState,
	}
}

func (o CloudBackupSnapshotMapOutput) MapIndex(k pulumi.StringInput) CloudBackupSnapshotOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CloudBackupSnapshot {
		return vs[0].(map[string]*CloudBackupSnapshot)[vs[1].(string)]
	}).(CloudBackupSnapshotOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CloudBackupSnapshotInput)(nil)).Elem(), &CloudBackupSnapshot{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudBackupSnapshotArrayInput)(nil)).Elem(), CloudBackupSnapshotArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudBackupSnapshotMapInput)(nil)).Elem(), CloudBackupSnapshotMap{})
	pulumi.RegisterOutputType(CloudBackupSnapshotOutput{})
	pulumi.RegisterOutputType(CloudBackupSnapshotArrayOutput{})
	pulumi.RegisterOutputType(CloudBackupSnapshotMapOutput{})
}
