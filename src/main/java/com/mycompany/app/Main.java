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
        /*new S3Backend(stack, S3BackendProps.builder()
        .bucket("lakshmi-tfstate")
        .region("us-east-1")
        .build());*/
        new RemoteBackend(stack, RemoteBackendProps.builder()
            .hostname("app.terraform.io")
            .organization("lakshmi-www-prod")
            .workspaces(new NamedRemoteWorkspace("aws-ec2"))
            .token("Zn54BEPUOs0YYQ.atlasv1.DobGOLLLbL51DCidu5La9CQ4EDHi6Lsi21Oo5cXACOd97SvBRqS31jPyBmBME80uBeA")
            .build());

        app.synth();
    }
}
