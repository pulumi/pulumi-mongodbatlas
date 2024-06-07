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
//
//	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := mongodbatlas.NewAlertConfiguration(ctx, "test", &mongodbatlas.AlertConfigurationArgs{
//				ProjectId: pulumi.String("<PROJECT-ID>"),
//				EventType: pulumi.String("OUTSIDE_METRIC_THRESHOLD"),
//				Enabled:   pulumi.Bool(true),
//				Notifications: mongodbatlas.AlertConfigurationNotificationArray{
//					&mongodbatlas.AlertConfigurationNotificationArgs{
//						TypeName:     pulumi.String("GROUP"),
//						IntervalMin:  pulumi.Int(5),
//						DelayMin:     pulumi.Int(0),
//						SmsEnabled:   pulumi.Bool(false),
//						EmailEnabled: pulumi.Bool(true),
//						Roles: pulumi.StringArray{
//							pulumi.String("GROUP_CHARTS_ADMIN"),
//							pulumi.String("GROUP_CLUSTER_MANAGER"),
//						},
//					},
//				},
//				Matchers: mongodbatlas.AlertConfigurationMatcherArray{
//					&mongodbatlas.AlertConfigurationMatcherArgs{
//						FieldName: pulumi.String("HOSTNAME_AND_PORT"),
//						Operator:  pulumi.String("EQUALS"),
//						Value:     pulumi.String("SECONDARY"),
//					},
//				},
//				MetricThresholdConfig: &mongodbatlas.AlertConfigurationMetricThresholdConfigArgs{
//					MetricName: pulumi.String("ASSERT_REGULAR"),
//					Operator:   pulumi.String("LESS_THAN"),
//					Threshold:  pulumi.Float64(99),
//					Units:      pulumi.String("RAW"),
//					Mode:       pulumi.String("AVERAGE"),
//				},
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
// > **NOTE:** In order to allow for a fast pace of change to alert variables some validations have been removed from this resource in order to unblock alert creation. Impacted areas have links to the MongoDB Atlas API documentation so always check it for the most current information: https://docs.atlas.mongodb.com/reference/api/alert-configurations-create-config/
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
//			_, err := mongodbatlas.NewAlertConfiguration(ctx, "test", &mongodbatlas.AlertConfigurationArgs{
//				ProjectId: pulumi.String("<PROJECT-ID>"),
//				EventType: pulumi.String("REPLICATION_OPLOG_WINDOW_RUNNING_OUT"),
//				Enabled:   pulumi.Bool(true),
//				Notifications: mongodbatlas.AlertConfigurationNotificationArray{
//					&mongodbatlas.AlertConfigurationNotificationArgs{
//						TypeName:     pulumi.String("GROUP"),
//						IntervalMin:  pulumi.Int(5),
//						DelayMin:     pulumi.Int(0),
//						SmsEnabled:   pulumi.Bool(false),
//						EmailEnabled: pulumi.Bool(true),
//						Roles: pulumi.StringArray{
//							pulumi.String("GROUP_CHARTS_ADMIN"),
//							pulumi.String("GROUP_CLUSTER_MANAGER"),
//						},
//					},
//				},
//				Matchers: mongodbatlas.AlertConfigurationMatcherArray{
//					&mongodbatlas.AlertConfigurationMatcherArgs{
//						FieldName: pulumi.String("HOSTNAME_AND_PORT"),
//						Operator:  pulumi.String("EQUALS"),
//						Value:     pulumi.String("SECONDARY"),
//					},
//				},
//				ThresholdConfig: &mongodbatlas.AlertConfigurationThresholdConfigArgs{
//					Operator:  pulumi.String("LESS_THAN"),
//					Threshold: pulumi.Float64(1),
//					Units:     pulumi.String("HOURS"),
//				},
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
// ### Create an alert with two notifications using Email and SMS
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
//			_, err := mongodbatlas.NewAlertConfiguration(ctx, "test", &mongodbatlas.AlertConfigurationArgs{
//				ProjectId: pulumi.String("PROJECT ID"),
//				EventType: pulumi.String("OUTSIDE_METRIC_THRESHOLD"),
//				Enabled:   pulumi.Bool(true),
//				Notifications: mongodbatlas.AlertConfigurationNotificationArray{
//					&mongodbatlas.AlertConfigurationNotificationArgs{
//						TypeName:     pulumi.String("GROUP"),
//						IntervalMin:  pulumi.Int(5),
//						DelayMin:     pulumi.Int(0),
//						SmsEnabled:   pulumi.Bool(false),
//						EmailEnabled: pulumi.Bool(true),
//						Roles: pulumi.StringArray{
//							pulumi.String("GROUP_DATA_ACCESS_READ_ONLY"),
//							pulumi.String("GROUP_CLUSTER_MANAGER"),
//							pulumi.String("GROUP_DATA_ACCESS_ADMIN"),
//						},
//					},
//					&mongodbatlas.AlertConfigurationNotificationArgs{
//						TypeName:     pulumi.String("ORG"),
//						IntervalMin:  pulumi.Int(5),
//						DelayMin:     pulumi.Int(0),
//						SmsEnabled:   pulumi.Bool(true),
//						EmailEnabled: pulumi.Bool(false),
//					},
//				},
//				Matchers: mongodbatlas.AlertConfigurationMatcherArray{
//					&mongodbatlas.AlertConfigurationMatcherArgs{
//						FieldName: pulumi.String("HOSTNAME_AND_PORT"),
//						Operator:  pulumi.String("EQUALS"),
//						Value:     pulumi.String("SECONDARY"),
//					},
//				},
//				MetricThresholdConfig: &mongodbatlas.AlertConfigurationMetricThresholdConfigArgs{
//					MetricName: pulumi.String("ASSERT_REGULAR"),
//					Operator:   pulumi.String("LESS_THAN"),
//					Threshold:  pulumi.Float64(99),
//					Units:      pulumi.String("RAW"),
//					Mode:       pulumi.String("AVERAGE"),
//				},
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
// ### Create third party notification using credentials from existing third party integration
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
//			test, err := mongodbatlas.LookupThirdPartyIntegration(ctx, &mongodbatlas.LookupThirdPartyIntegrationArgs{
//				ProjectId: "PROJECT ID",
//				Type:      "PAGER_DUTY",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.NewAlertConfiguration(ctx, "test", &mongodbatlas.AlertConfigurationArgs{
//				ProjectId: pulumi.String("PROJECT ID"),
//				Enabled:   pulumi.Bool(true),
//				EventType: pulumi.String("USERS_WITHOUT_MULTI_FACTOR_AUTH"),
//				Notifications: mongodbatlas.AlertConfigurationNotificationArray{
//					&mongodbatlas.AlertConfigurationNotificationArgs{
//						TypeName:      pulumi.String("PAGER_DUTY"),
//						IntegrationId: pulumi.String(test.Id),
//					},
//				},
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
// Alert Configuration can be imported using the `project_id-alert_configuration_id`, e.g.
//
// ```sh
// $ pulumi import mongodbatlas:index/alertConfiguration:AlertConfiguration test 5d0f1f74cf09a29120e123cd-5d0f1f74cf09a29120e1fscg
// ```
// __NOTE__: Third-party notifications will not contain their respective credentials as these are sensitive attributes. If you wish to perform updates on these notifications without providing the original credentials, the corresponding `notifier_id` attribute must be provided instead.
//
// For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/alert-configurations/)
type AlertConfiguration struct {
	pulumi.CustomResourceState

	// Unique identifier for the alert configuration.
	AlertConfigurationId pulumi.StringOutput `pulumi:"alertConfigurationId"`
	// Timestamp in ISO 8601 date and time format in UTC when this alert configuration was created.
	Created pulumi.StringOutput `pulumi:"created"`
	// It is not required, but If the attribute is omitted, by default will be false, and the configuration would be disabled. You must set true to enable the configuration.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The type of event that will trigger an alert.
	//
	// > ***IMPORTANT:*** Event Type has many possible values. Details for both conditional and metric based alerts can be found by selecting the tabs on the [alert config page](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Alert-Configurations/operation/createAlertConfiguration) and checking the latest eventTypeName options.
	//
	// > **NOTE:** If `eventType` is set to `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`, the `metricThresholdConfig` field must also be configured.
	EventType             pulumi.StringOutput                              `pulumi:"eventType"`
	Matchers              AlertConfigurationMatcherArrayOutput             `pulumi:"matchers"`
	MetricThresholdConfig AlertConfigurationMetricThresholdConfigPtrOutput `pulumi:"metricThresholdConfig"`
	Notifications         AlertConfigurationNotificationArrayOutput        `pulumi:"notifications"`
	// The ID of the project where the alert configuration will create.
	ProjectId       pulumi.StringOutput                        `pulumi:"projectId"`
	ThresholdConfig AlertConfigurationThresholdConfigPtrOutput `pulumi:"thresholdConfig"`
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
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
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
	//
	// > ***IMPORTANT:*** Event Type has many possible values. Details for both conditional and metric based alerts can be found by selecting the tabs on the [alert config page](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Alert-Configurations/operation/createAlertConfiguration) and checking the latest eventTypeName options.
	//
	// > **NOTE:** If `eventType` is set to `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`, the `metricThresholdConfig` field must also be configured.
	EventType             *string                                  `pulumi:"eventType"`
	Matchers              []AlertConfigurationMatcher              `pulumi:"matchers"`
	MetricThresholdConfig *AlertConfigurationMetricThresholdConfig `pulumi:"metricThresholdConfig"`
	Notifications         []AlertConfigurationNotification         `pulumi:"notifications"`
	// The ID of the project where the alert configuration will create.
	ProjectId       *string                            `pulumi:"projectId"`
	ThresholdConfig *AlertConfigurationThresholdConfig `pulumi:"thresholdConfig"`
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
	//
	// > ***IMPORTANT:*** Event Type has many possible values. Details for both conditional and metric based alerts can be found by selecting the tabs on the [alert config page](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Alert-Configurations/operation/createAlertConfiguration) and checking the latest eventTypeName options.
	//
	// > **NOTE:** If `eventType` is set to `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`, the `metricThresholdConfig` field must also be configured.
	EventType             pulumi.StringPtrInput
	Matchers              AlertConfigurationMatcherArrayInput
	MetricThresholdConfig AlertConfigurationMetricThresholdConfigPtrInput
	Notifications         AlertConfigurationNotificationArrayInput
	// The ID of the project where the alert configuration will create.
	ProjectId       pulumi.StringPtrInput
	ThresholdConfig AlertConfigurationThresholdConfigPtrInput
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
	//
	// > ***IMPORTANT:*** Event Type has many possible values. Details for both conditional and metric based alerts can be found by selecting the tabs on the [alert config page](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Alert-Configurations/operation/createAlertConfiguration) and checking the latest eventTypeName options.
	//
	// > **NOTE:** If `eventType` is set to `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`, the `metricThresholdConfig` field must also be configured.
	EventType             string                                   `pulumi:"eventType"`
	Matchers              []AlertConfigurationMatcher              `pulumi:"matchers"`
	MetricThresholdConfig *AlertConfigurationMetricThresholdConfig `pulumi:"metricThresholdConfig"`
	Notifications         []AlertConfigurationNotification         `pulumi:"notifications"`
	// The ID of the project where the alert configuration will create.
	ProjectId       string                             `pulumi:"projectId"`
	ThresholdConfig *AlertConfigurationThresholdConfig `pulumi:"thresholdConfig"`
}

