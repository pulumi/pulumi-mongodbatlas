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
from ._inputs import *

__all__ = ['ResourcePolicyArgs', 'ResourcePolicy']

@pulumi.input_type
class ResourcePolicyArgs:
    def __init__(__self__, *,
                 org_id: pulumi.Input[str],
                 policies: pulumi.Input[Sequence[pulumi.Input['ResourcePolicyPolicyArgs']]],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ResourcePolicy resource.
        :param pulumi.Input[str] org_id: Unique 24-hexadecimal digit string that identifies the organization that contains your projects. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
        :param pulumi.Input[Sequence[pulumi.Input['ResourcePolicyPolicyArgs']]] policies: List of policies that make up the Atlas resource policy.
        :param pulumi.Input[str] name: Human-readable label that describes the Atlas resource policy.
        """
        pulumi.set(__self__, "org_id", org_id)
        pulumi.set(__self__, "policies", policies)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[str]:
        """
        Unique 24-hexadecimal digit string that identifies the organization that contains your projects. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter
    def policies(self) -> pulumi.Input[Sequence[pulumi.Input['ResourcePolicyPolicyArgs']]]:
        """
        List of policies that make up the Atlas resource policy.
        """
        return pulumi.get(self, "policies")

    @policies.setter
    def policies(self, value: pulumi.Input[Sequence[pulumi.Input['ResourcePolicyPolicyArgs']]]):
        pulumi.set(self, "policies", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Human-readable label that describes the Atlas resource policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ResourcePolicyState:
    def __init__(__self__, *,
                 created_by_user: Optional[pulumi.Input['ResourcePolicyCreatedByUserArgs']] = None,
                 created_date: Optional[pulumi.Input[str]] = None,
                 last_updated_by_user: Optional[pulumi.Input['ResourcePolicyLastUpdatedByUserArgs']] = None,
                 last_updated_date: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input['ResourcePolicyPolicyArgs']]]] = None,
                 version: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ResourcePolicy resources.
        :param pulumi.Input['ResourcePolicyCreatedByUserArgs'] created_by_user: The user that last updated the Atlas resource policy.
        :param pulumi.Input[str] created_date: Date and time in UTC when the Atlas resource policy was created.
        :param pulumi.Input['ResourcePolicyLastUpdatedByUserArgs'] last_updated_by_user: The user that last updated the Atlas resource policy.
        :param pulumi.Input[str] last_updated_date: Date and time in UTC when the Atlas resource policy was last updated.
        :param pulumi.Input[str] name: Human-readable label that describes the Atlas resource policy.
        :param pulumi.Input[str] org_id: Unique 24-hexadecimal digit string that identifies the organization that contains your projects. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
        :param pulumi.Input[Sequence[pulumi.Input['ResourcePolicyPolicyArgs']]] policies: List of policies that make up the Atlas resource policy.
        :param pulumi.Input[str] version: A string that identifies the version of the Atlas resource policy.
        """
        if created_by_user is not None:
            pulumi.set(__self__, "created_by_user", created_by_user)
        if created_date is not None:
            pulumi.set(__self__, "created_date", created_date)
        if last_updated_by_user is not None:
            pulumi.set(__self__, "last_updated_by_user", last_updated_by_user)
        if last_updated_date is not None:
            pulumi.set(__self__, "last_updated_date", last_updated_date)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if policies is not None:
            pulumi.set(__self__, "policies", policies)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="createdByUser")
    def created_by_user(self) -> Optional[pulumi.Input['ResourcePolicyCreatedByUserArgs']]:
        """
        The user that last updated the Atlas resource policy.
        """
        return pulumi.get(self, "created_by_user")

    @created_by_user.setter
    def created_by_user(self, value: Optional[pulumi.Input['ResourcePolicyCreatedByUserArgs']]):
        pulumi.set(self, "created_by_user", value)

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> Optional[pulumi.Input[str]]:
        """
        Date and time in UTC when the Atlas resource policy was created.
        """
        return pulumi.get(self, "created_date")

    @created_date.setter
    def created_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_date", value)

    @property
    @pulumi.getter(name="lastUpdatedByUser")
    def last_updated_by_user(self) -> Optional[pulumi.Input['ResourcePolicyLastUpdatedByUserArgs']]:
        """
        The user that last updated the Atlas resource policy.
        """
        return pulumi.get(self, "last_updated_by_user")

    @last_updated_by_user.setter
    def last_updated_by_user(self, value: Optional[pulumi.Input['ResourcePolicyLastUpdatedByUserArgs']]):
        pulumi.set(self, "last_updated_by_user", value)

    @property
    @pulumi.getter(name="lastUpdatedDate")
    def last_updated_date(self) -> Optional[pulumi.Input[str]]:
        """
        Date and time in UTC when the Atlas resource policy was last updated.
        """
        return pulumi.get(self, "last_updated_date")

    @last_updated_date.setter
    def last_updated_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_updated_date", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Human-readable label that describes the Atlas resource policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique 24-hexadecimal digit string that identifies the organization that contains your projects. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter
    def policies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ResourcePolicyPolicyArgs']]]]:
        """
        List of policies that make up the Atlas resource policy.
        """
        return pulumi.get(self, "policies")

    @policies.setter
    def policies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ResourcePolicyPolicyArgs']]]]):
        pulumi.set(self, "policies", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[str]]:
        """
        A string that identifies the version of the Atlas resource policy.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version", value)


class ResourcePolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ResourcePolicyPolicyArgs', 'ResourcePolicyPolicyArgsDict']]]]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        Resource Policy resource can be imported using the org ID and policy ID, in the format `{ORG_ID}-{POLICY_ID}`, e.g.

        For more information see: [MongoDB Atlas API - Resource Policies](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Resource-Policies) Documentation.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: Human-readable label that describes the Atlas resource policy.
        :param pulumi.Input[str] org_id: Unique 24-hexadecimal digit string that identifies the organization that contains your projects. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ResourcePolicyPolicyArgs', 'ResourcePolicyPolicyArgsDict']]]] policies: List of policies that make up the Atlas resource policy.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ResourcePolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        Resource Policy resource can be imported using the org ID and policy ID, in the format `{ORG_ID}-{POLICY_ID}`, e.g.

        For more information see: [MongoDB Atlas API - Resource Policies](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Resource-Policies) Documentation.

        :param str resource_name: The name of the resource.
        :param ResourcePolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ResourcePolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ResourcePolicyPolicyArgs', 'ResourcePolicyPolicyArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ResourcePolicyArgs.__new__(ResourcePolicyArgs)

            __props__.__dict__["name"] = name
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
            if policies is None and not opts.urn:
                raise TypeError("Missing required property 'policies'")
            __props__.__dict__["policies"] = policies
            __props__.__dict__["created_by_user"] = None
            __props__.__dict__["created_date"] = None
            __props__.__dict__["last_updated_by_user"] = None
            __props__.__dict__["last_updated_date"] = None
            __props__.__dict__["version"] = None
        super(ResourcePolicy, __self__).__init__(
            'mongodbatlas:index/resourcePolicy:ResourcePolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_by_user: Optional[pulumi.Input[Union['ResourcePolicyCreatedByUserArgs', 'ResourcePolicyCreatedByUserArgsDict']]] = None,
            created_date: Optional[pulumi.Input[str]] = None,
            last_updated_by_user: Optional[pulumi.Input[Union['ResourcePolicyLastUpdatedByUserArgs', 'ResourcePolicyLastUpdatedByUserArgsDict']]] = None,
            last_updated_date: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            policies: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ResourcePolicyPolicyArgs', 'ResourcePolicyPolicyArgsDict']]]]] = None,
            version: Optional[pulumi.Input[str]] = None) -> 'ResourcePolicy':
        """
        Get an existing ResourcePolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['ResourcePolicyCreatedByUserArgs', 'ResourcePolicyCreatedByUserArgsDict']] created_by_user: The user that last updated the Atlas resource policy.
        :param pulumi.Input[str] created_date: Date and time in UTC when the Atlas resource policy was created.
        :param pulumi.Input[Union['ResourcePolicyLastUpdatedByUserArgs', 'ResourcePolicyLastUpdatedByUserArgsDict']] last_updated_by_user: The user that last updated the Atlas resource policy.
        :param pulumi.Input[str] last_updated_date: Date and time in UTC when the Atlas resource policy was last updated.
        :param pulumi.Input[str] name: Human-readable label that describes the Atlas resource policy.
        :param pulumi.Input[str] org_id: Unique 24-hexadecimal digit string that identifies the organization that contains your projects. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ResourcePolicyPolicyArgs', 'ResourcePolicyPolicyArgsDict']]]] policies: List of policies that make up the Atlas resource policy.
        :param pulumi.Input[str] version: A string that identifies the version of the Atlas resource policy.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ResourcePolicyState.__new__(_ResourcePolicyState)

        __props__.__dict__["created_by_user"] = created_by_user
        __props__.__dict__["created_date"] = created_date
        __props__.__dict__["last_updated_by_user"] = last_updated_by_user
        __props__.__dict__["last_updated_date"] = last_updated_date
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["policies"] = policies
        __props__.__dict__["version"] = version
        return ResourcePolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdByUser")
    def created_by_user(self) -> pulumi.Output['outputs.ResourcePolicyCreatedByUser']:
        """
        The user that last updated the Atlas resource policy.
        """
        return pulumi.get(self, "created_by_user")

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> pulumi.Output[str]:
        """
        Date and time in UTC when the Atlas resource policy was created.
        """
        return pulumi.get(self, "created_date")

    @property
    @pulumi.getter(name="lastUpdatedByUser")
    def last_updated_by_user(self) -> pulumi.Output['outputs.ResourcePolicyLastUpdatedByUser']:
        """
        The user that last updated the Atlas resource policy.
        """
        return pulumi.get(self, "last_updated_by_user")

    @property
    @pulumi.getter(name="lastUpdatedDate")
    def last_updated_date(self) -> pulumi.Output[str]:
        """
        Date and time in UTC when the Atlas resource policy was last updated.
        """
        return pulumi.get(self, "last_updated_date")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Human-readable label that describes the Atlas resource policy.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[str]:
        """
        Unique 24-hexadecimal digit string that identifies the organization that contains your projects. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter
    def policies(self) -> pulumi.Output[Sequence['outputs.ResourcePolicyPolicy']]:
        """
        List of policies that make up the Atlas resource policy.
        """
        return pulumi.get(self, "policies")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[str]:
        """
        A string that identifies the version of the Atlas resource policy.
        """
        return pulumi.get(self, "version")

