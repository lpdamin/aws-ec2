package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:46.996Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowFlowDestinationFlowConfigDestinationConnectorProperties")
@software.amazon.jsii.Jsii.Proxy(AppflowFlowDestinationFlowConfigDestinationConnectorProperties.Jsii$Proxy.class)
public interface AppflowFlowDestinationFlowConfigDestinationConnectorProperties extends software.amazon.jsii.JsiiSerializable {

    /**
     * custom_connector block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#custom_connector AppflowFlow#custom_connector}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnector getCustomConnector() {
        return null;
    }

    /**
     * customer_profiles block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#customer_profiles AppflowFlow#customer_profiles}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomerProfiles getCustomerProfiles() {
        return null;
    }

    /**
     * event_bridge block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#event_bridge AppflowFlow#event_bridge}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesEventBridge getEventBridge() {
        return null;
    }

    /**
     * honeycode block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#honeycode AppflowFlow#honeycode}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesHoneycode getHoneycode() {
        return null;
    }

    /**
     * lookout_metrics block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#lookout_metrics AppflowFlow#lookout_metrics}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesLookoutMetrics getLookoutMetrics() {
        return null;
    }

    /**
     * marketo block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#marketo AppflowFlow#marketo}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketo getMarketo() {
        return null;
    }

    /**
     * redshift block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#redshift AppflowFlow#redshift}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesRedshift getRedshift() {
        return null;
    }

    /**
     * s3 block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#s3 AppflowFlow#s3}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3 getS3() {
        return null;
    }

    /**
     * salesforce block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#salesforce AppflowFlow#salesforce}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSalesforce getSalesforce() {
        return null;
    }

    /**
     * sapo_data block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#sapo_data AppflowFlow#sapo_data}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoData getSapoData() {
        return null;
    }

    /**
     * snowflake block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#snowflake AppflowFlow#snowflake}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSnowflake getSnowflake() {
        return null;
    }

    /**
     * upsolver block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#upsolver AppflowFlow#upsolver}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesUpsolver getUpsolver() {
        return null;
    }

    /**
     * zendesk block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#zendesk AppflowFlow#zendesk}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesZendesk getZendesk() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppflowFlowDestinationFlowConfigDestinationConnectorProperties}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppflowFlowDestinationFlowConfigDestinationConnectorProperties}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppflowFlowDestinationFlowConfigDestinationConnectorProperties> {
        imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnector customConnector;
        imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomerProfiles customerProfiles;
        imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesEventBridge eventBridge;
        imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesHoneycode honeycode;
        imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesLookoutMetrics lookoutMetrics;
        imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketo marketo;
        imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesRedshift redshift;
        imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3 s3;
        imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSalesforce salesforce;
        imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoData sapoData;
        imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSnowflake snowflake;
        imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesUpsolver upsolver;
        imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesZendesk zendesk;

        /**
         * Sets the value of {@link AppflowFlowDestinationFlowConfigDestinationConnectorProperties#getCustomConnector}
         * @param customConnector custom_connector block.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#custom_connector AppflowFlow#custom_connector}
         * @return {@code this}
         */
        public Builder customConnector(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnector customConnector) {
            this.customConnector = customConnector;
            return this;
        }

        /**
         * Sets the value of {@link AppflowFlowDestinationFlowConfigDestinationConnectorProperties#getCustomerProfiles}
         * @param customerProfiles customer_profiles block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#customer_profiles AppflowFlow#customer_profiles}
         * @return {@code this}
         */
        public Builder customerProfiles(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomerProfiles customerProfiles) {
            this.customerProfiles = customerProfiles;
            return this;
        }

        /**
         * Sets the value of {@link AppflowFlowDestinationFlowConfigDestinationConnectorProperties#getEventBridge}
         * @param eventBridge event_bridge block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#event_bridge AppflowFlow#event_bridge}
         * @return {@code this}
         */
        public Builder eventBridge(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesEventBridge eventBridge) {
            this.eventBridge = eventBridge;
            return this;
        }

