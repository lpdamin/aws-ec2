package imports.aws.lightsail;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/lightsail_key_pair aws_lightsail_key_pair}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.885Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lightsail.LightsailKeyPair")
public class LightsailKeyPair extends com.hashicorp.cdktf.TerraformResource {

    protected LightsailKeyPair(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LightsailKeyPair(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.lightsail.LightsailKeyPair.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/lightsail_key_pair aws_lightsail_key_pair} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config
     */
    public LightsailKeyPair(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.lightsail.LightsailKeyPairConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/lightsail_key_pair aws_lightsail_key_pair} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     */
    public LightsailKeyPair(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNamePrefix() {
        software.amazon.jsii.Kernel.call(this, "resetNamePrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPgpKey() {
        software.amazon.jsii.Kernel.call(this, "resetPgpKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPublicKey() {
        software.amazon.jsii.Kernel.call(this, "resetPublicKey", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEncryptedFingerprint() {
        return software.amazon.jsii.Kernel.get(this, "encryptedFingerprint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEncryptedPrivateKey() {
        return software.amazon.jsii.Kernel.get(this, "encryptedPrivateKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFingerprint() {
        return software.amazon.jsii.Kernel.get(this, "fingerprint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrivateKey() {
        return software.amazon.jsii.Kernel.get(this, "privateKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNamePrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "namePrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPgpKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "pgpKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPublicKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "publicKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getNamePrefix() {
        return software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNamePrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "namePrefix", java.util.Objects.requireNonNull(value, "namePrefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPgpKey() {
        return software.amazon.jsii.Kernel.get(this, "pgpKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPgpKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "pgpKey", java.util.Objects.requireNonNull(value, "pgpKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPublicKey() {
        return software.amazon.jsii.Kernel.get(this, "publicKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPublicKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "publicKey", java.util.Objects.requireNonNull(value, "publicKey is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.lightsail.LightsailKeyPair}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.lightsail.LightsailKeyPair> {
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
        private imports.aws.lightsail.LightsailKeyPairConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config().connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config().connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config().count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config().dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config().forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config().lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config().provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config().provisioners(provisioners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_key_pair#id LightsailKeyPair#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_key_pair#id LightsailKeyPair#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config().id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_key_pair#name LightsailKeyPair#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_key_pair#name LightsailKeyPair#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config().name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_key_pair#name_prefix LightsailKeyPair#name_prefix}.
         * <p>
         * @return {@code this}
         * @param namePrefix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_key_pair#name_prefix LightsailKeyPair#name_prefix}. This parameter is required.
         */
        public Builder namePrefix(final java.lang.String namePrefix) {
            this.config().namePrefix(namePrefix);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_key_pair#pgp_key LightsailKeyPair#pgp_key}.
         * <p>
         * @return {@code this}
         * @param pgpKey Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_key_pair#pgp_key LightsailKeyPair#pgp_key}. This parameter is required.
         */
        public Builder pgpKey(final java.lang.String pgpKey) {
            this.config().pgpKey(pgpKey);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_key_pair#public_key LightsailKeyPair#public_key}.
         * <p>
         * @return {@code this}
         * @param publicKey Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_key_pair#public_key LightsailKeyPair#public_key}. This parameter is required.
         */
        public Builder publicKey(final java.lang.String publicKey) {
            this.config().publicKey(publicKey);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.lightsail.LightsailKeyPair}.
         */
        @Override
        public imports.aws.lightsail.LightsailKeyPair build() {
            return new imports.aws.lightsail.LightsailKeyPair(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.lightsail.LightsailKeyPairConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.lightsail.LightsailKeyPairConfig.Builder();
            }
            return this.config;
        }
    }
}
