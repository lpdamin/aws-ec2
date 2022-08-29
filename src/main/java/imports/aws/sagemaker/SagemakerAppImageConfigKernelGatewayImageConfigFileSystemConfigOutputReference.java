package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.492Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerAppImageConfigKernelGatewayImageConfigFileSystemConfigOutputReference")
public class SagemakerAppImageConfigKernelGatewayImageConfigFileSystemConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerAppImageConfigKernelGatewayImageConfigFileSystemConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerAppImageConfigKernelGatewayImageConfigFileSystemConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SagemakerAppImageConfigKernelGatewayImageConfigFileSystemConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetDefaultGid() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultGid", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultUid() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultUid", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMountPath() {
        software.amazon.jsii.Kernel.call(this, "resetMountPath", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDefaultGidInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultGidInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDefaultUidInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultUidInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMountPathInput() {
        return software.amazon.jsii.Kernel.get(this, "mountPathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDefaultGid() {
        return software.amazon.jsii.Kernel.get(this, "defaultGid", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDefaultGid(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "defaultGid", java.util.Objects.requireNonNull(value, "defaultGid is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDefaultUid() {
        return software.amazon.jsii.Kernel.get(this, "defaultUid", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDefaultUid(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "defaultUid", java.util.Objects.requireNonNull(value, "defaultUid is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMountPath() {
        return software.amazon.jsii.Kernel.get(this, "mountPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMountPath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "mountPath", java.util.Objects.requireNonNull(value, "mountPath is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerAppImageConfigKernelGatewayImageConfigFileSystemConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerAppImageConfigKernelGatewayImageConfigFileSystemConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerAppImageConfigKernelGatewayImageConfigFileSystemConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
