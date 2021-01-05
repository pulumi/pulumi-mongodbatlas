// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// `PrivateIpMode` provides a Private IP Mode resource. This allows one to disable Connect via Peering Only mode for a MongoDB Atlas Project.
//
// > **Deprecated Feature**: <br> This feature has been deprecated. Use [Split Horizon connection strings](https://dochub.mongodb.org/core/atlas-horizon-faq) to connect to your cluster. These connection strings allow you to connect using both VPC/VNet Peering and whitelisted public IP addresses. To learn more about support for Split Horizon, see [this FAQ](https://dochub.mongodb.org/core/atlas-horizon-faq). You need this endpoint to [disable Peering Only](https://docs.atlas.mongodb.com/reference/faq/connection-changes/#disable-peering-mode).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-mongodbatlas/sdk/go/mongodbatlas"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := mongodbatlas.NewPrivateIpMode(ctx, "myPrivateIpMode", &mongodbatlas.PrivateIpModeArgs{
// 			Enabled:   pulumi.Bool(false),
// 			ProjectId: pulumi.String("<YOUR PROJECT ID>"),
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
// Project must be imported using project ID, e.g.
//
// ```sh
//  $ pulumi import mongodbatlas:index/privateIpMode:PrivateIpMode my_private_ip_mode 5d09d6a59ccf6445652a444a
// ```
//
//  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/get-private-ip-mode-for-project/)
type PrivateIpMode struct {
	pulumi.CustomResourceState

	// Indicates whether Connect via Peering Only mode is enabled or disabled for an Atlas project
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The unique ID for the project to enable Only Private IP Mode.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
}

// NewPrivateIpMode registers a new resource with the given unique name, arguments, and options.
func NewPrivateIpMode(ctx *pulumi.Context,
	name string, args *PrivateIpModeArgs, opts ...pulumi.ResourceOption) (*PrivateIpMode, error) {
	if args == nil || args.Enabled == nil {
		return nil, errors.New("missing required argument 'Enabled'")
	}
	if args == nil || args.ProjectId == nil {
		return nil, errors.New("missing required argument 'ProjectId'")
	}
	if args == nil {
		args = &PrivateIpModeArgs{}
	}
	var resource PrivateIpMode
	err := ctx.RegisterResource("mongodbatlas:index/privateIpMode:PrivateIpMode", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPrivateIpMode gets an existing PrivateIpMode resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPrivateIpMode(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PrivateIpModeState, opts ...pulumi.ResourceOption) (*PrivateIpMode, error) {
	var resource PrivateIpMode
	err := ctx.ReadResource("mongodbatlas:index/privateIpMode:PrivateIpMode", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PrivateIpMode resources.
type privateIpModeState struct {
	// Indicates whether Connect via Peering Only mode is enabled or disabled for an Atlas project
	Enabled *bool `pulumi:"enabled"`
	// The unique ID for the project to enable Only Private IP Mode.
	ProjectId *string `pulumi:"projectId"`
}

type PrivateIpModeState struct {
	// Indicates whether Connect via Peering Only mode is enabled or disabled for an Atlas project
	Enabled pulumi.BoolPtrInput
	// The unique ID for the project to enable Only Private IP Mode.
	ProjectId pulumi.StringPtrInput
}

func (PrivateIpModeState) ElementType() reflect.Type {
	return reflect.TypeOf((*privateIpModeState)(nil)).Elem()
}

type privateIpModeArgs struct {
	// Indicates whether Connect via Peering Only mode is enabled or disabled for an Atlas project
	Enabled bool `pulumi:"enabled"`
	// The unique ID for the project to enable Only Private IP Mode.
	ProjectId string `pulumi:"projectId"`
}

// The set of arguments for constructing a PrivateIpMode resource.
type PrivateIpModeArgs struct {
	// Indicates whether Connect via Peering Only mode is enabled or disabled for an Atlas project
	Enabled pulumi.BoolInput
	// The unique ID for the project to enable Only Private IP Mode.
	ProjectId pulumi.StringInput
}

func (PrivateIpModeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*privateIpModeArgs)(nil)).Elem()
}

type PrivateIpModeInput interface {
	pulumi.Input

	ToPrivateIpModeOutput() PrivateIpModeOutput
	ToPrivateIpModeOutputWithContext(ctx context.Context) PrivateIpModeOutput
}

func (PrivateIpMode) ElementType() reflect.Type {
	return reflect.TypeOf((*PrivateIpMode)(nil)).Elem()
}

func (i PrivateIpMode) ToPrivateIpModeOutput() PrivateIpModeOutput {
	return i.ToPrivateIpModeOutputWithContext(context.Background())
}

func (i PrivateIpMode) ToPrivateIpModeOutputWithContext(ctx context.Context) PrivateIpModeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateIpModeOutput)
}

type PrivateIpModeOutput struct {
	*pulumi.OutputState
}

func (PrivateIpModeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*PrivateIpModeOutput)(nil)).Elem()
}

func (o PrivateIpModeOutput) ToPrivateIpModeOutput() PrivateIpModeOutput {
	return o
}

func (o PrivateIpModeOutput) ToPrivateIpModeOutputWithContext(ctx context.Context) PrivateIpModeOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(PrivateIpModeOutput{})
}
