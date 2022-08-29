package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.963Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskClusterClientAuthenticationSaslOutputReference")
public class MskClusterClientAuthenticationSaslOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MskClusterClientAuthenticationSaslOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MskClusterClientAuthenticationSaslOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MskClusterClientAuthenticationSaslOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetIam() {
        software.amazon.jsii.Kernel.call(this, "resetIam", software.amazon.jsii.NativeType.VOID);
    }

    public void resetScram() {
        software.amazon.jsii.Kernel.call(this, "resetScram", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIamInput() {
        return software.amazon.jsii.Kernel.get(this, "iamInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getScramInput() {
        return software.amazon.jsii.Kernel.get(this, "scramInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIam() {
        return software.amazon.jsii.Kernel.get(this, "iam", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIam(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "iam", java.util.Objects.requireNonNull(value, "iam is required"));
    }

    public void setIam(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "iam", java.util.Objects.requireNonNull(value, "iam is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getScram() {
        return software.amazon.jsii.Kernel.get(this, "scram", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setScram(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "scram", java.util.Objects.requireNonNull(value, "scram is required"));
    }

    public void setScram(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "scram", java.util.Objects.requireNonNull(value, "scram is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterClientAuthenticationSasl getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterClientAuthenticationSasl.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterClientAuthenticationSasl value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
