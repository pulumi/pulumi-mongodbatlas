// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Third-Party Integration Settings can be imported using project ID and the integration type, in the format `project_id`-`type`, e.g.
//
// ```sh
//  $ pulumi import mongodbatlas:index/thirdPartyIntegration:ThirdPartyIntegration my_user 1112222b3bf99403840e8934-OPS_GENIE
// ```
//
//  See [MongoDB Atlas API](https://docs.atlas.mongodb.com/reference/api/third-party-integration-settings-create/) Documentation for more information.
type ThirdPartyIntegration struct {
	pulumi.CustomResourceState

	// Unique identifier of your New Relic account.
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// Your API Key.
	ApiKey pulumi.StringPtrOutput `pulumi:"apiKey"`
	// Your API Token.
	ApiToken    pulumi.StringPtrOutput `pulumi:"apiToken"`
	ChannelName pulumi.StringPtrOutput `pulumi:"channelName"`
	// Your Flowdock Flow name.
	FlowName pulumi.StringPtrOutput `pulumi:"flowName"`
	// Your License Key.
	LicenseKey pulumi.StringPtrOutput `pulumi:"licenseKey"`
	// Your Flowdock organization name.
	// * `WEBHOOK`
	OrgName pulumi.StringPtrOutput `pulumi:"orgName"`
	// The unique ID for the project to get all Third-Party service integrations
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Your Insights Query Key.
	// * `OPS_GENIE`
	ReadToken pulumi.StringPtrOutput `pulumi:"readToken"`
	// Indicates which API URL to use, either US or EU. Opsgenie will use US by default.
	// * `VICTOR_OPS`
	Region pulumi.StringPtrOutput `pulumi:"region"`
	// An optional field for your Routing Key.
	// * `FLOWDOCK`
	RoutingKey pulumi.StringPtrOutput `pulumi:"routingKey"`
	// An optional field for your webhook secret.
	Secret pulumi.StringPtrOutput `pulumi:"secret"`
	// Your Service Key.
	// * `DATADOG`
	ServiceKey pulumi.StringPtrOutput `pulumi:"serviceKey"`
	TeamName   pulumi.StringPtrOutput `pulumi:"teamName"`
	// Third-Party Integration Settings type
	// * PAGER_DUTY
	// * DATADOG
	// * NEW_RELIC
	// * OPS_GENIE
	// * VICTOR_OPS
	// * FLOWDOCK
	// * WEBHOOK
	Type pulumi.StringOutput `pulumi:"type"`
	// Your webhook URL.
	Url pulumi.StringPtrOutput `pulumi:"url"`
	// Your Insights Insert Key.
	WriteToken pulumi.StringPtrOutput `pulumi:"writeToken"`
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
	// Unique identifier of your New Relic account.
	AccountId *string `pulumi:"accountId"`
	// Your API Key.
	ApiKey *string `pulumi:"apiKey"`
	// Your API Token.
	ApiToken    *string `pulumi:"apiToken"`
	ChannelName *string `pulumi:"channelName"`
	// Your Flowdock Flow name.
	FlowName *string `pulumi:"flowName"`
	// Your License Key.
	LicenseKey *string `pulumi:"licenseKey"`
	// Your Flowdock organization name.
	// * `WEBHOOK`
	OrgName *string `pulumi:"orgName"`
	// The unique ID for the project to get all Third-Party service integrations
	ProjectId *string `pulumi:"projectId"`
	// Your Insights Query Key.
	// * `OPS_GENIE`
	ReadToken *string `pulumi:"readToken"`
	// Indicates which API URL to use, either US or EU. Opsgenie will use US by default.
	// * `VICTOR_OPS`
	Region *string `pulumi:"region"`
	// An optional field for your Routing Key.
	// * `FLOWDOCK`
	RoutingKey *string `pulumi:"routingKey"`
	// An optional field for your webhook secret.
	Secret *string `pulumi:"secret"`
	// Your Service Key.
	// * `DATADOG`
	ServiceKey *string `pulumi:"serviceKey"`
	TeamName   *string `pulumi:"teamName"`
	// Third-Party Integration Settings type
	// * PAGER_DUTY
	// * DATADOG
	// * NEW_RELIC
	// * OPS_GENIE
	// * VICTOR_OPS
	// * FLOWDOCK
	// * WEBHOOK
	Type *string `pulumi:"type"`
	// Your webhook URL.
	Url *string `pulumi:"url"`
	// Your Insights Insert Key.
	WriteToken *string `pulumi:"writeToken"`
}

