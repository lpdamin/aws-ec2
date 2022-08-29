package imports.aws.vpc;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.858Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesOutputReference")
public class DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putAction(final @org.jetbrains.annotations.NotNull imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction value) {
        software.amazon.jsii.Kernel.call(this, "putAction", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putConditions(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putConditions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetConditionLogic() {
        software.amazon.jsii.Kernel.call(this, "resetConditionLogic", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesActionOutputReference getAction() {
        return software.amazon.jsii.Kernel.get(this, "action", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesActionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesConditionsList getConditions() {
        return software.amazon.jsii.Kernel.get(this, "conditions", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesConditionsList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction getActionInput() {
        return software.amazon.jsii.Kernel.get(this, "actionInput", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConditionLogicInput() {
        return software.amazon.jsii.Kernel.get(this, "conditionLogicInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getConditionsInput() {
        return software.amazon.jsii.Kernel.get(this, "conditionsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getRuleNumberInput() {
        return software.amazon.jsii.Kernel.get(this, "ruleNumberInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConditionLogic() {
        return software.amazon.jsii.Kernel.get(this, "conditionLogic", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConditionLogic(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "conditionLogic", java.util.Objects.requireNonNull(value, "conditionLogic is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getRuleNumber() {
        return software.amazon.jsii.Kernel.get(this, "ruleNumber", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setRuleNumber(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "ruleNumber", java.util.Objects.requireNonNull(value, "ruleNumber is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPolicies value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
