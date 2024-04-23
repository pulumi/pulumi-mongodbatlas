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

// `ClusterOutageSimulation` provides a Cluster Outage Simulation resource. For more details see https://www.mongodb.com/docs/atlas/tutorial/test-resilience/simulate-regional-outage/
//
// Test Outage on Minority of Electable Nodes - Select fewer than half of your electable nodes.
//
// Test Outage on Majority of Electable Nodes - Select at least one more than half of your electable nodes and keep at least one electable node remaining.
//
// **IMPORTANT:** Test Outage on Majority of Electable Nodes will leave the Atlas cluster without a majority quorum. There will be no primary so write operations will not succeed, and reads will succeed only when configured with a suitable [readPreference](https://www.mongodb.com/docs/manual/core/read-preference/). To recover the majority quorum, you will have the option to manually reconfigure your cluster by adding new nodes to existing regions or adding new regions at the risk of losing recent writes, or end the simulation.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
//
// > **IMPORTANT:** This resource cannot be updated.
// **IMPORTANT:** An existing Cluster Outage Simulation cannot be imported as this resource does not support import operation.
//
// ## Example Usage
//
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
//			_, err := mongodbatlas.NewClusterOutageSimulation(ctx, "outage_simulation", &mongodbatlas.ClusterOutageSimulationArgs{
//				ProjectId:   pulumi.String("64707f06c519c20c3a2b1b03"),
//				ClusterName: pulumi.String("Cluster0"),
//				OutageFilters: mongodbatlas.ClusterOutageSimulationOutageFilterArray{
//					&mongodbatlas.ClusterOutageSimulationOutageFilterArgs{
//						CloudProvider: pulumi.String("AWS"),
//						RegionName:    pulumi.String("US_EAST_1"),
//					},
//					&mongodbatlas.ClusterOutageSimulationOutageFilterArgs{
//						CloudProvider: pulumi.String("AWS"),
//						RegionName:    pulumi.String("US_EAST_2"),
//					},
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
//
// ## Import
//
// The `mongodbatlas_cluster_outage_simulation` resource does not support import operation.
//
// See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Cluster-Outage-Simulation) Documentation for more information.
type ClusterOutageSimulation struct {
	pulumi.CustomResourceState

	// Name of the Atlas Cluster that is/will undergoing outage simulation.
	ClusterName pulumi.StringOutput `pulumi:"clusterName"`
	// List of settings that specify the type of cluster outage simulation.
	OutageFilters ClusterOutageSimulationOutageFilterArrayOutput `pulumi:"outageFilters"`
	// The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Unique 24-hexadecimal character string that identifies the outage simulation.
	SimulationId pulumi.StringOutput `pulumi:"simulationId"`
	// Date and time when MongoDB Cloud started the regional outage simulation.
	StartRequestDate pulumi.StringOutput `pulumi:"startRequestDate"`
	// Current phase of the outage simulation:
	State pulumi.StringOutput `pulumi:"state"`
}

