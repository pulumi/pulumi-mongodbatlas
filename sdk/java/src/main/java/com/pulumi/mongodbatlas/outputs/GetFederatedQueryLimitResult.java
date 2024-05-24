// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFederatedQueryLimitResult {
    /**
     * @return Amount that indicates the current usage of the limit.
     * 
     */
    private Integer currentUsage;
    /**
     * @return Default value of the limit.
     * * `lastModifiedDate` - Only used for Data Federation limits. Timestamp that indicates when this usage limit was last modified. This field uses the ISO 8601 timestamp format in UTC.
     * * `maximumLimit` - Maximum value of the limit.
     * 
     */
    private Integer defaultLimit;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String lastModifiedDate;
    private String limitName;
    private Integer maximumLimit;
    private String overrunPolicy;
    private String projectId;
    private String tenantName;
    private Integer value;

    private GetFederatedQueryLimitResult() {}
    /**
     * @return Amount that indicates the current usage of the limit.
     * 
     */
    public Integer currentUsage() {
        return this.currentUsage;
    }
    /**
     * @return Default value of the limit.
     * * `lastModifiedDate` - Only used for Data Federation limits. Timestamp that indicates when this usage limit was last modified. This field uses the ISO 8601 timestamp format in UTC.
     * * `maximumLimit` - Maximum value of the limit.
     * 
     */
    public Integer defaultLimit() {
        return this.defaultLimit;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String lastModifiedDate() {
        return this.lastModifiedDate;
    }
    public String limitName() {
        return this.limitName;
    }
    public Integer maximumLimit() {
        return this.maximumLimit;
    }
    public String overrunPolicy() {
        return this.overrunPolicy;
    }
    public String projectId() {
        return this.projectId;
    }
    public String tenantName() {
        return this.tenantName;
    }
    public Integer value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFederatedQueryLimitResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer currentUsage;
        private Integer defaultLimit;
        private String id;
        private String lastModifiedDate;
        private String limitName;
        private Integer maximumLimit;
        private String overrunPolicy;
        private String projectId;
        private String tenantName;
        private Integer value;
        public Builder() {}
        public Builder(GetFederatedQueryLimitResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentUsage = defaults.currentUsage;
    	      this.defaultLimit = defaults.defaultLimit;
    	      this.id = defaults.id;
    	      this.lastModifiedDate = defaults.lastModifiedDate;
    	      this.limitName = defaults.limitName;
    	      this.maximumLimit = defaults.maximumLimit;
    	      this.overrunPolicy = defaults.overrunPolicy;
    	      this.projectId = defaults.projectId;
    	      this.tenantName = defaults.tenantName;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder currentUsage(Integer currentUsage) {
            if (currentUsage == null) {
              throw new MissingRequiredPropertyException("GetFederatedQueryLimitResult", "currentUsage");
            }
            this.currentUsage = currentUsage;
            return this;
        }
        @CustomType.Setter
        public Builder defaultLimit(Integer defaultLimit) {
            if (defaultLimit == null) {
              throw new MissingRequiredPropertyException("GetFederatedQueryLimitResult", "defaultLimit");
            }
            this.defaultLimit = defaultLimit;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFederatedQueryLimitResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder lastModifiedDate(String lastModifiedDate) {
            if (lastModifiedDate == null) {
              throw new MissingRequiredPropertyException("GetFederatedQueryLimitResult", "lastModifiedDate");
            }
            this.lastModifiedDate = lastModifiedDate;
            return this;
        }
        @CustomType.Setter
        public Builder limitName(String limitName) {
            if (limitName == null) {
              throw new MissingRequiredPropertyException("GetFederatedQueryLimitResult", "limitName");
            }
            this.limitName = limitName;
            return this;
        }
        @CustomType.Setter
        public Builder maximumLimit(Integer maximumLimit) {
            if (maximumLimit == null) {
              throw new MissingRequiredPropertyException("GetFederatedQueryLimitResult", "maximumLimit");
            }
            this.maximumLimit = maximumLimit;
            return this;
        }
        @CustomType.Setter
        public Builder overrunPolicy(String overrunPolicy) {
            if (overrunPolicy == null) {
              throw new MissingRequiredPropertyException("GetFederatedQueryLimitResult", "overrunPolicy");
            }
            this.overrunPolicy = overrunPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetFederatedQueryLimitResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder tenantName(String tenantName) {
            if (tenantName == null) {
              throw new MissingRequiredPropertyException("GetFederatedQueryLimitResult", "tenantName");
            }
            this.tenantName = tenantName;
            return this;
        }
        @CustomType.Setter
        public Builder value(Integer value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetFederatedQueryLimitResult", "value");
            }
            this.value = value;
            return this;
        }
        public GetFederatedQueryLimitResult build() {
            final var _resultValue = new GetFederatedQueryLimitResult();
            _resultValue.currentUsage = currentUsage;
            _resultValue.defaultLimit = defaultLimit;
            _resultValue.id = id;
            _resultValue.lastModifiedDate = lastModifiedDate;
            _resultValue.limitName = limitName;
            _resultValue.maximumLimit = maximumLimit;
            _resultValue.overrunPolicy = overrunPolicy;
            _resultValue.projectId = projectId;
            _resultValue.tenantName = tenantName;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
