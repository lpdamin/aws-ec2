package com.mycompany.app;

import software.constructs.Construct;

import com.hashicorp.cdktf.TerraformStack;
import com.hashicorp.cdktf.TerraformOutput;

import com.hashicorp.cdktf.providers.aws.AwsProvider;
import com.hashicorp.cdktf.providers.aws.ec2.Instance;

public class MainStack extends TerraformStack
{
    public MainStack(final Construct scope, final String id) {
        super(scope, id);

        AwsProvider.Builder.create(this, "AWS")
          .region("us-east-1")
          .build();

        Instance instance = Instance.Builder.create(this, "compute")
          .ami("ami-05fa00d4c63e32376")
          .instanceType("t2.micro")
          .build();
        

        TerraformOutput.Builder.create(this, "public_ip")
          .value(instance.getPublicIp())
          .build();
    }
}

