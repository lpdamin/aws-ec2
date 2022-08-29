package imports.aws.apprunner;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.712Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.apprunner.ApprunnerServiceNetworkConfiguration")
@software.amazon.jsii.Jsii.Proxy(ApprunnerServiceNetworkConfiguration.Jsii$Proxy.class)
public interface ApprunnerServiceNetworkConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * egress_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/apprunner_service#egress_configuration ApprunnerService#egress_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.apprunner.ApprunnerServiceNetworkConfigurationEgressConfiguration getEgressConfiguration() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ApprunnerServiceNetworkConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApprunnerServiceNetworkConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApprunnerServiceNetworkConfiguration> {
        imports.aws.apprunner.ApprunnerServiceNetworkConfigurationEgressConfiguration egressConfiguration;

        /**
         * Sets the value of {@link ApprunnerServiceNetworkConfiguration#getEgressConfiguration}
         * @param egressConfiguration egress_configuration block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/apprunner_service#egress_configuration ApprunnerService#egress_configuration}
         * @return {@code this}
         */
        public Builder egressConfiguration(imports.aws.apprunner.ApprunnerServiceNetworkConfigurationEgressConfiguration egressConfiguration) {
            this.egressConfiguration = egressConfiguration;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ApprunnerServiceNetworkConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApprunnerServiceNetworkConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ApprunnerServiceNetworkConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApprunnerServiceNetworkConfiguration {
        private final imports.aws.apprunner.ApprunnerServiceNetworkConfigurationEgressConfiguration egressConfiguration;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.egressConfiguration = software.amazon.jsii.Kernel.get(this, "egressConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceNetworkConfigurationEgressConfiguration.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.egressConfiguration = builder.egressConfiguration;
        }

        @Override
        public final imports.aws.apprunner.ApprunnerServiceNetworkConfigurationEgressConfiguration getEgressConfiguration() {
            return this.egressConfiguration;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEgressConfiguration() != null) {
                data.set("egressConfiguration", om.valueToTree(this.getEgressConfiguration()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.apprunner.ApprunnerServiceNetworkConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApprunnerServiceNetworkConfiguration.Jsii$Proxy that = (ApprunnerServiceNetworkConfiguration.Jsii$Proxy) o;

            return this.egressConfiguration != null ? this.egressConfiguration.equals(that.egressConfiguration) : that.egressConfiguration == null;
        }

        @Override
        public final int hashCode() {
            int result = this.egressConfiguration != null ? this.egressConfiguration.hashCode() : 0;
            return result;
        }
    }
}
