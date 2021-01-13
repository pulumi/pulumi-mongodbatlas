// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// ## Import
//
// Project must be imported using project ID, e.g.
//
// ```sh
//  $ pulumi import mongodbatlas:index/project:Project my_project 5d09d6a59ccf6445652a444a
// ```
//
//  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/projects/) - [and MongoDB Atlas API - Teams](https://docs.atlas.mongodb.com/reference/api/teams/) Documentation for more information.
type Project struct {
	pulumi.CustomResourceState

	// The number of Atlas clusters deployed in the project..
	ClusterCount pulumi.IntOutput `pulumi:"clusterCount"`
	// The ISO-8601-formatted timestamp of when Atlas created the project..
	Created pulumi.StringOutput `pulumi:"created"`
	// The name of the project you want to create. (Cannot be changed via this Provider after creation.)
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the organization you want to create the project within.
	OrgId pulumi.StringOutput    `pulumi:"orgId"`
	Teams ProjectTeamArrayOutput `pulumi:"teams"`
}

// NewProject registers a new resource with the given unique name, arguments, and options.
func NewProject(ctx *pulumi.Context,
	name string, args *ProjectArgs, opts ...pulumi.ResourceOption) (*Project, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	var resource Project
	err := ctx.RegisterResource("mongodbatlas:index/project:Project", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProject gets an existing Project resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectState, opts ...pulumi.ResourceOption) (*Project, error) {
	var resource Project
	err := ctx.ReadResource("mongodbatlas:index/project:Project", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Project resources.
type projectState struct {
	// The number of Atlas clusters deployed in the project..
	ClusterCount *int `pulumi:"clusterCount"`
	// The ISO-8601-formatted timestamp of when Atlas created the project..
	Created *string `pulumi:"created"`
	// The name of the project you want to create. (Cannot be changed via this Provider after creation.)
	Name *string `pulumi:"name"`
	// The ID of the organization you want to create the project within.
	OrgId *string       `pulumi:"orgId"`
	Teams []ProjectTeam `pulumi:"teams"`
}

type ProjectState struct {
	// The number of Atlas clusters deployed in the project..
	ClusterCount pulumi.IntPtrInput
	// The ISO-8601-formatted timestamp of when Atlas created the project..
	Created pulumi.StringPtrInput
	// The name of the project you want to create. (Cannot be changed via this Provider after creation.)
	Name pulumi.StringPtrInput
	// The ID of the organization you want to create the project within.
	OrgId pulumi.StringPtrInput
	Teams ProjectTeamArrayInput
}

func (ProjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectState)(nil)).Elem()
}

type projectArgs struct {
	// The name of the project you want to create. (Cannot be changed via this Provider after creation.)
	Name *string `pulumi:"name"`
	// The ID of the organization you want to create the project within.
	OrgId string        `pulumi:"orgId"`
	Teams []ProjectTeam `pulumi:"teams"`
}

// The set of arguments for constructing a Project resource.
type ProjectArgs struct {
	// The name of the project you want to create. (Cannot be changed via this Provider after creation.)
	Name pulumi.StringPtrInput
	// The ID of the organization you want to create the project within.
	OrgId pulumi.StringInput
	Teams ProjectTeamArrayInput
}

func (ProjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectArgs)(nil)).Elem()
}

type ProjectInput interface {
	pulumi.Input

	ToProjectOutput() ProjectOutput
	ToProjectOutputWithContext(ctx context.Context) ProjectOutput
}

func (Project) ElementType() reflect.Type {
	return reflect.TypeOf((*Project)(nil)).Elem()
}

func (i Project) ToProjectOutput() ProjectOutput {
	return i.ToProjectOutputWithContext(context.Background())
}

func (i Project) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectOutput)
}

type ProjectOutput struct {
	*pulumi.OutputState
}

func (ProjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProjectOutput)(nil)).Elem()
}

func (o ProjectOutput) ToProjectOutput() ProjectOutput {
	return o
}

func (o ProjectOutput) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ProjectOutput{})
}
