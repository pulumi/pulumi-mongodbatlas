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

// `Organization` provides programmatic management (including creation) of a MongoDB Atlas Organization resource.
//
// > **IMPORTANT NOTE:**  When you establish an Atlas organization using this resource, it automatically generates a set of initial public and private Programmatic API Keys. These key values are vital to store because you'll need to use them to grant access to the newly created Atlas organization. To use this resource, `roleNames` for new API Key must have the ORG_OWNER role specified.
//
// > **IMPORTANT NOTE:** To use this resource, the requesting API Key must have the Organization Owner role. The requesting API Key's organization must be a paying organization. To learn more, see Configure a Paying Organization in the MongoDB Atlas documentation.
//
// > **NOTE** Import command is currently not supported for this resource.
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
//			_, err := mongodbatlas.NewOrganization(ctx, "test", &mongodbatlas.OrganizationArgs{
//				OrgOwnerId:  pulumi.String("6205e5fffff79cde6f"),
//				Name:        pulumi.String("testCreateORG"),
//				Description: pulumi.String("test API key from Org Creation Test"),
//				RoleNames: pulumi.StringArray{
//					pulumi.String("ORG_OWNER"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type Organization struct {
	pulumi.CustomResourceState

	// Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
	ApiAccessListRequired pulumi.BoolOutput   `pulumi:"apiAccessListRequired"`
	Description           pulumi.StringOutput `pulumi:"description"`
	// Unique 24-hexadecimal digit string that identifies the federation to link the newly created organization to. If specified, the proposed Organization Owner of the new organization must have the Organization Owner role in an organization associated with the federation.
	FederationSettingsId pulumi.StringPtrOutput `pulumi:"federationSettingsId"`
	// Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/.
	MultiFactorAuthRequired pulumi.BoolOutput `pulumi:"multiFactorAuthRequired"`
	// The name of the organization you want to create. (Cannot be changed via this Provider after creation.)
	Name pulumi.StringOutput `pulumi:"name"`
	// The organization id.
	OrgId pulumi.StringOutput `pulumi:"orgId"`
	// Unique 24-hexadecimal digit string that identifies the Atlas user that you want to assign the Organization Owner role. This user must be a member of the same organization as the calling API key.  This is only required when authenticating with Programmatic API Keys. [MongoDB Atlas Admin API - Get User By Username](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername)
	OrgOwnerId pulumi.StringOutput `pulumi:"orgOwnerId"`
	PrivateKey pulumi.StringOutput `pulumi:"privateKey"`
	// Public API key value set for the specified organization API key.
	PublicKey pulumi.StringOutput `pulumi:"publicKey"`
	// Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: https://www.mongodb.com/docs/atlas/security-restrict-support-access/.
	RestrictEmployeeAccess pulumi.BoolOutput `pulumi:"restrictEmployeeAccess"`
	// List of Organization roles that the Programmatic API key needs to have. Ensure that you provide at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles that you can assign to a Programmatic API key.
	RoleNames pulumi.StringArrayOutput `pulumi:"roleNames"`
}

