package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.374Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.OpensearchDomainClusterConfigZoneAwarenessConfigOutputReference")
public class OpensearchDomainClusterConfigZoneAwarenessConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected OpensearchDomainClusterConfigZoneAwarenessConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected OpensearchDomainClusterConfigZoneAwarenessConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public OpensearchDomainClusterConfigZoneAwarenessConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetAvailabilityZoneCount() {
        software.amazon.jsii.Kernel.call(this, "resetAvailabilityZoneCount", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getAvailabilityZoneCountInput() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZoneCountInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getAvailabilityZoneCount() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZoneCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setAvailabilityZoneCount(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "availabilityZoneCount", java.util.Objects.requireNonNull(value, "availabilityZoneCount is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.OpensearchDomainClusterConfigZoneAwarenessConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.OpensearchDomainClusterConfigZoneAwarenessConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.OpensearchDomainClusterConfigZoneAwarenessConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
