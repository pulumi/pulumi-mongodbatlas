// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package mongodbatlas

import (
	"bytes"
	"context"
	"fmt"
	"os"
	"path/filepath"
	"regexp"
	"unicode"

	// Enable embedding metadata
	_ "embed"

	mongodbatlas "github.com/mongodb/terraform-provider-mongodbatlas/shim"

	pfbridge "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tks "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfgen"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"

	"github.com/pulumi/pulumi-mongodbatlas/provider/v3/pkg/version"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "mongodbatlas"
	// modules:
	mainMod = "index" // the y module
)

func makeToken(mod, name string) string {
	lower := string(unicode.ToLower(rune(name[0]))) + name[1:]
	return fmt.Sprintf("%s:%s/%s:%s", mainPkg, mod, lower, name)
}

// makeDataSource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the data source's
// first character.
func makeDataSource(mod string, dataSource string) tokens.ModuleMember {
	return tokens.ModuleMember(makeToken(mod, dataSource))
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	return tokens.Type(makeToken(mod, res))
}

//go:embed cmd/pulumi-resource-mongodbatlas/bridge-metadata.json
var metadata []byte

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	ctx := context.Background()
	// Instantiate the Terraform provider
	p := pfbridge.MuxShimWithPF(ctx,
		shimv2.NewProvider(mongodbatlas.SDKProvider()),
		mongodbatlas.FrameworkProvider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "mongodbatlas",
		Description: "A Pulumi package for creating and managing mongodbatlas cloud resources.",
		Keywords:    []string{"pulumi", "mongodbatlas"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		Repository:  "https://github.com/pulumi/pulumi-mongodbatlas",
		GitHubOrg:   "mongodb",
		Version:     version.Version,
		Config: map[string]*tfbridge.SchemaInfo{
			"private_key": {MarkAsOptional: tfbridge.True()},
			"public_key":  {MarkAsOptional: tfbridge.True()},
		},
		MetadataInfo: tfbridge.NewProviderMetadata(metadata),
		DocRules:     &tfbridge.DocRuleInfo{EditRules: docEditRules},

		UpstreamRepoPath: "./upstream",

		Resources: map[string]*tfbridge.ResourceInfo{
			"mongodbatlas_mongodb_employee_access_grant": {
				ComputeID: tfbridge.DelegateIDField(
					"projectId",
					"mongodbatlas",
					"https://github.com/pulumi/pulumi-mongodbatlas"),
			},
			"mongodbatlas_privatelink_endpoint":         {Tok: makeResource(mainMod, "PrivateLinkEndpoint")},
			"mongodbatlas_privatelink_endpoint_service": {Tok: makeResource(mainMod, "PrivateLinkEndpointService")},

			"mongodbatlas_push_based_log_export": {
				ComputeID: tfbridge.DelegateIDField(
					"projectId",
					"mongodbatlas",
					"https://github.com/pulumi/pulumi-mongodbatlas"),
			},

			"mongodbatlas_cloud_provider_access_authorization": {Docs: noUpstreamDocs},
			"mongodbatlas_cloud_provider_access_setup":         {Docs: noUpstreamDocs},
			"mongodbatlas_team":                                {Docs: noUpstreamDocs},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"mongodbatlas_privatelink_endpoint":         {Tok: makeDataSource(mainMod, "getPrivateLinkEndpoint")},
			"mongodbatlas_privatelink_endpoint_service": {Tok: makeDataSource(mainMod, "getPrivateLinkEndpointService")},

			"mongodbatlas_shared_tier_restore_job":  {Docs: noUpstreamDocs},
			"mongodbatlas_shared_tier_restore_jobs": {Docs: noUpstreamDocs},
			"mongodbatlas_shared_tier_snapshot":     {Docs: noUpstreamDocs},
			"mongodbatlas_shared_tier_snapshots":    {Docs: noUpstreamDocs},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions

			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: (func() *tfbridge.PythonInfo {
			i := &tfbridge.PythonInfo{
				RespectSchemaVersion: true,
			}
			i.PyProject.Enabled = true
			return i
		})(),

		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
		EnableZeroDefaultSchemaVersion: true,
		EnableAccurateBridgePreview:    true,
	}

	prov.MustComputeTokens(tks.SingleModule("mongodbatlas_", mainMod,
		tks.MakeStandard(mainPkg)))

	prov.SetAutonaming(255, "-")

	prov.MustApplyAutoAliases()

	return prov
}

func docEditRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	edits := []tfbridge.DocsEdit{
		// These sections would trigger other edit rules so they must run first for discovery.
		cleanUpOverviewSection,
	}
	edits = append(edits,
		defaults...,
	)
	return append(
		edits,
		skipSections(),
	)
}

// Removes a set of sections not applicable to Pulumi
func skipSections() tfbridge.DocsEdit {
	headersRegexps := []*regexp.Regexp{
		regexp.MustCompile("Compatibility Matrix"),
		regexp.MustCompile("Supported OS and Architectures"),
		regexp.MustCompile("Helpful Links/Information"),
		regexp.MustCompile("Examples from MongoDB and the Community"),
		regexp.MustCompile("MongoDB Atlas Modules"),
	}
	return tfbridge.DocsEdit{
		Path: "index.md",
		Edit: func(_ string, content []byte) ([]byte, error) {
			return tfgen.SkipSectionByHeaderContent(content, func(headerText string) bool {
				for _, header := range headersRegexps {
					if header.Match([]byte(headerText)) {
						return true
					}
				}
				return false
			})
		},
	}
}

var cleanUpOverviewSection = tfbridge.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		replacesDir := "provider/index-md-replaces/"

		input, err := os.ReadFile(replacesDir + "overview-input.md")
		if err != nil {
			return nil, err
		}
		if bytes.Contains(content, input) {
			content = bytes.ReplaceAll(
				content,
				input,
				nil)
		} else {
			// Hard error to ensure we keep this content up to date
			return nil, fmt.Errorf("could not find text in upstream index.md, "+
				"please verify file content at %s\n*****\n%s\n*****\n", replacesDir+"overview-input.md", string(input))
		}
		return content, nil
	},
}

var noUpstreamDocs = &tfbridge.DocInfo{AllowMissing: true}
