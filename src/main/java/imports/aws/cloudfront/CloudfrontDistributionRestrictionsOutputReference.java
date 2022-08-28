package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.203Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontDistributionRestrictionsOutputReference")
public class CloudfrontDistributionRestrictionsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudfrontDistributionRestrictionsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontDistributionRestrictionsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudfrontDistributionRestrictionsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putGeoRestriction(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionRestrictionsGeoRestriction value) {
        software.amazon.jsii.Kernel.call(this, "putGeoRestriction", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontDistributionRestrictionsGeoRestrictionOutputReference getGeoRestriction() {
        return software.amazon.jsii.Kernel.get(this, "geoRestriction", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionRestrictionsGeoRestrictionOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionRestrictionsGeoRestriction getGeoRestrictionInput() {
        return software.amazon.jsii.Kernel.get(this, "geoRestrictionInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionRestrictionsGeoRestriction.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionRestrictions getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontDistributionRestrictions.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontDistributionRestrictions value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
