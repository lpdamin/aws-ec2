package imports.aws.cognito;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.158Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsOutputReference")
public class CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putHighAction(final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsHighAction value) {
        software.amazon.jsii.Kernel.call(this, "putHighAction", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLowAction(final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction value) {
        software.amazon.jsii.Kernel.call(this, "putLowAction", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putMediumAction(final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsMediumAction value) {
        software.amazon.jsii.Kernel.call(this, "putMediumAction", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetHighAction() {
        software.amazon.jsii.Kernel.call(this, "resetHighAction", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLowAction() {
        software.amazon.jsii.Kernel.call(this, "resetLowAction", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMediumAction() {
        software.amazon.jsii.Kernel.call(this, "resetMediumAction", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsHighActionOutputReference getHighAction() {
        return software.amazon.jsii.Kernel.get(this, "highAction", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsHighActionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsLowActionOutputReference getLowAction() {
        return software.amazon.jsii.Kernel.get(this, "lowAction", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsLowActionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsMediumActionOutputReference getMediumAction() {
        return software.amazon.jsii.Kernel.get(this, "mediumAction", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsMediumActionOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsHighAction getHighActionInput() {
        return software.amazon.jsii.Kernel.get(this, "highActionInput", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsHighAction.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction getLowActionInput() {
        return software.amazon.jsii.Kernel.get(this, "lowActionInput", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsMediumAction getMediumActionInput() {
        return software.amazon.jsii.Kernel.get(this, "mediumActionInput", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsMediumAction.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActions getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActions.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActions value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
