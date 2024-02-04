// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `FederatedSettingsIdentityProvider` provides a federated settings identity provider data source. Atlas federated settings identity provider provides federated settings outputs for the configured identity provider.
//
// > **NOTE:** OIDC Workforce IdP is currently in preview. To learn more about OIDC and existing limitations see the [OIDC Authentication Documentation](https://www.mongodb.com/docs/atlas/security-oidc/)
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
//			identityProvider, err := mongodbatlas.NewFederatedSettingsIdentityProvider(ctx, "identityProvider", &mongodbatlas.FederatedSettingsIdentityProviderArgs{
//				FederationSettingsId: pulumi.String("627a9687f7f7f7f774de306f14"),
//				AssociatedDomains: pulumi.StringArray{
//					pulumi.String("yourdomain.com"),
//				},
//				SsoDebugEnabled:            pulumi.Bool(true),
//				Status:                     pulumi.String("ACTIVE"),
//				SsoUrl:                     pulumi.String("https://mysso.oktapreview.com/app/mysso_terraformtest_1/exk177f7f7f70h8/sso/saml"),
//				IssuerUri:                  pulumi.String("http://www.okta.com/exk17f7f7f7f7p50h8"),
//				RequestBinding:             pulumi.String("HTTP-POST"),
//				ResponseSignatureAlgorithm: pulumi.String("SHA-256"),
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupFederatedSettingsIdentityProviderOutput(ctx, mongodbatlas.GetFederatedSettingsIdentityProviderOutputArgs{
//				FederationSettingsId: identityProvider.ID(),
//				IdentityProviderId:   pulumi.String("0oad47f7fXnk1297"),
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupFederatedSettingsIdentityProvider(ctx *pulumi.Context, args *LookupFederatedSettingsIdentityProviderArgs, opts ...pulumi.InvokeOption) (*LookupFederatedSettingsIdentityProviderResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupFederatedSettingsIdentityProviderResult
	err := ctx.Invoke("mongodbatlas:index/getFederatedSettingsIdentityProvider:getFederatedSettingsIdentityProvider", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFederatedSettingsIdentityProvider.
type LookupFederatedSettingsIdentityProviderArgs struct {
	// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
	FederationSettingsId string `pulumi:"federationSettingsId"`
	IdentityProviderId   string `pulumi:"identityProviderId"`
}

// A collection of values returned by getFederatedSettingsIdentityProvider.
type LookupFederatedSettingsIdentityProviderResult struct {
	// Assertion consumer service URL to which the IdP sends the SAML response.
	AcsUrl string `pulumi:"acsUrl"`
	// List that contains the configured domains from which users can log in for this IdP.
	AssociatedDomains []string `pulumi:"associatedDomains"`
	// List that contains the organizations from which users can log in for this IdP.
	AssociatedOrgs []GetFederatedSettingsIdentityProviderAssociatedOrg `pulumi:"associatedOrgs"`
	// Identifier of the intended recipient of the token.
	AudienceClaims []string `pulumi:"audienceClaims"`
	// Identifier for the intended audience of the SAML Assertion.
	AudienceUri string `pulumi:"audienceUri"`
	// Client identifier that is assigned to an application by the Identity Provider.
	ClientId string `pulumi:"clientId"`
	// Human-readable label that identifies the IdP.
	DisplayName string `pulumi:"displayName"`
	// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
	FederationSettingsId string `pulumi:"federationSettingsId"`
	// Identifier of the claim which contains IdP Group IDs in the token.
	GroupsClaim string `pulumi:"groupsClaim"`
	// The provider-assigned unique ID for this managed resource.
	Id                 string `pulumi:"id"`
	IdentityProviderId string `pulumi:"identityProviderId"`
	// Unique 24-hexadecimal digit string that identifies the IdP
	IdpId string `pulumi:"idpId"`
	// Identifier for the issuer of the SAML Assertion.
	IssuerUri string `pulumi:"issuerUri"`
	// Unique 20-hexadecimal digit string that identifies the IdP.
	OktaIdpId    string                                            `pulumi:"oktaIdpId"`
	PemFileInfos []GetFederatedSettingsIdentityProviderPemFileInfo `pulumi:"pemFileInfos"`
	// The protocol of the identity provider. Either SAML or OIDC.
	Protocol string `pulumi:"protocol"`
	// SAML Authentication Request Protocol binding used to send the AuthNRequest. Atlas supports the following binding values:
	// - HTTP POST
	// - HTTP REDIRECT
	RequestBinding string `pulumi:"requestBinding"`
	// Scopes that MongoDB applications will request from the authorization endpoint.
	RequestedScopes []string `pulumi:"requestedScopes"`
	// Algorithm used to encrypt the IdP signature. Atlas supports the following signature algorithm values:
	// - SHA-1
	// - SHA-256
	ResponseSignatureAlgorithm string `pulumi:"responseSignatureAlgorithm"`
	// Flag that indicates whether the IdP has enabled Bypass SAML Mode. Enabling this mode generates a URL that allows you bypass SAML and login to your organizations at any point. You can authenticate with this special URL only when Bypass Mode is enabled. Set this parameter to true during testing. This keeps you from getting locked out of MongoDB.
	SsoDebugEnabled bool `pulumi:"ssoDebugEnabled"`
	// URL of the receiver of the SAML AuthNRequest.
	SsoUrl string `pulumi:"ssoUrl"`
	// Label that indicates whether the identity provider is active. The IdP is Inactive until you map at least one domain to the IdP.
	Status string `pulumi:"status"`
	// Identifier of the claim which contains the user ID in the token.
	UserClaim string `pulumi:"userClaim"`
}

func LookupFederatedSettingsIdentityProviderOutput(ctx *pulumi.Context, args LookupFederatedSettingsIdentityProviderOutputArgs, opts ...pulumi.InvokeOption) LookupFederatedSettingsIdentityProviderResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupFederatedSettingsIdentityProviderResult, error) {
			args := v.(LookupFederatedSettingsIdentityProviderArgs)
			r, err := LookupFederatedSettingsIdentityProvider(ctx, &args, opts...)
			var s LookupFederatedSettingsIdentityProviderResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupFederatedSettingsIdentityProviderResultOutput)
}

// A collection of arguments for invoking getFederatedSettingsIdentityProvider.
type LookupFederatedSettingsIdentityProviderOutputArgs struct {
	// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
	FederationSettingsId pulumi.StringInput `pulumi:"federationSettingsId"`
	IdentityProviderId   pulumi.StringInput `pulumi:"identityProviderId"`
}

func (LookupFederatedSettingsIdentityProviderOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFederatedSettingsIdentityProviderArgs)(nil)).Elem()
}

