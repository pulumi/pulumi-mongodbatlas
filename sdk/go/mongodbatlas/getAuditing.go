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

// `Auditing` describes a Auditing.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
func LookupAuditing(ctx *pulumi.Context, args *LookupAuditingArgs, opts ...pulumi.InvokeOption) (*LookupAuditingResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAuditingResult
	err := ctx.Invoke("mongodbatlas:index/getAuditing:getAuditing", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAuditing.
type LookupAuditingArgs struct {
	// The unique ID for the project to create the database user.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getAuditing.
type LookupAuditingResult struct {
	// JSON-formatted audit filter used by the project
	AuditAuthorizationSuccess bool `pulumi:"auditAuthorizationSuccess"`
	// Indicates whether the auditing system captures successful authentication attempts for audit filters using the "atype" : "authCheck" auditing event. For more information, see auditAuthorizationSuccess
	AuditFilter string `pulumi:"auditFilter"`
	// Denotes the configuration method for the audit filter. Possible values are: NONE - auditing not configured for the project.m FILTER_BUILDER - auditing configured via Atlas UI filter builderm FILTER_JSON - auditing configured via Atlas custom filter or API.
	ConfigurationType string `pulumi:"configurationType"`
	// Denotes whether or not the project associated with the {GROUP-ID} has database auditing enabled.
	Enabled bool `pulumi:"enabled"`
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	ProjectId string `pulumi:"projectId"`
}

func LookupAuditingOutput(ctx *pulumi.Context, args LookupAuditingOutputArgs, opts ...pulumi.InvokeOption) LookupAuditingResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAuditingResult, error) {
			args := v.(LookupAuditingArgs)
			r, err := LookupAuditing(ctx, &args, opts...)
			var s LookupAuditingResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAuditingResultOutput)
}

// A collection of arguments for invoking getAuditing.
type LookupAuditingOutputArgs struct {
	// The unique ID for the project to create the database user.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupAuditingOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAuditingArgs)(nil)).Elem()
}

// A collection of values returned by getAuditing.
type LookupAuditingResultOutput struct{ *pulumi.OutputState }

func (LookupAuditingResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAuditingResult)(nil)).Elem()
}

func (o LookupAuditingResultOutput) ToLookupAuditingResultOutput() LookupAuditingResultOutput {
	return o
}

func (o LookupAuditingResultOutput) ToLookupAuditingResultOutputWithContext(ctx context.Context) LookupAuditingResultOutput {
	return o
}

func (o LookupAuditingResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupAuditingResult] {
	return pulumix.Output[LookupAuditingResult]{
		OutputState: o.OutputState,
	}
}

// JSON-formatted audit filter used by the project
func (o LookupAuditingResultOutput) AuditAuthorizationSuccess() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAuditingResult) bool { return v.AuditAuthorizationSuccess }).(pulumi.BoolOutput)
}

// Indicates whether the auditing system captures successful authentication attempts for audit filters using the "atype" : "authCheck" auditing event. For more information, see auditAuthorizationSuccess
func (o LookupAuditingResultOutput) AuditFilter() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuditingResult) string { return v.AuditFilter }).(pulumi.StringOutput)
}

// Denotes the configuration method for the audit filter. Possible values are: NONE - auditing not configured for the project.m FILTER_BUILDER - auditing configured via Atlas UI filter builderm FILTER_JSON - auditing configured via Atlas custom filter or API.
func (o LookupAuditingResultOutput) ConfigurationType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuditingResult) string { return v.ConfigurationType }).(pulumi.StringOutput)
}

// Denotes whether or not the project associated with the {GROUP-ID} has database auditing enabled.
func (o LookupAuditingResultOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAuditingResult) bool { return v.Enabled }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAuditingResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuditingResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAuditingResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuditingResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAuditingResultOutput{})
}
