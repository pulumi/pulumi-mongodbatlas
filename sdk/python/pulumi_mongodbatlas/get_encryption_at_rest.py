# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs

__all__ = [
    'GetEncryptionAtRestResult',
    'AwaitableGetEncryptionAtRestResult',
    'get_encryption_at_rest',
    'get_encryption_at_rest_output',
]

@pulumi.output_type
class GetEncryptionAtRestResult:
    """
    A collection of values returned by getEncryptionAtRest.
    """
    def __init__(__self__, aws_kms_config=None, azure_key_vault_config=None, enabled_for_search_nodes=None, google_cloud_kms_config=None, id=None, project_id=None):
        if aws_kms_config and not isinstance(aws_kms_config, dict):
            raise TypeError("Expected argument 'aws_kms_config' to be a dict")
        pulumi.set(__self__, "aws_kms_config", aws_kms_config)
        if azure_key_vault_config and not isinstance(azure_key_vault_config, dict):
            raise TypeError("Expected argument 'azure_key_vault_config' to be a dict")
        pulumi.set(__self__, "azure_key_vault_config", azure_key_vault_config)
        if enabled_for_search_nodes and not isinstance(enabled_for_search_nodes, bool):
            raise TypeError("Expected argument 'enabled_for_search_nodes' to be a bool")
        pulumi.set(__self__, "enabled_for_search_nodes", enabled_for_search_nodes)
        if google_cloud_kms_config and not isinstance(google_cloud_kms_config, dict):
            raise TypeError("Expected argument 'google_cloud_kms_config' to be a dict")
        pulumi.set(__self__, "google_cloud_kms_config", google_cloud_kms_config)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)

    @_builtins.property
    @pulumi.getter(name="awsKmsConfig")
    def aws_kms_config(self) -> 'outputs.GetEncryptionAtRestAwsKmsConfigResult':
        """
        Amazon Web Services (AWS) KMS configuration details and encryption at rest configuration set for the specified project.
        """
        return pulumi.get(self, "aws_kms_config")

    @_builtins.property
    @pulumi.getter(name="azureKeyVaultConfig")
    def azure_key_vault_config(self) -> 'outputs.GetEncryptionAtRestAzureKeyVaultConfigResult':
        """
        Details that define the configuration of Encryption at Rest using Azure Key Vault (AKV).
        """
        return pulumi.get(self, "azure_key_vault_config")

    @_builtins.property
    @pulumi.getter(name="enabledForSearchNodes")
    def enabled_for_search_nodes(self) -> _builtins.bool:
        """
        Flag that indicates whether Encryption at Rest for Dedicated Search Nodes is enabled in the specified project.
        """
        return pulumi.get(self, "enabled_for_search_nodes")

    @_builtins.property
    @pulumi.getter(name="googleCloudKmsConfig")
    def google_cloud_kms_config(self) -> 'outputs.GetEncryptionAtRestGoogleCloudKmsConfigResult':
        """
        Details that define the configuration of Encryption at Rest using Google Cloud Key Management Service (KMS).
        """
        return pulumi.get(self, "google_cloud_kms_config")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The ID of this resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> _builtins.str:
        """
        Unique 24-hexadecimal digit string that identifies your project.
        """
        return pulumi.get(self, "project_id")


