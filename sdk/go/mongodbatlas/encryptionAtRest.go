// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// ## Import
//
// Encryption at Rest Settings can be imported using project ID, in the format `project_id`, e.g.
//
// ```sh
//
//	$ pulumi import mongodbatlas:index/encryptionAtRest:EncryptionAtRest example 1112222b3bf99403840e8934
//
// ```
//
//	For more information see[MongoDB Atlas API Reference for Encryption at Rest using Customer Key Management.](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Encryption-at-Rest-using-Customer-Key-Management)
type EncryptionAtRest struct {
	pulumi.CustomResourceState

	// Specifies AWS KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
	//
	// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to aws_kms_config
	AwsKms       pulumi.StringMapOutput                `pulumi:"awsKms"`
	AwsKmsConfig EncryptionAtRestAwsKmsConfigPtrOutput `pulumi:"awsKmsConfig"`
	// Specifies Azure Key Vault configuration details and whether Encryption at Rest is enabled for an Atlas project.
	//
	// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to azure_key_vault_config
	AzureKeyVault       pulumi.StringMapOutput                       `pulumi:"azureKeyVault"`
	AzureKeyVaultConfig EncryptionAtRestAzureKeyVaultConfigPtrOutput `pulumi:"azureKeyVaultConfig"`
	// Specifies GCP KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
	//
	// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to google_cloud_kms_config
	GoogleCloudKms       pulumi.StringMapOutput                        `pulumi:"googleCloudKms"`
	GoogleCloudKmsConfig EncryptionAtRestGoogleCloudKmsConfigPtrOutput `pulumi:"googleCloudKmsConfig"`
	// The unique identifier for the project.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
}

