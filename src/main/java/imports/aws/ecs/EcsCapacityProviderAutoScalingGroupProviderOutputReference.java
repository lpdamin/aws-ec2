package imports.aws.ecs;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.388Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ecs.EcsCapacityProviderAutoScalingGroupProviderOutputReference")
public class EcsCapacityProviderAutoScalingGroupProviderOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected EcsCapacityProviderAutoScalingGroupProviderOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EcsCapacityProviderAutoScalingGroupProviderOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public EcsCapacityProviderAutoScalingGroupProviderOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putManagedScaling(final @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsCapacityProviderAutoScalingGroupProviderManagedScaling value) {
        software.amazon.jsii.Kernel.call(this, "putManagedScaling", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetManagedScaling() {
        software.amazon.jsii.Kernel.call(this, "resetManagedScaling", software.amazon.jsii.NativeType.VOID);
    }

    public void resetManagedTerminationProtection() {
        software.amazon.jsii.Kernel.call(this, "resetManagedTerminationProtection", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ecs.EcsCapacityProviderAutoScalingGroupProviderManagedScalingOutputReference getManagedScaling() {
        return software.amazon.jsii.Kernel.get(this, "managedScaling", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsCapacityProviderAutoScalingGroupProviderManagedScalingOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAutoScalingGroupArnInput() {
        return software.amazon.jsii.Kernel.get(this, "autoScalingGroupArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsCapacityProviderAutoScalingGroupProviderManagedScaling getManagedScalingInput() {
        return software.amazon.jsii.Kernel.get(this, "managedScalingInput", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsCapacityProviderAutoScalingGroupProviderManagedScaling.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getManagedTerminationProtectionInput() {
        return software.amazon.jsii.Kernel.get(this, "managedTerminationProtectionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAutoScalingGroupArn() {
        return software.amazon.jsii.Kernel.get(this, "autoScalingGroupArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAutoScalingGroupArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "autoScalingGroupArn", java.util.Objects.requireNonNull(value, "autoScalingGroupArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getManagedTerminationProtection() {
        return software.amazon.jsii.Kernel.get(this, "managedTerminationProtection", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setManagedTerminationProtection(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "managedTerminationProtection", java.util.Objects.requireNonNull(value, "managedTerminationProtection is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsCapacityProviderAutoScalingGroupProvider getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsCapacityProviderAutoScalingGroupProvider.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsCapacityProviderAutoScalingGroupProvider value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
