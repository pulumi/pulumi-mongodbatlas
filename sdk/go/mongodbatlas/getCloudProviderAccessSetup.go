// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// `CloudProviderAccess` allows you to get a single role for a provider access role setup, currently only AWS and Azure are supported.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
//
// ## Example Usage
// ### With AWS
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
//			testRole, err := mongodbatlas.NewCloudProviderAccessSetup(ctx, "testRole", &mongodbatlas.CloudProviderAccessSetupArgs{
//				ProjectId:    pulumi.String("64259ee860c43338194b0f8e"),
//				ProviderName: pulumi.String("AWS"),
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupCloudProviderAccessSetupOutput(ctx, mongodbatlas.GetCloudProviderAccessSetupOutputArgs{
//				ProjectId:    testRole.ProjectId,
//				ProviderName: testRole.ProviderName,
//				RoleId:       testRole.RoleId,
//			}, nil)
//			return nil
//		})
//	}
//
// ```
// ### With AZURE
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
//			testRole, err := mongodbatlas.NewCloudProviderAccessSetup(ctx, "testRole", &mongodbatlas.CloudProviderAccessSetupArgs{
//				ProjectId:    pulumi.String("64259ee860c43338194b0f8e"),
//				ProviderName: pulumi.String("AZURE"),
//				AzureConfigs: mongodbatlas.CloudProviderAccessSetupAzureConfigArray{
//					&mongodbatlas.CloudProviderAccessSetupAzureConfigArgs{
//						AtlasAzureAppId:    pulumi.String("9f2deb0d-be22-4524-a403-df531868bac0"),
//						ServicePrincipalId: pulumi.String("22f1d2a6-d0e9-482a-83a4-b8dd7dddc2c1"),
//						TenantId:           pulumi.String("91402384-d71e-22f5-22dd-759e272cdc1c"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupCloudProviderAccessSetupOutput(ctx, mongodbatlas.GetCloudProviderAccessSetupOutputArgs{
//				ProjectId:    testRole.ProjectId,
//				ProviderName: testRole.ProviderName,
//				RoleId:       testRole.RoleId,
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupCloudProviderAccessSetup(ctx *pulumi.Context, args *LookupCloudProviderAccessSetupArgs, opts ...pulumi.InvokeOption) (*LookupCloudProviderAccessSetupResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCloudProviderAccessSetupResult
	err := ctx.Invoke("mongodbatlas:index/getCloudProviderAccessSetup:getCloudProviderAccessSetup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCloudProviderAccessSetup.
type LookupCloudProviderAccessSetupArgs struct {
	// azure related configurations
	AzureConfigs []GetCloudProviderAccessSetupAzureConfig `pulumi:"azureConfigs"`
	// The unique ID for the project to get all Cloud Provider Access
	ProjectId string `pulumi:"projectId"`
	// cloud provider name, currently only AWS is supported
	ProviderName string `pulumi:"providerName"`
	// unique role id among all the aws roles provided by mongodb atlas
	RoleId string `pulumi:"roleId"`
}

// A collection of values returned by getCloudProviderAccessSetup.
type LookupCloudProviderAccessSetupResult struct {
	// aws related role information
	Aws map[string]string `pulumi:"aws"`
	// aws related role information
	AwsConfigs []GetCloudProviderAccessSetupAwsConfig `pulumi:"awsConfigs"`
	// azure related configurations
	AzureConfigs []GetCloudProviderAccessSetupAzureConfig `pulumi:"azureConfigs"`
	// Date on which this role was created.
	CreatedDate string `pulumi:"createdDate"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Date and time when this Azure Service Principal was last updated. This parameter expresses its value in the ISO 8601 timestamp format in UTC.
	LastUpdatedDate string `pulumi:"lastUpdatedDate"`
	ProjectId       string `pulumi:"projectId"`
	ProviderName    string `pulumi:"providerName"`
	RoleId          string `pulumi:"roleId"`
}

func LookupCloudProviderAccessSetupOutput(ctx *pulumi.Context, args LookupCloudProviderAccessSetupOutputArgs, opts ...pulumi.InvokeOption) LookupCloudProviderAccessSetupResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCloudProviderAccessSetupResult, error) {
			args := v.(LookupCloudProviderAccessSetupArgs)
			r, err := LookupCloudProviderAccessSetup(ctx, &args, opts...)
			var s LookupCloudProviderAccessSetupResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupCloudProviderAccessSetupResultOutput)
}

// A collection of arguments for invoking getCloudProviderAccessSetup.
type LookupCloudProviderAccessSetupOutputArgs struct {
	// azure related configurations
	AzureConfigs GetCloudProviderAccessSetupAzureConfigArrayInput `pulumi:"azureConfigs"`
	// The unique ID for the project to get all Cloud Provider Access
	ProjectId pulumi.StringInput `pulumi:"projectId"`
	// cloud provider name, currently only AWS is supported
	ProviderName pulumi.StringInput `pulumi:"providerName"`
	// unique role id among all the aws roles provided by mongodb atlas
	RoleId pulumi.StringInput `pulumi:"roleId"`
}

func (LookupCloudProviderAccessSetupOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCloudProviderAccessSetupArgs)(nil)).Elem()
}

// A collection of values returned by getCloudProviderAccessSetup.
type LookupCloudProviderAccessSetupResultOutput struct{ *pulumi.OutputState }

func (LookupCloudProviderAccessSetupResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCloudProviderAccessSetupResult)(nil)).Elem()
}

func (o LookupCloudProviderAccessSetupResultOutput) ToLookupCloudProviderAccessSetupResultOutput() LookupCloudProviderAccessSetupResultOutput {
	return o
}

func (o LookupCloudProviderAccessSetupResultOutput) ToLookupCloudProviderAccessSetupResultOutputWithContext(ctx context.Context) LookupCloudProviderAccessSetupResultOutput {
	return o
}

func (o LookupCloudProviderAccessSetupResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupCloudProviderAccessSetupResult] {
	return pulumix.Output[LookupCloudProviderAccessSetupResult]{
		OutputState: o.OutputState,
	}
}

// aws related role information
func (o LookupCloudProviderAccessSetupResultOutput) Aws() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupCloudProviderAccessSetupResult) map[string]string { return v.Aws }).(pulumi.StringMapOutput)
}

// aws related role information
func (o LookupCloudProviderAccessSetupResultOutput) AwsConfigs() GetCloudProviderAccessSetupAwsConfigArrayOutput {
	return o.ApplyT(func(v LookupCloudProviderAccessSetupResult) []GetCloudProviderAccessSetupAwsConfig {
		return v.AwsConfigs
	}).(GetCloudProviderAccessSetupAwsConfigArrayOutput)
}

// azure related configurations
func (o LookupCloudProviderAccessSetupResultOutput) AzureConfigs() GetCloudProviderAccessSetupAzureConfigArrayOutput {
	return o.ApplyT(func(v LookupCloudProviderAccessSetupResult) []GetCloudProviderAccessSetupAzureConfig {
		return v.AzureConfigs
	}).(GetCloudProviderAccessSetupAzureConfigArrayOutput)
}

// Date on which this role was created.
func (o LookupCloudProviderAccessSetupResultOutput) CreatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudProviderAccessSetupResult) string { return v.CreatedDate }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCloudProviderAccessSetupResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudProviderAccessSetupResult) string { return v.Id }).(pulumi.StringOutput)
}

// Date and time when this Azure Service Principal was last updated. This parameter expresses its value in the ISO 8601 timestamp format in UTC.
func (o LookupCloudProviderAccessSetupResultOutput) LastUpdatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudProviderAccessSetupResult) string { return v.LastUpdatedDate }).(pulumi.StringOutput)
}

func (o LookupCloudProviderAccessSetupResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudProviderAccessSetupResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o LookupCloudProviderAccessSetupResultOutput) ProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudProviderAccessSetupResult) string { return v.ProviderName }).(pulumi.StringOutput)
}

func (o LookupCloudProviderAccessSetupResultOutput) RoleId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudProviderAccessSetupResult) string { return v.RoleId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCloudProviderAccessSetupResultOutput{})
}
