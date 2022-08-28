package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.502Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfig")
@software.amazon.jsii.Jsii.Proxy(SagemakerFeatureGroupOfflineStoreConfig.Jsii$Proxy.class)
public interface SagemakerFeatureGroupOfflineStoreConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * s3_storage_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#s3_storage_config SagemakerFeatureGroup#s3_storage_config}
     */
    @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigS3StorageConfig getS3StorageConfig();

    /**
     * data_catalog_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#data_catalog_config SagemakerFeatureGroup#data_catalog_config}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigDataCatalogConfig getDataCatalogConfig() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#disable_glue_table_creation SagemakerFeatureGroup#disable_glue_table_creation}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDisableGlueTableCreation() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SagemakerFeatureGroupOfflineStoreConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SagemakerFeatureGroupOfflineStoreConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SagemakerFeatureGroupOfflineStoreConfig> {
        imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigS3StorageConfig s3StorageConfig;
        imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigDataCatalogConfig dataCatalogConfig;
        java.lang.Object disableGlueTableCreation;

        /**
         * Sets the value of {@link SagemakerFeatureGroupOfflineStoreConfig#getS3StorageConfig}
         * @param s3StorageConfig s3_storage_config block. This parameter is required.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#s3_storage_config SagemakerFeatureGroup#s3_storage_config}
         * @return {@code this}
         */
        public Builder s3StorageConfig(imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigS3StorageConfig s3StorageConfig) {
            this.s3StorageConfig = s3StorageConfig;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerFeatureGroupOfflineStoreConfig#getDataCatalogConfig}
         * @param dataCatalogConfig data_catalog_config block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#data_catalog_config SagemakerFeatureGroup#data_catalog_config}
         * @return {@code this}
         */
        public Builder dataCatalogConfig(imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigDataCatalogConfig dataCatalogConfig) {
            this.dataCatalogConfig = dataCatalogConfig;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerFeatureGroupOfflineStoreConfig#getDisableGlueTableCreation}
         * @param disableGlueTableCreation Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#disable_glue_table_creation SagemakerFeatureGroup#disable_glue_table_creation}.
         * @return {@code this}
         */
        public Builder disableGlueTableCreation(java.lang.Boolean disableGlueTableCreation) {
            this.disableGlueTableCreation = disableGlueTableCreation;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerFeatureGroupOfflineStoreConfig#getDisableGlueTableCreation}
         * @param disableGlueTableCreation Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#disable_glue_table_creation SagemakerFeatureGroup#disable_glue_table_creation}.
         * @return {@code this}
         */
        public Builder disableGlueTableCreation(com.hashicorp.cdktf.IResolvable disableGlueTableCreation) {
            this.disableGlueTableCreation = disableGlueTableCreation;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SagemakerFeatureGroupOfflineStoreConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SagemakerFeatureGroupOfflineStoreConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SagemakerFeatureGroupOfflineStoreConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SagemakerFeatureGroupOfflineStoreConfig {
        private final imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigS3StorageConfig s3StorageConfig;
        private final imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigDataCatalogConfig dataCatalogConfig;
        private final java.lang.Object disableGlueTableCreation;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.s3StorageConfig = software.amazon.jsii.Kernel.get(this, "s3StorageConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigS3StorageConfig.class));
            this.dataCatalogConfig = software.amazon.jsii.Kernel.get(this, "dataCatalogConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigDataCatalogConfig.class));
            this.disableGlueTableCreation = software.amazon.jsii.Kernel.get(this, "disableGlueTableCreation", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.s3StorageConfig = java.util.Objects.requireNonNull(builder.s3StorageConfig, "s3StorageConfig is required");
            this.dataCatalogConfig = builder.dataCatalogConfig;
            this.disableGlueTableCreation = builder.disableGlueTableCreation;
        }

        @Override
        public final imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigS3StorageConfig getS3StorageConfig() {
            return this.s3StorageConfig;
        }

        @Override
        public final imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigDataCatalogConfig getDataCatalogConfig() {
            return this.dataCatalogConfig;
        }

        @Override
        public final java.lang.Object getDisableGlueTableCreation() {
            return this.disableGlueTableCreation;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("s3StorageConfig", om.valueToTree(this.getS3StorageConfig()));
            if (this.getDataCatalogConfig() != null) {
                data.set("dataCatalogConfig", om.valueToTree(this.getDataCatalogConfig()));
            }
            if (this.getDisableGlueTableCreation() != null) {
                data.set("disableGlueTableCreation", om.valueToTree(this.getDisableGlueTableCreation()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SagemakerFeatureGroupOfflineStoreConfig.Jsii$Proxy that = (SagemakerFeatureGroupOfflineStoreConfig.Jsii$Proxy) o;

            if (!s3StorageConfig.equals(that.s3StorageConfig)) return false;
            if (this.dataCatalogConfig != null ? !this.dataCatalogConfig.equals(that.dataCatalogConfig) : that.dataCatalogConfig != null) return false;
            return this.disableGlueTableCreation != null ? this.disableGlueTableCreation.equals(that.disableGlueTableCreation) : that.disableGlueTableCreation == null;
        }

        @Override
        public final int hashCode() {
            int result = this.s3StorageConfig.hashCode();
            result = 31 * result + (this.dataCatalogConfig != null ? this.dataCatalogConfig.hashCode() : 0);
            result = 31 * result + (this.disableGlueTableCreation != null ? this.disableGlueTableCreation.hashCode() : 0);
            return result;
        }
    }
}
