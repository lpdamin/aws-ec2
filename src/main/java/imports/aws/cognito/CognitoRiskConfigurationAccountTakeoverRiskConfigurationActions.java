package imports.aws.cognito;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.668Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActions")
@software.amazon.jsii.Jsii.Proxy(CognitoRiskConfigurationAccountTakeoverRiskConfigurationActions.Jsii$Proxy.class)
public interface CognitoRiskConfigurationAccountTakeoverRiskConfigurationActions extends software.amazon.jsii.JsiiSerializable {

    /**
     * high_action block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#high_action CognitoRiskConfiguration#high_action}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsHighAction getHighAction() {
        return null;
    }

    /**
     * low_action block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#low_action CognitoRiskConfiguration#low_action}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction getLowAction() {
        return null;
    }

    /**
     * medium_action block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#medium_action CognitoRiskConfiguration#medium_action}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsMediumAction getMediumAction() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CognitoRiskConfigurationAccountTakeoverRiskConfigurationActions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoRiskConfigurationAccountTakeoverRiskConfigurationActions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoRiskConfigurationAccountTakeoverRiskConfigurationActions> {
        imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsHighAction highAction;
        imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction lowAction;
        imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsMediumAction mediumAction;

        /**
         * Sets the value of {@link CognitoRiskConfigurationAccountTakeoverRiskConfigurationActions#getHighAction}
         * @param highAction high_action block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#high_action CognitoRiskConfiguration#high_action}
         * @return {@code this}
         */
        public Builder highAction(imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsHighAction highAction) {
            this.highAction = highAction;
            return this;
        }

        /**
         * Sets the value of {@link CognitoRiskConfigurationAccountTakeoverRiskConfigurationActions#getLowAction}
         * @param lowAction low_action block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#low_action CognitoRiskConfiguration#low_action}
         * @return {@code this}
         */
        public Builder lowAction(imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction lowAction) {
            this.lowAction = lowAction;
            return this;
        }

        /**
         * Sets the value of {@link CognitoRiskConfigurationAccountTakeoverRiskConfigurationActions#getMediumAction}
         * @param mediumAction medium_action block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#medium_action CognitoRiskConfiguration#medium_action}
         * @return {@code this}
         */
        public Builder mediumAction(imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsMediumAction mediumAction) {
            this.mediumAction = mediumAction;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoRiskConfigurationAccountTakeoverRiskConfigurationActions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoRiskConfigurationAccountTakeoverRiskConfigurationActions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CognitoRiskConfigurationAccountTakeoverRiskConfigurationActions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoRiskConfigurationAccountTakeoverRiskConfigurationActions {
        private final imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsHighAction highAction;
        private final imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction lowAction;
        private final imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsMediumAction mediumAction;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.highAction = software.amazon.jsii.Kernel.get(this, "highAction", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsHighAction.class));
            this.lowAction = software.amazon.jsii.Kernel.get(this, "lowAction", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction.class));
            this.mediumAction = software.amazon.jsii.Kernel.get(this, "mediumAction", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsMediumAction.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.highAction = builder.highAction;
            this.lowAction = builder.lowAction;
            this.mediumAction = builder.mediumAction;
        }

        @Override
        public final imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsHighAction getHighAction() {
            return this.highAction;
        }

        @Override
        public final imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsLowAction getLowAction() {
            return this.lowAction;
        }

        @Override
        public final imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActionsMediumAction getMediumAction() {
            return this.mediumAction;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getHighAction() != null) {
                data.set("highAction", om.valueToTree(this.getHighAction()));
            }
            if (this.getLowAction() != null) {
                data.set("lowAction", om.valueToTree(this.getLowAction()));
            }
            if (this.getMediumAction() != null) {
                data.set("mediumAction", om.valueToTree(this.getMediumAction()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationActions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoRiskConfigurationAccountTakeoverRiskConfigurationActions.Jsii$Proxy that = (CognitoRiskConfigurationAccountTakeoverRiskConfigurationActions.Jsii$Proxy) o;

            if (this.highAction != null ? !this.highAction.equals(that.highAction) : that.highAction != null) return false;
            if (this.lowAction != null ? !this.lowAction.equals(that.lowAction) : that.lowAction != null) return false;
            return this.mediumAction != null ? this.mediumAction.equals(that.mediumAction) : that.mediumAction == null;
        }

        @Override
        public final int hashCode() {
            int result = this.highAction != null ? this.highAction.hashCode() : 0;
            result = 31 * result + (this.lowAction != null ? this.lowAction.hashCode() : 0);
            result = 31 * result + (this.mediumAction != null ? this.mediumAction.hashCode() : 0);
            return result;
        }
    }
}
