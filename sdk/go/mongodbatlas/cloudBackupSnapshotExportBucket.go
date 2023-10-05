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

// `CloudBackupSnapshotExportBucket` resource allows you to create an export snapshot bucket for the specified project.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
//
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
//			_, err := mongodbatlas.NewCloudBackupSnapshotExportBucket(ctx, "test", &mongodbatlas.CloudBackupSnapshotExportBucketArgs{
//				BucketName:    pulumi.String("example-bucket"),
//				CloudProvider: pulumi.String("AWS"),
//				IamRoleId:     pulumi.String("{IAM_ROLE_ID}"),
//				ProjectId:     pulumi.String("{PROJECT_ID}"),
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
// ## Import
//
// Cloud Backup Snapshot Export Backup entries can be imported using project project_id, and bucket_id (Unique identifier of the snapshot export bucket), in the format `PROJECTID-BUCKETID`, e.g.
//
// ```sh
//
//	$ pulumi import mongodbatlas:index/cloudBackupSnapshotExportBucket:CloudBackupSnapshotExportBucket test 5d0f1f73cf09a29120e173cf-5d116d82014b764445b2f9b5
//
// ```
//
//	For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/export/create-one-export-bucket/)
type CloudBackupSnapshotExportBucket struct {
	pulumi.CustomResourceState

	// Name of the bucket that the provided role ID is authorized to access. You must also specify the `iamRoleId`.
	BucketName pulumi.StringOutput `pulumi:"bucketName"`
	// Name of the provider of the cloud service where Atlas can access the S3 bucket. Atlas only supports `AWS`.
	CloudProvider pulumi.StringOutput `pulumi:"cloudProvider"`
	// Unique identifier of the snapshot export bucket.
	ExportBucketId pulumi.StringOutput `pulumi:"exportBucketId"`
	// Unique identifier of the role that Atlas can use to access the bucket. You must also specify the `bucketName`.
	IamRoleId pulumi.StringOutput `pulumi:"iamRoleId"`
	// The unique identifier of the project for the Atlas cluster.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
}

