// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.AdvancedClusterConnectionStringPrivateEndpointArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AdvancedClusterConnectionStringArgs extends com.pulumi.resources.ResourceArgs {

    public static final AdvancedClusterConnectionStringArgs Empty = new AdvancedClusterConnectionStringArgs();

    /**
     * [Network-peering-endpoint-aware](https://docs.atlas.mongodb.com/security-vpc-peering/#vpc-peering) mongodb://connection strings for each interface VPC endpoint you configured to connect to this cluster. Returned only if you created a network peering connection to this cluster.
     * 
     */
    @Import(name="private")
    private @Nullable Output<String> private_;

    /**
     * @return [Network-peering-endpoint-aware](https://docs.atlas.mongodb.com/security-vpc-peering/#vpc-peering) mongodb://connection strings for each interface VPC endpoint you configured to connect to this cluster. Returned only if you created a network peering connection to this cluster.
     * 
     */
    public Optional<Output<String>> private_() {
        return Optional.ofNullable(this.private_);
    }

    /**
     * Private endpoint connection strings. Each object describes the connection strings you can use to connect to this cluster through a private endpoint. Atlas returns this parameter only if you deployed a private endpoint to all regions to which you deployed this cluster&#39;s nodes.
     * - `connection_strings.private_endpoint.#.connection_string` - Private-endpoint-aware `mongodb://`connection string for this private endpoint.
     * - `connection_strings.private_endpoint.#.srv_connection_string` - Private-endpoint-aware `mongodb+srv://` connection string for this private endpoint. The `mongodb+srv` protocol tells the driver to look up the seed list of hosts in DNS . Atlas synchronizes this list with the nodes in a cluster. If the connection string uses this URI format, you don&#39;t need to: Append the seed list or Change the URI if the nodes change. Use this URI format if your driver supports it. If it doesn&#39;t, use `connection_strings.private_endpoint[n].connection_string`
     * - `connection_strings.private_endpoint.#.srv_shard_optimized_connection_string` - Private endpoint-aware connection string optimized for sharded clusters that uses the `mongodb+srv://` protocol to connect to MongoDB Cloud through a private endpoint. If the connection string uses this Uniform Resource Identifier (URI) format, you don&#39;t need to change the Uniform Resource Identifier (URI) if the nodes change. Use this Uniform Resource Identifier (URI) format if your application and Atlas cluster supports it. If it doesn&#39;t, use and consult the documentation for connectionStrings.privateEndpoint[n].srvConnectionString.
     * - `connection_strings.private_endpoint.#.type` - Type of MongoDB process that you connect to with the connection strings. Atlas returns `MONGOD` for replica sets, or `MONGOS` for sharded clusters.
     * - `connection_strings.private_endpoint.#.endpoints` - Private endpoint through which you connect to Atlas when you use `connection_strings.private_endpoint[n].connection_string` or `connection_strings.private_endpoint[n].srv_connection_string`
     * - `connection_strings.private_endpoint.#.endpoints.#.endpoint_id` - Unique identifier of the private endpoint.
     * - `connection_strings.private_endpoint.#.endpoints.#.provider_name` - Cloud provider to which you deployed the private endpoint. Atlas returns `AWS` or `AZURE`.
     * - `connection_strings.private_endpoint.#.endpoints.#.region` - Region to which you deployed the private endpoint.
     * 
     */
    @Import(name="privateEndpoints")
    private @Nullable Output<List<AdvancedClusterConnectionStringPrivateEndpointArgs>> privateEndpoints;

    /**
     * @return Private endpoint connection strings. Each object describes the connection strings you can use to connect to this cluster through a private endpoint. Atlas returns this parameter only if you deployed a private endpoint to all regions to which you deployed this cluster&#39;s nodes.
     * - `connection_strings.private_endpoint.#.connection_string` - Private-endpoint-aware `mongodb://`connection string for this private endpoint.
     * - `connection_strings.private_endpoint.#.srv_connection_string` - Private-endpoint-aware `mongodb+srv://` connection string for this private endpoint. The `mongodb+srv` protocol tells the driver to look up the seed list of hosts in DNS . Atlas synchronizes this list with the nodes in a cluster. If the connection string uses this URI format, you don&#39;t need to: Append the seed list or Change the URI if the nodes change. Use this URI format if your driver supports it. If it doesn&#39;t, use `connection_strings.private_endpoint[n].connection_string`
     * - `connection_strings.private_endpoint.#.srv_shard_optimized_connection_string` - Private endpoint-aware connection string optimized for sharded clusters that uses the `mongodb+srv://` protocol to connect to MongoDB Cloud through a private endpoint. If the connection string uses this Uniform Resource Identifier (URI) format, you don&#39;t need to change the Uniform Resource Identifier (URI) if the nodes change. Use this Uniform Resource Identifier (URI) format if your application and Atlas cluster supports it. If it doesn&#39;t, use and consult the documentation for connectionStrings.privateEndpoint[n].srvConnectionString.
     * - `connection_strings.private_endpoint.#.type` - Type of MongoDB process that you connect to with the connection strings. Atlas returns `MONGOD` for replica sets, or `MONGOS` for sharded clusters.
     * - `connection_strings.private_endpoint.#.endpoints` - Private endpoint through which you connect to Atlas when you use `connection_strings.private_endpoint[n].connection_string` or `connection_strings.private_endpoint[n].srv_connection_string`
     * - `connection_strings.private_endpoint.#.endpoints.#.endpoint_id` - Unique identifier of the private endpoint.
     * - `connection_strings.private_endpoint.#.endpoints.#.provider_name` - Cloud provider to which you deployed the private endpoint. Atlas returns `AWS` or `AZURE`.
     * - `connection_strings.private_endpoint.#.endpoints.#.region` - Region to which you deployed the private endpoint.
     * 
     */
    public Optional<Output<List<AdvancedClusterConnectionStringPrivateEndpointArgs>>> privateEndpoints() {
        return Optional.ofNullable(this.privateEndpoints);
    }

    /**
     * [Network-peering-endpoint-aware](https://docs.atlas.mongodb.com/security-vpc-peering/#vpc-peering) mongodb+srv://connection strings for each interface VPC endpoint you configured to connect to this cluster. Returned only if you created a network peering connection to this cluster.
     * 
     */
    @Import(name="privateSrv")
    private @Nullable Output<String> privateSrv;

    /**
     * @return [Network-peering-endpoint-aware](https://docs.atlas.mongodb.com/security-vpc-peering/#vpc-peering) mongodb+srv://connection strings for each interface VPC endpoint you configured to connect to this cluster. Returned only if you created a network peering connection to this cluster.
     * 
     */
    public Optional<Output<String>> privateSrv() {
        return Optional.ofNullable(this.privateSrv);
    }

    /**
     * Public mongodb:// connection string for this cluster.
     * 
     */
    @Import(name="standard")
    private @Nullable Output<String> standard;

    /**
     * @return Public mongodb:// connection string for this cluster.
     * 
     */
    public Optional<Output<String>> standard() {
        return Optional.ofNullable(this.standard);
    }

    /**
     * Public mongodb+srv:// connection string for this cluster. The mongodb+srv protocol tells the driver to look up the seed list of hosts in DNS. Atlas synchronizes this list with the nodes in a cluster. If the connection string uses this URI format, you don’t need to append the seed list or change the URI if the nodes change. Use this URI format if your driver supports it. If it doesn’t  , use connectionStrings.standard.
     * 
     */
    @Import(name="standardSrv")
    private @Nullable Output<String> standardSrv;

    /**
     * @return Public mongodb+srv:// connection string for this cluster. The mongodb+srv protocol tells the driver to look up the seed list of hosts in DNS. Atlas synchronizes this list with the nodes in a cluster. If the connection string uses this URI format, you don’t need to append the seed list or change the URI if the nodes change. Use this URI format if your driver supports it. If it doesn’t  , use connectionStrings.standard.
     * 
     */
    public Optional<Output<String>> standardSrv() {
        return Optional.ofNullable(this.standardSrv);
    }

    private AdvancedClusterConnectionStringArgs() {}

    private AdvancedClusterConnectionStringArgs(AdvancedClusterConnectionStringArgs $) {
        this.private_ = $.private_;
        this.privateEndpoints = $.privateEndpoints;
        this.privateSrv = $.privateSrv;
        this.standard = $.standard;
        this.standardSrv = $.standardSrv;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdvancedClusterConnectionStringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdvancedClusterConnectionStringArgs $;

        public Builder() {
            $ = new AdvancedClusterConnectionStringArgs();
        }

        public Builder(AdvancedClusterConnectionStringArgs defaults) {
            $ = new AdvancedClusterConnectionStringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param private_ [Network-peering-endpoint-aware](https://docs.atlas.mongodb.com/security-vpc-peering/#vpc-peering) mongodb://connection strings for each interface VPC endpoint you configured to connect to this cluster. Returned only if you created a network peering connection to this cluster.
         * 
         * @return builder
         * 
         */
        public Builder private_(@Nullable Output<String> private_) {
            $.private_ = private_;
            return this;
        }

        /**
         * @param private_ [Network-peering-endpoint-aware](https://docs.atlas.mongodb.com/security-vpc-peering/#vpc-peering) mongodb://connection strings for each interface VPC endpoint you configured to connect to this cluster. Returned only if you created a network peering connection to this cluster.
         * 
         * @return builder
         * 
         */
        public Builder private_(String private_) {
            return private_(Output.of(private_));
        }

        /**
         * @param privateEndpoints Private endpoint connection strings. Each object describes the connection strings you can use to connect to this cluster through a private endpoint. Atlas returns this parameter only if you deployed a private endpoint to all regions to which you deployed this cluster&#39;s nodes.
         * - `connection_strings.private_endpoint.#.connection_string` - Private-endpoint-aware `mongodb://`connection string for this private endpoint.
         * - `connection_strings.private_endpoint.#.srv_connection_string` - Private-endpoint-aware `mongodb+srv://` connection string for this private endpoint. The `mongodb+srv` protocol tells the driver to look up the seed list of hosts in DNS . Atlas synchronizes this list with the nodes in a cluster. If the connection string uses this URI format, you don&#39;t need to: Append the seed list or Change the URI if the nodes change. Use this URI format if your driver supports it. If it doesn&#39;t, use `connection_strings.private_endpoint[n].connection_string`
         * - `connection_strings.private_endpoint.#.srv_shard_optimized_connection_string` - Private endpoint-aware connection string optimized for sharded clusters that uses the `mongodb+srv://` protocol to connect to MongoDB Cloud through a private endpoint. If the connection string uses this Uniform Resource Identifier (URI) format, you don&#39;t need to change the Uniform Resource Identifier (URI) if the nodes change. Use this Uniform Resource Identifier (URI) format if your application and Atlas cluster supports it. If it doesn&#39;t, use and consult the documentation for connectionStrings.privateEndpoint[n].srvConnectionString.
         * - `connection_strings.private_endpoint.#.type` - Type of MongoDB process that you connect to with the connection strings. Atlas returns `MONGOD` for replica sets, or `MONGOS` for sharded clusters.
         * - `connection_strings.private_endpoint.#.endpoints` - Private endpoint through which you connect to Atlas when you use `connection_strings.private_endpoint[n].connection_string` or `connection_strings.private_endpoint[n].srv_connection_string`
         * - `connection_strings.private_endpoint.#.endpoints.#.endpoint_id` - Unique identifier of the private endpoint.
         * - `connection_strings.private_endpoint.#.endpoints.#.provider_name` - Cloud provider to which you deployed the private endpoint. Atlas returns `AWS` or `AZURE`.
         * - `connection_strings.private_endpoint.#.endpoints.#.region` - Region to which you deployed the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoints(@Nullable Output<List<AdvancedClusterConnectionStringPrivateEndpointArgs>> privateEndpoints) {
            $.privateEndpoints = privateEndpoints;
            return this;
        }

        /**
         * @param privateEndpoints Private endpoint connection strings. Each object describes the connection strings you can use to connect to this cluster through a private endpoint. Atlas returns this parameter only if you deployed a private endpoint to all regions to which you deployed this cluster&#39;s nodes.
         * - `connection_strings.private_endpoint.#.connection_string` - Private-endpoint-aware `mongodb://`connection string for this private endpoint.
         * - `connection_strings.private_endpoint.#.srv_connection_string` - Private-endpoint-aware `mongodb+srv://` connection string for this private endpoint. The `mongodb+srv` protocol tells the driver to look up the seed list of hosts in DNS . Atlas synchronizes this list with the nodes in a cluster. If the connection string uses this URI format, you don&#39;t need to: Append the seed list or Change the URI if the nodes change. Use this URI format if your driver supports it. If it doesn&#39;t, use `connection_strings.private_endpoint[n].connection_string`
         * - `connection_strings.private_endpoint.#.srv_shard_optimized_connection_string` - Private endpoint-aware connection string optimized for sharded clusters that uses the `mongodb+srv://` protocol to connect to MongoDB Cloud through a private endpoint. If the connection string uses this Uniform Resource Identifier (URI) format, you don&#39;t need to change the Uniform Resource Identifier (URI) if the nodes change. Use this Uniform Resource Identifier (URI) format if your application and Atlas cluster supports it. If it doesn&#39;t, use and consult the documentation for connectionStrings.privateEndpoint[n].srvConnectionString.
         * - `connection_strings.private_endpoint.#.type` - Type of MongoDB process that you connect to with the connection strings. Atlas returns `MONGOD` for replica sets, or `MONGOS` for sharded clusters.
         * - `connection_strings.private_endpoint.#.endpoints` - Private endpoint through which you connect to Atlas when you use `connection_strings.private_endpoint[n].connection_string` or `connection_strings.private_endpoint[n].srv_connection_string`
         * - `connection_strings.private_endpoint.#.endpoints.#.endpoint_id` - Unique identifier of the private endpoint.
         * - `connection_strings.private_endpoint.#.endpoints.#.provider_name` - Cloud provider to which you deployed the private endpoint. Atlas returns `AWS` or `AZURE`.
         * - `connection_strings.private_endpoint.#.endpoints.#.region` - Region to which you deployed the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoints(List<AdvancedClusterConnectionStringPrivateEndpointArgs> privateEndpoints) {
            return privateEndpoints(Output.of(privateEndpoints));
        }

        /**
         * @param privateEndpoints Private endpoint connection strings. Each object describes the connection strings you can use to connect to this cluster through a private endpoint. Atlas returns this parameter only if you deployed a private endpoint to all regions to which you deployed this cluster&#39;s nodes.
         * - `connection_strings.private_endpoint.#.connection_string` - Private-endpoint-aware `mongodb://`connection string for this private endpoint.
         * - `connection_strings.private_endpoint.#.srv_connection_string` - Private-endpoint-aware `mongodb+srv://` connection string for this private endpoint. The `mongodb+srv` protocol tells the driver to look up the seed list of hosts in DNS . Atlas synchronizes this list with the nodes in a cluster. If the connection string uses this URI format, you don&#39;t need to: Append the seed list or Change the URI if the nodes change. Use this URI format if your driver supports it. If it doesn&#39;t, use `connection_strings.private_endpoint[n].connection_string`
         * - `connection_strings.private_endpoint.#.srv_shard_optimized_connection_string` - Private endpoint-aware connection string optimized for sharded clusters that uses the `mongodb+srv://` protocol to connect to MongoDB Cloud through a private endpoint. If the connection string uses this Uniform Resource Identifier (URI) format, you don&#39;t need to change the Uniform Resource Identifier (URI) if the nodes change. Use this Uniform Resource Identifier (URI) format if your application and Atlas cluster supports it. If it doesn&#39;t, use and consult the documentation for connectionStrings.privateEndpoint[n].srvConnectionString.
         * - `connection_strings.private_endpoint.#.type` - Type of MongoDB process that you connect to with the connection strings. Atlas returns `MONGOD` for replica sets, or `MONGOS` for sharded clusters.
         * - `connection_strings.private_endpoint.#.endpoints` - Private endpoint through which you connect to Atlas when you use `connection_strings.private_endpoint[n].connection_string` or `connection_strings.private_endpoint[n].srv_connection_string`
         * - `connection_strings.private_endpoint.#.endpoints.#.endpoint_id` - Unique identifier of the private endpoint.
         * - `connection_strings.private_endpoint.#.endpoints.#.provider_name` - Cloud provider to which you deployed the private endpoint. Atlas returns `AWS` or `AZURE`.
         * - `connection_strings.private_endpoint.#.endpoints.#.region` - Region to which you deployed the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoints(AdvancedClusterConnectionStringPrivateEndpointArgs... privateEndpoints) {
            return privateEndpoints(List.of(privateEndpoints));
        }

        /**
         * @param privateSrv [Network-peering-endpoint-aware](https://docs.atlas.mongodb.com/security-vpc-peering/#vpc-peering) mongodb+srv://connection strings for each interface VPC endpoint you configured to connect to this cluster. Returned only if you created a network peering connection to this cluster.
         * 
         * @return builder
         * 
         */
        public Builder privateSrv(@Nullable Output<String> privateSrv) {
            $.privateSrv = privateSrv;
            return this;
        }

        /**
         * @param privateSrv [Network-peering-endpoint-aware](https://docs.atlas.mongodb.com/security-vpc-peering/#vpc-peering) mongodb+srv://connection strings for each interface VPC endpoint you configured to connect to this cluster. Returned only if you created a network peering connection to this cluster.
         * 
         * @return builder
         * 
         */
        public Builder privateSrv(String privateSrv) {
            return privateSrv(Output.of(privateSrv));
        }

        /**
         * @param standard Public mongodb:// connection string for this cluster.
         * 
         * @return builder
         * 
         */
        public Builder standard(@Nullable Output<String> standard) {
            $.standard = standard;
            return this;
        }

        /**
         * @param standard Public mongodb:// connection string for this cluster.
         * 
         * @return builder
         * 
         */
        public Builder standard(String standard) {
            return standard(Output.of(standard));
        }

        /**
         * @param standardSrv Public mongodb+srv:// connection string for this cluster. The mongodb+srv protocol tells the driver to look up the seed list of hosts in DNS. Atlas synchronizes this list with the nodes in a cluster. If the connection string uses this URI format, you don’t need to append the seed list or change the URI if the nodes change. Use this URI format if your driver supports it. If it doesn’t  , use connectionStrings.standard.
         * 
         * @return builder
         * 
         */
        public Builder standardSrv(@Nullable Output<String> standardSrv) {
            $.standardSrv = standardSrv;
            return this;
        }

        /**
         * @param standardSrv Public mongodb+srv:// connection string for this cluster. The mongodb+srv protocol tells the driver to look up the seed list of hosts in DNS. Atlas synchronizes this list with the nodes in a cluster. If the connection string uses this URI format, you don’t need to append the seed list or change the URI if the nodes change. Use this URI format if your driver supports it. If it doesn’t  , use connectionStrings.standard.
         * 
         * @return builder
         * 
         */
        public Builder standardSrv(String standardSrv) {
            return standardSrv(Output.of(standardSrv));
        }

        public AdvancedClusterConnectionStringArgs build() {
            return $;
        }
    }

}
