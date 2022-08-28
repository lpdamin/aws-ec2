package imports.aws.appmesh;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route aws_appmesh_route}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.415Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshRoute")
public class AppmeshRoute extends com.hashicorp.cdktf.TerraformResource {

    protected AppmeshRoute(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshRoute(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.appmesh.AppmeshRoute.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route aws_appmesh_route} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public AppmeshRoute(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshRouteConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putSpec(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshRouteSpec value) {
        software.amazon.jsii.Kernel.call(this, "putSpec", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMeshOwner() {
        software.amazon.jsii.Kernel.call(this, "resetMeshOwner", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCreatedDate() {
        return software.amazon.jsii.Kernel.get(this, "createdDate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLastUpdatedDate() {
        return software.amazon.jsii.Kernel.get(this, "lastUpdatedDate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResourceOwner() {
        return software.amazon.jsii.Kernel.get(this, "resourceOwner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshRouteSpecOutputReference getSpec() {
        return software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMeshNameInput() {
        return software.amazon.jsii.Kernel.get(this, "meshNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMeshOwnerInput() {
        return software.amazon.jsii.Kernel.get(this, "meshOwnerInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshRouteSpec getSpecInput() {
        return software.amazon.jsii.Kernel.get(this, "specInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpec.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVirtualRouterNameInput() {
        return software.amazon.jsii.Kernel.get(this, "virtualRouterNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMeshName() {
        return software.amazon.jsii.Kernel.get(this, "meshName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMeshName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "meshName", java.util.Objects.requireNonNull(value, "meshName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMeshOwner() {
        return software.amazon.jsii.Kernel.get(this, "meshOwner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMeshOwner(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "meshOwner", java.util.Objects.requireNonNull(value, "meshOwner is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getVirtualRouterName() {
        return software.amazon.jsii.Kernel.get(this, "virtualRouterName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVirtualRouterName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "virtualRouterName", java.util.Objects.requireNonNull(value, "virtualRouterName is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.appmesh.AppmeshRoute}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.appmesh.AppmeshRoute> {
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
        private final imports.aws.appmesh.AppmeshRouteConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.appmesh.AppmeshRouteConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#mesh_name AppmeshRoute#mesh_name}.
         * <p>
         * @return {@code this}
         * @param meshName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#mesh_name AppmeshRoute#mesh_name}. This parameter is required.
         */
        public Builder meshName(final java.lang.String meshName) {
            this.config.meshName(meshName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#name AppmeshRoute#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#name AppmeshRoute#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * spec block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_route#spec AppmeshRoute#spec}
         * <p>
         * @return {@code this}
         * @param spec spec block. This parameter is required.
         */
        public Builder spec(final imports.aws.appmesh.AppmeshRouteSpec spec) {
            this.config.spec(spec);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#virtual_router_name AppmeshRoute#virtual_router_name}.
         * <p>
         * @return {@code this}
         * @param virtualRouterName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#virtual_router_name AppmeshRoute#virtual_router_name}. This parameter is required.
         */
        public Builder virtualRouterName(final java.lang.String virtualRouterName) {
            this.config.virtualRouterName(virtualRouterName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#id AppmeshRoute#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#id AppmeshRoute#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#mesh_owner AppmeshRoute#mesh_owner}.
         * <p>
         * @return {@code this}
         * @param meshOwner Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#mesh_owner AppmeshRoute#mesh_owner}. This parameter is required.
         */
        public Builder meshOwner(final java.lang.String meshOwner) {
            this.config.meshOwner(meshOwner);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#tags AppmeshRoute#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#tags AppmeshRoute#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#tags_all AppmeshRoute#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#tags_all AppmeshRoute#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.appmesh.AppmeshRoute}.
         */
        @Override
        public imports.aws.appmesh.AppmeshRoute build() {
            return new imports.aws.appmesh.AppmeshRoute(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
