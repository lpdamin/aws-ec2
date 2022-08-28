package imports.aws.redshift;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.285Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.redshift.RedshiftScheduledActionTargetAction")
@software.amazon.jsii.Jsii.Proxy(RedshiftScheduledActionTargetAction.Jsii$Proxy.class)
public interface RedshiftScheduledActionTargetAction extends software.amazon.jsii.JsiiSerializable {

    /**
     * pause_cluster block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/redshift_scheduled_action#pause_cluster RedshiftScheduledAction#pause_cluster}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.redshift.RedshiftScheduledActionTargetActionPauseCluster getPauseCluster() {
        return null;
    }

    /**
     * resize_cluster block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/redshift_scheduled_action#resize_cluster RedshiftScheduledAction#resize_cluster}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.redshift.RedshiftScheduledActionTargetActionResizeCluster getResizeCluster() {
        return null;
    }

    /**
     * resume_cluster block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/redshift_scheduled_action#resume_cluster RedshiftScheduledAction#resume_cluster}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.redshift.RedshiftScheduledActionTargetActionResumeCluster getResumeCluster() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RedshiftScheduledActionTargetAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RedshiftScheduledActionTargetAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RedshiftScheduledActionTargetAction> {
        imports.aws.redshift.RedshiftScheduledActionTargetActionPauseCluster pauseCluster;
        imports.aws.redshift.RedshiftScheduledActionTargetActionResizeCluster resizeCluster;
        imports.aws.redshift.RedshiftScheduledActionTargetActionResumeCluster resumeCluster;

        /**
         * Sets the value of {@link RedshiftScheduledActionTargetAction#getPauseCluster}
         * @param pauseCluster pause_cluster block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/redshift_scheduled_action#pause_cluster RedshiftScheduledAction#pause_cluster}
         * @return {@code this}
         */
        public Builder pauseCluster(imports.aws.redshift.RedshiftScheduledActionTargetActionPauseCluster pauseCluster) {
            this.pauseCluster = pauseCluster;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftScheduledActionTargetAction#getResizeCluster}
         * @param resizeCluster resize_cluster block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/redshift_scheduled_action#resize_cluster RedshiftScheduledAction#resize_cluster}
         * @return {@code this}
         */
        public Builder resizeCluster(imports.aws.redshift.RedshiftScheduledActionTargetActionResizeCluster resizeCluster) {
            this.resizeCluster = resizeCluster;
            return this;
        }

        /**
         * Sets the value of {@link RedshiftScheduledActionTargetAction#getResumeCluster}
         * @param resumeCluster resume_cluster block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/redshift_scheduled_action#resume_cluster RedshiftScheduledAction#resume_cluster}
         * @return {@code this}
         */
        public Builder resumeCluster(imports.aws.redshift.RedshiftScheduledActionTargetActionResumeCluster resumeCluster) {
            this.resumeCluster = resumeCluster;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RedshiftScheduledActionTargetAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RedshiftScheduledActionTargetAction build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link RedshiftScheduledActionTargetAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RedshiftScheduledActionTargetAction {
        private final imports.aws.redshift.RedshiftScheduledActionTargetActionPauseCluster pauseCluster;
        private final imports.aws.redshift.RedshiftScheduledActionTargetActionResizeCluster resizeCluster;
        private final imports.aws.redshift.RedshiftScheduledActionTargetActionResumeCluster resumeCluster;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.pauseCluster = software.amazon.jsii.Kernel.get(this, "pauseCluster", software.amazon.jsii.NativeType.forClass(imports.aws.redshift.RedshiftScheduledActionTargetActionPauseCluster.class));
            this.resizeCluster = software.amazon.jsii.Kernel.get(this, "resizeCluster", software.amazon.jsii.NativeType.forClass(imports.aws.redshift.RedshiftScheduledActionTargetActionResizeCluster.class));
            this.resumeCluster = software.amazon.jsii.Kernel.get(this, "resumeCluster", software.amazon.jsii.NativeType.forClass(imports.aws.redshift.RedshiftScheduledActionTargetActionResumeCluster.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.pauseCluster = builder.pauseCluster;
            this.resizeCluster = builder.resizeCluster;
            this.resumeCluster = builder.resumeCluster;
        }

        @Override
        public final imports.aws.redshift.RedshiftScheduledActionTargetActionPauseCluster getPauseCluster() {
            return this.pauseCluster;
        }

        @Override
        public final imports.aws.redshift.RedshiftScheduledActionTargetActionResizeCluster getResizeCluster() {
            return this.resizeCluster;
        }

        @Override
        public final imports.aws.redshift.RedshiftScheduledActionTargetActionResumeCluster getResumeCluster() {
            return this.resumeCluster;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPauseCluster() != null) {
                data.set("pauseCluster", om.valueToTree(this.getPauseCluster()));
            }
            if (this.getResizeCluster() != null) {
                data.set("resizeCluster", om.valueToTree(this.getResizeCluster()));
            }
            if (this.getResumeCluster() != null) {
                data.set("resumeCluster", om.valueToTree(this.getResumeCluster()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.redshift.RedshiftScheduledActionTargetAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RedshiftScheduledActionTargetAction.Jsii$Proxy that = (RedshiftScheduledActionTargetAction.Jsii$Proxy) o;

            if (this.pauseCluster != null ? !this.pauseCluster.equals(that.pauseCluster) : that.pauseCluster != null) return false;
            if (this.resizeCluster != null ? !this.resizeCluster.equals(that.resizeCluster) : that.resizeCluster != null) return false;
            return this.resumeCluster != null ? this.resumeCluster.equals(that.resumeCluster) : that.resumeCluster == null;
        }

        @Override
        public final int hashCode() {
            int result = this.pauseCluster != null ? this.pauseCluster.hashCode() : 0;
            result = 31 * result + (this.resizeCluster != null ? this.resizeCluster.hashCode() : 0);
            result = 31 * result + (this.resumeCluster != null ? this.resumeCluster.hashCode() : 0);
            return result;
        }
    }
}
