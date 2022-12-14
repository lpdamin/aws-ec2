package imports.aws.rds;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.228Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.rds.DbInstanceS3Import")
@software.amazon.jsii.Jsii.Proxy(DbInstanceS3Import.Jsii$Proxy.class)
public interface DbInstanceS3Import extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#bucket_name DbInstance#bucket_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getBucketName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#ingestion_role DbInstance#ingestion_role}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getIngestionRole();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#source_engine DbInstance#source_engine}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSourceEngine();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#source_engine_version DbInstance#source_engine_version}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSourceEngineVersion();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#bucket_prefix DbInstance#bucket_prefix}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBucketPrefix() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DbInstanceS3Import}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DbInstanceS3Import}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DbInstanceS3Import> {
        java.lang.String bucketName;
        java.lang.String ingestionRole;
        java.lang.String sourceEngine;
        java.lang.String sourceEngineVersion;
        java.lang.String bucketPrefix;

        /**
         * Sets the value of {@link DbInstanceS3Import#getBucketName}
         * @param bucketName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#bucket_name DbInstance#bucket_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder bucketName(java.lang.String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceS3Import#getIngestionRole}
         * @param ingestionRole Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#ingestion_role DbInstance#ingestion_role}. This parameter is required.
         * @return {@code this}
         */
        public Builder ingestionRole(java.lang.String ingestionRole) {
            this.ingestionRole = ingestionRole;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceS3Import#getSourceEngine}
         * @param sourceEngine Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#source_engine DbInstance#source_engine}. This parameter is required.
         * @return {@code this}
         */
        public Builder sourceEngine(java.lang.String sourceEngine) {
            this.sourceEngine = sourceEngine;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceS3Import#getSourceEngineVersion}
         * @param sourceEngineVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#source_engine_version DbInstance#source_engine_version}. This parameter is required.
         * @return {@code this}
         */
        public Builder sourceEngineVersion(java.lang.String sourceEngineVersion) {
            this.sourceEngineVersion = sourceEngineVersion;
            return this;
        }

        /**
         * Sets the value of {@link DbInstanceS3Import#getBucketPrefix}
         * @param bucketPrefix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/db_instance#bucket_prefix DbInstance#bucket_prefix}.
         * @return {@code this}
         */
        public Builder bucketPrefix(java.lang.String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DbInstanceS3Import}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DbInstanceS3Import build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DbInstanceS3Import}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DbInstanceS3Import {
        private final java.lang.String bucketName;
        private final java.lang.String ingestionRole;
        private final java.lang.String sourceEngine;
        private final java.lang.String sourceEngineVersion;
        private final java.lang.String bucketPrefix;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bucketName = software.amazon.jsii.Kernel.get(this, "bucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ingestionRole = software.amazon.jsii.Kernel.get(this, "ingestionRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceEngine = software.amazon.jsii.Kernel.get(this, "sourceEngine", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceEngineVersion = software.amazon.jsii.Kernel.get(this, "sourceEngineVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bucketPrefix = software.amazon.jsii.Kernel.get(this, "bucketPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucketName = java.util.Objects.requireNonNull(builder.bucketName, "bucketName is required");
            this.ingestionRole = java.util.Objects.requireNonNull(builder.ingestionRole, "ingestionRole is required");
            this.sourceEngine = java.util.Objects.requireNonNull(builder.sourceEngine, "sourceEngine is required");
            this.sourceEngineVersion = java.util.Objects.requireNonNull(builder.sourceEngineVersion, "sourceEngineVersion is required");
            this.bucketPrefix = builder.bucketPrefix;
        }

        @Override
        public final java.lang.String getBucketName() {
            return this.bucketName;
        }

        @Override
        public final java.lang.String getIngestionRole() {
            return this.ingestionRole;
        }

        @Override
        public final java.lang.String getSourceEngine() {
            return this.sourceEngine;
        }

        @Override
        public final java.lang.String getSourceEngineVersion() {
            return this.sourceEngineVersion;
        }

        @Override
        public final java.lang.String getBucketPrefix() {
            return this.bucketPrefix;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("bucketName", om.valueToTree(this.getBucketName()));
            data.set("ingestionRole", om.valueToTree(this.getIngestionRole()));
            data.set("sourceEngine", om.valueToTree(this.getSourceEngine()));
            data.set("sourceEngineVersion", om.valueToTree(this.getSourceEngineVersion()));
            if (this.getBucketPrefix() != null) {
                data.set("bucketPrefix", om.valueToTree(this.getBucketPrefix()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.rds.DbInstanceS3Import"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DbInstanceS3Import.Jsii$Proxy that = (DbInstanceS3Import.Jsii$Proxy) o;

            if (!bucketName.equals(that.bucketName)) return false;
            if (!ingestionRole.equals(that.ingestionRole)) return false;
            if (!sourceEngine.equals(that.sourceEngine)) return false;
            if (!sourceEngineVersion.equals(that.sourceEngineVersion)) return false;
            return this.bucketPrefix != null ? this.bucketPrefix.equals(that.bucketPrefix) : that.bucketPrefix == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucketName.hashCode();
            result = 31 * result + (this.ingestionRole.hashCode());
            result = 31 * result + (this.sourceEngine.hashCode());
            result = 31 * result + (this.sourceEngineVersion.hashCode());
            result = 31 * result + (this.bucketPrefix != null ? this.bucketPrefix.hashCode() : 0);
            return result;
        }
    }
}
