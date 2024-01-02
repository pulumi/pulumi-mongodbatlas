// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetCloudBackupSnapshotExportJobsResult;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCloudBackupSnapshotExportJobsInvokeResult {
    private String clusterName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable Integer itemsPerPage;
    private @Nullable Integer pageNum;
    /**
     * @return The unique identifier of the project for the Atlas cluster.
     * 
     */
    private String projectId;
    /**
     * @return Includes CloudProviderSnapshotExportJob object for each item detailed in the results array section.
     * 
     */
    private List<GetCloudBackupSnapshotExportJobsResult> results;
    private Integer totalCount;

    private GetCloudBackupSnapshotExportJobsInvokeResult() {}
    public String clusterName() {
        return this.clusterName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<Integer> itemsPerPage() {
        return Optional.ofNullable(this.itemsPerPage);
    }
    public Optional<Integer> pageNum() {
        return Optional.ofNullable(this.pageNum);
    }
    /**
     * @return The unique identifier of the project for the Atlas cluster.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Includes CloudProviderSnapshotExportJob object for each item detailed in the results array section.
     * 
     */
    public List<GetCloudBackupSnapshotExportJobsResult> results() {
        return this.results;
    }
    public Integer totalCount() {
        return this.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudBackupSnapshotExportJobsInvokeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clusterName;
        private String id;
        private @Nullable Integer itemsPerPage;
        private @Nullable Integer pageNum;
        private String projectId;
        private List<GetCloudBackupSnapshotExportJobsResult> results;
        private Integer totalCount;
        public Builder() {}
        public Builder(GetCloudBackupSnapshotExportJobsInvokeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.id = defaults.id;
    	      this.itemsPerPage = defaults.itemsPerPage;
    	      this.pageNum = defaults.pageNum;
    	      this.projectId = defaults.projectId;
    	      this.results = defaults.results;
    	      this.totalCount = defaults.totalCount;
        }

        @CustomType.Setter
        public Builder clusterName(String clusterName) {
            if (clusterName == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobsInvokeResult", "clusterName");
            }
            this.clusterName = clusterName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobsInvokeResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder itemsPerPage(@Nullable Integer itemsPerPage) {

            this.itemsPerPage = itemsPerPage;
            return this;
        }
        @CustomType.Setter
        public Builder pageNum(@Nullable Integer pageNum) {

            this.pageNum = pageNum;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobsInvokeResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder results(List<GetCloudBackupSnapshotExportJobsResult> results) {
            if (results == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobsInvokeResult", "results");
            }
            this.results = results;
            return this;
        }
        public Builder results(GetCloudBackupSnapshotExportJobsResult... results) {
            return results(List.of(results));
        }
        @CustomType.Setter
        public Builder totalCount(Integer totalCount) {
            if (totalCount == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobsInvokeResult", "totalCount");
            }
            this.totalCount = totalCount;
            return this;
        }
        public GetCloudBackupSnapshotExportJobsInvokeResult build() {
            final var _resultValue = new GetCloudBackupSnapshotExportJobsInvokeResult();
            _resultValue.clusterName = clusterName;
            _resultValue.id = id;
            _resultValue.itemsPerPage = itemsPerPage;
            _resultValue.pageNum = pageNum;
            _resultValue.projectId = projectId;
            _resultValue.results = results;
            _resultValue.totalCount = totalCount;
            return _resultValue;
        }
    }
}
