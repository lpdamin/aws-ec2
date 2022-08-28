package imports.aws.amplify;

/**
 * AWS Amplify.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.048Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.amplify.AmplifyBackendEnvironmentConfig")
@software.amazon.jsii.Jsii.Proxy(AmplifyBackendEnvironmentConfig.Jsii$Proxy.class)
public interface AmplifyBackendEnvironmentConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment#app_id AmplifyBackendEnvironment#app_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAppId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment#environment_name AmplifyBackendEnvironment#environment_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getEnvironmentName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment#deployment_artifacts AmplifyBackendEnvironment#deployment_artifacts}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDeploymentArtifacts() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment#id AmplifyBackendEnvironment#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment#stack_name AmplifyBackendEnvironment#stack_name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStackName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AmplifyBackendEnvironmentConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AmplifyBackendEnvironmentConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AmplifyBackendEnvironmentConfig> {
        java.lang.String appId;
        java.lang.String environmentName;
        java.lang.String deploymentArtifacts;
        java.lang.String id;
        java.lang.String stackName;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link AmplifyBackendEnvironmentConfig#getAppId}
         * @param appId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment#app_id AmplifyBackendEnvironment#app_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder appId(java.lang.String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * Sets the value of {@link AmplifyBackendEnvironmentConfig#getEnvironmentName}
         * @param environmentName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment#environment_name AmplifyBackendEnvironment#environment_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder environmentName(java.lang.String environmentName) {
            this.environmentName = environmentName;
            return this;
        }

        /**
         * Sets the value of {@link AmplifyBackendEnvironmentConfig#getDeploymentArtifacts}
         * @param deploymentArtifacts Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment#deployment_artifacts AmplifyBackendEnvironment#deployment_artifacts}.
         * @return {@code this}
         */
        public Builder deploymentArtifacts(java.lang.String deploymentArtifacts) {
            this.deploymentArtifacts = deploymentArtifacts;
            return this;
        }

        /**
         * Sets the value of {@link AmplifyBackendEnvironmentConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment#id AmplifyBackendEnvironment#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link AmplifyBackendEnvironmentConfig#getStackName}
         * @param stackName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/amplify_backend_environment#stack_name AmplifyBackendEnvironment#stack_name}.
         * @return {@code this}
         */
        public Builder stackName(java.lang.String stackName) {
            this.stackName = stackName;
            return this;
        }

        /**
         * Sets the value of {@link AmplifyBackendEnvironmentConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link AmplifyBackendEnvironmentConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link AmplifyBackendEnvironmentConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link AmplifyBackendEnvironmentConfig#getDependsOn}
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
         * Sets the value of {@link AmplifyBackendEnvironmentConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link AmplifyBackendEnvironmentConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link AmplifyBackendEnvironmentConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link AmplifyBackendEnvironmentConfig#getProvisioners}
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
         * @return a new instance of {@link AmplifyBackendEnvironmentConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AmplifyBackendEnvironmentConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AmplifyBackendEnvironmentConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AmplifyBackendEnvironmentConfig {
        private final java.lang.String appId;
        private final java.lang.String environmentName;
        private final java.lang.String deploymentArtifacts;
        private final java.lang.String id;
        private final java.lang.String stackName;
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
            this.appId = software.amazon.jsii.Kernel.get(this, "appId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.environmentName = software.amazon.jsii.Kernel.get(this, "environmentName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.deploymentArtifacts = software.amazon.jsii.Kernel.get(this, "deploymentArtifacts", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.stackName = software.amazon.jsii.Kernel.get(this, "stackName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
            this.appId = java.util.Objects.requireNonNull(builder.appId, "appId is required");
            this.environmentName = java.util.Objects.requireNonNull(builder.environmentName, "environmentName is required");
            this.deploymentArtifacts = builder.deploymentArtifacts;
            this.id = builder.id;
            this.stackName = builder.stackName;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getAppId() {
            return this.appId;
        }

        @Override
        public final java.lang.String getEnvironmentName() {
            return this.environmentName;
        }

        @Override
        public final java.lang.String getDeploymentArtifacts() {
            return this.deploymentArtifacts;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getStackName() {
            return this.stackName;
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

            data.set("appId", om.valueToTree(this.getAppId()));
            data.set("environmentName", om.valueToTree(this.getEnvironmentName()));
            if (this.getDeploymentArtifacts() != null) {
                data.set("deploymentArtifacts", om.valueToTree(this.getDeploymentArtifacts()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getStackName() != null) {
                data.set("stackName", om.valueToTree(this.getStackName()));
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.amplify.AmplifyBackendEnvironmentConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AmplifyBackendEnvironmentConfig.Jsii$Proxy that = (AmplifyBackendEnvironmentConfig.Jsii$Proxy) o;

            if (!appId.equals(that.appId)) return false;
            if (!environmentName.equals(that.environmentName)) return false;
            if (this.deploymentArtifacts != null ? !this.deploymentArtifacts.equals(that.deploymentArtifacts) : that.deploymentArtifacts != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.stackName != null ? !this.stackName.equals(that.stackName) : that.stackName != null) return false;
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
            int result = this.appId.hashCode();
            result = 31 * result + (this.environmentName.hashCode());
            result = 31 * result + (this.deploymentArtifacts != null ? this.deploymentArtifacts.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.stackName != null ? this.stackName.hashCode() : 0);
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
