// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// `AlertConfiguration` provides an Alert Configuration resource to define the conditions that trigger an alert and the methods of notification within a MongoDB Atlas project.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-mongodbatlas/sdk/go/mongodbatlas"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := mongodbatlas.NewAlertConfiguration(ctx, "test", &mongodbatlas.AlertConfigurationArgs{
// 			Enabled:   pulumi.Bool(true),
// 			EventType: pulumi.String("OUTSIDE_METRIC_THRESHOLD"),
// 			Matchers: mongodbatlas.AlertConfigurationMatcherArray{
// 				&mongodbatlas.AlertConfigurationMatcherArgs{
// 					FieldName: pulumi.String("HOSTNAME_AND_PORT"),
// 					Operator:  pulumi.String("EQUALS"),
// 					Value:     pulumi.String("SECONDARY"),
// 				},
// 			},
// 			MetricThreshold: &mongodbatlas.AlertConfigurationMetricThresholdArgs{
// 				Metric_name: pulumi.String("ASSERT_REGULAR"),
// 				Mode:        pulumi.String("AVERAGE"),
// 				Operator:    pulumi.String("LESS_THAN"),
// 				Threshold:   pulumi.Float64(99),
// 				Units:       pulumi.String("RAW"),
// 			},
// 			Notifications: mongodbatlas.AlertConfigurationNotificationArray{
// 				&mongodbatlas.AlertConfigurationNotificationArgs{
// 					DelayMin:     pulumi.Int(0),
// 					EmailEnabled: pulumi.Bool(true),
// 					IntervalMin:  pulumi.Int(5),
// 					Roles: pulumi.StringArray{
// 						pulumi.String("GROUP_CHARTS_ADMIN"),
// 						pulumi.String("GROUP_CLUSTER_MANAGER"),
// 					},
// 					SmsEnabled: pulumi.Bool(false),
// 					TypeName:   pulumi.String("GROUP"),
// 				},
// 			},
// 			ProjectId: pulumi.String("<PROJECT-ID>"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// > **NOTE:** In order to allow for a fast pace of change to alert variables some validations have been removed from this resource in order to unblock alert creation. Impacted areas have links to the MongoDB Atlas API documentation so always check it for the most current information: https://docs.atlas.mongodb.com/reference/api/alert-configurations-create-config/
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-mongodbatlas/sdk/go/mongodbatlas"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := mongodbatlas.NewAlertConfiguration(ctx, "test", &mongodbatlas.AlertConfigurationArgs{
// 			Enabled:   pulumi.Bool(true),
// 			EventType: pulumi.String("REPLICATION_OPLOG_WINDOW_RUNNING_OUT"),
// 			Matchers: mongodbatlas.AlertConfigurationMatcherArray{
// 				&mongodbatlas.AlertConfigurationMatcherArgs{
// 					FieldName: pulumi.String("HOSTNAME_AND_PORT"),
// 					Operator:  pulumi.String("EQUALS"),
// 					Value:     pulumi.String("SECONDARY"),
// 				},
// 			},
// 			Notifications: mongodbatlas.AlertConfigurationNotificationArray{
// 				&mongodbatlas.AlertConfigurationNotificationArgs{
// 					DelayMin:     pulumi.Int(0),
// 					EmailEnabled: pulumi.Bool(true),
// 					IntervalMin:  pulumi.Int(5),
// 					Roles: pulumi.StringArray{
// 						pulumi.String("GROUP_CHARTS_ADMIN"),
// 						pulumi.String("GROUP_CLUSTER_MANAGER"),
// 					},
// 					SmsEnabled: pulumi.Bool(false),
// 					TypeName:   pulumi.String("GROUP"),
// 				},
// 			},
// 			ProjectId: pulumi.String("<PROJECT-ID>"),
// 			Threshold: &mongodbatlas.AlertConfigurationThresholdArgs{
// 				Operator:  pulumi.String("LESS_THAN"),
// 				Threshold: pulumi.Float64(1),
// 				Units:     pulumi.String("HOURS"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Alert Configuration can be imported using the `project_id-alert_configuration_id`, e.g.
//
// ```sh
//  $ pulumi import mongodbatlas:index/alertConfiguration:AlertConfiguration test 5d0f1f74cf09a29120e123cd-5d0f1f74cf09a29120e1fscg
// ```
//
//  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/alert-configurations/)
type AlertConfiguration struct {
	pulumi.CustomResourceState

	// Unique identifier for the alert configuration.
	AlertConfigurationId pulumi.StringOutput `pulumi:"alertConfigurationId"`
	// Timestamp in ISO 8601 date and time format in UTC when this alert configuration was created.
	Created pulumi.StringOutput `pulumi:"created"`
	// It is not required, but If the attribute is omitted, by default will be false, and the configuration would be disabled. You must set true to enable the configuration.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The type of event that will trigger an alert.
	EventType       pulumi.StringOutput                        `pulumi:"eventType"`
	Matchers        AlertConfigurationMatcherArrayOutput       `pulumi:"matchers"`
	MetricThreshold AlertConfigurationMetricThresholdPtrOutput `pulumi:"metricThreshold"`
	Notifications   AlertConfigurationNotificationArrayOutput  `pulumi:"notifications"`
	// The ID of the project where the alert configuration will create.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Threshold value outside of which an alert will be triggered.
	Threshold AlertConfigurationThresholdPtrOutput `pulumi:"threshold"`
	// Timestamp in ISO 8601 date and time format in UTC when this alert configuration was last updated.
	Updated pulumi.StringOutput `pulumi:"updated"`
}

