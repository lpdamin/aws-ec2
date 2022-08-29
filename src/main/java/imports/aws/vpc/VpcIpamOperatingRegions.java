package imports.aws.vpc;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:51.009Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.vpc.VpcIpamOperatingRegions")
@software.amazon.jsii.Jsii.Proxy(VpcIpamOperatingRegions.Jsii$Proxy.class)
public interface VpcIpamOperatingRegions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_ipam#region_name VpcIpam#region_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRegionName();

    /**
     * @return a {@link Builder} of {@link VpcIpamOperatingRegions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VpcIpamOperatingRegions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<VpcIpamOperatingRegions> {
        java.lang.String regionName;

        /**
         * Sets the value of {@link VpcIpamOperatingRegions#getRegionName}
         * @param regionName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_ipam#region_name VpcIpam#region_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder regionName(java.lang.String regionName) {
            this.regionName = regionName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link VpcIpamOperatingRegions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public VpcIpamOperatingRegions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link VpcIpamOperatingRegions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VpcIpamOperatingRegions {
        private final java.lang.String regionName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.regionName = software.amazon.jsii.Kernel.get(this, "regionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.regionName = java.util.Objects.requireNonNull(builder.regionName, "regionName is required");
        }

        @Override
        public final java.lang.String getRegionName() {
            return this.regionName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("regionName", om.valueToTree(this.getRegionName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.vpc.VpcIpamOperatingRegions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VpcIpamOperatingRegions.Jsii$Proxy that = (VpcIpamOperatingRegions.Jsii$Proxy) o;

            return this.regionName.equals(that.regionName);
        }

        @Override
        public final int hashCode() {
            int result = this.regionName.hashCode();
            return result;
        }
    }
}
