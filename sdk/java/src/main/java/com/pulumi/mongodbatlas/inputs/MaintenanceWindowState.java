// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MaintenanceWindowState extends com.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowState Empty = new MaintenanceWindowState();

    /**
     * Defer any scheduled maintenance for the given project for one week.
     * 
     */
    @Import(name="autoDefer")
    private @Nullable Output<Boolean> autoDefer;

    /**
     * @return Defer any scheduled maintenance for the given project for one week.
     * 
     */
    public Optional<Output<Boolean>> autoDefer() {
        return Optional.ofNullable(this.autoDefer);
    }

    @Import(name="autoDeferOnceEnabled")
    private @Nullable Output<Boolean> autoDeferOnceEnabled;

    public Optional<Output<Boolean>> autoDeferOnceEnabled() {
        return Optional.ofNullable(this.autoDeferOnceEnabled);
    }

    /**
     * Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
     * 
     */
    @Import(name="dayOfWeek")
    private @Nullable Output<Integer> dayOfWeek;

    /**
     * @return Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
     * 
     */
    public Optional<Output<Integer>> dayOfWeek() {
        return Optional.ofNullable(this.dayOfWeek);
    }

    /**
     * Defer the next scheduled maintenance for the given project for one week.
     * 
     */
    @Import(name="defer")
    private @Nullable Output<Boolean> defer;

    /**
     * @return Defer the next scheduled maintenance for the given project for one week.
     * 
     */
    public Optional<Output<Boolean>> defer() {
        return Optional.ofNullable(this.defer);
    }

    /**
     * Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC). Defaults to 0.
     * 
     */
    @Import(name="hourOfDay")
    private @Nullable Output<Integer> hourOfDay;

    /**
     * @return Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC). Defaults to 0.
     * 
     */
    public Optional<Output<Integer>> hourOfDay() {
        return Optional.ofNullable(this.hourOfDay);
    }

    /**
     * Number of times the current maintenance event for this project has been deferred, there can be a maximum of 2 deferrals.
     * 
     */
    @Import(name="numberOfDeferrals")
    private @Nullable Output<Integer> numberOfDeferrals;

    /**
     * @return Number of times the current maintenance event for this project has been deferred, there can be a maximum of 2 deferrals.
     * 
     */
    public Optional<Output<Integer>> numberOfDeferrals() {
        return Optional.ofNullable(this.numberOfDeferrals);
    }

    /**
     * The unique identifier of the project for the Maintenance Window.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The unique identifier of the project for the Maintenance Window.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
     * 
     */
    @Import(name="startAsap")
    private @Nullable Output<Boolean> startAsap;

    /**
     * @return Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
     * 
     */
    public Optional<Output<Boolean>> startAsap() {
        return Optional.ofNullable(this.startAsap);
    }

    private MaintenanceWindowState() {}

    private MaintenanceWindowState(MaintenanceWindowState $) {
        this.autoDefer = $.autoDefer;
        this.autoDeferOnceEnabled = $.autoDeferOnceEnabled;
        this.dayOfWeek = $.dayOfWeek;
        this.defer = $.defer;
        this.hourOfDay = $.hourOfDay;
        this.numberOfDeferrals = $.numberOfDeferrals;
        this.projectId = $.projectId;
        this.startAsap = $.startAsap;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenanceWindowState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenanceWindowState $;

        public Builder() {
            $ = new MaintenanceWindowState();
        }

        public Builder(MaintenanceWindowState defaults) {
            $ = new MaintenanceWindowState(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoDefer Defer any scheduled maintenance for the given project for one week.
         * 
         * @return builder
         * 
         */
        public Builder autoDefer(@Nullable Output<Boolean> autoDefer) {
            $.autoDefer = autoDefer;
            return this;
        }

        /**
         * @param autoDefer Defer any scheduled maintenance for the given project for one week.
         * 
         * @return builder
         * 
         */
        public Builder autoDefer(Boolean autoDefer) {
            return autoDefer(Output.of(autoDefer));
        }

        public Builder autoDeferOnceEnabled(@Nullable Output<Boolean> autoDeferOnceEnabled) {
            $.autoDeferOnceEnabled = autoDeferOnceEnabled;
            return this;
        }

        public Builder autoDeferOnceEnabled(Boolean autoDeferOnceEnabled) {
            return autoDeferOnceEnabled(Output.of(autoDeferOnceEnabled));
        }

        /**
         * @param dayOfWeek Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeek(@Nullable Output<Integer> dayOfWeek) {
            $.dayOfWeek = dayOfWeek;
            return this;
        }

        /**
         * @param dayOfWeek Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeek(Integer dayOfWeek) {
            return dayOfWeek(Output.of(dayOfWeek));
        }

        /**
         * @param defer Defer the next scheduled maintenance for the given project for one week.
         * 
         * @return builder
         * 
         */
        public Builder defer(@Nullable Output<Boolean> defer) {
            $.defer = defer;
            return this;
        }

        /**
         * @param defer Defer the next scheduled maintenance for the given project for one week.
         * 
         * @return builder
         * 
         */
        public Builder defer(Boolean defer) {
            return defer(Output.of(defer));
        }

        /**
         * @param hourOfDay Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC). Defaults to 0.
         * 
         * @return builder
         * 
         */
        public Builder hourOfDay(@Nullable Output<Integer> hourOfDay) {
            $.hourOfDay = hourOfDay;
            return this;
        }

        /**
         * @param hourOfDay Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC). Defaults to 0.
         * 
         * @return builder
         * 
         */
        public Builder hourOfDay(Integer hourOfDay) {
            return hourOfDay(Output.of(hourOfDay));
        }

        /**
         * @param numberOfDeferrals Number of times the current maintenance event for this project has been deferred, there can be a maximum of 2 deferrals.
         * 
         * @return builder
         * 
         */
        public Builder numberOfDeferrals(@Nullable Output<Integer> numberOfDeferrals) {
            $.numberOfDeferrals = numberOfDeferrals;
            return this;
        }

        /**
         * @param numberOfDeferrals Number of times the current maintenance event for this project has been deferred, there can be a maximum of 2 deferrals.
         * 
         * @return builder
         * 
         */
        public Builder numberOfDeferrals(Integer numberOfDeferrals) {
            return numberOfDeferrals(Output.of(numberOfDeferrals));
        }

        /**
         * @param projectId The unique identifier of the project for the Maintenance Window.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique identifier of the project for the Maintenance Window.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param startAsap Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
         * 
         * @return builder
         * 
         */
        public Builder startAsap(@Nullable Output<Boolean> startAsap) {
            $.startAsap = startAsap;
            return this;
        }

        /**
         * @param startAsap Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
         * 
         * @return builder
         * 
         */
        public Builder startAsap(Boolean startAsap) {
            return startAsap(Output.of(startAsap));
        }

        public MaintenanceWindowState build() {
            return $;
        }
    }

}
