// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// `GlobalClusterConfig` provides a Global Cluster Configuration resource.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
//
// ## Examples Usage
//
// ### Example Global cluster
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
//			test, err := mongodbatlas.NewCluster(ctx, "test", &mongodbatlas.ClusterArgs{
//				ProjectId:                pulumi.String("<YOUR-PROJECT-ID>"),
//				CloudBackup:              pulumi.Bool(true),
//				ClusterType:              pulumi.String("GEOSHARDED"),
//				ProviderName:             pulumi.String("AWS"),
//				ProviderInstanceSizeName: pulumi.String("M30"),
//				ReplicationSpecs: mongodbatlas.ClusterReplicationSpecArray{
//					&mongodbatlas.ClusterReplicationSpecArgs{
//						ZoneName:  pulumi.String("Zone 1"),
//						NumShards: pulumi.Int(1),
//						RegionsConfigs: mongodbatlas.ClusterReplicationSpecRegionsConfigArray{
//							&mongodbatlas.ClusterReplicationSpecRegionsConfigArgs{
//								RegionName:     pulumi.String("EU_CENTRAL_1"),
//								ElectableNodes: pulumi.Int(3),
//								Priority:       pulumi.Int(7),
//								ReadOnlyNodes:  pulumi.Int(0),
//							},
//						},
//					},
//					&mongodbatlas.ClusterReplicationSpecArgs{
//						ZoneName:  pulumi.String("Zone 2"),
//						NumShards: pulumi.Int(1),
//						RegionsConfigs: mongodbatlas.ClusterReplicationSpecRegionsConfigArray{
//							&mongodbatlas.ClusterReplicationSpecRegionsConfigArgs{
//								RegionName:     pulumi.String("US_EAST_2"),
//								ElectableNodes: pulumi.Int(3),
//								Priority:       pulumi.Int(7),
//								ReadOnlyNodes:  pulumi.Int(0),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.NewGlobalClusterConfig(ctx, "config", &mongodbatlas.GlobalClusterConfigArgs{
//				ProjectId:   test.ProjectId,
//				ClusterName: test.Name,
//				ManagedNamespaces: mongodbatlas.GlobalClusterConfigManagedNamespaceArray{
//					&mongodbatlas.GlobalClusterConfigManagedNamespaceArgs{
//						Db:                     pulumi.String("mydata"),
//						Collection:             pulumi.String("publishers"),
//						CustomShardKey:         pulumi.String("city"),
//						IsCustomShardKeyHashed: pulumi.Bool(false),
//						IsShardKeyUnique:       pulumi.Bool(false),
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
//			return nil
//		})
//	}
//
// ```
//
// ### Example Global cluster config
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
//			_, err := mongodbatlas.NewCluster(ctx, "cluster-test", &mongodbatlas.ClusterArgs{
//				ProjectId:   pulumi.String("<YOUR-PROJECT-ID>"),
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
//				BackupEnabled:            pulumi.Bool(true),
//				AutoScalingDiskGbEnabled: pulumi.Bool(true),
//				MongoDbMajorVersion:      pulumi.String("4.0"),
//				ProviderName:             pulumi.String("AWS"),
//				ProviderInstanceSizeName: pulumi.String("M40"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.NewGlobalClusterConfig(ctx, "config", &mongodbatlas.GlobalClusterConfigArgs{
//				ProjectId:   pulumi.Any(mongodbatlas_cluster.Test.Project_id),
//				ClusterName: pulumi.Any(mongodbatlas_cluster.Test.Name),
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
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Global Clusters can be imported using project ID and cluster name, in the format `PROJECTID-CLUSTER_NAME`, e.g.
//
// ```sh
//
//	$ pulumi import mongodbatlas:index/globalClusterConfig:GlobalClusterConfig config 1112222b3bf99403840e8934-Cluster0
//
// ```
//
//	See detailed information for arguments and attributes[MongoDB API Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/)
type GlobalClusterConfig struct {
	pulumi.CustomResourceState

	// The name of the Global Cluster.
	ClusterName pulumi.StringOutput `pulumi:"clusterName"`
	// A map of all custom zone mappings defined for the Global Cluster. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
	CustomZoneMapping pulumi.MapOutput `pulumi:"customZoneMapping"`
	// Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
	CustomZoneMappings GlobalClusterConfigCustomZoneMappingArrayOutput `pulumi:"customZoneMappings"`
	// Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
	ManagedNamespaces GlobalClusterConfigManagedNamespaceArrayOutput `pulumi:"managedNamespaces"`
	// The unique ID for the project to create the database user.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
}

