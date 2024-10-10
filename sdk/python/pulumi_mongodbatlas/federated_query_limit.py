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

__all__ = ['FederatedQueryLimitArgs', 'FederatedQueryLimit']

@pulumi.input_type
class FederatedQueryLimitArgs:
    def __init__(__self__, *,
                 limit_name: pulumi.Input[str],
                 overrun_policy: pulumi.Input[str],
                 project_id: pulumi.Input[str],
                 tenant_name: pulumi.Input[str],
                 value: pulumi.Input[int],
                 default_limit: Optional[pulumi.Input[int]] = None,
                 maximum_limit: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a FederatedQueryLimit resource.
        :param pulumi.Input[str] limit_name: String enum that indicates whether the identity provider is active or not. Accepted values are:
               * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
               * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
               * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
               * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
        :param pulumi.Input[str] overrun_policy: String enum that identifies action to take when the usage limit is exceeded. If limit span is set to QUERY, this is ignored because MongoDB Cloud stops the query when it exceeds the usage limit. Accepted values are "BLOCK" OR "BLOCK_AND_KILL"
        :param pulumi.Input[str] project_id: The unique ID for the project to create a Federated Database Instance.
        :param pulumi.Input[str] tenant_name: Name of the Atlas Federated Database Instance.
        :param pulumi.Input[int] value: Amount to set the limit to.
        :param pulumi.Input[int] default_limit: Default value of the limit.
               * `lastModifiedDate` - Only used for Data Federation limits. Timestamp that indicates when this usage limit was last modified. This field uses the ISO 8601 timestamp format in UTC.
               * `maximumLimit` - Maximum value of the limit.
        """
        pulumi.set(__self__, "limit_name", limit_name)
        pulumi.set(__self__, "overrun_policy", overrun_policy)
        pulumi.set(__self__, "project_id", project_id)
        pulumi.set(__self__, "tenant_name", tenant_name)
        pulumi.set(__self__, "value", value)
        if default_limit is not None:
            pulumi.set(__self__, "default_limit", default_limit)
        if maximum_limit is not None:
            pulumi.set(__self__, "maximum_limit", maximum_limit)

    @property
    @pulumi.getter(name="limitName")
    def limit_name(self) -> pulumi.Input[str]:
        """
        String enum that indicates whether the identity provider is active or not. Accepted values are:
        * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
        * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
        * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
        * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
        """
        return pulumi.get(self, "limit_name")

    @limit_name.setter
    def limit_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "limit_name", value)

    @property
    @pulumi.getter(name="overrunPolicy")
    def overrun_policy(self) -> pulumi.Input[str]:
        """
        String enum that identifies action to take when the usage limit is exceeded. If limit span is set to QUERY, this is ignored because MongoDB Cloud stops the query when it exceeds the usage limit. Accepted values are "BLOCK" OR "BLOCK_AND_KILL"
        """
        return pulumi.get(self, "overrun_policy")

    @overrun_policy.setter
    def overrun_policy(self, value: pulumi.Input[str]):
        pulumi.set(self, "overrun_policy", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        The unique ID for the project to create a Federated Database Instance.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="tenantName")
    def tenant_name(self) -> pulumi.Input[str]:
        """
        Name of the Atlas Federated Database Instance.
        """
        return pulumi.get(self, "tenant_name")

    @tenant_name.setter
    def tenant_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "tenant_name", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[int]:
        """
        Amount to set the limit to.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[int]):
        pulumi.set(self, "value", value)

    @property
    @pulumi.getter(name="defaultLimit")
    def default_limit(self) -> Optional[pulumi.Input[int]]:
        """
        Default value of the limit.
        * `lastModifiedDate` - Only used for Data Federation limits. Timestamp that indicates when this usage limit was last modified. This field uses the ISO 8601 timestamp format in UTC.
        * `maximumLimit` - Maximum value of the limit.
        """
        return pulumi.get(self, "default_limit")

    @default_limit.setter
    def default_limit(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "default_limit", value)

    @property
    @pulumi.getter(name="maximumLimit")
    def maximum_limit(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "maximum_limit")

    @maximum_limit.setter
    def maximum_limit(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "maximum_limit", value)