// NewCloudBackupSnapshotExportBucket registers a new resource with the given unique name, arguments, and options.
func NewCloudBackupSnapshotExportBucket(ctx *pulumi.Context,
	name string, args *CloudBackupSnapshotExportBucketArgs, opts ...pulumi.ResourceOption) (*CloudBackupSnapshotExportBucket, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BucketName == nil {
		return nil, errors.New("invalid value for required argument 'BucketName'")
	}
	if args.CloudProvider == nil {
		return nil, errors.New("invalid value for required argument 'CloudProvider'")
	}
	if args.IamRoleId == nil {
		return nil, errors.New("invalid value for required argument 'IamRoleId'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CloudBackupSnapshotExportBucket
	err := ctx.RegisterResource("mongodbatlas:index/cloudBackupSnapshotExportBucket:CloudBackupSnapshotExportBucket", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCloudBackupSnapshotExportBucket gets an existing CloudBackupSnapshotExportBucket resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCloudBackupSnapshotExportBucket(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CloudBackupSnapshotExportBucketState, opts ...pulumi.ResourceOption) (*CloudBackupSnapshotExportBucket, error) {
	var resource CloudBackupSnapshotExportBucket
	err := ctx.ReadResource("mongodbatlas:index/cloudBackupSnapshotExportBucket:CloudBackupSnapshotExportBucket", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CloudBackupSnapshotExportBucket resources.
type cloudBackupSnapshotExportBucketState struct {
	// Name of the bucket that the provided role ID is authorized to access. You must also specify the `iamRoleId`.
	BucketName *string `pulumi:"bucketName"`
	// Name of the provider of the cloud service where Atlas can access the S3 bucket. Atlas only supports `AWS`.
	CloudProvider *string `pulumi:"cloudProvider"`
	// Unique identifier of the snapshot export bucket.
	ExportBucketId *string `pulumi:"exportBucketId"`
	// Unique identifier of the role that Atlas can use to access the bucket. You must also specify the `bucketName`.
	IamRoleId *string `pulumi:"iamRoleId"`
	// The unique identifier of the project for the Atlas cluster.
	ProjectId *string `pulumi:"projectId"`
}

type CloudBackupSnapshotExportBucketState struct {
	// Name of the bucket that the provided role ID is authorized to access. You must also specify the `iamRoleId`.
	BucketName pulumi.StringPtrInput
	// Name of the provider of the cloud service where Atlas can access the S3 bucket. Atlas only supports `AWS`.
	CloudProvider pulumi.StringPtrInput
	// Unique identifier of the snapshot export bucket.
	ExportBucketId pulumi.StringPtrInput
	// Unique identifier of the role that Atlas can use to access the bucket. You must also specify the `bucketName`.
	IamRoleId pulumi.StringPtrInput
	// The unique identifier of the project for the Atlas cluster.
	ProjectId pulumi.StringPtrInput
}

func (CloudBackupSnapshotExportBucketState) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudBackupSnapshotExportBucketState)(nil)).Elem()
}

type cloudBackupSnapshotExportBucketArgs struct {
	// Name of the bucket that the provided role ID is authorized to access. You must also specify the `iamRoleId`.
	BucketName string `pulumi:"bucketName"`
	// Name of the provider of the cloud service where Atlas can access the S3 bucket. Atlas only supports `AWS`.
	CloudProvider string `pulumi:"cloudProvider"`
	// Unique identifier of the role that Atlas can use to access the bucket. You must also specify the `bucketName`.
	IamRoleId string `pulumi:"iamRoleId"`
	// The unique identifier of the project for the Atlas cluster.
	ProjectId string `pulumi:"projectId"`
}

// The set of arguments for constructing a CloudBackupSnapshotExportBucket resource.
type CloudBackupSnapshotExportBucketArgs struct {
	// Name of the bucket that the provided role ID is authorized to access. You must also specify the `iamRoleId`.
	BucketName pulumi.StringInput
	// Name of the provider of the cloud service where Atlas can access the S3 bucket. Atlas only supports `AWS`.
	CloudProvider pulumi.StringInput
	// Unique identifier of the role that Atlas can use to access the bucket. You must also specify the `bucketName`.
	IamRoleId pulumi.StringInput
	// The unique identifier of the project for the Atlas cluster.
	ProjectId pulumi.StringInput
}

func (CloudBackupSnapshotExportBucketArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudBackupSnapshotExportBucketArgs)(nil)).Elem()
}

type CloudBackupSnapshotExportBucketInput interface {
	pulumi.Input

	ToCloudBackupSnapshotExportBucketOutput() CloudBackupSnapshotExportBucketOutput
	ToCloudBackupSnapshotExportBucketOutputWithContext(ctx context.Context) CloudBackupSnapshotExportBucketOutput
}

func (*CloudBackupSnapshotExportBucket) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudBackupSnapshotExportBucket)(nil)).Elem()
}

func (i *CloudBackupSnapshotExportBucket) ToCloudBackupSnapshotExportBucketOutput() CloudBackupSnapshotExportBucketOutput {
	return i.ToCloudBackupSnapshotExportBucketOutputWithContext(context.Background())
}

func (i *CloudBackupSnapshotExportBucket) ToCloudBackupSnapshotExportBucketOutputWithContext(ctx context.Context) CloudBackupSnapshotExportBucketOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudBackupSnapshotExportBucketOutput)
}

func (i *CloudBackupSnapshotExportBucket) ToOutput(ctx context.Context) pulumix.Output[*CloudBackupSnapshotExportBucket] {
	return pulumix.Output[*CloudBackupSnapshotExportBucket]{
		OutputState: i.ToCloudBackupSnapshotExportBucketOutputWithContext(ctx).OutputState,
	}
}

// CloudBackupSnapshotExportBucketArrayInput is an input type that accepts CloudBackupSnapshotExportBucketArray and CloudBackupSnapshotExportBucketArrayOutput values.
// You can construct a concrete instance of `CloudBackupSnapshotExportBucketArrayInput` via:
//
//	CloudBackupSnapshotExportBucketArray{ CloudBackupSnapshotExportBucketArgs{...} }
type CloudBackupSnapshotExportBucketArrayInput interface {
	pulumi.Input

	ToCloudBackupSnapshotExportBucketArrayOutput() CloudBackupSnapshotExportBucketArrayOutput
	ToCloudBackupSnapshotExportBucketArrayOutputWithContext(context.Context) CloudBackupSnapshotExportBucketArrayOutput
}

