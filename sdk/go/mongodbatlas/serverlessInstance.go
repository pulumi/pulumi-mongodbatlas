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

// ## Import
//
// Serverless Instance can be imported using the group ID and serverless instance name, in the format `GROUP_ID-SERVERLESS_INSTANCE_NAME`, e.g.
//
// ```sh
//
//	$ pulumi import mongodbatlas:index/serverlessInstance:ServerlessInstance my_serverless_instance 1112222b3bf99403840e8934-My Serverless Instance
//
// ```
//
//	For more information see[MongoDB Atlas API - Serverless Instance](https://docs.atlas.mongodb.com/reference/api/serverless-instances/) Documentation.
type ServerlessInstance struct {
	pulumi.CustomResourceState

	// List of Serverless Private Endpoint Connections
	ConnectionStringsPrivateEndpointSrvs pulumi.StringArrayOutput `pulumi:"connectionStringsPrivateEndpointSrvs"`
	// Public `mongodb+srv://` connection string that you can use to connect to this serverless instance.
	ConnectionStringsStandardSrv pulumi.StringOutput `pulumi:"connectionStringsStandardSrv"`
	// Flag that indicates whether the serverless instance uses [Serverless Continuous Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup). If this parameter is false or not used, the serverless instance uses [Basic Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup).
	ContinuousBackupEnabled pulumi.BoolOutput `pulumi:"continuousBackupEnabled"`
	// Timestamp that indicates when MongoDB Cloud created the serverless instance. The timestamp displays in the ISO 8601 date and time format in UTC.
	CreateDate pulumi.StringOutput               `pulumi:"createDate"`
	Links      ServerlessInstanceLinkArrayOutput `pulumi:"links"`
	// Version of MongoDB that the serverless instance runs, in `<major version>`.`<minor version>` format.
	MongoDbVersion pulumi.StringOutput `pulumi:"mongoDbVersion"`
	// Human-readable label that identifies the serverless instance.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the organization or project you want to create the serverless instance within.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Cloud service provider on which MongoDB Cloud provisioned the serverless instance.
	ProviderSettingsBackingProviderName pulumi.StringOutput `pulumi:"providerSettingsBackingProviderName"`
	// Cloud service provider that applies to the provisioned the serverless instance.
	ProviderSettingsProviderName pulumi.StringOutput `pulumi:"providerSettingsProviderName"`
	// Human-readable label that identifies the physical location of your MongoDB serverless instance. The region you choose can affect network latency for clients accessing your databases.
	ProviderSettingsRegionName pulumi.StringOutput `pulumi:"providerSettingsRegionName"`
	// Stage of deployment of this serverless instance when the resource made its request.
	StateName pulumi.StringOutput `pulumi:"stateName"`
	// Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
	TerminationProtectionEnabled pulumi.BoolOutput `pulumi:"terminationProtectionEnabled"`
}

