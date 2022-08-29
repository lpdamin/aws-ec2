package imports.aws.cloudfront;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_response_headers_policy aws_cloudfront_response_headers_policy}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.994Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudfront.CloudfrontResponseHeadersPolicy")
public class CloudfrontResponseHeadersPolicy extends com.hashicorp.cdktf.TerraformResource {

    protected CloudfrontResponseHeadersPolicy(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudfrontResponseHeadersPolicy(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.cloudfront.CloudfrontResponseHeadersPolicy.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_response_headers_policy aws_cloudfront_response_headers_policy} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public CloudfrontResponseHeadersPolicy(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicyConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putCorsConfig(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfig value) {
        software.amazon.jsii.Kernel.call(this, "putCorsConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCustomHeadersConfig(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCustomHeadersConfig value) {
        software.amazon.jsii.Kernel.call(this, "putCustomHeadersConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSecurityHeadersConfig(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfig value) {
        software.amazon.jsii.Kernel.call(this, "putSecurityHeadersConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putServerTimingHeadersConfig(final @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicyServerTimingHeadersConfig value) {
        software.amazon.jsii.Kernel.call(this, "putServerTimingHeadersConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetComment() {
        software.amazon.jsii.Kernel.call(this, "resetComment", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCorsConfig() {
        software.amazon.jsii.Kernel.call(this, "resetCorsConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomHeadersConfig() {
        software.amazon.jsii.Kernel.call(this, "resetCustomHeadersConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEtag() {
        software.amazon.jsii.Kernel.call(this, "resetEtag", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecurityHeadersConfig() {
        software.amazon.jsii.Kernel.call(this, "resetSecurityHeadersConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServerTimingHeadersConfig() {
        software.amazon.jsii.Kernel.call(this, "resetServerTimingHeadersConfig", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigOutputReference getCorsConfig() {
        return software.amazon.jsii.Kernel.get(this, "corsConfig", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCustomHeadersConfigOutputReference getCustomHeadersConfig() {
        return software.amazon.jsii.Kernel.get(this, "customHeadersConfig", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCustomHeadersConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigOutputReference getSecurityHeadersConfig() {
        return software.amazon.jsii.Kernel.get(this, "securityHeadersConfig", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudfront.CloudfrontResponseHeadersPolicyServerTimingHeadersConfigOutputReference getServerTimingHeadersConfig() {
        return software.amazon.jsii.Kernel.get(this, "serverTimingHeadersConfig", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicyServerTimingHeadersConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCommentInput() {
        return software.amazon.jsii.Kernel.get(this, "commentInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfig getCorsConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "corsConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfig.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCustomHeadersConfig getCustomHeadersConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "customHeadersConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCustomHeadersConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEtagInput() {
        return software.amazon.jsii.Kernel.get(this, "etagInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfig getSecurityHeadersConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "securityHeadersConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfig.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudfront.CloudfrontResponseHeadersPolicyServerTimingHeadersConfig getServerTimingHeadersConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "serverTimingHeadersConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudfront.CloudfrontResponseHeadersPolicyServerTimingHeadersConfig.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getComment() {
        return software.amazon.jsii.Kernel.get(this, "comment", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setComment(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "comment", java.util.Objects.requireNonNull(value, "comment is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEtag() {
        return software.amazon.jsii.Kernel.get(this, "etag", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEtag(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "etag", java.util.Objects.requireNonNull(value, "etag is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.cloudfront.CloudfrontResponseHeadersPolicy}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.cloudfront.CloudfrontResponseHeadersPolicy> {
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
        private final imports.aws.cloudfront.CloudfrontResponseHeadersPolicyConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.cloudfront.CloudfrontResponseHeadersPolicyConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_response_headers_policy#name CloudfrontResponseHeadersPolicy#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_response_headers_policy#name CloudfrontResponseHeadersPolicy#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_response_headers_policy#comment CloudfrontResponseHeadersPolicy#comment}.
         * <p>
         * @return {@code this}
         * @param comment Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_response_headers_policy#comment CloudfrontResponseHeadersPolicy#comment}. This parameter is required.
         */
        public Builder comment(final java.lang.String comment) {
            this.config.comment(comment);
            return this;
        }

        /**
         * cors_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_response_headers_policy#cors_config CloudfrontResponseHeadersPolicy#cors_config}
         * <p>
         * @return {@code this}
         * @param corsConfig cors_config block. This parameter is required.
         */
        public Builder corsConfig(final imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCorsConfig corsConfig) {
            this.config.corsConfig(corsConfig);
            return this;
        }

        /**
         * custom_headers_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_response_headers_policy#custom_headers_config CloudfrontResponseHeadersPolicy#custom_headers_config}
         * <p>
         * @return {@code this}
         * @param customHeadersConfig custom_headers_config block. This parameter is required.
         */
        public Builder customHeadersConfig(final imports.aws.cloudfront.CloudfrontResponseHeadersPolicyCustomHeadersConfig customHeadersConfig) {
            this.config.customHeadersConfig(customHeadersConfig);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_response_headers_policy#etag CloudfrontResponseHeadersPolicy#etag}.
         * <p>
         * @return {@code this}
         * @param etag Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_response_headers_policy#etag CloudfrontResponseHeadersPolicy#etag}. This parameter is required.
         */
        public Builder etag(final java.lang.String etag) {
            this.config.etag(etag);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_response_headers_policy#id CloudfrontResponseHeadersPolicy#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudfront_response_headers_policy#id CloudfrontResponseHeadersPolicy#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * security_headers_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_response_headers_policy#security_headers_config CloudfrontResponseHeadersPolicy#security_headers_config}
         * <p>
         * @return {@code this}
         * @param securityHeadersConfig security_headers_config block. This parameter is required.
         */
        public Builder securityHeadersConfig(final imports.aws.cloudfront.CloudfrontResponseHeadersPolicySecurityHeadersConfig securityHeadersConfig) {
            this.config.securityHeadersConfig(securityHeadersConfig);
            return this;
        }

        /**
         * server_timing_headers_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudfront_response_headers_policy#server_timing_headers_config CloudfrontResponseHeadersPolicy#server_timing_headers_config}
         * <p>
         * @return {@code this}
         * @param serverTimingHeadersConfig server_timing_headers_config block. This parameter is required.
         */
        public Builder serverTimingHeadersConfig(final imports.aws.cloudfront.CloudfrontResponseHeadersPolicyServerTimingHeadersConfig serverTimingHeadersConfig) {
            this.config.serverTimingHeadersConfig(serverTimingHeadersConfig);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.cloudfront.CloudfrontResponseHeadersPolicy}.
         */
        @Override
        public imports.aws.cloudfront.CloudfrontResponseHeadersPolicy build() {
            return new imports.aws.cloudfront.CloudfrontResponseHeadersPolicy(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
