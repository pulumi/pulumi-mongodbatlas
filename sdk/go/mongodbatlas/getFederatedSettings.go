// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// # Data Source: getFederatedSettings
//
// `getFederatedSettings` provides a federated settings data source. Atlas Cloud federated settings provides federated settings outputs.
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
//			_, err := mongodbatlas.GetFederatedSettings(ctx, &mongodbatlas.GetFederatedSettingsArgs{
//				OrgId: "627a9683e7f7f7ff7fe306f14",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetFederatedSettings(ctx *pulumi.Context, args *GetFederatedSettingsArgs, opts ...pulumi.InvokeOption) (*GetFederatedSettingsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetFederatedSettingsResult
	err := ctx.Invoke("mongodbatlas:index/getFederatedSettings:getFederatedSettings", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFederatedSettings.
type GetFederatedSettingsArgs struct {
	// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
	OrgId string `pulumi:"orgId"`
}

// A collection of values returned by getFederatedSettings.
type GetFederatedSettingsResult struct {
	// List that contains the domains associated with the organization's identity provider.
	FederatedDomains []string `pulumi:"federatedDomains"`
	// Flag that indicates whether this organization has role mappings configured.
	HasRoleMappings bool `pulumi:"hasRoleMappings"`
	// Unique 24-hexadecimal digit string that identifies this federation.
	Id string `pulumi:"id"`
	// Unique 20-hexadecimal digit string that identifies the identity provider connected to this organization.
	IdentityProviderId string `pulumi:"identityProviderId"`
	// Value that indicates whether the identity provider is active. Atlas returns ACTIVE if the identity provider is active and INACTIVE if the identity provider is inactive.
	IdentityProviderStatus string `pulumi:"identityProviderStatus"`
	OrgId                  string `pulumi:"orgId"`
}

func GetFederatedSettingsOutput(ctx *pulumi.Context, args GetFederatedSettingsOutputArgs, opts ...pulumi.InvokeOption) GetFederatedSettingsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetFederatedSettingsResult, error) {
			args := v.(GetFederatedSettingsArgs)
			r, err := GetFederatedSettings(ctx, &args, opts...)
			var s GetFederatedSettingsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetFederatedSettingsResultOutput)
}

// A collection of arguments for invoking getFederatedSettings.
type GetFederatedSettingsOutputArgs struct {
	// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
	OrgId pulumi.StringInput `pulumi:"orgId"`
}

func (GetFederatedSettingsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFederatedSettingsArgs)(nil)).Elem()
}

// A collection of values returned by getFederatedSettings.
type GetFederatedSettingsResultOutput struct{ *pulumi.OutputState }

func (GetFederatedSettingsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFederatedSettingsResult)(nil)).Elem()
}

func (o GetFederatedSettingsResultOutput) ToGetFederatedSettingsResultOutput() GetFederatedSettingsResultOutput {
	return o
}

func (o GetFederatedSettingsResultOutput) ToGetFederatedSettingsResultOutputWithContext(ctx context.Context) GetFederatedSettingsResultOutput {
	return o
}

// List that contains the domains associated with the organization's identity provider.
func (o GetFederatedSettingsResultOutput) FederatedDomains() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetFederatedSettingsResult) []string { return v.FederatedDomains }).(pulumi.StringArrayOutput)
}

// Flag that indicates whether this organization has role mappings configured.
func (o GetFederatedSettingsResultOutput) HasRoleMappings() pulumi.BoolOutput {
	return o.ApplyT(func(v GetFederatedSettingsResult) bool { return v.HasRoleMappings }).(pulumi.BoolOutput)
}

// Unique 24-hexadecimal digit string that identifies this federation.
func (o GetFederatedSettingsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetFederatedSettingsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique 20-hexadecimal digit string that identifies the identity provider connected to this organization.
func (o GetFederatedSettingsResultOutput) IdentityProviderId() pulumi.StringOutput {
	return o.ApplyT(func(v GetFederatedSettingsResult) string { return v.IdentityProviderId }).(pulumi.StringOutput)
}

// Value that indicates whether the identity provider is active. Atlas returns ACTIVE if the identity provider is active and INACTIVE if the identity provider is inactive.
func (o GetFederatedSettingsResultOutput) IdentityProviderStatus() pulumi.StringOutput {
	return o.ApplyT(func(v GetFederatedSettingsResult) string { return v.IdentityProviderStatus }).(pulumi.StringOutput)
}

func (o GetFederatedSettingsResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v GetFederatedSettingsResult) string { return v.OrgId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetFederatedSettingsResultOutput{})
}
