// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetOrganizationsResultLink;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetOrganizationsResult {
    /**
     * @return Autogenerated Unique ID for this data source.
     * 
     */
    private String id;
    /**
     * @return Flag that indicates whether this organization has been deleted.
     * 
     * See [MongoDB Atlas API - Organizations](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Organizations/operation/listOrganizations)  Documentation for more information.
     * 
     */
    private Boolean isDeleted;
    private List<GetOrganizationsResultLink> links;
    /**
     * @return Human-readable label that identifies the organization.
     * 
     */
    private String name;

    private GetOrganizationsResult() {}
    /**
     * @return Autogenerated Unique ID for this data source.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Flag that indicates whether this organization has been deleted.
     * 
     * See [MongoDB Atlas API - Organizations](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Organizations/operation/listOrganizations)  Documentation for more information.
     * 
     */
    public Boolean isDeleted() {
        return this.isDeleted;
    }
    public List<GetOrganizationsResultLink> links() {
        return this.links;
    }
    /**
     * @return Human-readable label that identifies the organization.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private Boolean isDeleted;
        private List<GetOrganizationsResultLink> links;
        private String name;
        public Builder() {}
        public Builder(GetOrganizationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.isDeleted = defaults.isDeleted;
    	      this.links = defaults.links;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder isDeleted(Boolean isDeleted) {
            this.isDeleted = Objects.requireNonNull(isDeleted);
            return this;
        }
        @CustomType.Setter
        public Builder links(List<GetOrganizationsResultLink> links) {
            this.links = Objects.requireNonNull(links);
            return this;
        }
        public Builder links(GetOrganizationsResultLink... links) {
            return links(List.of(links));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetOrganizationsResult build() {
            final var _resultValue = new GetOrganizationsResult();
            _resultValue.id = id;
            _resultValue.isDeleted = isDeleted;
            _resultValue.links = links;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
