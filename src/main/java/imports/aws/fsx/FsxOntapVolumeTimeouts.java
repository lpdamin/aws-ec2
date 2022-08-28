package imports.aws.fsx;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.201Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.fsx.FsxOntapVolumeTimeouts")
@software.amazon.jsii.Jsii.Proxy(FsxOntapVolumeTimeouts.Jsii$Proxy.class)
public interface FsxOntapVolumeTimeouts extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_ontap_volume#create FsxOntapVolume#create}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCreate() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_ontap_volume#delete FsxOntapVolume#delete}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDelete() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_ontap_volume#update FsxOntapVolume#update}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUpdate() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link FsxOntapVolumeTimeouts}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FsxOntapVolumeTimeouts}
     */
    public static final class Builder implements software.amazon.jsii.Builder<FsxOntapVolumeTimeouts> {
        java.lang.String create;
        java.lang.String delete;
        java.lang.String update;

        /**
         * Sets the value of {@link FsxOntapVolumeTimeouts#getCreate}
         * @param create Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_ontap_volume#create FsxOntapVolume#create}.
         * @return {@code this}
         */
        public Builder create(java.lang.String create) {
            this.create = create;
            return this;
        }

        /**
         * Sets the value of {@link FsxOntapVolumeTimeouts#getDelete}
         * @param delete Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_ontap_volume#delete FsxOntapVolume#delete}.
         * @return {@code this}
         */
        public Builder delete(java.lang.String delete) {
            this.delete = delete;
            return this;
        }

        /**
         * Sets the value of {@link FsxOntapVolumeTimeouts#getUpdate}
         * @param update Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_ontap_volume#update FsxOntapVolume#update}.
         * @return {@code this}
         */
        public Builder update(java.lang.String update) {
            this.update = update;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link FsxOntapVolumeTimeouts}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public FsxOntapVolumeTimeouts build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link FsxOntapVolumeTimeouts}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FsxOntapVolumeTimeouts {
        private final java.lang.String create;
        private final java.lang.String delete;
        private final java.lang.String update;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.create = software.amazon.jsii.Kernel.get(this, "create", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.delete = software.amazon.jsii.Kernel.get(this, "delete", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.update = software.amazon.jsii.Kernel.get(this, "update", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.create = builder.create;
            this.delete = builder.delete;
            this.update = builder.update;
        }

        @Override
        public final java.lang.String getCreate() {
            return this.create;
        }

        @Override
        public final java.lang.String getDelete() {
            return this.delete;
        }

        @Override
        public final java.lang.String getUpdate() {
            return this.update;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCreate() != null) {
                data.set("create", om.valueToTree(this.getCreate()));
            }
            if (this.getDelete() != null) {
                data.set("delete", om.valueToTree(this.getDelete()));
            }
            if (this.getUpdate() != null) {
                data.set("update", om.valueToTree(this.getUpdate()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.fsx.FsxOntapVolumeTimeouts"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FsxOntapVolumeTimeouts.Jsii$Proxy that = (FsxOntapVolumeTimeouts.Jsii$Proxy) o;

            if (this.create != null ? !this.create.equals(that.create) : that.create != null) return false;
            if (this.delete != null ? !this.delete.equals(that.delete) : that.delete != null) return false;
            return this.update != null ? this.update.equals(that.update) : that.update == null;
        }

        @Override
        public final int hashCode() {
            int result = this.create != null ? this.create.hashCode() : 0;
            result = 31 * result + (this.delete != null ? this.delete.hashCode() : 0);
            result = 31 * result + (this.update != null ? this.update.hashCode() : 0);
            return result;
        }
    }
}
