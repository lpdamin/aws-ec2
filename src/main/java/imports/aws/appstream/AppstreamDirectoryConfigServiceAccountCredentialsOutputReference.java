package imports.aws.appstream;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.662Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appstream.AppstreamDirectoryConfigServiceAccountCredentialsOutputReference")
public class AppstreamDirectoryConfigServiceAccountCredentialsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppstreamDirectoryConfigServiceAccountCredentialsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppstreamDirectoryConfigServiceAccountCredentialsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppstreamDirectoryConfigServiceAccountCredentialsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAccountNameInput() {
        return software.amazon.jsii.Kernel.get(this, "accountNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAccountPasswordInput() {
        return software.amazon.jsii.Kernel.get(this, "accountPasswordInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAccountName() {
        return software.amazon.jsii.Kernel.get(this, "accountName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAccountName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "accountName", java.util.Objects.requireNonNull(value, "accountName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAccountPassword() {
        return software.amazon.jsii.Kernel.get(this, "accountPassword", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAccountPassword(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "accountPassword", java.util.Objects.requireNonNull(value, "accountPassword is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appstream.AppstreamDirectoryConfigServiceAccountCredentials getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appstream.AppstreamDirectoryConfigServiceAccountCredentials.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appstream.AppstreamDirectoryConfigServiceAccountCredentials value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
