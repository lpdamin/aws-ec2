package imports.aws.ses;

/**
 * AWS Simple Email Service.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.696Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ses.SesEventDestinationConfig")
@software.amazon.jsii.Jsii.Proxy(SesEventDestinationConfig.Jsii$Proxy.class)
public interface SesEventDestinationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#configuration_set_name SesEventDestination#configuration_set_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getConfigurationSetName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#matching_types SesEventDestination#matching_types}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getMatchingTypes();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#name SesEventDestination#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * cloudwatch_destination block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#cloudwatch_destination SesEventDestination#cloudwatch_destination}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getCloudwatchDestination() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#enabled SesEventDestination#enabled}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEnabled() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#id SesEventDestination#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * kinesis_destination block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#kinesis_destination SesEventDestination#kinesis_destination}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.ses.SesEventDestinationKinesisDestination getKinesisDestination() {
        return null;
    }

    /**
     * sns_destination block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#sns_destination SesEventDestination#sns_destination}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.ses.SesEventDestinationSnsDestination getSnsDestination() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SesEventDestinationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SesEventDestinationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SesEventDestinationConfig> {
        java.lang.String configurationSetName;
        java.util.List<java.lang.String> matchingTypes;
        java.lang.String name;
        java.lang.Object cloudwatchDestination;
        java.lang.Object enabled;
        java.lang.String id;
        imports.aws.ses.SesEventDestinationKinesisDestination kinesisDestination;
        imports.aws.ses.SesEventDestinationSnsDestination snsDestination;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link SesEventDestinationConfig#getConfigurationSetName}
         * @param configurationSetName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#configuration_set_name SesEventDestination#configuration_set_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder configurationSetName(java.lang.String configurationSetName) {
            this.configurationSetName = configurationSetName;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getMatchingTypes}
         * @param matchingTypes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#matching_types SesEventDestination#matching_types}. This parameter is required.
         * @return {@code this}
         */
        public Builder matchingTypes(java.util.List<java.lang.String> matchingTypes) {
            this.matchingTypes = matchingTypes;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#name SesEventDestination#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getCloudwatchDestination}
         * @param cloudwatchDestination cloudwatch_destination block.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#cloudwatch_destination SesEventDestination#cloudwatch_destination}
         * @return {@code this}
         */
        public Builder cloudwatchDestination(com.hashicorp.cdktf.IResolvable cloudwatchDestination) {
            this.cloudwatchDestination = cloudwatchDestination;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getCloudwatchDestination}
         * @param cloudwatchDestination cloudwatch_destination block.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#cloudwatch_destination SesEventDestination#cloudwatch_destination}
         * @return {@code this}
         */
        public Builder cloudwatchDestination(java.util.List<? extends imports.aws.ses.SesEventDestinationCloudwatchDestination> cloudwatchDestination) {
            this.cloudwatchDestination = cloudwatchDestination;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#enabled SesEventDestination#enabled}.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#enabled SesEventDestination#enabled}.
         * @return {@code this}
         */
        public Builder enabled(com.hashicorp.cdktf.IResolvable enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#id SesEventDestination#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getKinesisDestination}
         * @param kinesisDestination kinesis_destination block.
         *                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#kinesis_destination SesEventDestination#kinesis_destination}
         * @return {@code this}
         */
        public Builder kinesisDestination(imports.aws.ses.SesEventDestinationKinesisDestination kinesisDestination) {
            this.kinesisDestination = kinesisDestination;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getSnsDestination}
         * @param snsDestination sns_destination block.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ses_event_destination#sns_destination SesEventDestination#sns_destination}
         * @return {@code this}
         */
        public Builder snsDestination(imports.aws.ses.SesEventDestinationSnsDestination snsDestination) {
            this.snsDestination = snsDestination;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getDependsOn}
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
         * Sets the value of {@link SesEventDestinationConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link SesEventDestinationConfig#getProvisioners}
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
         * @return a new instance of {@link SesEventDestinationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SesEventDestinationConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SesEventDestinationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SesEventDestinationConfig {
        private final java.lang.String configurationSetName;
        private final java.util.List<java.lang.String> matchingTypes;
        private final java.lang.String name;
        private final java.lang.Object cloudwatchDestination;
        private final java.lang.Object enabled;
        private final java.lang.String id;
        private final imports.aws.ses.SesEventDestinationKinesisDestination kinesisDestination;
        private final imports.aws.ses.SesEventDestinationSnsDestination snsDestination;
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
            this.configurationSetName = software.amazon.jsii.Kernel.get(this, "configurationSetName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.matchingTypes = software.amazon.jsii.Kernel.get(this, "matchingTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cloudwatchDestination = software.amazon.jsii.Kernel.get(this, "cloudwatchDestination", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kinesisDestination = software.amazon.jsii.Kernel.get(this, "kinesisDestination", software.amazon.jsii.NativeType.forClass(imports.aws.ses.SesEventDestinationKinesisDestination.class));
            this.snsDestination = software.amazon.jsii.Kernel.get(this, "snsDestination", software.amazon.jsii.NativeType.forClass(imports.aws.ses.SesEventDestinationSnsDestination.class));
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
            this.configurationSetName = java.util.Objects.requireNonNull(builder.configurationSetName, "configurationSetName is required");
            this.matchingTypes = java.util.Objects.requireNonNull(builder.matchingTypes, "matchingTypes is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.cloudwatchDestination = builder.cloudwatchDestination;
            this.enabled = builder.enabled;
            this.id = builder.id;
            this.kinesisDestination = builder.kinesisDestination;
            this.snsDestination = builder.snsDestination;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getConfigurationSetName() {
            return this.configurationSetName;
        }

        @Override
        public final java.util.List<java.lang.String> getMatchingTypes() {
            return this.matchingTypes;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.Object getCloudwatchDestination() {
            return this.cloudwatchDestination;
        }

        @Override
        public final java.lang.Object getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final imports.aws.ses.SesEventDestinationKinesisDestination getKinesisDestination() {
            return this.kinesisDestination;
        }

        @Override
        public final imports.aws.ses.SesEventDestinationSnsDestination getSnsDestination() {
            return this.snsDestination;
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

            data.set("configurationSetName", om.valueToTree(this.getConfigurationSetName()));
            data.set("matchingTypes", om.valueToTree(this.getMatchingTypes()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getCloudwatchDestination() != null) {
                data.set("cloudwatchDestination", om.valueToTree(this.getCloudwatchDestination()));
            }
            if (this.getEnabled() != null) {
                data.set("enabled", om.valueToTree(this.getEnabled()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getKinesisDestination() != null) {
                data.set("kinesisDestination", om.valueToTree(this.getKinesisDestination()));
            }
            if (this.getSnsDestination() != null) {
                data.set("snsDestination", om.valueToTree(this.getSnsDestination()));
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.ses.SesEventDestinationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SesEventDestinationConfig.Jsii$Proxy that = (SesEventDestinationConfig.Jsii$Proxy) o;

            if (!configurationSetName.equals(that.configurationSetName)) return false;
            if (!matchingTypes.equals(that.matchingTypes)) return false;
            if (!name.equals(that.name)) return false;
            if (this.cloudwatchDestination != null ? !this.cloudwatchDestination.equals(that.cloudwatchDestination) : that.cloudwatchDestination != null) return false;
            if (this.enabled != null ? !this.enabled.equals(that.enabled) : that.enabled != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.kinesisDestination != null ? !this.kinesisDestination.equals(that.kinesisDestination) : that.kinesisDestination != null) return false;
            if (this.snsDestination != null ? !this.snsDestination.equals(that.snsDestination) : that.snsDestination != null) return false;
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
            int result = this.configurationSetName.hashCode();
            result = 31 * result + (this.matchingTypes.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.cloudwatchDestination != null ? this.cloudwatchDestination.hashCode() : 0);
            result = 31 * result + (this.enabled != null ? this.enabled.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.kinesisDestination != null ? this.kinesisDestination.hashCode() : 0);
            result = 31 * result + (this.snsDestination != null ? this.snsDestination.hashCode() : 0);
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
