package imports.aws.codebuild;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.093Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codebuild.CodebuildProjectCacheOutputReference")
public class CodebuildProjectCacheOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CodebuildProjectCacheOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodebuildProjectCacheOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CodebuildProjectCacheOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetLocation() {
        software.amazon.jsii.Kernel.call(this, "resetLocation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetModes() {
        software.amazon.jsii.Kernel.call(this, "resetModes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetType() {
        software.amazon.jsii.Kernel.call(this, "resetType", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLocationInput() {
        return software.amazon.jsii.Kernel.get(this, "locationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getModesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "modesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLocation() {
        return software.amazon.jsii.Kernel.get(this, "location", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLocation(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "location", java.util.Objects.requireNonNull(value, "location is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getModes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "modes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setModes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "modes", java.util.Objects.requireNonNull(value, "modes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildProjectCache getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectCache.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildProjectCache value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
