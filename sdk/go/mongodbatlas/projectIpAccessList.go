// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
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
//
//	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := mongodbatlas.NewProjectIpAccessList(ctx, "test", &mongodbatlas.ProjectIpAccessListArgs{
//				CidrBlock: pulumi.String("1.2.3.4/32"),
//				Comment:   pulumi.String("cidr block for tf acc testing"),
//				ProjectId: pulumi.String("<PROJECT-ID>"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Using IP Address
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
//			_, err := mongodbatlas.NewProjectIpAccessList(ctx, "test", &mongodbatlas.ProjectIpAccessListArgs{
//				Comment:   pulumi.String("ip address for tf acc testing"),
//				IpAddress: pulumi.String("2.3.4.5"),
//				ProjectId: pulumi.String("<PROJECT-ID>"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Using an AWS Security Group
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
//			testNetworkContainer, err := mongodbatlas.NewNetworkContainer(ctx, "testNetworkContainer", &mongodbatlas.NetworkContainerArgs{
//				ProjectId:      pulumi.String("<PROJECT-ID>"),
//				AtlasCidrBlock: pulumi.String("192.168.208.0/21"),
//				ProviderName:   pulumi.String("AWS"),
//				RegionName:     pulumi.String("US_EAST_1"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.NewNetworkPeering(ctx, "testNetworkPeering", &mongodbatlas.NetworkPeeringArgs{
//				ProjectId:           pulumi.String("<PROJECT-ID>"),
//				ContainerId:         testNetworkContainer.ContainerId,
//				AccepterRegionName:  pulumi.String("us-east-1"),
//				ProviderName:        pulumi.String("AWS"),
//				RouteTableCidrBlock: pulumi.String("172.31.0.0/16"),
//				VpcId:               pulumi.String("vpc-0d93d6f69f1578bd8"),
//				AwsAccountId:        pulumi.String("232589400519"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.NewProjectIpAccessList(ctx, "testProjectIpAccessList", &mongodbatlas.ProjectIpAccessListArgs{
//				ProjectId:        pulumi.String("<PROJECT-ID>"),
//				AwsSecurityGroup: pulumi.String("sg-0026348ec11780bd1"),
//				Comment:          pulumi.String("TestAcc for awsSecurityGroup"),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				pulumi.Resource("mongodbatlas_network_peering.test"),
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// > **IMPORTANT:** In order to use AWS Security Group(s) VPC Peering must be enabled like above example.
//
// ## Import
//
// IP Access List entries can be imported using the `project_id` and `cidr_block` or `ip_address`, e.g.
//
// ```sh
//
//	$ pulumi import mongodbatlas:index/projectIpAccessList:ProjectIpAccessList test 5d0f1f74cf09a29120e123cd-10.242.88.0/21
//
// ```
//
//	For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/access-lists/)
type ProjectIpAccessList struct {
	pulumi.CustomResourceState

	// Unique identifier of the AWS security group to add to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
	AwsSecurityGroup pulumi.StringOutput `pulumi:"awsSecurityGroup"`
	// Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
	CidrBlock pulumi.StringOutput `pulumi:"cidrBlock"`
	// Comment to add to the access list entry.
	//
	// > **NOTE:** One of the following attributes must set:  `awsSecurityGroup`, `cidrBlock`  or `ipAddress`.
	Comment pulumi.StringOutput `pulumi:"comment"`
	// Single IP address to be added to the access list. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
	IpAddress pulumi.StringOutput `pulumi:"ipAddress"`
	// Unique identifier for the project to which you want to add one or more access list entries.
	ProjectId pulumi.StringOutput                  `pulumi:"projectId"`
	Timeouts  ProjectIpAccessListTimeoutsPtrOutput `pulumi:"timeouts"`
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
	opts = internal.PkgResourceDefaultOpts(opts)
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
	//
	// > **NOTE:** One of the following attributes must set:  `awsSecurityGroup`, `cidrBlock`  or `ipAddress`.
	Comment *string `pulumi:"comment"`
	// Single IP address to be added to the access list. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
	IpAddress *string `pulumi:"ipAddress"`
	// Unique identifier for the project to which you want to add one or more access list entries.
	ProjectId *string                      `pulumi:"projectId"`
	Timeouts  *ProjectIpAccessListTimeouts `pulumi:"timeouts"`
}

