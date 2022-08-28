package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.487Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerDomainRetentionPolicyOutputReference")
public class SagemakerDomainRetentionPolicyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerDomainRetentionPolicyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerDomainRetentionPolicyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SagemakerDomainRetentionPolicyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetHomeEfsFileSystem() {
        software.amazon.jsii.Kernel.call(this, "resetHomeEfsFileSystem", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHomeEfsFileSystemInput() {
        return software.amazon.jsii.Kernel.get(this, "homeEfsFileSystemInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHomeEfsFileSystem() {
        return software.amazon.jsii.Kernel.get(this, "homeEfsFileSystem", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHomeEfsFileSystem(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "homeEfsFileSystem", java.util.Objects.requireNonNull(value, "homeEfsFileSystem is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerDomainRetentionPolicy getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerDomainRetentionPolicy.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerDomainRetentionPolicy value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
