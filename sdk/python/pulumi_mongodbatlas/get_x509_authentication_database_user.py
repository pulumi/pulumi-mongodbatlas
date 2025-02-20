# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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
from . import outputs

__all__ = [
    'GetX509AuthenticationDatabaseUserResult',
    'AwaitableGetX509AuthenticationDatabaseUserResult',
    'get_x509_authentication_database_user',
    'get_x509_authentication_database_user_output',
]

@pulumi.output_type
class GetX509AuthenticationDatabaseUserResult:
    """
    A collection of values returned by getX509AuthenticationDatabaseUser.
    """
    def __init__(__self__, certificates=None, customer_x509_cas=None, id=None, project_id=None, username=None):
        if certificates and not isinstance(certificates, list):
            raise TypeError("Expected argument 'certificates' to be a list")
        pulumi.set(__self__, "certificates", certificates)
        if customer_x509_cas and not isinstance(customer_x509_cas, str):
            raise TypeError("Expected argument 'customer_x509_cas' to be a str")
        pulumi.set(__self__, "customer_x509_cas", customer_x509_cas)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if username and not isinstance(username, str):
            raise TypeError("Expected argument 'username' to be a str")
        pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def certificates(self) -> Sequence['outputs.GetX509AuthenticationDatabaseUserCertificateResult']:
        """
        Array of objects where each details one unexpired database user certificate.
        """
        return pulumi.get(self, "certificates")

    @property
    @pulumi.getter(name="customerX509Cas")
    def customer_x509_cas(self) -> str:
        return pulumi.get(self, "customer_x509_cas")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def username(self) -> Optional[str]:
        return pulumi.get(self, "username")


