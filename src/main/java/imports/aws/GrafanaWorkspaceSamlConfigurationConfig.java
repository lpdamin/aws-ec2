package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.256Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.GrafanaWorkspaceSamlConfigurationConfig")
@software.amazon.jsii.Jsii.Proxy(GrafanaWorkspaceSamlConfigurationConfig.Jsii$Proxy.class)
public interface GrafanaWorkspaceSamlConfigurationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#editor_role_values GrafanaWorkspaceSamlConfiguration#editor_role_values}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getEditorRoleValues();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#workspace_id GrafanaWorkspaceSamlConfiguration#workspace_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getWorkspaceId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#admin_role_values GrafanaWorkspaceSamlConfiguration#admin_role_values}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAdminRoleValues() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#allowed_organizations GrafanaWorkspaceSamlConfiguration#allowed_organizations}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedOrganizations() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#email_assertion GrafanaWorkspaceSamlConfiguration#email_assertion}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEmailAssertion() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#groups_assertion GrafanaWorkspaceSamlConfiguration#groups_assertion}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGroupsAssertion() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#id GrafanaWorkspaceSamlConfiguration#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#idp_metadata_url GrafanaWorkspaceSamlConfiguration#idp_metadata_url}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIdpMetadataUrl() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#idp_metadata_xml GrafanaWorkspaceSamlConfiguration#idp_metadata_xml}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIdpMetadataXml() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#login_assertion GrafanaWorkspaceSamlConfiguration#login_assertion}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLoginAssertion() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#login_validity_duration GrafanaWorkspaceSamlConfiguration#login_validity_duration}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getLoginValidityDuration() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#name_assertion GrafanaWorkspaceSamlConfiguration#name_assertion}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNameAssertion() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#org_assertion GrafanaWorkspaceSamlConfiguration#org_assertion}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getOrgAssertion() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#role_assertion GrafanaWorkspaceSamlConfiguration#role_assertion}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRoleAssertion() {
        return null;
    }

    /**
     * timeouts block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#timeouts GrafanaWorkspaceSamlConfiguration#timeouts}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.GrafanaWorkspaceSamlConfigurationTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GrafanaWorkspaceSamlConfigurationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GrafanaWorkspaceSamlConfigurationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GrafanaWorkspaceSamlConfigurationConfig> {
        java.util.List<java.lang.String> editorRoleValues;
        java.lang.String workspaceId;
        java.util.List<java.lang.String> adminRoleValues;
        java.util.List<java.lang.String> allowedOrganizations;
        java.lang.String emailAssertion;
        java.lang.String groupsAssertion;
        java.lang.String id;
        java.lang.String idpMetadataUrl;
        java.lang.String idpMetadataXml;
        java.lang.String loginAssertion;
        java.lang.Number loginValidityDuration;
        java.lang.String nameAssertion;
        java.lang.String orgAssertion;
        java.lang.String roleAssertion;
        imports.aws.GrafanaWorkspaceSamlConfigurationTimeouts timeouts;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getEditorRoleValues}
         * @param editorRoleValues Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#editor_role_values GrafanaWorkspaceSamlConfiguration#editor_role_values}. This parameter is required.
         * @return {@code this}
         */
        public Builder editorRoleValues(java.util.List<java.lang.String> editorRoleValues) {
            this.editorRoleValues = editorRoleValues;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getWorkspaceId}
         * @param workspaceId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#workspace_id GrafanaWorkspaceSamlConfiguration#workspace_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder workspaceId(java.lang.String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getAdminRoleValues}
         * @param adminRoleValues Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#admin_role_values GrafanaWorkspaceSamlConfiguration#admin_role_values}.
         * @return {@code this}
         */
        public Builder adminRoleValues(java.util.List<java.lang.String> adminRoleValues) {
            this.adminRoleValues = adminRoleValues;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getAllowedOrganizations}
         * @param allowedOrganizations Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#allowed_organizations GrafanaWorkspaceSamlConfiguration#allowed_organizations}.
         * @return {@code this}
         */
        public Builder allowedOrganizations(java.util.List<java.lang.String> allowedOrganizations) {
            this.allowedOrganizations = allowedOrganizations;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getEmailAssertion}
         * @param emailAssertion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#email_assertion GrafanaWorkspaceSamlConfiguration#email_assertion}.
         * @return {@code this}
         */
        public Builder emailAssertion(java.lang.String emailAssertion) {
            this.emailAssertion = emailAssertion;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getGroupsAssertion}
         * @param groupsAssertion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#groups_assertion GrafanaWorkspaceSamlConfiguration#groups_assertion}.
         * @return {@code this}
         */
        public Builder groupsAssertion(java.lang.String groupsAssertion) {
            this.groupsAssertion = groupsAssertion;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#id GrafanaWorkspaceSamlConfiguration#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getIdpMetadataUrl}
         * @param idpMetadataUrl Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#idp_metadata_url GrafanaWorkspaceSamlConfiguration#idp_metadata_url}.
         * @return {@code this}
         */
        public Builder idpMetadataUrl(java.lang.String idpMetadataUrl) {
            this.idpMetadataUrl = idpMetadataUrl;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getIdpMetadataXml}
         * @param idpMetadataXml Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#idp_metadata_xml GrafanaWorkspaceSamlConfiguration#idp_metadata_xml}.
         * @return {@code this}
         */
        public Builder idpMetadataXml(java.lang.String idpMetadataXml) {
            this.idpMetadataXml = idpMetadataXml;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getLoginAssertion}
         * @param loginAssertion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#login_assertion GrafanaWorkspaceSamlConfiguration#login_assertion}.
         * @return {@code this}
         */
        public Builder loginAssertion(java.lang.String loginAssertion) {
            this.loginAssertion = loginAssertion;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getLoginValidityDuration}
         * @param loginValidityDuration Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#login_validity_duration GrafanaWorkspaceSamlConfiguration#login_validity_duration}.
         * @return {@code this}
         */
        public Builder loginValidityDuration(java.lang.Number loginValidityDuration) {
            this.loginValidityDuration = loginValidityDuration;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getNameAssertion}
         * @param nameAssertion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#name_assertion GrafanaWorkspaceSamlConfiguration#name_assertion}.
         * @return {@code this}
         */
        public Builder nameAssertion(java.lang.String nameAssertion) {
            this.nameAssertion = nameAssertion;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getOrgAssertion}
         * @param orgAssertion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#org_assertion GrafanaWorkspaceSamlConfiguration#org_assertion}.
         * @return {@code this}
         */
        public Builder orgAssertion(java.lang.String orgAssertion) {
            this.orgAssertion = orgAssertion;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getRoleAssertion}
         * @param roleAssertion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#role_assertion GrafanaWorkspaceSamlConfiguration#role_assertion}.
         * @return {@code this}
         */
        public Builder roleAssertion(java.lang.String roleAssertion) {
            this.roleAssertion = roleAssertion;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getTimeouts}
         * @param timeouts timeouts block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/grafana_workspace_saml_configuration#timeouts GrafanaWorkspaceSamlConfiguration#timeouts}
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.GrafanaWorkspaceSamlConfigurationTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link GrafanaWorkspaceSamlConfigurationConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GrafanaWorkspaceSamlConfigurationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GrafanaWorkspaceSamlConfigurationConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GrafanaWorkspaceSamlConfigurationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GrafanaWorkspaceSamlConfigurationConfig {
        private final java.util.List<java.lang.String> editorRoleValues;
        private final java.lang.String workspaceId;
        private final java.util.List<java.lang.String> adminRoleValues;
        private final java.util.List<java.lang.String> allowedOrganizations;
        private final java.lang.String emailAssertion;
        private final java.lang.String groupsAssertion;
        private final java.lang.String id;
        private final java.lang.String idpMetadataUrl;
        private final java.lang.String idpMetadataXml;
        private final java.lang.String loginAssertion;
        private final java.lang.Number loginValidityDuration;
        private final java.lang.String nameAssertion;
        private final java.lang.String orgAssertion;
        private final java.lang.String roleAssertion;
        private final imports.aws.GrafanaWorkspaceSamlConfigurationTimeouts timeouts;
        private final java.lang.Object connection;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.editorRoleValues = software.amazon.jsii.Kernel.get(this, "editorRoleValues", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.workspaceId = software.amazon.jsii.Kernel.get(this, "workspaceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.adminRoleValues = software.amazon.jsii.Kernel.get(this, "adminRoleValues", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.allowedOrganizations = software.amazon.jsii.Kernel.get(this, "allowedOrganizations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.emailAssertion = software.amazon.jsii.Kernel.get(this, "emailAssertion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.groupsAssertion = software.amazon.jsii.Kernel.get(this, "groupsAssertion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.idpMetadataUrl = software.amazon.jsii.Kernel.get(this, "idpMetadataUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.idpMetadataXml = software.amazon.jsii.Kernel.get(this, "idpMetadataXml", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.loginAssertion = software.amazon.jsii.Kernel.get(this, "loginAssertion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.loginValidityDuration = software.amazon.jsii.Kernel.get(this, "loginValidityDuration", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.nameAssertion = software.amazon.jsii.Kernel.get(this, "nameAssertion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.orgAssertion = software.amazon.jsii.Kernel.get(this, "orgAssertion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleAssertion = software.amazon.jsii.Kernel.get(this, "roleAssertion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.GrafanaWorkspaceSamlConfigurationTimeouts.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.editorRoleValues = java.util.Objects.requireNonNull(builder.editorRoleValues, "editorRoleValues is required");
            this.workspaceId = java.util.Objects.requireNonNull(builder.workspaceId, "workspaceId is required");
            this.adminRoleValues = builder.adminRoleValues;
            this.allowedOrganizations = builder.allowedOrganizations;
            this.emailAssertion = builder.emailAssertion;
            this.groupsAssertion = builder.groupsAssertion;
            this.id = builder.id;
            this.idpMetadataUrl = builder.idpMetadataUrl;
            this.idpMetadataXml = builder.idpMetadataXml;
            this.loginAssertion = builder.loginAssertion;
            this.loginValidityDuration = builder.loginValidityDuration;
            this.nameAssertion = builder.nameAssertion;
            this.orgAssertion = builder.orgAssertion;
            this.roleAssertion = builder.roleAssertion;
            this.timeouts = builder.timeouts;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.util.List<java.lang.String> getEditorRoleValues() {
            return this.editorRoleValues;
        }

        @Override
        public final java.lang.String getWorkspaceId() {
            return this.workspaceId;
        }

        @Override
        public final java.util.List<java.lang.String> getAdminRoleValues() {
            return this.adminRoleValues;
        }

        @Override
        public final java.util.List<java.lang.String> getAllowedOrganizations() {
            return this.allowedOrganizations;
        }

        @Override
        public final java.lang.String getEmailAssertion() {
            return this.emailAssertion;
        }

        @Override
        public final java.lang.String getGroupsAssertion() {
            return this.groupsAssertion;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getIdpMetadataUrl() {
            return this.idpMetadataUrl;
        }

        @Override
        public final java.lang.String getIdpMetadataXml() {
            return this.idpMetadataXml;
        }

        @Override
        public final java.lang.String getLoginAssertion() {
            return this.loginAssertion;
        }

        @Override
        public final java.lang.Number getLoginValidityDuration() {
            return this.loginValidityDuration;
        }

        @Override
        public final java.lang.String getNameAssertion() {
            return this.nameAssertion;
        }

        @Override
        public final java.lang.String getOrgAssertion() {
            return this.orgAssertion;
        }

        @Override
        public final java.lang.String getRoleAssertion() {
            return this.roleAssertion;
        }

        @Override
        public final imports.aws.GrafanaWorkspaceSamlConfigurationTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("editorRoleValues", om.valueToTree(this.getEditorRoleValues()));
            data.set("workspaceId", om.valueToTree(this.getWorkspaceId()));
            if (this.getAdminRoleValues() != null) {
                data.set("adminRoleValues", om.valueToTree(this.getAdminRoleValues()));
            }
            if (this.getAllowedOrganizations() != null) {
                data.set("allowedOrganizations", om.valueToTree(this.getAllowedOrganizations()));
            }
            if (this.getEmailAssertion() != null) {
                data.set("emailAssertion", om.valueToTree(this.getEmailAssertion()));
            }
            if (this.getGroupsAssertion() != null) {
                data.set("groupsAssertion", om.valueToTree(this.getGroupsAssertion()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getIdpMetadataUrl() != null) {
                data.set("idpMetadataUrl", om.valueToTree(this.getIdpMetadataUrl()));
            }
            if (this.getIdpMetadataXml() != null) {
                data.set("idpMetadataXml", om.valueToTree(this.getIdpMetadataXml()));
            }
            if (this.getLoginAssertion() != null) {
                data.set("loginAssertion", om.valueToTree(this.getLoginAssertion()));
            }
            if (this.getLoginValidityDuration() != null) {
                data.set("loginValidityDuration", om.valueToTree(this.getLoginValidityDuration()));
            }
            if (this.getNameAssertion() != null) {
                data.set("nameAssertion", om.valueToTree(this.getNameAssertion()));
            }
            if (this.getOrgAssertion() != null) {
                data.set("orgAssertion", om.valueToTree(this.getOrgAssertion()));
            }
            if (this.getRoleAssertion() != null) {
                data.set("roleAssertion", om.valueToTree(this.getRoleAssertion()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.GrafanaWorkspaceSamlConfigurationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GrafanaWorkspaceSamlConfigurationConfig.Jsii$Proxy that = (GrafanaWorkspaceSamlConfigurationConfig.Jsii$Proxy) o;

            if (!editorRoleValues.equals(that.editorRoleValues)) return false;
            if (!workspaceId.equals(that.workspaceId)) return false;
            if (this.adminRoleValues != null ? !this.adminRoleValues.equals(that.adminRoleValues) : that.adminRoleValues != null) return false;
            if (this.allowedOrganizations != null ? !this.allowedOrganizations.equals(that.allowedOrganizations) : that.allowedOrganizations != null) return false;
            if (this.emailAssertion != null ? !this.emailAssertion.equals(that.emailAssertion) : that.emailAssertion != null) return false;
            if (this.groupsAssertion != null ? !this.groupsAssertion.equals(that.groupsAssertion) : that.groupsAssertion != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.idpMetadataUrl != null ? !this.idpMetadataUrl.equals(that.idpMetadataUrl) : that.idpMetadataUrl != null) return false;
            if (this.idpMetadataXml != null ? !this.idpMetadataXml.equals(that.idpMetadataXml) : that.idpMetadataXml != null) return false;
            if (this.loginAssertion != null ? !this.loginAssertion.equals(that.loginAssertion) : that.loginAssertion != null) return false;
            if (this.loginValidityDuration != null ? !this.loginValidityDuration.equals(that.loginValidityDuration) : that.loginValidityDuration != null) return false;
            if (this.nameAssertion != null ? !this.nameAssertion.equals(that.nameAssertion) : that.nameAssertion != null) return false;
            if (this.orgAssertion != null ? !this.orgAssertion.equals(that.orgAssertion) : that.orgAssertion != null) return false;
            if (this.roleAssertion != null ? !this.roleAssertion.equals(that.roleAssertion) : that.roleAssertion != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.editorRoleValues.hashCode();
            result = 31 * result + (this.workspaceId.hashCode());
            result = 31 * result + (this.adminRoleValues != null ? this.adminRoleValues.hashCode() : 0);
            result = 31 * result + (this.allowedOrganizations != null ? this.allowedOrganizations.hashCode() : 0);
            result = 31 * result + (this.emailAssertion != null ? this.emailAssertion.hashCode() : 0);
            result = 31 * result + (this.groupsAssertion != null ? this.groupsAssertion.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.idpMetadataUrl != null ? this.idpMetadataUrl.hashCode() : 0);
            result = 31 * result + (this.idpMetadataXml != null ? this.idpMetadataXml.hashCode() : 0);
            result = 31 * result + (this.loginAssertion != null ? this.loginAssertion.hashCode() : 0);
            result = 31 * result + (this.loginValidityDuration != null ? this.loginValidityDuration.hashCode() : 0);
            result = 31 * result + (this.nameAssertion != null ? this.nameAssertion.hashCode() : 0);
            result = 31 * result + (this.orgAssertion != null ? this.orgAssertion.hashCode() : 0);
            result = 31 * result + (this.roleAssertion != null ? this.roleAssertion.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}
