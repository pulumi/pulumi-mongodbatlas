module github.com/pulumi/pulumi-mongodbatlas/provider/v2

go 1.16

replace github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0

require (
	github.com/hashicorp/terraform-plugin-sdk v1.14.0
	github.com/mongodb/terraform-provider-mongodbatlas v0.9.0
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.0.0
	github.com/pulumi/pulumi/pkg/v3 v3.0.0
	github.com/pulumi/pulumi/sdk/v3 v3.0.0
)
