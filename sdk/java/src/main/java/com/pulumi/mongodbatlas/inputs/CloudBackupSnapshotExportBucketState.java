// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudBackupSnapshotExportBucketState extends com.pulumi.resources.ResourceArgs {

    public static final CloudBackupSnapshotExportBucketState Empty = new CloudBackupSnapshotExportBucketState();

    /**
     * Name of the bucket that the provided role ID is authorized to access.
     * 
     */
    @Import(name="bucketName")
    private @Nullable Output<String> bucketName;

    /**
     * @return Name of the bucket that the provided role ID is authorized to access.
     * 
     */
    public Optional<Output<String>> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }

    /**
     * Name of the provider of the cloud service where Atlas can access the S3 bucket.
     * 
     */
    @Import(name="cloudProvider")
    private @Nullable Output<String> cloudProvider;

    /**
     * @return Name of the provider of the cloud service where Atlas can access the S3 bucket.
     * 
     */
    public Optional<Output<String>> cloudProvider() {
        return Optional.ofNullable(this.cloudProvider);
    }

    /**
     * Unique identifier of the snapshot export bucket.
     * 
     */
    @Import(name="exportBucketId")
    private @Nullable Output<String> exportBucketId;

    /**
     * @return Unique identifier of the snapshot export bucket.
     * 
     */
    public Optional<Output<String>> exportBucketId() {
        return Optional.ofNullable(this.exportBucketId);
    }

    /**
     * Unique identifier of the role that Atlas can use to access the bucket. Required if `cloud_provider` is set to `AWS`.
     * 
     */
    @Import(name="iamRoleId")
    private @Nullable Output<String> iamRoleId;

    /**
     * @return Unique identifier of the role that Atlas can use to access the bucket. Required if `cloud_provider` is set to `AWS`.
     * 
     */
    public Optional<Output<String>> iamRoleId() {
        return Optional.ofNullable(this.iamRoleId);
    }

    /**
     * The unique identifier of the project for the Atlas cluster.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The unique identifier of the project for the Atlas cluster.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Unique identifier of the Azure Service Principal that Atlas can use to access the Azure Blob Storage Container. Required if `cloud_provider` is set to `AZURE`.
     * 
     */
    @Import(name="roleId")
    private @Nullable Output<String> roleId;

    /**
     * @return Unique identifier of the Azure Service Principal that Atlas can use to access the Azure Blob Storage Container. Required if `cloud_provider` is set to `AZURE`.
     * 
     */
    public Optional<Output<String>> roleId() {
        return Optional.ofNullable(this.roleId);
    }

    /**
     * URL that identifies the blob Endpoint of the Azure Blob Storage Account. Required if `cloud_provider` is set to `AZURE`.
     * 
     */
    @Import(name="serviceUrl")
    private @Nullable Output<String> serviceUrl;

    /**
     * @return URL that identifies the blob Endpoint of the Azure Blob Storage Account. Required if `cloud_provider` is set to `AZURE`.
     * 
     */
    public Optional<Output<String>> serviceUrl() {
        return Optional.ofNullable(this.serviceUrl);
    }

    /**
     * UUID that identifies the Azure Active Directory Tenant ID. Required if `cloud_provider` is set to `AZURE`.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return UUID that identifies the Azure Active Directory Tenant ID. Required if `cloud_provider` is set to `AZURE`.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private CloudBackupSnapshotExportBucketState() {}

    private CloudBackupSnapshotExportBucketState(CloudBackupSnapshotExportBucketState $) {
        this.bucketName = $.bucketName;
        this.cloudProvider = $.cloudProvider;
        this.exportBucketId = $.exportBucketId;
        this.iamRoleId = $.iamRoleId;
        this.projectId = $.projectId;
        this.roleId = $.roleId;
        this.serviceUrl = $.serviceUrl;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudBackupSnapshotExportBucketState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudBackupSnapshotExportBucketState $;

        public Builder() {
            $ = new CloudBackupSnapshotExportBucketState();
        }

        public Builder(CloudBackupSnapshotExportBucketState defaults) {
            $ = new CloudBackupSnapshotExportBucketState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketName Name of the bucket that the provided role ID is authorized to access.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(@Nullable Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName Name of the bucket that the provided role ID is authorized to access.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param cloudProvider Name of the provider of the cloud service where Atlas can access the S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(@Nullable Output<String> cloudProvider) {
            $.cloudProvider = cloudProvider;
            return this;
        }

        /**
         * @param cloudProvider Name of the provider of the cloud service where Atlas can access the S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder cloudProvider(String cloudProvider) {
            return cloudProvider(Output.of(cloudProvider));
        }

        /**
         * @param exportBucketId Unique identifier of the snapshot export bucket.
         * 
         * @return builder
         * 
         */
        public Builder exportBucketId(@Nullable Output<String> exportBucketId) {
            $.exportBucketId = exportBucketId;
            return this;
        }

        /**
         * @param exportBucketId Unique identifier of the snapshot export bucket.
         * 
         * @return builder
         * 
         */
        public Builder exportBucketId(String exportBucketId) {
            return exportBucketId(Output.of(exportBucketId));
        }

        /**
         * @param iamRoleId Unique identifier of the role that Atlas can use to access the bucket. Required if `cloud_provider` is set to `AWS`.
         * 
         * @return builder
         * 
         */
        public Builder iamRoleId(@Nullable Output<String> iamRoleId) {
            $.iamRoleId = iamRoleId;
            return this;
        }

        /**
         * @param iamRoleId Unique identifier of the role that Atlas can use to access the bucket. Required if `cloud_provider` is set to `AWS`.
         * 
         * @return builder
         * 
         */
        public Builder iamRoleId(String iamRoleId) {
            return iamRoleId(Output.of(iamRoleId));
        }

        /**
         * @param projectId The unique identifier of the project for the Atlas cluster.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique identifier of the project for the Atlas cluster.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param roleId Unique identifier of the Azure Service Principal that Atlas can use to access the Azure Blob Storage Container. Required if `cloud_provider` is set to `AZURE`.
         * 
         * @return builder
         * 
         */
        public Builder roleId(@Nullable Output<String> roleId) {
            $.roleId = roleId;
            return this;
        }

        /**
         * @param roleId Unique identifier of the Azure Service Principal that Atlas can use to access the Azure Blob Storage Container. Required if `cloud_provider` is set to `AZURE`.
         * 
         * @return builder
         * 
         */
        public Builder roleId(String roleId) {
            return roleId(Output.of(roleId));
        }

        /**
         * @param serviceUrl URL that identifies the blob Endpoint of the Azure Blob Storage Account. Required if `cloud_provider` is set to `AZURE`.
         * 
         * @return builder
         * 
         */
        public Builder serviceUrl(@Nullable Output<String> serviceUrl) {
            $.serviceUrl = serviceUrl;
            return this;
        }

        /**
         * @param serviceUrl URL that identifies the blob Endpoint of the Azure Blob Storage Account. Required if `cloud_provider` is set to `AZURE`.
         * 
         * @return builder
         * 
         */
        public Builder serviceUrl(String serviceUrl) {
            return serviceUrl(Output.of(serviceUrl));
        }

        /**
         * @param tenantId UUID that identifies the Azure Active Directory Tenant ID. Required if `cloud_provider` is set to `AZURE`.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId UUID that identifies the Azure Active Directory Tenant ID. Required if `cloud_provider` is set to `AZURE`.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public CloudBackupSnapshotExportBucketState build() {
            return $;
        }
    }

}