package imports.aws.ec2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.823Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.LaunchTemplateCreditSpecificationOutputReference")
public class LaunchTemplateCreditSpecificationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LaunchTemplateCreditSpecificationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LaunchTemplateCreditSpecificationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LaunchTemplateCreditSpecificationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetCpuCredits() {
        software.amazon.jsii.Kernel.call(this, "resetCpuCredits", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCpuCreditsInput() {
        return software.amazon.jsii.Kernel.get(this, "cpuCreditsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCpuCredits() {
        return software.amazon.jsii.Kernel.get(this, "cpuCredits", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCpuCredits(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cpuCredits", java.util.Objects.requireNonNull(value, "cpuCredits is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ec2.LaunchTemplateCreditSpecification getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.LaunchTemplateCreditSpecification.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ec2.LaunchTemplateCreditSpecification value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
