package imports.aws.athena;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.795Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.athena.AthenaDatabaseAclConfigurationOutputReference")
public class AthenaDatabaseAclConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AthenaDatabaseAclConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AthenaDatabaseAclConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AthenaDatabaseAclConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getS3AclOptionInput() {
        return software.amazon.jsii.Kernel.get(this, "s3AclOptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3AclOption() {
        return software.amazon.jsii.Kernel.get(this, "s3AclOption", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setS3AclOption(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "s3AclOption", java.util.Objects.requireNonNull(value, "s3AclOption is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.athena.AthenaDatabaseAclConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.athena.AthenaDatabaseAclConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.athena.AthenaDatabaseAclConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
