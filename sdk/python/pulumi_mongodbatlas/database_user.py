# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['DatabaseUser']


class DatabaseUser(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auth_database_name: Optional[pulumi.Input[str]] = None,
                 database_name: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['DatabaseUserLabelArgs']]]]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['DatabaseUserRoleArgs']]]]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 x509_type: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        `DatabaseUser` provides a Database User resource. This represents a database user which will be applied to all clusters within the project.

        Each user has a set of roles that provide access to the project’s databases. User's roles apply to all the clusters in the project: if two clusters have a `products` database and a user has a role granting `read` access on the products database, the user has that access on both clusters.

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

        > **IMPORTANT:** All arguments including the password will be stored in the raw state as plain-text.

        ## Example Usage
        ### S

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.DatabaseUser("test",
            auth_database_name="admin",
            labels=[mongodbatlas.DatabaseUserLabelArgs(
                key="My Key",
                value="My Value",
            )],
            password="test-acc-password",
            project_id="<PROJECT-ID>",
            roles=[
                mongodbatlas.DatabaseUserRoleArgs(
                    database_name="dbforApp",
                    role_name="readWrite",
                ),
                mongodbatlas.DatabaseUserRoleArgs(
                    database_name="admin",
                    role_name="readAnyDatabase",
                ),
            ],
            username="test-acc-username")
        ```

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.DatabaseUser("test",
            auth_database_name="$external",
            labels=[mongodbatlas.DatabaseUserLabelArgs(
                key="%s",
                value="%s",
            )],
            project_id="<PROJECT-ID>",
            roles=[mongodbatlas.DatabaseUserRoleArgs(
                database_name="admin",
                role_name="readAnyDatabase",
            )],
            username="test-acc-username",
            x509_type="MANAGED")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] auth_database_name: The user’s authentication database. A user must provide both a username and authentication database to log into MongoDB. In Atlas deployments of MongoDB, the authentication database is always the admin database.
        :param pulumi.Input[str] database_name: Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
        :param pulumi.Input[str] password: User's initial password. A value is required to create the database user, however the argument but may be removed from your configuration after user creation without impacting the user, password or management. IMPORTANT --- Passwords may show up in provider related logs and it will be stored in the state file as plain-text. Password can be changed after creation using your preferred method, e.g. via the MongoDB Atlas UI, to ensure security.  If you do change management of the password to outside of provider be sure to remove the argument from the provider configuration so it is not inadvertently updated to the original password.
        :param pulumi.Input[str] project_id: The unique ID for the project to create the database user.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['DatabaseUserRoleArgs']]]] roles: List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
        :param pulumi.Input[str] username: Username for authenticating to MongoDB.
        :param pulumi.Input[str] x509_type: X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
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

            __props__['auth_database_name'] = auth_database_name
            if database_name is not None:
                warnings.warn("use auth_database_name instead", DeprecationWarning)
                pulumi.log.warn("database_name is deprecated: use auth_database_name instead")
            __props__['database_name'] = database_name
            __props__['labels'] = labels
            __props__['password'] = password
            if project_id is None:
                raise TypeError("Missing required property 'project_id'")
            __props__['project_id'] = project_id
            __props__['roles'] = roles
            if username is None:
                raise TypeError("Missing required property 'username'")
            __props__['username'] = username
            __props__['x509_type'] = x509_type
        super(DatabaseUser, __self__).__init__(
            'mongodbatlas:index/databaseUser:DatabaseUser',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            auth_database_name: Optional[pulumi.Input[str]] = None,
            database_name: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['DatabaseUserLabelArgs']]]]] = None,
            password: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            roles: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['DatabaseUserRoleArgs']]]]] = None,
            username: Optional[pulumi.Input[str]] = None,
            x509_type: Optional[pulumi.Input[str]] = None) -> 'DatabaseUser':
        """
        Get an existing DatabaseUser resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] auth_database_name: The user’s authentication database. A user must provide both a username and authentication database to log into MongoDB. In Atlas deployments of MongoDB, the authentication database is always the admin database.
        :param pulumi.Input[str] database_name: Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
        :param pulumi.Input[str] password: User's initial password. A value is required to create the database user, however the argument but may be removed from your configuration after user creation without impacting the user, password or management. IMPORTANT --- Passwords may show up in provider related logs and it will be stored in the state file as plain-text. Password can be changed after creation using your preferred method, e.g. via the MongoDB Atlas UI, to ensure security.  If you do change management of the password to outside of provider be sure to remove the argument from the provider configuration so it is not inadvertently updated to the original password.
        :param pulumi.Input[str] project_id: The unique ID for the project to create the database user.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['DatabaseUserRoleArgs']]]] roles: List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
        :param pulumi.Input[str] username: Username for authenticating to MongoDB.
        :param pulumi.Input[str] x509_type: X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["auth_database_name"] = auth_database_name
        __props__["database_name"] = database_name
        __props__["labels"] = labels
        __props__["password"] = password
        __props__["project_id"] = project_id
        __props__["roles"] = roles
        __props__["username"] = username
        __props__["x509_type"] = x509_type
        return DatabaseUser(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="authDatabaseName")
    def auth_database_name(self) -> pulumi.Output[Optional[str]]:
        """
        The user’s authentication database. A user must provide both a username and authentication database to log into MongoDB. In Atlas deployments of MongoDB, the authentication database is always the admin database.
        """
        return pulumi.get(self, "auth_database_name")

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> pulumi.Output[Optional[str]]:
        """
        Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
        """
        return pulumi.get(self, "database_name")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[List['outputs.DatabaseUserLabel']]:
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[Optional[str]]:
        """
        User's initial password. A value is required to create the database user, however the argument but may be removed from your configuration after user creation without impacting the user, password or management. IMPORTANT --- Passwords may show up in provider related logs and it will be stored in the state file as plain-text. Password can be changed after creation using your preferred method, e.g. via the MongoDB Atlas UI, to ensure security.  If you do change management of the password to outside of provider be sure to remove the argument from the provider configuration so it is not inadvertently updated to the original password.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The unique ID for the project to create the database user.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def roles(self) -> pulumi.Output[List['outputs.DatabaseUserRole']]:
        """
        List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
        """
        return pulumi.get(self, "roles")

    @property
    @pulumi.getter
    def username(self) -> pulumi.Output[str]:
        """
        Username for authenticating to MongoDB.
        """
        return pulumi.get(self, "username")

    @property
    @pulumi.getter(name="x509Type")
    def x509_type(self) -> pulumi.Output[Optional[str]]:
        """
        X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
        """
        return pulumi.get(self, "x509_type")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

