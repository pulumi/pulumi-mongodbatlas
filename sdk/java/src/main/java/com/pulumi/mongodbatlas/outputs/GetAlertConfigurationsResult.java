// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetAlertConfigurationsResultMatcher;
import com.pulumi.mongodbatlas.outputs.GetAlertConfigurationsResultMetricThresholdConfig;
import com.pulumi.mongodbatlas.outputs.GetAlertConfigurationsResultNotification;
import com.pulumi.mongodbatlas.outputs.GetAlertConfigurationsResultOutput;
import com.pulumi.mongodbatlas.outputs.GetAlertConfigurationsResultThresholdConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAlertConfigurationsResult {
    /**
     * @return The ID of the alert configuration
     * 
     */
    private String alertConfigurationId;
    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when this alert configuration was created.
     * 
     */
    private String created;
    /**
     * @return If set to true, the alert configuration is enabled. If enabled is not exported it is set to false.
     * 
     */
    private Boolean enabled;
    /**
     * @return The type of event that will trigger an alert.
     * 
     */
    private String eventType;
    private String id;
    /**
     * @return Rules to apply when matching an object against this alert configuration. See matchers.
     * 
     */
    private List<GetAlertConfigurationsResultMatcher> matchers;
    /**
     * @return The threshold that causes an alert to be triggered. Required if `event_type_name` : `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`. See metric threshold config.
     * 
     */
    private List<GetAlertConfigurationsResultMetricThresholdConfig> metricThresholdConfigs;
    private List<GetAlertConfigurationsResultNotification> notifications;
    /**
     * @return Requested output string format for the alert configuration
     * 
     */
    private List<GetAlertConfigurationsResultOutput> outputs;
    /**
     * @return The unique ID for the project to get the alert configurations.
     * 
     */
    private String projectId;
    /**
     * @return Threshold that triggers an alert. Required if `event_type_name` is any value other than `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`. See threshold config.
     * 
     */
    private List<GetAlertConfigurationsResultThresholdConfig> thresholdConfigs;
    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when this alert configuration was last updated.
     * 
     */
    private String updated;

    private GetAlertConfigurationsResult() {}
    /**
     * @return The ID of the alert configuration
     * 
     */
    public String alertConfigurationId() {
        return this.alertConfigurationId;
    }
    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when this alert configuration was created.
     * 
     */
    public String created() {
        return this.created;
    }
    /**
     * @return If set to true, the alert configuration is enabled. If enabled is not exported it is set to false.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The type of event that will trigger an alert.
     * 
     */
    public String eventType() {
        return this.eventType;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return Rules to apply when matching an object against this alert configuration. See matchers.
     * 
     */
    public List<GetAlertConfigurationsResultMatcher> matchers() {
        return this.matchers;
    }
    /**
     * @return The threshold that causes an alert to be triggered. Required if `event_type_name` : `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`. See metric threshold config.
     * 
     */
    public List<GetAlertConfigurationsResultMetricThresholdConfig> metricThresholdConfigs() {
        return this.metricThresholdConfigs;
    }
    public List<GetAlertConfigurationsResultNotification> notifications() {
        return this.notifications;
    }
    /**
     * @return Requested output string format for the alert configuration
     * 
     */
    public List<GetAlertConfigurationsResultOutput> outputs() {
        return this.outputs;
    }
    /**
     * @return The unique ID for the project to get the alert configurations.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Threshold that triggers an alert. Required if `event_type_name` is any value other than `OUTSIDE_METRIC_THRESHOLD` or `OUTSIDE_SERVERLESS_METRIC_THRESHOLD`. See threshold config.
     * 
     */
    public List<GetAlertConfigurationsResultThresholdConfig> thresholdConfigs() {
        return this.thresholdConfigs;
    }
    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when this alert configuration was last updated.
     * 
     */
    public String updated() {
        return this.updated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertConfigurationsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String alertConfigurationId;
        private String created;
        private Boolean enabled;
        private String eventType;
        private String id;
        private List<GetAlertConfigurationsResultMatcher> matchers;
        private List<GetAlertConfigurationsResultMetricThresholdConfig> metricThresholdConfigs;
        private List<GetAlertConfigurationsResultNotification> notifications;
        private List<GetAlertConfigurationsResultOutput> outputs;
        private String projectId;
        private List<GetAlertConfigurationsResultThresholdConfig> thresholdConfigs;
        private String updated;
        public Builder() {}
        public Builder(GetAlertConfigurationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertConfigurationId = defaults.alertConfigurationId;
    	      this.created = defaults.created;
    	      this.enabled = defaults.enabled;
    	      this.eventType = defaults.eventType;
    	      this.id = defaults.id;
    	      this.matchers = defaults.matchers;
    	      this.metricThresholdConfigs = defaults.metricThresholdConfigs;
    	      this.notifications = defaults.notifications;
    	      this.outputs = defaults.outputs;
    	      this.projectId = defaults.projectId;
    	      this.thresholdConfigs = defaults.thresholdConfigs;
    	      this.updated = defaults.updated;
        }

        @CustomType.Setter
        public Builder alertConfigurationId(String alertConfigurationId) {
            this.alertConfigurationId = Objects.requireNonNull(alertConfigurationId);
            return this;
        }
        @CustomType.Setter
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder eventType(String eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder matchers(List<GetAlertConfigurationsResultMatcher> matchers) {
            this.matchers = Objects.requireNonNull(matchers);
            return this;
        }
        public Builder matchers(GetAlertConfigurationsResultMatcher... matchers) {
            return matchers(List.of(matchers));
        }
        @CustomType.Setter
        public Builder metricThresholdConfigs(List<GetAlertConfigurationsResultMetricThresholdConfig> metricThresholdConfigs) {
            this.metricThresholdConfigs = Objects.requireNonNull(metricThresholdConfigs);
            return this;
        }
        public Builder metricThresholdConfigs(GetAlertConfigurationsResultMetricThresholdConfig... metricThresholdConfigs) {
            return metricThresholdConfigs(List.of(metricThresholdConfigs));
        }
        @CustomType.Setter
        public Builder notifications(List<GetAlertConfigurationsResultNotification> notifications) {
            this.notifications = Objects.requireNonNull(notifications);
            return this;
        }
        public Builder notifications(GetAlertConfigurationsResultNotification... notifications) {
            return notifications(List.of(notifications));
        }
        @CustomType.Setter
        public Builder outputs(List<GetAlertConfigurationsResultOutput> outputs) {
            this.outputs = Objects.requireNonNull(outputs);
            return this;
        }
        public Builder outputs(GetAlertConfigurationsResultOutput... outputs) {
            return outputs(List.of(outputs));
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder thresholdConfigs(List<GetAlertConfigurationsResultThresholdConfig> thresholdConfigs) {
            this.thresholdConfigs = Objects.requireNonNull(thresholdConfigs);
            return this;
        }
        public Builder thresholdConfigs(GetAlertConfigurationsResultThresholdConfig... thresholdConfigs) {
            return thresholdConfigs(List.of(thresholdConfigs));
        }
        @CustomType.Setter
        public Builder updated(String updated) {
            this.updated = Objects.requireNonNull(updated);
            return this;
        }
        public GetAlertConfigurationsResult build() {
            final var o = new GetAlertConfigurationsResult();
            o.alertConfigurationId = alertConfigurationId;
            o.created = created;
            o.enabled = enabled;
            o.eventType = eventType;
            o.id = id;
            o.matchers = matchers;
            o.metricThresholdConfigs = metricThresholdConfigs;
            o.notifications = notifications;
            o.outputs = outputs;
            o.projectId = projectId;
            o.thresholdConfigs = thresholdConfigs;
            o.updated = updated;
            return o;
        }
    }
}