// NewAlertConfiguration registers a new resource with the given unique name, arguments, and options.
func NewAlertConfiguration(ctx *pulumi.Context,
	name string, args *AlertConfigurationArgs, opts ...pulumi.ResourceOption) (*AlertConfiguration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EventType == nil {
		return nil, errors.New("invalid value for required argument 'EventType'")
	}
	if args.Notifications == nil {
		return nil, errors.New("invalid value for required argument 'Notifications'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	var resource AlertConfiguration
	err := ctx.RegisterResource("mongodbatlas:index/alertConfiguration:AlertConfiguration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAlertConfiguration gets an existing AlertConfiguration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAlertConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AlertConfigurationState, opts ...pulumi.ResourceOption) (*AlertConfiguration, error) {
	var resource AlertConfiguration
	err := ctx.ReadResource("mongodbatlas:index/alertConfiguration:AlertConfiguration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AlertConfiguration resources.
type alertConfigurationState struct {
	// Unique identifier for the alert configuration.
	AlertConfigurationId *string `pulumi:"alertConfigurationId"`
	// Timestamp in ISO 8601 date and time format in UTC when this alert configuration was created.
	Created *string `pulumi:"created"`
	// It is not required, but If the attribute is omitted, by default will be false, and the configuration would be disabled. You must set true to enable the configuration.
	Enabled *bool `pulumi:"enabled"`
	// The type of event that will trigger an alert.
	EventType       *string                            `pulumi:"eventType"`
	Matchers        []AlertConfigurationMatcher        `pulumi:"matchers"`
	MetricThreshold *AlertConfigurationMetricThreshold `pulumi:"metricThreshold"`
	Notifications   []AlertConfigurationNotification   `pulumi:"notifications"`
	// The ID of the project where the alert configuration will create.
	ProjectId *string `pulumi:"projectId"`
	// Threshold value outside of which an alert will be triggered.
	Threshold *AlertConfigurationThreshold `pulumi:"threshold"`
	// Timestamp in ISO 8601 date and time format in UTC when this alert configuration was last updated.
	Updated *string `pulumi:"updated"`
}

type AlertConfigurationState struct {
	// Unique identifier for the alert configuration.
	AlertConfigurationId pulumi.StringPtrInput
	// Timestamp in ISO 8601 date and time format in UTC when this alert configuration was created.
	Created pulumi.StringPtrInput
	// It is not required, but If the attribute is omitted, by default will be false, and the configuration would be disabled. You must set true to enable the configuration.
	Enabled pulumi.BoolPtrInput
	// The type of event that will trigger an alert.
	EventType       pulumi.StringPtrInput
	Matchers        AlertConfigurationMatcherArrayInput
	MetricThreshold AlertConfigurationMetricThresholdPtrInput
	Notifications   AlertConfigurationNotificationArrayInput
	// The ID of the project where the alert configuration will create.
	ProjectId pulumi.StringPtrInput
	// Threshold value outside of which an alert will be triggered.
	Threshold AlertConfigurationThresholdPtrInput
	// Timestamp in ISO 8601 date and time format in UTC when this alert configuration was last updated.
	Updated pulumi.StringPtrInput
}

func (AlertConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*alertConfigurationState)(nil)).Elem()
}

type alertConfigurationArgs struct {
	// It is not required, but If the attribute is omitted, by default will be false, and the configuration would be disabled. You must set true to enable the configuration.
	Enabled *bool `pulumi:"enabled"`
	// The type of event that will trigger an alert.
	EventType       string                             `pulumi:"eventType"`
	Matchers        []AlertConfigurationMatcher        `pulumi:"matchers"`
	MetricThreshold *AlertConfigurationMetricThreshold `pulumi:"metricThreshold"`
	Notifications   []AlertConfigurationNotification   `pulumi:"notifications"`
	// The ID of the project where the alert configuration will create.
	ProjectId string `pulumi:"projectId"`
	// Threshold value outside of which an alert will be triggered.
	Threshold *AlertConfigurationThreshold `pulumi:"threshold"`
}

// The set of arguments for constructing a AlertConfiguration resource.
type AlertConfigurationArgs struct {
	// It is not required, but If the attribute is omitted, by default will be false, and the configuration would be disabled. You must set true to enable the configuration.
	Enabled pulumi.BoolPtrInput
	// The type of event that will trigger an alert.
	EventType       pulumi.StringInput
	Matchers        AlertConfigurationMatcherArrayInput
	MetricThreshold AlertConfigurationMetricThresholdPtrInput
	Notifications   AlertConfigurationNotificationArrayInput
	// The ID of the project where the alert configuration will create.
	ProjectId pulumi.StringInput
	// Threshold value outside of which an alert will be triggered.
	Threshold AlertConfigurationThresholdPtrInput
}

func (AlertConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*alertConfigurationArgs)(nil)).Elem()
}

type AlertConfigurationInput interface {
	pulumi.Input

	ToAlertConfigurationOutput() AlertConfigurationOutput
	ToAlertConfigurationOutputWithContext(ctx context.Context) AlertConfigurationOutput
}

func (AlertConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((*AlertConfiguration)(nil)).Elem()
}

func (i AlertConfiguration) ToAlertConfigurationOutput() AlertConfigurationOutput {
	return i.ToAlertConfigurationOutputWithContext(context.Background())
}

func (i AlertConfiguration) ToAlertConfigurationOutputWithContext(ctx context.Context) AlertConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertConfigurationOutput)
}

type AlertConfigurationOutput struct {
	*pulumi.OutputState
}

func (AlertConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AlertConfigurationOutput)(nil)).Elem()
}

func (o AlertConfigurationOutput) ToAlertConfigurationOutput() AlertConfigurationOutput {
	return o
}

func (o AlertConfigurationOutput) ToAlertConfigurationOutputWithContext(ctx context.Context) AlertConfigurationOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(AlertConfigurationOutput{})
}
