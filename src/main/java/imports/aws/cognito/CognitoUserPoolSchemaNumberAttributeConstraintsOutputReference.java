package imports.aws.cognito;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.189Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cognito.CognitoUserPoolSchemaNumberAttributeConstraintsOutputReference")
public class CognitoUserPoolSchemaNumberAttributeConstraintsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CognitoUserPoolSchemaNumberAttributeConstraintsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CognitoUserPoolSchemaNumberAttributeConstraintsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CognitoUserPoolSchemaNumberAttributeConstraintsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetMaxValue() {
        software.amazon.jsii.Kernel.call(this, "resetMaxValue", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMinValue() {
        software.amazon.jsii.Kernel.call(this, "resetMinValue", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMaxValueInput() {
        return software.amazon.jsii.Kernel.get(this, "maxValueInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMinValueInput() {
        return software.amazon.jsii.Kernel.get(this, "minValueInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMaxValue() {
        return software.amazon.jsii.Kernel.get(this, "maxValue", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMaxValue(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "maxValue", java.util.Objects.requireNonNull(value, "maxValue is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMinValue() {
        return software.amazon.jsii.Kernel.get(this, "minValue", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMinValue(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "minValue", java.util.Objects.requireNonNull(value, "minValue is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolSchemaNumberAttributeConstraints getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolSchemaNumberAttributeConstraints.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolSchemaNumberAttributeConstraints value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
