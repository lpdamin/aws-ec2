package imports.aws.autoscaling;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.790Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.autoscaling.AutoscalingGroupInstanceRefreshPreferences")
@software.amazon.jsii.Jsii.Proxy(AutoscalingGroupInstanceRefreshPreferences.Jsii$Proxy.class)
public interface AutoscalingGroupInstanceRefreshPreferences extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_group#checkpoint_delay AutoscalingGroup#checkpoint_delay}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCheckpointDelay() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_group#checkpoint_percentages AutoscalingGroup#checkpoint_percentages}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.Number> getCheckpointPercentages() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_group#instance_warmup AutoscalingGroup#instance_warmup}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceWarmup() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_group#min_healthy_percentage AutoscalingGroup#min_healthy_percentage}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinHealthyPercentage() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_group#skip_matching AutoscalingGroup#skip_matching}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSkipMatching() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AutoscalingGroupInstanceRefreshPreferences}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AutoscalingGroupInstanceRefreshPreferences}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AutoscalingGroupInstanceRefreshPreferences> {
        java.lang.String checkpointDelay;
        java.util.List<java.lang.Number> checkpointPercentages;
        java.lang.String instanceWarmup;
        java.lang.Number minHealthyPercentage;
        java.lang.Object skipMatching;

        /**
         * Sets the value of {@link AutoscalingGroupInstanceRefreshPreferences#getCheckpointDelay}
         * @param checkpointDelay Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_group#checkpoint_delay AutoscalingGroup#checkpoint_delay}.
         * @return {@code this}
         */
        public Builder checkpointDelay(java.lang.String checkpointDelay) {
            this.checkpointDelay = checkpointDelay;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupInstanceRefreshPreferences#getCheckpointPercentages}
         * @param checkpointPercentages Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_group#checkpoint_percentages AutoscalingGroup#checkpoint_percentages}.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder checkpointPercentages(java.util.List<? extends java.lang.Number> checkpointPercentages) {
            this.checkpointPercentages = (java.util.List<java.lang.Number>)checkpointPercentages;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupInstanceRefreshPreferences#getInstanceWarmup}
         * @param instanceWarmup Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_group#instance_warmup AutoscalingGroup#instance_warmup}.
         * @return {@code this}
         */
        public Builder instanceWarmup(java.lang.String instanceWarmup) {
            this.instanceWarmup = instanceWarmup;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupInstanceRefreshPreferences#getMinHealthyPercentage}
         * @param minHealthyPercentage Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_group#min_healthy_percentage AutoscalingGroup#min_healthy_percentage}.
         * @return {@code this}
         */
        public Builder minHealthyPercentage(java.lang.Number minHealthyPercentage) {
            this.minHealthyPercentage = minHealthyPercentage;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupInstanceRefreshPreferences#getSkipMatching}
         * @param skipMatching Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_group#skip_matching AutoscalingGroup#skip_matching}.
         * @return {@code this}
         */
        public Builder skipMatching(java.lang.Boolean skipMatching) {
            this.skipMatching = skipMatching;
            return this;
        }

        /**
         * Sets the value of {@link AutoscalingGroupInstanceRefreshPreferences#getSkipMatching}
         * @param skipMatching Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/autoscaling_group#skip_matching AutoscalingGroup#skip_matching}.
         * @return {@code this}
         */
        public Builder skipMatching(com.hashicorp.cdktf.IResolvable skipMatching) {
            this.skipMatching = skipMatching;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AutoscalingGroupInstanceRefreshPreferences}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AutoscalingGroupInstanceRefreshPreferences build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AutoscalingGroupInstanceRefreshPreferences}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AutoscalingGroupInstanceRefreshPreferences {
        private final java.lang.String checkpointDelay;
        private final java.util.List<java.lang.Number> checkpointPercentages;
        private final java.lang.String instanceWarmup;
        private final java.lang.Number minHealthyPercentage;
        private final java.lang.Object skipMatching;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.checkpointDelay = software.amazon.jsii.Kernel.get(this, "checkpointDelay", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.checkpointPercentages = software.amazon.jsii.Kernel.get(this, "checkpointPercentages", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Number.class)));
            this.instanceWarmup = software.amazon.jsii.Kernel.get(this, "instanceWarmup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.minHealthyPercentage = software.amazon.jsii.Kernel.get(this, "minHealthyPercentage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.skipMatching = software.amazon.jsii.Kernel.get(this, "skipMatching", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.checkpointDelay = builder.checkpointDelay;
            this.checkpointPercentages = (java.util.List<java.lang.Number>)builder.checkpointPercentages;
            this.instanceWarmup = builder.instanceWarmup;
            this.minHealthyPercentage = builder.minHealthyPercentage;
            this.skipMatching = builder.skipMatching;
        }

        @Override
        public final java.lang.String getCheckpointDelay() {
            return this.checkpointDelay;
        }

        @Override
        public final java.util.List<java.lang.Number> getCheckpointPercentages() {
            return this.checkpointPercentages;
        }

        @Override
        public final java.lang.String getInstanceWarmup() {
            return this.instanceWarmup;
        }

        @Override
        public final java.lang.Number getMinHealthyPercentage() {
            return this.minHealthyPercentage;
        }

        @Override
        public final java.lang.Object getSkipMatching() {
            return this.skipMatching;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCheckpointDelay() != null) {
                data.set("checkpointDelay", om.valueToTree(this.getCheckpointDelay()));
            }
            if (this.getCheckpointPercentages() != null) {
                data.set("checkpointPercentages", om.valueToTree(this.getCheckpointPercentages()));
            }
            if (this.getInstanceWarmup() != null) {
                data.set("instanceWarmup", om.valueToTree(this.getInstanceWarmup()));
            }
            if (this.getMinHealthyPercentage() != null) {
                data.set("minHealthyPercentage", om.valueToTree(this.getMinHealthyPercentage()));
            }
            if (this.getSkipMatching() != null) {
                data.set("skipMatching", om.valueToTree(this.getSkipMatching()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.autoscaling.AutoscalingGroupInstanceRefreshPreferences"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AutoscalingGroupInstanceRefreshPreferences.Jsii$Proxy that = (AutoscalingGroupInstanceRefreshPreferences.Jsii$Proxy) o;

            if (this.checkpointDelay != null ? !this.checkpointDelay.equals(that.checkpointDelay) : that.checkpointDelay != null) return false;
            if (this.checkpointPercentages != null ? !this.checkpointPercentages.equals(that.checkpointPercentages) : that.checkpointPercentages != null) return false;
            if (this.instanceWarmup != null ? !this.instanceWarmup.equals(that.instanceWarmup) : that.instanceWarmup != null) return false;
            if (this.minHealthyPercentage != null ? !this.minHealthyPercentage.equals(that.minHealthyPercentage) : that.minHealthyPercentage != null) return false;
            return this.skipMatching != null ? this.skipMatching.equals(that.skipMatching) : that.skipMatching == null;
        }

        @Override
        public final int hashCode() {
            int result = this.checkpointDelay != null ? this.checkpointDelay.hashCode() : 0;
            result = 31 * result + (this.checkpointPercentages != null ? this.checkpointPercentages.hashCode() : 0);
            result = 31 * result + (this.instanceWarmup != null ? this.instanceWarmup.hashCode() : 0);
            result = 31 * result + (this.minHealthyPercentage != null ? this.minHealthyPercentage.hashCode() : 0);
            result = 31 * result + (this.skipMatching != null ? this.skipMatching.hashCode() : 0);
            return result;
        }
    }
}
