// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// `ProjectIpAccessList` provides an IP Access List entry resource. The access list grants access from IPs, CIDRs or AWS Security Groups (if VPC Peering is enabled) to clusters within the Project.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
//
// > **IMPORTANT:**
// When you remove an entry from the access list, existing connections from the removed address(es) may remain open for a variable amount of time. How much time passes before Atlas closes the connection depends on several factors, including how the connection was established, the particular behavior of the application or driver using the address, and the connection protocol (e.g., TCP or UDP). This is particularly important to consider when changing an existing IP address or CIDR block as they cannot be updated via the Provider (comments can however), hence a change will force the destruction and recreation of entries.
//
// ## Example Usage
// ### Using CIDR Block
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
// 		_, err := mongodbatlas.NewProjectIpAccessList(ctx, "test", &mongodbatlas.ProjectIpAccessListArgs{
// 			CidrBlock: pulumi.String("1.2.3.4/32"),
// 			Comment:   pulumi.String("cidr block for tf acc testing"),
// 			ProjectId: pulumi.String("<PROJECT-ID>"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Using IP Address
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
// 		_, err := mongodbatlas.NewProjectIpAccessList(ctx, "test", &mongodbatlas.ProjectIpAccessListArgs{
// 			Comment:   pulumi.String("ip address for tf acc testing"),
// 			IpAddress: pulumi.String("2.3.4.5"),
// 			ProjectId: pulumi.String("<PROJECT-ID>"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Using an AWS Security Group
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
// 		testNetworkContainer, err := mongodbatlas.NewNetworkContainer(ctx, "testNetworkContainer", &mongodbatlas.NetworkContainerArgs{
// 			ProjectId:      pulumi.String("<PROJECT-ID>"),
// 			AtlasCidrBlock: pulumi.String("192.168.208.0/21"),
// 			ProviderName:   pulumi.String("AWS"),
// 			RegionName:     pulumi.String("US_EAST_1"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = mongodbatlas.NewNetworkPeering(ctx, "testNetworkPeering", &mongodbatlas.NetworkPeeringArgs{
// 			ProjectId:           pulumi.String("<PROJECT-ID>"),
// 			ContainerId:         testNetworkContainer.ContainerId,
// 			AccepterRegionName:  pulumi.String("us-east-1"),
// 			ProviderName:        pulumi.String("AWS"),
// 			RouteTableCidrBlock: pulumi.String("172.31.0.0/16"),
// 			VpcId:               pulumi.String("vpc-0d93d6f69f1578bd8"),
// 			AwsAccountId:        pulumi.String("232589400519"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = mongodbatlas.NewProjectIpAccessList(ctx, "testProjectIpAccessList", &mongodbatlas.ProjectIpAccessListArgs{
// 			ProjectId:        pulumi.String("<PROJECT-ID>"),
// 			AwsSecurityGroup: pulumi.String("sg-0026348ec11780bd1"),
// 			Comment:          pulumi.String("TestAcc for awsSecurityGroup"),
// 		}, pulumi.DependsOn([]pulumi.Resource{
// 			"mongodbatlas_network_peering.test",
// 		}))
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// > **IMPORTANT:** In order to use AWS Security Group(s) VPC Peering must be enabled like above example.
//
// ## Import
//
// IP Access List entries can be imported using the `project_id` and `cidr_block` or `ip_address`, e.g.
//
// ```sh
//  $ pulumi import mongodbatlas:index/projectIpAccessList:ProjectIpAccessList test 5d0f1f74cf09a29120e123cd-10.242.88.0/21
// ```
//
//  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/access-lists/)
type ProjectIpAccessList struct {
	pulumi.CustomResourceState

	// Unique identifier of the AWS security group to add to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
	AwsSecurityGroup pulumi.StringOutput `pulumi:"awsSecurityGroup"`
	// Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
	CidrBlock pulumi.StringOutput `pulumi:"cidrBlock"`
	// Comment to add to the access list entry.
	Comment pulumi.StringOutput `pulumi:"comment"`
	// Single IP address to be added to the access list. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
	IpAddress pulumi.StringOutput `pulumi:"ipAddress"`
	// Unique identifier for the project to which you want to add one or more access list entries.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
}

