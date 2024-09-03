// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// # Resource: FederatedSettingsIdentityProvider
//
// `FederatedSettingsIdentityProvider` provides an Atlas federated settings identity provider resource provides a subset of settings to be maintained post import of the existing resource.
//
// ## Example Usage
//
// > **IMPORTANT** If you want to use a SAML Identity Provider, you **MUST** import this resource before you can manage it with this provider.
//
// SAML IdP:
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
//			_, err := mongodbatlas.NewFederatedSettingsIdentityProvider(ctx, "identity_provider", &mongodbatlas.FederatedSettingsIdentityProviderArgs{
//				FederationSettingsId: pulumi.String("627a9687f7f7f7f774de306f14"),
//				Name:                 pulumi.String("mongodb_federation_test"),
//				AssociatedDomains: pulumi.StringArray{
//					pulumi.String("yourdomain.com"),
//				},
//				SsoDebugEnabled:            pulumi.Bool(true),
//				Status:                     pulumi.String("ACTIVE"),
//				SsoUrl:                     pulumi.String("https://mysso.oktapreview.com/app/mysso_terraformtestsso/exk17q7f7f7f7f50h8/sso/saml"),
//				IssuerUri:                  pulumi.String("http://www.okta.com/exk17q7f7f7f7fp50h8"),
//				RequestBinding:             pulumi.String("HTTP-POST"),
//				ResponseSignatureAlgorithm: pulumi.String("SHA-256"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// OIDC IdP:
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := mongodbatlas.NewFederatedSettingsIdentityProvider(ctx, "oidc", &mongodbatlas.FederatedSettingsIdentityProviderArgs{
//				FederationSettingsId: pulumi.Any(this.Id),
//				Audience:             pulumi.Any(tokenAudience),
//				AuthorizationType:    pulumi.String("USER"),
//				Description:          pulumi.String("oidc"),
//				IssuerUri:            pulumi.Sprintf("https://sts.windows.net/%v/", thisAzurermUserAssignedIdentity.TenantId),
//				IdpType:              pulumi.String("WORKLOAD"),
//				Name:                 pulumi.String("OIDC-for-azure"),
//				Protocol:             pulumi.String("OIDC"),
//				UserClaim:            pulumi.String("sub"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Identity Provider __must__ be imported before using federation_settings_id-idp_id, e.g.
//
// ```sh
// $ pulumi import mongodbatlas:index/federatedSettingsIdentityProvider:FederatedSettingsIdentityProvider identity_provider 6287a663c660f52b1c441c6c-0oad4fas87jL5Xnk12971234
// ```
// For more information see: [MongoDB Atlas API Reference.](https://www.mongodb.com/docs/atlas/reference/api/federation-configuration/)
type FederatedSettingsIdentityProvider struct {
	pulumi.CustomResourceState

	// List that contains the domains associated with the identity provider.
	AssociatedDomains pulumi.StringArrayOutput `pulumi:"associatedDomains"`
	// Identifier of the intended recipient of the token used in OIDC IdP.
	Audience pulumi.StringPtrOutput `pulumi:"audience"`
	// Indicates whether authorization is granted based on group membership or user ID. Valid values are `GROUP` or `USER`.
	AuthorizationType pulumi.StringPtrOutput `pulumi:"authorizationType"`
	// Client identifier that is assigned to an application by the OIDC Identity Provider.
	ClientId pulumi.StringPtrOutput `pulumi:"clientId"`
	// The description of the identity provider.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
	FederationSettingsId pulumi.StringOutput `pulumi:"federationSettingsId"`
	// Identifier of the claim which contains OIDC IdP Group IDs in the token.
	GroupsClaim pulumi.StringPtrOutput `pulumi:"groupsClaim"`
	// Unique 24-hexadecimal digit string that identifies the IdP.
	IdpId   pulumi.StringOutput `pulumi:"idpId"`
	IdpType pulumi.StringOutput `pulumi:"idpType"`
	// Unique string that identifies the issuer of the IdP.
	IssuerUri pulumi.StringOutput `pulumi:"issuerUri"`
	// Human-readable label that identifies the identity provider.
	Name pulumi.StringOutput `pulumi:"name"`
	// Unique 20-hexadecimal digit string that identifies the IdP.
	OktaIdpId pulumi.StringOutput `pulumi:"oktaIdpId"`
	// The protocol of the identity provider. Either `SAML` or `OIDC`.
	Protocol pulumi.StringOutput `pulumi:"protocol"`
	// SAML Authentication Request Protocol HTTP method binding (`POST` or `REDIRECT`) that Federated Authentication uses to send the authentication request. Atlas supports the following binding values:
	// - HTTP POST
	// - HTTP REDIRECT
	RequestBinding pulumi.StringPtrOutput `pulumi:"requestBinding"`
	// Scopes that MongoDB applications will request from the authorization endpoint used for OIDC IdPs.
	RequestedScopes pulumi.StringArrayOutput `pulumi:"requestedScopes"`
	// Signature algorithm that Federated Authentication uses to encrypt the identity provider signature.  Valid values include ` SHA-1  `and `SHA-256`.
	ResponseSignatureAlgorithm pulumi.StringPtrOutput `pulumi:"responseSignatureAlgorithm"`
	// Flag that indicates whether the identity provider has SSO debug enabled.
	SsoDebugEnabled pulumi.BoolPtrOutput `pulumi:"ssoDebugEnabled"`
	// Unique string that identifies the intended audience of the SAML assertion.
	SsoUrl pulumi.StringPtrOutput `pulumi:"ssoUrl"`
	// String enum that indicates whether the identity provider is active or not. Accepted values are ACTIVE or INACTIVE.
	Status pulumi.StringPtrOutput `pulumi:"status"`
	// Identifier of the claim which contains the user ID in the token used for OIDC IdPs.
	// userClaim is required for OIDC IdP with authorizationType GROUP and USER.
	UserClaim pulumi.StringPtrOutput `pulumi:"userClaim"`
}

// NewFederatedSettingsIdentityProvider registers a new resource with the given unique name, arguments, and options.
func NewFederatedSettingsIdentityProvider(ctx *pulumi.Context,
	name string, args *FederatedSettingsIdentityProviderArgs, opts ...pulumi.ResourceOption) (*FederatedSettingsIdentityProvider, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FederationSettingsId == nil {
		return nil, errors.New("invalid value for required argument 'FederationSettingsId'")
	}
	if args.IssuerUri == nil {
		return nil, errors.New("invalid value for required argument 'IssuerUri'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FederatedSettingsIdentityProvider
	err := ctx.RegisterResource("mongodbatlas:index/federatedSettingsIdentityProvider:FederatedSettingsIdentityProvider", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFederatedSettingsIdentityProvider gets an existing FederatedSettingsIdentityProvider resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFederatedSettingsIdentityProvider(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FederatedSettingsIdentityProviderState, opts ...pulumi.ResourceOption) (*FederatedSettingsIdentityProvider, error) {
	var resource FederatedSettingsIdentityProvider
	err := ctx.ReadResource("mongodbatlas:index/federatedSettingsIdentityProvider:FederatedSettingsIdentityProvider", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FederatedSettingsIdentityProvider resources.
type federatedSettingsIdentityProviderState struct {
	// List that contains the domains associated with the identity provider.
	AssociatedDomains []string `pulumi:"associatedDomains"`
	// Identifier of the intended recipient of the token used in OIDC IdP.
	Audience *string `pulumi:"audience"`
	// Indicates whether authorization is granted based on group membership or user ID. Valid values are `GROUP` or `USER`.
	AuthorizationType *string `pulumi:"authorizationType"`
	// Client identifier that is assigned to an application by the OIDC Identity Provider.
	ClientId *string `pulumi:"clientId"`
	// The description of the identity provider.
	Description *string `pulumi:"description"`
	// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
	FederationSettingsId *string `pulumi:"federationSettingsId"`
	// Identifier of the claim which contains OIDC IdP Group IDs in the token.
	GroupsClaim *string `pulumi:"groupsClaim"`
	// Unique 24-hexadecimal digit string that identifies the IdP.
	IdpId   *string `pulumi:"idpId"`
	IdpType *string `pulumi:"idpType"`
	// Unique string that identifies the issuer of the IdP.
	IssuerUri *string `pulumi:"issuerUri"`
	// Human-readable label that identifies the identity provider.
	Name *string `pulumi:"name"`
	// Unique 20-hexadecimal digit string that identifies the IdP.
	OktaIdpId *string `pulumi:"oktaIdpId"`
	// The protocol of the identity provider. Either `SAML` or `OIDC`.
	Protocol *string `pulumi:"protocol"`
	// SAML Authentication Request Protocol HTTP method binding (`POST` or `REDIRECT`) that Federated Authentication uses to send the authentication request. Atlas supports the following binding values:
	// - HTTP POST
	// - HTTP REDIRECT
	RequestBinding *string `pulumi:"requestBinding"`
	// Scopes that MongoDB applications will request from the authorization endpoint used for OIDC IdPs.
	RequestedScopes []string `pulumi:"requestedScopes"`
	// Signature algorithm that Federated Authentication uses to encrypt the identity provider signature.  Valid values include ` SHA-1  `and `SHA-256`.
	ResponseSignatureAlgorithm *string `pulumi:"responseSignatureAlgorithm"`
	// Flag that indicates whether the identity provider has SSO debug enabled.
	SsoDebugEnabled *bool `pulumi:"ssoDebugEnabled"`
	// Unique string that identifies the intended audience of the SAML assertion.
	SsoUrl *string `pulumi:"ssoUrl"`
	// String enum that indicates whether the identity provider is active or not. Accepted values are ACTIVE or INACTIVE.
	Status *string `pulumi:"status"`
	// Identifier of the claim which contains the user ID in the token used for OIDC IdPs.
	// userClaim is required for OIDC IdP with authorizationType GROUP and USER.
	UserClaim *string `pulumi:"userClaim"`
}

type FederatedSettingsIdentityProviderState struct {
	// List that contains the domains associated with the identity provider.
	AssociatedDomains pulumi.StringArrayInput
	// Identifier of the intended recipient of the token used in OIDC IdP.
	Audience pulumi.StringPtrInput
	// Indicates whether authorization is granted based on group membership or user ID. Valid values are `GROUP` or `USER`.
	AuthorizationType pulumi.StringPtrInput
	// Client identifier that is assigned to an application by the OIDC Identity Provider.
	ClientId pulumi.StringPtrInput
	// The description of the identity provider.
	Description pulumi.StringPtrInput
	// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
	FederationSettingsId pulumi.StringPtrInput
	// Identifier of the claim which contains OIDC IdP Group IDs in the token.
	GroupsClaim pulumi.StringPtrInput
	// Unique 24-hexadecimal digit string that identifies the IdP.
	IdpId   pulumi.StringPtrInput
	IdpType pulumi.StringPtrInput
	// Unique string that identifies the issuer of the IdP.
	IssuerUri pulumi.StringPtrInput
	// Human-readable label that identifies the identity provider.
	Name pulumi.StringPtrInput
	// Unique 20-hexadecimal digit string that identifies the IdP.
	OktaIdpId pulumi.StringPtrInput
	// The protocol of the identity provider. Either `SAML` or `OIDC`.
	Protocol pulumi.StringPtrInput
	// SAML Authentication Request Protocol HTTP method binding (`POST` or `REDIRECT`) that Federated Authentication uses to send the authentication request. Atlas supports the following binding values:
	// - HTTP POST
	// - HTTP REDIRECT
	RequestBinding pulumi.StringPtrInput
	// Scopes that MongoDB applications will request from the authorization endpoint used for OIDC IdPs.
	RequestedScopes pulumi.StringArrayInput
	// Signature algorithm that Federated Authentication uses to encrypt the identity provider signature.  Valid values include ` SHA-1  `and `SHA-256`.
	ResponseSignatureAlgorithm pulumi.StringPtrInput
	// Flag that indicates whether the identity provider has SSO debug enabled.
	SsoDebugEnabled pulumi.BoolPtrInput
	// Unique string that identifies the intended audience of the SAML assertion.
	SsoUrl pulumi.StringPtrInput
	// String enum that indicates whether the identity provider is active or not. Accepted values are ACTIVE or INACTIVE.
	Status pulumi.StringPtrInput
	// Identifier of the claim which contains the user ID in the token used for OIDC IdPs.
	// userClaim is required for OIDC IdP with authorizationType GROUP and USER.
	UserClaim pulumi.StringPtrInput
}

func (FederatedSettingsIdentityProviderState) ElementType() reflect.Type {
	return reflect.TypeOf((*federatedSettingsIdentityProviderState)(nil)).Elem()
}

type federatedSettingsIdentityProviderArgs struct {
	// List that contains the domains associated with the identity provider.
	AssociatedDomains []string `pulumi:"associatedDomains"`
	// Identifier of the intended recipient of the token used in OIDC IdP.
	Audience *string `pulumi:"audience"`
	// Indicates whether authorization is granted based on group membership or user ID. Valid values are `GROUP` or `USER`.
	AuthorizationType *string `pulumi:"authorizationType"`
	// Client identifier that is assigned to an application by the OIDC Identity Provider.
	ClientId *string `pulumi:"clientId"`
	// The description of the identity provider.
	Description *string `pulumi:"description"`
	// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
	FederationSettingsId string `pulumi:"federationSettingsId"`
	// Identifier of the claim which contains OIDC IdP Group IDs in the token.
	GroupsClaim *string `pulumi:"groupsClaim"`
	IdpType     *string `pulumi:"idpType"`
	// Unique string that identifies the issuer of the IdP.
	IssuerUri string `pulumi:"issuerUri"`
	// Human-readable label that identifies the identity provider.
	Name *string `pulumi:"name"`
	// The protocol of the identity provider. Either `SAML` or `OIDC`.
	Protocol *string `pulumi:"protocol"`
	// SAML Authentication Request Protocol HTTP method binding (`POST` or `REDIRECT`) that Federated Authentication uses to send the authentication request. Atlas supports the following binding values:
	// - HTTP POST
	// - HTTP REDIRECT
	RequestBinding *string `pulumi:"requestBinding"`
	// Scopes that MongoDB applications will request from the authorization endpoint used for OIDC IdPs.
	RequestedScopes []string `pulumi:"requestedScopes"`
	// Signature algorithm that Federated Authentication uses to encrypt the identity provider signature.  Valid values include ` SHA-1  `and `SHA-256`.
	ResponseSignatureAlgorithm *string `pulumi:"responseSignatureAlgorithm"`
	// Flag that indicates whether the identity provider has SSO debug enabled.
	SsoDebugEnabled *bool `pulumi:"ssoDebugEnabled"`
	// Unique string that identifies the intended audience of the SAML assertion.
	SsoUrl *string `pulumi:"ssoUrl"`
	// String enum that indicates whether the identity provider is active or not. Accepted values are ACTIVE or INACTIVE.
	Status *string `pulumi:"status"`
	// Identifier of the claim which contains the user ID in the token used for OIDC IdPs.
	// userClaim is required for OIDC IdP with authorizationType GROUP and USER.
	UserClaim *string `pulumi:"userClaim"`
}

// The set of arguments for constructing a FederatedSettingsIdentityProvider resource.
type FederatedSettingsIdentityProviderArgs struct {
	// List that contains the domains associated with the identity provider.
	AssociatedDomains pulumi.StringArrayInput
	// Identifier of the intended recipient of the token used in OIDC IdP.
	Audience pulumi.StringPtrInput
	// Indicates whether authorization is granted based on group membership or user ID. Valid values are `GROUP` or `USER`.
	AuthorizationType pulumi.StringPtrInput
	// Client identifier that is assigned to an application by the OIDC Identity Provider.
	ClientId pulumi.StringPtrInput
	// The description of the identity provider.
	Description pulumi.StringPtrInput
	// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
	FederationSettingsId pulumi.StringInput
	// Identifier of the claim which contains OIDC IdP Group IDs in the token.
	GroupsClaim pulumi.StringPtrInput
	IdpType     pulumi.StringPtrInput
	// Unique string that identifies the issuer of the IdP.
	IssuerUri pulumi.StringInput
	// Human-readable label that identifies the identity provider.
	Name pulumi.StringPtrInput
	// The protocol of the identity provider. Either `SAML` or `OIDC`.
	Protocol pulumi.StringPtrInput
	// SAML Authentication Request Protocol HTTP method binding (`POST` or `REDIRECT`) that Federated Authentication uses to send the authentication request. Atlas supports the following binding values:
	// - HTTP POST
	// - HTTP REDIRECT
	RequestBinding pulumi.StringPtrInput
	// Scopes that MongoDB applications will request from the authorization endpoint used for OIDC IdPs.
	RequestedScopes pulumi.StringArrayInput
	// Signature algorithm that Federated Authentication uses to encrypt the identity provider signature.  Valid values include ` SHA-1  `and `SHA-256`.
	ResponseSignatureAlgorithm pulumi.StringPtrInput
	// Flag that indicates whether the identity provider has SSO debug enabled.
	SsoDebugEnabled pulumi.BoolPtrInput
	// Unique string that identifies the intended audience of the SAML assertion.
	SsoUrl pulumi.StringPtrInput
	// String enum that indicates whether the identity provider is active or not. Accepted values are ACTIVE or INACTIVE.
	Status pulumi.StringPtrInput
	// Identifier of the claim which contains the user ID in the token used for OIDC IdPs.
	// userClaim is required for OIDC IdP with authorizationType GROUP and USER.
	UserClaim pulumi.StringPtrInput
}

func (FederatedSettingsIdentityProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*federatedSettingsIdentityProviderArgs)(nil)).Elem()
}

type FederatedSettingsIdentityProviderInput interface {
	pulumi.Input

	ToFederatedSettingsIdentityProviderOutput() FederatedSettingsIdentityProviderOutput
	ToFederatedSettingsIdentityProviderOutputWithContext(ctx context.Context) FederatedSettingsIdentityProviderOutput
}

func (*FederatedSettingsIdentityProvider) ElementType() reflect.Type {
	return reflect.TypeOf((**FederatedSettingsIdentityProvider)(nil)).Elem()
}

func (i *FederatedSettingsIdentityProvider) ToFederatedSettingsIdentityProviderOutput() FederatedSettingsIdentityProviderOutput {
	return i.ToFederatedSettingsIdentityProviderOutputWithContext(context.Background())
}

func (i *FederatedSettingsIdentityProvider) ToFederatedSettingsIdentityProviderOutputWithContext(ctx context.Context) FederatedSettingsIdentityProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FederatedSettingsIdentityProviderOutput)
}

// FederatedSettingsIdentityProviderArrayInput is an input type that accepts FederatedSettingsIdentityProviderArray and FederatedSettingsIdentityProviderArrayOutput values.
// You can construct a concrete instance of `FederatedSettingsIdentityProviderArrayInput` via:
//
//	FederatedSettingsIdentityProviderArray{ FederatedSettingsIdentityProviderArgs{...} }
type FederatedSettingsIdentityProviderArrayInput interface {
	pulumi.Input

	ToFederatedSettingsIdentityProviderArrayOutput() FederatedSettingsIdentityProviderArrayOutput
	ToFederatedSettingsIdentityProviderArrayOutputWithContext(context.Context) FederatedSettingsIdentityProviderArrayOutput
}

type FederatedSettingsIdentityProviderArray []FederatedSettingsIdentityProviderInput

func (FederatedSettingsIdentityProviderArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FederatedSettingsIdentityProvider)(nil)).Elem()
}

func (i FederatedSettingsIdentityProviderArray) ToFederatedSettingsIdentityProviderArrayOutput() FederatedSettingsIdentityProviderArrayOutput {
	return i.ToFederatedSettingsIdentityProviderArrayOutputWithContext(context.Background())
}

func (i FederatedSettingsIdentityProviderArray) ToFederatedSettingsIdentityProviderArrayOutputWithContext(ctx context.Context) FederatedSettingsIdentityProviderArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FederatedSettingsIdentityProviderArrayOutput)
}

