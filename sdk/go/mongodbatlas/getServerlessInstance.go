// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// **WARNING:** This data source is deprecated and will be removed in January 2026. For more details, see Migration Guide: Transition out of Serverless Instances and Shared-tier clusters.
//
// `ServerlessInstance` describes a single serverless instance. This represents a single serverless instance that have been created.
// > **NOTE:**  Serverless instances do not support some Atlas features at this time.
// For a full list of unsupported features, see [Serverless Instance Limitations](https://docs.atlas.mongodb.com/reference/serverless-instance-limitations/).
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
//
// ## Example Usage
//
// ### Basic
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
//			_, err := mongodbatlas.LookupServerlessInstance(ctx, &mongodbatlas.LookupServerlessInstanceArgs{
//				Name:      "<SERVERLESS_INSTANCE_NAME>",
//				ProjectId: "<PROJECT_ID >",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// **NOTE:**  `ServerlessInstance` and `PrivatelinkEndpointServiceServerless` resources have a circular dependency in some respects.\
// That is, the `serverlessInstance` must exist before the `privatelinkEndpointService` can be created,\
// and the `privatelinkEndpointService` must exist before the `serverlessInstance` gets its respective `connectionStringsPrivateEndpointSrv` values.
//
// Because of this, the `serverlessInstance` data source has particular value as a source of the `connectionStringsPrivateEndpointSrv`.\
// When using the dataSource in-tandem with the afforementioned resources, we can create and retrieve the `connectionStringsPrivateEndpointSrv` in a single `pulumi up`.
//
// Follow this example to setup private connection to a serverless instance using aws vpc and get the connection strings in a single `pulumi up`
func LookupServerlessInstance(ctx *pulumi.Context, args *LookupServerlessInstanceArgs, opts ...pulumi.InvokeOption) (*LookupServerlessInstanceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupServerlessInstanceResult
	err := ctx.Invoke("mongodbatlas:index/getServerlessInstance:getServerlessInstance", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServerlessInstance.
type LookupServerlessInstanceArgs struct {
	// (Deprecated) Flag that indicates whether the serverless instance uses [Serverless Auto Indexing](https://www.mongodb.com/docs/atlas/performance-advisor/auto-index-serverless/).
	//
	// Deprecated: This parameter is deprecated and will be removed in March 2025. For more details see https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/serverless-shared-migration-guide.
	AutoIndexing *bool `pulumi:"autoIndexing"`
	// (Deprecated) Flag that indicates whether the serverless instance uses Serverless Continuous Backup.
	//
	// Deprecated: This parameter is deprecated and will be removed in March 2025. For more details see https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/serverless-shared-migration-guide.
	ContinuousBackupEnabled *bool                       `pulumi:"continuousBackupEnabled"`
	Links                   []GetServerlessInstanceLink `pulumi:"links"`
	// Human-readable label that identifies your serverless instance.
	Name string `pulumi:"name"`
	// Unique 24-hexadecimal digit string that identifies the project that contains your serverless instance.
	ProjectId string `pulumi:"projectId"`
	// Stage of deployment of this serverless instance when the resource made its request.
	StateName *string `pulumi:"stateName"`
}

// A collection of values returned by getServerlessInstance.
type LookupServerlessInstanceResult struct {
	// (Deprecated) Flag that indicates whether the serverless instance uses [Serverless Auto Indexing](https://www.mongodb.com/docs/atlas/performance-advisor/auto-index-serverless/).
	//
	// Deprecated: This parameter is deprecated and will be removed in March 2025. For more details see https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/serverless-shared-migration-guide.
	AutoIndexing bool `pulumi:"autoIndexing"`
	// List of Serverless Private Endpoint Connections
	ConnectionStringsPrivateEndpointSrvs []string `pulumi:"connectionStringsPrivateEndpointSrvs"`
	// Public `mongodb+srv://` connection string that you can use to connect to this serverless instance.
	ConnectionStringsStandardSrv string `pulumi:"connectionStringsStandardSrv"`
	// (Deprecated) Flag that indicates whether the serverless instance uses Serverless Continuous Backup.
	//
	// Deprecated: This parameter is deprecated and will be removed in March 2025. For more details see https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/serverless-shared-migration-guide.
	ContinuousBackupEnabled bool   `pulumi:"continuousBackupEnabled"`
	CreateDate              string `pulumi:"createDate"`
	// Unique 24-hexadecimal digit string that identifies the serverless instance.
	Id    string                      `pulumi:"id"`
	Links []GetServerlessInstanceLink `pulumi:"links"`
	// Version of MongoDB that the serverless instance runs, in `<major version>`.`<minor version>` format.
	MongoDbVersion string `pulumi:"mongoDbVersion"`
	Name           string `pulumi:"name"`
	ProjectId      string `pulumi:"projectId"`
	// Cloud service provider on which MongoDB Cloud provisioned the serverless instance.
	ProviderSettingsBackingProviderName string `pulumi:"providerSettingsBackingProviderName"`
	// Cloud service provider that applies to the provisioned the serverless instance.
	ProviderSettingsProviderName string `pulumi:"providerSettingsProviderName"`
	// Human-readable label that identifies the physical location of your MongoDB serverless instance. The region you choose can affect network latency for clients accessing your databases.
	ProviderSettingsRegionName string `pulumi:"providerSettingsRegionName"`
	// Stage of deployment of this serverless instance when the resource made its request.
	StateName string `pulumi:"stateName"`
	// Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below.
	Tags []GetServerlessInstanceTag `pulumi:"tags"`
	// Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
	TerminationProtectionEnabled bool `pulumi:"terminationProtectionEnabled"`
}

func LookupServerlessInstanceOutput(ctx *pulumi.Context, args LookupServerlessInstanceOutputArgs, opts ...pulumi.InvokeOption) LookupServerlessInstanceResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupServerlessInstanceResultOutput, error) {
			args := v.(LookupServerlessInstanceArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getServerlessInstance:getServerlessInstance", args, LookupServerlessInstanceResultOutput{}, options).(LookupServerlessInstanceResultOutput), nil
		}).(LookupServerlessInstanceResultOutput)
}

