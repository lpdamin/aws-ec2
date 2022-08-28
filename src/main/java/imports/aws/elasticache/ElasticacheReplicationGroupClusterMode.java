package imports.aws.elasticache;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.551Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.elasticache.ElasticacheReplicationGroupClusterMode")
@software.amazon.jsii.Jsii.Proxy(ElasticacheReplicationGroupClusterMode.Jsii$Proxy.class)
public interface ElasticacheReplicationGroupClusterMode extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elasticache_replication_group#num_node_groups ElasticacheReplicationGroup#num_node_groups}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getNumNodeGroups() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elasticache_replication_group#replicas_per_node_group ElasticacheReplicationGroup#replicas_per_node_group}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getReplicasPerNodeGroup() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ElasticacheReplicationGroupClusterMode}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ElasticacheReplicationGroupClusterMode}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ElasticacheReplicationGroupClusterMode> {
        java.lang.Number numNodeGroups;
        java.lang.Number replicasPerNodeGroup;

        /**
         * Sets the value of {@link ElasticacheReplicationGroupClusterMode#getNumNodeGroups}
         * @param numNodeGroups Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elasticache_replication_group#num_node_groups ElasticacheReplicationGroup#num_node_groups}.
         * @return {@code this}
         */
        public Builder numNodeGroups(java.lang.Number numNodeGroups) {
            this.numNodeGroups = numNodeGroups;
            return this;
        }

        /**
         * Sets the value of {@link ElasticacheReplicationGroupClusterMode#getReplicasPerNodeGroup}
         * @param replicasPerNodeGroup Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/elasticache_replication_group#replicas_per_node_group ElasticacheReplicationGroup#replicas_per_node_group}.
         * @return {@code this}
         */
        public Builder replicasPerNodeGroup(java.lang.Number replicasPerNodeGroup) {
            this.replicasPerNodeGroup = replicasPerNodeGroup;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ElasticacheReplicationGroupClusterMode}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ElasticacheReplicationGroupClusterMode build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ElasticacheReplicationGroupClusterMode}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ElasticacheReplicationGroupClusterMode {
        private final java.lang.Number numNodeGroups;
        private final java.lang.Number replicasPerNodeGroup;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.numNodeGroups = software.amazon.jsii.Kernel.get(this, "numNodeGroups", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.replicasPerNodeGroup = software.amazon.jsii.Kernel.get(this, "replicasPerNodeGroup", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.numNodeGroups = builder.numNodeGroups;
            this.replicasPerNodeGroup = builder.replicasPerNodeGroup;
        }

        @Override
        public final java.lang.Number getNumNodeGroups() {
            return this.numNodeGroups;
        }

        @Override
        public final java.lang.Number getReplicasPerNodeGroup() {
            return this.replicasPerNodeGroup;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getNumNodeGroups() != null) {
                data.set("numNodeGroups", om.valueToTree(this.getNumNodeGroups()));
            }
            if (this.getReplicasPerNodeGroup() != null) {
                data.set("replicasPerNodeGroup", om.valueToTree(this.getReplicasPerNodeGroup()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.elasticache.ElasticacheReplicationGroupClusterMode"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ElasticacheReplicationGroupClusterMode.Jsii$Proxy that = (ElasticacheReplicationGroupClusterMode.Jsii$Proxy) o;

            if (this.numNodeGroups != null ? !this.numNodeGroups.equals(that.numNodeGroups) : that.numNodeGroups != null) return false;
            return this.replicasPerNodeGroup != null ? this.replicasPerNodeGroup.equals(that.replicasPerNodeGroup) : that.replicasPerNodeGroup == null;
        }

        @Override
        public final int hashCode() {
            int result = this.numNodeGroups != null ? this.numNodeGroups.hashCode() : 0;
            result = 31 * result + (this.replicasPerNodeGroup != null ? this.replicasPerNodeGroup.hashCode() : 0);
            return result;
        }
    }
}
