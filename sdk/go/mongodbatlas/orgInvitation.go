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

// ## Example Usage
// ### S
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
//			_, err := mongodbatlas.NewOrgInvitation(ctx, "test0", &mongodbatlas.OrgInvitationArgs{
//				OrgId: pulumi.String("<ORG-ID>"),
//				Roles: pulumi.StringArray{
//					pulumi.String("ORG_OWNER"),
//				},
//				Username: pulumi.String("test0-acc-username"),
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
//			_, err := mongodbatlas.NewOrgInvitation(ctx, "test0", &mongodbatlas.OrgInvitationArgs{
//				OrgId: pulumi.String("<ORG-ID>"),
//				Roles: pulumi.StringArray{
//					pulumi.String("ORG_MEMBER"),
//					pulumi.String("ORG_BILLING_ADMIN"),
//				},
//				Username: pulumi.String("test0-acc-username"),
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
//			_, err := mongodbatlas.NewOrgInvitation(ctx, "test1", &mongodbatlas.OrgInvitationArgs{
//				OrgId: pulumi.String("<ORG-ID>"),
//				Roles: pulumi.StringArray{
//					pulumi.String("ORG_MEMBER"),
//				},
//				TeamsIds: pulumi.StringArray{
//					pulumi.String("<TEAM-0-ID>"),
//					pulumi.String("<TEAM-1-ID>"),
//				},
//				Username: pulumi.String("test1-acc-username"),
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
// ~> **IMPORTANT:** An organization invitation can **not** be imported once it has been accepted. Import a user's invitation to an organization by separating the `org_id` and the `username` with a hyphen
//
// ```sh
//
//	$ pulumi import mongodbatlas:index/orgInvitation:OrgInvitation my_user 1112222b3bf99403840e8934-my_user@mongodb.com
//
// ```
type OrgInvitation struct {
	pulumi.CustomResourceState

	// Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
	ExpiresAt pulumi.StringOutput `pulumi:"expiresAt"`
	// Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
	InvitationId pulumi.StringOutput `pulumi:"invitationId"`
	// Atlas user who invited `username` to the organization.
	InviterUsername pulumi.StringOutput `pulumi:"inviterUsername"`
	// Unique 24-hexadecimal digit string that identifies the organization to which you want to invite a user.
	OrgId pulumi.StringOutput `pulumi:"orgId"`
	// Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
	TeamsIds pulumi.StringArrayOutput `pulumi:"teamsIds"`
	// Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewOrgInvitation registers a new resource with the given unique name, arguments, and options.
func NewOrgInvitation(ctx *pulumi.Context,
	name string, args *OrgInvitationArgs, opts ...pulumi.ResourceOption) (*OrgInvitation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	if args.Roles == nil {
		return nil, errors.New("invalid value for required argument 'Roles'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OrgInvitation
	err := ctx.RegisterResource("mongodbatlas:index/orgInvitation:OrgInvitation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOrgInvitation gets an existing OrgInvitation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOrgInvitation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OrgInvitationState, opts ...pulumi.ResourceOption) (*OrgInvitation, error) {
	var resource OrgInvitation
	err := ctx.ReadResource("mongodbatlas:index/orgInvitation:OrgInvitation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OrgInvitation resources.
type orgInvitationState struct {
	// Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
	CreatedAt *string `pulumi:"createdAt"`
	// Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
	ExpiresAt *string `pulumi:"expiresAt"`
	// Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
	InvitationId *string `pulumi:"invitationId"`
	// Atlas user who invited `username` to the organization.
	InviterUsername *string `pulumi:"inviterUsername"`
	// Unique 24-hexadecimal digit string that identifies the organization to which you want to invite a user.
	OrgId *string `pulumi:"orgId"`
	// Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
	Roles []string `pulumi:"roles"`
	// An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
	TeamsIds []string `pulumi:"teamsIds"`
	// Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
	Username *string `pulumi:"username"`
}

type OrgInvitationState struct {
	// Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
	CreatedAt pulumi.StringPtrInput
	// Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
	ExpiresAt pulumi.StringPtrInput
	// Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
	InvitationId pulumi.StringPtrInput
	// Atlas user who invited `username` to the organization.
	InviterUsername pulumi.StringPtrInput
	// Unique 24-hexadecimal digit string that identifies the organization to which you want to invite a user.
	OrgId pulumi.StringPtrInput
	// Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
	Roles pulumi.StringArrayInput
	// An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
	TeamsIds pulumi.StringArrayInput
	// Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
	Username pulumi.StringPtrInput
}

func (OrgInvitationState) ElementType() reflect.Type {
	return reflect.TypeOf((*orgInvitationState)(nil)).Elem()
}

type orgInvitationArgs struct {
	// Unique 24-hexadecimal digit string that identifies the organization to which you want to invite a user.
	OrgId string `pulumi:"orgId"`
	// Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
	Roles []string `pulumi:"roles"`
	// An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
	TeamsIds []string `pulumi:"teamsIds"`
	// Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a OrgInvitation resource.
type OrgInvitationArgs struct {
	// Unique 24-hexadecimal digit string that identifies the organization to which you want to invite a user.
	OrgId pulumi.StringInput
	// Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
	Roles pulumi.StringArrayInput
	// An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
	TeamsIds pulumi.StringArrayInput
	// Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
	Username pulumi.StringInput
}

func (OrgInvitationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*orgInvitationArgs)(nil)).Elem()
}

type OrgInvitationInput interface {
	pulumi.Input

	ToOrgInvitationOutput() OrgInvitationOutput
	ToOrgInvitationOutputWithContext(ctx context.Context) OrgInvitationOutput
}

func (*OrgInvitation) ElementType() reflect.Type {
	return reflect.TypeOf((**OrgInvitation)(nil)).Elem()
}

func (i *OrgInvitation) ToOrgInvitationOutput() OrgInvitationOutput {
	return i.ToOrgInvitationOutputWithContext(context.Background())
}

func (i *OrgInvitation) ToOrgInvitationOutputWithContext(ctx context.Context) OrgInvitationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrgInvitationOutput)
}

// OrgInvitationArrayInput is an input type that accepts OrgInvitationArray and OrgInvitationArrayOutput values.
// You can construct a concrete instance of `OrgInvitationArrayInput` via:
//
//	OrgInvitationArray{ OrgInvitationArgs{...} }
type OrgInvitationArrayInput interface {
	pulumi.Input

	ToOrgInvitationArrayOutput() OrgInvitationArrayOutput
	ToOrgInvitationArrayOutputWithContext(context.Context) OrgInvitationArrayOutput
}

type OrgInvitationArray []OrgInvitationInput

func (OrgInvitationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrgInvitation)(nil)).Elem()
}

func (i OrgInvitationArray) ToOrgInvitationArrayOutput() OrgInvitationArrayOutput {
	return i.ToOrgInvitationArrayOutputWithContext(context.Background())
}

func (i OrgInvitationArray) ToOrgInvitationArrayOutputWithContext(ctx context.Context) OrgInvitationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrgInvitationArrayOutput)
}

