package com.volyx.rpc.json;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.volyx.rpc.common.Response;
import com.volyx.rpc.common.Result;

import java.lang.reflect.Type;

public class ResponseSerializer implements JsonSerializer<Response> {
    @Override
    public JsonElement serialize(Response response, Type type, JsonSerializationContext ctx) {
        JsonObject result = new JsonObject();
        result.addProperty("id", response.getId());
        result.addProperty("type", response.getType());
        result.addProperty("status", response.getStatus());
        result.add("result", ctx.serialize(response.getResult(), Result.class));
        result.addProperty("exception", response.getException());
        result.addProperty("duration", response.getDuration());
        return result;
    }
}
