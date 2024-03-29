// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetX509AuthenticationDatabaseUserPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetX509AuthenticationDatabaseUserPlainArgs Empty = new GetX509AuthenticationDatabaseUserPlainArgs();

    /**
     * Identifier for the Atlas project associated with the X.509 configuration.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return Identifier for the Atlas project associated with the X.509 configuration.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    /**
     * Username of the database user to create a certificate for.
     * 
     */
    @Import(name="username")
    private @Nullable String username;

    /**
     * @return Username of the database user to create a certificate for.
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    private GetX509AuthenticationDatabaseUserPlainArgs() {}

    private GetX509AuthenticationDatabaseUserPlainArgs(GetX509AuthenticationDatabaseUserPlainArgs $) {
        this.projectId = $.projectId;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetX509AuthenticationDatabaseUserPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetX509AuthenticationDatabaseUserPlainArgs $;

        public Builder() {
            $ = new GetX509AuthenticationDatabaseUserPlainArgs();
        }

        public Builder(GetX509AuthenticationDatabaseUserPlainArgs defaults) {
            $ = new GetX509AuthenticationDatabaseUserPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectId Identifier for the Atlas project associated with the X.509 configuration.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param username Username of the database user to create a certificate for.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable String username) {
            $.username = username;
            return this;
        }

        public GetX509AuthenticationDatabaseUserPlainArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetX509AuthenticationDatabaseUserPlainArgs", "projectId");
            }
            return $;
        }
    }

}