// NewClusterOutageSimulation registers a new resource with the given unique name, arguments, and options.
func NewClusterOutageSimulation(ctx *pulumi.Context,
	name string, args *ClusterOutageSimulationArgs, opts ...pulumi.ResourceOption) (*ClusterOutageSimulation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterName == nil {
		return nil, errors.New("invalid value for required argument 'ClusterName'")
	}
	if args.OutageFilters == nil {
		return nil, errors.New("invalid value for required argument 'OutageFilters'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ClusterOutageSimulation
	err := ctx.RegisterResource("mongodbatlas:index/clusterOutageSimulation:ClusterOutageSimulation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterOutageSimulation gets an existing ClusterOutageSimulation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterOutageSimulation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterOutageSimulationState, opts ...pulumi.ResourceOption) (*ClusterOutageSimulation, error) {
	var resource ClusterOutageSimulation
	err := ctx.ReadResource("mongodbatlas:index/clusterOutageSimulation:ClusterOutageSimulation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterOutageSimulation resources.
type clusterOutageSimulationState struct {
	// Name of the Atlas Cluster that is/will undergoing outage simulation.
	ClusterName *string `pulumi:"clusterName"`
	// List of settings that specify the type of cluster outage simulation.
	OutageFilters []ClusterOutageSimulationOutageFilter `pulumi:"outageFilters"`
	// The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
	ProjectId *string `pulumi:"projectId"`
	// Unique 24-hexadecimal character string that identifies the outage simulation.
	SimulationId *string `pulumi:"simulationId"`
	// Date and time when MongoDB Cloud started the regional outage simulation.
	StartRequestDate *string `pulumi:"startRequestDate"`
	// Current phase of the outage simulation:
	State *string `pulumi:"state"`
}

type ClusterOutageSimulationState struct {
	// Name of the Atlas Cluster that is/will undergoing outage simulation.
	ClusterName pulumi.StringPtrInput
	// List of settings that specify the type of cluster outage simulation.
	OutageFilters ClusterOutageSimulationOutageFilterArrayInput
	// The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
	ProjectId pulumi.StringPtrInput
	// Unique 24-hexadecimal character string that identifies the outage simulation.
	SimulationId pulumi.StringPtrInput
	// Date and time when MongoDB Cloud started the regional outage simulation.
	StartRequestDate pulumi.StringPtrInput
	// Current phase of the outage simulation:
	State pulumi.StringPtrInput
}

func (ClusterOutageSimulationState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterOutageSimulationState)(nil)).Elem()
}

type clusterOutageSimulationArgs struct {
	// Name of the Atlas Cluster that is/will undergoing outage simulation.
	ClusterName string `pulumi:"clusterName"`
	// List of settings that specify the type of cluster outage simulation.
	OutageFilters []ClusterOutageSimulationOutageFilter `pulumi:"outageFilters"`
	// The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
	ProjectId string `pulumi:"projectId"`
}

// The set of arguments for constructing a ClusterOutageSimulation resource.
type ClusterOutageSimulationArgs struct {
	// Name of the Atlas Cluster that is/will undergoing outage simulation.
	ClusterName pulumi.StringInput
	// List of settings that specify the type of cluster outage simulation.
	OutageFilters ClusterOutageSimulationOutageFilterArrayInput
	// The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
	ProjectId pulumi.StringInput
}

func (ClusterOutageSimulationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterOutageSimulationArgs)(nil)).Elem()
}

type ClusterOutageSimulationInput interface {
	pulumi.Input

	ToClusterOutageSimulationOutput() ClusterOutageSimulationOutput
	ToClusterOutageSimulationOutputWithContext(ctx context.Context) ClusterOutageSimulationOutput
}

func (*ClusterOutageSimulation) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterOutageSimulation)(nil)).Elem()
}

func (i *ClusterOutageSimulation) ToClusterOutageSimulationOutput() ClusterOutageSimulationOutput {
	return i.ToClusterOutageSimulationOutputWithContext(context.Background())
}

func (i *ClusterOutageSimulation) ToClusterOutageSimulationOutputWithContext(ctx context.Context) ClusterOutageSimulationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterOutageSimulationOutput)
}

// ClusterOutageSimulationArrayInput is an input type that accepts ClusterOutageSimulationArray and ClusterOutageSimulationArrayOutput values.
// You can construct a concrete instance of `ClusterOutageSimulationArrayInput` via:
//
//	ClusterOutageSimulationArray{ ClusterOutageSimulationArgs{...} }
type ClusterOutageSimulationArrayInput interface {
	pulumi.Input

	ToClusterOutageSimulationArrayOutput() ClusterOutageSimulationArrayOutput
	ToClusterOutageSimulationArrayOutputWithContext(context.Context) ClusterOutageSimulationArrayOutput
}

type ClusterOutageSimulationArray []ClusterOutageSimulationInput

func (ClusterOutageSimulationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterOutageSimulation)(nil)).Elem()
}

func (i ClusterOutageSimulationArray) ToClusterOutageSimulationArrayOutput() ClusterOutageSimulationArrayOutput {
	return i.ToClusterOutageSimulationArrayOutputWithContext(context.Background())
}

func (i ClusterOutageSimulationArray) ToClusterOutageSimulationArrayOutputWithContext(ctx context.Context) ClusterOutageSimulationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterOutageSimulationArrayOutput)
}

// ClusterOutageSimulationMapInput is an input type that accepts ClusterOutageSimulationMap and ClusterOutageSimulationMapOutput values.
// You can construct a concrete instance of `ClusterOutageSimulationMapInput` via:
//
//	ClusterOutageSimulationMap{ "key": ClusterOutageSimulationArgs{...} }
type ClusterOutageSimulationMapInput interface {
	pulumi.Input

	ToClusterOutageSimulationMapOutput() ClusterOutageSimulationMapOutput
	ToClusterOutageSimulationMapOutputWithContext(context.Context) ClusterOutageSimulationMapOutput
}

