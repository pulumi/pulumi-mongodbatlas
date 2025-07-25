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

__all__ = [
    'GetPushBasedLogExportResult',
    'AwaitableGetPushBasedLogExportResult',
    'get_push_based_log_export',
    'get_push_based_log_export_output',
]

@pulumi.output_type
class GetPushBasedLogExportResult:
    """
    A collection of values returned by getPushBasedLogExport.
    """
    def __init__(__self__, bucket_name=None, create_date=None, iam_role_id=None, id=None, prefix_path=None, project_id=None, state=None):
        if bucket_name and not isinstance(bucket_name, str):
            raise TypeError("Expected argument 'bucket_name' to be a str")
        pulumi.set(__self__, "bucket_name", bucket_name)
        if create_date and not isinstance(create_date, str):
            raise TypeError("Expected argument 'create_date' to be a str")
        pulumi.set(__self__, "create_date", create_date)
        if iam_role_id and not isinstance(iam_role_id, str):
            raise TypeError("Expected argument 'iam_role_id' to be a str")
        pulumi.set(__self__, "iam_role_id", iam_role_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if prefix_path and not isinstance(prefix_path, str):
            raise TypeError("Expected argument 'prefix_path' to be a str")
        pulumi.set(__self__, "prefix_path", prefix_path)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)

    @_builtins.property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> _builtins.str:
        return pulumi.get(self, "bucket_name")

    @_builtins.property
    @pulumi.getter(name="createDate")
    def create_date(self) -> _builtins.str:
        return pulumi.get(self, "create_date")

    @_builtins.property
    @pulumi.getter(name="iamRoleId")
    def iam_role_id(self) -> _builtins.str:
        return pulumi.get(self, "iam_role_id")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="prefixPath")
    def prefix_path(self) -> _builtins.str:
        return pulumi.get(self, "prefix_path")

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> _builtins.str:
        """
        Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        """
        return pulumi.get(self, "project_id")

    @_builtins.property
    @pulumi.getter
    def state(self) -> _builtins.str:
        return pulumi.get(self, "state")


class AwaitableGetPushBasedLogExportResult(GetPushBasedLogExportResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPushBasedLogExportResult(
            bucket_name=self.bucket_name,
            create_date=self.create_date,
            iam_role_id=self.iam_role_id,
            id=self.id,
            prefix_path=self.prefix_path,
            project_id=self.project_id,
            state=self.state)


def get_push_based_log_export(project_id: Optional[_builtins.str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPushBasedLogExportResult:
    """
    ## # Data Source: PushBasedLogExport

    `PushBasedLogExport` describes the configured project level settings for the push-based log export feature.

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
        aws={
            "iam_assumed_role_arn": test_role["arn"],
        })
    # Set up push-based log export with authorized IAM role
    test_push_based_log_export = mongodbatlas.PushBasedLogExport("test",
        project_id=project_tf.id,
        bucket_name=log_bucket["bucket"],
        iam_role_id=auth_role.role_id,
        prefix_path="push-based-log-test")
    test = mongodbatlas.get_push_based_log_export_output(project_id=test_push_based_log_export.project_id)
    pulumi.export("test", test.prefix_path)
    ```


    :param _builtins.str project_id: Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getPushBasedLogExport:getPushBasedLogExport', __args__, opts=opts, typ=GetPushBasedLogExportResult).value

    return AwaitableGetPushBasedLogExportResult(
        bucket_name=pulumi.get(__ret__, 'bucket_name'),
        create_date=pulumi.get(__ret__, 'create_date'),
        iam_role_id=pulumi.get(__ret__, 'iam_role_id'),
        id=pulumi.get(__ret__, 'id'),
        prefix_path=pulumi.get(__ret__, 'prefix_path'),
        project_id=pulumi.get(__ret__, 'project_id'),
        state=pulumi.get(__ret__, 'state'))
def get_push_based_log_export_output(project_id: Optional[pulumi.Input[_builtins.str]] = None,
                                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetPushBasedLogExportResult]:
    """
    ## # Data Source: PushBasedLogExport

    `PushBasedLogExport` describes the configured project level settings for the push-based log export feature.

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
        aws={
            "iam_assumed_role_arn": test_role["arn"],
        })
    # Set up push-based log export with authorized IAM role
    test_push_based_log_export = mongodbatlas.PushBasedLogExport("test",
        project_id=project_tf.id,
        bucket_name=log_bucket["bucket"],
        iam_role_id=auth_role.role_id,
        prefix_path="push-based-log-test")
    test = mongodbatlas.get_push_based_log_export_output(project_id=test_push_based_log_export.project_id)
    pulumi.export("test", test.prefix_path)
    ```


    :param _builtins.str project_id: Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getPushBasedLogExport:getPushBasedLogExport', __args__, opts=opts, typ=GetPushBasedLogExportResult)
    return __ret__.apply(lambda __response__: GetPushBasedLogExportResult(
        bucket_name=pulumi.get(__response__, 'bucket_name'),
        create_date=pulumi.get(__response__, 'create_date'),
        iam_role_id=pulumi.get(__response__, 'iam_role_id'),
        id=pulumi.get(__response__, 'id'),
        prefix_path=pulumi.get(__response__, 'prefix_path'),
        project_id=pulumi.get(__response__, 'project_id'),
        state=pulumi.get(__response__, 'state')))
