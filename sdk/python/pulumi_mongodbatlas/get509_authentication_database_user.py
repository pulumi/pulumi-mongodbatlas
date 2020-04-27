# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class Get509AuthenticationDatabaseUserResult:
    """
    A collection of values returned by get509AuthenticationDatabaseUser.
    """
    def __init__(__self__, certificates=None, customer_x509_cas=None, id=None, project_id=None, username=None):
        if certificates and not isinstance(certificates, list):
            raise TypeError("Expected argument 'certificates' to be a list")
        __self__.certificates = certificates
        """
        Array of objects where each details one unexpired database user certificate.
        """
        if customer_x509_cas and not isinstance(customer_x509_cas, str):
            raise TypeError("Expected argument 'customer_x509_cas' to be a str")
        __self__.customer_x509_cas = customer_x509_cas
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        The provider-assigned unique ID for this managed resource.
        """
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        __self__.project_id = project_id
        if username and not isinstance(username, str):
            raise TypeError("Expected argument 'username' to be a str")
        __self__.username = username
class AwaitableGet509AuthenticationDatabaseUserResult(Get509AuthenticationDatabaseUserResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return Get509AuthenticationDatabaseUserResult(
            certificates=self.certificates,
            customer_x509_cas=self.customer_x509_cas,
            id=self.id,
            project_id=self.project_id,
            username=self.username)

def get509_authentication_database_user(project_id=None,username=None,opts=None):
    """
    `.X509AuthenticationDatabaseUser` describe a X509 Authentication Database User. This represents a X509 Authentication Database User.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.


    :param str project_id: Identifier for the Atlas project associated with the X.509 configuration.
    :param str username: Username of the database user to create a certificate for.
    """
    __args__ = dict()


    __args__['projectId'] = project_id
    __args__['username'] = username
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/get509AuthenticationDatabaseUser:get509AuthenticationDatabaseUser', __args__, opts=opts).value

    return AwaitableGet509AuthenticationDatabaseUserResult(
        certificates=__ret__.get('certificates'),
        customer_x509_cas=__ret__.get('customerX509Cas'),
        id=__ret__.get('id'),
        project_id=__ret__.get('projectId'),
        username=__ret__.get('username'))
