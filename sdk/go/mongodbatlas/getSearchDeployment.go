// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `SearchDeployment` describes a search node deployment.
//
// ## Example Usage
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
//			_, err := mongodbatlas.LookupSearchDeployment(ctx, &mongodbatlas.LookupSearchDeploymentArgs{
//				ClusterName: "<CLUSTER_NAME>",
//				ProjectId:   "<PROJECT_ID>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSearchDeployment(ctx *pulumi.Context, args *LookupSearchDeploymentArgs, opts ...pulumi.InvokeOption) (*LookupSearchDeploymentResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSearchDeploymentResult
	err := ctx.Invoke("mongodbatlas:index/getSearchDeployment:getSearchDeployment", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSearchDeployment.
type LookupSearchDeploymentArgs struct {
	// The name of the cluster containing a search node deployment.
	ClusterName string `pulumi:"clusterName"`
	// The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getSearchDeployment.
type LookupSearchDeploymentResult struct {
	ClusterName string `pulumi:"clusterName"`
	Id          string `pulumi:"id"`
	ProjectId   string `pulumi:"projectId"`
	// List of settings that configure the search nodes for your cluster. See specs.
	Specs []GetSearchDeploymentSpec `pulumi:"specs"`
	// Human-readable label that indicates the current operating condition of this search node deployment.
	StateName string `pulumi:"stateName"`
}

func LookupSearchDeploymentOutput(ctx *pulumi.Context, args LookupSearchDeploymentOutputArgs, opts ...pulumi.InvokeOption) LookupSearchDeploymentResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSearchDeploymentResult, error) {
			args := v.(LookupSearchDeploymentArgs)
			r, err := LookupSearchDeployment(ctx, &args, opts...)
			var s LookupSearchDeploymentResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSearchDeploymentResultOutput)
}

// A collection of arguments for invoking getSearchDeployment.
type LookupSearchDeploymentOutputArgs struct {
	// The name of the cluster containing a search node deployment.
	ClusterName pulumi.StringInput `pulumi:"clusterName"`
	// The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupSearchDeploymentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSearchDeploymentArgs)(nil)).Elem()
}

// A collection of values returned by getSearchDeployment.
type LookupSearchDeploymentResultOutput struct{ *pulumi.OutputState }

func (LookupSearchDeploymentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSearchDeploymentResult)(nil)).Elem()
}

func (o LookupSearchDeploymentResultOutput) ToLookupSearchDeploymentResultOutput() LookupSearchDeploymentResultOutput {
	return o
}

func (o LookupSearchDeploymentResultOutput) ToLookupSearchDeploymentResultOutputWithContext(ctx context.Context) LookupSearchDeploymentResultOutput {
	return o
}

func (o LookupSearchDeploymentResultOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSearchDeploymentResult) string { return v.ClusterName }).(pulumi.StringOutput)
}

func (o LookupSearchDeploymentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSearchDeploymentResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSearchDeploymentResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSearchDeploymentResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// List of settings that configure the search nodes for your cluster. See specs.
func (o LookupSearchDeploymentResultOutput) Specs() GetSearchDeploymentSpecArrayOutput {
	return o.ApplyT(func(v LookupSearchDeploymentResult) []GetSearchDeploymentSpec { return v.Specs }).(GetSearchDeploymentSpecArrayOutput)
}

// Human-readable label that indicates the current operating condition of this search node deployment.
func (o LookupSearchDeploymentResultOutput) StateName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSearchDeploymentResult) string { return v.StateName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSearchDeploymentResultOutput{})
}