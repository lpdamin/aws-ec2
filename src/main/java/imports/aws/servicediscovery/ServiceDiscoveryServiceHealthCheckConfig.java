package imports.aws.servicediscovery;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.674Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.servicediscovery.ServiceDiscoveryServiceHealthCheckConfig")
@software.amazon.jsii.Jsii.Proxy(ServiceDiscoveryServiceHealthCheckConfig.Jsii$Proxy.class)
public interface ServiceDiscoveryServiceHealthCheckConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/service_discovery_service#failure_threshold ServiceDiscoveryService#failure_threshold}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getFailureThreshold() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/service_discovery_service#resource_path ServiceDiscoveryService#resource_path}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getResourcePath() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/service_discovery_service#type ServiceDiscoveryService#type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ServiceDiscoveryServiceHealthCheckConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ServiceDiscoveryServiceHealthCheckConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ServiceDiscoveryServiceHealthCheckConfig> {
        java.lang.Number failureThreshold;
        java.lang.String resourcePath;
        java.lang.String type;

        /**
         * Sets the value of {@link ServiceDiscoveryServiceHealthCheckConfig#getFailureThreshold}
         * @param failureThreshold Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/service_discovery_service#failure_threshold ServiceDiscoveryService#failure_threshold}.
         * @return {@code this}
         */
        public Builder failureThreshold(java.lang.Number failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * Sets the value of {@link ServiceDiscoveryServiceHealthCheckConfig#getResourcePath}
         * @param resourcePath Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/service_discovery_service#resource_path ServiceDiscoveryService#resource_path}.
         * @return {@code this}
         */
        public Builder resourcePath(java.lang.String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        /**
         * Sets the value of {@link ServiceDiscoveryServiceHealthCheckConfig#getType}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/service_discovery_service#type ServiceDiscoveryService#type}.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ServiceDiscoveryServiceHealthCheckConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ServiceDiscoveryServiceHealthCheckConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ServiceDiscoveryServiceHealthCheckConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ServiceDiscoveryServiceHealthCheckConfig {
        private final java.lang.Number failureThreshold;
        private final java.lang.String resourcePath;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.failureThreshold = software.amazon.jsii.Kernel.get(this, "failureThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.resourcePath = software.amazon.jsii.Kernel.get(this, "resourcePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.failureThreshold = builder.failureThreshold;
            this.resourcePath = builder.resourcePath;
            this.type = builder.type;
        }

        @Override
        public final java.lang.Number getFailureThreshold() {
            return this.failureThreshold;
        }

        @Override
        public final java.lang.String getResourcePath() {
            return this.resourcePath;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getFailureThreshold() != null) {
                data.set("failureThreshold", om.valueToTree(this.getFailureThreshold()));
            }
            if (this.getResourcePath() != null) {
                data.set("resourcePath", om.valueToTree(this.getResourcePath()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.servicediscovery.ServiceDiscoveryServiceHealthCheckConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ServiceDiscoveryServiceHealthCheckConfig.Jsii$Proxy that = (ServiceDiscoveryServiceHealthCheckConfig.Jsii$Proxy) o;

            if (this.failureThreshold != null ? !this.failureThreshold.equals(that.failureThreshold) : that.failureThreshold != null) return false;
            if (this.resourcePath != null ? !this.resourcePath.equals(that.resourcePath) : that.resourcePath != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public final int hashCode() {
            int result = this.failureThreshold != null ? this.failureThreshold.hashCode() : 0;
            result = 31 * result + (this.resourcePath != null ? this.resourcePath.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
