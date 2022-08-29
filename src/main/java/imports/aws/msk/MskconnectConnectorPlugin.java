package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.988Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskconnectConnectorPlugin")
@software.amazon.jsii.Jsii.Proxy(MskconnectConnectorPlugin.Jsii$Proxy.class)
public interface MskconnectConnectorPlugin extends software.amazon.jsii.JsiiSerializable {

    /**
     * custom_plugin block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mskconnect_connector#custom_plugin MskconnectConnector#custom_plugin}
     */
    @org.jetbrains.annotations.NotNull imports.aws.msk.MskconnectConnectorPluginCustomPlugin getCustomPlugin();

    /**
     * @return a {@link Builder} of {@link MskconnectConnectorPlugin}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskconnectConnectorPlugin}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskconnectConnectorPlugin> {
        imports.aws.msk.MskconnectConnectorPluginCustomPlugin customPlugin;

        /**
         * Sets the value of {@link MskconnectConnectorPlugin#getCustomPlugin}
         * @param customPlugin custom_plugin block. This parameter is required.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mskconnect_connector#custom_plugin MskconnectConnector#custom_plugin}
         * @return {@code this}
         */
        public Builder customPlugin(imports.aws.msk.MskconnectConnectorPluginCustomPlugin customPlugin) {
            this.customPlugin = customPlugin;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskconnectConnectorPlugin}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskconnectConnectorPlugin build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MskconnectConnectorPlugin}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskconnectConnectorPlugin {
        private final imports.aws.msk.MskconnectConnectorPluginCustomPlugin customPlugin;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.customPlugin = software.amazon.jsii.Kernel.get(this, "customPlugin", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskconnectConnectorPluginCustomPlugin.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.customPlugin = java.util.Objects.requireNonNull(builder.customPlugin, "customPlugin is required");
        }

        @Override
        public final imports.aws.msk.MskconnectConnectorPluginCustomPlugin getCustomPlugin() {
            return this.customPlugin;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("customPlugin", om.valueToTree(this.getCustomPlugin()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.msk.MskconnectConnectorPlugin"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskconnectConnectorPlugin.Jsii$Proxy that = (MskconnectConnectorPlugin.Jsii$Proxy) o;

            return this.customPlugin.equals(that.customPlugin);
        }

        @Override
        public final int hashCode() {
            int result = this.customPlugin.hashCode();
            return result;
        }
    }
}
