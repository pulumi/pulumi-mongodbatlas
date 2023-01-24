// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `ProjectInvitation` describes an invitation to a user to join an Atlas project.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find GROUP-ID in the official documentation.
//
// ## Example Usage
func LookupProjectInvitation(ctx *pulumi.Context, args *LookupProjectInvitationArgs, opts ...pulumi.InvokeOption) (*LookupProjectInvitationResult, error) {
	var rv LookupProjectInvitationResult
	err := ctx.Invoke("mongodbatlas:index/getProjectInvitation:getProjectInvitation", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProjectInvitation.
type LookupProjectInvitationArgs struct {
	// Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
	InvitationId string `pulumi:"invitationId"`
	// Unique 24-hexadecimal digit string that identifies the project to which you invited the user.
	ProjectId string `pulumi:"projectId"`
	// Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
	Username string `pulumi:"username"`
}

// A collection of values returned by getProjectInvitation.
type LookupProjectInvitationResult struct {
	// Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
	CreatedAt string `pulumi:"createdAt"`
	// Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
	ExpiresAt string `pulumi:"expiresAt"`
	// The provider-assigned unique ID for this managed resource.
	Id           string `pulumi:"id"`
	InvitationId string `pulumi:"invitationId"`
	// Atlas user who invited `username` to the project.
	InviterUsername string `pulumi:"inviterUsername"`
	ProjectId       string `pulumi:"projectId"`
	// Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
	Roles    []string `pulumi:"roles"`
	Username string   `pulumi:"username"`
}

func LookupProjectInvitationOutput(ctx *pulumi.Context, args LookupProjectInvitationOutputArgs, opts ...pulumi.InvokeOption) LookupProjectInvitationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupProjectInvitationResult, error) {
			args := v.(LookupProjectInvitationArgs)
			r, err := LookupProjectInvitation(ctx, &args, opts...)
			var s LookupProjectInvitationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupProjectInvitationResultOutput)
}

// A collection of arguments for invoking getProjectInvitation.
type LookupProjectInvitationOutputArgs struct {
	// Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
	InvitationId pulumi.StringInput `pulumi:"invitationId"`
	// Unique 24-hexadecimal digit string that identifies the project to which you invited the user.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
	// Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
	Username pulumi.StringInput `pulumi:"username"`
}

func (LookupProjectInvitationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProjectInvitationArgs)(nil)).Elem()
}

// A collection of values returned by getProjectInvitation.
type LookupProjectInvitationResultOutput struct{ *pulumi.OutputState }

func (LookupProjectInvitationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProjectInvitationResult)(nil)).Elem()
}

func (o LookupProjectInvitationResultOutput) ToLookupProjectInvitationResultOutput() LookupProjectInvitationResultOutput {
	return o
}

func (o LookupProjectInvitationResultOutput) ToLookupProjectInvitationResultOutputWithContext(ctx context.Context) LookupProjectInvitationResultOutput {
	return o
}

// Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
func (o LookupProjectInvitationResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectInvitationResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

// Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
func (o LookupProjectInvitationResultOutput) ExpiresAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectInvitationResult) string { return v.ExpiresAt }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupProjectInvitationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectInvitationResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupProjectInvitationResultOutput) InvitationId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectInvitationResult) string { return v.InvitationId }).(pulumi.StringOutput)
}

// Atlas user who invited `username` to the project.
func (o LookupProjectInvitationResultOutput) InviterUsername() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectInvitationResult) string { return v.InviterUsername }).(pulumi.StringOutput)
}

func (o LookupProjectInvitationResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectInvitationResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
func (o LookupProjectInvitationResultOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupProjectInvitationResult) []string { return v.Roles }).(pulumi.StringArrayOutput)
}

func (o LookupProjectInvitationResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectInvitationResult) string { return v.Username }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupProjectInvitationResultOutput{})
}
