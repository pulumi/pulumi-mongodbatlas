// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.inputs.GetAlertConfigurationsListOptionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAlertConfigurationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAlertConfigurationsArgs Empty = new GetAlertConfigurationsArgs();

    /**
     * Arguments that dictate how many and which results are returned by the data source
     * * `list_options.page_num` - Which page of results to retrieve (default to first page)
     * * `list_options.items_per_page` - How many alerts to retrieve per page (default 100)
     * * `list_options.include_count` - Whether to include total count of results in the response (default false)
     * 
     */
    @Import(name="listOptions")
    private @Nullable Output<List<GetAlertConfigurationsListOptionArgs>> listOptions;

    /**
     * @return Arguments that dictate how many and which results are returned by the data source
     * * `list_options.page_num` - Which page of results to retrieve (default to first page)
     * * `list_options.items_per_page` - How many alerts to retrieve per page (default 100)
     * * `list_options.include_count` - Whether to include total count of results in the response (default false)
     * 
     */
    public Optional<Output<List<GetAlertConfigurationsListOptionArgs>>> listOptions() {
        return Optional.ofNullable(this.listOptions);
    }

    /**
     * List of requested string formatted output to be included on each individual result. Options are `resource_hcl` and `resource_import`. Available to make it easy to gather resource statements for existing alert configurations, and corresponding import statements to import said resource state into the statefile.
     * 
     */
    @Import(name="outputTypes")
    private @Nullable Output<List<String>> outputTypes;

    /**
     * @return List of requested string formatted output to be included on each individual result. Options are `resource_hcl` and `resource_import`. Available to make it easy to gather resource statements for existing alert configurations, and corresponding import statements to import said resource state into the statefile.
     * 
     */
    public Optional<Output<List<String>>> outputTypes() {
        return Optional.ofNullable(this.outputTypes);
    }

    /**
     * The unique ID for the project to get the alert configurations.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The unique ID for the project to get the alert configurations.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private GetAlertConfigurationsArgs() {}

    private GetAlertConfigurationsArgs(GetAlertConfigurationsArgs $) {
        this.listOptions = $.listOptions;
        this.outputTypes = $.outputTypes;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertConfigurationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertConfigurationsArgs $;

        public Builder() {
            $ = new GetAlertConfigurationsArgs();
        }

        public Builder(GetAlertConfigurationsArgs defaults) {
            $ = new GetAlertConfigurationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param listOptions Arguments that dictate how many and which results are returned by the data source
         * * `list_options.page_num` - Which page of results to retrieve (default to first page)
         * * `list_options.items_per_page` - How many alerts to retrieve per page (default 100)
         * * `list_options.include_count` - Whether to include total count of results in the response (default false)
         * 
         * @return builder
         * 
         */
        public Builder listOptions(@Nullable Output<List<GetAlertConfigurationsListOptionArgs>> listOptions) {
            $.listOptions = listOptions;
            return this;
        }

        /**
         * @param listOptions Arguments that dictate how many and which results are returned by the data source
         * * `list_options.page_num` - Which page of results to retrieve (default to first page)
         * * `list_options.items_per_page` - How many alerts to retrieve per page (default 100)
         * * `list_options.include_count` - Whether to include total count of results in the response (default false)
         * 
         * @return builder
         * 
         */
        public Builder listOptions(List<GetAlertConfigurationsListOptionArgs> listOptions) {
            return listOptions(Output.of(listOptions));
        }

        /**
         * @param listOptions Arguments that dictate how many and which results are returned by the data source
         * * `list_options.page_num` - Which page of results to retrieve (default to first page)
         * * `list_options.items_per_page` - How many alerts to retrieve per page (default 100)
         * * `list_options.include_count` - Whether to include total count of results in the response (default false)
         * 
         * @return builder
         * 
         */
        public Builder listOptions(GetAlertConfigurationsListOptionArgs... listOptions) {
            return listOptions(List.of(listOptions));
        }

        /**
         * @param outputTypes List of requested string formatted output to be included on each individual result. Options are `resource_hcl` and `resource_import`. Available to make it easy to gather resource statements for existing alert configurations, and corresponding import statements to import said resource state into the statefile.
         * 
         * @return builder
         * 
         */
        public Builder outputTypes(@Nullable Output<List<String>> outputTypes) {
            $.outputTypes = outputTypes;
            return this;
        }

        /**
         * @param outputTypes List of requested string formatted output to be included on each individual result. Options are `resource_hcl` and `resource_import`. Available to make it easy to gather resource statements for existing alert configurations, and corresponding import statements to import said resource state into the statefile.
         * 
         * @return builder
         * 
         */
        public Builder outputTypes(List<String> outputTypes) {
            return outputTypes(Output.of(outputTypes));
        }

        /**
         * @param outputTypes List of requested string formatted output to be included on each individual result. Options are `resource_hcl` and `resource_import`. Available to make it easy to gather resource statements for existing alert configurations, and corresponding import statements to import said resource state into the statefile.
         * 
         * @return builder
         * 
         */
        public Builder outputTypes(String... outputTypes) {
            return outputTypes(List.of(outputTypes));
        }

        /**
         * @param projectId The unique ID for the project to get the alert configurations.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique ID for the project to get the alert configurations.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetAlertConfigurationsArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetAlertConfigurationsArgs", "projectId");
            }
            return $;
        }
    }

}
