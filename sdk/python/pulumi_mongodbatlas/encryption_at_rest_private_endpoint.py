# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
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

__all__ = ['EncryptionAtRestPrivateEndpointArgs', 'EncryptionAtRestPrivateEndpoint']

@pulumi.input_type
class EncryptionAtRestPrivateEndpointArgs:
    def __init__(__self__, *,
                 cloud_provider: pulumi.Input[builtins.str],
                 project_id: pulumi.Input[builtins.str],
                 region_name: pulumi.Input[builtins.str]):
        """
        The set of arguments for constructing a EncryptionAtRestPrivateEndpoint resource.
        :param pulumi.Input[builtins.str] cloud_provider: Label that identifies the cloud provider for the Encryption At Rest private endpoint.
        :param pulumi.Input[builtins.str] project_id: Unique 24-hexadecimal digit string that identifies your project.
        :param pulumi.Input[builtins.str] region_name: Cloud provider region in which the Encryption At Rest private endpoint is located.
        """
        pulumi.set(__self__, "cloud_provider", cloud_provider)
        pulumi.set(__self__, "project_id", project_id)
        pulumi.set(__self__, "region_name", region_name)

    @property
    @pulumi.getter(name="cloudProvider")
    def cloud_provider(self) -> pulumi.Input[builtins.str]:
        """
        Label that identifies the cloud provider for the Encryption At Rest private endpoint.
        """
        return pulumi.get(self, "cloud_provider")

    @cloud_provider.setter
    def cloud_provider(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "cloud_provider", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[builtins.str]:
        """
        Unique 24-hexadecimal digit string that identifies your project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="regionName")
    def region_name(self) -> pulumi.Input[builtins.str]:
        """
        Cloud provider region in which the Encryption At Rest private endpoint is located.
        """
        return pulumi.get(self, "region_name")

    @region_name.setter
    def region_name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "region_name", value)


@pulumi.input_type
class _EncryptionAtRestPrivateEndpointState:
    def __init__(__self__, *,
                 cloud_provider: Optional[pulumi.Input[builtins.str]] = None,
                 error_message: Optional[pulumi.Input[builtins.str]] = None,
                 private_endpoint_connection_name: Optional[pulumi.Input[builtins.str]] = None,
                 project_id: Optional[pulumi.Input[builtins.str]] = None,
                 region_name: Optional[pulumi.Input[builtins.str]] = None,
                 status: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering EncryptionAtRestPrivateEndpoint resources.
        :param pulumi.Input[builtins.str] cloud_provider: Label that identifies the cloud provider for the Encryption At Rest private endpoint.
        :param pulumi.Input[builtins.str] error_message: Error message for failures associated with the Encryption At Rest private endpoint.
        :param pulumi.Input[builtins.str] private_endpoint_connection_name: Connection name of the Azure Private Endpoint.
        :param pulumi.Input[builtins.str] project_id: Unique 24-hexadecimal digit string that identifies your project.
        :param pulumi.Input[builtins.str] region_name: Cloud provider region in which the Encryption At Rest private endpoint is located.
        :param pulumi.Input[builtins.str] status: State of the Encryption At Rest private endpoint.
        """
        if cloud_provider is not None:
            pulumi.set(__self__, "cloud_provider", cloud_provider)
        if error_message is not None:
            pulumi.set(__self__, "error_message", error_message)
        if private_endpoint_connection_name is not None:
            pulumi.set(__self__, "private_endpoint_connection_name", private_endpoint_connection_name)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if region_name is not None:
            pulumi.set(__self__, "region_name", region_name)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="cloudProvider")
    def cloud_provider(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Label that identifies the cloud provider for the Encryption At Rest private endpoint.
        """
        return pulumi.get(self, "cloud_provider")

    @cloud_provider.setter
    def cloud_provider(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "cloud_provider", value)

    @property
    @pulumi.getter(name="errorMessage")
    def error_message(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Error message for failures associated with the Encryption At Rest private endpoint.
        """
        return pulumi.get(self, "error_message")

    @error_message.setter
    def error_message(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "error_message", value)

    @property
    @pulumi.getter(name="privateEndpointConnectionName")
    def private_endpoint_connection_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Connection name of the Azure Private Endpoint.
        """
        return pulumi.get(self, "private_endpoint_connection_name")

    @private_endpoint_connection_name.setter
    def private_endpoint_connection_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "private_endpoint_connection_name", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Unique 24-hexadecimal digit string that identifies your project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="regionName")
    def region_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Cloud provider region in which the Encryption At Rest private endpoint is located.
        """
        return pulumi.get(self, "region_name")

    @region_name.setter
    def region_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "region_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        State of the Encryption At Rest private endpoint.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "status", value)


class EncryptionAtRestPrivateEndpoint(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cloud_provider: Optional[pulumi.Input[builtins.str]] = None,
                 project_id: Optional[pulumi.Input[builtins.str]] = None,
                 region_name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        ## # Resource: EncryptionAtRestPrivateEndpoint

        `EncryptionAtRestPrivateEndpoint` provides a resource for managing a private endpoint used for encryption at rest with customer-managed keys. This ensures all traffic between Atlas and customer key management systems take place over private network interfaces.

        > **NOTE:** As a prerequisite to configuring a private endpoint for Azure Key Vault or AWS KMS, the corresponding `EncryptionAtRest` resource has to be adjusted by configuring to true `azure_key_vault_config.require_private_networking` or `aws_kms_config.require_private_networking`, respectively. This attribute should be updated in place, ensuring the customer-managed keys encryption is never disabled.

        > **NOTE:** This resource does not support update operations. To modify values of a private endpoint the existing resource must be deleted and a new one can be created with the modified values.

        ## Example Usage

        ### S

        > **NOTE:** Only Azure Key Vault with Azure Private Link and AWS KMS over AWS PrivateLink is supported at this time.

        ### Configuring Atlas Encryption at Rest using Azure Key Vault with Azure Private Link
        To learn more about existing limitations, see [Manage Customer Keys with Azure Key Vault Over Private Endpoints](https://www.mongodb.com/docs/atlas/security/azure-kms-over-private-endpoint/#manage-customer-keys-with-azure-key-vault-over-private-endpoints).

        Make sure to reference the complete example section for detailed steps and considerations.

        ```python
        import pulumi
        import json
        import pulumi_azapi as azapi
        import pulumi_mongodbatlas as mongodbatlas

        ear = mongodbatlas.EncryptionAtRest("ear",
            project_id=atlas_project_id,
            azure_key_vault_config={
                "require_private_networking": True,
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
        # Creates private endpoint
        endpoint = mongodbatlas.EncryptionAtRestPrivateEndpoint("endpoint",
            project_id=ear.project_id,
            cloud_provider="AZURE",
            region_name=azure_region_name)
        key_vault_resource_id = f"/subscriptions/{azure_subscription_id}/resourceGroups/{azure_resource_group_name}/providers/Microsoft.KeyVault/vaults/{azure_key_vault_name}"
        # Approves private endpoint connection from Azure Key Vault
        approval = azapi.index.UpdateResource("approval",
            type=Microsoft.KeyVault/Vaults/PrivateEndpointConnections@2023-07-01,
            name=endpoint.private_endpoint_connection_name,
            parent_id=key_vault_resource_id,
            body=json.dumps({
                properties: {
                    privateLinkServiceConnectionState: {
                        description: Approved via Terraform,
                        status: Approved,
                    },
                },
            }))
        ```

        ### Configuring Atlas Encryption at Rest using AWS KMS with AWS PrivateLink

        Make sure to reference the complete example section for detailed steps and considerations.

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        ear = mongodbatlas.EncryptionAtRest("ear",
            project_id=atlas_project_id,
            aws_kms_config={
                "require_private_networking": True,
                "enabled": True,
                "customer_master_key_id": aws_kms_key_id,
                "region": atlas_aws_region,
                "role_id": auth_role["roleId"],
            })
        # Creates private endpoint
        endpoint = mongodbatlas.EncryptionAtRestPrivateEndpoint("endpoint",
            project_id=ear.project_id,
            cloud_provider="AWS",
            region_name=atlas_aws_region)
        ```

        ## Import

        Encryption At Rest Private Endpoint resource can be imported using the project ID, cloud provider, and private endpoint ID. The format must be `{project_id}-{cloud_provider}-{private_endpoint_id}` e.g.

        For more information see:
        - [MongoDB Atlas API - Private Endpoint for Encryption at Rest Using Customer Key Management](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Encryption-at-Rest-using-Customer-Key-Management/operation/getEncryptionAtRestPrivateEndpoint) Documentation.
        - [Manage Customer Keys with Azure Key Vault Over Private Endpoints](https://www.mongodb.com/docs/atlas/security/azure-kms-over-private-endpoint/).

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] cloud_provider: Label that identifies the cloud provider for the Encryption At Rest private endpoint.
        :param pulumi.Input[builtins.str] project_id: Unique 24-hexadecimal digit string that identifies your project.
        :param pulumi.Input[builtins.str] region_name: Cloud provider region in which the Encryption At Rest private endpoint is located.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EncryptionAtRestPrivateEndpointArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## # Resource: EncryptionAtRestPrivateEndpoint

        `EncryptionAtRestPrivateEndpoint` provides a resource for managing a private endpoint used for encryption at rest with customer-managed keys. This ensures all traffic between Atlas and customer key management systems take place over private network interfaces.

        > **NOTE:** As a prerequisite to configuring a private endpoint for Azure Key Vault or AWS KMS, the corresponding `EncryptionAtRest` resource has to be adjusted by configuring to true `azure_key_vault_config.require_private_networking` or `aws_kms_config.require_private_networking`, respectively. This attribute should be updated in place, ensuring the customer-managed keys encryption is never disabled.

        > **NOTE:** This resource does not support update operations. To modify values of a private endpoint the existing resource must be deleted and a new one can be created with the modified values.

        ## Example Usage

        ### S

        > **NOTE:** Only Azure Key Vault with Azure Private Link and AWS KMS over AWS PrivateLink is supported at this time.

        ### Configuring Atlas Encryption at Rest using Azure Key Vault with Azure Private Link
        To learn more about existing limitations, see [Manage Customer Keys with Azure Key Vault Over Private Endpoints](https://www.mongodb.com/docs/atlas/security/azure-kms-over-private-endpoint/#manage-customer-keys-with-azure-key-vault-over-private-endpoints).

        Make sure to reference the complete example section for detailed steps and considerations.

        ```python
        import pulumi
        import json
        import pulumi_azapi as azapi
        import pulumi_mongodbatlas as mongodbatlas

        ear = mongodbatlas.EncryptionAtRest("ear",
            project_id=atlas_project_id,
            azure_key_vault_config={
                "require_private_networking": True,
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
        # Creates private endpoint
        endpoint = mongodbatlas.EncryptionAtRestPrivateEndpoint("endpoint",
            project_id=ear.project_id,
            cloud_provider="AZURE",
            region_name=azure_region_name)
        key_vault_resource_id = f"/subscriptions/{azure_subscription_id}/resourceGroups/{azure_resource_group_name}/providers/Microsoft.KeyVault/vaults/{azure_key_vault_name}"
        # Approves private endpoint connection from Azure Key Vault
        approval = azapi.index.UpdateResource("approval",
            type=Microsoft.KeyVault/Vaults/PrivateEndpointConnections@2023-07-01,
            name=endpoint.private_endpoint_connection_name,
            parent_id=key_vault_resource_id,
            body=json.dumps({
                properties: {
                    privateLinkServiceConnectionState: {
                        description: Approved via Terraform,
                        status: Approved,
                    },
                },
            }))
        ```

        ### Configuring Atlas Encryption at Rest using AWS KMS with AWS PrivateLink

        Make sure to reference the complete example section for detailed steps and considerations.

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        ear = mongodbatlas.EncryptionAtRest("ear",
            project_id=atlas_project_id,
            aws_kms_config={
                "require_private_networking": True,
                "enabled": True,
                "customer_master_key_id": aws_kms_key_id,
                "region": atlas_aws_region,
                "role_id": auth_role["roleId"],
            })
        # Creates private endpoint
        endpoint = mongodbatlas.EncryptionAtRestPrivateEndpoint("endpoint",
            project_id=ear.project_id,
            cloud_provider="AWS",
            region_name=atlas_aws_region)
        ```

        ## Import

        Encryption At Rest Private Endpoint resource can be imported using the project ID, cloud provider, and private endpoint ID. The format must be `{project_id}-{cloud_provider}-{private_endpoint_id}` e.g.

        For more information see:
        - [MongoDB Atlas API - Private Endpoint for Encryption at Rest Using Customer Key Management](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Encryption-at-Rest-using-Customer-Key-Management/operation/getEncryptionAtRestPrivateEndpoint) Documentation.
        - [Manage Customer Keys with Azure Key Vault Over Private Endpoints](https://www.mongodb.com/docs/atlas/security/azure-kms-over-private-endpoint/).

        :param str resource_name: The name of the resource.
        :param EncryptionAtRestPrivateEndpointArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EncryptionAtRestPrivateEndpointArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cloud_provider: Optional[pulumi.Input[builtins.str]] = None,
                 project_id: Optional[pulumi.Input[builtins.str]] = None,
                 region_name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EncryptionAtRestPrivateEndpointArgs.__new__(EncryptionAtRestPrivateEndpointArgs)

            if cloud_provider is None and not opts.urn:
                raise TypeError("Missing required property 'cloud_provider'")
            __props__.__dict__["cloud_provider"] = cloud_provider
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            if region_name is None and not opts.urn:
                raise TypeError("Missing required property 'region_name'")
            __props__.__dict__["region_name"] = region_name
            __props__.__dict__["error_message"] = None
            __props__.__dict__["private_endpoint_connection_name"] = None
            __props__.__dict__["status"] = None
        super(EncryptionAtRestPrivateEndpoint, __self__).__init__(
            'mongodbatlas:index/encryptionAtRestPrivateEndpoint:EncryptionAtRestPrivateEndpoint',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cloud_provider: Optional[pulumi.Input[builtins.str]] = None,
            error_message: Optional[pulumi.Input[builtins.str]] = None,
            private_endpoint_connection_name: Optional[pulumi.Input[builtins.str]] = None,
            project_id: Optional[pulumi.Input[builtins.str]] = None,
            region_name: Optional[pulumi.Input[builtins.str]] = None,
            status: Optional[pulumi.Input[builtins.str]] = None) -> 'EncryptionAtRestPrivateEndpoint':
        """
        Get an existing EncryptionAtRestPrivateEndpoint resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] cloud_provider: Label that identifies the cloud provider for the Encryption At Rest private endpoint.
        :param pulumi.Input[builtins.str] error_message: Error message for failures associated with the Encryption At Rest private endpoint.
        :param pulumi.Input[builtins.str] private_endpoint_connection_name: Connection name of the Azure Private Endpoint.
        :param pulumi.Input[builtins.str] project_id: Unique 24-hexadecimal digit string that identifies your project.
        :param pulumi.Input[builtins.str] region_name: Cloud provider region in which the Encryption At Rest private endpoint is located.
        :param pulumi.Input[builtins.str] status: State of the Encryption At Rest private endpoint.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EncryptionAtRestPrivateEndpointState.__new__(_EncryptionAtRestPrivateEndpointState)

        __props__.__dict__["cloud_provider"] = cloud_provider
        __props__.__dict__["error_message"] = error_message
        __props__.__dict__["private_endpoint_connection_name"] = private_endpoint_connection_name
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["region_name"] = region_name
        __props__.__dict__["status"] = status
        return EncryptionAtRestPrivateEndpoint(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="cloudProvider")
    def cloud_provider(self) -> pulumi.Output[builtins.str]:
        """
        Label that identifies the cloud provider for the Encryption At Rest private endpoint.
        """
        return pulumi.get(self, "cloud_provider")

    @property
    @pulumi.getter(name="errorMessage")
    def error_message(self) -> pulumi.Output[builtins.str]:
        """
        Error message for failures associated with the Encryption At Rest private endpoint.
        """
        return pulumi.get(self, "error_message")

    @property
    @pulumi.getter(name="privateEndpointConnectionName")
    def private_endpoint_connection_name(self) -> pulumi.Output[builtins.str]:
        """
        Connection name of the Azure Private Endpoint.
        """
        return pulumi.get(self, "private_endpoint_connection_name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[builtins.str]:
        """
        Unique 24-hexadecimal digit string that identifies your project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="regionName")
    def region_name(self) -> pulumi.Output[builtins.str]:
        """
        Cloud provider region in which the Encryption At Rest private endpoint is located.
        """
        return pulumi.get(self, "region_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[builtins.str]:
        """
        State of the Encryption At Rest private endpoint.
        """
        return pulumi.get(self, "status")

