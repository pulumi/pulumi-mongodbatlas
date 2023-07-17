// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetDataLakePipelineRunsResultStat;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDataLakePipelineRunsResult {
    /**
     * @return Backup schedule interval of the Data Lake Pipeline.
     * 
     */
    private String backupFrequencyType;
    /**
     * @return Timestamp that indicates when the pipeline run was created.
     * 
     */
    private String createdDate;
    /**
     * @return Unique 24-hexadecimal character string that identifies a Data Lake Pipeline run.
     * 
     */
    private String id;
    /**
     * @return Unique 24-hexadecimal character string that identifies a Data Lake Pipeline run.
     * 
     */
    private String lastUpdatedDate;
    /**
     * @return Processing phase of the Data Lake Pipeline.
     * 
     */
    private String phase;
    /**
     * @return Unique 24-hexadecimal character string that identifies a Data Lake Pipeline.
     * 
     */
    private String pipelineId;
    /**
     * @return Unique 24-hexadecimal character string that identifies a Data Lake Pipeline run.
     * 
     */
    private String pipelineRunId;
    /**
     * @return Unique 24-hexadecimal character string that identifies the snapshot of a cluster.
     * 
     */
    private String snapshotId;
    /**
     * @return State of the pipeline run.
     * 
     */
    private String state;
    /**
     * @return Runtime statistics for this Data Lake Pipeline run.
     * 
     */
    private List<GetDataLakePipelineRunsResultStat> stats;

    private GetDataLakePipelineRunsResult() {}
    /**
     * @return Backup schedule interval of the Data Lake Pipeline.
     * 
     */
    public String backupFrequencyType() {
        return this.backupFrequencyType;
    }
    /**
     * @return Timestamp that indicates when the pipeline run was created.
     * 
     */
    public String createdDate() {
        return this.createdDate;
    }
    /**
     * @return Unique 24-hexadecimal character string that identifies a Data Lake Pipeline run.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Unique 24-hexadecimal character string that identifies a Data Lake Pipeline run.
     * 
     */
    public String lastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    /**
     * @return Processing phase of the Data Lake Pipeline.
     * 
     */
    public String phase() {
        return this.phase;
    }
    /**
     * @return Unique 24-hexadecimal character string that identifies a Data Lake Pipeline.
     * 
     */
    public String pipelineId() {
        return this.pipelineId;
    }
    /**
     * @return Unique 24-hexadecimal character string that identifies a Data Lake Pipeline run.
     * 
     */
    public String pipelineRunId() {
        return this.pipelineRunId;
    }
    /**
     * @return Unique 24-hexadecimal character string that identifies the snapshot of a cluster.
     * 
     */
    public String snapshotId() {
        return this.snapshotId;
    }
    /**
     * @return State of the pipeline run.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Runtime statistics for this Data Lake Pipeline run.
     * 
     */
    public List<GetDataLakePipelineRunsResultStat> stats() {
        return this.stats;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataLakePipelineRunsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String backupFrequencyType;
        private String createdDate;
        private String id;
        private String lastUpdatedDate;
        private String phase;
        private String pipelineId;
        private String pipelineRunId;
        private String snapshotId;
        private String state;
        private List<GetDataLakePipelineRunsResultStat> stats;
        public Builder() {}
        public Builder(GetDataLakePipelineRunsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupFrequencyType = defaults.backupFrequencyType;
    	      this.createdDate = defaults.createdDate;
    	      this.id = defaults.id;
    	      this.lastUpdatedDate = defaults.lastUpdatedDate;
    	      this.phase = defaults.phase;
    	      this.pipelineId = defaults.pipelineId;
    	      this.pipelineRunId = defaults.pipelineRunId;
    	      this.snapshotId = defaults.snapshotId;
    	      this.state = defaults.state;
    	      this.stats = defaults.stats;
        }

        @CustomType.Setter
        public Builder backupFrequencyType(String backupFrequencyType) {
            this.backupFrequencyType = Objects.requireNonNull(backupFrequencyType);
            return this;
        }
        @CustomType.Setter
        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder lastUpdatedDate(String lastUpdatedDate) {
            this.lastUpdatedDate = Objects.requireNonNull(lastUpdatedDate);
            return this;
        }
        @CustomType.Setter
        public Builder phase(String phase) {
            this.phase = Objects.requireNonNull(phase);
            return this;
        }
        @CustomType.Setter
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = Objects.requireNonNull(pipelineId);
            return this;
        }
        @CustomType.Setter
        public Builder pipelineRunId(String pipelineRunId) {
            this.pipelineRunId = Objects.requireNonNull(pipelineRunId);
            return this;
        }
        @CustomType.Setter
        public Builder snapshotId(String snapshotId) {
            this.snapshotId = Objects.requireNonNull(snapshotId);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder stats(List<GetDataLakePipelineRunsResultStat> stats) {
            this.stats = Objects.requireNonNull(stats);
            return this;
        }
        public Builder stats(GetDataLakePipelineRunsResultStat... stats) {
            return stats(List.of(stats));
        }
        public GetDataLakePipelineRunsResult build() {
            final var o = new GetDataLakePipelineRunsResult();
            o.backupFrequencyType = backupFrequencyType;
            o.createdDate = createdDate;
            o.id = id;
            o.lastUpdatedDate = lastUpdatedDate;
            o.phase = phase;
            o.pipelineId = pipelineId;
            o.pipelineRunId = pipelineRunId;
            o.snapshotId = snapshotId;
            o.state = state;
            o.stats = stats;
            return o;
        }
    }
}