package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.345Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GluePartitionStorageDescriptorSerDeInfo")
@software.amazon.jsii.Jsii.Proxy(GluePartitionStorageDescriptorSerDeInfo.Jsii$Proxy.class)
public interface GluePartitionStorageDescriptorSerDeInfo extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#name GluePartition#name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#parameters GluePartition#parameters}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#serialization_library GluePartition#serialization_library}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSerializationLibrary() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GluePartitionStorageDescriptorSerDeInfo}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GluePartitionStorageDescriptorSerDeInfo}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GluePartitionStorageDescriptorSerDeInfo> {
        java.lang.String name;
        java.util.Map<java.lang.String, java.lang.String> parameters;
        java.lang.String serializationLibrary;

        /**
         * Sets the value of {@link GluePartitionStorageDescriptorSerDeInfo#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#name GluePartition#name}.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link GluePartitionStorageDescriptorSerDeInfo#getParameters}
         * @param parameters Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#parameters GluePartition#parameters}.
         * @return {@code this}
         */
        public Builder parameters(java.util.Map<java.lang.String, java.lang.String> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Sets the value of {@link GluePartitionStorageDescriptorSerDeInfo#getSerializationLibrary}
         * @param serializationLibrary Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#serialization_library GluePartition#serialization_library}.
         * @return {@code this}
         */
        public Builder serializationLibrary(java.lang.String serializationLibrary) {
            this.serializationLibrary = serializationLibrary;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GluePartitionStorageDescriptorSerDeInfo}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GluePartitionStorageDescriptorSerDeInfo build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GluePartitionStorageDescriptorSerDeInfo}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GluePartitionStorageDescriptorSerDeInfo {
        private final java.lang.String name;
        private final java.util.Map<java.lang.String, java.lang.String> parameters;
        private final java.lang.String serializationLibrary;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.parameters = software.amazon.jsii.Kernel.get(this, "parameters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.serializationLibrary = software.amazon.jsii.Kernel.get(this, "serializationLibrary", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = builder.name;
            this.parameters = builder.parameters;
            this.serializationLibrary = builder.serializationLibrary;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getParameters() {
            return this.parameters;
        }

        @Override
        public final java.lang.String getSerializationLibrary() {
            return this.serializationLibrary;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getParameters() != null) {
                data.set("parameters", om.valueToTree(this.getParameters()));
            }
            if (this.getSerializationLibrary() != null) {
                data.set("serializationLibrary", om.valueToTree(this.getSerializationLibrary()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.glue.GluePartitionStorageDescriptorSerDeInfo"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GluePartitionStorageDescriptorSerDeInfo.Jsii$Proxy that = (GluePartitionStorageDescriptorSerDeInfo.Jsii$Proxy) o;

            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.parameters != null ? !this.parameters.equals(that.parameters) : that.parameters != null) return false;
            return this.serializationLibrary != null ? this.serializationLibrary.equals(that.serializationLibrary) : that.serializationLibrary == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name != null ? this.name.hashCode() : 0;
            result = 31 * result + (this.parameters != null ? this.parameters.hashCode() : 0);
            result = 31 * result + (this.serializationLibrary != null ? this.serializationLibrary.hashCode() : 0);
            return result;
        }
    }
}
