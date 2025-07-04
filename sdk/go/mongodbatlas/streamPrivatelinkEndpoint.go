// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Resource: StreamPrivatelinkEndpoint
//
// `StreamPrivatelinkEndpoint` describes a Privatelink Endpoint for Streams.
//
// ## Example Usage
//
// ### S
type StreamPrivatelinkEndpoint struct {
	pulumi.CustomResourceState

	// Amazon Resource Name (ARN). Required for AWS Provider and MSK vendor.
	Arn pulumi.StringPtrOutput `pulumi:"arn"`
	// The domain hostname. Required for the following provider and vendor combinations:\n\n- AWS provider with CONFLUENT vendor.\n\n- AZURE provider with EVENTHUB or CONFLUENT vendor.
	DnsDomain pulumi.StringPtrOutput `pulumi:"dnsDomain"`
	// Sub-Domain name of Confluent cluster. These are typically your availability zones. Required for AWS Provider and CONFLUENT vendor. If your AWS CONFLUENT cluster doesn't use subdomains, you must set this to the empty array [].
	DnsSubDomains pulumi.StringArrayOutput `pulumi:"dnsSubDomains"`
	// Error message if the connection is in a failed state.
	ErrorMessage pulumi.StringOutput `pulumi:"errorMessage"`
	// Interface endpoint ID that is created from the specified service endpoint ID.
	InterfaceEndpointId pulumi.StringOutput `pulumi:"interfaceEndpointId"`
	// Name of interface endpoint that is created from the specified service endpoint ID.
	InterfaceEndpointName pulumi.StringOutput `pulumi:"interfaceEndpointName"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.\n\n**NOTE**: Groups and projects are synonymous terms. Your group id is the same as your project id. For existing groups, your group or project id remains the same. The resource and corresponding endpoints use the term groups.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Account ID from the cloud provider.
	ProviderAccountId pulumi.StringOutput `pulumi:"providerAccountId"`
	// Provider where the Kafka cluster is deployed. Valid values are AWS and AZURE.
	ProviderName pulumi.StringOutput `pulumi:"providerName"`
	// The region of the Provider’s cluster. See [AZURE](https://www.mongodb.com/docs/atlas/reference/microsoft-azure/#stream-processing-instances) and [AWS](https://www.mongodb.com/docs/atlas/reference/amazon-aws/#stream-processing-instances) supported regions. When the vendor is `CONFLUENT`, this is the domain name of Confluent cluster. When the vendor is `MSK`, this is computed by the API from the provided `arn`.
	Region pulumi.StringOutput `pulumi:"region"`
	// For AZURE EVENTHUB, this is the [namespace endpoint ID](https://learn.microsoft.com/en-us/rest/api/eventhub/namespaces/get). For AWS CONFLUENT cluster, this is the [VPC Endpoint service name](https://docs.confluent.io/cloud/current/networking/private-links/aws-privatelink.html).
	ServiceEndpointId pulumi.StringPtrOutput `pulumi:"serviceEndpointId"`
	// Status of the connection.
	State pulumi.StringOutput `pulumi:"state"`
	// Vendor that manages the Kafka cluster. The following are the vendor values per provider:\n\n- MSK and CONFLUENT for the AWS provider.\n\n- EVENTHUB and CONFLUENT for the AZURE provider.
	Vendor pulumi.StringOutput `pulumi:"vendor"`
}

// NewStreamPrivatelinkEndpoint registers a new resource with the given unique name, arguments, and options.
func NewStreamPrivatelinkEndpoint(ctx *pulumi.Context,
	name string, args *StreamPrivatelinkEndpointArgs, opts ...pulumi.ResourceOption) (*StreamPrivatelinkEndpoint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.ProviderName == nil {
		return nil, errors.New("invalid value for required argument 'ProviderName'")
	}
	if args.Vendor == nil {
		return nil, errors.New("invalid value for required argument 'Vendor'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource StreamPrivatelinkEndpoint
	err := ctx.RegisterResource("mongodbatlas:index/streamPrivatelinkEndpoint:StreamPrivatelinkEndpoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStreamPrivatelinkEndpoint gets an existing StreamPrivatelinkEndpoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStreamPrivatelinkEndpoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StreamPrivatelinkEndpointState, opts ...pulumi.ResourceOption) (*StreamPrivatelinkEndpoint, error) {
	var resource StreamPrivatelinkEndpoint
	err := ctx.ReadResource("mongodbatlas:index/streamPrivatelinkEndpoint:StreamPrivatelinkEndpoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StreamPrivatelinkEndpoint resources.
type streamPrivatelinkEndpointState struct {
	// Amazon Resource Name (ARN). Required for AWS Provider and MSK vendor.
	Arn *string `pulumi:"arn"`
	// The domain hostname. Required for the following provider and vendor combinations:\n\n- AWS provider with CONFLUENT vendor.\n\n- AZURE provider with EVENTHUB or CONFLUENT vendor.
	DnsDomain *string `pulumi:"dnsDomain"`
	// Sub-Domain name of Confluent cluster. These are typically your availability zones. Required for AWS Provider and CONFLUENT vendor. If your AWS CONFLUENT cluster doesn't use subdomains, you must set this to the empty array [].
	DnsSubDomains []string `pulumi:"dnsSubDomains"`
	// Error message if the connection is in a failed state.
	ErrorMessage *string `pulumi:"errorMessage"`
	// Interface endpoint ID that is created from the specified service endpoint ID.
	InterfaceEndpointId *string `pulumi:"interfaceEndpointId"`
	// Name of interface endpoint that is created from the specified service endpoint ID.
	InterfaceEndpointName *string `pulumi:"interfaceEndpointName"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.\n\n**NOTE**: Groups and projects are synonymous terms. Your group id is the same as your project id. For existing groups, your group or project id remains the same. The resource and corresponding endpoints use the term groups.
	ProjectId *string `pulumi:"projectId"`
	// Account ID from the cloud provider.
	ProviderAccountId *string `pulumi:"providerAccountId"`
	// Provider where the Kafka cluster is deployed. Valid values are AWS and AZURE.
	ProviderName *string `pulumi:"providerName"`
	// The region of the Provider’s cluster. See [AZURE](https://www.mongodb.com/docs/atlas/reference/microsoft-azure/#stream-processing-instances) and [AWS](https://www.mongodb.com/docs/atlas/reference/amazon-aws/#stream-processing-instances) supported regions. When the vendor is `CONFLUENT`, this is the domain name of Confluent cluster. When the vendor is `MSK`, this is computed by the API from the provided `arn`.
	Region *string `pulumi:"region"`
	// For AZURE EVENTHUB, this is the [namespace endpoint ID](https://learn.microsoft.com/en-us/rest/api/eventhub/namespaces/get). For AWS CONFLUENT cluster, this is the [VPC Endpoint service name](https://docs.confluent.io/cloud/current/networking/private-links/aws-privatelink.html).
	ServiceEndpointId *string `pulumi:"serviceEndpointId"`
	// Status of the connection.
	State *string `pulumi:"state"`
	// Vendor that manages the Kafka cluster. The following are the vendor values per provider:\n\n- MSK and CONFLUENT for the AWS provider.\n\n- EVENTHUB and CONFLUENT for the AZURE provider.
	Vendor *string `pulumi:"vendor"`
}

