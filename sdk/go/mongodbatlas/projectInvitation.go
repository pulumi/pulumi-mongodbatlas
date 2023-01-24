// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
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
//			_, err := mongodbatlas.NewProjectInvitation(ctx, "test", &mongodbatlas.ProjectInvitationArgs{
//				ProjectId: pulumi.String("<PROJECT-ID>"),
//				Roles: pulumi.StringArray{
//					pulumi.String("GROUP_DATA_ACCESS_READ_WRITE"),
//				},
//				Username: pulumi.String("test-acc-username"),
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
//			_, err := mongodbatlas.NewProjectInvitation(ctx, "test", &mongodbatlas.ProjectInvitationArgs{
//				ProjectId: pulumi.String("<PROJECT-ID>"),
//				Roles: pulumi.StringArray{
//					pulumi.String("GROUP_READ_ONLY"),
//					pulumi.String("GROUP_DATA_ACCESS_READ_ONLY"),
//				},
//				Username: pulumi.String("test-acc-username"),
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
// ~> **IMPORTANT:** A project invitation can **not** be imported once it has been accepted. Import a user's invitation to a project by separating the `project_id` and the `username` with a hyphen
//
// ```sh
//
//	$ pulumi import mongodbatlas:index/projectInvitation:ProjectInvitation my_user 1112222b3bf99403840e8934-my_user@mongodb.com
//
// ```
type ProjectInvitation struct {
	pulumi.CustomResourceState

	// Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
	ExpiresAt pulumi.StringOutput `pulumi:"expiresAt"`
	// Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
	InvitationId pulumi.StringOutput `pulumi:"invitationId"`
	// Atlas user who invited `username` to the project.
	InviterUsername pulumi.StringOutput `pulumi:"inviterUsername"`
	// Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewProjectInvitation registers a new resource with the given unique name, arguments, and options.
func NewProjectInvitation(ctx *pulumi.Context,
	name string, args *ProjectInvitationArgs, opts ...pulumi.ResourceOption) (*ProjectInvitation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.Roles == nil {
		return nil, errors.New("invalid value for required argument 'Roles'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	var resource ProjectInvitation
	err := ctx.RegisterResource("mongodbatlas:index/projectInvitation:ProjectInvitation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectInvitation gets an existing ProjectInvitation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectInvitation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectInvitationState, opts ...pulumi.ResourceOption) (*ProjectInvitation, error) {
	var resource ProjectInvitation
	err := ctx.ReadResource("mongodbatlas:index/projectInvitation:ProjectInvitation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectInvitation resources.
type projectInvitationState struct {
	// Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
	CreatedAt *string `pulumi:"createdAt"`
	// Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
	ExpiresAt *string `pulumi:"expiresAt"`
	// Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
	InvitationId *string `pulumi:"invitationId"`
	// Atlas user who invited `username` to the project.
	InviterUsername *string `pulumi:"inviterUsername"`
	// Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
	ProjectId *string `pulumi:"projectId"`
	// List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
	Roles []string `pulumi:"roles"`
	// Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
	Username *string `pulumi:"username"`
}

type ProjectInvitationState struct {
	// Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
	CreatedAt pulumi.StringPtrInput
	// Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
	ExpiresAt pulumi.StringPtrInput
	// Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
	InvitationId pulumi.StringPtrInput
	// Atlas user who invited `username` to the project.
	InviterUsername pulumi.StringPtrInput
	// Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
	ProjectId pulumi.StringPtrInput
	// List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
	Roles pulumi.StringArrayInput
	// Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
	Username pulumi.StringPtrInput
}

func (ProjectInvitationState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectInvitationState)(nil)).Elem()
}

type projectInvitationArgs struct {
	// Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
	ProjectId string `pulumi:"projectId"`
	// List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
	Roles []string `pulumi:"roles"`
	// Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a ProjectInvitation resource.
type ProjectInvitationArgs struct {
	// Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
	ProjectId pulumi.StringInput
	// List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
	Roles pulumi.StringArrayInput
	// Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
	Username pulumi.StringInput
}

func (ProjectInvitationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectInvitationArgs)(nil)).Elem()
}

type ProjectInvitationInput interface {
	pulumi.Input

	ToProjectInvitationOutput() ProjectInvitationOutput
	ToProjectInvitationOutputWithContext(ctx context.Context) ProjectInvitationOutput
}

func (*ProjectInvitation) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectInvitation)(nil)).Elem()
}

func (i *ProjectInvitation) ToProjectInvitationOutput() ProjectInvitationOutput {
	return i.ToProjectInvitationOutputWithContext(context.Background())
}

func (i *ProjectInvitation) ToProjectInvitationOutputWithContext(ctx context.Context) ProjectInvitationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectInvitationOutput)
}

