package imports.aws.lex;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.847Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lex.LexIntentFulfillmentActivityOutputReference")
public class LexIntentFulfillmentActivityOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LexIntentFulfillmentActivityOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LexIntentFulfillmentActivityOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LexIntentFulfillmentActivityOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCodeHook(final @org.jetbrains.annotations.NotNull imports.aws.lex.LexIntentFulfillmentActivityCodeHook value) {
        software.amazon.jsii.Kernel.call(this, "putCodeHook", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCodeHook() {
        software.amazon.jsii.Kernel.call(this, "resetCodeHook", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lex.LexIntentFulfillmentActivityCodeHookOutputReference getCodeHook() {
        return software.amazon.jsii.Kernel.get(this, "codeHook", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexIntentFulfillmentActivityCodeHookOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lex.LexIntentFulfillmentActivityCodeHook getCodeHookInput() {
        return software.amazon.jsii.Kernel.get(this, "codeHookInput", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexIntentFulfillmentActivityCodeHook.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lex.LexIntentFulfillmentActivity getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexIntentFulfillmentActivity.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.lex.LexIntentFulfillmentActivity value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
