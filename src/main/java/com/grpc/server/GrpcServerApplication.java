
package com.grpc.server;

import java.io.IOException;

import com.grpc.server.service.UserService;

//import com.grpc.server.service.UserService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

//@SpringBootApplication
public class GrpcServerApplication {

	public static void main(String[] args) { //
		// SpringApplication.run(GrpcServerApplication.class, args);

		try {
			Server server = ServerBuilder.forPort(8999).addService(new UserService()).build();

			server.start();
			System.out.println("Server started at " + server.getPort());
			server.awaitTermination();
		} catch (IOException e) {
			System.out.println("Error: " + e);
		} catch (InterruptedException e) {
			System.out.println("Error: " + e);
		}

	}

}
