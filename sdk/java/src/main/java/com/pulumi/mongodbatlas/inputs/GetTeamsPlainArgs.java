// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTeamsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTeamsPlainArgs Empty = new GetTeamsPlainArgs();

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="orgId", required=true)
    private String orgId;

    public String orgId() {
        return this.orgId;
    }

    @Import(name="teamId")
    private @Nullable String teamId;

    public Optional<String> teamId() {
        return Optional.ofNullable(this.teamId);
    }

    private GetTeamsPlainArgs() {}

    private GetTeamsPlainArgs(GetTeamsPlainArgs $) {
        this.name = $.name;
        this.orgId = $.orgId;
        this.teamId = $.teamId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTeamsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTeamsPlainArgs $;

        public Builder() {
            $ = new GetTeamsPlainArgs();
        }

        public Builder(GetTeamsPlainArgs defaults) {
            $ = new GetTeamsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder orgId(String orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder teamId(@Nullable String teamId) {
            $.teamId = teamId;
            return this;
        }

        public GetTeamsPlainArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetTeamsPlainArgs", "orgId");
            }
            return $;
        }
    }

}
