// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `ThirdPartyIntegration` describe a Third-Party Integration Settings for the given type.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
func LookupThirdPartyIntegration(ctx *pulumi.Context, args *LookupThirdPartyIntegrationArgs, opts ...pulumi.InvokeOption) (*LookupThirdPartyIntegrationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupThirdPartyIntegrationResult
	err := ctx.Invoke("mongodbatlas:index/getThirdPartyIntegration:getThirdPartyIntegration", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getThirdPartyIntegration.
type LookupThirdPartyIntegrationArgs struct {
	// Whether your cluster has Prometheus enabled.
	Enabled *bool `pulumi:"enabled"`
	// Your Microsoft Teams incoming webhook URL.
	MicrosoftTeamsWebhookUrl *string `pulumi:"microsoftTeamsWebhookUrl"`
	// The unique ID for the project to get all Third-Party service integrations
	ProjectId string `pulumi:"projectId"`
	// Your Prometheus protocol scheme configured for requests.
	Scheme *string `pulumi:"scheme"`
	// Indicates which service discovery method is used, either file or http.
	ServiceDiscovery *string `pulumi:"serviceDiscovery"`
	// Third-Party service integration type
	// * PAGER_DUTY
	// * DATADOG
	// * NEW_RELIC*
	// * OPS_GENIE
	// * VICTOR_OPS
	// * FLOWDOCK*
	// * WEBHOOK
	// * MICROSOFT_TEAMS
	// * PROMETHEUS
	//
	// *resource is now deprecated and will be removed in the next major version, 1.9.0
	// **Note:** Field types NEW_RELIC, FLOWDOCK have now been fully deprecated as part of v1.10.0 release
	Type string `pulumi:"type"`
	// Your Prometheus username.
	UserName *string `pulumi:"userName"`
}

// A collection of values returned by getThirdPartyIntegration.
type LookupThirdPartyIntegrationResult struct {
	// Unique identifier of your New Relic account.
	AccountId string `pulumi:"accountId"`
	// Your API Key.
	ApiKey string `pulumi:"apiKey"`
	// Your API Token.
	ApiToken    string `pulumi:"apiToken"`
	ChannelName string `pulumi:"channelName"`
	// Whether your cluster has Prometheus enabled.
	Enabled *bool `pulumi:"enabled"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Your License Key.
	LicenseKey string `pulumi:"licenseKey"`
	// Your Microsoft Teams incoming webhook URL.
	MicrosoftTeamsWebhookUrl *string `pulumi:"microsoftTeamsWebhookUrl"`
	ProjectId                string  `pulumi:"projectId"`
	// Indicates which API URL to use, either US or EU. Opsgenie will use US by default.
	Region string `pulumi:"region"`
	// An optional field for your Routing Key.
	RoutingKey string `pulumi:"routingKey"`
	// Your Prometheus protocol scheme configured for requests.
	Scheme *string `pulumi:"scheme"`
	// An optional field for your webhook secret.
	Secret string `pulumi:"secret"`
	// Indicates which service discovery method is used, either file or http.
	ServiceDiscovery *string `pulumi:"serviceDiscovery"`
	// Your Service Key.
	ServiceKey string `pulumi:"serviceKey"`
	TeamName   string `pulumi:"teamName"`
	// Property equal to its own integration type
	Type string `pulumi:"type"`
	// Your webhook URL.
	Url string `pulumi:"url"`
	// Your Prometheus username.
	UserName *string `pulumi:"userName"`
}

func LookupThirdPartyIntegrationOutput(ctx *pulumi.Context, args LookupThirdPartyIntegrationOutputArgs, opts ...pulumi.InvokeOption) LookupThirdPartyIntegrationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupThirdPartyIntegrationResult, error) {
			args := v.(LookupThirdPartyIntegrationArgs)
			r, err := LookupThirdPartyIntegration(ctx, &args, opts...)
			var s LookupThirdPartyIntegrationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupThirdPartyIntegrationResultOutput)
}

// A collection of arguments for invoking getThirdPartyIntegration.
type LookupThirdPartyIntegrationOutputArgs struct {
	// Whether your cluster has Prometheus enabled.
	Enabled pulumi.BoolPtrInput `pulumi:"enabled"`
	// Your Microsoft Teams incoming webhook URL.
	MicrosoftTeamsWebhookUrl pulumi.StringPtrInput `pulumi:"microsoftTeamsWebhookUrl"`
	// The unique ID for the project to get all Third-Party service integrations
	ProjectId pulumi.StringInput `pulumi:"projectId"`
	// Your Prometheus protocol scheme configured for requests.
	Scheme pulumi.StringPtrInput `pulumi:"scheme"`
	// Indicates which service discovery method is used, either file or http.
	ServiceDiscovery pulumi.StringPtrInput `pulumi:"serviceDiscovery"`
	// Third-Party service integration type
	// * PAGER_DUTY
	// * DATADOG
	// * NEW_RELIC*
	// * OPS_GENIE
	// * VICTOR_OPS
	// * FLOWDOCK*
	// * WEBHOOK
	// * MICROSOFT_TEAMS
	// * PROMETHEUS
	//
	// *resource is now deprecated and will be removed in the next major version, 1.9.0
	// **Note:** Field types NEW_RELIC, FLOWDOCK have now been fully deprecated as part of v1.10.0 release
	Type pulumi.StringInput `pulumi:"type"`
	// Your Prometheus username.
	UserName pulumi.StringPtrInput `pulumi:"userName"`
}

func (LookupThirdPartyIntegrationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupThirdPartyIntegrationArgs)(nil)).Elem()
}

// A collection of values returned by getThirdPartyIntegration.
type LookupThirdPartyIntegrationResultOutput struct{ *pulumi.OutputState }

func (LookupThirdPartyIntegrationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupThirdPartyIntegrationResult)(nil)).Elem()
}

func (o LookupThirdPartyIntegrationResultOutput) ToLookupThirdPartyIntegrationResultOutput() LookupThirdPartyIntegrationResultOutput {
	return o
}

func (o LookupThirdPartyIntegrationResultOutput) ToLookupThirdPartyIntegrationResultOutputWithContext(ctx context.Context) LookupThirdPartyIntegrationResultOutput {
	return o
}

// Unique identifier of your New Relic account.
func (o LookupThirdPartyIntegrationResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// Your API Key.
func (o LookupThirdPartyIntegrationResultOutput) ApiKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationResult) string { return v.ApiKey }).(pulumi.StringOutput)
}

// Your API Token.
func (o LookupThirdPartyIntegrationResultOutput) ApiToken() pulumi.StringOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationResult) string { return v.ApiToken }).(pulumi.StringOutput)
}

func (o LookupThirdPartyIntegrationResultOutput) ChannelName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationResult) string { return v.ChannelName }).(pulumi.StringOutput)
}

// Whether your cluster has Prometheus enabled.
func (o LookupThirdPartyIntegrationResultOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationResult) *bool { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupThirdPartyIntegrationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationResult) string { return v.Id }).(pulumi.StringOutput)
}

// Your License Key.
func (o LookupThirdPartyIntegrationResultOutput) LicenseKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationResult) string { return v.LicenseKey }).(pulumi.StringOutput)
}

// Your Microsoft Teams incoming webhook URL.
func (o LookupThirdPartyIntegrationResultOutput) MicrosoftTeamsWebhookUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationResult) *string { return v.MicrosoftTeamsWebhookUrl }).(pulumi.StringPtrOutput)
}

func (o LookupThirdPartyIntegrationResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Indicates which API URL to use, either US or EU. Opsgenie will use US by default.
func (o LookupThirdPartyIntegrationResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationResult) string { return v.Region }).(pulumi.StringOutput)
}

// An optional field for your Routing Key.
func (o LookupThirdPartyIntegrationResultOutput) RoutingKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationResult) string { return v.RoutingKey }).(pulumi.StringOutput)
}

// Your Prometheus protocol scheme configured for requests.
func (o LookupThirdPartyIntegrationResultOutput) Scheme() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationResult) *string { return v.Scheme }).(pulumi.StringPtrOutput)
}

// An optional field for your webhook secret.
func (o LookupThirdPartyIntegrationResultOutput) Secret() pulumi.StringOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationResult) string { return v.Secret }).(pulumi.StringOutput)
}

// Indicates which service discovery method is used, either file or http.
func (o LookupThirdPartyIntegrationResultOutput) ServiceDiscovery() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationResult) *string { return v.ServiceDiscovery }).(pulumi.StringPtrOutput)
}

// Your Service Key.
func (o LookupThirdPartyIntegrationResultOutput) ServiceKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationResult) string { return v.ServiceKey }).(pulumi.StringOutput)
}

func (o LookupThirdPartyIntegrationResultOutput) TeamName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationResult) string { return v.TeamName }).(pulumi.StringOutput)
}

// Property equal to its own integration type
func (o LookupThirdPartyIntegrationResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationResult) string { return v.Type }).(pulumi.StringOutput)
}

// Your webhook URL.
func (o LookupThirdPartyIntegrationResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationResult) string { return v.Url }).(pulumi.StringOutput)
}

// Your Prometheus username.
func (o LookupThirdPartyIntegrationResultOutput) UserName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationResult) *string { return v.UserName }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupThirdPartyIntegrationResultOutput{})
}
