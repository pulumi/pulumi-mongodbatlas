// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamInstanceStreamConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamInstanceStreamConfigArgs Empty = new StreamInstanceStreamConfigArgs();

    /**
     * Selected tier for the Stream Instance. Configures Memory / VCPU allowances. The [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) describes the valid values.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<String> tier;

    /**
     * @return Selected tier for the Stream Instance. Configures Memory / VCPU allowances. The [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) describes the valid values.
     * 
     */
    public Optional<Output<String>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private StreamInstanceStreamConfigArgs() {}

    private StreamInstanceStreamConfigArgs(StreamInstanceStreamConfigArgs $) {
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamInstanceStreamConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamInstanceStreamConfigArgs $;

        public Builder() {
            $ = new StreamInstanceStreamConfigArgs();
        }

        public Builder(StreamInstanceStreamConfigArgs defaults) {
            $ = new StreamInstanceStreamConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tier Selected tier for the Stream Instance. Configures Memory / VCPU allowances. The [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) describes the valid values.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<String> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier Selected tier for the Stream Instance. Configures Memory / VCPU allowances. The [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) describes the valid values.
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        public StreamInstanceStreamConfigArgs build() {
            return $;
        }
    }

}