package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.463Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketWebsiteConfigurationRoutingRuleOutputReference")
public class S3BucketWebsiteConfigurationRoutingRuleOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3BucketWebsiteConfigurationRoutingRuleOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketWebsiteConfigurationRoutingRuleOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public S3BucketWebsiteConfigurationRoutingRuleOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putCondition(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketWebsiteConfigurationRoutingRuleCondition value) {
        software.amazon.jsii.Kernel.call(this, "putCondition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRedirect(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketWebsiteConfigurationRoutingRuleRedirect value) {
        software.amazon.jsii.Kernel.call(this, "putRedirect", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCondition() {
        software.amazon.jsii.Kernel.call(this, "resetCondition", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketWebsiteConfigurationRoutingRuleConditionOutputReference getCondition() {
        return software.amazon.jsii.Kernel.get(this, "condition", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketWebsiteConfigurationRoutingRuleConditionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketWebsiteConfigurationRoutingRuleRedirectOutputReference getRedirect() {
        return software.amazon.jsii.Kernel.get(this, "redirect", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketWebsiteConfigurationRoutingRuleRedirectOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketWebsiteConfigurationRoutingRuleCondition getConditionInput() {
        return software.amazon.jsii.Kernel.get(this, "conditionInput", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketWebsiteConfigurationRoutingRuleCondition.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketWebsiteConfigurationRoutingRuleRedirect getRedirectInput() {
        return software.amazon.jsii.Kernel.get(this, "redirectInput", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketWebsiteConfigurationRoutingRuleRedirect.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketWebsiteConfigurationRoutingRule value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