// NewOrganization registers a new resource with the given unique name, arguments, and options.
func NewOrganization(ctx *pulumi.Context,
	name string, args *OrganizationArgs, opts ...pulumi.ResourceOption) (*Organization, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.OrgOwnerId == nil {
		return nil, errors.New("invalid value for required argument 'OrgOwnerId'")
	}
	if args.RoleNames == nil {
		return nil, errors.New("invalid value for required argument 'RoleNames'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"privateKey",
		"publicKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Organization
	err := ctx.RegisterResource("mongodbatlas:index/organization:Organization", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOrganization gets an existing Organization resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOrganization(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OrganizationState, opts ...pulumi.ResourceOption) (*Organization, error) {
	var resource Organization
	err := ctx.ReadResource("mongodbatlas:index/organization:Organization", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Organization resources.
type organizationState struct {
	// Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
	ApiAccessListRequired *bool   `pulumi:"apiAccessListRequired"`
	Description           *string `pulumi:"description"`
	// Unique 24-hexadecimal digit string that identifies the federation to link the newly created organization to. If specified, the proposed Organization Owner of the new organization must have the Organization Owner role in an organization associated with the federation.
	FederationSettingsId *string `pulumi:"federationSettingsId"`
	// Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/.
	MultiFactorAuthRequired *bool `pulumi:"multiFactorAuthRequired"`
	// The name of the organization you want to create. (Cannot be changed via this Provider after creation.)
	Name *string `pulumi:"name"`
	// The organization id.
	OrgId *string `pulumi:"orgId"`
	// Unique 24-hexadecimal digit string that identifies the Atlas user that you want to assign the Organization Owner role. This user must be a member of the same organization as the calling API key.  This is only required when authenticating with Programmatic API Keys. [MongoDB Atlas Admin API - Get User By Username](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername)
	OrgOwnerId *string `pulumi:"orgOwnerId"`
	PrivateKey *string `pulumi:"privateKey"`
	// Public API key value set for the specified organization API key.
	PublicKey *string `pulumi:"publicKey"`
	// Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: https://www.mongodb.com/docs/atlas/security-restrict-support-access/.
	RestrictEmployeeAccess *bool `pulumi:"restrictEmployeeAccess"`
	// List of Organization roles that the Programmatic API key needs to have. Ensure that you provide at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles that you can assign to a Programmatic API key.
	RoleNames []string `pulumi:"roleNames"`
}

type OrganizationState struct {
	// Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
	ApiAccessListRequired pulumi.BoolPtrInput
	Description           pulumi.StringPtrInput
	// Unique 24-hexadecimal digit string that identifies the federation to link the newly created organization to. If specified, the proposed Organization Owner of the new organization must have the Organization Owner role in an organization associated with the federation.
	FederationSettingsId pulumi.StringPtrInput
	// Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/.
	MultiFactorAuthRequired pulumi.BoolPtrInput
	// The name of the organization you want to create. (Cannot be changed via this Provider after creation.)
	Name pulumi.StringPtrInput
	// The organization id.
	OrgId pulumi.StringPtrInput
	// Unique 24-hexadecimal digit string that identifies the Atlas user that you want to assign the Organization Owner role. This user must be a member of the same organization as the calling API key.  This is only required when authenticating with Programmatic API Keys. [MongoDB Atlas Admin API - Get User By Username](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername)
	OrgOwnerId pulumi.StringPtrInput
	PrivateKey pulumi.StringPtrInput
	// Public API key value set for the specified organization API key.
	PublicKey pulumi.StringPtrInput
	// Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: https://www.mongodb.com/docs/atlas/security-restrict-support-access/.
	RestrictEmployeeAccess pulumi.BoolPtrInput
	// List of Organization roles that the Programmatic API key needs to have. Ensure that you provide at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles that you can assign to a Programmatic API key.
	RoleNames pulumi.StringArrayInput
}

func (OrganizationState) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationState)(nil)).Elem()
}

type organizationArgs struct {
	// Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
	ApiAccessListRequired *bool  `pulumi:"apiAccessListRequired"`
	Description           string `pulumi:"description"`
	// Unique 24-hexadecimal digit string that identifies the federation to link the newly created organization to. If specified, the proposed Organization Owner of the new organization must have the Organization Owner role in an organization associated with the federation.
	FederationSettingsId *string `pulumi:"federationSettingsId"`
	// Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/.
	MultiFactorAuthRequired *bool `pulumi:"multiFactorAuthRequired"`
	// The name of the organization you want to create. (Cannot be changed via this Provider after creation.)
	Name *string `pulumi:"name"`
	// Unique 24-hexadecimal digit string that identifies the Atlas user that you want to assign the Organization Owner role. This user must be a member of the same organization as the calling API key.  This is only required when authenticating with Programmatic API Keys. [MongoDB Atlas Admin API - Get User By Username](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername)
	OrgOwnerId string `pulumi:"orgOwnerId"`
	// Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: https://www.mongodb.com/docs/atlas/security-restrict-support-access/.
	RestrictEmployeeAccess *bool `pulumi:"restrictEmployeeAccess"`
	// List of Organization roles that the Programmatic API key needs to have. Ensure that you provide at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles that you can assign to a Programmatic API key.
	RoleNames []string `pulumi:"roleNames"`
}

// The set of arguments for constructing a Organization resource.
type OrganizationArgs struct {
	// Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
	ApiAccessListRequired pulumi.BoolPtrInput
	Description           pulumi.StringInput
	// Unique 24-hexadecimal digit string that identifies the federation to link the newly created organization to. If specified, the proposed Organization Owner of the new organization must have the Organization Owner role in an organization associated with the federation.
	FederationSettingsId pulumi.StringPtrInput
	// Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/.
	MultiFactorAuthRequired pulumi.BoolPtrInput
	// The name of the organization you want to create. (Cannot be changed via this Provider after creation.)
	Name pulumi.StringPtrInput
	// Unique 24-hexadecimal digit string that identifies the Atlas user that you want to assign the Organization Owner role. This user must be a member of the same organization as the calling API key.  This is only required when authenticating with Programmatic API Keys. [MongoDB Atlas Admin API - Get User By Username](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername)
	OrgOwnerId pulumi.StringInput
	// Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: https://www.mongodb.com/docs/atlas/security-restrict-support-access/.
	RestrictEmployeeAccess pulumi.BoolPtrInput
	// List of Organization roles that the Programmatic API key needs to have. Ensure that you provide at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles that you can assign to a Programmatic API key.
	RoleNames pulumi.StringArrayInput
}

func (OrganizationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationArgs)(nil)).Elem()
}

type OrganizationInput interface {
	pulumi.Input

	ToOrganizationOutput() OrganizationOutput
	ToOrganizationOutputWithContext(ctx context.Context) OrganizationOutput
}

func (*Organization) ElementType() reflect.Type {
	return reflect.TypeOf((**Organization)(nil)).Elem()
}

func (i *Organization) ToOrganizationOutput() OrganizationOutput {
	return i.ToOrganizationOutputWithContext(context.Background())
}

func (i *Organization) ToOrganizationOutputWithContext(ctx context.Context) OrganizationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationOutput)
}

