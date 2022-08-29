package imports.aws.lightsail;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/lightsail_container_service aws_lightsail_container_service}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.853Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lightsail.LightsailContainerService")
public class LightsailContainerService extends com.hashicorp.cdktf.TerraformResource {

    protected LightsailContainerService(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LightsailContainerService(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.lightsail.LightsailContainerService.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/lightsail_container_service aws_lightsail_container_service} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public LightsailContainerService(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.lightsail.LightsailContainerServiceConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putPublicDomainNames(final @org.jetbrains.annotations.NotNull imports.aws.lightsail.LightsailContainerServicePublicDomainNames value) {
        software.amazon.jsii.Kernel.call(this, "putPublicDomainNames", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.lightsail.LightsailContainerServiceTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIsDisabled() {
        software.amazon.jsii.Kernel.call(this, "resetIsDisabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPublicDomainNames() {
        software.amazon.jsii.Kernel.call(this, "resetPublicDomainNames", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAvailabilityZone() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCreatedAt() {
        return software.amazon.jsii.Kernel.get(this, "createdAt", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPowerId() {
        return software.amazon.jsii.Kernel.get(this, "powerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrincipalArn() {
        return software.amazon.jsii.Kernel.get(this, "principalArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrivateDomainName() {
        return software.amazon.jsii.Kernel.get(this, "privateDomainName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lightsail.LightsailContainerServicePublicDomainNamesOutputReference getPublicDomainNames() {
        return software.amazon.jsii.Kernel.get(this, "publicDomainNames", software.amazon.jsii.NativeType.forClass(imports.aws.lightsail.LightsailContainerServicePublicDomainNamesOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResourceType() {
        return software.amazon.jsii.Kernel.get(this, "resourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getState() {
        return software.amazon.jsii.Kernel.get(this, "state", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lightsail.LightsailContainerServiceTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.lightsail.LightsailContainerServiceTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUrl() {
        return software.amazon.jsii.Kernel.get(this, "url", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIsDisabledInput() {
        return software.amazon.jsii.Kernel.get(this, "isDisabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPowerInput() {
        return software.amazon.jsii.Kernel.get(this, "powerInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lightsail.LightsailContainerServicePublicDomainNames getPublicDomainNamesInput() {
        return software.amazon.jsii.Kernel.get(this, "publicDomainNamesInput", software.amazon.jsii.NativeType.forClass(imports.aws.lightsail.LightsailContainerServicePublicDomainNames.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getScaleInput() {
        return software.amazon.jsii.Kernel.get(this, "scaleInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIsDisabled() {
        return software.amazon.jsii.Kernel.get(this, "isDisabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIsDisabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "isDisabled", java.util.Objects.requireNonNull(value, "isDisabled is required"));
    }

    public void setIsDisabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "isDisabled", java.util.Objects.requireNonNull(value, "isDisabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPower() {
        return software.amazon.jsii.Kernel.get(this, "power", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPower(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "power", java.util.Objects.requireNonNull(value, "power is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getScale() {
        return software.amazon.jsii.Kernel.get(this, "scale", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setScale(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "scale", java.util.Objects.requireNonNull(value, "scale is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tagsAll", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTagsAll(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tagsAll", java.util.Objects.requireNonNull(value, "tagsAll is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.lightsail.LightsailContainerService}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.lightsail.LightsailContainerService> {
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
        private final imports.aws.lightsail.LightsailContainerServiceConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.lightsail.LightsailContainerServiceConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_container_service#name LightsailContainerService#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_container_service#name LightsailContainerService#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_container_service#power LightsailContainerService#power}.
         * <p>
         * @return {@code this}
         * @param power Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_container_service#power LightsailContainerService#power}. This parameter is required.
         */
        public Builder power(final java.lang.String power) {
            this.config.power(power);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_container_service#scale LightsailContainerService#scale}.
         * <p>
         * @return {@code this}
         * @param scale Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_container_service#scale LightsailContainerService#scale}. This parameter is required.
         */
        public Builder scale(final java.lang.Number scale) {
            this.config.scale(scale);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_container_service#id LightsailContainerService#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_container_service#id LightsailContainerService#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_container_service#is_disabled LightsailContainerService#is_disabled}.
         * <p>
         * @return {@code this}
         * @param isDisabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_container_service#is_disabled LightsailContainerService#is_disabled}. This parameter is required.
         */
        public Builder isDisabled(final java.lang.Boolean isDisabled) {
            this.config.isDisabled(isDisabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_container_service#is_disabled LightsailContainerService#is_disabled}.
         * <p>
         * @return {@code this}
         * @param isDisabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_container_service#is_disabled LightsailContainerService#is_disabled}. This parameter is required.
         */
        public Builder isDisabled(final com.hashicorp.cdktf.IResolvable isDisabled) {
            this.config.isDisabled(isDisabled);
            return this;
        }

        /**
         * public_domain_names block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lightsail_container_service#public_domain_names LightsailContainerService#public_domain_names}
         * <p>
         * @return {@code this}
         * @param publicDomainNames public_domain_names block. This parameter is required.
         */
        public Builder publicDomainNames(final imports.aws.lightsail.LightsailContainerServicePublicDomainNames publicDomainNames) {
            this.config.publicDomainNames(publicDomainNames);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_container_service#tags LightsailContainerService#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_container_service#tags LightsailContainerService#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_container_service#tags_all LightsailContainerService#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lightsail_container_service#tags_all LightsailContainerService#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lightsail_container_service#timeouts LightsailContainerService#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.lightsail.LightsailContainerServiceTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.lightsail.LightsailContainerService}.
         */
        @Override
        public imports.aws.lightsail.LightsailContainerService build() {
            return new imports.aws.lightsail.LightsailContainerService(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