// NewEncryptionAtRest registers a new resource with the given unique name, arguments, and options.
func NewEncryptionAtRest(ctx *pulumi.Context,
	name string, args *EncryptionAtRestArgs, opts ...pulumi.ResourceOption) (*EncryptionAtRest, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.AwsKms != nil {
		args.AwsKms = pulumi.ToSecret(args.AwsKms).(pulumi.StringMapInput)
	}
	if args.AwsKmsConfig != nil {
		args.AwsKmsConfig = pulumi.ToSecret(args.AwsKmsConfig).(EncryptionAtRestAwsKmsConfigPtrInput)
	}
	if args.AzureKeyVault != nil {
		args.AzureKeyVault = pulumi.ToSecret(args.AzureKeyVault).(pulumi.StringMapInput)
	}
	if args.AzureKeyVaultConfig != nil {
		args.AzureKeyVaultConfig = pulumi.ToSecret(args.AzureKeyVaultConfig).(EncryptionAtRestAzureKeyVaultConfigPtrInput)
	}
	if args.GoogleCloudKms != nil {
		args.GoogleCloudKms = pulumi.ToSecret(args.GoogleCloudKms).(pulumi.StringMapInput)
	}
	if args.GoogleCloudKmsConfig != nil {
		args.GoogleCloudKmsConfig = pulumi.ToSecret(args.GoogleCloudKmsConfig).(EncryptionAtRestGoogleCloudKmsConfigPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"awsKms",
		"awsKmsConfig",
		"azureKeyVault",
		"azureKeyVaultConfig",
		"googleCloudKms",
		"googleCloudKmsConfig",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EncryptionAtRest
	err := ctx.RegisterResource("mongodbatlas:index/encryptionAtRest:EncryptionAtRest", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEncryptionAtRest gets an existing EncryptionAtRest resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEncryptionAtRest(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EncryptionAtRestState, opts ...pulumi.ResourceOption) (*EncryptionAtRest, error) {
	var resource EncryptionAtRest
	err := ctx.ReadResource("mongodbatlas:index/encryptionAtRest:EncryptionAtRest", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EncryptionAtRest resources.
type encryptionAtRestState struct {
	// Specifies AWS KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
	//
	// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to aws_kms_config
	AwsKms       map[string]string             `pulumi:"awsKms"`
	AwsKmsConfig *EncryptionAtRestAwsKmsConfig `pulumi:"awsKmsConfig"`
	// Specifies Azure Key Vault configuration details and whether Encryption at Rest is enabled for an Atlas project.
	//
	// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to azure_key_vault_config
	AzureKeyVault       map[string]string                    `pulumi:"azureKeyVault"`
	AzureKeyVaultConfig *EncryptionAtRestAzureKeyVaultConfig `pulumi:"azureKeyVaultConfig"`
	// Specifies GCP KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
	//
	// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to google_cloud_kms_config
	GoogleCloudKms       map[string]string                     `pulumi:"googleCloudKms"`
	GoogleCloudKmsConfig *EncryptionAtRestGoogleCloudKmsConfig `pulumi:"googleCloudKmsConfig"`
	// The unique identifier for the project.
	ProjectId *string `pulumi:"projectId"`
}

type EncryptionAtRestState struct {
	// Specifies AWS KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
	//
	// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to aws_kms_config
	AwsKms       pulumi.StringMapInput
	AwsKmsConfig EncryptionAtRestAwsKmsConfigPtrInput
	// Specifies Azure Key Vault configuration details and whether Encryption at Rest is enabled for an Atlas project.
	//
	// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to azure_key_vault_config
	AzureKeyVault       pulumi.StringMapInput
	AzureKeyVaultConfig EncryptionAtRestAzureKeyVaultConfigPtrInput
	// Specifies GCP KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
	//
	// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to google_cloud_kms_config
	GoogleCloudKms       pulumi.StringMapInput
	GoogleCloudKmsConfig EncryptionAtRestGoogleCloudKmsConfigPtrInput
	// The unique identifier for the project.
	ProjectId pulumi.StringPtrInput
}

func (EncryptionAtRestState) ElementType() reflect.Type {
	return reflect.TypeOf((*encryptionAtRestState)(nil)).Elem()
}

type encryptionAtRestArgs struct {
	// Specifies AWS KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
	//
	// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to aws_kms_config
	AwsKms       map[string]string             `pulumi:"awsKms"`
	AwsKmsConfig *EncryptionAtRestAwsKmsConfig `pulumi:"awsKmsConfig"`
	// Specifies Azure Key Vault configuration details and whether Encryption at Rest is enabled for an Atlas project.
	//
	// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to azure_key_vault_config
	AzureKeyVault       map[string]string                    `pulumi:"azureKeyVault"`
	AzureKeyVaultConfig *EncryptionAtRestAzureKeyVaultConfig `pulumi:"azureKeyVaultConfig"`
	// Specifies GCP KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
	//
	// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to google_cloud_kms_config
	GoogleCloudKms       map[string]string                     `pulumi:"googleCloudKms"`
	GoogleCloudKmsConfig *EncryptionAtRestGoogleCloudKmsConfig `pulumi:"googleCloudKmsConfig"`
	// The unique identifier for the project.
	ProjectId string `pulumi:"projectId"`
}

// The set of arguments for constructing a EncryptionAtRest resource.
type EncryptionAtRestArgs struct {
	// Specifies AWS KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
	//
	// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to aws_kms_config
	AwsKms       pulumi.StringMapInput
	AwsKmsConfig EncryptionAtRestAwsKmsConfigPtrInput
	// Specifies Azure Key Vault configuration details and whether Encryption at Rest is enabled for an Atlas project.
	//
	// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to azure_key_vault_config
	AzureKeyVault       pulumi.StringMapInput
	AzureKeyVaultConfig EncryptionAtRestAzureKeyVaultConfigPtrInput
	// Specifies GCP KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
	//
	// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to google_cloud_kms_config
	GoogleCloudKms       pulumi.StringMapInput
	GoogleCloudKmsConfig EncryptionAtRestGoogleCloudKmsConfigPtrInput
	// The unique identifier for the project.
	ProjectId pulumi.StringInput
}

func (EncryptionAtRestArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*encryptionAtRestArgs)(nil)).Elem()
}

type EncryptionAtRestInput interface {
	pulumi.Input

	ToEncryptionAtRestOutput() EncryptionAtRestOutput
	ToEncryptionAtRestOutputWithContext(ctx context.Context) EncryptionAtRestOutput
}

func (*EncryptionAtRest) ElementType() reflect.Type {
	return reflect.TypeOf((**EncryptionAtRest)(nil)).Elem()
}

func (i *EncryptionAtRest) ToEncryptionAtRestOutput() EncryptionAtRestOutput {
	return i.ToEncryptionAtRestOutputWithContext(context.Background())
}

func (i *EncryptionAtRest) ToEncryptionAtRestOutputWithContext(ctx context.Context) EncryptionAtRestOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EncryptionAtRestOutput)
}

func (i *EncryptionAtRest) ToOutput(ctx context.Context) pulumix.Output[*EncryptionAtRest] {
	return pulumix.Output[*EncryptionAtRest]{
		OutputState: i.ToEncryptionAtRestOutputWithContext(ctx).OutputState,
	}
}

// EncryptionAtRestArrayInput is an input type that accepts EncryptionAtRestArray and EncryptionAtRestArrayOutput values.
// You can construct a concrete instance of `EncryptionAtRestArrayInput` via:
//
//	EncryptionAtRestArray{ EncryptionAtRestArgs{...} }
type EncryptionAtRestArrayInput interface {
	pulumi.Input

	ToEncryptionAtRestArrayOutput() EncryptionAtRestArrayOutput
	ToEncryptionAtRestArrayOutputWithContext(context.Context) EncryptionAtRestArrayOutput
}

type EncryptionAtRestArray []EncryptionAtRestInput

func (EncryptionAtRestArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EncryptionAtRest)(nil)).Elem()
}

