package imports.aws.ec2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.728Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.Ec2FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceOutputReference")
public class Ec2FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Ec2FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Ec2FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public Ec2FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetReplacementStrategy() {
        software.amazon.jsii.Kernel.call(this, "resetReplacementStrategy", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getReplacementStrategyInput() {
        return software.amazon.jsii.Kernel.get(this, "replacementStrategyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReplacementStrategy() {
        return software.amazon.jsii.Kernel.get(this, "replacementStrategy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReplacementStrategy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "replacementStrategy", java.util.Objects.requireNonNull(value, "replacementStrategy is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ec2.Ec2FleetSpotOptionsMaintenanceStrategiesCapacityRebalance getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2FleetSpotOptionsMaintenanceStrategiesCapacityRebalance.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ec2.Ec2FleetSpotOptionsMaintenanceStrategiesCapacityRebalance value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
