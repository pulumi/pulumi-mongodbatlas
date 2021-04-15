# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetDatabaseUsersResult',
    'AwaitableGetDatabaseUsersResult',
    'get_database_users',
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
        """
        ID of the Atlas project the user belongs to.
        """
        return pulumi.get(self, "project_id")

    @property
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


def get_database_users(project_id: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDatabaseUsersResult:
    """
    `getDatabaseUsers` describe all Database Users. This represents a database user which will be applied to all clusters within the project.

    Each user has a set of roles that provide access to the project’s databases. User's roles apply to all the clusters in the project: if two clusters have a `products` database and a user has a role granting `read` access on the products database, the user has that access on both clusters.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_database_user = mongodbatlas.DatabaseUser("testDatabaseUser",
        username="test-acc-username",
        password="test-acc-password",
        project_id="<PROJECT-ID>",
        auth_database_name="admin",
        roles=[
            mongodbatlas.DatabaseUserRoleArgs(
                role_name="readWrite",
                database_name="admin",
            ),
            mongodbatlas.DatabaseUserRoleArgs(
                role_name="atlasAdmin",
                database_name="admin",
            ),
        ],
        labels=[
            mongodbatlas.DatabaseUserLabelArgs(
                key="key 1",
                value="value 1",
            ),
            mongodbatlas.DatabaseUserLabelArgs(
                key="key 2",
                value="value 2",
            ),
        ])
    test_database_users = test_database_user.project_id.apply(lambda project_id: mongodbatlas.get_database_users(project_id=project_id))
    ```


    :param str project_id: The unique ID for the project to get all database users.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getDatabaseUsers:getDatabaseUsers', __args__, opts=opts, typ=GetDatabaseUsersResult).value

    return AwaitableGetDatabaseUsersResult(
        id=__ret__.id,
        project_id=__ret__.project_id,
        results=__ret__.results)
