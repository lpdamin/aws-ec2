package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.280Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GluePartitionStorageDescriptorOutputReference")
public class GluePartitionStorageDescriptorOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GluePartitionStorageDescriptorOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GluePartitionStorageDescriptorOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GluePartitionStorageDescriptorOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putColumns(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putColumns", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSerDeInfo(final @org.jetbrains.annotations.NotNull imports.aws.glue.GluePartitionStorageDescriptorSerDeInfo value) {
        software.amazon.jsii.Kernel.call(this, "putSerDeInfo", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSkewedInfo(final @org.jetbrains.annotations.NotNull imports.aws.glue.GluePartitionStorageDescriptorSkewedInfo value) {
        software.amazon.jsii.Kernel.call(this, "putSkewedInfo", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSortColumns(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSortColumns", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetBucketColumns() {
        software.amazon.jsii.Kernel.call(this, "resetBucketColumns", software.amazon.jsii.NativeType.VOID);
    }

    public void resetColumns() {
        software.amazon.jsii.Kernel.call(this, "resetColumns", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCompressed() {
        software.amazon.jsii.Kernel.call(this, "resetCompressed", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInputFormat() {
        software.amazon.jsii.Kernel.call(this, "resetInputFormat", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLocation() {
        software.amazon.jsii.Kernel.call(this, "resetLocation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNumberOfBuckets() {
        software.amazon.jsii.Kernel.call(this, "resetNumberOfBuckets", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOutputFormat() {
        software.amazon.jsii.Kernel.call(this, "resetOutputFormat", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParameters() {
        software.amazon.jsii.Kernel.call(this, "resetParameters", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSerDeInfo() {
        software.amazon.jsii.Kernel.call(this, "resetSerDeInfo", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSkewedInfo() {
        software.amazon.jsii.Kernel.call(this, "resetSkewedInfo", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSortColumns() {
        software.amazon.jsii.Kernel.call(this, "resetSortColumns", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStoredAsSubDirectories() {
        software.amazon.jsii.Kernel.call(this, "resetStoredAsSubDirectories", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GluePartitionStorageDescriptorColumnsList getColumns() {
        return software.amazon.jsii.Kernel.get(this, "columns", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GluePartitionStorageDescriptorColumnsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GluePartitionStorageDescriptorSerDeInfoOutputReference getSerDeInfo() {
        return software.amazon.jsii.Kernel.get(this, "serDeInfo", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GluePartitionStorageDescriptorSerDeInfoOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GluePartitionStorageDescriptorSkewedInfoOutputReference getSkewedInfo() {
        return software.amazon.jsii.Kernel.get(this, "skewedInfo", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GluePartitionStorageDescriptorSkewedInfoOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GluePartitionStorageDescriptorSortColumnsList getSortColumns() {
        return software.amazon.jsii.Kernel.get(this, "sortColumns", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GluePartitionStorageDescriptorSortColumnsList.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getBucketColumnsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "bucketColumnsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getColumnsInput() {
        return software.amazon.jsii.Kernel.get(this, "columnsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCompressedInput() {
        return software.amazon.jsii.Kernel.get(this, "compressedInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInputFormatInput() {
        return software.amazon.jsii.Kernel.get(this, "inputFormatInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLocationInput() {
        return software.amazon.jsii.Kernel.get(this, "locationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getNumberOfBucketsInput() {
        return software.amazon.jsii.Kernel.get(this, "numberOfBucketsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOutputFormatInput() {
        return software.amazon.jsii.Kernel.get(this, "outputFormatInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getParametersInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "parametersInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GluePartitionStorageDescriptorSerDeInfo getSerDeInfoInput() {
        return software.amazon.jsii.Kernel.get(this, "serDeInfoInput", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GluePartitionStorageDescriptorSerDeInfo.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GluePartitionStorageDescriptorSkewedInfo getSkewedInfoInput() {
        return software.amazon.jsii.Kernel.get(this, "skewedInfoInput", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GluePartitionStorageDescriptorSkewedInfo.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSortColumnsInput() {
        return software.amazon.jsii.Kernel.get(this, "sortColumnsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getStoredAsSubDirectoriesInput() {
        return software.amazon.jsii.Kernel.get(this, "storedAsSubDirectoriesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getBucketColumns() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "bucketColumns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setBucketColumns(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "bucketColumns", java.util.Objects.requireNonNull(value, "bucketColumns is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getCompressed() {
        return software.amazon.jsii.Kernel.get(this, "compressed", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setCompressed(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "compressed", java.util.Objects.requireNonNull(value, "compressed is required"));
    }

    public void setCompressed(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "compressed", java.util.Objects.requireNonNull(value, "compressed is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInputFormat() {
        return software.amazon.jsii.Kernel.get(this, "inputFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInputFormat(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "inputFormat", java.util.Objects.requireNonNull(value, "inputFormat is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLocation() {
        return software.amazon.jsii.Kernel.get(this, "location", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLocation(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "location", java.util.Objects.requireNonNull(value, "location is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getNumberOfBuckets() {
        return software.amazon.jsii.Kernel.get(this, "numberOfBuckets", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setNumberOfBuckets(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "numberOfBuckets", java.util.Objects.requireNonNull(value, "numberOfBuckets is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOutputFormat() {
        return software.amazon.jsii.Kernel.get(this, "outputFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOutputFormat(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "outputFormat", java.util.Objects.requireNonNull(value, "outputFormat is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "parameters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setParameters(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "parameters", java.util.Objects.requireNonNull(value, "parameters is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getStoredAsSubDirectories() {
        return software.amazon.jsii.Kernel.get(this, "storedAsSubDirectories", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setStoredAsSubDirectories(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "storedAsSubDirectories", java.util.Objects.requireNonNull(value, "storedAsSubDirectories is required"));
    }

    public void setStoredAsSubDirectories(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "storedAsSubDirectories", java.util.Objects.requireNonNull(value, "storedAsSubDirectories is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GluePartitionStorageDescriptor getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GluePartitionStorageDescriptor.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.glue.GluePartitionStorageDescriptor value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
