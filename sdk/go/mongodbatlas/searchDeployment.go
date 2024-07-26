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

// ## # Resource: SearchDeployment
//
// `SearchDeployment` provides a Search Deployment resource. The resource lets you create, edit and delete dedicated search nodes in a cluster.
//
// > **NOTE:** For details on supported cloud providers and existing limitations you can visit the [Search Node Documentation](https://www.mongodb.com/docs/atlas/cluster-config/multi-cloud-distribution/#search-nodes-for-workload-isolation).
//
// > **NOTE:** Only a single search deployment resource can be defined for each cluster.
//
// ## Example Usage
type SearchDeployment struct {
	pulumi.CustomResourceState

	// Label that identifies the cluster to return the search nodes for.
	ClusterName pulumi.StringOutput `pulumi:"clusterName"`
	// Unique 24-hexadecimal character string that identifies the project.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// List of settings that configure the search nodes for your cluster. This list is currently limited to defining a single element.
	Specs SearchDeploymentSpecArrayOutput `pulumi:"specs"`
	// Human-readable label that indicates the current operating condition of this search deployment.
	StateName pulumi.StringOutput               `pulumi:"stateName"`
	Timeouts  SearchDeploymentTimeoutsPtrOutput `pulumi:"timeouts"`
}

// NewSearchDeployment registers a new resource with the given unique name, arguments, and options.
func NewSearchDeployment(ctx *pulumi.Context,
	name string, args *SearchDeploymentArgs, opts ...pulumi.ResourceOption) (*SearchDeployment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterName == nil {
		return nil, errors.New("invalid value for required argument 'ClusterName'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.Specs == nil {
		return nil, errors.New("invalid value for required argument 'Specs'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SearchDeployment
	err := ctx.RegisterResource("mongodbatlas:index/searchDeployment:SearchDeployment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSearchDeployment gets an existing SearchDeployment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSearchDeployment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SearchDeploymentState, opts ...pulumi.ResourceOption) (*SearchDeployment, error) {
	var resource SearchDeployment
	err := ctx.ReadResource("mongodbatlas:index/searchDeployment:SearchDeployment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SearchDeployment resources.
type searchDeploymentState struct {
	// Label that identifies the cluster to return the search nodes for.
	ClusterName *string `pulumi:"clusterName"`
	// Unique 24-hexadecimal character string that identifies the project.
	ProjectId *string `pulumi:"projectId"`
	// List of settings that configure the search nodes for your cluster. This list is currently limited to defining a single element.
	Specs []SearchDeploymentSpec `pulumi:"specs"`
	// Human-readable label that indicates the current operating condition of this search deployment.
	StateName *string                   `pulumi:"stateName"`
	Timeouts  *SearchDeploymentTimeouts `pulumi:"timeouts"`
}

type SearchDeploymentState struct {
	// Label that identifies the cluster to return the search nodes for.
	ClusterName pulumi.StringPtrInput
	// Unique 24-hexadecimal character string that identifies the project.
	ProjectId pulumi.StringPtrInput
	// List of settings that configure the search nodes for your cluster. This list is currently limited to defining a single element.
	Specs SearchDeploymentSpecArrayInput
	// Human-readable label that indicates the current operating condition of this search deployment.
	StateName pulumi.StringPtrInput
	Timeouts  SearchDeploymentTimeoutsPtrInput
}

func (SearchDeploymentState) ElementType() reflect.Type {
	return reflect.TypeOf((*searchDeploymentState)(nil)).Elem()
}

type searchDeploymentArgs struct {
	// Label that identifies the cluster to return the search nodes for.
	ClusterName string `pulumi:"clusterName"`
	// Unique 24-hexadecimal character string that identifies the project.
	ProjectId string `pulumi:"projectId"`
	// List of settings that configure the search nodes for your cluster. This list is currently limited to defining a single element.
	Specs    []SearchDeploymentSpec    `pulumi:"specs"`
	Timeouts *SearchDeploymentTimeouts `pulumi:"timeouts"`
}

// The set of arguments for constructing a SearchDeployment resource.
type SearchDeploymentArgs struct {
	// Label that identifies the cluster to return the search nodes for.
	ClusterName pulumi.StringInput
	// Unique 24-hexadecimal character string that identifies the project.
	ProjectId pulumi.StringInput
	// List of settings that configure the search nodes for your cluster. This list is currently limited to defining a single element.
	Specs    SearchDeploymentSpecArrayInput
	Timeouts SearchDeploymentTimeoutsPtrInput
}

func (SearchDeploymentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*searchDeploymentArgs)(nil)).Elem()
}

type SearchDeploymentInput interface {
	pulumi.Input

	ToSearchDeploymentOutput() SearchDeploymentOutput
	ToSearchDeploymentOutputWithContext(ctx context.Context) SearchDeploymentOutput
}

func (*SearchDeployment) ElementType() reflect.Type {
	return reflect.TypeOf((**SearchDeployment)(nil)).Elem()
}

func (i *SearchDeployment) ToSearchDeploymentOutput() SearchDeploymentOutput {
	return i.ToSearchDeploymentOutputWithContext(context.Background())
}

func (i *SearchDeployment) ToSearchDeploymentOutputWithContext(ctx context.Context) SearchDeploymentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SearchDeploymentOutput)
}

// SearchDeploymentArrayInput is an input type that accepts SearchDeploymentArray and SearchDeploymentArrayOutput values.
// You can construct a concrete instance of `SearchDeploymentArrayInput` via:
//
//	SearchDeploymentArray{ SearchDeploymentArgs{...} }
type SearchDeploymentArrayInput interface {
	pulumi.Input

	ToSearchDeploymentArrayOutput() SearchDeploymentArrayOutput
	ToSearchDeploymentArrayOutputWithContext(context.Context) SearchDeploymentArrayOutput
}

type SearchDeploymentArray []SearchDeploymentInput

func (SearchDeploymentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SearchDeployment)(nil)).Elem()
}

