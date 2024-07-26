// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: NetworkPeering
//
// `NetworkPeering` describes a Network Peering Connection.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
//
// > **NOTE:** If you need to get an existing container ID see the How-To Guide.
//
// ## Example Usage
//
// ### Basic Example (AWS).
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
//			testNetworkPeering, err := mongodbatlas.NewNetworkPeering(ctx, "test", &mongodbatlas.NetworkPeeringArgs{
//				AccepterRegionName:  pulumi.String("us-east-1"),
//				ProjectId:           pulumi.String("<YOUR-PROJEC-ID>"),
//				ContainerId:         pulumi.String("507f1f77bcf86cd799439011"),
//				ProviderName:        pulumi.String("AWS"),
//				RouteTableCidrBlock: pulumi.String("192.168.0.0/24"),
//				VpcId:               pulumi.String("vpc-abc123abc123"),
//				AwsAccountId:        pulumi.String("abc123abc123"),
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupNetworkPeeringOutput(ctx, mongodbatlas.GetNetworkPeeringOutputArgs{
//				ProjectId: testNetworkPeering.ProjectId,
//				PeeringId: testNetworkPeering.ID(),
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupNetworkPeering(ctx *pulumi.Context, args *LookupNetworkPeeringArgs, opts ...pulumi.InvokeOption) (*LookupNetworkPeeringResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNetworkPeeringResult
	err := ctx.Invoke("mongodbatlas:index/getNetworkPeering:getNetworkPeering", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetworkPeering.
type LookupNetworkPeeringArgs struct {
	// Atlas assigned unique ID for the peering connection.
	PeeringId string `pulumi:"peeringId"`
	// The unique ID for the project to create the database user.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getNetworkPeering.
type LookupNetworkPeeringResult struct {
	// Specifies the region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
	AccepterRegionName string `pulumi:"accepterRegionName"`
	AtlasCidrBlock     string `pulumi:"atlasCidrBlock"`
	AtlasId            string `pulumi:"atlasId"`
	// Account ID of the owner of the peer VPC.
	AwsAccountId string `pulumi:"awsAccountId"`
	// Unique identifier for an Azure AD directory.
	AzureDirectoryId string `pulumi:"azureDirectoryId"`
	// Unique identifer of the Azure subscription in which the VNet resides.
	AzureSubscriptionId string `pulumi:"azureSubscriptionId"`
	// Unique identifier for the peering connection.
	ConnectionId string `pulumi:"connectionId"`
	ContainerId  string `pulumi:"containerId"`
	// When `"status" : "FAILED"`, Atlas provides a description of the error.
	ErrorMessage string `pulumi:"errorMessage"`
	// Description of the Atlas error when `status` is `Failed`, Otherwise, Atlas returns `null`.
	ErrorState string `pulumi:"errorState"`
	// Error state, if any. The VPC peering connection error state value can be one of the following: `REJECTED`, `EXPIRED`, `INVALID_ARGUMENT`.
	ErrorStateName string `pulumi:"errorStateName"`
	// GCP project ID of the owner of the network peer.
	GcpProjectId string `pulumi:"gcpProjectId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Name of the network peer to which Atlas connects.
	NetworkName string `pulumi:"networkName"`
	PeeringId   string `pulumi:"peeringId"`
	ProjectId   string `pulumi:"projectId"`
	// Cloud provider for this VPC peering connection. If omitted, Atlas sets this parameter to AWS. (Possible Values `AWS`, `AZURE`, `GCP`).
	ProviderName string `pulumi:"providerName"`
	// Name of your Azure resource group.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// Peer VPC CIDR block or subnet.
	RouteTableCidrBlock string `pulumi:"routeTableCidrBlock"`
	// Status of the Atlas network peering connection: `ADDING_PEER`, `AVAILABLE`, `FAILED`, `DELETING`, `WAITING_FOR_USER`.
	Status string `pulumi:"status"`
	// The VPC peering connection status value can be one of the following: `INITIATING`, `PENDING_ACCEPTANCE`, `FAILED`, `FINALIZING`, `AVAILABLE`, `TERMINATING`.
	StatusName string `pulumi:"statusName"`
	// Name of your Azure VNet.
	VnetName string `pulumi:"vnetName"`
	// Unique identifier of the peer VPC.
	VpcId string `pulumi:"vpcId"`
}

func LookupNetworkPeeringOutput(ctx *pulumi.Context, args LookupNetworkPeeringOutputArgs, opts ...pulumi.InvokeOption) LookupNetworkPeeringResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupNetworkPeeringResult, error) {
			args := v.(LookupNetworkPeeringArgs)
			r, err := LookupNetworkPeering(ctx, &args, opts...)
			var s LookupNetworkPeeringResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupNetworkPeeringResultOutput)
}

// A collection of arguments for invoking getNetworkPeering.
type LookupNetworkPeeringOutputArgs struct {
	// Atlas assigned unique ID for the peering connection.
	PeeringId pulumi.StringInput `pulumi:"peeringId"`
	// The unique ID for the project to create the database user.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupNetworkPeeringOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkPeeringArgs)(nil)).Elem()
}

// A collection of values returned by getNetworkPeering.
type LookupNetworkPeeringResultOutput struct{ *pulumi.OutputState }

func (LookupNetworkPeeringResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkPeeringResult)(nil)).Elem()
}

func (o LookupNetworkPeeringResultOutput) ToLookupNetworkPeeringResultOutput() LookupNetworkPeeringResultOutput {
	return o
}

func (o LookupNetworkPeeringResultOutput) ToLookupNetworkPeeringResultOutputWithContext(ctx context.Context) LookupNetworkPeeringResultOutput {
	return o
}

// Specifies the region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
func (o LookupNetworkPeeringResultOutput) AccepterRegionName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.AccepterRegionName }).(pulumi.StringOutput)
}

func (o LookupNetworkPeeringResultOutput) AtlasCidrBlock() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.AtlasCidrBlock }).(pulumi.StringOutput)
}

func (o LookupNetworkPeeringResultOutput) AtlasId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.AtlasId }).(pulumi.StringOutput)
}

// Account ID of the owner of the peer VPC.
func (o LookupNetworkPeeringResultOutput) AwsAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.AwsAccountId }).(pulumi.StringOutput)
}

// Unique identifier for an Azure AD directory.
func (o LookupNetworkPeeringResultOutput) AzureDirectoryId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.AzureDirectoryId }).(pulumi.StringOutput)
}

// Unique identifer of the Azure subscription in which the VNet resides.
func (o LookupNetworkPeeringResultOutput) AzureSubscriptionId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.AzureSubscriptionId }).(pulumi.StringOutput)
}

// Unique identifier for the peering connection.
func (o LookupNetworkPeeringResultOutput) ConnectionId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.ConnectionId }).(pulumi.StringOutput)
}

func (o LookupNetworkPeeringResultOutput) ContainerId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.ContainerId }).(pulumi.StringOutput)
}

// When `"status" : "FAILED"`, Atlas provides a description of the error.
func (o LookupNetworkPeeringResultOutput) ErrorMessage() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.ErrorMessage }).(pulumi.StringOutput)
}

// Description of the Atlas error when `status` is `Failed`, Otherwise, Atlas returns `null`.
func (o LookupNetworkPeeringResultOutput) ErrorState() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.ErrorState }).(pulumi.StringOutput)
}

// Error state, if any. The VPC peering connection error state value can be one of the following: `REJECTED`, `EXPIRED`, `INVALID_ARGUMENT`.
func (o LookupNetworkPeeringResultOutput) ErrorStateName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.ErrorStateName }).(pulumi.StringOutput)
}

// GCP project ID of the owner of the network peer.
func (o LookupNetworkPeeringResultOutput) GcpProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.GcpProjectId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNetworkPeeringResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.Id }).(pulumi.StringOutput)
}

// Name of the network peer to which Atlas connects.
func (o LookupNetworkPeeringResultOutput) NetworkName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.NetworkName }).(pulumi.StringOutput)
}

func (o LookupNetworkPeeringResultOutput) PeeringId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.PeeringId }).(pulumi.StringOutput)
}

func (o LookupNetworkPeeringResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Cloud provider for this VPC peering connection. If omitted, Atlas sets this parameter to AWS. (Possible Values `AWS`, `AZURE`, `GCP`).
func (o LookupNetworkPeeringResultOutput) ProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.ProviderName }).(pulumi.StringOutput)
}

// Name of your Azure resource group.
func (o LookupNetworkPeeringResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// Peer VPC CIDR block or subnet.
func (o LookupNetworkPeeringResultOutput) RouteTableCidrBlock() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.RouteTableCidrBlock }).(pulumi.StringOutput)
}

// Status of the Atlas network peering connection: `ADDING_PEER`, `AVAILABLE`, `FAILED`, `DELETING`, `WAITING_FOR_USER`.
func (o LookupNetworkPeeringResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.Status }).(pulumi.StringOutput)
}

// The VPC peering connection status value can be one of the following: `INITIATING`, `PENDING_ACCEPTANCE`, `FAILED`, `FINALIZING`, `AVAILABLE`, `TERMINATING`.
func (o LookupNetworkPeeringResultOutput) StatusName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.StatusName }).(pulumi.StringOutput)
}

// Name of your Azure VNet.
func (o LookupNetworkPeeringResultOutput) VnetName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.VnetName }).(pulumi.StringOutput)
}

// Unique identifier of the peer VPC.
func (o LookupNetworkPeeringResultOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.VpcId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNetworkPeeringResultOutput{})
}