// A collection of arguments for invoking getServerlessInstance.
type LookupServerlessInstanceOutputArgs struct {
	// (Deprecated) Flag that indicates whether the serverless instance uses [Serverless Auto Indexing](https://www.mongodb.com/docs/atlas/performance-advisor/auto-index-serverless/).
	//
	// Deprecated: This parameter is deprecated and will be removed in March 2025. For more details see https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/serverless-shared-migration-guide.
	AutoIndexing pulumi.BoolPtrInput `pulumi:"autoIndexing"`
	// (Deprecated) Flag that indicates whether the serverless instance uses Serverless Continuous Backup.
	//
	// Deprecated: This parameter is deprecated and will be removed in March 2025. For more details see https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/serverless-shared-migration-guide.
	ContinuousBackupEnabled pulumi.BoolPtrInput                 `pulumi:"continuousBackupEnabled"`
	Links                   GetServerlessInstanceLinkArrayInput `pulumi:"links"`
	// Human-readable label that identifies your serverless instance.
	Name pulumi.StringInput `pulumi:"name"`
	// Unique 24-hexadecimal digit string that identifies the project that contains your serverless instance.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
	// Stage of deployment of this serverless instance when the resource made its request.
	StateName pulumi.StringPtrInput `pulumi:"stateName"`
}

func (LookupServerlessInstanceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServerlessInstanceArgs)(nil)).Elem()
}

// A collection of values returned by getServerlessInstance.
type LookupServerlessInstanceResultOutput struct{ *pulumi.OutputState }

func (LookupServerlessInstanceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServerlessInstanceResult)(nil)).Elem()
}

func (o LookupServerlessInstanceResultOutput) ToLookupServerlessInstanceResultOutput() LookupServerlessInstanceResultOutput {
	return o
}

func (o LookupServerlessInstanceResultOutput) ToLookupServerlessInstanceResultOutputWithContext(ctx context.Context) LookupServerlessInstanceResultOutput {
	return o
}