// NewGlobalClusterConfig registers a new resource with the given unique name, arguments, and options.
func NewGlobalClusterConfig(ctx *pulumi.Context,
	name string, args *GlobalClusterConfigArgs, opts ...pulumi.ResourceOption) (*GlobalClusterConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterName == nil {
		return nil, errors.New("invalid value for required argument 'ClusterName'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GlobalClusterConfig
	err := ctx.RegisterResource("mongodbatlas:index/globalClusterConfig:GlobalClusterConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGlobalClusterConfig gets an existing GlobalClusterConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGlobalClusterConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GlobalClusterConfigState, opts ...pulumi.ResourceOption) (*GlobalClusterConfig, error) {
	var resource GlobalClusterConfig
	err := ctx.ReadResource("mongodbatlas:index/globalClusterConfig:GlobalClusterConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GlobalClusterConfig resources.
type globalClusterConfigState struct {
	// The name of the Global Cluster.
	ClusterName *string `pulumi:"clusterName"`
	// A map of all custom zone mappings defined for the Global Cluster. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
	CustomZoneMapping map[string]interface{} `pulumi:"customZoneMapping"`
	// Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
	CustomZoneMappings []GlobalClusterConfigCustomZoneMapping `pulumi:"customZoneMappings"`
	// Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
	ManagedNamespaces []GlobalClusterConfigManagedNamespace `pulumi:"managedNamespaces"`
	// The unique ID for the project to create the database user.
	ProjectId *string `pulumi:"projectId"`
}

type GlobalClusterConfigState struct {
	// The name of the Global Cluster.
	ClusterName pulumi.StringPtrInput
	// A map of all custom zone mappings defined for the Global Cluster. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
	CustomZoneMapping pulumi.MapInput
	// Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
	CustomZoneMappings GlobalClusterConfigCustomZoneMappingArrayInput
	// Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
	ManagedNamespaces GlobalClusterConfigManagedNamespaceArrayInput
	// The unique ID for the project to create the database user.
	ProjectId pulumi.StringPtrInput
}

func (GlobalClusterConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*globalClusterConfigState)(nil)).Elem()
}

type globalClusterConfigArgs struct {
	// The name of the Global Cluster.
	ClusterName string `pulumi:"clusterName"`
	// Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
	CustomZoneMappings []GlobalClusterConfigCustomZoneMapping `pulumi:"customZoneMappings"`
	// Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
	ManagedNamespaces []GlobalClusterConfigManagedNamespace `pulumi:"managedNamespaces"`
	// The unique ID for the project to create the database user.
	ProjectId string `pulumi:"projectId"`
}

// The set of arguments for constructing a GlobalClusterConfig resource.
type GlobalClusterConfigArgs struct {
	// The name of the Global Cluster.
	ClusterName pulumi.StringInput
	// Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
	CustomZoneMappings GlobalClusterConfigCustomZoneMappingArrayInput
	// Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
	ManagedNamespaces GlobalClusterConfigManagedNamespaceArrayInput
	// The unique ID for the project to create the database user.
	ProjectId pulumi.StringInput
}

func (GlobalClusterConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*globalClusterConfigArgs)(nil)).Elem()
}

type GlobalClusterConfigInput interface {
	pulumi.Input

	ToGlobalClusterConfigOutput() GlobalClusterConfigOutput
	ToGlobalClusterConfigOutputWithContext(ctx context.Context) GlobalClusterConfigOutput
}

func (*GlobalClusterConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalClusterConfig)(nil)).Elem()
}

