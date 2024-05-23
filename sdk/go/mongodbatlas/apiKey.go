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

// ## Example Usage
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
//			_, err := mongodbatlas.NewApiKey(ctx, "test", &mongodbatlas.ApiKeyArgs{
//				Description: pulumi.String("key-name"),
//				OrgId:       pulumi.String("<ORG_ID>"),
//				RoleNames: pulumi.StringArray{
//					pulumi.String("ORG_READ_ONLY"),
//				},
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
// API Keys must be imported using org ID, API Key ID e.g.
//
// ```sh
// $ pulumi import mongodbatlas:index/apiKey:ApiKey test 5d09d6a59ccf6445652a444a-6576974933969669
// ```
// See [MongoDB Atlas API - API Key](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Programmatic-API-Keys/operation/createApiKey) Documentation for more information.
type ApiKey struct {
	pulumi.CustomResourceState

	// Unique identifier for this Organization API key.
	ApiKeyId pulumi.StringOutput `pulumi:"apiKeyId"`
	// Description of this Organization API key.
	Description pulumi.StringOutput `pulumi:"description"`
	// Unique identifier for the organization whose API keys you want to retrieve. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
	OrgId      pulumi.StringOutput `pulumi:"orgId"`
	PrivateKey pulumi.StringOutput `pulumi:"privateKey"`
	PublicKey  pulumi.StringOutput `pulumi:"publicKey"`
	// Name of the role. This resource returns all the roles the user has in Atlas.
	// The following are valid roles:
	// * `ORG_OWNER`
	// * `ORG_GROUP_CREATOR`
	// * `ORG_BILLING_ADMIN`
	// * `ORG_READ_ONLY`
	// * `ORG_MEMBER`
	//
	// ## Attributes Reference
	//
	// In addition to all arguments above, the following attributes are exported:
	RoleNames pulumi.StringArrayOutput `pulumi:"roleNames"`
}

// NewApiKey registers a new resource with the given unique name, arguments, and options.
func NewApiKey(ctx *pulumi.Context,
	name string, args *ApiKeyArgs, opts ...pulumi.ResourceOption) (*ApiKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	if args.RoleNames == nil {
		return nil, errors.New("invalid value for required argument 'RoleNames'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"privateKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApiKey
	err := ctx.RegisterResource("mongodbatlas:index/apiKey:ApiKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApiKey gets an existing ApiKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApiKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApiKeyState, opts ...pulumi.ResourceOption) (*ApiKey, error) {
	var resource ApiKey
	err := ctx.ReadResource("mongodbatlas:index/apiKey:ApiKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApiKey resources.
type apiKeyState struct {
	// Unique identifier for this Organization API key.
	ApiKeyId *string `pulumi:"apiKeyId"`
	// Description of this Organization API key.
	Description *string `pulumi:"description"`
	// Unique identifier for the organization whose API keys you want to retrieve. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
	OrgId      *string `pulumi:"orgId"`
	PrivateKey *string `pulumi:"privateKey"`
	PublicKey  *string `pulumi:"publicKey"`
	// Name of the role. This resource returns all the roles the user has in Atlas.
	// The following are valid roles:
	// * `ORG_OWNER`
	// * `ORG_GROUP_CREATOR`
	// * `ORG_BILLING_ADMIN`
	// * `ORG_READ_ONLY`
	// * `ORG_MEMBER`
	//
	// ## Attributes Reference
	//
	// In addition to all arguments above, the following attributes are exported:
	RoleNames []string `pulumi:"roleNames"`
}

type ApiKeyState struct {
	// Unique identifier for this Organization API key.
	ApiKeyId pulumi.StringPtrInput
	// Description of this Organization API key.
	Description pulumi.StringPtrInput
	// Unique identifier for the organization whose API keys you want to retrieve. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
	OrgId      pulumi.StringPtrInput
	PrivateKey pulumi.StringPtrInput
	PublicKey  pulumi.StringPtrInput
	// Name of the role. This resource returns all the roles the user has in Atlas.
	// The following are valid roles:
	// * `ORG_OWNER`
	// * `ORG_GROUP_CREATOR`
	// * `ORG_BILLING_ADMIN`
	// * `ORG_READ_ONLY`
	// * `ORG_MEMBER`
	//
	// ## Attributes Reference
	//
	// In addition to all arguments above, the following attributes are exported:
	RoleNames pulumi.StringArrayInput
}

func (ApiKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*apiKeyState)(nil)).Elem()
}

type apiKeyArgs struct {
	// Description of this Organization API key.
	Description string `pulumi:"description"`
	// Unique identifier for the organization whose API keys you want to retrieve. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
	OrgId string `pulumi:"orgId"`
	// Name of the role. This resource returns all the roles the user has in Atlas.
	// The following are valid roles:
	// * `ORG_OWNER`
	// * `ORG_GROUP_CREATOR`
	// * `ORG_BILLING_ADMIN`
	// * `ORG_READ_ONLY`
	// * `ORG_MEMBER`
	//
	// ## Attributes Reference
	//
	// In addition to all arguments above, the following attributes are exported:
	RoleNames []string `pulumi:"roleNames"`
}

// The set of arguments for constructing a ApiKey resource.
type ApiKeyArgs struct {
	// Description of this Organization API key.
	Description pulumi.StringInput
	// Unique identifier for the organization whose API keys you want to retrieve. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
	OrgId pulumi.StringInput
	// Name of the role. This resource returns all the roles the user has in Atlas.
	// The following are valid roles:
	// * `ORG_OWNER`
	// * `ORG_GROUP_CREATOR`
	// * `ORG_BILLING_ADMIN`
	// * `ORG_READ_ONLY`
	// * `ORG_MEMBER`
	//
	// ## Attributes Reference
	//
	// In addition to all arguments above, the following attributes are exported:
	RoleNames pulumi.StringArrayInput
}

func (ApiKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*apiKeyArgs)(nil)).Elem()
}

type ApiKeyInput interface {
	pulumi.Input

	ToApiKeyOutput() ApiKeyOutput
	ToApiKeyOutputWithContext(ctx context.Context) ApiKeyOutput
}

func (*ApiKey) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiKey)(nil)).Elem()
}