// (Deprecated) Flag that indicates whether the serverless instance uses [Serverless Auto Indexing](https://www.mongodb.com/docs/atlas/performance-advisor/auto-index-serverless/).
//
// Deprecated: This parameter is deprecated and will be removed in March 2025. For more details see https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/serverless-shared-migration-guide.
func (o LookupServerlessInstanceResultOutput) AutoIndexing() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupServerlessInstanceResult) bool { return v.AutoIndexing }).(pulumi.BoolOutput)
}

// List of Serverless Private Endpoint Connections
func (o LookupServerlessInstanceResultOutput) ConnectionStringsPrivateEndpointSrvs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupServerlessInstanceResult) []string { return v.ConnectionStringsPrivateEndpointSrvs }).(pulumi.StringArrayOutput)
}

// Public `mongodb+srv://` connection string that you can use to connect to this serverless instance.
func (o LookupServerlessInstanceResultOutput) ConnectionStringsStandardSrv() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerlessInstanceResult) string { return v.ConnectionStringsStandardSrv }).(pulumi.StringOutput)
}

// (Deprecated) Flag that indicates whether the serverless instance uses Serverless Continuous Backup.
//
// Deprecated: This parameter is deprecated and will be removed in March 2025. For more details see https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/serverless-shared-migration-guide.
func (o LookupServerlessInstanceResultOutput) ContinuousBackupEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupServerlessInstanceResult) bool { return v.ContinuousBackupEnabled }).(pulumi.BoolOutput)
}

func (o LookupServerlessInstanceResultOutput) CreateDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerlessInstanceResult) string { return v.CreateDate }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies the serverless instance.
func (o LookupServerlessInstanceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerlessInstanceResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupServerlessInstanceResultOutput) Links() GetServerlessInstanceLinkArrayOutput {
	return o.ApplyT(func(v LookupServerlessInstanceResult) []GetServerlessInstanceLink { return v.Links }).(GetServerlessInstanceLinkArrayOutput)
}

// Version of MongoDB that the serverless instance runs, in `<major version>`.`<minor version>` format.
func (o LookupServerlessInstanceResultOutput) MongoDbVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerlessInstanceResult) string { return v.MongoDbVersion }).(pulumi.StringOutput)
}

func (o LookupServerlessInstanceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerlessInstanceResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupServerlessInstanceResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerlessInstanceResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Cloud service provider on which MongoDB Cloud provisioned the serverless instance.
func (o LookupServerlessInstanceResultOutput) ProviderSettingsBackingProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerlessInstanceResult) string { return v.ProviderSettingsBackingProviderName }).(pulumi.StringOutput)
}

// Cloud service provider that applies to the provisioned the serverless instance.
func (o LookupServerlessInstanceResultOutput) ProviderSettingsProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerlessInstanceResult) string { return v.ProviderSettingsProviderName }).(pulumi.StringOutput)
}

// Human-readable label that identifies the physical location of your MongoDB serverless instance. The region you choose can affect network latency for clients accessing your databases.
func (o LookupServerlessInstanceResultOutput) ProviderSettingsRegionName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerlessInstanceResult) string { return v.ProviderSettingsRegionName }).(pulumi.StringOutput)
}

// Stage of deployment of this serverless instance when the resource made its request.
func (o LookupServerlessInstanceResultOutput) StateName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerlessInstanceResult) string { return v.StateName }).(pulumi.StringOutput)
}

// Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below.
func (o LookupServerlessInstanceResultOutput) Tags() GetServerlessInstanceTagArrayOutput {
	return o.ApplyT(func(v LookupServerlessInstanceResult) []GetServerlessInstanceTag { return v.Tags }).(GetServerlessInstanceTagArrayOutput)
}

// Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
func (o LookupServerlessInstanceResultOutput) TerminationProtectionEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupServerlessInstanceResult) bool { return v.TerminationProtectionEnabled }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServerlessInstanceResultOutput{})
}