func (i *GlobalClusterConfig) ToGlobalClusterConfigOutput() GlobalClusterConfigOutput {
	return i.ToGlobalClusterConfigOutputWithContext(context.Background())
}

func (i *GlobalClusterConfig) ToGlobalClusterConfigOutputWithContext(ctx context.Context) GlobalClusterConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalClusterConfigOutput)
}

func (i *GlobalClusterConfig) ToOutput(ctx context.Context) pulumix.Output[*GlobalClusterConfig] {
	return pulumix.Output[*GlobalClusterConfig]{
		OutputState: i.ToGlobalClusterConfigOutputWithContext(ctx).OutputState,
	}
}

// GlobalClusterConfigArrayInput is an input type that accepts GlobalClusterConfigArray and GlobalClusterConfigArrayOutput values.
// You can construct a concrete instance of `GlobalClusterConfigArrayInput` via:
//
//	GlobalClusterConfigArray{ GlobalClusterConfigArgs{...} }
type GlobalClusterConfigArrayInput interface {
	pulumi.Input

	ToGlobalClusterConfigArrayOutput() GlobalClusterConfigArrayOutput
	ToGlobalClusterConfigArrayOutputWithContext(context.Context) GlobalClusterConfigArrayOutput
}

type GlobalClusterConfigArray []GlobalClusterConfigInput

func (GlobalClusterConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalClusterConfig)(nil)).Elem()
}

func (i GlobalClusterConfigArray) ToGlobalClusterConfigArrayOutput() GlobalClusterConfigArrayOutput {
	return i.ToGlobalClusterConfigArrayOutputWithContext(context.Background())
}

func (i GlobalClusterConfigArray) ToGlobalClusterConfigArrayOutputWithContext(ctx context.Context) GlobalClusterConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalClusterConfigArrayOutput)
}

func (i GlobalClusterConfigArray) ToOutput(ctx context.Context) pulumix.Output[[]*GlobalClusterConfig] {
	return pulumix.Output[[]*GlobalClusterConfig]{
		OutputState: i.ToGlobalClusterConfigArrayOutputWithContext(ctx).OutputState,
	}
}

// GlobalClusterConfigMapInput is an input type that accepts GlobalClusterConfigMap and GlobalClusterConfigMapOutput values.
// You can construct a concrete instance of `GlobalClusterConfigMapInput` via:
//
//	GlobalClusterConfigMap{ "key": GlobalClusterConfigArgs{...} }
type GlobalClusterConfigMapInput interface {
	pulumi.Input

	ToGlobalClusterConfigMapOutput() GlobalClusterConfigMapOutput
	ToGlobalClusterConfigMapOutputWithContext(context.Context) GlobalClusterConfigMapOutput
}

type GlobalClusterConfigMap map[string]GlobalClusterConfigInput

func (GlobalClusterConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalClusterConfig)(nil)).Elem()
}

func (i GlobalClusterConfigMap) ToGlobalClusterConfigMapOutput() GlobalClusterConfigMapOutput {
	return i.ToGlobalClusterConfigMapOutputWithContext(context.Background())
}

func (i GlobalClusterConfigMap) ToGlobalClusterConfigMapOutputWithContext(ctx context.Context) GlobalClusterConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalClusterConfigMapOutput)
}

func (i GlobalClusterConfigMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*GlobalClusterConfig] {
	return pulumix.Output[map[string]*GlobalClusterConfig]{
		OutputState: i.ToGlobalClusterConfigMapOutputWithContext(ctx).OutputState,
	}
}

type GlobalClusterConfigOutput struct{ *pulumi.OutputState }

func (GlobalClusterConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalClusterConfig)(nil)).Elem()
}

func (o GlobalClusterConfigOutput) ToGlobalClusterConfigOutput() GlobalClusterConfigOutput {
	return o
}

func (o GlobalClusterConfigOutput) ToGlobalClusterConfigOutputWithContext(ctx context.Context) GlobalClusterConfigOutput {
	return o
}

