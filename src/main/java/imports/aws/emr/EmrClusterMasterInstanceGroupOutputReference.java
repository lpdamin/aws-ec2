package imports.aws.emr;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.120Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.emr.EmrClusterMasterInstanceGroupOutputReference")
public class EmrClusterMasterInstanceGroupOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected EmrClusterMasterInstanceGroupOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EmrClusterMasterInstanceGroupOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public EmrClusterMasterInstanceGroupOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putEbsConfig(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putEbsConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetBidPrice() {
        software.amazon.jsii.Kernel.call(this, "resetBidPrice", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEbsConfig() {
        software.amazon.jsii.Kernel.call(this, "resetEbsConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInstanceCount() {
        software.amazon.jsii.Kernel.call(this, "resetInstanceCount", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.emr.EmrClusterMasterInstanceGroupEbsConfigList getEbsConfig() {
        return software.amazon.jsii.Kernel.get(this, "ebsConfig", software.amazon.jsii.NativeType.forClass(imports.aws.emr.EmrClusterMasterInstanceGroupEbsConfigList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBidPriceInput() {
        return software.amazon.jsii.Kernel.get(this, "bidPriceInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEbsConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "ebsConfigInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getInstanceCountInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceCountInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInstanceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "instanceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBidPrice() {
        return software.amazon.jsii.Kernel.get(this, "bidPrice", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBidPrice(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bidPrice", java.util.Objects.requireNonNull(value, "bidPrice is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getInstanceCount() {
        return software.amazon.jsii.Kernel.get(this, "instanceCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setInstanceCount(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "instanceCount", java.util.Objects.requireNonNull(value, "instanceCount is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceType() {
        return software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInstanceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "instanceType", java.util.Objects.requireNonNull(value, "instanceType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.emr.EmrClusterMasterInstanceGroup getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.emr.EmrClusterMasterInstanceGroup.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.emr.EmrClusterMasterInstanceGroup value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
