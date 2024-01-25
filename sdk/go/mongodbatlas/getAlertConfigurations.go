// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `getAlertConfigurations` describes all Alert Configurations by the provided project_id. The data source requires your Project ID.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
func LookupAlertConfigurations(ctx *pulumi.Context, args *LookupAlertConfigurationsArgs, opts ...pulumi.InvokeOption) (*LookupAlertConfigurationsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAlertConfigurationsResult
	err := ctx.Invoke("mongodbatlas:index/getAlertConfigurations:getAlertConfigurations", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAlertConfigurations.
type LookupAlertConfigurationsArgs struct {
	// Arguments that dictate how many and which results are returned by the data source
	// * `list_options.page_num` - Which page of results to retrieve (default to first page)
	// * `list_options.items_per_page` - How many alerts to retrieve per page (default 100)
	// * `list_options.include_count` - Whether to include total count of results in the response (default false)
	ListOptions []GetAlertConfigurationsListOption `pulumi:"listOptions"`
	// List of requested string formatted output to be included on each individual result. Options are `resourceHcl` and `resourceImport`. Available to make it easy to gather resource statements for existing alert configurations, and corresponding import statements to import said resource state into the statefile.
	OutputTypes []string `pulumi:"outputTypes"`
	// The unique ID for the project to get the alert configurations.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getAlertConfigurations.
type LookupAlertConfigurationsResult struct {
	Id          string                             `pulumi:"id"`
	ListOptions []GetAlertConfigurationsListOption `pulumi:"listOptions"`
	OutputTypes []string                           `pulumi:"outputTypes"`
	// The ID of the project where the alert configuration exists
	ProjectId string `pulumi:"projectId"`
	// A list of alert configurations for the project_id, constrained by the `listOptions`.
	Results []GetAlertConfigurationsResult `pulumi:"results"`
	// Total count of results
	TotalCount int `pulumi:"totalCount"`
}

func LookupAlertConfigurationsOutput(ctx *pulumi.Context, args LookupAlertConfigurationsOutputArgs, opts ...pulumi.InvokeOption) LookupAlertConfigurationsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAlertConfigurationsResult, error) {
			args := v.(LookupAlertConfigurationsArgs)
			r, err := LookupAlertConfigurations(ctx, &args, opts...)
			var s LookupAlertConfigurationsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAlertConfigurationsResultOutput)
}

// A collection of arguments for invoking getAlertConfigurations.
type LookupAlertConfigurationsOutputArgs struct {
	// Arguments that dictate how many and which results are returned by the data source
	// * `list_options.page_num` - Which page of results to retrieve (default to first page)
	// * `list_options.items_per_page` - How many alerts to retrieve per page (default 100)
	// * `list_options.include_count` - Whether to include total count of results in the response (default false)
	ListOptions GetAlertConfigurationsListOptionArrayInput `pulumi:"listOptions"`
	// List of requested string formatted output to be included on each individual result. Options are `resourceHcl` and `resourceImport`. Available to make it easy to gather resource statements for existing alert configurations, and corresponding import statements to import said resource state into the statefile.
	OutputTypes pulumi.StringArrayInput `pulumi:"outputTypes"`
	// The unique ID for the project to get the alert configurations.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupAlertConfigurationsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAlertConfigurationsArgs)(nil)).Elem()
}

// A collection of values returned by getAlertConfigurations.
type LookupAlertConfigurationsResultOutput struct{ *pulumi.OutputState }

func (LookupAlertConfigurationsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAlertConfigurationsResult)(nil)).Elem()
}

func (o LookupAlertConfigurationsResultOutput) ToLookupAlertConfigurationsResultOutput() LookupAlertConfigurationsResultOutput {
	return o
}

func (o LookupAlertConfigurationsResultOutput) ToLookupAlertConfigurationsResultOutputWithContext(ctx context.Context) LookupAlertConfigurationsResultOutput {
	return o
}

func (o LookupAlertConfigurationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAlertConfigurationsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAlertConfigurationsResultOutput) ListOptions() GetAlertConfigurationsListOptionArrayOutput {
	return o.ApplyT(func(v LookupAlertConfigurationsResult) []GetAlertConfigurationsListOption { return v.ListOptions }).(GetAlertConfigurationsListOptionArrayOutput)
}

func (o LookupAlertConfigurationsResultOutput) OutputTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAlertConfigurationsResult) []string { return v.OutputTypes }).(pulumi.StringArrayOutput)
}

// The ID of the project where the alert configuration exists
func (o LookupAlertConfigurationsResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAlertConfigurationsResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// A list of alert configurations for the project_id, constrained by the `listOptions`.
func (o LookupAlertConfigurationsResultOutput) Results() GetAlertConfigurationsResultArrayOutput {
	return o.ApplyT(func(v LookupAlertConfigurationsResult) []GetAlertConfigurationsResult { return v.Results }).(GetAlertConfigurationsResultArrayOutput)
}

// Total count of results
func (o LookupAlertConfigurationsResultOutput) TotalCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupAlertConfigurationsResult) int { return v.TotalCount }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAlertConfigurationsResultOutput{})
}
