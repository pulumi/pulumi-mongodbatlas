// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetOnlineArchivesResultCriteria;
import com.pulumi.mongodbatlas.outputs.GetOnlineArchivesResultPartitionField;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetOnlineArchivesResult {
    private String archiveId;
    /**
     * @return Name of the cluster that contains the collection.
     * 
     */
    private String clusterName;
    private String collName;
    private List<GetOnlineArchivesResultCriteria> criterias;
    private String dbName;
    private List<GetOnlineArchivesResultPartitionField> partitionFields;
    private Boolean paused;
    /**
     * @return The unique ID for the project.
     * 
     */
    private String projectId;
    private String state;

    private GetOnlineArchivesResult() {}
    public String archiveId() {
        return this.archiveId;
    }
    /**
     * @return Name of the cluster that contains the collection.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }
    public String collName() {
        return this.collName;
    }
    public List<GetOnlineArchivesResultCriteria> criterias() {
        return this.criterias;
    }
    public String dbName() {
        return this.dbName;
    }
    public List<GetOnlineArchivesResultPartitionField> partitionFields() {
        return this.partitionFields;
    }
    public Boolean paused() {
        return this.paused;
    }
    /**
     * @return The unique ID for the project.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOnlineArchivesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String archiveId;
        private String clusterName;
        private String collName;
        private List<GetOnlineArchivesResultCriteria> criterias;
        private String dbName;
        private List<GetOnlineArchivesResultPartitionField> partitionFields;
        private Boolean paused;
        private String projectId;
        private String state;
        public Builder() {}
        public Builder(GetOnlineArchivesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveId = defaults.archiveId;
    	      this.clusterName = defaults.clusterName;
    	      this.collName = defaults.collName;
    	      this.criterias = defaults.criterias;
    	      this.dbName = defaults.dbName;
    	      this.partitionFields = defaults.partitionFields;
    	      this.paused = defaults.paused;
    	      this.projectId = defaults.projectId;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder archiveId(String archiveId) {
            this.archiveId = Objects.requireNonNull(archiveId);
            return this;
        }
        @CustomType.Setter
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        @CustomType.Setter
        public Builder collName(String collName) {
            this.collName = Objects.requireNonNull(collName);
            return this;
        }
        @CustomType.Setter
        public Builder criterias(List<GetOnlineArchivesResultCriteria> criterias) {
            this.criterias = Objects.requireNonNull(criterias);
            return this;
        }
        public Builder criterias(GetOnlineArchivesResultCriteria... criterias) {
            return criterias(List.of(criterias));
        }
        @CustomType.Setter
        public Builder dbName(String dbName) {
            this.dbName = Objects.requireNonNull(dbName);
            return this;
        }
        @CustomType.Setter
        public Builder partitionFields(List<GetOnlineArchivesResultPartitionField> partitionFields) {
            this.partitionFields = Objects.requireNonNull(partitionFields);
            return this;
        }
        public Builder partitionFields(GetOnlineArchivesResultPartitionField... partitionFields) {
            return partitionFields(List.of(partitionFields));
        }
        @CustomType.Setter
        public Builder paused(Boolean paused) {
            this.paused = Objects.requireNonNull(paused);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetOnlineArchivesResult build() {
            final var o = new GetOnlineArchivesResult();
            o.archiveId = archiveId;
            o.clusterName = clusterName;
            o.collName = collName;
            o.criterias = criterias;
            o.dbName = dbName;
            o.partitionFields = partitionFields;
            o.paused = paused;
            o.projectId = projectId;
            o.state = state;
            return o;
        }
    }
}
