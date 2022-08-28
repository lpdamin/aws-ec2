package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.729Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.KendraDataSourceConfigurationWebCrawlerConfigurationUrlsOutputReference")
public class KendraDataSourceConfigurationWebCrawlerConfigurationUrlsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected KendraDataSourceConfigurationWebCrawlerConfigurationUrlsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KendraDataSourceConfigurationWebCrawlerConfigurationUrlsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public KendraDataSourceConfigurationWebCrawlerConfigurationUrlsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSeedUrlConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.KendraDataSourceConfigurationWebCrawlerConfigurationUrlsSeedUrlConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putSeedUrlConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSiteMapsConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.KendraDataSourceConfigurationWebCrawlerConfigurationUrlsSiteMapsConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putSiteMapsConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetSeedUrlConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetSeedUrlConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSiteMapsConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetSiteMapsConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KendraDataSourceConfigurationWebCrawlerConfigurationUrlsSeedUrlConfigurationOutputReference getSeedUrlConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "seedUrlConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceConfigurationWebCrawlerConfigurationUrlsSeedUrlConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KendraDataSourceConfigurationWebCrawlerConfigurationUrlsSiteMapsConfigurationOutputReference getSiteMapsConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "siteMapsConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceConfigurationWebCrawlerConfigurationUrlsSiteMapsConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceConfigurationWebCrawlerConfigurationUrlsSeedUrlConfiguration getSeedUrlConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "seedUrlConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceConfigurationWebCrawlerConfigurationUrlsSeedUrlConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceConfigurationWebCrawlerConfigurationUrlsSiteMapsConfiguration getSiteMapsConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "siteMapsConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceConfigurationWebCrawlerConfigurationUrlsSiteMapsConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceConfigurationWebCrawlerConfigurationUrls getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceConfigurationWebCrawlerConfigurationUrls.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceConfigurationWebCrawlerConfigurationUrls value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
