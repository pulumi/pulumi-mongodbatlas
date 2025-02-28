// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: EncryptionAtRestPrivateEndpoint
//
// `EncryptionAtRestPrivateEndpoint` describes a private endpoint used for encryption at rest using customer-managed keys.
//
// ## Example Usage
//
// ### S
//
// > **NOTE:** Only Azure Key Vault with Azure Private Link and AWS KMS over AWS PrivateLink is supported at this time.
//
// ### Encryption At Rest Azure Key Vault Private Endpoint
// To learn more, see [Manage Customer Keys with Azure Key Vault Over Private Endpoints](https://www.mongodb.com/docs/atlas/security/azure-kms-over-private-endpoint/#manage-customer-keys-with-azure-key-vault-over-private-endpoints).
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
//			single, err := mongodbatlas.LookupEncryptionAtRestPrivateEndpoint(ctx, &mongodbatlas.LookupEncryptionAtRestPrivateEndpointArgs{
//				ProjectId:     atlasProjectId,
//				CloudProvider: "AZURE",
//				Id:            endpoint.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("endpointConnectionName", single.PrivateEndpointConnectionName)
//			return nil
//		})
//	}
//
// ```
//
// ### Encryption At Rest AWS KMS Private Endpoint
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
//			single, err := mongodbatlas.LookupEncryptionAtRestPrivateEndpoint(ctx, &mongodbatlas.LookupEncryptionAtRestPrivateEndpointArgs{
//				ProjectId:     atlasProjectId,
//				CloudProvider: "AWS",
//				Id:            endpoint.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("status", single.Status)
//			return nil
//		})
//	}
//
// ```
func LookupEncryptionAtRestPrivateEndpoint(ctx *pulumi.Context, args *LookupEncryptionAtRestPrivateEndpointArgs, opts ...pulumi.InvokeOption) (*LookupEncryptionAtRestPrivateEndpointResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEncryptionAtRestPrivateEndpointResult
	err := ctx.Invoke("mongodbatlas:index/getEncryptionAtRestPrivateEndpoint:getEncryptionAtRestPrivateEndpoint", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEncryptionAtRestPrivateEndpoint.
type LookupEncryptionAtRestPrivateEndpointArgs struct {
	// Label that identifies the cloud provider for the Encryption At Rest private endpoint.
	CloudProvider string `pulumi:"cloudProvider"`
	// Unique 24-hexadecimal digit string that identifies the Private Endpoint Service.
	Id string `pulumi:"id"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getEncryptionAtRestPrivateEndpoint.
type LookupEncryptionAtRestPrivateEndpointResult struct {
	// Label that identifies the cloud provider for the Encryption At Rest private endpoint.
	CloudProvider string `pulumi:"cloudProvider"`
	// Error message for failures associated with the Encryption At Rest private endpoint.
	ErrorMessage string `pulumi:"errorMessage"`
	// Unique 24-hexadecimal digit string that identifies the Private Endpoint Service.
	Id string `pulumi:"id"`
	// Connection name of the Azure Private Endpoint.
	PrivateEndpointConnectionName string `pulumi:"privateEndpointConnectionName"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
	// Cloud provider region in which the Encryption At Rest private endpoint is located.
	RegionName string `pulumi:"regionName"`
	// State of the Encryption At Rest private endpoint.
	Status string `pulumi:"status"`
}

func LookupEncryptionAtRestPrivateEndpointOutput(ctx *pulumi.Context, args LookupEncryptionAtRestPrivateEndpointOutputArgs, opts ...pulumi.InvokeOption) LookupEncryptionAtRestPrivateEndpointResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupEncryptionAtRestPrivateEndpointResultOutput, error) {
			args := v.(LookupEncryptionAtRestPrivateEndpointArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getEncryptionAtRestPrivateEndpoint:getEncryptionAtRestPrivateEndpoint", args, LookupEncryptionAtRestPrivateEndpointResultOutput{}, options).(LookupEncryptionAtRestPrivateEndpointResultOutput), nil
		}).(LookupEncryptionAtRestPrivateEndpointResultOutput)
}

// A collection of arguments for invoking getEncryptionAtRestPrivateEndpoint.
type LookupEncryptionAtRestPrivateEndpointOutputArgs struct {
	// Label that identifies the cloud provider for the Encryption At Rest private endpoint.
	CloudProvider pulumi.StringInput `pulumi:"cloudProvider"`
	// Unique 24-hexadecimal digit string that identifies the Private Endpoint Service.
	Id pulumi.StringInput `pulumi:"id"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupEncryptionAtRestPrivateEndpointOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEncryptionAtRestPrivateEndpointArgs)(nil)).Elem()
}

// A collection of values returned by getEncryptionAtRestPrivateEndpoint.
type LookupEncryptionAtRestPrivateEndpointResultOutput struct{ *pulumi.OutputState }

func (LookupEncryptionAtRestPrivateEndpointResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEncryptionAtRestPrivateEndpointResult)(nil)).Elem()
}

func (o LookupEncryptionAtRestPrivateEndpointResultOutput) ToLookupEncryptionAtRestPrivateEndpointResultOutput() LookupEncryptionAtRestPrivateEndpointResultOutput {
	return o
}

func (o LookupEncryptionAtRestPrivateEndpointResultOutput) ToLookupEncryptionAtRestPrivateEndpointResultOutputWithContext(ctx context.Context) LookupEncryptionAtRestPrivateEndpointResultOutput {
	return o
}

// Label that identifies the cloud provider for the Encryption At Rest private endpoint.
func (o LookupEncryptionAtRestPrivateEndpointResultOutput) CloudProvider() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEncryptionAtRestPrivateEndpointResult) string { return v.CloudProvider }).(pulumi.StringOutput)
}

// Error message for failures associated with the Encryption At Rest private endpoint.
func (o LookupEncryptionAtRestPrivateEndpointResultOutput) ErrorMessage() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEncryptionAtRestPrivateEndpointResult) string { return v.ErrorMessage }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies the Private Endpoint Service.
func (o LookupEncryptionAtRestPrivateEndpointResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEncryptionAtRestPrivateEndpointResult) string { return v.Id }).(pulumi.StringOutput)
}

// Connection name of the Azure Private Endpoint.
func (o LookupEncryptionAtRestPrivateEndpointResultOutput) PrivateEndpointConnectionName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEncryptionAtRestPrivateEndpointResult) string { return v.PrivateEndpointConnectionName }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies your project.
func (o LookupEncryptionAtRestPrivateEndpointResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEncryptionAtRestPrivateEndpointResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Cloud provider region in which the Encryption At Rest private endpoint is located.
func (o LookupEncryptionAtRestPrivateEndpointResultOutput) RegionName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEncryptionAtRestPrivateEndpointResult) string { return v.RegionName }).(pulumi.StringOutput)
}

// State of the Encryption At Rest private endpoint.
func (o LookupEncryptionAtRestPrivateEndpointResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEncryptionAtRestPrivateEndpointResult) string { return v.Status }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEncryptionAtRestPrivateEndpointResultOutput{})
}
