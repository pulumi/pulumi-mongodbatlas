module github.com/pulumi/pulumi-mongodbatlas/provider/v3

go 1.16

replace (
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20210629210550-59d24255d71f
	// We are using a fork temporarily (hopefully) due to an extra "id" property on data source
	// "mongodbatlas_cloud_backup_snapshot_export_bucket". We will submit a PR to fix the issue upstream. If accepted, the fork
	// can once again be removed:
	// TODO: Add link to PR in upstream provider once we submit
	github.com/mongodb/terraform-provider-mongodbatlas => github.com/pulumi/terraform-provider-mongodbatlas v0.5.1-0.20220314211453-da7fd9ff0c45
)

require (
	github.com/mongodb/terraform-provider-mongodbatlas v1.3.0
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.19.3
	github.com/pulumi/pulumi/sdk/v3 v3.25.0
)
