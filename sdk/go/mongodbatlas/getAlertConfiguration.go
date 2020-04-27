// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// `.AlertConfiguration` describes an Alert Configuration.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
func LookupAlertConfiguration(ctx *pulumi.Context, args *LookupAlertConfigurationArgs, opts ...pulumi.InvokeOption) (*LookupAlertConfigurationResult, error) {
	var rv LookupAlertConfigurationResult
	err := ctx.Invoke("mongodbatlas:index/getAlertConfiguration:getAlertConfiguration", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAlertConfiguration.
type LookupAlertConfigurationArgs struct {
	// Unique identifier for the alert configuration.
	AlertConfigurationId string `pulumi:"alertConfigurationId"`
	// The ID of the project where the alert configuration will create.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getAlertConfiguration.
type LookupAlertConfigurationResult struct {
	AlertConfigurationId string `pulumi:"alertConfigurationId"`
	// Timestamp in ISO 8601 date and time format in UTC when this alert configuration was created.
	Created string `pulumi:"created"`
	// If set to true, the alert configuration is enabled. If enabled is not exported it is set to false.
	Enabled bool `pulumi:"enabled"`
	// The type of event that will trigger an alert.
	// Alert type. Possible values:
	// - Host
	// - `OUTSIDE_METRIC_THRESHOLD`
	// - `HOST_RESTARTED`
	// - `HOST_UPGRADED`
	// - `HOST_NOW_SECONDARY`
	// - `HOST_NOW_PRIMARY`
	// - Replica set
	// - `NO_PRIMARY`
	// - `TOO_MANY_ELECTIONS`
	// Sharded cluster
	// - `CLUSTER_MONGOS_IS_MISSING`
	// - `User`
	// - `JOINED_GROUP`
	// - `REMOVED_FROM_GROUP`
	// - `USER_ROLES_CHANGED_AUDIT`
	// - Project
	// - `USERS_AWAITING_APPROVAL`
	// - `USERS_WITHOUT_MULTI_FACTOR_AUTH`
	// - `GROUP_CREATED`
	// - Team
	// - `JOINED_TEAM`
	// - `REMOVED_FROM_TEAM`
	// - Organization
	// - `INVITED_TO_ORG`
	// - `JOINED_ORG`
	// - Data Explorer
	// - `DATA_EXPLORER`
	// - `DATA_EXPLORER_CRUD`
	// - Billing
	// - `CREDIT_CARD_ABOUT_TO_EXPIRE`
	// - `CHARGE_SUCCEEDED`
	// - `INVOICE_CLOSED`
	EventType string `pulumi:"eventType"`
	// The provider-assigned unique ID for this managed resource.
	Id              string                               `pulumi:"id"`
	Matchers        []GetAlertConfigurationMatcher       `pulumi:"matchers"`
	MetricThreshold GetAlertConfigurationMetricThreshold `pulumi:"metricThreshold"`
	Notifications   []GetAlertConfigurationNotification  `pulumi:"notifications"`
	ProjectId       string                               `pulumi:"projectId"`
	// Timestamp in ISO 8601 date and time format in UTC when this alert configuration was last updated.
	Updated string `pulumi:"updated"`
}
