// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LdapConfigurationUserToDnMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final LdapConfigurationUserToDnMappingArgs Empty = new LdapConfigurationUserToDnMappingArgs();

    @Import(name="ldapQuery")
    private @Nullable Output<String> ldapQuery;

    public Optional<Output<String>> ldapQuery() {
        return Optional.ofNullable(this.ldapQuery);
    }

    @Import(name="match")
    private @Nullable Output<String> match;

    public Optional<Output<String>> match() {
        return Optional.ofNullable(this.match);
    }

    @Import(name="substitution")
    private @Nullable Output<String> substitution;

    public Optional<Output<String>> substitution() {
        return Optional.ofNullable(this.substitution);
    }

    private LdapConfigurationUserToDnMappingArgs() {}

    private LdapConfigurationUserToDnMappingArgs(LdapConfigurationUserToDnMappingArgs $) {
        this.ldapQuery = $.ldapQuery;
        this.match = $.match;
        this.substitution = $.substitution;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LdapConfigurationUserToDnMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LdapConfigurationUserToDnMappingArgs $;

        public Builder() {
            $ = new LdapConfigurationUserToDnMappingArgs();
        }

        public Builder(LdapConfigurationUserToDnMappingArgs defaults) {
            $ = new LdapConfigurationUserToDnMappingArgs(Objects.requireNonNull(defaults));
        }

        public Builder ldapQuery(@Nullable Output<String> ldapQuery) {
            $.ldapQuery = ldapQuery;
            return this;
        }

        public Builder ldapQuery(String ldapQuery) {
            return ldapQuery(Output.of(ldapQuery));
        }

        public Builder match(@Nullable Output<String> match) {
            $.match = match;
            return this;
        }

        public Builder match(String match) {
            return match(Output.of(match));
        }

        public Builder substitution(@Nullable Output<String> substitution) {
            $.substitution = substitution;
            return this;
        }

        public Builder substitution(String substitution) {
            return substitution(Output.of(substitution));
        }

        public LdapConfigurationUserToDnMappingArgs build() {
            return $;
        }
    }

}
