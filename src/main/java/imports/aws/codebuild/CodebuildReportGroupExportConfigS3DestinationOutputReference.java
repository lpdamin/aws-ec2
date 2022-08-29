package imports.aws.codebuild;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.103Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codebuild.CodebuildReportGroupExportConfigS3DestinationOutputReference")
public class CodebuildReportGroupExportConfigS3DestinationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CodebuildReportGroupExportConfigS3DestinationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodebuildReportGroupExportConfigS3DestinationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CodebuildReportGroupExportConfigS3DestinationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetEncryptionDisabled() {
        software.amazon.jsii.Kernel.call(this, "resetEncryptionDisabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPackaging() {
        software.amazon.jsii.Kernel.call(this, "resetPackaging", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPath() {
        software.amazon.jsii.Kernel.call(this, "resetPath", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBucketInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEncryptionDisabledInput() {
        return software.amazon.jsii.Kernel.get(this, "encryptionDisabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEncryptionKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "encryptionKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPackagingInput() {
        return software.amazon.jsii.Kernel.get(this, "packagingInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPathInput() {
        return software.amazon.jsii.Kernel.get(this, "pathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucket() {
        return software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBucket(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bucket", java.util.Objects.requireNonNull(value, "bucket is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEncryptionDisabled() {
        return software.amazon.jsii.Kernel.get(this, "encryptionDisabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEncryptionDisabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "encryptionDisabled", java.util.Objects.requireNonNull(value, "encryptionDisabled is required"));
    }

    public void setEncryptionDisabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "encryptionDisabled", java.util.Objects.requireNonNull(value, "encryptionDisabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEncryptionKey() {
        return software.amazon.jsii.Kernel.get(this, "encryptionKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEncryptionKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "encryptionKey", java.util.Objects.requireNonNull(value, "encryptionKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPackaging() {
        return software.amazon.jsii.Kernel.get(this, "packaging", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPackaging(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "packaging", java.util.Objects.requireNonNull(value, "packaging is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPath() {
        return software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "path", java.util.Objects.requireNonNull(value, "path is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildReportGroupExportConfigS3Destination getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildReportGroupExportConfigS3Destination.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildReportGroupExportConfigS3Destination value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
