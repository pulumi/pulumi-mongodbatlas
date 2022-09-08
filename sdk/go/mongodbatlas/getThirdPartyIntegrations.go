// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `getThirdPartyIntegrations` describe all Third-Party Integration Settings. This represents two Third-Party services `PAGER_DUTY` and `FLOWDOCK`
// applied across the project.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
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
//			testPagerDuty, err := mongodbatlas.NewThirdPartyIntegration(ctx, "testPagerDuty", &mongodbatlas.ThirdPartyIntegrationArgs{
//				ProjectId:  pulumi.String("<PROJECT-ID>"),
//				Type:       pulumi.String("PAGER_DUTY"),
//				ServiceKey: pulumi.String("<PAGER-DUTY-SERVICE-KEY>"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.NewThirdPartyIntegration(ctx, "testFlowdock", &mongodbatlas.ThirdPartyIntegrationArgs{
//				ProjectId: pulumi.String("<PROJECT-ID>"),
//				Type:      pulumi.String("FLOWDOCK"),
//				FlowName:  pulumi.String("<FLOW-NAME>"),
//				ApiToken:  pulumi.String("<API-TOKEN>"),
//				OrgName:   pulumi.String("<ORG-NAME>"),
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupThirdPartyIntegrationsOutput(ctx, GetThirdPartyIntegrationsOutputArgs{
//				ProjectId: testPagerDuty.ProjectId,
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupThirdPartyIntegrations(ctx *pulumi.Context, args *LookupThirdPartyIntegrationsArgs, opts ...pulumi.InvokeOption) (*LookupThirdPartyIntegrationsResult, error) {
	var rv LookupThirdPartyIntegrationsResult
	err := ctx.Invoke("mongodbatlas:index/getThirdPartyIntegrations:getThirdPartyIntegrations", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getThirdPartyIntegrations.
type LookupThirdPartyIntegrationsArgs struct {
	// The unique ID for the project to get all Third-Party service integrations
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getThirdPartyIntegrations.
type LookupThirdPartyIntegrationsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Required) ID of the Atlas project the Third-Party Service Integration belongs to.
	ProjectId string `pulumi:"projectId"`
	// A list where each represents a Third-Party service integration.
	Results []GetThirdPartyIntegrationsResult `pulumi:"results"`
}

func LookupThirdPartyIntegrationsOutput(ctx *pulumi.Context, args LookupThirdPartyIntegrationsOutputArgs, opts ...pulumi.InvokeOption) LookupThirdPartyIntegrationsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupThirdPartyIntegrationsResult, error) {
			args := v.(LookupThirdPartyIntegrationsArgs)
			r, err := LookupThirdPartyIntegrations(ctx, &args, opts...)
			var s LookupThirdPartyIntegrationsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupThirdPartyIntegrationsResultOutput)
}

// A collection of arguments for invoking getThirdPartyIntegrations.
type LookupThirdPartyIntegrationsOutputArgs struct {
	// The unique ID for the project to get all Third-Party service integrations
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupThirdPartyIntegrationsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupThirdPartyIntegrationsArgs)(nil)).Elem()
}

// A collection of values returned by getThirdPartyIntegrations.
type LookupThirdPartyIntegrationsResultOutput struct{ *pulumi.OutputState }

func (LookupThirdPartyIntegrationsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupThirdPartyIntegrationsResult)(nil)).Elem()
}

func (o LookupThirdPartyIntegrationsResultOutput) ToLookupThirdPartyIntegrationsResultOutput() LookupThirdPartyIntegrationsResultOutput {
	return o
}

func (o LookupThirdPartyIntegrationsResultOutput) ToLookupThirdPartyIntegrationsResultOutputWithContext(ctx context.Context) LookupThirdPartyIntegrationsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupThirdPartyIntegrationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationsResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required) ID of the Atlas project the Third-Party Service Integration belongs to.
func (o LookupThirdPartyIntegrationsResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationsResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// A list where each represents a Third-Party service integration.
func (o LookupThirdPartyIntegrationsResultOutput) Results() GetThirdPartyIntegrationsResultArrayOutput {
	return o.ApplyT(func(v LookupThirdPartyIntegrationsResult) []GetThirdPartyIntegrationsResult { return v.Results }).(GetThirdPartyIntegrationsResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupThirdPartyIntegrationsResultOutput{})
}
