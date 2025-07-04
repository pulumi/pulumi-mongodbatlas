// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Resource: MaintenanceWindow
//
// `MaintenanceWindow` provides a resource to schedule the maintenance window for your MongoDB Atlas Project and/or set to defer a scheduled maintenance up to two times. Please refer to [Maintenance Windows](https://www.mongodb.com/docs/atlas/tutorial/cluster-maintenance-window/#configure-maintenance-window) documentation for more details.
//
// > **NOTE:** Only a single maintenance window resource can be defined per project.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
//
// ## Maintenance Window Considerations:
//
// - Urgent Maintenance Activities Cannot Wait: Urgent maintenance activities such as security patches cannot wait for your chosen window. Atlas will start those maintenance activities when needed.
//
// Once maintenance is scheduled for your cluster, you cannot change your maintenance window until the current maintenance efforts have completed.
// - Maintenance Requires Replica Set Elections: Atlas performs maintenance the same way as the manual maintenance procedure. This requires at least one replica set election during the maintenance window per replica set.
// - Maintenance Starts As Close to the Hour As Possible: Maintenance always begins as close to the scheduled hour as possible, but in-progress cluster updates or expected system issues could delay the start time.
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
//			_, err := mongodbatlas.NewMaintenanceWindow(ctx, "test", &mongodbatlas.MaintenanceWindowArgs{
//				ProjectId: pulumi.String("<your-project-id>"),
//				DayOfWeek: pulumi.Int(3),
//				HourOfDay: pulumi.Int(4),
//				ProtectedHours: &mongodbatlas.MaintenanceWindowProtectedHoursArgs{
//					StartHourOfDay: pulumi.Int(9),
//					EndHourOfDay:   pulumi.Int(17),
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
//			_, err := mongodbatlas.NewMaintenanceWindow(ctx, "test", &mongodbatlas.MaintenanceWindowArgs{
//				ProjectId: pulumi.String("<your-project-id>"),
//				Defer:     pulumi.Bool(true),
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
// Maintenance Window entries can be imported using project project_id, in the format `PROJECTID`, e.g.
//
// ```sh
// $ pulumi import mongodbatlas:index/maintenanceWindow:MaintenanceWindow test 5d0f1f73cf09a29120e173cf
// ```
// For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/maintenance-windows/)
type MaintenanceWindow struct {
	pulumi.CustomResourceState

	// Defer any scheduled maintenance for the given project for one week.
	AutoDefer pulumi.BoolOutput `pulumi:"autoDefer"`
	// Flag that indicates whether you want to defer all maintenance windows one week they would be triggered.
	AutoDeferOnceEnabled pulumi.BoolOutput `pulumi:"autoDeferOnceEnabled"`
	// Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
	DayOfWeek pulumi.IntOutput `pulumi:"dayOfWeek"`
	// Defer the next scheduled maintenance for the given project for one week.
	Defer pulumi.BoolOutput `pulumi:"defer"`
	// Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC). Defaults to 0.
	HourOfDay pulumi.IntOutput `pulumi:"hourOfDay"`
	// Number of times the current maintenance event for this project has been deferred, there can be a maximum of 2 deferrals.
	NumberOfDeferrals pulumi.IntOutput `pulumi:"numberOfDeferrals"`
	// The unique identifier of the project for the Maintenance Window.
	ProjectId      pulumi.StringOutput                      `pulumi:"projectId"`
	ProtectedHours MaintenanceWindowProtectedHoursPtrOutput `pulumi:"protectedHours"`
	// Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
	StartAsap pulumi.BoolOutput `pulumi:"startAsap"`
	// Identifier for the current time zone of the maintenance window. This can only be updated via the Project Settings UI.
	TimeZoneId pulumi.StringOutput `pulumi:"timeZoneId"`
}

