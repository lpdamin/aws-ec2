package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.510Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerEndpointConfigurationProductionVariantsOutputReference")
public class SagemakerEndpointConfigurationProductionVariantsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerEndpointConfigurationProductionVariantsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerEndpointConfigurationProductionVariantsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public SagemakerEndpointConfigurationProductionVariantsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putServerlessConfig(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointConfigurationProductionVariantsServerlessConfig value) {
        software.amazon.jsii.Kernel.call(this, "putServerlessConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAcceleratorType() {
        software.amazon.jsii.Kernel.call(this, "resetAcceleratorType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInitialInstanceCount() {
        software.amazon.jsii.Kernel.call(this, "resetInitialInstanceCount", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInitialVariantWeight() {
        software.amazon.jsii.Kernel.call(this, "resetInitialVariantWeight", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceType() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServerlessConfig() {
        software.amazon.jsii.Kernel.call(this, "resetServerlessConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVariantName() {
        software.amazon.jsii.Kernel.call(this, "resetVariantName", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerEndpointConfigurationProductionVariantsServerlessConfigOutputReference getServerlessConfig() {
        return software.amazon.jsii.Kernel.get(this, "serverlessConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointConfigurationProductionVariantsServerlessConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAcceleratorTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "acceleratorTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getInitialInstanceCountInput() {
        return software.amazon.jsii.Kernel.get(this, "initialInstanceCountInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getInitialVariantWeightInput() {
        return software.amazon.jsii.Kernel.get(this, "initialVariantWeightInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInstanceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getModelNameInput() {
        return software.amazon.jsii.Kernel.get(this, "modelNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointConfigurationProductionVariantsServerlessConfig getServerlessConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "serverlessConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointConfigurationProductionVariantsServerlessConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVariantNameInput() {
        return software.amazon.jsii.Kernel.get(this, "variantNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAcceleratorType() {
        return software.amazon.jsii.Kernel.get(this, "acceleratorType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAcceleratorType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "acceleratorType", java.util.Objects.requireNonNull(value, "acceleratorType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getInitialInstanceCount() {
        return software.amazon.jsii.Kernel.get(this, "initialInstanceCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setInitialInstanceCount(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "initialInstanceCount", java.util.Objects.requireNonNull(value, "initialInstanceCount is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getInitialVariantWeight() {
        return software.amazon.jsii.Kernel.get(this, "initialVariantWeight", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setInitialVariantWeight(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "initialVariantWeight", java.util.Objects.requireNonNull(value, "initialVariantWeight is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceType() {
        return software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInstanceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "instanceType", java.util.Objects.requireNonNull(value, "instanceType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getModelName() {
        return software.amazon.jsii.Kernel.get(this, "modelName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setModelName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "modelName", java.util.Objects.requireNonNull(value, "modelName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVariantName() {
        return software.amazon.jsii.Kernel.get(this, "variantName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVariantName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "variantName", java.util.Objects.requireNonNull(value, "variantName is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointConfigurationProductionVariants value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