type ThirdPartyIntegrationState struct {
	// Unique identifier of your New Relic account.
	AccountId pulumi.StringPtrInput
	// Your API Key.
	ApiKey pulumi.StringPtrInput
	// Your API Token.
	ApiToken    pulumi.StringPtrInput
	ChannelName pulumi.StringPtrInput
	// Your Flowdock Flow name.
	FlowName pulumi.StringPtrInput
	// Your License Key.
	LicenseKey pulumi.StringPtrInput
	// Your Flowdock organization name.
	// * `WEBHOOK`
	OrgName pulumi.StringPtrInput
	// The unique ID for the project to get all Third-Party service integrations
	ProjectId pulumi.StringPtrInput
	// Your Insights Query Key.
	// * `OPS_GENIE`
	ReadToken pulumi.StringPtrInput
	// Indicates which API URL to use, either US or EU. Opsgenie will use US by default.
	// * `VICTOR_OPS`
	Region pulumi.StringPtrInput
	// An optional field for your Routing Key.
	// * `FLOWDOCK`
	RoutingKey pulumi.StringPtrInput
	// An optional field for your webhook secret.
	Secret pulumi.StringPtrInput
	// Your Service Key.
	// * `DATADOG`
	ServiceKey pulumi.StringPtrInput
	TeamName   pulumi.StringPtrInput
	// Third-Party Integration Settings type
	// * PAGER_DUTY
	// * DATADOG
	// * NEW_RELIC
	// * OPS_GENIE
	// * VICTOR_OPS
	// * FLOWDOCK
	// * WEBHOOK
	Type pulumi.StringPtrInput
	// Your webhook URL.
	Url pulumi.StringPtrInput
	// Your Insights Insert Key.
	WriteToken pulumi.StringPtrInput
}

func (ThirdPartyIntegrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*thirdPartyIntegrationState)(nil)).Elem()
}

type thirdPartyIntegrationArgs struct {
	// Unique identifier of your New Relic account.
	AccountId *string `pulumi:"accountId"`
	// Your API Key.
	ApiKey *string `pulumi:"apiKey"`
	// Your API Token.
	ApiToken    *string `pulumi:"apiToken"`
	ChannelName *string `pulumi:"channelName"`
	// Your Flowdock Flow name.
	FlowName *string `pulumi:"flowName"`
	// Your License Key.
	LicenseKey *string `pulumi:"licenseKey"`
	// Your Flowdock organization name.
	// * `WEBHOOK`
	OrgName *string `pulumi:"orgName"`
	// The unique ID for the project to get all Third-Party service integrations
	ProjectId string `pulumi:"projectId"`
	// Your Insights Query Key.
	// * `OPS_GENIE`
	ReadToken *string `pulumi:"readToken"`
	// Indicates which API URL to use, either US or EU. Opsgenie will use US by default.
	// * `VICTOR_OPS`
	Region *string `pulumi:"region"`
	// An optional field for your Routing Key.
	// * `FLOWDOCK`
	RoutingKey *string `pulumi:"routingKey"`
	// An optional field for your webhook secret.
	Secret *string `pulumi:"secret"`
	// Your Service Key.
	// * `DATADOG`
	ServiceKey *string `pulumi:"serviceKey"`
	TeamName   *string `pulumi:"teamName"`
	// Third-Party Integration Settings type
	// * PAGER_DUTY
	// * DATADOG
	// * NEW_RELIC
	// * OPS_GENIE
	// * VICTOR_OPS
	// * FLOWDOCK
	// * WEBHOOK
	Type string `pulumi:"type"`
	// Your webhook URL.
	Url *string `pulumi:"url"`
	// Your Insights Insert Key.
	WriteToken *string `pulumi:"writeToken"`
}

