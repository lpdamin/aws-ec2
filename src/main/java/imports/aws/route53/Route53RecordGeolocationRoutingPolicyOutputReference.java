package imports.aws.route53;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.349Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.route53.Route53RecordGeolocationRoutingPolicyOutputReference")
public class Route53RecordGeolocationRoutingPolicyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Route53RecordGeolocationRoutingPolicyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Route53RecordGeolocationRoutingPolicyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public Route53RecordGeolocationRoutingPolicyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void resetContinent() {
        software.amazon.jsii.Kernel.call(this, "resetContinent", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCountry() {
        software.amazon.jsii.Kernel.call(this, "resetCountry", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSubdivision() {
        software.amazon.jsii.Kernel.call(this, "resetSubdivision", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getContinentInput() {
        return software.amazon.jsii.Kernel.get(this, "continentInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCountryInput() {
        return software.amazon.jsii.Kernel.get(this, "countryInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSubdivisionInput() {
        return software.amazon.jsii.Kernel.get(this, "subdivisionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContinent() {
        return software.amazon.jsii.Kernel.get(this, "continent", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setContinent(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "continent", java.util.Objects.requireNonNull(value, "continent is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCountry() {
        return software.amazon.jsii.Kernel.get(this, "country", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCountry(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "country", java.util.Objects.requireNonNull(value, "country is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSubdivision() {
        return software.amazon.jsii.Kernel.get(this, "subdivision", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSubdivision(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "subdivision", java.util.Objects.requireNonNull(value, "subdivision is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.route53.Route53RecordGeolocationRoutingPolicy value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