        /**
         * Sets the value of {@link AppflowFlowDestinationFlowConfigDestinationConnectorProperties#getHoneycode}
         * @param honeycode honeycode block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#honeycode AppflowFlow#honeycode}
         * @return {@code this}
         */
        public Builder honeycode(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesHoneycode honeycode) {
            this.honeycode = honeycode;
            return this;
        }

        /**
         * Sets the value of {@link AppflowFlowDestinationFlowConfigDestinationConnectorProperties#getLookoutMetrics}
         * @param lookoutMetrics lookout_metrics block.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#lookout_metrics AppflowFlow#lookout_metrics}
         * @return {@code this}
         */
        public Builder lookoutMetrics(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesLookoutMetrics lookoutMetrics) {
            this.lookoutMetrics = lookoutMetrics;
            return this;
        }

        /**
         * Sets the value of {@link AppflowFlowDestinationFlowConfigDestinationConnectorProperties#getMarketo}
         * @param marketo marketo block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#marketo AppflowFlow#marketo}
         * @return {@code this}
         */
        public Builder marketo(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketo marketo) {
            this.marketo = marketo;
            return this;
        }

        /**
         * Sets the value of {@link AppflowFlowDestinationFlowConfigDestinationConnectorProperties#getRedshift}
         * @param redshift redshift block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#redshift AppflowFlow#redshift}
         * @return {@code this}
         */
        public Builder redshift(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesRedshift redshift) {
            this.redshift = redshift;
            return this;
        }

        /**
         * Sets the value of {@link AppflowFlowDestinationFlowConfigDestinationConnectorProperties#getS3}
         * @param s3 s3 block.
         *           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#s3 AppflowFlow#s3}
         * @return {@code this}
         */
        public Builder s3(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3 s3) {
            this.s3 = s3;
            return this;
        }

        /**
         * Sets the value of {@link AppflowFlowDestinationFlowConfigDestinationConnectorProperties#getSalesforce}
         * @param salesforce salesforce block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#salesforce AppflowFlow#salesforce}
         * @return {@code this}
         */
        public Builder salesforce(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSalesforce salesforce) {
            this.salesforce = salesforce;
            return this;
        }

        /**
         * Sets the value of {@link AppflowFlowDestinationFlowConfigDestinationConnectorProperties#getSapoData}
         * @param sapoData sapo_data block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#sapo_data AppflowFlow#sapo_data}
         * @return {@code this}
         */
        public Builder sapoData(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoData sapoData) {
            this.sapoData = sapoData;
            return this;
        }

        /**
         * Sets the value of {@link AppflowFlowDestinationFlowConfigDestinationConnectorProperties#getSnowflake}
         * @param snowflake snowflake block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#snowflake AppflowFlow#snowflake}
         * @return {@code this}
         */
        public Builder snowflake(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSnowflake snowflake) {
            this.snowflake = snowflake;
            return this;
        }

        /**
         * Sets the value of {@link AppflowFlowDestinationFlowConfigDestinationConnectorProperties#getUpsolver}
         * @param upsolver upsolver block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#upsolver AppflowFlow#upsolver}
         * @return {@code this}
         */
        public Builder upsolver(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesUpsolver upsolver) {
            this.upsolver = upsolver;
            return this;
        }

