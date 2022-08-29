package imports.aws.elb;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.029Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.elb.AlbListenerDefaultActionForwardOutputReference")
public class AlbListenerDefaultActionForwardOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AlbListenerDefaultActionForwardOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AlbListenerDefaultActionForwardOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AlbListenerDefaultActionForwardOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putStickiness(final @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerDefaultActionForwardStickiness value) {
        software.amazon.jsii.Kernel.call(this, "putStickiness", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTargetGroup(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putTargetGroup", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetStickiness() {
        software.amazon.jsii.Kernel.call(this, "resetStickiness", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerDefaultActionForwardStickinessOutputReference getStickiness() {
        return software.amazon.jsii.Kernel.get(this, "stickiness", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerDefaultActionForwardStickinessOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerDefaultActionForwardTargetGroupList getTargetGroup() {
        return software.amazon.jsii.Kernel.get(this, "targetGroup", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerDefaultActionForwardTargetGroupList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerDefaultActionForwardStickiness getStickinessInput() {
        return software.amazon.jsii.Kernel.get(this, "stickinessInput", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerDefaultActionForwardStickiness.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTargetGroupInput() {
        return software.amazon.jsii.Kernel.get(this, "targetGroupInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerDefaultActionForward getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerDefaultActionForward.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerDefaultActionForward value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
