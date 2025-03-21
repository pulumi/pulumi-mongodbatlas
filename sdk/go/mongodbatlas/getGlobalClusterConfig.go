// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: GlobalClusterConfig
//
// `GlobalClusterConfig` describes all managed namespaces and custom zone mappings associated with the specified Global Cluster.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
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
//			test, err := mongodbatlas.NewAdvancedCluster(ctx, "test", &mongodbatlas.AdvancedClusterArgs{
//				ProjectId:     pulumi.String("<YOUR-PROJECT-ID>"),
//				Name:          pulumi.String("<CLUSTER-NAME>"),
//				ClusterType:   pulumi.String("GEOSHARDED"),
//				BackupEnabled: pulumi.Bool(true),
//				ReplicationSpecs: mongodbatlas.AdvancedClusterReplicationSpecArray{
//					&mongodbatlas.AdvancedClusterReplicationSpecArgs{
//						ZoneName: pulumi.String("Zone 1"),
//						RegionConfigs: mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArray{
//							&mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArgs{
//								ElectableSpecs: &mongodbatlas.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs{
//									InstanceSize: pulumi.String("M30"),
//									NodeCount:    pulumi.Int(3),
//								},
//								ProviderName: pulumi.String("AWS"),
//								Priority:     pulumi.Int(7),
//								RegionName:   pulumi.String("EU_CENTRAL_1"),
//							},
//						},
//					},
//					&mongodbatlas.AdvancedClusterReplicationSpecArgs{
//						ZoneName: pulumi.String("Zone 1"),
//						RegionConfigs: mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArray{
//							&mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArgs{
//								ElectableSpecs: &mongodbatlas.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs{
//									InstanceSize: pulumi.String("M30"),
//									NodeCount:    pulumi.Int(3),
//								},
//								ProviderName: pulumi.String("AWS"),
//								Priority:     pulumi.Int(7),
//								RegionName:   pulumi.String("EU_CENTRAL_1"),
//							},
//						},
//					},
//					&mongodbatlas.AdvancedClusterReplicationSpecArgs{
//						ZoneName: pulumi.String("Zone 2"),
//						RegionConfigs: mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArray{
//							&mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArgs{
//								ElectableSpecs: &mongodbatlas.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs{
//									InstanceSize: pulumi.String("M30"),
//									NodeCount:    pulumi.Int(3),
//								},
//								ProviderName: pulumi.String("AWS"),
//								Priority:     pulumi.Int(7),
//								RegionName:   pulumi.String("US_EAST_2"),
//							},
//						},
//					},
//					&mongodbatlas.AdvancedClusterReplicationSpecArgs{
//						ZoneName: pulumi.String("Zone 2"),
//						RegionConfigs: mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArray{
//							&mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArgs{
//								ElectableSpecs: &mongodbatlas.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs{
//									InstanceSize: pulumi.String("M30"),
//									NodeCount:    pulumi.Int(3),
//								},
//								ProviderName: pulumi.String("AWS"),
//								Priority:     pulumi.Int(7),
//								RegionName:   pulumi.String("US_EAST_2"),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			configGlobalClusterConfig, err := mongodbatlas.NewGlobalClusterConfig(ctx, "config", &mongodbatlas.GlobalClusterConfigArgs{
//				ProjectId:   test.ProjectId,
//				ClusterName: test.Name,
//				ManagedNamespaces: mongodbatlas.GlobalClusterConfigManagedNamespaceArray{
//					&mongodbatlas.GlobalClusterConfigManagedNamespaceArgs{
//						Db:             pulumi.String("mydata"),
//						Collection:     pulumi.String("publishers"),
//						CustomShardKey: pulumi.String("city"),
//					},
//				},
//				CustomZoneMappings: mongodbatlas.GlobalClusterConfigCustomZoneMappingArray{
//					&mongodbatlas.GlobalClusterConfigCustomZoneMappingArgs{
//						Location: pulumi.String("CA"),
//						Zone:     pulumi.String("Zone 1"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupGlobalClusterConfigOutput(ctx, mongodbatlas.GetGlobalClusterConfigOutputArgs{
//				ProjectId:   configGlobalClusterConfig.ProjectId,
//				ClusterName: configGlobalClusterConfig.ClusterName,
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupGlobalClusterConfig(ctx *pulumi.Context, args *LookupGlobalClusterConfigArgs, opts ...pulumi.InvokeOption) (*LookupGlobalClusterConfigResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupGlobalClusterConfigResult
	err := ctx.Invoke("mongodbatlas:index/getGlobalClusterConfig:getGlobalClusterConfig", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGlobalClusterConfig.
type LookupGlobalClusterConfigArgs struct {
	// The name of the Global Cluster.
	ClusterName string `pulumi:"clusterName"`
	// Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
	ManagedNamespaces []GetGlobalClusterConfigManagedNamespace `pulumi:"managedNamespaces"`
	// The unique ID for the project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getGlobalClusterConfig.
type LookupGlobalClusterConfigResult struct {
	ClusterName string `pulumi:"clusterName"`
	// (Deprecated) A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.id`. This attribute is deprecated, use `customZoneMappingZoneId` instead. This attribute is not set when a cluster uses independent shard scaling. To learn more, see the Sharding Configuration guide.
	//
	// Deprecated: This parameter is deprecated and will be removed in version 1.23.0. Please transition to custom_zone_mapping_zone_id.
	CustomZoneMapping map[string]string `pulumi:"customZoneMapping"`
	// A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.zone_id`. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
	CustomZoneMappingZoneId map[string]string `pulumi:"customZoneMappingZoneId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
	ManagedNamespaces []GetGlobalClusterConfigManagedNamespace `pulumi:"managedNamespaces"`
	ProjectId         string                                   `pulumi:"projectId"`
}

func LookupGlobalClusterConfigOutput(ctx *pulumi.Context, args LookupGlobalClusterConfigOutputArgs, opts ...pulumi.InvokeOption) LookupGlobalClusterConfigResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupGlobalClusterConfigResultOutput, error) {
			args := v.(LookupGlobalClusterConfigArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getGlobalClusterConfig:getGlobalClusterConfig", args, LookupGlobalClusterConfigResultOutput{}, options).(LookupGlobalClusterConfigResultOutput), nil
		}).(LookupGlobalClusterConfigResultOutput)
}

// A collection of arguments for invoking getGlobalClusterConfig.
type LookupGlobalClusterConfigOutputArgs struct {
	// The name of the Global Cluster.
	ClusterName pulumi.StringInput `pulumi:"clusterName"`
	// Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
	ManagedNamespaces GetGlobalClusterConfigManagedNamespaceArrayInput `pulumi:"managedNamespaces"`
	// The unique ID for the project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupGlobalClusterConfigOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGlobalClusterConfigArgs)(nil)).Elem()
}

// A collection of values returned by getGlobalClusterConfig.
type LookupGlobalClusterConfigResultOutput struct{ *pulumi.OutputState }

func (LookupGlobalClusterConfigResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGlobalClusterConfigResult)(nil)).Elem()
}

func (o LookupGlobalClusterConfigResultOutput) ToLookupGlobalClusterConfigResultOutput() LookupGlobalClusterConfigResultOutput {
	return o
}

func (o LookupGlobalClusterConfigResultOutput) ToLookupGlobalClusterConfigResultOutputWithContext(ctx context.Context) LookupGlobalClusterConfigResultOutput {
	return o
}

func (o LookupGlobalClusterConfigResultOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGlobalClusterConfigResult) string { return v.ClusterName }).(pulumi.StringOutput)
}

// (Deprecated) A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.id`. This attribute is deprecated, use `customZoneMappingZoneId` instead. This attribute is not set when a cluster uses independent shard scaling. To learn more, see the Sharding Configuration guide.
//
// Deprecated: This parameter is deprecated and will be removed in version 1.23.0. Please transition to custom_zone_mapping_zone_id.
func (o LookupGlobalClusterConfigResultOutput) CustomZoneMapping() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupGlobalClusterConfigResult) map[string]string { return v.CustomZoneMapping }).(pulumi.StringMapOutput)
}

// A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.zone_id`. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
func (o LookupGlobalClusterConfigResultOutput) CustomZoneMappingZoneId() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupGlobalClusterConfigResult) map[string]string { return v.CustomZoneMappingZoneId }).(pulumi.StringMapOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupGlobalClusterConfigResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGlobalClusterConfigResult) string { return v.Id }).(pulumi.StringOutput)
}

// Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
func (o LookupGlobalClusterConfigResultOutput) ManagedNamespaces() GetGlobalClusterConfigManagedNamespaceArrayOutput {
	return o.ApplyT(func(v LookupGlobalClusterConfigResult) []GetGlobalClusterConfigManagedNamespace {
		return v.ManagedNamespaces
	}).(GetGlobalClusterConfigManagedNamespaceArrayOutput)
}

func (o LookupGlobalClusterConfigResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGlobalClusterConfigResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupGlobalClusterConfigResultOutput{})
}
