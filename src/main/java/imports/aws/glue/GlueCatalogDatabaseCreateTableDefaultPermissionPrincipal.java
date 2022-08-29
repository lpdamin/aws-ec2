package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.241Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal")
@software.amazon.jsii.Jsii.Proxy(GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal.Jsii$Proxy.class)
public interface GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_database#data_lake_principal_identifier GlueCatalogDatabase#data_lake_principal_identifier}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDataLakePrincipalIdentifier() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal> {
        java.lang.String dataLakePrincipalIdentifier;

        /**
         * Sets the value of {@link GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal#getDataLakePrincipalIdentifier}
         * @param dataLakePrincipalIdentifier Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_database#data_lake_principal_identifier GlueCatalogDatabase#data_lake_principal_identifier}.
         * @return {@code this}
         */
        public Builder dataLakePrincipalIdentifier(java.lang.String dataLakePrincipalIdentifier) {
            this.dataLakePrincipalIdentifier = dataLakePrincipalIdentifier;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal {
        private final java.lang.String dataLakePrincipalIdentifier;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.dataLakePrincipalIdentifier = software.amazon.jsii.Kernel.get(this, "dataLakePrincipalIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.dataLakePrincipalIdentifier = builder.dataLakePrincipalIdentifier;
        }

        @Override
        public final java.lang.String getDataLakePrincipalIdentifier() {
            return this.dataLakePrincipalIdentifier;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDataLakePrincipalIdentifier() != null) {
                data.set("dataLakePrincipalIdentifier", om.valueToTree(this.getDataLakePrincipalIdentifier()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.glue.GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal.Jsii$Proxy that = (GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal.Jsii$Proxy) o;

            return this.dataLakePrincipalIdentifier != null ? this.dataLakePrincipalIdentifier.equals(that.dataLakePrincipalIdentifier) : that.dataLakePrincipalIdentifier == null;
        }

        @Override
        public final int hashCode() {
            int result = this.dataLakePrincipalIdentifier != null ? this.dataLakePrincipalIdentifier.hashCode() : 0;
            return result;
        }
    }
}
