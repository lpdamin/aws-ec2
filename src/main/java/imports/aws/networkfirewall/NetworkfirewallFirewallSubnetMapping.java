package imports.aws.networkfirewall;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.033Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.networkfirewall.NetworkfirewallFirewallSubnetMapping")
@software.amazon.jsii.Jsii.Proxy(NetworkfirewallFirewallSubnetMapping.Jsii$Proxy.class)
public interface NetworkfirewallFirewallSubnetMapping extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkfirewall_firewall#subnet_id NetworkfirewallFirewall#subnet_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSubnetId();

    /**
     * @return a {@link Builder} of {@link NetworkfirewallFirewallSubnetMapping}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkfirewallFirewallSubnetMapping}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NetworkfirewallFirewallSubnetMapping> {
        java.lang.String subnetId;

        /**
         * Sets the value of {@link NetworkfirewallFirewallSubnetMapping#getSubnetId}
         * @param subnetId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkfirewall_firewall#subnet_id NetworkfirewallFirewall#subnet_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder subnetId(java.lang.String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NetworkfirewallFirewallSubnetMapping}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NetworkfirewallFirewallSubnetMapping build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NetworkfirewallFirewallSubnetMapping}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkfirewallFirewallSubnetMapping {
        private final java.lang.String subnetId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.subnetId = software.amazon.jsii.Kernel.get(this, "subnetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.subnetId = java.util.Objects.requireNonNull(builder.subnetId, "subnetId is required");
        }

        @Override
        public final java.lang.String getSubnetId() {
            return this.subnetId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("subnetId", om.valueToTree(this.getSubnetId()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.networkfirewall.NetworkfirewallFirewallSubnetMapping"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkfirewallFirewallSubnetMapping.Jsii$Proxy that = (NetworkfirewallFirewallSubnetMapping.Jsii$Proxy) o;

            return this.subnetId.equals(that.subnetId);
        }

        @Override
        public final int hashCode() {
            int result = this.subnetId.hashCode();
            return result;
        }
    }
}
