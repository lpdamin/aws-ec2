package imports.aws.ec2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.269Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.SpotFleetRequestSpotMaintenanceStrategiesOutputReference")
public class SpotFleetRequestSpotMaintenanceStrategiesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SpotFleetRequestSpotMaintenanceStrategiesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SpotFleetRequestSpotMaintenanceStrategiesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SpotFleetRequestSpotMaintenanceStrategiesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCapacityRebalance(final @org.jetbrains.annotations.NotNull imports.aws.ec2.SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalance value) {
        software.amazon.jsii.Kernel.call(this, "putCapacityRebalance", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCapacityRebalance() {
        software.amazon.jsii.Kernel.call(this, "resetCapacityRebalance", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalanceOutputReference getCapacityRebalance() {
        return software.amazon.jsii.Kernel.get(this, "capacityRebalance", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalanceOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ec2.SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalance getCapacityRebalanceInput() {
        return software.amazon.jsii.Kernel.get(this, "capacityRebalanceInput", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.SpotFleetRequestSpotMaintenanceStrategiesCapacityRebalance.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ec2.SpotFleetRequestSpotMaintenanceStrategies getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.SpotFleetRequestSpotMaintenanceStrategies.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ec2.SpotFleetRequestSpotMaintenanceStrategies value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
