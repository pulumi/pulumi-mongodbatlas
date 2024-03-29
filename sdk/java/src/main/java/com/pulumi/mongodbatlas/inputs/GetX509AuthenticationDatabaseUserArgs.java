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


public final class GetX509AuthenticationDatabaseUserArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetX509AuthenticationDatabaseUserArgs Empty = new GetX509AuthenticationDatabaseUserArgs();

    /**
     * Identifier for the Atlas project associated with the X.509 configuration.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Identifier for the Atlas project associated with the X.509 configuration.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * Username of the database user to create a certificate for.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Username of the database user to create a certificate for.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private GetX509AuthenticationDatabaseUserArgs() {}

    private GetX509AuthenticationDatabaseUserArgs(GetX509AuthenticationDatabaseUserArgs $) {
        this.projectId = $.projectId;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetX509AuthenticationDatabaseUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetX509AuthenticationDatabaseUserArgs $;

        public Builder() {
            $ = new GetX509AuthenticationDatabaseUserArgs();
        }

        public Builder(GetX509AuthenticationDatabaseUserArgs defaults) {
            $ = new GetX509AuthenticationDatabaseUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectId Identifier for the Atlas project associated with the X.509 configuration.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Identifier for the Atlas project associated with the X.509 configuration.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param username Username of the database user to create a certificate for.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username of the database user to create a certificate for.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public GetX509AuthenticationDatabaseUserArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetX509AuthenticationDatabaseUserArgs", "projectId");
            }
            return $;
        }
    }

}
