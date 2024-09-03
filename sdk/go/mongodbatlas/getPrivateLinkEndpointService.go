// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// # Data Source: PrivateLinkEndpointService
//
// `PrivateLinkEndpointService` describes a Private Endpoint Link. This represents a Private Endpoint Link Connection that wants to retrieve details in an Atlas project.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
func LookupPrivateLinkEndpointService(ctx *pulumi.Context, args *LookupPrivateLinkEndpointServiceArgs, opts ...pulumi.InvokeOption) (*LookupPrivateLinkEndpointServiceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPrivateLinkEndpointServiceResult
	err := ctx.Invoke("mongodbatlas:index/getPrivateLinkEndpointService:getPrivateLinkEndpointService", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPrivateLinkEndpointService.
type LookupPrivateLinkEndpointServiceArgs struct {
	// Unique identifier of the `AWS` or `AZURE` or `GCP` resource.
	EndpointServiceId string `pulumi:"endpointServiceId"`
	// Unique identifier of the private endpoint service for which you want to retrieve a private endpoint.
	PrivateLinkId string `pulumi:"privateLinkId"`
	// Unique identifier for the project.
	ProjectId string `pulumi:"projectId"`
	// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE` or `GCP`.
	ProviderName string `pulumi:"providerName"`
}

// A collection of values returned by getPrivateLinkEndpointService.
type LookupPrivateLinkEndpointServiceResult struct {
	// Status of the interface endpoint for AWS.
	// Returns one of the following values:
	// * `NONE` - Atlas created the network load balancer and VPC endpoint service, but AWS hasn’t yet created the VPC endpoint.
	// * `PENDING_ACCEPTANCE` - AWS has received the connection request from your VPC endpoint to the Atlas VPC endpoint service.
	// * `PENDING` - AWS is establishing the connection between your VPC endpoint and the Atlas VPC endpoint service.
	// * `AVAILABLE` - Atlas VPC resources are connected to the VPC endpoint in your VPC. You can connect to Atlas clusters in this region using AWS PrivateLink.
	// * `REJECTED` - AWS failed to establish a connection between Atlas VPC resources to the VPC endpoint in your VPC.
	// * `DELETING` - Atlas is removing the interface endpoint from the private endpoint connection.
	AwsConnectionStatus string `pulumi:"awsConnectionStatus"`
	// Status of the interface endpoint for AZURE.
	// Returns one of the following values:
	// * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
	// * `AVAILABLE` - Atlas approved the connection to your private endpoint.
	// * `FAILED` - Atlas failed to accept the connection your private endpoint.
	// * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
	AzureStatus string `pulumi:"azureStatus"`
	// Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
	DeleteRequested   bool   `pulumi:"deleteRequested"`
	EndpointServiceId string `pulumi:"endpointServiceId"`
	// Collection of individual private endpoints that comprise your network endpoint group.
	Endpoints []GetPrivateLinkEndpointServiceEndpoint `pulumi:"endpoints"`
	// Error message pertaining to the interface endpoint. Returns null if there are no errors.
	ErrorMessage string `pulumi:"errorMessage"`
	// Status of the interface endpoint for GCP.
	// Returns one of the following values:
	// * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
	// * `AVAILABLE` - Atlas approved the connection to your private endpoint.
	// * `FAILED` - Atlas failed to accept the connection your private endpoint.
	// * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
	GcpStatus string `pulumi:"gcpStatus"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the interface endpoint.
	InterfaceEndpointId string `pulumi:"interfaceEndpointId"`
	// Name of the connection for this private endpoint that Atlas generates.
	PrivateEndpointConnectionName string `pulumi:"privateEndpointConnectionName"`
	// Private IP address of the private endpoint network interface.
	PrivateEndpointIpAddress string `pulumi:"privateEndpointIpAddress"`
	// Unique identifier of the private endpoint.
	PrivateEndpointResourceId string `pulumi:"privateEndpointResourceId"`
	PrivateLinkId             string `pulumi:"privateLinkId"`
	ProjectId                 string `pulumi:"projectId"`
	ProviderName              string `pulumi:"providerName"`
}

func LookupPrivateLinkEndpointServiceOutput(ctx *pulumi.Context, args LookupPrivateLinkEndpointServiceOutputArgs, opts ...pulumi.InvokeOption) LookupPrivateLinkEndpointServiceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPrivateLinkEndpointServiceResult, error) {
			args := v.(LookupPrivateLinkEndpointServiceArgs)
			r, err := LookupPrivateLinkEndpointService(ctx, &args, opts...)
			var s LookupPrivateLinkEndpointServiceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupPrivateLinkEndpointServiceResultOutput)
}

// A collection of arguments for invoking getPrivateLinkEndpointService.
type LookupPrivateLinkEndpointServiceOutputArgs struct {
	// Unique identifier of the `AWS` or `AZURE` or `GCP` resource.
	EndpointServiceId pulumi.StringInput `pulumi:"endpointServiceId"`
	// Unique identifier of the private endpoint service for which you want to retrieve a private endpoint.
	PrivateLinkId pulumi.StringInput `pulumi:"privateLinkId"`
	// Unique identifier for the project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
	// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS` or `AZURE` or `GCP`.
	ProviderName pulumi.StringInput `pulumi:"providerName"`
}

func (LookupPrivateLinkEndpointServiceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrivateLinkEndpointServiceArgs)(nil)).Elem()
}

