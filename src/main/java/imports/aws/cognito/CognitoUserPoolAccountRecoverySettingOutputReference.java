package imports.aws.cognito;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.708Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cognito.CognitoUserPoolAccountRecoverySettingOutputReference")
public class CognitoUserPoolAccountRecoverySettingOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CognitoUserPoolAccountRecoverySettingOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CognitoUserPoolAccountRecoverySettingOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CognitoUserPoolAccountRecoverySettingOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putRecoveryMechanism(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putRecoveryMechanism", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolAccountRecoverySettingRecoveryMechanismList getRecoveryMechanism() {
        return software.amazon.jsii.Kernel.get(this, "recoveryMechanism", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolAccountRecoverySettingRecoveryMechanismList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRecoveryMechanismInput() {
        return software.amazon.jsii.Kernel.get(this, "recoveryMechanismInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolAccountRecoverySetting getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolAccountRecoverySetting.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolAccountRecoverySetting value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
