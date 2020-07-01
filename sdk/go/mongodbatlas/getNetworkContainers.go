// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// `getNetworkContainers` describes all Network Peering Containers. The data source requires your Project ID.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
//
// ## Example Usage
// ### Basic Example.
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
// 		testNetworkContainer, err := mongodbatlas.NewNetworkContainer(ctx, "testNetworkContainer", &mongodbatlas.NetworkContainerArgs{
// 			ProjectId:      pulumi.String("<YOUR-PROJECT-ID>"),
// 			AtlasCidrBlock: pulumi.String("10.8.0.0/21"),
// 			ProviderName:   pulumi.String("AWS"),
// 			RegionName:     pulumi.String("US_EAST_1"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetNetworkContainers(ctx *pulumi.Context, args *GetNetworkContainersArgs, opts ...pulumi.InvokeOption) (*GetNetworkContainersResult, error) {
	var rv GetNetworkContainersResult
	err := ctx.Invoke("mongodbatlas:index/getNetworkContainers:getNetworkContainers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetworkContainers.
type GetNetworkContainersArgs struct {
	// The unique ID for the project to create the database user.
	ProjectId string `pulumi:"projectId"`
	// Cloud provider for this Network peering container. Accepted values are AWS, GCP, and Azure.
	ProviderName string `pulumi:"providerName"`
}

// A collection of values returned by getNetworkContainers.
type GetNetworkContainersResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	ProjectId string `pulumi:"projectId"`
	// Cloud provider for this Network Peering connection. If omitted, Atlas sets this parameter to AWS.
	ProviderName string `pulumi:"providerName"`
	// A list where each represents a Network Peering Container.
	Results []GetNetworkContainersResultType `pulumi:"results"`
}
