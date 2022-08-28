package imports.aws.cloudfront;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.242Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontOriginRequestPolicyQueryStringsConfigOutputReference")
public class CloudfrontOriginRequestPolicyQueryStringsConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudfrontOriginRequestPolicyQueryStringsConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontOriginRequestPolicyQueryStringsConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudfrontOriginRequestPolicyQueryStringsConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putQueryStrings(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontOriginRequestPolicyQueryStringsConfigQueryStrings value) {
        software.amazon.jsii.Kernel.call(this, "putQueryStrings", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetQueryStrings() {
        software.amazon.jsii.Kernel.call(this, "resetQueryStrings", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontOriginRequestPolicyQueryStringsConfigQueryStringsOutputReference getQueryStrings() {
        return software.amazon.jsii.Kernel.get(this, "queryStrings", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontOriginRequestPolicyQueryStringsConfigQueryStringsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getQueryStringBehaviorInput() {
        return software.amazon.jsii.Kernel.get(this, "queryStringBehaviorInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontOriginRequestPolicyQueryStringsConfigQueryStrings getQueryStringsInput() {
        return software.amazon.jsii.Kernel.get(this, "queryStringsInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontOriginRequestPolicyQueryStringsConfigQueryStrings.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getQueryStringBehavior() {
        return software.amazon.jsii.Kernel.get(this, "queryStringBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setQueryStringBehavior(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "queryStringBehavior", java.util.Objects.requireNonNull(value, "queryStringBehavior is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontOriginRequestPolicyQueryStringsConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontOriginRequestPolicyQueryStringsConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontOriginRequestPolicyQueryStringsConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
