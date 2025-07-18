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
func LookupApiKey(ctx *pulumi.Context, args *LookupApiKeyArgs, opts ...pulumi.InvokeOption) (*LookupApiKeyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupApiKeyResult
	err := ctx.Invoke("mongodbatlas:index/getApiKey:getApiKey", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApiKey.
type LookupApiKeyArgs struct {
	// Unique identifier for the organization API key.
	ApiKeyId string `pulumi:"apiKeyId"`
	// Unique identifier for the organization.
	OrgId string `pulumi:"orgId"`
}

// A collection of values returned by getApiKey.
type LookupApiKeyResult struct {
	ApiKeyId string `pulumi:"apiKeyId"`
	// Description of this Organization API key.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id    string `pulumi:"id"`
	OrgId string `pulumi:"orgId"`
	// Public key for this Organization API key.
	PublicKey string `pulumi:"publicKey"`
	// Name of the role. This resource returns all the roles the user has in Atlas.
	// The following are valid roles:
	// * `ORG_OWNER`
	// * `ORG_GROUP_CREATOR`
	// * `ORG_BILLING_ADMIN`
	// * `ORG_READ_ONLY`
	// * `ORG_MEMBER`
	RoleNames []string `pulumi:"roleNames"`
}

func LookupApiKeyOutput(ctx *pulumi.Context, args LookupApiKeyOutputArgs, opts ...pulumi.InvokeOption) LookupApiKeyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupApiKeyResultOutput, error) {
			args := v.(LookupApiKeyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getApiKey:getApiKey", args, LookupApiKeyResultOutput{}, options).(LookupApiKeyResultOutput), nil
		}).(LookupApiKeyResultOutput)
}

// A collection of arguments for invoking getApiKey.
type LookupApiKeyOutputArgs struct {
	// Unique identifier for the organization API key.
	ApiKeyId pulumi.StringInput `pulumi:"apiKeyId"`
	// Unique identifier for the organization.
	OrgId pulumi.StringInput `pulumi:"orgId"`
}

func (LookupApiKeyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApiKeyArgs)(nil)).Elem()
}

// A collection of values returned by getApiKey.
type LookupApiKeyResultOutput struct{ *pulumi.OutputState }

func (LookupApiKeyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApiKeyResult)(nil)).Elem()
}

func (o LookupApiKeyResultOutput) ToLookupApiKeyResultOutput() LookupApiKeyResultOutput {
	return o
}

func (o LookupApiKeyResultOutput) ToLookupApiKeyResultOutputWithContext(ctx context.Context) LookupApiKeyResultOutput {
	return o
}

func (o LookupApiKeyResultOutput) ApiKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApiKeyResult) string { return v.ApiKeyId }).(pulumi.StringOutput)
}

// Description of this Organization API key.
func (o LookupApiKeyResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApiKeyResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupApiKeyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApiKeyResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupApiKeyResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApiKeyResult) string { return v.OrgId }).(pulumi.StringOutput)
}

// Public key for this Organization API key.
func (o LookupApiKeyResultOutput) PublicKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApiKeyResult) string { return v.PublicKey }).(pulumi.StringOutput)
}

// Name of the role. This resource returns all the roles the user has in Atlas.
// The following are valid roles:
// * `ORG_OWNER`
// * `ORG_GROUP_CREATOR`
// * `ORG_BILLING_ADMIN`
// * `ORG_READ_ONLY`
// * `ORG_MEMBER`
func (o LookupApiKeyResultOutput) RoleNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupApiKeyResult) []string { return v.RoleNames }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupApiKeyResultOutput{})
}
