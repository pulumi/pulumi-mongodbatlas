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
// ### Create And Assign PAK Together
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
//			_, err := mongodbatlas.NewProjectApiKey(ctx, "test", &mongodbatlas.ProjectApiKeyArgs{
//				Description: pulumi.String("Description of your API key"),
//				ProjectId:   pulumi.String("64259ee860c43338194b0f8e"),
//				RoleNames: pulumi.StringArray{
//					pulumi.String("GROUP_OWNER"),
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
// ### Create And Assign PAK To Multiple Projects
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
//			_, err := mongodbatlas.NewProjectApiKey(ctx, "test", &mongodbatlas.ProjectApiKeyArgs{
//				Description: pulumi.String("Description of your API key"),
//				ProjectAssignments: mongodbatlas.ProjectApiKeyProjectAssignmentArray{
//					&mongodbatlas.ProjectApiKeyProjectAssignmentArgs{
//						ProjectId: pulumi.String("64259ee860c43338194b0f8e"),
//						RoleNames: pulumi.StringArray{
//							pulumi.String("GROUP_READ_ONLY"),
//							pulumi.String("GROUP_OWNER"),
//						},
//					},
//					&mongodbatlas.ProjectApiKeyProjectAssignmentArgs{
//						ProjectId: pulumi.String("74259ee860c43338194b0f8e"),
//						RoleNames: pulumi.StringArray{
//							pulumi.String("GROUP_READ_ONLY"),
//						},
//					},
//				},
//				ProjectId: pulumi.String("64259ee860c43338194b0f8e"),
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
// API Keys must be imported using org ID, API Key ID e.g.
//
// ```sh
//
//	$ pulumi import mongodbatlas:index/projectApiKey:ProjectApiKey test 5d09d6a59ccf6445652a444a-6576974933969669
//
// ```
//
//	See [MongoDB Atlas API - API Key](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Programmatic-API-Keys/operation/createProjectApiKey) - Documentation for more information.
type ProjectApiKey struct {
	pulumi.CustomResourceState

	// Unique identifier for this Project API key.
	ApiKeyId pulumi.StringOutput `pulumi:"apiKeyId"`
	// Description of this Project API key.
	Description        pulumi.StringOutput                       `pulumi:"description"`
	PrivateKey         pulumi.StringOutput                       `pulumi:"privateKey"`
	ProjectAssignments ProjectApiKeyProjectAssignmentArrayOutput `pulumi:"projectAssignments"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	PublicKey pulumi.StringOutput `pulumi:"publicKey"`
	// List of Project roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Project.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) describes the valid roles that can be assigned. **DEPRECATED** Use `projectAssignment` instead.
	//
	// > **NOTE:** Project created by API Keys must belong to an existing organization.
	//
	// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to project_assignment
	RoleNames pulumi.StringArrayOutput `pulumi:"roleNames"`
}

// NewProjectApiKey registers a new resource with the given unique name, arguments, and options.
func NewProjectApiKey(ctx *pulumi.Context,
	name string, args *ProjectApiKeyArgs, opts ...pulumi.ResourceOption) (*ProjectApiKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"privateKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ProjectApiKey
	err := ctx.RegisterResource("mongodbatlas:index/projectApiKey:ProjectApiKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectApiKey gets an existing ProjectApiKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectApiKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectApiKeyState, opts ...pulumi.ResourceOption) (*ProjectApiKey, error) {
	var resource ProjectApiKey
	err := ctx.ReadResource("mongodbatlas:index/projectApiKey:ProjectApiKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectApiKey resources.
type projectApiKeyState struct {
	// Unique identifier for this Project API key.
	ApiKeyId *string `pulumi:"apiKeyId"`
	// Description of this Project API key.
	Description        *string                          `pulumi:"description"`
	PrivateKey         *string                          `pulumi:"privateKey"`
	ProjectAssignments []ProjectApiKeyProjectAssignment `pulumi:"projectAssignments"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId *string `pulumi:"projectId"`
	PublicKey *string `pulumi:"publicKey"`
	// List of Project roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Project.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) describes the valid roles that can be assigned. **DEPRECATED** Use `projectAssignment` instead.
	//
	// > **NOTE:** Project created by API Keys must belong to an existing organization.
	//
	// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to project_assignment
	RoleNames []string `pulumi:"roleNames"`
}

