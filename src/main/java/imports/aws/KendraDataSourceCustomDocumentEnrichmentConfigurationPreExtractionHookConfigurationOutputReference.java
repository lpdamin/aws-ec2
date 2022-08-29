package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.288Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationOutputReference")
public class KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putInvocationCondition(final @org.jetbrains.annotations.NotNull imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationCondition value) {
        software.amazon.jsii.Kernel.call(this, "putInvocationCondition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetInvocationCondition() {
        software.amazon.jsii.Kernel.call(this, "resetInvocationCondition", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationConditionOutputReference getInvocationCondition() {
        return software.amazon.jsii.Kernel.get(this, "invocationCondition", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationConditionOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationCondition getInvocationConditionInput() {
        return software.amazon.jsii.Kernel.get(this, "invocationConditionInput", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationCondition.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLambdaArnInput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getS3BucketInput() {
        return software.amazon.jsii.Kernel.get(this, "s3BucketInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaArn() {
        return software.amazon.jsii.Kernel.get(this, "lambdaArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLambdaArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "lambdaArn", java.util.Objects.requireNonNull(value, "lambdaArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3Bucket() {
        return software.amazon.jsii.Kernel.get(this, "s3Bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setS3Bucket(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "s3Bucket", java.util.Objects.requireNonNull(value, "s3Bucket is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
