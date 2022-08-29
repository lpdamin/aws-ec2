package imports.aws.dlm;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.446Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.dlm.DlmLifecyclePolicyPolicyDetailsOutputReference")
public class DlmLifecyclePolicyPolicyDetailsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DlmLifecyclePolicyPolicyDetailsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DlmLifecyclePolicyPolicyDetailsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DlmLifecyclePolicyPolicyDetailsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putAction(final @org.jetbrains.annotations.NotNull imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsAction value) {
        software.amazon.jsii.Kernel.call(this, "putAction", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEventSource(final @org.jetbrains.annotations.NotNull imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsEventSource value) {
        software.amazon.jsii.Kernel.call(this, "putEventSource", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putParameters(final @org.jetbrains.annotations.NotNull imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsParameters value) {
        software.amazon.jsii.Kernel.call(this, "putParameters", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSchedule(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSchedule", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAction() {
        software.amazon.jsii.Kernel.call(this, "resetAction", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEventSource() {
        software.amazon.jsii.Kernel.call(this, "resetEventSource", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParameters() {
        software.amazon.jsii.Kernel.call(this, "resetParameters", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPolicyType() {
        software.amazon.jsii.Kernel.call(this, "resetPolicyType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResourceLocations() {
        software.amazon.jsii.Kernel.call(this, "resetResourceLocations", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResourceTypes() {
        software.amazon.jsii.Kernel.call(this, "resetResourceTypes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSchedule() {
        software.amazon.jsii.Kernel.call(this, "resetSchedule", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTargetTags", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsActionOutputReference getAction() {
        return software.amazon.jsii.Kernel.get(this, "action", software.amazon.jsii.NativeType.forClass(imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsActionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsEventSourceOutputReference getEventSource() {
        return software.amazon.jsii.Kernel.get(this, "eventSource", software.amazon.jsii.NativeType.forClass(imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsEventSourceOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsParametersOutputReference getParameters() {
        return software.amazon.jsii.Kernel.get(this, "parameters", software.amazon.jsii.NativeType.forClass(imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsParametersOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleList getSchedule() {
        return software.amazon.jsii.Kernel.get(this, "schedule", software.amazon.jsii.NativeType.forClass(imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsAction getActionInput() {
        return software.amazon.jsii.Kernel.get(this, "actionInput", software.amazon.jsii.NativeType.forClass(imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsAction.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsEventSource getEventSourceInput() {
        return software.amazon.jsii.Kernel.get(this, "eventSourceInput", software.amazon.jsii.NativeType.forClass(imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsEventSource.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsParameters getParametersInput() {
        return software.amazon.jsii.Kernel.get(this, "parametersInput", software.amazon.jsii.NativeType.forClass(imports.aws.dlm.DlmLifecyclePolicyPolicyDetailsParameters.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPolicyTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "policyTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getResourceLocationsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "resourceLocationsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getResourceTypesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "resourceTypesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getScheduleInput() {
        return software.amazon.jsii.Kernel.get(this, "scheduleInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTargetTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "targetTagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPolicyType() {
        return software.amazon.jsii.Kernel.get(this, "policyType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicyType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policyType", java.util.Objects.requireNonNull(value, "policyType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getResourceLocations() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "resourceLocations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setResourceLocations(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "resourceLocations", java.util.Objects.requireNonNull(value, "resourceLocations is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getResourceTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "resourceTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setResourceTypes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "resourceTypes", java.util.Objects.requireNonNull(value, "resourceTypes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTargetTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "targetTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTargetTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "targetTags", java.util.Objects.requireNonNull(value, "targetTags is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.dlm.DlmLifecyclePolicyPolicyDetails getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.dlm.DlmLifecyclePolicyPolicyDetails.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.dlm.DlmLifecyclePolicyPolicyDetails value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
