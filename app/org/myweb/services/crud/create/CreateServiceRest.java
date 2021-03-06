package org.myweb.services.crud.create;

import com.fasterxml.jackson.databind.JsonNode;
import org.jetbrains.annotations.NotNull;
import org.myweb.db.DaoObject;
import org.myweb.services.RestServiceResult;

public interface CreateServiceRest {
    @NotNull
    public RestServiceResult create(@NotNull Class<? extends DaoObject> clazz, @NotNull JsonNode jsContent);
}
