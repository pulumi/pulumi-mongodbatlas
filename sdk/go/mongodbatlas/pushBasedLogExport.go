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

// ## # Resource: PushBasedLogExport
//
// `PushBasedLogExport` provides a resource for push-based log export feature. The resource lets you configure, enable & disable the project level settings for the push-based log export feature. Using this resource you
// can continually push logs from mongod, mongos, and audit logs to an Amazon S3 bucket. Atlas exports logs every 5 minutes.
//
// ## Example Usage
//
// ### S
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
//			_, err := mongodbatlas.NewProject(ctx, "project-tf", &mongodbatlas.ProjectArgs{
//				Name:  pulumi.Any(atlasProjectName),
//				OrgId: pulumi.Any(atlasOrgId),
//			})
//			if err != nil {
//				return err
//			}
//			// Set up cloud provider access in Atlas using the created IAM role
//			setupOnly, err := mongodbatlas.NewCloudProviderAccessSetup(ctx, "setup_only", &mongodbatlas.CloudProviderAccessSetupArgs{
//				ProjectId:    project_tf.ID(),
//				ProviderName: pulumi.String("AWS"),
//			})
//			if err != nil {
//				return err
//			}
//			authRole, err := mongodbatlas.NewCloudProviderAccessAuthorization(ctx, "auth_role", &mongodbatlas.CloudProviderAccessAuthorizationArgs{
//				ProjectId: project_tf.ID(),
//				RoleId:    setupOnly.RoleId,
//				Aws: &mongodbatlas.CloudProviderAccessAuthorizationAwsArgs{
//					IamAssumedRoleArn: pulumi.Any(testRole.Arn),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			// Set up push-based log export with authorized IAM role
//			testPushBasedLogExport, err := mongodbatlas.NewPushBasedLogExport(ctx, "test", &mongodbatlas.PushBasedLogExportArgs{
//				ProjectId:  project_tf.ID(),
//				BucketName: pulumi.Any(logBucket.Bucket),
//				IamRoleId:  authRole.RoleId,
//				PrefixPath: pulumi.String("push-based-log-test"),
//			})
//			if err != nil {
//				return err
//			}
//			test := mongodbatlas.LookupPushBasedLogExportOutput(ctx, mongodbatlas.GetPushBasedLogExportOutputArgs{
//				ProjectId: testPushBasedLogExport.ProjectId,
//			}, nil)
//			ctx.Export("test", test.ApplyT(func(test mongodbatlas.GetPushBasedLogExportResult) (*string, error) {
//				return &test.PrefixPath, nil
//			}).(pulumi.StringPtrOutput))
//			return nil
//		})
//	}
//
// ```
type PushBasedLogExport struct {
	pulumi.CustomResourceState

	// The name of the bucket to which the agent sends the logs to.
	BucketName pulumi.StringOutput `pulumi:"bucketName"`
	// Date and time that this feature was enabled on.
	CreateDate pulumi.StringOutput `pulumi:"createDate"`
	// ID of the AWS IAM role that is used to write to the S3 bucket.
	IamRoleId pulumi.StringOutput `pulumi:"iamRoleId"`
	// S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
	PrefixPath pulumi.StringOutput `pulumi:"prefixPath"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Describes whether or not the feature is enabled and what status it is in.
	State    pulumi.StringOutput                 `pulumi:"state"`
	Timeouts PushBasedLogExportTimeoutsPtrOutput `pulumi:"timeouts"`
}

// NewPushBasedLogExport registers a new resource with the given unique name, arguments, and options.
func NewPushBasedLogExport(ctx *pulumi.Context,
	name string, args *PushBasedLogExportArgs, opts ...pulumi.ResourceOption) (*PushBasedLogExport, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BucketName == nil {
		return nil, errors.New("invalid value for required argument 'BucketName'")
	}
	if args.IamRoleId == nil {
		return nil, errors.New("invalid value for required argument 'IamRoleId'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PushBasedLogExport
	err := ctx.RegisterResource("mongodbatlas:index/pushBasedLogExport:PushBasedLogExport", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPushBasedLogExport gets an existing PushBasedLogExport resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPushBasedLogExport(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PushBasedLogExportState, opts ...pulumi.ResourceOption) (*PushBasedLogExport, error) {
	var resource PushBasedLogExport
	err := ctx.ReadResource("mongodbatlas:index/pushBasedLogExport:PushBasedLogExport", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PushBasedLogExport resources.
type pushBasedLogExportState struct {
	// The name of the bucket to which the agent sends the logs to.
	BucketName *string `pulumi:"bucketName"`
	// Date and time that this feature was enabled on.
	CreateDate *string `pulumi:"createDate"`
	// ID of the AWS IAM role that is used to write to the S3 bucket.
	IamRoleId *string `pulumi:"iamRoleId"`
	// S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
	PrefixPath *string `pulumi:"prefixPath"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId *string `pulumi:"projectId"`
	// Describes whether or not the feature is enabled and what status it is in.
	State    *string                     `pulumi:"state"`
	Timeouts *PushBasedLogExportTimeouts `pulumi:"timeouts"`
}

