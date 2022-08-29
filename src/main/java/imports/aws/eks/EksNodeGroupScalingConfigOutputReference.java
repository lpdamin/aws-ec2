package imports.aws.eks;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.959Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.eks.EksNodeGroupScalingConfigOutputReference")
public class EksNodeGroupScalingConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected EksNodeGroupScalingConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EksNodeGroupScalingConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public EksNodeGroupScalingConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDesiredSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "desiredSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "maxSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMinSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "minSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDesiredSize() {
        return software.amazon.jsii.Kernel.get(this, "desiredSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDesiredSize(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "desiredSize", java.util.Objects.requireNonNull(value, "desiredSize is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxSize() {
        return software.amazon.jsii.Kernel.get(this, "maxSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxSize(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxSize", java.util.Objects.requireNonNull(value, "maxSize is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMinSize() {
        return software.amazon.jsii.Kernel.get(this, "minSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMinSize(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "minSize", java.util.Objects.requireNonNull(value, "minSize is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eks.EksNodeGroupScalingConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.eks.EksNodeGroupScalingConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.eks.EksNodeGroupScalingConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
