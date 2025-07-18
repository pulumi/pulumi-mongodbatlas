// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class StreamConnectionSecurityGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A trusted, public x509 certificate for connecting to Kafka over SSL. String value of the certificate must be defined in the attribute.
        /// </summary>
        [Input("brokerPublicCertificate")]
        public Input<string>? BrokerPublicCertificate { get; set; }

        /// <summary>
        /// Describes the transport type. Can be either `SASL_PLAINTEXT` or `SASL_SSL`.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        public StreamConnectionSecurityGetArgs()
        {
        }
        public static new StreamConnectionSecurityGetArgs Empty => new StreamConnectionSecurityGetArgs();
    }
}
