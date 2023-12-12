// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.ClusterSnapshotBackupPolicyPolicyPolicyItem;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterSnapshotBackupPolicyPolicy {
    /**
     * @return Unique identifer of the replication document for a zone in a Global Cluster.
     * 
     */
    private @Nullable String id;
    private @Nullable List<ClusterSnapshotBackupPolicyPolicyPolicyItem> policyItems;

    private ClusterSnapshotBackupPolicyPolicy() {}
    /**
     * @return Unique identifer of the replication document for a zone in a Global Cluster.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public List<ClusterSnapshotBackupPolicyPolicyPolicyItem> policyItems() {
        return this.policyItems == null ? List.of() : this.policyItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSnapshotBackupPolicyPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private @Nullable List<ClusterSnapshotBackupPolicyPolicyPolicyItem> policyItems;
        public Builder() {}
        public Builder(ClusterSnapshotBackupPolicyPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.policyItems = defaults.policyItems;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder policyItems(@Nullable List<ClusterSnapshotBackupPolicyPolicyPolicyItem> policyItems) {
            this.policyItems = policyItems;
            return this;
        }
        public Builder policyItems(ClusterSnapshotBackupPolicyPolicyPolicyItem... policyItems) {
            return policyItems(List.of(policyItems));
        }
        public ClusterSnapshotBackupPolicyPolicy build() {
            final var _resultValue = new ClusterSnapshotBackupPolicyPolicy();
            _resultValue.id = id;
            _resultValue.policyItems = policyItems;
            return _resultValue;
        }
    }
}
