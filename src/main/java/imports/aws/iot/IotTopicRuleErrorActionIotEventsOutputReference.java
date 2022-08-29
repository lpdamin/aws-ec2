package imports.aws.iot;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.462Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.iot.IotTopicRuleErrorActionIotEventsOutputReference")
public class IotTopicRuleErrorActionIotEventsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected IotTopicRuleErrorActionIotEventsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IotTopicRuleErrorActionIotEventsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public IotTopicRuleErrorActionIotEventsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetMessageId() {
        software.amazon.jsii.Kernel.call(this, "resetMessageId", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInputNameInput() {
        return software.amazon.jsii.Kernel.get(this, "inputNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMessageIdInput() {
        return software.amazon.jsii.Kernel.get(this, "messageIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "roleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInputName() {
        return software.amazon.jsii.Kernel.get(this, "inputName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInputName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "inputName", java.util.Objects.requireNonNull(value, "inputName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMessageId() {
        return software.amazon.jsii.Kernel.get(this, "messageId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMessageId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "messageId", java.util.Objects.requireNonNull(value, "messageId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "roleArn", java.util.Objects.requireNonNull(value, "roleArn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionIotEvents getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionIotEvents.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionIotEvents value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
