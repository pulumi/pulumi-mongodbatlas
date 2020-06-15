// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// `.Project` provides a Project resource. This allows project to be created.
//
// > **IMPORTANT WARNING:**  Changing the name of an existing Project in your configuration will result the destruction of that Project and related resources (including Clusters) and the re-creation of those resources.  The provider will inform you of the destroyed/created resources before applying so be sure to verify any change to your environment before applying.
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
	if args == nil || args.OrgId == nil {
		return nil, errors.New("missing required argument 'OrgId'")
	}
	if args == nil {
		args = &ProjectArgs{}
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
