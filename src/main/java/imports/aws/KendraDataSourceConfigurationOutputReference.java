package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.267Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.KendraDataSourceConfigurationOutputReference")
public class KendraDataSourceConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected KendraDataSourceConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KendraDataSourceConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public KendraDataSourceConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putS3Configuration(final @org.jetbrains.annotations.NotNull imports.aws.KendraDataSourceConfigurationS3Configuration value) {
        software.amazon.jsii.Kernel.call(this, "putS3Configuration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putWebCrawlerConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.KendraDataSourceConfigurationWebCrawlerConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putWebCrawlerConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetS3Configuration() {
        software.amazon.jsii.Kernel.call(this, "resetS3Configuration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWebCrawlerConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetWebCrawlerConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KendraDataSourceConfigurationS3ConfigurationOutputReference getS3Configuration() {
        return software.amazon.jsii.Kernel.get(this, "s3Configuration", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceConfigurationS3ConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KendraDataSourceConfigurationWebCrawlerConfigurationOutputReference getWebCrawlerConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "webCrawlerConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceConfigurationWebCrawlerConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceConfigurationS3Configuration getS3ConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "s3ConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceConfigurationS3Configuration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceConfigurationWebCrawlerConfiguration getWebCrawlerConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "webCrawlerConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceConfigurationWebCrawlerConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
