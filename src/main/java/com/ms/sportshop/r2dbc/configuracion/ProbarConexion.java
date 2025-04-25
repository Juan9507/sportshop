package com.ms.sportshop.r2dbc.configuracion;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Component;

@Slf4j
@AllArgsConstructor
@Component
public class ProbarConexion {
    private final DatabaseClient dbClient;

    @EventListener(ApplicationReadyEvent.class)
    public void checkConnection() {
        dbClient.sql("SELECT 1").fetch().first()
                .subscribe(
                        result -> log.info("¡Conexión verificada!"),
                        err -> log.info("Fallo: {}", err.getMessage())
                );
    }

}

