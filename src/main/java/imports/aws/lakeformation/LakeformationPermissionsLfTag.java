package imports.aws.lakeformation;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.695Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lakeformation.LakeformationPermissionsLfTag")
@software.amazon.jsii.Jsii.Proxy(LakeformationPermissionsLfTag.Jsii$Proxy.class)
public interface LakeformationPermissionsLfTag extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_permissions#key LakeformationPermissions#key}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKey();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_permissions#values LakeformationPermissions#values}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getValues();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_permissions#catalog_id LakeformationPermissions#catalog_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCatalogId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LakeformationPermissionsLfTag}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LakeformationPermissionsLfTag}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LakeformationPermissionsLfTag> {
        java.lang.String key;
        java.util.List<java.lang.String> values;
        java.lang.String catalogId;

        /**
         * Sets the value of {@link LakeformationPermissionsLfTag#getKey}
         * @param key Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_permissions#key LakeformationPermissions#key}. This parameter is required.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link LakeformationPermissionsLfTag#getValues}
         * @param values Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_permissions#values LakeformationPermissions#values}. This parameter is required.
         * @return {@code this}
         */
        public Builder values(java.util.List<java.lang.String> values) {
            this.values = values;
            return this;
        }

        /**
         * Sets the value of {@link LakeformationPermissionsLfTag#getCatalogId}
         * @param catalogId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_permissions#catalog_id LakeformationPermissions#catalog_id}.
         * @return {@code this}
         */
        public Builder catalogId(java.lang.String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LakeformationPermissionsLfTag}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LakeformationPermissionsLfTag build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LakeformationPermissionsLfTag}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LakeformationPermissionsLfTag {
        private final java.lang.String key;
        private final java.util.List<java.lang.String> values;
        private final java.lang.String catalogId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.values = software.amazon.jsii.Kernel.get(this, "values", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.catalogId = software.amazon.jsii.Kernel.get(this, "catalogId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = java.util.Objects.requireNonNull(builder.key, "key is required");
            this.values = java.util.Objects.requireNonNull(builder.values, "values is required");
            this.catalogId = builder.catalogId;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        public final java.util.List<java.lang.String> getValues() {
            return this.values;
        }

        @Override
        public final java.lang.String getCatalogId() {
            return this.catalogId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("key", om.valueToTree(this.getKey()));
            data.set("values", om.valueToTree(this.getValues()));
            if (this.getCatalogId() != null) {
                data.set("catalogId", om.valueToTree(this.getCatalogId()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.lakeformation.LakeformationPermissionsLfTag"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LakeformationPermissionsLfTag.Jsii$Proxy that = (LakeformationPermissionsLfTag.Jsii$Proxy) o;

            if (!key.equals(that.key)) return false;
            if (!values.equals(that.values)) return false;
            return this.catalogId != null ? this.catalogId.equals(that.catalogId) : that.catalogId == null;
        }

        @Override
        public final int hashCode() {
            int result = this.key.hashCode();
            result = 31 * result + (this.values.hashCode());
            result = 31 * result + (this.catalogId != null ? this.catalogId.hashCode() : 0);
            return result;
        }
    }
}
