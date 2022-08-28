package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.455Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketWebsiteConfigurationRoutingRuleConditionOutputReference")
public class S3BucketWebsiteConfigurationRoutingRuleConditionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3BucketWebsiteConfigurationRoutingRuleConditionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketWebsiteConfigurationRoutingRuleConditionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public S3BucketWebsiteConfigurationRoutingRuleConditionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetHttpErrorCodeReturnedEquals() {
        software.amazon.jsii.Kernel.call(this, "resetHttpErrorCodeReturnedEquals", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKeyPrefixEquals() {
        software.amazon.jsii.Kernel.call(this, "resetKeyPrefixEquals", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHttpErrorCodeReturnedEqualsInput() {
        return software.amazon.jsii.Kernel.get(this, "httpErrorCodeReturnedEqualsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKeyPrefixEqualsInput() {
        return software.amazon.jsii.Kernel.get(this, "keyPrefixEqualsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHttpErrorCodeReturnedEquals() {
        return software.amazon.jsii.Kernel.get(this, "httpErrorCodeReturnedEquals", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHttpErrorCodeReturnedEquals(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "httpErrorCodeReturnedEquals", java.util.Objects.requireNonNull(value, "httpErrorCodeReturnedEquals is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKeyPrefixEquals() {
        return software.amazon.jsii.Kernel.get(this, "keyPrefixEquals", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKeyPrefixEquals(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "keyPrefixEquals", java.util.Objects.requireNonNull(value, "keyPrefixEquals is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketWebsiteConfigurationRoutingRuleCondition getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketWebsiteConfigurationRoutingRuleCondition.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketWebsiteConfigurationRoutingRuleCondition value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