// FederatedSettingsIdentityProviderMapInput is an input type that accepts FederatedSettingsIdentityProviderMap and FederatedSettingsIdentityProviderMapOutput values.
// You can construct a concrete instance of `FederatedSettingsIdentityProviderMapInput` via:
//
//	FederatedSettingsIdentityProviderMap{ "key": FederatedSettingsIdentityProviderArgs{...} }
type FederatedSettingsIdentityProviderMapInput interface {
	pulumi.Input

	ToFederatedSettingsIdentityProviderMapOutput() FederatedSettingsIdentityProviderMapOutput
	ToFederatedSettingsIdentityProviderMapOutputWithContext(context.Context) FederatedSettingsIdentityProviderMapOutput
}

type FederatedSettingsIdentityProviderMap map[string]FederatedSettingsIdentityProviderInput

func (FederatedSettingsIdentityProviderMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FederatedSettingsIdentityProvider)(nil)).Elem()
}

func (i FederatedSettingsIdentityProviderMap) ToFederatedSettingsIdentityProviderMapOutput() FederatedSettingsIdentityProviderMapOutput {
	return i.ToFederatedSettingsIdentityProviderMapOutputWithContext(context.Background())
}

func (i FederatedSettingsIdentityProviderMap) ToFederatedSettingsIdentityProviderMapOutputWithContext(ctx context.Context) FederatedSettingsIdentityProviderMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FederatedSettingsIdentityProviderMapOutput)
}