// NewServerlessInstance registers a new resource with the given unique name, arguments, and options.
func NewServerlessInstance(ctx *pulumi.Context,
	name string, args *ServerlessInstanceArgs, opts ...pulumi.ResourceOption) (*ServerlessInstance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.ProviderSettingsBackingProviderName == nil {
		return nil, errors.New("invalid value for required argument 'ProviderSettingsBackingProviderName'")
	}
	if args.ProviderSettingsProviderName == nil {
		return nil, errors.New("invalid value for required argument 'ProviderSettingsProviderName'")
	}
	if args.ProviderSettingsRegionName == nil {
		return nil, errors.New("invalid value for required argument 'ProviderSettingsRegionName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServerlessInstance
	err := ctx.RegisterResource("mongodbatlas:index/serverlessInstance:ServerlessInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServerlessInstance gets an existing ServerlessInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServerlessInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServerlessInstanceState, opts ...pulumi.ResourceOption) (*ServerlessInstance, error) {
	var resource ServerlessInstance
	err := ctx.ReadResource("mongodbatlas:index/serverlessInstance:ServerlessInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServerlessInstance resources.
type serverlessInstanceState struct {
	// List of Serverless Private Endpoint Connections
	ConnectionStringsPrivateEndpointSrvs []string `pulumi:"connectionStringsPrivateEndpointSrvs"`
	// Public `mongodb+srv://` connection string that you can use to connect to this serverless instance.
	ConnectionStringsStandardSrv *string `pulumi:"connectionStringsStandardSrv"`
	// Flag that indicates whether the serverless instance uses [Serverless Continuous Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup). If this parameter is false or not used, the serverless instance uses [Basic Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup).
	ContinuousBackupEnabled *bool `pulumi:"continuousBackupEnabled"`
	// Timestamp that indicates when MongoDB Cloud created the serverless instance. The timestamp displays in the ISO 8601 date and time format in UTC.
	CreateDate *string                  `pulumi:"createDate"`
	Links      []ServerlessInstanceLink `pulumi:"links"`
	// Version of MongoDB that the serverless instance runs, in `<major version>`.`<minor version>` format.
	MongoDbVersion *string `pulumi:"mongoDbVersion"`
	// Human-readable label that identifies the serverless instance.
	Name *string `pulumi:"name"`
	// The ID of the organization or project you want to create the serverless instance within.
	ProjectId *string `pulumi:"projectId"`
	// Cloud service provider on which MongoDB Cloud provisioned the serverless instance.
	ProviderSettingsBackingProviderName *string `pulumi:"providerSettingsBackingProviderName"`
	// Cloud service provider that applies to the provisioned the serverless instance.
	ProviderSettingsProviderName *string `pulumi:"providerSettingsProviderName"`
	// Human-readable label that identifies the physical location of your MongoDB serverless instance. The region you choose can affect network latency for clients accessing your databases.
	ProviderSettingsRegionName *string `pulumi:"providerSettingsRegionName"`
	// Stage of deployment of this serverless instance when the resource made its request.
	StateName *string `pulumi:"stateName"`
	// Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
	TerminationProtectionEnabled *bool `pulumi:"terminationProtectionEnabled"`
}

type ServerlessInstanceState struct {
	// List of Serverless Private Endpoint Connections
	ConnectionStringsPrivateEndpointSrvs pulumi.StringArrayInput
	// Public `mongodb+srv://` connection string that you can use to connect to this serverless instance.
	ConnectionStringsStandardSrv pulumi.StringPtrInput
	// Flag that indicates whether the serverless instance uses [Serverless Continuous Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup). If this parameter is false or not used, the serverless instance uses [Basic Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup).
	ContinuousBackupEnabled pulumi.BoolPtrInput
	// Timestamp that indicates when MongoDB Cloud created the serverless instance. The timestamp displays in the ISO 8601 date and time format in UTC.
	CreateDate pulumi.StringPtrInput
	Links      ServerlessInstanceLinkArrayInput
	// Version of MongoDB that the serverless instance runs, in `<major version>`.`<minor version>` format.
	MongoDbVersion pulumi.StringPtrInput
	// Human-readable label that identifies the serverless instance.
	Name pulumi.StringPtrInput
	// The ID of the organization or project you want to create the serverless instance within.
	ProjectId pulumi.StringPtrInput
	// Cloud service provider on which MongoDB Cloud provisioned the serverless instance.
	ProviderSettingsBackingProviderName pulumi.StringPtrInput
	// Cloud service provider that applies to the provisioned the serverless instance.
	ProviderSettingsProviderName pulumi.StringPtrInput
	// Human-readable label that identifies the physical location of your MongoDB serverless instance. The region you choose can affect network latency for clients accessing your databases.
	ProviderSettingsRegionName pulumi.StringPtrInput
	// Stage of deployment of this serverless instance when the resource made its request.
	StateName pulumi.StringPtrInput
	// Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
	TerminationProtectionEnabled pulumi.BoolPtrInput
}

func (ServerlessInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*serverlessInstanceState)(nil)).Elem()
}

type serverlessInstanceArgs struct {
	// Flag that indicates whether the serverless instance uses [Serverless Continuous Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup). If this parameter is false or not used, the serverless instance uses [Basic Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup).
	ContinuousBackupEnabled *bool                    `pulumi:"continuousBackupEnabled"`
	Links                   []ServerlessInstanceLink `pulumi:"links"`
	// Human-readable label that identifies the serverless instance.
	Name *string `pulumi:"name"`
	// The ID of the organization or project you want to create the serverless instance within.
	ProjectId string `pulumi:"projectId"`
	// Cloud service provider on which MongoDB Cloud provisioned the serverless instance.
	ProviderSettingsBackingProviderName string `pulumi:"providerSettingsBackingProviderName"`
	// Cloud service provider that applies to the provisioned the serverless instance.
	ProviderSettingsProviderName string `pulumi:"providerSettingsProviderName"`
	// Human-readable label that identifies the physical location of your MongoDB serverless instance. The region you choose can affect network latency for clients accessing your databases.
	ProviderSettingsRegionName string `pulumi:"providerSettingsRegionName"`
	// Stage of deployment of this serverless instance when the resource made its request.
	StateName *string `pulumi:"stateName"`
	// Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
	TerminationProtectionEnabled *bool `pulumi:"terminationProtectionEnabled"`
}

// The set of arguments for constructing a ServerlessInstance resource.
type ServerlessInstanceArgs struct {
	// Flag that indicates whether the serverless instance uses [Serverless Continuous Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup). If this parameter is false or not used, the serverless instance uses [Basic Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup).
	ContinuousBackupEnabled pulumi.BoolPtrInput
	Links                   ServerlessInstanceLinkArrayInput
	// Human-readable label that identifies the serverless instance.
	Name pulumi.StringPtrInput
	// The ID of the organization or project you want to create the serverless instance within.
	ProjectId pulumi.StringInput
	// Cloud service provider on which MongoDB Cloud provisioned the serverless instance.
	ProviderSettingsBackingProviderName pulumi.StringInput
	// Cloud service provider that applies to the provisioned the serverless instance.
	ProviderSettingsProviderName pulumi.StringInput
	// Human-readable label that identifies the physical location of your MongoDB serverless instance. The region you choose can affect network latency for clients accessing your databases.
	ProviderSettingsRegionName pulumi.StringInput
	// Stage of deployment of this serverless instance when the resource made its request.
	StateName pulumi.StringPtrInput
	// Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
	TerminationProtectionEnabled pulumi.BoolPtrInput
}

func (ServerlessInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serverlessInstanceArgs)(nil)).Elem()
}

type ServerlessInstanceInput interface {
	pulumi.Input

	ToServerlessInstanceOutput() ServerlessInstanceOutput
	ToServerlessInstanceOutputWithContext(ctx context.Context) ServerlessInstanceOutput
}

func (*ServerlessInstance) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerlessInstance)(nil)).Elem()
}

