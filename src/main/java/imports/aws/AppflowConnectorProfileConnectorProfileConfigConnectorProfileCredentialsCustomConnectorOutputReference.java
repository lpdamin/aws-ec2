package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:46.955Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOutputReference")
public class AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putApiKey(final @org.jetbrains.annotations.NotNull imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKey value) {
        software.amazon.jsii.Kernel.call(this, "putApiKey", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putBasic(final @org.jetbrains.annotations.NotNull imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorBasic value) {
        software.amazon.jsii.Kernel.call(this, "putBasic", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCustom(final @org.jetbrains.annotations.NotNull imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustom value) {
        software.amazon.jsii.Kernel.call(this, "putCustom", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOauth2(final @org.jetbrains.annotations.NotNull imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2 value) {
        software.amazon.jsii.Kernel.call(this, "putOauth2", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetApiKey() {
        software.amazon.jsii.Kernel.call(this, "resetApiKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBasic() {
        software.amazon.jsii.Kernel.call(this, "resetBasic", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustom() {
        software.amazon.jsii.Kernel.call(this, "resetCustom", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOauth2() {
        software.amazon.jsii.Kernel.call(this, "resetOauth2", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKeyOutputReference getApiKey() {
        return software.amazon.jsii.Kernel.get(this, "apiKey", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKeyOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorBasicOutputReference getBasic() {
        return software.amazon.jsii.Kernel.get(this, "basic", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorBasicOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustomOutputReference getCustom() {
        return software.amazon.jsii.Kernel.get(this, "custom", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustomOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2OutputReference getOauth2() {
        return software.amazon.jsii.Kernel.get(this, "oauth2", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2OutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKey getApiKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "apiKeyInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKey.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthenticationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "authenticationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorBasic getBasicInput() {
        return software.amazon.jsii.Kernel.get(this, "basicInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorBasic.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustom getCustomInput() {
        return software.amazon.jsii.Kernel.get(this, "customInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustom.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2 getOauth2Input() {
        return software.amazon.jsii.Kernel.get(this, "oauth2Input", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthenticationType() {
        return software.amazon.jsii.Kernel.get(this, "authenticationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthenticationType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authenticationType", java.util.Objects.requireNonNull(value, "authenticationType is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnector getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnector.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnector value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
