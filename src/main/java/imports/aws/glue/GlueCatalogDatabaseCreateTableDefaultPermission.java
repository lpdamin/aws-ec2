package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.241Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueCatalogDatabaseCreateTableDefaultPermission")
@software.amazon.jsii.Jsii.Proxy(GlueCatalogDatabaseCreateTableDefaultPermission.Jsii$Proxy.class)
public interface GlueCatalogDatabaseCreateTableDefaultPermission extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_database#permissions GlueCatalogDatabase#permissions}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPermissions() {
        return null;
    }

    /**
     * principal block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_catalog_database#principal GlueCatalogDatabase#principal}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.glue.GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal getPrincipal() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlueCatalogDatabaseCreateTableDefaultPermission}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueCatalogDatabaseCreateTableDefaultPermission}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueCatalogDatabaseCreateTableDefaultPermission> {
        java.util.List<java.lang.String> permissions;
        imports.aws.glue.GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal principal;

        /**
         * Sets the value of {@link GlueCatalogDatabaseCreateTableDefaultPermission#getPermissions}
         * @param permissions Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_database#permissions GlueCatalogDatabase#permissions}.
         * @return {@code this}
         */
        public Builder permissions(java.util.List<java.lang.String> permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogDatabaseCreateTableDefaultPermission#getPrincipal}
         * @param principal principal block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_catalog_database#principal GlueCatalogDatabase#principal}
         * @return {@code this}
         */
        public Builder principal(imports.aws.glue.GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal principal) {
            this.principal = principal;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueCatalogDatabaseCreateTableDefaultPermission}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueCatalogDatabaseCreateTableDefaultPermission build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GlueCatalogDatabaseCreateTableDefaultPermission}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueCatalogDatabaseCreateTableDefaultPermission {
        private final java.util.List<java.lang.String> permissions;
        private final imports.aws.glue.GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal principal;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.permissions = software.amazon.jsii.Kernel.get(this, "permissions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.principal = software.amazon.jsii.Kernel.get(this, "principal", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.permissions = builder.permissions;
            this.principal = builder.principal;
        }

        @Override
        public final java.util.List<java.lang.String> getPermissions() {
            return this.permissions;
        }

        @Override
        public final imports.aws.glue.GlueCatalogDatabaseCreateTableDefaultPermissionPrincipal getPrincipal() {
            return this.principal;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPermissions() != null) {
                data.set("permissions", om.valueToTree(this.getPermissions()));
            }
            if (this.getPrincipal() != null) {
                data.set("principal", om.valueToTree(this.getPrincipal()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.glue.GlueCatalogDatabaseCreateTableDefaultPermission"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueCatalogDatabaseCreateTableDefaultPermission.Jsii$Proxy that = (GlueCatalogDatabaseCreateTableDefaultPermission.Jsii$Proxy) o;

            if (this.permissions != null ? !this.permissions.equals(that.permissions) : that.permissions != null) return false;
            return this.principal != null ? this.principal.equals(that.principal) : that.principal == null;
        }

        @Override
        public final int hashCode() {
            int result = this.permissions != null ? this.permissions.hashCode() : 0;
            result = 31 * result + (this.principal != null ? this.principal.hashCode() : 0);
            return result;
        }
    }
}
