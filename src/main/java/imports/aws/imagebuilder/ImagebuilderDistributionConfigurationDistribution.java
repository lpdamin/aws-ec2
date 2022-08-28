package imports.aws.imagebuilder;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.535Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.imagebuilder.ImagebuilderDistributionConfigurationDistribution")
@software.amazon.jsii.Jsii.Proxy(ImagebuilderDistributionConfigurationDistribution.Jsii$Proxy.class)
public interface ImagebuilderDistributionConfigurationDistribution extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_distribution_configuration#region ImagebuilderDistributionConfiguration#region}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRegion();

    /**
     * ami_distribution_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/imagebuilder_distribution_configuration#ami_distribution_configuration ImagebuilderDistributionConfiguration#ami_distribution_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfiguration getAmiDistributionConfiguration() {
        return null;
    }

    /**
     * container_distribution_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/imagebuilder_distribution_configuration#container_distribution_configuration ImagebuilderDistributionConfiguration#container_distribution_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionContainerDistributionConfiguration getContainerDistributionConfiguration() {
        return null;
    }

    /**
     * fast_launch_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/imagebuilder_distribution_configuration#fast_launch_configuration ImagebuilderDistributionConfiguration#fast_launch_configuration}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getFastLaunchConfiguration() {
        return null;
    }

    /**
     * launch_template_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/imagebuilder_distribution_configuration#launch_template_configuration ImagebuilderDistributionConfiguration#launch_template_configuration}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getLaunchTemplateConfiguration() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_distribution_configuration#license_configuration_arns ImagebuilderDistributionConfiguration#license_configuration_arns}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLicenseConfigurationArns() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ImagebuilderDistributionConfigurationDistribution}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ImagebuilderDistributionConfigurationDistribution}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ImagebuilderDistributionConfigurationDistribution> {
        java.lang.String region;
        imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfiguration amiDistributionConfiguration;
        imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionContainerDistributionConfiguration containerDistributionConfiguration;
        java.lang.Object fastLaunchConfiguration;
        java.lang.Object launchTemplateConfiguration;
        java.util.List<java.lang.String> licenseConfigurationArns;

        /**
         * Sets the value of {@link ImagebuilderDistributionConfigurationDistribution#getRegion}
         * @param region Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_distribution_configuration#region ImagebuilderDistributionConfiguration#region}. This parameter is required.
         * @return {@code this}
         */
        public Builder region(java.lang.String region) {
            this.region = region;
            return this;
        }

        /**
         * Sets the value of {@link ImagebuilderDistributionConfigurationDistribution#getAmiDistributionConfiguration}
         * @param amiDistributionConfiguration ami_distribution_configuration block.
         *                                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/imagebuilder_distribution_configuration#ami_distribution_configuration ImagebuilderDistributionConfiguration#ami_distribution_configuration}
         * @return {@code this}
         */
        public Builder amiDistributionConfiguration(imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfiguration amiDistributionConfiguration) {
            this.amiDistributionConfiguration = amiDistributionConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link ImagebuilderDistributionConfigurationDistribution#getContainerDistributionConfiguration}
         * @param containerDistributionConfiguration container_distribution_configuration block.
         *                                           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/imagebuilder_distribution_configuration#container_distribution_configuration ImagebuilderDistributionConfiguration#container_distribution_configuration}
         * @return {@code this}
         */
        public Builder containerDistributionConfiguration(imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionContainerDistributionConfiguration containerDistributionConfiguration) {
            this.containerDistributionConfiguration = containerDistributionConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link ImagebuilderDistributionConfigurationDistribution#getFastLaunchConfiguration}
         * @param fastLaunchConfiguration fast_launch_configuration block.
         *                                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/imagebuilder_distribution_configuration#fast_launch_configuration ImagebuilderDistributionConfiguration#fast_launch_configuration}
         * @return {@code this}
         */
        public Builder fastLaunchConfiguration(com.hashicorp.cdktf.IResolvable fastLaunchConfiguration) {
            this.fastLaunchConfiguration = fastLaunchConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link ImagebuilderDistributionConfigurationDistribution#getFastLaunchConfiguration}
         * @param fastLaunchConfiguration fast_launch_configuration block.
         *                                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/imagebuilder_distribution_configuration#fast_launch_configuration ImagebuilderDistributionConfiguration#fast_launch_configuration}
         * @return {@code this}
         */
        public Builder fastLaunchConfiguration(java.util.List<? extends imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionFastLaunchConfiguration> fastLaunchConfiguration) {
            this.fastLaunchConfiguration = fastLaunchConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link ImagebuilderDistributionConfigurationDistribution#getLaunchTemplateConfiguration}
         * @param launchTemplateConfiguration launch_template_configuration block.
         *                                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/imagebuilder_distribution_configuration#launch_template_configuration ImagebuilderDistributionConfiguration#launch_template_configuration}
         * @return {@code this}
         */
        public Builder launchTemplateConfiguration(com.hashicorp.cdktf.IResolvable launchTemplateConfiguration) {
            this.launchTemplateConfiguration = launchTemplateConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link ImagebuilderDistributionConfigurationDistribution#getLaunchTemplateConfiguration}
         * @param launchTemplateConfiguration launch_template_configuration block.
         *                                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/imagebuilder_distribution_configuration#launch_template_configuration ImagebuilderDistributionConfiguration#launch_template_configuration}
         * @return {@code this}
         */
        public Builder launchTemplateConfiguration(java.util.List<? extends imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionLaunchTemplateConfiguration> launchTemplateConfiguration) {
            this.launchTemplateConfiguration = launchTemplateConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link ImagebuilderDistributionConfigurationDistribution#getLicenseConfigurationArns}
         * @param licenseConfigurationArns Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/imagebuilder_distribution_configuration#license_configuration_arns ImagebuilderDistributionConfiguration#license_configuration_arns}.
         * @return {@code this}
         */
        public Builder licenseConfigurationArns(java.util.List<java.lang.String> licenseConfigurationArns) {
            this.licenseConfigurationArns = licenseConfigurationArns;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ImagebuilderDistributionConfigurationDistribution}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ImagebuilderDistributionConfigurationDistribution build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ImagebuilderDistributionConfigurationDistribution}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ImagebuilderDistributionConfigurationDistribution {
        private final java.lang.String region;
        private final imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfiguration amiDistributionConfiguration;
        private final imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionContainerDistributionConfiguration containerDistributionConfiguration;
        private final java.lang.Object fastLaunchConfiguration;
        private final java.lang.Object launchTemplateConfiguration;
        private final java.util.List<java.lang.String> licenseConfigurationArns;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.region = software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.amiDistributionConfiguration = software.amazon.jsii.Kernel.get(this, "amiDistributionConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfiguration.class));
            this.containerDistributionConfiguration = software.amazon.jsii.Kernel.get(this, "containerDistributionConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionContainerDistributionConfiguration.class));
            this.fastLaunchConfiguration = software.amazon.jsii.Kernel.get(this, "fastLaunchConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.launchTemplateConfiguration = software.amazon.jsii.Kernel.get(this, "launchTemplateConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.licenseConfigurationArns = software.amazon.jsii.Kernel.get(this, "licenseConfigurationArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.region = java.util.Objects.requireNonNull(builder.region, "region is required");
            this.amiDistributionConfiguration = builder.amiDistributionConfiguration;
            this.containerDistributionConfiguration = builder.containerDistributionConfiguration;
            this.fastLaunchConfiguration = builder.fastLaunchConfiguration;
            this.launchTemplateConfiguration = builder.launchTemplateConfiguration;
            this.licenseConfigurationArns = builder.licenseConfigurationArns;
        }

        @Override
        public final java.lang.String getRegion() {
            return this.region;
        }

        @Override
        public final imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionAmiDistributionConfiguration getAmiDistributionConfiguration() {
            return this.amiDistributionConfiguration;
        }

        @Override
        public final imports.aws.imagebuilder.ImagebuilderDistributionConfigurationDistributionContainerDistributionConfiguration getContainerDistributionConfiguration() {
            return this.containerDistributionConfiguration;
        }

        @Override
        public final java.lang.Object getFastLaunchConfiguration() {
            return this.fastLaunchConfiguration;
        }

        @Override
        public final java.lang.Object getLaunchTemplateConfiguration() {
            return this.launchTemplateConfiguration;
        }

        @Override
        public final java.util.List<java.lang.String> getLicenseConfigurationArns() {
            return this.licenseConfigurationArns;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("region", om.valueToTree(this.getRegion()));
            if (this.getAmiDistributionConfiguration() != null) {
                data.set("amiDistributionConfiguration", om.valueToTree(this.getAmiDistributionConfiguration()));
            }
            if (this.getContainerDistributionConfiguration() != null) {
                data.set("containerDistributionConfiguration", om.valueToTree(this.getContainerDistributionConfiguration()));
            }
            if (this.getFastLaunchConfiguration() != null) {
                data.set("fastLaunchConfiguration", om.valueToTree(this.getFastLaunchConfiguration()));
            }
            if (this.getLaunchTemplateConfiguration() != null) {
                data.set("launchTemplateConfiguration", om.valueToTree(this.getLaunchTemplateConfiguration()));
            }
            if (this.getLicenseConfigurationArns() != null) {
                data.set("licenseConfigurationArns", om.valueToTree(this.getLicenseConfigurationArns()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.imagebuilder.ImagebuilderDistributionConfigurationDistribution"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ImagebuilderDistributionConfigurationDistribution.Jsii$Proxy that = (ImagebuilderDistributionConfigurationDistribution.Jsii$Proxy) o;

            if (!region.equals(that.region)) return false;
            if (this.amiDistributionConfiguration != null ? !this.amiDistributionConfiguration.equals(that.amiDistributionConfiguration) : that.amiDistributionConfiguration != null) return false;
            if (this.containerDistributionConfiguration != null ? !this.containerDistributionConfiguration.equals(that.containerDistributionConfiguration) : that.containerDistributionConfiguration != null) return false;
            if (this.fastLaunchConfiguration != null ? !this.fastLaunchConfiguration.equals(that.fastLaunchConfiguration) : that.fastLaunchConfiguration != null) return false;
            if (this.launchTemplateConfiguration != null ? !this.launchTemplateConfiguration.equals(that.launchTemplateConfiguration) : that.launchTemplateConfiguration != null) return false;
            return this.licenseConfigurationArns != null ? this.licenseConfigurationArns.equals(that.licenseConfigurationArns) : that.licenseConfigurationArns == null;
        }

        @Override
        public final int hashCode() {
            int result = this.region.hashCode();
            result = 31 * result + (this.amiDistributionConfiguration != null ? this.amiDistributionConfiguration.hashCode() : 0);
            result = 31 * result + (this.containerDistributionConfiguration != null ? this.containerDistributionConfiguration.hashCode() : 0);
            result = 31 * result + (this.fastLaunchConfiguration != null ? this.fastLaunchConfiguration.hashCode() : 0);
            result = 31 * result + (this.launchTemplateConfiguration != null ? this.launchTemplateConfiguration.hashCode() : 0);
            result = 31 * result + (this.licenseConfigurationArns != null ? this.licenseConfigurationArns.hashCode() : 0);
            return result;
        }
    }
}
