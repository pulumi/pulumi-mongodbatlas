// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: getAdvancedClusters
//
// `getAdvancedClusters` describes all Advanced Clusters by the provided project_id. The data source requires your Project ID.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
//
// > **IMPORTANT:**
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
//			exampleAdvancedCluster, err := mongodbatlas.NewAdvancedCluster(ctx, "example", &mongodbatlas.AdvancedClusterArgs{
//				ProjectId:   pulumi.String("<YOUR-PROJECT-ID>"),
//				Name:        pulumi.String("cluster-test"),
//				ClusterType: pulumi.String("REPLICASET"),
//				ReplicationSpecs: mongodbatlas.AdvancedClusterReplicationSpecArray{
//					&mongodbatlas.AdvancedClusterReplicationSpecArgs{
//						RegionConfigs: mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArray{
//							&mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArgs{
//								ElectableSpecs: &mongodbatlas.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs{
//									InstanceSize: pulumi.String("M5"),
//								},
//								ProviderName:        pulumi.String("TENANT"),
//								BackingProviderName: pulumi.String("AWS"),
//								RegionName:          pulumi.String("US_EAST_1"),
//								Priority:            pulumi.Int(7),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupAdvancedClustersOutput(ctx, mongodbatlas.GetAdvancedClustersOutputArgs{
//				ProjectId: exampleAdvancedCluster.ProjectId,
//			}, nil)
//			return nil
//		})
//	}
//
// ```
//
// ## Example using latest sharding schema with independent shard scaling in the cluster
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
//			example, err := mongodbatlas.NewAdvancedCluster(ctx, "example", &mongodbatlas.AdvancedClusterArgs{
//				ProjectId:     pulumi.String("<YOUR-PROJECT-ID>"),
//				Name:          pulumi.String("cluster-test"),
//				BackupEnabled: pulumi.Bool(false),
//				ClusterType:   pulumi.String("SHARDED"),
//				ReplicationSpecs: mongodbatlas.AdvancedClusterReplicationSpecArray{
//					&mongodbatlas.AdvancedClusterReplicationSpecArgs{
//						RegionConfigs: mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArray{
//							&mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArgs{
//								ElectableSpecs: &mongodbatlas.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs{
//									InstanceSize: pulumi.String("M30"),
//									DiskIops:     pulumi.Int(3000),
//									NodeCount:    pulumi.Int(3),
//								},
//								ProviderName: pulumi.String("AWS"),
//								Priority:     pulumi.Int(7),
//								RegionName:   pulumi.String("EU_WEST_1"),
//							},
//						},
//					},
//					&mongodbatlas.AdvancedClusterReplicationSpecArgs{
//						RegionConfigs: mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArray{
//							&mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArgs{
//								ElectableSpecs: &mongodbatlas.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs{
//									InstanceSize: pulumi.String("M40"),
//									DiskIops:     pulumi.Int(3000),
//									NodeCount:    pulumi.Int(3),
//								},
//								ProviderName: pulumi.String("AWS"),
//								Priority:     pulumi.Int(7),
//								RegionName:   pulumi.String("EU_WEST_1"),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupAdvancedClusterOutput(ctx, mongodbatlas.GetAdvancedClusterOutputArgs{
//				ProjectId:                  example.ProjectId,
//				Name:                       example.Name,
//				UseReplicationSpecPerShard: pulumi.Bool(true),
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupAdvancedClusters(ctx *pulumi.Context, args *LookupAdvancedClustersArgs, opts ...pulumi.InvokeOption) (*LookupAdvancedClustersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAdvancedClustersResult
	err := ctx.Invoke("mongodbatlas:index/getAdvancedClusters:getAdvancedClusters", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAdvancedClusters.
type LookupAdvancedClustersArgs struct {
	// The unique ID for the project to get the clusters.
	ProjectId string `pulumi:"projectId"`
	// Set this field to true to allow the data source to use the latest schema representing each shard with an individual `replicationSpecs` object. This enables representing clusters with independent shard scaling. **Note:** If not set to true, this data source return all clusters except clusters with asymmetric shards.
	UseReplicationSpecPerShard *bool `pulumi:"useReplicationSpecPerShard"`
}

// A collection of values returned by getAdvancedClusters.
type LookupAdvancedClustersResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	ProjectId string `pulumi:"projectId"`
	// A list where each represents a Cluster. See below for more details.
	Results                    []GetAdvancedClustersResult `pulumi:"results"`
	UseReplicationSpecPerShard *bool                       `pulumi:"useReplicationSpecPerShard"`
}

func LookupAdvancedClustersOutput(ctx *pulumi.Context, args LookupAdvancedClustersOutputArgs, opts ...pulumi.InvokeOption) LookupAdvancedClustersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAdvancedClustersResult, error) {
			args := v.(LookupAdvancedClustersArgs)
			r, err := LookupAdvancedClusters(ctx, &args, opts...)
			var s LookupAdvancedClustersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAdvancedClustersResultOutput)
}

// A collection of arguments for invoking getAdvancedClusters.
type LookupAdvancedClustersOutputArgs struct {
	// The unique ID for the project to get the clusters.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
	// Set this field to true to allow the data source to use the latest schema representing each shard with an individual `replicationSpecs` object. This enables representing clusters with independent shard scaling. **Note:** If not set to true, this data source return all clusters except clusters with asymmetric shards.
	UseReplicationSpecPerShard pulumi.BoolPtrInput `pulumi:"useReplicationSpecPerShard"`
}

func (LookupAdvancedClustersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAdvancedClustersArgs)(nil)).Elem()
}

// A collection of values returned by getAdvancedClusters.
type LookupAdvancedClustersResultOutput struct{ *pulumi.OutputState }

func (LookupAdvancedClustersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAdvancedClustersResult)(nil)).Elem()
}

func (o LookupAdvancedClustersResultOutput) ToLookupAdvancedClustersResultOutput() LookupAdvancedClustersResultOutput {
	return o
}

func (o LookupAdvancedClustersResultOutput) ToLookupAdvancedClustersResultOutputWithContext(ctx context.Context) LookupAdvancedClustersResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAdvancedClustersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAdvancedClustersResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAdvancedClustersResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAdvancedClustersResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// A list where each represents a Cluster. See below for more details.
func (o LookupAdvancedClustersResultOutput) Results() GetAdvancedClustersResultArrayOutput {
	return o.ApplyT(func(v LookupAdvancedClustersResult) []GetAdvancedClustersResult { return v.Results }).(GetAdvancedClustersResultArrayOutput)
}

func (o LookupAdvancedClustersResultOutput) UseReplicationSpecPerShard() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupAdvancedClustersResult) *bool { return v.UseReplicationSpecPerShard }).(pulumi.BoolPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAdvancedClustersResultOutput{})
}