type FederatedSettingsIdentityProviderOutput struct{ *pulumi.OutputState }

func (FederatedSettingsIdentityProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FederatedSettingsIdentityProvider)(nil)).Elem()
}

func (o FederatedSettingsIdentityProviderOutput) ToFederatedSettingsIdentityProviderOutput() FederatedSettingsIdentityProviderOutput {
	return o
}

func (o FederatedSettingsIdentityProviderOutput) ToFederatedSettingsIdentityProviderOutputWithContext(ctx context.Context) FederatedSettingsIdentityProviderOutput {
	return o
}

// List that contains the domains associated with the identity provider.
func (o FederatedSettingsIdentityProviderOutput) AssociatedDomains() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FederatedSettingsIdentityProvider) pulumi.StringArrayOutput { return v.AssociatedDomains }).(pulumi.StringArrayOutput)
}

// Identifier of the intended recipient of the token used in OIDC IdP.
func (o FederatedSettingsIdentityProviderOutput) Audience() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FederatedSettingsIdentityProvider) pulumi.StringPtrOutput { return v.Audience }).(pulumi.StringPtrOutput)
}

// Indicates whether authorization is granted based on group membership or user ID. Valid values are `GROUP` or `USER`.
func (o FederatedSettingsIdentityProviderOutput) AuthorizationType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FederatedSettingsIdentityProvider) pulumi.StringPtrOutput { return v.AuthorizationType }).(pulumi.StringPtrOutput)
}