func (i *ServerlessInstance) ToServerlessInstanceOutput() ServerlessInstanceOutput {
	return i.ToServerlessInstanceOutputWithContext(context.Background())
}

func (i *ServerlessInstance) ToServerlessInstanceOutputWithContext(ctx context.Context) ServerlessInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerlessInstanceOutput)
}

func (i *ServerlessInstance) ToOutput(ctx context.Context) pulumix.Output[*ServerlessInstance] {
	return pulumix.Output[*ServerlessInstance]{
		OutputState: i.ToServerlessInstanceOutputWithContext(ctx).OutputState,
	}
}

// ServerlessInstanceArrayInput is an input type that accepts ServerlessInstanceArray and ServerlessInstanceArrayOutput values.
// You can construct a concrete instance of `ServerlessInstanceArrayInput` via:
//
//	ServerlessInstanceArray{ ServerlessInstanceArgs{...} }
type ServerlessInstanceArrayInput interface {
	pulumi.Input

	ToServerlessInstanceArrayOutput() ServerlessInstanceArrayOutput
	ToServerlessInstanceArrayOutputWithContext(context.Context) ServerlessInstanceArrayOutput
}

type ServerlessInstanceArray []ServerlessInstanceInput

func (ServerlessInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServerlessInstance)(nil)).Elem()
}

