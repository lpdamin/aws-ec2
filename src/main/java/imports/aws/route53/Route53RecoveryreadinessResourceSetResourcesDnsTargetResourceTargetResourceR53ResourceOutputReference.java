package imports.aws.route53;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.358Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.route53.Route53RecoveryreadinessResourceSetResourcesDnsTargetResourceTargetResourceR53ResourceOutputReference")
public class Route53RecoveryreadinessResourceSetResourcesDnsTargetResourceTargetResourceR53ResourceOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Route53RecoveryreadinessResourceSetResourcesDnsTargetResourceTargetResourceR53ResourceOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Route53RecoveryreadinessResourceSetResourcesDnsTargetResourceTargetResourceR53ResourceOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public Route53RecoveryreadinessResourceSetResourcesDnsTargetResourceTargetResourceR53ResourceOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetDomainName() {
        software.amazon.jsii.Kernel.call(this, "resetDomainName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRecordSetId() {
        software.amazon.jsii.Kernel.call(this, "resetRecordSetId", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDomainNameInput() {
        return software.amazon.jsii.Kernel.get(this, "domainNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRecordSetIdInput() {
        return software.amazon.jsii.Kernel.get(this, "recordSetIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDomainName() {
        return software.amazon.jsii.Kernel.get(this, "domainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDomainName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "domainName", java.util.Objects.requireNonNull(value, "domainName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRecordSetId() {
        return software.amazon.jsii.Kernel.get(this, "recordSetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRecordSetId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "recordSetId", java.util.Objects.requireNonNull(value, "recordSetId is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.route53.Route53RecoveryreadinessResourceSetResourcesDnsTargetResourceTargetResourceR53Resource getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.route53.Route53RecoveryreadinessResourceSetResourcesDnsTargetResourceTargetResourceR53Resource.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.route53.Route53RecoveryreadinessResourceSetResourcesDnsTargetResourceTargetResourceR53Resource value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
