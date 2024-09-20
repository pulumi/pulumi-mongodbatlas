// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: EncryptionAtRest
//
// `EncryptionAtRest` describes encryption at rest configuration for an Atlas project with one of the following providers:
//
// [Amazon Web Services Key Management Service](https://docs.atlas.mongodb.com/security-aws-kms/#security-aws-kms)
// [Azure Key Vault](https://docs.atlas.mongodb.com/security-azure-kms/#security-azure-kms)
// [Google Cloud KMS](https://docs.atlas.mongodb.com/security-gcp-kms/#security-gcp-kms)
//
// > **IMPORTANT** By default, Atlas enables encryption at rest for all cluster storage and snapshot volumes.
//
// > **IMPORTANT** Atlas limits this feature to dedicated cluster tiers of M10 and greater. For more information see: https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Encryption-at-Rest-using-Customer-Key-Management
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
//
// ## Example Usage
//
// ### S
//
// ### Configuring encryption at rest using customer key management in AWS
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
//			setupOnly, err := mongodbatlas.NewCloudProviderAccessSetup(ctx, "setup_only", &mongodbatlas.CloudProviderAccessSetupArgs{
//				ProjectId:    pulumi.Any(atlasProjectId),
//				ProviderName: pulumi.String("AWS"),
//			})
//			if err != nil {
//				return err
//			}
//			authRole, err := mongodbatlas.NewCloudProviderAccessAuthorization(ctx, "auth_role", &mongodbatlas.CloudProviderAccessAuthorizationArgs{
//				ProjectId: pulumi.Any(atlasProjectId),
//				RoleId:    setupOnly.RoleId,
//				Aws: &mongodbatlas.CloudProviderAccessAuthorizationAwsArgs{
//					IamAssumedRoleArn: pulumi.Any(testRole.Arn),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			testEncryptionAtRest, err := mongodbatlas.NewEncryptionAtRest(ctx, "test", &mongodbatlas.EncryptionAtRestArgs{
//				ProjectId: pulumi.Any(atlasProjectId),
//				AwsKmsConfig: &mongodbatlas.EncryptionAtRestAwsKmsConfigArgs{
//					Enabled:             pulumi.Bool(true),
//					CustomerMasterKeyId: pulumi.Any(kmsKey.Id),
//					Region:              pulumi.Any(atlasRegion),
//					RoleId:              authRole.RoleId,
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.NewAdvancedCluster(ctx, "cluster", &mongodbatlas.AdvancedClusterArgs{
//				ProjectId:                testEncryptionAtRest.ProjectId,
//				Name:                     pulumi.String("MyCluster"),
//				ClusterType:              pulumi.String("REPLICASET"),
//				BackupEnabled:            pulumi.Bool(true),
//				EncryptionAtRestProvider: pulumi.String("AWS"),
//				ReplicationSpecs: mongodbatlas.AdvancedClusterReplicationSpecArray{
//					&mongodbatlas.AdvancedClusterReplicationSpecArgs{
//						RegionConfigs: mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArray{
//							&mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArgs{
//								Priority:     pulumi.Int(7),
//								ProviderName: pulumi.String("AWS"),
//								RegionName:   pulumi.String("US_EAST_1"),
//								ElectableSpecs: &mongodbatlas.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs{
//									InstanceSize: pulumi.String("M10"),
//									NodeCount:    pulumi.Int(3),
//								},
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			test := mongodbatlas.LookupEncryptionAtRestOutput(ctx, mongodbatlas.GetEncryptionAtRestOutputArgs{
//				ProjectId: testEncryptionAtRest.ProjectId,
//			}, nil)
//			ctx.Export("isAwsKmsEncryptionAtRestValid", test.ApplyT(func(test mongodbatlas.GetEncryptionAtRestResult) (*bool, error) {
//				return &test.AwsKmsConfig.Valid, nil
//			}).(pulumi.BoolPtrOutput))
//			return nil
//		})
//	}
//
// ```
//
// ### Configuring encryption at rest using customer key management in Azure
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
//			testEncryptionAtRest, err := mongodbatlas.NewEncryptionAtRest(ctx, "test", &mongodbatlas.EncryptionAtRestArgs{
//				ProjectId: pulumi.Any(atlasProjectId),
//				AzureKeyVaultConfig: &mongodbatlas.EncryptionAtRestAzureKeyVaultConfigArgs{
//					Enabled:           pulumi.Bool(true),
//					AzureEnvironment:  pulumi.String("AZURE"),
//					TenantId:          pulumi.Any(azureTenantId),
//					SubscriptionId:    pulumi.Any(azureSubscriptionId),
//					ClientId:          pulumi.Any(azureClientId),
//					Secret:            pulumi.Any(azureClientSecret),
//					ResourceGroupName: pulumi.Any(azureResourceGroupName),
//					KeyVaultName:      pulumi.Any(azureKeyVaultName),
//					KeyIdentifier:     pulumi.Any(azureKeyIdentifier),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			test := mongodbatlas.LookupEncryptionAtRestOutput(ctx, mongodbatlas.GetEncryptionAtRestOutputArgs{
//				ProjectId: testEncryptionAtRest.ProjectId,
//			}, nil)
//			ctx.Export("isAzureEncryptionAtRestValid", test.ApplyT(func(test mongodbatlas.GetEncryptionAtRestResult) (*bool, error) {
//				return &test.AzureKeyVaultConfig.Valid, nil
//			}).(pulumi.BoolPtrOutput))
//			return nil
//		})
//	}
//
// ```
//
// > **NOTE:** It is possible to configure Atlas Encryption at Rest to communicate with Azure Key Vault using Azure Private Link, ensuring that all traffic between Atlas and Key Vault takes place over Azure’s private network interfaces. Please review `EncryptionAtRestPrivateEndpoint` resource for details.
//
// ### Configuring encryption at rest using customer key management in GCP
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
//			testEncryptionAtRest, err := mongodbatlas.NewEncryptionAtRest(ctx, "test", &mongodbatlas.EncryptionAtRestArgs{
//				ProjectId: pulumi.Any(atlasProjectId),
//				GoogleCloudKmsConfig: &mongodbatlas.EncryptionAtRestGoogleCloudKmsConfigArgs{
//					Enabled:              pulumi.Bool(true),
//					ServiceAccountKey:    pulumi.String("{\"type\": \"service_account\",\"project_id\": \"my-project-common-0\",\"private_key_id\": \"e120598ea4f88249469fcdd75a9a785c1bb3\",\"private_key\": \"-----BEGIN PRIVATE KEY-----\\nMIIEuwIBA(truncated)SfecnS0mT94D9\\n-----END PRIVATE KEY-----\\n\",\"client_email\": \"my-email-kms-0@my-project-common-0.iam.gserviceaccount.com\",\"client_id\": \"10180967717292066\",\"auth_uri\": \"https://accounts.google.com/o/oauth2/auth\",\"token_uri\": \"https://accounts.google.com/o/oauth2/token\",\"auth_provider_x509_cert_url\": \"https://www.googleapis.com/oauth2/v1/certs\",\"client_x509_cert_url\": \"https://www.googleapis.com/robot/v1/metadata/x509/my-email-kms-0%40my-project-common-0.iam.gserviceaccount.com\"}"),
//					KeyVersionResourceId: pulumi.String("projects/my-project-common-0/locations/us-east4/keyRings/my-key-ring-0/cryptoKeys/my-key-0/cryptoKeyVersions/1"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			test := mongodbatlas.LookupEncryptionAtRestOutput(ctx, mongodbatlas.GetEncryptionAtRestOutputArgs{
//				ProjectId: testEncryptionAtRest.ProjectId,
//			}, nil)
//			ctx.Export("isGcpEncryptionAtRestValid", test.ApplyT(func(test mongodbatlas.GetEncryptionAtRestResult) (*bool, error) {
//				return &test.GoogleCloudKmsConfig.Valid, nil
//			}).(pulumi.BoolPtrOutput))
//			return nil
//		})
//	}
//
// ```
func LookupEncryptionAtRest(ctx *pulumi.Context, args *LookupEncryptionAtRestArgs, opts ...pulumi.InvokeOption) (*LookupEncryptionAtRestResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEncryptionAtRestResult
	err := ctx.Invoke("mongodbatlas:index/getEncryptionAtRest:getEncryptionAtRest", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEncryptionAtRest.
type LookupEncryptionAtRestArgs struct {
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getEncryptionAtRest.
type LookupEncryptionAtRestResult struct {
	// Amazon Web Services (AWS) KMS configuration details and encryption at rest configuration set for the specified project.
	AwsKmsConfig GetEncryptionAtRestAwsKmsConfig `pulumi:"awsKmsConfig"`
	// Details that define the configuration of Encryption at Rest using Azure Key Vault (AKV).
	AzureKeyVaultConfig GetEncryptionAtRestAzureKeyVaultConfig `pulumi:"azureKeyVaultConfig"`
	// Details that define the configuration of Encryption at Rest using Google Cloud Key Management Service (KMS).
	GoogleCloudKmsConfig GetEncryptionAtRestGoogleCloudKmsConfig `pulumi:"googleCloudKmsConfig"`
	// The ID of this resource.
	Id string `pulumi:"id"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
}

func LookupEncryptionAtRestOutput(ctx *pulumi.Context, args LookupEncryptionAtRestOutputArgs, opts ...pulumi.InvokeOption) LookupEncryptionAtRestResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupEncryptionAtRestResult, error) {
			args := v.(LookupEncryptionAtRestArgs)
			r, err := LookupEncryptionAtRest(ctx, &args, opts...)
			var s LookupEncryptionAtRestResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupEncryptionAtRestResultOutput)
}

// A collection of arguments for invoking getEncryptionAtRest.
type LookupEncryptionAtRestOutputArgs struct {
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupEncryptionAtRestOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEncryptionAtRestArgs)(nil)).Elem()
}

// A collection of values returned by getEncryptionAtRest.
type LookupEncryptionAtRestResultOutput struct{ *pulumi.OutputState }

func (LookupEncryptionAtRestResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEncryptionAtRestResult)(nil)).Elem()
}

func (o LookupEncryptionAtRestResultOutput) ToLookupEncryptionAtRestResultOutput() LookupEncryptionAtRestResultOutput {
	return o
}

func (o LookupEncryptionAtRestResultOutput) ToLookupEncryptionAtRestResultOutputWithContext(ctx context.Context) LookupEncryptionAtRestResultOutput {
	return o
}

// Amazon Web Services (AWS) KMS configuration details and encryption at rest configuration set for the specified project.
func (o LookupEncryptionAtRestResultOutput) AwsKmsConfig() GetEncryptionAtRestAwsKmsConfigOutput {
	return o.ApplyT(func(v LookupEncryptionAtRestResult) GetEncryptionAtRestAwsKmsConfig { return v.AwsKmsConfig }).(GetEncryptionAtRestAwsKmsConfigOutput)
}

// Details that define the configuration of Encryption at Rest using Azure Key Vault (AKV).
func (o LookupEncryptionAtRestResultOutput) AzureKeyVaultConfig() GetEncryptionAtRestAzureKeyVaultConfigOutput {
	return o.ApplyT(func(v LookupEncryptionAtRestResult) GetEncryptionAtRestAzureKeyVaultConfig {
		return v.AzureKeyVaultConfig
	}).(GetEncryptionAtRestAzureKeyVaultConfigOutput)
}

// Details that define the configuration of Encryption at Rest using Google Cloud Key Management Service (KMS).
func (o LookupEncryptionAtRestResultOutput) GoogleCloudKmsConfig() GetEncryptionAtRestGoogleCloudKmsConfigOutput {
	return o.ApplyT(func(v LookupEncryptionAtRestResult) GetEncryptionAtRestGoogleCloudKmsConfig {
		return v.GoogleCloudKmsConfig
	}).(GetEncryptionAtRestGoogleCloudKmsConfigOutput)
}

// The ID of this resource.
func (o LookupEncryptionAtRestResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEncryptionAtRestResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies your project.
func (o LookupEncryptionAtRestResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEncryptionAtRestResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEncryptionAtRestResultOutput{})
}