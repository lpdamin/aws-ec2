package imports.aws.athena;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.782Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.athena.AthenaWorkgroupConfigurationResultConfigurationOutputReference")
public class AthenaWorkgroupConfigurationResultConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AthenaWorkgroupConfigurationResultConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AthenaWorkgroupConfigurationResultConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AthenaWorkgroupConfigurationResultConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putAclConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.athena.AthenaWorkgroupConfigurationResultConfigurationAclConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putAclConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEncryptionConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.athena.AthenaWorkgroupConfigurationResultConfigurationEncryptionConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putEncryptionConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAclConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetAclConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEncryptionConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetEncryptionConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExpectedBucketOwner() {
        software.amazon.jsii.Kernel.call(this, "resetExpectedBucketOwner", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOutputLocation() {
        software.amazon.jsii.Kernel.call(this, "resetOutputLocation", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.athena.AthenaWorkgroupConfigurationResultConfigurationAclConfigurationOutputReference getAclConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "aclConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.athena.AthenaWorkgroupConfigurationResultConfigurationAclConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.athena.AthenaWorkgroupConfigurationResultConfigurationEncryptionConfigurationOutputReference getEncryptionConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "encryptionConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.athena.AthenaWorkgroupConfigurationResultConfigurationEncryptionConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.athena.AthenaWorkgroupConfigurationResultConfigurationAclConfiguration getAclConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "aclConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.athena.AthenaWorkgroupConfigurationResultConfigurationAclConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.athena.AthenaWorkgroupConfigurationResultConfigurationEncryptionConfiguration getEncryptionConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "encryptionConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.athena.AthenaWorkgroupConfigurationResultConfigurationEncryptionConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getExpectedBucketOwnerInput() {
        return software.amazon.jsii.Kernel.get(this, "expectedBucketOwnerInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOutputLocationInput() {
        return software.amazon.jsii.Kernel.get(this, "outputLocationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExpectedBucketOwner() {
        return software.amazon.jsii.Kernel.get(this, "expectedBucketOwner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setExpectedBucketOwner(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "expectedBucketOwner", java.util.Objects.requireNonNull(value, "expectedBucketOwner is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOutputLocation() {
        return software.amazon.jsii.Kernel.get(this, "outputLocation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOutputLocation(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "outputLocation", java.util.Objects.requireNonNull(value, "outputLocation is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.athena.AthenaWorkgroupConfigurationResultConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.athena.AthenaWorkgroupConfigurationResultConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.athena.AthenaWorkgroupConfigurationResultConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
