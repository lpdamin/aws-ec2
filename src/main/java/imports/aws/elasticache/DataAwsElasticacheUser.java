package imports.aws.elasticache;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user aws_elasticache_user}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.516Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.elasticache.DataAwsElasticacheUser")
public class DataAwsElasticacheUser extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsElasticacheUser(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsElasticacheUser(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.elasticache.DataAwsElasticacheUser.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user aws_elasticache_user} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public DataAwsElasticacheUser(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.elasticache.DataAwsElasticacheUserConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAccessString() {
        software.amazon.jsii.Kernel.call(this, "resetAccessString", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEngine() {
        software.amazon.jsii.Kernel.call(this, "resetEngine", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNoPasswordRequired() {
        software.amazon.jsii.Kernel.call(this, "resetNoPasswordRequired", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPasswords() {
        software.amazon.jsii.Kernel.call(this, "resetPasswords", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUserName() {
        software.amazon.jsii.Kernel.call(this, "resetUserName", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.Nullable java.lang.String getAccessStringInput() {
        return software.amazon.jsii.Kernel.get(this, "accessStringInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEngineInput() {
        return software.amazon.jsii.Kernel.get(this, "engineInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getNoPasswordRequiredInput() {
        return software.amazon.jsii.Kernel.get(this, "noPasswordRequiredInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPasswordsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "passwordsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUserIdInput() {
        return software.amazon.jsii.Kernel.get(this, "userIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUserNameInput() {
        return software.amazon.jsii.Kernel.get(this, "userNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAccessString() {
        return software.amazon.jsii.Kernel.get(this, "accessString", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAccessString(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "accessString", java.util.Objects.requireNonNull(value, "accessString is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEngine() {
        return software.amazon.jsii.Kernel.get(this, "engine", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEngine(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "engine", java.util.Objects.requireNonNull(value, "engine is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getNoPasswordRequired() {
        return software.amazon.jsii.Kernel.get(this, "noPasswordRequired", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setNoPasswordRequired(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "noPasswordRequired", java.util.Objects.requireNonNull(value, "noPasswordRequired is required"));
    }

    public void setNoPasswordRequired(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "noPasswordRequired", java.util.Objects.requireNonNull(value, "noPasswordRequired is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getPasswords() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "passwords", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setPasswords(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "passwords", java.util.Objects.requireNonNull(value, "passwords is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUserId() {
        return software.amazon.jsii.Kernel.get(this, "userId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUserId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "userId", java.util.Objects.requireNonNull(value, "userId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUserName() {
        return software.amazon.jsii.Kernel.get(this, "userName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUserName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "userName", java.util.Objects.requireNonNull(value, "userName is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.elasticache.DataAwsElasticacheUser}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.elasticache.DataAwsElasticacheUser> {
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
        private final imports.aws.elasticache.DataAwsElasticacheUserConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.elasticache.DataAwsElasticacheUserConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#user_id DataAwsElasticacheUser#user_id}.
         * <p>
         * @return {@code this}
         * @param userId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#user_id DataAwsElasticacheUser#user_id}. This parameter is required.
         */
        public Builder userId(final java.lang.String userId) {
            this.config.userId(userId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#access_string DataAwsElasticacheUser#access_string}.
         * <p>
         * @return {@code this}
         * @param accessString Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#access_string DataAwsElasticacheUser#access_string}. This parameter is required.
         */
        public Builder accessString(final java.lang.String accessString) {
            this.config.accessString(accessString);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#engine DataAwsElasticacheUser#engine}.
         * <p>
         * @return {@code this}
         * @param engine Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#engine DataAwsElasticacheUser#engine}. This parameter is required.
         */
        public Builder engine(final java.lang.String engine) {
            this.config.engine(engine);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#id DataAwsElasticacheUser#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#id DataAwsElasticacheUser#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#no_password_required DataAwsElasticacheUser#no_password_required}.
         * <p>
         * @return {@code this}
         * @param noPasswordRequired Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#no_password_required DataAwsElasticacheUser#no_password_required}. This parameter is required.
         */
        public Builder noPasswordRequired(final java.lang.Boolean noPasswordRequired) {
            this.config.noPasswordRequired(noPasswordRequired);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#no_password_required DataAwsElasticacheUser#no_password_required}.
         * <p>
         * @return {@code this}
         * @param noPasswordRequired Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#no_password_required DataAwsElasticacheUser#no_password_required}. This parameter is required.
         */
        public Builder noPasswordRequired(final com.hashicorp.cdktf.IResolvable noPasswordRequired) {
            this.config.noPasswordRequired(noPasswordRequired);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#passwords DataAwsElasticacheUser#passwords}.
         * <p>
         * @return {@code this}
         * @param passwords Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#passwords DataAwsElasticacheUser#passwords}. This parameter is required.
         */
        public Builder passwords(final java.util.List<java.lang.String> passwords) {
            this.config.passwords(passwords);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#user_name DataAwsElasticacheUser#user_name}.
         * <p>
         * @return {@code this}
         * @param userName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#user_name DataAwsElasticacheUser#user_name}. This parameter is required.
         */
        public Builder userName(final java.lang.String userName) {
            this.config.userName(userName);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.elasticache.DataAwsElasticacheUser}.
         */
        @Override
        public imports.aws.elasticache.DataAwsElasticacheUser build() {
            return new imports.aws.elasticache.DataAwsElasticacheUser(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
