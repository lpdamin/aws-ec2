package imports.aws.ses;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.684Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ses.SesConfigurationSetTrackingOptionsOutputReference")
public class SesConfigurationSetTrackingOptionsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SesConfigurationSetTrackingOptionsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SesConfigurationSetTrackingOptionsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SesConfigurationSetTrackingOptionsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetCustomRedirectDomain() {
        software.amazon.jsii.Kernel.call(this, "resetCustomRedirectDomain", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCustomRedirectDomainInput() {
        return software.amazon.jsii.Kernel.get(this, "customRedirectDomainInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCustomRedirectDomain() {
        return software.amazon.jsii.Kernel.get(this, "customRedirectDomain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCustomRedirectDomain(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "customRedirectDomain", java.util.Objects.requireNonNull(value, "customRedirectDomain is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ses.SesConfigurationSetTrackingOptions getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ses.SesConfigurationSetTrackingOptions.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ses.SesConfigurationSetTrackingOptions value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