type ProjectIpAccessListState struct {
	// Unique identifier of the AWS security group to add to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
	AwsSecurityGroup pulumi.StringPtrInput
	// Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
	CidrBlock pulumi.StringPtrInput
	// Comment to add to the access list entry.
	//
	// > **NOTE:** One of the following attributes must set:  `awsSecurityGroup`, `cidrBlock`  or `ipAddress`.
	Comment pulumi.StringPtrInput
	// Single IP address to be added to the access list. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
	IpAddress pulumi.StringPtrInput
	// Unique identifier for the project to which you want to add one or more access list entries.
	ProjectId pulumi.StringPtrInput
	Timeouts  ProjectIpAccessListTimeoutsPtrInput
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
	//
	// > **NOTE:** One of the following attributes must set:  `awsSecurityGroup`, `cidrBlock`  or `ipAddress`.
	Comment *string `pulumi:"comment"`
	// Single IP address to be added to the access list. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
	IpAddress *string `pulumi:"ipAddress"`
	// Unique identifier for the project to which you want to add one or more access list entries.
	ProjectId string                       `pulumi:"projectId"`
	Timeouts  *ProjectIpAccessListTimeouts `pulumi:"timeouts"`
}

// The set of arguments for constructing a ProjectIpAccessList resource.
type ProjectIpAccessListArgs struct {
	// Unique identifier of the AWS security group to add to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
	AwsSecurityGroup pulumi.StringPtrInput
	// Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
	CidrBlock pulumi.StringPtrInput
	// Comment to add to the access list entry.
	//
	// > **NOTE:** One of the following attributes must set:  `awsSecurityGroup`, `cidrBlock`  or `ipAddress`.
	Comment pulumi.StringPtrInput
	// Single IP address to be added to the access list. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
	IpAddress pulumi.StringPtrInput
	// Unique identifier for the project to which you want to add one or more access list entries.
	ProjectId pulumi.StringInput
	Timeouts  ProjectIpAccessListTimeoutsPtrInput
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
	return reflect.TypeOf((**ProjectIpAccessList)(nil)).Elem()
}

func (i *ProjectIpAccessList) ToProjectIpAccessListOutput() ProjectIpAccessListOutput {
	return i.ToProjectIpAccessListOutputWithContext(context.Background())
}

func (i *ProjectIpAccessList) ToProjectIpAccessListOutputWithContext(ctx context.Context) ProjectIpAccessListOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectIpAccessListOutput)
}

// ProjectIpAccessListArrayInput is an input type that accepts ProjectIpAccessListArray and ProjectIpAccessListArrayOutput values.
// You can construct a concrete instance of `ProjectIpAccessListArrayInput` via:
//
//	ProjectIpAccessListArray{ ProjectIpAccessListArgs{...} }
type ProjectIpAccessListArrayInput interface {
	pulumi.Input

	ToProjectIpAccessListArrayOutput() ProjectIpAccessListArrayOutput
	ToProjectIpAccessListArrayOutputWithContext(context.Context) ProjectIpAccessListArrayOutput
}

type ProjectIpAccessListArray []ProjectIpAccessListInput

func (ProjectIpAccessListArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectIpAccessList)(nil)).Elem()
}

func (i ProjectIpAccessListArray) ToProjectIpAccessListArrayOutput() ProjectIpAccessListArrayOutput {
	return i.ToProjectIpAccessListArrayOutputWithContext(context.Background())
}

func (i ProjectIpAccessListArray) ToProjectIpAccessListArrayOutputWithContext(ctx context.Context) ProjectIpAccessListArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectIpAccessListArrayOutput)
}

// ProjectIpAccessListMapInput is an input type that accepts ProjectIpAccessListMap and ProjectIpAccessListMapOutput values.
// You can construct a concrete instance of `ProjectIpAccessListMapInput` via:
//
//	ProjectIpAccessListMap{ "key": ProjectIpAccessListArgs{...} }
type ProjectIpAccessListMapInput interface {
	pulumi.Input

	ToProjectIpAccessListMapOutput() ProjectIpAccessListMapOutput
	ToProjectIpAccessListMapOutputWithContext(context.Context) ProjectIpAccessListMapOutput
}

type ProjectIpAccessListMap map[string]ProjectIpAccessListInput

func (ProjectIpAccessListMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectIpAccessList)(nil)).Elem()
}

