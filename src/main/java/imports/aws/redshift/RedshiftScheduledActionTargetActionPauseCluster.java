package imports.aws.redshift;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.297Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.redshift.RedshiftScheduledActionTargetActionPauseCluster")
@software.amazon.jsii.Jsii.Proxy(RedshiftScheduledActionTargetActionPauseCluster.Jsii$Proxy.class)
public interface RedshiftScheduledActionTargetActionPauseCluster extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/redshift_scheduled_action#cluster_identifier RedshiftScheduledAction#cluster_identifier}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getClusterIdentifier();

    /**
     * @return a {@link Builder} of {@link RedshiftScheduledActionTargetActionPauseCluster}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RedshiftScheduledActionTargetActionPauseCluster}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RedshiftScheduledActionTargetActionPauseCluster> {
        java.lang.String clusterIdentifier;

        /**
         * Sets the value of {@link RedshiftScheduledActionTargetActionPauseCluster#getClusterIdentifier}
         * @param clusterIdentifier Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/redshift_scheduled_action#cluster_identifier RedshiftScheduledAction#cluster_identifier}. This parameter is required.
         * @return {@code this}
         */
        public Builder clusterIdentifier(java.lang.String clusterIdentifier) {
            this.clusterIdentifier = clusterIdentifier;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RedshiftScheduledActionTargetActionPauseCluster}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RedshiftScheduledActionTargetActionPauseCluster build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link RedshiftScheduledActionTargetActionPauseCluster}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RedshiftScheduledActionTargetActionPauseCluster {
        private final java.lang.String clusterIdentifier;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.clusterIdentifier = software.amazon.jsii.Kernel.get(this, "clusterIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clusterIdentifier = java.util.Objects.requireNonNull(builder.clusterIdentifier, "clusterIdentifier is required");
        }

        @Override
        public final java.lang.String getClusterIdentifier() {
            return this.clusterIdentifier;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("clusterIdentifier", om.valueToTree(this.getClusterIdentifier()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.redshift.RedshiftScheduledActionTargetActionPauseCluster"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RedshiftScheduledActionTargetActionPauseCluster.Jsii$Proxy that = (RedshiftScheduledActionTargetActionPauseCluster.Jsii$Proxy) o;

            return this.clusterIdentifier.equals(that.clusterIdentifier);
        }

        @Override
        public final int hashCode() {
            int result = this.clusterIdentifier.hashCode();
            return result;
        }
    }
}