func (i EncryptionAtRestArray) ToEncryptionAtRestArrayOutput() EncryptionAtRestArrayOutput {
	return i.ToEncryptionAtRestArrayOutputWithContext(context.Background())
}

func (i EncryptionAtRestArray) ToEncryptionAtRestArrayOutputWithContext(ctx context.Context) EncryptionAtRestArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EncryptionAtRestArrayOutput)
}

func (i EncryptionAtRestArray) ToOutput(ctx context.Context) pulumix.Output[[]*EncryptionAtRest] {
	return pulumix.Output[[]*EncryptionAtRest]{
		OutputState: i.ToEncryptionAtRestArrayOutputWithContext(ctx).OutputState,
	}
}

// EncryptionAtRestMapInput is an input type that accepts EncryptionAtRestMap and EncryptionAtRestMapOutput values.
// You can construct a concrete instance of `EncryptionAtRestMapInput` via:
//
//	EncryptionAtRestMap{ "key": EncryptionAtRestArgs{...} }
type EncryptionAtRestMapInput interface {
	pulumi.Input

	ToEncryptionAtRestMapOutput() EncryptionAtRestMapOutput
	ToEncryptionAtRestMapOutputWithContext(context.Context) EncryptionAtRestMapOutput
}

type EncryptionAtRestMap map[string]EncryptionAtRestInput

func (EncryptionAtRestMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EncryptionAtRest)(nil)).Elem()
}

func (i EncryptionAtRestMap) ToEncryptionAtRestMapOutput() EncryptionAtRestMapOutput {
	return i.ToEncryptionAtRestMapOutputWithContext(context.Background())
}

func (i EncryptionAtRestMap) ToEncryptionAtRestMapOutputWithContext(ctx context.Context) EncryptionAtRestMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EncryptionAtRestMapOutput)
}

func (i EncryptionAtRestMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*EncryptionAtRest] {
	return pulumix.Output[map[string]*EncryptionAtRest]{
		OutputState: i.ToEncryptionAtRestMapOutputWithContext(ctx).OutputState,
	}
}

type EncryptionAtRestOutput struct{ *pulumi.OutputState }

func (EncryptionAtRestOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EncryptionAtRest)(nil)).Elem()
}

func (o EncryptionAtRestOutput) ToEncryptionAtRestOutput() EncryptionAtRestOutput {
	return o
}

func (o EncryptionAtRestOutput) ToEncryptionAtRestOutputWithContext(ctx context.Context) EncryptionAtRestOutput {
	return o
}

func (o EncryptionAtRestOutput) ToOutput(ctx context.Context) pulumix.Output[*EncryptionAtRest] {
	return pulumix.Output[*EncryptionAtRest]{
		OutputState: o.OutputState,
	}
}

// Specifies AWS KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
//
// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to aws_kms_config
func (o EncryptionAtRestOutput) AwsKms() pulumi.StringMapOutput {
	return o.ApplyT(func(v *EncryptionAtRest) pulumi.StringMapOutput { return v.AwsKms }).(pulumi.StringMapOutput)
}

func (o EncryptionAtRestOutput) AwsKmsConfig() EncryptionAtRestAwsKmsConfigPtrOutput {
	return o.ApplyT(func(v *EncryptionAtRest) EncryptionAtRestAwsKmsConfigPtrOutput { return v.AwsKmsConfig }).(EncryptionAtRestAwsKmsConfigPtrOutput)
}

