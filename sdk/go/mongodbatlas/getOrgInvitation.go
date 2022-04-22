// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `OrgInvitation` describes an invitation for a user to join an Atlas organization.
func LookupOrgInvitation(ctx *pulumi.Context, args *LookupOrgInvitationArgs, opts ...pulumi.InvokeOption) (*LookupOrgInvitationResult, error) {
	var rv LookupOrgInvitationResult
	err := ctx.Invoke("mongodbatlas:index/getOrgInvitation:getOrgInvitation", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOrgInvitation.
type LookupOrgInvitationArgs struct {
	// Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
	InvitationId string `pulumi:"invitationId"`
	// Unique 24-hexadecimal digit string that identifies the organization to which you invited the user.
	OrgId string `pulumi:"orgId"`
	// Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
	Username string `pulumi:"username"`
}

// A collection of values returned by getOrgInvitation.
type LookupOrgInvitationResult struct {
	// Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
	CreatedAt string `pulumi:"createdAt"`
	// Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
	ExpiresAt string `pulumi:"expiresAt"`
	// The provider-assigned unique ID for this managed resource.
	Id           string `pulumi:"id"`
	InvitationId string `pulumi:"invitationId"`
	// Atlas user who invited `username` to the organization.
	InviterUsername string `pulumi:"inviterUsername"`
	OrgId           string `pulumi:"orgId"`
	// Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The following options are available:
	// * ORG_OWNER
	// * ORG_GROUP_CREATOR
	// * ORG_BILLING_ADMIN
	// * ORG_READ_ONLY
	// * ORG_MEMBER
	Roles []string `pulumi:"roles"`
	// An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
	TeamsIds []string `pulumi:"teamsIds"`
	Username string   `pulumi:"username"`
}

func LookupOrgInvitationOutput(ctx *pulumi.Context, args LookupOrgInvitationOutputArgs, opts ...pulumi.InvokeOption) LookupOrgInvitationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupOrgInvitationResult, error) {
			args := v.(LookupOrgInvitationArgs)
			r, err := LookupOrgInvitation(ctx, &args, opts...)
			var s LookupOrgInvitationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupOrgInvitationResultOutput)
}

// A collection of arguments for invoking getOrgInvitation.
type LookupOrgInvitationOutputArgs struct {
	// Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
	InvitationId pulumi.StringInput `pulumi:"invitationId"`
	// Unique 24-hexadecimal digit string that identifies the organization to which you invited the user.
	OrgId pulumi.StringInput `pulumi:"orgId"`
	// Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
	Username pulumi.StringInput `pulumi:"username"`
}

func (LookupOrgInvitationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOrgInvitationArgs)(nil)).Elem()
}

// A collection of values returned by getOrgInvitation.
type LookupOrgInvitationResultOutput struct{ *pulumi.OutputState }

func (LookupOrgInvitationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOrgInvitationResult)(nil)).Elem()
}

func (o LookupOrgInvitationResultOutput) ToLookupOrgInvitationResultOutput() LookupOrgInvitationResultOutput {
	return o
}

func (o LookupOrgInvitationResultOutput) ToLookupOrgInvitationResultOutputWithContext(ctx context.Context) LookupOrgInvitationResultOutput {
	return o
}

// Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
func (o LookupOrgInvitationResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrgInvitationResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

// Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
func (o LookupOrgInvitationResultOutput) ExpiresAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrgInvitationResult) string { return v.ExpiresAt }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupOrgInvitationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrgInvitationResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupOrgInvitationResultOutput) InvitationId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrgInvitationResult) string { return v.InvitationId }).(pulumi.StringOutput)
}

// Atlas user who invited `username` to the organization.
func (o LookupOrgInvitationResultOutput) InviterUsername() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrgInvitationResult) string { return v.InviterUsername }).(pulumi.StringOutput)
}

func (o LookupOrgInvitationResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrgInvitationResult) string { return v.OrgId }).(pulumi.StringOutput)
}

// Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The following options are available:
// * ORG_OWNER
// * ORG_GROUP_CREATOR
// * ORG_BILLING_ADMIN
// * ORG_READ_ONLY
// * ORG_MEMBER
func (o LookupOrgInvitationResultOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupOrgInvitationResult) []string { return v.Roles }).(pulumi.StringArrayOutput)
}

// An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
func (o LookupOrgInvitationResultOutput) TeamsIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupOrgInvitationResult) []string { return v.TeamsIds }).(pulumi.StringArrayOutput)
}

func (o LookupOrgInvitationResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrgInvitationResult) string { return v.Username }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupOrgInvitationResultOutput{})
}
