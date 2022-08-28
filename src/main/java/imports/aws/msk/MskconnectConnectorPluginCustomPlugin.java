package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.876Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskconnectConnectorPluginCustomPlugin")
@software.amazon.jsii.Jsii.Proxy(MskconnectConnectorPluginCustomPlugin.Jsii$Proxy.class)
public interface MskconnectConnectorPluginCustomPlugin extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mskconnect_connector#arn MskconnectConnector#arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getArn();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mskconnect_connector#revision MskconnectConnector#revision}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getRevision();

    /**
     * @return a {@link Builder} of {@link MskconnectConnectorPluginCustomPlugin}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskconnectConnectorPluginCustomPlugin}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskconnectConnectorPluginCustomPlugin> {
        java.lang.String arn;
        java.lang.Number revision;

        /**
         * Sets the value of {@link MskconnectConnectorPluginCustomPlugin#getArn}
         * @param arn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mskconnect_connector#arn MskconnectConnector#arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder arn(java.lang.String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * Sets the value of {@link MskconnectConnectorPluginCustomPlugin#getRevision}
         * @param revision Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mskconnect_connector#revision MskconnectConnector#revision}. This parameter is required.
         * @return {@code this}
         */
        public Builder revision(java.lang.Number revision) {
            this.revision = revision;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskconnectConnectorPluginCustomPlugin}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskconnectConnectorPluginCustomPlugin build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MskconnectConnectorPluginCustomPlugin}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskconnectConnectorPluginCustomPlugin {
        private final java.lang.String arn;
        private final java.lang.Number revision;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.arn = software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.revision = software.amazon.jsii.Kernel.get(this, "revision", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.arn = java.util.Objects.requireNonNull(builder.arn, "arn is required");
            this.revision = java.util.Objects.requireNonNull(builder.revision, "revision is required");
        }

        @Override
        public final java.lang.String getArn() {
            return this.arn;
        }

        @Override
        public final java.lang.Number getRevision() {
            return this.revision;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("arn", om.valueToTree(this.getArn()));
            data.set("revision", om.valueToTree(this.getRevision()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.msk.MskconnectConnectorPluginCustomPlugin"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskconnectConnectorPluginCustomPlugin.Jsii$Proxy that = (MskconnectConnectorPluginCustomPlugin.Jsii$Proxy) o;

            if (!arn.equals(that.arn)) return false;
            return this.revision.equals(that.revision);
        }

        @Override
        public final int hashCode() {
            int result = this.arn.hashCode();
            result = 31 * result + (this.revision.hashCode());
            return result;
        }
    }
}