func (i *ApiKey) ToApiKeyOutput() ApiKeyOutput {
	return i.ToApiKeyOutputWithContext(context.Background())
}

func (i *ApiKey) ToApiKeyOutputWithContext(ctx context.Context) ApiKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiKeyOutput)
}

// ApiKeyArrayInput is an input type that accepts ApiKeyArray and ApiKeyArrayOutput values.
// You can construct a concrete instance of `ApiKeyArrayInput` via:
//
//	ApiKeyArray{ ApiKeyArgs{...} }
type ApiKeyArrayInput interface {
	pulumi.Input

	ToApiKeyArrayOutput() ApiKeyArrayOutput
	ToApiKeyArrayOutputWithContext(context.Context) ApiKeyArrayOutput
}

type ApiKeyArray []ApiKeyInput

func (ApiKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApiKey)(nil)).Elem()
}

func (i ApiKeyArray) ToApiKeyArrayOutput() ApiKeyArrayOutput {
	return i.ToApiKeyArrayOutputWithContext(context.Background())
}

func (i ApiKeyArray) ToApiKeyArrayOutputWithContext(ctx context.Context) ApiKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiKeyArrayOutput)
}

// ApiKeyMapInput is an input type that accepts ApiKeyMap and ApiKeyMapOutput values.
// You can construct a concrete instance of `ApiKeyMapInput` via:
//
//	ApiKeyMap{ "key": ApiKeyArgs{...} }
type ApiKeyMapInput interface {
	pulumi.Input

	ToApiKeyMapOutput() ApiKeyMapOutput
	ToApiKeyMapOutputWithContext(context.Context) ApiKeyMapOutput
}

type ApiKeyMap map[string]ApiKeyInput

func (ApiKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApiKey)(nil)).Elem()
}

func (i ApiKeyMap) ToApiKeyMapOutput() ApiKeyMapOutput {
	return i.ToApiKeyMapOutputWithContext(context.Background())
}

func (i ApiKeyMap) ToApiKeyMapOutputWithContext(ctx context.Context) ApiKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiKeyMapOutput)
}

type ApiKeyOutput struct{ *pulumi.OutputState }

func (ApiKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiKey)(nil)).Elem()
}

func (o ApiKeyOutput) ToApiKeyOutput() ApiKeyOutput {
	return o
}

func (o ApiKeyOutput) ToApiKeyOutputWithContext(ctx context.Context) ApiKeyOutput {
	return o
}

// Unique identifier for this Organization API key.
func (o ApiKeyOutput) ApiKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.StringOutput { return v.ApiKeyId }).(pulumi.StringOutput)
}

// Description of this Organization API key.
func (o ApiKeyOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Unique identifier for the organization whose API keys you want to retrieve. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
func (o ApiKeyOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

func (o ApiKeyOutput) PrivateKey() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.StringOutput { return v.PrivateKey }).(pulumi.StringOutput)
}

func (o ApiKeyOutput) PublicKey() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.StringOutput { return v.PublicKey }).(pulumi.StringOutput)
}

// Name of the role. This resource returns all the roles the user has in Atlas.
// The following are valid roles:
// * `ORG_OWNER`
// * `ORG_GROUP_CREATOR`
// * `ORG_BILLING_ADMIN`
// * `ORG_READ_ONLY`
// * `ORG_MEMBER`
//
// ## Attributes Reference
//
// In addition to all arguments above, the following attributes are exported:
func (o ApiKeyOutput) RoleNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.StringArrayOutput { return v.RoleNames }).(pulumi.StringArrayOutput)
}

type ApiKeyArrayOutput struct{ *pulumi.OutputState }

func (ApiKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApiKey)(nil)).Elem()
}

func (o ApiKeyArrayOutput) ToApiKeyArrayOutput() ApiKeyArrayOutput {
	return o
}

func (o ApiKeyArrayOutput) ToApiKeyArrayOutputWithContext(ctx context.Context) ApiKeyArrayOutput {
	return o
}

func (o ApiKeyArrayOutput) Index(i pulumi.IntInput) ApiKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApiKey {
		return vs[0].([]*ApiKey)[vs[1].(int)]
	}).(ApiKeyOutput)
}

type ApiKeyMapOutput struct{ *pulumi.OutputState }

func (ApiKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApiKey)(nil)).Elem()
}

func (o ApiKeyMapOutput) ToApiKeyMapOutput() ApiKeyMapOutput {
	return o
}

func (o ApiKeyMapOutput) ToApiKeyMapOutputWithContext(ctx context.Context) ApiKeyMapOutput {
	return o
}

func (o ApiKeyMapOutput) MapIndex(k pulumi.StringInput) ApiKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApiKey {
		return vs[0].(map[string]*ApiKey)[vs[1].(string)]
	}).(ApiKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApiKeyInput)(nil)).Elem(), &ApiKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApiKeyArrayInput)(nil)).Elem(), ApiKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApiKeyMapInput)(nil)).Elem(), ApiKeyMap{})
	pulumi.RegisterOutputType(ApiKeyOutput{})
	pulumi.RegisterOutputType(ApiKeyArrayOutput{})
	pulumi.RegisterOutputType(ApiKeyMapOutput{})
}
