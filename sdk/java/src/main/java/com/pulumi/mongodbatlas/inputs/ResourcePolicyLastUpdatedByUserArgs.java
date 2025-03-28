// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourcePolicyLastUpdatedByUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyLastUpdatedByUserArgs Empty = new ResourcePolicyLastUpdatedByUserArgs();

    /**
     * Unique 24-hexadecimal character string that identifies a user.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Unique 24-hexadecimal character string that identifies a user.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Human-readable label that describes a user.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Human-readable label that describes a user.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ResourcePolicyLastUpdatedByUserArgs() {}

    private ResourcePolicyLastUpdatedByUserArgs(ResourcePolicyLastUpdatedByUserArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicyLastUpdatedByUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyLastUpdatedByUserArgs $;

        public Builder() {
            $ = new ResourcePolicyLastUpdatedByUserArgs();
        }

        public Builder(ResourcePolicyLastUpdatedByUserArgs defaults) {
            $ = new ResourcePolicyLastUpdatedByUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Unique 24-hexadecimal character string that identifies a user.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Unique 24-hexadecimal character string that identifies a user.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name Human-readable label that describes a user.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Human-readable label that describes a user.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ResourcePolicyLastUpdatedByUserArgs build() {
            return $;
        }
    }

}
