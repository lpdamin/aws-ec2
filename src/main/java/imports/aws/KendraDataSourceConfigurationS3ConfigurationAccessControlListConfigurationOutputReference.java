package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.724Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.KendraDataSourceConfigurationS3ConfigurationAccessControlListConfigurationOutputReference")
public class KendraDataSourceConfigurationS3ConfigurationAccessControlListConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected KendraDataSourceConfigurationS3ConfigurationAccessControlListConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KendraDataSourceConfigurationS3ConfigurationAccessControlListConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public KendraDataSourceConfigurationS3ConfigurationAccessControlListConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetKeyPath() {
        software.amazon.jsii.Kernel.call(this, "resetKeyPath", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKeyPathInput() {
        return software.amazon.jsii.Kernel.get(this, "keyPathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKeyPath() {
        return software.amazon.jsii.Kernel.get(this, "keyPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKeyPath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "keyPath", java.util.Objects.requireNonNull(value, "keyPath is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceConfigurationS3ConfigurationAccessControlListConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceConfigurationS3ConfigurationAccessControlListConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceConfigurationS3ConfigurationAccessControlListConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
