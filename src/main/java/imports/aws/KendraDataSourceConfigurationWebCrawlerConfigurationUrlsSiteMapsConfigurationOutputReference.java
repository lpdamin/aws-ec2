package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.270Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.KendraDataSourceConfigurationWebCrawlerConfigurationUrlsSiteMapsConfigurationOutputReference")
public class KendraDataSourceConfigurationWebCrawlerConfigurationUrlsSiteMapsConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected KendraDataSourceConfigurationWebCrawlerConfigurationUrlsSiteMapsConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KendraDataSourceConfigurationWebCrawlerConfigurationUrlsSiteMapsConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public KendraDataSourceConfigurationWebCrawlerConfigurationUrlsSiteMapsConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSiteMapsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "siteMapsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSiteMaps() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "siteMaps", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSiteMaps(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "siteMaps", java.util.Objects.requireNonNull(value, "siteMaps is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceConfigurationWebCrawlerConfigurationUrlsSiteMapsConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceConfigurationWebCrawlerConfigurationUrlsSiteMapsConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceConfigurationWebCrawlerConfigurationUrlsSiteMapsConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
