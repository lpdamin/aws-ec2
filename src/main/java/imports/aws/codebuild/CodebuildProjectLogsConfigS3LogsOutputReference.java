package imports.aws.codebuild;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.098Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codebuild.CodebuildProjectLogsConfigS3LogsOutputReference")
public class CodebuildProjectLogsConfigS3LogsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CodebuildProjectLogsConfigS3LogsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodebuildProjectLogsConfigS3LogsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CodebuildProjectLogsConfigS3LogsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetBucketOwnerAccess() {
        software.amazon.jsii.Kernel.call(this, "resetBucketOwnerAccess", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEncryptionDisabled() {
        software.amazon.jsii.Kernel.call(this, "resetEncryptionDisabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLocation() {
        software.amazon.jsii.Kernel.call(this, "resetLocation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStatus() {
        software.amazon.jsii.Kernel.call(this, "resetStatus", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBucketOwnerAccessInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketOwnerAccessInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEncryptionDisabledInput() {
        return software.amazon.jsii.Kernel.get(this, "encryptionDisabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLocationInput() {
        return software.amazon.jsii.Kernel.get(this, "locationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStatusInput() {
        return software.amazon.jsii.Kernel.get(this, "statusInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucketOwnerAccess() {
        return software.amazon.jsii.Kernel.get(this, "bucketOwnerAccess", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBucketOwnerAccess(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bucketOwnerAccess", java.util.Objects.requireNonNull(value, "bucketOwnerAccess is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getLocation() {
        return software.amazon.jsii.Kernel.get(this, "location", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLocation(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "location", java.util.Objects.requireNonNull(value, "location is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStatus(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "status", java.util.Objects.requireNonNull(value, "status is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildProjectLogsConfigS3Logs getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectLogsConfigS3Logs.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildProjectLogsConfigS3Logs value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
