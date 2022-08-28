package imports.aws.quicksight;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.170Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.quicksight.QuicksightDataSourceCredentialsOutputReference")
public class QuicksightDataSourceCredentialsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected QuicksightDataSourceCredentialsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected QuicksightDataSourceCredentialsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public QuicksightDataSourceCredentialsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCredentialPair(final @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceCredentialsCredentialPair value) {
        software.amazon.jsii.Kernel.call(this, "putCredentialPair", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCopySourceArn() {
        software.amazon.jsii.Kernel.call(this, "resetCopySourceArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCredentialPair() {
        software.amazon.jsii.Kernel.call(this, "resetCredentialPair", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.quicksight.QuicksightDataSourceCredentialsCredentialPairOutputReference getCredentialPair() {
        return software.amazon.jsii.Kernel.get(this, "credentialPair", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceCredentialsCredentialPairOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCopySourceArnInput() {
        return software.amazon.jsii.Kernel.get(this, "copySourceArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceCredentialsCredentialPair getCredentialPairInput() {
        return software.amazon.jsii.Kernel.get(this, "credentialPairInput", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceCredentialsCredentialPair.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCopySourceArn() {
        return software.amazon.jsii.Kernel.get(this, "copySourceArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCopySourceArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "copySourceArn", java.util.Objects.requireNonNull(value, "copySourceArn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceCredentials getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceCredentials.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceCredentials value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
