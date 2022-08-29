package imports.aws.apigateway;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_documentation_part aws_api_gateway_documentation_part}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.453Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.apigateway.ApiGatewayDocumentationPart")
public class ApiGatewayDocumentationPart extends com.hashicorp.cdktf.TerraformResource {

    protected ApiGatewayDocumentationPart(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ApiGatewayDocumentationPart(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.apigateway.ApiGatewayDocumentationPart.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_documentation_part aws_api_gateway_documentation_part} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public ApiGatewayDocumentationPart(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.apigateway.ApiGatewayDocumentationPartConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putLocation(final @org.jetbrains.annotations.NotNull imports.aws.apigateway.ApiGatewayDocumentationPartLocation value) {
        software.amazon.jsii.Kernel.call(this, "putLocation", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.apigateway.ApiGatewayDocumentationPartLocationOutputReference getLocation() {
        return software.amazon.jsii.Kernel.get(this, "location", software.amazon.jsii.NativeType.forClass(imports.aws.apigateway.ApiGatewayDocumentationPartLocationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.apigateway.ApiGatewayDocumentationPartLocation getLocationInput() {
        return software.amazon.jsii.Kernel.get(this, "locationInput", software.amazon.jsii.NativeType.forClass(imports.aws.apigateway.ApiGatewayDocumentationPartLocation.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPropertiesInput() {
        return software.amazon.jsii.Kernel.get(this, "propertiesInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRestApiIdInput() {
        return software.amazon.jsii.Kernel.get(this, "restApiIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getProperties() {
        return software.amazon.jsii.Kernel.get(this, "properties", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setProperties(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "properties", java.util.Objects.requireNonNull(value, "properties is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRestApiId() {
        return software.amazon.jsii.Kernel.get(this, "restApiId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRestApiId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "restApiId", java.util.Objects.requireNonNull(value, "restApiId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.apigateway.ApiGatewayDocumentationPart}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.apigateway.ApiGatewayDocumentationPart> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope The scope in which to define this construct. This parameter is required.
         * @param id The scoped construct ID. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.apigateway.ApiGatewayDocumentationPartConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.apigateway.ApiGatewayDocumentationPartConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config.forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config.provisioners(provisioners);
            return this;
        }

        /**
         * location block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/api_gateway_documentation_part#location ApiGatewayDocumentationPart#location}
         * <p>
         * @return {@code this}
         * @param location location block. This parameter is required.
         */
        public Builder location(final imports.aws.apigateway.ApiGatewayDocumentationPartLocation location) {
            this.config.location(location);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_documentation_part#properties ApiGatewayDocumentationPart#properties}.
         * <p>
         * @return {@code this}
         * @param properties Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_documentation_part#properties ApiGatewayDocumentationPart#properties}. This parameter is required.
         */
        public Builder properties(final java.lang.String properties) {
            this.config.properties(properties);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_documentation_part#rest_api_id ApiGatewayDocumentationPart#rest_api_id}.
         * <p>
         * @return {@code this}
         * @param restApiId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_documentation_part#rest_api_id ApiGatewayDocumentationPart#rest_api_id}. This parameter is required.
         */
        public Builder restApiId(final java.lang.String restApiId) {
            this.config.restApiId(restApiId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_documentation_part#id ApiGatewayDocumentationPart#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/api_gateway_documentation_part#id ApiGatewayDocumentationPart#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.apigateway.ApiGatewayDocumentationPart}.
         */
        @Override
        public imports.aws.apigateway.ApiGatewayDocumentationPart build() {
            return new imports.aws.apigateway.ApiGatewayDocumentationPart(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
