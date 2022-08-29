package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.241Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueCatalogDatabaseTargetDatabase")
@software.amazon.jsii.Jsii.Proxy(GlueCatalogDatabaseTargetDatabase.Jsii$Proxy.class)
public interface GlueCatalogDatabaseTargetDatabase extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_database#catalog_id GlueCatalogDatabase#catalog_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getCatalogId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_database#database_name GlueCatalogDatabase#database_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDatabaseName();

    /**
     * @return a {@link Builder} of {@link GlueCatalogDatabaseTargetDatabase}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueCatalogDatabaseTargetDatabase}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueCatalogDatabaseTargetDatabase> {
        java.lang.String catalogId;
        java.lang.String databaseName;

        /**
         * Sets the value of {@link GlueCatalogDatabaseTargetDatabase#getCatalogId}
         * @param catalogId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_database#catalog_id GlueCatalogDatabase#catalog_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder catalogId(java.lang.String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogDatabaseTargetDatabase#getDatabaseName}
         * @param databaseName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_database#database_name GlueCatalogDatabase#database_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder databaseName(java.lang.String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueCatalogDatabaseTargetDatabase}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueCatalogDatabaseTargetDatabase build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GlueCatalogDatabaseTargetDatabase}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueCatalogDatabaseTargetDatabase {
        private final java.lang.String catalogId;
        private final java.lang.String databaseName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.catalogId = software.amazon.jsii.Kernel.get(this, "catalogId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.databaseName = software.amazon.jsii.Kernel.get(this, "databaseName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.catalogId = java.util.Objects.requireNonNull(builder.catalogId, "catalogId is required");
            this.databaseName = java.util.Objects.requireNonNull(builder.databaseName, "databaseName is required");
        }

        @Override
        public final java.lang.String getCatalogId() {
            return this.catalogId;
        }

        @Override
        public final java.lang.String getDatabaseName() {
            return this.databaseName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("catalogId", om.valueToTree(this.getCatalogId()));
            data.set("databaseName", om.valueToTree(this.getDatabaseName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.glue.GlueCatalogDatabaseTargetDatabase"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueCatalogDatabaseTargetDatabase.Jsii$Proxy that = (GlueCatalogDatabaseTargetDatabase.Jsii$Proxy) o;

            if (!catalogId.equals(that.catalogId)) return false;
            return this.databaseName.equals(that.databaseName);
        }

        @Override
        public final int hashCode() {
            int result = this.catalogId.hashCode();
            result = 31 * result + (this.databaseName.hashCode());
            return result;
        }
    }
}
