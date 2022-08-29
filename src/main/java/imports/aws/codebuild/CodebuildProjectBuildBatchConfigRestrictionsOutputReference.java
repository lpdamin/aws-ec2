package imports.aws.codebuild;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.093Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codebuild.CodebuildProjectBuildBatchConfigRestrictionsOutputReference")
public class CodebuildProjectBuildBatchConfigRestrictionsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CodebuildProjectBuildBatchConfigRestrictionsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodebuildProjectBuildBatchConfigRestrictionsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CodebuildProjectBuildBatchConfigRestrictionsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetComputeTypesAllowed() {
        software.amazon.jsii.Kernel.call(this, "resetComputeTypesAllowed", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaximumBuildsAllowed() {
        software.amazon.jsii.Kernel.call(this, "resetMaximumBuildsAllowed", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getComputeTypesAllowedInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "computeTypesAllowedInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaximumBuildsAllowedInput() {
        return software.amazon.jsii.Kernel.get(this, "maximumBuildsAllowedInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getComputeTypesAllowed() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "computeTypesAllowed", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setComputeTypesAllowed(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "computeTypesAllowed", java.util.Objects.requireNonNull(value, "computeTypesAllowed is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaximumBuildsAllowed() {
        return software.amazon.jsii.Kernel.get(this, "maximumBuildsAllowed", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaximumBuildsAllowed(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maximumBuildsAllowed", java.util.Objects.requireNonNull(value, "maximumBuildsAllowed is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildProjectBuildBatchConfigRestrictions getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectBuildBatchConfigRestrictions.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildProjectBuildBatchConfigRestrictions value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
