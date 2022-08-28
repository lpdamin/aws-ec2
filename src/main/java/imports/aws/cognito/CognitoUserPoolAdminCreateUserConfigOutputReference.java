package imports.aws.cognito;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.710Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cognito.CognitoUserPoolAdminCreateUserConfigOutputReference")
public class CognitoUserPoolAdminCreateUserConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CognitoUserPoolAdminCreateUserConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CognitoUserPoolAdminCreateUserConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CognitoUserPoolAdminCreateUserConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putInviteMessageTemplate(final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate value) {
        software.amazon.jsii.Kernel.call(this, "putInviteMessageTemplate", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAllowAdminCreateUserOnly() {
        software.amazon.jsii.Kernel.call(this, "resetAllowAdminCreateUserOnly", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInviteMessageTemplate() {
        software.amazon.jsii.Kernel.call(this, "resetInviteMessageTemplate", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoUserPoolAdminCreateUserConfigInviteMessageTemplateOutputReference getInviteMessageTemplate() {
        return software.amazon.jsii.Kernel.get(this, "inviteMessageTemplate", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolAdminCreateUserConfigInviteMessageTemplateOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAllowAdminCreateUserOnlyInput() {
        return software.amazon.jsii.Kernel.get(this, "allowAdminCreateUserOnlyInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate getInviteMessageTemplateInput() {
        return software.amazon.jsii.Kernel.get(this, "inviteMessageTemplateInput", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolAdminCreateUserConfigInviteMessageTemplate.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAllowAdminCreateUserOnly() {
        return software.amazon.jsii.Kernel.get(this, "allowAdminCreateUserOnly", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAllowAdminCreateUserOnly(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allowAdminCreateUserOnly", java.util.Objects.requireNonNull(value, "allowAdminCreateUserOnly is required"));
    }

    public void setAllowAdminCreateUserOnly(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "allowAdminCreateUserOnly", java.util.Objects.requireNonNull(value, "allowAdminCreateUserOnly is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolAdminCreateUserConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolAdminCreateUserConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolAdminCreateUserConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
