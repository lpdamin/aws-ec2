package imports.aws.vpc;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.974Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.vpc.NetworkmanagerDeviceAwsLocationOutputReference")
public class NetworkmanagerDeviceAwsLocationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected NetworkmanagerDeviceAwsLocationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected NetworkmanagerDeviceAwsLocationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public NetworkmanagerDeviceAwsLocationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetSubnetArn() {
        software.amazon.jsii.Kernel.call(this, "resetSubnetArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetZone() {
        software.amazon.jsii.Kernel.call(this, "resetZone", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSubnetArnInput() {
        return software.amazon.jsii.Kernel.get(this, "subnetArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getZoneInput() {
        return software.amazon.jsii.Kernel.get(this, "zoneInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSubnetArn() {
        return software.amazon.jsii.Kernel.get(this, "subnetArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSubnetArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "subnetArn", java.util.Objects.requireNonNull(value, "subnetArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getZone() {
        return software.amazon.jsii.Kernel.get(this, "zone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setZone(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "zone", java.util.Objects.requireNonNull(value, "zone is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.vpc.NetworkmanagerDeviceAwsLocation getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.NetworkmanagerDeviceAwsLocation.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.vpc.NetworkmanagerDeviceAwsLocation value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