// A collection of values returned by getFederatedSettingsIdentityProvider.
type LookupFederatedSettingsIdentityProviderResultOutput struct{ *pulumi.OutputState }

func (LookupFederatedSettingsIdentityProviderResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFederatedSettingsIdentityProviderResult)(nil)).Elem()
}

func (o LookupFederatedSettingsIdentityProviderResultOutput) ToLookupFederatedSettingsIdentityProviderResultOutput() LookupFederatedSettingsIdentityProviderResultOutput {
	return o
}

func (o LookupFederatedSettingsIdentityProviderResultOutput) ToLookupFederatedSettingsIdentityProviderResultOutputWithContext(ctx context.Context) LookupFederatedSettingsIdentityProviderResultOutput {
	return o
}

// Assertion consumer service URL to which the IdP sends the SAML response.
func (o LookupFederatedSettingsIdentityProviderResultOutput) AcsUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) string { return v.AcsUrl }).(pulumi.StringOutput)
}

// List that contains the configured domains from which users can log in for this IdP.
func (o LookupFederatedSettingsIdentityProviderResultOutput) AssociatedDomains() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) []string { return v.AssociatedDomains }).(pulumi.StringArrayOutput)
}

// List that contains the organizations from which users can log in for this IdP.
func (o LookupFederatedSettingsIdentityProviderResultOutput) AssociatedOrgs() GetFederatedSettingsIdentityProviderAssociatedOrgArrayOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) []GetFederatedSettingsIdentityProviderAssociatedOrg {
		return v.AssociatedOrgs
	}).(GetFederatedSettingsIdentityProviderAssociatedOrgArrayOutput)
}

// Identifier of the intended recipient of the token.
func (o LookupFederatedSettingsIdentityProviderResultOutput) AudienceClaims() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) []string { return v.AudienceClaims }).(pulumi.StringArrayOutput)
}

