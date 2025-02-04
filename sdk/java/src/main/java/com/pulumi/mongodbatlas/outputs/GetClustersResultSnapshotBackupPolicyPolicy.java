// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetClustersResultSnapshotBackupPolicyPolicyPolicyItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClustersResultSnapshotBackupPolicyPolicy {
    /**
     * @return Unique identifer of the replication document for a zone in a Global Cluster. This value corresponds to the legacy sharding schema (no independent shard scaling) and is different from the Shard ID you may see in the Atlas UI.
     * 
     */
    private String id;
    private List<GetClustersResultSnapshotBackupPolicyPolicyPolicyItem> policyItems;

    private GetClustersResultSnapshotBackupPolicyPolicy() {}
    /**
     * @return Unique identifer of the replication document for a zone in a Global Cluster. This value corresponds to the legacy sharding schema (no independent shard scaling) and is different from the Shard ID you may see in the Atlas UI.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetClustersResultSnapshotBackupPolicyPolicyPolicyItem> policyItems() {
        return this.policyItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClustersResultSnapshotBackupPolicyPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetClustersResultSnapshotBackupPolicyPolicyPolicyItem> policyItems;
        public Builder() {}
        public Builder(GetClustersResultSnapshotBackupPolicyPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.policyItems = defaults.policyItems;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetClustersResultSnapshotBackupPolicyPolicy", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder policyItems(List<GetClustersResultSnapshotBackupPolicyPolicyPolicyItem> policyItems) {
            if (policyItems == null) {
              throw new MissingRequiredPropertyException("GetClustersResultSnapshotBackupPolicyPolicy", "policyItems");
            }
            this.policyItems = policyItems;
            return this;
        }
        public Builder policyItems(GetClustersResultSnapshotBackupPolicyPolicyPolicyItem... policyItems) {
            return policyItems(List.of(policyItems));
        }
        public GetClustersResultSnapshotBackupPolicyPolicy build() {
            final var _resultValue = new GetClustersResultSnapshotBackupPolicyPolicy();
            _resultValue.id = id;
            _resultValue.policyItems = policyItems;
            return _resultValue;
        }
    }
}
