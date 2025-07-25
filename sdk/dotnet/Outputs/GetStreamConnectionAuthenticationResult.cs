// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Outputs
{

    [OutputType]
    public sealed class GetStreamConnectionAuthenticationResult
    {
        /// <summary>
        /// Style of authentication. Can be one of `PLAIN`, `SCRAM-256`, or `SCRAM-512`.
        /// </summary>
        public readonly string Mechanism;
        /// <summary>
        /// Password of the account to connect to the Kafka cluster.
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// Username of the account to connect to the Kafka cluster.
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private GetStreamConnectionAuthenticationResult(
            string mechanism,

            string password,

            string username)
        {
            Mechanism = mechanism;
            Password = password;
            Username = username;
        }
    }
}
