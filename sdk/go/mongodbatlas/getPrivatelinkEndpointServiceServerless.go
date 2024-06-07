// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `privatelinkEndpointServiceServerless` Provides a Serverless PrivateLink Endpoint Service resource.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
//
// ## Example with AWS
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
//			testServerlessInstance, err := mongodbatlas.NewServerlessInstance(ctx, "test", &mongodbatlas.ServerlessInstanceArgs{
//				ProjectId:                           pulumi.String("<PROJECT_ID>"),
//				Name:                                pulumi.String("test-db"),
//				ProviderSettingsBackingProviderName: pulumi.String("AWS"),
//				ProviderSettingsProviderName:        pulumi.String("SERVERLESS"),
//				ProviderSettingsRegionName:          pulumi.String("US_EAST_1"),
//				ContinuousBackupEnabled:             pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			testPrivatelinkEndpointServerless, err := mongodbatlas.NewPrivatelinkEndpointServerless(ctx, "test", &mongodbatlas.PrivatelinkEndpointServerlessArgs{
//				ProjectId:    pulumi.String("<PROJECT_ID>"),
//				InstanceName: testServerlessInstance.Name,
//				ProviderName: pulumi.String("AWS"),
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupPrivatelinkEndpointServiceServerlessOutput(ctx, mongodbatlas.GetPrivatelinkEndpointServiceServerlessOutputArgs{
//				ProjectId:    pulumi.String("<PROJECT_ID>"),
//				InstanceName: testServerlessInstance.Name,
//				EndpointId:   testPrivatelinkEndpointServerless.EndpointId,
//			}, nil)
//			_, err = mongodbatlas.NewPrivatelinkEndpointServiceServerless(ctx, "test", &mongodbatlas.PrivatelinkEndpointServiceServerlessArgs{
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
//
// ## Example with AZURE
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
//			testServerlessInstance, err := mongodbatlas.NewServerlessInstance(ctx, "test", &mongodbatlas.ServerlessInstanceArgs{
//				ProjectId:                           pulumi.String("<PROJECT_ID>"),
//				Name:                                pulumi.String("test-db"),
//				ProviderSettingsBackingProviderName: pulumi.String("AZURE"),
//				ProviderSettingsProviderName:        pulumi.String("SERVERLESS"),
//				ProviderSettingsRegionName:          pulumi.String("US_EAST"),
//				ContinuousBackupEnabled:             pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			testPrivatelinkEndpointServerless, err := mongodbatlas.NewPrivatelinkEndpointServerless(ctx, "test", &mongodbatlas.PrivatelinkEndpointServerlessArgs{
//				ProjectId:    pulumi.String("<PROJECT_ID>"),
//				InstanceName: testServerlessInstance.Name,
//				ProviderName: pulumi.String("AZURE"),
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupPrivatelinkEndpointServiceServerlessOutput(ctx, mongodbatlas.GetPrivatelinkEndpointServiceServerlessOutputArgs{
//				ProjectId:    pulumi.String("<PROJECT_ID>"),
//				InstanceName: testServerlessInstance.Name,
//				EndpointId:   testPrivatelinkEndpointServerless.EndpointId,
//			}, nil)
//			_, err = mongodbatlas.NewPrivatelinkEndpointServiceServerless(ctx, "test", &mongodbatlas.PrivatelinkEndpointServiceServerlessArgs{
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
//
// ### Available complete examples
// - Setup private connection to a MongoDB Atlas Serverless Instance with AWS VPC
func LookupPrivatelinkEndpointServiceServerless(ctx *pulumi.Context, args *LookupPrivatelinkEndpointServiceServerlessArgs, opts ...pulumi.InvokeOption) (*LookupPrivatelinkEndpointServiceServerlessResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPrivatelinkEndpointServiceServerlessResult
	err := ctx.Invoke("mongodbatlas:index/getPrivatelinkEndpointServiceServerless:getPrivatelinkEndpointServiceServerless", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPrivatelinkEndpointServiceServerless.
type LookupPrivatelinkEndpointServiceServerlessArgs struct {
	// Unique 22-character alphanumeric string that identifies the private endpoint. Atlas supports AWS private endpoints using the [AWS PrivateLink](https://aws.amazon.com/privatelink/) feature.
	EndpointId string `pulumi:"endpointId"`
	// Human-readable label that identifies the serverless instance
	InstanceName string `pulumi:"instanceName"`
	// Unique 24-digit hexadecimal string that identifies the project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getPrivatelinkEndpointServiceServerless.
type LookupPrivatelinkEndpointServiceServerlessResult struct {
	CloudProviderEndpointId string `pulumi:"cloudProviderEndpointId"`
	Comment                 string `pulumi:"comment"`
	EndpointId              string `pulumi:"endpointId"`
	// Unique string that identifies the PrivateLink endpoint service. MongoDB Cloud returns null while it creates the endpoint service.
	EndpointServiceName string `pulumi:"endpointServiceName"`
	ErrorMessage        string `pulumi:"errorMessage"`
	// The provider-assigned unique ID for this managed resource.
	Id           string `pulumi:"id"`
	InstanceName string `pulumi:"instanceName"`
	// IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
	PrivateEndpointIpAddress string `pulumi:"privateEndpointIpAddress"`
	// Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
	PrivateLinkServiceResourceId string `pulumi:"privateLinkServiceResourceId"`
	ProjectId                    string `pulumi:"projectId"`
	// Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
	Status string `pulumi:"status"`
}

func LookupPrivatelinkEndpointServiceServerlessOutput(ctx *pulumi.Context, args LookupPrivatelinkEndpointServiceServerlessOutputArgs, opts ...pulumi.InvokeOption) LookupPrivatelinkEndpointServiceServerlessResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPrivatelinkEndpointServiceServerlessResult, error) {
			args := v.(LookupPrivatelinkEndpointServiceServerlessArgs)
			r, err := LookupPrivatelinkEndpointServiceServerless(ctx, &args, opts...)
			var s LookupPrivatelinkEndpointServiceServerlessResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupPrivatelinkEndpointServiceServerlessResultOutput)
}

// A collection of arguments for invoking getPrivatelinkEndpointServiceServerless.
type LookupPrivatelinkEndpointServiceServerlessOutputArgs struct {
	// Unique 22-character alphanumeric string that identifies the private endpoint. Atlas supports AWS private endpoints using the [AWS PrivateLink](https://aws.amazon.com/privatelink/) feature.
	EndpointId pulumi.StringInput `pulumi:"endpointId"`
	// Human-readable label that identifies the serverless instance
	InstanceName pulumi.StringInput `pulumi:"instanceName"`
	// Unique 24-digit hexadecimal string that identifies the project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupPrivatelinkEndpointServiceServerlessOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrivatelinkEndpointServiceServerlessArgs)(nil)).Elem()
}

// A collection of values returned by getPrivatelinkEndpointServiceServerless.
type LookupPrivatelinkEndpointServiceServerlessResultOutput struct{ *pulumi.OutputState }

func (LookupPrivatelinkEndpointServiceServerlessResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrivatelinkEndpointServiceServerlessResult)(nil)).Elem()
}

func (o LookupPrivatelinkEndpointServiceServerlessResultOutput) ToLookupPrivatelinkEndpointServiceServerlessResultOutput() LookupPrivatelinkEndpointServiceServerlessResultOutput {
	return o
}

func (o LookupPrivatelinkEndpointServiceServerlessResultOutput) ToLookupPrivatelinkEndpointServiceServerlessResultOutputWithContext(ctx context.Context) LookupPrivatelinkEndpointServiceServerlessResultOutput {
	return o
}

func (o LookupPrivatelinkEndpointServiceServerlessResultOutput) CloudProviderEndpointId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointServiceServerlessResult) string { return v.CloudProviderEndpointId }).(pulumi.StringOutput)
}

