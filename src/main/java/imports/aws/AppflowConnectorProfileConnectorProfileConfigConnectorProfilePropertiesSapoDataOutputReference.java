package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:46.989Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataOutputReference")
public class AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putOauthProperties(final @org.jetbrains.annotations.NotNull imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataOauthProperties value) {
        software.amazon.jsii.Kernel.call(this, "putOauthProperties", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetLogonLanguage() {
        software.amazon.jsii.Kernel.call(this, "resetLogonLanguage", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOauthProperties() {
        software.amazon.jsii.Kernel.call(this, "resetOauthProperties", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrivateLinkServiceName() {
        software.amazon.jsii.Kernel.call(this, "resetPrivateLinkServiceName", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataOauthPropertiesOutputReference getOauthProperties() {
        return software.amazon.jsii.Kernel.get(this, "oauthProperties", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataOauthPropertiesOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getApplicationHostUrlInput() {
        return software.amazon.jsii.Kernel.get(this, "applicationHostUrlInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getApplicationServicePathInput() {
        return software.amazon.jsii.Kernel.get(this, "applicationServicePathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientNumberInput() {
        return software.amazon.jsii.Kernel.get(this, "clientNumberInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLogonLanguageInput() {
        return software.amazon.jsii.Kernel.get(this, "logonLanguageInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataOauthProperties getOauthPropertiesInput() {
        return software.amazon.jsii.Kernel.get(this, "oauthPropertiesInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataOauthProperties.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPortNumberInput() {
        return software.amazon.jsii.Kernel.get(this, "portNumberInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPrivateLinkServiceNameInput() {
        return software.amazon.jsii.Kernel.get(this, "privateLinkServiceNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApplicationHostUrl() {
        return software.amazon.jsii.Kernel.get(this, "applicationHostUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApplicationHostUrl(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "applicationHostUrl", java.util.Objects.requireNonNull(value, "applicationHostUrl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApplicationServicePath() {
        return software.amazon.jsii.Kernel.get(this, "applicationServicePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApplicationServicePath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "applicationServicePath", java.util.Objects.requireNonNull(value, "applicationServicePath is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClientNumber() {
        return software.amazon.jsii.Kernel.get(this, "clientNumber", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClientNumber(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clientNumber", java.util.Objects.requireNonNull(value, "clientNumber is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLogonLanguage() {
        return software.amazon.jsii.Kernel.get(this, "logonLanguage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLogonLanguage(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "logonLanguage", java.util.Objects.requireNonNull(value, "logonLanguage is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPortNumber() {
        return software.amazon.jsii.Kernel.get(this, "portNumber", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPortNumber(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "portNumber", java.util.Objects.requireNonNull(value, "portNumber is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrivateLinkServiceName() {
        return software.amazon.jsii.Kernel.get(this, "privateLinkServiceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPrivateLinkServiceName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "privateLinkServiceName", java.util.Objects.requireNonNull(value, "privateLinkServiceName is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoData getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoData.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoData value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
