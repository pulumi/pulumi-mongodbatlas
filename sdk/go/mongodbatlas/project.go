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

// `Project` provides a Project resource. This allows project to be created.
//
// > **NOTE:** If Backup Compliance Policy is enabled for the project for which this backup schedule is defined, you cannot delete the Atlas project if any snapshots exist.  See [Backup Compliance Policy Prohibited Actions and Considerations](https://www.mongodb.com/docs/atlas/backup/cloud-backup/backup-compliance-policy/#configure-a-backup-compliance-policy).
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			testRolesOrgId, err := mongodbatlas.GetRolesOrgId(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.NewProject(ctx, "testProject", &mongodbatlas.ProjectArgs{
//				OrgId:          *pulumi.String(testRolesOrgId.OrgId),
//				ProjectOwnerId: pulumi.String("<OWNER_ACCOUNT_ID>"),
//				Teams: mongodbatlas.ProjectTeamArray{
//					&mongodbatlas.ProjectTeamArgs{
//						TeamId: pulumi.String("5e0fa8c99ccf641c722fe645"),
//						RoleNames: pulumi.StringArray{
//							pulumi.String("GROUP_OWNER"),
//						},
//					},
//					&mongodbatlas.ProjectTeamArgs{
//						TeamId: pulumi.String("5e1dd7b4f2a30ba80a70cd4rw"),
//						RoleNames: pulumi.StringArray{
//							pulumi.String("GROUP_READ_ONLY"),
//							pulumi.String("GROUP_DATA_ACCESS_READ_WRITE"),
//						},
//					},
//				},
//				Limits: mongodbatlas.ProjectLimitArray{
//					&mongodbatlas.ProjectLimitArgs{
//						Name:  pulumi.String("atlas.project.deployment.clusters"),
//						Value: pulumi.Int(26),
//					},
//					&mongodbatlas.ProjectLimitArgs{
//						Name:  pulumi.String("atlas.project.deployment.nodesPerPrivateLinkRegion"),
//						Value: pulumi.Int(51),
//					},
//				},
//				IsCollectDatabaseSpecificsStatisticsEnabled: pulumi.Bool(true),
//				IsDataExplorerEnabled:                       pulumi.Bool(true),
//				IsExtendedStorageSizesEnabled:               pulumi.Bool(true),
//				IsPerformanceAdvisorEnabled:                 pulumi.Bool(true),
//				IsRealtimePerformancePanelEnabled:           pulumi.Bool(true),
//				IsSchemaAdvisorEnabled:                      pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Project must be imported using project ID, e.g.
//
// ```sh
// $ pulumi import mongodbatlas:index/project:Project my_project 5d09d6a59ccf6445652a444a
// ```
// For more information see: [MongoDB Atlas Admin API Projects](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Projects) and [MongoDB Atlas Admin API Teams](https://docs.atlas.mongodb.com/reference/api/teams/) Documentation for more information.
type Project struct {
	pulumi.CustomResourceState

	// The number of Atlas clusters deployed in the project.
	ClusterCount pulumi.IntOutput `pulumi:"clusterCount"`
	// The ISO-8601-formatted timestamp of when Atlas created the project.
	Created pulumi.StringOutput `pulumi:"created"`
	// IP addresses in a project categorized by services. See IP Addresses.
	IpAddresses ProjectIpAddressesOutput `pulumi:"ipAddresses"`
	// Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project. By default, this flag is set to true.
	IsCollectDatabaseSpecificsStatisticsEnabled pulumi.BoolOutput `pulumi:"isCollectDatabaseSpecificsStatisticsEnabled"`
	// Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh). By default, this flag is set to true.
	IsDataExplorerEnabled pulumi.BoolOutput `pulumi:"isDataExplorerEnabled"`
	// Flag that indicates whether to enable extended storage sizes for the specified project. Clusters with extended storage sizes must be on AWS or GCP, and cannot span multiple regions. When extending storage size, initial syncs and cross-project snapshot restores will be slow. This setting should only be used as a measure of temporary relief; consider sharding if more storage is required.
	IsExtendedStorageSizesEnabled pulumi.BoolOutput `pulumi:"isExtendedStorageSizesEnabled"`
	// Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements. By default, this flag is set to true.
	IsPerformanceAdvisorEnabled pulumi.BoolOutput `pulumi:"isPerformanceAdvisorEnabled"`
	// Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database. By default, this flag is set to true.
	IsRealtimePerformancePanelEnabled pulumi.BoolOutput `pulumi:"isRealtimePerformancePanelEnabled"`
	// Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui). By default, this flag is set to true.
	IsSchemaAdvisorEnabled pulumi.BoolOutput       `pulumi:"isSchemaAdvisorEnabled"`
	Limits                 ProjectLimitArrayOutput `pulumi:"limits"`
	// The name of the project you want to create.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the organization you want to create the project within.
	OrgId pulumi.StringOutput `pulumi:"orgId"`
	// Unique 24-hexadecimal digit string that identifies the Atlas user account to be granted the [Project Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Project-Owner) role on the specified project. If you set this parameter, it overrides the default value of the oldest [Organization Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Organization-Owner).
	ProjectOwnerId pulumi.StringPtrOutput `pulumi:"projectOwnerId"`
	// Designates that this project can be used for government regions only.  If not set the project will default to standard regions.   You cannot deploy clusters across government and standard regions in the same project. AWS is the only cloud provider for AtlasGov.  For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
	RegionUsageRestrictions pulumi.StringPtrOutput `pulumi:"regionUsageRestrictions"`
	Teams                   ProjectTeamArrayOutput `pulumi:"teams"`
	// It allows users to disable the creation of the default alert settings. By default, this flag is set to true.
	WithDefaultAlertsSettings pulumi.BoolOutput `pulumi:"withDefaultAlertsSettings"`
}

// NewProject registers a new resource with the given unique name, arguments, and options.
func NewProject(ctx *pulumi.Context,
	name string, args *ProjectArgs, opts ...pulumi.ResourceOption) (*Project, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Project
	err := ctx.RegisterResource("mongodbatlas:index/project:Project", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProject gets an existing Project resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectState, opts ...pulumi.ResourceOption) (*Project, error) {
	var resource Project
	err := ctx.ReadResource("mongodbatlas:index/project:Project", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Project resources.
type projectState struct {
	// The number of Atlas clusters deployed in the project.
	ClusterCount *int `pulumi:"clusterCount"`
	// The ISO-8601-formatted timestamp of when Atlas created the project.
	Created *string `pulumi:"created"`
	// IP addresses in a project categorized by services. See IP Addresses.
	IpAddresses *ProjectIpAddresses `pulumi:"ipAddresses"`
	// Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project. By default, this flag is set to true.
	IsCollectDatabaseSpecificsStatisticsEnabled *bool `pulumi:"isCollectDatabaseSpecificsStatisticsEnabled"`
	// Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh). By default, this flag is set to true.
	IsDataExplorerEnabled *bool `pulumi:"isDataExplorerEnabled"`
	// Flag that indicates whether to enable extended storage sizes for the specified project. Clusters with extended storage sizes must be on AWS or GCP, and cannot span multiple regions. When extending storage size, initial syncs and cross-project snapshot restores will be slow. This setting should only be used as a measure of temporary relief; consider sharding if more storage is required.
	IsExtendedStorageSizesEnabled *bool `pulumi:"isExtendedStorageSizesEnabled"`
	// Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements. By default, this flag is set to true.
	IsPerformanceAdvisorEnabled *bool `pulumi:"isPerformanceAdvisorEnabled"`
	// Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database. By default, this flag is set to true.
	IsRealtimePerformancePanelEnabled *bool `pulumi:"isRealtimePerformancePanelEnabled"`
	// Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui). By default, this flag is set to true.
	IsSchemaAdvisorEnabled *bool          `pulumi:"isSchemaAdvisorEnabled"`
	Limits                 []ProjectLimit `pulumi:"limits"`
	// The name of the project you want to create.
	Name *string `pulumi:"name"`
	// The ID of the organization you want to create the project within.
	OrgId *string `pulumi:"orgId"`
	// Unique 24-hexadecimal digit string that identifies the Atlas user account to be granted the [Project Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Project-Owner) role on the specified project. If you set this parameter, it overrides the default value of the oldest [Organization Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Organization-Owner).
	ProjectOwnerId *string `pulumi:"projectOwnerId"`
	// Designates that this project can be used for government regions only.  If not set the project will default to standard regions.   You cannot deploy clusters across government and standard regions in the same project. AWS is the only cloud provider for AtlasGov.  For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
	RegionUsageRestrictions *string       `pulumi:"regionUsageRestrictions"`
	Teams                   []ProjectTeam `pulumi:"teams"`
	// It allows users to disable the creation of the default alert settings. By default, this flag is set to true.
	WithDefaultAlertsSettings *bool `pulumi:"withDefaultAlertsSettings"`
}

type ProjectState struct {
	// The number of Atlas clusters deployed in the project.
	ClusterCount pulumi.IntPtrInput
	// The ISO-8601-formatted timestamp of when Atlas created the project.
	Created pulumi.StringPtrInput
	// IP addresses in a project categorized by services. See IP Addresses.
	IpAddresses ProjectIpAddressesPtrInput
	// Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project. By default, this flag is set to true.
	IsCollectDatabaseSpecificsStatisticsEnabled pulumi.BoolPtrInput
	// Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh). By default, this flag is set to true.
	IsDataExplorerEnabled pulumi.BoolPtrInput
	// Flag that indicates whether to enable extended storage sizes for the specified project. Clusters with extended storage sizes must be on AWS or GCP, and cannot span multiple regions. When extending storage size, initial syncs and cross-project snapshot restores will be slow. This setting should only be used as a measure of temporary relief; consider sharding if more storage is required.
	IsExtendedStorageSizesEnabled pulumi.BoolPtrInput
	// Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements. By default, this flag is set to true.
	IsPerformanceAdvisorEnabled pulumi.BoolPtrInput
	// Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database. By default, this flag is set to true.
	IsRealtimePerformancePanelEnabled pulumi.BoolPtrInput
	// Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui). By default, this flag is set to true.
	IsSchemaAdvisorEnabled pulumi.BoolPtrInput
	Limits                 ProjectLimitArrayInput
	// The name of the project you want to create.
	Name pulumi.StringPtrInput
	// The ID of the organization you want to create the project within.
	OrgId pulumi.StringPtrInput
	// Unique 24-hexadecimal digit string that identifies the Atlas user account to be granted the [Project Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Project-Owner) role on the specified project. If you set this parameter, it overrides the default value of the oldest [Organization Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Organization-Owner).
	ProjectOwnerId pulumi.StringPtrInput
	// Designates that this project can be used for government regions only.  If not set the project will default to standard regions.   You cannot deploy clusters across government and standard regions in the same project. AWS is the only cloud provider for AtlasGov.  For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
	RegionUsageRestrictions pulumi.StringPtrInput
	Teams                   ProjectTeamArrayInput
	// It allows users to disable the creation of the default alert settings. By default, this flag is set to true.
	WithDefaultAlertsSettings pulumi.BoolPtrInput
}

func (ProjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectState)(nil)).Elem()
}

type projectArgs struct {
	// Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project. By default, this flag is set to true.
	IsCollectDatabaseSpecificsStatisticsEnabled *bool `pulumi:"isCollectDatabaseSpecificsStatisticsEnabled"`
	// Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh). By default, this flag is set to true.
	IsDataExplorerEnabled *bool `pulumi:"isDataExplorerEnabled"`
	// Flag that indicates whether to enable extended storage sizes for the specified project. Clusters with extended storage sizes must be on AWS or GCP, and cannot span multiple regions. When extending storage size, initial syncs and cross-project snapshot restores will be slow. This setting should only be used as a measure of temporary relief; consider sharding if more storage is required.
	IsExtendedStorageSizesEnabled *bool `pulumi:"isExtendedStorageSizesEnabled"`
	// Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements. By default, this flag is set to true.
	IsPerformanceAdvisorEnabled *bool `pulumi:"isPerformanceAdvisorEnabled"`
	// Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database. By default, this flag is set to true.
	IsRealtimePerformancePanelEnabled *bool `pulumi:"isRealtimePerformancePanelEnabled"`
	// Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui). By default, this flag is set to true.
	IsSchemaAdvisorEnabled *bool          `pulumi:"isSchemaAdvisorEnabled"`
	Limits                 []ProjectLimit `pulumi:"limits"`
	// The name of the project you want to create.
	Name *string `pulumi:"name"`
	// The ID of the organization you want to create the project within.
	OrgId string `pulumi:"orgId"`
	// Unique 24-hexadecimal digit string that identifies the Atlas user account to be granted the [Project Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Project-Owner) role on the specified project. If you set this parameter, it overrides the default value of the oldest [Organization Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Organization-Owner).
	ProjectOwnerId *string `pulumi:"projectOwnerId"`
	// Designates that this project can be used for government regions only.  If not set the project will default to standard regions.   You cannot deploy clusters across government and standard regions in the same project. AWS is the only cloud provider for AtlasGov.  For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
	RegionUsageRestrictions *string       `pulumi:"regionUsageRestrictions"`
	Teams                   []ProjectTeam `pulumi:"teams"`
	// It allows users to disable the creation of the default alert settings. By default, this flag is set to true.
	WithDefaultAlertsSettings *bool `pulumi:"withDefaultAlertsSettings"`
}

// The set of arguments for constructing a Project resource.
type ProjectArgs struct {
	// Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project. By default, this flag is set to true.
	IsCollectDatabaseSpecificsStatisticsEnabled pulumi.BoolPtrInput
	// Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh). By default, this flag is set to true.
	IsDataExplorerEnabled pulumi.BoolPtrInput
	// Flag that indicates whether to enable extended storage sizes for the specified project. Clusters with extended storage sizes must be on AWS or GCP, and cannot span multiple regions. When extending storage size, initial syncs and cross-project snapshot restores will be slow. This setting should only be used as a measure of temporary relief; consider sharding if more storage is required.
	IsExtendedStorageSizesEnabled pulumi.BoolPtrInput
	// Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements. By default, this flag is set to true.
	IsPerformanceAdvisorEnabled pulumi.BoolPtrInput
	// Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database. By default, this flag is set to true.
	IsRealtimePerformancePanelEnabled pulumi.BoolPtrInput
	// Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui). By default, this flag is set to true.
	IsSchemaAdvisorEnabled pulumi.BoolPtrInput
	Limits                 ProjectLimitArrayInput
	// The name of the project you want to create.
	Name pulumi.StringPtrInput
	// The ID of the organization you want to create the project within.
	OrgId pulumi.StringInput
	// Unique 24-hexadecimal digit string that identifies the Atlas user account to be granted the [Project Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Project-Owner) role on the specified project. If you set this parameter, it overrides the default value of the oldest [Organization Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Organization-Owner).
	ProjectOwnerId pulumi.StringPtrInput
	// Designates that this project can be used for government regions only.  If not set the project will default to standard regions.   You cannot deploy clusters across government and standard regions in the same project. AWS is the only cloud provider for AtlasGov.  For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
	RegionUsageRestrictions pulumi.StringPtrInput
	Teams                   ProjectTeamArrayInput
	// It allows users to disable the creation of the default alert settings. By default, this flag is set to true.
	WithDefaultAlertsSettings pulumi.BoolPtrInput
}

func (ProjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectArgs)(nil)).Elem()
}

type ProjectInput interface {
	pulumi.Input

	ToProjectOutput() ProjectOutput
	ToProjectOutputWithContext(ctx context.Context) ProjectOutput
}

func (*Project) ElementType() reflect.Type {
	return reflect.TypeOf((**Project)(nil)).Elem()
}

func (i *Project) ToProjectOutput() ProjectOutput {
	return i.ToProjectOutputWithContext(context.Background())
}

func (i *Project) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectOutput)
}

