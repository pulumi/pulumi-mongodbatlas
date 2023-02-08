// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetCloudBackupSnapshotsResultMember;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCloudBackupSnapshotsResult {
    /**
     * @return Cloud provider that stores this snapshot.
     * 
     */
    private String cloudProvider;
    /**
     * @return UTC ISO 8601 formatted point in time when Atlas took the snapshot.
     * 
     */
    private String createdAt;
    /**
     * @return UDescription of the snapshot. Only present for on-demand snapshots.
     * 
     */
    private String description;
    /**
     * @return UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
     * 
     */
    private String expiresAt;
    /**
     * @return Unique identifier for the sharded cluster snapshot.
     * 
     */
    private String id;
    /**
     * @return Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
     * 
     */
    private String masterKeyUuid;
    /**
     * @return Block of List of snapshots and the cloud provider where the snapshots are stored. See below
     * 
     */
    private List<GetCloudBackupSnapshotsResultMember> members;
    /**
     * @return Version of the MongoDB server.
     * 
     */
    private String mongodVersion;
    /**
     * @return Label given to a shard or config server from which Atlas took this snapshot.
     * 
     */
    private String replicaSetName;
    /**
     * @return Unique identifiers of the snapshots created for the shards and config server for a sharded cluster.
     * 
     */
    private List<String> snapshotIds;
    /**
     * @return Specified the type of snapshot. Valid values are onDemand and scheduled.
     * 
     */
    private String snapshotType;
    /**
     * @return Current status of the snapshot. One of the following values: queued, inProgress, completed, failed.
     * 
     */
    private String status;
    /**
     * @return Specifies the size of the snapshot in bytes.
     * 
     */
    private Integer storageSizeBytes;
    /**
     * @return Specifies the type of cluster: replicaSet or shardedCluster.
     * 
     */
    private String type;

    private GetCloudBackupSnapshotsResult() {}
    /**
     * @return Cloud provider that stores this snapshot.
     * 
     */
    public String cloudProvider() {
        return this.cloudProvider;
    }
    /**
     * @return UTC ISO 8601 formatted point in time when Atlas took the snapshot.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return UDescription of the snapshot. Only present for on-demand snapshots.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
     * 
     */
    public String expiresAt() {
        return this.expiresAt;
    }
    /**
     * @return Unique identifier for the sharded cluster snapshot.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
     * 
     */
    public String masterKeyUuid() {
        return this.masterKeyUuid;
    }
    /**
     * @return Block of List of snapshots and the cloud provider where the snapshots are stored. See below
     * 
     */
    public List<GetCloudBackupSnapshotsResultMember> members() {
        return this.members;
    }
    /**
     * @return Version of the MongoDB server.
     * 
     */
    public String mongodVersion() {
        return this.mongodVersion;
    }
    /**
     * @return Label given to a shard or config server from which Atlas took this snapshot.
     * 
     */
    public String replicaSetName() {
        return this.replicaSetName;
    }
    /**
     * @return Unique identifiers of the snapshots created for the shards and config server for a sharded cluster.
     * 
     */
    public List<String> snapshotIds() {
        return this.snapshotIds;
    }
    /**
     * @return Specified the type of snapshot. Valid values are onDemand and scheduled.
     * 
     */
    public String snapshotType() {
        return this.snapshotType;
    }
    /**
     * @return Current status of the snapshot. One of the following values: queued, inProgress, completed, failed.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Specifies the size of the snapshot in bytes.
     * 
     */
    public Integer storageSizeBytes() {
        return this.storageSizeBytes;
    }
    /**
     * @return Specifies the type of cluster: replicaSet or shardedCluster.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudBackupSnapshotsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cloudProvider;
        private String createdAt;
        private String description;
        private String expiresAt;
        private String id;
        private String masterKeyUuid;
        private List<GetCloudBackupSnapshotsResultMember> members;
        private String mongodVersion;
        private String replicaSetName;
        private List<String> snapshotIds;
        private String snapshotType;
        private String status;
        private Integer storageSizeBytes;
        private String type;
        public Builder() {}
        public Builder(GetCloudBackupSnapshotsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudProvider = defaults.cloudProvider;
    	      this.createdAt = defaults.createdAt;
    	      this.description = defaults.description;
    	      this.expiresAt = defaults.expiresAt;
    	      this.id = defaults.id;
    	      this.masterKeyUuid = defaults.masterKeyUuid;
    	      this.members = defaults.members;
    	      this.mongodVersion = defaults.mongodVersion;
    	      this.replicaSetName = defaults.replicaSetName;
    	      this.snapshotIds = defaults.snapshotIds;
    	      this.snapshotType = defaults.snapshotType;
    	      this.status = defaults.status;
    	      this.storageSizeBytes = defaults.storageSizeBytes;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder cloudProvider(String cloudProvider) {
            this.cloudProvider = Objects.requireNonNull(cloudProvider);
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = Objects.requireNonNull(expiresAt);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder masterKeyUuid(String masterKeyUuid) {
            this.masterKeyUuid = Objects.requireNonNull(masterKeyUuid);
            return this;
        }
        @CustomType.Setter
        public Builder members(List<GetCloudBackupSnapshotsResultMember> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(GetCloudBackupSnapshotsResultMember... members) {
            return members(List.of(members));
        }
        @CustomType.Setter
        public Builder mongodVersion(String mongodVersion) {
            this.mongodVersion = Objects.requireNonNull(mongodVersion);
            return this;
        }
        @CustomType.Setter
        public Builder replicaSetName(String replicaSetName) {
            this.replicaSetName = Objects.requireNonNull(replicaSetName);
            return this;
        }
        @CustomType.Setter
        public Builder snapshotIds(List<String> snapshotIds) {
            this.snapshotIds = Objects.requireNonNull(snapshotIds);
            return this;
        }
        public Builder snapshotIds(String... snapshotIds) {
            return snapshotIds(List.of(snapshotIds));
        }
        @CustomType.Setter
        public Builder snapshotType(String snapshotType) {
            this.snapshotType = Objects.requireNonNull(snapshotType);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder storageSizeBytes(Integer storageSizeBytes) {
            this.storageSizeBytes = Objects.requireNonNull(storageSizeBytes);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetCloudBackupSnapshotsResult build() {
            final var o = new GetCloudBackupSnapshotsResult();
            o.cloudProvider = cloudProvider;
            o.createdAt = createdAt;
            o.description = description;
            o.expiresAt = expiresAt;
            o.id = id;
            o.masterKeyUuid = masterKeyUuid;
            o.members = members;
            o.mongodVersion = mongodVersion;
            o.replicaSetName = replicaSetName;
            o.snapshotIds = snapshotIds;
            o.snapshotType = snapshotType;
            o.status = status;
            o.storageSizeBytes = storageSizeBytes;
            o.type = type;
            return o;
        }
    }
}