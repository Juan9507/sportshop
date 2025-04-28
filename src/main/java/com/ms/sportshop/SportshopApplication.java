package com.ms.sportshop;

import com.ms.sportshop.servicios.usuario.UsuarioServicio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SportshopApplication implements CommandLineRunner {

	private final UsuarioServicio usuarioServicio;

    public SportshopApplication(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    public static void main(String[] args) {
		SpringApplication.run(SportshopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		usuarioServicio.obtenerTodos()
				.subscribe();
	}
}
