# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetAuditingResult',
    'AwaitableGetAuditingResult',
    'get_auditing',
    'get_auditing_output',
]

@pulumi.output_type
class GetAuditingResult:
    """
    A collection of values returned by getAuditing.
    """
    def __init__(__self__, audit_authorization_success=None, audit_filter=None, configuration_type=None, enabled=None, id=None, project_id=None):
        if audit_authorization_success and not isinstance(audit_authorization_success, bool):
            raise TypeError("Expected argument 'audit_authorization_success' to be a bool")
        pulumi.set(__self__, "audit_authorization_success", audit_authorization_success)
        if audit_filter and not isinstance(audit_filter, str):
            raise TypeError("Expected argument 'audit_filter' to be a str")
        pulumi.set(__self__, "audit_filter", audit_filter)
        if configuration_type and not isinstance(configuration_type, str):
            raise TypeError("Expected argument 'configuration_type' to be a str")
        pulumi.set(__self__, "configuration_type", configuration_type)
        if enabled and not isinstance(enabled, bool):
            raise TypeError("Expected argument 'enabled' to be a bool")
        pulumi.set(__self__, "enabled", enabled)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter(name="auditAuthorizationSuccess")
    def audit_authorization_success(self) -> bool:
        """
        JSON-formatted audit filter used by the project
        """
        return pulumi.get(self, "audit_authorization_success")

    @property
    @pulumi.getter(name="auditFilter")
    def audit_filter(self) -> str:
        """
        Indicates whether the auditing system captures successful authentication attempts for audit filters using the "atype" : "authCheck" auditing event. For more information, see auditAuthorizationSuccess
        """
        return pulumi.get(self, "audit_filter")

    @property
    @pulumi.getter(name="configurationType")
    def configuration_type(self) -> str:
        """
        Denotes the configuration method for the audit filter. Possible values are: NONE - auditing not configured for the project.m FILTER_BUILDER - auditing configured via Atlas UI filter builderm FILTER_JSON - auditing configured via Atlas custom filter or API.
        """
        return pulumi.get(self, "configuration_type")

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        """
        Denotes whether or not the project associated with the {GROUP-ID} has database auditing enabled.
        """
        return pulumi.get(self, "enabled")

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


class AwaitableGetAuditingResult(GetAuditingResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAuditingResult(
            audit_authorization_success=self.audit_authorization_success,
            audit_filter=self.audit_filter,
            configuration_type=self.configuration_type,
            enabled=self.enabled,
            id=self.id,
            project_id=self.project_id)


def get_auditing(project_id: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAuditingResult:
    """
    `Auditing` describes a Auditing.

    > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.


    :param str project_id: The unique ID for the project to create the database user.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getAuditing:getAuditing', __args__, opts=opts, typ=GetAuditingResult).value

    return AwaitableGetAuditingResult(
        audit_authorization_success=pulumi.get(__ret__, 'audit_authorization_success'),
        audit_filter=pulumi.get(__ret__, 'audit_filter'),
        configuration_type=pulumi.get(__ret__, 'configuration_type'),
        enabled=pulumi.get(__ret__, 'enabled'),
        id=pulumi.get(__ret__, 'id'),
        project_id=pulumi.get(__ret__, 'project_id'))


@_utilities.lift_output_func(get_auditing)
def get_auditing_output(project_id: Optional[pulumi.Input[str]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAuditingResult]:
    """
    `Auditing` describes a Auditing.

    > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.


    :param str project_id: The unique ID for the project to create the database user.
    """
    ...
