// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetProjectsResult;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetProjectsInvokeResult {
    /**
     * @deprecated
     * Please use each project&#39;s id attribute instead
     * 
     */
    @Deprecated /* Please use each project's id attribute instead */
    private String id;
    private @Nullable Integer itemsPerPage;
    private @Nullable Integer pageNum;
    private List<GetProjectsResult> results;
    private Integer totalCount;

    private GetProjectsInvokeResult() {}
    /**
     * @deprecated
     * Please use each project&#39;s id attribute instead
     * 
     */
    @Deprecated /* Please use each project's id attribute instead */
    public String id() {
        return this.id;
    }
    public Optional<Integer> itemsPerPage() {
        return Optional.ofNullable(this.itemsPerPage);
    }
    public Optional<Integer> pageNum() {
        return Optional.ofNullable(this.pageNum);
    }
    public List<GetProjectsResult> results() {
        return this.results;
    }
    public Integer totalCount() {
        return this.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectsInvokeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable Integer itemsPerPage;
        private @Nullable Integer pageNum;
        private List<GetProjectsResult> results;
        private Integer totalCount;
        public Builder() {}
        public Builder(GetProjectsInvokeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.itemsPerPage = defaults.itemsPerPage;
    	      this.pageNum = defaults.pageNum;
    	      this.results = defaults.results;
    	      this.totalCount = defaults.totalCount;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
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
        public Builder results(List<GetProjectsResult> results) {
            this.results = Objects.requireNonNull(results);
            return this;
        }
        public Builder results(GetProjectsResult... results) {
            return results(List.of(results));
        }
        @CustomType.Setter
        public Builder totalCount(Integer totalCount) {
            this.totalCount = Objects.requireNonNull(totalCount);
            return this;
        }
        public GetProjectsInvokeResult build() {
            final var _resultValue = new GetProjectsInvokeResult();
            _resultValue.id = id;
            _resultValue.itemsPerPage = itemsPerPage;
            _resultValue.pageNum = pageNum;
            _resultValue.results = results;
            _resultValue.totalCount = totalCount;
            return _resultValue;
        }
    }
}
