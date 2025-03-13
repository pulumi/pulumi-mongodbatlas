// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterBiConnectorConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterBiConnectorConfigArgs Empty = new ClusterBiConnectorConfigArgs();

    /**
     * Specifies whether or not BI Connector for Atlas is enabled on the cluster.
     * *
     * - Set to `true` to enable BI Connector for Atlas.
     * - Set to `false` to disable BI Connector for Atlas.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Specifies whether or not BI Connector for Atlas is enabled on the cluster.
     * *
     * - Set to `true` to enable BI Connector for Atlas.
     * - Set to `false` to disable BI Connector for Atlas.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Specifies the read preference to be used by BI Connector for Atlas on the cluster. Each BI Connector for Atlas read preference contains a distinct combination of [readPreference](https://docs.mongodb.com/manual/core/read-preference/) and [readPreferenceTags](https://docs.mongodb.com/manual/core/read-preference/#tag-sets) options. For details on BI Connector for Atlas read preferences, refer to the [BI Connector Read Preferences Table](https://docs.atlas.mongodb.com/tutorial/create-global-writes-cluster/#bic-read-preferences).
     * 
     * - Set to &#34;primary&#34; to have BI Connector for Atlas read from the primary.
     * 
     * - Set to &#34;secondary&#34; to have BI Connector for Atlas read from a secondary member. Default if there are no analytics nodes in the cluster.
     * 
     * - Set to &#34;analytics&#34; to have BI Connector for Atlas read from an analytics node. Default if the cluster contains analytics nodes.
     * 
     */
    @Import(name="readPreference")
    private @Nullable Output<String> readPreference;

    /**
     * @return Specifies the read preference to be used by BI Connector for Atlas on the cluster. Each BI Connector for Atlas read preference contains a distinct combination of [readPreference](https://docs.mongodb.com/manual/core/read-preference/) and [readPreferenceTags](https://docs.mongodb.com/manual/core/read-preference/#tag-sets) options. For details on BI Connector for Atlas read preferences, refer to the [BI Connector Read Preferences Table](https://docs.atlas.mongodb.com/tutorial/create-global-writes-cluster/#bic-read-preferences).
     * 
     * - Set to &#34;primary&#34; to have BI Connector for Atlas read from the primary.
     * 
     * - Set to &#34;secondary&#34; to have BI Connector for Atlas read from a secondary member. Default if there are no analytics nodes in the cluster.
     * 
     * - Set to &#34;analytics&#34; to have BI Connector for Atlas read from an analytics node. Default if the cluster contains analytics nodes.
     * 
     */
    public Optional<Output<String>> readPreference() {
        return Optional.ofNullable(this.readPreference);
    }

    private ClusterBiConnectorConfigArgs() {}

    private ClusterBiConnectorConfigArgs(ClusterBiConnectorConfigArgs $) {
        this.enabled = $.enabled;
        this.readPreference = $.readPreference;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterBiConnectorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterBiConnectorConfigArgs $;

        public Builder() {
            $ = new ClusterBiConnectorConfigArgs();
        }

        public Builder(ClusterBiConnectorConfigArgs defaults) {
            $ = new ClusterBiConnectorConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Specifies whether or not BI Connector for Atlas is enabled on the cluster.
         * *
         * - Set to `true` to enable BI Connector for Atlas.
         * - Set to `false` to disable BI Connector for Atlas.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Specifies whether or not BI Connector for Atlas is enabled on the cluster.
         * *
         * - Set to `true` to enable BI Connector for Atlas.
         * - Set to `false` to disable BI Connector for Atlas.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param readPreference Specifies the read preference to be used by BI Connector for Atlas on the cluster. Each BI Connector for Atlas read preference contains a distinct combination of [readPreference](https://docs.mongodb.com/manual/core/read-preference/) and [readPreferenceTags](https://docs.mongodb.com/manual/core/read-preference/#tag-sets) options. For details on BI Connector for Atlas read preferences, refer to the [BI Connector Read Preferences Table](https://docs.atlas.mongodb.com/tutorial/create-global-writes-cluster/#bic-read-preferences).
         * 
         * - Set to &#34;primary&#34; to have BI Connector for Atlas read from the primary.
         * 
         * - Set to &#34;secondary&#34; to have BI Connector for Atlas read from a secondary member. Default if there are no analytics nodes in the cluster.
         * 
         * - Set to &#34;analytics&#34; to have BI Connector for Atlas read from an analytics node. Default if the cluster contains analytics nodes.
         * 
         * @return builder
         * 
         */
        public Builder readPreference(@Nullable Output<String> readPreference) {
            $.readPreference = readPreference;
            return this;
        }

        /**
         * @param readPreference Specifies the read preference to be used by BI Connector for Atlas on the cluster. Each BI Connector for Atlas read preference contains a distinct combination of [readPreference](https://docs.mongodb.com/manual/core/read-preference/) and [readPreferenceTags](https://docs.mongodb.com/manual/core/read-preference/#tag-sets) options. For details on BI Connector for Atlas read preferences, refer to the [BI Connector Read Preferences Table](https://docs.atlas.mongodb.com/tutorial/create-global-writes-cluster/#bic-read-preferences).
         * 
         * - Set to &#34;primary&#34; to have BI Connector for Atlas read from the primary.
         * 
         * - Set to &#34;secondary&#34; to have BI Connector for Atlas read from a secondary member. Default if there are no analytics nodes in the cluster.
         * 
         * - Set to &#34;analytics&#34; to have BI Connector for Atlas read from an analytics node. Default if the cluster contains analytics nodes.
         * 
         * @return builder
         * 
         */
        public Builder readPreference(String readPreference) {
            return readPreference(Output.of(readPreference));
        }

        public ClusterBiConnectorConfigArgs build() {
            return $;
        }
    }

}