// The set of arguments for constructing a ThirdPartyIntegration resource.
type ThirdPartyIntegrationArgs struct {
	// Unique identifier of your New Relic account.
	AccountId pulumi.StringPtrInput
	// Your API Key.
	ApiKey pulumi.StringPtrInput
	// Your API Token.
	ApiToken    pulumi.StringPtrInput
	ChannelName pulumi.StringPtrInput
	// Your Flowdock Flow name.
	FlowName pulumi.StringPtrInput
	// Your License Key.
	LicenseKey pulumi.StringPtrInput
	// Your Flowdock organization name.
	// * `WEBHOOK`
	OrgName pulumi.StringPtrInput
	// The unique ID for the project to get all Third-Party service integrations
	ProjectId pulumi.StringInput
	// Your Insights Query Key.
	// * `OPS_GENIE`
	ReadToken pulumi.StringPtrInput
	// Indicates which API URL to use, either US or EU. Opsgenie will use US by default.
	// * `VICTOR_OPS`
	Region pulumi.StringPtrInput
	// An optional field for your Routing Key.
	// * `FLOWDOCK`
	RoutingKey pulumi.StringPtrInput
	// An optional field for your webhook secret.
	Secret pulumi.StringPtrInput
	// Your Service Key.
	// * `DATADOG`
	ServiceKey pulumi.StringPtrInput
	TeamName   pulumi.StringPtrInput
	// Third-Party Integration Settings type
	// * PAGER_DUTY
	// * DATADOG
	// * NEW_RELIC
	// * OPS_GENIE
	// * VICTOR_OPS
	// * FLOWDOCK
	// * WEBHOOK
	Type pulumi.StringInput
	// Your webhook URL.
	Url pulumi.StringPtrInput
	// Your Insights Insert Key.
	WriteToken pulumi.StringPtrInput
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
	return reflect.TypeOf((*ThirdPartyIntegration)(nil))
}

func (i *ThirdPartyIntegration) ToThirdPartyIntegrationOutput() ThirdPartyIntegrationOutput {
	return i.ToThirdPartyIntegrationOutputWithContext(context.Background())
}

func (i *ThirdPartyIntegration) ToThirdPartyIntegrationOutputWithContext(ctx context.Context) ThirdPartyIntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThirdPartyIntegrationOutput)
}

func (i *ThirdPartyIntegration) ToThirdPartyIntegrationPtrOutput() ThirdPartyIntegrationPtrOutput {
	return i.ToThirdPartyIntegrationPtrOutputWithContext(context.Background())
}

func (i *ThirdPartyIntegration) ToThirdPartyIntegrationPtrOutputWithContext(ctx context.Context) ThirdPartyIntegrationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThirdPartyIntegrationPtrOutput)
}

type ThirdPartyIntegrationPtrInput interface {
	pulumi.Input

	ToThirdPartyIntegrationPtrOutput() ThirdPartyIntegrationPtrOutput
	ToThirdPartyIntegrationPtrOutputWithContext(ctx context.Context) ThirdPartyIntegrationPtrOutput
}

type thirdPartyIntegrationPtrType ThirdPartyIntegrationArgs

func (*thirdPartyIntegrationPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ThirdPartyIntegration)(nil))
}

func (i *thirdPartyIntegrationPtrType) ToThirdPartyIntegrationPtrOutput() ThirdPartyIntegrationPtrOutput {
	return i.ToThirdPartyIntegrationPtrOutputWithContext(context.Background())
}

func (i *thirdPartyIntegrationPtrType) ToThirdPartyIntegrationPtrOutputWithContext(ctx context.Context) ThirdPartyIntegrationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThirdPartyIntegrationPtrOutput)
}

// ThirdPartyIntegrationArrayInput is an input type that accepts ThirdPartyIntegrationArray and ThirdPartyIntegrationArrayOutput values.
// You can construct a concrete instance of `ThirdPartyIntegrationArrayInput` via:
//
//          ThirdPartyIntegrationArray{ ThirdPartyIntegrationArgs{...} }
type ThirdPartyIntegrationArrayInput interface {
	pulumi.Input

	ToThirdPartyIntegrationArrayOutput() ThirdPartyIntegrationArrayOutput
	ToThirdPartyIntegrationArrayOutputWithContext(context.Context) ThirdPartyIntegrationArrayOutput
}

type ThirdPartyIntegrationArray []ThirdPartyIntegrationInput

func (ThirdPartyIntegrationArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*ThirdPartyIntegration)(nil))
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
//          ThirdPartyIntegrationMap{ "key": ThirdPartyIntegrationArgs{...} }
type ThirdPartyIntegrationMapInput interface {
	pulumi.Input

	ToThirdPartyIntegrationMapOutput() ThirdPartyIntegrationMapOutput
	ToThirdPartyIntegrationMapOutputWithContext(context.Context) ThirdPartyIntegrationMapOutput
}

