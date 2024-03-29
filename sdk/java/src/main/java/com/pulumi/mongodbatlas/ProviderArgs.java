// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.ProviderAssumeRoleArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    @Import(name="assumeRole", json=true)
    private @Nullable Output<ProviderAssumeRoleArgs> assumeRole;

    public Optional<Output<ProviderAssumeRoleArgs>> assumeRole() {
        return Optional.ofNullable(this.assumeRole);
    }

    /**
     * AWS API Access Key.
     * 
     */
    @Import(name="awsAccessKeyId")
    private @Nullable Output<String> awsAccessKeyId;

    /**
     * @return AWS API Access Key.
     * 
     */
    public Optional<Output<String>> awsAccessKeyId() {
        return Optional.ofNullable(this.awsAccessKeyId);
    }

    /**
     * AWS API Access Secret Key.
     * 
     */
    @Import(name="awsSecretAccessKey")
    private @Nullable Output<String> awsSecretAccessKey;

    /**
     * @return AWS API Access Secret Key.
     * 
     */
    public Optional<Output<String>> awsSecretAccessKey() {
        return Optional.ofNullable(this.awsSecretAccessKey);
    }

    /**
     * AWS Security Token Service provided session token.
     * 
     */
    @Import(name="awsSessionToken")
    private @Nullable Output<String> awsSessionToken;

    /**
     * @return AWS Security Token Service provided session token.
     * 
     */
    public Optional<Output<String>> awsSessionToken() {
        return Optional.ofNullable(this.awsSessionToken);
    }

    /**
     * MongoDB Atlas Base URL
     * 
     */
    @Import(name="baseUrl")
    private @Nullable Output<String> baseUrl;

    /**
     * @return MongoDB Atlas Base URL
     * 
     */
    public Optional<Output<String>> baseUrl() {
        return Optional.ofNullable(this.baseUrl);
    }

    /**
     * MongoDB Atlas Base URL default to gov
     * 
     */
    @Import(name="isMongodbgovCloud", json=true)
    private @Nullable Output<Boolean> isMongodbgovCloud;

    /**
     * @return MongoDB Atlas Base URL default to gov
     * 
     */
    public Optional<Output<Boolean>> isMongodbgovCloud() {
        return Optional.ofNullable(this.isMongodbgovCloud);
    }

    /**
     * MongoDB Atlas Programmatic Private Key
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return MongoDB Atlas Programmatic Private Key
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    /**
     * MongoDB Atlas Programmatic Public Key
     * 
     */
    @Import(name="publicKey")
    private @Nullable Output<String> publicKey;

    /**
     * @return MongoDB Atlas Programmatic Public Key
     * 
     */
    public Optional<Output<String>> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }

    /**
     * MongoDB Realm Base URL
     * 
     */
    @Import(name="realmBaseUrl")
    private @Nullable Output<String> realmBaseUrl;

    /**
     * @return MongoDB Realm Base URL
     * 
     */
    public Optional<Output<String>> realmBaseUrl() {
        return Optional.ofNullable(this.realmBaseUrl);
    }

    /**
     * Region where secret is stored as part of AWS Secret Manager.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Region where secret is stored as part of AWS Secret Manager.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Name of secret stored in AWS Secret Manager.
     * 
     */
    @Import(name="secretName")
    private @Nullable Output<String> secretName;

    /**
     * @return Name of secret stored in AWS Secret Manager.
     * 
     */
    public Optional<Output<String>> secretName() {
        return Optional.ofNullable(this.secretName);
    }

    /**
     * AWS Security Token Service endpoint. Required for cross-AWS region or cross-AWS account secrets.
     * 
     */
    @Import(name="stsEndpoint")
    private @Nullable Output<String> stsEndpoint;

    /**
     * @return AWS Security Token Service endpoint. Required for cross-AWS region or cross-AWS account secrets.
     * 
     */
    public Optional<Output<String>> stsEndpoint() {
        return Optional.ofNullable(this.stsEndpoint);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.assumeRole = $.assumeRole;
        this.awsAccessKeyId = $.awsAccessKeyId;
        this.awsSecretAccessKey = $.awsSecretAccessKey;
        this.awsSessionToken = $.awsSessionToken;
        this.baseUrl = $.baseUrl;
        this.isMongodbgovCloud = $.isMongodbgovCloud;
        this.privateKey = $.privateKey;
        this.publicKey = $.publicKey;
        this.realmBaseUrl = $.realmBaseUrl;
        this.region = $.region;
        this.secretName = $.secretName;
        this.stsEndpoint = $.stsEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder assumeRole(@Nullable Output<ProviderAssumeRoleArgs> assumeRole) {
            $.assumeRole = assumeRole;
            return this;
        }

        public Builder assumeRole(ProviderAssumeRoleArgs assumeRole) {
            return assumeRole(Output.of(assumeRole));
        }

        /**
         * @param awsAccessKeyId AWS API Access Key.
         * 
         * @return builder
         * 
         */
        public Builder awsAccessKeyId(@Nullable Output<String> awsAccessKeyId) {
            $.awsAccessKeyId = awsAccessKeyId;
            return this;
        }

        /**
         * @param awsAccessKeyId AWS API Access Key.
         * 
         * @return builder
         * 
         */
        public Builder awsAccessKeyId(String awsAccessKeyId) {
            return awsAccessKeyId(Output.of(awsAccessKeyId));
        }

        /**
         * @param awsSecretAccessKey AWS API Access Secret Key.
         * 
         * @return builder
         * 
         */
        public Builder awsSecretAccessKey(@Nullable Output<String> awsSecretAccessKey) {
            $.awsSecretAccessKey = awsSecretAccessKey;
            return this;
        }

        /**
         * @param awsSecretAccessKey AWS API Access Secret Key.
         * 
         * @return builder
         * 
         */
        public Builder awsSecretAccessKey(String awsSecretAccessKey) {
            return awsSecretAccessKey(Output.of(awsSecretAccessKey));
        }

        /**
         * @param awsSessionToken AWS Security Token Service provided session token.
         * 
         * @return builder
         * 
         */
        public Builder awsSessionToken(@Nullable Output<String> awsSessionToken) {
            $.awsSessionToken = awsSessionToken;
            return this;
        }

        /**
         * @param awsSessionToken AWS Security Token Service provided session token.
         * 
         * @return builder
         * 
         */
        public Builder awsSessionToken(String awsSessionToken) {
            return awsSessionToken(Output.of(awsSessionToken));
        }

        /**
         * @param baseUrl MongoDB Atlas Base URL
         * 
         * @return builder
         * 
         */
        public Builder baseUrl(@Nullable Output<String> baseUrl) {
            $.baseUrl = baseUrl;
            return this;
        }

        /**
         * @param baseUrl MongoDB Atlas Base URL
         * 
         * @return builder
         * 
         */
        public Builder baseUrl(String baseUrl) {
            return baseUrl(Output.of(baseUrl));
        }

        /**
         * @param isMongodbgovCloud MongoDB Atlas Base URL default to gov
         * 
         * @return builder
         * 
         */
        public Builder isMongodbgovCloud(@Nullable Output<Boolean> isMongodbgovCloud) {
            $.isMongodbgovCloud = isMongodbgovCloud;
            return this;
        }

        /**
         * @param isMongodbgovCloud MongoDB Atlas Base URL default to gov
         * 
         * @return builder
         * 
         */
        public Builder isMongodbgovCloud(Boolean isMongodbgovCloud) {
            return isMongodbgovCloud(Output.of(isMongodbgovCloud));
        }

        /**
         * @param privateKey MongoDB Atlas Programmatic Private Key
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey MongoDB Atlas Programmatic Private Key
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        /**
         * @param publicKey MongoDB Atlas Programmatic Public Key
         * 
         * @return builder
         * 
         */
        public Builder publicKey(@Nullable Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        /**
         * @param publicKey MongoDB Atlas Programmatic Public Key
         * 
         * @return builder
         * 
         */
        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        /**
         * @param realmBaseUrl MongoDB Realm Base URL
         * 
         * @return builder
         * 
         */
        public Builder realmBaseUrl(@Nullable Output<String> realmBaseUrl) {
            $.realmBaseUrl = realmBaseUrl;
            return this;
        }

        /**
         * @param realmBaseUrl MongoDB Realm Base URL
         * 
         * @return builder
         * 
         */
        public Builder realmBaseUrl(String realmBaseUrl) {
            return realmBaseUrl(Output.of(realmBaseUrl));
        }

        /**
         * @param region Region where secret is stored as part of AWS Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Region where secret is stored as part of AWS Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param secretName Name of secret stored in AWS Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder secretName(@Nullable Output<String> secretName) {
            $.secretName = secretName;
            return this;
        }

        /**
         * @param secretName Name of secret stored in AWS Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder secretName(String secretName) {
            return secretName(Output.of(secretName));
        }

        /**
         * @param stsEndpoint AWS Security Token Service endpoint. Required for cross-AWS region or cross-AWS account secrets.
         * 
         * @return builder
         * 
         */
        public Builder stsEndpoint(@Nullable Output<String> stsEndpoint) {
            $.stsEndpoint = stsEndpoint;
            return this;
        }

        /**
         * @param stsEndpoint AWS Security Token Service endpoint. Required for cross-AWS region or cross-AWS account secrets.
         * 
         * @return builder
         * 
         */
        public Builder stsEndpoint(String stsEndpoint) {
            return stsEndpoint(Output.of(stsEndpoint));
        }

        public ProviderArgs build() {
            return $;
        }
    }

}
