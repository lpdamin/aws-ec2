package imports.aws.kms;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.675Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.kms.DataAwsKmsSecretsSecret")
@software.amazon.jsii.Jsii.Proxy(DataAwsKmsSecretsSecret.Jsii$Proxy.class)
public interface DataAwsKmsSecretsSecret extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/kms_secrets#name DataAwsKmsSecrets#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/kms_secrets#payload DataAwsKmsSecrets#payload}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPayload();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/kms_secrets#context DataAwsKmsSecrets#context}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getContext() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/kms_secrets#grant_tokens DataAwsKmsSecrets#grant_tokens}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getGrantTokens() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsKmsSecretsSecret}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsKmsSecretsSecret}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsKmsSecretsSecret> {
        java.lang.String name;
        java.lang.String payload;
        java.util.Map<java.lang.String, java.lang.String> context;
        java.util.List<java.lang.String> grantTokens;

        /**
         * Sets the value of {@link DataAwsKmsSecretsSecret#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/kms_secrets#name DataAwsKmsSecrets#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsKmsSecretsSecret#getPayload}
         * @param payload Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/kms_secrets#payload DataAwsKmsSecrets#payload}. This parameter is required.
         * @return {@code this}
         */
        public Builder payload(java.lang.String payload) {
            this.payload = payload;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsKmsSecretsSecret#getContext}
         * @param context Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/kms_secrets#context DataAwsKmsSecrets#context}.
         * @return {@code this}
         */
        public Builder context(java.util.Map<java.lang.String, java.lang.String> context) {
            this.context = context;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsKmsSecretsSecret#getGrantTokens}
         * @param grantTokens Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/kms_secrets#grant_tokens DataAwsKmsSecrets#grant_tokens}.
         * @return {@code this}
         */
        public Builder grantTokens(java.util.List<java.lang.String> grantTokens) {
            this.grantTokens = grantTokens;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsKmsSecretsSecret}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsKmsSecretsSecret build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataAwsKmsSecretsSecret}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsKmsSecretsSecret {
        private final java.lang.String name;
        private final java.lang.String payload;
        private final java.util.Map<java.lang.String, java.lang.String> context;
        private final java.util.List<java.lang.String> grantTokens;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.payload = software.amazon.jsii.Kernel.get(this, "payload", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.context = software.amazon.jsii.Kernel.get(this, "context", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.grantTokens = software.amazon.jsii.Kernel.get(this, "grantTokens", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.payload = java.util.Objects.requireNonNull(builder.payload, "payload is required");
            this.context = builder.context;
            this.grantTokens = builder.grantTokens;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getPayload() {
            return this.payload;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getContext() {
            return this.context;
        }

        @Override
        public final java.util.List<java.lang.String> getGrantTokens() {
            return this.grantTokens;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("payload", om.valueToTree(this.getPayload()));
            if (this.getContext() != null) {
                data.set("context", om.valueToTree(this.getContext()));
            }
            if (this.getGrantTokens() != null) {
                data.set("grantTokens", om.valueToTree(this.getGrantTokens()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.kms.DataAwsKmsSecretsSecret"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsKmsSecretsSecret.Jsii$Proxy that = (DataAwsKmsSecretsSecret.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!payload.equals(that.payload)) return false;
            if (this.context != null ? !this.context.equals(that.context) : that.context != null) return false;
            return this.grantTokens != null ? this.grantTokens.equals(that.grantTokens) : that.grantTokens == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.payload.hashCode());
            result = 31 * result + (this.context != null ? this.context.hashCode() : 0);
            result = 31 * result + (this.grantTokens != null ? this.grantTokens.hashCode() : 0);
            return result;
        }
    }
}