type ProjectApiKeyState struct {
	// Unique identifier for this Project API key.
	ApiKeyId pulumi.StringPtrInput
	// Description of this Project API key.
	Description        pulumi.StringPtrInput
	PrivateKey         pulumi.StringPtrInput
	ProjectAssignments ProjectApiKeyProjectAssignmentArrayInput
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId pulumi.StringPtrInput
	PublicKey pulumi.StringPtrInput
	// List of Project roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Project.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) describes the valid roles that can be assigned. **DEPRECATED** Use `projectAssignment` instead.
	//
	// > **NOTE:** Project created by API Keys must belong to an existing organization.
	//
	// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to project_assignment
	RoleNames pulumi.StringArrayInput
}

func (ProjectApiKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectApiKeyState)(nil)).Elem()
}

type projectApiKeyArgs struct {
	// Description of this Project API key.
	Description        string                           `pulumi:"description"`
	ProjectAssignments []ProjectApiKeyProjectAssignment `pulumi:"projectAssignments"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
	// List of Project roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Project.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) describes the valid roles that can be assigned. **DEPRECATED** Use `projectAssignment` instead.
	//
	// > **NOTE:** Project created by API Keys must belong to an existing organization.
	//
	// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to project_assignment
	RoleNames []string `pulumi:"roleNames"`
}

// The set of arguments for constructing a ProjectApiKey resource.
type ProjectApiKeyArgs struct {
	// Description of this Project API key.
	Description        pulumi.StringInput
	ProjectAssignments ProjectApiKeyProjectAssignmentArrayInput
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId pulumi.StringInput
	// List of Project roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Project.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) describes the valid roles that can be assigned. **DEPRECATED** Use `projectAssignment` instead.
	//
	// > **NOTE:** Project created by API Keys must belong to an existing organization.
	//
	// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to project_assignment
	RoleNames pulumi.StringArrayInput
}

func (ProjectApiKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectApiKeyArgs)(nil)).Elem()
}

type ProjectApiKeyInput interface {
	pulumi.Input

	ToProjectApiKeyOutput() ProjectApiKeyOutput
	ToProjectApiKeyOutputWithContext(ctx context.Context) ProjectApiKeyOutput
}

func (*ProjectApiKey) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectApiKey)(nil)).Elem()
}

func (i *ProjectApiKey) ToProjectApiKeyOutput() ProjectApiKeyOutput {
	return i.ToProjectApiKeyOutputWithContext(context.Background())
}

func (i *ProjectApiKey) ToProjectApiKeyOutputWithContext(ctx context.Context) ProjectApiKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectApiKeyOutput)
}

// ProjectApiKeyArrayInput is an input type that accepts ProjectApiKeyArray and ProjectApiKeyArrayOutput values.
// You can construct a concrete instance of `ProjectApiKeyArrayInput` via:
//
//	ProjectApiKeyArray{ ProjectApiKeyArgs{...} }
type ProjectApiKeyArrayInput interface {
	pulumi.Input

	ToProjectApiKeyArrayOutput() ProjectApiKeyArrayOutput
	ToProjectApiKeyArrayOutputWithContext(context.Context) ProjectApiKeyArrayOutput
}

type ProjectApiKeyArray []ProjectApiKeyInput

func (ProjectApiKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectApiKey)(nil)).Elem()
}

func (i ProjectApiKeyArray) ToProjectApiKeyArrayOutput() ProjectApiKeyArrayOutput {
	return i.ToProjectApiKeyArrayOutputWithContext(context.Background())
}

func (i ProjectApiKeyArray) ToProjectApiKeyArrayOutputWithContext(ctx context.Context) ProjectApiKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectApiKeyArrayOutput)
}

// ProjectApiKeyMapInput is an input type that accepts ProjectApiKeyMap and ProjectApiKeyMapOutput values.
// You can construct a concrete instance of `ProjectApiKeyMapInput` via:
//
//	ProjectApiKeyMap{ "key": ProjectApiKeyArgs{...} }
type ProjectApiKeyMapInput interface {
	pulumi.Input

	ToProjectApiKeyMapOutput() ProjectApiKeyMapOutput
	ToProjectApiKeyMapOutputWithContext(context.Context) ProjectApiKeyMapOutput
}

type ProjectApiKeyMap map[string]ProjectApiKeyInput

func (ProjectApiKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectApiKey)(nil)).Elem()
}

func (i ProjectApiKeyMap) ToProjectApiKeyMapOutput() ProjectApiKeyMapOutput {
	return i.ToProjectApiKeyMapOutputWithContext(context.Background())
}

func (i ProjectApiKeyMap) ToProjectApiKeyMapOutputWithContext(ctx context.Context) ProjectApiKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectApiKeyMapOutput)
}

type ProjectApiKeyOutput struct{ *pulumi.OutputState }

func (ProjectApiKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectApiKey)(nil)).Elem()
}

func (o ProjectApiKeyOutput) ToProjectApiKeyOutput() ProjectApiKeyOutput {
	return o
}

func (o ProjectApiKeyOutput) ToProjectApiKeyOutputWithContext(ctx context.Context) ProjectApiKeyOutput {
	return o
}

// Unique identifier for this Project API key.
func (o ProjectApiKeyOutput) ApiKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectApiKey) pulumi.StringOutput { return v.ApiKeyId }).(pulumi.StringOutput)
}

// Description of this Project API key.
func (o ProjectApiKeyOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectApiKey) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

func (o ProjectApiKeyOutput) PrivateKey() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectApiKey) pulumi.StringOutput { return v.PrivateKey }).(pulumi.StringOutput)
}

func (o ProjectApiKeyOutput) ProjectAssignments() ProjectApiKeyProjectAssignmentArrayOutput {
	return o.ApplyT(func(v *ProjectApiKey) ProjectApiKeyProjectAssignmentArrayOutput { return v.ProjectAssignments }).(ProjectApiKeyProjectAssignmentArrayOutput)
}

// Unique 24-hexadecimal digit string that identifies your project.
func (o ProjectApiKeyOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectApiKey) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

func (o ProjectApiKeyOutput) PublicKey() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectApiKey) pulumi.StringOutput { return v.PublicKey }).(pulumi.StringOutput)
}

// List of Project roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Project.  You must specify an array even if you are only associating a single role with the Programmatic API key. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) describes the valid roles that can be assigned. **DEPRECATED** Use `projectAssignment` instead.
//
// > **NOTE:** Project created by API Keys must belong to an existing organization.
//
// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to project_assignment
func (o ProjectApiKeyOutput) RoleNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ProjectApiKey) pulumi.StringArrayOutput { return v.RoleNames }).(pulumi.StringArrayOutput)
}

type ProjectApiKeyArrayOutput struct{ *pulumi.OutputState }

func (ProjectApiKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectApiKey)(nil)).Elem()
}

func (o ProjectApiKeyArrayOutput) ToProjectApiKeyArrayOutput() ProjectApiKeyArrayOutput {
	return o
}

func (o ProjectApiKeyArrayOutput) ToProjectApiKeyArrayOutputWithContext(ctx context.Context) ProjectApiKeyArrayOutput {
	return o
}

func (o ProjectApiKeyArrayOutput) Index(i pulumi.IntInput) ProjectApiKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProjectApiKey {
		return vs[0].([]*ProjectApiKey)[vs[1].(int)]
	}).(ProjectApiKeyOutput)
}

type ProjectApiKeyMapOutput struct{ *pulumi.OutputState }

func (ProjectApiKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectApiKey)(nil)).Elem()
}

func (o ProjectApiKeyMapOutput) ToProjectApiKeyMapOutput() ProjectApiKeyMapOutput {
	return o
}

func (o ProjectApiKeyMapOutput) ToProjectApiKeyMapOutputWithContext(ctx context.Context) ProjectApiKeyMapOutput {
	return o
}

func (o ProjectApiKeyMapOutput) MapIndex(k pulumi.StringInput) ProjectApiKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProjectApiKey {
		return vs[0].(map[string]*ProjectApiKey)[vs[1].(string)]
	}).(ProjectApiKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectApiKeyInput)(nil)).Elem(), &ProjectApiKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectApiKeyArrayInput)(nil)).Elem(), ProjectApiKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectApiKeyMapInput)(nil)).Elem(), ProjectApiKeyMap{})
	pulumi.RegisterOutputType(ProjectApiKeyOutput{})
	pulumi.RegisterOutputType(ProjectApiKeyArrayOutput{})
	pulumi.RegisterOutputType(ProjectApiKeyMapOutput{})
}
