package imports.aws.networkfirewall;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.993Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.networkfirewall.NetworkfirewallFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction")
@software.amazon.jsii.Jsii.Proxy(NetworkfirewallFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction.Jsii$Proxy.class)
public interface NetworkfirewallFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction extends software.amazon.jsii.JsiiSerializable {

    /**
     * dimension block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/networkfirewall_firewall_policy#dimension NetworkfirewallFirewallPolicy#dimension}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getDimension();

    /**
     * @return a {@link Builder} of {@link NetworkfirewallFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkfirewallFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NetworkfirewallFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction> {
        java.lang.Object dimension;

        /**
         * Sets the value of {@link NetworkfirewallFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction#getDimension}
         * @param dimension dimension block. This parameter is required.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/networkfirewall_firewall_policy#dimension NetworkfirewallFirewallPolicy#dimension}
         * @return {@code this}
         */
        public Builder dimension(com.hashicorp.cdktf.IResolvable dimension) {
            this.dimension = dimension;
            return this;
        }

        /**
         * Sets the value of {@link NetworkfirewallFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction#getDimension}
         * @param dimension dimension block. This parameter is required.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/networkfirewall_firewall_policy#dimension NetworkfirewallFirewallPolicy#dimension}
         * @return {@code this}
         */
        public Builder dimension(java.util.List<? extends imports.aws.networkfirewall.NetworkfirewallFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension> dimension) {
            this.dimension = dimension;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NetworkfirewallFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NetworkfirewallFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NetworkfirewallFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkfirewallFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction {
        private final java.lang.Object dimension;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.dimension = software.amazon.jsii.Kernel.get(this, "dimension", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.dimension = java.util.Objects.requireNonNull(builder.dimension, "dimension is required");
        }

        @Override
        public final java.lang.Object getDimension() {
            return this.dimension;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("dimension", om.valueToTree(this.getDimension()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.networkfirewall.NetworkfirewallFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkfirewallFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction.Jsii$Proxy that = (NetworkfirewallFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction.Jsii$Proxy) o;

            return this.dimension.equals(that.dimension);
        }

        @Override
        public final int hashCode() {
            int result = this.dimension.hashCode();
            return result;
        }
    }
}
