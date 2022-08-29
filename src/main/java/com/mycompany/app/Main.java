package com.mycompany.app;

import com.hashicorp.cdktf.App;
import com.hashicorp.cdktf.NamedRemoteWorkspace;
import com.hashicorp.cdktf.RemoteBackend;
import com.hashicorp.cdktf.RemoteBackendProps;
import com.hashicorp.cdktf.S3Backend;
import com.hashicorp.cdktf.S3BackendProps;
import com.hashicorp.cdktf.TerraformStack;
import com.hashicorp.cdktf.providers.aws.s3.S3AccessPoint;

public class Main
{
    public static void main(String[] args) {
        final App app = new App();
        TerraformStack stack = new MainStack(app, "aws_instance");
        new S3Backend(stack, S3BackendProps.builder()
        .bucket("lakshmi-backend-tfstate")
        .region("us-east-1")
        .key("aws-ec2/cdktf.out/stacks/aws_instance/.terraform/terraform.tfstate")
        //.accessKey("AKIA6KM4N44X3JGU7NFM")
        //.secretKey("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")
        .build());

    /*   new RemoteBackend(stack, RemoteBackendProps.builder()
            .hostname("app.terraform.io")
            .organization("lakshmi-www-prod")
            .workspaces(new NamedRemoteWorkspace("aws-ec2"))
            .token("iMMTI31yakiqEg.atlasv1.oUhetAJHwiI1y5O94MpIIZIUHxmJaS9M2DGRRVdkkKXhlKI6wiwTr1FWMx2yQspKt5c")
            .build());
            */

        app.synth();
    }
}