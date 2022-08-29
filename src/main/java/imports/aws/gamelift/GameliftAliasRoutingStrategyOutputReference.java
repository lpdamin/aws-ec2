package imports.aws.gamelift;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.212Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.gamelift.GameliftAliasRoutingStrategyOutputReference")
public class GameliftAliasRoutingStrategyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GameliftAliasRoutingStrategyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GameliftAliasRoutingStrategyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GameliftAliasRoutingStrategyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetFleetId() {
        software.amazon.jsii.Kernel.call(this, "resetFleetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMessage() {
        software.amazon.jsii.Kernel.call(this, "resetMessage", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFleetIdInput() {
        return software.amazon.jsii.Kernel.get(this, "fleetIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMessageInput() {
        return software.amazon.jsii.Kernel.get(this, "messageInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFleetId() {
        return software.amazon.jsii.Kernel.get(this, "fleetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFleetId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "fleetId", java.util.Objects.requireNonNull(value, "fleetId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMessage() {
        return software.amazon.jsii.Kernel.get(this, "message", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMessage(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "message", java.util.Objects.requireNonNull(value, "message is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.gamelift.GameliftAliasRoutingStrategy getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.gamelift.GameliftAliasRoutingStrategy.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.gamelift.GameliftAliasRoutingStrategy value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
