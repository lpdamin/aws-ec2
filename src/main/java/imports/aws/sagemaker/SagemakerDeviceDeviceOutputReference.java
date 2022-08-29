package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.494Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerDeviceDeviceOutputReference")
public class SagemakerDeviceDeviceOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerDeviceDeviceOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerDeviceDeviceOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SagemakerDeviceDeviceOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIotThingName() {
        software.amazon.jsii.Kernel.call(this, "resetIotThingName", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeviceNameInput() {
        return software.amazon.jsii.Kernel.get(this, "deviceNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIotThingNameInput() {
        return software.amazon.jsii.Kernel.get(this, "iotThingNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeviceName() {
        return software.amazon.jsii.Kernel.get(this, "deviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeviceName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deviceName", java.util.Objects.requireNonNull(value, "deviceName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIotThingName() {
        return software.amazon.jsii.Kernel.get(this, "iotThingName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIotThingName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "iotThingName", java.util.Objects.requireNonNull(value, "iotThingName is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerDeviceDevice getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerDeviceDevice.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerDeviceDevice value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
