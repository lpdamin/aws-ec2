package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.543Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerWorkteamMemberDefinitionOutputReference")
public class SagemakerWorkteamMemberDefinitionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SagemakerWorkteamMemberDefinitionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerWorkteamMemberDefinitionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public SagemakerWorkteamMemberDefinitionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putCognitoMemberDefinition(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionCognitoMemberDefinition value) {
        software.amazon.jsii.Kernel.call(this, "putCognitoMemberDefinition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOidcMemberDefinition(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionOidcMemberDefinition value) {
        software.amazon.jsii.Kernel.call(this, "putOidcMemberDefinition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCognitoMemberDefinition() {
        software.amazon.jsii.Kernel.call(this, "resetCognitoMemberDefinition", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOidcMemberDefinition() {
        software.amazon.jsii.Kernel.call(this, "resetOidcMemberDefinition", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionCognitoMemberDefinitionOutputReference getCognitoMemberDefinition() {
        return software.amazon.jsii.Kernel.get(this, "cognitoMemberDefinition", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionCognitoMemberDefinitionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionOidcMemberDefinitionOutputReference getOidcMemberDefinition() {
        return software.amazon.jsii.Kernel.get(this, "oidcMemberDefinition", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionOidcMemberDefinitionOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionCognitoMemberDefinition getCognitoMemberDefinitionInput() {
        return software.amazon.jsii.Kernel.get(this, "cognitoMemberDefinitionInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionCognitoMemberDefinition.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionOidcMemberDefinition getOidcMemberDefinitionInput() {
        return software.amazon.jsii.Kernel.get(this, "oidcMemberDefinitionInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionOidcMemberDefinition.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerWorkteamMemberDefinition value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
