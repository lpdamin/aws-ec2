package imports.aws.lambdafunction;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.717Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lambdafunction.LambdaAliasRoutingConfigOutputReference")
public class LambdaAliasRoutingConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LambdaAliasRoutingConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LambdaAliasRoutingConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LambdaAliasRoutingConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetAdditionalVersionWeights() {
        software.amazon.jsii.Kernel.call(this, "resetAdditionalVersionWeights", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Number> getAdditionalVersionWeightsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.Number>)(software.amazon.jsii.Kernel.get(this, "additionalVersionWeightsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Number.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Number> getAdditionalVersionWeights() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "additionalVersionWeights", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Number.class))));
    }

    public void setAdditionalVersionWeights(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Number> value) {
        software.amazon.jsii.Kernel.set(this, "additionalVersionWeights", java.util.Objects.requireNonNull(value, "additionalVersionWeights is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaAliasRoutingConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaAliasRoutingConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaAliasRoutingConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