type CloudBackupSnapshotExportBucketArray []CloudBackupSnapshotExportBucketInput

func (CloudBackupSnapshotExportBucketArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudBackupSnapshotExportBucket)(nil)).Elem()
}

func (i CloudBackupSnapshotExportBucketArray) ToCloudBackupSnapshotExportBucketArrayOutput() CloudBackupSnapshotExportBucketArrayOutput {
	return i.ToCloudBackupSnapshotExportBucketArrayOutputWithContext(context.Background())
}

func (i CloudBackupSnapshotExportBucketArray) ToCloudBackupSnapshotExportBucketArrayOutputWithContext(ctx context.Context) CloudBackupSnapshotExportBucketArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudBackupSnapshotExportBucketArrayOutput)
}

func (i CloudBackupSnapshotExportBucketArray) ToOutput(ctx context.Context) pulumix.Output[[]*CloudBackupSnapshotExportBucket] {
	return pulumix.Output[[]*CloudBackupSnapshotExportBucket]{
		OutputState: i.ToCloudBackupSnapshotExportBucketArrayOutputWithContext(ctx).OutputState,
	}
}

// CloudBackupSnapshotExportBucketMapInput is an input type that accepts CloudBackupSnapshotExportBucketMap and CloudBackupSnapshotExportBucketMapOutput values.
// You can construct a concrete instance of `CloudBackupSnapshotExportBucketMapInput` via:
//
//	CloudBackupSnapshotExportBucketMap{ "key": CloudBackupSnapshotExportBucketArgs{...} }
type CloudBackupSnapshotExportBucketMapInput interface {
	pulumi.Input

	ToCloudBackupSnapshotExportBucketMapOutput() CloudBackupSnapshotExportBucketMapOutput
	ToCloudBackupSnapshotExportBucketMapOutputWithContext(context.Context) CloudBackupSnapshotExportBucketMapOutput
}

type CloudBackupSnapshotExportBucketMap map[string]CloudBackupSnapshotExportBucketInput

func (CloudBackupSnapshotExportBucketMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudBackupSnapshotExportBucket)(nil)).Elem()
}

func (i CloudBackupSnapshotExportBucketMap) ToCloudBackupSnapshotExportBucketMapOutput() CloudBackupSnapshotExportBucketMapOutput {
	return i.ToCloudBackupSnapshotExportBucketMapOutputWithContext(context.Background())
}

func (i CloudBackupSnapshotExportBucketMap) ToCloudBackupSnapshotExportBucketMapOutputWithContext(ctx context.Context) CloudBackupSnapshotExportBucketMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudBackupSnapshotExportBucketMapOutput)
}

func (i CloudBackupSnapshotExportBucketMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*CloudBackupSnapshotExportBucket] {
	return pulumix.Output[map[string]*CloudBackupSnapshotExportBucket]{
		OutputState: i.ToCloudBackupSnapshotExportBucketMapOutputWithContext(ctx).OutputState,
	}
}

type CloudBackupSnapshotExportBucketOutput struct{ *pulumi.OutputState }

func (CloudBackupSnapshotExportBucketOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudBackupSnapshotExportBucket)(nil)).Elem()
}

func (o CloudBackupSnapshotExportBucketOutput) ToCloudBackupSnapshotExportBucketOutput() CloudBackupSnapshotExportBucketOutput {
	return o
}

func (o CloudBackupSnapshotExportBucketOutput) ToCloudBackupSnapshotExportBucketOutputWithContext(ctx context.Context) CloudBackupSnapshotExportBucketOutput {
	return o
}

func (o CloudBackupSnapshotExportBucketOutput) ToOutput(ctx context.Context) pulumix.Output[*CloudBackupSnapshotExportBucket] {
	return pulumix.Output[*CloudBackupSnapshotExportBucket]{
		OutputState: o.OutputState,
	}
}

// Name of the bucket that the provided role ID is authorized to access. You must also specify the `iamRoleId`.
func (o CloudBackupSnapshotExportBucketOutput) BucketName() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshotExportBucket) pulumi.StringOutput { return v.BucketName }).(pulumi.StringOutput)
}

