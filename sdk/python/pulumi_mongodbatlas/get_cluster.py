# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetClusterResult',
    'AwaitableGetClusterResult',
    'get_cluster',
    'get_cluster_output',
]

@pulumi.output_type
class GetClusterResult:
    """
    A collection of values returned by getCluster.
    """
    def __init__(__self__, advanced_configurations=None, auto_scaling_compute_enabled=None, auto_scaling_compute_scale_down_enabled=None, auto_scaling_disk_gb_enabled=None, backing_provider_name=None, backup_enabled=None, bi_connector_configs=None, cluster_type=None, connection_strings=None, container_id=None, disk_size_gb=None, encryption_at_rest_provider=None, id=None, labels=None, mongo_db_major_version=None, mongo_db_version=None, mongo_uri=None, mongo_uri_updated=None, mongo_uri_with_options=None, name=None, num_shards=None, paused=None, pit_enabled=None, project_id=None, provider_auto_scaling_compute_max_instance_size=None, provider_auto_scaling_compute_min_instance_size=None, provider_backup_enabled=None, provider_disk_iops=None, provider_disk_type_name=None, provider_encrypt_ebs_volume=None, provider_encrypt_ebs_volume_flag=None, provider_instance_size_name=None, provider_name=None, provider_region_name=None, provider_volume_type=None, replication_factor=None, replication_specs=None, snapshot_backup_policies=None, srv_address=None, state_name=None, tags=None, termination_protection_enabled=None, version_release_system=None):
        if advanced_configurations and not isinstance(advanced_configurations, list):
            raise TypeError("Expected argument 'advanced_configurations' to be a list")
        pulumi.set(__self__, "advanced_configurations", advanced_configurations)
        if auto_scaling_compute_enabled and not isinstance(auto_scaling_compute_enabled, bool):
            raise TypeError("Expected argument 'auto_scaling_compute_enabled' to be a bool")
        pulumi.set(__self__, "auto_scaling_compute_enabled", auto_scaling_compute_enabled)
        if auto_scaling_compute_scale_down_enabled and not isinstance(auto_scaling_compute_scale_down_enabled, bool):
            raise TypeError("Expected argument 'auto_scaling_compute_scale_down_enabled' to be a bool")
        pulumi.set(__self__, "auto_scaling_compute_scale_down_enabled", auto_scaling_compute_scale_down_enabled)
        if auto_scaling_disk_gb_enabled and not isinstance(auto_scaling_disk_gb_enabled, bool):
            raise TypeError("Expected argument 'auto_scaling_disk_gb_enabled' to be a bool")
        pulumi.set(__self__, "auto_scaling_disk_gb_enabled", auto_scaling_disk_gb_enabled)
        if backing_provider_name and not isinstance(backing_provider_name, str):
            raise TypeError("Expected argument 'backing_provider_name' to be a str")
        pulumi.set(__self__, "backing_provider_name", backing_provider_name)
        if backup_enabled and not isinstance(backup_enabled, bool):
            raise TypeError("Expected argument 'backup_enabled' to be a bool")
        pulumi.set(__self__, "backup_enabled", backup_enabled)
        if bi_connector_configs and not isinstance(bi_connector_configs, list):
            raise TypeError("Expected argument 'bi_connector_configs' to be a list")
        pulumi.set(__self__, "bi_connector_configs", bi_connector_configs)
        if cluster_type and not isinstance(cluster_type, str):
            raise TypeError("Expected argument 'cluster_type' to be a str")
        pulumi.set(__self__, "cluster_type", cluster_type)
        if connection_strings and not isinstance(connection_strings, list):
            raise TypeError("Expected argument 'connection_strings' to be a list")
        pulumi.set(__self__, "connection_strings", connection_strings)
        if container_id and not isinstance(container_id, str):
            raise TypeError("Expected argument 'container_id' to be a str")
        pulumi.set(__self__, "container_id", container_id)
        if disk_size_gb and not isinstance(disk_size_gb, float):
            raise TypeError("Expected argument 'disk_size_gb' to be a float")
        pulumi.set(__self__, "disk_size_gb", disk_size_gb)
        if encryption_at_rest_provider and not isinstance(encryption_at_rest_provider, str):
            raise TypeError("Expected argument 'encryption_at_rest_provider' to be a str")
        pulumi.set(__self__, "encryption_at_rest_provider", encryption_at_rest_provider)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if labels and not isinstance(labels, list):
            raise TypeError("Expected argument 'labels' to be a list")
        pulumi.set(__self__, "labels", labels)
        if mongo_db_major_version and not isinstance(mongo_db_major_version, str):
            raise TypeError("Expected argument 'mongo_db_major_version' to be a str")
        pulumi.set(__self__, "mongo_db_major_version", mongo_db_major_version)
        if mongo_db_version and not isinstance(mongo_db_version, str):
            raise TypeError("Expected argument 'mongo_db_version' to be a str")
        pulumi.set(__self__, "mongo_db_version", mongo_db_version)
        if mongo_uri and not isinstance(mongo_uri, str):
            raise TypeError("Expected argument 'mongo_uri' to be a str")
        pulumi.set(__self__, "mongo_uri", mongo_uri)
        if mongo_uri_updated and not isinstance(mongo_uri_updated, str):
            raise TypeError("Expected argument 'mongo_uri_updated' to be a str")
        pulumi.set(__self__, "mongo_uri_updated", mongo_uri_updated)
        if mongo_uri_with_options and not isinstance(mongo_uri_with_options, str):
            raise TypeError("Expected argument 'mongo_uri_with_options' to be a str")
        pulumi.set(__self__, "mongo_uri_with_options", mongo_uri_with_options)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if num_shards and not isinstance(num_shards, int):
            raise TypeError("Expected argument 'num_shards' to be a int")
        pulumi.set(__self__, "num_shards", num_shards)
        if paused and not isinstance(paused, bool):
            raise TypeError("Expected argument 'paused' to be a bool")
        pulumi.set(__self__, "paused", paused)
        if pit_enabled and not isinstance(pit_enabled, bool):
            raise TypeError("Expected argument 'pit_enabled' to be a bool")
        pulumi.set(__self__, "pit_enabled", pit_enabled)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if provider_auto_scaling_compute_max_instance_size and not isinstance(provider_auto_scaling_compute_max_instance_size, str):
            raise TypeError("Expected argument 'provider_auto_scaling_compute_max_instance_size' to be a str")
        pulumi.set(__self__, "provider_auto_scaling_compute_max_instance_size", provider_auto_scaling_compute_max_instance_size)
        if provider_auto_scaling_compute_min_instance_size and not isinstance(provider_auto_scaling_compute_min_instance_size, str):
            raise TypeError("Expected argument 'provider_auto_scaling_compute_min_instance_size' to be a str")
        pulumi.set(__self__, "provider_auto_scaling_compute_min_instance_size", provider_auto_scaling_compute_min_instance_size)
        if provider_backup_enabled and not isinstance(provider_backup_enabled, bool):
            raise TypeError("Expected argument 'provider_backup_enabled' to be a bool")
        pulumi.set(__self__, "provider_backup_enabled", provider_backup_enabled)
        if provider_disk_iops and not isinstance(provider_disk_iops, int):
            raise TypeError("Expected argument 'provider_disk_iops' to be a int")
        pulumi.set(__self__, "provider_disk_iops", provider_disk_iops)
        if provider_disk_type_name and not isinstance(provider_disk_type_name, str):
            raise TypeError("Expected argument 'provider_disk_type_name' to be a str")
        pulumi.set(__self__, "provider_disk_type_name", provider_disk_type_name)
        if provider_encrypt_ebs_volume and not isinstance(provider_encrypt_ebs_volume, bool):
            raise TypeError("Expected argument 'provider_encrypt_ebs_volume' to be a bool")
        pulumi.set(__self__, "provider_encrypt_ebs_volume", provider_encrypt_ebs_volume)
        if provider_encrypt_ebs_volume_flag and not isinstance(provider_encrypt_ebs_volume_flag, bool):
            raise TypeError("Expected argument 'provider_encrypt_ebs_volume_flag' to be a bool")
        pulumi.set(__self__, "provider_encrypt_ebs_volume_flag", provider_encrypt_ebs_volume_flag)
        if provider_instance_size_name and not isinstance(provider_instance_size_name, str):
            raise TypeError("Expected argument 'provider_instance_size_name' to be a str")
        pulumi.set(__self__, "provider_instance_size_name", provider_instance_size_name)
        if provider_name and not isinstance(provider_name, str):
            raise TypeError("Expected argument 'provider_name' to be a str")
        pulumi.set(__self__, "provider_name", provider_name)
        if provider_region_name and not isinstance(provider_region_name, str):
            raise TypeError("Expected argument 'provider_region_name' to be a str")
        pulumi.set(__self__, "provider_region_name", provider_region_name)
        if provider_volume_type and not isinstance(provider_volume_type, str):
            raise TypeError("Expected argument 'provider_volume_type' to be a str")
        pulumi.set(__self__, "provider_volume_type", provider_volume_type)
        if replication_factor and not isinstance(replication_factor, int):
            raise TypeError("Expected argument 'replication_factor' to be a int")
        pulumi.set(__self__, "replication_factor", replication_factor)
        if replication_specs and not isinstance(replication_specs, list):
            raise TypeError("Expected argument 'replication_specs' to be a list")
        pulumi.set(__self__, "replication_specs", replication_specs)
        if snapshot_backup_policies and not isinstance(snapshot_backup_policies, list):
            raise TypeError("Expected argument 'snapshot_backup_policies' to be a list")
        pulumi.set(__self__, "snapshot_backup_policies", snapshot_backup_policies)
        if srv_address and not isinstance(srv_address, str):
            raise TypeError("Expected argument 'srv_address' to be a str")
        pulumi.set(__self__, "srv_address", srv_address)
        if state_name and not isinstance(state_name, str):
            raise TypeError("Expected argument 'state_name' to be a str")
        pulumi.set(__self__, "state_name", state_name)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if termination_protection_enabled and not isinstance(termination_protection_enabled, bool):
            raise TypeError("Expected argument 'termination_protection_enabled' to be a bool")
        pulumi.set(__self__, "termination_protection_enabled", termination_protection_enabled)
        if version_release_system and not isinstance(version_release_system, str):
            raise TypeError("Expected argument 'version_release_system' to be a str")
        pulumi.set(__self__, "version_release_system", version_release_system)

    @property
    @pulumi.getter(name="advancedConfigurations")
    def advanced_configurations(self) -> Sequence['outputs.GetClusterAdvancedConfigurationResult']:
        """
        Get the advanced configuration options. See Advanced Configuration below for more details.
        """
        return pulumi.get(self, "advanced_configurations")

    @property
    @pulumi.getter(name="autoScalingComputeEnabled")
    def auto_scaling_compute_enabled(self) -> bool:
        """
        Specifies whether cluster tier auto-scaling is enabled. The default is false.
        """
        return pulumi.get(self, "auto_scaling_compute_enabled")

    @property
    @pulumi.getter(name="autoScalingComputeScaleDownEnabled")
    def auto_scaling_compute_scale_down_enabled(self) -> bool:
        """
        Specifies whether cluster tier auto-down-scaling is enabled.
        """
        return pulumi.get(self, "auto_scaling_compute_scale_down_enabled")

    @property
    @pulumi.getter(name="autoScalingDiskGbEnabled")
    def auto_scaling_disk_gb_enabled(self) -> bool:
        """
        Indicates whether disk auto-scaling is enabled.
        """
        return pulumi.get(self, "auto_scaling_disk_gb_enabled")

    @property
    @pulumi.getter(name="backingProviderName")
    def backing_provider_name(self) -> str:
        """
        Indicates Cloud service provider on which the server for a multi-tenant cluster is provisioned.
        """
        return pulumi.get(self, "backing_provider_name")

    @property
    @pulumi.getter(name="backupEnabled")
    def backup_enabled(self) -> bool:
        """
        Legacy Option, Indicates whether Atlas continuous backups are enabled for the cluster.
        """
        return pulumi.get(self, "backup_enabled")

    @property
    @pulumi.getter(name="biConnectorConfigs")
    def bi_connector_configs(self) -> Sequence['outputs.GetClusterBiConnectorConfigResult']:
        """
        Indicates BI Connector for Atlas configuration on this cluster. BI Connector for Atlas is only available for M10+ clusters. See BI Connector below for more details.
        """
        return pulumi.get(self, "bi_connector_configs")

    @property
    @pulumi.getter(name="clusterType")
    def cluster_type(self) -> str:
        """
        Indicates the type of the cluster that you want to modify. You cannot convert a sharded cluster deployment to a replica set deployment.
        """
        return pulumi.get(self, "cluster_type")

    @property
    @pulumi.getter(name="connectionStrings")
    def connection_strings(self) -> Sequence['outputs.GetClusterConnectionStringResult']:
        """
        Set of connection strings that your applications use to connect to this cluster. More info in [Connection-strings](https://docs.mongodb.com/manual/reference/connection-string/). Use the parameters in this object to connect your applications to this cluster. To learn more about the formats of connection strings, see [Connection String Options](https://docs.atlas.mongodb.com/reference/faq/connection-changes/).
        """
        return pulumi.get(self, "connection_strings")

    @property
    @pulumi.getter(name="containerId")
    def container_id(self) -> str:
        """
        The Network Peering Container ID.
        """
        return pulumi.get(self, "container_id")

    @property
    @pulumi.getter(name="diskSizeGb")
    def disk_size_gb(self) -> float:
        """
        Indicates the size in gigabytes of the server’s root volume (AWS/GCP Only).
        """
        return pulumi.get(self, "disk_size_gb")

    @property
    @pulumi.getter(name="encryptionAtRestProvider")
    def encryption_at_rest_provider(self) -> str:
        """
        Indicates whether Encryption at Rest is enabled or disabled.
        """
        return pulumi.get(self, "encryption_at_rest_provider")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def labels(self) -> Sequence['outputs.GetClusterLabelResult']:
        """
        Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below. **DEPRECATED** Use `tags` instead.
        """
        warnings.warn("""this parameter is deprecated and will be removed by September 2024, please transition to tags""", DeprecationWarning)
        pulumi.log.warn("""labels is deprecated: this parameter is deprecated and will be removed by September 2024, please transition to tags""")

        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="mongoDbMajorVersion")
    def mongo_db_major_version(self) -> str:
        """
        Indicates the version of the cluster to deploy.
        """
        return pulumi.get(self, "mongo_db_major_version")

    @property
    @pulumi.getter(name="mongoDbVersion")
    def mongo_db_version(self) -> str:
        """
        Version of MongoDB the cluster runs, in `major-version`.`minor-version` format.
        """
        return pulumi.get(self, "mongo_db_version")

    @property
    @pulumi.getter(name="mongoUri")
    def mongo_uri(self) -> str:
        """
        Base connection string for the cluster. Atlas only displays this field after the cluster is operational, not while it builds the cluster.
        """
        return pulumi.get(self, "mongo_uri")

    @property
    @pulumi.getter(name="mongoUriUpdated")
    def mongo_uri_updated(self) -> str:
        """
        Lists when the connection string was last updated. The connection string changes, for example, if you change a replica set to a sharded cluster.
        """
        return pulumi.get(self, "mongo_uri_updated")

    @property
    @pulumi.getter(name="mongoUriWithOptions")
    def mongo_uri_with_options(self) -> str:
        """
        Describes connection string for connecting to the Atlas cluster. Includes the replicaSet, ssl, and authSource query parameters in the connection string with values appropriate for the cluster.
        """
        return pulumi.get(self, "mongo_uri_with_options")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the current plugin
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="numShards")
    def num_shards(self) -> int:
        """
        Number of shards to deploy in the specified zone.
        """
        return pulumi.get(self, "num_shards")

    @property
    @pulumi.getter
    def paused(self) -> bool:
        """
        Flag that indicates whether the cluster is paused or not.
        """
        return pulumi.get(self, "paused")

    @property
    @pulumi.getter(name="pitEnabled")
    def pit_enabled(self) -> bool:
        """
        Flag that indicates if the cluster uses Continuous Cloud Backup.
        """
        return pulumi.get(self, "pit_enabled")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="providerAutoScalingComputeMaxInstanceSize")
    def provider_auto_scaling_compute_max_instance_size(self) -> str:
        """
        Maximum instance size to which your cluster can automatically scale.
        """
        return pulumi.get(self, "provider_auto_scaling_compute_max_instance_size")

    @property
    @pulumi.getter(name="providerAutoScalingComputeMinInstanceSize")
    def provider_auto_scaling_compute_min_instance_size(self) -> str:
        """
        Minimum instance size to which your cluster can automatically scale.
        """
        return pulumi.get(self, "provider_auto_scaling_compute_min_instance_size")

    @property
    @pulumi.getter(name="providerBackupEnabled")
    def provider_backup_enabled(self) -> bool:
        return pulumi.get(self, "provider_backup_enabled")

    @property
    @pulumi.getter(name="providerDiskIops")
    def provider_disk_iops(self) -> int:
        """
        Indicates the maximum input/output operations per second (IOPS) the system can perform. The possible values depend on the selected providerSettings.instanceSizeName and diskSizeGB.
        """
        return pulumi.get(self, "provider_disk_iops")

    @property
    @pulumi.getter(name="providerDiskTypeName")
    def provider_disk_type_name(self) -> str:
        """
        Describes Azure disk type of the server’s root volume (Azure Only).
        """
        return pulumi.get(self, "provider_disk_type_name")

    @property
    @pulumi.getter(name="providerEncryptEbsVolume")
    def provider_encrypt_ebs_volume(self) -> bool:
        """
        **(DEPRECATED)** Indicates whether the Amazon EBS encryption is enabled. This feature encrypts the server’s root volume for both data at rest within the volume and data moving between the volume and the instance. By default this attribute is always enabled, per deprecation process showing the real value at `provider_encrypt_ebs_volume_flag` computed attribute.
        """
        return pulumi.get(self, "provider_encrypt_ebs_volume")

    @property
    @pulumi.getter(name="providerEncryptEbsVolumeFlag")
    def provider_encrypt_ebs_volume_flag(self) -> bool:
        return pulumi.get(self, "provider_encrypt_ebs_volume_flag")

    @property
    @pulumi.getter(name="providerInstanceSizeName")
    def provider_instance_size_name(self) -> str:
        """
        Atlas provides different instance sizes, each with a default storage capacity and RAM size.
        """
        return pulumi.get(self, "provider_instance_size_name")

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> str:
        """
        Indicates the cloud service provider on which the servers are provisioned.
        """
        return pulumi.get(self, "provider_name")

    @property
    @pulumi.getter(name="providerRegionName")
    def provider_region_name(self) -> str:
        """
        Indicates Physical location of your MongoDB cluster. The region you choose can affect network latency for clients accessing your databases.  Requires the Atlas Region name, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
        """
        return pulumi.get(self, "provider_region_name")

    @property
    @pulumi.getter(name="providerVolumeType")
    def provider_volume_type(self) -> str:
        """
        Indicates the type of the volume. The possible values are: `STANDARD` and `PROVISIONED`.
        > **NOTE:** `STANDARD` is not available for NVME clusters.
        """
        return pulumi.get(self, "provider_volume_type")

    @property
    @pulumi.getter(name="replicationFactor")
    def replication_factor(self) -> int:
        """
        (Deprecated) Number of replica set members. Each member keeps a copy of your databases, providing high availability and data redundancy. The possible values are 3, 5, or 7. The default value is 3.
        """
        return pulumi.get(self, "replication_factor")

    @property
    @pulumi.getter(name="replicationSpecs")
    def replication_specs(self) -> Sequence['outputs.GetClusterReplicationSpecResult']:
        """
        Configuration for cluster regions.  See Replication Spec below for more details.
        """
        return pulumi.get(self, "replication_specs")

    @property
    @pulumi.getter(name="snapshotBackupPolicies")
    def snapshot_backup_policies(self) -> Sequence['outputs.GetClusterSnapshotBackupPolicyResult']:
        """
        current snapshot schedule and retention settings for the cluster.
        """
        return pulumi.get(self, "snapshot_backup_policies")

    @property
    @pulumi.getter(name="srvAddress")
    def srv_address(self) -> str:
        """
        Connection string for connecting to the Atlas cluster. The +srv modifier forces the connection to use TLS/SSL. See the mongoURI for additional options.
        """
        return pulumi.get(self, "srv_address")

    @property
    @pulumi.getter(name="stateName")
    def state_name(self) -> str:
        """
        Indicates the current state of the cluster. The possible states are:
        - IDLE
        - CREATING
        - UPDATING
        - DELETING
        - DELETED
        - REPAIRING
        """
        return pulumi.get(self, "state_name")

    @property
    @pulumi.getter
    def tags(self) -> Sequence['outputs.GetClusterTagResult']:
        """
        Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="terminationProtectionEnabled")
    def termination_protection_enabled(self) -> bool:
        """
        Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
        """
        return pulumi.get(self, "termination_protection_enabled")

    @property
    @pulumi.getter(name="versionReleaseSystem")
    def version_release_system(self) -> str:
        """
        Release cadence that Atlas uses for this cluster.
        """
        return pulumi.get(self, "version_release_system")


class AwaitableGetClusterResult(GetClusterResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClusterResult(
            advanced_configurations=self.advanced_configurations,
            auto_scaling_compute_enabled=self.auto_scaling_compute_enabled,
            auto_scaling_compute_scale_down_enabled=self.auto_scaling_compute_scale_down_enabled,
            auto_scaling_disk_gb_enabled=self.auto_scaling_disk_gb_enabled,
            backing_provider_name=self.backing_provider_name,
            backup_enabled=self.backup_enabled,
            bi_connector_configs=self.bi_connector_configs,
            cluster_type=self.cluster_type,
            connection_strings=self.connection_strings,
            container_id=self.container_id,
            disk_size_gb=self.disk_size_gb,
            encryption_at_rest_provider=self.encryption_at_rest_provider,
            id=self.id,
            labels=self.labels,
            mongo_db_major_version=self.mongo_db_major_version,
            mongo_db_version=self.mongo_db_version,
            mongo_uri=self.mongo_uri,
            mongo_uri_updated=self.mongo_uri_updated,
            mongo_uri_with_options=self.mongo_uri_with_options,
            name=self.name,
            num_shards=self.num_shards,
            paused=self.paused,
            pit_enabled=self.pit_enabled,
            project_id=self.project_id,
            provider_auto_scaling_compute_max_instance_size=self.provider_auto_scaling_compute_max_instance_size,
            provider_auto_scaling_compute_min_instance_size=self.provider_auto_scaling_compute_min_instance_size,
            provider_backup_enabled=self.provider_backup_enabled,
            provider_disk_iops=self.provider_disk_iops,
            provider_disk_type_name=self.provider_disk_type_name,
            provider_encrypt_ebs_volume=self.provider_encrypt_ebs_volume,
            provider_encrypt_ebs_volume_flag=self.provider_encrypt_ebs_volume_flag,
            provider_instance_size_name=self.provider_instance_size_name,
            provider_name=self.provider_name,
            provider_region_name=self.provider_region_name,
            provider_volume_type=self.provider_volume_type,
            replication_factor=self.replication_factor,
            replication_specs=self.replication_specs,
            snapshot_backup_policies=self.snapshot_backup_policies,
            srv_address=self.srv_address,
            state_name=self.state_name,
            tags=self.tags,
            termination_protection_enabled=self.termination_protection_enabled,
            version_release_system=self.version_release_system)


def get_cluster(name: Optional[str] = None,
                project_id: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClusterResult:
    """
    `Cluster` describes a Cluster. The data source requires your Project ID.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

    > **IMPORTANT:**
    <br> &#8226; Changes to cluster configurations can affect costs. Before making changes, please see [Billing](https://docs.atlas.mongodb.com/billing/).
    <br> &#8226; If your Atlas project contains a custom role that uses actions introduced in a specific MongoDB version, you cannot create a cluster with a MongoDB version less than that version unless you delete the custom role.


    :param str name: Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed.
    :param str project_id: The unique ID for the project to create the database user.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getCluster:getCluster', __args__, opts=opts, typ=GetClusterResult).value

    return AwaitableGetClusterResult(
        advanced_configurations=pulumi.get(__ret__, 'advanced_configurations'),
        auto_scaling_compute_enabled=pulumi.get(__ret__, 'auto_scaling_compute_enabled'),
        auto_scaling_compute_scale_down_enabled=pulumi.get(__ret__, 'auto_scaling_compute_scale_down_enabled'),
        auto_scaling_disk_gb_enabled=pulumi.get(__ret__, 'auto_scaling_disk_gb_enabled'),
        backing_provider_name=pulumi.get(__ret__, 'backing_provider_name'),
        backup_enabled=pulumi.get(__ret__, 'backup_enabled'),
        bi_connector_configs=pulumi.get(__ret__, 'bi_connector_configs'),
        cluster_type=pulumi.get(__ret__, 'cluster_type'),
        connection_strings=pulumi.get(__ret__, 'connection_strings'),
        container_id=pulumi.get(__ret__, 'container_id'),
        disk_size_gb=pulumi.get(__ret__, 'disk_size_gb'),
        encryption_at_rest_provider=pulumi.get(__ret__, 'encryption_at_rest_provider'),
        id=pulumi.get(__ret__, 'id'),
        labels=pulumi.get(__ret__, 'labels'),
        mongo_db_major_version=pulumi.get(__ret__, 'mongo_db_major_version'),
        mongo_db_version=pulumi.get(__ret__, 'mongo_db_version'),
        mongo_uri=pulumi.get(__ret__, 'mongo_uri'),
        mongo_uri_updated=pulumi.get(__ret__, 'mongo_uri_updated'),
        mongo_uri_with_options=pulumi.get(__ret__, 'mongo_uri_with_options'),
        name=pulumi.get(__ret__, 'name'),
        num_shards=pulumi.get(__ret__, 'num_shards'),
        paused=pulumi.get(__ret__, 'paused'),
        pit_enabled=pulumi.get(__ret__, 'pit_enabled'),
        project_id=pulumi.get(__ret__, 'project_id'),
        provider_auto_scaling_compute_max_instance_size=pulumi.get(__ret__, 'provider_auto_scaling_compute_max_instance_size'),
        provider_auto_scaling_compute_min_instance_size=pulumi.get(__ret__, 'provider_auto_scaling_compute_min_instance_size'),
        provider_backup_enabled=pulumi.get(__ret__, 'provider_backup_enabled'),
        provider_disk_iops=pulumi.get(__ret__, 'provider_disk_iops'),
        provider_disk_type_name=pulumi.get(__ret__, 'provider_disk_type_name'),
        provider_encrypt_ebs_volume=pulumi.get(__ret__, 'provider_encrypt_ebs_volume'),
        provider_encrypt_ebs_volume_flag=pulumi.get(__ret__, 'provider_encrypt_ebs_volume_flag'),
        provider_instance_size_name=pulumi.get(__ret__, 'provider_instance_size_name'),
        provider_name=pulumi.get(__ret__, 'provider_name'),
        provider_region_name=pulumi.get(__ret__, 'provider_region_name'),
        provider_volume_type=pulumi.get(__ret__, 'provider_volume_type'),
        replication_factor=pulumi.get(__ret__, 'replication_factor'),
        replication_specs=pulumi.get(__ret__, 'replication_specs'),
        snapshot_backup_policies=pulumi.get(__ret__, 'snapshot_backup_policies'),
        srv_address=pulumi.get(__ret__, 'srv_address'),
        state_name=pulumi.get(__ret__, 'state_name'),
        tags=pulumi.get(__ret__, 'tags'),
        termination_protection_enabled=pulumi.get(__ret__, 'termination_protection_enabled'),
        version_release_system=pulumi.get(__ret__, 'version_release_system'))


@_utilities.lift_output_func(get_cluster)
def get_cluster_output(name: Optional[pulumi.Input[str]] = None,
                       project_id: Optional[pulumi.Input[str]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetClusterResult]:
    """
    `Cluster` describes a Cluster. The data source requires your Project ID.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

    > **IMPORTANT:**
    <br> &#8226; Changes to cluster configurations can affect costs. Before making changes, please see [Billing](https://docs.atlas.mongodb.com/billing/).
    <br> &#8226; If your Atlas project contains a custom role that uses actions introduced in a specific MongoDB version, you cannot create a cluster with a MongoDB version less than that version unless you delete the custom role.


    :param str name: Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed.
    :param str project_id: The unique ID for the project to create the database user.
    """
    ...
