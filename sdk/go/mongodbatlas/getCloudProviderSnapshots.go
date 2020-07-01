// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// `getCloudProviderSnapshots` provides an Cloud Backup Snapshot datasource. Atlas Cloud Backup Snapshots provide localized backup storage using the native snapshot functionality of the cluster’s cloud service.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
func GetCloudProviderSnapshots(ctx *pulumi.Context, args *GetCloudProviderSnapshotsArgs, opts ...pulumi.InvokeOption) (*GetCloudProviderSnapshotsResult, error) {
	var rv GetCloudProviderSnapshotsResult
	err := ctx.Invoke("mongodbatlas:index/getCloudProviderSnapshots:getCloudProviderSnapshots", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCloudProviderSnapshots.
type GetCloudProviderSnapshotsArgs struct {
	// The name of the Atlas cluster that contains the snapshot you want to retrieve.
	ClusterName string `pulumi:"clusterName"`
	// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
	ItemsPerPage *int `pulumi:"itemsPerPage"`
	// The page to return. Defaults to `1`.
	PageNum   *int   `pulumi:"pageNum"`
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getCloudProviderSnapshots.
type GetCloudProviderSnapshotsResult struct {
	ClusterName string `pulumi:"clusterName"`
	// The provider-assigned unique ID for this managed resource.
	Id           string `pulumi:"id"`
	ItemsPerPage *int   `pulumi:"itemsPerPage"`
	PageNum      *int   `pulumi:"pageNum"`
	ProjectId    string `pulumi:"projectId"`
	// Includes cloudProviderSnapshot object for each item detailed in the results array section.
	Results    []GetCloudProviderSnapshotsResultType `pulumi:"results"`
	TotalCount int                                   `pulumi:"totalCount"`
}
