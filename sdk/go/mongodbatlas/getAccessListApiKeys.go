// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
func LookupAccessListApiKeys(ctx *pulumi.Context, args *LookupAccessListApiKeysArgs, opts ...pulumi.InvokeOption) (*LookupAccessListApiKeysResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAccessListApiKeysResult
	err := ctx.Invoke("mongodbatlas:index/getAccessListApiKeys:getAccessListApiKeys", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccessListApiKeys.
type LookupAccessListApiKeysArgs struct {
	ApiKeyId string `pulumi:"apiKeyId"`
	// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
	ItemsPerPage *int   `pulumi:"itemsPerPage"`
	OrgId        string `pulumi:"orgId"`
	// The page to return. Defaults to `1`.
	PageNum *int `pulumi:"pageNum"`
}

// A collection of values returned by getAccessListApiKeys.
type LookupAccessListApiKeysResult struct {
	ApiKeyId string `pulumi:"apiKeyId"`
	// The provider-assigned unique ID for this managed resource.
	Id           string                       `pulumi:"id"`
	ItemsPerPage *int                         `pulumi:"itemsPerPage"`
	OrgId        string                       `pulumi:"orgId"`
	PageNum      *int                         `pulumi:"pageNum"`
	Results      []GetAccessListApiKeysResult `pulumi:"results"`
}

func LookupAccessListApiKeysOutput(ctx *pulumi.Context, args LookupAccessListApiKeysOutputArgs, opts ...pulumi.InvokeOption) LookupAccessListApiKeysResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAccessListApiKeysResultOutput, error) {
			args := v.(LookupAccessListApiKeysArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getAccessListApiKeys:getAccessListApiKeys", args, LookupAccessListApiKeysResultOutput{}, options).(LookupAccessListApiKeysResultOutput), nil
		}).(LookupAccessListApiKeysResultOutput)
}

// A collection of arguments for invoking getAccessListApiKeys.
type LookupAccessListApiKeysOutputArgs struct {
	ApiKeyId pulumi.StringInput `pulumi:"apiKeyId"`
	// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
	ItemsPerPage pulumi.IntPtrInput `pulumi:"itemsPerPage"`
	OrgId        pulumi.StringInput `pulumi:"orgId"`
	// The page to return. Defaults to `1`.
	PageNum pulumi.IntPtrInput `pulumi:"pageNum"`
}

func (LookupAccessListApiKeysOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccessListApiKeysArgs)(nil)).Elem()
}

// A collection of values returned by getAccessListApiKeys.
type LookupAccessListApiKeysResultOutput struct{ *pulumi.OutputState }

func (LookupAccessListApiKeysResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccessListApiKeysResult)(nil)).Elem()
}

func (o LookupAccessListApiKeysResultOutput) ToLookupAccessListApiKeysResultOutput() LookupAccessListApiKeysResultOutput {
	return o
}

func (o LookupAccessListApiKeysResultOutput) ToLookupAccessListApiKeysResultOutputWithContext(ctx context.Context) LookupAccessListApiKeysResultOutput {
	return o
}

func (o LookupAccessListApiKeysResultOutput) ApiKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessListApiKeysResult) string { return v.ApiKeyId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAccessListApiKeysResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessListApiKeysResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAccessListApiKeysResultOutput) ItemsPerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupAccessListApiKeysResult) *int { return v.ItemsPerPage }).(pulumi.IntPtrOutput)
}

func (o LookupAccessListApiKeysResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessListApiKeysResult) string { return v.OrgId }).(pulumi.StringOutput)
}

func (o LookupAccessListApiKeysResultOutput) PageNum() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupAccessListApiKeysResult) *int { return v.PageNum }).(pulumi.IntPtrOutput)
}

func (o LookupAccessListApiKeysResultOutput) Results() GetAccessListApiKeysResultArrayOutput {
	return o.ApplyT(func(v LookupAccessListApiKeysResult) []GetAccessListApiKeysResult { return v.Results }).(GetAccessListApiKeysResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAccessListApiKeysResultOutput{})
}
