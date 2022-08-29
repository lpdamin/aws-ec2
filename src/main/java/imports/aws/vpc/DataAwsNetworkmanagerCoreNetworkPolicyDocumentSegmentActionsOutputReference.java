package imports.aws.vpc;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.860Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentSegmentActionsOutputReference")
public class DataAwsNetworkmanagerCoreNetworkPolicyDocumentSegmentActionsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataAwsNetworkmanagerCoreNetworkPolicyDocumentSegmentActionsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsNetworkmanagerCoreNetworkPolicyDocumentSegmentActionsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DataAwsNetworkmanagerCoreNetworkPolicyDocumentSegmentActionsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDestinationCidrBlocks() {
        software.amazon.jsii.Kernel.call(this, "resetDestinationCidrBlocks", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDestinations() {
        software.amazon.jsii.Kernel.call(this, "resetDestinations", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMode() {
        software.amazon.jsii.Kernel.call(this, "resetMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetShareWith() {
        software.amazon.jsii.Kernel.call(this, "resetShareWith", software.amazon.jsii.NativeType.VOID);
    }

    public void resetShareWithExcept() {
        software.amazon.jsii.Kernel.call(this, "resetShareWithExcept", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getActionInput() {
        return software.amazon.jsii.Kernel.get(this, "actionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDestinationCidrBlocksInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "destinationCidrBlocksInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDestinationsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "destinationsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getModeInput() {
        return software.amazon.jsii.Kernel.get(this, "modeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSegmentInput() {
        return software.amazon.jsii.Kernel.get(this, "segmentInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getShareWithExceptInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "shareWithExceptInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getShareWithInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "shareWithInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAction() {
        return software.amazon.jsii.Kernel.get(this, "action", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAction(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "action", java.util.Objects.requireNonNull(value, "action is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getDestinationCidrBlocks() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "destinationCidrBlocks", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setDestinationCidrBlocks(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "destinationCidrBlocks", java.util.Objects.requireNonNull(value, "destinationCidrBlocks is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getDestinations() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "destinations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setDestinations(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "destinations", java.util.Objects.requireNonNull(value, "destinations is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMode() {
        return software.amazon.jsii.Kernel.get(this, "mode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "mode", java.util.Objects.requireNonNull(value, "mode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSegment() {
        return software.amazon.jsii.Kernel.get(this, "segment", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSegment(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "segment", java.util.Objects.requireNonNull(value, "segment is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getShareWith() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "shareWith", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setShareWith(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "shareWith", java.util.Objects.requireNonNull(value, "shareWith is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getShareWithExcept() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "shareWithExcept", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setShareWithExcept(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "shareWithExcept", java.util.Objects.requireNonNull(value, "shareWithExcept is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentSegmentActions value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
