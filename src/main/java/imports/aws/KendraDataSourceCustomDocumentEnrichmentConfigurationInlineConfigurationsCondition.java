package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.282Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsCondition")
@software.amazon.jsii.Jsii.Proxy(KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsCondition.Jsii$Proxy.class)
public interface KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsCondition extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kendra_data_source#condition_document_attribute_key KendraDataSource#condition_document_attribute_key}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getConditionDocumentAttributeKey();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kendra_data_source#operator KendraDataSource#operator}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getOperator();

    /**
     * condition_on_value block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kendra_data_source#condition_on_value KendraDataSource#condition_on_value}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsConditionConditionOnValue getConditionOnValue() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsCondition}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsCondition}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsCondition> {
        java.lang.String conditionDocumentAttributeKey;
        java.lang.String operator;
        imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsConditionConditionOnValue conditionOnValue;

        /**
         * Sets the value of {@link KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsCondition#getConditionDocumentAttributeKey}
         * @param conditionDocumentAttributeKey Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kendra_data_source#condition_document_attribute_key KendraDataSource#condition_document_attribute_key}. This parameter is required.
         * @return {@code this}
         */
        public Builder conditionDocumentAttributeKey(java.lang.String conditionDocumentAttributeKey) {
            this.conditionDocumentAttributeKey = conditionDocumentAttributeKey;
            return this;
        }

        /**
         * Sets the value of {@link KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsCondition#getOperator}
         * @param operator Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kendra_data_source#operator KendraDataSource#operator}. This parameter is required.
         * @return {@code this}
         */
        public Builder operator(java.lang.String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * Sets the value of {@link KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsCondition#getConditionOnValue}
         * @param conditionOnValue condition_on_value block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kendra_data_source#condition_on_value KendraDataSource#condition_on_value}
         * @return {@code this}
         */
        public Builder conditionOnValue(imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsConditionConditionOnValue conditionOnValue) {
            this.conditionOnValue = conditionOnValue;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsCondition}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsCondition build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsCondition}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsCondition {
        private final java.lang.String conditionDocumentAttributeKey;
        private final java.lang.String operator;
        private final imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsConditionConditionOnValue conditionOnValue;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.conditionDocumentAttributeKey = software.amazon.jsii.Kernel.get(this, "conditionDocumentAttributeKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.operator = software.amazon.jsii.Kernel.get(this, "operator", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.conditionOnValue = software.amazon.jsii.Kernel.get(this, "conditionOnValue", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsConditionConditionOnValue.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.conditionDocumentAttributeKey = java.util.Objects.requireNonNull(builder.conditionDocumentAttributeKey, "conditionDocumentAttributeKey is required");
            this.operator = java.util.Objects.requireNonNull(builder.operator, "operator is required");
            this.conditionOnValue = builder.conditionOnValue;
        }

        @Override
        public final java.lang.String getConditionDocumentAttributeKey() {
            return this.conditionDocumentAttributeKey;
        }

        @Override
        public final java.lang.String getOperator() {
            return this.operator;
        }

        @Override
        public final imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsConditionConditionOnValue getConditionOnValue() {
            return this.conditionOnValue;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("conditionDocumentAttributeKey", om.valueToTree(this.getConditionDocumentAttributeKey()));
            data.set("operator", om.valueToTree(this.getOperator()));
            if (this.getConditionOnValue() != null) {
                data.set("conditionOnValue", om.valueToTree(this.getConditionOnValue()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsCondition"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsCondition.Jsii$Proxy that = (KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsCondition.Jsii$Proxy) o;

            if (!conditionDocumentAttributeKey.equals(that.conditionDocumentAttributeKey)) return false;
            if (!operator.equals(that.operator)) return false;
            return this.conditionOnValue != null ? this.conditionOnValue.equals(that.conditionOnValue) : that.conditionOnValue == null;
        }

        @Override
        public final int hashCode() {
            int result = this.conditionDocumentAttributeKey.hashCode();
            result = 31 * result + (this.operator.hashCode());
            result = 31 * result + (this.conditionOnValue != null ? this.conditionOnValue.hashCode() : 0);
            return result;
        }
    }
}