// Client identifier that is assigned to an application by the OIDC Identity Provider.
func (o FederatedSettingsIdentityProviderOutput) ClientId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FederatedSettingsIdentityProvider) pulumi.StringPtrOutput { return v.ClientId }).(pulumi.StringPtrOutput)
}

// The description of the identity provider.
func (o FederatedSettingsIdentityProviderOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FederatedSettingsIdentityProvider) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
func (o FederatedSettingsIdentityProviderOutput) FederationSettingsId() pulumi.StringOutput {
	return o.ApplyT(func(v *FederatedSettingsIdentityProvider) pulumi.StringOutput { return v.FederationSettingsId }).(pulumi.StringOutput)
}

// Identifier of the claim which contains OIDC IdP Group IDs in the token.
func (o FederatedSettingsIdentityProviderOutput) GroupsClaim() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FederatedSettingsIdentityProvider) pulumi.StringPtrOutput { return v.GroupsClaim }).(pulumi.StringPtrOutput)
}

// Unique 24-hexadecimal digit string that identifies the IdP.
func (o FederatedSettingsIdentityProviderOutput) IdpId() pulumi.StringOutput {
	return o.ApplyT(func(v *FederatedSettingsIdentityProvider) pulumi.StringOutput { return v.IdpId }).(pulumi.StringOutput)
}