// The set of arguments for constructing a AlertConfiguration resource.
type AlertConfigurationArgs struct {
	// It is not required, but If the attribute is omitted, by default will be false, and the configuration would be disabled. You must set true to enable the configuration.
	Enabled pulumi.BoolPtrInput
	// The type of event that will trigger an alert.
	//
	// > ***IMPORTANT:*** Event Type has many possible values. Details for both conditional and metric based alerts can be found by selecting the tabs on the [alert config page](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Alert-Configurations/operation/createAlertConfiguration) and checking the latest eventTypeName options.
	//
	// > **NOTE:** If `eventType` is set to `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`, the `metricThresholdConfig` field must also be configured.
	EventType             pulumi.StringInput
	Matchers              AlertConfigurationMatcherArrayInput
	MetricThresholdConfig AlertConfigurationMetricThresholdConfigPtrInput
	Notifications         AlertConfigurationNotificationArrayInput
	// The ID of the project where the alert configuration will create.
	ProjectId       pulumi.StringInput
	ThresholdConfig AlertConfigurationThresholdConfigPtrInput
}

func (AlertConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*alertConfigurationArgs)(nil)).Elem()
}

type AlertConfigurationInput interface {
	pulumi.Input

	ToAlertConfigurationOutput() AlertConfigurationOutput
	ToAlertConfigurationOutputWithContext(ctx context.Context) AlertConfigurationOutput
}