// Identifier for the intended audience of the SAML Assertion.
func (o LookupFederatedSettingsIdentityProviderResultOutput) AudienceUri() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) string { return v.AudienceUri }).(pulumi.StringOutput)
}

// Client identifier that is assigned to an application by the Identity Provider.
func (o LookupFederatedSettingsIdentityProviderResultOutput) ClientId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) string { return v.ClientId }).(pulumi.StringOutput)
}

// Human-readable label that identifies the IdP.
func (o LookupFederatedSettingsIdentityProviderResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
func (o LookupFederatedSettingsIdentityProviderResultOutput) FederationSettingsId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) string { return v.FederationSettingsId }).(pulumi.StringOutput)
}

// Identifier of the claim which contains IdP Group IDs in the token.
func (o LookupFederatedSettingsIdentityProviderResultOutput) GroupsClaim() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) string { return v.GroupsClaim }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupFederatedSettingsIdentityProviderResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupFederatedSettingsIdentityProviderResultOutput) IdentityProviderId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) string { return v.IdentityProviderId }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies the IdP
func (o LookupFederatedSettingsIdentityProviderResultOutput) IdpId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) string { return v.IdpId }).(pulumi.StringOutput)
}

// Identifier for the issuer of the SAML Assertion.
func (o LookupFederatedSettingsIdentityProviderResultOutput) IssuerUri() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) string { return v.IssuerUri }).(pulumi.StringOutput)
}

// Unique 20-hexadecimal digit string that identifies the IdP.
func (o LookupFederatedSettingsIdentityProviderResultOutput) OktaIdpId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) string { return v.OktaIdpId }).(pulumi.StringOutput)
}

func (o LookupFederatedSettingsIdentityProviderResultOutput) PemFileInfos() GetFederatedSettingsIdentityProviderPemFileInfoArrayOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) []GetFederatedSettingsIdentityProviderPemFileInfo {
		return v.PemFileInfos
	}).(GetFederatedSettingsIdentityProviderPemFileInfoArrayOutput)
}

// The protocol of the identity provider. Either SAML or OIDC.
func (o LookupFederatedSettingsIdentityProviderResultOutput) Protocol() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) string { return v.Protocol }).(pulumi.StringOutput)
}

// SAML Authentication Request Protocol binding used to send the AuthNRequest. Atlas supports the following binding values:
// - HTTP POST
// - HTTP REDIRECT
func (o LookupFederatedSettingsIdentityProviderResultOutput) RequestBinding() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) string { return v.RequestBinding }).(pulumi.StringOutput)
}

// Scopes that MongoDB applications will request from the authorization endpoint.
func (o LookupFederatedSettingsIdentityProviderResultOutput) RequestedScopes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) []string { return v.RequestedScopes }).(pulumi.StringArrayOutput)
}

// Algorithm used to encrypt the IdP signature. Atlas supports the following signature algorithm values:
// - SHA-1
// - SHA-256
func (o LookupFederatedSettingsIdentityProviderResultOutput) ResponseSignatureAlgorithm() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) string { return v.ResponseSignatureAlgorithm }).(pulumi.StringOutput)
}

// Flag that indicates whether the IdP has enabled Bypass SAML Mode. Enabling this mode generates a URL that allows you bypass SAML and login to your organizations at any point. You can authenticate with this special URL only when Bypass Mode is enabled. Set this parameter to true during testing. This keeps you from getting locked out of MongoDB.
func (o LookupFederatedSettingsIdentityProviderResultOutput) SsoDebugEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) bool { return v.SsoDebugEnabled }).(pulumi.BoolOutput)
}

// URL of the receiver of the SAML AuthNRequest.
func (o LookupFederatedSettingsIdentityProviderResultOutput) SsoUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) string { return v.SsoUrl }).(pulumi.StringOutput)
}

// Label that indicates whether the identity provider is active. The IdP is Inactive until you map at least one domain to the IdP.
func (o LookupFederatedSettingsIdentityProviderResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) string { return v.Status }).(pulumi.StringOutput)
}

// Identifier of the claim which contains the user ID in the token.
func (o LookupFederatedSettingsIdentityProviderResultOutput) UserClaim() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFederatedSettingsIdentityProviderResult) string { return v.UserClaim }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFederatedSettingsIdentityProviderResultOutput{})
}
