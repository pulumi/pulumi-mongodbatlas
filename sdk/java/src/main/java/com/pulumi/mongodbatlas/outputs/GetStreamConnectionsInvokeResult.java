// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetStreamConnectionsResult;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStreamConnectionsInvokeResult {
    private String id;
    /**
     * @return Human-readable label that identifies the stream instance.
     * 
     */
    private String instanceName;
    private @Nullable Integer itemsPerPage;
    private @Nullable Integer pageNum;
    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    private String projectId;
    /**
     * @return A list where each element contains a stream connection.
     * 
     */
    private List<GetStreamConnectionsResult> results;
    /**
     * @return Count of the total number of items in the result set. The count might be greater than the number of objects in the results array if the entire result set is paginated.
     * 
     */
    private Integer totalCount;

    private GetStreamConnectionsInvokeResult() {}
    public String id() {
        return this.id;
    }
    /**
     * @return Human-readable label that identifies the stream instance.
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }
    public Optional<Integer> itemsPerPage() {
        return Optional.ofNullable(this.itemsPerPage);
    }
    public Optional<Integer> pageNum() {
        return Optional.ofNullable(this.pageNum);
    }
    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return A list where each element contains a stream connection.
     * 
     */
    public List<GetStreamConnectionsResult> results() {
        return this.results;
    }
    /**
     * @return Count of the total number of items in the result set. The count might be greater than the number of objects in the results array if the entire result set is paginated.
     * 
     */
    public Integer totalCount() {
        return this.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamConnectionsInvokeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String instanceName;
        private @Nullable Integer itemsPerPage;
        private @Nullable Integer pageNum;
        private String projectId;
        private List<GetStreamConnectionsResult> results;
        private Integer totalCount;
        public Builder() {}
        public Builder(GetStreamConnectionsInvokeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.instanceName = defaults.instanceName;
    	      this.itemsPerPage = defaults.itemsPerPage;
    	      this.pageNum = defaults.pageNum;
    	      this.projectId = defaults.projectId;
    	      this.results = defaults.results;
    	      this.totalCount = defaults.totalCount;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionsInvokeResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceName(String instanceName) {
            if (instanceName == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionsInvokeResult", "instanceName");
            }
            this.instanceName = instanceName;
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
              throw new MissingRequiredPropertyException("GetStreamConnectionsInvokeResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder results(List<GetStreamConnectionsResult> results) {
            if (results == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionsInvokeResult", "results");
            }
            this.results = results;
            return this;
        }
        public Builder results(GetStreamConnectionsResult... results) {
            return results(List.of(results));
        }
        @CustomType.Setter
        public Builder totalCount(Integer totalCount) {
            if (totalCount == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionsInvokeResult", "totalCount");
            }
            this.totalCount = totalCount;
            return this;
        }
        public GetStreamConnectionsInvokeResult build() {
            final var _resultValue = new GetStreamConnectionsInvokeResult();
            _resultValue.id = id;
            _resultValue.instanceName = instanceName;
            _resultValue.itemsPerPage = itemsPerPage;
            _resultValue.pageNum = pageNum;
            _resultValue.projectId = projectId;
            _resultValue.results = results;
            _resultValue.totalCount = totalCount;
            return _resultValue;
        }
    }
}