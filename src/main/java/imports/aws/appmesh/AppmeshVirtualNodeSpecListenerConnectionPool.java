package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.684Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPool")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualNodeSpecListenerConnectionPool.Jsii$Proxy.class)
public interface AppmeshVirtualNodeSpecListenerConnectionPool extends software.amazon.jsii.JsiiSerializable {

    /**
     * grpc block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#grpc AppmeshVirtualNode#grpc}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolGrpc getGrpc() {
        return null;
    }

    /**
     * http block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#http AppmeshVirtualNode#http}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolHttp getHttp() {
        return null;
    }

    /**
     * http2 block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#http2 AppmeshVirtualNode#http2}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolHttp2 getHttp2() {
        return null;
    }

    /**
     * tcp block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#tcp AppmeshVirtualNode#tcp}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolTcp getTcp() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualNodeSpecListenerConnectionPool}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualNodeSpecListenerConnectionPool}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualNodeSpecListenerConnectionPool> {
        imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolGrpc grpc;
        imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolHttp http;
        imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolHttp2 http2;
        imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolTcp tcp;

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerConnectionPool#getGrpc}
         * @param grpc grpc block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#grpc AppmeshVirtualNode#grpc}
         * @return {@code this}
         */
        public Builder grpc(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolGrpc grpc) {
            this.grpc = grpc;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerConnectionPool#getHttp}
         * @param http http block.
         *             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#http AppmeshVirtualNode#http}
         * @return {@code this}
         */
        public Builder http(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolHttp http) {
            this.http = http;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerConnectionPool#getHttp2}
         * @param http2 http2 block.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#http2 AppmeshVirtualNode#http2}
         * @return {@code this}
         */
        public Builder http2(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolHttp2 http2) {
            this.http2 = http2;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshVirtualNodeSpecListenerConnectionPool#getTcp}
         * @param tcp tcp block.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_node#tcp AppmeshVirtualNode#tcp}
         * @return {@code this}
         */
        public Builder tcp(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolTcp tcp) {
            this.tcp = tcp;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualNodeSpecListenerConnectionPool}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualNodeSpecListenerConnectionPool build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualNodeSpecListenerConnectionPool}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualNodeSpecListenerConnectionPool {
        private final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolGrpc grpc;
        private final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolHttp http;
        private final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolHttp2 http2;
        private final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolTcp tcp;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.grpc = software.amazon.jsii.Kernel.get(this, "grpc", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolGrpc.class));
            this.http = software.amazon.jsii.Kernel.get(this, "http", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolHttp.class));
            this.http2 = software.amazon.jsii.Kernel.get(this, "http2", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolHttp2.class));
            this.tcp = software.amazon.jsii.Kernel.get(this, "tcp", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolTcp.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.grpc = builder.grpc;
            this.http = builder.http;
            this.http2 = builder.http2;
            this.tcp = builder.tcp;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolGrpc getGrpc() {
            return this.grpc;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolHttp getHttp() {
            return this.http;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolHttp2 getHttp2() {
            return this.http2;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPoolTcp getTcp() {
            return this.tcp;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getGrpc() != null) {
                data.set("grpc", om.valueToTree(this.getGrpc()));
            }
            if (this.getHttp() != null) {
                data.set("http", om.valueToTree(this.getHttp()));
            }
            if (this.getHttp2() != null) {
                data.set("http2", om.valueToTree(this.getHttp2()));
            }
            if (this.getTcp() != null) {
                data.set("tcp", om.valueToTree(this.getTcp()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshVirtualNodeSpecListenerConnectionPool"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualNodeSpecListenerConnectionPool.Jsii$Proxy that = (AppmeshVirtualNodeSpecListenerConnectionPool.Jsii$Proxy) o;

            if (this.grpc != null ? !this.grpc.equals(that.grpc) : that.grpc != null) return false;
            if (this.http != null ? !this.http.equals(that.http) : that.http != null) return false;
            if (this.http2 != null ? !this.http2.equals(that.http2) : that.http2 != null) return false;
            return this.tcp != null ? this.tcp.equals(that.tcp) : that.tcp == null;
        }

        @Override
        public final int hashCode() {
            int result = this.grpc != null ? this.grpc.hashCode() : 0;
            result = 31 * result + (this.http != null ? this.http.hashCode() : 0);
            result = 31 * result + (this.http2 != null ? this.http2.hashCode() : 0);
            result = 31 * result + (this.tcp != null ? this.tcp.hashCode() : 0);
            return result;
        }
    }
}