@pulumi.input_type
class _FederatedQueryLimitState:
    def __init__(__self__, *,
                 current_usage: Optional[pulumi.Input[int]] = None,
                 default_limit: Optional[pulumi.Input[int]] = None,
                 last_modified_date: Optional[pulumi.Input[str]] = None,
                 limit_name: Optional[pulumi.Input[str]] = None,
                 maximum_limit: Optional[pulumi.Input[int]] = None,
                 overrun_policy: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tenant_name: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering FederatedQueryLimit resources.
        :param pulumi.Input[int] current_usage: Amount that indicates the current usage of the limit.
        :param pulumi.Input[int] default_limit: Default value of the limit.
               * `lastModifiedDate` - Only used for Data Federation limits. Timestamp that indicates when this usage limit was last modified. This field uses the ISO 8601 timestamp format in UTC.
               * `maximumLimit` - Maximum value of the limit.
        :param pulumi.Input[str] limit_name: String enum that indicates whether the identity provider is active or not. Accepted values are:
               * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
               * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
               * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
               * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
        :param pulumi.Input[str] overrun_policy: String enum that identifies action to take when the usage limit is exceeded. If limit span is set to QUERY, this is ignored because MongoDB Cloud stops the query when it exceeds the usage limit. Accepted values are "BLOCK" OR "BLOCK_AND_KILL"
        :param pulumi.Input[str] project_id: The unique ID for the project to create a Federated Database Instance.
        :param pulumi.Input[str] tenant_name: Name of the Atlas Federated Database Instance.
        :param pulumi.Input[int] value: Amount to set the limit to.
        """
        if current_usage is not None:
            pulumi.set(__self__, "current_usage", current_usage)
        if default_limit is not None:
            pulumi.set(__self__, "default_limit", default_limit)
        if last_modified_date is not None:
            pulumi.set(__self__, "last_modified_date", last_modified_date)
        if limit_name is not None:
            pulumi.set(__self__, "limit_name", limit_name)
        if maximum_limit is not None:
            pulumi.set(__self__, "maximum_limit", maximum_limit)
        if overrun_policy is not None:
            pulumi.set(__self__, "overrun_policy", overrun_policy)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if tenant_name is not None:
            pulumi.set(__self__, "tenant_name", tenant_name)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter(name="currentUsage")
    def current_usage(self) -> Optional[pulumi.Input[int]]:
        """
        Amount that indicates the current usage of the limit.
        """
        return pulumi.get(self, "current_usage")

    @current_usage.setter
    def current_usage(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "current_usage", value)

    @property
    @pulumi.getter(name="defaultLimit")
    def default_limit(self) -> Optional[pulumi.Input[int]]:
        """
        Default value of the limit.
        * `lastModifiedDate` - Only used for Data Federation limits. Timestamp that indicates when this usage limit was last modified. This field uses the ISO 8601 timestamp format in UTC.
        * `maximumLimit` - Maximum value of the limit.
        """
        return pulumi.get(self, "default_limit")

    @default_limit.setter
    def default_limit(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "default_limit", value)

    @property
    @pulumi.getter(name="lastModifiedDate")
    def last_modified_date(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "last_modified_date")

    @last_modified_date.setter
    def last_modified_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_modified_date", value)

    @property
    @pulumi.getter(name="limitName")
    def limit_name(self) -> Optional[pulumi.Input[str]]:
        """
        String enum that indicates whether the identity provider is active or not. Accepted values are:
        * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
        * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
        * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
        * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
        """
        return pulumi.get(self, "limit_name")

    @limit_name.setter
    def limit_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "limit_name", value)

    @property
    @pulumi.getter(name="maximumLimit")
    def maximum_limit(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "maximum_limit")

    @maximum_limit.setter
    def maximum_limit(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "maximum_limit", value)

    @property
    @pulumi.getter(name="overrunPolicy")
    def overrun_policy(self) -> Optional[pulumi.Input[str]]:
        """
        String enum that identifies action to take when the usage limit is exceeded. If limit span is set to QUERY, this is ignored because MongoDB Cloud stops the query when it exceeds the usage limit. Accepted values are "BLOCK" OR "BLOCK_AND_KILL"
        """
        return pulumi.get(self, "overrun_policy")

    @overrun_policy.setter
    def overrun_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "overrun_policy", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique ID for the project to create a Federated Database Instance.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="tenantName")
    def tenant_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Atlas Federated Database Instance.
        """
        return pulumi.get(self, "tenant_name")

    @tenant_name.setter
    def tenant_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tenant_name", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[int]]:
        """
        Amount to set the limit to.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "value", value)


class FederatedQueryLimit(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_limit: Optional[pulumi.Input[int]] = None,
                 limit_name: Optional[pulumi.Input[str]] = None,
                 maximum_limit: Optional[pulumi.Input[int]] = None,
                 overrun_policy: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tenant_name: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        ## # Resource: FederatedQueryLimit

        `FederatedQueryLimit` provides a Federated Database Instance Query Limits resource. To learn more about Atlas Data Federation see https://www.mongodb.com/docs/atlas/data-federation/overview/.

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

        ## Example Usage

        ### S

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.FederatedQueryLimit("test",
            project_id="64707f06c519c20c3a2b1b03",
            tenant_name="FederatedDatabseInstance0",
            limit_name="bytesProcessed.weekly",
            overrun_policy="BLOCK",
            value=5147483648)
        ```

        ## Import

        The Federated Database Instance Query Limit can be imported using project ID, name of the instance and limit name, in the format:
        `project_id`--`tenant_name`--`limit_name`, e.g.

        ```sh
        $ pulumi import mongodbatlas:index/federatedQueryLimit:FederatedQueryLimit example 1112222b3bf99403840e8934--FederatedDatabaseInstance0--bytesProcessed.daily
        ```
        See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createOneDataFederationQueryLimit) Documentation for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] default_limit: Default value of the limit.
               * `lastModifiedDate` - Only used for Data Federation limits. Timestamp that indicates when this usage limit was last modified. This field uses the ISO 8601 timestamp format in UTC.
               * `maximumLimit` - Maximum value of the limit.
        :param pulumi.Input[str] limit_name: String enum that indicates whether the identity provider is active or not. Accepted values are:
               * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
               * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
               * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
               * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
        :param pulumi.Input[str] overrun_policy: String enum that identifies action to take when the usage limit is exceeded. If limit span is set to QUERY, this is ignored because MongoDB Cloud stops the query when it exceeds the usage limit. Accepted values are "BLOCK" OR "BLOCK_AND_KILL"
        :param pulumi.Input[str] project_id: The unique ID for the project to create a Federated Database Instance.
        :param pulumi.Input[str] tenant_name: Name of the Atlas Federated Database Instance.
        :param pulumi.Input[int] value: Amount to set the limit to.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FederatedQueryLimitArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## # Resource: FederatedQueryLimit

        `FederatedQueryLimit` provides a Federated Database Instance Query Limits resource. To learn more about Atlas Data Federation see https://www.mongodb.com/docs/atlas/data-federation/overview/.

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

        ## Example Usage

        ### S

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.FederatedQueryLimit("test",
            project_id="64707f06c519c20c3a2b1b03",
            tenant_name="FederatedDatabseInstance0",
            limit_name="bytesProcessed.weekly",
            overrun_policy="BLOCK",
            value=5147483648)
        ```

        ## Import

        The Federated Database Instance Query Limit can be imported using project ID, name of the instance and limit name, in the format:
        `project_id`--`tenant_name`--`limit_name`, e.g.

        ```sh
        $ pulumi import mongodbatlas:index/federatedQueryLimit:FederatedQueryLimit example 1112222b3bf99403840e8934--FederatedDatabaseInstance0--bytesProcessed.daily
        ```
        See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createOneDataFederationQueryLimit) Documentation for more information.

        :param str resource_name: The name of the resource.
        :param FederatedQueryLimitArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FederatedQueryLimitArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_limit: Optional[pulumi.Input[int]] = None,
                 limit_name: Optional[pulumi.Input[str]] = None,
                 maximum_limit: Optional[pulumi.Input[int]] = None,
                 overrun_policy: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tenant_name: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FederatedQueryLimitArgs.__new__(FederatedQueryLimitArgs)

            __props__.__dict__["default_limit"] = default_limit
            if limit_name is None and not opts.urn:
                raise TypeError("Missing required property 'limit_name'")
            __props__.__dict__["limit_name"] = limit_name
            __props__.__dict__["maximum_limit"] = maximum_limit
            if overrun_policy is None and not opts.urn:
                raise TypeError("Missing required property 'overrun_policy'")
            __props__.__dict__["overrun_policy"] = overrun_policy
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            if tenant_name is None and not opts.urn:
                raise TypeError("Missing required property 'tenant_name'")
            __props__.__dict__["tenant_name"] = tenant_name
            if value is None and not opts.urn:
                raise TypeError("Missing required property 'value'")
            __props__.__dict__["value"] = value
            __props__.__dict__["current_usage"] = None
            __props__.__dict__["last_modified_date"] = None
        super(FederatedQueryLimit, __self__).__init__(
            'mongodbatlas:index/federatedQueryLimit:FederatedQueryLimit',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            current_usage: Optional[pulumi.Input[int]] = None,
            default_limit: Optional[pulumi.Input[int]] = None,
            last_modified_date: Optional[pulumi.Input[str]] = None,
            limit_name: Optional[pulumi.Input[str]] = None,
            maximum_limit: Optional[pulumi.Input[int]] = None,
            overrun_policy: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            tenant_name: Optional[pulumi.Input[str]] = None,
            value: Optional[pulumi.Input[int]] = None) -> 'FederatedQueryLimit':
        """
        Get an existing FederatedQueryLimit resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] current_usage: Amount that indicates the current usage of the limit.
        :param pulumi.Input[int] default_limit: Default value of the limit.
               * `lastModifiedDate` - Only used for Data Federation limits. Timestamp that indicates when this usage limit was last modified. This field uses the ISO 8601 timestamp format in UTC.
               * `maximumLimit` - Maximum value of the limit.
        :param pulumi.Input[str] limit_name: String enum that indicates whether the identity provider is active or not. Accepted values are:
               * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
               * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
               * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
               * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
        :param pulumi.Input[str] overrun_policy: String enum that identifies action to take when the usage limit is exceeded. If limit span is set to QUERY, this is ignored because MongoDB Cloud stops the query when it exceeds the usage limit. Accepted values are "BLOCK" OR "BLOCK_AND_KILL"
        :param pulumi.Input[str] project_id: The unique ID for the project to create a Federated Database Instance.
        :param pulumi.Input[str] tenant_name: Name of the Atlas Federated Database Instance.
        :param pulumi.Input[int] value: Amount to set the limit to.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FederatedQueryLimitState.__new__(_FederatedQueryLimitState)

        __props__.__dict__["current_usage"] = current_usage
        __props__.__dict__["default_limit"] = default_limit
        __props__.__dict__["last_modified_date"] = last_modified_date
        __props__.__dict__["limit_name"] = limit_name
        __props__.__dict__["maximum_limit"] = maximum_limit
        __props__.__dict__["overrun_policy"] = overrun_policy
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["tenant_name"] = tenant_name
        __props__.__dict__["value"] = value
        return FederatedQueryLimit(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="currentUsage")
    def current_usage(self) -> pulumi.Output[int]:
        """
        Amount that indicates the current usage of the limit.
        """
        return pulumi.get(self, "current_usage")

    @property
    @pulumi.getter(name="defaultLimit")
    def default_limit(self) -> pulumi.Output[Optional[int]]:
        """
        Default value of the limit.
        * `lastModifiedDate` - Only used for Data Federation limits. Timestamp that indicates when this usage limit was last modified. This field uses the ISO 8601 timestamp format in UTC.
        * `maximumLimit` - Maximum value of the limit.
        """
        return pulumi.get(self, "default_limit")

    @property
    @pulumi.getter(name="lastModifiedDate")
    def last_modified_date(self) -> pulumi.Output[str]:
        return pulumi.get(self, "last_modified_date")

    @property
    @pulumi.getter(name="limitName")
    def limit_name(self) -> pulumi.Output[str]:
        """
        String enum that indicates whether the identity provider is active or not. Accepted values are:
        * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
        * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
        * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
        * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
        """
        return pulumi.get(self, "limit_name")

    @property
    @pulumi.getter(name="maximumLimit")
    def maximum_limit(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "maximum_limit")

    @property
    @pulumi.getter(name="overrunPolicy")
    def overrun_policy(self) -> pulumi.Output[str]:
        """
        String enum that identifies action to take when the usage limit is exceeded. If limit span is set to QUERY, this is ignored because MongoDB Cloud stops the query when it exceeds the usage limit. Accepted values are "BLOCK" OR "BLOCK_AND_KILL"
        """
        return pulumi.get(self, "overrun_policy")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The unique ID for the project to create a Federated Database Instance.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="tenantName")
    def tenant_name(self) -> pulumi.Output[str]:
        """
        Name of the Atlas Federated Database Instance.
        """
        return pulumi.get(self, "tenant_name")

    @property
    @pulumi.getter
    def value(self) -> pulumi.Output[int]:
        """
        Amount to set the limit to.
        """
        return pulumi.get(self, "value")

