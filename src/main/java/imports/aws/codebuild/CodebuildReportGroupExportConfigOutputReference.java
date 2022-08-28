package imports.aws.codebuild;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.489Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codebuild.CodebuildReportGroupExportConfigOutputReference")
public class CodebuildReportGroupExportConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CodebuildReportGroupExportConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodebuildReportGroupExportConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CodebuildReportGroupExportConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putS3Destination(final @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildReportGroupExportConfigS3Destination value) {
        software.amazon.jsii.Kernel.call(this, "putS3Destination", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetS3Destination() {
        software.amazon.jsii.Kernel.call(this, "resetS3Destination", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildReportGroupExportConfigS3DestinationOutputReference getS3Destination() {
        return software.amazon.jsii.Kernel.get(this, "s3Destination", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildReportGroupExportConfigS3DestinationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildReportGroupExportConfigS3Destination getS3DestinationInput() {
        return software.amazon.jsii.Kernel.get(this, "s3DestinationInput", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildReportGroupExportConfigS3Destination.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildReportGroupExportConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildReportGroupExportConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildReportGroupExportConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