type StreamPrivatelinkEndpointState struct {
	// Amazon Resource Name (ARN). Required for AWS Provider and MSK vendor.
	Arn pulumi.StringPtrInput
	// The domain hostname. Required for the following provider and vendor combinations:\n\n- AWS provider with CONFLUENT vendor.\n\n- AZURE provider with EVENTHUB or CONFLUENT vendor.
	DnsDomain pulumi.StringPtrInput
	// Sub-Domain name of Confluent cluster. These are typically your availability zones. Required for AWS Provider and CONFLUENT vendor. If your AWS CONFLUENT cluster doesn't use subdomains, you must set this to the empty array [].
	DnsSubDomains pulumi.StringArrayInput
	// Error message if the connection is in a failed state.
	ErrorMessage pulumi.StringPtrInput
	// Interface endpoint ID that is created from the specified service endpoint ID.
	InterfaceEndpointId pulumi.StringPtrInput
	// Name of interface endpoint that is created from the specified service endpoint ID.
	InterfaceEndpointName pulumi.StringPtrInput
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.\n\n**NOTE**: Groups and projects are synonymous terms. Your group id is the same as your project id. For existing groups, your group or project id remains the same. The resource and corresponding endpoints use the term groups.
	ProjectId pulumi.StringPtrInput
	// Account ID from the cloud provider.
	ProviderAccountId pulumi.StringPtrInput
	// Provider where the Kafka cluster is deployed. Valid values are AWS and AZURE.
	ProviderName pulumi.StringPtrInput
	// The region of the Provider’s cluster. See [AZURE](https://www.mongodb.com/docs/atlas/reference/microsoft-azure/#stream-processing-instances) and [AWS](https://www.mongodb.com/docs/atlas/reference/amazon-aws/#stream-processing-instances) supported regions. When the vendor is `CONFLUENT`, this is the domain name of Confluent cluster. When the vendor is `MSK`, this is computed by the API from the provided `arn`.
	Region pulumi.StringPtrInput
	// For AZURE EVENTHUB, this is the [namespace endpoint ID](https://learn.microsoft.com/en-us/rest/api/eventhub/namespaces/get). For AWS CONFLUENT cluster, this is the [VPC Endpoint service name](https://docs.confluent.io/cloud/current/networking/private-links/aws-privatelink.html).
	ServiceEndpointId pulumi.StringPtrInput
	// Status of the connection.
	State pulumi.StringPtrInput
	// Vendor that manages the Kafka cluster. The following are the vendor values per provider:\n\n- MSK and CONFLUENT for the AWS provider.\n\n- EVENTHUB and CONFLUENT for the AZURE provider.
	Vendor pulumi.StringPtrInput
}

