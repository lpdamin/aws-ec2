package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.288Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationConditionOutputReference")
public class KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationConditionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationConditionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationConditionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationConditionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putConditionOnValue(final @org.jetbrains.annotations.NotNull imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationConditionConditionOnValue value) {
        software.amazon.jsii.Kernel.call(this, "putConditionOnValue", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetConditionOnValue() {
        software.amazon.jsii.Kernel.call(this, "resetConditionOnValue", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationConditionConditionOnValueOutputReference getConditionOnValue() {
        return software.amazon.jsii.Kernel.get(this, "conditionOnValue", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationConditionConditionOnValueOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConditionDocumentAttributeKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "conditionDocumentAttributeKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationConditionConditionOnValue getConditionOnValueInput() {
        return software.amazon.jsii.Kernel.get(this, "conditionOnValueInput", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationConditionConditionOnValue.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOperatorInput() {
        return software.amazon.jsii.Kernel.get(this, "operatorInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConditionDocumentAttributeKey() {
        return software.amazon.jsii.Kernel.get(this, "conditionDocumentAttributeKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConditionDocumentAttributeKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "conditionDocumentAttributeKey", java.util.Objects.requireNonNull(value, "conditionDocumentAttributeKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOperator() {
        return software.amazon.jsii.Kernel.get(this, "operator", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOperator(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "operator", java.util.Objects.requireNonNull(value, "operator is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationCondition getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationCondition.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.KendraDataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationCondition value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
