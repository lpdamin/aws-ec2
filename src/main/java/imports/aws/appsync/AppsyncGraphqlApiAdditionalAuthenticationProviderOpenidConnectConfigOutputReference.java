package imports.aws.appsync;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.751Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfigOutputReference")
public class AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetAuthTtl() {
        software.amazon.jsii.Kernel.call(this, "resetAuthTtl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClientId() {
        software.amazon.jsii.Kernel.call(this, "resetClientId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIatTtl() {
        software.amazon.jsii.Kernel.call(this, "resetIatTtl", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getAuthTtlInput() {
        return software.amazon.jsii.Kernel.get(this, "authTtlInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientIdInput() {
        return software.amazon.jsii.Kernel.get(this, "clientIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getIatTtlInput() {
        return software.amazon.jsii.Kernel.get(this, "iatTtlInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIssuerInput() {
        return software.amazon.jsii.Kernel.get(this, "issuerInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getAuthTtl() {
        return software.amazon.jsii.Kernel.get(this, "authTtl", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setAuthTtl(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "authTtl", java.util.Objects.requireNonNull(value, "authTtl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClientId() {
        return software.amazon.jsii.Kernel.get(this, "clientId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClientId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clientId", java.util.Objects.requireNonNull(value, "clientId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getIatTtl() {
        return software.amazon.jsii.Kernel.get(this, "iatTtl", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setIatTtl(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "iatTtl", java.util.Objects.requireNonNull(value, "iatTtl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIssuer() {
        return software.amazon.jsii.Kernel.get(this, "issuer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIssuer(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "issuer", java.util.Objects.requireNonNull(value, "issuer is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appsync.AppsyncGraphqlApiAdditionalAuthenticationProviderOpenidConnectConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
