package imports.aws.cognito;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.670Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsLowActionOutputReference")
public class CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsLowActionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsLowActionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsLowActionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsLowActionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEventActionInput() {
        return software.amazon.jsii.Kernel.get(this, "eventActionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getNotifyInput() {
        return software.amazon.jsii.Kernel.get(this, "notifyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventAction() {
        return software.amazon.jsii.Kernel.get(this, "eventAction", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEventAction(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "eventAction", java.util.Objects.requireNonNull(value, "eventAction is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getNotify() {
        return software.amazon.jsii.Kernel.get(this, "notify", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setNotify(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "notify", java.util.Objects.requireNonNull(value, "notify is required"));
    }

    public void setNotify(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "notify", java.util.Objects.requireNonNull(value, "notify is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
