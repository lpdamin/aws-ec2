package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:46.945Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowConnectorProfileConnectorProfileConfig")
@software.amazon.jsii.Jsii.Proxy(AppflowConnectorProfileConnectorProfileConfig.Jsii$Proxy.class)
public interface AppflowConnectorProfileConnectorProfileConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * connector_profile_credentials block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_connector_profile#connector_profile_credentials AppflowConnectorProfile#connector_profile_credentials}
     */
    @org.jetbrains.annotations.NotNull imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentials getConnectorProfileCredentials();

    /**
     * connector_profile_properties block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_connector_profile#connector_profile_properties AppflowConnectorProfile#connector_profile_properties}
     */
    @org.jetbrains.annotations.NotNull imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileProperties getConnectorProfileProperties();

    /**
     * @return a {@link Builder} of {@link AppflowConnectorProfileConnectorProfileConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppflowConnectorProfileConnectorProfileConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppflowConnectorProfileConnectorProfileConfig> {
        imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentials connectorProfileCredentials;
        imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileProperties connectorProfileProperties;

        /**
         * Sets the value of {@link AppflowConnectorProfileConnectorProfileConfig#getConnectorProfileCredentials}
         * @param connectorProfileCredentials connector_profile_credentials block. This parameter is required.
         *                                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_connector_profile#connector_profile_credentials AppflowConnectorProfile#connector_profile_credentials}
         * @return {@code this}
         */
        public Builder connectorProfileCredentials(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentials connectorProfileCredentials) {
            this.connectorProfileCredentials = connectorProfileCredentials;
            return this;
        }

        /**
         * Sets the value of {@link AppflowConnectorProfileConnectorProfileConfig#getConnectorProfileProperties}
         * @param connectorProfileProperties connector_profile_properties block. This parameter is required.
         *                                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_connector_profile#connector_profile_properties AppflowConnectorProfile#connector_profile_properties}
         * @return {@code this}
         */
        public Builder connectorProfileProperties(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileProperties connectorProfileProperties) {
            this.connectorProfileProperties = connectorProfileProperties;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppflowConnectorProfileConnectorProfileConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppflowConnectorProfileConnectorProfileConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppflowConnectorProfileConnectorProfileConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppflowConnectorProfileConnectorProfileConfig {
        private final imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentials connectorProfileCredentials;
        private final imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileProperties connectorProfileProperties;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.connectorProfileCredentials = software.amazon.jsii.Kernel.get(this, "connectorProfileCredentials", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentials.class));
            this.connectorProfileProperties = software.amazon.jsii.Kernel.get(this, "connectorProfileProperties", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileProperties.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.connectorProfileCredentials = java.util.Objects.requireNonNull(builder.connectorProfileCredentials, "connectorProfileCredentials is required");
            this.connectorProfileProperties = java.util.Objects.requireNonNull(builder.connectorProfileProperties, "connectorProfileProperties is required");
        }

        @Override
        public final imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentials getConnectorProfileCredentials() {
            return this.connectorProfileCredentials;
        }

        @Override
        public final imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileProperties getConnectorProfileProperties() {
            return this.connectorProfileProperties;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("connectorProfileCredentials", om.valueToTree(this.getConnectorProfileCredentials()));
            data.set("connectorProfileProperties", om.valueToTree(this.getConnectorProfileProperties()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.AppflowConnectorProfileConnectorProfileConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppflowConnectorProfileConnectorProfileConfig.Jsii$Proxy that = (AppflowConnectorProfileConnectorProfileConfig.Jsii$Proxy) o;

            if (!connectorProfileCredentials.equals(that.connectorProfileCredentials)) return false;
            return this.connectorProfileProperties.equals(that.connectorProfileProperties);
        }

        @Override
        public final int hashCode() {
            int result = this.connectorProfileCredentials.hashCode();
            result = 31 * result + (this.connectorProfileProperties.hashCode());
            return result;
        }
    }
}
