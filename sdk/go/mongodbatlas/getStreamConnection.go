// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: StreamConnection
//
// `StreamConnection` describes a stream connection.
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
//			_, err := mongodbatlas.LookupStreamConnection(ctx, &mongodbatlas.LookupStreamConnectionArgs{
//				ProjectId:      "<PROJECT_ID>",
//				InstanceName:   "<INSTANCE_NAME>",
//				ConnectionName: "<CONNECTION_NAME>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupStreamConnection(ctx *pulumi.Context, args *LookupStreamConnectionArgs, opts ...pulumi.InvokeOption) (*LookupStreamConnectionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupStreamConnectionResult
	err := ctx.Invoke("mongodbatlas:index/getStreamConnection:getStreamConnection", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStreamConnection.
type LookupStreamConnectionArgs struct {
	// Human-readable label that identifies the stream connection. In the case of the Sample type, this is the name of the sample source.
	ConnectionName string `pulumi:"connectionName"`
	// Human-readable label that identifies the stream instance.
	InstanceName string `pulumi:"instanceName"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getStreamConnection.
type LookupStreamConnectionResult struct {
	// User credentials required to connect to a Kafka cluster. Includes the authentication type, as well as the parameters for that authentication mode. See authentication.
	Authentication GetStreamConnectionAuthentication `pulumi:"authentication"`
	// Comma separated list of server addresses.
	BootstrapServers string `pulumi:"bootstrapServers"`
	// Name of the cluster configured for this connection.
	ClusterName string `pulumi:"clusterName"`
	// A map of Kafka key-value pairs for optional configuration. This is a flat object, and keys can have '.' characters.
	Config         map[string]string `pulumi:"config"`
	ConnectionName string            `pulumi:"connectionName"`
	// The name of a Built in or Custom DB Role to connect to an Atlas Cluster. See DBRoleToExecute.
	DbRoleToExecute GetStreamConnectionDbRoleToExecute `pulumi:"dbRoleToExecute"`
	Id              string                             `pulumi:"id"`
	InstanceName    string                             `pulumi:"instanceName"`
	ProjectId       string                             `pulumi:"projectId"`
	// Properties for the secure transport connection to Kafka. For SSL, this can include the trusted certificate to use. See security.
	Security GetStreamConnectionSecurity `pulumi:"security"`
	// Type of the DB role. Can be either BUILT_IN or CUSTOM.
	Type string `pulumi:"type"`
}

func LookupStreamConnectionOutput(ctx *pulumi.Context, args LookupStreamConnectionOutputArgs, opts ...pulumi.InvokeOption) LookupStreamConnectionResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupStreamConnectionResultOutput, error) {
			args := v.(LookupStreamConnectionArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getStreamConnection:getStreamConnection", args, LookupStreamConnectionResultOutput{}, options).(LookupStreamConnectionResultOutput), nil
		}).(LookupStreamConnectionResultOutput)
}

// A collection of arguments for invoking getStreamConnection.
type LookupStreamConnectionOutputArgs struct {
	// Human-readable label that identifies the stream connection. In the case of the Sample type, this is the name of the sample source.
	ConnectionName pulumi.StringInput `pulumi:"connectionName"`
	// Human-readable label that identifies the stream instance.
	InstanceName pulumi.StringInput `pulumi:"instanceName"`
	// Unique 24-hexadecimal digit string that identifies your project.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupStreamConnectionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupStreamConnectionArgs)(nil)).Elem()
}

// A collection of values returned by getStreamConnection.
type LookupStreamConnectionResultOutput struct{ *pulumi.OutputState }

func (LookupStreamConnectionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupStreamConnectionResult)(nil)).Elem()
}

func (o LookupStreamConnectionResultOutput) ToLookupStreamConnectionResultOutput() LookupStreamConnectionResultOutput {
	return o
}

func (o LookupStreamConnectionResultOutput) ToLookupStreamConnectionResultOutputWithContext(ctx context.Context) LookupStreamConnectionResultOutput {
	return o
}

// User credentials required to connect to a Kafka cluster. Includes the authentication type, as well as the parameters for that authentication mode. See authentication.
func (o LookupStreamConnectionResultOutput) Authentication() GetStreamConnectionAuthenticationOutput {
	return o.ApplyT(func(v LookupStreamConnectionResult) GetStreamConnectionAuthentication { return v.Authentication }).(GetStreamConnectionAuthenticationOutput)
}

// Comma separated list of server addresses.
func (o LookupStreamConnectionResultOutput) BootstrapServers() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamConnectionResult) string { return v.BootstrapServers }).(pulumi.StringOutput)
}

// Name of the cluster configured for this connection.
func (o LookupStreamConnectionResultOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamConnectionResult) string { return v.ClusterName }).(pulumi.StringOutput)
}

// A map of Kafka key-value pairs for optional configuration. This is a flat object, and keys can have '.' characters.
func (o LookupStreamConnectionResultOutput) Config() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupStreamConnectionResult) map[string]string { return v.Config }).(pulumi.StringMapOutput)
}

func (o LookupStreamConnectionResultOutput) ConnectionName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamConnectionResult) string { return v.ConnectionName }).(pulumi.StringOutput)
}

// The name of a Built in or Custom DB Role to connect to an Atlas Cluster. See DBRoleToExecute.
func (o LookupStreamConnectionResultOutput) DbRoleToExecute() GetStreamConnectionDbRoleToExecuteOutput {
	return o.ApplyT(func(v LookupStreamConnectionResult) GetStreamConnectionDbRoleToExecute { return v.DbRoleToExecute }).(GetStreamConnectionDbRoleToExecuteOutput)
}

func (o LookupStreamConnectionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamConnectionResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupStreamConnectionResultOutput) InstanceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamConnectionResult) string { return v.InstanceName }).(pulumi.StringOutput)
}

func (o LookupStreamConnectionResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamConnectionResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// Properties for the secure transport connection to Kafka. For SSL, this can include the trusted certificate to use. See security.
func (o LookupStreamConnectionResultOutput) Security() GetStreamConnectionSecurityOutput {
	return o.ApplyT(func(v LookupStreamConnectionResult) GetStreamConnectionSecurity { return v.Security }).(GetStreamConnectionSecurityOutput)
}

// Type of the DB role. Can be either BUILT_IN or CUSTOM.
func (o LookupStreamConnectionResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamConnectionResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupStreamConnectionResultOutput{})
}
