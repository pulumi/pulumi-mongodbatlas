// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetDataLakePipelinesResultSink;
import com.pulumi.mongodbatlas.outputs.GetDataLakePipelinesResultSource;
import com.pulumi.mongodbatlas.outputs.GetDataLakePipelinesResultTransformation;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDataLakePipelinesResult {
    /**
     * @return Timestamp that indicates when the Data Lake Pipeline was created.
     * 
     */
    private String createdDate;
    /**
     * @return Unique 24-hexadecimal digit string that identifies the Data Lake Pipeline.
     * 
     */
    private String id;
    /**
     * @return Timestamp that indicates the last time that the Data Lake Pipeline was updated.
     * 
     */
    private String lastUpdatedDate;
    private String name;
    /**
     * @return The unique ID for the project to create a data lake pipeline.
     * 
     */
    private String projectId;
    private List<GetDataLakePipelinesResultSink> sinks;
    private List<GetDataLakePipelinesResultSource> sources;
    /**
     * @return State of this Data Lake Pipeline.
     * 
     */
    private String state;
    /**
     * @return Fields to be excluded for this Data Lake Pipeline.
     * * `transformations.#.field` - Key in the document.
     * * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
     * 
     */
    private List<GetDataLakePipelinesResultTransformation> transformations;

    private GetDataLakePipelinesResult() {}
    /**
     * @return Timestamp that indicates when the Data Lake Pipeline was created.
     * 
     */
    public String createdDate() {
        return this.createdDate;
    }
    /**
     * @return Unique 24-hexadecimal digit string that identifies the Data Lake Pipeline.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Timestamp that indicates the last time that the Data Lake Pipeline was updated.
     * 
     */
    public String lastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The unique ID for the project to create a data lake pipeline.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    public List<GetDataLakePipelinesResultSink> sinks() {
        return this.sinks;
    }
    public List<GetDataLakePipelinesResultSource> sources() {
        return this.sources;
    }
    /**
     * @return State of this Data Lake Pipeline.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Fields to be excluded for this Data Lake Pipeline.
     * * `transformations.#.field` - Key in the document.
     * * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
     * 
     */
    public List<GetDataLakePipelinesResultTransformation> transformations() {
        return this.transformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataLakePipelinesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdDate;
        private String id;
        private String lastUpdatedDate;
        private String name;
        private String projectId;
        private List<GetDataLakePipelinesResultSink> sinks;
        private List<GetDataLakePipelinesResultSource> sources;
        private String state;
        private List<GetDataLakePipelinesResultTransformation> transformations;
        public Builder() {}
        public Builder(GetDataLakePipelinesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdDate = defaults.createdDate;
    	      this.id = defaults.id;
    	      this.lastUpdatedDate = defaults.lastUpdatedDate;
    	      this.name = defaults.name;
    	      this.projectId = defaults.projectId;
    	      this.sinks = defaults.sinks;
    	      this.sources = defaults.sources;
    	      this.state = defaults.state;
    	      this.transformations = defaults.transformations;
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
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder sinks(List<GetDataLakePipelinesResultSink> sinks) {
            this.sinks = Objects.requireNonNull(sinks);
            return this;
        }
        public Builder sinks(GetDataLakePipelinesResultSink... sinks) {
            return sinks(List.of(sinks));
        }
        @CustomType.Setter
        public Builder sources(List<GetDataLakePipelinesResultSource> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }
        public Builder sources(GetDataLakePipelinesResultSource... sources) {
            return sources(List.of(sources));
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder transformations(List<GetDataLakePipelinesResultTransformation> transformations) {
            this.transformations = Objects.requireNonNull(transformations);
            return this;
        }
        public Builder transformations(GetDataLakePipelinesResultTransformation... transformations) {
            return transformations(List.of(transformations));
        }
        public GetDataLakePipelinesResult build() {
            final var o = new GetDataLakePipelinesResult();
            o.createdDate = createdDate;
            o.id = id;
            o.lastUpdatedDate = lastUpdatedDate;
            o.name = name;
            o.projectId = projectId;
            o.sinks = sinks;
            o.sources = sources;
            o.state = state;
            o.transformations = transformations;
            return o;
        }
    }
}