// ProjectArrayInput is an input type that accepts ProjectArray and ProjectArrayOutput values.
// You can construct a concrete instance of `ProjectArrayInput` via:
//
//	ProjectArray{ ProjectArgs{...} }
type ProjectArrayInput interface {
	pulumi.Input

	ToProjectArrayOutput() ProjectArrayOutput
	ToProjectArrayOutputWithContext(context.Context) ProjectArrayOutput
}

type ProjectArray []ProjectInput

func (ProjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Project)(nil)).Elem()
}

func (i ProjectArray) ToProjectArrayOutput() ProjectArrayOutput {
	return i.ToProjectArrayOutputWithContext(context.Background())
}

func (i ProjectArray) ToProjectArrayOutputWithContext(ctx context.Context) ProjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectArrayOutput)
}

// ProjectMapInput is an input type that accepts ProjectMap and ProjectMapOutput values.
// You can construct a concrete instance of `ProjectMapInput` via:
//
//	ProjectMap{ "key": ProjectArgs{...} }
type ProjectMapInput interface {
	pulumi.Input

	ToProjectMapOutput() ProjectMapOutput
	ToProjectMapOutputWithContext(context.Context) ProjectMapOutput
}

type ProjectMap map[string]ProjectInput

func (ProjectMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Project)(nil)).Elem()
}

