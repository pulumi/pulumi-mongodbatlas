// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: getProjectIpAddresses
//
// `getProjectIpAddresses` returns the IP addresses in a project categorized by services.
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
//			test, err := mongodbatlas.LookupProjectIpAddresses(ctx, &mongodbatlas.LookupProjectIpAddressesArgs{
//				ProjectId: projectId,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("projectServices", test.Services)
//			return nil
//		})
//	}
//
// ```
func LookupProjectIpAddresses(ctx *pulumi.Context, args *LookupProjectIpAddressesArgs, opts ...pulumi.InvokeOption) (*LookupProjectIpAddressesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupProjectIpAddressesResult
	err := ctx.Invoke("mongodbatlas:index/getProjectIpAddresses:getProjectIpAddresses", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProjectIpAddresses.
type LookupProjectIpAddressesArgs struct {
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getProjectIpAddresses.
type LookupProjectIpAddressesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
	// List of IP addresses in a project categorized by services.
	Services GetProjectIpAddressesServices `pulumi:"services"`
}

func LookupProjectIpAddressesOutput(ctx *pulumi.Context, args LookupProjectIpAddressesOutputArgs, opts ...pulumi.InvokeOption) LookupProjectIpAddressesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupProjectIpAddressesResultOutput, error) {
			args := v.(LookupProjectIpAddressesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getProjectIpAddresses:getProjectIpAddresses", args, LookupProjectIpAddressesResultOutput{}, options).(LookupProjectIpAddressesResultOutput), nil
		}).(LookupProjectIpAddressesResultOutput)
}

// A collection of arguments for invoking getProjectIpAddresses.
type LookupProjectIpAddressesOutputArgs struct {
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupProjectIpAddressesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProjectIpAddressesArgs)(nil)).Elem()
}

// A collection of values returned by getProjectIpAddresses.
type LookupProjectIpAddressesResultOutput struct{ *pulumi.OutputState }

func (LookupProjectIpAddressesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProjectIpAddressesResult)(nil)).Elem()
}

func (o LookupProjectIpAddressesResultOutput) ToLookupProjectIpAddressesResultOutput() LookupProjectIpAddressesResultOutput {
	return o
}

func (o LookupProjectIpAddressesResultOutput) ToLookupProjectIpAddressesResultOutputWithContext(ctx context.Context) LookupProjectIpAddressesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupProjectIpAddressesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectIpAddressesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies your project.
func (o LookupProjectIpAddressesResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectIpAddressesResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// List of IP addresses in a project categorized by services.
func (o LookupProjectIpAddressesResultOutput) Services() GetProjectIpAddressesServicesOutput {
	return o.ApplyT(func(v LookupProjectIpAddressesResult) GetProjectIpAddressesServices { return v.Services }).(GetProjectIpAddressesServicesOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupProjectIpAddressesResultOutput{})
}
