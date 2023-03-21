// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
//			_, err := mongodbatlas.NewAccessListApiKey(ctx, "test", &mongodbatlas.AccessListApiKeyArgs{
//				ApiKeyId:  pulumi.String("a29120e123cd"),
//				CidrBlock: pulumi.String("1.2.3.4/32"),
//				OrgId:     pulumi.String("<ORG-ID>"),
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
//			_, err := mongodbatlas.NewAccessListApiKey(ctx, "test", &mongodbatlas.AccessListApiKeyArgs{
//				ApiKeyId:  pulumi.String("a29120e123cd"),
//				IpAddress: pulumi.String("2.3.4.5"),
//				OrgId:     pulumi.String("<ORG-ID>"),
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
// ## Import
//
// IP Access List entries can be imported using the `org_id` , `api_key_id` and `cidr_block` or `ip_address`, e.g.
//
// ```sh
//
//	$ pulumi import mongodbatlas:index/accessListApiKey:AccessListApiKey test 5d0f1f74cf09a29120e123cd-a29120e123cd-10.242.88.0/21
//
// ```
//
//	For more information see[MongoDB Atlas API Reference.](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Programmatic-API-Keys/operation/createAccessListEntriesForOneOrganizationApiKey)
type AccessListApiKey struct {
	pulumi.CustomResourceState

	// Unique identifier for the Organization API Key for which you want to create a new access list entry.
	ApiKeyId pulumi.StringOutput `pulumi:"apiKeyId"`
	// Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `cidrBlock`, or one `ipAddress`.
	CidrBlock pulumi.StringOutput `pulumi:"cidrBlock"`
	// Single IP address to be added to the access list.
	IpAddress pulumi.StringOutput `pulumi:"ipAddress"`
	// Unique identifier for the organinzation to which you want to add one or more access list entries.
	OrgId pulumi.StringOutput `pulumi:"orgId"`
}

// NewAccessListApiKey registers a new resource with the given unique name, arguments, and options.
func NewAccessListApiKey(ctx *pulumi.Context,
	name string, args *AccessListApiKeyArgs, opts ...pulumi.ResourceOption) (*AccessListApiKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiKeyId == nil {
		return nil, errors.New("invalid value for required argument 'ApiKeyId'")
	}
	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	var resource AccessListApiKey
	err := ctx.RegisterResource("mongodbatlas:index/accessListApiKey:AccessListApiKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessListApiKey gets an existing AccessListApiKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessListApiKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessListApiKeyState, opts ...pulumi.ResourceOption) (*AccessListApiKey, error) {
	var resource AccessListApiKey
	err := ctx.ReadResource("mongodbatlas:index/accessListApiKey:AccessListApiKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessListApiKey resources.
type accessListApiKeyState struct {
	// Unique identifier for the Organization API Key for which you want to create a new access list entry.
	ApiKeyId *string `pulumi:"apiKeyId"`
	// Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `cidrBlock`, or one `ipAddress`.
	CidrBlock *string `pulumi:"cidrBlock"`
	// Single IP address to be added to the access list.
	IpAddress *string `pulumi:"ipAddress"`
	// Unique identifier for the organinzation to which you want to add one or more access list entries.
	OrgId *string `pulumi:"orgId"`
}

type AccessListApiKeyState struct {
	// Unique identifier for the Organization API Key for which you want to create a new access list entry.
	ApiKeyId pulumi.StringPtrInput
	// Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `cidrBlock`, or one `ipAddress`.
	CidrBlock pulumi.StringPtrInput
	// Single IP address to be added to the access list.
	IpAddress pulumi.StringPtrInput
	// Unique identifier for the organinzation to which you want to add one or more access list entries.
	OrgId pulumi.StringPtrInput
}

func (AccessListApiKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessListApiKeyState)(nil)).Elem()
}

type accessListApiKeyArgs struct {
	// Unique identifier for the Organization API Key for which you want to create a new access list entry.
	ApiKeyId string `pulumi:"apiKeyId"`
	// Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `cidrBlock`, or one `ipAddress`.
	CidrBlock *string `pulumi:"cidrBlock"`
	// Single IP address to be added to the access list.
	IpAddress *string `pulumi:"ipAddress"`
	// Unique identifier for the organinzation to which you want to add one or more access list entries.
	OrgId string `pulumi:"orgId"`
}

// The set of arguments for constructing a AccessListApiKey resource.
type AccessListApiKeyArgs struct {
	// Unique identifier for the Organization API Key for which you want to create a new access list entry.
	ApiKeyId pulumi.StringInput
	// Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `cidrBlock`, or one `ipAddress`.
	CidrBlock pulumi.StringPtrInput
	// Single IP address to be added to the access list.
	IpAddress pulumi.StringPtrInput
	// Unique identifier for the organinzation to which you want to add one or more access list entries.
	OrgId pulumi.StringInput
}

func (AccessListApiKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessListApiKeyArgs)(nil)).Elem()
}

type AccessListApiKeyInput interface {
	pulumi.Input

	ToAccessListApiKeyOutput() AccessListApiKeyOutput
	ToAccessListApiKeyOutputWithContext(ctx context.Context) AccessListApiKeyOutput
}

func (*AccessListApiKey) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessListApiKey)(nil)).Elem()
}

func (i *AccessListApiKey) ToAccessListApiKeyOutput() AccessListApiKeyOutput {
	return i.ToAccessListApiKeyOutputWithContext(context.Background())
}

