package com.yicj.chain.advance;

public abstract class ChainHandler {

    public void execute(Request request, Response response, Chain chain){
        this.handleProcess();
        chain.proceed(request, response);
    }

    protected abstract void handleProcess() ;
}
