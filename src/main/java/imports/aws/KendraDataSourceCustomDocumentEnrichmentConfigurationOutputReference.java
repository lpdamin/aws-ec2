package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.283Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.KendraDataSourceCustomDocumentEnrichmentConfigurationOutputReference")
public class KendraDataSourceCustomDocumentEnrichmentConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected KendraDataSourceCustomDocumentEnrichmentConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KendraDataSourceCustomDocumentEnrichmentConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public KendraDataSourceCustomDocumentEnrichmentConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putInlineConfigurations(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putInlineConfigurations", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPostExtractionHookConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putPostExtractionHookConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPreExtractionHookConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putPreExtractionHookConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetInlineConfigurations() {
        software.amazon.jsii.Kernel.call(this, "resetInlineConfigurations", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPostExtractionHookConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetPostExtractionHookConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPreExtractionHookConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetPreExtractionHookConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsList getInlineConfigurations() {
        return software.amazon.jsii.Kernel.get(this, "inlineConfigurations", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfigurationOutputReference getPostExtractionHookConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "postExtractionHookConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationOutputReference getPreExtractionHookConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "preExtractionHookConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInlineConfigurationsInput() {
        return software.amazon.jsii.Kernel.get(this, "inlineConfigurationsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfiguration getPostExtractionHookConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "postExtractionHookConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfiguration getPreExtractionHookConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "preExtractionHookConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "roleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "roleArn", java.util.Objects.requireNonNull(value, "roleArn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceCustomDocumentEnrichmentConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceCustomDocumentEnrichmentConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceCustomDocumentEnrichmentConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
