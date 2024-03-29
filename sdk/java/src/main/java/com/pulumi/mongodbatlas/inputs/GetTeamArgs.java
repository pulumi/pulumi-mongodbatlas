// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTeamArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTeamArgs Empty = new GetTeamArgs();

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    @Import(name="teamId")
    private @Nullable Output<String> teamId;

    public Optional<Output<String>> teamId() {
        return Optional.ofNullable(this.teamId);
    }

    private GetTeamArgs() {}

    private GetTeamArgs(GetTeamArgs $) {
        this.name = $.name;
        this.orgId = $.orgId;
        this.teamId = $.teamId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTeamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTeamArgs $;

        public Builder() {
            $ = new GetTeamArgs();
        }

        public Builder(GetTeamArgs defaults) {
            $ = new GetTeamArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public Builder teamId(@Nullable Output<String> teamId) {
            $.teamId = teamId;
            return this;
        }

        public Builder teamId(String teamId) {
            return teamId(Output.of(teamId));
        }

        public GetTeamArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetTeamArgs", "orgId");
            }
            return $;
        }
    }

}