func (StreamPrivatelinkEndpointState) ElementType() reflect.Type {
	return reflect.TypeOf((*streamPrivatelinkEndpointState)(nil)).Elem()
}

type streamPrivatelinkEndpointArgs struct {
	// Amazon Resource Name (ARN). Required for AWS Provider and MSK vendor.
	Arn *string `pulumi:"arn"`
	// The domain hostname. Required for the following provider and vendor combinations:\n\n- AWS provider with CONFLUENT vendor.\n\n- AZURE provider with EVENTHUB or CONFLUENT vendor.
	DnsDomain *string `pulumi:"dnsDomain"`
	// Sub-Domain name of Confluent cluster. These are typically your availability zones. Required for AWS Provider and CONFLUENT vendor. If your AWS CONFLUENT cluster doesn't use subdomains, you must set this to the empty array [].
	DnsSubDomains []string `pulumi:"dnsSubDomains"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.\n\n**NOTE**: Groups and projects are synonymous terms. Your group id is the same as your project id. For existing groups, your group or project id remains the same. The resource and corresponding endpoints use the term groups.
	ProjectId string `pulumi:"projectId"`
	// Provider where the Kafka cluster is deployed. Valid values are AWS and AZURE.
	ProviderName string `pulumi:"providerName"`
	// The region of the Provider’s cluster. See [AZURE](https://www.mongodb.com/docs/atlas/reference/microsoft-azure/#stream-processing-instances) and [AWS](https://www.mongodb.com/docs/atlas/reference/amazon-aws/#stream-processing-instances) supported regions. When the vendor is `CONFLUENT`, this is the domain name of Confluent cluster. When the vendor is `MSK`, this is computed by the API from the provided `arn`.
	Region *string `pulumi:"region"`
	// For AZURE EVENTHUB, this is the [namespace endpoint ID](https://learn.microsoft.com/en-us/rest/api/eventhub/namespaces/get). For AWS CONFLUENT cluster, this is the [VPC Endpoint service name](https://docs.confluent.io/cloud/current/networking/private-links/aws-privatelink.html).
	ServiceEndpointId *string `pulumi:"serviceEndpointId"`
	// Vendor that manages the Kafka cluster. The following are the vendor values per provider:\n\n- MSK and CONFLUENT for the AWS provider.\n\n- EVENTHUB and CONFLUENT for the AZURE provider.
	Vendor string `pulumi:"vendor"`
}

// The set of arguments for constructing a StreamPrivatelinkEndpoint resource.
type StreamPrivatelinkEndpointArgs struct {
	// Amazon Resource Name (ARN). Required for AWS Provider and MSK vendor.
	Arn pulumi.StringPtrInput
	// The domain hostname. Required for the following provider and vendor combinations:\n\n- AWS provider with CONFLUENT vendor.\n\n- AZURE provider with EVENTHUB or CONFLUENT vendor.
	DnsDomain pulumi.StringPtrInput
	// Sub-Domain name of Confluent cluster. These are typically your availability zones. Required for AWS Provider and CONFLUENT vendor. If your AWS CONFLUENT cluster doesn't use subdomains, you must set this to the empty array [].
	DnsSubDomains pulumi.StringArrayInput
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.\n\n**NOTE**: Groups and projects are synonymous terms. Your group id is the same as your project id. For existing groups, your group or project id remains the same. The resource and corresponding endpoints use the term groups.
	ProjectId pulumi.StringInput
	// Provider where the Kafka cluster is deployed. Valid values are AWS and AZURE.
	ProviderName pulumi.StringInput
	// The region of the Provider’s cluster. See [AZURE](https://www.mongodb.com/docs/atlas/reference/microsoft-azure/#stream-processing-instances) and [AWS](https://www.mongodb.com/docs/atlas/reference/amazon-aws/#stream-processing-instances) supported regions. When the vendor is `CONFLUENT`, this is the domain name of Confluent cluster. When the vendor is `MSK`, this is computed by the API from the provided `arn`.
	Region pulumi.StringPtrInput
	// For AZURE EVENTHUB, this is the [namespace endpoint ID](https://learn.microsoft.com/en-us/rest/api/eventhub/namespaces/get). For AWS CONFLUENT cluster, this is the [VPC Endpoint service name](https://docs.confluent.io/cloud/current/networking/private-links/aws-privatelink.html).
	ServiceEndpointId pulumi.StringPtrInput
	// Vendor that manages the Kafka cluster. The following are the vendor values per provider:\n\n- MSK and CONFLUENT for the AWS provider.\n\n- EVENTHUB and CONFLUENT for the AZURE provider.
	Vendor pulumi.StringInput
}

func (StreamPrivatelinkEndpointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*streamPrivatelinkEndpointArgs)(nil)).Elem()
}

type StreamPrivatelinkEndpointInput interface {
	pulumi.Input

	ToStreamPrivatelinkEndpointOutput() StreamPrivatelinkEndpointOutput
	ToStreamPrivatelinkEndpointOutputWithContext(ctx context.Context) StreamPrivatelinkEndpointOutput
}

func (*StreamPrivatelinkEndpoint) ElementType() reflect.Type {
	return reflect.TypeOf((**StreamPrivatelinkEndpoint)(nil)).Elem()
}

func (i *StreamPrivatelinkEndpoint) ToStreamPrivatelinkEndpointOutput() StreamPrivatelinkEndpointOutput {
	return i.ToStreamPrivatelinkEndpointOutputWithContext(context.Background())
}

func (i *StreamPrivatelinkEndpoint) ToStreamPrivatelinkEndpointOutputWithContext(ctx context.Context) StreamPrivatelinkEndpointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamPrivatelinkEndpointOutput)
}

// StreamPrivatelinkEndpointArrayInput is an input type that accepts StreamPrivatelinkEndpointArray and StreamPrivatelinkEndpointArrayOutput values.
// You can construct a concrete instance of `StreamPrivatelinkEndpointArrayInput` via:
//
//	StreamPrivatelinkEndpointArray{ StreamPrivatelinkEndpointArgs{...} }
type StreamPrivatelinkEndpointArrayInput interface {
	pulumi.Input

	ToStreamPrivatelinkEndpointArrayOutput() StreamPrivatelinkEndpointArrayOutput
	ToStreamPrivatelinkEndpointArrayOutputWithContext(context.Context) StreamPrivatelinkEndpointArrayOutput
}

type StreamPrivatelinkEndpointArray []StreamPrivatelinkEndpointInput

func (StreamPrivatelinkEndpointArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StreamPrivatelinkEndpoint)(nil)).Elem()
}

func (i StreamPrivatelinkEndpointArray) ToStreamPrivatelinkEndpointArrayOutput() StreamPrivatelinkEndpointArrayOutput {
	return i.ToStreamPrivatelinkEndpointArrayOutputWithContext(context.Background())
}

func (i StreamPrivatelinkEndpointArray) ToStreamPrivatelinkEndpointArrayOutputWithContext(ctx context.Context) StreamPrivatelinkEndpointArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamPrivatelinkEndpointArrayOutput)
}

// StreamPrivatelinkEndpointMapInput is an input type that accepts StreamPrivatelinkEndpointMap and StreamPrivatelinkEndpointMapOutput values.
// You can construct a concrete instance of `StreamPrivatelinkEndpointMapInput` via:
//
//	StreamPrivatelinkEndpointMap{ "key": StreamPrivatelinkEndpointArgs{...} }
type StreamPrivatelinkEndpointMapInput interface {
	pulumi.Input

	ToStreamPrivatelinkEndpointMapOutput() StreamPrivatelinkEndpointMapOutput
	ToStreamPrivatelinkEndpointMapOutputWithContext(context.Context) StreamPrivatelinkEndpointMapOutput
}

type StreamPrivatelinkEndpointMap map[string]StreamPrivatelinkEndpointInput

func (StreamPrivatelinkEndpointMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StreamPrivatelinkEndpoint)(nil)).Elem()
}

func (i StreamPrivatelinkEndpointMap) ToStreamPrivatelinkEndpointMapOutput() StreamPrivatelinkEndpointMapOutput {
	return i.ToStreamPrivatelinkEndpointMapOutputWithContext(context.Background())
}

func (i StreamPrivatelinkEndpointMap) ToStreamPrivatelinkEndpointMapOutputWithContext(ctx context.Context) StreamPrivatelinkEndpointMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamPrivatelinkEndpointMapOutput)
}

type StreamPrivatelinkEndpointOutput struct{ *pulumi.OutputState }

func (StreamPrivatelinkEndpointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StreamPrivatelinkEndpoint)(nil)).Elem()
}

func (o StreamPrivatelinkEndpointOutput) ToStreamPrivatelinkEndpointOutput() StreamPrivatelinkEndpointOutput {
	return o
}

func (o StreamPrivatelinkEndpointOutput) ToStreamPrivatelinkEndpointOutputWithContext(ctx context.Context) StreamPrivatelinkEndpointOutput {
	return o
}

// Amazon Resource Name (ARN). Required for AWS Provider and MSK vendor.
func (o StreamPrivatelinkEndpointOutput) Arn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StreamPrivatelinkEndpoint) pulumi.StringPtrOutput { return v.Arn }).(pulumi.StringPtrOutput)
}

// The domain hostname. Required for the following provider and vendor combinations:\n\n- AWS provider with CONFLUENT vendor.\n\n- AZURE provider with EVENTHUB or CONFLUENT vendor.
func (o StreamPrivatelinkEndpointOutput) DnsDomain() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StreamPrivatelinkEndpoint) pulumi.StringPtrOutput { return v.DnsDomain }).(pulumi.StringPtrOutput)
}

// Sub-Domain name of Confluent cluster. These are typically your availability zones. Required for AWS Provider and CONFLUENT vendor. If your AWS CONFLUENT cluster doesn't use subdomains, you must set this to the empty array [].
func (o StreamPrivatelinkEndpointOutput) DnsSubDomains() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *StreamPrivatelinkEndpoint) pulumi.StringArrayOutput { return v.DnsSubDomains }).(pulumi.StringArrayOutput)
}

// Error message if the connection is in a failed state.
func (o StreamPrivatelinkEndpointOutput) ErrorMessage() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamPrivatelinkEndpoint) pulumi.StringOutput { return v.ErrorMessage }).(pulumi.StringOutput)
}

// Interface endpoint ID that is created from the specified service endpoint ID.
func (o StreamPrivatelinkEndpointOutput) InterfaceEndpointId() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamPrivatelinkEndpoint) pulumi.StringOutput { return v.InterfaceEndpointId }).(pulumi.StringOutput)
}

// Name of interface endpoint that is created from the specified service endpoint ID.
func (o StreamPrivatelinkEndpointOutput) InterfaceEndpointName() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamPrivatelinkEndpoint) pulumi.StringOutput { return v.InterfaceEndpointName }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.\n\n**NOTE**: Groups and projects are synonymous terms. Your group id is the same as your project id. For existing groups, your group or project id remains the same. The resource and corresponding endpoints use the term groups.
func (o StreamPrivatelinkEndpointOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamPrivatelinkEndpoint) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Account ID from the cloud provider.
func (o StreamPrivatelinkEndpointOutput) ProviderAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamPrivatelinkEndpoint) pulumi.StringOutput { return v.ProviderAccountId }).(pulumi.StringOutput)
}

// Provider where the Kafka cluster is deployed. Valid values are AWS and AZURE.
func (o StreamPrivatelinkEndpointOutput) ProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamPrivatelinkEndpoint) pulumi.StringOutput { return v.ProviderName }).(pulumi.StringOutput)
}

// The region of the Provider’s cluster. See [AZURE](https://www.mongodb.com/docs/atlas/reference/microsoft-azure/#stream-processing-instances) and [AWS](https://www.mongodb.com/docs/atlas/reference/amazon-aws/#stream-processing-instances) supported regions. When the vendor is `CONFLUENT`, this is the domain name of Confluent cluster. When the vendor is `MSK`, this is computed by the API from the provided `arn`.
func (o StreamPrivatelinkEndpointOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamPrivatelinkEndpoint) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// For AZURE EVENTHUB, this is the [namespace endpoint ID](https://learn.microsoft.com/en-us/rest/api/eventhub/namespaces/get). For AWS CONFLUENT cluster, this is the [VPC Endpoint service name](https://docs.confluent.io/cloud/current/networking/private-links/aws-privatelink.html).
func (o StreamPrivatelinkEndpointOutput) ServiceEndpointId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StreamPrivatelinkEndpoint) pulumi.StringPtrOutput { return v.ServiceEndpointId }).(pulumi.StringPtrOutput)
}

// Status of the connection.
func (o StreamPrivatelinkEndpointOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamPrivatelinkEndpoint) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// Vendor that manages the Kafka cluster. The following are the vendor values per provider:\n\n- MSK and CONFLUENT for the AWS provider.\n\n- EVENTHUB and CONFLUENT for the AZURE provider.
func (o StreamPrivatelinkEndpointOutput) Vendor() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamPrivatelinkEndpoint) pulumi.StringOutput { return v.Vendor }).(pulumi.StringOutput)
}

type StreamPrivatelinkEndpointArrayOutput struct{ *pulumi.OutputState }

func (StreamPrivatelinkEndpointArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StreamPrivatelinkEndpoint)(nil)).Elem()
}

func (o StreamPrivatelinkEndpointArrayOutput) ToStreamPrivatelinkEndpointArrayOutput() StreamPrivatelinkEndpointArrayOutput {
	return o
}

func (o StreamPrivatelinkEndpointArrayOutput) ToStreamPrivatelinkEndpointArrayOutputWithContext(ctx context.Context) StreamPrivatelinkEndpointArrayOutput {
	return o
}

func (o StreamPrivatelinkEndpointArrayOutput) Index(i pulumi.IntInput) StreamPrivatelinkEndpointOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StreamPrivatelinkEndpoint {
		return vs[0].([]*StreamPrivatelinkEndpoint)[vs[1].(int)]
	}).(StreamPrivatelinkEndpointOutput)
}

type StreamPrivatelinkEndpointMapOutput struct{ *pulumi.OutputState }

func (StreamPrivatelinkEndpointMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StreamPrivatelinkEndpoint)(nil)).Elem()
}

func (o StreamPrivatelinkEndpointMapOutput) ToStreamPrivatelinkEndpointMapOutput() StreamPrivatelinkEndpointMapOutput {
	return o
}

func (o StreamPrivatelinkEndpointMapOutput) ToStreamPrivatelinkEndpointMapOutputWithContext(ctx context.Context) StreamPrivatelinkEndpointMapOutput {
	return o
}

func (o StreamPrivatelinkEndpointMapOutput) MapIndex(k pulumi.StringInput) StreamPrivatelinkEndpointOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StreamPrivatelinkEndpoint {
		return vs[0].(map[string]*StreamPrivatelinkEndpoint)[vs[1].(string)]
	}).(StreamPrivatelinkEndpointOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StreamPrivatelinkEndpointInput)(nil)).Elem(), &StreamPrivatelinkEndpoint{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamPrivatelinkEndpointArrayInput)(nil)).Elem(), StreamPrivatelinkEndpointArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamPrivatelinkEndpointMapInput)(nil)).Elem(), StreamPrivatelinkEndpointMap{})
	pulumi.RegisterOutputType(StreamPrivatelinkEndpointOutput{})
	pulumi.RegisterOutputType(StreamPrivatelinkEndpointArrayOutput{})
	pulumi.RegisterOutputType(StreamPrivatelinkEndpointMapOutput{})
}
