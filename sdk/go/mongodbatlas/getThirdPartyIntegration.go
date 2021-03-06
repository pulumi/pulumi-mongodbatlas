// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `ThirdPartyIntegration` describe a Third-Party Integration Settings for the given type.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
func LookupThirdPartyIntegration(ctx *pulumi.Context, args *LookupThirdPartyIntegrationArgs, opts ...pulumi.InvokeOption) (*LookupThirdPartyIntegrationResult, error) {
	var rv LookupThirdPartyIntegrationResult
	err := ctx.Invoke("mongodbatlas:index/getThirdPartyIntegration:getThirdPartyIntegration", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getThirdPartyIntegration.
type LookupThirdPartyIntegrationArgs struct {
	// The unique ID for the project to get all Third-Party service integrations
	ProjectId string `pulumi:"projectId"`
	// Third-Party service integration type
	// * PAGER_DUTY
	// * DATADOG
	// * NEW_RELIC
	// * OPS_GENIE
	// * VICTOR_OPS
	// * FLOWDOCK
	// * WEBHOOK
	Type string `pulumi:"type"`
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
	// Your Flowdock Flow name.
	FlowName string `pulumi:"flowName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Your License Key.
	LicenseKey string `pulumi:"licenseKey"`
	// Your Flowdock organization name.
	// * `WEBHOOK`
	OrgName   string `pulumi:"orgName"`
	ProjectId string `pulumi:"projectId"`
	// Your Insights Query Key.
	// * `OPS_GENIE`
	ReadToken string `pulumi:"readToken"`
	// Indicates which API URL to use, either US or EU. Opsgenie will use US by default.
	// * `VICTOR_OPS`
	Region string `pulumi:"region"`
	// An optional field for your Routing Key.
	// * `FLOWDOCK`
	RoutingKey string `pulumi:"routingKey"`
	// An optional field for your webhook secret.
	Secret string `pulumi:"secret"`
	// Your Service Key.
	// * `DATADOG`
	ServiceKey string `pulumi:"serviceKey"`
	TeamName   string `pulumi:"teamName"`
	// Property equal to its own integration type
	Type string `pulumi:"type"`
	// Your webhook URL.
	Url string `pulumi:"url"`
	// Your Insights Insert Key.
	WriteToken string `pulumi:"writeToken"`
}
