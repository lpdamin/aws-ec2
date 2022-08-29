package imports.aws.autoscaling;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.810Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.autoscaling.AutoscalingGroupWarmPoolInstanceReusePolicyOutputReference")
public class AutoscalingGroupWarmPoolInstanceReusePolicyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AutoscalingGroupWarmPoolInstanceReusePolicyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AutoscalingGroupWarmPoolInstanceReusePolicyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AutoscalingGroupWarmPoolInstanceReusePolicyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetReuseOnScaleIn() {
        software.amazon.jsii.Kernel.call(this, "resetReuseOnScaleIn", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getReuseOnScaleInInput() {
        return software.amazon.jsii.Kernel.get(this, "reuseOnScaleInInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getReuseOnScaleIn() {
        return software.amazon.jsii.Kernel.get(this, "reuseOnScaleIn", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setReuseOnScaleIn(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "reuseOnScaleIn", java.util.Objects.requireNonNull(value, "reuseOnScaleIn is required"));
    }

    public void setReuseOnScaleIn(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "reuseOnScaleIn", java.util.Objects.requireNonNull(value, "reuseOnScaleIn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingGroupWarmPoolInstanceReusePolicy getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.autoscaling.AutoscalingGroupWarmPoolInstanceReusePolicy.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.autoscaling.AutoscalingGroupWarmPoolInstanceReusePolicy value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
