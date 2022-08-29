package imports.aws.route53;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.353Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.route53.Route53RecoverycontrolconfigSafetyRuleRuleConfig")
@software.amazon.jsii.Jsii.Proxy(Route53RecoverycontrolconfigSafetyRuleRuleConfig.Jsii$Proxy.class)
public interface Route53RecoverycontrolconfigSafetyRuleRuleConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53recoverycontrolconfig_safety_rule#inverted Route53RecoverycontrolconfigSafetyRule#inverted}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getInverted();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53recoverycontrolconfig_safety_rule#threshold Route53RecoverycontrolconfigSafetyRule#threshold}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getThreshold();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53recoverycontrolconfig_safety_rule#type Route53RecoverycontrolconfigSafetyRule#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * @return a {@link Builder} of {@link Route53RecoverycontrolconfigSafetyRuleRuleConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Route53RecoverycontrolconfigSafetyRuleRuleConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Route53RecoverycontrolconfigSafetyRuleRuleConfig> {
        java.lang.Object inverted;
        java.lang.Number threshold;
        java.lang.String type;

        /**
         * Sets the value of {@link Route53RecoverycontrolconfigSafetyRuleRuleConfig#getInverted}
         * @param inverted Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53recoverycontrolconfig_safety_rule#inverted Route53RecoverycontrolconfigSafetyRule#inverted}. This parameter is required.
         * @return {@code this}
         */
        public Builder inverted(java.lang.Boolean inverted) {
            this.inverted = inverted;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecoverycontrolconfigSafetyRuleRuleConfig#getInverted}
         * @param inverted Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53recoverycontrolconfig_safety_rule#inverted Route53RecoverycontrolconfigSafetyRule#inverted}. This parameter is required.
         * @return {@code this}
         */
        public Builder inverted(com.hashicorp.cdktf.IResolvable inverted) {
            this.inverted = inverted;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecoverycontrolconfigSafetyRuleRuleConfig#getThreshold}
         * @param threshold Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53recoverycontrolconfig_safety_rule#threshold Route53RecoverycontrolconfigSafetyRule#threshold}. This parameter is required.
         * @return {@code this}
         */
        public Builder threshold(java.lang.Number threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * Sets the value of {@link Route53RecoverycontrolconfigSafetyRuleRuleConfig#getType}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53recoverycontrolconfig_safety_rule#type Route53RecoverycontrolconfigSafetyRule#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Route53RecoverycontrolconfigSafetyRuleRuleConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Route53RecoverycontrolconfigSafetyRuleRuleConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Route53RecoverycontrolconfigSafetyRuleRuleConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Route53RecoverycontrolconfigSafetyRuleRuleConfig {
        private final java.lang.Object inverted;
        private final java.lang.Number threshold;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.inverted = software.amazon.jsii.Kernel.get(this, "inverted", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.threshold = software.amazon.jsii.Kernel.get(this, "threshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.inverted = java.util.Objects.requireNonNull(builder.inverted, "inverted is required");
            this.threshold = java.util.Objects.requireNonNull(builder.threshold, "threshold is required");
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
        }

        @Override
        public final java.lang.Object getInverted() {
            return this.inverted;
        }

        @Override
        public final java.lang.Number getThreshold() {
            return this.threshold;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("inverted", om.valueToTree(this.getInverted()));
            data.set("threshold", om.valueToTree(this.getThreshold()));
            data.set("type", om.valueToTree(this.getType()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.route53.Route53RecoverycontrolconfigSafetyRuleRuleConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Route53RecoverycontrolconfigSafetyRuleRuleConfig.Jsii$Proxy that = (Route53RecoverycontrolconfigSafetyRuleRuleConfig.Jsii$Proxy) o;

            if (!inverted.equals(that.inverted)) return false;
            if (!threshold.equals(that.threshold)) return false;
            return this.type.equals(that.type);
        }

        @Override
        public final int hashCode() {
            int result = this.inverted.hashCode();
            result = 31 * result + (this.threshold.hashCode());
            result = 31 * result + (this.type.hashCode());
            return result;
        }
    }
}