func (o FederatedSettingsIdentityProviderOutput) IdpType() pulumi.StringOutput {
	return o.ApplyT(func(v *FederatedSettingsIdentityProvider) pulumi.StringOutput { return v.IdpType }).(pulumi.StringOutput)
}

// Unique string that identifies the issuer of the IdP.
func (o FederatedSettingsIdentityProviderOutput) IssuerUri() pulumi.StringOutput {
	return o.ApplyT(func(v *FederatedSettingsIdentityProvider) pulumi.StringOutput { return v.IssuerUri }).(pulumi.StringOutput)
}

// Human-readable label that identifies the identity provider.
func (o FederatedSettingsIdentityProviderOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *FederatedSettingsIdentityProvider) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique 20-hexadecimal digit string that identifies the IdP.
func (o FederatedSettingsIdentityProviderOutput) OktaIdpId() pulumi.StringOutput {
	return o.ApplyT(func(v *FederatedSettingsIdentityProvider) pulumi.StringOutput { return v.OktaIdpId }).(pulumi.StringOutput)
}

// The protocol of the identity provider. Either `SAML` or `OIDC`.
func (o FederatedSettingsIdentityProviderOutput) Protocol() pulumi.StringOutput {
	return o.ApplyT(func(v *FederatedSettingsIdentityProvider) pulumi.StringOutput { return v.Protocol }).(pulumi.StringOutput)
}

