// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: MaintenanceWindow
//
// `MaintenanceWindow` provides a Maintenance Window entry datasource. Gets information regarding the configured maintenance window for a MongoDB Atlas project.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
//
// ## Examples Usage
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
//			testMaintenanceWindow, err := mongodbatlas.NewMaintenanceWindow(ctx, "test", &mongodbatlas.MaintenanceWindowArgs{
//				ProjectId:            pulumi.String("<your-project-id>"),
//				DayOfWeek:            pulumi.Int(3),
//				HourOfDay:            pulumi.Int(4),
//				AutoDeferOnceEnabled: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupMaintenanceWindowOutput(ctx, mongodbatlas.GetMaintenanceWindowOutputArgs{
//				ProjectId: testMaintenanceWindow.ID(),
//			}, nil)
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
//			testMaintenanceWindow, err := mongodbatlas.NewMaintenanceWindow(ctx, "test", &mongodbatlas.MaintenanceWindowArgs{
//				ProjectId: pulumi.String("<your-project-id>"),
//				StartAsap: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupMaintenanceWindowOutput(ctx, mongodbatlas.GetMaintenanceWindowOutputArgs{
//				ProjectId: testMaintenanceWindow.ID(),
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupMaintenanceWindow(ctx *pulumi.Context, args *LookupMaintenanceWindowArgs, opts ...pulumi.InvokeOption) (*LookupMaintenanceWindowResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupMaintenanceWindowResult
	err := ctx.Invoke("mongodbatlas:index/getMaintenanceWindow:getMaintenanceWindow", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMaintenanceWindow.
type LookupMaintenanceWindowArgs struct {
	// The unique identifier of the project for the Maintenance Window.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getMaintenanceWindow.
type LookupMaintenanceWindowResult struct {
	// Flag that indicates whether you want to defer all maintenance windows one week they would be triggered.
	// For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/maintenance-windows/)
	AutoDeferOnceEnabled bool `pulumi:"autoDeferOnceEnabled"`
	// Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
	DayOfWeek int `pulumi:"dayOfWeek"`
	// Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12  (Time zone is UTC).
	HourOfDay int `pulumi:"hourOfDay"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Number of times the current maintenance event for this project has been deferred, there can be a maximum of 2 deferrals.
	NumberOfDeferrals int    `pulumi:"numberOfDeferrals"`
	ProjectId         string `pulumi:"projectId"`
	// Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
	StartAsap bool `pulumi:"startAsap"`
}

func LookupMaintenanceWindowOutput(ctx *pulumi.Context, args LookupMaintenanceWindowOutputArgs, opts ...pulumi.InvokeOption) LookupMaintenanceWindowResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupMaintenanceWindowResultOutput, error) {
			args := v.(LookupMaintenanceWindowArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupMaintenanceWindowResult
			secret, err := ctx.InvokePackageRaw("mongodbatlas:index/getMaintenanceWindow:getMaintenanceWindow", args, &rv, "", opts...)
			if err != nil {
				return LookupMaintenanceWindowResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupMaintenanceWindowResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupMaintenanceWindowResultOutput), nil
			}
			return output, nil
		}).(LookupMaintenanceWindowResultOutput)
}

// A collection of arguments for invoking getMaintenanceWindow.
type LookupMaintenanceWindowOutputArgs struct {
	// The unique identifier of the project for the Maintenance Window.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupMaintenanceWindowOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMaintenanceWindowArgs)(nil)).Elem()
}

// A collection of values returned by getMaintenanceWindow.
type LookupMaintenanceWindowResultOutput struct{ *pulumi.OutputState }

func (LookupMaintenanceWindowResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMaintenanceWindowResult)(nil)).Elem()
}

func (o LookupMaintenanceWindowResultOutput) ToLookupMaintenanceWindowResultOutput() LookupMaintenanceWindowResultOutput {
	return o
}

func (o LookupMaintenanceWindowResultOutput) ToLookupMaintenanceWindowResultOutputWithContext(ctx context.Context) LookupMaintenanceWindowResultOutput {
	return o
}

// Flag that indicates whether you want to defer all maintenance windows one week they would be triggered.
// For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/maintenance-windows/)
func (o LookupMaintenanceWindowResultOutput) AutoDeferOnceEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupMaintenanceWindowResult) bool { return v.AutoDeferOnceEnabled }).(pulumi.BoolOutput)
}

// Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
func (o LookupMaintenanceWindowResultOutput) DayOfWeek() pulumi.IntOutput {
	return o.ApplyT(func(v LookupMaintenanceWindowResult) int { return v.DayOfWeek }).(pulumi.IntOutput)
}

// Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12  (Time zone is UTC).
func (o LookupMaintenanceWindowResultOutput) HourOfDay() pulumi.IntOutput {
	return o.ApplyT(func(v LookupMaintenanceWindowResult) int { return v.HourOfDay }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupMaintenanceWindowResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMaintenanceWindowResult) string { return v.Id }).(pulumi.StringOutput)
}

// Number of times the current maintenance event for this project has been deferred, there can be a maximum of 2 deferrals.
func (o LookupMaintenanceWindowResultOutput) NumberOfDeferrals() pulumi.IntOutput {
	return o.ApplyT(func(v LookupMaintenanceWindowResult) int { return v.NumberOfDeferrals }).(pulumi.IntOutput)
}

func (o LookupMaintenanceWindowResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMaintenanceWindowResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
func (o LookupMaintenanceWindowResultOutput) StartAsap() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupMaintenanceWindowResult) bool { return v.StartAsap }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupMaintenanceWindowResultOutput{})
}
