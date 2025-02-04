// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloudBackupScheduleExport {
    /**
     * @return Unique identifier of the mongodbatlas.CloudBackupSnapshotExportBucket export_bucket_id value.
     * 
     */
    private @Nullable String exportBucketId;
    /**
     * @return Frequency associated with the export snapshot item: `weekly`, `monthly`, `yearly`, `daily` (requires reaching out to Customer Support)
     * 
     */
    private @Nullable String frequencyType;

    private CloudBackupScheduleExport() {}
    /**
     * @return Unique identifier of the mongodbatlas.CloudBackupSnapshotExportBucket export_bucket_id value.
     * 
     */
    public Optional<String> exportBucketId() {
        return Optional.ofNullable(this.exportBucketId);
    }
    /**
     * @return Frequency associated with the export snapshot item: `weekly`, `monthly`, `yearly`, `daily` (requires reaching out to Customer Support)
     * 
     */
    public Optional<String> frequencyType() {
        return Optional.ofNullable(this.frequencyType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudBackupScheduleExport defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String exportBucketId;
        private @Nullable String frequencyType;
        public Builder() {}
        public Builder(CloudBackupScheduleExport defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exportBucketId = defaults.exportBucketId;
    	      this.frequencyType = defaults.frequencyType;
        }

        @CustomType.Setter
        public Builder exportBucketId(@Nullable String exportBucketId) {

            this.exportBucketId = exportBucketId;
            return this;
        }
        @CustomType.Setter
        public Builder frequencyType(@Nullable String frequencyType) {

            this.frequencyType = frequencyType;
            return this;
        }
        public CloudBackupScheduleExport build() {
            final var _resultValue = new CloudBackupScheduleExport();
            _resultValue.exportBucketId = exportBucketId;
            _resultValue.frequencyType = frequencyType;
            return _resultValue;
        }
    }
}
