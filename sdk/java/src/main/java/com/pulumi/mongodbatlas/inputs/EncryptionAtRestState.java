// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.EncryptionAtRestAwsKmsConfigArgs;
import com.pulumi.mongodbatlas.inputs.EncryptionAtRestAzureKeyVaultConfigArgs;
import com.pulumi.mongodbatlas.inputs.EncryptionAtRestGoogleCloudKmsConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EncryptionAtRestState extends com.pulumi.resources.ResourceArgs {

    public static final EncryptionAtRestState Empty = new EncryptionAtRestState();

    @Import(name="awsKmsConfig")
    private @Nullable Output<EncryptionAtRestAwsKmsConfigArgs> awsKmsConfig;

    public Optional<Output<EncryptionAtRestAwsKmsConfigArgs>> awsKmsConfig() {
        return Optional.ofNullable(this.awsKmsConfig);
    }

    @Import(name="azureKeyVaultConfig")
    private @Nullable Output<EncryptionAtRestAzureKeyVaultConfigArgs> azureKeyVaultConfig;

    public Optional<Output<EncryptionAtRestAzureKeyVaultConfigArgs>> azureKeyVaultConfig() {
        return Optional.ofNullable(this.azureKeyVaultConfig);
    }

    @Import(name="googleCloudKmsConfig")
    private @Nullable Output<EncryptionAtRestGoogleCloudKmsConfigArgs> googleCloudKmsConfig;

    public Optional<Output<EncryptionAtRestGoogleCloudKmsConfigArgs>> googleCloudKmsConfig() {
        return Optional.ofNullable(this.googleCloudKmsConfig);
    }

    /**
     * The unique identifier for the project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The unique identifier for the project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private EncryptionAtRestState() {}

    private EncryptionAtRestState(EncryptionAtRestState $) {
        this.awsKmsConfig = $.awsKmsConfig;
        this.azureKeyVaultConfig = $.azureKeyVaultConfig;
        this.googleCloudKmsConfig = $.googleCloudKmsConfig;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionAtRestState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionAtRestState $;

        public Builder() {
            $ = new EncryptionAtRestState();
        }

        public Builder(EncryptionAtRestState defaults) {
            $ = new EncryptionAtRestState(Objects.requireNonNull(defaults));
        }

        public Builder awsKmsConfig(@Nullable Output<EncryptionAtRestAwsKmsConfigArgs> awsKmsConfig) {
            $.awsKmsConfig = awsKmsConfig;
            return this;
        }

        public Builder awsKmsConfig(EncryptionAtRestAwsKmsConfigArgs awsKmsConfig) {
            return awsKmsConfig(Output.of(awsKmsConfig));
        }

        public Builder azureKeyVaultConfig(@Nullable Output<EncryptionAtRestAzureKeyVaultConfigArgs> azureKeyVaultConfig) {
            $.azureKeyVaultConfig = azureKeyVaultConfig;
            return this;
        }

        public Builder azureKeyVaultConfig(EncryptionAtRestAzureKeyVaultConfigArgs azureKeyVaultConfig) {
            return azureKeyVaultConfig(Output.of(azureKeyVaultConfig));
        }

        public Builder googleCloudKmsConfig(@Nullable Output<EncryptionAtRestGoogleCloudKmsConfigArgs> googleCloudKmsConfig) {
            $.googleCloudKmsConfig = googleCloudKmsConfig;
            return this;
        }

        public Builder googleCloudKmsConfig(EncryptionAtRestGoogleCloudKmsConfigArgs googleCloudKmsConfig) {
            return googleCloudKmsConfig(Output.of(googleCloudKmsConfig));
        }

        /**
         * @param projectId The unique identifier for the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique identifier for the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public EncryptionAtRestState build() {
            return $;
        }
    }

}
