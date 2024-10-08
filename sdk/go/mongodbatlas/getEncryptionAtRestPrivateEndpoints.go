// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: getEncryptionAtRestPrivateEndpoints
//
// `getEncryptionAtRestPrivateEndpoints` describes private endpoints of a particular cloud provider used for encryption at rest using customer-managed keys.
//
// > **IMPORTANT** The Encryption at Rest using Azure Key Vault over Private Endpoints feature is available by request. To request this functionality for your Atlas deployments, contact your Account Manager.
// To learn more about existing limitations, see [Manage Customer Keys with Azure Key Vault Over Private Endpoints](https://www.mongodb.com/docs/atlas/security/azure-kms-over-private-endpoint/#manage-customer-keys-with-azure-key-vault-over-private-endpoints).
//
// ## Example Usage
//
// ### S
//
// > **NOTE:** Only Azure Key Vault with Azure Private Link is supported at this time.
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
//			plural, err := mongodbatlas.LookupEncryptionAtRestPrivateEndpoints(ctx, &mongodbatlas.LookupEncryptionAtRestPrivateEndpointsArgs{
//				ProjectId:     atlasProjectId,
//				CloudProvider: "AZURE",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("numberOfEndpoints", pulumi.Int(len(plural.Results)))
//			return nil
//		})
//	}
//
// ```
func LookupEncryptionAtRestPrivateEndpoints(ctx *pulumi.Context, args *LookupEncryptionAtRestPrivateEndpointsArgs, opts ...pulumi.InvokeOption) (*LookupEncryptionAtRestPrivateEndpointsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEncryptionAtRestPrivateEndpointsResult
	err := ctx.Invoke("mongodbatlas:index/getEncryptionAtRestPrivateEndpoints:getEncryptionAtRestPrivateEndpoints", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEncryptionAtRestPrivateEndpoints.
type LookupEncryptionAtRestPrivateEndpointsArgs struct {
	// Label that identifies the cloud provider of the private endpoint.
	CloudProvider string `pulumi:"cloudProvider"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getEncryptionAtRestPrivateEndpoints.
type LookupEncryptionAtRestPrivateEndpointsResult struct {
	// Label that identifies the cloud provider of the private endpoint.
	CloudProvider string `pulumi:"cloudProvider"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
	// List of returned documents that MongoDB Cloud providers when completing this request.
	Results []GetEncryptionAtRestPrivateEndpointsResult `pulumi:"results"`
}

func LookupEncryptionAtRestPrivateEndpointsOutput(ctx *pulumi.Context, args LookupEncryptionAtRestPrivateEndpointsOutputArgs, opts ...pulumi.InvokeOption) LookupEncryptionAtRestPrivateEndpointsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupEncryptionAtRestPrivateEndpointsResultOutput, error) {
			args := v.(LookupEncryptionAtRestPrivateEndpointsArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupEncryptionAtRestPrivateEndpointsResult
			secret, err := ctx.InvokePackageRaw("mongodbatlas:index/getEncryptionAtRestPrivateEndpoints:getEncryptionAtRestPrivateEndpoints", args, &rv, "", opts...)
			if err != nil {
				return LookupEncryptionAtRestPrivateEndpointsResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupEncryptionAtRestPrivateEndpointsResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupEncryptionAtRestPrivateEndpointsResultOutput), nil
			}
			return output, nil
		}).(LookupEncryptionAtRestPrivateEndpointsResultOutput)
}

// A collection of arguments for invoking getEncryptionAtRestPrivateEndpoints.
type LookupEncryptionAtRestPrivateEndpointsOutputArgs struct {
	// Label that identifies the cloud provider of the private endpoint.
	CloudProvider pulumi.StringInput `pulumi:"cloudProvider"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupEncryptionAtRestPrivateEndpointsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEncryptionAtRestPrivateEndpointsArgs)(nil)).Elem()
}

// A collection of values returned by getEncryptionAtRestPrivateEndpoints.
type LookupEncryptionAtRestPrivateEndpointsResultOutput struct{ *pulumi.OutputState }

func (LookupEncryptionAtRestPrivateEndpointsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEncryptionAtRestPrivateEndpointsResult)(nil)).Elem()
}

func (o LookupEncryptionAtRestPrivateEndpointsResultOutput) ToLookupEncryptionAtRestPrivateEndpointsResultOutput() LookupEncryptionAtRestPrivateEndpointsResultOutput {
	return o
}

func (o LookupEncryptionAtRestPrivateEndpointsResultOutput) ToLookupEncryptionAtRestPrivateEndpointsResultOutputWithContext(ctx context.Context) LookupEncryptionAtRestPrivateEndpointsResultOutput {
	return o
}

// Label that identifies the cloud provider of the private endpoint.
func (o LookupEncryptionAtRestPrivateEndpointsResultOutput) CloudProvider() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEncryptionAtRestPrivateEndpointsResult) string { return v.CloudProvider }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupEncryptionAtRestPrivateEndpointsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEncryptionAtRestPrivateEndpointsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies your project.
func (o LookupEncryptionAtRestPrivateEndpointsResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEncryptionAtRestPrivateEndpointsResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// List of returned documents that MongoDB Cloud providers when completing this request.
func (o LookupEncryptionAtRestPrivateEndpointsResultOutput) Results() GetEncryptionAtRestPrivateEndpointsResultArrayOutput {
	return o.ApplyT(func(v LookupEncryptionAtRestPrivateEndpointsResult) []GetEncryptionAtRestPrivateEndpointsResult {
		return v.Results
	}).(GetEncryptionAtRestPrivateEndpointsResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEncryptionAtRestPrivateEndpointsResultOutput{})
}