// A collection of values returned by getPrivateLinkEndpointService.
type LookupPrivateLinkEndpointServiceResultOutput struct{ *pulumi.OutputState }

func (LookupPrivateLinkEndpointServiceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrivateLinkEndpointServiceResult)(nil)).Elem()
}

func (o LookupPrivateLinkEndpointServiceResultOutput) ToLookupPrivateLinkEndpointServiceResultOutput() LookupPrivateLinkEndpointServiceResultOutput {
	return o
}

func (o LookupPrivateLinkEndpointServiceResultOutput) ToLookupPrivateLinkEndpointServiceResultOutputWithContext(ctx context.Context) LookupPrivateLinkEndpointServiceResultOutput {
	return o
}

// Status of the interface endpoint for AWS.
// Returns one of the following values:
// * `NONE` - Atlas created the network load balancer and VPC endpoint service, but AWS hasn’t yet created the VPC endpoint.
// * `PENDING_ACCEPTANCE` - AWS has received the connection request from your VPC endpoint to the Atlas VPC endpoint service.
// * `PENDING` - AWS is establishing the connection between your VPC endpoint and the Atlas VPC endpoint service.
// * `AVAILABLE` - Atlas VPC resources are connected to the VPC endpoint in your VPC. You can connect to Atlas clusters in this region using AWS PrivateLink.
// * `REJECTED` - AWS failed to establish a connection between Atlas VPC resources to the VPC endpoint in your VPC.
// * `DELETING` - Atlas is removing the interface endpoint from the private endpoint connection.
func (o LookupPrivateLinkEndpointServiceResultOutput) AwsConnectionStatus() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkEndpointServiceResult) string { return v.AwsConnectionStatus }).(pulumi.StringOutput)
}

// Status of the interface endpoint for AZURE.
// Returns one of the following values:
// * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
// * `AVAILABLE` - Atlas approved the connection to your private endpoint.
// * `FAILED` - Atlas failed to accept the connection your private endpoint.
// * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
func (o LookupPrivateLinkEndpointServiceResultOutput) AzureStatus() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkEndpointServiceResult) string { return v.AzureStatus }).(pulumi.StringOutput)
}

// Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
func (o LookupPrivateLinkEndpointServiceResultOutput) DeleteRequested() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupPrivateLinkEndpointServiceResult) bool { return v.DeleteRequested }).(pulumi.BoolOutput)
}

func (o LookupPrivateLinkEndpointServiceResultOutput) EndpointServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkEndpointServiceResult) string { return v.EndpointServiceId }).(pulumi.StringOutput)
}

// Collection of individual private endpoints that comprise your network endpoint group.
func (o LookupPrivateLinkEndpointServiceResultOutput) Endpoints() GetPrivateLinkEndpointServiceEndpointArrayOutput {
	return o.ApplyT(func(v LookupPrivateLinkEndpointServiceResult) []GetPrivateLinkEndpointServiceEndpoint {
		return v.Endpoints
	}).(GetPrivateLinkEndpointServiceEndpointArrayOutput)
}

// Error message pertaining to the interface endpoint. Returns null if there are no errors.
func (o LookupPrivateLinkEndpointServiceResultOutput) ErrorMessage() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkEndpointServiceResult) string { return v.ErrorMessage }).(pulumi.StringOutput)
}

// Status of the interface endpoint for GCP.
// Returns one of the following values:
// * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
// * `AVAILABLE` - Atlas approved the connection to your private endpoint.
// * `FAILED` - Atlas failed to accept the connection your private endpoint.
// * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
func (o LookupPrivateLinkEndpointServiceResultOutput) GcpStatus() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkEndpointServiceResult) string { return v.GcpStatus }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupPrivateLinkEndpointServiceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkEndpointServiceResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the interface endpoint.
func (o LookupPrivateLinkEndpointServiceResultOutput) InterfaceEndpointId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkEndpointServiceResult) string { return v.InterfaceEndpointId }).(pulumi.StringOutput)
}

// Name of the connection for this private endpoint that Atlas generates.
func (o LookupPrivateLinkEndpointServiceResultOutput) PrivateEndpointConnectionName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkEndpointServiceResult) string { return v.PrivateEndpointConnectionName }).(pulumi.StringOutput)
}

// Private IP address of the private endpoint network interface.
func (o LookupPrivateLinkEndpointServiceResultOutput) PrivateEndpointIpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkEndpointServiceResult) string { return v.PrivateEndpointIpAddress }).(pulumi.StringOutput)
}

// Unique identifier of the private endpoint.
func (o LookupPrivateLinkEndpointServiceResultOutput) PrivateEndpointResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkEndpointServiceResult) string { return v.PrivateEndpointResourceId }).(pulumi.StringOutput)
}

func (o LookupPrivateLinkEndpointServiceResultOutput) PrivateLinkId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkEndpointServiceResult) string { return v.PrivateLinkId }).(pulumi.StringOutput)
}

func (o LookupPrivateLinkEndpointServiceResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkEndpointServiceResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o LookupPrivateLinkEndpointServiceResultOutput) ProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkEndpointServiceResult) string { return v.ProviderName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPrivateLinkEndpointServiceResultOutput{})
}