// NewMaintenanceWindow registers a new resource with the given unique name, arguments, and options.
func NewMaintenanceWindow(ctx *pulumi.Context,
	name string, args *MaintenanceWindowArgs, opts ...pulumi.ResourceOption) (*MaintenanceWindow, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DayOfWeek == nil {
		return nil, errors.New("invalid value for required argument 'DayOfWeek'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MaintenanceWindow
	err := ctx.RegisterResource("mongodbatlas:index/maintenanceWindow:MaintenanceWindow", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMaintenanceWindow gets an existing MaintenanceWindow resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMaintenanceWindow(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MaintenanceWindowState, opts ...pulumi.ResourceOption) (*MaintenanceWindow, error) {
	var resource MaintenanceWindow
	err := ctx.ReadResource("mongodbatlas:index/maintenanceWindow:MaintenanceWindow", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MaintenanceWindow resources.
type maintenanceWindowState struct {
	// Defer any scheduled maintenance for the given project for one week.
	AutoDefer *bool `pulumi:"autoDefer"`
	// Flag that indicates whether you want to defer all maintenance windows one week they would be triggered.
	AutoDeferOnceEnabled *bool `pulumi:"autoDeferOnceEnabled"`
	// Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
	DayOfWeek *int `pulumi:"dayOfWeek"`
	// Defer the next scheduled maintenance for the given project for one week.
	Defer *bool `pulumi:"defer"`
	// Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC). Defaults to 0.
	HourOfDay *int `pulumi:"hourOfDay"`
	// Number of times the current maintenance event for this project has been deferred, there can be a maximum of 2 deferrals.
	NumberOfDeferrals *int `pulumi:"numberOfDeferrals"`
	// The unique identifier of the project for the Maintenance Window.
	ProjectId      *string                          `pulumi:"projectId"`
	ProtectedHours *MaintenanceWindowProtectedHours `pulumi:"protectedHours"`
	// Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
	StartAsap *bool `pulumi:"startAsap"`
	// Identifier for the current time zone of the maintenance window. This can only be updated via the Project Settings UI.
	TimeZoneId *string `pulumi:"timeZoneId"`
}

type MaintenanceWindowState struct {
	// Defer any scheduled maintenance for the given project for one week.
	AutoDefer pulumi.BoolPtrInput
	// Flag that indicates whether you want to defer all maintenance windows one week they would be triggered.
	AutoDeferOnceEnabled pulumi.BoolPtrInput
	// Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
	DayOfWeek pulumi.IntPtrInput
	// Defer the next scheduled maintenance for the given project for one week.
	Defer pulumi.BoolPtrInput
	// Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC). Defaults to 0.
	HourOfDay pulumi.IntPtrInput
	// Number of times the current maintenance event for this project has been deferred, there can be a maximum of 2 deferrals.
	NumberOfDeferrals pulumi.IntPtrInput
	// The unique identifier of the project for the Maintenance Window.
	ProjectId      pulumi.StringPtrInput
	ProtectedHours MaintenanceWindowProtectedHoursPtrInput
	// Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
	StartAsap pulumi.BoolPtrInput
	// Identifier for the current time zone of the maintenance window. This can only be updated via the Project Settings UI.
	TimeZoneId pulumi.StringPtrInput
}

func (MaintenanceWindowState) ElementType() reflect.Type {
	return reflect.TypeOf((*maintenanceWindowState)(nil)).Elem()
}

type maintenanceWindowArgs struct {
	// Defer any scheduled maintenance for the given project for one week.
	AutoDefer *bool `pulumi:"autoDefer"`
	// Flag that indicates whether you want to defer all maintenance windows one week they would be triggered.
	AutoDeferOnceEnabled *bool `pulumi:"autoDeferOnceEnabled"`
	// Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
	DayOfWeek int `pulumi:"dayOfWeek"`
	// Defer the next scheduled maintenance for the given project for one week.
	Defer *bool `pulumi:"defer"`
	// Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC). Defaults to 0.
	HourOfDay *int `pulumi:"hourOfDay"`
	// The unique identifier of the project for the Maintenance Window.
	ProjectId      string                           `pulumi:"projectId"`
	ProtectedHours *MaintenanceWindowProtectedHours `pulumi:"protectedHours"`
	// Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
	StartAsap *bool `pulumi:"startAsap"`
}

// The set of arguments for constructing a MaintenanceWindow resource.
type MaintenanceWindowArgs struct {
	// Defer any scheduled maintenance for the given project for one week.
	AutoDefer pulumi.BoolPtrInput
	// Flag that indicates whether you want to defer all maintenance windows one week they would be triggered.
	AutoDeferOnceEnabled pulumi.BoolPtrInput
	// Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
	DayOfWeek pulumi.IntInput
	// Defer the next scheduled maintenance for the given project for one week.
	Defer pulumi.BoolPtrInput
	// Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC). Defaults to 0.
	HourOfDay pulumi.IntPtrInput
	// The unique identifier of the project for the Maintenance Window.
	ProjectId      pulumi.StringInput
	ProtectedHours MaintenanceWindowProtectedHoursPtrInput
	// Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
	StartAsap pulumi.BoolPtrInput
}

func (MaintenanceWindowArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*maintenanceWindowArgs)(nil)).Elem()
}

type MaintenanceWindowInput interface {
	pulumi.Input

	ToMaintenanceWindowOutput() MaintenanceWindowOutput
	ToMaintenanceWindowOutputWithContext(ctx context.Context) MaintenanceWindowOutput
}

func (*MaintenanceWindow) ElementType() reflect.Type {
	return reflect.TypeOf((**MaintenanceWindow)(nil)).Elem()
}

func (i *MaintenanceWindow) ToMaintenanceWindowOutput() MaintenanceWindowOutput {
	return i.ToMaintenanceWindowOutputWithContext(context.Background())
}

func (i *MaintenanceWindow) ToMaintenanceWindowOutputWithContext(ctx context.Context) MaintenanceWindowOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaintenanceWindowOutput)
}

// MaintenanceWindowArrayInput is an input type that accepts MaintenanceWindowArray and MaintenanceWindowArrayOutput values.
// You can construct a concrete instance of `MaintenanceWindowArrayInput` via:
//
//	MaintenanceWindowArray{ MaintenanceWindowArgs{...} }
type MaintenanceWindowArrayInput interface {
	pulumi.Input

	ToMaintenanceWindowArrayOutput() MaintenanceWindowArrayOutput
	ToMaintenanceWindowArrayOutputWithContext(context.Context) MaintenanceWindowArrayOutput
}

type MaintenanceWindowArray []MaintenanceWindowInput

func (MaintenanceWindowArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MaintenanceWindow)(nil)).Elem()
}