class AwaitableGetX509AuthenticationDatabaseUserResult(GetX509AuthenticationDatabaseUserResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetX509AuthenticationDatabaseUserResult(
            certificates=self.certificates,
            customer_x509_cas=self.customer_x509_cas,
            id=self.id,
            project_id=self.project_id,
            username=self.username)


def get_x509_authentication_database_user(project_id: Optional[str] = None,
                                          username: Optional[str] = None,
                                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetX509AuthenticationDatabaseUserResult:
    """
    ## # Data Source: X509AuthenticationDatabaseUser

    `X509AuthenticationDatabaseUser` describes a X509 Authentication Database User. This represents a X509 Authentication Database User.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

    ## Example Usage

    ### S

    ### Example Usage: Save a customer-managed X.509 configuration for an Atlas project
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_x509_authentication_database_user = mongodbatlas.X509AuthenticationDatabaseUser("test",
        project_id="<PROJECT-ID>",
        customer_x509_cas="-----BEGIN CERTIFICATE-----MIICmTCCAgICCQDZnHzklxsT9TANBgkqhkiG9w0BAQsFADCBkDELMAkGA1UEBhMCVVMxDjAMBgNVBAgMBVRleGFzMQ8wDQYDVQQHDAZBdXN0aW4xETAPBgNVBAoMCHRlc3QuY29tMQ0wCwYDVQQLDARUZXN0MREwDwYDVQQDDAh0ZXN0LmNvbTErMCkGCSqGSIb3DQEJARYcbWVsaXNzYS5wbHVua2V0dEBtb25nb2RiLmNvbTAeFw0yMDAyMDQyMDQ2MDFaFw0yMTAyMDMyMDQ2MDFaMIGQMQswCQYDVQQGEwJVUzEOMAwGA1UECAwFVGV4YXMxDzANBgNVBAcMBkF1c3RpbjERMA8GA1UECgwIdGVzdC5jb20xDTALBgNVBAsMBFRlc3QxETAPBgNVBAMMCHRlc3QuY29tMSswKQYJKoZIhvcNAQkBFhxtZWxpc3NhLnBsdW5rZXR0QG1vbmdvZGIuY29tMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCf1LRqr1zftzdYx2Aj9G76tb0noMPtj6faGLlPji1+m6Rn7RWD9L0ntWArcURxvypa9jZ9MXFzDtLevvd3tHEmfrUT3ukNDX6+Jtc4kWm+Dh2A70Pd+deKZ2/OFh8audEKAESGXnTbeJCeQa1XKlIkjqQHBNwES5h1b9vJtFoLJwIDAQABMA0GCSqGSIb3DQEBCwUAA4GBADMUncjEPV/MiZUcVNGmktP6BPmEqMXQWUDpdGW2+Tg2JtUA7MMILtepBkFzLO+GlpZxeAlXO0wxiNgEmCRONgh4+t2w3e7a8GFijYQ99FHrAC5Aiul59bdl18gVqXia1Yeq/iK7Ohfy/Jwd7Hsm530elwkM/ZEkYDjBlZSXYdyz-----END CERTIFICATE-----\\\\\\"\\n")
    test = mongodbatlas.get_x509_authentication_database_user_output(project_id=test_x509_authentication_database_user.project_id)
    ```


    :param str project_id: Identifier for the Atlas project associated with the X.509 configuration.
    :param str username: Username of the database user to create a certificate for.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    __args__['username'] = username
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getX509AuthenticationDatabaseUser:getX509AuthenticationDatabaseUser', __args__, opts=opts, typ=GetX509AuthenticationDatabaseUserResult).value

    return AwaitableGetX509AuthenticationDatabaseUserResult(
        certificates=pulumi.get(__ret__, 'certificates'),
        customer_x509_cas=pulumi.get(__ret__, 'customer_x509_cas'),
        id=pulumi.get(__ret__, 'id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        username=pulumi.get(__ret__, 'username'))
def get_x509_authentication_database_user_output(project_id: Optional[pulumi.Input[str]] = None,
                                                 username: Optional[pulumi.Input[Optional[str]]] = None,
                                                 opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetX509AuthenticationDatabaseUserResult]:
    """
    ## # Data Source: X509AuthenticationDatabaseUser

    `X509AuthenticationDatabaseUser` describes a X509 Authentication Database User. This represents a X509 Authentication Database User.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

    ## Example Usage

    ### S

    ### Example Usage: Save a customer-managed X.509 configuration for an Atlas project
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_x509_authentication_database_user = mongodbatlas.X509AuthenticationDatabaseUser("test",
        project_id="<PROJECT-ID>",
        customer_x509_cas="-----BEGIN CERTIFICATE-----MIICmTCCAgICCQDZnHzklxsT9TANBgkqhkiG9w0BAQsFADCBkDELMAkGA1UEBhMCVVMxDjAMBgNVBAgMBVRleGFzMQ8wDQYDVQQHDAZBdXN0aW4xETAPBgNVBAoMCHRlc3QuY29tMQ0wCwYDVQQLDARUZXN0MREwDwYDVQQDDAh0ZXN0LmNvbTErMCkGCSqGSIb3DQEJARYcbWVsaXNzYS5wbHVua2V0dEBtb25nb2RiLmNvbTAeFw0yMDAyMDQyMDQ2MDFaFw0yMTAyMDMyMDQ2MDFaMIGQMQswCQYDVQQGEwJVUzEOMAwGA1UECAwFVGV4YXMxDzANBgNVBAcMBkF1c3RpbjERMA8GA1UECgwIdGVzdC5jb20xDTALBgNVBAsMBFRlc3QxETAPBgNVBAMMCHRlc3QuY29tMSswKQYJKoZIhvcNAQkBFhxtZWxpc3NhLnBsdW5rZXR0QG1vbmdvZGIuY29tMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCf1LRqr1zftzdYx2Aj9G76tb0noMPtj6faGLlPji1+m6Rn7RWD9L0ntWArcURxvypa9jZ9MXFzDtLevvd3tHEmfrUT3ukNDX6+Jtc4kWm+Dh2A70Pd+deKZ2/OFh8audEKAESGXnTbeJCeQa1XKlIkjqQHBNwES5h1b9vJtFoLJwIDAQABMA0GCSqGSIb3DQEBCwUAA4GBADMUncjEPV/MiZUcVNGmktP6BPmEqMXQWUDpdGW2+Tg2JtUA7MMILtepBkFzLO+GlpZxeAlXO0wxiNgEmCRONgh4+t2w3e7a8GFijYQ99FHrAC5Aiul59bdl18gVqXia1Yeq/iK7Ohfy/Jwd7Hsm530elwkM/ZEkYDjBlZSXYdyz-----END CERTIFICATE-----\\\\\\"\\n")
    test = mongodbatlas.get_x509_authentication_database_user_output(project_id=test_x509_authentication_database_user.project_id)
    ```


    :param str project_id: Identifier for the Atlas project associated with the X.509 configuration.
    :param str username: Username of the database user to create a certificate for.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    __args__['username'] = username
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getX509AuthenticationDatabaseUser:getX509AuthenticationDatabaseUser', __args__, opts=opts, typ=GetX509AuthenticationDatabaseUserResult)
    return __ret__.apply(lambda __response__: GetX509AuthenticationDatabaseUserResult(
        certificates=pulumi.get(__response__, 'certificates'),
        customer_x509_cas=pulumi.get(__response__, 'customer_x509_cas'),
        id=pulumi.get(__response__, 'id'),
        project_id=pulumi.get(__response__, 'project_id'),
        username=pulumi.get(__response__, 'username')))
