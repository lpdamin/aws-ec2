package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.279Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GluePartitionStorageDescriptor")
@software.amazon.jsii.Jsii.Proxy(GluePartitionStorageDescriptor.Jsii$Proxy.class)
public interface GluePartitionStorageDescriptor extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#bucket_columns GluePartition#bucket_columns}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getBucketColumns() {
        return null;
    }

    /**
     * columns block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_partition#columns GluePartition#columns}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getColumns() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#compressed GluePartition#compressed}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getCompressed() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#input_format GluePartition#input_format}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getInputFormat() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#location GluePartition#location}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLocation() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#number_of_buckets GluePartition#number_of_buckets}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getNumberOfBuckets() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#output_format GluePartition#output_format}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getOutputFormat() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#parameters GluePartition#parameters}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return null;
    }

    /**
     * ser_de_info block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_partition#ser_de_info GluePartition#ser_de_info}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.glue.GluePartitionStorageDescriptorSerDeInfo getSerDeInfo() {
        return null;
    }

    /**
     * skewed_info block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_partition#skewed_info GluePartition#skewed_info}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.glue.GluePartitionStorageDescriptorSkewedInfo getSkewedInfo() {
        return null;
    }

    /**
     * sort_columns block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_partition#sort_columns GluePartition#sort_columns}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSortColumns() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#stored_as_sub_directories GluePartition#stored_as_sub_directories}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getStoredAsSubDirectories() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GluePartitionStorageDescriptor}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GluePartitionStorageDescriptor}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GluePartitionStorageDescriptor> {
        java.util.List<java.lang.String> bucketColumns;
        java.lang.Object columns;
        java.lang.Object compressed;
        java.lang.String inputFormat;
        java.lang.String location;
        java.lang.Number numberOfBuckets;
        java.lang.String outputFormat;
        java.util.Map<java.lang.String, java.lang.String> parameters;
        imports.aws.glue.GluePartitionStorageDescriptorSerDeInfo serDeInfo;
        imports.aws.glue.GluePartitionStorageDescriptorSkewedInfo skewedInfo;
        java.lang.Object sortColumns;
        java.lang.Object storedAsSubDirectories;

        /**
         * Sets the value of {@link GluePartitionStorageDescriptor#getBucketColumns}
         * @param bucketColumns Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#bucket_columns GluePartition#bucket_columns}.
         * @return {@code this}
         */
        public Builder bucketColumns(java.util.List<java.lang.String> bucketColumns) {
            this.bucketColumns = bucketColumns;
            return this;
        }

        /**
         * Sets the value of {@link GluePartitionStorageDescriptor#getColumns}
         * @param columns columns block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_partition#columns GluePartition#columns}
         * @return {@code this}
         */
        public Builder columns(com.hashicorp.cdktf.IResolvable columns) {
            this.columns = columns;
            return this;
        }

        /**
         * Sets the value of {@link GluePartitionStorageDescriptor#getColumns}
         * @param columns columns block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_partition#columns GluePartition#columns}
         * @return {@code this}
         */
        public Builder columns(java.util.List<? extends imports.aws.glue.GluePartitionStorageDescriptorColumns> columns) {
            this.columns = columns;
            return this;
        }

        /**
         * Sets the value of {@link GluePartitionStorageDescriptor#getCompressed}
         * @param compressed Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#compressed GluePartition#compressed}.
         * @return {@code this}
         */
        public Builder compressed(java.lang.Boolean compressed) {
            this.compressed = compressed;
            return this;
        }

        /**
         * Sets the value of {@link GluePartitionStorageDescriptor#getCompressed}
         * @param compressed Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#compressed GluePartition#compressed}.
         * @return {@code this}
         */
        public Builder compressed(com.hashicorp.cdktf.IResolvable compressed) {
            this.compressed = compressed;
            return this;
        }

        /**
         * Sets the value of {@link GluePartitionStorageDescriptor#getInputFormat}
         * @param inputFormat Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#input_format GluePartition#input_format}.
         * @return {@code this}
         */
        public Builder inputFormat(java.lang.String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }

        /**
         * Sets the value of {@link GluePartitionStorageDescriptor#getLocation}
         * @param location Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#location GluePartition#location}.
         * @return {@code this}
         */
        public Builder location(java.lang.String location) {
            this.location = location;
            return this;
        }

        /**
         * Sets the value of {@link GluePartitionStorageDescriptor#getNumberOfBuckets}
         * @param numberOfBuckets Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#number_of_buckets GluePartition#number_of_buckets}.
         * @return {@code this}
         */
        public Builder numberOfBuckets(java.lang.Number numberOfBuckets) {
            this.numberOfBuckets = numberOfBuckets;
            return this;
        }

        /**
         * Sets the value of {@link GluePartitionStorageDescriptor#getOutputFormat}
         * @param outputFormat Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#output_format GluePartition#output_format}.
         * @return {@code this}
         */
        public Builder outputFormat(java.lang.String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }

        /**
         * Sets the value of {@link GluePartitionStorageDescriptor#getParameters}
         * @param parameters Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#parameters GluePartition#parameters}.
         * @return {@code this}
         */
        public Builder parameters(java.util.Map<java.lang.String, java.lang.String> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Sets the value of {@link GluePartitionStorageDescriptor#getSerDeInfo}
         * @param serDeInfo ser_de_info block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_partition#ser_de_info GluePartition#ser_de_info}
         * @return {@code this}
         */
        public Builder serDeInfo(imports.aws.glue.GluePartitionStorageDescriptorSerDeInfo serDeInfo) {
            this.serDeInfo = serDeInfo;
            return this;
        }

        /**
         * Sets the value of {@link GluePartitionStorageDescriptor#getSkewedInfo}
         * @param skewedInfo skewed_info block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_partition#skewed_info GluePartition#skewed_info}
         * @return {@code this}
         */
        public Builder skewedInfo(imports.aws.glue.GluePartitionStorageDescriptorSkewedInfo skewedInfo) {
            this.skewedInfo = skewedInfo;
            return this;
        }

        /**
         * Sets the value of {@link GluePartitionStorageDescriptor#getSortColumns}
         * @param sortColumns sort_columns block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_partition#sort_columns GluePartition#sort_columns}
         * @return {@code this}
         */
        public Builder sortColumns(com.hashicorp.cdktf.IResolvable sortColumns) {
            this.sortColumns = sortColumns;
            return this;
        }

        /**
         * Sets the value of {@link GluePartitionStorageDescriptor#getSortColumns}
         * @param sortColumns sort_columns block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/glue_partition#sort_columns GluePartition#sort_columns}
         * @return {@code this}
         */
        public Builder sortColumns(java.util.List<? extends imports.aws.glue.GluePartitionStorageDescriptorSortColumns> sortColumns) {
            this.sortColumns = sortColumns;
            return this;
        }

        /**
         * Sets the value of {@link GluePartitionStorageDescriptor#getStoredAsSubDirectories}
         * @param storedAsSubDirectories Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#stored_as_sub_directories GluePartition#stored_as_sub_directories}.
         * @return {@code this}
         */
        public Builder storedAsSubDirectories(java.lang.Boolean storedAsSubDirectories) {
            this.storedAsSubDirectories = storedAsSubDirectories;
            return this;
        }

        /**
         * Sets the value of {@link GluePartitionStorageDescriptor#getStoredAsSubDirectories}
         * @param storedAsSubDirectories Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/glue_partition#stored_as_sub_directories GluePartition#stored_as_sub_directories}.
         * @return {@code this}
         */
        public Builder storedAsSubDirectories(com.hashicorp.cdktf.IResolvable storedAsSubDirectories) {
            this.storedAsSubDirectories = storedAsSubDirectories;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GluePartitionStorageDescriptor}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GluePartitionStorageDescriptor build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GluePartitionStorageDescriptor}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GluePartitionStorageDescriptor {
        private final java.util.List<java.lang.String> bucketColumns;
        private final java.lang.Object columns;
        private final java.lang.Object compressed;
        private final java.lang.String inputFormat;
        private final java.lang.String location;
        private final java.lang.Number numberOfBuckets;
        private final java.lang.String outputFormat;
        private final java.util.Map<java.lang.String, java.lang.String> parameters;
        private final imports.aws.glue.GluePartitionStorageDescriptorSerDeInfo serDeInfo;
        private final imports.aws.glue.GluePartitionStorageDescriptorSkewedInfo skewedInfo;
        private final java.lang.Object sortColumns;
        private final java.lang.Object storedAsSubDirectories;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bucketColumns = software.amazon.jsii.Kernel.get(this, "bucketColumns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.columns = software.amazon.jsii.Kernel.get(this, "columns", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.compressed = software.amazon.jsii.Kernel.get(this, "compressed", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.inputFormat = software.amazon.jsii.Kernel.get(this, "inputFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.location = software.amazon.jsii.Kernel.get(this, "location", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.numberOfBuckets = software.amazon.jsii.Kernel.get(this, "numberOfBuckets", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.outputFormat = software.amazon.jsii.Kernel.get(this, "outputFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.parameters = software.amazon.jsii.Kernel.get(this, "parameters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.serDeInfo = software.amazon.jsii.Kernel.get(this, "serDeInfo", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GluePartitionStorageDescriptorSerDeInfo.class));
            this.skewedInfo = software.amazon.jsii.Kernel.get(this, "skewedInfo", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GluePartitionStorageDescriptorSkewedInfo.class));
            this.sortColumns = software.amazon.jsii.Kernel.get(this, "sortColumns", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.storedAsSubDirectories = software.amazon.jsii.Kernel.get(this, "storedAsSubDirectories", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bucketColumns = builder.bucketColumns;
            this.columns = builder.columns;
            this.compressed = builder.compressed;
            this.inputFormat = builder.inputFormat;
            this.location = builder.location;
            this.numberOfBuckets = builder.numberOfBuckets;
            this.outputFormat = builder.outputFormat;
            this.parameters = builder.parameters;
            this.serDeInfo = builder.serDeInfo;
            this.skewedInfo = builder.skewedInfo;
            this.sortColumns = builder.sortColumns;
            this.storedAsSubDirectories = builder.storedAsSubDirectories;
        }

        @Override
        public final java.util.List<java.lang.String> getBucketColumns() {
            return this.bucketColumns;
        }

        @Override
        public final java.lang.Object getColumns() {
            return this.columns;
        }

        @Override
        public final java.lang.Object getCompressed() {
            return this.compressed;
        }

        @Override
        public final java.lang.String getInputFormat() {
            return this.inputFormat;
        }

        @Override
        public final java.lang.String getLocation() {
            return this.location;
        }

        @Override
        public final java.lang.Number getNumberOfBuckets() {
            return this.numberOfBuckets;
        }

        @Override
        public final java.lang.String getOutputFormat() {
            return this.outputFormat;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getParameters() {
            return this.parameters;
        }

        @Override
        public final imports.aws.glue.GluePartitionStorageDescriptorSerDeInfo getSerDeInfo() {
            return this.serDeInfo;
        }

        @Override
        public final imports.aws.glue.GluePartitionStorageDescriptorSkewedInfo getSkewedInfo() {
            return this.skewedInfo;
        }

        @Override
        public final java.lang.Object getSortColumns() {
            return this.sortColumns;
        }

        @Override
        public final java.lang.Object getStoredAsSubDirectories() {
            return this.storedAsSubDirectories;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBucketColumns() != null) {
                data.set("bucketColumns", om.valueToTree(this.getBucketColumns()));
            }
            if (this.getColumns() != null) {
                data.set("columns", om.valueToTree(this.getColumns()));
            }
            if (this.getCompressed() != null) {
                data.set("compressed", om.valueToTree(this.getCompressed()));
            }
            if (this.getInputFormat() != null) {
                data.set("inputFormat", om.valueToTree(this.getInputFormat()));
            }
            if (this.getLocation() != null) {
                data.set("location", om.valueToTree(this.getLocation()));
            }
            if (this.getNumberOfBuckets() != null) {
                data.set("numberOfBuckets", om.valueToTree(this.getNumberOfBuckets()));
            }
            if (this.getOutputFormat() != null) {
                data.set("outputFormat", om.valueToTree(this.getOutputFormat()));
            }
            if (this.getParameters() != null) {
                data.set("parameters", om.valueToTree(this.getParameters()));
            }
            if (this.getSerDeInfo() != null) {
                data.set("serDeInfo", om.valueToTree(this.getSerDeInfo()));
            }
            if (this.getSkewedInfo() != null) {
                data.set("skewedInfo", om.valueToTree(this.getSkewedInfo()));
            }
            if (this.getSortColumns() != null) {
                data.set("sortColumns", om.valueToTree(this.getSortColumns()));
            }
            if (this.getStoredAsSubDirectories() != null) {
                data.set("storedAsSubDirectories", om.valueToTree(this.getStoredAsSubDirectories()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.glue.GluePartitionStorageDescriptor"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GluePartitionStorageDescriptor.Jsii$Proxy that = (GluePartitionStorageDescriptor.Jsii$Proxy) o;

            if (this.bucketColumns != null ? !this.bucketColumns.equals(that.bucketColumns) : that.bucketColumns != null) return false;
            if (this.columns != null ? !this.columns.equals(that.columns) : that.columns != null) return false;
            if (this.compressed != null ? !this.compressed.equals(that.compressed) : that.compressed != null) return false;
            if (this.inputFormat != null ? !this.inputFormat.equals(that.inputFormat) : that.inputFormat != null) return false;
            if (this.location != null ? !this.location.equals(that.location) : that.location != null) return false;
            if (this.numberOfBuckets != null ? !this.numberOfBuckets.equals(that.numberOfBuckets) : that.numberOfBuckets != null) return false;
            if (this.outputFormat != null ? !this.outputFormat.equals(that.outputFormat) : that.outputFormat != null) return false;
            if (this.parameters != null ? !this.parameters.equals(that.parameters) : that.parameters != null) return false;
            if (this.serDeInfo != null ? !this.serDeInfo.equals(that.serDeInfo) : that.serDeInfo != null) return false;
            if (this.skewedInfo != null ? !this.skewedInfo.equals(that.skewedInfo) : that.skewedInfo != null) return false;
            if (this.sortColumns != null ? !this.sortColumns.equals(that.sortColumns) : that.sortColumns != null) return false;
            return this.storedAsSubDirectories != null ? this.storedAsSubDirectories.equals(that.storedAsSubDirectories) : that.storedAsSubDirectories == null;
        }

        @Override
        public final int hashCode() {
            int result = this.bucketColumns != null ? this.bucketColumns.hashCode() : 0;
            result = 31 * result + (this.columns != null ? this.columns.hashCode() : 0);
            result = 31 * result + (this.compressed != null ? this.compressed.hashCode() : 0);
            result = 31 * result + (this.inputFormat != null ? this.inputFormat.hashCode() : 0);
            result = 31 * result + (this.location != null ? this.location.hashCode() : 0);
            result = 31 * result + (this.numberOfBuckets != null ? this.numberOfBuckets.hashCode() : 0);
            result = 31 * result + (this.outputFormat != null ? this.outputFormat.hashCode() : 0);
            result = 31 * result + (this.parameters != null ? this.parameters.hashCode() : 0);
            result = 31 * result + (this.serDeInfo != null ? this.serDeInfo.hashCode() : 0);
            result = 31 * result + (this.skewedInfo != null ? this.skewedInfo.hashCode() : 0);
            result = 31 * result + (this.sortColumns != null ? this.sortColumns.hashCode() : 0);
            result = 31 * result + (this.storedAsSubDirectories != null ? this.storedAsSubDirectories.hashCode() : 0);
            return result;
        }
    }
}
