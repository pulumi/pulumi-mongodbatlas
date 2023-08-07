# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from .access_list_api_key import *
from .advanced_cluster import *
from .alert_configuration import *
from .api_key import *
from .auditing import *
from .backup_compliance_policy import *
from .cloud_backup_schedule import *
from .cloud_backup_snapshot import *
from .cloud_backup_snapshot_export_bucket import *
from .cloud_backup_snapshot_export_job import *
from .cloud_backup_snapshot_restore_job import *
from .cloud_provider_access import *
from .cloud_provider_access_authorization import *
from .cloud_provider_access_setup import *
from .cluster import *
from .cluster_outage_simulation import *
from .custom_db_role import *
from .custom_dns_configuration_cluster_aws import *
from .data_lake import *
from .data_lake_pipeline import *
from .database_user import *
from .encryption_at_rest import *
from .event_trigger import *
from .federated_database_instance import *
from .federated_query_limit import *
from .federated_settings_identity_provider import *
from .federated_settings_org_config import *
from .federated_settings_org_role_mapping import *
from .get509_authentication_database_user import *
from .get_access_list_api_key import *
from .get_access_list_api_keys import *
from .get_advanced_cluster import *
from .get_advanced_clusters import *
from .get_alert_configuration import *
from .get_alert_configurations import *
from .get_api_key import *
from .get_api_keys import *
from .get_auditing import *
from .get_backup_compliance_policy import *
from .get_cloud_backup_schedule import *
from .get_cloud_backup_snapshot import *
from .get_cloud_backup_snapshot_export_bucket import *
from .get_cloud_backup_snapshot_export_buckets import *
from .get_cloud_backup_snapshot_export_job import *
from .get_cloud_backup_snapshot_export_jobs import *
from .get_cloud_backup_snapshot_restore_job import *
from .get_cloud_backup_snapshot_restore_jobs import *
from .get_cloud_backup_snapshots import *
from .get_cloud_provider_access import *
from .get_cloud_provider_access_setup import *
from .get_cluster import *
from .get_cluster_outage_simulation import *
from .get_clusters import *
from .get_custom_db_role import *
from .get_custom_db_roles import *
from .get_custom_dns_configuration_cluster_aws import *
from .get_data_lake import *
from .get_data_lake_pipeline import *
from .get_data_lake_pipeline_run import *
from .get_data_lake_pipeline_runs import *
from .get_data_lake_pipelines import *
from .get_data_lakes import *
from .get_database_user import *
from .get_database_users import *
from .get_event_trigger import *
from .get_event_triggers import *
from .get_federated_database_instance import *
from .get_federated_database_instances import *
from .get_federated_query_limit import *
from .get_federated_query_limits import *
from .get_federated_settings import *
from .get_federated_settings_identity_provider import *
from .get_federated_settings_identity_providers import *
from .get_federated_settings_org_config import *
from .get_federated_settings_org_configs import *
from .get_federated_settings_org_role_mapping import *
from .get_federated_settings_org_role_mappings import *
from .get_global_cluster_config import *
from .get_ldap_configuration import *
from .get_ldap_verify import *
from .get_maintenance_window import *
from .get_network_container import *
from .get_network_containers import *
from .get_network_peering import *
from .get_network_peerings import *
from .get_online_archive import *
from .get_online_archives import *
from .get_org_invitation import *
from .get_organization import *
from .get_organizations import *
from .get_private_endpoint_regional_mode import *
from .get_private_link_endpoint import *
from .get_private_link_endpoint_service import *
from .get_privatelink_endpoint_service_adl import *
from .get_privatelink_endpoint_service_data_federation_online_archive import *
from .get_privatelink_endpoint_service_data_federation_online_archives import *
from .get_privatelink_endpoint_service_serverless import *
from .get_privatelink_endpoints_service_adl import *
from .get_privatelink_endpoints_service_serverless import *
from .get_project import *
from .get_project_api_key import *
from .get_project_api_keys import *
from .get_project_invitation import *
from .get_project_ip_access_list import *
from .get_projects import *
from .get_roles_org_id import *
from .get_search_index import *
from .get_search_indexes import *
from .get_serverless_instance import *
from .get_serverless_instances import *
from .get_shared_tier_restore_job import *
from .get_shared_tier_restore_jobs import *
from .get_shared_tier_snapshot import *
from .get_shared_tier_snapshots import *
from .get_team import *
from .get_teams import *
from .get_third_party_integration import *
from .get_third_party_integrations import *
from .global_cluster_config import *
from .ldap_configuration import *
from .ldap_verify import *
from .maintenance_window import *
from .network_container import *
from .network_peering import *
from .online_archive import *
from .org_invitation import *
from .organization import *
from .private_endpoint_regional_mode import *
from .private_link_endpoint import *
from .private_link_endpoint_service import *
from .privatelink_endpoint_serverless import *
from .privatelink_endpoint_service_adl import *
from .privatelink_endpoint_service_data_federation_online_archive import *
from .privatelink_endpoint_service_serverless import *
from .project import *
from .project_api_key import *
from .project_invitation import *
from .project_ip_access_list import *
from .provider import *
from .search_index import *
from .serverless_instance import *
from .team import *
from .teams import *
from .third_party_integration import *
from .x509_authentication_database_user import *
from ._inputs import *
from . import outputs

