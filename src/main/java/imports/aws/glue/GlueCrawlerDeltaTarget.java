package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.259Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueCrawlerDeltaTarget")
@software.amazon.jsii.Jsii.Proxy(GlueCrawlerDeltaTarget.Jsii$Proxy.class)
public interface GlueCrawlerDeltaTarget extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#connection_name GlueCrawler#connection_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getConnectionName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#delta_tables GlueCrawler#delta_tables}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getDeltaTables();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#write_manifest GlueCrawler#write_manifest}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getWriteManifest();

    /**
     * @return a {@link Builder} of {@link GlueCrawlerDeltaTarget}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlueCrawlerDeltaTarget}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlueCrawlerDeltaTarget> {
        java.lang.String connectionName;
        java.util.List<java.lang.String> deltaTables;
        java.lang.Object writeManifest;

        /**
         * Sets the value of {@link GlueCrawlerDeltaTarget#getConnectionName}
         * @param connectionName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#connection_name GlueCrawler#connection_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder connectionName(java.lang.String connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerDeltaTarget#getDeltaTables}
         * @param deltaTables Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#delta_tables GlueCrawler#delta_tables}. This parameter is required.
         * @return {@code this}
         */
        public Builder deltaTables(java.util.List<java.lang.String> deltaTables) {
            this.deltaTables = deltaTables;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerDeltaTarget#getWriteManifest}
         * @param writeManifest Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#write_manifest GlueCrawler#write_manifest}. This parameter is required.
         * @return {@code this}
         */
        public Builder writeManifest(java.lang.Boolean writeManifest) {
            this.writeManifest = writeManifest;
            return this;
        }

        /**
         * Sets the value of {@link GlueCrawlerDeltaTarget#getWriteManifest}
         * @param writeManifest Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_crawler#write_manifest GlueCrawler#write_manifest}. This parameter is required.
         * @return {@code this}
         */
        public Builder writeManifest(com.hashicorp.cdktf.IResolvable writeManifest) {
            this.writeManifest = writeManifest;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlueCrawlerDeltaTarget}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlueCrawlerDeltaTarget build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GlueCrawlerDeltaTarget}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlueCrawlerDeltaTarget {
        private final java.lang.String connectionName;
        private final java.util.List<java.lang.String> deltaTables;
        private final java.lang.Object writeManifest;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.connectionName = software.amazon.jsii.Kernel.get(this, "connectionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.deltaTables = software.amazon.jsii.Kernel.get(this, "deltaTables", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.writeManifest = software.amazon.jsii.Kernel.get(this, "writeManifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.connectionName = java.util.Objects.requireNonNull(builder.connectionName, "connectionName is required");
            this.deltaTables = java.util.Objects.requireNonNull(builder.deltaTables, "deltaTables is required");
            this.writeManifest = java.util.Objects.requireNonNull(builder.writeManifest, "writeManifest is required");
        }

        @Override
        public final java.lang.String getConnectionName() {
            return this.connectionName;
        }

        @Override
        public final java.util.List<java.lang.String> getDeltaTables() {
            return this.deltaTables;
        }

        @Override
        public final java.lang.Object getWriteManifest() {
            return this.writeManifest;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("connectionName", om.valueToTree(this.getConnectionName()));
            data.set("deltaTables", om.valueToTree(this.getDeltaTables()));
            data.set("writeManifest", om.valueToTree(this.getWriteManifest()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.glue.GlueCrawlerDeltaTarget"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlueCrawlerDeltaTarget.Jsii$Proxy that = (GlueCrawlerDeltaTarget.Jsii$Proxy) o;

            if (!connectionName.equals(that.connectionName)) return false;
            if (!deltaTables.equals(that.deltaTables)) return false;
            return this.writeManifest.equals(that.writeManifest);
        }

        @Override
        public final int hashCode() {
            int result = this.connectionName.hashCode();
            result = 31 * result + (this.deltaTables.hashCode());
            result = 31 * result + (this.writeManifest.hashCode());
            return result;
        }
    }
}
