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
	"fmt"
	"path/filepath"
	"unicode"

	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/mongodb/terraform-provider-mongodbatlas/mongodbatlas"
	"github.com/pulumi/pulumi-mongodbatlas/provider/v2/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shimv1 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v1"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "mongodbatlas"
	// modules:
	mainMod = "index" // the y module
)

// makeMember manufactures a type token for the package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeDataSource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the data source's
// first character.
func makeDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeMember(mod+"/"+fn, res)
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv1.NewProvider(mongodbatlas.Provider().(*schema.Provider))

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
		Config:      map[string]*tfbridge.SchemaInfo{},
		Resources: map[string]*tfbridge.ResourceInfo{
			"mongodbatlas_custom_db_role": {Tok: makeResource(mainMod, "CustomDbRole")},
			"mongodbatlas_custom_dns_configuration_cluster_aws": {
				Tok: makeResource(mainMod, "CustomDnsConfigurationClusterAws"),
			},
			"mongodbatlas_database_user":           {Tok: makeResource(mainMod, "DatabaseUser")},
			"mongodbatlas_project_ip_whitelist":    {Tok: makeResource(mainMod, "ProjectIpWhitelist")},
			"mongodbatlas_project":                 {Tok: makeResource(mainMod, "Project")},
			"mongodbatlas_cluster":                 {Tok: makeResource(mainMod, "Cluster")},
			"mongodbatlas_cloud_provider_snapshot": {Tok: makeResource(mainMod, "CloudProviderSnapshot")},
			"mongodbatlas_cloud_provider_access":   {Tok: makeResource(mainMod, "CloudProviderAccess")},
			"mongodbatlas_network_container":       {Tok: makeResource(mainMod, "NetworkContainer")},
			"mongodbatlas_cloud_provider_snapshot_restore_job": {
				Tok: makeResource(mainMod, "CloudProviderSnapshotRestoreJob"),
			},
			"mongodbatlas_cloud_provider_access_authorization": {
				Tok: makeResource(mainMod, "CloudProviderAccessAuthorization"),
			},
			"mongodbatlas_cloud_provider_access_setup": {
				Tok: makeResource(mainMod, "CloudProviderAccessSetup"),
			},
			"mongodbatlas_network_peering":       {Tok: makeResource(mainMod, "NetworkPeering")},
			"mongodbatlas_encryption_at_rest":    {Tok: makeResource(mainMod, "EncryptionAtRest")},
			"mongodbatlas_private_ip_mode":       {Tok: makeResource(mainMod, "PrivateIpMode")},
			"mongodbatlas_maintenance_window":    {Tok: makeResource(mainMod, "MaintenanceWindow")},
			"mongodbatlas_auditing":              {Tok: makeResource(mainMod, "Auditing")},
			"mongodbatlas_team":                  {Tok: makeResource(mainMod, "Team")},
			"mongodbatlas_teams":                 {Tok: makeResource(mainMod, "Teams")},
			"mongodbatlas_global_cluster_config": {Tok: makeResource(mainMod, "GlobalClusterConfig")},
			"mongodbatlas_alert_configuration":   {Tok: makeResource(mainMod, "AlertConfiguration")},
			"mongodbatlas_x509_authentication_database_user": {
				Tok: makeResource(mainMod, "X509AuthenticationDatabaseUser"),
			},
			"mongodbatlas_private_endpoint": {Tok: makeResource(mainMod, "PrivateEndpoint")},
			"mongodbatlas_private_endpoint_interface_link": {
				Tok: makeResource(mainMod, "PrivateEndpointInterfaceLink"),
			},
			"mongodbatlas_cloud_provider_snapshot_backup_policy": {
				Tok: makeResource(mainMod, "CloudProviderSnapshotBackupPolicy"),
			},
			"mongodbatlas_privatelink_endpoint":         {Tok: makeResource(mainMod, "PrivateLinkEndpoint")},
			"mongodbatlas_privatelink_endpoint_service": {Tok: makeResource(mainMod, "PrivateLinkEndpointService")},
			"mongodbatlas_project_ip_access_list":       {Tok: makeResource(mainMod, "ProjectIpAccessList")},
			"mongodbatlas_third_party_integration":      {Tok: makeResource(mainMod, "ThirdPartyIntegration")},
			"mongodbatlas_ldap_configuration":           {Tok: makeResource(mainMod, "LdapConfiguration")},
			"mongodbatlas_ldap_verify":                  {Tok: makeResource(mainMod, "LdapVerify")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"mongodbatlas_custom_db_role":              {Tok: makeDataSource(mainMod, "getCustomDbRole")},
			"mongodbatlas_custom_db_roles":             {Tok: makeDataSource(mainMod, "getCustomDbRoles")},
			"mongodbatlas_database_user":               {Tok: makeDataSource(mainMod, "getDatabaseUser")},
			"mongodbatlas_database_users":              {Tok: makeDataSource(mainMod, "getDatabaseUsers")},
			"mongodbatlas_project":                     {Tok: makeDataSource(mainMod, "getProject")},
			"mongodbatlas_projects":                    {Tok: makeDataSource(mainMod, "getProjects")},
			"mongodbatlas_cluster":                     {Tok: makeDataSource(mainMod, "getCluster")},
			"mongodbatlas_clusters":                    {Tok: makeDataSource(mainMod, "getClusters")},
			"mongodbatlas_cloud_provider_snapshot":     {Tok: makeDataSource(mainMod, "getCloudProviderSnapshot")},
			"mongodbatlas_cloud_provider_snapshots":    {Tok: makeDataSource(mainMod, "getCloudProviderSnapshots")},
			"mongodbatlas_cloud_provider_access_setup": {Tok: makeDataSource(mainMod, "getCloudProviderAccessSetup")},
			"mongodbatlas_network_container":           {Tok: makeDataSource(mainMod, "getNetworkContainer")},
			"mongodbatlas_network_containers":          {Tok: makeDataSource(mainMod, "getNetworkContainers")},
			"mongodbatlas_network_peering":             {Tok: makeDataSource(mainMod, "getNetworkPeering")},
			"mongodbatlas_network_peerings":            {Tok: makeDataSource(mainMod, "getNetworkPeerings")},
			"mongodbatlas_cloud_provider_snapshot_restore_job": {
				Tok: makeDataSource(mainMod, "getCloudProviderSnapshotRestoreJob"),
			},
			"mongodbatlas_cloud_provider_snapshot_restore_jobs": {
				Tok: makeDataSource(mainMod, "getCloudProviderSnapshotRestoreJobs"),
			},
			"mongodbatlas_cloud_provider_access": {Tok: makeDataSource(mainMod, "getCloudProviderAccess")},
			"mongodbatlas_maintenance_window":    {Tok: makeDataSource(mainMod, "getMaintenanceWindow")},
			"mongodbatlas_auditing":              {Tok: makeDataSource(mainMod, "getAuditing")},
			"mongodbatlas_team":                  {Tok: makeDataSource(mainMod, "getTeam")},
			"mongodbatlas_teams":                 {Tok: makeDataSource(mainMod, "getTeams")},
			"mongodbatlas_global_cluster_config": {Tok: makeDataSource(mainMod, "getGlobalClusterConfig")},
			"mongodbatlas_alert_configuration":   {Tok: makeDataSource(mainMod, "getAlertConfiguration")},
			"mongodbatlas_x509_authentication_database_user": {
				Tok: makeDataSource(mainMod, "get509AuthenticationDatabaseUser"),
			},
			"mongodbatlas_private_endpoint": {Tok: makeDataSource(mainMod, "getPrivateEndpoint")},
			"mongodbatlas_private_endpoint_interface_link": {
				Tok: makeDataSource(mainMod, "getPrivateEndpointInterfaceLink"),
			},
			"mongodbatlas_cloud_provider_snapshot_backup_policy": {
				Tok: makeDataSource(mainMod, "getCloudProviderSnapshotBackupPolicy"),
			},
			"mongodbatlas_project_ip_whitelist": {
				Tok: makeDataSource(mainMod, "getProjectIpWhitelist"),
			},
			"mongodbatlas_privatelink_endpoint": {Tok: makeDataSource(mainMod, "getPrivateLinkEndpoint")},
			"mongodbatlas_privatelink_endpoint_service": {
				Tok: makeDataSource(mainMod, "getPrivateLinkEndpointService"),
			},
			"mongodbatlas_project_ip_access_list":   {Tok: makeDataSource(mainMod, "getProjectIpAccessList")},
			"mongodbatlas_third_party_integration":  {Tok: makeDataSource(mainMod, "getThirdPartyIntegration")},
			"mongodbatlas_third_party_integrations": {Tok: makeDataSource(mainMod, "getThirdPartyIntegrations")},
			"mongodbatlas_custom_dns_configuration_cluster_aws": {
				Tok: makeDataSource(mainMod, "getCustomDnsConfigurationClusterAws"),
			},
			"mongodbatlas_ldap_configuration": {Tok: makeDataSource(mainMod, "getLdapConfiguration")},
			"mongodbatlas_ldap_verify":        {Tok: makeDataSource(mainMod, "getLdapVerify")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "3.*",
				"System.Collections.Immutable": "1.6.0",
			},
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
