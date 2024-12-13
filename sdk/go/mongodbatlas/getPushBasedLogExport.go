// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: PushBasedLogExport
//
// `PushBasedLogExport` describes the configured project level settings for the push-based log export feature.
//
// ## Example Usage
//
// ### S
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
func LookupPushBasedLogExport(ctx *pulumi.Context, args *LookupPushBasedLogExportArgs, opts ...pulumi.InvokeOption) (*LookupPushBasedLogExportResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPushBasedLogExportResult
	err := ctx.Invoke("mongodbatlas:index/getPushBasedLogExport:getPushBasedLogExport", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPushBasedLogExport.
type LookupPushBasedLogExportArgs struct {
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getPushBasedLogExport.
type LookupPushBasedLogExportResult struct {
	BucketName string `pulumi:"bucketName"`
	CreateDate string `pulumi:"createDate"`
	IamRoleId  string `pulumi:"iamRoleId"`
	// The provider-assigned unique ID for this managed resource.
	Id         string `pulumi:"id"`
	PrefixPath string `pulumi:"prefixPath"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId string `pulumi:"projectId"`
	State     string `pulumi:"state"`
}

func LookupPushBasedLogExportOutput(ctx *pulumi.Context, args LookupPushBasedLogExportOutputArgs, opts ...pulumi.InvokeOption) LookupPushBasedLogExportResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupPushBasedLogExportResultOutput, error) {
			args := v.(LookupPushBasedLogExportArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getPushBasedLogExport:getPushBasedLogExport", args, LookupPushBasedLogExportResultOutput{}, options).(LookupPushBasedLogExportResultOutput), nil
		}).(LookupPushBasedLogExportResultOutput)
}

// A collection of arguments for invoking getPushBasedLogExport.
type LookupPushBasedLogExportOutputArgs struct {
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupPushBasedLogExportOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPushBasedLogExportArgs)(nil)).Elem()
}

// A collection of values returned by getPushBasedLogExport.
type LookupPushBasedLogExportResultOutput struct{ *pulumi.OutputState }

func (LookupPushBasedLogExportResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPushBasedLogExportResult)(nil)).Elem()
}

func (o LookupPushBasedLogExportResultOutput) ToLookupPushBasedLogExportResultOutput() LookupPushBasedLogExportResultOutput {
	return o
}

func (o LookupPushBasedLogExportResultOutput) ToLookupPushBasedLogExportResultOutputWithContext(ctx context.Context) LookupPushBasedLogExportResultOutput {
	return o
}

func (o LookupPushBasedLogExportResultOutput) BucketName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPushBasedLogExportResult) string { return v.BucketName }).(pulumi.StringOutput)
}

func (o LookupPushBasedLogExportResultOutput) CreateDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPushBasedLogExportResult) string { return v.CreateDate }).(pulumi.StringOutput)
}

func (o LookupPushBasedLogExportResultOutput) IamRoleId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPushBasedLogExportResult) string { return v.IamRoleId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupPushBasedLogExportResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPushBasedLogExportResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupPushBasedLogExportResultOutput) PrefixPath() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPushBasedLogExportResult) string { return v.PrefixPath }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
func (o LookupPushBasedLogExportResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPushBasedLogExportResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o LookupPushBasedLogExportResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPushBasedLogExportResult) string { return v.State }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPushBasedLogExportResultOutput{})
}
