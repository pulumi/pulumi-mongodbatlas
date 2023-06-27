// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupPrivatelinkEndpointServiceDataFederationOnlineArchive(ctx *pulumi.Context, args *LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveArgs, opts ...pulumi.InvokeOption) (*LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResult, error) {
	var rv LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResult
	err := ctx.Invoke("mongodbatlas:index/getPrivatelinkEndpointServiceDataFederationOnlineArchive:getPrivatelinkEndpointServiceDataFederationOnlineArchive", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPrivatelinkEndpointServiceDataFederationOnlineArchive.
type LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveArgs struct {
	// Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%20Data%20Lake%20supports%20Amazon%20Web%20Services%20private%20endpoints%20using%20the%20AWS%20PrivateLink%20feature).
	EndpointId string `pulumi:"endpointId"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getPrivatelinkEndpointServiceDataFederationOnlineArchive.
type LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResult struct {
	// Human-readable string to associate with this private endpoint.
	Comment    string `pulumi:"comment"`
	EndpointId string `pulumi:"endpointId"`
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	ProjectId string `pulumi:"projectId"`
	// Human-readable label that identifies the cloud service provider.
	ProviderName string `pulumi:"providerName"`
	// Human-readable label that identifies the resource type associated with this private endpoint.
	Type string `pulumi:"type"`
}

func LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveOutput(ctx *pulumi.Context, args LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveOutputArgs, opts ...pulumi.InvokeOption) LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResult, error) {
			args := v.(LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveArgs)
			r, err := LookupPrivatelinkEndpointServiceDataFederationOnlineArchive(ctx, &args, opts...)
			var s LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResultOutput)
}

// A collection of arguments for invoking getPrivatelinkEndpointServiceDataFederationOnlineArchive.
type LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveOutputArgs struct {
	// Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%20Data%20Lake%20supports%20Amazon%20Web%20Services%20private%20endpoints%20using%20the%20AWS%20PrivateLink%20feature).
	EndpointId pulumi.StringInput `pulumi:"endpointId"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveArgs)(nil)).Elem()
}

// A collection of values returned by getPrivatelinkEndpointServiceDataFederationOnlineArchive.
type LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResultOutput struct{ *pulumi.OutputState }

func (LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResult)(nil)).Elem()
}

func (o LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResultOutput) ToLookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResultOutput() LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResultOutput {
	return o
}

func (o LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResultOutput) ToLookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResultOutputWithContext(ctx context.Context) LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResultOutput {
	return o
}

// Human-readable string to associate with this private endpoint.
func (o LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResultOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResult) string { return v.Comment }).(pulumi.StringOutput)
}

func (o LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResultOutput) EndpointId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResult) string { return v.EndpointId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Human-readable label that identifies the cloud service provider.
func (o LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResultOutput) ProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResult) string {
		return v.ProviderName
	}).(pulumi.StringOutput)
}

// Human-readable label that identifies the resource type associated with this private endpoint.
func (o LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPrivatelinkEndpointServiceDataFederationOnlineArchiveResultOutput{})
}
