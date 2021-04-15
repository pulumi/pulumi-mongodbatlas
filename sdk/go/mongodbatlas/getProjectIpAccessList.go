// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `ProjectIpAccessList` describes an IP Access List entry resource. The access list grants access from IPs, CIDRs or AWS Security Groups (if VPC Peering is enabled) to clusters within the Project.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
//
// > **IMPORTANT:**
// When you remove an entry from the access list, existing connections from the removed address(es) may remain open for a variable amount of time. How much time passes before Atlas closes the connection depends on several factors, including how the connection was established, the particular behavior of the application or driver using the address, and the connection protocol (e.g., TCP or UDP). This is particularly important to consider when changing an existing IP address or CIDR block as they cannot be updated via the Provider (comments can however), hence a change will force the destruction and recreation of entries.
//
// ## Example Usage
func LookupProjectIpAccessList(ctx *pulumi.Context, args *LookupProjectIpAccessListArgs, opts ...pulumi.InvokeOption) (*LookupProjectIpAccessListResult, error) {
	var rv LookupProjectIpAccessListResult
	err := ctx.Invoke("mongodbatlas:index/getProjectIpAccessList:getProjectIpAccessList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProjectIpAccessList.
type LookupProjectIpAccessListArgs struct {
	// Unique identifier of the AWS security group to add to the access list.
	AwsSecurityGroup *string `pulumi:"awsSecurityGroup"`
	// Range of IP addresses in CIDR notation to be added to the access list.
	CidrBlock *string `pulumi:"cidrBlock"`
	// Single IP address to be added to the access list.
	IpAddress *string `pulumi:"ipAddress"`
	// Unique identifier for the project to which you want to add one or more access list entries.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getProjectIpAccessList.
type LookupProjectIpAccessListResult struct {
	AwsSecurityGroup string `pulumi:"awsSecurityGroup"`
	CidrBlock        string `pulumi:"cidrBlock"`
	// Comment to add to the access list entry.
	Comment string `pulumi:"comment"`
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	IpAddress string `pulumi:"ipAddress"`
	ProjectId string `pulumi:"projectId"`
}
