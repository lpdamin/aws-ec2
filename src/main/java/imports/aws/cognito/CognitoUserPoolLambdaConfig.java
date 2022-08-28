package imports.aws.cognito;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.749Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cognito.CognitoUserPoolLambdaConfig")
@software.amazon.jsii.Jsii.Proxy(CognitoUserPoolLambdaConfig.Jsii$Proxy.class)
public interface CognitoUserPoolLambdaConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#create_auth_challenge CognitoUserPool#create_auth_challenge}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCreateAuthChallenge() {
        return null;
    }

    /**
     * custom_email_sender block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#custom_email_sender CognitoUserPool#custom_email_sender}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolLambdaConfigCustomEmailSender getCustomEmailSender() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#custom_message CognitoUserPool#custom_message}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCustomMessage() {
        return null;
    }

    /**
     * custom_sms_sender block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#custom_sms_sender CognitoUserPool#custom_sms_sender}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoUserPoolLambdaConfigCustomSmsSender getCustomSmsSender() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#define_auth_challenge CognitoUserPool#define_auth_challenge}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDefineAuthChallenge() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#kms_key_id CognitoUserPool#kms_key_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#post_authentication CognitoUserPool#post_authentication}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPostAuthentication() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#post_confirmation CognitoUserPool#post_confirmation}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPostConfirmation() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#pre_authentication CognitoUserPool#pre_authentication}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPreAuthentication() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#pre_sign_up CognitoUserPool#pre_sign_up}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPreSignUp() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#pre_token_generation CognitoUserPool#pre_token_generation}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPreTokenGeneration() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#user_migration CognitoUserPool#user_migration}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUserMigration() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#verify_auth_challenge_response CognitoUserPool#verify_auth_challenge_response}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVerifyAuthChallengeResponse() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CognitoUserPoolLambdaConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CognitoUserPoolLambdaConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CognitoUserPoolLambdaConfig> {
        java.lang.String createAuthChallenge;
        imports.aws.cognito.CognitoUserPoolLambdaConfigCustomEmailSender customEmailSender;
        java.lang.String customMessage;
        imports.aws.cognito.CognitoUserPoolLambdaConfigCustomSmsSender customSmsSender;
        java.lang.String defineAuthChallenge;
        java.lang.String kmsKeyId;
        java.lang.String postAuthentication;
        java.lang.String postConfirmation;
        java.lang.String preAuthentication;
        java.lang.String preSignUp;
        java.lang.String preTokenGeneration;
        java.lang.String userMigration;
        java.lang.String verifyAuthChallengeResponse;

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getCreateAuthChallenge}
         * @param createAuthChallenge Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#create_auth_challenge CognitoUserPool#create_auth_challenge}.
         * @return {@code this}
         */
        public Builder createAuthChallenge(java.lang.String createAuthChallenge) {
            this.createAuthChallenge = createAuthChallenge;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getCustomEmailSender}
         * @param customEmailSender custom_email_sender block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#custom_email_sender CognitoUserPool#custom_email_sender}
         * @return {@code this}
         */
        public Builder customEmailSender(imports.aws.cognito.CognitoUserPoolLambdaConfigCustomEmailSender customEmailSender) {
            this.customEmailSender = customEmailSender;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getCustomMessage}
         * @param customMessage Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#custom_message CognitoUserPool#custom_message}.
         * @return {@code this}
         */
        public Builder customMessage(java.lang.String customMessage) {
            this.customMessage = customMessage;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getCustomSmsSender}
         * @param customSmsSender custom_sms_sender block.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#custom_sms_sender CognitoUserPool#custom_sms_sender}
         * @return {@code this}
         */
        public Builder customSmsSender(imports.aws.cognito.CognitoUserPoolLambdaConfigCustomSmsSender customSmsSender) {
            this.customSmsSender = customSmsSender;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getDefineAuthChallenge}
         * @param defineAuthChallenge Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#define_auth_challenge CognitoUserPool#define_auth_challenge}.
         * @return {@code this}
         */
        public Builder defineAuthChallenge(java.lang.String defineAuthChallenge) {
            this.defineAuthChallenge = defineAuthChallenge;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getKmsKeyId}
         * @param kmsKeyId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#kms_key_id CognitoUserPool#kms_key_id}.
         * @return {@code this}
         */
        public Builder kmsKeyId(java.lang.String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getPostAuthentication}
         * @param postAuthentication Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#post_authentication CognitoUserPool#post_authentication}.
         * @return {@code this}
         */
        public Builder postAuthentication(java.lang.String postAuthentication) {
            this.postAuthentication = postAuthentication;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getPostConfirmation}
         * @param postConfirmation Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#post_confirmation CognitoUserPool#post_confirmation}.
         * @return {@code this}
         */
        public Builder postConfirmation(java.lang.String postConfirmation) {
            this.postConfirmation = postConfirmation;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getPreAuthentication}
         * @param preAuthentication Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#pre_authentication CognitoUserPool#pre_authentication}.
         * @return {@code this}
         */
        public Builder preAuthentication(java.lang.String preAuthentication) {
            this.preAuthentication = preAuthentication;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getPreSignUp}
         * @param preSignUp Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#pre_sign_up CognitoUserPool#pre_sign_up}.
         * @return {@code this}
         */
        public Builder preSignUp(java.lang.String preSignUp) {
            this.preSignUp = preSignUp;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getPreTokenGeneration}
         * @param preTokenGeneration Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#pre_token_generation CognitoUserPool#pre_token_generation}.
         * @return {@code this}
         */
        public Builder preTokenGeneration(java.lang.String preTokenGeneration) {
            this.preTokenGeneration = preTokenGeneration;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getUserMigration}
         * @param userMigration Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#user_migration CognitoUserPool#user_migration}.
         * @return {@code this}
         */
        public Builder userMigration(java.lang.String userMigration) {
            this.userMigration = userMigration;
            return this;
        }

        /**
         * Sets the value of {@link CognitoUserPoolLambdaConfig#getVerifyAuthChallengeResponse}
         * @param verifyAuthChallengeResponse Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_user_pool#verify_auth_challenge_response CognitoUserPool#verify_auth_challenge_response}.
         * @return {@code this}
         */
        public Builder verifyAuthChallengeResponse(java.lang.String verifyAuthChallengeResponse) {
            this.verifyAuthChallengeResponse = verifyAuthChallengeResponse;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CognitoUserPoolLambdaConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CognitoUserPoolLambdaConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CognitoUserPoolLambdaConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CognitoUserPoolLambdaConfig {
        private final java.lang.String createAuthChallenge;
        private final imports.aws.cognito.CognitoUserPoolLambdaConfigCustomEmailSender customEmailSender;
        private final java.lang.String customMessage;
        private final imports.aws.cognito.CognitoUserPoolLambdaConfigCustomSmsSender customSmsSender;
        private final java.lang.String defineAuthChallenge;
        private final java.lang.String kmsKeyId;
        private final java.lang.String postAuthentication;
        private final java.lang.String postConfirmation;
        private final java.lang.String preAuthentication;
        private final java.lang.String preSignUp;
        private final java.lang.String preTokenGeneration;
        private final java.lang.String userMigration;
        private final java.lang.String verifyAuthChallengeResponse;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.createAuthChallenge = software.amazon.jsii.Kernel.get(this, "createAuthChallenge", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.customEmailSender = software.amazon.jsii.Kernel.get(this, "customEmailSender", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolLambdaConfigCustomEmailSender.class));
            this.customMessage = software.amazon.jsii.Kernel.get(this, "customMessage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.customSmsSender = software.amazon.jsii.Kernel.get(this, "customSmsSender", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoUserPoolLambdaConfigCustomSmsSender.class));
            this.defineAuthChallenge = software.amazon.jsii.Kernel.get(this, "defineAuthChallenge", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kmsKeyId = software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.postAuthentication = software.amazon.jsii.Kernel.get(this, "postAuthentication", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.postConfirmation = software.amazon.jsii.Kernel.get(this, "postConfirmation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.preAuthentication = software.amazon.jsii.Kernel.get(this, "preAuthentication", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.preSignUp = software.amazon.jsii.Kernel.get(this, "preSignUp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.preTokenGeneration = software.amazon.jsii.Kernel.get(this, "preTokenGeneration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.userMigration = software.amazon.jsii.Kernel.get(this, "userMigration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.verifyAuthChallengeResponse = software.amazon.jsii.Kernel.get(this, "verifyAuthChallengeResponse", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.createAuthChallenge = builder.createAuthChallenge;
            this.customEmailSender = builder.customEmailSender;
            this.customMessage = builder.customMessage;
            this.customSmsSender = builder.customSmsSender;
            this.defineAuthChallenge = builder.defineAuthChallenge;
            this.kmsKeyId = builder.kmsKeyId;
            this.postAuthentication = builder.postAuthentication;
            this.postConfirmation = builder.postConfirmation;
            this.preAuthentication = builder.preAuthentication;
            this.preSignUp = builder.preSignUp;
            this.preTokenGeneration = builder.preTokenGeneration;
            this.userMigration = builder.userMigration;
            this.verifyAuthChallengeResponse = builder.verifyAuthChallengeResponse;
        }

        @Override
        public final java.lang.String getCreateAuthChallenge() {
            return this.createAuthChallenge;
        }

        @Override
        public final imports.aws.cognito.CognitoUserPoolLambdaConfigCustomEmailSender getCustomEmailSender() {
            return this.customEmailSender;
        }

        @Override
        public final java.lang.String getCustomMessage() {
            return this.customMessage;
        }

        @Override
        public final imports.aws.cognito.CognitoUserPoolLambdaConfigCustomSmsSender getCustomSmsSender() {
            return this.customSmsSender;
        }

        @Override
        public final java.lang.String getDefineAuthChallenge() {
            return this.defineAuthChallenge;
        }

        @Override
        public final java.lang.String getKmsKeyId() {
            return this.kmsKeyId;
        }

        @Override
        public final java.lang.String getPostAuthentication() {
            return this.postAuthentication;
        }

        @Override
        public final java.lang.String getPostConfirmation() {
            return this.postConfirmation;
        }

        @Override
        public final java.lang.String getPreAuthentication() {
            return this.preAuthentication;
        }

        @Override
        public final java.lang.String getPreSignUp() {
            return this.preSignUp;
        }

        @Override
        public final java.lang.String getPreTokenGeneration() {
            return this.preTokenGeneration;
        }

        @Override
        public final java.lang.String getUserMigration() {
            return this.userMigration;
        }

        @Override
        public final java.lang.String getVerifyAuthChallengeResponse() {
            return this.verifyAuthChallengeResponse;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCreateAuthChallenge() != null) {
                data.set("createAuthChallenge", om.valueToTree(this.getCreateAuthChallenge()));
            }
            if (this.getCustomEmailSender() != null) {
                data.set("customEmailSender", om.valueToTree(this.getCustomEmailSender()));
            }
            if (this.getCustomMessage() != null) {
                data.set("customMessage", om.valueToTree(this.getCustomMessage()));
            }
            if (this.getCustomSmsSender() != null) {
                data.set("customSmsSender", om.valueToTree(this.getCustomSmsSender()));
            }
            if (this.getDefineAuthChallenge() != null) {
                data.set("defineAuthChallenge", om.valueToTree(this.getDefineAuthChallenge()));
            }
            if (this.getKmsKeyId() != null) {
                data.set("kmsKeyId", om.valueToTree(this.getKmsKeyId()));
            }
            if (this.getPostAuthentication() != null) {
                data.set("postAuthentication", om.valueToTree(this.getPostAuthentication()));
            }
            if (this.getPostConfirmation() != null) {
                data.set("postConfirmation", om.valueToTree(this.getPostConfirmation()));
            }
            if (this.getPreAuthentication() != null) {
                data.set("preAuthentication", om.valueToTree(this.getPreAuthentication()));
            }
            if (this.getPreSignUp() != null) {
                data.set("preSignUp", om.valueToTree(this.getPreSignUp()));
            }
            if (this.getPreTokenGeneration() != null) {
                data.set("preTokenGeneration", om.valueToTree(this.getPreTokenGeneration()));
            }
            if (this.getUserMigration() != null) {
                data.set("userMigration", om.valueToTree(this.getUserMigration()));
            }
            if (this.getVerifyAuthChallengeResponse() != null) {
                data.set("verifyAuthChallengeResponse", om.valueToTree(this.getVerifyAuthChallengeResponse()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cognito.CognitoUserPoolLambdaConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CognitoUserPoolLambdaConfig.Jsii$Proxy that = (CognitoUserPoolLambdaConfig.Jsii$Proxy) o;

            if (this.createAuthChallenge != null ? !this.createAuthChallenge.equals(that.createAuthChallenge) : that.createAuthChallenge != null) return false;
            if (this.customEmailSender != null ? !this.customEmailSender.equals(that.customEmailSender) : that.customEmailSender != null) return false;
            if (this.customMessage != null ? !this.customMessage.equals(that.customMessage) : that.customMessage != null) return false;
            if (this.customSmsSender != null ? !this.customSmsSender.equals(that.customSmsSender) : that.customSmsSender != null) return false;
            if (this.defineAuthChallenge != null ? !this.defineAuthChallenge.equals(that.defineAuthChallenge) : that.defineAuthChallenge != null) return false;
            if (this.kmsKeyId != null ? !this.kmsKeyId.equals(that.kmsKeyId) : that.kmsKeyId != null) return false;
            if (this.postAuthentication != null ? !this.postAuthentication.equals(that.postAuthentication) : that.postAuthentication != null) return false;
            if (this.postConfirmation != null ? !this.postConfirmation.equals(that.postConfirmation) : that.postConfirmation != null) return false;
            if (this.preAuthentication != null ? !this.preAuthentication.equals(that.preAuthentication) : that.preAuthentication != null) return false;
            if (this.preSignUp != null ? !this.preSignUp.equals(that.preSignUp) : that.preSignUp != null) return false;
            if (this.preTokenGeneration != null ? !this.preTokenGeneration.equals(that.preTokenGeneration) : that.preTokenGeneration != null) return false;
            if (this.userMigration != null ? !this.userMigration.equals(that.userMigration) : that.userMigration != null) return false;
            return this.verifyAuthChallengeResponse != null ? this.verifyAuthChallengeResponse.equals(that.verifyAuthChallengeResponse) : that.verifyAuthChallengeResponse == null;
        }

        @Override
        public final int hashCode() {
            int result = this.createAuthChallenge != null ? this.createAuthChallenge.hashCode() : 0;
            result = 31 * result + (this.customEmailSender != null ? this.customEmailSender.hashCode() : 0);
            result = 31 * result + (this.customMessage != null ? this.customMessage.hashCode() : 0);
            result = 31 * result + (this.customSmsSender != null ? this.customSmsSender.hashCode() : 0);
            result = 31 * result + (this.defineAuthChallenge != null ? this.defineAuthChallenge.hashCode() : 0);
            result = 31 * result + (this.kmsKeyId != null ? this.kmsKeyId.hashCode() : 0);
            result = 31 * result + (this.postAuthentication != null ? this.postAuthentication.hashCode() : 0);
            result = 31 * result + (this.postConfirmation != null ? this.postConfirmation.hashCode() : 0);
            result = 31 * result + (this.preAuthentication != null ? this.preAuthentication.hashCode() : 0);
            result = 31 * result + (this.preSignUp != null ? this.preSignUp.hashCode() : 0);
            result = 31 * result + (this.preTokenGeneration != null ? this.preTokenGeneration.hashCode() : 0);
            result = 31 * result + (this.userMigration != null ? this.userMigration.hashCode() : 0);
            result = 31 * result + (this.verifyAuthChallengeResponse != null ? this.verifyAuthChallengeResponse.hashCode() : 0);
            return result;
        }
    }
}
