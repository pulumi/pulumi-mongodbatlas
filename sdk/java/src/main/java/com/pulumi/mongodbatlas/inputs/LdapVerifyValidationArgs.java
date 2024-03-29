// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LdapVerifyValidationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LdapVerifyValidationArgs Empty = new LdapVerifyValidationArgs();

    /**
     * The current status of the LDAP over TLS/SSL configuration. One of the following values: `PENDING`, `SUCCESS`, and `FAILED`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The current status of the LDAP over TLS/SSL configuration. One of the following values: `PENDING`, `SUCCESS`, and `FAILED`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    @Import(name="validationType")
    private @Nullable Output<String> validationType;

    public Optional<Output<String>> validationType() {
        return Optional.ofNullable(this.validationType);
    }

    private LdapVerifyValidationArgs() {}

    private LdapVerifyValidationArgs(LdapVerifyValidationArgs $) {
        this.status = $.status;
        this.validationType = $.validationType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LdapVerifyValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LdapVerifyValidationArgs $;

        public Builder() {
            $ = new LdapVerifyValidationArgs();
        }

        public Builder(LdapVerifyValidationArgs defaults) {
            $ = new LdapVerifyValidationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param status The current status of the LDAP over TLS/SSL configuration. One of the following values: `PENDING`, `SUCCESS`, and `FAILED`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The current status of the LDAP over TLS/SSL configuration. One of the following values: `PENDING`, `SUCCESS`, and `FAILED`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public Builder validationType(@Nullable Output<String> validationType) {
            $.validationType = validationType;
            return this;
        }

        public Builder validationType(String validationType) {
            return validationType(Output.of(validationType));
        }

        public LdapVerifyValidationArgs build() {
            return $;
        }
    }

}