func (*AlertConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((**AlertConfiguration)(nil)).Elem()
}

func (i *AlertConfiguration) ToAlertConfigurationOutput() AlertConfigurationOutput {
	return i.ToAlertConfigurationOutputWithContext(context.Background())
}

func (i *AlertConfiguration) ToAlertConfigurationOutputWithContext(ctx context.Context) AlertConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertConfigurationOutput)
}

// AlertConfigurationArrayInput is an input type that accepts AlertConfigurationArray and AlertConfigurationArrayOutput values.
// You can construct a concrete instance of `AlertConfigurationArrayInput` via:
//
//	AlertConfigurationArray{ AlertConfigurationArgs{...} }
type AlertConfigurationArrayInput interface {
	pulumi.Input

	ToAlertConfigurationArrayOutput() AlertConfigurationArrayOutput
	ToAlertConfigurationArrayOutputWithContext(context.Context) AlertConfigurationArrayOutput
}

type AlertConfigurationArray []AlertConfigurationInput

func (AlertConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AlertConfiguration)(nil)).Elem()
}

func (i AlertConfigurationArray) ToAlertConfigurationArrayOutput() AlertConfigurationArrayOutput {
	return i.ToAlertConfigurationArrayOutputWithContext(context.Background())
}

func (i AlertConfigurationArray) ToAlertConfigurationArrayOutputWithContext(ctx context.Context) AlertConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertConfigurationArrayOutput)
}

