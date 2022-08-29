package imports.aws.codeartifact;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/codeartifact_domain_permissions_policy aws_codeartifact_domain_permissions_policy}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.075Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codeartifact.CodeartifactDomainPermissionsPolicy")
public class CodeartifactDomainPermissionsPolicy extends com.hashicorp.cdktf.TerraformResource {

    protected CodeartifactDomainPermissionsPolicy(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodeartifactDomainPermissionsPolicy(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.codeartifact.CodeartifactDomainPermissionsPolicy.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/codeartifact_domain_permissions_policy aws_codeartifact_domain_permissions_policy} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public CodeartifactDomainPermissionsPolicy(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.codeartifact.CodeartifactDomainPermissionsPolicyConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDomainOwner() {
        software.amazon.jsii.Kernel.call(this, "resetDomainOwner", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPolicyRevision() {
        software.amazon.jsii.Kernel.call(this, "resetPolicyRevision", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getResourceArn() {
        return software.amazon.jsii.Kernel.get(this, "resourceArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDomainInput() {
        return software.amazon.jsii.Kernel.get(this, "domainInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDomainOwnerInput() {
        return software.amazon.jsii.Kernel.get(this, "domainOwnerInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPolicyDocumentInput() {
        return software.amazon.jsii.Kernel.get(this, "policyDocumentInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPolicyRevisionInput() {
        return software.amazon.jsii.Kernel.get(this, "policyRevisionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDomain() {
        return software.amazon.jsii.Kernel.get(this, "domain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDomain(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "domain", java.util.Objects.requireNonNull(value, "domain is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDomainOwner() {
        return software.amazon.jsii.Kernel.get(this, "domainOwner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDomainOwner(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "domainOwner", java.util.Objects.requireNonNull(value, "domainOwner is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPolicyDocument() {
        return software.amazon.jsii.Kernel.get(this, "policyDocument", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicyDocument(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policyDocument", java.util.Objects.requireNonNull(value, "policyDocument is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPolicyRevision() {
        return software.amazon.jsii.Kernel.get(this, "policyRevision", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicyRevision(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policyRevision", java.util.Objects.requireNonNull(value, "policyRevision is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.codeartifact.CodeartifactDomainPermissionsPolicy}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.codeartifact.CodeartifactDomainPermissionsPolicy> {
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
        private final imports.aws.codeartifact.CodeartifactDomainPermissionsPolicyConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.codeartifact.CodeartifactDomainPermissionsPolicyConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codeartifact_domain_permissions_policy#domain CodeartifactDomainPermissionsPolicy#domain}.
         * <p>
         * @return {@code this}
         * @param domain Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codeartifact_domain_permissions_policy#domain CodeartifactDomainPermissionsPolicy#domain}. This parameter is required.
         */
        public Builder domain(final java.lang.String domain) {
            this.config.domain(domain);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codeartifact_domain_permissions_policy#policy_document CodeartifactDomainPermissionsPolicy#policy_document}.
         * <p>
         * @return {@code this}
         * @param policyDocument Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codeartifact_domain_permissions_policy#policy_document CodeartifactDomainPermissionsPolicy#policy_document}. This parameter is required.
         */
        public Builder policyDocument(final java.lang.String policyDocument) {
            this.config.policyDocument(policyDocument);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codeartifact_domain_permissions_policy#domain_owner CodeartifactDomainPermissionsPolicy#domain_owner}.
         * <p>
         * @return {@code this}
         * @param domainOwner Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codeartifact_domain_permissions_policy#domain_owner CodeartifactDomainPermissionsPolicy#domain_owner}. This parameter is required.
         */
        public Builder domainOwner(final java.lang.String domainOwner) {
            this.config.domainOwner(domainOwner);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codeartifact_domain_permissions_policy#id CodeartifactDomainPermissionsPolicy#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codeartifact_domain_permissions_policy#id CodeartifactDomainPermissionsPolicy#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codeartifact_domain_permissions_policy#policy_revision CodeartifactDomainPermissionsPolicy#policy_revision}.
         * <p>
         * @return {@code this}
         * @param policyRevision Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codeartifact_domain_permissions_policy#policy_revision CodeartifactDomainPermissionsPolicy#policy_revision}. This parameter is required.
         */
        public Builder policyRevision(final java.lang.String policyRevision) {
            this.config.policyRevision(policyRevision);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.codeartifact.CodeartifactDomainPermissionsPolicy}.
         */
        @Override
        public imports.aws.codeartifact.CodeartifactDomainPermissionsPolicy build() {
            return new imports.aws.codeartifact.CodeartifactDomainPermissionsPolicy(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
