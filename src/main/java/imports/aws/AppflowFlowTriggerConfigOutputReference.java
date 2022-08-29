package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.030Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowFlowTriggerConfigOutputReference")
public class AppflowFlowTriggerConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppflowFlowTriggerConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppflowFlowTriggerConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppflowFlowTriggerConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putTriggerProperties(final @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowTriggerConfigTriggerProperties value) {
        software.amazon.jsii.Kernel.call(this, "putTriggerProperties", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetTriggerProperties() {
        software.amazon.jsii.Kernel.call(this, "resetTriggerProperties", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowTriggerConfigTriggerPropertiesOutputReference getTriggerProperties() {
        return software.amazon.jsii.Kernel.get(this, "triggerProperties", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowTriggerConfigTriggerPropertiesOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowTriggerConfigTriggerProperties getTriggerPropertiesInput() {
        return software.amazon.jsii.Kernel.get(this, "triggerPropertiesInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowTriggerConfigTriggerProperties.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTriggerTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "triggerTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTriggerType() {
        return software.amazon.jsii.Kernel.get(this, "triggerType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTriggerType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "triggerType", java.util.Objects.requireNonNull(value, "triggerType is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowTriggerConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowTriggerConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowTriggerConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
