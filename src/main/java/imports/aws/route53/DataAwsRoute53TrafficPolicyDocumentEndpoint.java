package imports.aws.route53;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.312Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.route53.DataAwsRoute53TrafficPolicyDocumentEndpoint")
@software.amazon.jsii.Jsii.Proxy(DataAwsRoute53TrafficPolicyDocumentEndpoint.Jsii$Proxy.class)
public interface DataAwsRoute53TrafficPolicyDocumentEndpoint extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/route53_traffic_policy_document#id DataAwsRoute53TrafficPolicyDocument#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/route53_traffic_policy_document#region DataAwsRoute53TrafficPolicyDocument#region}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRegion() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/route53_traffic_policy_document#type DataAwsRoute53TrafficPolicyDocument#type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/route53_traffic_policy_document#value DataAwsRoute53TrafficPolicyDocument#value}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getValue() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsRoute53TrafficPolicyDocumentEndpoint}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsRoute53TrafficPolicyDocumentEndpoint}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsRoute53TrafficPolicyDocumentEndpoint> {
        java.lang.String id;
        java.lang.String region;
        java.lang.String type;
        java.lang.String value;

        /**
         * Sets the value of {@link DataAwsRoute53TrafficPolicyDocumentEndpoint#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/route53_traffic_policy_document#id DataAwsRoute53TrafficPolicyDocument#id}. This parameter is required.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsRoute53TrafficPolicyDocumentEndpoint#getRegion}
         * @param region Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/route53_traffic_policy_document#region DataAwsRoute53TrafficPolicyDocument#region}.
         * @return {@code this}
         */
        public Builder region(java.lang.String region) {
            this.region = region;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsRoute53TrafficPolicyDocumentEndpoint#getType}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/route53_traffic_policy_document#type DataAwsRoute53TrafficPolicyDocument#type}.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsRoute53TrafficPolicyDocumentEndpoint#getValue}
         * @param value Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/route53_traffic_policy_document#value DataAwsRoute53TrafficPolicyDocument#value}.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsRoute53TrafficPolicyDocumentEndpoint}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsRoute53TrafficPolicyDocumentEndpoint build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataAwsRoute53TrafficPolicyDocumentEndpoint}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsRoute53TrafficPolicyDocumentEndpoint {
        private final java.lang.String id;
        private final java.lang.String region;
        private final java.lang.String type;
        private final java.lang.String value;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.region = software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.id = java.util.Objects.requireNonNull(builder.id, "id is required");
            this.region = builder.region;
            this.type = builder.type;
            this.value = builder.value;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getRegion() {
            return this.region;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("id", om.valueToTree(this.getId()));
            if (this.getRegion() != null) {
                data.set("region", om.valueToTree(this.getRegion()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }
            if (this.getValue() != null) {
                data.set("value", om.valueToTree(this.getValue()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.route53.DataAwsRoute53TrafficPolicyDocumentEndpoint"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsRoute53TrafficPolicyDocumentEndpoint.Jsii$Proxy that = (DataAwsRoute53TrafficPolicyDocumentEndpoint.Jsii$Proxy) o;

            if (!id.equals(that.id)) return false;
            if (this.region != null ? !this.region.equals(that.region) : that.region != null) return false;
            if (this.type != null ? !this.type.equals(that.type) : that.type != null) return false;
            return this.value != null ? this.value.equals(that.value) : that.value == null;
        }

        @Override
        public final int hashCode() {
            int result = this.id.hashCode();
            result = 31 * result + (this.region != null ? this.region.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
            return result;
        }
    }
}
