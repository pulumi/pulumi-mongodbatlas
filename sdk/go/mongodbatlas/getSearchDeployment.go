// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: SearchDeployment
//
// `SearchDeployment` describes a search node deployment.
//
// ## Example Usage
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
	// Label that identifies the cluster to return the search nodes for.
	ClusterName string `pulumi:"clusterName"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getSearchDeployment.
type LookupSearchDeploymentResult struct {
	// Label that identifies the cluster to return the search nodes for.
	ClusterName string `pulumi:"clusterName"`
	// Unique 24-hexadecimal digit string that identifies the search deployment.
	Id string `pulumi:"id"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
	// List of settings that configure the search nodes for your cluster. This list is currently limited to defining a single element.
	Specs []GetSearchDeploymentSpec `pulumi:"specs"`
	// Human-readable label that indicates the current operating condition of this search deployment.
	StateName string `pulumi:"stateName"`
}

func LookupSearchDeploymentOutput(ctx *pulumi.Context, args LookupSearchDeploymentOutputArgs, opts ...pulumi.InvokeOption) LookupSearchDeploymentResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSearchDeploymentResultOutput, error) {
			args := v.(LookupSearchDeploymentArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupSearchDeploymentResult
			secret, err := ctx.InvokePackageRaw("mongodbatlas:index/getSearchDeployment:getSearchDeployment", args, &rv, "", opts...)
			if err != nil {
				return LookupSearchDeploymentResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupSearchDeploymentResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupSearchDeploymentResultOutput), nil
			}
			return output, nil
		}).(LookupSearchDeploymentResultOutput)
}

// A collection of arguments for invoking getSearchDeployment.
type LookupSearchDeploymentOutputArgs struct {
	// Label that identifies the cluster to return the search nodes for.
	ClusterName pulumi.StringInput `pulumi:"clusterName"`
	// Unique 24-hexadecimal digit string that identifies your project.
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

// Label that identifies the cluster to return the search nodes for.
func (o LookupSearchDeploymentResultOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSearchDeploymentResult) string { return v.ClusterName }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies the search deployment.
func (o LookupSearchDeploymentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSearchDeploymentResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies your project.
func (o LookupSearchDeploymentResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSearchDeploymentResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// List of settings that configure the search nodes for your cluster. This list is currently limited to defining a single element.
func (o LookupSearchDeploymentResultOutput) Specs() GetSearchDeploymentSpecArrayOutput {
	return o.ApplyT(func(v LookupSearchDeploymentResult) []GetSearchDeploymentSpec { return v.Specs }).(GetSearchDeploymentSpecArrayOutput)
}

// Human-readable label that indicates the current operating condition of this search deployment.
func (o LookupSearchDeploymentResultOutput) StateName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSearchDeploymentResult) string { return v.StateName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSearchDeploymentResultOutput{})
}