func (i *AccessListApiKey) ToAccessListApiKeyOutputWithContext(ctx context.Context) AccessListApiKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessListApiKeyOutput)
}

// AccessListApiKeyArrayInput is an input type that accepts AccessListApiKeyArray and AccessListApiKeyArrayOutput values.
// You can construct a concrete instance of `AccessListApiKeyArrayInput` via:
//
//	AccessListApiKeyArray{ AccessListApiKeyArgs{...} }
type AccessListApiKeyArrayInput interface {
	pulumi.Input

	ToAccessListApiKeyArrayOutput() AccessListApiKeyArrayOutput
	ToAccessListApiKeyArrayOutputWithContext(context.Context) AccessListApiKeyArrayOutput
}

type AccessListApiKeyArray []AccessListApiKeyInput

func (AccessListApiKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessListApiKey)(nil)).Elem()
}

func (i AccessListApiKeyArray) ToAccessListApiKeyArrayOutput() AccessListApiKeyArrayOutput {
	return i.ToAccessListApiKeyArrayOutputWithContext(context.Background())
}

func (i AccessListApiKeyArray) ToAccessListApiKeyArrayOutputWithContext(ctx context.Context) AccessListApiKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessListApiKeyArrayOutput)
}

// AccessListApiKeyMapInput is an input type that accepts AccessListApiKeyMap and AccessListApiKeyMapOutput values.
// You can construct a concrete instance of `AccessListApiKeyMapInput` via:
//
//	AccessListApiKeyMap{ "key": AccessListApiKeyArgs{...} }
type AccessListApiKeyMapInput interface {
	pulumi.Input

	ToAccessListApiKeyMapOutput() AccessListApiKeyMapOutput
	ToAccessListApiKeyMapOutputWithContext(context.Context) AccessListApiKeyMapOutput
}

type AccessListApiKeyMap map[string]AccessListApiKeyInput

func (AccessListApiKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessListApiKey)(nil)).Elem()
}

func (i AccessListApiKeyMap) ToAccessListApiKeyMapOutput() AccessListApiKeyMapOutput {
	return i.ToAccessListApiKeyMapOutputWithContext(context.Background())
}

func (i AccessListApiKeyMap) ToAccessListApiKeyMapOutputWithContext(ctx context.Context) AccessListApiKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessListApiKeyMapOutput)
}

type AccessListApiKeyOutput struct{ *pulumi.OutputState }

func (AccessListApiKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessListApiKey)(nil)).Elem()
}

func (o AccessListApiKeyOutput) ToAccessListApiKeyOutput() AccessListApiKeyOutput {
	return o
}

func (o AccessListApiKeyOutput) ToAccessListApiKeyOutputWithContext(ctx context.Context) AccessListApiKeyOutput {
	return o
}

// Unique identifier for the Organization API Key for which you want to create a new access list entry.
func (o AccessListApiKeyOutput) ApiKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessListApiKey) pulumi.StringOutput { return v.ApiKeyId }).(pulumi.StringOutput)
}

// Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `cidrBlock`, or one `ipAddress`.
func (o AccessListApiKeyOutput) CidrBlock() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessListApiKey) pulumi.StringOutput { return v.CidrBlock }).(pulumi.StringOutput)
}

// Single IP address to be added to the access list.
func (o AccessListApiKeyOutput) IpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessListApiKey) pulumi.StringOutput { return v.IpAddress }).(pulumi.StringOutput)
}

// Unique identifier for the organinzation to which you want to add one or more access list entries.
func (o AccessListApiKeyOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessListApiKey) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

type AccessListApiKeyArrayOutput struct{ *pulumi.OutputState }

func (AccessListApiKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessListApiKey)(nil)).Elem()
}

func (o AccessListApiKeyArrayOutput) ToAccessListApiKeyArrayOutput() AccessListApiKeyArrayOutput {
	return o
}

func (o AccessListApiKeyArrayOutput) ToAccessListApiKeyArrayOutputWithContext(ctx context.Context) AccessListApiKeyArrayOutput {
	return o
}

func (o AccessListApiKeyArrayOutput) Index(i pulumi.IntInput) AccessListApiKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessListApiKey {
		return vs[0].([]*AccessListApiKey)[vs[1].(int)]
	}).(AccessListApiKeyOutput)
}

type AccessListApiKeyMapOutput struct{ *pulumi.OutputState }

func (AccessListApiKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessListApiKey)(nil)).Elem()
}

func (o AccessListApiKeyMapOutput) ToAccessListApiKeyMapOutput() AccessListApiKeyMapOutput {
	return o
}

func (o AccessListApiKeyMapOutput) ToAccessListApiKeyMapOutputWithContext(ctx context.Context) AccessListApiKeyMapOutput {
	return o
}

func (o AccessListApiKeyMapOutput) MapIndex(k pulumi.StringInput) AccessListApiKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessListApiKey {
		return vs[0].(map[string]*AccessListApiKey)[vs[1].(string)]
	}).(AccessListApiKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessListApiKeyInput)(nil)).Elem(), &AccessListApiKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessListApiKeyArrayInput)(nil)).Elem(), AccessListApiKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessListApiKeyMapInput)(nil)).Elem(), AccessListApiKeyMap{})
	pulumi.RegisterOutputType(AccessListApiKeyOutput{})
	pulumi.RegisterOutputType(AccessListApiKeyArrayOutput{})
	pulumi.RegisterOutputType(AccessListApiKeyMapOutput{})
}