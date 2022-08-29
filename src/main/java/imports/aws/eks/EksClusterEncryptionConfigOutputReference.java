package imports.aws.eks;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.953Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.eks.EksClusterEncryptionConfigOutputReference")
public class EksClusterEncryptionConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected EksClusterEncryptionConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EksClusterEncryptionConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public EksClusterEncryptionConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putProvider(final @org.jetbrains.annotations.NotNull imports.aws.eks.EksClusterEncryptionConfigProvider value) {
        software.amazon.jsii.Kernel.call(this, "putProvider", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.eks.EksClusterEncryptionConfigProviderOutputReference getProvider() {
        return software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(imports.aws.eks.EksClusterEncryptionConfigProviderOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eks.EksClusterEncryptionConfigProvider getProviderInput() {
        return software.amazon.jsii.Kernel.get(this, "providerInput", software.amazon.jsii.NativeType.forClass(imports.aws.eks.EksClusterEncryptionConfigProvider.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getResourcesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "resourcesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getResources() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "resources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setResources(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "resources", java.util.Objects.requireNonNull(value, "resources is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eks.EksClusterEncryptionConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.eks.EksClusterEncryptionConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.eks.EksClusterEncryptionConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
