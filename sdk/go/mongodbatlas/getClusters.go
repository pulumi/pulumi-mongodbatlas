// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `Cluster` describes all Clusters by the provided project_id. The data source requires your Project ID.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
//
// > **IMPORTANT:**
// <br> &#8226; Multi Region Cluster: The `Cluster` data source doesn't return the `containerId` for each region utilized by the cluster. For retrieving the `containerId`, we recommend the `AdvancedCluster` data source instead.
// <br> &#8226; Changes to cluster configurations can affect costs. Before making changes, please see [Billing](https://docs.atlas.mongodb.com/billing/).
// <br> &#8226; If your Atlas project contains a custom role that uses actions introduced in a specific MongoDB version, you cannot create a cluster with a MongoDB version less than that version unless you delete the custom role.
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
//			testCluster, err := mongodbatlas.NewCluster(ctx, "test", &mongodbatlas.ClusterArgs{
//				ProjectId:   pulumi.String("<YOUR-PROJECT-ID>"),
//				Name:        pulumi.String("cluster-test"),
//				ClusterType: pulumi.String("REPLICASET"),
//				ReplicationSpecs: mongodbatlas.ClusterReplicationSpecArray{
//					&mongodbatlas.ClusterReplicationSpecArgs{
//						NumShards: pulumi.Int(1),
//						RegionsConfigs: mongodbatlas.ClusterReplicationSpecRegionsConfigArray{
//							&mongodbatlas.ClusterReplicationSpecRegionsConfigArgs{
//								RegionName:     pulumi.String("US_EAST_1"),
//								ElectableNodes: pulumi.Int(3),
//								Priority:       pulumi.Int(7),
//								ReadOnlyNodes:  pulumi.Int(0),
//							},
//						},
//					},
//				},
//				CloudBackup:              pulumi.Bool(true),
//				AutoScalingDiskGbEnabled: pulumi.Bool(true),
//				ProviderName:             pulumi.String("AWS"),
//				ProviderInstanceSizeName: pulumi.String("M40"),
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupClustersOutput(ctx, mongodbatlas.GetClustersOutputArgs{
//				ProjectId: testCluster.ProjectId,
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupClusters(ctx *pulumi.Context, args *LookupClustersArgs, opts ...pulumi.InvokeOption) (*LookupClustersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupClustersResult
	err := ctx.Invoke("mongodbatlas:index/getClusters:getClusters", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClusters.
type LookupClustersArgs struct {
	// The unique ID for the project to get the clusters.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getClusters.
type LookupClustersResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	ProjectId string `pulumi:"projectId"`
	// A list where each represents a Cluster. See Cluster below for more details.
	Results []GetClustersResult `pulumi:"results"`
}

func LookupClustersOutput(ctx *pulumi.Context, args LookupClustersOutputArgs, opts ...pulumi.InvokeOption) LookupClustersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupClustersResult, error) {
			args := v.(LookupClustersArgs)
			r, err := LookupClusters(ctx, &args, opts...)
			var s LookupClustersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupClustersResultOutput)
}

// A collection of arguments for invoking getClusters.
type LookupClustersOutputArgs struct {
	// The unique ID for the project to get the clusters.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupClustersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClustersArgs)(nil)).Elem()
}

// A collection of values returned by getClusters.
type LookupClustersResultOutput struct{ *pulumi.OutputState }

func (LookupClustersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClustersResult)(nil)).Elem()
}

func (o LookupClustersResultOutput) ToLookupClustersResultOutput() LookupClustersResultOutput {
	return o
}

func (o LookupClustersResultOutput) ToLookupClustersResultOutputWithContext(ctx context.Context) LookupClustersResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupClustersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClustersResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupClustersResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClustersResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// A list where each represents a Cluster. See Cluster below for more details.
func (o LookupClustersResultOutput) Results() GetClustersResultArrayOutput {
	return o.ApplyT(func(v LookupClustersResult) []GetClustersResult { return v.Results }).(GetClustersResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupClustersResultOutput{})
}
