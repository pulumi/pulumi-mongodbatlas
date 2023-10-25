// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// `Organization` describe all MongoDB Atlas Organizations. This represents organizations that have been created.
//
// ## Example Usage
func LookupOrganization(ctx *pulumi.Context, args *LookupOrganizationArgs, opts ...pulumi.InvokeOption) (*LookupOrganizationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupOrganizationResult
	err := ctx.Invoke("mongodbatlas:index/getOrganization:getOrganization", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOrganization.
type LookupOrganizationArgs struct {
	// Unique 24-hexadecimal digit string that identifies the organization.
	OrgId string `pulumi:"orgId"`
}

// A collection of values returned by getOrganization.
type LookupOrganizationResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Flag that indicates whether this organization has been deleted.
	IsDeleted bool                  `pulumi:"isDeleted"`
	Links     []GetOrganizationLink `pulumi:"links"`
	// Human-readable label that identifies the organization.
	Name  string `pulumi:"name"`
	OrgId string `pulumi:"orgId"`
}

func LookupOrganizationOutput(ctx *pulumi.Context, args LookupOrganizationOutputArgs, opts ...pulumi.InvokeOption) LookupOrganizationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupOrganizationResult, error) {
			args := v.(LookupOrganizationArgs)
			r, err := LookupOrganization(ctx, &args, opts...)
			var s LookupOrganizationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupOrganizationResultOutput)
}

// A collection of arguments for invoking getOrganization.
type LookupOrganizationOutputArgs struct {
	// Unique 24-hexadecimal digit string that identifies the organization.
	OrgId pulumi.StringInput `pulumi:"orgId"`
}

func (LookupOrganizationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOrganizationArgs)(nil)).Elem()
}

// A collection of values returned by getOrganization.
type LookupOrganizationResultOutput struct{ *pulumi.OutputState }

func (LookupOrganizationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOrganizationResult)(nil)).Elem()
}

func (o LookupOrganizationResultOutput) ToLookupOrganizationResultOutput() LookupOrganizationResultOutput {
	return o
}

func (o LookupOrganizationResultOutput) ToLookupOrganizationResultOutputWithContext(ctx context.Context) LookupOrganizationResultOutput {
	return o
}

func (o LookupOrganizationResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupOrganizationResult] {
	return pulumix.Output[LookupOrganizationResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o LookupOrganizationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationResult) string { return v.Id }).(pulumi.StringOutput)
}

// Flag that indicates whether this organization has been deleted.
func (o LookupOrganizationResultOutput) IsDeleted() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupOrganizationResult) bool { return v.IsDeleted }).(pulumi.BoolOutput)
}

func (o LookupOrganizationResultOutput) Links() GetOrganizationLinkArrayOutput {
	return o.ApplyT(func(v LookupOrganizationResult) []GetOrganizationLink { return v.Links }).(GetOrganizationLinkArrayOutput)
}

// Human-readable label that identifies the organization.
func (o LookupOrganizationResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupOrganizationResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationResult) string { return v.OrgId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupOrganizationResultOutput{})
}