type ThirdPartyIntegrationMap map[string]ThirdPartyIntegrationInput

func (ThirdPartyIntegrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*ThirdPartyIntegration)(nil))
}

func (i ThirdPartyIntegrationMap) ToThirdPartyIntegrationMapOutput() ThirdPartyIntegrationMapOutput {
	return i.ToThirdPartyIntegrationMapOutputWithContext(context.Background())
}

func (i ThirdPartyIntegrationMap) ToThirdPartyIntegrationMapOutputWithContext(ctx context.Context) ThirdPartyIntegrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ThirdPartyIntegrationMapOutput)
}

type ThirdPartyIntegrationOutput struct {
	*pulumi.OutputState
}

func (ThirdPartyIntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ThirdPartyIntegration)(nil))
}

func (o ThirdPartyIntegrationOutput) ToThirdPartyIntegrationOutput() ThirdPartyIntegrationOutput {
	return o
}

func (o ThirdPartyIntegrationOutput) ToThirdPartyIntegrationOutputWithContext(ctx context.Context) ThirdPartyIntegrationOutput {
	return o
}

func (o ThirdPartyIntegrationOutput) ToThirdPartyIntegrationPtrOutput() ThirdPartyIntegrationPtrOutput {
	return o.ToThirdPartyIntegrationPtrOutputWithContext(context.Background())
}

func (o ThirdPartyIntegrationOutput) ToThirdPartyIntegrationPtrOutputWithContext(ctx context.Context) ThirdPartyIntegrationPtrOutput {
	return o.ApplyT(func(v ThirdPartyIntegration) *ThirdPartyIntegration {
		return &v
	}).(ThirdPartyIntegrationPtrOutput)
}

type ThirdPartyIntegrationPtrOutput struct {
	*pulumi.OutputState
}

func (ThirdPartyIntegrationPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ThirdPartyIntegration)(nil))
}

func (o ThirdPartyIntegrationPtrOutput) ToThirdPartyIntegrationPtrOutput() ThirdPartyIntegrationPtrOutput {
	return o
}

func (o ThirdPartyIntegrationPtrOutput) ToThirdPartyIntegrationPtrOutputWithContext(ctx context.Context) ThirdPartyIntegrationPtrOutput {
	return o
}

type ThirdPartyIntegrationArrayOutput struct{ *pulumi.OutputState }

func (ThirdPartyIntegrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ThirdPartyIntegration)(nil))
}

func (o ThirdPartyIntegrationArrayOutput) ToThirdPartyIntegrationArrayOutput() ThirdPartyIntegrationArrayOutput {
	return o
}

func (o ThirdPartyIntegrationArrayOutput) ToThirdPartyIntegrationArrayOutputWithContext(ctx context.Context) ThirdPartyIntegrationArrayOutput {
	return o
}

func (o ThirdPartyIntegrationArrayOutput) Index(i pulumi.IntInput) ThirdPartyIntegrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ThirdPartyIntegration {
		return vs[0].([]ThirdPartyIntegration)[vs[1].(int)]
	}).(ThirdPartyIntegrationOutput)
}

type ThirdPartyIntegrationMapOutput struct{ *pulumi.OutputState }

func (ThirdPartyIntegrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ThirdPartyIntegration)(nil))
}

func (o ThirdPartyIntegrationMapOutput) ToThirdPartyIntegrationMapOutput() ThirdPartyIntegrationMapOutput {
	return o
}

func (o ThirdPartyIntegrationMapOutput) ToThirdPartyIntegrationMapOutputWithContext(ctx context.Context) ThirdPartyIntegrationMapOutput {
	return o
}

func (o ThirdPartyIntegrationMapOutput) MapIndex(k pulumi.StringInput) ThirdPartyIntegrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ThirdPartyIntegration {
		return vs[0].(map[string]ThirdPartyIntegration)[vs[1].(string)]
	}).(ThirdPartyIntegrationOutput)
}

func init() {
	pulumi.RegisterOutputType(ThirdPartyIntegrationOutput{})
	pulumi.RegisterOutputType(ThirdPartyIntegrationPtrOutput{})
	pulumi.RegisterOutputType(ThirdPartyIntegrationArrayOutput{})
	pulumi.RegisterOutputType(ThirdPartyIntegrationMapOutput{})
}
