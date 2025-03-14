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
    public sealed class AdvancedClusterConnectionString
    {
        /// <summary>
        /// [Network-peering-endpoint-aware](https://docs.atlas.mongodb.com/security-vpc-peering/#vpc-peering) mongodb://connection strings for each interface VPC endpoint you configured to connect to this cluster. Returned only if you created a network peering connection to this cluster.
        /// </summary>
        public readonly string? Private;
        /// <summary>
        /// Private endpoint connection strings. Each object describes the connection strings you can use to connect to this cluster through a private endpoint. Atlas returns this parameter only if you deployed a private endpoint to all regions to which you deployed this cluster's nodes.
        /// - `connection_strings.private_endpoint.#.connection_string` - Private-endpoint-aware `mongodb://`connection string for this private endpoint.
        /// - `connection_strings.private_endpoint.#.srv_connection_string` - Private-endpoint-aware `mongodb+srv://` connection string for this private endpoint. The `mongodb+srv` protocol tells the driver to look up the seed list of hosts in DNS . Atlas synchronizes this list with the nodes in a cluster. If the connection string uses this URI format, you don't need to: Append the seed list or Change the URI if the nodes change. Use this URI format if your driver supports it. If it doesn't, use `connection_strings.private_endpoint[#].connection_string`
        /// - `connection_strings.private_endpoint.#.srv_shard_optimized_connection_string` - Private endpoint-aware connection string optimized for sharded clusters that uses the `mongodb+srv://` protocol to connect to MongoDB Cloud through a private endpoint. If the connection string uses this Uniform Resource Identifier (URI) format, you don't need to change the Uniform Resource Identifier (URI) if the nodes change. Use this Uniform Resource Identifier (URI) format if your application and Atlas cluster support it. If it doesn't, use and consult the documentation for connectionStrings.privateEndpoint[#].srvConnectionString.
        /// - `connection_strings.private_endpoint.#.type` - Type of MongoDB process that you connect to with the connection strings. Atlas returns `MONGOD` for replica sets, or `MONGOS` for sharded clusters.
        /// - `connection_strings.private_endpoint.#.endpoints` - Private endpoint through which you connect to Atlas when you use `connection_strings.private_endpoint[#].connection_string` or `connection_strings.private_endpoint[#].srv_connection_string`
        /// - `connection_strings.private_endpoint.#.endpoints.#.endpoint_id` - Unique identifier of the private endpoint.
        /// - `connection_strings.private_endpoint.#.endpoints.#.provider_name` - Cloud provider to which you deployed the private endpoint. Atlas returns `AWS` or `AZURE`.
        /// - `connection_strings.private_endpoint.#.endpoints.#.region` - Region to which you deployed the private endpoint.
        /// </summary>
        public readonly ImmutableArray<Outputs.AdvancedClusterConnectionStringPrivateEndpoint> PrivateEndpoints;
        /// <summary>
        /// [Network-peering-endpoint-aware](https://docs.atlas.mongodb.com/security-vpc-peering/#vpc-peering) mongodb+srv://connection strings for each interface VPC endpoint you configured to connect to this cluster. Returned only if you created a network peering connection to this cluster.
        /// </summary>
        public readonly string? PrivateSrv;
        /// <summary>
        /// Public mongodb:// connection string for this cluster.
        /// </summary>
        public readonly string? Standard;
        /// <summary>
        /// Public mongodb+srv:// connection string for this cluster. The mongodb+srv protocol tells the driver to look up the seed list of hosts in DNS. Atlas synchronizes this list with the nodes in a cluster. If the connection string uses this URI format, you don’t need to append the seed list or change the URI if the nodes change. Use this URI format if your driver supports it. If it doesn’t  , use connectionStrings.standard.
        /// </summary>
        public readonly string? StandardSrv;

        [OutputConstructor]
        private AdvancedClusterConnectionString(
            string? @private,

            ImmutableArray<Outputs.AdvancedClusterConnectionStringPrivateEndpoint> privateEndpoints,

            string? privateSrv,

            string? standard,

            string? standardSrv)
        {
            Private = @private;
            PrivateEndpoints = privateEndpoints;
            PrivateSrv = privateSrv;
            Standard = standard;
            StandardSrv = standardSrv;
        }
    }
}
