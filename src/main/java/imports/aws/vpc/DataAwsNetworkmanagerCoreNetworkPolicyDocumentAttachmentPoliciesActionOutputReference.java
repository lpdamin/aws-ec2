package imports.aws.vpc;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.857Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesActionOutputReference")
public class DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesActionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesActionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesActionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesActionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetRequireAcceptance() {
        software.amazon.jsii.Kernel.call(this, "resetRequireAcceptance", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSegment() {
        software.amazon.jsii.Kernel.call(this, "resetSegment", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagValueOfKey() {
        software.amazon.jsii.Kernel.call(this, "resetTagValueOfKey", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAssociationMethodInput() {
        return software.amazon.jsii.Kernel.get(this, "associationMethodInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRequireAcceptanceInput() {
        return software.amazon.jsii.Kernel.get(this, "requireAcceptanceInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSegmentInput() {
        return software.amazon.jsii.Kernel.get(this, "segmentInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTagValueOfKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "tagValueOfKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAssociationMethod() {
        return software.amazon.jsii.Kernel.get(this, "associationMethod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAssociationMethod(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "associationMethod", java.util.Objects.requireNonNull(value, "associationMethod is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getRequireAcceptance() {
        return software.amazon.jsii.Kernel.get(this, "requireAcceptance", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setRequireAcceptance(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "requireAcceptance", java.util.Objects.requireNonNull(value, "requireAcceptance is required"));
    }

    public void setRequireAcceptance(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "requireAcceptance", java.util.Objects.requireNonNull(value, "requireAcceptance is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSegment() {
        return software.amazon.jsii.Kernel.get(this, "segment", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSegment(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "segment", java.util.Objects.requireNonNull(value, "segment is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTagValueOfKey() {
        return software.amazon.jsii.Kernel.get(this, "tagValueOfKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTagValueOfKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tagValueOfKey", java.util.Objects.requireNonNull(value, "tagValueOfKey is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
