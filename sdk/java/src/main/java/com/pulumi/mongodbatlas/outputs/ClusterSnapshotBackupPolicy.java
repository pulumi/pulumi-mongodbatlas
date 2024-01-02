// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.ClusterSnapshotBackupPolicyPolicy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterSnapshotBackupPolicy {
    /**
     * @return The cluster ID.
     * 
     */
    private @Nullable String clusterId;
    private @Nullable String clusterName;
    private @Nullable String nextSnapshot;
    private @Nullable List<ClusterSnapshotBackupPolicyPolicy> policies;
    private @Nullable Integer referenceHourOfDay;
    private @Nullable Integer referenceMinuteOfHour;
    private @Nullable Integer restoreWindowDays;
    private @Nullable Boolean updateSnapshots;

    private ClusterSnapshotBackupPolicy() {}
    /**
     * @return The cluster ID.
     * 
     */
    public Optional<String> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }
    public Optional<String> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }
    public Optional<String> nextSnapshot() {
        return Optional.ofNullable(this.nextSnapshot);
    }
    public List<ClusterSnapshotBackupPolicyPolicy> policies() {
        return this.policies == null ? List.of() : this.policies;
    }
    public Optional<Integer> referenceHourOfDay() {
        return Optional.ofNullable(this.referenceHourOfDay);
    }
    public Optional<Integer> referenceMinuteOfHour() {
        return Optional.ofNullable(this.referenceMinuteOfHour);
    }
    public Optional<Integer> restoreWindowDays() {
        return Optional.ofNullable(this.restoreWindowDays);
    }
    public Optional<Boolean> updateSnapshots() {
        return Optional.ofNullable(this.updateSnapshots);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSnapshotBackupPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clusterId;
        private @Nullable String clusterName;
        private @Nullable String nextSnapshot;
        private @Nullable List<ClusterSnapshotBackupPolicyPolicy> policies;
        private @Nullable Integer referenceHourOfDay;
        private @Nullable Integer referenceMinuteOfHour;
        private @Nullable Integer restoreWindowDays;
        private @Nullable Boolean updateSnapshots;
        public Builder() {}
        public Builder(ClusterSnapshotBackupPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.clusterName = defaults.clusterName;
    	      this.nextSnapshot = defaults.nextSnapshot;
    	      this.policies = defaults.policies;
    	      this.referenceHourOfDay = defaults.referenceHourOfDay;
    	      this.referenceMinuteOfHour = defaults.referenceMinuteOfHour;
    	      this.restoreWindowDays = defaults.restoreWindowDays;
    	      this.updateSnapshots = defaults.updateSnapshots;
        }

        @CustomType.Setter
        public Builder clusterId(@Nullable String clusterId) {

            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder clusterName(@Nullable String clusterName) {

            this.clusterName = clusterName;
            return this;
        }
        @CustomType.Setter
        public Builder nextSnapshot(@Nullable String nextSnapshot) {

            this.nextSnapshot = nextSnapshot;
            return this;
        }
        @CustomType.Setter
        public Builder policies(@Nullable List<ClusterSnapshotBackupPolicyPolicy> policies) {

            this.policies = policies;
            return this;
        }
        public Builder policies(ClusterSnapshotBackupPolicyPolicy... policies) {
            return policies(List.of(policies));
        }
        @CustomType.Setter
        public Builder referenceHourOfDay(@Nullable Integer referenceHourOfDay) {

            this.referenceHourOfDay = referenceHourOfDay;
            return this;
        }
        @CustomType.Setter
        public Builder referenceMinuteOfHour(@Nullable Integer referenceMinuteOfHour) {

            this.referenceMinuteOfHour = referenceMinuteOfHour;
            return this;
        }
        @CustomType.Setter
        public Builder restoreWindowDays(@Nullable Integer restoreWindowDays) {

            this.restoreWindowDays = restoreWindowDays;
            return this;
        }
        @CustomType.Setter
        public Builder updateSnapshots(@Nullable Boolean updateSnapshots) {

            this.updateSnapshots = updateSnapshots;
            return this;
        }
        public ClusterSnapshotBackupPolicy build() {
            final var _resultValue = new ClusterSnapshotBackupPolicy();
            _resultValue.clusterId = clusterId;
            _resultValue.clusterName = clusterName;
            _resultValue.nextSnapshot = nextSnapshot;
            _resultValue.policies = policies;
            _resultValue.referenceHourOfDay = referenceHourOfDay;
            _resultValue.referenceMinuteOfHour = referenceMinuteOfHour;
            _resultValue.restoreWindowDays = restoreWindowDays;
            _resultValue.updateSnapshots = updateSnapshots;
            return _resultValue;
        }
    }
}
