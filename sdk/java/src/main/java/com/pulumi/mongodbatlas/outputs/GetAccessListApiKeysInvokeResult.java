// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetAccessListApiKeysResult;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccessListApiKeysInvokeResult {
    private String apiKeyId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable Integer itemsPerPage;
    private String orgId;
    private @Nullable Integer pageNum;
    private List<GetAccessListApiKeysResult> results;

    private GetAccessListApiKeysInvokeResult() {}
    public String apiKeyId() {
        return this.apiKeyId;
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
    public String orgId() {
        return this.orgId;
    }
    public Optional<Integer> pageNum() {
        return Optional.ofNullable(this.pageNum);
    }
    public List<GetAccessListApiKeysResult> results() {
        return this.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessListApiKeysInvokeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiKeyId;
        private String id;
        private @Nullable Integer itemsPerPage;
        private String orgId;
        private @Nullable Integer pageNum;
        private List<GetAccessListApiKeysResult> results;
        public Builder() {}
        public Builder(GetAccessListApiKeysInvokeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeyId = defaults.apiKeyId;
    	      this.id = defaults.id;
    	      this.itemsPerPage = defaults.itemsPerPage;
    	      this.orgId = defaults.orgId;
    	      this.pageNum = defaults.pageNum;
    	      this.results = defaults.results;
        }

        @CustomType.Setter
        public Builder apiKeyId(String apiKeyId) {
            this.apiKeyId = Objects.requireNonNull(apiKeyId);
            return this;
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
        public Builder orgId(String orgId) {
            this.orgId = Objects.requireNonNull(orgId);
            return this;
        }
        @CustomType.Setter
        public Builder pageNum(@Nullable Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        @CustomType.Setter
        public Builder results(List<GetAccessListApiKeysResult> results) {
            this.results = Objects.requireNonNull(results);
            return this;
        }
        public Builder results(GetAccessListApiKeysResult... results) {
            return results(List.of(results));
        }
        public GetAccessListApiKeysInvokeResult build() {
            final var o = new GetAccessListApiKeysInvokeResult();
            o.apiKeyId = apiKeyId;
            o.id = id;
            o.itemsPerPage = itemsPerPage;
            o.orgId = orgId;
            o.pageNum = pageNum;
            o.results = results;
            return o;
        }
    }
}