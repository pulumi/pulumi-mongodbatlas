// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// `Teams` provides a Team resource. The resource lets you create, edit and delete Teams. Also, Teams can be assigned to multiple projects, and team members’ access to the project is determined by the team’s project role.
//
// > **IMPORTANT:** MongoDB Atlas Team limits: max 250 teams in an organization and max 100 teams per project.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
//
// MongoDB Atlas Team limits: max 250 teams in an organization and max 100 teams per project.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-mongodbatlas/sdk/go/mongodbatlas/"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := mongodbatlas.NewTeams(ctx, "test", &mongodbatlas.TeamsArgs{
// 			OrgId: pulumi.String("<ORGANIZATION-ID>"),
// 			Usernames: pulumi.StringArray{
// 				pulumi.String("user1@email.com"),
// 				pulumi.String("user2@email.com"),
// 				pulumi.String("user3@email.com"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Teams can be imported using the organization ID and team id, in the format ORGID-TEAMID, e.g.
//
// ```sh
//  $ pulumi import mongodbatlas:index/team:Team my_team 1112222b3bf99403840e8934-1112222b3bf99403840e8935
// ```
//
//  See detailed information for arguments and attributes[MongoDB API Teams](https://docs.atlas.mongodb.com/reference/api/teams-create-one/)
type Team struct {
	pulumi.CustomResourceState

	// The name of the team you want to create.
	Name pulumi.StringOutput `pulumi:"name"`
	// The unique identifier for the organization you want to associate the team with.
	OrgId pulumi.StringOutput `pulumi:"orgId"`
	// The unique identifier for the team.
	TeamId pulumi.StringOutput `pulumi:"teamId"`
	// The Atlas usernames (email address). You can only add Atlas users who are part of the organization. Users who have not accepted an invitation to join the organization cannot be added as team members. There is a maximum of 250 Atlas users per team.
	Usernames pulumi.StringArrayOutput `pulumi:"usernames"`
}

// NewTeam registers a new resource with the given unique name, arguments, and options.
func NewTeam(ctx *pulumi.Context,
	name string, args *TeamArgs, opts ...pulumi.ResourceOption) (*Team, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	if args.Usernames == nil {
		return nil, errors.New("invalid value for required argument 'Usernames'")
	}
	var resource Team
	err := ctx.RegisterResource("mongodbatlas:index/team:Team", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTeam gets an existing Team resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTeam(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TeamState, opts ...pulumi.ResourceOption) (*Team, error) {
	var resource Team
	err := ctx.ReadResource("mongodbatlas:index/team:Team", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Team resources.
type teamState struct {
	// The name of the team you want to create.
	Name *string `pulumi:"name"`
	// The unique identifier for the organization you want to associate the team with.
	OrgId *string `pulumi:"orgId"`
	// The unique identifier for the team.
	TeamId *string `pulumi:"teamId"`
	// The Atlas usernames (email address). You can only add Atlas users who are part of the organization. Users who have not accepted an invitation to join the organization cannot be added as team members. There is a maximum of 250 Atlas users per team.
	Usernames []string `pulumi:"usernames"`
}

type TeamState struct {
	// The name of the team you want to create.
	Name pulumi.StringPtrInput
	// The unique identifier for the organization you want to associate the team with.
	OrgId pulumi.StringPtrInput
	// The unique identifier for the team.
	TeamId pulumi.StringPtrInput
	// The Atlas usernames (email address). You can only add Atlas users who are part of the organization. Users who have not accepted an invitation to join the organization cannot be added as team members. There is a maximum of 250 Atlas users per team.
	Usernames pulumi.StringArrayInput
}

func (TeamState) ElementType() reflect.Type {
	return reflect.TypeOf((*teamState)(nil)).Elem()
}

type teamArgs struct {
	// The name of the team you want to create.
	Name *string `pulumi:"name"`
	// The unique identifier for the organization you want to associate the team with.
	OrgId string `pulumi:"orgId"`
	// The Atlas usernames (email address). You can only add Atlas users who are part of the organization. Users who have not accepted an invitation to join the organization cannot be added as team members. There is a maximum of 250 Atlas users per team.
	Usernames []string `pulumi:"usernames"`
}

// The set of arguments for constructing a Team resource.
type TeamArgs struct {
	// The name of the team you want to create.
	Name pulumi.StringPtrInput
	// The unique identifier for the organization you want to associate the team with.
	OrgId pulumi.StringInput
	// The Atlas usernames (email address). You can only add Atlas users who are part of the organization. Users who have not accepted an invitation to join the organization cannot be added as team members. There is a maximum of 250 Atlas users per team.
	Usernames pulumi.StringArrayInput
}

func (TeamArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*teamArgs)(nil)).Elem()
}

type TeamInput interface {
	pulumi.Input

	ToTeamOutput() TeamOutput
	ToTeamOutputWithContext(ctx context.Context) TeamOutput
}

func (*Team) ElementType() reflect.Type {
	return reflect.TypeOf((*Team)(nil))
}

func (i *Team) ToTeamOutput() TeamOutput {
	return i.ToTeamOutputWithContext(context.Background())
}

func (i *Team) ToTeamOutputWithContext(ctx context.Context) TeamOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamOutput)
}

type TeamOutput struct {
	*pulumi.OutputState
}

func (TeamOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Team)(nil))
}

func (o TeamOutput) ToTeamOutput() TeamOutput {
	return o
}

func (o TeamOutput) ToTeamOutputWithContext(ctx context.Context) TeamOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(TeamOutput{})
}
