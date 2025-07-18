// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: CustomDnsConfigurationClusterAws
//
// `CustomDnsConfigurationClusterAws` describes a Custom DNS Configuration for Atlas Clusters on AWS.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
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
//			testCustomDnsConfigurationClusterAws, err := mongodbatlas.NewCustomDnsConfigurationClusterAws(ctx, "test", &mongodbatlas.CustomDnsConfigurationClusterAwsArgs{
//				ProjectId: pulumi.String("<project-id>"),
//				Enabled:   pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupCustomDnsConfigurationClusterAwsOutput(ctx, mongodbatlas.GetCustomDnsConfigurationClusterAwsOutputArgs{
//				ProjectId: testCustomDnsConfigurationClusterAws.ID(),
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupCustomDnsConfigurationClusterAws(ctx *pulumi.Context, args *LookupCustomDnsConfigurationClusterAwsArgs, opts ...pulumi.InvokeOption) (*LookupCustomDnsConfigurationClusterAwsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCustomDnsConfigurationClusterAwsResult
	err := ctx.Invoke("mongodbatlas:index/getCustomDnsConfigurationClusterAws:getCustomDnsConfigurationClusterAws", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCustomDnsConfigurationClusterAws.
type LookupCustomDnsConfigurationClusterAwsArgs struct {
	// Unique identifier for the project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getCustomDnsConfigurationClusterAws.
type LookupCustomDnsConfigurationClusterAwsResult struct {
	// Indicates whether the project's clusters deployed to AWS use custom DNS.
	Enabled bool `pulumi:"enabled"`
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	ProjectId string `pulumi:"projectId"`
}

func LookupCustomDnsConfigurationClusterAwsOutput(ctx *pulumi.Context, args LookupCustomDnsConfigurationClusterAwsOutputArgs, opts ...pulumi.InvokeOption) LookupCustomDnsConfigurationClusterAwsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupCustomDnsConfigurationClusterAwsResultOutput, error) {
			args := v.(LookupCustomDnsConfigurationClusterAwsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getCustomDnsConfigurationClusterAws:getCustomDnsConfigurationClusterAws", args, LookupCustomDnsConfigurationClusterAwsResultOutput{}, options).(LookupCustomDnsConfigurationClusterAwsResultOutput), nil
		}).(LookupCustomDnsConfigurationClusterAwsResultOutput)
}

// A collection of arguments for invoking getCustomDnsConfigurationClusterAws.
type LookupCustomDnsConfigurationClusterAwsOutputArgs struct {
	// Unique identifier for the project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupCustomDnsConfigurationClusterAwsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCustomDnsConfigurationClusterAwsArgs)(nil)).Elem()
}

// A collection of values returned by getCustomDnsConfigurationClusterAws.
type LookupCustomDnsConfigurationClusterAwsResultOutput struct{ *pulumi.OutputState }

func (LookupCustomDnsConfigurationClusterAwsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCustomDnsConfigurationClusterAwsResult)(nil)).Elem()
}

func (o LookupCustomDnsConfigurationClusterAwsResultOutput) ToLookupCustomDnsConfigurationClusterAwsResultOutput() LookupCustomDnsConfigurationClusterAwsResultOutput {
	return o
}

func (o LookupCustomDnsConfigurationClusterAwsResultOutput) ToLookupCustomDnsConfigurationClusterAwsResultOutputWithContext(ctx context.Context) LookupCustomDnsConfigurationClusterAwsResultOutput {
	return o
}

// Indicates whether the project's clusters deployed to AWS use custom DNS.
func (o LookupCustomDnsConfigurationClusterAwsResultOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCustomDnsConfigurationClusterAwsResult) bool { return v.Enabled }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCustomDnsConfigurationClusterAwsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCustomDnsConfigurationClusterAwsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupCustomDnsConfigurationClusterAwsResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCustomDnsConfigurationClusterAwsResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCustomDnsConfigurationClusterAwsResultOutput{})
}
