// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Outputs
{

    [OutputType]
    public sealed class GetAccessListApiKeysResultResult
    {
        public readonly int AccessCount;
        /// <summary>
        /// Range of IP addresses in CIDR notation to be added to the access list.
        /// </summary>
        public readonly string CidrBlock;
        public readonly string Created;
        /// <summary>
        /// Single IP address to be added to the access list.
        /// </summary>
        public readonly string IpAddress;
        public readonly string LastUsed;
        public readonly string LastUsedAddress;

        [OutputConstructor]
        private GetAccessListApiKeysResultResult(
            int accessCount,

            string cidrBlock,

            string created,

            string ipAddress,

            string lastUsed,

            string lastUsedAddress)
        {
            AccessCount = accessCount;
            CidrBlock = cidrBlock;
            Created = created;
            IpAddress = ipAddress;
            LastUsed = lastUsed;
            LastUsedAddress = lastUsedAddress;
        }
    }
}