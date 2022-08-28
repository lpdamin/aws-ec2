package imports.aws.globalaccelerator;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.277Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.globalaccelerator.GlobalacceleratorAcceleratorAttributesOutputReference")
public class GlobalacceleratorAcceleratorAttributesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GlobalacceleratorAcceleratorAttributesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlobalacceleratorAcceleratorAttributesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GlobalacceleratorAcceleratorAttributesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetFlowLogsEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetFlowLogsEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFlowLogsS3Bucket() {
        software.amazon.jsii.Kernel.call(this, "resetFlowLogsS3Bucket", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFlowLogsS3Prefix() {
        software.amazon.jsii.Kernel.call(this, "resetFlowLogsS3Prefix", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getFlowLogsEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "flowLogsEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFlowLogsS3BucketInput() {
        return software.amazon.jsii.Kernel.get(this, "flowLogsS3BucketInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFlowLogsS3PrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "flowLogsS3PrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getFlowLogsEnabled() {
        return software.amazon.jsii.Kernel.get(this, "flowLogsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setFlowLogsEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "flowLogsEnabled", java.util.Objects.requireNonNull(value, "flowLogsEnabled is required"));
    }

    public void setFlowLogsEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "flowLogsEnabled", java.util.Objects.requireNonNull(value, "flowLogsEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFlowLogsS3Bucket() {
        return software.amazon.jsii.Kernel.get(this, "flowLogsS3Bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFlowLogsS3Bucket(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "flowLogsS3Bucket", java.util.Objects.requireNonNull(value, "flowLogsS3Bucket is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFlowLogsS3Prefix() {
        return software.amazon.jsii.Kernel.get(this, "flowLogsS3Prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFlowLogsS3Prefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "flowLogsS3Prefix", java.util.Objects.requireNonNull(value, "flowLogsS3Prefix is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.globalaccelerator.GlobalacceleratorAcceleratorAttributes getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.globalaccelerator.GlobalacceleratorAcceleratorAttributes.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.globalaccelerator.GlobalacceleratorAcceleratorAttributes value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
