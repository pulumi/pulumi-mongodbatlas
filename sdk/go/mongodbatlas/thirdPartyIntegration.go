// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `ThirdPartyIntegration` Provides a Third-Party Integration Settings for the given type.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
//
// > **NOTE:** Slack integrations now use the OAuth2 verification method and must be initially configured, or updated from a legacy integration, through the Atlas third-party service integrations page. Legacy tokens will soon no longer be supported.[Read more about slack setup](https://docs.atlas.mongodb.com/tutorial/third-party-service-integrations/)
//
// > **IMPORTANT** Each project can only have one configuration per {INTEGRATION-TYPE}.
//
// > **IMPORTANT:** All arguments including the secrets will be stored in the raw state as plain-text. Read more about sensitive data in state.
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
//			_, err := mongodbatlas.NewThirdPartyIntegration(ctx, "testDatadog", &mongodbatlas.ThirdPartyIntegrationArgs{
//				ApiKey:    pulumi.String("<API-KEY>"),
//				ProjectId: pulumi.String("<PROJECT-ID>"),
//				Region:    pulumi.String("<REGION>"),
//				Type:      pulumi.String("DATADOG"),
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
// Third-Party Integration Settings can be imported using project ID and the integration type, in the format `project_id`-`type`, e.g.
//
// ```sh
//
//	$ pulumi import mongodbatlas:index/thirdPartyIntegration:ThirdPartyIntegration my_user 1112222b3bf99403840e8934-OPS_GENIE
//
// ```
//
//	See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Third-Party-Integrations/operation/createThirdPartyIntegration) Documentation for more information.
type ThirdPartyIntegration struct {
	pulumi.CustomResourceState

	// Your API Key.
	ApiKey      pulumi.StringOutput `pulumi:"apiKey"`
	ChannelName pulumi.StringOutput `pulumi:"channelName"`
	// Whether your cluster has Prometheus enabled.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// Your Microsoft Teams incoming webhook URL.
	MicrosoftTeamsWebhookUrl pulumi.StringOutput `pulumi:"microsoftTeamsWebhookUrl"`
	// Your Prometheus password.
	Password pulumi.StringOutput `pulumi:"password"`
	// The unique ID for the project to get all Third-Party service integrations
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Indicates which API URL to use, either "US" or "EU". OpsGenie will use "US" by default.
	Region pulumi.StringOutput `pulumi:"region"`
	// An optional field for your Routing Key.
	RoutingKey pulumi.StringOutput `pulumi:"routingKey"`
	// Your Prometheus protocol scheme configured for requests.
	Scheme pulumi.StringOutput `pulumi:"scheme"`
	// An optional field for your webhook secret.
	Secret pulumi.StringPtrOutput `pulumi:"secret"`
	// Indicates which service discovery method is used, either file or http.
	ServiceDiscovery pulumi.StringOutput `pulumi:"serviceDiscovery"`
	// Your Service Key.
	ServiceKey pulumi.StringOutput `pulumi:"serviceKey"`
	TeamName   pulumi.StringOutput `pulumi:"teamName"`
	// Third-Party Integration Settings type
	// * PAGER_DUTY
	// * DATADOG
	// * OPS_GENIE
	// * VICTOR_OPS
	// * WEBHOOK
	// * MICROSOFT_TEAMS
	// * PROMETHEUS
	Type pulumi.StringOutput `pulumi:"type"`
	// Your webhook URL.
	Url pulumi.StringOutput `pulumi:"url"`
	// Your Prometheus username.
	UserName pulumi.StringOutput `pulumi:"userName"`
}

