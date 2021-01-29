// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// `PrivateLinkEndpoint` provides a Private Endpoint resource. This represents a Private Endpoint Service that can be created in an Atlas project.
//
// > **IMPORTANT:**You must have one of the following roles to successfully handle the resource:
//   * Organization Owner
//   * Project Owner
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
//
// > **NOTE:** A network container is created for a private endpoint to reside in if one does not yet exist in the project.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-mongodbatlas/sdk/go/mongodbatlas/"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := mongodbatlas.NewPrivateLinkEndpoint(ctx, "test", &mongodbatlas.PrivateLinkEndpointArgs{
// 			ProjectId:    pulumi.String("<PROJECT-ID>"),
// 			ProviderName: pulumi.String("AWS/AZURE"),
// 			Region:       pulumi.String("us-east-1"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Private Endpoint Service can be imported using project ID and username, in the format `{project_id}-{private_link_id}-{provider_name}`, e.g.
//
// ```sh
//  $ pulumi import mongodbatlas:index/privateLinkEndpoint:PrivateLinkEndpoint test 1112222b3bf99403840e8934-3242342343112-AWS
// ```
//
//  See detailed information for arguments and attributes[MongoDB API Private Endpoint Service](https://docs.atlas.mongodb.com/reference/api/private-endpoints-service-create-one//)
type PrivateLinkEndpoint struct {
	pulumi.CustomResourceState

	// Name of the PrivateLink endpoint service in AWS. Returns null while the endpoint service is being created.
	EndpointServiceName pulumi.StringOutput `pulumi:"endpointServiceName"`
	// Error message pertaining to the AWS PrivateLink connection. Returns null if there are no errors.
	ErrorMessage pulumi.StringOutput `pulumi:"errorMessage"`
	// Unique identifiers of the interface endpoints in your VPC that you added to the AWS PrivateLink connection.
	InterfaceEndpoints pulumi.StringArrayOutput `pulumi:"interfaceEndpoints"`
	// All private endpoints that you have added to this Azure Private Link Service.
	PrivateEndpoints pulumi.StringArrayOutput `pulumi:"privateEndpoints"`
	// Unique identifier of the AWS PrivateLink connection.
	PrivateLinkId pulumi.StringOutput `pulumi:"privateLinkId"`
	// Name of the Azure Private Link Service that Atlas manages.
	PrivateLinkServiceName pulumi.StringOutput `pulumi:"privateLinkServiceName"`
	// Resource ID of the Azure Private Link Service that Atlas manages.
	// Returns one of the following values:
	PrivateLinkServiceResourceId pulumi.StringOutput `pulumi:"privateLinkServiceResourceId"`
	// Required 	Unique identifier for the project.
	ProjectId    pulumi.StringOutput `pulumi:"projectId"`
	ProviderName pulumi.StringOutput `pulumi:"providerName"`
	// Cloud provider region in which you want to create the private endpoint connection.
	// Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws) and [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure)
	Region pulumi.StringOutput `pulumi:"region"`
	// Status of the Private Link Service.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewPrivateLinkEndpoint registers a new resource with the given unique name, arguments, and options.
func NewPrivateLinkEndpoint(ctx *pulumi.Context,
	name string, args *PrivateLinkEndpointArgs, opts ...pulumi.ResourceOption) (*PrivateLinkEndpoint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.ProviderName == nil {
		return nil, errors.New("invalid value for required argument 'ProviderName'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	var resource PrivateLinkEndpoint
	err := ctx.RegisterResource("mongodbatlas:index/privateLinkEndpoint:PrivateLinkEndpoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPrivateLinkEndpoint gets an existing PrivateLinkEndpoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPrivateLinkEndpoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PrivateLinkEndpointState, opts ...pulumi.ResourceOption) (*PrivateLinkEndpoint, error) {
	var resource PrivateLinkEndpoint
	err := ctx.ReadResource("mongodbatlas:index/privateLinkEndpoint:PrivateLinkEndpoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PrivateLinkEndpoint resources.
type privateLinkEndpointState struct {
	// Name of the PrivateLink endpoint service in AWS. Returns null while the endpoint service is being created.
	EndpointServiceName *string `pulumi:"endpointServiceName"`
	// Error message pertaining to the AWS PrivateLink connection. Returns null if there are no errors.
	ErrorMessage *string `pulumi:"errorMessage"`
	// Unique identifiers of the interface endpoints in your VPC that you added to the AWS PrivateLink connection.
	InterfaceEndpoints []string `pulumi:"interfaceEndpoints"`
	// All private endpoints that you have added to this Azure Private Link Service.
	PrivateEndpoints []string `pulumi:"privateEndpoints"`
	// Unique identifier of the AWS PrivateLink connection.
	PrivateLinkId *string `pulumi:"privateLinkId"`
	// Name of the Azure Private Link Service that Atlas manages.
	PrivateLinkServiceName *string `pulumi:"privateLinkServiceName"`
	// Resource ID of the Azure Private Link Service that Atlas manages.
	// Returns one of the following values:
	PrivateLinkServiceResourceId *string `pulumi:"privateLinkServiceResourceId"`
	// Required 	Unique identifier for the project.
	ProjectId    *string `pulumi:"projectId"`
	ProviderName *string `pulumi:"providerName"`
	// Cloud provider region in which you want to create the private endpoint connection.
	// Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws) and [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure)
	Region *string `pulumi:"region"`
	// Status of the Private Link Service.
	Status *string `pulumi:"status"`
}

type PrivateLinkEndpointState struct {
	// Name of the PrivateLink endpoint service in AWS. Returns null while the endpoint service is being created.
	EndpointServiceName pulumi.StringPtrInput
	// Error message pertaining to the AWS PrivateLink connection. Returns null if there are no errors.
	ErrorMessage pulumi.StringPtrInput
	// Unique identifiers of the interface endpoints in your VPC that you added to the AWS PrivateLink connection.
	InterfaceEndpoints pulumi.StringArrayInput
	// All private endpoints that you have added to this Azure Private Link Service.
	PrivateEndpoints pulumi.StringArrayInput
	// Unique identifier of the AWS PrivateLink connection.
	PrivateLinkId pulumi.StringPtrInput
	// Name of the Azure Private Link Service that Atlas manages.
	PrivateLinkServiceName pulumi.StringPtrInput
	// Resource ID of the Azure Private Link Service that Atlas manages.
	// Returns one of the following values:
	PrivateLinkServiceResourceId pulumi.StringPtrInput
	// Required 	Unique identifier for the project.
	ProjectId    pulumi.StringPtrInput
	ProviderName pulumi.StringPtrInput
	// Cloud provider region in which you want to create the private endpoint connection.
	// Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws) and [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure)
	Region pulumi.StringPtrInput
	// Status of the Private Link Service.
	Status pulumi.StringPtrInput
}

func (PrivateLinkEndpointState) ElementType() reflect.Type {
	return reflect.TypeOf((*privateLinkEndpointState)(nil)).Elem()
}

type privateLinkEndpointArgs struct {
	// Required 	Unique identifier for the project.
	ProjectId    string `pulumi:"projectId"`
	ProviderName string `pulumi:"providerName"`
	// Cloud provider region in which you want to create the private endpoint connection.
	// Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws) and [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure)
	Region string `pulumi:"region"`
}

// The set of arguments for constructing a PrivateLinkEndpoint resource.
type PrivateLinkEndpointArgs struct {
	// Required 	Unique identifier for the project.
	ProjectId    pulumi.StringInput
	ProviderName pulumi.StringInput
	// Cloud provider region in which you want to create the private endpoint connection.
	// Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws) and [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure)
	Region pulumi.StringInput
}

func (PrivateLinkEndpointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*privateLinkEndpointArgs)(nil)).Elem()
}

type PrivateLinkEndpointInput interface {
	pulumi.Input

	ToPrivateLinkEndpointOutput() PrivateLinkEndpointOutput
	ToPrivateLinkEndpointOutputWithContext(ctx context.Context) PrivateLinkEndpointOutput
}

func (*PrivateLinkEndpoint) ElementType() reflect.Type {
	return reflect.TypeOf((*PrivateLinkEndpoint)(nil))
}

func (i *PrivateLinkEndpoint) ToPrivateLinkEndpointOutput() PrivateLinkEndpointOutput {
	return i.ToPrivateLinkEndpointOutputWithContext(context.Background())
}

func (i *PrivateLinkEndpoint) ToPrivateLinkEndpointOutputWithContext(ctx context.Context) PrivateLinkEndpointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateLinkEndpointOutput)
}

type PrivateLinkEndpointOutput struct {
	*pulumi.OutputState
}

func (PrivateLinkEndpointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*PrivateLinkEndpoint)(nil))
}

func (o PrivateLinkEndpointOutput) ToPrivateLinkEndpointOutput() PrivateLinkEndpointOutput {
	return o
}

func (o PrivateLinkEndpointOutput) ToPrivateLinkEndpointOutputWithContext(ctx context.Context) PrivateLinkEndpointOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(PrivateLinkEndpointOutput{})
}
