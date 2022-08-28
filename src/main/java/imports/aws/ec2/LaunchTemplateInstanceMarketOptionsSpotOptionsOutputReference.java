package imports.aws.ec2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.193Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.LaunchTemplateInstanceMarketOptionsSpotOptionsOutputReference")
public class LaunchTemplateInstanceMarketOptionsSpotOptionsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LaunchTemplateInstanceMarketOptionsSpotOptionsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LaunchTemplateInstanceMarketOptionsSpotOptionsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LaunchTemplateInstanceMarketOptionsSpotOptionsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetBlockDurationMinutes() {
        software.amazon.jsii.Kernel.call(this, "resetBlockDurationMinutes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceInterruptionBehavior() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceInterruptionBehavior", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaxPrice() {
        software.amazon.jsii.Kernel.call(this, "resetMaxPrice", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSpotInstanceType() {
        software.amazon.jsii.Kernel.call(this, "resetSpotInstanceType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetValidUntil() {
        software.amazon.jsii.Kernel.call(this, "resetValidUntil", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getBlockDurationMinutesInput() {
        return software.amazon.jsii.Kernel.get(this, "blockDurationMinutesInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInstanceInterruptionBehaviorInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceInterruptionBehaviorInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMaxPriceInput() {
        return software.amazon.jsii.Kernel.get(this, "maxPriceInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSpotInstanceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "spotInstanceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getValidUntilInput() {
        return software.amazon.jsii.Kernel.get(this, "validUntilInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getBlockDurationMinutes() {
        return software.amazon.jsii.Kernel.get(this, "blockDurationMinutes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setBlockDurationMinutes(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "blockDurationMinutes", java.util.Objects.requireNonNull(value, "blockDurationMinutes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceInterruptionBehavior() {
        return software.amazon.jsii.Kernel.get(this, "instanceInterruptionBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInstanceInterruptionBehavior(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "instanceInterruptionBehavior", java.util.Objects.requireNonNull(value, "instanceInterruptionBehavior is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMaxPrice() {
        return software.amazon.jsii.Kernel.get(this, "maxPrice", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMaxPrice(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "maxPrice", java.util.Objects.requireNonNull(value, "maxPrice is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSpotInstanceType() {
        return software.amazon.jsii.Kernel.get(this, "spotInstanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSpotInstanceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "spotInstanceType", java.util.Objects.requireNonNull(value, "spotInstanceType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getValidUntil() {
        return software.amazon.jsii.Kernel.get(this, "validUntil", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setValidUntil(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "validUntil", java.util.Objects.requireNonNull(value, "validUntil is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ec2.LaunchTemplateInstanceMarketOptionsSpotOptions getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.LaunchTemplateInstanceMarketOptionsSpotOptions.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ec2.LaunchTemplateInstanceMarketOptionsSpotOptions value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
