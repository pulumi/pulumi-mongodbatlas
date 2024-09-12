// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: Cluster
//
// `Cluster` describes a Cluster. The data source requires your Project ID.
//
// > **IMPORTANT:**
// <br> &#8226; Multi Region Cluster: The `Cluster` data source doesn't return the `containerId` for each region utilized by the cluster. For retrieving the `containerId`, we recommend the `AdvancedCluster` data source instead.
// <br> &#8226; Changes to cluster configurations can affect costs. Before making changes, please see [Billing](https://docs.atlas.mongodb.com/billing/).
// <br> &#8226; If your Atlas project contains a custom role that uses actions introduced in a specific MongoDB version, you cannot create a cluster with a MongoDB version less than that version unless you delete the custom role.
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
//			_ = mongodbatlas.LookupClusterOutput(ctx, mongodbatlas.GetClusterOutputArgs{
//				ProjectId: testCluster.ProjectId,
//				Name:      testCluster.Name,
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupCluster(ctx *pulumi.Context, args *LookupClusterArgs, opts ...pulumi.InvokeOption) (*LookupClusterResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupClusterResult
	err := ctx.Invoke("mongodbatlas:index/getCluster:getCluster", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCluster.
type LookupClusterArgs struct {
	// Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed.
	Name string `pulumi:"name"`
	// The unique ID for the project to create the database user.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getCluster.
type LookupClusterResult struct {
	// Get the advanced configuration options. See Advanced Configuration below for more details.
	AdvancedConfigurations []GetClusterAdvancedConfiguration `pulumi:"advancedConfigurations"`
	// Specifies whether cluster tier auto-scaling is enabled. The default is false.
	AutoScalingComputeEnabled bool `pulumi:"autoScalingComputeEnabled"`
	// Specifies whether cluster tier auto-down-scaling is enabled.
	AutoScalingComputeScaleDownEnabled bool `pulumi:"autoScalingComputeScaleDownEnabled"`
	// Indicates whether disk auto-scaling is enabled.
	AutoScalingDiskGbEnabled bool `pulumi:"autoScalingDiskGbEnabled"`
	// Indicates Cloud service provider on which the server for a multi-tenant cluster is provisioned.
	BackingProviderName string `pulumi:"backingProviderName"`
	// Legacy Option, Indicates whether Atlas continuous backups are enabled for the cluster.
	BackupEnabled bool `pulumi:"backupEnabled"`
	// Indicates BI Connector for Atlas configuration on this cluster. BI Connector for Atlas is only available for M10+ clusters. See BI Connector below for more details.
	BiConnectorConfigs []GetClusterBiConnectorConfig `pulumi:"biConnectorConfigs"`
	// Indicates the type of the cluster that you want to modify. You cannot convert a sharded cluster deployment to a replica set deployment.
	ClusterType string `pulumi:"clusterType"`
	// Set of connection strings that your applications use to connect to this cluster. More info in [Connection-strings](https://docs.mongodb.com/manual/reference/connection-string/). Use the parameters in this object to connect your applications to this cluster. To learn more about the formats of connection strings, see [Connection String Options](https://docs.atlas.mongodb.com/reference/faq/connection-changes/).
	ConnectionStrings []GetClusterConnectionString `pulumi:"connectionStrings"`
	// The Network Peering Container ID.
	ContainerId string `pulumi:"containerId"`
	// Indicates the size in gigabytes of the server’s root volume (AWS/GCP Only).
	DiskSizeGb float64 `pulumi:"diskSizeGb"`
	// Indicates whether Encryption at Rest is enabled or disabled.
	EncryptionAtRestProvider string `pulumi:"encryptionAtRestProvider"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below. **DEPRECATED** Use `tags` instead.
	//
	// Deprecated: This parameter is deprecated and will be removed in the future. Please transition to tags
	Labels []GetClusterLabel `pulumi:"labels"`
	// Indicates the version of the cluster to deploy.
	MongoDbMajorVersion string `pulumi:"mongoDbMajorVersion"`
	// Version of MongoDB the cluster runs, in `major-version`.`minor-version` format.
	MongoDbVersion string `pulumi:"mongoDbVersion"`
	// Base connection string for the cluster. Atlas only displays this field after the cluster is operational, not while it builds the cluster.
	MongoUri string `pulumi:"mongoUri"`
	// Lists when the connection string was last updated. The connection string changes, for example, if you change a replica set to a sharded cluster.
	MongoUriUpdated string `pulumi:"mongoUriUpdated"`
	// Describes connection string for connecting to the Atlas cluster. Includes the replicaSet, ssl, and authSource query parameters in the connection string with values appropriate for the cluster.
	MongoUriWithOptions string `pulumi:"mongoUriWithOptions"`
	// The name of the current plugin
	Name string `pulumi:"name"`
	// Number of shards to deploy in the specified zone.
	NumShards int `pulumi:"numShards"`
	// Flag that indicates whether the cluster is paused or not.
	Paused bool `pulumi:"paused"`
	// Flag that indicates if the cluster uses Continuous Cloud Backup.
	PitEnabled bool   `pulumi:"pitEnabled"`
	ProjectId  string `pulumi:"projectId"`
	// Maximum instance size to which your cluster can automatically scale.
	ProviderAutoScalingComputeMaxInstanceSize string `pulumi:"providerAutoScalingComputeMaxInstanceSize"`
	// Minimum instance size to which your cluster can automatically scale.
	ProviderAutoScalingComputeMinInstanceSize string `pulumi:"providerAutoScalingComputeMinInstanceSize"`
	ProviderBackupEnabled                     bool   `pulumi:"providerBackupEnabled"`
	// Indicates the maximum input/output operations per second (IOPS) the system can perform. The possible values depend on the selected providerSettings.instanceSizeName and diskSizeGB.
	ProviderDiskIops int `pulumi:"providerDiskIops"`
	// Describes Azure disk type of the server’s root volume (Azure Only).
	ProviderDiskTypeName string `pulumi:"providerDiskTypeName"`
	// **(DEPRECATED)** Indicates whether the Amazon EBS encryption is enabled. This feature encrypts the server’s root volume for both data at rest within the volume and data moving between the volume and the instance. By default this attribute is always enabled, per deprecation process showing the real value at `providerEncryptEbsVolumeFlag` computed attribute.
	ProviderEncryptEbsVolume     bool `pulumi:"providerEncryptEbsVolume"`
	ProviderEncryptEbsVolumeFlag bool `pulumi:"providerEncryptEbsVolumeFlag"`
	// Atlas provides different instance sizes, each with a default storage capacity and RAM size.
	ProviderInstanceSizeName string `pulumi:"providerInstanceSizeName"`
	// Indicates the cloud service provider on which the servers are provisioned.
	ProviderName string `pulumi:"providerName"`
	// Indicates Physical location of your MongoDB cluster. The region you choose can affect network latency for clients accessing your databases.  Requires the Atlas Region name, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
	ProviderRegionName string `pulumi:"providerRegionName"`
	// Indicates the type of the volume. The possible values are: `STANDARD` and `PROVISIONED`.
	// > **NOTE:** `STANDARD` is not available for NVME clusters.
	ProviderVolumeType string `pulumi:"providerVolumeType"`
	// (Deprecated) Number of replica set members. Each member keeps a copy of your databases, providing high availability and data redundancy. The possible values are 3, 5, or 7. The default value is 3.
	ReplicationFactor int `pulumi:"replicationFactor"`
	// Configuration for cluster regions.  See Replication Spec below for more details.
	ReplicationSpecs []GetClusterReplicationSpec `pulumi:"replicationSpecs"`
	// current snapshot schedule and retention settings for the cluster.
	SnapshotBackupPolicies []GetClusterSnapshotBackupPolicy `pulumi:"snapshotBackupPolicies"`
	// Connection string for connecting to the Atlas cluster. The +srv modifier forces the connection to use TLS/SSL. See the mongoURI for additional options.
	SrvAddress string `pulumi:"srvAddress"`
	// Indicates the current state of the cluster. The possible states are:
	// - IDLE
	// - CREATING
	// - UPDATING
	// - DELETING
	// - DELETED
	// - REPAIRING
	StateName string `pulumi:"stateName"`
	// Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below.
	Tags []GetClusterTag `pulumi:"tags"`
	// Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
	TerminationProtectionEnabled bool `pulumi:"terminationProtectionEnabled"`
	// Release cadence that Atlas uses for this cluster.
	VersionReleaseSystem string `pulumi:"versionReleaseSystem"`
}

func LookupClusterOutput(ctx *pulumi.Context, args LookupClusterOutputArgs, opts ...pulumi.InvokeOption) LookupClusterResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupClusterResult, error) {
			args := v.(LookupClusterArgs)
			r, err := LookupCluster(ctx, &args, opts...)
			var s LookupClusterResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupClusterResultOutput)
}

// A collection of arguments for invoking getCluster.
type LookupClusterOutputArgs struct {
	// Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed.
	Name pulumi.StringInput `pulumi:"name"`
	// The unique ID for the project to create the database user.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupClusterOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterArgs)(nil)).Elem()
}

// A collection of values returned by getCluster.
type LookupClusterResultOutput struct{ *pulumi.OutputState }

func (LookupClusterResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterResult)(nil)).Elem()
}

func (o LookupClusterResultOutput) ToLookupClusterResultOutput() LookupClusterResultOutput {
	return o
}

func (o LookupClusterResultOutput) ToLookupClusterResultOutputWithContext(ctx context.Context) LookupClusterResultOutput {
	return o
}

// Get the advanced configuration options. See Advanced Configuration below for more details.
func (o LookupClusterResultOutput) AdvancedConfigurations() GetClusterAdvancedConfigurationArrayOutput {
	return o.ApplyT(func(v LookupClusterResult) []GetClusterAdvancedConfiguration { return v.AdvancedConfigurations }).(GetClusterAdvancedConfigurationArrayOutput)
}

// Specifies whether cluster tier auto-scaling is enabled. The default is false.
func (o LookupClusterResultOutput) AutoScalingComputeEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterResult) bool { return v.AutoScalingComputeEnabled }).(pulumi.BoolOutput)
}

// Specifies whether cluster tier auto-down-scaling is enabled.
func (o LookupClusterResultOutput) AutoScalingComputeScaleDownEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterResult) bool { return v.AutoScalingComputeScaleDownEnabled }).(pulumi.BoolOutput)
}

// Indicates whether disk auto-scaling is enabled.
func (o LookupClusterResultOutput) AutoScalingDiskGbEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterResult) bool { return v.AutoScalingDiskGbEnabled }).(pulumi.BoolOutput)
}

// Indicates Cloud service provider on which the server for a multi-tenant cluster is provisioned.
func (o LookupClusterResultOutput) BackingProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.BackingProviderName }).(pulumi.StringOutput)
}

// Legacy Option, Indicates whether Atlas continuous backups are enabled for the cluster.
func (o LookupClusterResultOutput) BackupEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterResult) bool { return v.BackupEnabled }).(pulumi.BoolOutput)
}

// Indicates BI Connector for Atlas configuration on this cluster. BI Connector for Atlas is only available for M10+ clusters. See BI Connector below for more details.
func (o LookupClusterResultOutput) BiConnectorConfigs() GetClusterBiConnectorConfigArrayOutput {
	return o.ApplyT(func(v LookupClusterResult) []GetClusterBiConnectorConfig { return v.BiConnectorConfigs }).(GetClusterBiConnectorConfigArrayOutput)
}

// Indicates the type of the cluster that you want to modify. You cannot convert a sharded cluster deployment to a replica set deployment.
func (o LookupClusterResultOutput) ClusterType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.ClusterType }).(pulumi.StringOutput)
}

// Set of connection strings that your applications use to connect to this cluster. More info in [Connection-strings](https://docs.mongodb.com/manual/reference/connection-string/). Use the parameters in this object to connect your applications to this cluster. To learn more about the formats of connection strings, see [Connection String Options](https://docs.atlas.mongodb.com/reference/faq/connection-changes/).
func (o LookupClusterResultOutput) ConnectionStrings() GetClusterConnectionStringArrayOutput {
	return o.ApplyT(func(v LookupClusterResult) []GetClusterConnectionString { return v.ConnectionStrings }).(GetClusterConnectionStringArrayOutput)
}

// The Network Peering Container ID.
func (o LookupClusterResultOutput) ContainerId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.ContainerId }).(pulumi.StringOutput)
}

// Indicates the size in gigabytes of the server’s root volume (AWS/GCP Only).
func (o LookupClusterResultOutput) DiskSizeGb() pulumi.Float64Output {
	return o.ApplyT(func(v LookupClusterResult) float64 { return v.DiskSizeGb }).(pulumi.Float64Output)
}

// Indicates whether Encryption at Rest is enabled or disabled.
func (o LookupClusterResultOutput) EncryptionAtRestProvider() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.EncryptionAtRestProvider }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupClusterResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.Id }).(pulumi.StringOutput)
}

// Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below. **DEPRECATED** Use `tags` instead.
//
// Deprecated: This parameter is deprecated and will be removed in the future. Please transition to tags
func (o LookupClusterResultOutput) Labels() GetClusterLabelArrayOutput {
	return o.ApplyT(func(v LookupClusterResult) []GetClusterLabel { return v.Labels }).(GetClusterLabelArrayOutput)
}

// Indicates the version of the cluster to deploy.
func (o LookupClusterResultOutput) MongoDbMajorVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.MongoDbMajorVersion }).(pulumi.StringOutput)
}

// Version of MongoDB the cluster runs, in `major-version`.`minor-version` format.
func (o LookupClusterResultOutput) MongoDbVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.MongoDbVersion }).(pulumi.StringOutput)
}

// Base connection string for the cluster. Atlas only displays this field after the cluster is operational, not while it builds the cluster.
func (o LookupClusterResultOutput) MongoUri() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.MongoUri }).(pulumi.StringOutput)
}

// Lists when the connection string was last updated. The connection string changes, for example, if you change a replica set to a sharded cluster.
func (o LookupClusterResultOutput) MongoUriUpdated() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.MongoUriUpdated }).(pulumi.StringOutput)
}

// Describes connection string for connecting to the Atlas cluster. Includes the replicaSet, ssl, and authSource query parameters in the connection string with values appropriate for the cluster.
func (o LookupClusterResultOutput) MongoUriWithOptions() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.MongoUriWithOptions }).(pulumi.StringOutput)
}

// The name of the current plugin
func (o LookupClusterResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.Name }).(pulumi.StringOutput)
}

// Number of shards to deploy in the specified zone.
func (o LookupClusterResultOutput) NumShards() pulumi.IntOutput {
	return o.ApplyT(func(v LookupClusterResult) int { return v.NumShards }).(pulumi.IntOutput)
}

// Flag that indicates whether the cluster is paused or not.
func (o LookupClusterResultOutput) Paused() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterResult) bool { return v.Paused }).(pulumi.BoolOutput)
}

// Flag that indicates if the cluster uses Continuous Cloud Backup.
func (o LookupClusterResultOutput) PitEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterResult) bool { return v.PitEnabled }).(pulumi.BoolOutput)
}

func (o LookupClusterResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Maximum instance size to which your cluster can automatically scale.
func (o LookupClusterResultOutput) ProviderAutoScalingComputeMaxInstanceSize() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.ProviderAutoScalingComputeMaxInstanceSize }).(pulumi.StringOutput)
}

// Minimum instance size to which your cluster can automatically scale.
func (o LookupClusterResultOutput) ProviderAutoScalingComputeMinInstanceSize() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.ProviderAutoScalingComputeMinInstanceSize }).(pulumi.StringOutput)
}

func (o LookupClusterResultOutput) ProviderBackupEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterResult) bool { return v.ProviderBackupEnabled }).(pulumi.BoolOutput)
}

// Indicates the maximum input/output operations per second (IOPS) the system can perform. The possible values depend on the selected providerSettings.instanceSizeName and diskSizeGB.
func (o LookupClusterResultOutput) ProviderDiskIops() pulumi.IntOutput {
	return o.ApplyT(func(v LookupClusterResult) int { return v.ProviderDiskIops }).(pulumi.IntOutput)
}

// Describes Azure disk type of the server’s root volume (Azure Only).
func (o LookupClusterResultOutput) ProviderDiskTypeName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.ProviderDiskTypeName }).(pulumi.StringOutput)
}

// **(DEPRECATED)** Indicates whether the Amazon EBS encryption is enabled. This feature encrypts the server’s root volume for both data at rest within the volume and data moving between the volume and the instance. By default this attribute is always enabled, per deprecation process showing the real value at `providerEncryptEbsVolumeFlag` computed attribute.
func (o LookupClusterResultOutput) ProviderEncryptEbsVolume() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterResult) bool { return v.ProviderEncryptEbsVolume }).(pulumi.BoolOutput)
}

func (o LookupClusterResultOutput) ProviderEncryptEbsVolumeFlag() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterResult) bool { return v.ProviderEncryptEbsVolumeFlag }).(pulumi.BoolOutput)
}

// Atlas provides different instance sizes, each with a default storage capacity and RAM size.
func (o LookupClusterResultOutput) ProviderInstanceSizeName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.ProviderInstanceSizeName }).(pulumi.StringOutput)
}

// Indicates the cloud service provider on which the servers are provisioned.
func (o LookupClusterResultOutput) ProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.ProviderName }).(pulumi.StringOutput)
}

// Indicates Physical location of your MongoDB cluster. The region you choose can affect network latency for clients accessing your databases.  Requires the Atlas Region name, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
func (o LookupClusterResultOutput) ProviderRegionName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.ProviderRegionName }).(pulumi.StringOutput)
}

// Indicates the type of the volume. The possible values are: `STANDARD` and `PROVISIONED`.
// > **NOTE:** `STANDARD` is not available for NVME clusters.
func (o LookupClusterResultOutput) ProviderVolumeType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.ProviderVolumeType }).(pulumi.StringOutput)
}

// (Deprecated) Number of replica set members. Each member keeps a copy of your databases, providing high availability and data redundancy. The possible values are 3, 5, or 7. The default value is 3.
func (o LookupClusterResultOutput) ReplicationFactor() pulumi.IntOutput {
	return o.ApplyT(func(v LookupClusterResult) int { return v.ReplicationFactor }).(pulumi.IntOutput)
}

// Configuration for cluster regions.  See Replication Spec below for more details.
func (o LookupClusterResultOutput) ReplicationSpecs() GetClusterReplicationSpecArrayOutput {
	return o.ApplyT(func(v LookupClusterResult) []GetClusterReplicationSpec { return v.ReplicationSpecs }).(GetClusterReplicationSpecArrayOutput)
}

// current snapshot schedule and retention settings for the cluster.
func (o LookupClusterResultOutput) SnapshotBackupPolicies() GetClusterSnapshotBackupPolicyArrayOutput {
	return o.ApplyT(func(v LookupClusterResult) []GetClusterSnapshotBackupPolicy { return v.SnapshotBackupPolicies }).(GetClusterSnapshotBackupPolicyArrayOutput)
}

// Connection string for connecting to the Atlas cluster. The +srv modifier forces the connection to use TLS/SSL. See the mongoURI for additional options.
func (o LookupClusterResultOutput) SrvAddress() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.SrvAddress }).(pulumi.StringOutput)
}

// Indicates the current state of the cluster. The possible states are:
// - IDLE
// - CREATING
// - UPDATING
// - DELETING
// - DELETED
// - REPAIRING
func (o LookupClusterResultOutput) StateName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.StateName }).(pulumi.StringOutput)
}

// Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below.
func (o LookupClusterResultOutput) Tags() GetClusterTagArrayOutput {
	return o.ApplyT(func(v LookupClusterResult) []GetClusterTag { return v.Tags }).(GetClusterTagArrayOutput)
}

// Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
func (o LookupClusterResultOutput) TerminationProtectionEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClusterResult) bool { return v.TerminationProtectionEnabled }).(pulumi.BoolOutput)
}

// Release cadence that Atlas uses for this cluster.
func (o LookupClusterResultOutput) VersionReleaseSystem() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.VersionReleaseSystem }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupClusterResultOutput{})
}
