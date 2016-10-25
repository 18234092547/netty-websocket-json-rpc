package com.volyx.websocketx.handler;

import com.volyx.websocketx.common.Handler;
import com.volyx.websocketx.common.RequestImpl;
import com.volyx.websocketx.common.Result;
import com.volyx.websocketx.repository.ClientRepository;

import javax.annotation.Nonnull;

public class GetClientHandler implements Handler {
    @Nonnull
    @Override
    public Result execute(@Nonnull RequestImpl request) {
        return new Result<>(ClientRepository.getInstance().getClientInfos());
    }

    @Nonnull
    @Override
    public String getName() {
        return "getclient";
    }
}
