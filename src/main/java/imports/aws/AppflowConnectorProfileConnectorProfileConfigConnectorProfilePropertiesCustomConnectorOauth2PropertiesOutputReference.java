package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:46.985Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2PropertiesOutputReference")
public class AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2PropertiesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2PropertiesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2PropertiesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2PropertiesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetTokenUrlCustomProperties() {
        software.amazon.jsii.Kernel.call(this, "resetTokenUrlCustomProperties", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOauth2GrantTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "oauth2GrantTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTokenUrlCustomPropertiesInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tokenUrlCustomPropertiesInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTokenUrlInput() {
        return software.amazon.jsii.Kernel.get(this, "tokenUrlInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOauth2GrantType() {
        return software.amazon.jsii.Kernel.get(this, "oauth2GrantType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOauth2GrantType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "oauth2GrantType", java.util.Objects.requireNonNull(value, "oauth2GrantType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTokenUrl() {
        return software.amazon.jsii.Kernel.get(this, "tokenUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTokenUrl(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tokenUrl", java.util.Objects.requireNonNull(value, "tokenUrl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTokenUrlCustomProperties() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tokenUrlCustomProperties", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTokenUrlCustomProperties(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tokenUrlCustomProperties", java.util.Objects.requireNonNull(value, "tokenUrlCustomProperties is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2Properties getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2Properties.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorOauth2Properties value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
