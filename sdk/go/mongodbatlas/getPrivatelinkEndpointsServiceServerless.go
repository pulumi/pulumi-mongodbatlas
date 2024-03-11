// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `privatelinkEndpointsServiceServerless` Describes the list of all Serverless PrivateLink Endpoint Service resource.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
//
// ## Example with AWS
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
//			testServerlessInstance, err := mongodbatlas.NewServerlessInstance(ctx, "testServerlessInstance", &mongodbatlas.ServerlessInstanceArgs{
//				ProjectId:                           pulumi.String("<PROJECT_ID>"),
//				ProviderSettingsBackingProviderName: pulumi.String("AWS"),
//				ProviderSettingsProviderName:        pulumi.String("SERVERLESS"),
//				ProviderSettingsRegionName:          pulumi.String("US_EAST_1"),
//				ContinuousBackupEnabled:             pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupPrivatelinkEndpointsServiceServerlessOutput(ctx, mongodbatlas.GetPrivatelinkEndpointsServiceServerlessOutputArgs{
//				ProjectId:    pulumi.String("<PROJECT_ID>"),
//				InstanceName: testServerlessInstance.Name,
//			}, nil)
//			testPrivatelinkEndpointServerless, err := mongodbatlas.NewPrivatelinkEndpointServerless(ctx, "testPrivatelinkEndpointServerless", &mongodbatlas.PrivatelinkEndpointServerlessArgs{
//				ProjectId:    pulumi.String("<PROJECT_ID>"),
//				InstanceName: testServerlessInstance.Name,
//				ProviderName: pulumi.String("AWS"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.NewPrivatelinkEndpointServiceServerless(ctx, "testPrivatelinkEndpointServiceServerless", &mongodbatlas.PrivatelinkEndpointServiceServerlessArgs{
//				ProjectId:    pulumi.String("<PROJECT_ID>"),
//				InstanceName: pulumi.String("test-db"),
//				EndpointId:   testPrivatelinkEndpointServerless.EndpointId,
//				ProviderName: pulumi.String("AWS"),
//				Comment:      pulumi.String("New serverless endpoint"),
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
// ## Example with AZURE
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
//			testServerlessInstance, err := mongodbatlas.NewServerlessInstance(ctx, "testServerlessInstance", &mongodbatlas.ServerlessInstanceArgs{
//				ProjectId:                           pulumi.String("<PROJECT_ID>"),
//				ProviderSettingsBackingProviderName: pulumi.String("AZURE"),
//				ProviderSettingsProviderName:        pulumi.String("SERVERLESS"),
//				ProviderSettingsRegionName:          pulumi.String("US_EAST"),
//				ContinuousBackupEnabled:             pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupPrivatelinkEndpointsServiceServerlessOutput(ctx, mongodbatlas.GetPrivatelinkEndpointsServiceServerlessOutputArgs{
//				ProjectId:    pulumi.String("<PROJECT_ID>"),
//				InstanceName: testServerlessInstance.Name,
//			}, nil)
//			testPrivatelinkEndpointServerless, err := mongodbatlas.NewPrivatelinkEndpointServerless(ctx, "testPrivatelinkEndpointServerless", &mongodbatlas.PrivatelinkEndpointServerlessArgs{
//				ProjectId:    pulumi.String("<PROJECT_ID>"),
//				InstanceName: testServerlessInstance.Name,
//				ProviderName: pulumi.String("AZURE"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.NewPrivatelinkEndpointServiceServerless(ctx, "testPrivatelinkEndpointServiceServerless", &mongodbatlas.PrivatelinkEndpointServiceServerlessArgs{
//				ProjectId:    pulumi.String("<PROJECT_ID>"),
//				InstanceName: pulumi.String("test-db"),
//				EndpointId:   testPrivatelinkEndpointServerless.EndpointId,
//				ProviderName: pulumi.String("AZURE"),
//				Comment:      pulumi.String("New serverless endpoint"),
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
func LookupPrivatelinkEndpointsServiceServerless(ctx *pulumi.Context, args *LookupPrivatelinkEndpointsServiceServerlessArgs, opts ...pulumi.InvokeOption) (*LookupPrivatelinkEndpointsServiceServerlessResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPrivatelinkEndpointsServiceServerlessResult
	err := ctx.Invoke("mongodbatlas:index/getPrivatelinkEndpointsServiceServerless:getPrivatelinkEndpointsServiceServerless", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPrivatelinkEndpointsServiceServerless.
type LookupPrivatelinkEndpointsServiceServerlessArgs struct {
	// Human-readable label that identifies the serverless instance
	InstanceName string `pulumi:"instanceName"`
	ItemsPerPage *int   `pulumi:"itemsPerPage"`
	PageNum      *int   `pulumi:"pageNum"`
	// Unique 24-digit hexadecimal string that identifies the project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getPrivatelinkEndpointsServiceServerless.
type LookupPrivatelinkEndpointsServiceServerlessResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id           string `pulumi:"id"`
	InstanceName string `pulumi:"instanceName"`
	ItemsPerPage *int   `pulumi:"itemsPerPage"`
	PageNum      *int   `pulumi:"pageNum"`
	ProjectId    string `pulumi:"projectId"`
	// Each element in the `result` array is one private serverless endpoint.
	Results []GetPrivatelinkEndpointsServiceServerlessResult `pulumi:"results"`
}

func LookupPrivatelinkEndpointsServiceServerlessOutput(ctx *pulumi.Context, args LookupPrivatelinkEndpointsServiceServerlessOutputArgs, opts ...pulumi.InvokeOption) LookupPrivatelinkEndpointsServiceServerlessResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPrivatelinkEndpointsServiceServerlessResult, error) {
			args := v.(LookupPrivatelinkEndpointsServiceServerlessArgs)
			r, err := LookupPrivatelinkEndpointsServiceServerless(ctx, &args, opts...)
			var s LookupPrivatelinkEndpointsServiceServerlessResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupPrivatelinkEndpointsServiceServerlessResultOutput)
}

