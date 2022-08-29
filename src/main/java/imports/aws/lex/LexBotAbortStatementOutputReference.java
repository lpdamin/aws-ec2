package imports.aws.lex;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.832Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lex.LexBotAbortStatementOutputReference")
public class LexBotAbortStatementOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected LexBotAbortStatementOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LexBotAbortStatementOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public LexBotAbortStatementOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putMessage(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putMessage", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetResponseCard() {
        software.amazon.jsii.Kernel.call(this, "resetResponseCard", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lex.LexBotAbortStatementMessageList getMessage() {
        return software.amazon.jsii.Kernel.get(this, "message", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexBotAbortStatementMessageList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getMessageInput() {
        return software.amazon.jsii.Kernel.get(this, "messageInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getResponseCardInput() {
        return software.amazon.jsii.Kernel.get(this, "responseCardInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResponseCard() {
        return software.amazon.jsii.Kernel.get(this, "responseCard", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResponseCard(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "responseCard", java.util.Objects.requireNonNull(value, "responseCard is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lex.LexBotAbortStatement getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexBotAbortStatement.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.lex.LexBotAbortStatement value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
