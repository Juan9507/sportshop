package com.ms.sportshop;

import com.ms.sportshop.servicios.compra.CompraServicio;
import com.ms.sportshop.servicios.producto.ProductoServicio;
import com.ms.sportshop.servicios.usuario.UsuarioServicio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SportshopApplication implements CommandLineRunner {

	private final UsuarioServicio usuarioServicio;
	private final ProductoServicio productoServicio;
	private final CompraServicio compraServicio;

    public SportshopApplication(UsuarioServicio usuarioServicio, ProductoServicio productoServicio, CompraServicio compraServicio) {
        this.usuarioServicio = usuarioServicio;
        this.productoServicio = productoServicio;
        this.compraServicio = compraServicio;
    }

    public static void main(String[] args) {
		SpringApplication.run(SportshopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		compraServicio.obtenerTodos()
				.subscribe();
	}
}
