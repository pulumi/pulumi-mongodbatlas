module github.com/pulumi/pulumi-mongodbatlas/provider/v3

go 1.16

replace (
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20210629210550-59d24255d71f
	github.com/mongodb/terraform-provider-mongodbatlas => github.com/pulumi/terraform-provider-mongodbatlas v0.5.1-0.20220317190422-c0e974805834 // fork initiated to prevent duplicate ID from the TF plugin sdk
)

require (
	github.com/mongodb/terraform-provider-mongodbatlas v1.3.1
	//github.com/mongodb/terraform-provider-mongodbatlas v1.2.0
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.20.0
	github.com/pulumi/pulumi/sdk/v3 v3.27.0
)
