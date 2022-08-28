package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.254Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowFlowTriggerConfigTriggerPropertiesOutputReference")
public class AppflowFlowTriggerConfigTriggerPropertiesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppflowFlowTriggerConfigTriggerPropertiesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppflowFlowTriggerConfigTriggerPropertiesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppflowFlowTriggerConfigTriggerPropertiesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putScheduled(final @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowTriggerConfigTriggerPropertiesScheduled value) {
        software.amazon.jsii.Kernel.call(this, "putScheduled", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetScheduled() {
        software.amazon.jsii.Kernel.call(this, "resetScheduled", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowTriggerConfigTriggerPropertiesScheduledOutputReference getScheduled() {
        return software.amazon.jsii.Kernel.get(this, "scheduled", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowTriggerConfigTriggerPropertiesScheduledOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowTriggerConfigTriggerPropertiesScheduled getScheduledInput() {
        return software.amazon.jsii.Kernel.get(this, "scheduledInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowTriggerConfigTriggerPropertiesScheduled.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowTriggerConfigTriggerProperties getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowTriggerConfigTriggerProperties.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowTriggerConfigTriggerProperties value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
