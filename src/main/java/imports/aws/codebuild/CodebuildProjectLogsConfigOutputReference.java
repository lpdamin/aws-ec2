package imports.aws.codebuild;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.098Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codebuild.CodebuildProjectLogsConfigOutputReference")
public class CodebuildProjectLogsConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CodebuildProjectLogsConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodebuildProjectLogsConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CodebuildProjectLogsConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCloudwatchLogs(final @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectLogsConfigCloudwatchLogs value) {
        software.amazon.jsii.Kernel.call(this, "putCloudwatchLogs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putS3Logs(final @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectLogsConfigS3Logs value) {
        software.amazon.jsii.Kernel.call(this, "putS3Logs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCloudwatchLogs() {
        software.amazon.jsii.Kernel.call(this, "resetCloudwatchLogs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3Logs() {
        software.amazon.jsii.Kernel.call(this, "resetS3Logs", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectLogsConfigCloudwatchLogsOutputReference getCloudwatchLogs() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLogs", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectLogsConfigCloudwatchLogsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildProjectLogsConfigS3LogsOutputReference getS3Logs() {
        return software.amazon.jsii.Kernel.get(this, "s3Logs", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectLogsConfigS3LogsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildProjectLogsConfigCloudwatchLogs getCloudwatchLogsInput() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLogsInput", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectLogsConfigCloudwatchLogs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildProjectLogsConfigS3Logs getS3LogsInput() {
        return software.amazon.jsii.Kernel.get(this, "s3LogsInput", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectLogsConfigS3Logs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildProjectLogsConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectLogsConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildProjectLogsConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
