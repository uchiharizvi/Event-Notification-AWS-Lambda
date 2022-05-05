package com.hpamp.eventnotificationms.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class ServiceHandler implements RequestHandler<String, Object> {
    @Override
    public Object handleRequest(String s, Context context) {
        context.getLogger().log("Input : " + s);
        return "Lambda Function is invoked...." + s;
    }
}
