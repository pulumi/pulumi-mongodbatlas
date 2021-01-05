// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// ## Import
//
// Cloud Backup Snapshot Policy entries can be imported using project project_id and cluster_name, in the format `PROJECTID-CLUSTERNAME`, e.g.
//
// ```sh
//  $ pulumi import mongodbatlas:index/cloudProviderSnapshotBackupPolicy:CloudProviderSnapshotBackupPolicy test 5d0f1f73cf09a29120e173cf-MyClusterTest
// ```
//
//  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/schedule/modify-one-schedule/)
type CloudProviderSnapshotBackupPolicy struct {
	pulumi.CustomResourceState

	// Unique identifier of the Atlas cluster.
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
	ClusterName pulumi.StringOutput `pulumi:"clusterName"`
	// Timestamp in the number of seconds that have elapsed since the UNIX epoch when Atlas takes the next snapshot.
	NextSnapshot pulumi.StringOutput `pulumi:"nextSnapshot"`
	// Contains a document for each backup policy item in the desired updated backup policy.
	// * `policies.#.id` - (Required) Unique identifier of the backup policy that you want to update. policies.#.id is a value obtained via the Cluster resource. providerBackupEnabled of the Cluster resource must be set to true. See the example above for how to refer to the Cluster resource for policies.#.id
	Policies CloudProviderSnapshotBackupPolicyPolicyArrayOutput `pulumi:"policies"`
	// The unique identifier of the project for the Atlas cluster.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
	ReferenceHourOfDay pulumi.IntOutput `pulumi:"referenceHourOfDay"`
	// UTC Minutes after referenceHourOfDay that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
	ReferenceMinuteOfHour pulumi.IntOutput `pulumi:"referenceMinuteOfHour"`
	// Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
	RestoreWindowDays pulumi.IntOutput `pulumi:"restoreWindowDays"`
	// Specify true to apply the retention changes in the updated backup policy to snapshots that Atlas took previously.
	UpdateSnapshots pulumi.BoolOutput `pulumi:"updateSnapshots"`
}