func (i MaintenanceWindowArray) ToMaintenanceWindowArrayOutput() MaintenanceWindowArrayOutput {
	return i.ToMaintenanceWindowArrayOutputWithContext(context.Background())
}

func (i MaintenanceWindowArray) ToMaintenanceWindowArrayOutputWithContext(ctx context.Context) MaintenanceWindowArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaintenanceWindowArrayOutput)
}

// MaintenanceWindowMapInput is an input type that accepts MaintenanceWindowMap and MaintenanceWindowMapOutput values.
// You can construct a concrete instance of `MaintenanceWindowMapInput` via:
//
//	MaintenanceWindowMap{ "key": MaintenanceWindowArgs{...} }
type MaintenanceWindowMapInput interface {
	pulumi.Input

	ToMaintenanceWindowMapOutput() MaintenanceWindowMapOutput
	ToMaintenanceWindowMapOutputWithContext(context.Context) MaintenanceWindowMapOutput
}

type MaintenanceWindowMap map[string]MaintenanceWindowInput

func (MaintenanceWindowMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MaintenanceWindow)(nil)).Elem()
}

func (i MaintenanceWindowMap) ToMaintenanceWindowMapOutput() MaintenanceWindowMapOutput {
	return i.ToMaintenanceWindowMapOutputWithContext(context.Background())
}

func (i MaintenanceWindowMap) ToMaintenanceWindowMapOutputWithContext(ctx context.Context) MaintenanceWindowMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaintenanceWindowMapOutput)
}

type MaintenanceWindowOutput struct{ *pulumi.OutputState }

func (MaintenanceWindowOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MaintenanceWindow)(nil)).Elem()
}

func (o MaintenanceWindowOutput) ToMaintenanceWindowOutput() MaintenanceWindowOutput {
	return o
}

func (o MaintenanceWindowOutput) ToMaintenanceWindowOutputWithContext(ctx context.Context) MaintenanceWindowOutput {
	return o
}

// Defer any scheduled maintenance for the given project for one week.
func (o MaintenanceWindowOutput) AutoDefer() pulumi.BoolOutput {
	return o.ApplyT(func(v *MaintenanceWindow) pulumi.BoolOutput { return v.AutoDefer }).(pulumi.BoolOutput)
}

// Flag that indicates whether you want to defer all maintenance windows one week they would be triggered.
func (o MaintenanceWindowOutput) AutoDeferOnceEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *MaintenanceWindow) pulumi.BoolOutput { return v.AutoDeferOnceEnabled }).(pulumi.BoolOutput)
}

// Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
func (o MaintenanceWindowOutput) DayOfWeek() pulumi.IntOutput {
	return o.ApplyT(func(v *MaintenanceWindow) pulumi.IntOutput { return v.DayOfWeek }).(pulumi.IntOutput)
}

// Defer the next scheduled maintenance for the given project for one week.
func (o MaintenanceWindowOutput) Defer() pulumi.BoolOutput {
	return o.ApplyT(func(v *MaintenanceWindow) pulumi.BoolOutput { return v.Defer }).(pulumi.BoolOutput)
}

// Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC). Defaults to 0.
func (o MaintenanceWindowOutput) HourOfDay() pulumi.IntOutput {
	return o.ApplyT(func(v *MaintenanceWindow) pulumi.IntOutput { return v.HourOfDay }).(pulumi.IntOutput)
}

// Number of times the current maintenance event for this project has been deferred, there can be a maximum of 2 deferrals.
func (o MaintenanceWindowOutput) NumberOfDeferrals() pulumi.IntOutput {
	return o.ApplyT(func(v *MaintenanceWindow) pulumi.IntOutput { return v.NumberOfDeferrals }).(pulumi.IntOutput)
}

// The unique identifier of the project for the Maintenance Window.
func (o MaintenanceWindowOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *MaintenanceWindow) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

func (o MaintenanceWindowOutput) ProtectedHours() MaintenanceWindowProtectedHoursPtrOutput {
	return o.ApplyT(func(v *MaintenanceWindow) MaintenanceWindowProtectedHoursPtrOutput { return v.ProtectedHours }).(MaintenanceWindowProtectedHoursPtrOutput)
}

// Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
func (o MaintenanceWindowOutput) StartAsap() pulumi.BoolOutput {
	return o.ApplyT(func(v *MaintenanceWindow) pulumi.BoolOutput { return v.StartAsap }).(pulumi.BoolOutput)
}

// Identifier for the current time zone of the maintenance window. This can only be updated via the Project Settings UI.
func (o MaintenanceWindowOutput) TimeZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *MaintenanceWindow) pulumi.StringOutput { return v.TimeZoneId }).(pulumi.StringOutput)
}

type MaintenanceWindowArrayOutput struct{ *pulumi.OutputState }

func (MaintenanceWindowArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MaintenanceWindow)(nil)).Elem()
}

func (o MaintenanceWindowArrayOutput) ToMaintenanceWindowArrayOutput() MaintenanceWindowArrayOutput {
	return o
}

func (o MaintenanceWindowArrayOutput) ToMaintenanceWindowArrayOutputWithContext(ctx context.Context) MaintenanceWindowArrayOutput {
	return o
}

func (o MaintenanceWindowArrayOutput) Index(i pulumi.IntInput) MaintenanceWindowOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MaintenanceWindow {
		return vs[0].([]*MaintenanceWindow)[vs[1].(int)]
	}).(MaintenanceWindowOutput)
}

type MaintenanceWindowMapOutput struct{ *pulumi.OutputState }

func (MaintenanceWindowMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MaintenanceWindow)(nil)).Elem()
}

func (o MaintenanceWindowMapOutput) ToMaintenanceWindowMapOutput() MaintenanceWindowMapOutput {
	return o
}

func (o MaintenanceWindowMapOutput) ToMaintenanceWindowMapOutputWithContext(ctx context.Context) MaintenanceWindowMapOutput {
	return o
}

func (o MaintenanceWindowMapOutput) MapIndex(k pulumi.StringInput) MaintenanceWindowOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MaintenanceWindow {
		return vs[0].(map[string]*MaintenanceWindow)[vs[1].(string)]
	}).(MaintenanceWindowOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MaintenanceWindowInput)(nil)).Elem(), &MaintenanceWindow{})
	pulumi.RegisterInputType(reflect.TypeOf((*MaintenanceWindowArrayInput)(nil)).Elem(), MaintenanceWindowArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MaintenanceWindowMapInput)(nil)).Elem(), MaintenanceWindowMap{})
	pulumi.RegisterOutputType(MaintenanceWindowOutput{})
	pulumi.RegisterOutputType(MaintenanceWindowArrayOutput{})
	pulumi.RegisterOutputType(MaintenanceWindowMapOutput{})
}