// Specifies Azure Key Vault configuration details and whether Encryption at Rest is enabled for an Atlas project.
//
// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to azure_key_vault_config
func (o EncryptionAtRestOutput) AzureKeyVault() pulumi.StringMapOutput {
	return o.ApplyT(func(v *EncryptionAtRest) pulumi.StringMapOutput { return v.AzureKeyVault }).(pulumi.StringMapOutput)
}

func (o EncryptionAtRestOutput) AzureKeyVaultConfig() EncryptionAtRestAzureKeyVaultConfigPtrOutput {
	return o.ApplyT(func(v *EncryptionAtRest) EncryptionAtRestAzureKeyVaultConfigPtrOutput { return v.AzureKeyVaultConfig }).(EncryptionAtRestAzureKeyVaultConfigPtrOutput)
}

// Specifies GCP KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
//
// Deprecated: this parameter is deprecated and will be removed in v1.12.0, please transition to google_cloud_kms_config
func (o EncryptionAtRestOutput) GoogleCloudKms() pulumi.StringMapOutput {
	return o.ApplyT(func(v *EncryptionAtRest) pulumi.StringMapOutput { return v.GoogleCloudKms }).(pulumi.StringMapOutput)
}

func (o EncryptionAtRestOutput) GoogleCloudKmsConfig() EncryptionAtRestGoogleCloudKmsConfigPtrOutput {
	return o.ApplyT(func(v *EncryptionAtRest) EncryptionAtRestGoogleCloudKmsConfigPtrOutput { return v.GoogleCloudKmsConfig }).(EncryptionAtRestGoogleCloudKmsConfigPtrOutput)
}

// The unique identifier for the project.
func (o EncryptionAtRestOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *EncryptionAtRest) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

type EncryptionAtRestArrayOutput struct{ *pulumi.OutputState }

func (EncryptionAtRestArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EncryptionAtRest)(nil)).Elem()
}

func (o EncryptionAtRestArrayOutput) ToEncryptionAtRestArrayOutput() EncryptionAtRestArrayOutput {
	return o
}

func (o EncryptionAtRestArrayOutput) ToEncryptionAtRestArrayOutputWithContext(ctx context.Context) EncryptionAtRestArrayOutput {
	return o
}

func (o EncryptionAtRestArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*EncryptionAtRest] {
	return pulumix.Output[[]*EncryptionAtRest]{
		OutputState: o.OutputState,
	}
}

func (o EncryptionAtRestArrayOutput) Index(i pulumi.IntInput) EncryptionAtRestOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EncryptionAtRest {
		return vs[0].([]*EncryptionAtRest)[vs[1].(int)]
	}).(EncryptionAtRestOutput)
}

type EncryptionAtRestMapOutput struct{ *pulumi.OutputState }

func (EncryptionAtRestMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EncryptionAtRest)(nil)).Elem()
}

func (o EncryptionAtRestMapOutput) ToEncryptionAtRestMapOutput() EncryptionAtRestMapOutput {
	return o
}

func (o EncryptionAtRestMapOutput) ToEncryptionAtRestMapOutputWithContext(ctx context.Context) EncryptionAtRestMapOutput {
	return o
}

func (o EncryptionAtRestMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*EncryptionAtRest] {
	return pulumix.Output[map[string]*EncryptionAtRest]{
		OutputState: o.OutputState,
	}
}

func (o EncryptionAtRestMapOutput) MapIndex(k pulumi.StringInput) EncryptionAtRestOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EncryptionAtRest {
		return vs[0].(map[string]*EncryptionAtRest)[vs[1].(string)]
	}).(EncryptionAtRestOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EncryptionAtRestInput)(nil)).Elem(), &EncryptionAtRest{})
	pulumi.RegisterInputType(reflect.TypeOf((*EncryptionAtRestArrayInput)(nil)).Elem(), EncryptionAtRestArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EncryptionAtRestMapInput)(nil)).Elem(), EncryptionAtRestMap{})
	pulumi.RegisterOutputType(EncryptionAtRestOutput{})
	pulumi.RegisterOutputType(EncryptionAtRestArrayOutput{})
	pulumi.RegisterOutputType(EncryptionAtRestMapOutput{})
}