func (i ProjectMap) ToProjectMapOutput() ProjectMapOutput {
	return i.ToProjectMapOutputWithContext(context.Background())
}

func (i ProjectMap) ToProjectMapOutputWithContext(ctx context.Context) ProjectMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectMapOutput)
}

type ProjectOutput struct{ *pulumi.OutputState }

func (ProjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Project)(nil)).Elem()
}

func (o ProjectOutput) ToProjectOutput() ProjectOutput {
	return o
}

func (o ProjectOutput) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return o
}

// The number of Atlas clusters deployed in the project.
func (o ProjectOutput) ClusterCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Project) pulumi.IntOutput { return v.ClusterCount }).(pulumi.IntOutput)
}

// The ISO-8601-formatted timestamp of when Atlas created the project.
func (o ProjectOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// IP addresses in a project categorized by services. See IP Addresses.
func (o ProjectOutput) IpAddresses() ProjectIpAddressesOutput {
	return o.ApplyT(func(v *Project) ProjectIpAddressesOutput { return v.IpAddresses }).(ProjectIpAddressesOutput)
}

// Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project. By default, this flag is set to true.
func (o ProjectOutput) IsCollectDatabaseSpecificsStatisticsEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Project) pulumi.BoolOutput { return v.IsCollectDatabaseSpecificsStatisticsEnabled }).(pulumi.BoolOutput)
}

// Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.  When Data Explorer is disabled, you cannot terminate slow operations from the [Real-Time Performance Panel](https://www.mongodb.com/docs/atlas/real-time-performance-panel/#std-label-real-time-metrics-status-tab) or create indexes from the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor). You can still view Performance Advisor recommendations, but you must create those indexes from [mongosh](https://www.mongodb.com/docs/mongodb-shell/#mongodb-binary-bin.mongosh). By default, this flag is set to true.
func (o ProjectOutput) IsDataExplorerEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Project) pulumi.BoolOutput { return v.IsDataExplorerEnabled }).(pulumi.BoolOutput)
}

// Flag that indicates whether to enable extended storage sizes for the specified project. Clusters with extended storage sizes must be on AWS or GCP, and cannot span multiple regions. When extending storage size, initial syncs and cross-project snapshot restores will be slow. This setting should only be used as a measure of temporary relief; consider sharding if more storage is required.
func (o ProjectOutput) IsExtendedStorageSizesEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Project) pulumi.BoolOutput { return v.IsExtendedStorageSizesEnabled }).(pulumi.BoolOutput)
}

// Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements. By default, this flag is set to true.
func (o ProjectOutput) IsPerformanceAdvisorEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Project) pulumi.BoolOutput { return v.IsPerformanceAdvisorEnabled }).(pulumi.BoolOutput)
}

// Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database. By default, this flag is set to true.
func (o ProjectOutput) IsRealtimePerformancePanelEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Project) pulumi.BoolOutput { return v.IsRealtimePerformancePanelEnabled }).(pulumi.BoolOutput)
}

// Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui). By default, this flag is set to true.
func (o ProjectOutput) IsSchemaAdvisorEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Project) pulumi.BoolOutput { return v.IsSchemaAdvisorEnabled }).(pulumi.BoolOutput)
}

func (o ProjectOutput) Limits() ProjectLimitArrayOutput {
	return o.ApplyT(func(v *Project) ProjectLimitArrayOutput { return v.Limits }).(ProjectLimitArrayOutput)
}

// The name of the project you want to create.
func (o ProjectOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the organization you want to create the project within.
func (o ProjectOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies the Atlas user account to be granted the [Project Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Project-Owner) role on the specified project. If you set this parameter, it overrides the default value of the oldest [Organization Owner](https://docs.atlas.mongodb.com/reference/user-roles/#mongodb-authrole-Organization-Owner).
func (o ProjectOutput) ProjectOwnerId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Project) pulumi.StringPtrOutput { return v.ProjectOwnerId }).(pulumi.StringPtrOutput)
}

// Designates that this project can be used for government regions only.  If not set the project will default to standard regions.   You cannot deploy clusters across government and standard regions in the same project. AWS is the only cloud provider for AtlasGov.  For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
func (o ProjectOutput) RegionUsageRestrictions() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Project) pulumi.StringPtrOutput { return v.RegionUsageRestrictions }).(pulumi.StringPtrOutput)
}

