package imports.aws.emr;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.960Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.emr.EmrClusterMasterInstanceFleetLaunchSpecificationsOutputReference")
public class EmrClusterMasterInstanceFleetLaunchSpecificationsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected EmrClusterMasterInstanceFleetLaunchSpecificationsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EmrClusterMasterInstanceFleetLaunchSpecificationsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public EmrClusterMasterInstanceFleetLaunchSpecificationsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putOnDemandSpecification(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putOnDemandSpecification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSpotSpecification(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSpotSpecification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetOnDemandSpecification() {
        software.amazon.jsii.Kernel.call(this, "resetOnDemandSpecification", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSpotSpecification() {
        software.amazon.jsii.Kernel.call(this, "resetSpotSpecification", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.emr.EmrClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationList getOnDemandSpecification() {
        return software.amazon.jsii.Kernel.get(this, "onDemandSpecification", software.amazon.jsii.NativeType.forClass(imports.aws.emr.EmrClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.emr.EmrClusterMasterInstanceFleetLaunchSpecificationsSpotSpecificationList getSpotSpecification() {
        return software.amazon.jsii.Kernel.get(this, "spotSpecification", software.amazon.jsii.NativeType.forClass(imports.aws.emr.EmrClusterMasterInstanceFleetLaunchSpecificationsSpotSpecificationList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getOnDemandSpecificationInput() {
        return software.amazon.jsii.Kernel.get(this, "onDemandSpecificationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSpotSpecificationInput() {
        return software.amazon.jsii.Kernel.get(this, "spotSpecificationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.emr.EmrClusterMasterInstanceFleetLaunchSpecifications getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.emr.EmrClusterMasterInstanceFleetLaunchSpecifications.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.emr.EmrClusterMasterInstanceFleetLaunchSpecifications value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