        /**
         * Sets the value of {@link AppflowFlowDestinationFlowConfigDestinationConnectorProperties#getZendesk}
         * @param zendesk zendesk block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appflow_flow#zendesk AppflowFlow#zendesk}
         * @return {@code this}
         */
        public Builder zendesk(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesZendesk zendesk) {
            this.zendesk = zendesk;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppflowFlowDestinationFlowConfigDestinationConnectorProperties}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppflowFlowDestinationFlowConfigDestinationConnectorProperties build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppflowFlowDestinationFlowConfigDestinationConnectorProperties}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppflowFlowDestinationFlowConfigDestinationConnectorProperties {
        private final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnector customConnector;
        private final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomerProfiles customerProfiles;
        private final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesEventBridge eventBridge;
        private final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesHoneycode honeycode;
        private final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesLookoutMetrics lookoutMetrics;
        private final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketo marketo;
        private final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesRedshift redshift;
        private final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3 s3;
        private final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSalesforce salesforce;
        private final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoData sapoData;
        private final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSnowflake snowflake;
        private final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesUpsolver upsolver;
        private final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesZendesk zendesk;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.customConnector = software.amazon.jsii.Kernel.get(this, "customConnector", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnector.class));
            this.customerProfiles = software.amazon.jsii.Kernel.get(this, "customerProfiles", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomerProfiles.class));
            this.eventBridge = software.amazon.jsii.Kernel.get(this, "eventBridge", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesEventBridge.class));
            this.honeycode = software.amazon.jsii.Kernel.get(this, "honeycode", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesHoneycode.class));
            this.lookoutMetrics = software.amazon.jsii.Kernel.get(this, "lookoutMetrics", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesLookoutMetrics.class));
            this.marketo = software.amazon.jsii.Kernel.get(this, "marketo", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketo.class));
            this.redshift = software.amazon.jsii.Kernel.get(this, "redshift", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesRedshift.class));
            this.s3 = software.amazon.jsii.Kernel.get(this, "s3", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3.class));
            this.salesforce = software.amazon.jsii.Kernel.get(this, "salesforce", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSalesforce.class));
            this.sapoData = software.amazon.jsii.Kernel.get(this, "sapoData", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoData.class));
            this.snowflake = software.amazon.jsii.Kernel.get(this, "snowflake", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSnowflake.class));
            this.upsolver = software.amazon.jsii.Kernel.get(this, "upsolver", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesUpsolver.class));
            this.zendesk = software.amazon.jsii.Kernel.get(this, "zendesk", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesZendesk.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.customConnector = builder.customConnector;
            this.customerProfiles = builder.customerProfiles;
            this.eventBridge = builder.eventBridge;
            this.honeycode = builder.honeycode;
            this.lookoutMetrics = builder.lookoutMetrics;
            this.marketo = builder.marketo;
            this.redshift = builder.redshift;
            this.s3 = builder.s3;
            this.salesforce = builder.salesforce;
            this.sapoData = builder.sapoData;
            this.snowflake = builder.snowflake;
            this.upsolver = builder.upsolver;
            this.zendesk = builder.zendesk;
        }

        @Override
        public final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnector getCustomConnector() {
            return this.customConnector;
        }

        @Override
        public final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomerProfiles getCustomerProfiles() {
            return this.customerProfiles;
        }

        @Override
        public final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesEventBridge getEventBridge() {
            return this.eventBridge;
        }

        @Override
        public final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesHoneycode getHoneycode() {
            return this.honeycode;
        }

        @Override
        public final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesLookoutMetrics getLookoutMetrics() {
            return this.lookoutMetrics;
        }

        @Override
        public final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketo getMarketo() {
            return this.marketo;
        }

        @Override
        public final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesRedshift getRedshift() {
            return this.redshift;
        }

        @Override
        public final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3 getS3() {
            return this.s3;
        }

        @Override
        public final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSalesforce getSalesforce() {
            return this.salesforce;
        }

        @Override
        public final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoData getSapoData() {
            return this.sapoData;
        }

        @Override
        public final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSnowflake getSnowflake() {
            return this.snowflake;
        }

        @Override
        public final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesUpsolver getUpsolver() {
            return this.upsolver;
        }

        @Override
        public final imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesZendesk getZendesk() {
            return this.zendesk;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCustomConnector() != null) {
                data.set("customConnector", om.valueToTree(this.getCustomConnector()));
            }
            if (this.getCustomerProfiles() != null) {
                data.set("customerProfiles", om.valueToTree(this.getCustomerProfiles()));
            }
            if (this.getEventBridge() != null) {
                data.set("eventBridge", om.valueToTree(this.getEventBridge()));
            }
            if (this.getHoneycode() != null) {
                data.set("honeycode", om.valueToTree(this.getHoneycode()));
            }
            if (this.getLookoutMetrics() != null) {
                data.set("lookoutMetrics", om.valueToTree(this.getLookoutMetrics()));
            }
            if (this.getMarketo() != null) {
                data.set("marketo", om.valueToTree(this.getMarketo()));
            }
            if (this.getRedshift() != null) {
                data.set("redshift", om.valueToTree(this.getRedshift()));
            }
            if (this.getS3() != null) {
                data.set("s3", om.valueToTree(this.getS3()));
            }
            if (this.getSalesforce() != null) {
                data.set("salesforce", om.valueToTree(this.getSalesforce()));
            }
            if (this.getSapoData() != null) {
                data.set("sapoData", om.valueToTree(this.getSapoData()));
            }
            if (this.getSnowflake() != null) {
                data.set("snowflake", om.valueToTree(this.getSnowflake()));
            }
            if (this.getUpsolver() != null) {
                data.set("upsolver", om.valueToTree(this.getUpsolver()));
            }
            if (this.getZendesk() != null) {
                data.set("zendesk", om.valueToTree(this.getZendesk()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.AppflowFlowDestinationFlowConfigDestinationConnectorProperties"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppflowFlowDestinationFlowConfigDestinationConnectorProperties.Jsii$Proxy that = (AppflowFlowDestinationFlowConfigDestinationConnectorProperties.Jsii$Proxy) o;

            if (this.customConnector != null ? !this.customConnector.equals(that.customConnector) : that.customConnector != null) return false;
            if (this.customerProfiles != null ? !this.customerProfiles.equals(that.customerProfiles) : that.customerProfiles != null) return false;
            if (this.eventBridge != null ? !this.eventBridge.equals(that.eventBridge) : that.eventBridge != null) return false;
            if (this.honeycode != null ? !this.honeycode.equals(that.honeycode) : that.honeycode != null) return false;
            if (this.lookoutMetrics != null ? !this.lookoutMetrics.equals(that.lookoutMetrics) : that.lookoutMetrics != null) return false;
            if (this.marketo != null ? !this.marketo.equals(that.marketo) : that.marketo != null) return false;
            if (this.redshift != null ? !this.redshift.equals(that.redshift) : that.redshift != null) return false;
            if (this.s3 != null ? !this.s3.equals(that.s3) : that.s3 != null) return false;
            if (this.salesforce != null ? !this.salesforce.equals(that.salesforce) : that.salesforce != null) return false;
            if (this.sapoData != null ? !this.sapoData.equals(that.sapoData) : that.sapoData != null) return false;
            if (this.snowflake != null ? !this.snowflake.equals(that.snowflake) : that.snowflake != null) return false;
            if (this.upsolver != null ? !this.upsolver.equals(that.upsolver) : that.upsolver != null) return false;
            return this.zendesk != null ? this.zendesk.equals(that.zendesk) : that.zendesk == null;
        }

        @Override
        public final int hashCode() {
            int result = this.customConnector != null ? this.customConnector.hashCode() : 0;
            result = 31 * result + (this.customerProfiles != null ? this.customerProfiles.hashCode() : 0);
            result = 31 * result + (this.eventBridge != null ? this.eventBridge.hashCode() : 0);
            result = 31 * result + (this.honeycode != null ? this.honeycode.hashCode() : 0);
            result = 31 * result + (this.lookoutMetrics != null ? this.lookoutMetrics.hashCode() : 0);
            result = 31 * result + (this.marketo != null ? this.marketo.hashCode() : 0);
            result = 31 * result + (this.redshift != null ? this.redshift.hashCode() : 0);
            result = 31 * result + (this.s3 != null ? this.s3.hashCode() : 0);
            result = 31 * result + (this.salesforce != null ? this.salesforce.hashCode() : 0);
            result = 31 * result + (this.sapoData != null ? this.sapoData.hashCode() : 0);
            result = 31 * result + (this.snowflake != null ? this.snowflake.hashCode() : 0);
            result = 31 * result + (this.upsolver != null ? this.upsolver.hashCode() : 0);
            result = 31 * result + (this.zendesk != null ? this.zendesk.hashCode() : 0);
            return result;
        }
    }
}
