// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `getEventTriggers` describe all Event Triggers.
func LookupEventTriggers(ctx *pulumi.Context, args *LookupEventTriggersArgs, opts ...pulumi.InvokeOption) (*LookupEventTriggersResult, error) {
	var rv LookupEventTriggersResult
	err := ctx.Invoke("mongodbatlas:index/getEventTriggers:getEventTriggers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEventTriggers.
type LookupEventTriggersArgs struct {
	// The ObjectID of your application.
	AppId string `pulumi:"appId"`
	// The unique ID for the project to get all event triggers.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getEventTriggers.
type LookupEventTriggersResult struct {
	AppId string `pulumi:"appId"`
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	ProjectId string `pulumi:"projectId"`
	// A list where each represents a Event Trigger.
	Results []GetEventTriggersResult `pulumi:"results"`
}

func LookupEventTriggersOutput(ctx *pulumi.Context, args LookupEventTriggersOutputArgs, opts ...pulumi.InvokeOption) LookupEventTriggersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupEventTriggersResult, error) {
			args := v.(LookupEventTriggersArgs)
			r, err := LookupEventTriggers(ctx, &args, opts...)
			var s LookupEventTriggersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupEventTriggersResultOutput)
}

// A collection of arguments for invoking getEventTriggers.
type LookupEventTriggersOutputArgs struct {
	// The ObjectID of your application.
	AppId pulumi.StringInput `pulumi:"appId"`
	// The unique ID for the project to get all event triggers.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupEventTriggersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEventTriggersArgs)(nil)).Elem()
}

// A collection of values returned by getEventTriggers.
type LookupEventTriggersResultOutput struct{ *pulumi.OutputState }

func (LookupEventTriggersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEventTriggersResult)(nil)).Elem()
}

func (o LookupEventTriggersResultOutput) ToLookupEventTriggersResultOutput() LookupEventTriggersResultOutput {
	return o
}

func (o LookupEventTriggersResultOutput) ToLookupEventTriggersResultOutputWithContext(ctx context.Context) LookupEventTriggersResultOutput {
	return o
}

func (o LookupEventTriggersResultOutput) AppId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventTriggersResult) string { return v.AppId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupEventTriggersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventTriggersResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupEventTriggersResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventTriggersResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// A list where each represents a Event Trigger.
func (o LookupEventTriggersResultOutput) Results() GetEventTriggersResultArrayOutput {
	return o.ApplyT(func(v LookupEventTriggersResult) []GetEventTriggersResult { return v.Results }).(GetEventTriggersResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEventTriggersResultOutput{})
}
