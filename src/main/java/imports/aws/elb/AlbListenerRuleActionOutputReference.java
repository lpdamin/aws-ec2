package imports.aws.elb;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.728Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.elb.AlbListenerRuleActionOutputReference")
public class AlbListenerRuleActionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AlbListenerRuleActionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AlbListenerRuleActionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public AlbListenerRuleActionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putAuthenticateCognito(final @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleActionAuthenticateCognito value) {
        software.amazon.jsii.Kernel.call(this, "putAuthenticateCognito", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAuthenticateOidc(final @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleActionAuthenticateOidc value) {
        software.amazon.jsii.Kernel.call(this, "putAuthenticateOidc", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFixedResponse(final @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleActionFixedResponse value) {
        software.amazon.jsii.Kernel.call(this, "putFixedResponse", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putForward(final @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleActionForward value) {
        software.amazon.jsii.Kernel.call(this, "putForward", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRedirect(final @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleActionRedirect value) {
        software.amazon.jsii.Kernel.call(this, "putRedirect", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAuthenticateCognito() {
        software.amazon.jsii.Kernel.call(this, "resetAuthenticateCognito", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAuthenticateOidc() {
        software.amazon.jsii.Kernel.call(this, "resetAuthenticateOidc", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFixedResponse() {
        software.amazon.jsii.Kernel.call(this, "resetFixedResponse", software.amazon.jsii.NativeType.VOID);
    }

    public void resetForward() {
        software.amazon.jsii.Kernel.call(this, "resetForward", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOrder() {
        software.amazon.jsii.Kernel.call(this, "resetOrder", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRedirect() {
        software.amazon.jsii.Kernel.call(this, "resetRedirect", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargetGroupArn() {
        software.amazon.jsii.Kernel.call(this, "resetTargetGroupArn", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleActionAuthenticateCognitoOutputReference getAuthenticateCognito() {
        return software.amazon.jsii.Kernel.get(this, "authenticateCognito", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleActionAuthenticateCognitoOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleActionAuthenticateOidcOutputReference getAuthenticateOidc() {
        return software.amazon.jsii.Kernel.get(this, "authenticateOidc", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleActionAuthenticateOidcOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleActionFixedResponseOutputReference getFixedResponse() {
        return software.amazon.jsii.Kernel.get(this, "fixedResponse", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleActionFixedResponseOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleActionForwardOutputReference getForward() {
        return software.amazon.jsii.Kernel.get(this, "forward", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleActionForwardOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elb.AlbListenerRuleActionRedirectOutputReference getRedirect() {
        return software.amazon.jsii.Kernel.get(this, "redirect", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleActionRedirectOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerRuleActionAuthenticateCognito getAuthenticateCognitoInput() {
        return software.amazon.jsii.Kernel.get(this, "authenticateCognitoInput", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleActionAuthenticateCognito.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerRuleActionAuthenticateOidc getAuthenticateOidcInput() {
        return software.amazon.jsii.Kernel.get(this, "authenticateOidcInput", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleActionAuthenticateOidc.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerRuleActionFixedResponse getFixedResponseInput() {
        return software.amazon.jsii.Kernel.get(this, "fixedResponseInput", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleActionFixedResponse.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerRuleActionForward getForwardInput() {
        return software.amazon.jsii.Kernel.get(this, "forwardInput", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleActionForward.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getOrderInput() {
        return software.amazon.jsii.Kernel.get(this, "orderInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerRuleActionRedirect getRedirectInput() {
        return software.amazon.jsii.Kernel.get(this, "redirectInput", software.amazon.jsii.NativeType.forClass(imports.aws.elb.AlbListenerRuleActionRedirect.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTargetGroupArnInput() {
        return software.amazon.jsii.Kernel.get(this, "targetGroupArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getOrder() {
        return software.amazon.jsii.Kernel.get(this, "order", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setOrder(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "order", java.util.Objects.requireNonNull(value, "order is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetGroupArn() {
        return software.amazon.jsii.Kernel.get(this, "targetGroupArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTargetGroupArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "targetGroupArn", java.util.Objects.requireNonNull(value, "targetGroupArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.elb.AlbListenerRuleAction value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
