# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

import types

__config__ = pulumi.Config('mongodbatlas')


class _ExportableConfig(types.ModuleType):
    @property
    def base_url(self) -> Optional[str]:
        """
        MongoDB Atlas Base URL
        """
        return __config__.get('baseUrl')

    @property
    def private_key(self) -> Optional[str]:
        """
        MongoDB Atlas Programmatic Private Key
        """
        return __config__.get('privateKey')

    @property
    def public_key(self) -> Optional[str]:
        """
        MongoDB Atlas Programmatic Public Key
        """
        return __config__.get('publicKey')

    @property
    def realm_base_url(self) -> Optional[str]:
        """
        MongoDB Realm Base URL
        """
        return __config__.get('realmBaseUrl')

