package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.502Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerFeatureGroupOnlineStoreConfigOutputReference")
public class SagemakerFeatureGroupOnlineStoreConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerFeatureGroupOnlineStoreConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerFeatureGroupOnlineStoreConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SagemakerFeatureGroupOnlineStoreConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSecurityConfig(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerFeatureGroupOnlineStoreConfigSecurityConfig value) {
        software.amazon.jsii.Kernel.call(this, "putSecurityConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetEnableOnlineStore() {
        software.amazon.jsii.Kernel.call(this, "resetEnableOnlineStore", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecurityConfig() {
        software.amazon.jsii.Kernel.call(this, "resetSecurityConfig", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerFeatureGroupOnlineStoreConfigSecurityConfigOutputReference getSecurityConfig() {
        return software.amazon.jsii.Kernel.get(this, "securityConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerFeatureGroupOnlineStoreConfigSecurityConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnableOnlineStoreInput() {
        return software.amazon.jsii.Kernel.get(this, "enableOnlineStoreInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerFeatureGroupOnlineStoreConfigSecurityConfig getSecurityConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "securityConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerFeatureGroupOnlineStoreConfigSecurityConfig.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnableOnlineStore() {
        return software.amazon.jsii.Kernel.get(this, "enableOnlineStore", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnableOnlineStore(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableOnlineStore", java.util.Objects.requireNonNull(value, "enableOnlineStore is required"));
    }

    public void setEnableOnlineStore(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enableOnlineStore", java.util.Objects.requireNonNull(value, "enableOnlineStore is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerFeatureGroupOnlineStoreConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerFeatureGroupOnlineStoreConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerFeatureGroupOnlineStoreConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
