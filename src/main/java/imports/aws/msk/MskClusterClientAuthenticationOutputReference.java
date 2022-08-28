package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.828Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskClusterClientAuthenticationOutputReference")
public class MskClusterClientAuthenticationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MskClusterClientAuthenticationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MskClusterClientAuthenticationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MskClusterClientAuthenticationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSasl(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterClientAuthenticationSasl value) {
        software.amazon.jsii.Kernel.call(this, "putSasl", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTls(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterClientAuthenticationTls value) {
        software.amazon.jsii.Kernel.call(this, "putTls", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetSasl() {
        software.amazon.jsii.Kernel.call(this, "resetSasl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTls() {
        software.amazon.jsii.Kernel.call(this, "resetTls", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUnauthenticated() {
        software.amazon.jsii.Kernel.call(this, "resetUnauthenticated", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterClientAuthenticationSaslOutputReference getSasl() {
        return software.amazon.jsii.Kernel.get(this, "sasl", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterClientAuthenticationSaslOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskClusterClientAuthenticationTlsOutputReference getTls() {
        return software.amazon.jsii.Kernel.get(this, "tls", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterClientAuthenticationTlsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterClientAuthenticationSasl getSaslInput() {
        return software.amazon.jsii.Kernel.get(this, "saslInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterClientAuthenticationSasl.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterClientAuthenticationTls getTlsInput() {
        return software.amazon.jsii.Kernel.get(this, "tlsInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterClientAuthenticationTls.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getUnauthenticatedInput() {
        return software.amazon.jsii.Kernel.get(this, "unauthenticatedInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getUnauthenticated() {
        return software.amazon.jsii.Kernel.get(this, "unauthenticated", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setUnauthenticated(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "unauthenticated", java.util.Objects.requireNonNull(value, "unauthenticated is required"));
    }

    public void setUnauthenticated(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "unauthenticated", java.util.Objects.requireNonNull(value, "unauthenticated is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterClientAuthentication getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterClientAuthentication.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterClientAuthentication value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
