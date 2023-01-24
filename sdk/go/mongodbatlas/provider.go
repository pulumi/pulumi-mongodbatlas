// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the mongodbatlas package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	AwsAccessKeyId     pulumi.StringPtrOutput `pulumi:"awsAccessKeyId"`
	AwsSecretAccessKey pulumi.StringPtrOutput `pulumi:"awsSecretAccessKey"`
	AwsSessionToken    pulumi.StringPtrOutput `pulumi:"awsSessionToken"`
	// MongoDB Atlas Base URL
	BaseUrl pulumi.StringPtrOutput `pulumi:"baseUrl"`
	// MongoDB Atlas Programmatic Private Key
	PrivateKey pulumi.StringPtrOutput `pulumi:"privateKey"`
	// MongoDB Atlas Programmatic Public Key
	PublicKey pulumi.StringPtrOutput `pulumi:"publicKey"`
	// MongoDB Realm Base URL
	RealmBaseUrl pulumi.StringPtrOutput `pulumi:"realmBaseUrl"`
	Region       pulumi.StringPtrOutput `pulumi:"region"`
	SecretName   pulumi.StringPtrOutput `pulumi:"secretName"`
	StsEndpoint  pulumi.StringPtrOutput `pulumi:"stsEndpoint"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	if args.PrivateKey != nil {
		args.PrivateKey = pulumi.ToSecret(args.PrivateKey).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"privateKey",
	})
	opts = append(opts, secrets)
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:mongodbatlas", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	AssumeRole         *ProviderAssumeRole `pulumi:"assumeRole"`
	AwsAccessKeyId     *string             `pulumi:"awsAccessKeyId"`
	AwsSecretAccessKey *string             `pulumi:"awsSecretAccessKey"`
	AwsSessionToken    *string             `pulumi:"awsSessionToken"`
	// MongoDB Atlas Base URL
	BaseUrl *string `pulumi:"baseUrl"`
	// MongoDB Atlas Base URL default to gov
	IsMongodbgovCloud *bool `pulumi:"isMongodbgovCloud"`
	// MongoDB Atlas Programmatic Private Key
	PrivateKey *string `pulumi:"privateKey"`
	// MongoDB Atlas Programmatic Public Key
	PublicKey *string `pulumi:"publicKey"`
	// MongoDB Realm Base URL
	RealmBaseUrl *string `pulumi:"realmBaseUrl"`
	Region       *string `pulumi:"region"`
	SecretName   *string `pulumi:"secretName"`
	StsEndpoint  *string `pulumi:"stsEndpoint"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	AssumeRole         ProviderAssumeRolePtrInput
	AwsAccessKeyId     pulumi.StringPtrInput
	AwsSecretAccessKey pulumi.StringPtrInput
	AwsSessionToken    pulumi.StringPtrInput
	// MongoDB Atlas Base URL
	BaseUrl pulumi.StringPtrInput
	// MongoDB Atlas Base URL default to gov
	IsMongodbgovCloud pulumi.BoolPtrInput
	// MongoDB Atlas Programmatic Private Key
	PrivateKey pulumi.StringPtrInput
	// MongoDB Atlas Programmatic Public Key
	PublicKey pulumi.StringPtrInput
	// MongoDB Realm Base URL
	RealmBaseUrl pulumi.StringPtrInput
	Region       pulumi.StringPtrInput
	SecretName   pulumi.StringPtrInput
	StsEndpoint  pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

func (o ProviderOutput) AwsAccessKeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.AwsAccessKeyId }).(pulumi.StringPtrOutput)
}

func (o ProviderOutput) AwsSecretAccessKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.AwsSecretAccessKey }).(pulumi.StringPtrOutput)
}

func (o ProviderOutput) AwsSessionToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.AwsSessionToken }).(pulumi.StringPtrOutput)
}

// MongoDB Atlas Base URL
func (o ProviderOutput) BaseUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.BaseUrl }).(pulumi.StringPtrOutput)
}

// MongoDB Atlas Programmatic Private Key
func (o ProviderOutput) PrivateKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.PrivateKey }).(pulumi.StringPtrOutput)
}

// MongoDB Atlas Programmatic Public Key
func (o ProviderOutput) PublicKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.PublicKey }).(pulumi.StringPtrOutput)
}

// MongoDB Realm Base URL
func (o ProviderOutput) RealmBaseUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.RealmBaseUrl }).(pulumi.StringPtrOutput)
}

func (o ProviderOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Region }).(pulumi.StringPtrOutput)
}

func (o ProviderOutput) SecretName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.SecretName }).(pulumi.StringPtrOutput)
}

func (o ProviderOutput) StsEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.StsEndpoint }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}
