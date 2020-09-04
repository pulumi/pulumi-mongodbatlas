// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// `PrivateEndpoint` provides a Private Endpoint resource. This represents a Private Endpoint Connection that can be created in an Atlas project.
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
// 	"github.com/pulumi/pulumi-mongodbatlas/sdk/go/mongodbatlas"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := mongodbatlas.NewPrivateEndpoint(ctx, "test", &mongodbatlas.PrivateEndpointArgs{
// 			ProjectId:    pulumi.String("<PROJECT-ID>"),
// 			ProviderName: pulumi.String("AWS"),
// 			Region:       pulumi.String("us-east-1"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type PrivateEndpoint struct {
	pulumi.CustomResourceState

	// Name of the PrivateLink endpoint service in AWS. Returns null while the endpoint service is being created.
	EndpointServiceName pulumi.StringOutput `pulumi:"endpointServiceName"`
	// Error message pertaining to the AWS PrivateLink connection. Returns null if there are no errors.
	ErrorMessage pulumi.StringOutput `pulumi:"errorMessage"`
	// Unique identifiers of the interface endpoints in your VPC that you added to the AWS PrivateLink connection.
	InterfaceEndpoints pulumi.StringArrayOutput `pulumi:"interfaceEndpoints"`
	// Unique identifier of the AWS PrivateLink connection.
	PrivateLinkId pulumi.StringOutput `pulumi:"privateLinkId"`
	// Required 	Unique identifier for the project.
	ProjectId    pulumi.StringOutput `pulumi:"projectId"`
	ProviderName pulumi.StringOutput `pulumi:"providerName"`
	// Cloud provider region in which you want to create the private endpoint connection.
	// Accepted values are:
	// * `us-east-1`
	// * `us-east-2`
	// * `us-west-1`
	// * `us-west-2`
	// * `ca-central-1`
	// * `sa-east-1`
	// * `eu-north-1`
	// * `eu-west-1`
	// * `eu-west-2`
	// * `eu-west-3`
	// * `eu-central-1`
	// * `me-south-1`
	// * `ap-northeast-1`
	// * `ap-northeast-2`
	// * `ap-south-1`
	// * `ap-southeast-1`
	// * `ap-southeast-2`
	// * `ap-east-1`
	Region pulumi.StringOutput `pulumi:"region"`
	// Status of the AWS PrivateLink connection.
	// Returns one of the following values:
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewPrivateEndpoint registers a new resource with the given unique name, arguments, and options.
func NewPrivateEndpoint(ctx *pulumi.Context,
	name string, args *PrivateEndpointArgs, opts ...pulumi.ResourceOption) (*PrivateEndpoint, error) {
	if args == nil || args.ProjectId == nil {
		return nil, errors.New("missing required argument 'ProjectId'")
	}
	if args == nil || args.ProviderName == nil {
		return nil, errors.New("missing required argument 'ProviderName'")
	}
	if args == nil || args.Region == nil {
		return nil, errors.New("missing required argument 'Region'")
	}
	if args == nil {
		args = &PrivateEndpointArgs{}
	}
	var resource PrivateEndpoint
	err := ctx.RegisterResource("mongodbatlas:index/privateEndpoint:PrivateEndpoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPrivateEndpoint gets an existing PrivateEndpoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPrivateEndpoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PrivateEndpointState, opts ...pulumi.ResourceOption) (*PrivateEndpoint, error) {
	var resource PrivateEndpoint
	err := ctx.ReadResource("mongodbatlas:index/privateEndpoint:PrivateEndpoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PrivateEndpoint resources.
type privateEndpointState struct {
	// Name of the PrivateLink endpoint service in AWS. Returns null while the endpoint service is being created.
	EndpointServiceName *string `pulumi:"endpointServiceName"`
	// Error message pertaining to the AWS PrivateLink connection. Returns null if there are no errors.
	ErrorMessage *string `pulumi:"errorMessage"`
	// Unique identifiers of the interface endpoints in your VPC that you added to the AWS PrivateLink connection.
	InterfaceEndpoints []string `pulumi:"interfaceEndpoints"`
	// Unique identifier of the AWS PrivateLink connection.
	PrivateLinkId *string `pulumi:"privateLinkId"`
	// Required 	Unique identifier for the project.
	ProjectId    *string `pulumi:"projectId"`
	ProviderName *string `pulumi:"providerName"`
	// Cloud provider region in which you want to create the private endpoint connection.
	// Accepted values are:
	// * `us-east-1`
	// * `us-east-2`
	// * `us-west-1`
	// * `us-west-2`
	// * `ca-central-1`
	// * `sa-east-1`
	// * `eu-north-1`
	// * `eu-west-1`
	// * `eu-west-2`
	// * `eu-west-3`
	// * `eu-central-1`
	// * `me-south-1`
	// * `ap-northeast-1`
	// * `ap-northeast-2`
	// * `ap-south-1`
	// * `ap-southeast-1`
	// * `ap-southeast-2`
	// * `ap-east-1`
	Region *string `pulumi:"region"`
	// Status of the AWS PrivateLink connection.
	// Returns one of the following values:
	Status *string `pulumi:"status"`
}

type PrivateEndpointState struct {
	// Name of the PrivateLink endpoint service in AWS. Returns null while the endpoint service is being created.
	EndpointServiceName pulumi.StringPtrInput
	// Error message pertaining to the AWS PrivateLink connection. Returns null if there are no errors.
	ErrorMessage pulumi.StringPtrInput
	// Unique identifiers of the interface endpoints in your VPC that you added to the AWS PrivateLink connection.
	InterfaceEndpoints pulumi.StringArrayInput
	// Unique identifier of the AWS PrivateLink connection.
	PrivateLinkId pulumi.StringPtrInput
	// Required 	Unique identifier for the project.
	ProjectId    pulumi.StringPtrInput
	ProviderName pulumi.StringPtrInput
	// Cloud provider region in which you want to create the private endpoint connection.
	// Accepted values are:
	// * `us-east-1`
	// * `us-east-2`
	// * `us-west-1`
	// * `us-west-2`
	// * `ca-central-1`
	// * `sa-east-1`
	// * `eu-north-1`
	// * `eu-west-1`
	// * `eu-west-2`
	// * `eu-west-3`
	// * `eu-central-1`
	// * `me-south-1`
	// * `ap-northeast-1`
	// * `ap-northeast-2`
	// * `ap-south-1`
	// * `ap-southeast-1`
	// * `ap-southeast-2`
	// * `ap-east-1`
	Region pulumi.StringPtrInput
	// Status of the AWS PrivateLink connection.
	// Returns one of the following values:
	Status pulumi.StringPtrInput
}

func (PrivateEndpointState) ElementType() reflect.Type {
	return reflect.TypeOf((*privateEndpointState)(nil)).Elem()
}

type privateEndpointArgs struct {
	// Required 	Unique identifier for the project.
	ProjectId    string `pulumi:"projectId"`
	ProviderName string `pulumi:"providerName"`
	// Cloud provider region in which you want to create the private endpoint connection.
	// Accepted values are:
	// * `us-east-1`
	// * `us-east-2`
	// * `us-west-1`
	// * `us-west-2`
	// * `ca-central-1`
	// * `sa-east-1`
	// * `eu-north-1`
	// * `eu-west-1`
	// * `eu-west-2`
	// * `eu-west-3`
	// * `eu-central-1`
	// * `me-south-1`
	// * `ap-northeast-1`
	// * `ap-northeast-2`
	// * `ap-south-1`
	// * `ap-southeast-1`
	// * `ap-southeast-2`
	// * `ap-east-1`
	Region string `pulumi:"region"`
}

// The set of arguments for constructing a PrivateEndpoint resource.
type PrivateEndpointArgs struct {
	// Required 	Unique identifier for the project.
	ProjectId    pulumi.StringInput
	ProviderName pulumi.StringInput
	// Cloud provider region in which you want to create the private endpoint connection.
	// Accepted values are:
	// * `us-east-1`
	// * `us-east-2`
	// * `us-west-1`
	// * `us-west-2`
	// * `ca-central-1`
	// * `sa-east-1`
	// * `eu-north-1`
	// * `eu-west-1`
	// * `eu-west-2`
	// * `eu-west-3`
	// * `eu-central-1`
	// * `me-south-1`
	// * `ap-northeast-1`
	// * `ap-northeast-2`
	// * `ap-south-1`
	// * `ap-southeast-1`
	// * `ap-southeast-2`
	// * `ap-east-1`
	Region pulumi.StringInput
}

func (PrivateEndpointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*privateEndpointArgs)(nil)).Elem()
}
