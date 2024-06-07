# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['PushBasedLogExportArgs', 'PushBasedLogExport']

@pulumi.input_type
class PushBasedLogExportArgs:
    def __init__(__self__, *,
                 bucket_name: pulumi.Input[str],
                 iam_role_id: pulumi.Input[str],
                 project_id: pulumi.Input[str],
                 prefix_path: Optional[pulumi.Input[str]] = None,
                 timeouts: Optional[pulumi.Input['PushBasedLogExportTimeoutsArgs']] = None):
        """
        The set of arguments for constructing a PushBasedLogExport resource.
        :param pulumi.Input[str] bucket_name: The name of the bucket to which the agent sends the logs to.
        :param pulumi.Input[str] iam_role_id: ID of the AWS IAM role that is used to write to the S3 bucket.
        :param pulumi.Input[str] project_id: Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        :param pulumi.Input[str] prefix_path: S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
        """
        pulumi.set(__self__, "bucket_name", bucket_name)
        pulumi.set(__self__, "iam_role_id", iam_role_id)
        pulumi.set(__self__, "project_id", project_id)
        if prefix_path is not None:
            pulumi.set(__self__, "prefix_path", prefix_path)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)

    @property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> pulumi.Input[str]:
        """
        The name of the bucket to which the agent sends the logs to.
        """
        return pulumi.get(self, "bucket_name")

    @bucket_name.setter
    def bucket_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "bucket_name", value)

    @property
    @pulumi.getter(name="iamRoleId")
    def iam_role_id(self) -> pulumi.Input[str]:
        """
        ID of the AWS IAM role that is used to write to the S3 bucket.
        """
        return pulumi.get(self, "iam_role_id")

    @iam_role_id.setter
    def iam_role_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "iam_role_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="prefixPath")
    def prefix_path(self) -> Optional[pulumi.Input[str]]:
        """
        S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
        """
        return pulumi.get(self, "prefix_path")

    @prefix_path.setter
    def prefix_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "prefix_path", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['PushBasedLogExportTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['PushBasedLogExportTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)


@pulumi.input_type
class _PushBasedLogExportState:
    def __init__(__self__, *,
                 bucket_name: Optional[pulumi.Input[str]] = None,
                 create_date: Optional[pulumi.Input[str]] = None,
                 iam_role_id: Optional[pulumi.Input[str]] = None,
                 prefix_path: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 timeouts: Optional[pulumi.Input['PushBasedLogExportTimeoutsArgs']] = None):
        """
        Input properties used for looking up and filtering PushBasedLogExport resources.
        :param pulumi.Input[str] bucket_name: The name of the bucket to which the agent sends the logs to.
        :param pulumi.Input[str] create_date: Date and time that this feature was enabled on.
        :param pulumi.Input[str] iam_role_id: ID of the AWS IAM role that is used to write to the S3 bucket.
        :param pulumi.Input[str] prefix_path: S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
        :param pulumi.Input[str] project_id: Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        :param pulumi.Input[str] state: Describes whether or not the feature is enabled and what status it is in.
        """
        if bucket_name is not None:
            pulumi.set(__self__, "bucket_name", bucket_name)
        if create_date is not None:
            pulumi.set(__self__, "create_date", create_date)
        if iam_role_id is not None:
            pulumi.set(__self__, "iam_role_id", iam_role_id)
        if prefix_path is not None:
            pulumi.set(__self__, "prefix_path", prefix_path)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)

    @property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the bucket to which the agent sends the logs to.
        """
        return pulumi.get(self, "bucket_name")

    @bucket_name.setter
    def bucket_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket_name", value)

    @property
    @pulumi.getter(name="createDate")
    def create_date(self) -> Optional[pulumi.Input[str]]:
        """
        Date and time that this feature was enabled on.
        """
        return pulumi.get(self, "create_date")

    @create_date.setter
    def create_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_date", value)

    @property
    @pulumi.getter(name="iamRoleId")
    def iam_role_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the AWS IAM role that is used to write to the S3 bucket.
        """
        return pulumi.get(self, "iam_role_id")

    @iam_role_id.setter
    def iam_role_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "iam_role_id", value)

    @property
    @pulumi.getter(name="prefixPath")
    def prefix_path(self) -> Optional[pulumi.Input[str]]:
        """
        S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
        """
        return pulumi.get(self, "prefix_path")

    @prefix_path.setter
    def prefix_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "prefix_path", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        Describes whether or not the feature is enabled and what status it is in.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['PushBasedLogExportTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['PushBasedLogExportTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)