// NewThirdPartyIntegration registers a new resource with the given unique name, arguments, and options.
func NewThirdPartyIntegration(ctx *pulumi.Context,
	name string, args *ThirdPartyIntegrationArgs, opts ...pulumi.ResourceOption) (*ThirdPartyIntegration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	if args.ApiKey != nil {
		args.ApiKey = pulumi.ToSecret(args.ApiKey).(pulumi.StringPtrInput)
	}
	if args.MicrosoftTeamsWebhookUrl != nil {
		args.MicrosoftTeamsWebhookUrl = pulumi.ToSecret(args.MicrosoftTeamsWebhookUrl).(pulumi.StringPtrInput)
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringPtrInput)
	}
	if args.RoutingKey != nil {
		args.RoutingKey = pulumi.ToSecret(args.RoutingKey).(pulumi.StringPtrInput)
	}
	if args.Secret != nil {
		args.Secret = pulumi.ToSecret(args.Secret).(pulumi.StringPtrInput)
	}
	if args.ServiceDiscovery != nil {
		args.ServiceDiscovery = pulumi.ToSecret(args.ServiceDiscovery).(pulumi.StringPtrInput)
	}
	if args.ServiceKey != nil {
		args.ServiceKey = pulumi.ToSecret(args.ServiceKey).(pulumi.StringPtrInput)
	}
	if args.UserName != nil {
		args.UserName = pulumi.ToSecret(args.UserName).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"apiKey",
		"microsoftTeamsWebhookUrl",
		"password",
		"routingKey",
		"secret",
		"serviceDiscovery",
		"serviceKey",
		"userName",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ThirdPartyIntegration
	err := ctx.RegisterResource("mongodbatlas:index/thirdPartyIntegration:ThirdPartyIntegration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetThirdPartyIntegration gets an existing ThirdPartyIntegration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetThirdPartyIntegration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ThirdPartyIntegrationState, opts ...pulumi.ResourceOption) (*ThirdPartyIntegration, error) {
	var resource ThirdPartyIntegration
	err := ctx.ReadResource("mongodbatlas:index/thirdPartyIntegration:ThirdPartyIntegration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ThirdPartyIntegration resources.
type thirdPartyIntegrationState struct {
	// Your API Key.
	ApiKey      *string `pulumi:"apiKey"`
	ChannelName *string `pulumi:"channelName"`
	// Whether your cluster has Prometheus enabled.
	Enabled *bool `pulumi:"enabled"`
	// Your Microsoft Teams incoming webhook URL.
	MicrosoftTeamsWebhookUrl *string `pulumi:"microsoftTeamsWebhookUrl"`
	// Your Prometheus password.
	Password *string `pulumi:"password"`
	// The unique ID for the project to get all Third-Party service integrations
	ProjectId *string `pulumi:"projectId"`
	// Indicates which API URL to use, either "US" or "EU". OpsGenie will use "US" by default.
	Region *string `pulumi:"region"`
	// An optional field for your Routing Key.
	RoutingKey *string `pulumi:"routingKey"`
	// Your Prometheus protocol scheme configured for requests.
	Scheme *string `pulumi:"scheme"`
	// An optional field for your webhook secret.
	Secret *string `pulumi:"secret"`
	// Indicates which service discovery method is used, either file or http.
	ServiceDiscovery *string `pulumi:"serviceDiscovery"`
	// Your Service Key.
	ServiceKey *string `pulumi:"serviceKey"`
	TeamName   *string `pulumi:"teamName"`
	// Third-Party Integration Settings type
	// * PAGER_DUTY
	// * DATADOG
	// * OPS_GENIE
	// * VICTOR_OPS
	// * WEBHOOK
	// * MICROSOFT_TEAMS
	// * PROMETHEUS
	Type *string `pulumi:"type"`
	// Your webhook URL.
	Url *string `pulumi:"url"`
	// Your Prometheus username.
	UserName *string `pulumi:"userName"`
}

type ThirdPartyIntegrationState struct {
	// Your API Key.
	ApiKey      pulumi.StringPtrInput
	ChannelName pulumi.StringPtrInput
	// Whether your cluster has Prometheus enabled.
	Enabled pulumi.BoolPtrInput
	// Your Microsoft Teams incoming webhook URL.
	MicrosoftTeamsWebhookUrl pulumi.StringPtrInput
	// Your Prometheus password.
	Password pulumi.StringPtrInput
	// The unique ID for the project to get all Third-Party service integrations
	ProjectId pulumi.StringPtrInput
	// Indicates which API URL to use, either "US" or "EU". OpsGenie will use "US" by default.
	Region pulumi.StringPtrInput
	// An optional field for your Routing Key.
	RoutingKey pulumi.StringPtrInput
	// Your Prometheus protocol scheme configured for requests.
	Scheme pulumi.StringPtrInput
	// An optional field for your webhook secret.
	Secret pulumi.StringPtrInput
	// Indicates which service discovery method is used, either file or http.
	ServiceDiscovery pulumi.StringPtrInput
	// Your Service Key.
	ServiceKey pulumi.StringPtrInput
	TeamName   pulumi.StringPtrInput
	// Third-Party Integration Settings type
	// * PAGER_DUTY
	// * DATADOG
	// * OPS_GENIE
	// * VICTOR_OPS
	// * WEBHOOK
	// * MICROSOFT_TEAMS
	// * PROMETHEUS
	Type pulumi.StringPtrInput
	// Your webhook URL.
	Url pulumi.StringPtrInput
	// Your Prometheus username.
	UserName pulumi.StringPtrInput
}

func (ThirdPartyIntegrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*thirdPartyIntegrationState)(nil)).Elem()
}

type thirdPartyIntegrationArgs struct {
	// Your API Key.
	ApiKey      *string `pulumi:"apiKey"`
	ChannelName *string `pulumi:"channelName"`
	// Whether your cluster has Prometheus enabled.
	Enabled *bool `pulumi:"enabled"`
	// Your Microsoft Teams incoming webhook URL.
	MicrosoftTeamsWebhookUrl *string `pulumi:"microsoftTeamsWebhookUrl"`
	// Your Prometheus password.
	Password *string `pulumi:"password"`
	// The unique ID for the project to get all Third-Party service integrations
	ProjectId string `pulumi:"projectId"`
	// Indicates which API URL to use, either "US" or "EU". OpsGenie will use "US" by default.
	Region *string `pulumi:"region"`
	// An optional field for your Routing Key.
	RoutingKey *string `pulumi:"routingKey"`
	// Your Prometheus protocol scheme configured for requests.
	Scheme *string `pulumi:"scheme"`
	// An optional field for your webhook secret.
	Secret *string `pulumi:"secret"`
	// Indicates which service discovery method is used, either file or http.
	ServiceDiscovery *string `pulumi:"serviceDiscovery"`
	// Your Service Key.
	ServiceKey *string `pulumi:"serviceKey"`
	TeamName   *string `pulumi:"teamName"`
	// Third-Party Integration Settings type
	// * PAGER_DUTY
	// * DATADOG
	// * OPS_GENIE
	// * VICTOR_OPS
	// * WEBHOOK
	// * MICROSOFT_TEAMS
	// * PROMETHEUS
	Type string `pulumi:"type"`
	// Your webhook URL.
	Url *string `pulumi:"url"`
	// Your Prometheus username.
	UserName *string `pulumi:"userName"`
}

// The set of arguments for constructing a ThirdPartyIntegration resource.
type ThirdPartyIntegrationArgs struct {
	// Your API Key.
	ApiKey      pulumi.StringPtrInput
	ChannelName pulumi.StringPtrInput
	// Whether your cluster has Prometheus enabled.
	Enabled pulumi.BoolPtrInput
	// Your Microsoft Teams incoming webhook URL.
	MicrosoftTeamsWebhookUrl pulumi.StringPtrInput
	// Your Prometheus password.
	Password pulumi.StringPtrInput
	// The unique ID for the project to get all Third-Party service integrations
	ProjectId pulumi.StringInput
	// Indicates which API URL to use, either "US" or "EU". OpsGenie will use "US" by default.
	Region pulumi.StringPtrInput
	// An optional field for your Routing Key.
	RoutingKey pulumi.StringPtrInput
	// Your Prometheus protocol scheme configured for requests.
	Scheme pulumi.StringPtrInput
	// An optional field for your webhook secret.
	Secret pulumi.StringPtrInput
	// Indicates which service discovery method is used, either file or http.
	ServiceDiscovery pulumi.StringPtrInput
	// Your Service Key.
	ServiceKey pulumi.StringPtrInput
	TeamName   pulumi.StringPtrInput
	// Third-Party Integration Settings type
	// * PAGER_DUTY
	// * DATADOG
	// * OPS_GENIE
	// * VICTOR_OPS
	// * WEBHOOK
	// * MICROSOFT_TEAMS
	// * PROMETHEUS
	Type pulumi.StringInput
	// Your webhook URL.
	Url pulumi.StringPtrInput
	// Your Prometheus username.
	UserName pulumi.StringPtrInput
}

func (ThirdPartyIntegrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*thirdPartyIntegrationArgs)(nil)).Elem()
}

