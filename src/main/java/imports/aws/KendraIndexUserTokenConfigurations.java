package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.786Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.KendraIndexUserTokenConfigurations")
@software.amazon.jsii.Jsii.Proxy(KendraIndexUserTokenConfigurations.Jsii$Proxy.class)
public interface KendraIndexUserTokenConfigurations extends software.amazon.jsii.JsiiSerializable {

    /**
     * json_token_type_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kendra_index#json_token_type_configuration KendraIndex#json_token_type_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.KendraIndexUserTokenConfigurationsJsonTokenTypeConfiguration getJsonTokenTypeConfiguration() {
        return null;
    }

    /**
     * jwt_token_type_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kendra_index#jwt_token_type_configuration KendraIndex#jwt_token_type_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.KendraIndexUserTokenConfigurationsJwtTokenTypeConfiguration getJwtTokenTypeConfiguration() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KendraIndexUserTokenConfigurations}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KendraIndexUserTokenConfigurations}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KendraIndexUserTokenConfigurations> {
        imports.aws.KendraIndexUserTokenConfigurationsJsonTokenTypeConfiguration jsonTokenTypeConfiguration;
        imports.aws.KendraIndexUserTokenConfigurationsJwtTokenTypeConfiguration jwtTokenTypeConfiguration;

        /**
         * Sets the value of {@link KendraIndexUserTokenConfigurations#getJsonTokenTypeConfiguration}
         * @param jsonTokenTypeConfiguration json_token_type_configuration block.
         *                                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kendra_index#json_token_type_configuration KendraIndex#json_token_type_configuration}
         * @return {@code this}
         */
        public Builder jsonTokenTypeConfiguration(imports.aws.KendraIndexUserTokenConfigurationsJsonTokenTypeConfiguration jsonTokenTypeConfiguration) {
            this.jsonTokenTypeConfiguration = jsonTokenTypeConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link KendraIndexUserTokenConfigurations#getJwtTokenTypeConfiguration}
         * @param jwtTokenTypeConfiguration jwt_token_type_configuration block.
         *                                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kendra_index#jwt_token_type_configuration KendraIndex#jwt_token_type_configuration}
         * @return {@code this}
         */
        public Builder jwtTokenTypeConfiguration(imports.aws.KendraIndexUserTokenConfigurationsJwtTokenTypeConfiguration jwtTokenTypeConfiguration) {
            this.jwtTokenTypeConfiguration = jwtTokenTypeConfiguration;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KendraIndexUserTokenConfigurations}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KendraIndexUserTokenConfigurations build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KendraIndexUserTokenConfigurations}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KendraIndexUserTokenConfigurations {
        private final imports.aws.KendraIndexUserTokenConfigurationsJsonTokenTypeConfiguration jsonTokenTypeConfiguration;
        private final imports.aws.KendraIndexUserTokenConfigurationsJwtTokenTypeConfiguration jwtTokenTypeConfiguration;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.jsonTokenTypeConfiguration = software.amazon.jsii.Kernel.get(this, "jsonTokenTypeConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.KendraIndexUserTokenConfigurationsJsonTokenTypeConfiguration.class));
            this.jwtTokenTypeConfiguration = software.amazon.jsii.Kernel.get(this, "jwtTokenTypeConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.KendraIndexUserTokenConfigurationsJwtTokenTypeConfiguration.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.jsonTokenTypeConfiguration = builder.jsonTokenTypeConfiguration;
            this.jwtTokenTypeConfiguration = builder.jwtTokenTypeConfiguration;
        }

        @Override
        public final imports.aws.KendraIndexUserTokenConfigurationsJsonTokenTypeConfiguration getJsonTokenTypeConfiguration() {
            return this.jsonTokenTypeConfiguration;
        }

        @Override
        public final imports.aws.KendraIndexUserTokenConfigurationsJwtTokenTypeConfiguration getJwtTokenTypeConfiguration() {
            return this.jwtTokenTypeConfiguration;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getJsonTokenTypeConfiguration() != null) {
                data.set("jsonTokenTypeConfiguration", om.valueToTree(this.getJsonTokenTypeConfiguration()));
            }
            if (this.getJwtTokenTypeConfiguration() != null) {
                data.set("jwtTokenTypeConfiguration", om.valueToTree(this.getJwtTokenTypeConfiguration()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.KendraIndexUserTokenConfigurations"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KendraIndexUserTokenConfigurations.Jsii$Proxy that = (KendraIndexUserTokenConfigurations.Jsii$Proxy) o;

            if (this.jsonTokenTypeConfiguration != null ? !this.jsonTokenTypeConfiguration.equals(that.jsonTokenTypeConfiguration) : that.jsonTokenTypeConfiguration != null) return false;
            return this.jwtTokenTypeConfiguration != null ? this.jwtTokenTypeConfiguration.equals(that.jwtTokenTypeConfiguration) : that.jwtTokenTypeConfiguration == null;
        }

        @Override
        public final int hashCode() {
            int result = this.jsonTokenTypeConfiguration != null ? this.jsonTokenTypeConfiguration.hashCode() : 0;
            result = 31 * result + (this.jwtTokenTypeConfiguration != null ? this.jwtTokenTypeConfiguration.hashCode() : 0);
            return result;
        }
    }
}