// AlertConfigurationMapInput is an input type that accepts AlertConfigurationMap and AlertConfigurationMapOutput values.
// You can construct a concrete instance of `AlertConfigurationMapInput` via:
//
//	AlertConfigurationMap{ "key": AlertConfigurationArgs{...} }
type AlertConfigurationMapInput interface {
	pulumi.Input

	ToAlertConfigurationMapOutput() AlertConfigurationMapOutput
	ToAlertConfigurationMapOutputWithContext(context.Context) AlertConfigurationMapOutput
}

type AlertConfigurationMap map[string]AlertConfigurationInput

func (AlertConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AlertConfiguration)(nil)).Elem()
}

func (i AlertConfigurationMap) ToAlertConfigurationMapOutput() AlertConfigurationMapOutput {
	return i.ToAlertConfigurationMapOutputWithContext(context.Background())
}

func (i AlertConfigurationMap) ToAlertConfigurationMapOutputWithContext(ctx context.Context) AlertConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertConfigurationMapOutput)
}

type AlertConfigurationOutput struct{ *pulumi.OutputState }

func (AlertConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AlertConfiguration)(nil)).Elem()
}

func (o AlertConfigurationOutput) ToAlertConfigurationOutput() AlertConfigurationOutput {
	return o
}

func (o AlertConfigurationOutput) ToAlertConfigurationOutputWithContext(ctx context.Context) AlertConfigurationOutput {
	return o
}

// Unique identifier for the alert configuration.
func (o AlertConfigurationOutput) AlertConfigurationId() pulumi.StringOutput {
	return o.ApplyT(func(v *AlertConfiguration) pulumi.StringOutput { return v.AlertConfigurationId }).(pulumi.StringOutput)
}

