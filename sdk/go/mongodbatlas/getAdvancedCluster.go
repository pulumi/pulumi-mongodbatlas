// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: AdvancedCluster
//
// `AdvancedCluster` describes an Advanced Cluster. The data source requires your Project ID.
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
//			_ = mongodbatlas.LookupAdvancedClusterOutput(ctx, mongodbatlas.GetAdvancedClusterOutputArgs{
//				ProjectId: exampleAdvancedCluster.ProjectId,
//				Name:      exampleAdvancedCluster.Name,
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupAdvancedCluster(ctx *pulumi.Context, args *LookupAdvancedClusterArgs, opts ...pulumi.InvokeOption) (*LookupAdvancedClusterResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAdvancedClusterResult
	err := ctx.Invoke("mongodbatlas:index/getAdvancedCluster:getAdvancedCluster", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAdvancedCluster.
type LookupAdvancedClusterArgs struct {
	// Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed.
	Name string `pulumi:"name"`
	// Flag that indicates if the cluster uses Continuous Cloud Backup.
	PitEnabled *bool `pulumi:"pitEnabled"`
	// The unique ID for the project to create the database user.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getAdvancedCluster.
type LookupAdvancedClusterResult struct {
	// Get the advanced configuration options. See Advanced Configuration below for more details.
	AdvancedConfigurations []GetAdvancedClusterAdvancedConfiguration `pulumi:"advancedConfigurations"`
	BackupEnabled          bool                                      `pulumi:"backupEnabled"`
	// Configuration settings applied to BI Connector for Atlas on this cluster. See below. **NOTE** Prior version of provider had parameter as `biConnector`
	BiConnectorConfigs []GetAdvancedClusterBiConnectorConfig `pulumi:"biConnectorConfigs"`
	// Type of the cluster that you want to create.
	ClusterType string `pulumi:"clusterType"`
	// Set of connection strings that your applications use to connect to this cluster. More info in [Connection-strings](https://docs.mongodb.com/manual/reference/connection-string/). Use the parameters in this object to connect your applications to this cluster. To learn more about the formats of connection strings, see [Connection String Options](https://docs.atlas.mongodb.com/reference/faq/connection-changes/). NOTE: Atlas returns the contents of this object after the cluster is operational, not while it builds the cluster.
	ConnectionStrings []GetAdvancedClusterConnectionString `pulumi:"connectionStrings"`
	CreateDate        string                               `pulumi:"createDate"`
	// Capacity, in gigabytes, of the host's root volume.
	DiskSizeGb float64 `pulumi:"diskSizeGb"`
	// Possible values are AWS, GCP, AZURE or NONE.
	EncryptionAtRestProvider string `pulumi:"encryptionAtRestProvider"`
	// Flag that indicates if cluster uses Atlas-Managed Sharding (false) or Self-Managed Sharding (true).
	GlobalClusterSelfManagedSharding bool `pulumi:"globalClusterSelfManagedSharding"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below. **DEPRECATED** Use `tags` instead.
	//
	// Deprecated: This parameter is deprecated and will be removed by September 2024. Please transition to tags.
	Labels []GetAdvancedClusterLabel `pulumi:"labels"`
	// Version of the cluster to deploy.
	MongoDbMajorVersion string `pulumi:"mongoDbMajorVersion"`
	// Version of MongoDB the cluster runs, in `major-version`.`minor-version` format.
	MongoDbVersion string `pulumi:"mongoDbVersion"`
	Name           string `pulumi:"name"`
	// Flag that indicates whether the cluster is paused or not.
	Paused bool `pulumi:"paused"`
	// Flag that indicates if the cluster uses Continuous Cloud Backup.
	PitEnabled bool   `pulumi:"pitEnabled"`
	ProjectId  string `pulumi:"projectId"`
	// Configuration for cluster regions and the hardware provisioned in them. See below.
	ReplicationSpecs []GetAdvancedClusterReplicationSpec `pulumi:"replicationSpecs"`
	// Certificate Authority that MongoDB Atlas clusters use.
	RootCertType string `pulumi:"rootCertType"`
	// Current state of the cluster. The possible states are:
	StateName string `pulumi:"stateName"`
	// Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below.
	Tags []GetAdvancedClusterTag `pulumi:"tags"`
	// Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
	TerminationProtectionEnabled bool `pulumi:"terminationProtectionEnabled"`
	// Release cadence that Atlas uses for this cluster.
	VersionReleaseSystem string `pulumi:"versionReleaseSystem"`
}

func LookupAdvancedClusterOutput(ctx *pulumi.Context, args LookupAdvancedClusterOutputArgs, opts ...pulumi.InvokeOption) LookupAdvancedClusterResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAdvancedClusterResult, error) {
			args := v.(LookupAdvancedClusterArgs)
			r, err := LookupAdvancedCluster(ctx, &args, opts...)
			var s LookupAdvancedClusterResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAdvancedClusterResultOutput)
}

// A collection of arguments for invoking getAdvancedCluster.
type LookupAdvancedClusterOutputArgs struct {
	// Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed.
	Name pulumi.StringInput `pulumi:"name"`
	// Flag that indicates if the cluster uses Continuous Cloud Backup.
	PitEnabled pulumi.BoolPtrInput `pulumi:"pitEnabled"`
	// The unique ID for the project to create the database user.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupAdvancedClusterOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAdvancedClusterArgs)(nil)).Elem()
}

// A collection of values returned by getAdvancedCluster.
type LookupAdvancedClusterResultOutput struct{ *pulumi.OutputState }

func (LookupAdvancedClusterResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAdvancedClusterResult)(nil)).Elem()
}

func (o LookupAdvancedClusterResultOutput) ToLookupAdvancedClusterResultOutput() LookupAdvancedClusterResultOutput {
	return o
}

func (o LookupAdvancedClusterResultOutput) ToLookupAdvancedClusterResultOutputWithContext(ctx context.Context) LookupAdvancedClusterResultOutput {
	return o
}

// Get the advanced configuration options. See Advanced Configuration below for more details.
func (o LookupAdvancedClusterResultOutput) AdvancedConfigurations() GetAdvancedClusterAdvancedConfigurationArrayOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) []GetAdvancedClusterAdvancedConfiguration {
		return v.AdvancedConfigurations
	}).(GetAdvancedClusterAdvancedConfigurationArrayOutput)
}

func (o LookupAdvancedClusterResultOutput) BackupEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) bool { return v.BackupEnabled }).(pulumi.BoolOutput)
}

// Configuration settings applied to BI Connector for Atlas on this cluster. See below. **NOTE** Prior version of provider had parameter as `biConnector`
func (o LookupAdvancedClusterResultOutput) BiConnectorConfigs() GetAdvancedClusterBiConnectorConfigArrayOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) []GetAdvancedClusterBiConnectorConfig { return v.BiConnectorConfigs }).(GetAdvancedClusterBiConnectorConfigArrayOutput)
}

// Type of the cluster that you want to create.
func (o LookupAdvancedClusterResultOutput) ClusterType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) string { return v.ClusterType }).(pulumi.StringOutput)
}

// Set of connection strings that your applications use to connect to this cluster. More info in [Connection-strings](https://docs.mongodb.com/manual/reference/connection-string/). Use the parameters in this object to connect your applications to this cluster. To learn more about the formats of connection strings, see [Connection String Options](https://docs.atlas.mongodb.com/reference/faq/connection-changes/). NOTE: Atlas returns the contents of this object after the cluster is operational, not while it builds the cluster.
func (o LookupAdvancedClusterResultOutput) ConnectionStrings() GetAdvancedClusterConnectionStringArrayOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) []GetAdvancedClusterConnectionString { return v.ConnectionStrings }).(GetAdvancedClusterConnectionStringArrayOutput)
}

func (o LookupAdvancedClusterResultOutput) CreateDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) string { return v.CreateDate }).(pulumi.StringOutput)
}

// Capacity, in gigabytes, of the host's root volume.
func (o LookupAdvancedClusterResultOutput) DiskSizeGb() pulumi.Float64Output {
	return o.ApplyT(func(v LookupAdvancedClusterResult) float64 { return v.DiskSizeGb }).(pulumi.Float64Output)
}

// Possible values are AWS, GCP, AZURE or NONE.
func (o LookupAdvancedClusterResultOutput) EncryptionAtRestProvider() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) string { return v.EncryptionAtRestProvider }).(pulumi.StringOutput)
}

// Flag that indicates if cluster uses Atlas-Managed Sharding (false) or Self-Managed Sharding (true).
func (o LookupAdvancedClusterResultOutput) GlobalClusterSelfManagedSharding() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) bool { return v.GlobalClusterSelfManagedSharding }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAdvancedClusterResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) string { return v.Id }).(pulumi.StringOutput)
}

// Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below. **DEPRECATED** Use `tags` instead.
//
// Deprecated: This parameter is deprecated and will be removed by September 2024. Please transition to tags.
func (o LookupAdvancedClusterResultOutput) Labels() GetAdvancedClusterLabelArrayOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) []GetAdvancedClusterLabel { return v.Labels }).(GetAdvancedClusterLabelArrayOutput)
}

// Version of the cluster to deploy.
func (o LookupAdvancedClusterResultOutput) MongoDbMajorVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) string { return v.MongoDbMajorVersion }).(pulumi.StringOutput)
}

// Version of MongoDB the cluster runs, in `major-version`.`minor-version` format.
func (o LookupAdvancedClusterResultOutput) MongoDbVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) string { return v.MongoDbVersion }).(pulumi.StringOutput)
}

func (o LookupAdvancedClusterResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) string { return v.Name }).(pulumi.StringOutput)
}

// Flag that indicates whether the cluster is paused or not.
func (o LookupAdvancedClusterResultOutput) Paused() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) bool { return v.Paused }).(pulumi.BoolOutput)
}

// Flag that indicates if the cluster uses Continuous Cloud Backup.
func (o LookupAdvancedClusterResultOutput) PitEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) bool { return v.PitEnabled }).(pulumi.BoolOutput)
}

func (o LookupAdvancedClusterResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Configuration for cluster regions and the hardware provisioned in them. See below.
func (o LookupAdvancedClusterResultOutput) ReplicationSpecs() GetAdvancedClusterReplicationSpecArrayOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) []GetAdvancedClusterReplicationSpec { return v.ReplicationSpecs }).(GetAdvancedClusterReplicationSpecArrayOutput)
}

// Certificate Authority that MongoDB Atlas clusters use.
func (o LookupAdvancedClusterResultOutput) RootCertType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) string { return v.RootCertType }).(pulumi.StringOutput)
}

// Current state of the cluster. The possible states are:
func (o LookupAdvancedClusterResultOutput) StateName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) string { return v.StateName }).(pulumi.StringOutput)
}

// Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below.
func (o LookupAdvancedClusterResultOutput) Tags() GetAdvancedClusterTagArrayOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) []GetAdvancedClusterTag { return v.Tags }).(GetAdvancedClusterTagArrayOutput)
}

// Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
func (o LookupAdvancedClusterResultOutput) TerminationProtectionEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) bool { return v.TerminationProtectionEnabled }).(pulumi.BoolOutput)
}

// Release cadence that Atlas uses for this cluster.
func (o LookupAdvancedClusterResultOutput) VersionReleaseSystem() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAdvancedClusterResult) string { return v.VersionReleaseSystem }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAdvancedClusterResultOutput{})
}
