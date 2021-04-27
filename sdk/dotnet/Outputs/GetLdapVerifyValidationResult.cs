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
    public sealed class GetLdapVerifyValidationResult
    {
        /// <summary>
        /// The current status of the LDAP over TLS/SSL configuration.
        /// </summary>
        public readonly string Status;
        public readonly string ValidationType;

        [OutputConstructor]
        private GetLdapVerifyValidationResult(
            string status,

            string validationType)
        {
            Status = status;
            ValidationType = validationType;
        }
    }
}
