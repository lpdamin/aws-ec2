package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.594Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualNodeSpecServiceDiscovery")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualNodeSpecServiceDiscovery.Jsii$Proxy.class)
public interface AppmeshVirtualNodeSpecServiceDiscovery extends software.amazon.jsii.JsiiSerializable {

    /**
     * aws_cloud_map block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#aws_cloud_map AppmeshVirtualNode#aws_cloud_map}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap getAwsCloudMap() {
        return null;
    }

    /**
     * dns block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#dns AppmeshVirtualNode#dns}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecServiceDiscoveryDns getDns() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualNodeSpecServiceDiscovery}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualNodeSpecServiceDiscovery}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualNodeSpecServiceDiscovery> {
        imports.aws.appmesh.AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap awsCloudMap;
        imports.aws.appmesh.AppmeshVirtualNodeSpecServiceDiscoveryDns dns;

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecServiceDiscovery#getAwsCloudMap}
         * @param awsCloudMap aws_cloud_map block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#aws_cloud_map AppmeshVirtualNode#aws_cloud_map}
         * @return {@code this}
         */
        public Builder awsCloudMap(imports.aws.appmesh.AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap awsCloudMap) {
            this.awsCloudMap = awsCloudMap;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecServiceDiscovery#getDns}
         * @param dns dns block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#dns AppmeshVirtualNode#dns}
         * @return {@code this}
         */
        public Builder dns(imports.aws.appmesh.AppmeshVirtualNodeSpecServiceDiscoveryDns dns) {
            this.dns = dns;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualNodeSpecServiceDiscovery}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualNodeSpecServiceDiscovery build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualNodeSpecServiceDiscovery}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualNodeSpecServiceDiscovery {
        private final imports.aws.appmesh.AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap awsCloudMap;
        private final imports.aws.appmesh.AppmeshVirtualNodeSpecServiceDiscoveryDns dns;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.awsCloudMap = software.amazon.jsii.Kernel.get(this, "awsCloudMap", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap.class));
            this.dns = software.amazon.jsii.Kernel.get(this, "dns", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecServiceDiscoveryDns.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.awsCloudMap = builder.awsCloudMap;
            this.dns = builder.dns;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualNodeSpecServiceDiscoveryAwsCloudMap getAwsCloudMap() {
            return this.awsCloudMap;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualNodeSpecServiceDiscoveryDns getDns() {
            return this.dns;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAwsCloudMap() != null) {
                data.set("awsCloudMap", om.valueToTree(this.getAwsCloudMap()));
            }
            if (this.getDns() != null) {
                data.set("dns", om.valueToTree(this.getDns()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshVirtualNodeSpecServiceDiscovery"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualNodeSpecServiceDiscovery.Jsii$Proxy that = (AppmeshVirtualNodeSpecServiceDiscovery.Jsii$Proxy) o;

            if (this.awsCloudMap != null ? !this.awsCloudMap.equals(that.awsCloudMap) : that.awsCloudMap != null) return false;
            return this.dns != null ? this.dns.equals(that.dns) : that.dns == null;
        }

        @Override
        public final int hashCode() {
            int result = this.awsCloudMap != null ? this.awsCloudMap.hashCode() : 0;
            result = 31 * result + (this.dns != null ? this.dns.hashCode() : 0);
            return result;
        }
    }
}