// ProjectInvitationArrayInput is an input type that accepts ProjectInvitationArray and ProjectInvitationArrayOutput values.
// You can construct a concrete instance of `ProjectInvitationArrayInput` via:
//
//	ProjectInvitationArray{ ProjectInvitationArgs{...} }
type ProjectInvitationArrayInput interface {
	pulumi.Input

	ToProjectInvitationArrayOutput() ProjectInvitationArrayOutput
	ToProjectInvitationArrayOutputWithContext(context.Context) ProjectInvitationArrayOutput
}

type ProjectInvitationArray []ProjectInvitationInput

func (ProjectInvitationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectInvitation)(nil)).Elem()
}

func (i ProjectInvitationArray) ToProjectInvitationArrayOutput() ProjectInvitationArrayOutput {
	return i.ToProjectInvitationArrayOutputWithContext(context.Background())
}

func (i ProjectInvitationArray) ToProjectInvitationArrayOutputWithContext(ctx context.Context) ProjectInvitationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectInvitationArrayOutput)
}

// ProjectInvitationMapInput is an input type that accepts ProjectInvitationMap and ProjectInvitationMapOutput values.
// You can construct a concrete instance of `ProjectInvitationMapInput` via:
//
//	ProjectInvitationMap{ "key": ProjectInvitationArgs{...} }
type ProjectInvitationMapInput interface {
	pulumi.Input

	ToProjectInvitationMapOutput() ProjectInvitationMapOutput
	ToProjectInvitationMapOutputWithContext(context.Context) ProjectInvitationMapOutput
}

type ProjectInvitationMap map[string]ProjectInvitationInput

func (ProjectInvitationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectInvitation)(nil)).Elem()
}

func (i ProjectInvitationMap) ToProjectInvitationMapOutput() ProjectInvitationMapOutput {
	return i.ToProjectInvitationMapOutputWithContext(context.Background())
}

func (i ProjectInvitationMap) ToProjectInvitationMapOutputWithContext(ctx context.Context) ProjectInvitationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectInvitationMapOutput)
}

type ProjectInvitationOutput struct{ *pulumi.OutputState }

func (ProjectInvitationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectInvitation)(nil)).Elem()
}

func (o ProjectInvitationOutput) ToProjectInvitationOutput() ProjectInvitationOutput {
	return o
}

func (o ProjectInvitationOutput) ToProjectInvitationOutputWithContext(ctx context.Context) ProjectInvitationOutput {
	return o
}

// Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
func (o ProjectInvitationOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectInvitation) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
func (o ProjectInvitationOutput) ExpiresAt() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectInvitation) pulumi.StringOutput { return v.ExpiresAt }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
func (o ProjectInvitationOutput) InvitationId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectInvitation) pulumi.StringOutput { return v.InvitationId }).(pulumi.StringOutput)
}

// Atlas user who invited `username` to the project.
func (o ProjectInvitationOutput) InviterUsername() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectInvitation) pulumi.StringOutput { return v.InviterUsername }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
func (o ProjectInvitationOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectInvitation) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
func (o ProjectInvitationOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ProjectInvitation) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
func (o ProjectInvitationOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectInvitation) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

type ProjectInvitationArrayOutput struct{ *pulumi.OutputState }

func (ProjectInvitationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectInvitation)(nil)).Elem()
}

func (o ProjectInvitationArrayOutput) ToProjectInvitationArrayOutput() ProjectInvitationArrayOutput {
	return o
}

func (o ProjectInvitationArrayOutput) ToProjectInvitationArrayOutputWithContext(ctx context.Context) ProjectInvitationArrayOutput {
	return o
}

func (o ProjectInvitationArrayOutput) Index(i pulumi.IntInput) ProjectInvitationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProjectInvitation {
		return vs[0].([]*ProjectInvitation)[vs[1].(int)]
	}).(ProjectInvitationOutput)
}

type ProjectInvitationMapOutput struct{ *pulumi.OutputState }

func (ProjectInvitationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectInvitation)(nil)).Elem()
}

func (o ProjectInvitationMapOutput) ToProjectInvitationMapOutput() ProjectInvitationMapOutput {
	return o
}

func (o ProjectInvitationMapOutput) ToProjectInvitationMapOutputWithContext(ctx context.Context) ProjectInvitationMapOutput {
	return o
}

func (o ProjectInvitationMapOutput) MapIndex(k pulumi.StringInput) ProjectInvitationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProjectInvitation {
		return vs[0].(map[string]*ProjectInvitation)[vs[1].(string)]
	}).(ProjectInvitationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectInvitationInput)(nil)).Elem(), &ProjectInvitation{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectInvitationArrayInput)(nil)).Elem(), ProjectInvitationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectInvitationMapInput)(nil)).Elem(), ProjectInvitationMap{})
	pulumi.RegisterOutputType(ProjectInvitationOutput{})
	pulumi.RegisterOutputType(ProjectInvitationArrayOutput{})
	pulumi.RegisterOutputType(ProjectInvitationMapOutput{})
}
