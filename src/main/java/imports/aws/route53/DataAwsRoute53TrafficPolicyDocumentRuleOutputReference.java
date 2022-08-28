package imports.aws.route53;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.315Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.route53.DataAwsRoute53TrafficPolicyDocumentRuleOutputReference")
public class DataAwsRoute53TrafficPolicyDocumentRuleOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataAwsRoute53TrafficPolicyDocumentRuleOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsRoute53TrafficPolicyDocumentRuleOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DataAwsRoute53TrafficPolicyDocumentRuleOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putGeoProximityLocation(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putGeoProximityLocation", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putItems(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putItems", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLocation(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putLocation", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPrimary(final @org.jetbrains.annotations.NotNull imports.aws.route53.DataAwsRoute53TrafficPolicyDocumentRulePrimary value) {
        software.amazon.jsii.Kernel.call(this, "putPrimary", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRegion(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putRegion", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSecondary(final @org.jetbrains.annotations.NotNull imports.aws.route53.DataAwsRoute53TrafficPolicyDocumentRuleSecondary value) {
        software.amazon.jsii.Kernel.call(this, "putSecondary", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetGeoProximityLocation() {
        software.amazon.jsii.Kernel.call(this, "resetGeoProximityLocation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetItems() {
        software.amazon.jsii.Kernel.call(this, "resetItems", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLocation() {
        software.amazon.jsii.Kernel.call(this, "resetLocation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrimary() {
        software.amazon.jsii.Kernel.call(this, "resetPrimary", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRegion() {
        software.amazon.jsii.Kernel.call(this, "resetRegion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecondary() {
        software.amazon.jsii.Kernel.call(this, "resetSecondary", software.amazon.jsii.NativeType.VOID);
    }

    public void resetType() {
        software.amazon.jsii.Kernel.call(this, "resetType", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.route53.DataAwsRoute53TrafficPolicyDocumentRuleGeoProximityLocationList getGeoProximityLocation() {
        return software.amazon.jsii.Kernel.get(this, "geoProximityLocation", software.amazon.jsii.NativeType.forClass(imports.aws.route53.DataAwsRoute53TrafficPolicyDocumentRuleGeoProximityLocationList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.route53.DataAwsRoute53TrafficPolicyDocumentRuleItemsList getItems() {
        return software.amazon.jsii.Kernel.get(this, "items", software.amazon.jsii.NativeType.forClass(imports.aws.route53.DataAwsRoute53TrafficPolicyDocumentRuleItemsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.route53.DataAwsRoute53TrafficPolicyDocumentRuleLocationList getLocation() {
        return software.amazon.jsii.Kernel.get(this, "location", software.amazon.jsii.NativeType.forClass(imports.aws.route53.DataAwsRoute53TrafficPolicyDocumentRuleLocationList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.route53.DataAwsRoute53TrafficPolicyDocumentRulePrimaryOutputReference getPrimary() {
        return software.amazon.jsii.Kernel.get(this, "primary", software.amazon.jsii.NativeType.forClass(imports.aws.route53.DataAwsRoute53TrafficPolicyDocumentRulePrimaryOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.route53.DataAwsRoute53TrafficPolicyDocumentRuleRegionList getRegion() {
        return software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(imports.aws.route53.DataAwsRoute53TrafficPolicyDocumentRuleRegionList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.route53.DataAwsRoute53TrafficPolicyDocumentRuleSecondaryOutputReference getSecondary() {
        return software.amazon.jsii.Kernel.get(this, "secondary", software.amazon.jsii.NativeType.forClass(imports.aws.route53.DataAwsRoute53TrafficPolicyDocumentRuleSecondaryOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getGeoProximityLocationInput() {
        return software.amazon.jsii.Kernel.get(this, "geoProximityLocationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getItemsInput() {
        return software.amazon.jsii.Kernel.get(this, "itemsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getLocationInput() {
        return software.amazon.jsii.Kernel.get(this, "locationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.route53.DataAwsRoute53TrafficPolicyDocumentRulePrimary getPrimaryInput() {
        return software.amazon.jsii.Kernel.get(this, "primaryInput", software.amazon.jsii.NativeType.forClass(imports.aws.route53.DataAwsRoute53TrafficPolicyDocumentRulePrimary.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "regionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.route53.DataAwsRoute53TrafficPolicyDocumentRuleSecondary getSecondaryInput() {
        return software.amazon.jsii.Kernel.get(this, "secondaryInput", software.amazon.jsii.NativeType.forClass(imports.aws.route53.DataAwsRoute53TrafficPolicyDocumentRuleSecondary.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.route53.DataAwsRoute53TrafficPolicyDocumentRule value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
