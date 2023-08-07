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

	// Enable embedding metadata
	_ "embed"

	"github.com/mongodb/terraform-provider-mongodbatlas/mongodbatlas"
	"github.com/pulumi/pulumi-mongodbatlas/provider/v3/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tks "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
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

//go:emebed cmd/pulumi-resource-mongodbatlas/bridge-metadata.json
var metadata []byte

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(mongodbatlas.Provider())

	trueValue := true
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
			"private_key": {MarkAsOptional: &trueValue},
			"public_key":  {MarkAsOptional: &trueValue},
		},
		MetadataInfo: tfbridge.NewProviderMetadata(metadata),
		Resources: map[string]*tfbridge.ResourceInfo{
			"mongodbatlas_custom_db_role": {Tok: makeResource(mainMod, "CustomDbRole")},
			"mongodbatlas_custom_dns_configuration_cluster_aws": {
				Tok: makeResource(mainMod, "CustomDnsConfigurationClusterAws"),
			},
			"mongodbatlas_database_user":         {Tok: makeResource(mainMod, "DatabaseUser")},
			"mongodbatlas_project":               {Tok: makeResource(mainMod, "Project")},
			"mongodbatlas_cluster":               {Tok: makeResource(mainMod, "Cluster")},
			"mongodbatlas_cloud_provider_access": {Tok: makeResource(mainMod, "CloudProviderAccess")},
			"mongodbatlas_cloud_backup_schedule": {Tok: makeResource(mainMod, "CloudBackupSchedule")},
			"mongodbatlas_network_container":     {Tok: makeResource(mainMod, "NetworkContainer")},
			"mongodbatlas_cloud_provider_access_authorization": {
				Tok:  makeResource(mainMod, "CloudProviderAccessAuthorization"),
				Docs: noUpstreamDocs,
			},
			"mongodbatlas_cloud_provider_access_setup": {
				Tok:  makeResource(mainMod, "CloudProviderAccessSetup"),
				Docs: noUpstreamDocs,
			},
			"mongodbatlas_network_peering":    {Tok: makeResource(mainMod, "NetworkPeering")},
			"mongodbatlas_encryption_at_rest": {Tok: makeResource(mainMod, "EncryptionAtRest")},
			"mongodbatlas_maintenance_window": {Tok: makeResource(mainMod, "MaintenanceWindow")},
			"mongodbatlas_auditing":           {Tok: makeResource(mainMod, "Auditing")},
			"mongodbatlas_team": {
				Tok:  makeResource(mainMod, "Team"),
				Docs: noUpstreamDocs,
			},
			"mongodbatlas_teams": {
				Tok:  makeResource(mainMod, "Teams"),
				Docs: noUpstreamDocs,
			},
			"mongodbatlas_global_cluster_config": {Tok: makeResource(mainMod, "GlobalClusterConfig")},
			"mongodbatlas_alert_configuration":   {Tok: makeResource(mainMod, "AlertConfiguration")},
			"mongodbatlas_x509_authentication_database_user": {
				Tok: makeResource(mainMod, "X509AuthenticationDatabaseUser"),
			},
			"mongodbatlas_project_ip_access_list":       {Tok: makeResource(mainMod, "ProjectIpAccessList")},
			"mongodbatlas_third_party_integration":      {Tok: makeResource(mainMod, "ThirdPartyIntegration")},
			"mongodbatlas_ldap_configuration":           {Tok: makeResource(mainMod, "LdapConfiguration")},
			"mongodbatlas_ldap_verify":                  {Tok: makeResource(mainMod, "LdapVerify")},
			"mongodbatlas_data_lake":                    {Tok: makeResource(mainMod, "DataLake")},
			"mongodbatlas_event_trigger":                {Tok: makeResource(mainMod, "EventTrigger")},
			"mongodbatlas_online_archive":               {Tok: makeResource(mainMod, "OnlineArchive")},
			"mongodbatlas_privatelink_endpoint":         {Tok: makeResource(mainMod, "PrivateLinkEndpoint")},
			"mongodbatlas_privatelink_endpoint_service": {Tok: makeResource(mainMod, "PrivateLinkEndpointService")},
			"mongodbatlas_search_index":                 {Tok: makeResource(mainMod, "SearchIndex")},
			"mongodbatlas_advanced_cluster":             {Tok: makeResource(mainMod, "AdvancedCluster")},
			"mongodbatlas_cloud_backup_snapshot":        {Tok: makeResource(mainMod, "CloudBackupSnapshot")},
			"mongodbatlas_cloud_backup_snapshot_export_bucket": {
				Tok: makeResource(mainMod, "CloudBackupSnapshotExportBucket"),
			},
			"mongodbatlas_cloud_backup_snapshot_export_job": {
				Tok: makeResource(mainMod, "CloudBackupSnapshotExportJob"),
			},
			"mongodbatlas_org_invitation": {Tok: makeResource(mainMod, "OrgInvitation")},
			"mongodbatlas_privatelink_endpoint_service_adl": {
				Tok: makeResource(mainMod, "PrivatelinkEndpointServiceAdl"),
			},
			"mongodbatlas_project_invitation": {Tok: makeResource(mainMod, "ProjectInvitation")},
			"mongodbatlas_federated_settings_identity_provider": {
				Tok: makeResource(mainMod, "FederatedSettingsIdentityProvider"),
			},
			"mongodbatlas_federated_settings_org_config": {
				Tok:  makeResource(mainMod, "FederatedSettingsOrgConfig"),
				Docs: noUpstreamDocs,
			},
			"mongodbatlas_federated_settings_org_role_mapping": {
				Tok: makeResource(mainMod, "FederatedSettingsOrgRoleMapping"),
			},
			"mongodbatlas_private_endpoint_regional_mode": {
				Tok: makeResource(mainMod, "PrivateEndpointRegionalMode"),
			},
			"mongodbatlas_serverless_instance": {Tok: makeResource(mainMod, "ServerlessInstance")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"mongodbatlas_custom_db_role":           {Tok: makeDataSource(mainMod, "getCustomDbRole")},
			"mongodbatlas_custom_db_roles":          {Tok: makeDataSource(mainMod, "getCustomDbRoles")},
			"mongodbatlas_database_user":            {Tok: makeDataSource(mainMod, "getDatabaseUser")},
			"mongodbatlas_database_users":           {Tok: makeDataSource(mainMod, "getDatabaseUsers")},
			"mongodbatlas_project":                  {Tok: makeDataSource(mainMod, "getProject")},
			"mongodbatlas_projects":                 {Tok: makeDataSource(mainMod, "getProjects")},
			"mongodbatlas_cluster":                  {Tok: makeDataSource(mainMod, "getCluster")},
			"mongodbatlas_clusters":                 {Tok: makeDataSource(mainMod, "getClusters")},
			"mongodbatlas_cloud_provider_snapshot":  {Tok: makeDataSource(mainMod, "getCloudProviderSnapshot")},
			"mongodbatlas_cloud_provider_snapshots": {Tok: makeDataSource(mainMod, "getCloudProviderSnapshots")},
			"mongodbatlas_cloud_provider_access_setup": {
				Tok: makeDataSource(mainMod, "getCloudProviderAccessSetup"),
			},
			"mongodbatlas_network_container":  {Tok: makeDataSource(mainMod, "getNetworkContainer")},
			"mongodbatlas_network_containers": {Tok: makeDataSource(mainMod, "getNetworkContainers")},
			"mongodbatlas_network_peering":    {Tok: makeDataSource(mainMod, "getNetworkPeering")},
			"mongodbatlas_network_peerings":   {Tok: makeDataSource(mainMod, "getNetworkPeerings")},
			"mongodbatlas_cloud_provider_snapshot_restore_jobs": {
				Tok: makeDataSource(mainMod, "getCloudProviderSnapshotRestoreJobs"),
			},
			"mongodbatlas_cloud_provider_access": {Tok: makeDataSource(mainMod, "getCloudProviderAccess")},
			"mongodbatlas_maintenance_window":    {Tok: makeDataSource(mainMod, "getMaintenanceWindow")},
			"mongodbatlas_auditing":              {Tok: makeDataSource(mainMod, "getAuditing")},
			"mongodbatlas_team": {
				Tok:  makeDataSource(mainMod, "getTeam"),
				Docs: noUpstreamDocs,
			},
			"mongodbatlas_teams": {
				Tok:  makeDataSource(mainMod, "getTeams"),
				Docs: noUpstreamDocs,
			},
			"mongodbatlas_global_cluster_config": {Tok: makeDataSource(mainMod, "getGlobalClusterConfig")},
			"mongodbatlas_alert_configuration":   {Tok: makeDataSource(mainMod, "getAlertConfiguration")},
			"mongodbatlas_x509_authentication_database_user": {
				Tok: makeDataSource(mainMod, "get509AuthenticationDatabaseUser"),
			},
			"mongodbatlas_cloud_provider_snapshot_backup_policy": {
				Tok: makeDataSource(mainMod, "getCloudProviderSnapshotBackupPolicy"),
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
			"mongodbatlas_ldap_configuration":    {Tok: makeDataSource(mainMod, "getLdapConfiguration")},
			"mongodbatlas_ldap_verify":           {Tok: makeDataSource(mainMod, "getLdapVerify")},
			"mongodbatlas_cloud_backup_schedule": {Tok: makeDataSource(mainMod, "getCloudBackupSchedule")},
			"mongodbatlas_data_lake":             {Tok: makeDataSource(mainMod, "getDataLake")},
			"mongodbatlas_data_lakes":            {Tok: makeDataSource(mainMod, "getDataLakes")},
			"mongodbatlas_event_trigger":         {Tok: makeDataSource(mainMod, "getEventTrigger")},
			"mongodbatlas_event_triggers":        {Tok: makeDataSource(mainMod, "getEventTriggers")},
			"mongodbatlas_online_archive":        {Tok: makeDataSource(mainMod, "getOnlineArchive")},
			"mongodbatlas_online_archives":       {Tok: makeDataSource(mainMod, "getOnlineArchives")},
			"mongodbatlas_search_index":          {Tok: makeDataSource(mainMod, "getSearchIndex")},
			"mongodbatlas_search_indexes":        {Tok: makeDataSource(mainMod, "getSearchIndexes")},
			"mongodbatlas_advanced_cluster":      {Tok: makeDataSource(mainMod, "getAdvancedCluster")},
			"mongodbatlas_advanced_clusters":     {Tok: makeDataSource(mainMod, "getAdvancedClusters")},
			"mongodbatlas_cloud_backup_snapshot": {Tok: makeDataSource(mainMod, "getCloudBackupSnapshot")},
			"mongodbatlas_cloud_backup_snapshot_export_bucket": {
				Tok: makeDataSource(mainMod, "getCloudBackupSnapshotExportBucket")},
			"mongodbatlas_cloud_backup_snapshot_export_buckets": {
				Tok: makeDataSource(mainMod, "getCloudBackupSnapshotExportBuckets")},
			"mongodbatlas_cloud_backup_snapshot_export_job": {
				Tok: makeDataSource(mainMod, "getCloudBackupSnapshotExportJob")},
			"mongodbatlas_cloud_backup_snapshot_export_jobs": {
				Tok: makeDataSource(mainMod, "getCloudBackupSnapshotExportJobs")},
			"mongodbatlas_cloud_backup_snapshot_restore_job": {
				Tok: makeDataSource(mainMod, "getCloudBackupSnapshotRestoreJob")},
			"mongodbatlas_cloud_backup_snapshot_restore_jobs": {
				Tok: makeDataSource(mainMod, "getCloudBackupSnapshotRestoreJobs")},
			"mongodbatlas_cloud_backup_snapshots": {Tok: makeDataSource(mainMod, "getCloudBackupSnapshots")},
			"mongodbatlas_org_invitation":         {Tok: makeDataSource(mainMod, "getOrgInvitation")},
			"mongodbatlas_privatelink_endpoint_service_adl": {
				Tok: makeDataSource(mainMod, "getPrivatelinkEndpointServiceAdl")},
			"mongodbatlas_privatelink_endpoints_service_adl": {
				Tok: makeDataSource(mainMod, "getPrivatelinkEndpointsServiceAdl")},
			"mongodbatlas_project_invitation": {Tok: makeDataSource(mainMod, "getProjectInvitation")},
			"mongodbatlas_federated_settings": {Tok: makeDataSource(mainMod, "getFederatedSettings")},
			"mongodbatlas_federated_settings_identity_provider": {
				Tok: makeDataSource(mainMod, "getFederatedSettingsIdentityProvider"),
			},
			"mongodbatlas_federated_settings_identity_providers": {
				Tok: makeDataSource(mainMod, "getFederatedSettingsIdentityProviders"),
			},
			"mongodbatlas_federated_settings_org_config": {
				Tok: makeDataSource(mainMod, "getFederatedSettingsOrgConfig"),
			},
			"mongodbatlas_federated_settings_org_configs": {
				Tok: makeDataSource(mainMod, "getFederatedSettingsOrgConfigs"),
			},
			"mongodbatlas_federated_settings_org_role_mapping": {
				Tok: makeDataSource(mainMod, "getFederatedSettingsOrgRoleMapping"),
			},
			"mongodbatlas_federated_settings_org_role_mappings": {
				Tok: makeDataSource(mainMod, "getFederatedSettingsOrgRoleMappings"),
			},
			"mongodbatlas_private_endpoint_regional_mode": {
				Tok: makeDataSource(mainMod, "getPrivateEndpointRegionalMode"),
			},
			"mongodbatlas_serverless_instance":  {Tok: makeDataSource(mainMod, "getServerlessInstance")},
			"mongodbatlas_serverless_instances": {Tok: makeDataSource(mainMod, "getServerlessInstances")},

			"mongodbatlas_shared_tier_restore_job":  {Docs: noUpstreamDocs},
			"mongodbatlas_shared_tier_restore_jobs": {Docs: noUpstreamDocs},
			"mongodbatlas_shared_tier_snapshot":     {Docs: noUpstreamDocs},
			"mongodbatlas_shared_tier_snapshots":    {Docs: noUpstreamDocs},
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
				"Pulumi": "3.*",
			},
		},
	}

	prov.MustComputeTokens(tks.SingleModule("mongodbatlas_", mainMod,
		tks.MakeStandard(mainPkg)))

	prov.SetAutonaming(255, "-")

	prov.MustApplyAutoAliases()

	return prov
}

var noUpstreamDocs = &tfbridge.DocInfo{
	Markdown: []byte(" "),
}