// NewCloudProviderSnapshotBackupPolicy registers a new resource with the given unique name, arguments, and options.
func NewCloudProviderSnapshotBackupPolicy(ctx *pulumi.Context,
	name string, args *CloudProviderSnapshotBackupPolicyArgs, opts ...pulumi.ResourceOption) (*CloudProviderSnapshotBackupPolicy, error) {
	if args == nil || args.ClusterName == nil {
		return nil, errors.New("missing required argument 'ClusterName'")
	}
	if args == nil || args.Policies == nil {
		return nil, errors.New("missing required argument 'Policies'")
	}
	if args == nil || args.ProjectId == nil {
		return nil, errors.New("missing required argument 'ProjectId'")
	}
	if args == nil {
		args = &CloudProviderSnapshotBackupPolicyArgs{}
	}
	var resource CloudProviderSnapshotBackupPolicy
	err := ctx.RegisterResource("mongodbatlas:index/cloudProviderSnapshotBackupPolicy:CloudProviderSnapshotBackupPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCloudProviderSnapshotBackupPolicy gets an existing CloudProviderSnapshotBackupPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCloudProviderSnapshotBackupPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CloudProviderSnapshotBackupPolicyState, opts ...pulumi.ResourceOption) (*CloudProviderSnapshotBackupPolicy, error) {
	var resource CloudProviderSnapshotBackupPolicy
	err := ctx.ReadResource("mongodbatlas:index/cloudProviderSnapshotBackupPolicy:CloudProviderSnapshotBackupPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CloudProviderSnapshotBackupPolicy resources.
type cloudProviderSnapshotBackupPolicyState struct {
	// Unique identifier of the Atlas cluster.
	ClusterId *string `pulumi:"clusterId"`
	// The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
	ClusterName *string `pulumi:"clusterName"`
	// Timestamp in the number of seconds that have elapsed since the UNIX epoch when Atlas takes the next snapshot.
	NextSnapshot *string `pulumi:"nextSnapshot"`
	// Contains a document for each backup policy item in the desired updated backup policy.
	// * `policies.#.id` - (Required) Unique identifier of the backup policy that you want to update. policies.#.id is a value obtained via the Cluster resource. providerBackupEnabled of the Cluster resource must be set to true. See the example above for how to refer to the Cluster resource for policies.#.id
	Policies []CloudProviderSnapshotBackupPolicyPolicy `pulumi:"policies"`
	// The unique identifier of the project for the Atlas cluster.
	ProjectId *string `pulumi:"projectId"`
	// UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
	ReferenceHourOfDay *int `pulumi:"referenceHourOfDay"`
	// UTC Minutes after referenceHourOfDay that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
	ReferenceMinuteOfHour *int `pulumi:"referenceMinuteOfHour"`
	// Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
	RestoreWindowDays *int `pulumi:"restoreWindowDays"`
	// Specify true to apply the retention changes in the updated backup policy to snapshots that Atlas took previously.
	UpdateSnapshots *bool `pulumi:"updateSnapshots"`
}

type CloudProviderSnapshotBackupPolicyState struct {
	// Unique identifier of the Atlas cluster.
	ClusterId pulumi.StringPtrInput
	// The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
	ClusterName pulumi.StringPtrInput
	// Timestamp in the number of seconds that have elapsed since the UNIX epoch when Atlas takes the next snapshot.
	NextSnapshot pulumi.StringPtrInput
	// Contains a document for each backup policy item in the desired updated backup policy.
	// * `policies.#.id` - (Required) Unique identifier of the backup policy that you want to update. policies.#.id is a value obtained via the Cluster resource. providerBackupEnabled of the Cluster resource must be set to true. See the example above for how to refer to the Cluster resource for policies.#.id
	Policies CloudProviderSnapshotBackupPolicyPolicyArrayInput
	// The unique identifier of the project for the Atlas cluster.
	ProjectId pulumi.StringPtrInput
	// UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
	ReferenceHourOfDay pulumi.IntPtrInput
	// UTC Minutes after referenceHourOfDay that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
	ReferenceMinuteOfHour pulumi.IntPtrInput
	// Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
	RestoreWindowDays pulumi.IntPtrInput
	// Specify true to apply the retention changes in the updated backup policy to snapshots that Atlas took previously.
	UpdateSnapshots pulumi.BoolPtrInput
}

func (CloudProviderSnapshotBackupPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudProviderSnapshotBackupPolicyState)(nil)).Elem()
}

type cloudProviderSnapshotBackupPolicyArgs struct {
	// The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
	ClusterName string `pulumi:"clusterName"`
	// Contains a document for each backup policy item in the desired updated backup policy.
	// * `policies.#.id` - (Required) Unique identifier of the backup policy that you want to update. policies.#.id is a value obtained via the Cluster resource. providerBackupEnabled of the Cluster resource must be set to true. See the example above for how to refer to the Cluster resource for policies.#.id
	Policies []CloudProviderSnapshotBackupPolicyPolicy `pulumi:"policies"`
	// The unique identifier of the project for the Atlas cluster.
	ProjectId string `pulumi:"projectId"`
	// UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
	ReferenceHourOfDay *int `pulumi:"referenceHourOfDay"`
	// UTC Minutes after referenceHourOfDay that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
	ReferenceMinuteOfHour *int `pulumi:"referenceMinuteOfHour"`
	// Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
	RestoreWindowDays *int `pulumi:"restoreWindowDays"`
	// Specify true to apply the retention changes in the updated backup policy to snapshots that Atlas took previously.
	UpdateSnapshots *bool `pulumi:"updateSnapshots"`
}

// The set of arguments for constructing a CloudProviderSnapshotBackupPolicy resource.
type CloudProviderSnapshotBackupPolicyArgs struct {
	// The name of the Atlas cluster that contains the snapshot backup policy you want to retrieve.
	ClusterName pulumi.StringInput
	// Contains a document for each backup policy item in the desired updated backup policy.
	// * `policies.#.id` - (Required) Unique identifier of the backup policy that you want to update. policies.#.id is a value obtained via the Cluster resource. providerBackupEnabled of the Cluster resource must be set to true. See the example above for how to refer to the Cluster resource for policies.#.id
	Policies CloudProviderSnapshotBackupPolicyPolicyArrayInput
	// The unique identifier of the project for the Atlas cluster.
	ProjectId pulumi.StringInput
	// UTC Hour of day between 0 and 23, inclusive, representing which hour of the day that Atlas takes snapshots for backup policy items.
	ReferenceHourOfDay pulumi.IntPtrInput
	// UTC Minutes after referenceHourOfDay that Atlas takes snapshots for backup policy items. Must be between 0 and 59, inclusive.
	ReferenceMinuteOfHour pulumi.IntPtrInput
	// Number of days back in time you can restore to with point-in-time accuracy. Must be a positive, non-zero integer.
	RestoreWindowDays pulumi.IntPtrInput
	// Specify true to apply the retention changes in the updated backup policy to snapshots that Atlas took previously.
	UpdateSnapshots pulumi.BoolPtrInput
}

func (CloudProviderSnapshotBackupPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudProviderSnapshotBackupPolicyArgs)(nil)).Elem()
}

type CloudProviderSnapshotBackupPolicyInput interface {
	pulumi.Input

	ToCloudProviderSnapshotBackupPolicyOutput() CloudProviderSnapshotBackupPolicyOutput
	ToCloudProviderSnapshotBackupPolicyOutputWithContext(ctx context.Context) CloudProviderSnapshotBackupPolicyOutput
}

func (CloudProviderSnapshotBackupPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((*CloudProviderSnapshotBackupPolicy)(nil)).Elem()
}

func (i CloudProviderSnapshotBackupPolicy) ToCloudProviderSnapshotBackupPolicyOutput() CloudProviderSnapshotBackupPolicyOutput {
	return i.ToCloudProviderSnapshotBackupPolicyOutputWithContext(context.Background())
}

func (i CloudProviderSnapshotBackupPolicy) ToCloudProviderSnapshotBackupPolicyOutputWithContext(ctx context.Context) CloudProviderSnapshotBackupPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudProviderSnapshotBackupPolicyOutput)
}

type CloudProviderSnapshotBackupPolicyOutput struct {
	*pulumi.OutputState
}

func (CloudProviderSnapshotBackupPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*CloudProviderSnapshotBackupPolicyOutput)(nil)).Elem()
}

func (o CloudProviderSnapshotBackupPolicyOutput) ToCloudProviderSnapshotBackupPolicyOutput() CloudProviderSnapshotBackupPolicyOutput {
	return o
}

func (o CloudProviderSnapshotBackupPolicyOutput) ToCloudProviderSnapshotBackupPolicyOutputWithContext(ctx context.Context) CloudProviderSnapshotBackupPolicyOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(CloudProviderSnapshotBackupPolicyOutput{})
}
