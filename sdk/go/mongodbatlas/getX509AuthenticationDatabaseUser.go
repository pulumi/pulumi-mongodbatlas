// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: X509AuthenticationDatabaseUser
//
// `X509AuthenticationDatabaseUser` describes a X509 Authentication Database User. This represents a X509 Authentication Database User.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
//
// ## Example Usage
//
// ### S
//
// ### Example Usage: Save a customer-managed X.509 configuration for an Atlas project
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
//			testX509AuthenticationDatabaseUser, err := mongodbatlas.NewX509AuthenticationDatabaseUser(ctx, "test", &mongodbatlas.X509AuthenticationDatabaseUserArgs{
//				ProjectId: pulumi.String("<PROJECT-ID>"),
//				CustomerX509Cas: pulumi.String(`-----BEGIN CERTIFICATE-----
//
// MIICmTCCAgICCQDZnHzklxsT9TANBgkqhkiG9w0BAQsFADCBkDELMAkGA1UEBhMC
// VVMxDjAMBgNVBAgMBVRleGFzMQ8wDQYDVQQHDAZBdXN0aW4xETAPBgNVBAoMCHRl
// c3QuY29tMQ0wCwYDVQQLDARUZXN0MREwDwYDVQQDDAh0ZXN0LmNvbTErMCkGCSqG
// SIb3DQEJARYcbWVsaXNzYS5wbHVua2V0dEBtb25nb2RiLmNvbTAeFw0yMDAyMDQy
// MDQ2MDFaFw0yMTAyMDMyMDQ2MDFaMIGQMQswCQYDVQQGEwJVUzEOMAwGA1UECAwF
// VGV4YXMxDzANBgNVBAcMBkF1c3RpbjERMA8GA1UECgwIdGVzdC5jb20xDTALBgNV
// BAsMBFRlc3QxETAPBgNVBAMMCHRlc3QuY29tMSswKQYJKoZIhvcNAQkBFhxtZWxp
// c3NhLnBsdW5rZXR0QG1vbmdvZGIuY29tMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCB
// iQKBgQCf1LRqr1zftzdYx2Aj9G76tb0noMPtj6faGLlPji1+m6Rn7RWD9L0ntWAr
// cURxvypa9jZ9MXFzDtLevvd3tHEmfrUT3ukNDX6+Jtc4kWm+Dh2A70Pd+deKZ2/O
// Fh8audEKAESGXnTbeJCeQa1XKlIkjqQHBNwES5h1b9vJtFoLJwIDAQABMA0GCSqG
// SIb3DQEBCwUAA4GBADMUncjEPV/MiZUcVNGmktP6BPmEqMXQWUDpdGW2+Tg2JtUA
// 7MMILtepBkFzLO+GlpZxeAlXO0wxiNgEmCRONgh4+t2w3e7a8GFijYQ99FHrAC5A
// iul59bdl18gVqXia1Yeq/iK7Ohfy/Jwd7Hsm530elwkM/ZEkYDjBlZSXYdyz
// -----END CERTIFICATE-----"
// `),
//
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupX509AuthenticationDatabaseUserOutput(ctx, mongodbatlas.GetX509AuthenticationDatabaseUserOutputArgs{
//				ProjectId: testX509AuthenticationDatabaseUser.ProjectId,
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupX509AuthenticationDatabaseUser(ctx *pulumi.Context, args *LookupX509AuthenticationDatabaseUserArgs, opts ...pulumi.InvokeOption) (*LookupX509AuthenticationDatabaseUserResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupX509AuthenticationDatabaseUserResult
	err := ctx.Invoke("mongodbatlas:index/getX509AuthenticationDatabaseUser:getX509AuthenticationDatabaseUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getX509AuthenticationDatabaseUser.
type LookupX509AuthenticationDatabaseUserArgs struct {
	// Identifier for the Atlas project associated with the X.509 configuration.
	ProjectId string `pulumi:"projectId"`
	// Username of the database user to create a certificate for.
	Username *string `pulumi:"username"`
}

// A collection of values returned by getX509AuthenticationDatabaseUser.
type LookupX509AuthenticationDatabaseUserResult struct {
	// Array of objects where each details one unexpired database user certificate.
	Certificates    []GetX509AuthenticationDatabaseUserCertificate `pulumi:"certificates"`
	CustomerX509Cas string                                         `pulumi:"customerX509Cas"`
	// The provider-assigned unique ID for this managed resource.
	Id        string  `pulumi:"id"`
	ProjectId string  `pulumi:"projectId"`
	Username  *string `pulumi:"username"`
}

func LookupX509AuthenticationDatabaseUserOutput(ctx *pulumi.Context, args LookupX509AuthenticationDatabaseUserOutputArgs, opts ...pulumi.InvokeOption) LookupX509AuthenticationDatabaseUserResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupX509AuthenticationDatabaseUserResultOutput, error) {
			args := v.(LookupX509AuthenticationDatabaseUserArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getX509AuthenticationDatabaseUser:getX509AuthenticationDatabaseUser", args, LookupX509AuthenticationDatabaseUserResultOutput{}, options).(LookupX509AuthenticationDatabaseUserResultOutput), nil
		}).(LookupX509AuthenticationDatabaseUserResultOutput)
}

// A collection of arguments for invoking getX509AuthenticationDatabaseUser.
type LookupX509AuthenticationDatabaseUserOutputArgs struct {
	// Identifier for the Atlas project associated with the X.509 configuration.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
	// Username of the database user to create a certificate for.
	Username pulumi.StringPtrInput `pulumi:"username"`
}

func (LookupX509AuthenticationDatabaseUserOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupX509AuthenticationDatabaseUserArgs)(nil)).Elem()
}

// A collection of values returned by getX509AuthenticationDatabaseUser.
type LookupX509AuthenticationDatabaseUserResultOutput struct{ *pulumi.OutputState }

func (LookupX509AuthenticationDatabaseUserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupX509AuthenticationDatabaseUserResult)(nil)).Elem()
}

func (o LookupX509AuthenticationDatabaseUserResultOutput) ToLookupX509AuthenticationDatabaseUserResultOutput() LookupX509AuthenticationDatabaseUserResultOutput {
	return o
}

func (o LookupX509AuthenticationDatabaseUserResultOutput) ToLookupX509AuthenticationDatabaseUserResultOutputWithContext(ctx context.Context) LookupX509AuthenticationDatabaseUserResultOutput {
	return o
}

// Array of objects where each details one unexpired database user certificate.
func (o LookupX509AuthenticationDatabaseUserResultOutput) Certificates() GetX509AuthenticationDatabaseUserCertificateArrayOutput {
	return o.ApplyT(func(v LookupX509AuthenticationDatabaseUserResult) []GetX509AuthenticationDatabaseUserCertificate {
		return v.Certificates
	}).(GetX509AuthenticationDatabaseUserCertificateArrayOutput)
}

func (o LookupX509AuthenticationDatabaseUserResultOutput) CustomerX509Cas() pulumi.StringOutput {
	return o.ApplyT(func(v LookupX509AuthenticationDatabaseUserResult) string { return v.CustomerX509Cas }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupX509AuthenticationDatabaseUserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupX509AuthenticationDatabaseUserResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupX509AuthenticationDatabaseUserResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupX509AuthenticationDatabaseUserResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o LookupX509AuthenticationDatabaseUserResultOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupX509AuthenticationDatabaseUserResult) *string { return v.Username }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupX509AuthenticationDatabaseUserResultOutput{})
}
