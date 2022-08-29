package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.640Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshRouteSpecHttpRouteRetryPolicy")
@software.amazon.jsii.Jsii.Proxy(AppmeshRouteSpecHttpRouteRetryPolicy.Jsii$Proxy.class)
public interface AppmeshRouteSpecHttpRouteRetryPolicy extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#max_retries AppmeshRoute#max_retries}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getMaxRetries();

    /**
     * per_retry_timeout block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_route#per_retry_timeout AppmeshRoute#per_retry_timeout}
     */
    @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshRouteSpecHttpRouteRetryPolicyPerRetryTimeout getPerRetryTimeout();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#http_retry_events AppmeshRoute#http_retry_events}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getHttpRetryEvents() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#tcp_retry_events AppmeshRoute#tcp_retry_events}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTcpRetryEvents() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshRouteSpecHttpRouteRetryPolicy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshRouteSpecHttpRouteRetryPolicy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshRouteSpecHttpRouteRetryPolicy> {
        java.lang.Number maxRetries;
        imports.aws.appmesh.AppmeshRouteSpecHttpRouteRetryPolicyPerRetryTimeout perRetryTimeout;
        java.util.List<java.lang.String> httpRetryEvents;
        java.util.List<java.lang.String> tcpRetryEvents;

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteRetryPolicy#getMaxRetries}
         * @param maxRetries Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#max_retries AppmeshRoute#max_retries}. This parameter is required.
         * @return {@code this}
         */
        public Builder maxRetries(java.lang.Number maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteRetryPolicy#getPerRetryTimeout}
         * @param perRetryTimeout per_retry_timeout block. This parameter is required.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_route#per_retry_timeout AppmeshRoute#per_retry_timeout}
         * @return {@code this}
         */
        public Builder perRetryTimeout(imports.aws.appmesh.AppmeshRouteSpecHttpRouteRetryPolicyPerRetryTimeout perRetryTimeout) {
            this.perRetryTimeout = perRetryTimeout;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteRetryPolicy#getHttpRetryEvents}
         * @param httpRetryEvents Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#http_retry_events AppmeshRoute#http_retry_events}.
         * @return {@code this}
         */
        public Builder httpRetryEvents(java.util.List<java.lang.String> httpRetryEvents) {
            this.httpRetryEvents = httpRetryEvents;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteRetryPolicy#getTcpRetryEvents}
         * @param tcpRetryEvents Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#tcp_retry_events AppmeshRoute#tcp_retry_events}.
         * @return {@code this}
         */
        public Builder tcpRetryEvents(java.util.List<java.lang.String> tcpRetryEvents) {
            this.tcpRetryEvents = tcpRetryEvents;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshRouteSpecHttpRouteRetryPolicy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshRouteSpecHttpRouteRetryPolicy build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshRouteSpecHttpRouteRetryPolicy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshRouteSpecHttpRouteRetryPolicy {
        private final java.lang.Number maxRetries;
        private final imports.aws.appmesh.AppmeshRouteSpecHttpRouteRetryPolicyPerRetryTimeout perRetryTimeout;
        private final java.util.List<java.lang.String> httpRetryEvents;
        private final java.util.List<java.lang.String> tcpRetryEvents;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxRetries = software.amazon.jsii.Kernel.get(this, "maxRetries", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.perRetryTimeout = software.amazon.jsii.Kernel.get(this, "perRetryTimeout", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshRouteSpecHttpRouteRetryPolicyPerRetryTimeout.class));
            this.httpRetryEvents = software.amazon.jsii.Kernel.get(this, "httpRetryEvents", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tcpRetryEvents = software.amazon.jsii.Kernel.get(this, "tcpRetryEvents", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxRetries = java.util.Objects.requireNonNull(builder.maxRetries, "maxRetries is required");
            this.perRetryTimeout = java.util.Objects.requireNonNull(builder.perRetryTimeout, "perRetryTimeout is required");
            this.httpRetryEvents = builder.httpRetryEvents;
            this.tcpRetryEvents = builder.tcpRetryEvents;
        }

        @Override
        public final java.lang.Number getMaxRetries() {
            return this.maxRetries;
        }

        @Override
        public final imports.aws.appmesh.AppmeshRouteSpecHttpRouteRetryPolicyPerRetryTimeout getPerRetryTimeout() {
            return this.perRetryTimeout;
        }

        @Override
        public final java.util.List<java.lang.String> getHttpRetryEvents() {
            return this.httpRetryEvents;
        }

        @Override
        public final java.util.List<java.lang.String> getTcpRetryEvents() {
            return this.tcpRetryEvents;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("maxRetries", om.valueToTree(this.getMaxRetries()));
            data.set("perRetryTimeout", om.valueToTree(this.getPerRetryTimeout()));
            if (this.getHttpRetryEvents() != null) {
                data.set("httpRetryEvents", om.valueToTree(this.getHttpRetryEvents()));
            }
            if (this.getTcpRetryEvents() != null) {
                data.set("tcpRetryEvents", om.valueToTree(this.getTcpRetryEvents()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshRouteSpecHttpRouteRetryPolicy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshRouteSpecHttpRouteRetryPolicy.Jsii$Proxy that = (AppmeshRouteSpecHttpRouteRetryPolicy.Jsii$Proxy) o;

            if (!maxRetries.equals(that.maxRetries)) return false;
            if (!perRetryTimeout.equals(that.perRetryTimeout)) return false;
            if (this.httpRetryEvents != null ? !this.httpRetryEvents.equals(that.httpRetryEvents) : that.httpRetryEvents != null) return false;
            return this.tcpRetryEvents != null ? this.tcpRetryEvents.equals(that.tcpRetryEvents) : that.tcpRetryEvents == null;
        }

        @Override
        public final int hashCode() {
            int result = this.maxRetries.hashCode();
            result = 31 * result + (this.perRetryTimeout.hashCode());
            result = 31 * result + (this.httpRetryEvents != null ? this.httpRetryEvents.hashCode() : 0);
            result = 31 * result + (this.tcpRetryEvents != null ? this.tcpRetryEvents.hashCode() : 0);
            return result;
        }
    }
}
