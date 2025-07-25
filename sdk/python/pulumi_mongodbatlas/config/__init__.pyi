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
from .. import _utilities
from . import outputs

assumeRole: Optional[str]

awsAccessKeyId: Optional[str]
"""
AWS API Access Key.
"""

awsSecretAccessKey: Optional[str]
"""
AWS API Access Secret Key.
"""

awsSessionToken: Optional[str]
"""
AWS Security Token Service provided session token.
"""

baseUrl: Optional[str]
"""
MongoDB Atlas Base URL
"""

isMongodbgovCloud: Optional[bool]
"""
MongoDB Atlas Base URL default to gov
"""

privateKey: Optional[str]
"""
MongoDB Atlas Programmatic Private Key
"""

publicKey: Optional[str]
"""
MongoDB Atlas Programmatic Public Key
"""

realmBaseUrl: Optional[str]
"""
MongoDB Realm Base URL
"""

region: Optional[str]
"""
Region where secret is stored as part of AWS Secret Manager.
"""

secretName: Optional[str]
"""
Name of secret stored in AWS Secret Manager.
"""

stsEndpoint: Optional[str]
"""
AWS Security Token Service endpoint. Required for cross-AWS region or cross-AWS account secrets.
"""