func (i ProjectIpAccessListMap) ToProjectIpAccessListMapOutput() ProjectIpAccessListMapOutput {
	return i.ToProjectIpAccessListMapOutputWithContext(context.Background())
}

func (i ProjectIpAccessListMap) ToProjectIpAccessListMapOutputWithContext(ctx context.Context) ProjectIpAccessListMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectIpAccessListMapOutput)
}

type ProjectIpAccessListOutput struct{ *pulumi.OutputState }

func (ProjectIpAccessListOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectIpAccessList)(nil)).Elem()
}

func (o ProjectIpAccessListOutput) ToProjectIpAccessListOutput() ProjectIpAccessListOutput {
	return o
}

func (o ProjectIpAccessListOutput) ToProjectIpAccessListOutputWithContext(ctx context.Context) ProjectIpAccessListOutput {
	return o
}

// Unique identifier of the AWS security group to add to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
func (o ProjectIpAccessListOutput) AwsSecurityGroup() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectIpAccessList) pulumi.StringOutput { return v.AwsSecurityGroup }).(pulumi.StringOutput)
}

// Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
func (o ProjectIpAccessListOutput) CidrBlock() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectIpAccessList) pulumi.StringOutput { return v.CidrBlock }).(pulumi.StringOutput)
}

// Comment to add to the access list entry.
//
// > **NOTE:** One of the following attributes must set:  `awsSecurityGroup`, `cidrBlock`  or `ipAddress`.
func (o ProjectIpAccessListOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectIpAccessList) pulumi.StringOutput { return v.Comment }).(pulumi.StringOutput)
}

// Single IP address to be added to the access list. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
func (o ProjectIpAccessListOutput) IpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectIpAccessList) pulumi.StringOutput { return v.IpAddress }).(pulumi.StringOutput)
}

// Unique identifier for the project to which you want to add one or more access list entries.
func (o ProjectIpAccessListOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectIpAccessList) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

func (o ProjectIpAccessListOutput) Timeouts() ProjectIpAccessListTimeoutsPtrOutput {
	return o.ApplyT(func(v *ProjectIpAccessList) ProjectIpAccessListTimeoutsPtrOutput { return v.Timeouts }).(ProjectIpAccessListTimeoutsPtrOutput)
}

type ProjectIpAccessListArrayOutput struct{ *pulumi.OutputState }

func (ProjectIpAccessListArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectIpAccessList)(nil)).Elem()
}

func (o ProjectIpAccessListArrayOutput) ToProjectIpAccessListArrayOutput() ProjectIpAccessListArrayOutput {
	return o
}

func (o ProjectIpAccessListArrayOutput) ToProjectIpAccessListArrayOutputWithContext(ctx context.Context) ProjectIpAccessListArrayOutput {
	return o
}

func (o ProjectIpAccessListArrayOutput) Index(i pulumi.IntInput) ProjectIpAccessListOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProjectIpAccessList {
		return vs[0].([]*ProjectIpAccessList)[vs[1].(int)]
	}).(ProjectIpAccessListOutput)
}

type ProjectIpAccessListMapOutput struct{ *pulumi.OutputState }

func (ProjectIpAccessListMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectIpAccessList)(nil)).Elem()
}

func (o ProjectIpAccessListMapOutput) ToProjectIpAccessListMapOutput() ProjectIpAccessListMapOutput {
	return o
}

func (o ProjectIpAccessListMapOutput) ToProjectIpAccessListMapOutputWithContext(ctx context.Context) ProjectIpAccessListMapOutput {
	return o
}

func (o ProjectIpAccessListMapOutput) MapIndex(k pulumi.StringInput) ProjectIpAccessListOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProjectIpAccessList {
		return vs[0].(map[string]*ProjectIpAccessList)[vs[1].(string)]
	}).(ProjectIpAccessListOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectIpAccessListInput)(nil)).Elem(), &ProjectIpAccessList{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectIpAccessListArrayInput)(nil)).Elem(), ProjectIpAccessListArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectIpAccessListMapInput)(nil)).Elem(), ProjectIpAccessListMap{})
	pulumi.RegisterOutputType(ProjectIpAccessListOutput{})
	pulumi.RegisterOutputType(ProjectIpAccessListArrayOutput{})
	pulumi.RegisterOutputType(ProjectIpAccessListMapOutput{})
}