func (o GlobalClusterConfigOutput) ToOutput(ctx context.Context) pulumix.Output[*GlobalClusterConfig] {
	return pulumix.Output[*GlobalClusterConfig]{
		OutputState: o.OutputState,
	}
}

// The name of the Global Cluster.
func (o GlobalClusterConfigOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalClusterConfig) pulumi.StringOutput { return v.ClusterName }).(pulumi.StringOutput)
}

// A map of all custom zone mappings defined for the Global Cluster. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
func (o GlobalClusterConfigOutput) CustomZoneMapping() pulumi.MapOutput {
	return o.ApplyT(func(v *GlobalClusterConfig) pulumi.MapOutput { return v.CustomZoneMapping }).(pulumi.MapOutput)
}

// Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
func (o GlobalClusterConfigOutput) CustomZoneMappings() GlobalClusterConfigCustomZoneMappingArrayOutput {
	return o.ApplyT(func(v *GlobalClusterConfig) GlobalClusterConfigCustomZoneMappingArrayOutput {
		return v.CustomZoneMappings
	}).(GlobalClusterConfigCustomZoneMappingArrayOutput)
}

// Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
func (o GlobalClusterConfigOutput) ManagedNamespaces() GlobalClusterConfigManagedNamespaceArrayOutput {
	return o.ApplyT(func(v *GlobalClusterConfig) GlobalClusterConfigManagedNamespaceArrayOutput {
		return v.ManagedNamespaces
	}).(GlobalClusterConfigManagedNamespaceArrayOutput)
}

// The unique ID for the project to create the database user.
func (o GlobalClusterConfigOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalClusterConfig) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

type GlobalClusterConfigArrayOutput struct{ *pulumi.OutputState }

func (GlobalClusterConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalClusterConfig)(nil)).Elem()
}

func (o GlobalClusterConfigArrayOutput) ToGlobalClusterConfigArrayOutput() GlobalClusterConfigArrayOutput {
	return o
}

func (o GlobalClusterConfigArrayOutput) ToGlobalClusterConfigArrayOutputWithContext(ctx context.Context) GlobalClusterConfigArrayOutput {
	return o
}

func (o GlobalClusterConfigArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*GlobalClusterConfig] {
	return pulumix.Output[[]*GlobalClusterConfig]{
		OutputState: o.OutputState,
	}
}

func (o GlobalClusterConfigArrayOutput) Index(i pulumi.IntInput) GlobalClusterConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GlobalClusterConfig {
		return vs[0].([]*GlobalClusterConfig)[vs[1].(int)]
	}).(GlobalClusterConfigOutput)
}

type GlobalClusterConfigMapOutput struct{ *pulumi.OutputState }

func (GlobalClusterConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalClusterConfig)(nil)).Elem()
}

func (o GlobalClusterConfigMapOutput) ToGlobalClusterConfigMapOutput() GlobalClusterConfigMapOutput {
	return o
}

func (o GlobalClusterConfigMapOutput) ToGlobalClusterConfigMapOutputWithContext(ctx context.Context) GlobalClusterConfigMapOutput {
	return o
}

func (o GlobalClusterConfigMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*GlobalClusterConfig] {
	return pulumix.Output[map[string]*GlobalClusterConfig]{
		OutputState: o.OutputState,
	}
}

func (o GlobalClusterConfigMapOutput) MapIndex(k pulumi.StringInput) GlobalClusterConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GlobalClusterConfig {
		return vs[0].(map[string]*GlobalClusterConfig)[vs[1].(string)]
	}).(GlobalClusterConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalClusterConfigInput)(nil)).Elem(), &GlobalClusterConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalClusterConfigArrayInput)(nil)).Elem(), GlobalClusterConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalClusterConfigMapInput)(nil)).Elem(), GlobalClusterConfigMap{})
	pulumi.RegisterOutputType(GlobalClusterConfigOutput{})
	pulumi.RegisterOutputType(GlobalClusterConfigArrayOutput{})
	pulumi.RegisterOutputType(GlobalClusterConfigMapOutput{})
}
