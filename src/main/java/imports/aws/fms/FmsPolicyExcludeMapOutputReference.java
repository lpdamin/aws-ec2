package imports.aws.fms;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.169Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.fms.FmsPolicyExcludeMapOutputReference")
public class FmsPolicyExcludeMapOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected FmsPolicyExcludeMapOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected FmsPolicyExcludeMapOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public FmsPolicyExcludeMapOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetAccount() {
        software.amazon.jsii.Kernel.call(this, "resetAccount", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOrgunit() {
        software.amazon.jsii.Kernel.call(this, "resetOrgunit", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAccountInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "accountInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getOrgunitInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "orgunitInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAccount() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "account", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAccount(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "account", java.util.Objects.requireNonNull(value, "account is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getOrgunit() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "orgunit", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setOrgunit(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "orgunit", java.util.Objects.requireNonNull(value, "orgunit is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.fms.FmsPolicyExcludeMap getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.fms.FmsPolicyExcludeMap.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.fms.FmsPolicyExcludeMap value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
