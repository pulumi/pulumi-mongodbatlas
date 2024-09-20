// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: EventTrigger
//
// `EventTrigger` describes an Event Trigger.
func LookupEventTrigger(ctx *pulumi.Context, args *LookupEventTriggerArgs, opts ...pulumi.InvokeOption) (*LookupEventTriggerResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEventTriggerResult
	err := ctx.Invoke("mongodbatlas:index/getEventTrigger:getEventTrigger", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEventTrigger.
type LookupEventTriggerArgs struct {
	// The ObjectID of your application.
	// * For more details on `projectId` and `appId` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
	AppId string `pulumi:"appId"`
	// The unique ID for the project to create the trigger.
	ProjectId string `pulumi:"projectId"`
	// The unique ID of the trigger.
	TriggerId string `pulumi:"triggerId"`
}

// A collection of values returned by getEventTrigger.
type LookupEventTriggerResult struct {
	AppId string `pulumi:"appId"`
	// The name of the MongoDB collection that the trigger watches for change events.
	ConfigCollection string `pulumi:"configCollection"`
	// The name of the MongoDB database to watch.
	ConfigDatabase string `pulumi:"configDatabase"`
	// If true, indicates that `UPDATE` change events should include the most current [majority-committed](https://docs.mongodb.com/manual/reference/read-concern-majority/) version of the modified document in the fullDocument field.
	ConfigFullDocument       bool `pulumi:"configFullDocument"`
	ConfigFullDocumentBefore bool `pulumi:"configFullDocumentBefore"`
	// A [$match](https://docs.mongodb.com/manual/reference/operator/aggregation/match/) expression document that MongoDB Realm includes in the underlying change stream pipeline for the trigger.
	ConfigMatch string `pulumi:"configMatch"`
	// The [authentication operation type](https://docs.mongodb.com/realm/triggers/authentication-triggers/#std-label-authentication-event-operation-types) to listen for.
	ConfigOperationType string `pulumi:"configOperationType"`
	// The [database event operation types](https://docs.mongodb.com/realm/triggers/database-triggers/#std-label-database-events) to listen for.
	ConfigOperationTypes []string `pulumi:"configOperationTypes"`
	// A [$project](https://docs.mongodb.com/manual/reference/operator/aggregation/project/) expression document that Realm uses to filter the fields that appear in change event objects.
	ConfigProject string `pulumi:"configProject"`
	// A list of one or more [authentication provider](https://docs.mongodb.com/realm/authentication/providers/) id values. The trigger will only listen for authentication events produced by these providers.
	ConfigProviders []string `pulumi:"configProviders"`
	// A [cron expression](https://docs.mongodb.com/realm/triggers/cron-expressions/) that defines the trigger schedule.
	ConfigSchedule     string `pulumi:"configSchedule"`
	ConfigScheduleType string `pulumi:"configScheduleType"`
	// The ID of the MongoDB Service associated with the trigger.
	ConfigServiceId string `pulumi:"configServiceId"`
	// Status of a trigger.
	Disabled bool `pulumi:"disabled"`
	// An object where each field name is an event processor ID and each value is an object that configures its corresponding event processor.
	EventProcessors []GetEventTriggerEventProcessor `pulumi:"eventProcessors"`
	// The ID of the function associated with the trigger.
	FunctionId string `pulumi:"functionId"`
	// The name of the function associated with the trigger.
	FunctionName string `pulumi:"functionName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The name of the trigger.
	Name      string `pulumi:"name"`
	ProjectId string `pulumi:"projectId"`
	TriggerId string `pulumi:"triggerId"`
	// The type of the trigger.
	Type string `pulumi:"type"`
	// Only Available for Database Triggers. If true, event ordering is disabled and this trigger can process events in parallel. If false, event ordering is enabled and the trigger executes serially.
	Unordered bool `pulumi:"unordered"`
}

func LookupEventTriggerOutput(ctx *pulumi.Context, args LookupEventTriggerOutputArgs, opts ...pulumi.InvokeOption) LookupEventTriggerResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupEventTriggerResultOutput, error) {
			args := v.(LookupEventTriggerArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupEventTriggerResult
			secret, err := ctx.InvokePackageRaw("mongodbatlas:index/getEventTrigger:getEventTrigger", args, &rv, "", opts...)
			if err != nil {
				return LookupEventTriggerResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupEventTriggerResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupEventTriggerResultOutput), nil
			}
			return output, nil
		}).(LookupEventTriggerResultOutput)
}

// A collection of arguments for invoking getEventTrigger.
type LookupEventTriggerOutputArgs struct {
	// The ObjectID of your application.
	// * For more details on `projectId` and `appId` see: https://www.mongodb.com/docs/atlas/app-services/admin/api/v3/#section/Project-and-Application-IDs
	AppId pulumi.StringInput `pulumi:"appId"`
	// The unique ID for the project to create the trigger.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
	// The unique ID of the trigger.
	TriggerId pulumi.StringInput `pulumi:"triggerId"`
}

func (LookupEventTriggerOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEventTriggerArgs)(nil)).Elem()
}

// A collection of values returned by getEventTrigger.
type LookupEventTriggerResultOutput struct{ *pulumi.OutputState }

func (LookupEventTriggerResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEventTriggerResult)(nil)).Elem()
}

func (o LookupEventTriggerResultOutput) ToLookupEventTriggerResultOutput() LookupEventTriggerResultOutput {
	return o
}

func (o LookupEventTriggerResultOutput) ToLookupEventTriggerResultOutputWithContext(ctx context.Context) LookupEventTriggerResultOutput {
	return o
}

func (o LookupEventTriggerResultOutput) AppId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) string { return v.AppId }).(pulumi.StringOutput)
}

// The name of the MongoDB collection that the trigger watches for change events.
func (o LookupEventTriggerResultOutput) ConfigCollection() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) string { return v.ConfigCollection }).(pulumi.StringOutput)
}

// The name of the MongoDB database to watch.
func (o LookupEventTriggerResultOutput) ConfigDatabase() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) string { return v.ConfigDatabase }).(pulumi.StringOutput)
}

// If true, indicates that `UPDATE` change events should include the most current [majority-committed](https://docs.mongodb.com/manual/reference/read-concern-majority/) version of the modified document in the fullDocument field.
func (o LookupEventTriggerResultOutput) ConfigFullDocument() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) bool { return v.ConfigFullDocument }).(pulumi.BoolOutput)
}

func (o LookupEventTriggerResultOutput) ConfigFullDocumentBefore() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) bool { return v.ConfigFullDocumentBefore }).(pulumi.BoolOutput)
}

// A [$match](https://docs.mongodb.com/manual/reference/operator/aggregation/match/) expression document that MongoDB Realm includes in the underlying change stream pipeline for the trigger.
func (o LookupEventTriggerResultOutput) ConfigMatch() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) string { return v.ConfigMatch }).(pulumi.StringOutput)
}

// The [authentication operation type](https://docs.mongodb.com/realm/triggers/authentication-triggers/#std-label-authentication-event-operation-types) to listen for.
func (o LookupEventTriggerResultOutput) ConfigOperationType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) string { return v.ConfigOperationType }).(pulumi.StringOutput)
}

// The [database event operation types](https://docs.mongodb.com/realm/triggers/database-triggers/#std-label-database-events) to listen for.
func (o LookupEventTriggerResultOutput) ConfigOperationTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) []string { return v.ConfigOperationTypes }).(pulumi.StringArrayOutput)
}

// A [$project](https://docs.mongodb.com/manual/reference/operator/aggregation/project/) expression document that Realm uses to filter the fields that appear in change event objects.
func (o LookupEventTriggerResultOutput) ConfigProject() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) string { return v.ConfigProject }).(pulumi.StringOutput)
}

// A list of one or more [authentication provider](https://docs.mongodb.com/realm/authentication/providers/) id values. The trigger will only listen for authentication events produced by these providers.
func (o LookupEventTriggerResultOutput) ConfigProviders() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) []string { return v.ConfigProviders }).(pulumi.StringArrayOutput)
}

// A [cron expression](https://docs.mongodb.com/realm/triggers/cron-expressions/) that defines the trigger schedule.
func (o LookupEventTriggerResultOutput) ConfigSchedule() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) string { return v.ConfigSchedule }).(pulumi.StringOutput)
}

func (o LookupEventTriggerResultOutput) ConfigScheduleType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) string { return v.ConfigScheduleType }).(pulumi.StringOutput)
}

// The ID of the MongoDB Service associated with the trigger.
func (o LookupEventTriggerResultOutput) ConfigServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) string { return v.ConfigServiceId }).(pulumi.StringOutput)
}

// Status of a trigger.
func (o LookupEventTriggerResultOutput) Disabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) bool { return v.Disabled }).(pulumi.BoolOutput)
}

// An object where each field name is an event processor ID and each value is an object that configures its corresponding event processor.
func (o LookupEventTriggerResultOutput) EventProcessors() GetEventTriggerEventProcessorArrayOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) []GetEventTriggerEventProcessor { return v.EventProcessors }).(GetEventTriggerEventProcessorArrayOutput)
}

// The ID of the function associated with the trigger.
func (o LookupEventTriggerResultOutput) FunctionId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) string { return v.FunctionId }).(pulumi.StringOutput)
}

// The name of the function associated with the trigger.
func (o LookupEventTriggerResultOutput) FunctionName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) string { return v.FunctionName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupEventTriggerResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the trigger.
func (o LookupEventTriggerResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupEventTriggerResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o LookupEventTriggerResultOutput) TriggerId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) string { return v.TriggerId }).(pulumi.StringOutput)
}

// The type of the trigger.
func (o LookupEventTriggerResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) string { return v.Type }).(pulumi.StringOutput)
}

// Only Available for Database Triggers. If true, event ordering is disabled and this trigger can process events in parallel. If false, event ordering is enabled and the trigger executes serially.
func (o LookupEventTriggerResultOutput) Unordered() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupEventTriggerResult) bool { return v.Unordered }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEventTriggerResultOutput{})
}
