package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.490Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.CloudsearchDomainEndpointOptions")
@software.amazon.jsii.Jsii.Proxy(CloudsearchDomainEndpointOptions.Jsii$Proxy.class)
public interface CloudsearchDomainEndpointOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudsearch_domain#enforce_https CloudsearchDomain#enforce_https}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEnforceHttps() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudsearch_domain#tls_security_policy CloudsearchDomain#tls_security_policy}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTlsSecurityPolicy() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudsearchDomainEndpointOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudsearchDomainEndpointOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudsearchDomainEndpointOptions> {
        java.lang.Object enforceHttps;
        java.lang.String tlsSecurityPolicy;

        /**
         * Sets the value of {@link CloudsearchDomainEndpointOptions#getEnforceHttps}
         * @param enforceHttps Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudsearch_domain#enforce_https CloudsearchDomain#enforce_https}.
         * @return {@code this}
         */
        public Builder enforceHttps(java.lang.Boolean enforceHttps) {
            this.enforceHttps = enforceHttps;
            return this;
        }

        /**
         * Sets the value of {@link CloudsearchDomainEndpointOptions#getEnforceHttps}
         * @param enforceHttps Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudsearch_domain#enforce_https CloudsearchDomain#enforce_https}.
         * @return {@code this}
         */
        public Builder enforceHttps(com.hashicorp.cdktf.IResolvable enforceHttps) {
            this.enforceHttps = enforceHttps;
            return this;
        }

        /**
         * Sets the value of {@link CloudsearchDomainEndpointOptions#getTlsSecurityPolicy}
         * @param tlsSecurityPolicy Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudsearch_domain#tls_security_policy CloudsearchDomain#tls_security_policy}.
         * @return {@code this}
         */
        public Builder tlsSecurityPolicy(java.lang.String tlsSecurityPolicy) {
            this.tlsSecurityPolicy = tlsSecurityPolicy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudsearchDomainEndpointOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudsearchDomainEndpointOptions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudsearchDomainEndpointOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudsearchDomainEndpointOptions {
        private final java.lang.Object enforceHttps;
        private final java.lang.String tlsSecurityPolicy;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.enforceHttps = software.amazon.jsii.Kernel.get(this, "enforceHttps", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.tlsSecurityPolicy = software.amazon.jsii.Kernel.get(this, "tlsSecurityPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.enforceHttps = builder.enforceHttps;
            this.tlsSecurityPolicy = builder.tlsSecurityPolicy;
        }

        @Override
        public final java.lang.Object getEnforceHttps() {
            return this.enforceHttps;
        }

        @Override
        public final java.lang.String getTlsSecurityPolicy() {
            return this.tlsSecurityPolicy;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEnforceHttps() != null) {
                data.set("enforceHttps", om.valueToTree(this.getEnforceHttps()));
            }
            if (this.getTlsSecurityPolicy() != null) {
                data.set("tlsSecurityPolicy", om.valueToTree(this.getTlsSecurityPolicy()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.CloudsearchDomainEndpointOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudsearchDomainEndpointOptions.Jsii$Proxy that = (CloudsearchDomainEndpointOptions.Jsii$Proxy) o;

            if (this.enforceHttps != null ? !this.enforceHttps.equals(that.enforceHttps) : that.enforceHttps != null) return false;
            return this.tlsSecurityPolicy != null ? this.tlsSecurityPolicy.equals(that.tlsSecurityPolicy) : that.tlsSecurityPolicy == null;
        }

        @Override
        public final int hashCode() {
            int result = this.enforceHttps != null ? this.enforceHttps.hashCode() : 0;
            result = 31 * result + (this.tlsSecurityPolicy != null ? this.tlsSecurityPolicy.hashCode() : 0);
            return result;
        }
    }
}
