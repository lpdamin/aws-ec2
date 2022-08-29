package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.973Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskServerlessClusterClientAuthenticationOutputReference")
public class MskServerlessClusterClientAuthenticationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MskServerlessClusterClientAuthenticationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MskServerlessClusterClientAuthenticationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MskServerlessClusterClientAuthenticationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSasl(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskServerlessClusterClientAuthenticationSasl value) {
        software.amazon.jsii.Kernel.call(this, "putSasl", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskServerlessClusterClientAuthenticationSaslOutputReference getSasl() {
        return software.amazon.jsii.Kernel.get(this, "sasl", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskServerlessClusterClientAuthenticationSaslOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskServerlessClusterClientAuthenticationSasl getSaslInput() {
        return software.amazon.jsii.Kernel.get(this, "saslInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskServerlessClusterClientAuthenticationSasl.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskServerlessClusterClientAuthentication getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskServerlessClusterClientAuthentication.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.msk.MskServerlessClusterClientAuthentication value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