// Timestamp in ISO 8601 date and time format in UTC when this alert configuration was created.
func (o AlertConfigurationOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *AlertConfiguration) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// It is not required, but If the attribute is omitted, by default will be false, and the configuration would be disabled. You must set true to enable the configuration.
func (o AlertConfigurationOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *AlertConfiguration) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// The type of event that will trigger an alert.
//
// > ***IMPORTANT:*** Event Type has many possible values. Details for both conditional and metric based alerts can be found by selecting the tabs on the [alert config page](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Alert-Configurations/operation/createAlertConfiguration) and checking the latest eventTypeName options.
//
// > **NOTE:** If `eventType` is set to `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`, the `metricThresholdConfig` field must also be configured.
func (o AlertConfigurationOutput) EventType() pulumi.StringOutput {
	return o.ApplyT(func(v *AlertConfiguration) pulumi.StringOutput { return v.EventType }).(pulumi.StringOutput)
}

func (o AlertConfigurationOutput) Matchers() AlertConfigurationMatcherArrayOutput {
	return o.ApplyT(func(v *AlertConfiguration) AlertConfigurationMatcherArrayOutput { return v.Matchers }).(AlertConfigurationMatcherArrayOutput)
}

func (o AlertConfigurationOutput) MetricThresholdConfig() AlertConfigurationMetricThresholdConfigPtrOutput {
	return o.ApplyT(func(v *AlertConfiguration) AlertConfigurationMetricThresholdConfigPtrOutput {
		return v.MetricThresholdConfig
	}).(AlertConfigurationMetricThresholdConfigPtrOutput)
}

func (o AlertConfigurationOutput) Notifications() AlertConfigurationNotificationArrayOutput {
	return o.ApplyT(func(v *AlertConfiguration) AlertConfigurationNotificationArrayOutput { return v.Notifications }).(AlertConfigurationNotificationArrayOutput)
}

// The ID of the project where the alert configuration will create.
func (o AlertConfigurationOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *AlertConfiguration) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

func (o AlertConfigurationOutput) ThresholdConfig() AlertConfigurationThresholdConfigPtrOutput {
	return o.ApplyT(func(v *AlertConfiguration) AlertConfigurationThresholdConfigPtrOutput { return v.ThresholdConfig }).(AlertConfigurationThresholdConfigPtrOutput)
}

// Timestamp in ISO 8601 date and time format in UTC when this alert configuration was last updated.
func (o AlertConfigurationOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v *AlertConfiguration) pulumi.StringOutput { return v.Updated }).(pulumi.StringOutput)
}

type AlertConfigurationArrayOutput struct{ *pulumi.OutputState }

func (AlertConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AlertConfiguration)(nil)).Elem()
}

func (o AlertConfigurationArrayOutput) ToAlertConfigurationArrayOutput() AlertConfigurationArrayOutput {
	return o
}

func (o AlertConfigurationArrayOutput) ToAlertConfigurationArrayOutputWithContext(ctx context.Context) AlertConfigurationArrayOutput {
	return o
}

func (o AlertConfigurationArrayOutput) Index(i pulumi.IntInput) AlertConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AlertConfiguration {
		return vs[0].([]*AlertConfiguration)[vs[1].(int)]
	}).(AlertConfigurationOutput)
}

type AlertConfigurationMapOutput struct{ *pulumi.OutputState }

func (AlertConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AlertConfiguration)(nil)).Elem()
}

func (o AlertConfigurationMapOutput) ToAlertConfigurationMapOutput() AlertConfigurationMapOutput {
	return o
}

func (o AlertConfigurationMapOutput) ToAlertConfigurationMapOutputWithContext(ctx context.Context) AlertConfigurationMapOutput {
	return o
}

func (o AlertConfigurationMapOutput) MapIndex(k pulumi.StringInput) AlertConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AlertConfiguration {
		return vs[0].(map[string]*AlertConfiguration)[vs[1].(string)]
	}).(AlertConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AlertConfigurationInput)(nil)).Elem(), &AlertConfiguration{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertConfigurationArrayInput)(nil)).Elem(), AlertConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertConfigurationMapInput)(nil)).Elem(), AlertConfigurationMap{})
	pulumi.RegisterOutputType(AlertConfigurationOutput{})
	pulumi.RegisterOutputType(AlertConfigurationArrayOutput{})
	pulumi.RegisterOutputType(AlertConfigurationMapOutput{})
}
