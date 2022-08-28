package imports.aws.config;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.799Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.config.ConfigRemediationConfigurationExecutionControls")
@software.amazon.jsii.Jsii.Proxy(ConfigRemediationConfigurationExecutionControls.Jsii$Proxy.class)
public interface ConfigRemediationConfigurationExecutionControls extends software.amazon.jsii.JsiiSerializable {

    /**
     * ssm_controls block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#ssm_controls ConfigRemediationConfiguration#ssm_controls}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.config.ConfigRemediationConfigurationExecutionControlsSsmControls getSsmControls() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ConfigRemediationConfigurationExecutionControls}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ConfigRemediationConfigurationExecutionControls}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ConfigRemediationConfigurationExecutionControls> {
        imports.aws.config.ConfigRemediationConfigurationExecutionControlsSsmControls ssmControls;

        /**
         * Sets the value of {@link ConfigRemediationConfigurationExecutionControls#getSsmControls}
         * @param ssmControls ssm_controls block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#ssm_controls ConfigRemediationConfiguration#ssm_controls}
         * @return {@code this}
         */
        public Builder ssmControls(imports.aws.config.ConfigRemediationConfigurationExecutionControlsSsmControls ssmControls) {
            this.ssmControls = ssmControls;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ConfigRemediationConfigurationExecutionControls}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ConfigRemediationConfigurationExecutionControls build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ConfigRemediationConfigurationExecutionControls}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ConfigRemediationConfigurationExecutionControls {
        private final imports.aws.config.ConfigRemediationConfigurationExecutionControlsSsmControls ssmControls;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.ssmControls = software.amazon.jsii.Kernel.get(this, "ssmControls", software.amazon.jsii.NativeType.forClass(imports.aws.config.ConfigRemediationConfigurationExecutionControlsSsmControls.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.ssmControls = builder.ssmControls;
        }

        @Override
        public final imports.aws.config.ConfigRemediationConfigurationExecutionControlsSsmControls getSsmControls() {
            return this.ssmControls;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getSsmControls() != null) {
                data.set("ssmControls", om.valueToTree(this.getSsmControls()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.config.ConfigRemediationConfigurationExecutionControls"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ConfigRemediationConfigurationExecutionControls.Jsii$Proxy that = (ConfigRemediationConfigurationExecutionControls.Jsii$Proxy) o;

            return this.ssmControls != null ? this.ssmControls.equals(that.ssmControls) : that.ssmControls == null;
        }

        @Override
        public final int hashCode() {
            int result = this.ssmControls != null ? this.ssmControls.hashCode() : 0;
            return result;
        }
    }
}
