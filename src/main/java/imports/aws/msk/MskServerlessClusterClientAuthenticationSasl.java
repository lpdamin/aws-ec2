package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.973Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskServerlessClusterClientAuthenticationSasl")
@software.amazon.jsii.Jsii.Proxy(MskServerlessClusterClientAuthenticationSasl.Jsii$Proxy.class)
public interface MskServerlessClusterClientAuthenticationSasl extends software.amazon.jsii.JsiiSerializable {

    /**
     * iam block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/msk_serverless_cluster#iam MskServerlessCluster#iam}
     */
    @org.jetbrains.annotations.NotNull imports.aws.msk.MskServerlessClusterClientAuthenticationSaslIam getIam();

    /**
     * @return a {@link Builder} of {@link MskServerlessClusterClientAuthenticationSasl}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskServerlessClusterClientAuthenticationSasl}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskServerlessClusterClientAuthenticationSasl> {
        imports.aws.msk.MskServerlessClusterClientAuthenticationSaslIam iam;

        /**
         * Sets the value of {@link MskServerlessClusterClientAuthenticationSasl#getIam}
         * @param iam iam block. This parameter is required.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/msk_serverless_cluster#iam MskServerlessCluster#iam}
         * @return {@code this}
         */
        public Builder iam(imports.aws.msk.MskServerlessClusterClientAuthenticationSaslIam iam) {
            this.iam = iam;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskServerlessClusterClientAuthenticationSasl}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskServerlessClusterClientAuthenticationSasl build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MskServerlessClusterClientAuthenticationSasl}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskServerlessClusterClientAuthenticationSasl {
        private final imports.aws.msk.MskServerlessClusterClientAuthenticationSaslIam iam;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.iam = software.amazon.jsii.Kernel.get(this, "iam", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskServerlessClusterClientAuthenticationSaslIam.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.iam = java.util.Objects.requireNonNull(builder.iam, "iam is required");
        }

        @Override
        public final imports.aws.msk.MskServerlessClusterClientAuthenticationSaslIam getIam() {
            return this.iam;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("iam", om.valueToTree(this.getIam()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.msk.MskServerlessClusterClientAuthenticationSasl"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskServerlessClusterClientAuthenticationSasl.Jsii$Proxy that = (MskServerlessClusterClientAuthenticationSasl.Jsii$Proxy) o;

            return this.iam.equals(that.iam);
        }

        @Override
        public final int hashCode() {
            int result = this.iam.hashCode();
            return result;
        }
    }
}
