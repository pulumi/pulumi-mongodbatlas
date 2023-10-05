// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetAlertConfigurationMatcher;
import com.pulumi.mongodbatlas.outputs.GetAlertConfigurationMetricThresholdConfig;
import com.pulumi.mongodbatlas.outputs.GetAlertConfigurationNotification;
import com.pulumi.mongodbatlas.outputs.GetAlertConfigurationOutput;
import com.pulumi.mongodbatlas.outputs.GetAlertConfigurationThresholdConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetAlertConfigurationResult {
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
    private List<GetAlertConfigurationMatcher> matchers;
    private List<GetAlertConfigurationMetricThresholdConfig> metricThresholdConfigs;
    private List<GetAlertConfigurationNotification> notifications;
    private @Nullable List<GetAlertConfigurationOutput> outputs;
    private String projectId;
    private List<GetAlertConfigurationThresholdConfig> thresholdConfigs;
    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when this alert configuration was last updated.
     * 
     */
    private String updated;

    private GetAlertConfigurationResult() {}
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
    public List<GetAlertConfigurationMatcher> matchers() {
        return this.matchers;
    }
    public List<GetAlertConfigurationMetricThresholdConfig> metricThresholdConfigs() {
        return this.metricThresholdConfigs;
    }
    public List<GetAlertConfigurationNotification> notifications() {
        return this.notifications;
    }
    public List<GetAlertConfigurationOutput> outputs() {
        return this.outputs == null ? List.of() : this.outputs;
    }
    public String projectId() {
        return this.projectId;
    }
    public List<GetAlertConfigurationThresholdConfig> thresholdConfigs() {
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

    public static Builder builder(GetAlertConfigurationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String alertConfigurationId;
        private String created;
        private Boolean enabled;
        private String eventType;
        private String id;
        private List<GetAlertConfigurationMatcher> matchers;
        private List<GetAlertConfigurationMetricThresholdConfig> metricThresholdConfigs;
        private List<GetAlertConfigurationNotification> notifications;
        private @Nullable List<GetAlertConfigurationOutput> outputs;
        private String projectId;
        private List<GetAlertConfigurationThresholdConfig> thresholdConfigs;
        private String updated;
        public Builder() {}
        public Builder(GetAlertConfigurationResult defaults) {
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
        public Builder matchers(List<GetAlertConfigurationMatcher> matchers) {
            this.matchers = Objects.requireNonNull(matchers);
            return this;
        }
        public Builder matchers(GetAlertConfigurationMatcher... matchers) {
            return matchers(List.of(matchers));
        }
        @CustomType.Setter
        public Builder metricThresholdConfigs(List<GetAlertConfigurationMetricThresholdConfig> metricThresholdConfigs) {
            this.metricThresholdConfigs = Objects.requireNonNull(metricThresholdConfigs);
            return this;
        }
        public Builder metricThresholdConfigs(GetAlertConfigurationMetricThresholdConfig... metricThresholdConfigs) {
            return metricThresholdConfigs(List.of(metricThresholdConfigs));
        }
        @CustomType.Setter
        public Builder notifications(List<GetAlertConfigurationNotification> notifications) {
            this.notifications = Objects.requireNonNull(notifications);
            return this;
        }
        public Builder notifications(GetAlertConfigurationNotification... notifications) {
            return notifications(List.of(notifications));
        }
        @CustomType.Setter
        public Builder outputs(@Nullable List<GetAlertConfigurationOutput> outputs) {
            this.outputs = outputs;
            return this;
        }
        public Builder outputs(GetAlertConfigurationOutput... outputs) {
            return outputs(List.of(outputs));
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder thresholdConfigs(List<GetAlertConfigurationThresholdConfig> thresholdConfigs) {
            this.thresholdConfigs = Objects.requireNonNull(thresholdConfigs);
            return this;
        }
        public Builder thresholdConfigs(GetAlertConfigurationThresholdConfig... thresholdConfigs) {
            return thresholdConfigs(List.of(thresholdConfigs));
        }
        @CustomType.Setter
        public Builder updated(String updated) {
            this.updated = Objects.requireNonNull(updated);
            return this;
        }
        public GetAlertConfigurationResult build() {
            final var o = new GetAlertConfigurationResult();
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
