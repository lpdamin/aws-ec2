package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.973Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskServerlessClusterClientAuthenticationSaslIam")
@software.amazon.jsii.Jsii.Proxy(MskServerlessClusterClientAuthenticationSaslIam.Jsii$Proxy.class)
public interface MskServerlessClusterClientAuthenticationSaslIam extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_serverless_cluster#enabled MskServerlessCluster#enabled}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getEnabled();

    /**
     * @return a {@link Builder} of {@link MskServerlessClusterClientAuthenticationSaslIam}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskServerlessClusterClientAuthenticationSaslIam}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskServerlessClusterClientAuthenticationSaslIam> {
        java.lang.Object enabled;

        /**
         * Sets the value of {@link MskServerlessClusterClientAuthenticationSaslIam#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_serverless_cluster#enabled MskServerlessCluster#enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link MskServerlessClusterClientAuthenticationSaslIam#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_serverless_cluster#enabled MskServerlessCluster#enabled}. This parameter is required.
         * @return {@code this}
         */
        public Builder enabled(com.hashicorp.cdktf.IResolvable enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskServerlessClusterClientAuthenticationSaslIam}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskServerlessClusterClientAuthenticationSaslIam build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MskServerlessClusterClientAuthenticationSaslIam}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskServerlessClusterClientAuthenticationSaslIam {
        private final java.lang.Object enabled;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.enabled = java.util.Objects.requireNonNull(builder.enabled, "enabled is required");
        }

        @Override
        public final java.lang.Object getEnabled() {
            return this.enabled;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("enabled", om.valueToTree(this.getEnabled()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.msk.MskServerlessClusterClientAuthenticationSaslIam"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskServerlessClusterClientAuthenticationSaslIam.Jsii$Proxy that = (MskServerlessClusterClientAuthenticationSaslIam.Jsii$Proxy) o;

            return this.enabled.equals(that.enabled);
        }

        @Override
        public final int hashCode() {
            int result = this.enabled.hashCode();
            return result;
        }
    }
}
