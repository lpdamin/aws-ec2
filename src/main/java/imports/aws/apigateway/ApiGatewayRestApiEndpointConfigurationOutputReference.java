package imports.aws.apigateway;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.493Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.apigateway.ApiGatewayRestApiEndpointConfigurationOutputReference")
public class ApiGatewayRestApiEndpointConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ApiGatewayRestApiEndpointConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ApiGatewayRestApiEndpointConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ApiGatewayRestApiEndpointConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetVpcEndpointIds() {
        software.amazon.jsii.Kernel.call(this, "resetVpcEndpointIds", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTypesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "typesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcEndpointIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "vpcEndpointIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "types", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTypes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "types", java.util.Objects.requireNonNull(value, "types is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getVpcEndpointIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "vpcEndpointIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setVpcEndpointIds(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "vpcEndpointIds", java.util.Objects.requireNonNull(value, "vpcEndpointIds is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apigateway.ApiGatewayRestApiEndpointConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.apigateway.ApiGatewayRestApiEndpointConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.apigateway.ApiGatewayRestApiEndpointConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
