package imports.aws.datasync;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.349Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.datasync.DatasyncLocationFsxOpenzfsFileSystemProtocolNfsMountOptions")
@software.amazon.jsii.Jsii.Proxy(DatasyncLocationFsxOpenzfsFileSystemProtocolNfsMountOptions.Jsii$Proxy.class)
public interface DatasyncLocationFsxOpenzfsFileSystemProtocolNfsMountOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/datasync_location_fsx_openzfs_file_system#version DatasyncLocationFsxOpenzfsFileSystem#version}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DatasyncLocationFsxOpenzfsFileSystemProtocolNfsMountOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DatasyncLocationFsxOpenzfsFileSystemProtocolNfsMountOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DatasyncLocationFsxOpenzfsFileSystemProtocolNfsMountOptions> {
        java.lang.String version;

        /**
         * Sets the value of {@link DatasyncLocationFsxOpenzfsFileSystemProtocolNfsMountOptions#getVersion}
         * @param version Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/datasync_location_fsx_openzfs_file_system#version DatasyncLocationFsxOpenzfsFileSystem#version}.
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DatasyncLocationFsxOpenzfsFileSystemProtocolNfsMountOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DatasyncLocationFsxOpenzfsFileSystemProtocolNfsMountOptions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DatasyncLocationFsxOpenzfsFileSystemProtocolNfsMountOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DatasyncLocationFsxOpenzfsFileSystemProtocolNfsMountOptions {
        private final java.lang.String version;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.version = software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.version = builder.version;
        }

        @Override
        public final java.lang.String getVersion() {
            return this.version;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getVersion() != null) {
                data.set("version", om.valueToTree(this.getVersion()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.datasync.DatasyncLocationFsxOpenzfsFileSystemProtocolNfsMountOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DatasyncLocationFsxOpenzfsFileSystemProtocolNfsMountOptions.Jsii$Proxy that = (DatasyncLocationFsxOpenzfsFileSystemProtocolNfsMountOptions.Jsii$Proxy) o;

            return this.version != null ? this.version.equals(that.version) : that.version == null;
        }

        @Override
        public final int hashCode() {
            int result = this.version != null ? this.version.hashCode() : 0;
            return result;
        }
    }
}
