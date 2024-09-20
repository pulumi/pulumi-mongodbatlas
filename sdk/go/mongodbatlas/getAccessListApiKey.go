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
func LookupAccessListApiKey(ctx *pulumi.Context, args *LookupAccessListApiKeyArgs, opts ...pulumi.InvokeOption) (*LookupAccessListApiKeyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAccessListApiKeyResult
	err := ctx.Invoke("mongodbatlas:index/getAccessListApiKey:getAccessListApiKey", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccessListApiKey.
type LookupAccessListApiKeyArgs struct {
	// Unique identifier for the Organization API Key for which you want to retrieve an access list entry.
	// *
	// ->**NOTE:** You must set either the `cidrBlock` attribute or the `ipAddress` attribute. Don't set both.
	ApiKeyId string `pulumi:"apiKeyId"`
	// Single IP address to be added to the access list.
	IpAddress string `pulumi:"ipAddress"`
	// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
	OrgId string `pulumi:"orgId"`
}

// A collection of values returned by getAccessListApiKey.
type LookupAccessListApiKeyResult struct {
	AccessCount int    `pulumi:"accessCount"`
	ApiKeyId    string `pulumi:"apiKeyId"`
	CidrBlock   string `pulumi:"cidrBlock"`
	Created     string `pulumi:"created"`
	// The provider-assigned unique ID for this managed resource.
	Id              string `pulumi:"id"`
	IpAddress       string `pulumi:"ipAddress"`
	LastUsed        string `pulumi:"lastUsed"`
	LastUsedAddress string `pulumi:"lastUsedAddress"`
	OrgId           string `pulumi:"orgId"`
}

func LookupAccessListApiKeyOutput(ctx *pulumi.Context, args LookupAccessListApiKeyOutputArgs, opts ...pulumi.InvokeOption) LookupAccessListApiKeyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAccessListApiKeyResultOutput, error) {
			args := v.(LookupAccessListApiKeyArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupAccessListApiKeyResult
			secret, err := ctx.InvokePackageRaw("mongodbatlas:index/getAccessListApiKey:getAccessListApiKey", args, &rv, "", opts...)
			if err != nil {
				return LookupAccessListApiKeyResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupAccessListApiKeyResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupAccessListApiKeyResultOutput), nil
			}
			return output, nil
		}).(LookupAccessListApiKeyResultOutput)
}

// A collection of arguments for invoking getAccessListApiKey.
type LookupAccessListApiKeyOutputArgs struct {
	// Unique identifier for the Organization API Key for which you want to retrieve an access list entry.
	// *
	// ->**NOTE:** You must set either the `cidrBlock` attribute or the `ipAddress` attribute. Don't set both.
	ApiKeyId pulumi.StringInput `pulumi:"apiKeyId"`
	// Single IP address to be added to the access list.
	IpAddress pulumi.StringInput `pulumi:"ipAddress"`
	// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
	OrgId pulumi.StringInput `pulumi:"orgId"`
}

func (LookupAccessListApiKeyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccessListApiKeyArgs)(nil)).Elem()
}

// A collection of values returned by getAccessListApiKey.
type LookupAccessListApiKeyResultOutput struct{ *pulumi.OutputState }

func (LookupAccessListApiKeyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccessListApiKeyResult)(nil)).Elem()
}

func (o LookupAccessListApiKeyResultOutput) ToLookupAccessListApiKeyResultOutput() LookupAccessListApiKeyResultOutput {
	return o
}

func (o LookupAccessListApiKeyResultOutput) ToLookupAccessListApiKeyResultOutputWithContext(ctx context.Context) LookupAccessListApiKeyResultOutput {
	return o
}

func (o LookupAccessListApiKeyResultOutput) AccessCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupAccessListApiKeyResult) int { return v.AccessCount }).(pulumi.IntOutput)
}

func (o LookupAccessListApiKeyResultOutput) ApiKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessListApiKeyResult) string { return v.ApiKeyId }).(pulumi.StringOutput)
}

func (o LookupAccessListApiKeyResultOutput) CidrBlock() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessListApiKeyResult) string { return v.CidrBlock }).(pulumi.StringOutput)
}

func (o LookupAccessListApiKeyResultOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessListApiKeyResult) string { return v.Created }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAccessListApiKeyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessListApiKeyResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAccessListApiKeyResultOutput) IpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessListApiKeyResult) string { return v.IpAddress }).(pulumi.StringOutput)
}

func (o LookupAccessListApiKeyResultOutput) LastUsed() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessListApiKeyResult) string { return v.LastUsed }).(pulumi.StringOutput)
}

func (o LookupAccessListApiKeyResultOutput) LastUsedAddress() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessListApiKeyResult) string { return v.LastUsedAddress }).(pulumi.StringOutput)
}

func (o LookupAccessListApiKeyResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessListApiKeyResult) string { return v.OrgId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAccessListApiKeyResultOutput{})
}
