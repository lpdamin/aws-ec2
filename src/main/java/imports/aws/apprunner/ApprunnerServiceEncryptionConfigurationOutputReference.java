package imports.aws.apprunner;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.640Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.apprunner.ApprunnerServiceEncryptionConfigurationOutputReference")
public class ApprunnerServiceEncryptionConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ApprunnerServiceEncryptionConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ApprunnerServiceEncryptionConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ApprunnerServiceEncryptionConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKey() {
        return software.amazon.jsii.Kernel.get(this, "kmsKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKey", java.util.Objects.requireNonNull(value, "kmsKey is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apprunner.ApprunnerServiceEncryptionConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.apprunner.ApprunnerServiceEncryptionConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.apprunner.ApprunnerServiceEncryptionConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