class PushBasedLogExport(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket_name: Optional[pulumi.Input[str]] = None,
                 iam_role_id: Optional[pulumi.Input[str]] = None,
                 prefix_path: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 timeouts: Optional[pulumi.Input[pulumi.InputType['PushBasedLogExportTimeoutsArgs']]] = None,
                 __props__=None):
        """
        `PushBasedLogExport` provides a resource for push-based log export feature. The resource lets you configure, enable & disable the project level settings for the push-based log export feature. Using this resource you
        can continually push logs from mongod, mongos, and audit logs to an Amazon S3 bucket. Atlas exports logs every 5 minutes.

        ## Example Usage

        ### S

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        project_tf = mongodbatlas.Project("project-tf",
            name=atlas_project_name,
            org_id=atlas_org_id)
        # Set up cloud provider access in Atlas using the created IAM role
        setup_only = mongodbatlas.CloudProviderAccessSetup("setup_only",
            project_id=project_tf.id,
            provider_name="AWS")
        auth_role = mongodbatlas.CloudProviderAccessAuthorization("auth_role",
            project_id=project_tf.id,
            role_id=setup_only.role_id,
            aws=mongodbatlas.CloudProviderAccessAuthorizationAwsArgs(
                iam_assumed_role_arn=test_role["arn"],
            ))
        # Set up push-based log export with authorized IAM role
        test = mongodbatlas.PushBasedLogExport("test",
            project_id=project_tf.id,
            bucket_name=log_bucket["bucket"],
            iam_role_id=auth_role.role_id,
            prefix_path="push-based-log-test")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bucket_name: The name of the bucket to which the agent sends the logs to.
        :param pulumi.Input[str] iam_role_id: ID of the AWS IAM role that is used to write to the S3 bucket.
        :param pulumi.Input[str] prefix_path: S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
        :param pulumi.Input[str] project_id: Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PushBasedLogExportArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        `PushBasedLogExport` provides a resource for push-based log export feature. The resource lets you configure, enable & disable the project level settings for the push-based log export feature. Using this resource you
        can continually push logs from mongod, mongos, and audit logs to an Amazon S3 bucket. Atlas exports logs every 5 minutes.

        ## Example Usage

        ### S

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        project_tf = mongodbatlas.Project("project-tf",
            name=atlas_project_name,
            org_id=atlas_org_id)
        # Set up cloud provider access in Atlas using the created IAM role
        setup_only = mongodbatlas.CloudProviderAccessSetup("setup_only",
            project_id=project_tf.id,
            provider_name="AWS")
        auth_role = mongodbatlas.CloudProviderAccessAuthorization("auth_role",
            project_id=project_tf.id,
            role_id=setup_only.role_id,
            aws=mongodbatlas.CloudProviderAccessAuthorizationAwsArgs(
                iam_assumed_role_arn=test_role["arn"],
            ))
        # Set up push-based log export with authorized IAM role
        test = mongodbatlas.PushBasedLogExport("test",
            project_id=project_tf.id,
            bucket_name=log_bucket["bucket"],
            iam_role_id=auth_role.role_id,
            prefix_path="push-based-log-test")
        ```

        :param str resource_name: The name of the resource.
        :param PushBasedLogExportArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PushBasedLogExportArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket_name: Optional[pulumi.Input[str]] = None,
                 iam_role_id: Optional[pulumi.Input[str]] = None,
                 prefix_path: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 timeouts: Optional[pulumi.Input[pulumi.InputType['PushBasedLogExportTimeoutsArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PushBasedLogExportArgs.__new__(PushBasedLogExportArgs)

            if bucket_name is None and not opts.urn:
                raise TypeError("Missing required property 'bucket_name'")
            __props__.__dict__["bucket_name"] = bucket_name
            if iam_role_id is None and not opts.urn:
                raise TypeError("Missing required property 'iam_role_id'")
            __props__.__dict__["iam_role_id"] = iam_role_id
            __props__.__dict__["prefix_path"] = prefix_path
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["timeouts"] = timeouts
            __props__.__dict__["create_date"] = None
            __props__.__dict__["state"] = None
        super(PushBasedLogExport, __self__).__init__(
            'mongodbatlas:index/pushBasedLogExport:PushBasedLogExport',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bucket_name: Optional[pulumi.Input[str]] = None,
            create_date: Optional[pulumi.Input[str]] = None,
            iam_role_id: Optional[pulumi.Input[str]] = None,
            prefix_path: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            timeouts: Optional[pulumi.Input[pulumi.InputType['PushBasedLogExportTimeoutsArgs']]] = None) -> 'PushBasedLogExport':
        """
        Get an existing PushBasedLogExport resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bucket_name: The name of the bucket to which the agent sends the logs to.
        :param pulumi.Input[str] create_date: Date and time that this feature was enabled on.
        :param pulumi.Input[str] iam_role_id: ID of the AWS IAM role that is used to write to the S3 bucket.
        :param pulumi.Input[str] prefix_path: S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
        :param pulumi.Input[str] project_id: Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        :param pulumi.Input[str] state: Describes whether or not the feature is enabled and what status it is in.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PushBasedLogExportState.__new__(_PushBasedLogExportState)

        __props__.__dict__["bucket_name"] = bucket_name
        __props__.__dict__["create_date"] = create_date
        __props__.__dict__["iam_role_id"] = iam_role_id
        __props__.__dict__["prefix_path"] = prefix_path
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["state"] = state
        __props__.__dict__["timeouts"] = timeouts
        return PushBasedLogExport(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> pulumi.Output[str]:
        """
        The name of the bucket to which the agent sends the logs to.
        """
        return pulumi.get(self, "bucket_name")

    @property
    @pulumi.getter(name="createDate")
    def create_date(self) -> pulumi.Output[str]:
        """
        Date and time that this feature was enabled on.
        """
        return pulumi.get(self, "create_date")

    @property
    @pulumi.getter(name="iamRoleId")
    def iam_role_id(self) -> pulumi.Output[str]:
        """
        ID of the AWS IAM role that is used to write to the S3 bucket.
        """
        return pulumi.get(self, "iam_role_id")

    @property
    @pulumi.getter(name="prefixPath")
    def prefix_path(self) -> pulumi.Output[str]:
        """
        S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
        """
        return pulumi.get(self, "prefix_path")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        Describes whether or not the feature is enabled and what status it is in.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def timeouts(self) -> pulumi.Output[Optional['outputs.PushBasedLogExportTimeouts']]:
        return pulumi.get(self, "timeouts")