// A collection of arguments for invoking getPrivatelinkEndpointsServiceServerless.
type LookupPrivatelinkEndpointsServiceServerlessOutputArgs struct {
	// Human-readable label that identifies the serverless instance
	InstanceName pulumi.StringInput `pulumi:"instanceName"`
	ItemsPerPage pulumi.IntPtrInput `pulumi:"itemsPerPage"`
	PageNum      pulumi.IntPtrInput `pulumi:"pageNum"`
	// Unique 24-digit hexadecimal string that identifies the project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupPrivatelinkEndpointsServiceServerlessOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrivatelinkEndpointsServiceServerlessArgs)(nil)).Elem()
}

// A collection of values returned by getPrivatelinkEndpointsServiceServerless.
type LookupPrivatelinkEndpointsServiceServerlessResultOutput struct{ *pulumi.OutputState }

func (LookupPrivatelinkEndpointsServiceServerlessResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrivatelinkEndpointsServiceServerlessResult)(nil)).Elem()
}

func (o LookupPrivatelinkEndpointsServiceServerlessResultOutput) ToLookupPrivatelinkEndpointsServiceServerlessResultOutput() LookupPrivatelinkEndpointsServiceServerlessResultOutput {
	return o
}

func (o LookupPrivatelinkEndpointsServiceServerlessResultOutput) ToLookupPrivatelinkEndpointsServiceServerlessResultOutputWithContext(ctx context.Context) LookupPrivatelinkEndpointsServiceServerlessResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupPrivatelinkEndpointsServiceServerlessResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointsServiceServerlessResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupPrivatelinkEndpointsServiceServerlessResultOutput) InstanceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointsServiceServerlessResult) string { return v.InstanceName }).(pulumi.StringOutput)
}

func (o LookupPrivatelinkEndpointsServiceServerlessResultOutput) ItemsPerPage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointsServiceServerlessResult) *int { return v.ItemsPerPage }).(pulumi.IntPtrOutput)
}

func (o LookupPrivatelinkEndpointsServiceServerlessResultOutput) PageNum() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointsServiceServerlessResult) *int { return v.PageNum }).(pulumi.IntPtrOutput)
}

func (o LookupPrivatelinkEndpointsServiceServerlessResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointsServiceServerlessResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Each element in the `result` array is one private serverless endpoint.
func (o LookupPrivatelinkEndpointsServiceServerlessResultOutput) Results() GetPrivatelinkEndpointsServiceServerlessResultArrayOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointsServiceServerlessResult) []GetPrivatelinkEndpointsServiceServerlessResult {
		return v.Results
	}).(GetPrivatelinkEndpointsServiceServerlessResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPrivatelinkEndpointsServiceServerlessResultOutput{})
}