// SAML Authentication Request Protocol HTTP method binding (`POST` or `REDIRECT`) that Federated Authentication uses to send the authentication request. Atlas supports the following binding values:
// - HTTP POST
// - HTTP REDIRECT
func (o FederatedSettingsIdentityProviderOutput) RequestBinding() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FederatedSettingsIdentityProvider) pulumi.StringPtrOutput { return v.RequestBinding }).(pulumi.StringPtrOutput)
}

// Scopes that MongoDB applications will request from the authorization endpoint used for OIDC IdPs.
func (o FederatedSettingsIdentityProviderOutput) RequestedScopes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FederatedSettingsIdentityProvider) pulumi.StringArrayOutput { return v.RequestedScopes }).(pulumi.StringArrayOutput)
}

// Signature algorithm that Federated Authentication uses to encrypt the identity provider signature.  Valid values include ` SHA-1  `and `SHA-256`.
func (o FederatedSettingsIdentityProviderOutput) ResponseSignatureAlgorithm() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FederatedSettingsIdentityProvider) pulumi.StringPtrOutput { return v.ResponseSignatureAlgorithm }).(pulumi.StringPtrOutput)
}

// Flag that indicates whether the identity provider has SSO debug enabled.
func (o FederatedSettingsIdentityProviderOutput) SsoDebugEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FederatedSettingsIdentityProvider) pulumi.BoolPtrOutput { return v.SsoDebugEnabled }).(pulumi.BoolPtrOutput)
}