# Make subpackages available:
if typing.TYPE_CHECKING:
    import pulumi_mongodbatlas.config as __config
    config = __config
else:
    config = _utilities.lazy_import('pulumi_mongodbatlas.config')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "mongodbatlas",
  "mod": "index/accessListApiKey",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/accessListApiKey:AccessListApiKey": "AccessListApiKey"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/advancedCluster",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/advancedCluster:AdvancedCluster": "AdvancedCluster"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/alertConfiguration",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/alertConfiguration:AlertConfiguration": "AlertConfiguration"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/apiKey",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/apiKey:ApiKey": "ApiKey"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/auditing",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/auditing:Auditing": "Auditing"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/backupCompliancePolicy",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/backupCompliancePolicy:BackupCompliancePolicy": "BackupCompliancePolicy"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/cloudBackupSchedule",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/cloudBackupSchedule:CloudBackupSchedule": "CloudBackupSchedule"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/cloudBackupSnapshot",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/cloudBackupSnapshot:CloudBackupSnapshot": "CloudBackupSnapshot"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/cloudBackupSnapshotExportBucket",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/cloudBackupSnapshotExportBucket:CloudBackupSnapshotExportBucket": "CloudBackupSnapshotExportBucket"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/cloudBackupSnapshotExportJob",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/cloudBackupSnapshotExportJob:CloudBackupSnapshotExportJob": "CloudBackupSnapshotExportJob"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/cloudBackupSnapshotRestoreJob",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/cloudBackupSnapshotRestoreJob:CloudBackupSnapshotRestoreJob": "CloudBackupSnapshotRestoreJob"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/cloudProviderAccess",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/cloudProviderAccess:CloudProviderAccess": "CloudProviderAccess"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/cloudProviderAccessAuthorization",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/cloudProviderAccessAuthorization:CloudProviderAccessAuthorization": "CloudProviderAccessAuthorization"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/cloudProviderAccessSetup",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/cloudProviderAccessSetup:CloudProviderAccessSetup": "CloudProviderAccessSetup"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/cluster",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/cluster:Cluster": "Cluster"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/clusterOutageSimulation",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/clusterOutageSimulation:ClusterOutageSimulation": "ClusterOutageSimulation"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/customDbRole",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/customDbRole:CustomDbRole": "CustomDbRole"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/customDnsConfigurationClusterAws",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/customDnsConfigurationClusterAws:CustomDnsConfigurationClusterAws": "CustomDnsConfigurationClusterAws"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/dataLake",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/dataLake:DataLake": "DataLake"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/dataLakePipeline",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/dataLakePipeline:DataLakePipeline": "DataLakePipeline"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/databaseUser",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/databaseUser:DatabaseUser": "DatabaseUser"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/encryptionAtRest",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/encryptionAtRest:EncryptionAtRest": "EncryptionAtRest"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/eventTrigger",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/eventTrigger:EventTrigger": "EventTrigger"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/federatedDatabaseInstance",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/federatedDatabaseInstance:FederatedDatabaseInstance": "FederatedDatabaseInstance"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/federatedQueryLimit",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/federatedQueryLimit:FederatedQueryLimit": "FederatedQueryLimit"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/federatedSettingsIdentityProvider",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/federatedSettingsIdentityProvider:FederatedSettingsIdentityProvider": "FederatedSettingsIdentityProvider"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/federatedSettingsOrgConfig",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/federatedSettingsOrgConfig:FederatedSettingsOrgConfig": "FederatedSettingsOrgConfig"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/federatedSettingsOrgRoleMapping",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/federatedSettingsOrgRoleMapping:FederatedSettingsOrgRoleMapping": "FederatedSettingsOrgRoleMapping"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/globalClusterConfig",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/globalClusterConfig:GlobalClusterConfig": "GlobalClusterConfig"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/ldapConfiguration",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/ldapConfiguration:LdapConfiguration": "LdapConfiguration"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/ldapVerify",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/ldapVerify:LdapVerify": "LdapVerify"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/maintenanceWindow",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/maintenanceWindow:MaintenanceWindow": "MaintenanceWindow"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/networkContainer",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/networkContainer:NetworkContainer": "NetworkContainer"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/networkPeering",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/networkPeering:NetworkPeering": "NetworkPeering"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/onlineArchive",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/onlineArchive:OnlineArchive": "OnlineArchive"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/orgInvitation",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/orgInvitation:OrgInvitation": "OrgInvitation"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/organization",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/organization:Organization": "Organization"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/privateEndpointRegionalMode",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/privateEndpointRegionalMode:PrivateEndpointRegionalMode": "PrivateEndpointRegionalMode"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/privateLinkEndpoint",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/privateLinkEndpoint:PrivateLinkEndpoint": "PrivateLinkEndpoint"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/privateLinkEndpointService",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/privateLinkEndpointService:PrivateLinkEndpointService": "PrivateLinkEndpointService"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/privatelinkEndpointServerless",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/privatelinkEndpointServerless:PrivatelinkEndpointServerless": "PrivatelinkEndpointServerless"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/privatelinkEndpointServiceAdl",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/privatelinkEndpointServiceAdl:PrivatelinkEndpointServiceAdl": "PrivatelinkEndpointServiceAdl"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/privatelinkEndpointServiceDataFederationOnlineArchive",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/privatelinkEndpointServiceDataFederationOnlineArchive:PrivatelinkEndpointServiceDataFederationOnlineArchive": "PrivatelinkEndpointServiceDataFederationOnlineArchive"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/privatelinkEndpointServiceServerless",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/privatelinkEndpointServiceServerless:PrivatelinkEndpointServiceServerless": "PrivatelinkEndpointServiceServerless"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/project",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/project:Project": "Project"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/projectApiKey",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/projectApiKey:ProjectApiKey": "ProjectApiKey"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/projectInvitation",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/projectInvitation:ProjectInvitation": "ProjectInvitation"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/projectIpAccessList",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/projectIpAccessList:ProjectIpAccessList": "ProjectIpAccessList"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/searchIndex",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/searchIndex:SearchIndex": "SearchIndex"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/serverlessInstance",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/serverlessInstance:ServerlessInstance": "ServerlessInstance"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/team",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/team:Team": "Team"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/teams",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/teams:Teams": "Teams"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/thirdPartyIntegration",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/thirdPartyIntegration:ThirdPartyIntegration": "ThirdPartyIntegration"
  }
 },
 {
  "pkg": "mongodbatlas",
  "mod": "index/x509AuthenticationDatabaseUser",
  "fqn": "pulumi_mongodbatlas",
  "classes": {
   "mongodbatlas:index/x509AuthenticationDatabaseUser:X509AuthenticationDatabaseUser": "X509AuthenticationDatabaseUser"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "mongodbatlas",
  "token": "pulumi:providers:mongodbatlas",
  "fqn": "pulumi_mongodbatlas",
  "class": "Provider"
 }
]
"""
)