class AwaitableGetEncryptionAtRestResult(GetEncryptionAtRestResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEncryptionAtRestResult(
            aws_kms_config=self.aws_kms_config,
            azure_key_vault_config=self.azure_key_vault_config,
            enabled_for_search_nodes=self.enabled_for_search_nodes,
            google_cloud_kms_config=self.google_cloud_kms_config,
            id=self.id,
            project_id=self.project_id)


def get_encryption_at_rest(project_id: Optional[_builtins.str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEncryptionAtRestResult:
    """
    ## # Data Source: EncryptionAtRest

    `EncryptionAtRest` describes encryption at rest configuration for an Atlas project with one of the following providers:

    [Amazon Web Services Key Management Service](https://docs.atlas.mongodb.com/security-aws-kms/#security-aws-kms)
    [Azure Key Vault](https://docs.atlas.mongodb.com/security-azure-kms/#security-azure-kms)
    [Google Cloud KMS](https://docs.atlas.mongodb.com/security-gcp-kms/#security-gcp-kms)

    > **IMPORTANT** By default, Atlas enables encryption at rest for all cluster storage and snapshot volumes.

    > **IMPORTANT** Atlas limits this feature to dedicated cluster tiers of M10 and greater. For more information see: https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Encryption-at-Rest-using-Customer-Key-Management

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    ### S

    ### Configuring encryption at rest using customer key management in AWS
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    setup_only = mongodbatlas.CloudProviderAccessSetup("setup_only",
        project_id=atlas_project_id,
        provider_name="AWS")
    auth_role = mongodbatlas.CloudProviderAccessAuthorization("auth_role",
        project_id=atlas_project_id,
        role_id=setup_only.role_id,
        aws={
            "iam_assumed_role_arn": test_role["arn"],
        })
    test_encryption_at_rest = mongodbatlas.EncryptionAtRest("test",
        project_id=atlas_project_id,
        aws_kms_config={
            "enabled": True,
            "customer_master_key_id": kms_key["id"],
            "region": atlas_region,
            "role_id": auth_role.role_id,
        },
        enabled_for_search_nodes=True)
    cluster = mongodbatlas.AdvancedCluster("cluster",
        project_id=test_encryption_at_rest.project_id,
        name="MyCluster",
        cluster_type="REPLICASET",
        backup_enabled=True,
        encryption_at_rest_provider="AWS",
        replication_specs=[{
            "region_configs": [{
                "priority": 7,
                "provider_name": "AWS",
                "region_name": "US_EAST_1",
                "electable_specs": {
                    "instance_size": "M10",
                    "node_count": 3,
                },
            }],
        }])
    test = mongodbatlas.get_encryption_at_rest_output(project_id=test_encryption_at_rest.project_id)
    pulumi.export("isAwsKmsEncryptionAtRestValid", test.aws_kms_config.valid)
    ```

    ### Configuring encryption at rest using customer key management in Azure
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_encryption_at_rest = mongodbatlas.EncryptionAtRest("test",
        project_id=atlas_project_id,
        azure_key_vault_config={
            "enabled": True,
            "azure_environment": "AZURE",
            "tenant_id": azure_tenant_id,
            "subscription_id": azure_subscription_id,
            "client_id": azure_client_id,
            "secret": azure_client_secret,
            "resource_group_name": azure_resource_group_name,
            "key_vault_name": azure_key_vault_name,
            "key_identifier": azure_key_identifier,
        })
    test = mongodbatlas.get_encryption_at_rest_output(project_id=test_encryption_at_rest.project_id)
    pulumi.export("isAzureEncryptionAtRestValid", test.azure_key_vault_config.valid)
    ```

    > **NOTE:** It is possible to configure Atlas Encryption at Rest to communicate with Customer Managed Keys (Azure Key Vault or AWS KMS) over private network interfaces (Azure Private Link or AWS PrivateLink). This requires enabling the `azure_key_vault_config.require_private_networking` or the `aws_kms_config.require_private_networking` attribute, together with the configuration of the `EncryptionAtRestPrivateEndpoint` resource. Please review the `EncryptionAtRestPrivateEndpoint` resource for details.

    ### Configuring encryption at rest using customer key management in GCP
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_encryption_at_rest = mongodbatlas.EncryptionAtRest("test",
        project_id=atlas_project_id,
        google_cloud_kms_config={
            "enabled": True,
            "service_account_key": "{\\"type\\": \\"service_account\\",\\"project_id\\": \\"my-project-common-0\\",\\"private_key_id\\": \\"e120598ea4f88249469fcdd75a9a785c1bb3\\",\\"private_key\\": \\"-----BEGIN PRIVATE KEY-----\\\\nMIIEuwIBA(truncated)SfecnS0mT94D9\\\\n-----END PRIVATE KEY-----\\\\n\\",\\"client_email\\": \\"my-email-kms-0@my-project-common-0.iam.gserviceaccount.com\\",\\"client_id\\": \\"10180967717292066\\",\\"auth_uri\\": \\"https://accounts.google.com/o/oauth2/auth\\",\\"token_uri\\": \\"https://accounts.google.com/o/oauth2/token\\",\\"auth_provider_x509_cert_url\\": \\"https://www.googleapis.com/oauth2/v1/certs\\",\\"client_x509_cert_url\\": \\"https://www.googleapis.com/robot/v1/metadata/x509/my-email-kms-0%40my-project-common-0.iam.gserviceaccount.com\\"}",
            "key_version_resource_id": "projects/my-project-common-0/locations/us-east4/keyRings/my-key-ring-0/cryptoKeys/my-key-0/cryptoKeyVersions/1",
        })
    test = mongodbatlas.get_encryption_at_rest_output(project_id=test_encryption_at_rest.project_id)
    pulumi.export("isGcpEncryptionAtRestValid", test.google_cloud_kms_config.valid)
    ```


    :param _builtins.str project_id: Unique 24-hexadecimal digit string that identifies your project.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getEncryptionAtRest:getEncryptionAtRest', __args__, opts=opts, typ=GetEncryptionAtRestResult).value

    return AwaitableGetEncryptionAtRestResult(
        aws_kms_config=pulumi.get(__ret__, 'aws_kms_config'),
        azure_key_vault_config=pulumi.get(__ret__, 'azure_key_vault_config'),
        enabled_for_search_nodes=pulumi.get(__ret__, 'enabled_for_search_nodes'),
        google_cloud_kms_config=pulumi.get(__ret__, 'google_cloud_kms_config'),
        id=pulumi.get(__ret__, 'id'),
        project_id=pulumi.get(__ret__, 'project_id'))
def get_encryption_at_rest_output(project_id: Optional[pulumi.Input[_builtins.str]] = None,
                                  opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetEncryptionAtRestResult]:
    """
    ## # Data Source: EncryptionAtRest

    `EncryptionAtRest` describes encryption at rest configuration for an Atlas project with one of the following providers:

    [Amazon Web Services Key Management Service](https://docs.atlas.mongodb.com/security-aws-kms/#security-aws-kms)
    [Azure Key Vault](https://docs.atlas.mongodb.com/security-azure-kms/#security-azure-kms)
    [Google Cloud KMS](https://docs.atlas.mongodb.com/security-gcp-kms/#security-gcp-kms)

    > **IMPORTANT** By default, Atlas enables encryption at rest for all cluster storage and snapshot volumes.

    > **IMPORTANT** Atlas limits this feature to dedicated cluster tiers of M10 and greater. For more information see: https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Encryption-at-Rest-using-Customer-Key-Management

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    ### S

    ### Configuring encryption at rest using customer key management in AWS
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    setup_only = mongodbatlas.CloudProviderAccessSetup("setup_only",
        project_id=atlas_project_id,
        provider_name="AWS")
    auth_role = mongodbatlas.CloudProviderAccessAuthorization("auth_role",
        project_id=atlas_project_id,
        role_id=setup_only.role_id,
        aws={
            "iam_assumed_role_arn": test_role["arn"],
        })
    test_encryption_at_rest = mongodbatlas.EncryptionAtRest("test",
        project_id=atlas_project_id,
        aws_kms_config={
            "enabled": True,
            "customer_master_key_id": kms_key["id"],
            "region": atlas_region,
            "role_id": auth_role.role_id,
        },
        enabled_for_search_nodes=True)
    cluster = mongodbatlas.AdvancedCluster("cluster",
        project_id=test_encryption_at_rest.project_id,
        name="MyCluster",
        cluster_type="REPLICASET",
        backup_enabled=True,
        encryption_at_rest_provider="AWS",
        replication_specs=[{
            "region_configs": [{
                "priority": 7,
                "provider_name": "AWS",
                "region_name": "US_EAST_1",
                "electable_specs": {
                    "instance_size": "M10",
                    "node_count": 3,
                },
            }],
        }])
    test = mongodbatlas.get_encryption_at_rest_output(project_id=test_encryption_at_rest.project_id)
    pulumi.export("isAwsKmsEncryptionAtRestValid", test.aws_kms_config.valid)
    ```

    ### Configuring encryption at rest using customer key management in Azure
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_encryption_at_rest = mongodbatlas.EncryptionAtRest("test",
        project_id=atlas_project_id,
        azure_key_vault_config={
            "enabled": True,
            "azure_environment": "AZURE",
            "tenant_id": azure_tenant_id,
            "subscription_id": azure_subscription_id,
            "client_id": azure_client_id,
            "secret": azure_client_secret,
            "resource_group_name": azure_resource_group_name,
            "key_vault_name": azure_key_vault_name,
            "key_identifier": azure_key_identifier,
        })
    test = mongodbatlas.get_encryption_at_rest_output(project_id=test_encryption_at_rest.project_id)
    pulumi.export("isAzureEncryptionAtRestValid", test.azure_key_vault_config.valid)
    ```

    > **NOTE:** It is possible to configure Atlas Encryption at Rest to communicate with Customer Managed Keys (Azure Key Vault or AWS KMS) over private network interfaces (Azure Private Link or AWS PrivateLink). This requires enabling the `azure_key_vault_config.require_private_networking` or the `aws_kms_config.require_private_networking` attribute, together with the configuration of the `EncryptionAtRestPrivateEndpoint` resource. Please review the `EncryptionAtRestPrivateEndpoint` resource for details.

    ### Configuring encryption at rest using customer key management in GCP
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_encryption_at_rest = mongodbatlas.EncryptionAtRest("test",
        project_id=atlas_project_id,
        google_cloud_kms_config={
            "enabled": True,
            "service_account_key": "{\\"type\\": \\"service_account\\",\\"project_id\\": \\"my-project-common-0\\",\\"private_key_id\\": \\"e120598ea4f88249469fcdd75a9a785c1bb3\\",\\"private_key\\": \\"-----BEGIN PRIVATE KEY-----\\\\nMIIEuwIBA(truncated)SfecnS0mT94D9\\\\n-----END PRIVATE KEY-----\\\\n\\",\\"client_email\\": \\"my-email-kms-0@my-project-common-0.iam.gserviceaccount.com\\",\\"client_id\\": \\"10180967717292066\\",\\"auth_uri\\": \\"https://accounts.google.com/o/oauth2/auth\\",\\"token_uri\\": \\"https://accounts.google.com/o/oauth2/token\\",\\"auth_provider_x509_cert_url\\": \\"https://www.googleapis.com/oauth2/v1/certs\\",\\"client_x509_cert_url\\": \\"https://www.googleapis.com/robot/v1/metadata/x509/my-email-kms-0%40my-project-common-0.iam.gserviceaccount.com\\"}",
            "key_version_resource_id": "projects/my-project-common-0/locations/us-east4/keyRings/my-key-ring-0/cryptoKeys/my-key-0/cryptoKeyVersions/1",
        })
    test = mongodbatlas.get_encryption_at_rest_output(project_id=test_encryption_at_rest.project_id)
    pulumi.export("isGcpEncryptionAtRestValid", test.google_cloud_kms_config.valid)
    ```


    :param _builtins.str project_id: Unique 24-hexadecimal digit string that identifies your project.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getEncryptionAtRest:getEncryptionAtRest', __args__, opts=opts, typ=GetEncryptionAtRestResult)
    return __ret__.apply(lambda __response__: GetEncryptionAtRestResult(
        aws_kms_config=pulumi.get(__response__, 'aws_kms_config'),
        azure_key_vault_config=pulumi.get(__response__, 'azure_key_vault_config'),
        enabled_for_search_nodes=pulumi.get(__response__, 'enabled_for_search_nodes'),
        google_cloud_kms_config=pulumi.get(__response__, 'google_cloud_kms_config'),
        id=pulumi.get(__response__, 'id'),
        project_id=pulumi.get(__response__, 'project_id')))