func (o LookupPrivatelinkEndpointServiceServerlessResultOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointServiceServerlessResult) string { return v.Comment }).(pulumi.StringOutput)
}

func (o LookupPrivatelinkEndpointServiceServerlessResultOutput) EndpointId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointServiceServerlessResult) string { return v.EndpointId }).(pulumi.StringOutput)
}

// Unique string that identifies the PrivateLink endpoint service. MongoDB Cloud returns null while it creates the endpoint service.
func (o LookupPrivatelinkEndpointServiceServerlessResultOutput) EndpointServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointServiceServerlessResult) string { return v.EndpointServiceName }).(pulumi.StringOutput)
}

func (o LookupPrivatelinkEndpointServiceServerlessResultOutput) ErrorMessage() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointServiceServerlessResult) string { return v.ErrorMessage }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupPrivatelinkEndpointServiceServerlessResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointServiceServerlessResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupPrivatelinkEndpointServiceServerlessResultOutput) InstanceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointServiceServerlessResult) string { return v.InstanceName }).(pulumi.StringOutput)
}

// IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
func (o LookupPrivatelinkEndpointServiceServerlessResultOutput) PrivateEndpointIpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointServiceServerlessResult) string { return v.PrivateEndpointIpAddress }).(pulumi.StringOutput)
}

// Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
func (o LookupPrivatelinkEndpointServiceServerlessResultOutput) PrivateLinkServiceResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointServiceServerlessResult) string { return v.PrivateLinkServiceResourceId }).(pulumi.StringOutput)
}

func (o LookupPrivatelinkEndpointServiceServerlessResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointServiceServerlessResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
func (o LookupPrivatelinkEndpointServiceServerlessResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointServiceServerlessResult) string { return v.Status }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPrivatelinkEndpointServiceServerlessResultOutput{})
}
