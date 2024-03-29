// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAlertConfigurationsListOptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetAlertConfigurationsListOptionArgs Empty = new GetAlertConfigurationsListOptionArgs();

    @Import(name="includeCount")
    private @Nullable Output<Boolean> includeCount;

    public Optional<Output<Boolean>> includeCount() {
        return Optional.ofNullable(this.includeCount);
    }

    @Import(name="itemsPerPage")
    private @Nullable Output<Integer> itemsPerPage;

    public Optional<Output<Integer>> itemsPerPage() {
        return Optional.ofNullable(this.itemsPerPage);
    }

    @Import(name="pageNum")
    private @Nullable Output<Integer> pageNum;

    public Optional<Output<Integer>> pageNum() {
        return Optional.ofNullable(this.pageNum);
    }

    private GetAlertConfigurationsListOptionArgs() {}

    private GetAlertConfigurationsListOptionArgs(GetAlertConfigurationsListOptionArgs $) {
        this.includeCount = $.includeCount;
        this.itemsPerPage = $.itemsPerPage;
        this.pageNum = $.pageNum;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertConfigurationsListOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertConfigurationsListOptionArgs $;

        public Builder() {
            $ = new GetAlertConfigurationsListOptionArgs();
        }

        public Builder(GetAlertConfigurationsListOptionArgs defaults) {
            $ = new GetAlertConfigurationsListOptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder includeCount(@Nullable Output<Boolean> includeCount) {
            $.includeCount = includeCount;
            return this;
        }

        public Builder includeCount(Boolean includeCount) {
            return includeCount(Output.of(includeCount));
        }

        public Builder itemsPerPage(@Nullable Output<Integer> itemsPerPage) {
            $.itemsPerPage = itemsPerPage;
            return this;
        }

        public Builder itemsPerPage(Integer itemsPerPage) {
            return itemsPerPage(Output.of(itemsPerPage));
        }

        public Builder pageNum(@Nullable Output<Integer> pageNum) {
            $.pageNum = pageNum;
            return this;
        }

        public Builder pageNum(Integer pageNum) {
            return pageNum(Output.of(pageNum));
        }

        public GetAlertConfigurationsListOptionArgs build() {
            return $;
        }
    }

}
