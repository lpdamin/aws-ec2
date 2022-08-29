package imports.aws.lambdafunction;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.782Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lambdafunction.LambdaEventSourceMappingFilterCriteriaOutputReference")
public class LambdaEventSourceMappingFilterCriteriaOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LambdaEventSourceMappingFilterCriteriaOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LambdaEventSourceMappingFilterCriteriaOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LambdaEventSourceMappingFilterCriteriaOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putFilter(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putFilter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetFilter() {
        software.amazon.jsii.Kernel.call(this, "resetFilter", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lambdafunction.LambdaEventSourceMappingFilterCriteriaFilterList getFilter() {
        return software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaEventSourceMappingFilterCriteriaFilterList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getFilterInput() {
        return software.amazon.jsii.Kernel.get(this, "filterInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaEventSourceMappingFilterCriteria getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaEventSourceMappingFilterCriteria.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaEventSourceMappingFilterCriteria value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
