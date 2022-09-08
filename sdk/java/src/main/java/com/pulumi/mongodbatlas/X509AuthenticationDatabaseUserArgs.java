// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class X509AuthenticationDatabaseUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final X509AuthenticationDatabaseUserArgs Empty = new X509AuthenticationDatabaseUserArgs();

    /**
     * PEM string containing one or more customer CAs for database user authentication.
     * 
     */
    @Import(name="customerX509Cas")
    private @Nullable Output<String> customerX509Cas;

    /**
     * @return PEM string containing one or more customer CAs for database user authentication.
     * 
     */
    public Optional<Output<String>> customerX509Cas() {
        return Optional.ofNullable(this.customerX509Cas);
    }

    /**
     * A number of months that the created certificate is valid for before expiry, up to 24 months. By default is 3.
     * 
     */
    @Import(name="monthsUntilExpiration")
    private @Nullable Output<Integer> monthsUntilExpiration;

    /**
     * @return A number of months that the created certificate is valid for before expiry, up to 24 months. By default is 3.
     * 
     */
    public Optional<Output<Integer>> monthsUntilExpiration() {
        return Optional.ofNullable(this.monthsUntilExpiration);
    }

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

    private X509AuthenticationDatabaseUserArgs() {}

    private X509AuthenticationDatabaseUserArgs(X509AuthenticationDatabaseUserArgs $) {
        this.customerX509Cas = $.customerX509Cas;
        this.monthsUntilExpiration = $.monthsUntilExpiration;
        this.projectId = $.projectId;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(X509AuthenticationDatabaseUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X509AuthenticationDatabaseUserArgs $;

        public Builder() {
            $ = new X509AuthenticationDatabaseUserArgs();
        }

        public Builder(X509AuthenticationDatabaseUserArgs defaults) {
            $ = new X509AuthenticationDatabaseUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customerX509Cas PEM string containing one or more customer CAs for database user authentication.
         * 
         * @return builder
         * 
         */
        public Builder customerX509Cas(@Nullable Output<String> customerX509Cas) {
            $.customerX509Cas = customerX509Cas;
            return this;
        }

        /**
         * @param customerX509Cas PEM string containing one or more customer CAs for database user authentication.
         * 
         * @return builder
         * 
         */
        public Builder customerX509Cas(String customerX509Cas) {
            return customerX509Cas(Output.of(customerX509Cas));
        }

        /**
         * @param monthsUntilExpiration A number of months that the created certificate is valid for before expiry, up to 24 months. By default is 3.
         * 
         * @return builder
         * 
         */
        public Builder monthsUntilExpiration(@Nullable Output<Integer> monthsUntilExpiration) {
            $.monthsUntilExpiration = monthsUntilExpiration;
            return this;
        }

        /**
         * @param monthsUntilExpiration A number of months that the created certificate is valid for before expiry, up to 24 months. By default is 3.
         * 
         * @return builder
         * 
         */
        public Builder monthsUntilExpiration(Integer monthsUntilExpiration) {
            return monthsUntilExpiration(Output.of(monthsUntilExpiration));
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

        public X509AuthenticationDatabaseUserArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}
