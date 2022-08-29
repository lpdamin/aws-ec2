package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:46.965Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOutputReference")
public class AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putOauthRequest(final @org.jetbrains.annotations.NotNull imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOauthRequest value) {
        software.amazon.jsii.Kernel.call(this, "putOauthRequest", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAccessToken() {
        software.amazon.jsii.Kernel.call(this, "resetAccessToken", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOauthRequest() {
        software.amazon.jsii.Kernel.call(this, "resetOauthRequest", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRefreshToken() {
        software.amazon.jsii.Kernel.call(this, "resetRefreshToken", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOauthRequestOutputReference getOauthRequest() {
        return software.amazon.jsii.Kernel.get(this, "oauthRequest", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOauthRequestOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAccessTokenInput() {
        return software.amazon.jsii.Kernel.get(this, "accessTokenInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOauthRequest getOauthRequestInput() {
        return software.amazon.jsii.Kernel.get(this, "oauthRequestInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycodeOauthRequest.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRefreshTokenInput() {
        return software.amazon.jsii.Kernel.get(this, "refreshTokenInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAccessToken() {
        return software.amazon.jsii.Kernel.get(this, "accessToken", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAccessToken(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "accessToken", java.util.Objects.requireNonNull(value, "accessToken is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRefreshToken() {
        return software.amazon.jsii.Kernel.get(this, "refreshToken", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRefreshToken(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "refreshToken", java.util.Objects.requireNonNull(value, "refreshToken is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycode getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycode.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfileCredentialsHoneycode value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
