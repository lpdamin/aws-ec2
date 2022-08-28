package imports.aws.ec2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.193Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.LaunchTemplateInstanceMarketOptionsOutputReference")
public class LaunchTemplateInstanceMarketOptionsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LaunchTemplateInstanceMarketOptionsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LaunchTemplateInstanceMarketOptionsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LaunchTemplateInstanceMarketOptionsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSpotOptions(final @org.jetbrains.annotations.NotNull imports.aws.ec2.LaunchTemplateInstanceMarketOptionsSpotOptions value) {
        software.amazon.jsii.Kernel.call(this, "putSpotOptions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetMarketType() {
        software.amazon.jsii.Kernel.call(this, "resetMarketType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSpotOptions() {
        software.amazon.jsii.Kernel.call(this, "resetSpotOptions", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.LaunchTemplateInstanceMarketOptionsSpotOptionsOutputReference getSpotOptions() {
        return software.amazon.jsii.Kernel.get(this, "spotOptions", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.LaunchTemplateInstanceMarketOptionsSpotOptionsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMarketTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "marketTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ec2.LaunchTemplateInstanceMarketOptionsSpotOptions getSpotOptionsInput() {
        return software.amazon.jsii.Kernel.get(this, "spotOptionsInput", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.LaunchTemplateInstanceMarketOptionsSpotOptions.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMarketType() {
        return software.amazon.jsii.Kernel.get(this, "marketType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMarketType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "marketType", java.util.Objects.requireNonNull(value, "marketType is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ec2.LaunchTemplateInstanceMarketOptions getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.LaunchTemplateInstanceMarketOptions.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ec2.LaunchTemplateInstanceMarketOptions value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