func (o ProjectOutput) Teams() ProjectTeamArrayOutput {
	return o.ApplyT(func(v *Project) ProjectTeamArrayOutput { return v.Teams }).(ProjectTeamArrayOutput)
}

// It allows users to disable the creation of the default alert settings. By default, this flag is set to true.
func (o ProjectOutput) WithDefaultAlertsSettings() pulumi.BoolOutput {
	return o.ApplyT(func(v *Project) pulumi.BoolOutput { return v.WithDefaultAlertsSettings }).(pulumi.BoolOutput)
}

type ProjectArrayOutput struct{ *pulumi.OutputState }

func (ProjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Project)(nil)).Elem()
}

func (o ProjectArrayOutput) ToProjectArrayOutput() ProjectArrayOutput {
	return o
}

func (o ProjectArrayOutput) ToProjectArrayOutputWithContext(ctx context.Context) ProjectArrayOutput {
	return o
}

func (o ProjectArrayOutput) Index(i pulumi.IntInput) ProjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Project {
		return vs[0].([]*Project)[vs[1].(int)]
	}).(ProjectOutput)
}

type ProjectMapOutput struct{ *pulumi.OutputState }

func (ProjectMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Project)(nil)).Elem()
}

func (o ProjectMapOutput) ToProjectMapOutput() ProjectMapOutput {
	return o
}

func (o ProjectMapOutput) ToProjectMapOutputWithContext(ctx context.Context) ProjectMapOutput {
	return o
}

func (o ProjectMapOutput) MapIndex(k pulumi.StringInput) ProjectOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Project {
		return vs[0].(map[string]*Project)[vs[1].(string)]
	}).(ProjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectInput)(nil)).Elem(), &Project{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectArrayInput)(nil)).Elem(), ProjectArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectMapInput)(nil)).Elem(), ProjectMap{})
	pulumi.RegisterOutputType(ProjectOutput{})
	pulumi.RegisterOutputType(ProjectArrayOutput{})
	pulumi.RegisterOutputType(ProjectMapOutput{})
}
