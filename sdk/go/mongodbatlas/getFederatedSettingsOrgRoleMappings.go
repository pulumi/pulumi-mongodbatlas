// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `getFederatedSettingsOrgRoleMappings` provides an Federated Settings Org Role Mapping datasource. Atlas Cloud Federated Settings Org Role Mapping provides federated settings outputs for the configured Org Role Mapping.
func LookupFederatedSettingsOrgRoleMappings(ctx *pulumi.Context, args *LookupFederatedSettingsOrgRoleMappingsArgs, opts ...pulumi.InvokeOption) (*LookupFederatedSettingsOrgRoleMappingsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupFederatedSettingsOrgRoleMappingsResult
	err := ctx.Invoke("mongodbatlas:index/getFederatedSettingsOrgRoleMappings:getFederatedSettingsOrgRoleMappings", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFederatedSettingsOrgRoleMappings.
type LookupFederatedSettingsOrgRoleMappingsArgs struct {
	// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
	FederationSettingsId string `pulumi:"federationSettingsId"`
	// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
	ItemsPerPage *int `pulumi:"itemsPerPage"`
	// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
	OrgId string `pulumi:"orgId"`
	// The page to return. Defaults to `1`.
	PageNum *int `pulumi:"pageNum"`
}

// A collection of values returned by getFederatedSettingsOrgRoleMappings.
type LookupFederatedSettingsOrgRoleMappingsResult struct {
	FederationSettingsId string `pulumi:"federationSettingsId"`
	// The provider-assigned unique ID for this managed resource.
	Id           string `pulumi:"id"`
	ItemsPerPage *int   `pulumi:"itemsPerPage"`
	OrgId        string `pulumi:"orgId"`
	PageNum      *int   `pulumi:"pageNum"`
	// Includes cloudProviderSnapshot object for each item detailed in the results array section.
	// * `totalCount` - Count of the total number of items in the result set. It may be greater than the number of objects in the results array if the entire result set is paginated.
	Results []GetFederatedSettingsOrgRoleMappingsResult `pulumi:"results"`
}

func LookupFederatedSettingsOrgRoleMappingsOutput(ctx *pulumi.Context, args LookupFederatedSettingsOrgRoleMappingsOutputArgs, opts ...pulumi.InvokeOption) LookupFederatedSettingsOrgRoleMappingsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupFederatedSettingsOrgRoleMappingsResult, error) {
			args := v.(LookupFederatedSettingsOrgRoleMappingsArgs)
			r, err := LookupFederatedSettingsOrgRoleMappings(ctx, &args, opts...)
			var s LookupFederatedSettingsOrgRoleMappingsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupFederatedSettingsOrgRoleMappingsResultOutput)
}

// A collection of arguments for invoking getFederatedSettingsOrgRoleMappings.
type LookupFederatedSettingsOrgRoleMappingsOutputArgs struct {
	// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
	FederationSettingsId pulumi.StringInput `pulumi:"federationSettingsId"`
	// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
	ItemsPerPage pulumi.IntPtrInput `pulumi:"itemsPerPage"`
	// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
	OrgId pulumi.StringInput `pulumi:"orgId"`
	// The page to return. Defaults to `1`.
	PageNum pulumi.IntPtrInput `pulumi:"pageNum"`
}

func (LookupFederatedSettingsOrgRoleMappingsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFederatedSettingsOrgRoleMappingsArgs)(nil)).Elem()
}

// A collection of values returned by getFederatedSettingsOrgRoleMappings.
type LookupFederatedSettingsOrgRoleMappingsResultOutput struct{ *pulumi.OutputState }

func (LookupFederatedSettingsOrgRoleMappingsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFederatedSettingsOrgRoleMappingsResult)(nil)).Elem()
}

func (o LookupFederatedSettingsOrgRoleMappingsResultOutput) ToLookupFederatedSettingsOrgRoleMappingsResultOutput() LookupFederatedSettingsOrgRoleMappingsResultOutput {
	return o
}

func (o LookupFederatedSettingsOrgRoleMappingsResultOutput) ToLookupFederatedSettingsOrgRoleMappingsResultOutputWithContext(ctx context.Context) LookupFederatedSettingsOrgRoleMappingsResultOutput {
	return o
}

func (o LookupFederatedSettingsOrgRoleMappingsResultOutput) FederationSettingsId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsOrgRoleMappingsResult) string { return v.FederationSettingsId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupFederatedSettingsOrgRoleMappingsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsOrgRoleMappingsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupFederatedSettingsOrgRoleMappingsResultOutput) ItemsPerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupFederatedSettingsOrgRoleMappingsResult) *int { return v.ItemsPerPage }).(pulumi.IntPtrOutput)
}

func (o LookupFederatedSettingsOrgRoleMappingsResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsOrgRoleMappingsResult) string { return v.OrgId }).(pulumi.StringOutput)
}

func (o LookupFederatedSettingsOrgRoleMappingsResultOutput) PageNum() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupFederatedSettingsOrgRoleMappingsResult) *int { return v.PageNum }).(pulumi.IntPtrOutput)
}

// Includes cloudProviderSnapshot object for each item detailed in the results array section.
// * `totalCount` - Count of the total number of items in the result set. It may be greater than the number of objects in the results array if the entire result set is paginated.
func (o LookupFederatedSettingsOrgRoleMappingsResultOutput) Results() GetFederatedSettingsOrgRoleMappingsResultArrayOutput {
	return o.ApplyT(func(v LookupFederatedSettingsOrgRoleMappingsResult) []GetFederatedSettingsOrgRoleMappingsResult {
		return v.Results
	}).(GetFederatedSettingsOrgRoleMappingsResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFederatedSettingsOrgRoleMappingsResultOutput{})
}
