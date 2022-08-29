package imports.aws.dlm;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.445Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.dlm.DlmLifecyclePolicyPolicyDetailsActionCrossRegionCopyEncryptionConfigurationOutputReference")
public class DlmLifecyclePolicyPolicyDetailsActionCrossRegionCopyEncryptionConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DlmLifecyclePolicyPolicyDetailsActionCrossRegionCopyEncryptionConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DlmLifecyclePolicyPolicyDetailsActionCrossRegionCopyEncryptionConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DlmLifecyclePolicyPolicyDetailsActionCrossRegionCopyEncryptionConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetCmkArn() {
        software.amazon.jsii.Kernel.call(this, "resetCmkArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEncrypted() {
        software.amazon.jsii.Kernel.call(this, "resetEncrypted", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCmkArnInput() {
        return software.amazon.jsii.Kernel.get(this, "cmkArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEncryptedInput() {
        return software.amazon.jsii.Kernel.get(this, "encryptedInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCmkArn() {
        return software.amazon.jsii.Kernel.get(this, "cmkArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCmkArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cmkArn", java.util.Objects.requireNonNull(value, "cmkArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEncrypted() {
        return software.amazon.jsii.Kernel.get(this, "encrypted", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEncrypted(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "encrypted", java.util.Objects.requireNonNull(value, "encrypted is required"));
    }

    public void setEncrypted(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "encrypted", java.util.Objects.requireNonNull(value, "encrypted is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsActionCrossRegionCopyEncryptionConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsActionCrossRegionCopyEncryptionConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsActionCrossRegionCopyEncryptionConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
