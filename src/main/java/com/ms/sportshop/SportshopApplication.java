package com.ms.sportshop;

import com.ms.sportshop.servicios.compra.CompraServicio;
import com.ms.sportshop.servicios.factura.FacturaServicio;
import com.ms.sportshop.servicios.notificacion.NotificacionServicio;
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
	private final NotificacionServicio notificacionServicio;
	private final FacturaServicio facturaServicio;

    public SportshopApplication(UsuarioServicio usuarioServicio, ProductoServicio productoServicio, CompraServicio compraServicio, NotificacionServicio notificacionServicio, FacturaServicio facturaServicio) {
        this.usuarioServicio = usuarioServicio;
        this.productoServicio = productoServicio;
        this.compraServicio = compraServicio;
        this.notificacionServicio = notificacionServicio;
        this.facturaServicio = facturaServicio;
    }

    public static void main(String[] args) {
		SpringApplication.run(SportshopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		facturaServicio.obtenerTodos()
				.subscribe();
	}
}
