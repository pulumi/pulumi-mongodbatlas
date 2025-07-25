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
    'GetDatabaseUsersResult',
    'AwaitableGetDatabaseUsersResult',
    'get_database_users',
    'get_database_users_output',
]

@pulumi.output_type
class GetDatabaseUsersResult:
    """
    A collection of values returned by getDatabaseUsers.
    """
    def __init__(__self__, id=None, project_id=None, results=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if results and not isinstance(results, list):
            raise TypeError("Expected argument 'results' to be a list")
        pulumi.set(__self__, "results", results)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        Autogenerated Unique ID for this data source.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> _builtins.str:
        """
        ID of the Atlas project the user belongs to.
        """
        return pulumi.get(self, "project_id")

    @_builtins.property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetDatabaseUsersResultResult']:
        """
        A list where each represents a Database user.
        """
        return pulumi.get(self, "results")


class AwaitableGetDatabaseUsersResult(GetDatabaseUsersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDatabaseUsersResult(
            id=self.id,
            project_id=self.project_id,
            results=self.results)


def get_database_users(project_id: Optional[_builtins.str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDatabaseUsersResult:
    """
    ## # Data Source: get_database_users

    `get_database_users` describes all Database Users. This represents a database user which will be applied to all clusters within the project.

    Each user has a set of roles that provide access to the project’s databases. User's roles apply to all the clusters in the project: if two clusters have a `products` database and a user has a role granting `read` access on the products database, the user has that access on both clusters.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_database_user = mongodbatlas.DatabaseUser("test",
        username="test-acc-username",
        password="test-acc-password",
        project_id="<PROJECT-ID>",
        auth_database_name="admin",
        roles=[
            {
                "role_name": "readWrite",
                "database_name": "admin",
            },
            {
                "role_name": "atlasAdmin",
                "database_name": "admin",
            },
        ],
        labels=[
            {
                "key": "key 1",
                "value": "value 1",
            },
            {
                "key": "key 2",
                "value": "value 2",
            },
        ])
    test = mongodbatlas.get_database_users_output(project_id=test_database_user.project_id)
    ```
    **Example of usage with a OIDC federated authentication user**

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_database_user = mongodbatlas.DatabaseUser("test",
        username="64d613677e1ad50839cce4db/testUserOrGroup",
        project_id="6414908c207f4d22f4d8f232",
        auth_database_name="admin",
        oidc_auth_type="IDP_GROUP",
        roles=[{
            "role_name": "readWriteAnyDatabase",
            "database_name": "admin",
        }])
    test = mongodbatlas.get_database_users(project_id="6414908c207f4d22f4d8f232")
    ```
    Note: OIDC support is only avalible starting in [MongoDB 7.0](https://www.mongodb.com/evolved#mdbsevenzero) or later. To learn more, see the [MongoDB Atlas documentation](https://www.mongodb.com/docs/atlas/security-oidc/).


    :param _builtins.str project_id: The unique ID for the project to get all database users.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getDatabaseUsers:getDatabaseUsers', __args__, opts=opts, typ=GetDatabaseUsersResult).value

    return AwaitableGetDatabaseUsersResult(
        id=pulumi.get(__ret__, 'id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        results=pulumi.get(__ret__, 'results'))
def get_database_users_output(project_id: Optional[pulumi.Input[_builtins.str]] = None,
                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDatabaseUsersResult]:
    """
    ## # Data Source: get_database_users

    `get_database_users` describes all Database Users. This represents a database user which will be applied to all clusters within the project.

    Each user has a set of roles that provide access to the project’s databases. User's roles apply to all the clusters in the project: if two clusters have a `products` database and a user has a role granting `read` access on the products database, the user has that access on both clusters.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_database_user = mongodbatlas.DatabaseUser("test",
        username="test-acc-username",
        password="test-acc-password",
        project_id="<PROJECT-ID>",
        auth_database_name="admin",
        roles=[
            {
                "role_name": "readWrite",
                "database_name": "admin",
            },
            {
                "role_name": "atlasAdmin",
                "database_name": "admin",
            },
        ],
        labels=[
            {
                "key": "key 1",
                "value": "value 1",
            },
            {
                "key": "key 2",
                "value": "value 2",
            },
        ])
    test = mongodbatlas.get_database_users_output(project_id=test_database_user.project_id)
    ```
    **Example of usage with a OIDC federated authentication user**

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_database_user = mongodbatlas.DatabaseUser("test",
        username="64d613677e1ad50839cce4db/testUserOrGroup",
        project_id="6414908c207f4d22f4d8f232",
        auth_database_name="admin",
        oidc_auth_type="IDP_GROUP",
        roles=[{
            "role_name": "readWriteAnyDatabase",
            "database_name": "admin",
        }])
    test = mongodbatlas.get_database_users(project_id="6414908c207f4d22f4d8f232")
    ```
    Note: OIDC support is only avalible starting in [MongoDB 7.0](https://www.mongodb.com/evolved#mdbsevenzero) or later. To learn more, see the [MongoDB Atlas documentation](https://www.mongodb.com/docs/atlas/security-oidc/).


    :param _builtins.str project_id: The unique ID for the project to get all database users.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getDatabaseUsers:getDatabaseUsers', __args__, opts=opts, typ=GetDatabaseUsersResult)
    return __ret__.apply(lambda __response__: GetDatabaseUsersResult(
        id=pulumi.get(__response__, 'id'),
        project_id=pulumi.get(__response__, 'project_id'),
        results=pulumi.get(__response__, 'results')))
