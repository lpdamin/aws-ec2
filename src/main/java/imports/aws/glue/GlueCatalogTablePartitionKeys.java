package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.243Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueCatalogTablePartitionKeys")
@software.amazon.jsii.Jsii.Proxy(GlueCatalogTablePartitionKeys.Jsii$Proxy.class)
public interface GlueCatalogTablePartitionKeys extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#name GlueCatalogTable#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#comment GlueCatalogTable#comment}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getComment() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#type GlueCatalogTable#type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlueCatalogTablePartitionKeys}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueCatalogTablePartitionKeys}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueCatalogTablePartitionKeys> {
        java.lang.String name;
        java.lang.String comment;
        java.lang.String type;

        /**
         * Sets the value of {@link GlueCatalogTablePartitionKeys#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#name GlueCatalogTable#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTablePartitionKeys#getComment}
         * @param comment Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#comment GlueCatalogTable#comment}.
         * @return {@code this}
         */
        public Builder comment(java.lang.String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * Sets the value of {@link GlueCatalogTablePartitionKeys#getType}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_catalog_table#type GlueCatalogTable#type}.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueCatalogTablePartitionKeys}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueCatalogTablePartitionKeys build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GlueCatalogTablePartitionKeys}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueCatalogTablePartitionKeys {
        private final java.lang.String name;
        private final java.lang.String comment;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.comment = software.amazon.jsii.Kernel.get(this, "comment", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.comment = builder.comment;
            this.type = builder.type;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getComment() {
            return this.comment;
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

            data.set("name", om.valueToTree(this.getName()));
            if (this.getComment() != null) {
                data.set("comment", om.valueToTree(this.getComment()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.glue.GlueCatalogTablePartitionKeys"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueCatalogTablePartitionKeys.Jsii$Proxy that = (GlueCatalogTablePartitionKeys.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.comment != null ? !this.comment.equals(that.comment) : that.comment != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.comment != null ? this.comment.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
