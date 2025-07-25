// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class StreamConnectionAuthenticationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Style of authentication. Can be one of `PLAIN`, `SCRAM-256`, or `SCRAM-512`.
        /// </summary>
        [Input("mechanism")]
        public Input<string>? Mechanism { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Password of the account to connect to the Kafka cluster.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Username of the account to connect to the Kafka cluster.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public StreamConnectionAuthenticationGetArgs()
        {
        }
        public static new StreamConnectionAuthenticationGetArgs Empty => new StreamConnectionAuthenticationGetArgs();
    }
}
