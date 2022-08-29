package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.953Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.DataAwsMskBrokerNodesNodeInfoListOutputReference")
public class DataAwsMskBrokerNodesNodeInfoListOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataAwsMskBrokerNodesNodeInfoListOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsMskBrokerNodesNodeInfoListOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DataAwsMskBrokerNodesNodeInfoListOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAttachedEniId() {
        return software.amazon.jsii.Kernel.get(this, "attachedEniId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getBrokerId() {
        return software.amazon.jsii.Kernel.get(this, "brokerId", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClientSubnet() {
        return software.amazon.jsii.Kernel.get(this, "clientSubnet", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClientVpcIpAddress() {
        return software.amazon.jsii.Kernel.get(this, "clientVpcIpAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getEndpoints() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "endpoints", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNodeArn() {
        return software.amazon.jsii.Kernel.get(this, "nodeArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.DataAwsMskBrokerNodesNodeInfoList getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.msk.DataAwsMskBrokerNodesNodeInfoList.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.msk.DataAwsMskBrokerNodesNodeInfoList value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
