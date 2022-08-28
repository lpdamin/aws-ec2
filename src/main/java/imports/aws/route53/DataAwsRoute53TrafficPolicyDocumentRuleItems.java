package imports.aws.route53;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.313Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.route53.DataAwsRoute53TrafficPolicyDocumentRuleItems")
@software.amazon.jsii.Jsii.Proxy(DataAwsRoute53TrafficPolicyDocumentRuleItems.Jsii$Proxy.class)
public interface DataAwsRoute53TrafficPolicyDocumentRuleItems extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/route53_traffic_policy_document#endpoint_reference DataAwsRoute53TrafficPolicyDocument#endpoint_reference}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEndpointReference() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/route53_traffic_policy_document#health_check DataAwsRoute53TrafficPolicyDocument#health_check}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHealthCheck() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsRoute53TrafficPolicyDocumentRuleItems}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsRoute53TrafficPolicyDocumentRuleItems}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsRoute53TrafficPolicyDocumentRuleItems> {
        java.lang.String endpointReference;
        java.lang.String healthCheck;

        /**
         * Sets the value of {@link DataAwsRoute53TrafficPolicyDocumentRuleItems#getEndpointReference}
         * @param endpointReference Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/route53_traffic_policy_document#endpoint_reference DataAwsRoute53TrafficPolicyDocument#endpoint_reference}.
         * @return {@code this}
         */
        public Builder endpointReference(java.lang.String endpointReference) {
            this.endpointReference = endpointReference;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsRoute53TrafficPolicyDocumentRuleItems#getHealthCheck}
         * @param healthCheck Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/route53_traffic_policy_document#health_check DataAwsRoute53TrafficPolicyDocument#health_check}.
         * @return {@code this}
         */
        public Builder healthCheck(java.lang.String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsRoute53TrafficPolicyDocumentRuleItems}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsRoute53TrafficPolicyDocumentRuleItems build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataAwsRoute53TrafficPolicyDocumentRuleItems}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsRoute53TrafficPolicyDocumentRuleItems {
        private final java.lang.String endpointReference;
        private final java.lang.String healthCheck;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.endpointReference = software.amazon.jsii.Kernel.get(this, "endpointReference", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.healthCheck = software.amazon.jsii.Kernel.get(this, "healthCheck", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.endpointReference = builder.endpointReference;
            this.healthCheck = builder.healthCheck;
        }

        @Override
        public final java.lang.String getEndpointReference() {
            return this.endpointReference;
        }

        @Override
        public final java.lang.String getHealthCheck() {
            return this.healthCheck;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEndpointReference() != null) {
                data.set("endpointReference", om.valueToTree(this.getEndpointReference()));
            }
            if (this.getHealthCheck() != null) {
                data.set("healthCheck", om.valueToTree(this.getHealthCheck()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.route53.DataAwsRoute53TrafficPolicyDocumentRuleItems"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsRoute53TrafficPolicyDocumentRuleItems.Jsii$Proxy that = (DataAwsRoute53TrafficPolicyDocumentRuleItems.Jsii$Proxy) o;

            if (this.endpointReference != null ? !this.endpointReference.equals(that.endpointReference) : that.endpointReference != null) return false;
            return this.healthCheck != null ? this.healthCheck.equals(that.healthCheck) : that.healthCheck == null;
        }

        @Override
        public final int hashCode() {
            int result = this.endpointReference != null ? this.endpointReference.hashCode() : 0;
            result = 31 * result + (this.healthCheck != null ? this.healthCheck.hashCode() : 0);
            return result;
        }
    }
}