// Unique string that identifies the intended audience of the SAML assertion.
func (o FederatedSettingsIdentityProviderOutput) SsoUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FederatedSettingsIdentityProvider) pulumi.StringPtrOutput { return v.SsoUrl }).(pulumi.StringPtrOutput)
}

// String enum that indicates whether the identity provider is active or not. Accepted values are ACTIVE or INACTIVE.
func (o FederatedSettingsIdentityProviderOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FederatedSettingsIdentityProvider) pulumi.StringPtrOutput { return v.Status }).(pulumi.StringPtrOutput)
}

// Identifier of the claim which contains the user ID in the token used for OIDC IdPs.
// userClaim is required for OIDC IdP with authorizationType GROUP and USER.
func (o FederatedSettingsIdentityProviderOutput) UserClaim() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FederatedSettingsIdentityProvider) pulumi.StringPtrOutput { return v.UserClaim }).(pulumi.StringPtrOutput)
}

type FederatedSettingsIdentityProviderArrayOutput struct{ *pulumi.OutputState }

func (FederatedSettingsIdentityProviderArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FederatedSettingsIdentityProvider)(nil)).Elem()
}

func (o FederatedSettingsIdentityProviderArrayOutput) ToFederatedSettingsIdentityProviderArrayOutput() FederatedSettingsIdentityProviderArrayOutput {
	return o
}

