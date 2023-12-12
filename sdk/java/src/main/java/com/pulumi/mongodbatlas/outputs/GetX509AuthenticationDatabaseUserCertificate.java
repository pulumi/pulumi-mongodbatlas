// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetX509AuthenticationDatabaseUserCertificate {
    private String createdAt;
    private String groupId;
    private Integer id;
    private String notAfter;
    private String subject;

    private GetX509AuthenticationDatabaseUserCertificate() {}
    public String createdAt() {
        return this.createdAt;
    }
    public String groupId() {
        return this.groupId;
    }
    public Integer id() {
        return this.id;
    }
    public String notAfter() {
        return this.notAfter;
    }
    public String subject() {
        return this.subject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetX509AuthenticationDatabaseUserCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdAt;
        private String groupId;
        private Integer id;
        private String notAfter;
        private String subject;
        public Builder() {}
        public Builder(GetX509AuthenticationDatabaseUserCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.notAfter = defaults.notAfter;
    	      this.subject = defaults.subject;
        }

        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        @CustomType.Setter
        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder notAfter(String notAfter) {
            this.notAfter = Objects.requireNonNull(notAfter);
            return this;
        }
        @CustomType.Setter
        public Builder subject(String subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }
        public GetX509AuthenticationDatabaseUserCertificate build() {
            final var _resultValue = new GetX509AuthenticationDatabaseUserCertificate();
            _resultValue.createdAt = createdAt;
            _resultValue.groupId = groupId;
            _resultValue.id = id;
            _resultValue.notAfter = notAfter;
            _resultValue.subject = subject;
            return _resultValue;
        }
    }
}