func (i ServerlessInstanceArray) ToServerlessInstanceArrayOutput() ServerlessInstanceArrayOutput {
	return i.ToServerlessInstanceArrayOutputWithContext(context.Background())
}

func (i ServerlessInstanceArray) ToServerlessInstanceArrayOutputWithContext(ctx context.Context) ServerlessInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerlessInstanceArrayOutput)
}

func (i ServerlessInstanceArray) ToOutput(ctx context.Context) pulumix.Output[[]*ServerlessInstance] {
	return pulumix.Output[[]*ServerlessInstance]{
		OutputState: i.ToServerlessInstanceArrayOutputWithContext(ctx).OutputState,
	}
}

// ServerlessInstanceMapInput is an input type that accepts ServerlessInstanceMap and ServerlessInstanceMapOutput values.
// You can construct a concrete instance of `ServerlessInstanceMapInput` via:
//
//	ServerlessInstanceMap{ "key": ServerlessInstanceArgs{...} }
type ServerlessInstanceMapInput interface {
	pulumi.Input

	ToServerlessInstanceMapOutput() ServerlessInstanceMapOutput
	ToServerlessInstanceMapOutputWithContext(context.Context) ServerlessInstanceMapOutput
}

type ServerlessInstanceMap map[string]ServerlessInstanceInput

func (ServerlessInstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServerlessInstance)(nil)).Elem()
}

func (i ServerlessInstanceMap) ToServerlessInstanceMapOutput() ServerlessInstanceMapOutput {
	return i.ToServerlessInstanceMapOutputWithContext(context.Background())
}

func (i ServerlessInstanceMap) ToServerlessInstanceMapOutputWithContext(ctx context.Context) ServerlessInstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerlessInstanceMapOutput)
}

func (i ServerlessInstanceMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*ServerlessInstance] {
	return pulumix.Output[map[string]*ServerlessInstance]{
		OutputState: i.ToServerlessInstanceMapOutputWithContext(ctx).OutputState,
	}
}

type ServerlessInstanceOutput struct{ *pulumi.OutputState }

func (ServerlessInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerlessInstance)(nil)).Elem()
}

func (o ServerlessInstanceOutput) ToServerlessInstanceOutput() ServerlessInstanceOutput {
	return o
}

func (o ServerlessInstanceOutput) ToServerlessInstanceOutputWithContext(ctx context.Context) ServerlessInstanceOutput {
	return o
}

func (o ServerlessInstanceOutput) ToOutput(ctx context.Context) pulumix.Output[*ServerlessInstance] {
	return pulumix.Output[*ServerlessInstance]{
		OutputState: o.OutputState,
	}
}

// List of Serverless Private Endpoint Connections
func (o ServerlessInstanceOutput) ConnectionStringsPrivateEndpointSrvs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ServerlessInstance) pulumi.StringArrayOutput { return v.ConnectionStringsPrivateEndpointSrvs }).(pulumi.StringArrayOutput)
}

// Public `mongodb+srv://` connection string that you can use to connect to this serverless instance.
func (o ServerlessInstanceOutput) ConnectionStringsStandardSrv() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessInstance) pulumi.StringOutput { return v.ConnectionStringsStandardSrv }).(pulumi.StringOutput)
}

// Flag that indicates whether the serverless instance uses [Serverless Continuous Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup). If this parameter is false or not used, the serverless instance uses [Basic Backup](https://www.mongodb.com/docs/atlas/configure-serverless-backup).
func (o ServerlessInstanceOutput) ContinuousBackupEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *ServerlessInstance) pulumi.BoolOutput { return v.ContinuousBackupEnabled }).(pulumi.BoolOutput)
}

// Timestamp that indicates when MongoDB Cloud created the serverless instance. The timestamp displays in the ISO 8601 date and time format in UTC.
func (o ServerlessInstanceOutput) CreateDate() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessInstance) pulumi.StringOutput { return v.CreateDate }).(pulumi.StringOutput)
}

func (o ServerlessInstanceOutput) Links() ServerlessInstanceLinkArrayOutput {
	return o.ApplyT(func(v *ServerlessInstance) ServerlessInstanceLinkArrayOutput { return v.Links }).(ServerlessInstanceLinkArrayOutput)
}