func (o FederatedSettingsIdentityProviderArrayOutput) ToFederatedSettingsIdentityProviderArrayOutputWithContext(ctx context.Context) FederatedSettingsIdentityProviderArrayOutput {
	return o
}

func (o FederatedSettingsIdentityProviderArrayOutput) Index(i pulumi.IntInput) FederatedSettingsIdentityProviderOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FederatedSettingsIdentityProvider {
		return vs[0].([]*FederatedSettingsIdentityProvider)[vs[1].(int)]
	}).(FederatedSettingsIdentityProviderOutput)
}

type FederatedSettingsIdentityProviderMapOutput struct{ *pulumi.OutputState }

func (FederatedSettingsIdentityProviderMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FederatedSettingsIdentityProvider)(nil)).Elem()
}

func (o FederatedSettingsIdentityProviderMapOutput) ToFederatedSettingsIdentityProviderMapOutput() FederatedSettingsIdentityProviderMapOutput {
	return o
}

func (o FederatedSettingsIdentityProviderMapOutput) ToFederatedSettingsIdentityProviderMapOutputWithContext(ctx context.Context) FederatedSettingsIdentityProviderMapOutput {
	return o
}

func (o FederatedSettingsIdentityProviderMapOutput) MapIndex(k pulumi.StringInput) FederatedSettingsIdentityProviderOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FederatedSettingsIdentityProvider {
		return vs[0].(map[string]*FederatedSettingsIdentityProvider)[vs[1].(string)]
	}).(FederatedSettingsIdentityProviderOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FederatedSettingsIdentityProviderInput)(nil)).Elem(), &FederatedSettingsIdentityProvider{})
	pulumi.RegisterInputType(reflect.TypeOf((*FederatedSettingsIdentityProviderArrayInput)(nil)).Elem(), FederatedSettingsIdentityProviderArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FederatedSettingsIdentityProviderMapInput)(nil)).Elem(), FederatedSettingsIdentityProviderMap{})
	pulumi.RegisterOutputType(FederatedSettingsIdentityProviderOutput{})
	pulumi.RegisterOutputType(FederatedSettingsIdentityProviderArrayOutput{})
	pulumi.RegisterOutputType(FederatedSettingsIdentityProviderMapOutput{})
}
