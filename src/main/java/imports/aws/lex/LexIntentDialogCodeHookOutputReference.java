package imports.aws.lex;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.748Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lex.LexIntentDialogCodeHookOutputReference")
public class LexIntentDialogCodeHookOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LexIntentDialogCodeHookOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LexIntentDialogCodeHookOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LexIntentDialogCodeHookOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMessageVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "messageVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUriInput() {
        return software.amazon.jsii.Kernel.get(this, "uriInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMessageVersion() {
        return software.amazon.jsii.Kernel.get(this, "messageVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMessageVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "messageVersion", java.util.Objects.requireNonNull(value, "messageVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUri() {
        return software.amazon.jsii.Kernel.get(this, "uri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUri(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "uri", java.util.Objects.requireNonNull(value, "uri is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lex.LexIntentDialogCodeHook getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexIntentDialogCodeHook.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.lex.LexIntentDialogCodeHook value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
