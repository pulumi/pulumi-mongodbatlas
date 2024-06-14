// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTeamPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTeamPlainArgs Empty = new GetTeamPlainArgs();

    /**
     * The team name.
     * 
     * &gt; **IMPORTANT:** Either `team_id` or `name` must be configured.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The team name.
     * 
     * &gt; **IMPORTANT:** Either `team_id` or `name` must be configured.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The unique identifier for the organization you want to associate the team with.
     * 
     */
    @Import(name="orgId", required=true)
    private String orgId;

    /**
     * @return The unique identifier for the organization you want to associate the team with.
     * 
     */
    public String orgId() {
        return this.orgId;
    }

    /**
     * The unique identifier for the team.
     * 
     */
    @Import(name="teamId")
    private @Nullable String teamId;

    /**
     * @return The unique identifier for the team.
     * 
     */
    public Optional<String> teamId() {
        return Optional.ofNullable(this.teamId);
    }

    private GetTeamPlainArgs() {}

    private GetTeamPlainArgs(GetTeamPlainArgs $) {
        this.name = $.name;
        this.orgId = $.orgId;
        this.teamId = $.teamId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTeamPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTeamPlainArgs $;

        public Builder() {
            $ = new GetTeamPlainArgs();
        }

        public Builder(GetTeamPlainArgs defaults) {
            $ = new GetTeamPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The team name.
         * 
         * &gt; **IMPORTANT:** Either `team_id` or `name` must be configured.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param orgId The unique identifier for the organization you want to associate the team with.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param teamId The unique identifier for the team.
         * 
         * @return builder
         * 
         */
        public Builder teamId(@Nullable String teamId) {
            $.teamId = teamId;
            return this;
        }

        public GetTeamPlainArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetTeamPlainArgs", "orgId");
            }
            return $;
        }
    }

}