package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.958Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontDistributionRestrictionsGeoRestriction")
@software.amazon.jsii.Jsii.Proxy(CloudfrontDistributionRestrictionsGeoRestriction.Jsii$Proxy.class)
public interface CloudfrontDistributionRestrictionsGeoRestriction extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#restriction_type CloudfrontDistribution#restriction_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRestrictionType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#locations CloudfrontDistribution#locations}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLocations() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudfrontDistributionRestrictionsGeoRestriction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudfrontDistributionRestrictionsGeoRestriction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudfrontDistributionRestrictionsGeoRestriction> {
        java.lang.String restrictionType;
        java.util.List<java.lang.String> locations;

        /**
         * Sets the value of {@link CloudfrontDistributionRestrictionsGeoRestriction#getRestrictionType}
         * @param restrictionType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#restriction_type CloudfrontDistribution#restriction_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder restrictionType(java.lang.String restrictionType) {
            this.restrictionType = restrictionType;
            return this;
        }

        /**
         * Sets the value of {@link CloudfrontDistributionRestrictionsGeoRestriction#getLocations}
         * @param locations Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution#locations CloudfrontDistribution#locations}.
         * @return {@code this}
         */
        public Builder locations(java.util.List<java.lang.String> locations) {
            this.locations = locations;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudfrontDistributionRestrictionsGeoRestriction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudfrontDistributionRestrictionsGeoRestriction build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudfrontDistributionRestrictionsGeoRestriction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudfrontDistributionRestrictionsGeoRestriction {
        private final java.lang.String restrictionType;
        private final java.util.List<java.lang.String> locations;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.restrictionType = software.amazon.jsii.Kernel.get(this, "restrictionType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.locations = software.amazon.jsii.Kernel.get(this, "locations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.restrictionType = java.util.Objects.requireNonNull(builder.restrictionType, "restrictionType is required");
            this.locations = builder.locations;
        }

        @Override
        public final java.lang.String getRestrictionType() {
            return this.restrictionType;
        }

        @Override
        public final java.util.List<java.lang.String> getLocations() {
            return this.locations;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("restrictionType", om.valueToTree(this.getRestrictionType()));
            if (this.getLocations() != null) {
                data.set("locations", om.valueToTree(this.getLocations()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cloudfront.CloudfrontDistributionRestrictionsGeoRestriction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudfrontDistributionRestrictionsGeoRestriction.Jsii$Proxy that = (CloudfrontDistributionRestrictionsGeoRestriction.Jsii$Proxy) o;

            if (!restrictionType.equals(that.restrictionType)) return false;
            return this.locations != null ? this.locations.equals(that.locations) : that.locations == null;
        }

        @Override
        public final int hashCode() {
            int result = this.restrictionType.hashCode();
            result = 31 * result + (this.locations != null ? this.locations.hashCode() : 0);
            return result;
        }
    }
}
