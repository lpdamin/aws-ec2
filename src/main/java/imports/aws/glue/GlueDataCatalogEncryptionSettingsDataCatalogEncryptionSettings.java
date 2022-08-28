package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.331Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettings")
@software.amazon.jsii.Jsii.Proxy(GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettings.Jsii$Proxy.class)
public interface GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettings extends software.amazon.jsii.JsiiSerializable {

    /**
     * connection_password_encryption block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_data_catalog_encryption_settings#connection_password_encryption GlueDataCatalogEncryptionSettings#connection_password_encryption}
     */
    @org.jetbrains.annotations.NotNull imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption getConnectionPasswordEncryption();

    /**
     * encryption_at_rest block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_data_catalog_encryption_settings#encryption_at_rest GlueDataCatalogEncryptionSettings#encryption_at_rest}
     */
    @org.jetbrains.annotations.NotNull imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest getEncryptionAtRest();

    /**
     * @return a {@link Builder} of {@link GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettings> {
        imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption connectionPasswordEncryption;
        imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest encryptionAtRest;

        /**
         * Sets the value of {@link GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettings#getConnectionPasswordEncryption}
         * @param connectionPasswordEncryption connection_password_encryption block. This parameter is required.
         *                                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_data_catalog_encryption_settings#connection_password_encryption GlueDataCatalogEncryptionSettings#connection_password_encryption}
         * @return {@code this}
         */
        public Builder connectionPasswordEncryption(imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption connectionPasswordEncryption) {
            this.connectionPasswordEncryption = connectionPasswordEncryption;
            return this;
        }

        /**
         * Sets the value of {@link GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettings#getEncryptionAtRest}
         * @param encryptionAtRest encryption_at_rest block. This parameter is required.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_data_catalog_encryption_settings#encryption_at_rest GlueDataCatalogEncryptionSettings#encryption_at_rest}
         * @return {@code this}
         */
        public Builder encryptionAtRest(imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest encryptionAtRest) {
            this.encryptionAtRest = encryptionAtRest;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettings build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettings {
        private final imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption connectionPasswordEncryption;
        private final imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest encryptionAtRest;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.connectionPasswordEncryption = software.amazon.jsii.Kernel.get(this, "connectionPasswordEncryption", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption.class));
            this.encryptionAtRest = software.amazon.jsii.Kernel.get(this, "encryptionAtRest", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.connectionPasswordEncryption = java.util.Objects.requireNonNull(builder.connectionPasswordEncryption, "connectionPasswordEncryption is required");
            this.encryptionAtRest = java.util.Objects.requireNonNull(builder.encryptionAtRest, "encryptionAtRest is required");
        }

        @Override
        public final imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption getConnectionPasswordEncryption() {
            return this.connectionPasswordEncryption;
        }

        @Override
        public final imports.aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest getEncryptionAtRest() {
            return this.encryptionAtRest;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("connectionPasswordEncryption", om.valueToTree(this.getConnectionPasswordEncryption()));
            data.set("encryptionAtRest", om.valueToTree(this.getEncryptionAtRest()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.glue.GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettings.Jsii$Proxy that = (GlueDataCatalogEncryptionSettingsDataCatalogEncryptionSettings.Jsii$Proxy) o;

            if (!connectionPasswordEncryption.equals(that.connectionPasswordEncryption)) return false;
            return this.encryptionAtRest.equals(that.encryptionAtRest);
        }

        @Override
        public final int hashCode() {
            int result = this.connectionPasswordEncryption.hashCode();
            result = 31 * result + (this.encryptionAtRest.hashCode());
            return result;
        }
    }
}
