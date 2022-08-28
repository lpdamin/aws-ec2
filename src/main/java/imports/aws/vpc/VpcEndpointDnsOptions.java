package imports.aws.vpc;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:02.023Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.vpc.VpcEndpointDnsOptions")
@software.amazon.jsii.Jsii.Proxy(VpcEndpointDnsOptions.Jsii$Proxy.class)
public interface VpcEndpointDnsOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#dns_record_ip_type VpcEndpoint#dns_record_ip_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDnsRecordIpType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link VpcEndpointDnsOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VpcEndpointDnsOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<VpcEndpointDnsOptions> {
        java.lang.String dnsRecordIpType;

        /**
         * Sets the value of {@link VpcEndpointDnsOptions#getDnsRecordIpType}
         * @param dnsRecordIpType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_endpoint#dns_record_ip_type VpcEndpoint#dns_record_ip_type}.
         * @return {@code this}
         */
        public Builder dnsRecordIpType(java.lang.String dnsRecordIpType) {
            this.dnsRecordIpType = dnsRecordIpType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link VpcEndpointDnsOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public VpcEndpointDnsOptions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link VpcEndpointDnsOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VpcEndpointDnsOptions {
        private final java.lang.String dnsRecordIpType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.dnsRecordIpType = software.amazon.jsii.Kernel.get(this, "dnsRecordIpType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.dnsRecordIpType = builder.dnsRecordIpType;
        }

        @Override
        public final java.lang.String getDnsRecordIpType() {
            return this.dnsRecordIpType;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDnsRecordIpType() != null) {
                data.set("dnsRecordIpType", om.valueToTree(this.getDnsRecordIpType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.vpc.VpcEndpointDnsOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VpcEndpointDnsOptions.Jsii$Proxy that = (VpcEndpointDnsOptions.Jsii$Proxy) o;

            return this.dnsRecordIpType != null ? this.dnsRecordIpType.equals(that.dnsRecordIpType) : that.dnsRecordIpType == null;
        }

        @Override
        public final int hashCode() {
            int result = this.dnsRecordIpType != null ? this.dnsRecordIpType.hashCode() : 0;
            return result;
        }
    }
}