// NewProjectIpAccessList registers a new resource with the given unique name, arguments, and options.
func NewProjectIpAccessList(ctx *pulumi.Context,
	name string, args *ProjectIpAccessListArgs, opts ...pulumi.ResourceOption) (*ProjectIpAccessList, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	var resource ProjectIpAccessList
	err := ctx.RegisterResource("mongodbatlas:index/projectIpAccessList:ProjectIpAccessList", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectIpAccessList gets an existing ProjectIpAccessList resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectIpAccessList(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectIpAccessListState, opts ...pulumi.ResourceOption) (*ProjectIpAccessList, error) {
	var resource ProjectIpAccessList
	err := ctx.ReadResource("mongodbatlas:index/projectIpAccessList:ProjectIpAccessList", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectIpAccessList resources.
type projectIpAccessListState struct {
	// Unique identifier of the AWS security group to add to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
	AwsSecurityGroup *string `pulumi:"awsSecurityGroup"`
	// Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
	CidrBlock *string `pulumi:"cidrBlock"`
	// Comment to add to the access list entry.
	Comment *string `pulumi:"comment"`
	// Single IP address to be added to the access list. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
	IpAddress *string `pulumi:"ipAddress"`
	// Unique identifier for the project to which you want to add one or more access list entries.
	ProjectId *string `pulumi:"projectId"`
}

type ProjectIpAccessListState struct {
	// Unique identifier of the AWS security group to add to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
	AwsSecurityGroup pulumi.StringPtrInput
	// Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
	CidrBlock pulumi.StringPtrInput
	// Comment to add to the access list entry.
	Comment pulumi.StringPtrInput
	// Single IP address to be added to the access list. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
	IpAddress pulumi.StringPtrInput
	// Unique identifier for the project to which you want to add one or more access list entries.
	ProjectId pulumi.StringPtrInput
}

func (ProjectIpAccessListState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectIpAccessListState)(nil)).Elem()
}

type projectIpAccessListArgs struct {
	// Unique identifier of the AWS security group to add to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
	AwsSecurityGroup *string `pulumi:"awsSecurityGroup"`
	// Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
	CidrBlock *string `pulumi:"cidrBlock"`
	// Comment to add to the access list entry.
	Comment *string `pulumi:"comment"`
	// Single IP address to be added to the access list. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
	IpAddress *string `pulumi:"ipAddress"`
	// Unique identifier for the project to which you want to add one or more access list entries.
	ProjectId string `pulumi:"projectId"`
}

// The set of arguments for constructing a ProjectIpAccessList resource.
type ProjectIpAccessListArgs struct {
	// Unique identifier of the AWS security group to add to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
	AwsSecurityGroup pulumi.StringPtrInput
	// Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
	CidrBlock pulumi.StringPtrInput
	// Comment to add to the access list entry.
	Comment pulumi.StringPtrInput
	// Single IP address to be added to the access list. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
	IpAddress pulumi.StringPtrInput
	// Unique identifier for the project to which you want to add one or more access list entries.
	ProjectId pulumi.StringInput
}

func (ProjectIpAccessListArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectIpAccessListArgs)(nil)).Elem()
}

type ProjectIpAccessListInput interface {
	pulumi.Input

	ToProjectIpAccessListOutput() ProjectIpAccessListOutput
	ToProjectIpAccessListOutputWithContext(ctx context.Context) ProjectIpAccessListOutput
}

func (*ProjectIpAccessList) ElementType() reflect.Type {
	return reflect.TypeOf((*ProjectIpAccessList)(nil))
}

func (i *ProjectIpAccessList) ToProjectIpAccessListOutput() ProjectIpAccessListOutput {
	return i.ToProjectIpAccessListOutputWithContext(context.Background())
}

func (i *ProjectIpAccessList) ToProjectIpAccessListOutputWithContext(ctx context.Context) ProjectIpAccessListOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectIpAccessListOutput)
}

type ProjectIpAccessListOutput struct {
	*pulumi.OutputState
}

func (ProjectIpAccessListOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProjectIpAccessList)(nil))
}

func (o ProjectIpAccessListOutput) ToProjectIpAccessListOutput() ProjectIpAccessListOutput {
	return o
}

func (o ProjectIpAccessListOutput) ToProjectIpAccessListOutputWithContext(ctx context.Context) ProjectIpAccessListOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ProjectIpAccessListOutput{})
}