package imports.aws.cognito;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.750Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cognito.CognitoUserPoolLambdaConfigCustomSmsSenderOutputReference")
public class CognitoUserPoolLambdaConfigCustomSmsSenderOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CognitoUserPoolLambdaConfigCustomSmsSenderOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CognitoUserPoolLambdaConfigCustomSmsSenderOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CognitoUserPoolLambdaConfigCustomSmsSenderOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLambdaArnInput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLambdaVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaArn() {
        return software.amazon.jsii.Kernel.get(this, "lambdaArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLambdaArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "lambdaArn", java.util.Objects.requireNonNull(value, "lambdaArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaVersion() {
        return software.amazon.jsii.Kernel.get(this, "lambdaVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLambdaVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "lambdaVersion", java.util.Objects.requireNonNull(value, "lambdaVersion is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolLambdaConfigCustomSmsSender getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolLambdaConfigCustomSmsSender.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolLambdaConfigCustomSmsSender value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
