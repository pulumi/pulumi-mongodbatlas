// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: NetworkContainer
//
// `NetworkContainer` describes a Network Peering Container. The resource requires your Project ID and container ID.
//
// > **IMPORTANT:** This resource creates one Network Peering container into which Atlas can deploy Network Peering connections. An Atlas project can have a maximum of one container for each cloud provider. You must have either the Project Owner or Organization Owner role to successfully call this endpoint.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
//
// ## Example Usage
//
// ### Basic Example.
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
//			testNetworkContainer, err := mongodbatlas.NewNetworkContainer(ctx, "test", &mongodbatlas.NetworkContainerArgs{
//				ProjectId:      pulumi.String("<YOUR-PROJECT-ID>"),
//				AtlasCidrBlock: pulumi.String("10.8.0.0/21"),
//				ProviderName:   pulumi.String("AWS"),
//				RegionName:     pulumi.String("US_EAST_1"),
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupNetworkContainerOutput(ctx, mongodbatlas.GetNetworkContainerOutputArgs{
//				ProjectId:   testNetworkContainer.ProjectId,
//				ContainerId: testNetworkContainer.ID(),
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupNetworkContainer(ctx *pulumi.Context, args *LookupNetworkContainerArgs, opts ...pulumi.InvokeOption) (*LookupNetworkContainerResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNetworkContainerResult
	err := ctx.Invoke("mongodbatlas:index/getNetworkContainer:getNetworkContainer", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetworkContainer.
type LookupNetworkContainerArgs struct {
	// The Network Peering Container ID.
	ContainerId string `pulumi:"containerId"`
	// The unique ID for the project to create the database user.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getNetworkContainer.
type LookupNetworkContainerResult struct {
	// CIDR block that Atlas uses for your clusters. Atlas uses the specified CIDR block for all other Network Peering connections created in the project. The Atlas CIDR block must be at least a /24 and at most a /21 in one of the following [private networks](https://tools.ietf.org/html/rfc1918.html#section-3).
	AtlasCidrBlock string `pulumi:"atlasCidrBlock"`
	// Unique identifer of the Azure subscription in which the VNet resides.
	AzureSubscriptionId string `pulumi:"azureSubscriptionId"`
	ContainerId         string `pulumi:"containerId"`
	// Unique identifier of the GCP project in which the Network Peering connection resides.
	GcpProjectId string `pulumi:"gcpProjectId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Name of the Network Peering connection in the Atlas project.
	NetworkName string `pulumi:"networkName"`
	ProjectId   string `pulumi:"projectId"`
	// Cloud provider for this Network Peering connection. If omitted, Atlas sets this parameter to AWS.
	ProviderName string `pulumi:"providerName"`
	// Indicates whether the project has Network Peering connections deployed in the container.
	Provisioned bool `pulumi:"provisioned"`
	// The Atlas Azure region name for where this container will exist.
	Region string `pulumi:"region"`
	// The Atlas AWS region name for where this container will exist.
	RegionName string `pulumi:"regionName"`
	// Atlas GCP regions where the container resides.
	Regions []string `pulumi:"regions"`
	// The name of the Azure VNet. This value is null until you provision an Azure VNet in the container.
	VnetName string `pulumi:"vnetName"`
	// Unique identifier of the project’s VPC.
	VpcId string `pulumi:"vpcId"`
}

func LookupNetworkContainerOutput(ctx *pulumi.Context, args LookupNetworkContainerOutputArgs, opts ...pulumi.InvokeOption) LookupNetworkContainerResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupNetworkContainerResultOutput, error) {
			args := v.(LookupNetworkContainerArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupNetworkContainerResult
			secret, err := ctx.InvokePackageRaw("mongodbatlas:index/getNetworkContainer:getNetworkContainer", args, &rv, "", opts...)
			if err != nil {
				return LookupNetworkContainerResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupNetworkContainerResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupNetworkContainerResultOutput), nil
			}
			return output, nil
		}).(LookupNetworkContainerResultOutput)
}

// A collection of arguments for invoking getNetworkContainer.
type LookupNetworkContainerOutputArgs struct {
	// The Network Peering Container ID.
	ContainerId pulumi.StringInput `pulumi:"containerId"`
	// The unique ID for the project to create the database user.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupNetworkContainerOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkContainerArgs)(nil)).Elem()
}

// A collection of values returned by getNetworkContainer.
type LookupNetworkContainerResultOutput struct{ *pulumi.OutputState }

func (LookupNetworkContainerResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkContainerResult)(nil)).Elem()
}

func (o LookupNetworkContainerResultOutput) ToLookupNetworkContainerResultOutput() LookupNetworkContainerResultOutput {
	return o
}

func (o LookupNetworkContainerResultOutput) ToLookupNetworkContainerResultOutputWithContext(ctx context.Context) LookupNetworkContainerResultOutput {
	return o
}

// CIDR block that Atlas uses for your clusters. Atlas uses the specified CIDR block for all other Network Peering connections created in the project. The Atlas CIDR block must be at least a /24 and at most a /21 in one of the following [private networks](https://tools.ietf.org/html/rfc1918.html#section-3).
func (o LookupNetworkContainerResultOutput) AtlasCidrBlock() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkContainerResult) string { return v.AtlasCidrBlock }).(pulumi.StringOutput)
}

// Unique identifer of the Azure subscription in which the VNet resides.
func (o LookupNetworkContainerResultOutput) AzureSubscriptionId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkContainerResult) string { return v.AzureSubscriptionId }).(pulumi.StringOutput)
}

func (o LookupNetworkContainerResultOutput) ContainerId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkContainerResult) string { return v.ContainerId }).(pulumi.StringOutput)
}

// Unique identifier of the GCP project in which the Network Peering connection resides.
func (o LookupNetworkContainerResultOutput) GcpProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkContainerResult) string { return v.GcpProjectId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNetworkContainerResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkContainerResult) string { return v.Id }).(pulumi.StringOutput)
}

// Name of the Network Peering connection in the Atlas project.
func (o LookupNetworkContainerResultOutput) NetworkName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkContainerResult) string { return v.NetworkName }).(pulumi.StringOutput)
}

func (o LookupNetworkContainerResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkContainerResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Cloud provider for this Network Peering connection. If omitted, Atlas sets this parameter to AWS.
func (o LookupNetworkContainerResultOutput) ProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkContainerResult) string { return v.ProviderName }).(pulumi.StringOutput)
}

// Indicates whether the project has Network Peering connections deployed in the container.
func (o LookupNetworkContainerResultOutput) Provisioned() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupNetworkContainerResult) bool { return v.Provisioned }).(pulumi.BoolOutput)
}

// The Atlas Azure region name for where this container will exist.
func (o LookupNetworkContainerResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkContainerResult) string { return v.Region }).(pulumi.StringOutput)
}

// The Atlas AWS region name for where this container will exist.
func (o LookupNetworkContainerResultOutput) RegionName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkContainerResult) string { return v.RegionName }).(pulumi.StringOutput)
}

// Atlas GCP regions where the container resides.
func (o LookupNetworkContainerResultOutput) Regions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupNetworkContainerResult) []string { return v.Regions }).(pulumi.StringArrayOutput)
}

// The name of the Azure VNet. This value is null until you provision an Azure VNet in the container.
func (o LookupNetworkContainerResultOutput) VnetName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkContainerResult) string { return v.VnetName }).(pulumi.StringOutput)
}

// Unique identifier of the project’s VPC.
func (o LookupNetworkContainerResultOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkContainerResult) string { return v.VpcId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNetworkContainerResultOutput{})
}
