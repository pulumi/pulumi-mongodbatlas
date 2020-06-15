// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// `.getProjects` describe all Projects. This represents projects that have been created.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
func GetProjects(ctx *pulumi.Context, args *GetProjectsArgs, opts ...pulumi.InvokeOption) (*GetProjectsResult, error) {
	var rv GetProjectsResult
	err := ctx.Invoke("mongodbatlas:index/getProjects:getProjects", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProjects.
type GetProjectsArgs struct {
	// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
	ItemsPerPage *int `pulumi:"itemsPerPage"`
	// The page to return. Defaults to `1`.
	PageNum *int `pulumi:"pageNum"`
}

// A collection of values returned by getProjects.
type GetProjectsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id           string                  `pulumi:"id"`
	ItemsPerPage *int                    `pulumi:"itemsPerPage"`
	PageNum      *int                    `pulumi:"pageNum"`
	Results      []GetProjectsResultType `pulumi:"results"`
	TotalCount   int                     `pulumi:"totalCount"`
}