type ThirdPartyIntegrationInput interface {
	pulumi.Input

	ToThirdPartyIntegrationOutput() ThirdPartyIntegrationOutput
	ToThirdPartyIntegrationOutputWithContext(ctx context.Context) ThirdPartyIntegrationOutput
}

func (*ThirdPartyIntegration) ElementType() reflect.Type {
	return reflect.TypeOf((**ThirdPartyIntegration)(nil)).Elem()
}

func (i *ThirdPartyIntegration) ToThirdPartyIntegrationOutput() ThirdPartyIntegrationOutput {
	return i.ToThirdPartyIntegrationOutputWithContext(context.Background())
}

func (i *ThirdPartyIntegration) ToThirdPartyIntegrationOutputWithContext(ctx context.Context) ThirdPartyIntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThirdPartyIntegrationOutput)
}

// ThirdPartyIntegrationArrayInput is an input type that accepts ThirdPartyIntegrationArray and ThirdPartyIntegrationArrayOutput values.
// You can construct a concrete instance of `ThirdPartyIntegrationArrayInput` via:
//
//	ThirdPartyIntegrationArray{ ThirdPartyIntegrationArgs{...} }
type ThirdPartyIntegrationArrayInput interface {
	pulumi.Input

	ToThirdPartyIntegrationArrayOutput() ThirdPartyIntegrationArrayOutput
	ToThirdPartyIntegrationArrayOutputWithContext(context.Context) ThirdPartyIntegrationArrayOutput
}

