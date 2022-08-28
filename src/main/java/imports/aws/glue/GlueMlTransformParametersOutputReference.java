package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.338Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueMlTransformParametersOutputReference")
public class GlueMlTransformParametersOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GlueMlTransformParametersOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueMlTransformParametersOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GlueMlTransformParametersOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putFindMatchesParameters(final @org.jetbrains.annotations.NotNull imports.aws.glue.GlueMlTransformParametersFindMatchesParameters value) {
        software.amazon.jsii.Kernel.call(this, "putFindMatchesParameters", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.glue.GlueMlTransformParametersFindMatchesParametersOutputReference getFindMatchesParameters() {
        return software.amazon.jsii.Kernel.get(this, "findMatchesParameters", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueMlTransformParametersFindMatchesParametersOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueMlTransformParametersFindMatchesParameters getFindMatchesParametersInput() {
        return software.amazon.jsii.Kernel.get(this, "findMatchesParametersInput", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueMlTransformParametersFindMatchesParameters.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTransformTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "transformTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTransformType() {
        return software.amazon.jsii.Kernel.get(this, "transformType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTransformType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "transformType", java.util.Objects.requireNonNull(value, "transformType is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueMlTransformParameters getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueMlTransformParameters.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.glue.GlueMlTransformParameters value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
