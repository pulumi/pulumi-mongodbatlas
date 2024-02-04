// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `Project` describes a MongoDB Atlas Project. This represents a project that has been created.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
//
// ## Example Usage
func LookupProject(ctx *pulumi.Context, args *LookupProjectArgs, opts ...pulumi.InvokeOption) (*LookupProjectResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupProjectResult
	err := ctx.Invoke("mongodbatlas:index/getProject:getProject", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProject.
type LookupProjectArgs struct {
	// The unique ID for the project.
	//
	// > **IMPORTANT:** Either `projectId` or `name` must be configurated.
	Name *string `pulumi:"name"`
	// The unique ID for the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getProject.
type LookupProjectResult struct {
	// The number of Atlas clusters deployed in the project.
	ClusterCount int `pulumi:"clusterCount"`
	// The ISO-8601-formatted timestamp of when Atlas created the project.
	Created string `pulumi:"created"`
	Id      string `pulumi:"id"`
	// IP addresses in a project categorized by services. See IP Addresses.
	IpAddresses GetProjectIpAddresses `pulumi:"ipAddresses"`
	// Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project.
	IsCollectDatabaseSpecificsStatisticsEnabled bool `pulumi:"isCollectDatabaseSpecificsStatisticsEnabled"`
	// Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.
	IsDataExplorerEnabled bool `pulumi:"isDataExplorerEnabled"`
	// Flag that indicates whether to enable extended storage sizes for the specified project.
	IsExtendedStorageSizesEnabled bool `pulumi:"isExtendedStorageSizesEnabled"`
	// Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements.
	IsPerformanceAdvisorEnabled bool `pulumi:"isPerformanceAdvisorEnabled"`
	// Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database.
	IsRealtimePerformancePanelEnabled bool `pulumi:"isRealtimePerformancePanelEnabled"`
	// Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui).
	IsSchemaAdvisorEnabled bool `pulumi:"isSchemaAdvisorEnabled"`
	// The limits for the specified project. See Limits.
	Limits []GetProjectLimit `pulumi:"limits"`
	// Human-readable label that identifies this project limit.
	Name *string `pulumi:"name"`
	// The ID of the organization you want to create the project within.
	OrgId     string  `pulumi:"orgId"`
	ProjectId *string `pulumi:"projectId"`
	// If GOV_REGIONS_ONLY the project can be used for government regions only, otherwise defaults to standard regions. For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
	RegionUsageRestrictions string `pulumi:"regionUsageRestrictions"`
	// Returns all teams to which the authenticated user has access in the project. See Teams.
	Teams []GetProjectTeam `pulumi:"teams"`
}

func LookupProjectOutput(ctx *pulumi.Context, args LookupProjectOutputArgs, opts ...pulumi.InvokeOption) LookupProjectResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupProjectResult, error) {
			args := v.(LookupProjectArgs)
			r, err := LookupProject(ctx, &args, opts...)
			var s LookupProjectResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupProjectResultOutput)
}

// A collection of arguments for invoking getProject.
type LookupProjectOutputArgs struct {
	// The unique ID for the project.
	//
	// > **IMPORTANT:** Either `projectId` or `name` must be configurated.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The unique ID for the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupProjectOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProjectArgs)(nil)).Elem()
}

// A collection of values returned by getProject.
type LookupProjectResultOutput struct{ *pulumi.OutputState }

func (LookupProjectResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProjectResult)(nil)).Elem()
}

func (o LookupProjectResultOutput) ToLookupProjectResultOutput() LookupProjectResultOutput {
	return o
}

func (o LookupProjectResultOutput) ToLookupProjectResultOutputWithContext(ctx context.Context) LookupProjectResultOutput {
	return o
}

// The number of Atlas clusters deployed in the project.
func (o LookupProjectResultOutput) ClusterCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProjectResult) int { return v.ClusterCount }).(pulumi.IntOutput)
}

// The ISO-8601-formatted timestamp of when Atlas created the project.
func (o LookupProjectResultOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectResult) string { return v.Created }).(pulumi.StringOutput)
}

func (o LookupProjectResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectResult) string { return v.Id }).(pulumi.StringOutput)
}

// IP addresses in a project categorized by services. See IP Addresses.
func (o LookupProjectResultOutput) IpAddresses() GetProjectIpAddressesOutput {
	return o.ApplyT(func(v LookupProjectResult) GetProjectIpAddresses { return v.IpAddresses }).(GetProjectIpAddressesOutput)
}

// Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project.
func (o LookupProjectResultOutput) IsCollectDatabaseSpecificsStatisticsEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupProjectResult) bool { return v.IsCollectDatabaseSpecificsStatisticsEnabled }).(pulumi.BoolOutput)
}

// Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.
func (o LookupProjectResultOutput) IsDataExplorerEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupProjectResult) bool { return v.IsDataExplorerEnabled }).(pulumi.BoolOutput)
}

// Flag that indicates whether to enable extended storage sizes for the specified project.
func (o LookupProjectResultOutput) IsExtendedStorageSizesEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupProjectResult) bool { return v.IsExtendedStorageSizesEnabled }).(pulumi.BoolOutput)
}

// Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements.
func (o LookupProjectResultOutput) IsPerformanceAdvisorEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupProjectResult) bool { return v.IsPerformanceAdvisorEnabled }).(pulumi.BoolOutput)
}

// Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database.
func (o LookupProjectResultOutput) IsRealtimePerformancePanelEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupProjectResult) bool { return v.IsRealtimePerformancePanelEnabled }).(pulumi.BoolOutput)
}

// Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui).
func (o LookupProjectResultOutput) IsSchemaAdvisorEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupProjectResult) bool { return v.IsSchemaAdvisorEnabled }).(pulumi.BoolOutput)
}

// The limits for the specified project. See Limits.
func (o LookupProjectResultOutput) Limits() GetProjectLimitArrayOutput {
	return o.ApplyT(func(v LookupProjectResult) []GetProjectLimit { return v.Limits }).(GetProjectLimitArrayOutput)
}

// Human-readable label that identifies this project limit.
func (o LookupProjectResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupProjectResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The ID of the organization you want to create the project within.
func (o LookupProjectResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectResult) string { return v.OrgId }).(pulumi.StringOutput)
}

func (o LookupProjectResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupProjectResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// If GOV_REGIONS_ONLY the project can be used for government regions only, otherwise defaults to standard regions. For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
func (o LookupProjectResultOutput) RegionUsageRestrictions() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProjectResult) string { return v.RegionUsageRestrictions }).(pulumi.StringOutput)
}

// Returns all teams to which the authenticated user has access in the project. See Teams.
func (o LookupProjectResultOutput) Teams() GetProjectTeamArrayOutput {
	return o.ApplyT(func(v LookupProjectResult) []GetProjectTeam { return v.Teams }).(GetProjectTeamArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupProjectResultOutput{})
}
