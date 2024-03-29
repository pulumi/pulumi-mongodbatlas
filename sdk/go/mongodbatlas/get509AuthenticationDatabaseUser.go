// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `X509AuthenticationDatabaseUser` describe a X509 Authentication Database User. This represents a X509 Authentication Database User.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
//
// ## Example Usage
//
// ### S
//
// Deprecated: mongodbatlas.index/get509authenticationdatabaseuser.get509AuthenticationDatabaseUser has been deprecated in favor of mongodbatlas.index/getx509authenticationdatabaseuser.getX509AuthenticationDatabaseUser
func Get509AuthenticationDatabaseUser(ctx *pulumi.Context, args *Get509AuthenticationDatabaseUserArgs, opts ...pulumi.InvokeOption) (*Get509AuthenticationDatabaseUserResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv Get509AuthenticationDatabaseUserResult
	err := ctx.Invoke("mongodbatlas:index/get509AuthenticationDatabaseUser:get509AuthenticationDatabaseUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking get509AuthenticationDatabaseUser.
type Get509AuthenticationDatabaseUserArgs struct {
	// Identifier for the Atlas project associated with the X.509 configuration.
	ProjectId string `pulumi:"projectId"`
	// Username of the database user to create a certificate for.
	Username *string `pulumi:"username"`
}

// A collection of values returned by get509AuthenticationDatabaseUser.
type Get509AuthenticationDatabaseUserResult struct {
	// Array of objects where each details one unexpired database user certificate.
	Certificates    []Get509AuthenticationDatabaseUserCertificate `pulumi:"certificates"`
	CustomerX509Cas string                                        `pulumi:"customerX509Cas"`
	// The provider-assigned unique ID for this managed resource.
	Id        string  `pulumi:"id"`
	ProjectId string  `pulumi:"projectId"`
	Username  *string `pulumi:"username"`
}

func Get509AuthenticationDatabaseUserOutput(ctx *pulumi.Context, args Get509AuthenticationDatabaseUserOutputArgs, opts ...pulumi.InvokeOption) Get509AuthenticationDatabaseUserResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (Get509AuthenticationDatabaseUserResult, error) {
			args := v.(Get509AuthenticationDatabaseUserArgs)
			r, err := Get509AuthenticationDatabaseUser(ctx, &args, opts...)
			var s Get509AuthenticationDatabaseUserResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(Get509AuthenticationDatabaseUserResultOutput)
}

// A collection of arguments for invoking get509AuthenticationDatabaseUser.
type Get509AuthenticationDatabaseUserOutputArgs struct {
	// Identifier for the Atlas project associated with the X.509 configuration.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
	// Username of the database user to create a certificate for.
	Username pulumi.StringPtrInput `pulumi:"username"`
}

func (Get509AuthenticationDatabaseUserOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*Get509AuthenticationDatabaseUserArgs)(nil)).Elem()
}

// A collection of values returned by get509AuthenticationDatabaseUser.
type Get509AuthenticationDatabaseUserResultOutput struct{ *pulumi.OutputState }

func (Get509AuthenticationDatabaseUserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Get509AuthenticationDatabaseUserResult)(nil)).Elem()
}

func (o Get509AuthenticationDatabaseUserResultOutput) ToGet509AuthenticationDatabaseUserResultOutput() Get509AuthenticationDatabaseUserResultOutput {
	return o
}

func (o Get509AuthenticationDatabaseUserResultOutput) ToGet509AuthenticationDatabaseUserResultOutputWithContext(ctx context.Context) Get509AuthenticationDatabaseUserResultOutput {
	return o
}

// Array of objects where each details one unexpired database user certificate.
func (o Get509AuthenticationDatabaseUserResultOutput) Certificates() Get509AuthenticationDatabaseUserCertificateArrayOutput {
	return o.ApplyT(func(v Get509AuthenticationDatabaseUserResult) []Get509AuthenticationDatabaseUserCertificate {
		return v.Certificates
	}).(Get509AuthenticationDatabaseUserCertificateArrayOutput)
}

func (o Get509AuthenticationDatabaseUserResultOutput) CustomerX509Cas() pulumi.StringOutput {
	return o.ApplyT(func(v Get509AuthenticationDatabaseUserResult) string { return v.CustomerX509Cas }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o Get509AuthenticationDatabaseUserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v Get509AuthenticationDatabaseUserResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o Get509AuthenticationDatabaseUserResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v Get509AuthenticationDatabaseUserResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o Get509AuthenticationDatabaseUserResultOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v Get509AuthenticationDatabaseUserResult) *string { return v.Username }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(Get509AuthenticationDatabaseUserResultOutput{})
}
