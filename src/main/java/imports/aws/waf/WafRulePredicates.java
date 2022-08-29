package imports.aws.waf;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:51.069Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.waf.WafRulePredicates")
@software.amazon.jsii.Jsii.Proxy(WafRulePredicates.Jsii$Proxy.class)
public interface WafRulePredicates extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/waf_rule#data_id WafRule#data_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDataId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/waf_rule#negated WafRule#negated}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getNegated();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/waf_rule#type WafRule#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * @return a {@link Builder} of {@link WafRulePredicates}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WafRulePredicates}
     */
    public static final class Builder implements software.amazon.jsii.Builder<WafRulePredicates> {
        java.lang.String dataId;
        java.lang.Object negated;
        java.lang.String type;

        /**
         * Sets the value of {@link WafRulePredicates#getDataId}
         * @param dataId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/waf_rule#data_id WafRule#data_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder dataId(java.lang.String dataId) {
            this.dataId = dataId;
            return this;
        }

        /**
         * Sets the value of {@link WafRulePredicates#getNegated}
         * @param negated Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/waf_rule#negated WafRule#negated}. This parameter is required.
         * @return {@code this}
         */
        public Builder negated(java.lang.Boolean negated) {
            this.negated = negated;
            return this;
        }

        /**
         * Sets the value of {@link WafRulePredicates#getNegated}
         * @param negated Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/waf_rule#negated WafRule#negated}. This parameter is required.
         * @return {@code this}
         */
        public Builder negated(com.hashicorp.cdktf.IResolvable negated) {
            this.negated = negated;
            return this;
        }

        /**
         * Sets the value of {@link WafRulePredicates#getType}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/waf_rule#type WafRule#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link WafRulePredicates}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public WafRulePredicates build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link WafRulePredicates}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WafRulePredicates {
        private final java.lang.String dataId;
        private final java.lang.Object negated;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.dataId = software.amazon.jsii.Kernel.get(this, "dataId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.negated = software.amazon.jsii.Kernel.get(this, "negated", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.dataId = java.util.Objects.requireNonNull(builder.dataId, "dataId is required");
            this.negated = java.util.Objects.requireNonNull(builder.negated, "negated is required");
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
        }

        @Override
        public final java.lang.String getDataId() {
            return this.dataId;
        }

        @Override
        public final java.lang.Object getNegated() {
            return this.negated;
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

            data.set("dataId", om.valueToTree(this.getDataId()));
            data.set("negated", om.valueToTree(this.getNegated()));
            data.set("type", om.valueToTree(this.getType()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.waf.WafRulePredicates"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WafRulePredicates.Jsii$Proxy that = (WafRulePredicates.Jsii$Proxy) o;

            if (!dataId.equals(that.dataId)) return false;
            if (!negated.equals(that.negated)) return false;
            return this.type.equals(that.type);
        }

        @Override
        public final int hashCode() {
            int result = this.dataId.hashCode();
            result = 31 * result + (this.negated.hashCode());
            result = 31 * result + (this.type.hashCode());
            return result;
        }
    }
}
