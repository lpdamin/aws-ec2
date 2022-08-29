package imports.aws.vpc;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/security_group aws_security_group}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.982Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.vpc.SecurityGroup")
public class SecurityGroup extends com.hashicorp.cdktf.TerraformResource {

    protected SecurityGroup(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SecurityGroup(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.vpc.SecurityGroup.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/security_group aws_security_group} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config
     */
    public SecurityGroup(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.vpc.SecurityGroupConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/security_group aws_security_group} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     */
    public SecurityGroup(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void putEgress(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putEgress", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putIngress(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putIngress", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.vpc.SecurityGroupTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEgress() {
        software.amazon.jsii.Kernel.call(this, "resetEgress", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIngress() {
        software.amazon.jsii.Kernel.call(this, "resetIngress", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNamePrefix() {
        software.amazon.jsii.Kernel.call(this, "resetNamePrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRevokeRulesOnDelete() {
        software.amazon.jsii.Kernel.call(this, "resetRevokeRulesOnDelete", software.amazon.jsii.NativeType.VOID);
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

    public void resetVpcId() {
        software.amazon.jsii.Kernel.call(this, "resetVpcId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.SecurityGroupEgressList getEgress() {
        return software.amazon.jsii.Kernel.get(this, "egress", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.SecurityGroupEgressList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.SecurityGroupIngressList getIngress() {
        return software.amazon.jsii.Kernel.get(this, "ingress", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.SecurityGroupIngressList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOwnerId() {
        return software.amazon.jsii.Kernel.get(this, "ownerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.SecurityGroupTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.SecurityGroupTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEgressInput() {
        return software.amazon.jsii.Kernel.get(this, "egressInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIngressInput() {
        return software.amazon.jsii.Kernel.get(this, "ingressInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNamePrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "namePrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRevokeRulesOnDeleteInput() {
        return software.amazon.jsii.Kernel.get(this, "revokeRulesOnDeleteInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
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

    public @org.jetbrains.annotations.Nullable java.lang.String getVpcIdInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.Object getRevokeRulesOnDelete() {
        return software.amazon.jsii.Kernel.get(this, "revokeRulesOnDelete", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setRevokeRulesOnDelete(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "revokeRulesOnDelete", java.util.Objects.requireNonNull(value, "revokeRulesOnDelete is required"));
    }

    public void setRevokeRulesOnDelete(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "revokeRulesOnDelete", java.util.Objects.requireNonNull(value, "revokeRulesOnDelete is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcId() {
        return software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVpcId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "vpcId", java.util.Objects.requireNonNull(value, "vpcId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.vpc.SecurityGroup}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.vpc.SecurityGroup> {
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
        private imports.aws.vpc.SecurityGroupConfig.Builder config;

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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#description SecurityGroup#description}.
         * <p>
         * @return {@code this}
         * @param description Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#description SecurityGroup#description}. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config().description(description);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#egress SecurityGroup#egress}.
         * <p>
         * @return {@code this}
         * @param egress Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#egress SecurityGroup#egress}. This parameter is required.
         */
        public Builder egress(final com.hashicorp.cdktf.IResolvable egress) {
            this.config().egress(egress);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#egress SecurityGroup#egress}.
         * <p>
         * @return {@code this}
         * @param egress Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#egress SecurityGroup#egress}. This parameter is required.
         */
        public Builder egress(final java.util.List<? extends imports.aws.vpc.SecurityGroupEgress> egress) {
            this.config().egress(egress);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#id SecurityGroup#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#id SecurityGroup#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config().id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#ingress SecurityGroup#ingress}.
         * <p>
         * @return {@code this}
         * @param ingress Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#ingress SecurityGroup#ingress}. This parameter is required.
         */
        public Builder ingress(final com.hashicorp.cdktf.IResolvable ingress) {
            this.config().ingress(ingress);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#ingress SecurityGroup#ingress}.
         * <p>
         * @return {@code this}
         * @param ingress Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#ingress SecurityGroup#ingress}. This parameter is required.
         */
        public Builder ingress(final java.util.List<? extends imports.aws.vpc.SecurityGroupIngress> ingress) {
            this.config().ingress(ingress);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#name SecurityGroup#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#name SecurityGroup#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config().name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#name_prefix SecurityGroup#name_prefix}.
         * <p>
         * @return {@code this}
         * @param namePrefix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#name_prefix SecurityGroup#name_prefix}. This parameter is required.
         */
        public Builder namePrefix(final java.lang.String namePrefix) {
            this.config().namePrefix(namePrefix);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#revoke_rules_on_delete SecurityGroup#revoke_rules_on_delete}.
         * <p>
         * @return {@code this}
         * @param revokeRulesOnDelete Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#revoke_rules_on_delete SecurityGroup#revoke_rules_on_delete}. This parameter is required.
         */
        public Builder revokeRulesOnDelete(final java.lang.Boolean revokeRulesOnDelete) {
            this.config().revokeRulesOnDelete(revokeRulesOnDelete);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#revoke_rules_on_delete SecurityGroup#revoke_rules_on_delete}.
         * <p>
         * @return {@code this}
         * @param revokeRulesOnDelete Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#revoke_rules_on_delete SecurityGroup#revoke_rules_on_delete}. This parameter is required.
         */
        public Builder revokeRulesOnDelete(final com.hashicorp.cdktf.IResolvable revokeRulesOnDelete) {
            this.config().revokeRulesOnDelete(revokeRulesOnDelete);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#tags SecurityGroup#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#tags SecurityGroup#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#tags_all SecurityGroup#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#tags_all SecurityGroup#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config().tagsAll(tagsAll);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/security_group#timeouts SecurityGroup#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.vpc.SecurityGroupTimeouts timeouts) {
            this.config().timeouts(timeouts);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#vpc_id SecurityGroup#vpc_id}.
         * <p>
         * @return {@code this}
         * @param vpcId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/security_group#vpc_id SecurityGroup#vpc_id}. This parameter is required.
         */
        public Builder vpcId(final java.lang.String vpcId) {
            this.config().vpcId(vpcId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.vpc.SecurityGroup}.
         */
        @Override
        public imports.aws.vpc.SecurityGroup build() {
            return new imports.aws.vpc.SecurityGroup(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.vpc.SecurityGroupConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.vpc.SecurityGroupConfig.Builder();
            }
            return this.config;
        }
    }
}
