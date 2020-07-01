// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// `CloudProviderSnapshot` provides an Cloud Backup Snapshot datasource. Atlas Cloud Backup Snapshots provide localized backup storage using the native snapshot functionality of the cluster’s cloud service.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
func LookupCloudProviderSnapshot(ctx *pulumi.Context, args *LookupCloudProviderSnapshotArgs, opts ...pulumi.InvokeOption) (*LookupCloudProviderSnapshotResult, error) {
	var rv LookupCloudProviderSnapshotResult
	err := ctx.Invoke("mongodbatlas:index/getCloudProviderSnapshot:getCloudProviderSnapshot", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCloudProviderSnapshot.
type LookupCloudProviderSnapshotArgs struct {
	// The name of the Atlas cluster that contains the snapshot you want to retrieve.
	ClusterName string `pulumi:"clusterName"`
	ProjectId   string `pulumi:"projectId"`
	// The unique identifier of the snapshot you want to retrieve.
	SnapshotId string `pulumi:"snapshotId"`
}

// A collection of values returned by getCloudProviderSnapshot.
type LookupCloudProviderSnapshotResult struct {
	ClusterName string `pulumi:"clusterName"`
	// UTC ISO 8601 formatted point in time when Atlas took the snapshot.
	CreatedAt string `pulumi:"createdAt"`
	// UDescription of the snapshot. Only present for on-demand snapshots.
	Description string `pulumi:"description"`
	// UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
	ExpiresAt string `pulumi:"expiresAt"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
	MasterKeyUuid string `pulumi:"masterKeyUuid"`
	// Version of the MongoDB server.
	MongodVersion string `pulumi:"mongodVersion"`
	ProjectId     string `pulumi:"projectId"`
	SnapshotId    string `pulumi:"snapshotId"`
	// Specified the type of snapshot. Valid values are onDemand and scheduled.
	SnapshotType string `pulumi:"snapshotType"`
	// Current status of the snapshot. One of the following values: queued, inProgress, completed, failed.
	Status string `pulumi:"status"`
	// Specifies the size of the snapshot in bytes.
	StorageSizeBytes int `pulumi:"storageSizeBytes"`
	// Specifies the type of cluster: replicaSet or shardedCluster.
	Type string `pulumi:"type"`
}
