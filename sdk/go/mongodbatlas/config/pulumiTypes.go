// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type AssumeRole struct {
	Duration *string `pulumi:"duration"`
	// Deprecated: Use assume_role.duration instead
	DurationSeconds   *int              `pulumi:"durationSeconds"`
	ExternalId        *string           `pulumi:"externalId"`
	Policy            *string           `pulumi:"policy"`
	PolicyArns        []string          `pulumi:"policyArns"`
	RoleArn           *string           `pulumi:"roleArn"`
	SessionName       *string           `pulumi:"sessionName"`
	SourceIdentity    *string           `pulumi:"sourceIdentity"`
	Tags              map[string]string `pulumi:"tags"`
	TransitiveTagKeys []string          `pulumi:"transitiveTagKeys"`
}

// AssumeRoleInput is an input type that accepts AssumeRoleArgs and AssumeRoleOutput values.
// You can construct a concrete instance of `AssumeRoleInput` via:
//
//	AssumeRoleArgs{...}
type AssumeRoleInput interface {
	pulumi.Input

	ToAssumeRoleOutput() AssumeRoleOutput
	ToAssumeRoleOutputWithContext(context.Context) AssumeRoleOutput
}

type AssumeRoleArgs struct {
	Duration pulumi.StringPtrInput `pulumi:"duration"`
	// Deprecated: Use assume_role.duration instead
	DurationSeconds   pulumi.IntPtrInput      `pulumi:"durationSeconds"`
	ExternalId        pulumi.StringPtrInput   `pulumi:"externalId"`
	Policy            pulumi.StringPtrInput   `pulumi:"policy"`
	PolicyArns        pulumi.StringArrayInput `pulumi:"policyArns"`
	RoleArn           pulumi.StringPtrInput   `pulumi:"roleArn"`
	SessionName       pulumi.StringPtrInput   `pulumi:"sessionName"`
	SourceIdentity    pulumi.StringPtrInput   `pulumi:"sourceIdentity"`
	Tags              pulumi.StringMapInput   `pulumi:"tags"`
	TransitiveTagKeys pulumi.StringArrayInput `pulumi:"transitiveTagKeys"`
}

func (AssumeRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*AssumeRole)(nil)).Elem()
}

func (i AssumeRoleArgs) ToAssumeRoleOutput() AssumeRoleOutput {
	return i.ToAssumeRoleOutputWithContext(context.Background())
}

func (i AssumeRoleArgs) ToAssumeRoleOutputWithContext(ctx context.Context) AssumeRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssumeRoleOutput)
}

type AssumeRoleOutput struct{ *pulumi.OutputState }

func (AssumeRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AssumeRole)(nil)).Elem()
}

func (o AssumeRoleOutput) ToAssumeRoleOutput() AssumeRoleOutput {
	return o
}

func (o AssumeRoleOutput) ToAssumeRoleOutputWithContext(ctx context.Context) AssumeRoleOutput {
	return o
}

func (o AssumeRoleOutput) Duration() pulumi.StringPtrOutput {
	return o.ApplyT(func(v AssumeRole) *string { return v.Duration }).(pulumi.StringPtrOutput)
}

// Deprecated: Use assume_role.duration instead
func (o AssumeRoleOutput) DurationSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v AssumeRole) *int { return v.DurationSeconds }).(pulumi.IntPtrOutput)
}

func (o AssumeRoleOutput) ExternalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v AssumeRole) *string { return v.ExternalId }).(pulumi.StringPtrOutput)
}

func (o AssumeRoleOutput) Policy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v AssumeRole) *string { return v.Policy }).(pulumi.StringPtrOutput)
}

func (o AssumeRoleOutput) PolicyArns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v AssumeRole) []string { return v.PolicyArns }).(pulumi.StringArrayOutput)
}

func (o AssumeRoleOutput) RoleArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v AssumeRole) *string { return v.RoleArn }).(pulumi.StringPtrOutput)
}

func (o AssumeRoleOutput) SessionName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v AssumeRole) *string { return v.SessionName }).(pulumi.StringPtrOutput)
}

func (o AssumeRoleOutput) SourceIdentity() pulumi.StringPtrOutput {
	return o.ApplyT(func(v AssumeRole) *string { return v.SourceIdentity }).(pulumi.StringPtrOutput)
}

func (o AssumeRoleOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v AssumeRole) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func (o AssumeRoleOutput) TransitiveTagKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v AssumeRole) []string { return v.TransitiveTagKeys }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AssumeRoleInput)(nil)).Elem(), AssumeRoleArgs{})
	pulumi.RegisterOutputType(AssumeRoleOutput{})
}