// Name of the provider of the cloud service where Atlas can access the S3 bucket. Atlas only supports `AWS`.
func (o CloudBackupSnapshotExportBucketOutput) CloudProvider() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshotExportBucket) pulumi.StringOutput { return v.CloudProvider }).(pulumi.StringOutput)
}

// Unique identifier of the snapshot export bucket.
func (o CloudBackupSnapshotExportBucketOutput) ExportBucketId() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshotExportBucket) pulumi.StringOutput { return v.ExportBucketId }).(pulumi.StringOutput)
}

// Unique identifier of the role that Atlas can use to access the bucket. You must also specify the `bucketName`.
func (o CloudBackupSnapshotExportBucketOutput) IamRoleId() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshotExportBucket) pulumi.StringOutput { return v.IamRoleId }).(pulumi.StringOutput)
}

// The unique identifier of the project for the Atlas cluster.
func (o CloudBackupSnapshotExportBucketOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudBackupSnapshotExportBucket) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

type CloudBackupSnapshotExportBucketArrayOutput struct{ *pulumi.OutputState }

func (CloudBackupSnapshotExportBucketArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudBackupSnapshotExportBucket)(nil)).Elem()
}

func (o CloudBackupSnapshotExportBucketArrayOutput) ToCloudBackupSnapshotExportBucketArrayOutput() CloudBackupSnapshotExportBucketArrayOutput {
	return o
}

func (o CloudBackupSnapshotExportBucketArrayOutput) ToCloudBackupSnapshotExportBucketArrayOutputWithContext(ctx context.Context) CloudBackupSnapshotExportBucketArrayOutput {
	return o
}

func (o CloudBackupSnapshotExportBucketArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*CloudBackupSnapshotExportBucket] {
	return pulumix.Output[[]*CloudBackupSnapshotExportBucket]{
		OutputState: o.OutputState,
	}
}

func (o CloudBackupSnapshotExportBucketArrayOutput) Index(i pulumi.IntInput) CloudBackupSnapshotExportBucketOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CloudBackupSnapshotExportBucket {
		return vs[0].([]*CloudBackupSnapshotExportBucket)[vs[1].(int)]
	}).(CloudBackupSnapshotExportBucketOutput)
}

type CloudBackupSnapshotExportBucketMapOutput struct{ *pulumi.OutputState }

func (CloudBackupSnapshotExportBucketMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudBackupSnapshotExportBucket)(nil)).Elem()
}

func (o CloudBackupSnapshotExportBucketMapOutput) ToCloudBackupSnapshotExportBucketMapOutput() CloudBackupSnapshotExportBucketMapOutput {
	return o
}

func (o CloudBackupSnapshotExportBucketMapOutput) ToCloudBackupSnapshotExportBucketMapOutputWithContext(ctx context.Context) CloudBackupSnapshotExportBucketMapOutput {
	return o
}

func (o CloudBackupSnapshotExportBucketMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*CloudBackupSnapshotExportBucket] {
	return pulumix.Output[map[string]*CloudBackupSnapshotExportBucket]{
		OutputState: o.OutputState,
	}
}

func (o CloudBackupSnapshotExportBucketMapOutput) MapIndex(k pulumi.StringInput) CloudBackupSnapshotExportBucketOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CloudBackupSnapshotExportBucket {
		return vs[0].(map[string]*CloudBackupSnapshotExportBucket)[vs[1].(string)]
	}).(CloudBackupSnapshotExportBucketOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CloudBackupSnapshotExportBucketInput)(nil)).Elem(), &CloudBackupSnapshotExportBucket{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudBackupSnapshotExportBucketArrayInput)(nil)).Elem(), CloudBackupSnapshotExportBucketArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudBackupSnapshotExportBucketMapInput)(nil)).Elem(), CloudBackupSnapshotExportBucketMap{})
	pulumi.RegisterOutputType(CloudBackupSnapshotExportBucketOutput{})
	pulumi.RegisterOutputType(CloudBackupSnapshotExportBucketArrayOutput{})
	pulumi.RegisterOutputType(CloudBackupSnapshotExportBucketMapOutput{})
}
