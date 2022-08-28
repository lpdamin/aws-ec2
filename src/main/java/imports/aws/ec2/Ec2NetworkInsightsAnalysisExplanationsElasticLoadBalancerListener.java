package imports.aws.ec2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.025Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.Ec2NetworkInsightsAnalysisExplanationsElasticLoadBalancerListener")
@software.amazon.jsii.Jsii.Proxy(Ec2NetworkInsightsAnalysisExplanationsElasticLoadBalancerListener.Jsii$Proxy.class)
public interface Ec2NetworkInsightsAnalysisExplanationsElasticLoadBalancerListener extends software.amazon.jsii.JsiiSerializable {

    /**
     * @return a {@link Builder} of {@link Ec2NetworkInsightsAnalysisExplanationsElasticLoadBalancerListener}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Ec2NetworkInsightsAnalysisExplanationsElasticLoadBalancerListener}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Ec2NetworkInsightsAnalysisExplanationsElasticLoadBalancerListener> {

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Ec2NetworkInsightsAnalysisExplanationsElasticLoadBalancerListener}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Ec2NetworkInsightsAnalysisExplanationsElasticLoadBalancerListener build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Ec2NetworkInsightsAnalysisExplanationsElasticLoadBalancerListener}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Ec2NetworkInsightsAnalysisExplanationsElasticLoadBalancerListener {

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();


            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.ec2.Ec2NetworkInsightsAnalysisExplanationsElasticLoadBalancerListener"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }
    }
}