// OrganizationArrayInput is an input type that accepts OrganizationArray and OrganizationArrayOutput values.
// You can construct a concrete instance of `OrganizationArrayInput` via:
//
//	OrganizationArray{ OrganizationArgs{...} }
type OrganizationArrayInput interface {
	pulumi.Input

	ToOrganizationArrayOutput() OrganizationArrayOutput
	ToOrganizationArrayOutputWithContext(context.Context) OrganizationArrayOutput
}

type OrganizationArray []OrganizationInput

func (OrganizationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Organization)(nil)).Elem()
}

func (i OrganizationArray) ToOrganizationArrayOutput() OrganizationArrayOutput {
	return i.ToOrganizationArrayOutputWithContext(context.Background())
}

func (i OrganizationArray) ToOrganizationArrayOutputWithContext(ctx context.Context) OrganizationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationArrayOutput)
}

// OrganizationMapInput is an input type that accepts OrganizationMap and OrganizationMapOutput values.
// You can construct a concrete instance of `OrganizationMapInput` via:
//
//	OrganizationMap{ "key": OrganizationArgs{...} }
type OrganizationMapInput interface {
	pulumi.Input

	ToOrganizationMapOutput() OrganizationMapOutput
	ToOrganizationMapOutputWithContext(context.Context) OrganizationMapOutput
}

type OrganizationMap map[string]OrganizationInput

func (OrganizationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Organization)(nil)).Elem()
}

func (i OrganizationMap) ToOrganizationMapOutput() OrganizationMapOutput {
	return i.ToOrganizationMapOutputWithContext(context.Background())
}

func (i OrganizationMap) ToOrganizationMapOutputWithContext(ctx context.Context) OrganizationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationMapOutput)
}

type OrganizationOutput struct{ *pulumi.OutputState }

func (OrganizationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Organization)(nil)).Elem()
}

func (o OrganizationOutput) ToOrganizationOutput() OrganizationOutput {
	return o
}

func (o OrganizationOutput) ToOrganizationOutputWithContext(ctx context.Context) OrganizationOutput {
	return o
}

// Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
func (o OrganizationOutput) ApiAccessListRequired() pulumi.BoolOutput {
	return o.ApplyT(func(v *Organization) pulumi.BoolOutput { return v.ApiAccessListRequired }).(pulumi.BoolOutput)
}

func (o OrganizationOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *Organization) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies the federation to link the newly created organization to. If specified, the proposed Organization Owner of the new organization must have the Organization Owner role in an organization associated with the federation.
func (o OrganizationOutput) FederationSettingsId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Organization) pulumi.StringPtrOutput { return v.FederationSettingsId }).(pulumi.StringPtrOutput)
}

// Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/.
func (o OrganizationOutput) MultiFactorAuthRequired() pulumi.BoolOutput {
	return o.ApplyT(func(v *Organization) pulumi.BoolOutput { return v.MultiFactorAuthRequired }).(pulumi.BoolOutput)
}

// The name of the organization you want to create. (Cannot be changed via this Provider after creation.)
func (o OrganizationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Organization) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The organization id.
func (o OrganizationOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Organization) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies the Atlas user that you want to assign the Organization Owner role. This user must be a member of the same organization as the calling API key.  This is only required when authenticating with Programmatic API Keys. [MongoDB Atlas Admin API - Get User By Username](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername)
func (o OrganizationOutput) OrgOwnerId() pulumi.StringOutput {
	return o.ApplyT(func(v *Organization) pulumi.StringOutput { return v.OrgOwnerId }).(pulumi.StringOutput)
}

func (o OrganizationOutput) PrivateKey() pulumi.StringOutput {
	return o.ApplyT(func(v *Organization) pulumi.StringOutput { return v.PrivateKey }).(pulumi.StringOutput)
}

// Public API key value set for the specified organization API key.
func (o OrganizationOutput) PublicKey() pulumi.StringOutput {
	return o.ApplyT(func(v *Organization) pulumi.StringOutput { return v.PublicKey }).(pulumi.StringOutput)
}

// Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: https://www.mongodb.com/docs/atlas/security-restrict-support-access/.
func (o OrganizationOutput) RestrictEmployeeAccess() pulumi.BoolOutput {
	return o.ApplyT(func(v *Organization) pulumi.BoolOutput { return v.RestrictEmployeeAccess }).(pulumi.BoolOutput)
}

// List of Organization roles that the Programmatic API key needs to have. Ensure that you provide at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles that you can assign to a Programmatic API key.
func (o OrganizationOutput) RoleNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Organization) pulumi.StringArrayOutput { return v.RoleNames }).(pulumi.StringArrayOutput)
}

type OrganizationArrayOutput struct{ *pulumi.OutputState }

func (OrganizationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Organization)(nil)).Elem()
}

func (o OrganizationArrayOutput) ToOrganizationArrayOutput() OrganizationArrayOutput {
	return o
}

func (o OrganizationArrayOutput) ToOrganizationArrayOutputWithContext(ctx context.Context) OrganizationArrayOutput {
	return o
}

func (o OrganizationArrayOutput) Index(i pulumi.IntInput) OrganizationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Organization {
		return vs[0].([]*Organization)[vs[1].(int)]
	}).(OrganizationOutput)
}

type OrganizationMapOutput struct{ *pulumi.OutputState }

func (OrganizationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Organization)(nil)).Elem()
}

func (o OrganizationMapOutput) ToOrganizationMapOutput() OrganizationMapOutput {
	return o
}

func (o OrganizationMapOutput) ToOrganizationMapOutputWithContext(ctx context.Context) OrganizationMapOutput {
	return o
}

func (o OrganizationMapOutput) MapIndex(k pulumi.StringInput) OrganizationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Organization {
		return vs[0].(map[string]*Organization)[vs[1].(string)]
	}).(OrganizationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationInput)(nil)).Elem(), &Organization{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationArrayInput)(nil)).Elem(), OrganizationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationMapInput)(nil)).Elem(), OrganizationMap{})
	pulumi.RegisterOutputType(OrganizationOutput{})
	pulumi.RegisterOutputType(OrganizationArrayOutput{})
	pulumi.RegisterOutputType(OrganizationMapOutput{})
}
