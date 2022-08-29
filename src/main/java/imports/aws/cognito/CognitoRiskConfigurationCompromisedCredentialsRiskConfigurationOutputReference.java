package imports.aws.cognito;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.161Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cognito.CognitoRiskConfigurationCompromisedCredentialsRiskConfigurationOutputReference")
public class CognitoRiskConfigurationCompromisedCredentialsRiskConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CognitoRiskConfigurationCompromisedCredentialsRiskConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CognitoRiskConfigurationCompromisedCredentialsRiskConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CognitoRiskConfigurationCompromisedCredentialsRiskConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putActions(final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoRiskConfigurationCompromisedCredentialsRiskConfigurationActions value) {
        software.amazon.jsii.Kernel.call(this, "putActions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetEventFilter() {
        software.amazon.jsii.Kernel.call(this, "resetEventFilter", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoRiskConfigurationCompromisedCredentialsRiskConfigurationActionsOutputReference getActions() {
        return software.amazon.jsii.Kernel.get(this, "actions", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoRiskConfigurationCompromisedCredentialsRiskConfigurationActionsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoRiskConfigurationCompromisedCredentialsRiskConfigurationActions getActionsInput() {
        return software.amazon.jsii.Kernel.get(this, "actionsInput", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoRiskConfigurationCompromisedCredentialsRiskConfigurationActions.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEventFilterInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "eventFilterInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getEventFilter() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "eventFilter", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setEventFilter(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "eventFilter", java.util.Objects.requireNonNull(value, "eventFilter is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoRiskConfigurationCompromisedCredentialsRiskConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoRiskConfigurationCompromisedCredentialsRiskConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoRiskConfigurationCompromisedCredentialsRiskConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