// Version of MongoDB that the serverless instance runs, in `<major version>`.`<minor version>` format.
func (o ServerlessInstanceOutput) MongoDbVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessInstance) pulumi.StringOutput { return v.MongoDbVersion }).(pulumi.StringOutput)
}

// Human-readable label that identifies the serverless instance.
func (o ServerlessInstanceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessInstance) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the organization or project you want to create the serverless instance within.
func (o ServerlessInstanceOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessInstance) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Cloud service provider on which MongoDB Cloud provisioned the serverless instance.
func (o ServerlessInstanceOutput) ProviderSettingsBackingProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessInstance) pulumi.StringOutput { return v.ProviderSettingsBackingProviderName }).(pulumi.StringOutput)
}

// Cloud service provider that applies to the provisioned the serverless instance.
func (o ServerlessInstanceOutput) ProviderSettingsProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessInstance) pulumi.StringOutput { return v.ProviderSettingsProviderName }).(pulumi.StringOutput)
}

// Human-readable label that identifies the physical location of your MongoDB serverless instance. The region you choose can affect network latency for clients accessing your databases.
func (o ServerlessInstanceOutput) ProviderSettingsRegionName() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessInstance) pulumi.StringOutput { return v.ProviderSettingsRegionName }).(pulumi.StringOutput)
}

// Stage of deployment of this serverless instance when the resource made its request.
func (o ServerlessInstanceOutput) StateName() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessInstance) pulumi.StringOutput { return v.StateName }).(pulumi.StringOutput)
}

// Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
func (o ServerlessInstanceOutput) TerminationProtectionEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *ServerlessInstance) pulumi.BoolOutput { return v.TerminationProtectionEnabled }).(pulumi.BoolOutput)
}

type ServerlessInstanceArrayOutput struct{ *pulumi.OutputState }

func (ServerlessInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServerlessInstance)(nil)).Elem()
}

func (o ServerlessInstanceArrayOutput) ToServerlessInstanceArrayOutput() ServerlessInstanceArrayOutput {
	return o
}

func (o ServerlessInstanceArrayOutput) ToServerlessInstanceArrayOutputWithContext(ctx context.Context) ServerlessInstanceArrayOutput {
	return o
}

func (o ServerlessInstanceArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*ServerlessInstance] {
	return pulumix.Output[[]*ServerlessInstance]{
		OutputState: o.OutputState,
	}
}

func (o ServerlessInstanceArrayOutput) Index(i pulumi.IntInput) ServerlessInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServerlessInstance {
		return vs[0].([]*ServerlessInstance)[vs[1].(int)]
	}).(ServerlessInstanceOutput)
}

type ServerlessInstanceMapOutput struct{ *pulumi.OutputState }

func (ServerlessInstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServerlessInstance)(nil)).Elem()
}

func (o ServerlessInstanceMapOutput) ToServerlessInstanceMapOutput() ServerlessInstanceMapOutput {
	return o
}

func (o ServerlessInstanceMapOutput) ToServerlessInstanceMapOutputWithContext(ctx context.Context) ServerlessInstanceMapOutput {
	return o
}

func (o ServerlessInstanceMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*ServerlessInstance] {
	return pulumix.Output[map[string]*ServerlessInstance]{
		OutputState: o.OutputState,
	}
}

func (o ServerlessInstanceMapOutput) MapIndex(k pulumi.StringInput) ServerlessInstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServerlessInstance {
		return vs[0].(map[string]*ServerlessInstance)[vs[1].(string)]
	}).(ServerlessInstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServerlessInstanceInput)(nil)).Elem(), &ServerlessInstance{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerlessInstanceArrayInput)(nil)).Elem(), ServerlessInstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerlessInstanceMapInput)(nil)).Elem(), ServerlessInstanceMap{})
	pulumi.RegisterOutputType(ServerlessInstanceOutput{})
	pulumi.RegisterOutputType(ServerlessInstanceArrayOutput{})
	pulumi.RegisterOutputType(ServerlessInstanceMapOutput{})
}
