package imports.aws.vpc;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.869Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction")
@software.amazon.jsii.Jsii.Proxy(DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction.Jsii$Proxy.class)
public interface DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#association_method DataAwsNetworkmanagerCoreNetworkPolicyDocument#association_method}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAssociationMethod();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#require_acceptance DataAwsNetworkmanagerCoreNetworkPolicyDocument#require_acceptance}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getRequireAcceptance() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#segment DataAwsNetworkmanagerCoreNetworkPolicyDocument#segment}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSegment() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#tag_value_of_key DataAwsNetworkmanagerCoreNetworkPolicyDocument#tag_value_of_key}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTagValueOfKey() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction> {
        java.lang.String associationMethod;
        java.lang.Object requireAcceptance;
        java.lang.String segment;
        java.lang.String tagValueOfKey;

        /**
         * Sets the value of {@link DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction#getAssociationMethod}
         * @param associationMethod Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#association_method DataAwsNetworkmanagerCoreNetworkPolicyDocument#association_method}. This parameter is required.
         * @return {@code this}
         */
        public Builder associationMethod(java.lang.String associationMethod) {
            this.associationMethod = associationMethod;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction#getRequireAcceptance}
         * @param requireAcceptance Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#require_acceptance DataAwsNetworkmanagerCoreNetworkPolicyDocument#require_acceptance}.
         * @return {@code this}
         */
        public Builder requireAcceptance(java.lang.Boolean requireAcceptance) {
            this.requireAcceptance = requireAcceptance;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction#getRequireAcceptance}
         * @param requireAcceptance Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#require_acceptance DataAwsNetworkmanagerCoreNetworkPolicyDocument#require_acceptance}.
         * @return {@code this}
         */
        public Builder requireAcceptance(com.hashicorp.cdktf.IResolvable requireAcceptance) {
            this.requireAcceptance = requireAcceptance;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction#getSegment}
         * @param segment Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#segment DataAwsNetworkmanagerCoreNetworkPolicyDocument#segment}.
         * @return {@code this}
         */
        public Builder segment(java.lang.String segment) {
            this.segment = segment;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction#getTagValueOfKey}
         * @param tagValueOfKey Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/networkmanager_core_network_policy_document#tag_value_of_key DataAwsNetworkmanagerCoreNetworkPolicyDocument#tag_value_of_key}.
         * @return {@code this}
         */
        public Builder tagValueOfKey(java.lang.String tagValueOfKey) {
            this.tagValueOfKey = tagValueOfKey;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction {
        private final java.lang.String associationMethod;
        private final java.lang.Object requireAcceptance;
        private final java.lang.String segment;
        private final java.lang.String tagValueOfKey;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.associationMethod = software.amazon.jsii.Kernel.get(this, "associationMethod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.requireAcceptance = software.amazon.jsii.Kernel.get(this, "requireAcceptance", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.segment = software.amazon.jsii.Kernel.get(this, "segment", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tagValueOfKey = software.amazon.jsii.Kernel.get(this, "tagValueOfKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.associationMethod = java.util.Objects.requireNonNull(builder.associationMethod, "associationMethod is required");
            this.requireAcceptance = builder.requireAcceptance;
            this.segment = builder.segment;
            this.tagValueOfKey = builder.tagValueOfKey;
        }

        @Override
        public final java.lang.String getAssociationMethod() {
            return this.associationMethod;
        }

        @Override
        public final java.lang.Object getRequireAcceptance() {
            return this.requireAcceptance;
        }

        @Override
        public final java.lang.String getSegment() {
            return this.segment;
        }

        @Override
        public final java.lang.String getTagValueOfKey() {
            return this.tagValueOfKey;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("associationMethod", om.valueToTree(this.getAssociationMethod()));
            if (this.getRequireAcceptance() != null) {
                data.set("requireAcceptance", om.valueToTree(this.getRequireAcceptance()));
            }
            if (this.getSegment() != null) {
                data.set("segment", om.valueToTree(this.getSegment()));
            }
            if (this.getTagValueOfKey() != null) {
                data.set("tagValueOfKey", om.valueToTree(this.getTagValueOfKey()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.vpc.DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction.Jsii$Proxy that = (DataAwsNetworkmanagerCoreNetworkPolicyDocumentAttachmentPoliciesAction.Jsii$Proxy) o;

            if (!associationMethod.equals(that.associationMethod)) return false;
            if (this.requireAcceptance != null ? !this.requireAcceptance.equals(that.requireAcceptance) : that.requireAcceptance != null) return false;
            if (this.segment != null ? !this.segment.equals(that.segment) : that.segment != null) return false;
            return this.tagValueOfKey != null ? this.tagValueOfKey.equals(that.tagValueOfKey) : that.tagValueOfKey == null;
        }

        @Override
        public final int hashCode() {
            int result = this.associationMethod.hashCode();
            result = 31 * result + (this.requireAcceptance != null ? this.requireAcceptance.hashCode() : 0);
            result = 31 * result + (this.segment != null ? this.segment.hashCode() : 0);
            result = 31 * result + (this.tagValueOfKey != null ? this.tagValueOfKey.hashCode() : 0);
            return result;
        }
    }
}
