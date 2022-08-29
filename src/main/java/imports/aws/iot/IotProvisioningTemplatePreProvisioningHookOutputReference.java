package imports.aws.iot;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.435Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.iot.IotProvisioningTemplatePreProvisioningHookOutputReference")
public class IotProvisioningTemplatePreProvisioningHookOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected IotProvisioningTemplatePreProvisioningHookOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IotProvisioningTemplatePreProvisioningHookOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public IotProvisioningTemplatePreProvisioningHookOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetPayloadVersion() {
        software.amazon.jsii.Kernel.call(this, "resetPayloadVersion", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPayloadVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "payloadVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTargetArnInput() {
        return software.amazon.jsii.Kernel.get(this, "targetArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPayloadVersion() {
        return software.amazon.jsii.Kernel.get(this, "payloadVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPayloadVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "payloadVersion", java.util.Objects.requireNonNull(value, "payloadVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetArn() {
        return software.amazon.jsii.Kernel.get(this, "targetArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTargetArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "targetArn", java.util.Objects.requireNonNull(value, "targetArn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotProvisioningTemplatePreProvisioningHook getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotProvisioningTemplatePreProvisioningHook.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.iot.IotProvisioningTemplatePreProvisioningHook value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
