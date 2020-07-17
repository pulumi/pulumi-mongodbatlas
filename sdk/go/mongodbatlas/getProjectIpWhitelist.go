// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// `ProjectIpWhitelist` describes an IP Whitelist entry resource. The whitelist grants access from IPs, CIDRs or AWS Security Groups (if VPC Peering is enabled) to clusters within the Project.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
//
// > **IMPORTANT:**
// When you remove an entry from the whitelist, existing connections from the removed address(es) may remain open for a variable amount of time. How much time passes before Atlas closes the connection depends on several factors, including how the connection was established, the particular behavior of the application or driver using the address, and the connection protocol (e.g., TCP or UDP). This is particularly important to consider when changing an existing IP address or CIDR block as they cannot be updated via the Provider (comments can however), hence a change will force the destruction and recreation of entries.
//
// ## Example Usage
func LookupProjectIpWhitelist(ctx *pulumi.Context, args *LookupProjectIpWhitelistArgs, opts ...pulumi.InvokeOption) (*LookupProjectIpWhitelistResult, error) {
	var rv LookupProjectIpWhitelistResult
	err := ctx.Invoke("mongodbatlas:index/getProjectIpWhitelist:getProjectIpWhitelist", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProjectIpWhitelist.
type LookupProjectIpWhitelistArgs struct {
	// ID of the whitelisted AWS security group. Mutually exclusive with `cidrBlock` and `ipAddress`.
	AwsSecurityGroup *string `pulumi:"awsSecurityGroup"`
	// Whitelist entry in Classless Inter-Domain Routing (CIDR) notation. Mutually exclusive with `awsSecurityGroup` and `ipAddress`.
	CidrBlock *string `pulumi:"cidrBlock"`
	// Whitelisted IP address. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
	IpAddress *string `pulumi:"ipAddress"`
	// The ID of the project in which to add the whitelist entry.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getProjectIpWhitelist.
type LookupProjectIpWhitelistResult struct {
	AwsSecurityGroup string `pulumi:"awsSecurityGroup"`
	CidrBlock        string `pulumi:"cidrBlock"`
	// Comment to add to the whitelist entry.
	Comment string `pulumi:"comment"`
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	IpAddress string `pulumi:"ipAddress"`
	ProjectId string `pulumi:"projectId"`
}