// OrgInvitationMapInput is an input type that accepts OrgInvitationMap and OrgInvitationMapOutput values.
// You can construct a concrete instance of `OrgInvitationMapInput` via:
//
//	OrgInvitationMap{ "key": OrgInvitationArgs{...} }
type OrgInvitationMapInput interface {
	pulumi.Input

	ToOrgInvitationMapOutput() OrgInvitationMapOutput
	ToOrgInvitationMapOutputWithContext(context.Context) OrgInvitationMapOutput
}

type OrgInvitationMap map[string]OrgInvitationInput

func (OrgInvitationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrgInvitation)(nil)).Elem()
}

func (i OrgInvitationMap) ToOrgInvitationMapOutput() OrgInvitationMapOutput {
	return i.ToOrgInvitationMapOutputWithContext(context.Background())
}

func (i OrgInvitationMap) ToOrgInvitationMapOutputWithContext(ctx context.Context) OrgInvitationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrgInvitationMapOutput)
}

type OrgInvitationOutput struct{ *pulumi.OutputState }

func (OrgInvitationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OrgInvitation)(nil)).Elem()
}

func (o OrgInvitationOutput) ToOrgInvitationOutput() OrgInvitationOutput {
	return o
}

func (o OrgInvitationOutput) ToOrgInvitationOutputWithContext(ctx context.Context) OrgInvitationOutput {
	return o
}

// Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
func (o OrgInvitationOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *OrgInvitation) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
func (o OrgInvitationOutput) ExpiresAt() pulumi.StringOutput {
	return o.ApplyT(func(v *OrgInvitation) pulumi.StringOutput { return v.ExpiresAt }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
func (o OrgInvitationOutput) InvitationId() pulumi.StringOutput {
	return o.ApplyT(func(v *OrgInvitation) pulumi.StringOutput { return v.InvitationId }).(pulumi.StringOutput)
}

// Atlas user who invited `username` to the organization.
func (o OrgInvitationOutput) InviterUsername() pulumi.StringOutput {
	return o.ApplyT(func(v *OrgInvitation) pulumi.StringOutput { return v.InviterUsername }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies the organization to which you want to invite a user.
func (o OrgInvitationOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *OrgInvitation) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
func (o OrgInvitationOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OrgInvitation) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
func (o OrgInvitationOutput) TeamsIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OrgInvitation) pulumi.StringArrayOutput { return v.TeamsIds }).(pulumi.StringArrayOutput)
}

// Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
func (o OrgInvitationOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *OrgInvitation) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

type OrgInvitationArrayOutput struct{ *pulumi.OutputState }

func (OrgInvitationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrgInvitation)(nil)).Elem()
}

func (o OrgInvitationArrayOutput) ToOrgInvitationArrayOutput() OrgInvitationArrayOutput {
	return o
}

func (o OrgInvitationArrayOutput) ToOrgInvitationArrayOutputWithContext(ctx context.Context) OrgInvitationArrayOutput {
	return o
}

func (o OrgInvitationArrayOutput) Index(i pulumi.IntInput) OrgInvitationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OrgInvitation {
		return vs[0].([]*OrgInvitation)[vs[1].(int)]
	}).(OrgInvitationOutput)
}

type OrgInvitationMapOutput struct{ *pulumi.OutputState }

func (OrgInvitationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrgInvitation)(nil)).Elem()
}

func (o OrgInvitationMapOutput) ToOrgInvitationMapOutput() OrgInvitationMapOutput {
	return o
}

func (o OrgInvitationMapOutput) ToOrgInvitationMapOutputWithContext(ctx context.Context) OrgInvitationMapOutput {
	return o
}

func (o OrgInvitationMapOutput) MapIndex(k pulumi.StringInput) OrgInvitationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OrgInvitation {
		return vs[0].(map[string]*OrgInvitation)[vs[1].(string)]
	}).(OrgInvitationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OrgInvitationInput)(nil)).Elem(), &OrgInvitation{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrgInvitationArrayInput)(nil)).Elem(), OrgInvitationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrgInvitationMapInput)(nil)).Elem(), OrgInvitationMap{})
	pulumi.RegisterOutputType(OrgInvitationOutput{})
	pulumi.RegisterOutputType(OrgInvitationArrayOutput{})
	pulumi.RegisterOutputType(OrgInvitationMapOutput{})
}
