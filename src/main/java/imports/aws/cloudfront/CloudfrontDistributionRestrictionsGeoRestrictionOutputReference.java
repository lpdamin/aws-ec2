package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.958Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontDistributionRestrictionsGeoRestrictionOutputReference")
public class CloudfrontDistributionRestrictionsGeoRestrictionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudfrontDistributionRestrictionsGeoRestrictionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontDistributionRestrictionsGeoRestrictionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudfrontDistributionRestrictionsGeoRestrictionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetLocations() {
        software.amazon.jsii.Kernel.call(this, "resetLocations", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLocationsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "locationsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRestrictionTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "restrictionTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLocations() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "locations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setLocations(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "locations", java.util.Objects.requireNonNull(value, "locations is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRestrictionType() {
        return software.amazon.jsii.Kernel.get(this, "restrictionType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRestrictionType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "restrictionType", java.util.Objects.requireNonNull(value, "restrictionType is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionRestrictionsGeoRestriction getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionRestrictionsGeoRestriction.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionRestrictionsGeoRestriction value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
