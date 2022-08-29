package imports.aws.codebuild;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.099Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codebuild.CodebuildProjectSecondarySources")
@software.amazon.jsii.Jsii.Proxy(CodebuildProjectSecondarySources.Jsii$Proxy.class)
public interface CodebuildProjectSecondarySources extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#source_identifier CodebuildProject#source_identifier}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSourceIdentifier();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#type CodebuildProject#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * auth block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#auth CodebuildProject#auth}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildProjectSecondarySourcesAuth getAuth() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#buildspec CodebuildProject#buildspec}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBuildspec() {
        return null;
    }

    /**
     * build_status_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#build_status_config CodebuildProject#build_status_config}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildProjectSecondarySourcesBuildStatusConfig getBuildStatusConfig() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#git_clone_depth CodebuildProject#git_clone_depth}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getGitCloneDepth() {
        return null;
    }

    /**
     * git_submodules_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#git_submodules_config CodebuildProject#git_submodules_config}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildProjectSecondarySourcesGitSubmodulesConfig getGitSubmodulesConfig() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#insecure_ssl CodebuildProject#insecure_ssl}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getInsecureSsl() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#location CodebuildProject#location}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLocation() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#report_build_status CodebuildProject#report_build_status}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getReportBuildStatus() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodebuildProjectSecondarySources}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodebuildProjectSecondarySources}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodebuildProjectSecondarySources> {
        java.lang.String sourceIdentifier;
        java.lang.String type;
        imports.aws.codebuild.CodebuildProjectSecondarySourcesAuth auth;
        java.lang.String buildspec;
        imports.aws.codebuild.CodebuildProjectSecondarySourcesBuildStatusConfig buildStatusConfig;
        java.lang.Number gitCloneDepth;
        imports.aws.codebuild.CodebuildProjectSecondarySourcesGitSubmodulesConfig gitSubmodulesConfig;
        java.lang.Object insecureSsl;
        java.lang.String location;
        java.lang.Object reportBuildStatus;

        /**
         * Sets the value of {@link CodebuildProjectSecondarySources#getSourceIdentifier}
         * @param sourceIdentifier Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#source_identifier CodebuildProject#source_identifier}. This parameter is required.
         * @return {@code this}
         */
        public Builder sourceIdentifier(java.lang.String sourceIdentifier) {
            this.sourceIdentifier = sourceIdentifier;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSecondarySources#getType}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#type CodebuildProject#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSecondarySources#getAuth}
         * @param auth auth block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#auth CodebuildProject#auth}
         * @return {@code this}
         */
        public Builder auth(imports.aws.codebuild.CodebuildProjectSecondarySourcesAuth auth) {
            this.auth = auth;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSecondarySources#getBuildspec}
         * @param buildspec Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#buildspec CodebuildProject#buildspec}.
         * @return {@code this}
         */
        public Builder buildspec(java.lang.String buildspec) {
            this.buildspec = buildspec;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSecondarySources#getBuildStatusConfig}
         * @param buildStatusConfig build_status_config block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#build_status_config CodebuildProject#build_status_config}
         * @return {@code this}
         */
        public Builder buildStatusConfig(imports.aws.codebuild.CodebuildProjectSecondarySourcesBuildStatusConfig buildStatusConfig) {
            this.buildStatusConfig = buildStatusConfig;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSecondarySources#getGitCloneDepth}
         * @param gitCloneDepth Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#git_clone_depth CodebuildProject#git_clone_depth}.
         * @return {@code this}
         */
        public Builder gitCloneDepth(java.lang.Number gitCloneDepth) {
            this.gitCloneDepth = gitCloneDepth;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSecondarySources#getGitSubmodulesConfig}
         * @param gitSubmodulesConfig git_submodules_config block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_project#git_submodules_config CodebuildProject#git_submodules_config}
         * @return {@code this}
         */
        public Builder gitSubmodulesConfig(imports.aws.codebuild.CodebuildProjectSecondarySourcesGitSubmodulesConfig gitSubmodulesConfig) {
            this.gitSubmodulesConfig = gitSubmodulesConfig;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSecondarySources#getInsecureSsl}
         * @param insecureSsl Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#insecure_ssl CodebuildProject#insecure_ssl}.
         * @return {@code this}
         */
        public Builder insecureSsl(java.lang.Boolean insecureSsl) {
            this.insecureSsl = insecureSsl;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSecondarySources#getInsecureSsl}
         * @param insecureSsl Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#insecure_ssl CodebuildProject#insecure_ssl}.
         * @return {@code this}
         */
        public Builder insecureSsl(com.hashicorp.cdktf.IResolvable insecureSsl) {
            this.insecureSsl = insecureSsl;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSecondarySources#getLocation}
         * @param location Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#location CodebuildProject#location}.
         * @return {@code this}
         */
        public Builder location(java.lang.String location) {
            this.location = location;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSecondarySources#getReportBuildStatus}
         * @param reportBuildStatus Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#report_build_status CodebuildProject#report_build_status}.
         * @return {@code this}
         */
        public Builder reportBuildStatus(java.lang.Boolean reportBuildStatus) {
            this.reportBuildStatus = reportBuildStatus;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSecondarySources#getReportBuildStatus}
         * @param reportBuildStatus Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#report_build_status CodebuildProject#report_build_status}.
         * @return {@code this}
         */
        public Builder reportBuildStatus(com.hashicorp.cdktf.IResolvable reportBuildStatus) {
            this.reportBuildStatus = reportBuildStatus;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodebuildProjectSecondarySources}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodebuildProjectSecondarySources build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CodebuildProjectSecondarySources}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodebuildProjectSecondarySources {
        private final java.lang.String sourceIdentifier;
        private final java.lang.String type;
        private final imports.aws.codebuild.CodebuildProjectSecondarySourcesAuth auth;
        private final java.lang.String buildspec;
        private final imports.aws.codebuild.CodebuildProjectSecondarySourcesBuildStatusConfig buildStatusConfig;
        private final java.lang.Number gitCloneDepth;
        private final imports.aws.codebuild.CodebuildProjectSecondarySourcesGitSubmodulesConfig gitSubmodulesConfig;
        private final java.lang.Object insecureSsl;
        private final java.lang.String location;
        private final java.lang.Object reportBuildStatus;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.sourceIdentifier = software.amazon.jsii.Kernel.get(this, "sourceIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.auth = software.amazon.jsii.Kernel.get(this, "auth", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectSecondarySourcesAuth.class));
            this.buildspec = software.amazon.jsii.Kernel.get(this, "buildspec", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.buildStatusConfig = software.amazon.jsii.Kernel.get(this, "buildStatusConfig", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectSecondarySourcesBuildStatusConfig.class));
            this.gitCloneDepth = software.amazon.jsii.Kernel.get(this, "gitCloneDepth", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.gitSubmodulesConfig = software.amazon.jsii.Kernel.get(this, "gitSubmodulesConfig", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildProjectSecondarySourcesGitSubmodulesConfig.class));
            this.insecureSsl = software.amazon.jsii.Kernel.get(this, "insecureSsl", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.location = software.amazon.jsii.Kernel.get(this, "location", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.reportBuildStatus = software.amazon.jsii.Kernel.get(this, "reportBuildStatus", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.sourceIdentifier = java.util.Objects.requireNonNull(builder.sourceIdentifier, "sourceIdentifier is required");
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.auth = builder.auth;
            this.buildspec = builder.buildspec;
            this.buildStatusConfig = builder.buildStatusConfig;
            this.gitCloneDepth = builder.gitCloneDepth;
            this.gitSubmodulesConfig = builder.gitSubmodulesConfig;
            this.insecureSsl = builder.insecureSsl;
            this.location = builder.location;
            this.reportBuildStatus = builder.reportBuildStatus;
        }

        @Override
        public final java.lang.String getSourceIdentifier() {
            return this.sourceIdentifier;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final imports.aws.codebuild.CodebuildProjectSecondarySourcesAuth getAuth() {
            return this.auth;
        }

        @Override
        public final java.lang.String getBuildspec() {
            return this.buildspec;
        }

        @Override
        public final imports.aws.codebuild.CodebuildProjectSecondarySourcesBuildStatusConfig getBuildStatusConfig() {
            return this.buildStatusConfig;
        }

        @Override
        public final java.lang.Number getGitCloneDepth() {
            return this.gitCloneDepth;
        }

        @Override
        public final imports.aws.codebuild.CodebuildProjectSecondarySourcesGitSubmodulesConfig getGitSubmodulesConfig() {
            return this.gitSubmodulesConfig;
        }

        @Override
        public final java.lang.Object getInsecureSsl() {
            return this.insecureSsl;
        }

        @Override
        public final java.lang.String getLocation() {
            return this.location;
        }

        @Override
        public final java.lang.Object getReportBuildStatus() {
            return this.reportBuildStatus;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("sourceIdentifier", om.valueToTree(this.getSourceIdentifier()));
            data.set("type", om.valueToTree(this.getType()));
            if (this.getAuth() != null) {
                data.set("auth", om.valueToTree(this.getAuth()));
            }
            if (this.getBuildspec() != null) {
                data.set("buildspec", om.valueToTree(this.getBuildspec()));
            }
            if (this.getBuildStatusConfig() != null) {
                data.set("buildStatusConfig", om.valueToTree(this.getBuildStatusConfig()));
            }
            if (this.getGitCloneDepth() != null) {
                data.set("gitCloneDepth", om.valueToTree(this.getGitCloneDepth()));
            }
            if (this.getGitSubmodulesConfig() != null) {
                data.set("gitSubmodulesConfig", om.valueToTree(this.getGitSubmodulesConfig()));
            }
            if (this.getInsecureSsl() != null) {
                data.set("insecureSsl", om.valueToTree(this.getInsecureSsl()));
            }
            if (this.getLocation() != null) {
                data.set("location", om.valueToTree(this.getLocation()));
            }
            if (this.getReportBuildStatus() != null) {
                data.set("reportBuildStatus", om.valueToTree(this.getReportBuildStatus()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.codebuild.CodebuildProjectSecondarySources"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodebuildProjectSecondarySources.Jsii$Proxy that = (CodebuildProjectSecondarySources.Jsii$Proxy) o;

            if (!sourceIdentifier.equals(that.sourceIdentifier)) return false;
            if (!type.equals(that.type)) return false;
            if (this.auth != null ? !this.auth.equals(that.auth) : that.auth != null) return false;
            if (this.buildspec != null ? !this.buildspec.equals(that.buildspec) : that.buildspec != null) return false;
            if (this.buildStatusConfig != null ? !this.buildStatusConfig.equals(that.buildStatusConfig) : that.buildStatusConfig != null) return false;
            if (this.gitCloneDepth != null ? !this.gitCloneDepth.equals(that.gitCloneDepth) : that.gitCloneDepth != null) return false;
            if (this.gitSubmodulesConfig != null ? !this.gitSubmodulesConfig.equals(that.gitSubmodulesConfig) : that.gitSubmodulesConfig != null) return false;
            if (this.insecureSsl != null ? !this.insecureSsl.equals(that.insecureSsl) : that.insecureSsl != null) return false;
            if (this.location != null ? !this.location.equals(that.location) : that.location != null) return false;
            return this.reportBuildStatus != null ? this.reportBuildStatus.equals(that.reportBuildStatus) : that.reportBuildStatus == null;
        }

        @Override
        public final int hashCode() {
            int result = this.sourceIdentifier.hashCode();
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.auth != null ? this.auth.hashCode() : 0);
            result = 31 * result + (this.buildspec != null ? this.buildspec.hashCode() : 0);
            result = 31 * result + (this.buildStatusConfig != null ? this.buildStatusConfig.hashCode() : 0);
            result = 31 * result + (this.gitCloneDepth != null ? this.gitCloneDepth.hashCode() : 0);
            result = 31 * result + (this.gitSubmodulesConfig != null ? this.gitSubmodulesConfig.hashCode() : 0);
            result = 31 * result + (this.insecureSsl != null ? this.insecureSsl.hashCode() : 0);
            result = 31 * result + (this.location != null ? this.location.hashCode() : 0);
            result = 31 * result + (this.reportBuildStatus != null ? this.reportBuildStatus.hashCode() : 0);
            return result;
        }
    }
}
