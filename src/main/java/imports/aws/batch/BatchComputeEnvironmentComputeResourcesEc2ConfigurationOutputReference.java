package imports.aws.batch;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.026Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.batch.BatchComputeEnvironmentComputeResourcesEc2ConfigurationOutputReference")
public class BatchComputeEnvironmentComputeResourcesEc2ConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected BatchComputeEnvironmentComputeResourcesEc2ConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected BatchComputeEnvironmentComputeResourcesEc2ConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public BatchComputeEnvironmentComputeResourcesEc2ConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetImageIdOverride() {
        software.amazon.jsii.Kernel.call(this, "resetImageIdOverride", software.amazon.jsii.NativeType.VOID);
    }

    public void resetImageType() {
        software.amazon.jsii.Kernel.call(this, "resetImageType", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getImageIdOverrideInput() {
        return software.amazon.jsii.Kernel.get(this, "imageIdOverrideInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getImageTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "imageTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getImageIdOverride() {
        return software.amazon.jsii.Kernel.get(this, "imageIdOverride", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setImageIdOverride(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "imageIdOverride", java.util.Objects.requireNonNull(value, "imageIdOverride is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getImageType() {
        return software.amazon.jsii.Kernel.get(this, "imageType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setImageType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "imageType", java.util.Objects.requireNonNull(value, "imageType is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.batch.BatchComputeEnvironmentComputeResourcesEc2Configuration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.batch.BatchComputeEnvironmentComputeResourcesEc2Configuration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.batch.BatchComputeEnvironmentComputeResourcesEc2Configuration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
