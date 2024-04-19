// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `LdapConfiguration` describes a LDAP Configuration.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
//
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
//			testProject, err := mongodbatlas.NewProject(ctx, "test", &mongodbatlas.ProjectArgs{
//				Name:  pulumi.String("NAME OF THE PROJECT"),
//				OrgId: pulumi.String("ORG ID"),
//			})
//			if err != nil {
//				return err
//			}
//			testLdapConfiguration, err := mongodbatlas.NewLdapConfiguration(ctx, "test", &mongodbatlas.LdapConfigurationArgs{
//				ProjectId:             testProject.ID(),
//				AuthenticationEnabled: pulumi.Bool(true),
//				Hostname:              pulumi.String("HOSTNAME"),
//				Port:                  pulumi.Int(636),
//				BindUsername:          pulumi.String("USERNAME"),
//				BindPassword:          pulumi.String("PASSWORD"),
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupLdapConfigurationOutput(ctx, mongodbatlas.GetLdapConfigurationOutputArgs{
//				ProjectId: testLdapConfiguration.ID(),
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupLdapConfiguration(ctx *pulumi.Context, args *LookupLdapConfigurationArgs, opts ...pulumi.InvokeOption) (*LookupLdapConfigurationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupLdapConfigurationResult
	err := ctx.Invoke("mongodbatlas:index/getLdapConfiguration:getLdapConfiguration", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLdapConfiguration.
type LookupLdapConfigurationArgs struct {
	// Identifier for the Atlas project associated with the LDAP over TLS/SSL configuration.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getLdapConfiguration.
type LookupLdapConfigurationResult struct {
	// Specifies whether user authentication with LDAP is enabled.
	AuthenticationEnabled bool `pulumi:"authenticationEnabled"`
	// Specifies whether user authorization with LDAP is enabled.
	AuthorizationEnabled bool `pulumi:"authorizationEnabled"`
	// An LDAP query template that Atlas executes to obtain the LDAP groups to which the authenticated user belongs.
	AuthzQueryTemplate string `pulumi:"authzQueryTemplate"`
	// The password used to authenticate the `bindUsername`.
	BindPassword string `pulumi:"bindPassword"`
	// The user DN that Atlas uses to connect to the LDAP server.
	BindUsername string `pulumi:"bindUsername"`
	// CA certificate used to verify the identify of the LDAP server.
	CaCertificate string `pulumi:"caCertificate"`
	// (Required) The hostname or IP address of the LDAP server.
	Hostname string `pulumi:"hostname"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The port to which the LDAP server listens for client connections.
	Port      int    `pulumi:"port"`
	ProjectId string `pulumi:"projectId"`
	// Maps an LDAP username for authentication to an LDAP Distinguished Name (DN).
	UserToDnMappings []GetLdapConfigurationUserToDnMapping `pulumi:"userToDnMappings"`
}

func LookupLdapConfigurationOutput(ctx *pulumi.Context, args LookupLdapConfigurationOutputArgs, opts ...pulumi.InvokeOption) LookupLdapConfigurationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupLdapConfigurationResult, error) {
			args := v.(LookupLdapConfigurationArgs)
			r, err := LookupLdapConfiguration(ctx, &args, opts...)
			var s LookupLdapConfigurationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupLdapConfigurationResultOutput)
}

// A collection of arguments for invoking getLdapConfiguration.
type LookupLdapConfigurationOutputArgs struct {
	// Identifier for the Atlas project associated with the LDAP over TLS/SSL configuration.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupLdapConfigurationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLdapConfigurationArgs)(nil)).Elem()
}

// A collection of values returned by getLdapConfiguration.
type LookupLdapConfigurationResultOutput struct{ *pulumi.OutputState }

func (LookupLdapConfigurationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLdapConfigurationResult)(nil)).Elem()
}

func (o LookupLdapConfigurationResultOutput) ToLookupLdapConfigurationResultOutput() LookupLdapConfigurationResultOutput {
	return o
}

func (o LookupLdapConfigurationResultOutput) ToLookupLdapConfigurationResultOutputWithContext(ctx context.Context) LookupLdapConfigurationResultOutput {
	return o
}

// Specifies whether user authentication with LDAP is enabled.
func (o LookupLdapConfigurationResultOutput) AuthenticationEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupLdapConfigurationResult) bool { return v.AuthenticationEnabled }).(pulumi.BoolOutput)
}

// Specifies whether user authorization with LDAP is enabled.
func (o LookupLdapConfigurationResultOutput) AuthorizationEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupLdapConfigurationResult) bool { return v.AuthorizationEnabled }).(pulumi.BoolOutput)
}

// An LDAP query template that Atlas executes to obtain the LDAP groups to which the authenticated user belongs.
func (o LookupLdapConfigurationResultOutput) AuthzQueryTemplate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLdapConfigurationResult) string { return v.AuthzQueryTemplate }).(pulumi.StringOutput)
}

// The password used to authenticate the `bindUsername`.
func (o LookupLdapConfigurationResultOutput) BindPassword() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLdapConfigurationResult) string { return v.BindPassword }).(pulumi.StringOutput)
}

// The user DN that Atlas uses to connect to the LDAP server.
func (o LookupLdapConfigurationResultOutput) BindUsername() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLdapConfigurationResult) string { return v.BindUsername }).(pulumi.StringOutput)
}

// CA certificate used to verify the identify of the LDAP server.
func (o LookupLdapConfigurationResultOutput) CaCertificate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLdapConfigurationResult) string { return v.CaCertificate }).(pulumi.StringOutput)
}

// (Required) The hostname or IP address of the LDAP server.
func (o LookupLdapConfigurationResultOutput) Hostname() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLdapConfigurationResult) string { return v.Hostname }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupLdapConfigurationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLdapConfigurationResult) string { return v.Id }).(pulumi.StringOutput)
}

// The port to which the LDAP server listens for client connections.
func (o LookupLdapConfigurationResultOutput) Port() pulumi.IntOutput {
	return o.ApplyT(func(v LookupLdapConfigurationResult) int { return v.Port }).(pulumi.IntOutput)
}

func (o LookupLdapConfigurationResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLdapConfigurationResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Maps an LDAP username for authentication to an LDAP Distinguished Name (DN).
func (o LookupLdapConfigurationResultOutput) UserToDnMappings() GetLdapConfigurationUserToDnMappingArrayOutput {
	return o.ApplyT(func(v LookupLdapConfigurationResult) []GetLdapConfigurationUserToDnMapping { return v.UserToDnMappings }).(GetLdapConfigurationUserToDnMappingArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupLdapConfigurationResultOutput{})
}
