// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `getFederatedSettingsIdentityProviders` provides an Federated Settings Identity Providers datasource. Atlas Cloud Federated Settings Identity Providers provides federated settings outputs for the configured Identity Providers.
//
// > **NOTE:** OIDC Workforce IdP is currently in preview. To learn more about OIDC and existing limitations see the [OIDC Authentication Documentation](https://www.mongodb.com/docs/atlas/security-oidc/).
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			identityProvider, err := mongodbatlas.NewFederatedSettingsIdentityProvider(ctx, "identity_provider", &mongodbatlas.FederatedSettingsIdentityProviderArgs{
//				FederationSettingsId: pulumi.String("627a9687f7f7f7f774de306f14"),
//				Name:                 pulumi.String("mongodb_federation_test"),
//				AssociatedDomains: pulumi.StringArray{
//					pulumi.String("yourdomain.com"),
//				},
//				SsoDebugEnabled: pulumi.Bool(true),
//				Status:          pulumi.String("ACTIVE"),
//			})
//			if err != nil {
//				return err
//			}
//			_ = identityProvider.ID().ApplyT(func(id string) (mongodbatlas.GetFederatedSettingsIdentityProvidersResult, error) {
//				return mongodbatlas.LookupFederatedSettingsIdentityProvidersOutput(ctx, mongodbatlas.GetFederatedSettingsIdentityProvidersOutputArgs{
//					FederationSettingsId: id,
//					PageNum:              1,
//					ItemsPerPage:         5,
//				}, nil), nil
//			}).(mongodbatlas.GetFederatedSettingsIdentityProvidersResultOutput)
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func LookupFederatedSettingsIdentityProviders(ctx *pulumi.Context, args *LookupFederatedSettingsIdentityProvidersArgs, opts ...pulumi.InvokeOption) (*LookupFederatedSettingsIdentityProvidersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupFederatedSettingsIdentityProvidersResult
	err := ctx.Invoke("mongodbatlas:index/getFederatedSettingsIdentityProviders:getFederatedSettingsIdentityProviders", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFederatedSettingsIdentityProviders.
type LookupFederatedSettingsIdentityProvidersArgs struct {
	// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
	FederationSettingsId string `pulumi:"federationSettingsId"`
	// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
	ItemsPerPage *int `pulumi:"itemsPerPage"`
	// The page to return. Defaults to `1`.
	PageNum *int `pulumi:"pageNum"`
}

// A collection of values returned by getFederatedSettingsIdentityProviders.
type LookupFederatedSettingsIdentityProvidersResult struct {
	// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
	FederationSettingsId string `pulumi:"federationSettingsId"`
	// The provider-assigned unique ID for this managed resource.
	Id           string `pulumi:"id"`
	ItemsPerPage *int   `pulumi:"itemsPerPage"`
	PageNum      *int   `pulumi:"pageNum"`
	// Includes cloudProviderSnapshot object for each item detailed in the results array section.
	Results []GetFederatedSettingsIdentityProvidersResult `pulumi:"results"`
}

func LookupFederatedSettingsIdentityProvidersOutput(ctx *pulumi.Context, args LookupFederatedSettingsIdentityProvidersOutputArgs, opts ...pulumi.InvokeOption) LookupFederatedSettingsIdentityProvidersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupFederatedSettingsIdentityProvidersResult, error) {
			args := v.(LookupFederatedSettingsIdentityProvidersArgs)
			r, err := LookupFederatedSettingsIdentityProviders(ctx, &args, opts...)
			var s LookupFederatedSettingsIdentityProvidersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupFederatedSettingsIdentityProvidersResultOutput)
}

// A collection of arguments for invoking getFederatedSettingsIdentityProviders.
type LookupFederatedSettingsIdentityProvidersOutputArgs struct {
	// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
	FederationSettingsId pulumi.StringInput `pulumi:"federationSettingsId"`
	// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
	ItemsPerPage pulumi.IntPtrInput `pulumi:"itemsPerPage"`
	// The page to return. Defaults to `1`.
	PageNum pulumi.IntPtrInput `pulumi:"pageNum"`
}

func (LookupFederatedSettingsIdentityProvidersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFederatedSettingsIdentityProvidersArgs)(nil)).Elem()
}

// A collection of values returned by getFederatedSettingsIdentityProviders.
type LookupFederatedSettingsIdentityProvidersResultOutput struct{ *pulumi.OutputState }

func (LookupFederatedSettingsIdentityProvidersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFederatedSettingsIdentityProvidersResult)(nil)).Elem()
}

func (o LookupFederatedSettingsIdentityProvidersResultOutput) ToLookupFederatedSettingsIdentityProvidersResultOutput() LookupFederatedSettingsIdentityProvidersResultOutput {
	return o
}

func (o LookupFederatedSettingsIdentityProvidersResultOutput) ToLookupFederatedSettingsIdentityProvidersResultOutputWithContext(ctx context.Context) LookupFederatedSettingsIdentityProvidersResultOutput {
	return o
}

// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
func (o LookupFederatedSettingsIdentityProvidersResultOutput) FederationSettingsId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProvidersResult) string { return v.FederationSettingsId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupFederatedSettingsIdentityProvidersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProvidersResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupFederatedSettingsIdentityProvidersResultOutput) ItemsPerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProvidersResult) *int { return v.ItemsPerPage }).(pulumi.IntPtrOutput)
}

func (o LookupFederatedSettingsIdentityProvidersResultOutput) PageNum() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProvidersResult) *int { return v.PageNum }).(pulumi.IntPtrOutput)
}

// Includes cloudProviderSnapshot object for each item detailed in the results array section.
func (o LookupFederatedSettingsIdentityProvidersResultOutput) Results() GetFederatedSettingsIdentityProvidersResultArrayOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProvidersResult) []GetFederatedSettingsIdentityProvidersResult {
		return v.Results
	}).(GetFederatedSettingsIdentityProvidersResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFederatedSettingsIdentityProvidersResultOutput{})
}
