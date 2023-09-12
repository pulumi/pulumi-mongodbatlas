// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

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
	// Flag that indicates whether the serverless instance uses Serverless Continuous Backup.
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
	// List of Serverless Private Endpoint Connections
	ConnectionStringsPrivateEndpointSrvs []string `pulumi:"connectionStringsPrivateEndpointSrvs"`
	// Public `mongodb+srv://` connection string that you can use to connect to this serverless instance.
	ConnectionStringsStandardSrv string `pulumi:"connectionStringsStandardSrv"`
	// Flag that indicates whether the serverless instance uses Serverless Continuous Backup.
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
	// Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
	TerminationProtectionEnabled bool `pulumi:"terminationProtectionEnabled"`
}

func LookupServerlessInstanceOutput(ctx *pulumi.Context, args LookupServerlessInstanceOutputArgs, opts ...pulumi.InvokeOption) LookupServerlessInstanceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupServerlessInstanceResult, error) {
			args := v.(LookupServerlessInstanceArgs)
			r, err := LookupServerlessInstance(ctx, &args, opts...)
			var s LookupServerlessInstanceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupServerlessInstanceResultOutput)
}

// A collection of arguments for invoking getServerlessInstance.
type LookupServerlessInstanceOutputArgs struct {
	// Flag that indicates whether the serverless instance uses Serverless Continuous Backup.
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

func (o LookupServerlessInstanceResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupServerlessInstanceResult] {
	return pulumix.Output[LookupServerlessInstanceResult]{
		OutputState: o.OutputState,
	}
}

// List of Serverless Private Endpoint Connections
func (o LookupServerlessInstanceResultOutput) ConnectionStringsPrivateEndpointSrvs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupServerlessInstanceResult) []string { return v.ConnectionStringsPrivateEndpointSrvs }).(pulumi.StringArrayOutput)
}

// Public `mongodb+srv://` connection string that you can use to connect to this serverless instance.
func (o LookupServerlessInstanceResultOutput) ConnectionStringsStandardSrv() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerlessInstanceResult) string { return v.ConnectionStringsStandardSrv }).(pulumi.StringOutput)
}

// Flag that indicates whether the serverless instance uses Serverless Continuous Backup.
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

// Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
func (o LookupServerlessInstanceResultOutput) TerminationProtectionEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupServerlessInstanceResult) bool { return v.TerminationProtectionEnabled }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServerlessInstanceResultOutput{})
}