func (i SearchDeploymentArray) ToSearchDeploymentArrayOutput() SearchDeploymentArrayOutput {
	return i.ToSearchDeploymentArrayOutputWithContext(context.Background())
}

func (i SearchDeploymentArray) ToSearchDeploymentArrayOutputWithContext(ctx context.Context) SearchDeploymentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SearchDeploymentArrayOutput)
}

// SearchDeploymentMapInput is an input type that accepts SearchDeploymentMap and SearchDeploymentMapOutput values.
// You can construct a concrete instance of `SearchDeploymentMapInput` via:
//
//	SearchDeploymentMap{ "key": SearchDeploymentArgs{...} }
type SearchDeploymentMapInput interface {
	pulumi.Input

	ToSearchDeploymentMapOutput() SearchDeploymentMapOutput
	ToSearchDeploymentMapOutputWithContext(context.Context) SearchDeploymentMapOutput
}

type SearchDeploymentMap map[string]SearchDeploymentInput

func (SearchDeploymentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SearchDeployment)(nil)).Elem()
}

func (i SearchDeploymentMap) ToSearchDeploymentMapOutput() SearchDeploymentMapOutput {
	return i.ToSearchDeploymentMapOutputWithContext(context.Background())
}

func (i SearchDeploymentMap) ToSearchDeploymentMapOutputWithContext(ctx context.Context) SearchDeploymentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SearchDeploymentMapOutput)
}

type SearchDeploymentOutput struct{ *pulumi.OutputState }

func (SearchDeploymentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SearchDeployment)(nil)).Elem()
}

func (o SearchDeploymentOutput) ToSearchDeploymentOutput() SearchDeploymentOutput {
	return o
}

func (o SearchDeploymentOutput) ToSearchDeploymentOutputWithContext(ctx context.Context) SearchDeploymentOutput {
	return o
}

// Label that identifies the cluster to return the search nodes for.
func (o SearchDeploymentOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v *SearchDeployment) pulumi.StringOutput { return v.ClusterName }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal character string that identifies the project.
func (o SearchDeploymentOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *SearchDeployment) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// List of settings that configure the search nodes for your cluster. This list is currently limited to defining a single element.
func (o SearchDeploymentOutput) Specs() SearchDeploymentSpecArrayOutput {
	return o.ApplyT(func(v *SearchDeployment) SearchDeploymentSpecArrayOutput { return v.Specs }).(SearchDeploymentSpecArrayOutput)
}

// Human-readable label that indicates the current operating condition of this search deployment.
func (o SearchDeploymentOutput) StateName() pulumi.StringOutput {
	return o.ApplyT(func(v *SearchDeployment) pulumi.StringOutput { return v.StateName }).(pulumi.StringOutput)
}

func (o SearchDeploymentOutput) Timeouts() SearchDeploymentTimeoutsPtrOutput {
	return o.ApplyT(func(v *SearchDeployment) SearchDeploymentTimeoutsPtrOutput { return v.Timeouts }).(SearchDeploymentTimeoutsPtrOutput)
}

type SearchDeploymentArrayOutput struct{ *pulumi.OutputState }

func (SearchDeploymentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SearchDeployment)(nil)).Elem()
}

func (o SearchDeploymentArrayOutput) ToSearchDeploymentArrayOutput() SearchDeploymentArrayOutput {
	return o
}

func (o SearchDeploymentArrayOutput) ToSearchDeploymentArrayOutputWithContext(ctx context.Context) SearchDeploymentArrayOutput {
	return o
}

func (o SearchDeploymentArrayOutput) Index(i pulumi.IntInput) SearchDeploymentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SearchDeployment {
		return vs[0].([]*SearchDeployment)[vs[1].(int)]
	}).(SearchDeploymentOutput)
}

type SearchDeploymentMapOutput struct{ *pulumi.OutputState }

func (SearchDeploymentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SearchDeployment)(nil)).Elem()
}

func (o SearchDeploymentMapOutput) ToSearchDeploymentMapOutput() SearchDeploymentMapOutput {
	return o
}

func (o SearchDeploymentMapOutput) ToSearchDeploymentMapOutputWithContext(ctx context.Context) SearchDeploymentMapOutput {
	return o
}

func (o SearchDeploymentMapOutput) MapIndex(k pulumi.StringInput) SearchDeploymentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SearchDeployment {
		return vs[0].(map[string]*SearchDeployment)[vs[1].(string)]
	}).(SearchDeploymentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SearchDeploymentInput)(nil)).Elem(), &SearchDeployment{})
	pulumi.RegisterInputType(reflect.TypeOf((*SearchDeploymentArrayInput)(nil)).Elem(), SearchDeploymentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SearchDeploymentMapInput)(nil)).Elem(), SearchDeploymentMap{})
	pulumi.RegisterOutputType(SearchDeploymentOutput{})
	pulumi.RegisterOutputType(SearchDeploymentArrayOutput{})
	pulumi.RegisterOutputType(SearchDeploymentMapOutput{})
}
