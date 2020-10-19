# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['EncryptionAtRest']


class EncryptionAtRest(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws_kms: Optional[pulumi.Input[pulumi.InputType['EncryptionAtRestAwsKmsArgs']]] = None,
                 azure_key_vault: Optional[pulumi.Input[pulumi.InputType['EncryptionAtRestAzureKeyVaultArgs']]] = None,
                 google_cloud_kms: Optional[pulumi.Input[pulumi.InputType['EncryptionAtRestGoogleCloudKmsArgs']]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        `EncryptionAtRest` Allows management of encryption at rest for an Atlas project with one of the following providers:

        [Amazon Web Services Key Management Service](https://docs.atlas.mongodb.com/security-aws-kms/#security-aws-kms)
        [Azure Key Vault](https://docs.atlas.mongodb.com/security-azure-kms/#security-azure-kms)
        [Google Cloud KMS](https://docs.atlas.mongodb.com/security-gcp-kms/#security-gcp-kms)

        After configuring at least one Encryption at Rest provider for the Atlas project, Project Owners can enable Encryption at Rest for each Atlas cluster for which they require encryption. The Encryption at Rest provider does not have to match the cluster cloud service provider.

        Atlas does not automatically rotate user-managed encryption keys. Defer to your preferred Encryption at Rest provider’s documentation and guidance for best practices on key rotation. Atlas automatically creates a 365-day key rotation alert when you configure Encryption at Rest using your Key Management in an Atlas project.

        See [Encryption at Rest](https://docs.atlas.mongodb.com/security-kms-encryption/index.html) for more information, including prerequisites and restrictions.

        > **IMPORTANT** Atlas encrypts all cluster storage and snapshot volumes, securing all cluster data on disk: a concept known as encryption at rest, by default.

        > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.EncryptionAtRest("test",
            aws_kms=mongodbatlas.EncryptionAtRestAwsKmsArgs(
                access_key_id="AKIAIOSFODNN7EXAMPLE",
                customer_master_key_id="030gce02-586d-48d2-a966-05ea954fde0g",
                enabled=True,
                region="US_EAST_1",
                secret_access_key="wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY",
            ),
            azure_key_vault=mongodbatlas.EncryptionAtRestAzureKeyVaultArgs(
                azure_environment="AZURE",
                client_id="g54f9e2-89e3-40fd-8188-EXAMPLEID",
                enabled=True,
                key_identifier="https://EXAMPLEKeyVault.vault.azure.net/keys/EXAMPLEKey/d891821e3d364e9eb88fbd3d11807b86",
                key_vault_name="EXAMPLEKeyVault",
                resource_group_name="ExampleRGName",
                secret="EXAMPLESECRET",
                subscription_id="0ec944e3-g725-44f9-a147-EXAMPLEID",
                tenant_id="e8e4b6ba-ff32-4c88-a9af-EXAMPLEID",
            ),
            google_cloud_kms=mongodbatlas.EncryptionAtRestGoogleCloudKmsArgs(
                enabled=True,
                key_version_resource_id="projects/my-project-common-0/locations/us-east4/keyRings/my-key-ring-0/cryptoKeys/my-key-0/cryptoKeyVersions/1",
                service_account_key="{\"type\": \"service_account\",\"project_id\": \"my-project-common-0\",\"private_key_id\": \"e120598ea4f88249469fcdd75a9a785c1bb3\",\"private_key\": \"-----BEGIN PRIVATE KEY-----\\nMIIEuwIBA(truncated)SfecnS0mT94D9\\n-----END PRIVATE KEY-----\\n\",\"client_email\": \"my-email-kms-0@my-project-common-0.iam.gserviceaccount.com\",\"client_id\": \"10180967717292066\",\"auth_uri\": \"https://accounts.google.com/o/oauth2/auth\",\"token_uri\": \"https://accounts.google.com/o/oauth2/token\",\"auth_provider_x509_cert_url\": \"https://www.googleapis.com/oauth2/v1/certs\",\"client_x509_cert_url\": \"https://www.googleapis.com/robot/v1/metadata/x509/my-email-kms-0%40my-project-common-0.iam.gserviceaccount.com\"}",
            ),
            project_id="<PROJECT-ID>")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['EncryptionAtRestAwsKmsArgs']] aws_kms: Specifies AWS KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
        :param pulumi.Input[pulumi.InputType['EncryptionAtRestAzureKeyVaultArgs']] azure_key_vault: Specifies Azure Key Vault configuration details and whether Encryption at Rest is enabled for an Atlas project.
        :param pulumi.Input[pulumi.InputType['EncryptionAtRestGoogleCloudKmsArgs']] google_cloud_kms: Specifies GCP KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
        :param pulumi.Input[str] project_id: The unique identifier for the project.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['aws_kms'] = aws_kms
            __props__['azure_key_vault'] = azure_key_vault
            __props__['google_cloud_kms'] = google_cloud_kms
            if project_id is None:
                raise TypeError("Missing required property 'project_id'")
            __props__['project_id'] = project_id
        super(EncryptionAtRest, __self__).__init__(
            'mongodbatlas:index/encryptionAtRest:EncryptionAtRest',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aws_kms: Optional[pulumi.Input[pulumi.InputType['EncryptionAtRestAwsKmsArgs']]] = None,
            azure_key_vault: Optional[pulumi.Input[pulumi.InputType['EncryptionAtRestAzureKeyVaultArgs']]] = None,
            google_cloud_kms: Optional[pulumi.Input[pulumi.InputType['EncryptionAtRestGoogleCloudKmsArgs']]] = None,
            project_id: Optional[pulumi.Input[str]] = None) -> 'EncryptionAtRest':
        """
        Get an existing EncryptionAtRest resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['EncryptionAtRestAwsKmsArgs']] aws_kms: Specifies AWS KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
        :param pulumi.Input[pulumi.InputType['EncryptionAtRestAzureKeyVaultArgs']] azure_key_vault: Specifies Azure Key Vault configuration details and whether Encryption at Rest is enabled for an Atlas project.
        :param pulumi.Input[pulumi.InputType['EncryptionAtRestGoogleCloudKmsArgs']] google_cloud_kms: Specifies GCP KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
        :param pulumi.Input[str] project_id: The unique identifier for the project.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["aws_kms"] = aws_kms
        __props__["azure_key_vault"] = azure_key_vault
        __props__["google_cloud_kms"] = google_cloud_kms
        __props__["project_id"] = project_id
        return EncryptionAtRest(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="awsKms")
    def aws_kms(self) -> pulumi.Output[Optional['outputs.EncryptionAtRestAwsKms']]:
        """
        Specifies AWS KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
        """
        return pulumi.get(self, "aws_kms")

    @property
    @pulumi.getter(name="azureKeyVault")
    def azure_key_vault(self) -> pulumi.Output[Optional['outputs.EncryptionAtRestAzureKeyVault']]:
        """
        Specifies Azure Key Vault configuration details and whether Encryption at Rest is enabled for an Atlas project.
        """
        return pulumi.get(self, "azure_key_vault")

    @property
    @pulumi.getter(name="googleCloudKms")
    def google_cloud_kms(self) -> pulumi.Output[Optional['outputs.EncryptionAtRestGoogleCloudKms']]:
        """
        Specifies GCP KMS configuration details and whether Encryption at Rest is enabled for an Atlas project.
        """
        return pulumi.get(self, "google_cloud_kms")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The unique identifier for the project.
        """
        return pulumi.get(self, "project_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

