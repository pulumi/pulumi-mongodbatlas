module github.com/pulumi/pulumi-mongodbatlas/provider

go 1.14

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/terraform-providers/terraform-provider-mongodbatlas => github.com/pulumi/terraform-provider-mongodbatlas v0.5.1-0.20200724101150-73367f933aac
)

require (
	github.com/hashicorp/terraform-plugin-sdk v1.14.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.7.2
	github.com/pulumi/pulumi/sdk/v2 v2.9.1-0.20200821035132-629254334213
	github.com/terraform-providers/terraform-provider-mongodbatlas v0.5.0
)
