// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetApiKeysResult;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApiKeysInvokeResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable Integer itemsPerPage;
    private String orgId;
    private @Nullable Integer pageNum;
    private List<GetApiKeysResult> results;

    private GetApiKeysInvokeResult() {}
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
    public String orgId() {
        return this.orgId;
    }
    public Optional<Integer> pageNum() {
        return Optional.ofNullable(this.pageNum);
    }
    public List<GetApiKeysResult> results() {
        return this.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiKeysInvokeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable Integer itemsPerPage;
        private String orgId;
        private @Nullable Integer pageNum;
        private List<GetApiKeysResult> results;
        public Builder() {}
        public Builder(GetApiKeysInvokeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.itemsPerPage = defaults.itemsPerPage;
    	      this.orgId = defaults.orgId;
    	      this.pageNum = defaults.pageNum;
    	      this.results = defaults.results;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetApiKeysInvokeResult", "id");
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
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetApiKeysInvokeResult", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder pageNum(@Nullable Integer pageNum) {

            this.pageNum = pageNum;
            return this;
        }
        @CustomType.Setter
        public Builder results(List<GetApiKeysResult> results) {
            if (results == null) {
              throw new MissingRequiredPropertyException("GetApiKeysInvokeResult", "results");
            }
            this.results = results;
            return this;
        }
        public Builder results(GetApiKeysResult... results) {
            return results(List.of(results));
        }
        public GetApiKeysInvokeResult build() {
            final var _resultValue = new GetApiKeysInvokeResult();
            _resultValue.id = id;
            _resultValue.itemsPerPage = itemsPerPage;
            _resultValue.orgId = orgId;
            _resultValue.pageNum = pageNum;
            _resultValue.results = results;
            return _resultValue;
        }
    }
}
