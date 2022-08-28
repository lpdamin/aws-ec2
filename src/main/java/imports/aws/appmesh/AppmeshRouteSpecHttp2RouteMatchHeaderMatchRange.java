package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.449Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshRouteSpecHttp2RouteMatchHeaderMatchRange")
@software.amazon.jsii.Jsii.Proxy(AppmeshRouteSpecHttp2RouteMatchHeaderMatchRange.Jsii$Proxy.class)
public interface AppmeshRouteSpecHttp2RouteMatchHeaderMatchRange extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#end AppmeshRoute#end}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getEnd();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#start AppmeshRoute#start}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getStart();

    /**
     * @return a {@link Builder} of {@link AppmeshRouteSpecHttp2RouteMatchHeaderMatchRange}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshRouteSpecHttp2RouteMatchHeaderMatchRange}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshRouteSpecHttp2RouteMatchHeaderMatchRange> {
        java.lang.Number end;
        java.lang.Number start;

        /**
         * Sets the value of {@link AppmeshRouteSpecHttp2RouteMatchHeaderMatchRange#getEnd}
         * @param end Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#end AppmeshRoute#end}. This parameter is required.
         * @return {@code this}
         */
        public Builder end(java.lang.Number end) {
            this.end = end;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecHttp2RouteMatchHeaderMatchRange#getStart}
         * @param start Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#start AppmeshRoute#start}. This parameter is required.
         * @return {@code this}
         */
        public Builder start(java.lang.Number start) {
            this.start = start;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshRouteSpecHttp2RouteMatchHeaderMatchRange}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshRouteSpecHttp2RouteMatchHeaderMatchRange build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshRouteSpecHttp2RouteMatchHeaderMatchRange}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshRouteSpecHttp2RouteMatchHeaderMatchRange {
        private final java.lang.Number end;
        private final java.lang.Number start;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.end = software.amazon.jsii.Kernel.get(this, "end", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.start = software.amazon.jsii.Kernel.get(this, "start", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.end = java.util.Objects.requireNonNull(builder.end, "end is required");
            this.start = java.util.Objects.requireNonNull(builder.start, "start is required");
        }

        @Override
        public final java.lang.Number getEnd() {
            return this.end;
        }

        @Override
        public final java.lang.Number getStart() {
            return this.start;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("end", om.valueToTree(this.getEnd()));
            data.set("start", om.valueToTree(this.getStart()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshRouteSpecHttp2RouteMatchHeaderMatchRange"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshRouteSpecHttp2RouteMatchHeaderMatchRange.Jsii$Proxy that = (AppmeshRouteSpecHttp2RouteMatchHeaderMatchRange.Jsii$Proxy) o;

            if (!end.equals(that.end)) return false;
            return this.start.equals(that.start);
        }

        @Override
        public final int hashCode() {
            int result = this.end.hashCode();
            result = 31 * result + (this.start.hashCode());
            return result;
        }
    }
}
