package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.336Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueJobNotificationPropertyOutputReference")
public class GlueJobNotificationPropertyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GlueJobNotificationPropertyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueJobNotificationPropertyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GlueJobNotificationPropertyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetNotifyDelayAfter() {
        software.amazon.jsii.Kernel.call(this, "resetNotifyDelayAfter", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getNotifyDelayAfterInput() {
        return software.amazon.jsii.Kernel.get(this, "notifyDelayAfterInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getNotifyDelayAfter() {
        return software.amazon.jsii.Kernel.get(this, "notifyDelayAfter", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setNotifyDelayAfter(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "notifyDelayAfter", java.util.Objects.requireNonNull(value, "notifyDelayAfter is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueJobNotificationProperty getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueJobNotificationProperty.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.glue.GlueJobNotificationProperty value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
