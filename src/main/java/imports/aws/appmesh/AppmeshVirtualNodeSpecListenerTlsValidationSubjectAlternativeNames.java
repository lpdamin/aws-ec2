package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.692Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNames")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNames.Jsii$Proxy.class)
public interface AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNames extends software.amazon.jsii.JsiiSerializable {

    /**
     * match block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#match AppmeshVirtualNode#match}
     */
    @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatch getMatch();

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNames}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNames}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNames> {
        imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatch match;

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNames#getMatch}
         * @param match match block. This parameter is required.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#match AppmeshVirtualNode#match}
         * @return {@code this}
         */
        public Builder match(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatch match) {
            this.match = match;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNames}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNames build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNames}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNames {
        private final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatch match;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.match = software.amazon.jsii.Kernel.get(this, "match", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatch.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.match = java.util.Objects.requireNonNull(builder.match, "match is required");
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatch getMatch() {
            return this.match;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("match", om.valueToTree(this.getMatch()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNames"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNames.Jsii$Proxy that = (AppmeshVirtualNodeSpecListenerTlsValidationSubjectAlternativeNames.Jsii$Proxy) o;

            return this.match.equals(that.match);
        }

        @Override
        public final int hashCode() {
            int result = this.match.hashCode();
            return result;
        }
    }
}
