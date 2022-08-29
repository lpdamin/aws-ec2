package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.254Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueClassifierJsonClassifierOutputReference")
public class GlueClassifierJsonClassifierOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GlueClassifierJsonClassifierOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueClassifierJsonClassifierOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GlueClassifierJsonClassifierOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getJsonPathInput() {
        return software.amazon.jsii.Kernel.get(this, "jsonPathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getJsonPath() {
        return software.amazon.jsii.Kernel.get(this, "jsonPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setJsonPath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "jsonPath", java.util.Objects.requireNonNull(value, "jsonPath is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueClassifierJsonClassifier getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueClassifierJsonClassifier.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.glue.GlueClassifierJsonClassifier value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
