package imports.aws.autoscaling;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.810Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.autoscaling.AutoscalingGroupWarmPoolOutputReference")
public class AutoscalingGroupWarmPoolOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AutoscalingGroupWarmPoolOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AutoscalingGroupWarmPoolOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AutoscalingGroupWarmPoolOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putInstanceReusePolicy(final @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingGroupWarmPoolInstanceReusePolicy value) {
        software.amazon.jsii.Kernel.call(this, "putInstanceReusePolicy", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetInstanceReusePolicy() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceReusePolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxGroupPreparedCapacity() {
        software.amazon.jsii.Kernel.call(this, "resetMaxGroupPreparedCapacity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMinSize() {
        software.amazon.jsii.Kernel.call(this, "resetMinSize", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPoolState() {
        software.amazon.jsii.Kernel.call(this, "resetPoolState", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.autoscaling.AutoscalingGroupWarmPoolInstanceReusePolicyOutputReference getInstanceReusePolicy() {
        return software.amazon.jsii.Kernel.get(this, "instanceReusePolicy", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingGroupWarmPoolInstanceReusePolicyOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingGroupWarmPoolInstanceReusePolicy getInstanceReusePolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceReusePolicyInput", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingGroupWarmPoolInstanceReusePolicy.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaxGroupPreparedCapacityInput() {
        return software.amazon.jsii.Kernel.get(this, "maxGroupPreparedCapacityInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMinSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "minSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPoolStateInput() {
        return software.amazon.jsii.Kernel.get(this, "poolStateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaxGroupPreparedCapacity() {
        return software.amazon.jsii.Kernel.get(this, "maxGroupPreparedCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaxGroupPreparedCapacity(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maxGroupPreparedCapacity", java.util.Objects.requireNonNull(value, "maxGroupPreparedCapacity is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMinSize() {
        return software.amazon.jsii.Kernel.get(this, "minSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMinSize(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "minSize", java.util.Objects.requireNonNull(value, "minSize is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPoolState() {
        return software.amazon.jsii.Kernel.get(this, "poolState", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPoolState(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "poolState", java.util.Objects.requireNonNull(value, "poolState is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingGroupWarmPool getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingGroupWarmPool.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingGroupWarmPool value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
