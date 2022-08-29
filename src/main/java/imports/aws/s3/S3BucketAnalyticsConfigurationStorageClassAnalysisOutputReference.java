package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.404Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketAnalyticsConfigurationStorageClassAnalysisOutputReference")
public class S3BucketAnalyticsConfigurationStorageClassAnalysisOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3BucketAnalyticsConfigurationStorageClassAnalysisOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketAnalyticsConfigurationStorageClassAnalysisOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public S3BucketAnalyticsConfigurationStorageClassAnalysisOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putDataExport(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExport value) {
        software.amazon.jsii.Kernel.call(this, "putDataExport", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportOutputReference getDataExport() {
        return software.amazon.jsii.Kernel.get(this, "dataExport", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExportOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExport getDataExportInput() {
        return software.amazon.jsii.Kernel.get(this, "dataExportInput", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketAnalyticsConfigurationStorageClassAnalysisDataExport.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketAnalyticsConfigurationStorageClassAnalysis getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketAnalyticsConfigurationStorageClassAnalysis.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketAnalyticsConfigurationStorageClassAnalysis value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
