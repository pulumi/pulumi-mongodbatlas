// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `getPrivatelinkEndpointServiceDataFederationOnlineArchives` describes Private Endpoint Service resources for Data Federation and Online Archive.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
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
//			_, err := mongodbatlas.NewProject(ctx, "atlas-project", &mongodbatlas.ProjectArgs{
//				OrgId: pulumi.Any(atlasOrgId),
//				Name:  pulumi.Any(atlasProjectName),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.NewPrivatelinkEndpointServiceDataFederationOnlineArchive(ctx, "test", &mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchiveArgs{
//				ProjectId:               atlas_project.ID(),
//				EndpointId:              pulumi.String("vpce-046cf43c79424d4c9"),
//				ProviderName:            pulumi.String("AWS"),
//				Comment:                 pulumi.String("Test"),
//				Region:                  pulumi.String("US_EAST_1"),
//				CustomerEndpointDnsName: pulumi.String("vpce-046cf43c79424d4c9-nmls2y9k.vpce-svc-0824460b72e1a420e.us-east-1.vpce.amazonaws.com"),
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesOutput(ctx, mongodbatlas.GetPrivatelinkEndpointServiceDataFederationOnlineArchivesOutputArgs{
//				ProjectId: atlas_project.ID(),
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupPrivatelinkEndpointServiceDataFederationOnlineArchives(ctx *pulumi.Context, args *LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesArgs, opts ...pulumi.InvokeOption) (*LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResult
	err := ctx.Invoke("mongodbatlas:index/getPrivatelinkEndpointServiceDataFederationOnlineArchives:getPrivatelinkEndpointServiceDataFederationOnlineArchives", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPrivatelinkEndpointServiceDataFederationOnlineArchives.
type LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesArgs struct {
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getPrivatelinkEndpointServiceDataFederationOnlineArchives.
type LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	ProjectId string `pulumi:"projectId"`
	// A list where each represents a Private Endpoint Service
	Results []GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult `pulumi:"results"`
}

func LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesOutput(ctx *pulumi.Context, args LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesOutputArgs, opts ...pulumi.InvokeOption) LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResult, error) {
			args := v.(LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesArgs)
			r, err := LookupPrivatelinkEndpointServiceDataFederationOnlineArchives(ctx, &args, opts...)
			var s LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResultOutput)
}

// A collection of arguments for invoking getPrivatelinkEndpointServiceDataFederationOnlineArchives.
type LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesOutputArgs struct {
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesArgs)(nil)).Elem()
}

// A collection of values returned by getPrivatelinkEndpointServiceDataFederationOnlineArchives.
type LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResultOutput struct{ *pulumi.OutputState }

func (LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResult)(nil)).Elem()
}

func (o LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResultOutput) ToLookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResultOutput() LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResultOutput {
	return o
}

func (o LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResultOutput) ToLookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResultOutputWithContext(ctx context.Context) LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// A list where each represents a Private Endpoint Service
func (o LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResultOutput) Results() GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResultArrayOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResult) []GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResult {
		return v.Results
	}).(GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPrivatelinkEndpointServiceDataFederationOnlineArchivesResultOutput{})
}