type PushBasedLogExportState struct {
	// The name of the bucket to which the agent sends the logs to.
	BucketName pulumi.StringPtrInput
	// Date and time that this feature was enabled on.
	CreateDate pulumi.StringPtrInput
	// ID of the AWS IAM role that is used to write to the S3 bucket.
	IamRoleId pulumi.StringPtrInput
	// S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
	PrefixPath pulumi.StringPtrInput
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId pulumi.StringPtrInput
	// Describes whether or not the feature is enabled and what status it is in.
	State    pulumi.StringPtrInput
	Timeouts PushBasedLogExportTimeoutsPtrInput
}

func (PushBasedLogExportState) ElementType() reflect.Type {
	return reflect.TypeOf((*pushBasedLogExportState)(nil)).Elem()
}

type pushBasedLogExportArgs struct {
	// The name of the bucket to which the agent sends the logs to.
	BucketName string `pulumi:"bucketName"`
	// ID of the AWS IAM role that is used to write to the S3 bucket.
	IamRoleId string `pulumi:"iamRoleId"`
	// S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
	PrefixPath *string `pulumi:"prefixPath"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId string                      `pulumi:"projectId"`
	Timeouts  *PushBasedLogExportTimeouts `pulumi:"timeouts"`
}

// The set of arguments for constructing a PushBasedLogExport resource.
type PushBasedLogExportArgs struct {
	// The name of the bucket to which the agent sends the logs to.
	BucketName pulumi.StringInput
	// ID of the AWS IAM role that is used to write to the S3 bucket.
	IamRoleId pulumi.StringInput
	// S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
	PrefixPath pulumi.StringPtrInput
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId pulumi.StringInput
	Timeouts  PushBasedLogExportTimeoutsPtrInput
}

func (PushBasedLogExportArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pushBasedLogExportArgs)(nil)).Elem()
}

type PushBasedLogExportInput interface {
	pulumi.Input

	ToPushBasedLogExportOutput() PushBasedLogExportOutput
	ToPushBasedLogExportOutputWithContext(ctx context.Context) PushBasedLogExportOutput
}

func (*PushBasedLogExport) ElementType() reflect.Type {
	return reflect.TypeOf((**PushBasedLogExport)(nil)).Elem()
}

func (i *PushBasedLogExport) ToPushBasedLogExportOutput() PushBasedLogExportOutput {
	return i.ToPushBasedLogExportOutputWithContext(context.Background())
}

func (i *PushBasedLogExport) ToPushBasedLogExportOutputWithContext(ctx context.Context) PushBasedLogExportOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PushBasedLogExportOutput)
}

// PushBasedLogExportArrayInput is an input type that accepts PushBasedLogExportArray and PushBasedLogExportArrayOutput values.
// You can construct a concrete instance of `PushBasedLogExportArrayInput` via:
//
//	PushBasedLogExportArray{ PushBasedLogExportArgs{...} }
type PushBasedLogExportArrayInput interface {
	pulumi.Input

	ToPushBasedLogExportArrayOutput() PushBasedLogExportArrayOutput
	ToPushBasedLogExportArrayOutputWithContext(context.Context) PushBasedLogExportArrayOutput
}

type PushBasedLogExportArray []PushBasedLogExportInput

func (PushBasedLogExportArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PushBasedLogExport)(nil)).Elem()
}

func (i PushBasedLogExportArray) ToPushBasedLogExportArrayOutput() PushBasedLogExportArrayOutput {
	return i.ToPushBasedLogExportArrayOutputWithContext(context.Background())
}

func (i PushBasedLogExportArray) ToPushBasedLogExportArrayOutputWithContext(ctx context.Context) PushBasedLogExportArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PushBasedLogExportArrayOutput)
}

// PushBasedLogExportMapInput is an input type that accepts PushBasedLogExportMap and PushBasedLogExportMapOutput values.
// You can construct a concrete instance of `PushBasedLogExportMapInput` via:
//
//	PushBasedLogExportMap{ "key": PushBasedLogExportArgs{...} }
type PushBasedLogExportMapInput interface {
	pulumi.Input

	ToPushBasedLogExportMapOutput() PushBasedLogExportMapOutput
	ToPushBasedLogExportMapOutputWithContext(context.Context) PushBasedLogExportMapOutput
}

type PushBasedLogExportMap map[string]PushBasedLogExportInput

func (PushBasedLogExportMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PushBasedLogExport)(nil)).Elem()
}

func (i PushBasedLogExportMap) ToPushBasedLogExportMapOutput() PushBasedLogExportMapOutput {
	return i.ToPushBasedLogExportMapOutputWithContext(context.Background())
}

func (i PushBasedLogExportMap) ToPushBasedLogExportMapOutputWithContext(ctx context.Context) PushBasedLogExportMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PushBasedLogExportMapOutput)
}

type PushBasedLogExportOutput struct{ *pulumi.OutputState }

func (PushBasedLogExportOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PushBasedLogExport)(nil)).Elem()
}

func (o PushBasedLogExportOutput) ToPushBasedLogExportOutput() PushBasedLogExportOutput {
	return o
}

func (o PushBasedLogExportOutput) ToPushBasedLogExportOutputWithContext(ctx context.Context) PushBasedLogExportOutput {
	return o
}

// The name of the bucket to which the agent sends the logs to.
func (o PushBasedLogExportOutput) BucketName() pulumi.StringOutput {
	return o.ApplyT(func(v *PushBasedLogExport) pulumi.StringOutput { return v.BucketName }).(pulumi.StringOutput)
}

// Date and time that this feature was enabled on.
func (o PushBasedLogExportOutput) CreateDate() pulumi.StringOutput {
	return o.ApplyT(func(v *PushBasedLogExport) pulumi.StringOutput { return v.CreateDate }).(pulumi.StringOutput)
}

// ID of the AWS IAM role that is used to write to the S3 bucket.
func (o PushBasedLogExportOutput) IamRoleId() pulumi.StringOutput {
	return o.ApplyT(func(v *PushBasedLogExport) pulumi.StringOutput { return v.IamRoleId }).(pulumi.StringOutput)
}

// S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
func (o PushBasedLogExportOutput) PrefixPath() pulumi.StringOutput {
	return o.ApplyT(func(v *PushBasedLogExport) pulumi.StringOutput { return v.PrefixPath }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
func (o PushBasedLogExportOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *PushBasedLogExport) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Describes whether or not the feature is enabled and what status it is in.
func (o PushBasedLogExportOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *PushBasedLogExport) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

func (o PushBasedLogExportOutput) Timeouts() PushBasedLogExportTimeoutsPtrOutput {
	return o.ApplyT(func(v *PushBasedLogExport) PushBasedLogExportTimeoutsPtrOutput { return v.Timeouts }).(PushBasedLogExportTimeoutsPtrOutput)
}

type PushBasedLogExportArrayOutput struct{ *pulumi.OutputState }

func (PushBasedLogExportArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PushBasedLogExport)(nil)).Elem()
}

func (o PushBasedLogExportArrayOutput) ToPushBasedLogExportArrayOutput() PushBasedLogExportArrayOutput {
	return o
}

func (o PushBasedLogExportArrayOutput) ToPushBasedLogExportArrayOutputWithContext(ctx context.Context) PushBasedLogExportArrayOutput {
	return o
}

func (o PushBasedLogExportArrayOutput) Index(i pulumi.IntInput) PushBasedLogExportOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PushBasedLogExport {
		return vs[0].([]*PushBasedLogExport)[vs[1].(int)]
	}).(PushBasedLogExportOutput)
}

type PushBasedLogExportMapOutput struct{ *pulumi.OutputState }

func (PushBasedLogExportMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PushBasedLogExport)(nil)).Elem()
}

func (o PushBasedLogExportMapOutput) ToPushBasedLogExportMapOutput() PushBasedLogExportMapOutput {
	return o
}

func (o PushBasedLogExportMapOutput) ToPushBasedLogExportMapOutputWithContext(ctx context.Context) PushBasedLogExportMapOutput {
	return o
}

func (o PushBasedLogExportMapOutput) MapIndex(k pulumi.StringInput) PushBasedLogExportOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PushBasedLogExport {
		return vs[0].(map[string]*PushBasedLogExport)[vs[1].(string)]
	}).(PushBasedLogExportOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PushBasedLogExportInput)(nil)).Elem(), &PushBasedLogExport{})
	pulumi.RegisterInputType(reflect.TypeOf((*PushBasedLogExportArrayInput)(nil)).Elem(), PushBasedLogExportArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PushBasedLogExportMapInput)(nil)).Elem(), PushBasedLogExportMap{})
	pulumi.RegisterOutputType(PushBasedLogExportOutput{})
	pulumi.RegisterOutputType(PushBasedLogExportArrayOutput{})
	pulumi.RegisterOutputType(PushBasedLogExportMapOutput{})
}
