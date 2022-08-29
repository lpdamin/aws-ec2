package imports.aws.cloudformation;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/cloudformation_type aws_cloudformation_type}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.924Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudformation.CloudformationType")
public class CloudformationType extends com.hashicorp.cdktf.TerraformResource {

    protected CloudformationType(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudformationType(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.cloudformation.CloudformationType.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/cloudformation_type aws_cloudformation_type} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public CloudformationType(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.cloudformation.CloudformationTypeConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putLoggingConfig(final @org.jetbrains.annotations.NotNull imports.aws.cloudformation.CloudformationTypeLoggingConfig value) {
        software.amazon.jsii.Kernel.call(this, "putLoggingConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetExecutionRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetExecutionRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLoggingConfig() {
        software.amazon.jsii.Kernel.call(this, "resetLoggingConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetType() {
        software.amazon.jsii.Kernel.call(this, "resetType", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultVersionId() {
        return software.amazon.jsii.Kernel.get(this, "defaultVersionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeprecatedStatus() {
        return software.amazon.jsii.Kernel.get(this, "deprecatedStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDocumentationUrl() {
        return software.amazon.jsii.Kernel.get(this, "documentationUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getIsDefaultVersion() {
        return software.amazon.jsii.Kernel.get(this, "isDefaultVersion", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cloudformation.CloudformationTypeLoggingConfigOutputReference getLoggingConfig() {
        return software.amazon.jsii.Kernel.get(this, "loggingConfig", software.amazon.jsii.NativeType.forClass(imports.aws.cloudformation.CloudformationTypeLoggingConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getProvisioningType() {
        return software.amazon.jsii.Kernel.get(this, "provisioningType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSchema() {
        return software.amazon.jsii.Kernel.get(this, "schema", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceUrl() {
        return software.amazon.jsii.Kernel.get(this, "sourceUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTypeArn() {
        return software.amazon.jsii.Kernel.get(this, "typeArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVersionId() {
        return software.amazon.jsii.Kernel.get(this, "versionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVisibility() {
        return software.amazon.jsii.Kernel.get(this, "visibility", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getExecutionRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "executionRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudformation.CloudformationTypeLoggingConfig getLoggingConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "loggingConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.cloudformation.CloudformationTypeLoggingConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSchemaHandlerPackageInput() {
        return software.amazon.jsii.Kernel.get(this, "schemaHandlerPackageInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeNameInput() {
        return software.amazon.jsii.Kernel.get(this, "typeNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExecutionRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "executionRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setExecutionRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "executionRoleArn", java.util.Objects.requireNonNull(value, "executionRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSchemaHandlerPackage() {
        return software.amazon.jsii.Kernel.get(this, "schemaHandlerPackage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSchemaHandlerPackage(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "schemaHandlerPackage", java.util.Objects.requireNonNull(value, "schemaHandlerPackage is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTypeName() {
        return software.amazon.jsii.Kernel.get(this, "typeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTypeName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "typeName", java.util.Objects.requireNonNull(value, "typeName is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.cloudformation.CloudformationType}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.cloudformation.CloudformationType> {
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
        private final imports.aws.cloudformation.CloudformationTypeConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.cloudformation.CloudformationTypeConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudformation_type#schema_handler_package CloudformationType#schema_handler_package}.
         * <p>
         * @return {@code this}
         * @param schemaHandlerPackage Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudformation_type#schema_handler_package CloudformationType#schema_handler_package}. This parameter is required.
         */
        public Builder schemaHandlerPackage(final java.lang.String schemaHandlerPackage) {
            this.config.schemaHandlerPackage(schemaHandlerPackage);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudformation_type#type_name CloudformationType#type_name}.
         * <p>
         * @return {@code this}
         * @param typeName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudformation_type#type_name CloudformationType#type_name}. This parameter is required.
         */
        public Builder typeName(final java.lang.String typeName) {
            this.config.typeName(typeName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudformation_type#execution_role_arn CloudformationType#execution_role_arn}.
         * <p>
         * @return {@code this}
         * @param executionRoleArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudformation_type#execution_role_arn CloudformationType#execution_role_arn}. This parameter is required.
         */
        public Builder executionRoleArn(final java.lang.String executionRoleArn) {
            this.config.executionRoleArn(executionRoleArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudformation_type#id CloudformationType#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudformation_type#id CloudformationType#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * logging_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudformation_type#logging_config CloudformationType#logging_config}
         * <p>
         * @return {@code this}
         * @param loggingConfig logging_config block. This parameter is required.
         */
        public Builder loggingConfig(final imports.aws.cloudformation.CloudformationTypeLoggingConfig loggingConfig) {
            this.config.loggingConfig(loggingConfig);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudformation_type#type CloudformationType#type}.
         * <p>
         * @return {@code this}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudformation_type#type CloudformationType#type}. This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.config.type(type);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.cloudformation.CloudformationType}.
         */
        @Override
        public imports.aws.cloudformation.CloudformationType build() {
            return new imports.aws.cloudformation.CloudformationType(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
