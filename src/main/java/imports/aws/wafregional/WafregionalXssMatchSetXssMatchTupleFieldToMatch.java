package imports.aws.wafregional;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:51.113Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafregional.WafregionalXssMatchSetXssMatchTupleFieldToMatch")
@software.amazon.jsii.Jsii.Proxy(WafregionalXssMatchSetXssMatchTupleFieldToMatch.Jsii$Proxy.class)
public interface WafregionalXssMatchSetXssMatchTupleFieldToMatch extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafregional_xss_match_set#type WafregionalXssMatchSet#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafregional_xss_match_set#data WafregionalXssMatchSet#data}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getData() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link WafregionalXssMatchSetXssMatchTupleFieldToMatch}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WafregionalXssMatchSetXssMatchTupleFieldToMatch}
     */
    public static final class Builder implements software.amazon.jsii.Builder<WafregionalXssMatchSetXssMatchTupleFieldToMatch> {
        java.lang.String type;
        java.lang.String data;

        /**
         * Sets the value of {@link WafregionalXssMatchSetXssMatchTupleFieldToMatch#getType}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafregional_xss_match_set#type WafregionalXssMatchSet#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link WafregionalXssMatchSetXssMatchTupleFieldToMatch#getData}
         * @param data Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/wafregional_xss_match_set#data WafregionalXssMatchSet#data}.
         * @return {@code this}
         */
        public Builder data(java.lang.String data) {
            this.data = data;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link WafregionalXssMatchSetXssMatchTupleFieldToMatch}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public WafregionalXssMatchSetXssMatchTupleFieldToMatch build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link WafregionalXssMatchSetXssMatchTupleFieldToMatch}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WafregionalXssMatchSetXssMatchTupleFieldToMatch {
        private final java.lang.String type;
        private final java.lang.String data;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.data = software.amazon.jsii.Kernel.get(this, "data", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.data = builder.data;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getData() {
            return this.data;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getData() != null) {
                data.set("data", om.valueToTree(this.getData()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.wafregional.WafregionalXssMatchSetXssMatchTupleFieldToMatch"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WafregionalXssMatchSetXssMatchTupleFieldToMatch.Jsii$Proxy that = (WafregionalXssMatchSetXssMatchTupleFieldToMatch.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            return this.data != null ? this.data.equals(that.data) : that.data == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.data != null ? this.data.hashCode() : 0);
            return result;
        }
    }
}
