// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetX509AuthenticationDatabaseUserCertificate;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetX509AuthenticationDatabaseUserResult {
    /**
     * @return Array of objects where each details one unexpired database user certificate.
     * 
     */
    private List<GetX509AuthenticationDatabaseUserCertificate> certificates;
    private String customerX509Cas;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String projectId;
    private @Nullable String username;

    private GetX509AuthenticationDatabaseUserResult() {}
    /**
     * @return Array of objects where each details one unexpired database user certificate.
     * 
     */
    public List<GetX509AuthenticationDatabaseUserCertificate> certificates() {
        return this.certificates;
    }
    public String customerX509Cas() {
        return this.customerX509Cas;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String projectId() {
        return this.projectId;
    }
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetX509AuthenticationDatabaseUserResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetX509AuthenticationDatabaseUserCertificate> certificates;
        private String customerX509Cas;
        private String id;
        private String projectId;
        private @Nullable String username;
        public Builder() {}
        public Builder(GetX509AuthenticationDatabaseUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.customerX509Cas = defaults.customerX509Cas;
    	      this.id = defaults.id;
    	      this.projectId = defaults.projectId;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder certificates(List<GetX509AuthenticationDatabaseUserCertificate> certificates) {
            if (certificates == null) {
              throw new MissingRequiredPropertyException("GetX509AuthenticationDatabaseUserResult", "certificates");
            }
            this.certificates = certificates;
            return this;
        }
        public Builder certificates(GetX509AuthenticationDatabaseUserCertificate... certificates) {
            return certificates(List.of(certificates));
        }
        @CustomType.Setter
        public Builder customerX509Cas(String customerX509Cas) {
            if (customerX509Cas == null) {
              throw new MissingRequiredPropertyException("GetX509AuthenticationDatabaseUserResult", "customerX509Cas");
            }
            this.customerX509Cas = customerX509Cas;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetX509AuthenticationDatabaseUserResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetX509AuthenticationDatabaseUserResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {

            this.username = username;
            return this;
        }
        public GetX509AuthenticationDatabaseUserResult build() {
            final var _resultValue = new GetX509AuthenticationDatabaseUserResult();
            _resultValue.certificates = certificates;
            _resultValue.customerX509Cas = customerX509Cas;
            _resultValue.id = id;
            _resultValue.projectId = projectId;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
