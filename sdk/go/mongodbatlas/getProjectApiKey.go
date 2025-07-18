// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ### Using projectId and apiKeyId attribute to query
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
//			_, err := mongodbatlas.NewProjectApiKey(ctx, "test", &mongodbatlas.ProjectApiKeyArgs{
//				Description: pulumi.String("Description of your API key"),
//				ProjectAssignments: mongodbatlas.ProjectApiKeyProjectAssignmentArray{
//					&mongodbatlas.ProjectApiKeyProjectAssignmentArgs{
//						ProjectId: pulumi.String("64259ee860c43338194b0f8e"),
//						RoleNames: pulumi.StringArray{
//							pulumi.String("GROUP_READ_ONLY"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.LookupProjectApiKey(ctx, &mongodbatlas.LookupProjectApiKeyArgs{
//				ProjectId: "64259ee860c43338194b0f8e",
//				ApiKeyId:  testMongodbatlasApiKey.ApiKeyId,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupProjectApiKey(ctx *pulumi.Context, args *LookupProjectApiKeyArgs, opts ...pulumi.InvokeOption) (*LookupProjectApiKeyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupProjectApiKeyResult
	err := ctx.Invoke("mongodbatlas:index/getProjectApiKey:getProjectApiKey", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProjectApiKey.
type LookupProjectApiKeyArgs struct {
	// Unique identifier for this Project API key.
	ApiKeyId string `pulumi:"apiKeyId"`
	// The unique ID for the project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getProjectApiKey.
type LookupProjectApiKeyResult struct {
	ApiKeyId string `pulumi:"apiKeyId"`
	// Description of this Project API key.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Private key for this Organization API key.
	PrivateKey         string                              `pulumi:"privateKey"`
	ProjectAssignments []GetProjectApiKeyProjectAssignment `pulumi:"projectAssignments"`
	// Project ID to assign to Access Key
	ProjectId string `pulumi:"projectId"`
	// Public key for this Organization API key.
	PublicKey string `pulumi:"publicKey"`
}

func LookupProjectApiKeyOutput(ctx *pulumi.Context, args LookupProjectApiKeyOutputArgs, opts ...pulumi.InvokeOption) LookupProjectApiKeyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupProjectApiKeyResultOutput, error) {
			args := v.(LookupProjectApiKeyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getProjectApiKey:getProjectApiKey", args, LookupProjectApiKeyResultOutput{}, options).(LookupProjectApiKeyResultOutput), nil
		}).(LookupProjectApiKeyResultOutput)
}

// A collection of arguments for invoking getProjectApiKey.
type LookupProjectApiKeyOutputArgs struct {
	// Unique identifier for this Project API key.
	ApiKeyId pulumi.StringInput `pulumi:"apiKeyId"`
	// The unique ID for the project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupProjectApiKeyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProjectApiKeyArgs)(nil)).Elem()
}

// A collection of values returned by getProjectApiKey.
type LookupProjectApiKeyResultOutput struct{ *pulumi.OutputState }

func (LookupProjectApiKeyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProjectApiKeyResult)(nil)).Elem()
}

func (o LookupProjectApiKeyResultOutput) ToLookupProjectApiKeyResultOutput() LookupProjectApiKeyResultOutput {
	return o
}

func (o LookupProjectApiKeyResultOutput) ToLookupProjectApiKeyResultOutputWithContext(ctx context.Context) LookupProjectApiKeyResultOutput {
	return o
}

func (o LookupProjectApiKeyResultOutput) ApiKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectApiKeyResult) string { return v.ApiKeyId }).(pulumi.StringOutput)
}

// Description of this Project API key.
func (o LookupProjectApiKeyResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectApiKeyResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupProjectApiKeyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectApiKeyResult) string { return v.Id }).(pulumi.StringOutput)
}

// Private key for this Organization API key.
func (o LookupProjectApiKeyResultOutput) PrivateKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectApiKeyResult) string { return v.PrivateKey }).(pulumi.StringOutput)
}

func (o LookupProjectApiKeyResultOutput) ProjectAssignments() GetProjectApiKeyProjectAssignmentArrayOutput {
	return o.ApplyT(func(v LookupProjectApiKeyResult) []GetProjectApiKeyProjectAssignment { return v.ProjectAssignments }).(GetProjectApiKeyProjectAssignmentArrayOutput)
}

// Project ID to assign to Access Key
func (o LookupProjectApiKeyResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectApiKeyResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Public key for this Organization API key.
func (o LookupProjectApiKeyResultOutput) PublicKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectApiKeyResult) string { return v.PublicKey }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupProjectApiKeyResultOutput{})
}