type ThirdPartyIntegrationArray []ThirdPartyIntegrationInput

func (ThirdPartyIntegrationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ThirdPartyIntegration)(nil)).Elem()
}

func (i ThirdPartyIntegrationArray) ToThirdPartyIntegrationArrayOutput() ThirdPartyIntegrationArrayOutput {
	return i.ToThirdPartyIntegrationArrayOutputWithContext(context.Background())
}

func (i ThirdPartyIntegrationArray) ToThirdPartyIntegrationArrayOutputWithContext(ctx context.Context) ThirdPartyIntegrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThirdPartyIntegrationArrayOutput)
}

// ThirdPartyIntegrationMapInput is an input type that accepts ThirdPartyIntegrationMap and ThirdPartyIntegrationMapOutput values.
// You can construct a concrete instance of `ThirdPartyIntegrationMapInput` via:
//
//	ThirdPartyIntegrationMap{ "key": ThirdPartyIntegrationArgs{...} }
type ThirdPartyIntegrationMapInput interface {
	pulumi.Input

	ToThirdPartyIntegrationMapOutput() ThirdPartyIntegrationMapOutput
	ToThirdPartyIntegrationMapOutputWithContext(context.Context) ThirdPartyIntegrationMapOutput
}

type ThirdPartyIntegrationMap map[string]ThirdPartyIntegrationInput

func (ThirdPartyIntegrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ThirdPartyIntegration)(nil)).Elem()
}

func (i ThirdPartyIntegrationMap) ToThirdPartyIntegrationMapOutput() ThirdPartyIntegrationMapOutput {
	return i.ToThirdPartyIntegrationMapOutputWithContext(context.Background())
}

func (i ThirdPartyIntegrationMap) ToThirdPartyIntegrationMapOutputWithContext(ctx context.Context) ThirdPartyIntegrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThirdPartyIntegrationMapOutput)
}

type ThirdPartyIntegrationOutput struct{ *pulumi.OutputState }

func (ThirdPartyIntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ThirdPartyIntegration)(nil)).Elem()
}

func (o ThirdPartyIntegrationOutput) ToThirdPartyIntegrationOutput() ThirdPartyIntegrationOutput {
	return o
}

func (o ThirdPartyIntegrationOutput) ToThirdPartyIntegrationOutputWithContext(ctx context.Context) ThirdPartyIntegrationOutput {
	return o
}

// Your API Key.
func (o ThirdPartyIntegrationOutput) ApiKey() pulumi.StringOutput {
	return o.ApplyT(func(v *ThirdPartyIntegration) pulumi.StringOutput { return v.ApiKey }).(pulumi.StringOutput)
}

func (o ThirdPartyIntegrationOutput) ChannelName() pulumi.StringOutput {
	return o.ApplyT(func(v *ThirdPartyIntegration) pulumi.StringOutput { return v.ChannelName }).(pulumi.StringOutput)
}

// Whether your cluster has Prometheus enabled.
func (o ThirdPartyIntegrationOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *ThirdPartyIntegration) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// Your Microsoft Teams incoming webhook URL.
func (o ThirdPartyIntegrationOutput) MicrosoftTeamsWebhookUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *ThirdPartyIntegration) pulumi.StringOutput { return v.MicrosoftTeamsWebhookUrl }).(pulumi.StringOutput)
}

// Your Prometheus password.
func (o ThirdPartyIntegrationOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v *ThirdPartyIntegration) pulumi.StringOutput { return v.Password }).(pulumi.StringOutput)
}

// The unique ID for the project to get all Third-Party service integrations
func (o ThirdPartyIntegrationOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *ThirdPartyIntegration) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Indicates which API URL to use, either "US" or "EU". OpsGenie will use "US" by default.
func (o ThirdPartyIntegrationOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *ThirdPartyIntegration) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// An optional field for your Routing Key.
func (o ThirdPartyIntegrationOutput) RoutingKey() pulumi.StringOutput {
	return o.ApplyT(func(v *ThirdPartyIntegration) pulumi.StringOutput { return v.RoutingKey }).(pulumi.StringOutput)
}

