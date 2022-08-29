package imports.aws.ec2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.857Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.SpotInstanceRequestCapacityReservationSpecificationOutputReference")
public class SpotInstanceRequestCapacityReservationSpecificationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SpotInstanceRequestCapacityReservationSpecificationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SpotInstanceRequestCapacityReservationSpecificationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SpotInstanceRequestCapacityReservationSpecificationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCapacityReservationTarget(final @org.jetbrains.annotations.NotNull imports.aws.ec2.SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget value) {
        software.amazon.jsii.Kernel.call(this, "putCapacityReservationTarget", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCapacityReservationPreference() {
        software.amazon.jsii.Kernel.call(this, "resetCapacityReservationPreference", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCapacityReservationTarget() {
        software.amazon.jsii.Kernel.call(this, "resetCapacityReservationTarget", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetOutputReference getCapacityReservationTarget() {
        return software.amazon.jsii.Kernel.get(this, "capacityReservationTarget", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCapacityReservationPreferenceInput() {
        return software.amazon.jsii.Kernel.get(this, "capacityReservationPreferenceInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ec2.SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget getCapacityReservationTargetInput() {
        return software.amazon.jsii.Kernel.get(this, "capacityReservationTargetInput", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTarget.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCapacityReservationPreference() {
        return software.amazon.jsii.Kernel.get(this, "capacityReservationPreference", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCapacityReservationPreference(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "capacityReservationPreference", java.util.Objects.requireNonNull(value, "capacityReservationPreference is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ec2.SpotInstanceRequestCapacityReservationSpecification getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.SpotInstanceRequestCapacityReservationSpecification.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ec2.SpotInstanceRequestCapacityReservationSpecification value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