type ClusterOutageSimulationMap map[string]ClusterOutageSimulationInput

func (ClusterOutageSimulationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterOutageSimulation)(nil)).Elem()
}

func (i ClusterOutageSimulationMap) ToClusterOutageSimulationMapOutput() ClusterOutageSimulationMapOutput {
	return i.ToClusterOutageSimulationMapOutputWithContext(context.Background())
}

func (i ClusterOutageSimulationMap) ToClusterOutageSimulationMapOutputWithContext(ctx context.Context) ClusterOutageSimulationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterOutageSimulationMapOutput)
}

type ClusterOutageSimulationOutput struct{ *pulumi.OutputState }

func (ClusterOutageSimulationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterOutageSimulation)(nil)).Elem()
}

func (o ClusterOutageSimulationOutput) ToClusterOutageSimulationOutput() ClusterOutageSimulationOutput {
	return o
}

func (o ClusterOutageSimulationOutput) ToClusterOutageSimulationOutputWithContext(ctx context.Context) ClusterOutageSimulationOutput {
	return o
}

// Name of the Atlas Cluster that is/will undergoing outage simulation.
func (o ClusterOutageSimulationOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterOutageSimulation) pulumi.StringOutput { return v.ClusterName }).(pulumi.StringOutput)
}

// List of settings that specify the type of cluster outage simulation.
func (o ClusterOutageSimulationOutput) OutageFilters() ClusterOutageSimulationOutageFilterArrayOutput {
	return o.ApplyT(func(v *ClusterOutageSimulation) ClusterOutageSimulationOutageFilterArrayOutput {
		return v.OutageFilters
	}).(ClusterOutageSimulationOutageFilterArrayOutput)
}

// The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
func (o ClusterOutageSimulationOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterOutageSimulation) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal character string that identifies the outage simulation.
func (o ClusterOutageSimulationOutput) SimulationId() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterOutageSimulation) pulumi.StringOutput { return v.SimulationId }).(pulumi.StringOutput)
}

// Date and time when MongoDB Cloud started the regional outage simulation.
func (o ClusterOutageSimulationOutput) StartRequestDate() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterOutageSimulation) pulumi.StringOutput { return v.StartRequestDate }).(pulumi.StringOutput)
}

// Current phase of the outage simulation:
func (o ClusterOutageSimulationOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterOutageSimulation) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

type ClusterOutageSimulationArrayOutput struct{ *pulumi.OutputState }

func (ClusterOutageSimulationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterOutageSimulation)(nil)).Elem()
}

func (o ClusterOutageSimulationArrayOutput) ToClusterOutageSimulationArrayOutput() ClusterOutageSimulationArrayOutput {
	return o
}

func (o ClusterOutageSimulationArrayOutput) ToClusterOutageSimulationArrayOutputWithContext(ctx context.Context) ClusterOutageSimulationArrayOutput {
	return o
}

func (o ClusterOutageSimulationArrayOutput) Index(i pulumi.IntInput) ClusterOutageSimulationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClusterOutageSimulation {
		return vs[0].([]*ClusterOutageSimulation)[vs[1].(int)]
	}).(ClusterOutageSimulationOutput)
}

type ClusterOutageSimulationMapOutput struct{ *pulumi.OutputState }

func (ClusterOutageSimulationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterOutageSimulation)(nil)).Elem()
}

func (o ClusterOutageSimulationMapOutput) ToClusterOutageSimulationMapOutput() ClusterOutageSimulationMapOutput {
	return o
}

func (o ClusterOutageSimulationMapOutput) ToClusterOutageSimulationMapOutputWithContext(ctx context.Context) ClusterOutageSimulationMapOutput {
	return o
}

func (o ClusterOutageSimulationMapOutput) MapIndex(k pulumi.StringInput) ClusterOutageSimulationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClusterOutageSimulation {
		return vs[0].(map[string]*ClusterOutageSimulation)[vs[1].(string)]
	}).(ClusterOutageSimulationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterOutageSimulationInput)(nil)).Elem(), &ClusterOutageSimulation{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterOutageSimulationArrayInput)(nil)).Elem(), ClusterOutageSimulationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterOutageSimulationMapInput)(nil)).Elem(), ClusterOutageSimulationMap{})
	pulumi.RegisterOutputType(ClusterOutageSimulationOutput{})
	pulumi.RegisterOutputType(ClusterOutageSimulationArrayOutput{})
	pulumi.RegisterOutputType(ClusterOutageSimulationMapOutput{})
}
