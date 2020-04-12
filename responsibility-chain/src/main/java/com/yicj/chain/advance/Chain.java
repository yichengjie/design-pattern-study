package com.yicj.chain.advance;

import java.util.List;

public class Chain {

    private List<ChainHandler> handlers ;
    private int index = 0 ;

    public Chain(List<ChainHandler> handlers){
        this.handlers = handlers ;
    }

    public void proceed(Request request, Response response){
        if (index >= handlers.size()) {
            return;
        }
        handlers.get(index++).execute(request, response, this);
    }

}
