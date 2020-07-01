// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// `MaintenanceWindow` provides a Maintenance Window entry datasource. Gets information regarding the configured maintenance window for a MongoDB Atlas project.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
func LookupMaintenanceWindow(ctx *pulumi.Context, args *LookupMaintenanceWindowArgs, opts ...pulumi.InvokeOption) (*LookupMaintenanceWindowResult, error) {
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
	// Day of the week when you would like the maintenance window to start as a 1-based integer: S=1, M=2, T=3, W=4, T=5, F=6, S=7.
	DayOfWeek int `pulumi:"dayOfWeek"`
	// Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12  (Time zone is UTC).
	HourOfDay int `pulumi:"hourOfDay"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Number of times the current maintenance event for this project has been deferred, you can set a maximum of 2 deferrals.
	NumberOfDeferrals int    `pulumi:"numberOfDeferrals"`
	ProjectId         string `pulumi:"projectId"`
	// Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
	StartAsap bool `pulumi:"startAsap"`
}
