package imports.aws.serverlessapplicationrepository;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/serverlessapplicationrepository_application aws_serverlessapplicationrepository_application}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.626Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.serverlessapplicationrepository.DataAwsServerlessapplicationrepositoryApplication")
public class DataAwsServerlessapplicationrepositoryApplication extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsServerlessapplicationrepositoryApplication(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsServerlessapplicationrepositoryApplication(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.serverlessapplicationrepository.DataAwsServerlessapplicationrepositoryApplication.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/serverlessapplicationrepository_application aws_serverlessapplicationrepository_application} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public DataAwsServerlessapplicationrepositoryApplication(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.serverlessapplicationrepository.DataAwsServerlessapplicationrepositoryApplicationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSemanticVersion() {
        software.amazon.jsii.Kernel.call(this, "resetSemanticVersion", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getRequiredCapabilities() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "requiredCapabilities", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSourceCodeUrl() {
        return software.amazon.jsii.Kernel.get(this, "sourceCodeUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTemplateUrl() {
        return software.amazon.jsii.Kernel.get(this, "templateUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getApplicationIdInput() {
        return software.amazon.jsii.Kernel.get(this, "applicationIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSemanticVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "semanticVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApplicationId() {
        return software.amazon.jsii.Kernel.get(this, "applicationId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApplicationId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "applicationId", java.util.Objects.requireNonNull(value, "applicationId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSemanticVersion() {
        return software.amazon.jsii.Kernel.get(this, "semanticVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSemanticVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "semanticVersion", java.util.Objects.requireNonNull(value, "semanticVersion is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.serverlessapplicationrepository.DataAwsServerlessapplicationrepositoryApplication}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.serverlessapplicationrepository.DataAwsServerlessapplicationrepositoryApplication> {
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
        private final imports.aws.serverlessapplicationrepository.DataAwsServerlessapplicationrepositoryApplicationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.serverlessapplicationrepository.DataAwsServerlessapplicationrepositoryApplicationConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/serverlessapplicationrepository_application#application_id DataAwsServerlessapplicationrepositoryApplication#application_id}.
         * <p>
         * @return {@code this}
         * @param applicationId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/serverlessapplicationrepository_application#application_id DataAwsServerlessapplicationrepositoryApplication#application_id}. This parameter is required.
         */
        public Builder applicationId(final java.lang.String applicationId) {
            this.config.applicationId(applicationId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/serverlessapplicationrepository_application#id DataAwsServerlessapplicationrepositoryApplication#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/serverlessapplicationrepository_application#id DataAwsServerlessapplicationrepositoryApplication#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/serverlessapplicationrepository_application#semantic_version DataAwsServerlessapplicationrepositoryApplication#semantic_version}.
         * <p>
         * @return {@code this}
         * @param semanticVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/serverlessapplicationrepository_application#semantic_version DataAwsServerlessapplicationrepositoryApplication#semantic_version}. This parameter is required.
         */
        public Builder semanticVersion(final java.lang.String semanticVersion) {
            this.config.semanticVersion(semanticVersion);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.serverlessapplicationrepository.DataAwsServerlessapplicationrepositoryApplication}.
         */
        @Override
        public imports.aws.serverlessapplicationrepository.DataAwsServerlessapplicationrepositoryApplication build() {
            return new imports.aws.serverlessapplicationrepository.DataAwsServerlessapplicationrepositoryApplication(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