// Your Prometheus protocol scheme configured for requests.
func (o ThirdPartyIntegrationOutput) Scheme() pulumi.StringOutput {
	return o.ApplyT(func(v *ThirdPartyIntegration) pulumi.StringOutput { return v.Scheme }).(pulumi.StringOutput)
}

// An optional field for your webhook secret.
func (o ThirdPartyIntegrationOutput) Secret() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ThirdPartyIntegration) pulumi.StringPtrOutput { return v.Secret }).(pulumi.StringPtrOutput)
}

// Indicates which service discovery method is used, either file or http.
func (o ThirdPartyIntegrationOutput) ServiceDiscovery() pulumi.StringOutput {
	return o.ApplyT(func(v *ThirdPartyIntegration) pulumi.StringOutput { return v.ServiceDiscovery }).(pulumi.StringOutput)
}

// Your Service Key.
func (o ThirdPartyIntegrationOutput) ServiceKey() pulumi.StringOutput {
	return o.ApplyT(func(v *ThirdPartyIntegration) pulumi.StringOutput { return v.ServiceKey }).(pulumi.StringOutput)
}

func (o ThirdPartyIntegrationOutput) TeamName() pulumi.StringOutput {
	return o.ApplyT(func(v *ThirdPartyIntegration) pulumi.StringOutput { return v.TeamName }).(pulumi.StringOutput)
}

// Third-Party Integration Settings type
// * PAGER_DUTY
// * DATADOG
// * OPS_GENIE
// * VICTOR_OPS
// * WEBHOOK
// * MICROSOFT_TEAMS
// * PROMETHEUS
func (o ThirdPartyIntegrationOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *ThirdPartyIntegration) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// Your webhook URL.
func (o ThirdPartyIntegrationOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *ThirdPartyIntegration) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// Your Prometheus username.
func (o ThirdPartyIntegrationOutput) UserName() pulumi.StringOutput {
	return o.ApplyT(func(v *ThirdPartyIntegration) pulumi.StringOutput { return v.UserName }).(pulumi.StringOutput)
}

type ThirdPartyIntegrationArrayOutput struct{ *pulumi.OutputState }

func (ThirdPartyIntegrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ThirdPartyIntegration)(nil)).Elem()
}

func (o ThirdPartyIntegrationArrayOutput) ToThirdPartyIntegrationArrayOutput() ThirdPartyIntegrationArrayOutput {
	return o
}

func (o ThirdPartyIntegrationArrayOutput) ToThirdPartyIntegrationArrayOutputWithContext(ctx context.Context) ThirdPartyIntegrationArrayOutput {
	return o
}

func (o ThirdPartyIntegrationArrayOutput) Index(i pulumi.IntInput) ThirdPartyIntegrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ThirdPartyIntegration {
		return vs[0].([]*ThirdPartyIntegration)[vs[1].(int)]
	}).(ThirdPartyIntegrationOutput)
}

type ThirdPartyIntegrationMapOutput struct{ *pulumi.OutputState }

func (ThirdPartyIntegrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ThirdPartyIntegration)(nil)).Elem()
}

func (o ThirdPartyIntegrationMapOutput) ToThirdPartyIntegrationMapOutput() ThirdPartyIntegrationMapOutput {
	return o
}

func (o ThirdPartyIntegrationMapOutput) ToThirdPartyIntegrationMapOutputWithContext(ctx context.Context) ThirdPartyIntegrationMapOutput {
	return o
}

func (o ThirdPartyIntegrationMapOutput) MapIndex(k pulumi.StringInput) ThirdPartyIntegrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ThirdPartyIntegration {
		return vs[0].(map[string]*ThirdPartyIntegration)[vs[1].(string)]
	}).(ThirdPartyIntegrationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ThirdPartyIntegrationInput)(nil)).Elem(), &ThirdPartyIntegration{})
	pulumi.RegisterInputType(reflect.TypeOf((*ThirdPartyIntegrationArrayInput)(nil)).Elem(), ThirdPartyIntegrationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ThirdPartyIntegrationMapInput)(nil)).Elem(), ThirdPartyIntegrationMap{})
	pulumi.RegisterOutputType(ThirdPartyIntegrationOutput{})
	pulumi.RegisterOutputType(ThirdPartyIntegrationArrayOutput{})
	pulumi.RegisterOutputType(ThirdPartyIntegrationMapOutput{})
}
