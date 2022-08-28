package imports.aws.gamelift;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.251Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.gamelift.GameliftFleetResourceCreationLimitPolicyOutputReference")
public class GameliftFleetResourceCreationLimitPolicyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GameliftFleetResourceCreationLimitPolicyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GameliftFleetResourceCreationLimitPolicyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GameliftFleetResourceCreationLimitPolicyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetNewGameSessionsPerCreator() {
        software.amazon.jsii.Kernel.call(this, "resetNewGameSessionsPerCreator", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPolicyPeriodInMinutes() {
        software.amazon.jsii.Kernel.call(this, "resetPolicyPeriodInMinutes", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getNewGameSessionsPerCreatorInput() {
        return software.amazon.jsii.Kernel.get(this, "newGameSessionsPerCreatorInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPolicyPeriodInMinutesInput() {
        return software.amazon.jsii.Kernel.get(this, "policyPeriodInMinutesInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getNewGameSessionsPerCreator() {
        return software.amazon.jsii.Kernel.get(this, "newGameSessionsPerCreator", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setNewGameSessionsPerCreator(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "newGameSessionsPerCreator", java.util.Objects.requireNonNull(value, "newGameSessionsPerCreator is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPolicyPeriodInMinutes() {
        return software.amazon.jsii.Kernel.get(this, "policyPeriodInMinutes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPolicyPeriodInMinutes(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "policyPeriodInMinutes", java.util.Objects.requireNonNull(value, "policyPeriodInMinutes is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.gamelift.GameliftFleetResourceCreationLimitPolicy getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.gamelift.GameliftFleetResourceCreationLimitPolicy.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.gamelift.GameliftFleetResourceCreationLimitPolicy value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
