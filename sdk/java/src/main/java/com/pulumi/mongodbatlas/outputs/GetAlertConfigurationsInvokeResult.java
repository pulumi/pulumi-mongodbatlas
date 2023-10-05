// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetAlertConfigurationsListOption;
import com.pulumi.mongodbatlas.outputs.GetAlertConfigurationsResult;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetAlertConfigurationsInvokeResult {
    private String id;
    private @Nullable List<GetAlertConfigurationsListOption> listOptions;
    private @Nullable List<String> outputTypes;
    /**
     * @return The ID of the project where the alert configuration exists
     * 
     */
    private String projectId;
    /**
     * @return A list of alert configurations for the project_id, constrained by the `list_options`.
     * 
     */
    private List<GetAlertConfigurationsResult> results;
    /**
     * @return Total count of results
     * 
     */
    private Integer totalCount;

    private GetAlertConfigurationsInvokeResult() {}
    public String id() {
        return this.id;
    }
    public List<GetAlertConfigurationsListOption> listOptions() {
        return this.listOptions == null ? List.of() : this.listOptions;
    }
    public List<String> outputTypes() {
        return this.outputTypes == null ? List.of() : this.outputTypes;
    }
    /**
     * @return The ID of the project where the alert configuration exists
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return A list of alert configurations for the project_id, constrained by the `list_options`.
     * 
     */
    public List<GetAlertConfigurationsResult> results() {
        return this.results;
    }
    /**
     * @return Total count of results
     * 
     */
    public Integer totalCount() {
        return this.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertConfigurationsInvokeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable List<GetAlertConfigurationsListOption> listOptions;
        private @Nullable List<String> outputTypes;
        private String projectId;
        private List<GetAlertConfigurationsResult> results;
        private Integer totalCount;
        public Builder() {}
        public Builder(GetAlertConfigurationsInvokeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.listOptions = defaults.listOptions;
    	      this.outputTypes = defaults.outputTypes;
    	      this.projectId = defaults.projectId;
    	      this.results = defaults.results;
    	      this.totalCount = defaults.totalCount;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder listOptions(@Nullable List<GetAlertConfigurationsListOption> listOptions) {
            this.listOptions = listOptions;
            return this;
        }
        public Builder listOptions(GetAlertConfigurationsListOption... listOptions) {
            return listOptions(List.of(listOptions));
        }
        @CustomType.Setter
        public Builder outputTypes(@Nullable List<String> outputTypes) {
            this.outputTypes = outputTypes;
            return this;
        }
        public Builder outputTypes(String... outputTypes) {
            return outputTypes(List.of(outputTypes));
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder results(List<GetAlertConfigurationsResult> results) {
            this.results = Objects.requireNonNull(results);
            return this;
        }
        public Builder results(GetAlertConfigurationsResult... results) {
            return results(List.of(results));
        }
        @CustomType.Setter
        public Builder totalCount(Integer totalCount) {
            this.totalCount = Objects.requireNonNull(totalCount);
            return this;
        }
        public GetAlertConfigurationsInvokeResult build() {
            final var o = new GetAlertConfigurationsInvokeResult();
            o.id = id;
            o.listOptions = listOptions;
            o.outputTypes = outputTypes;
            o.projectId = projectId;
            o.results = results;
            o.totalCount = totalCount;
            return o;
        }
    }
}
