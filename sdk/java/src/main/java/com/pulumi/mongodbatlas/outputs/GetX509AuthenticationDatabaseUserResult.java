// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
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
            this.certificates = Objects.requireNonNull(certificates);
            return this;
        }
        public Builder certificates(GetX509AuthenticationDatabaseUserCertificate... certificates) {
            return certificates(List.of(certificates));
        }
        @CustomType.Setter
        public Builder customerX509Cas(String customerX509Cas) {
            this.customerX509Cas = Objects.requireNonNull(customerX509Cas);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        public GetX509AuthenticationDatabaseUserResult build() {
            final var o = new GetX509AuthenticationDatabaseUserResult();
            o.certificates = certificates;
            o.customerX509Cas = customerX509Cas;
            o.id = id;
            o.projectId = projectId;
            o.username = username;
            return o;
        }
    }
}
