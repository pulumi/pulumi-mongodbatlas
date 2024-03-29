package shim

import (
	"github.com/hashicorp/terraform-plugin-framework/provider"
	"github.com/hashicorp/terraform-plugin-sdk/v2/helper/schema"

	p "github.com/mongodb/terraform-provider-mongodbatlas/internal/provider"
)

func FrameworkProvider() provider.Provider { return p.NewFrameworkProvider(nil) }

func SDKProvider() *schema.Provider { return p.NewSdkV2Provider(nil) }
