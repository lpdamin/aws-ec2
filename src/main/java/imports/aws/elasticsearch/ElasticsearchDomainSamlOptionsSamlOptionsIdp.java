package imports.aws.elasticsearch;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.009Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.elasticsearch.ElasticsearchDomainSamlOptionsSamlOptionsIdp")
@software.amazon.jsii.Jsii.Proxy(ElasticsearchDomainSamlOptionsSamlOptionsIdp.Jsii$Proxy.class)
public interface ElasticsearchDomainSamlOptionsSamlOptionsIdp extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elasticsearch_domain_saml_options#entity_id ElasticsearchDomainSamlOptions#entity_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getEntityId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elasticsearch_domain_saml_options#metadata_content ElasticsearchDomainSamlOptions#metadata_content}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getMetadataContent();

    /**
     * @return a {@link Builder} of {@link ElasticsearchDomainSamlOptionsSamlOptionsIdp}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticsearchDomainSamlOptionsSamlOptionsIdp}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticsearchDomainSamlOptionsSamlOptionsIdp> {
        java.lang.String entityId;
        java.lang.String metadataContent;

        /**
         * Sets the value of {@link ElasticsearchDomainSamlOptionsSamlOptionsIdp#getEntityId}
         * @param entityId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elasticsearch_domain_saml_options#entity_id ElasticsearchDomainSamlOptions#entity_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder entityId(java.lang.String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * Sets the value of {@link ElasticsearchDomainSamlOptionsSamlOptionsIdp#getMetadataContent}
         * @param metadataContent Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elasticsearch_domain_saml_options#metadata_content ElasticsearchDomainSamlOptions#metadata_content}. This parameter is required.
         * @return {@code this}
         */
        public Builder metadataContent(java.lang.String metadataContent) {
            this.metadataContent = metadataContent;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticsearchDomainSamlOptionsSamlOptionsIdp}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticsearchDomainSamlOptionsSamlOptionsIdp build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ElasticsearchDomainSamlOptionsSamlOptionsIdp}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticsearchDomainSamlOptionsSamlOptionsIdp {
        private final java.lang.String entityId;
        private final java.lang.String metadataContent;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.entityId = software.amazon.jsii.Kernel.get(this, "entityId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metadataContent = software.amazon.jsii.Kernel.get(this, "metadataContent", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.entityId = java.util.Objects.requireNonNull(builder.entityId, "entityId is required");
            this.metadataContent = java.util.Objects.requireNonNull(builder.metadataContent, "metadataContent is required");
        }

        @Override
        public final java.lang.String getEntityId() {
            return this.entityId;
        }

        @Override
        public final java.lang.String getMetadataContent() {
            return this.metadataContent;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("entityId", om.valueToTree(this.getEntityId()));
            data.set("metadataContent", om.valueToTree(this.getMetadataContent()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.elasticsearch.ElasticsearchDomainSamlOptionsSamlOptionsIdp"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticsearchDomainSamlOptionsSamlOptionsIdp.Jsii$Proxy that = (ElasticsearchDomainSamlOptionsSamlOptionsIdp.Jsii$Proxy) o;

            if (!entityId.equals(that.entityId)) return false;
            return this.metadataContent.equals(that.metadataContent);
        }

        @Override
        public final int hashCode() {
            int result = this.entityId.hashCode();
            result = 31 * result + (this.metadataContent.hashCode());
            return result;
        }
    }
}
