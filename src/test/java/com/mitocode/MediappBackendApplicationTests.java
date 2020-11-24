package com.mitocode;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.mitocode.model.Usuario;
import com.mitocode.repo.IUsuarioRepo;

@SpringBootTest
class MediappBackendApplicationTests {

	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@Autowired
	private IUsuarioRepo repo;
	
	@Test
	void verificarClave() {
		Usuario us = new Usuario();
		us.setIdUsuario(2);
		us.setUsername("andressomu@gmail.com");
		us.setPassword(bcrypt.encode("123"));
		us.setEnabled(true);
		
		Usuario retorno = repo.save(us);
		
		assertTrue(retorno.getPassword().equalsIgnoreCase(us.getPassword()));
	} 
	
	@Test
	void lulo() {
		Random r = new Random();
		
		int n1 = r.nextInt(999)+1;
		int n2 = r.nextInt(999)+1;
		int n3 = r.nextInt(999)+1;
		
		System.out.println("suma 1: "+n1+" + "+n2+" + "+n3);
		
		boolean s1 = r.nextBoolean();
		boolean s2 = r.nextBoolean();
		
		System.out.println("s1");
		System.out.println(s1);
		
		System.out.println("s2");
		System.out.println(s2);
		
		if(!s1) {
			n2 *=-1;
			System.out.println("n2 = "+n2);
		}
		
		if(!s2) {
			n3 *=-1;
			System.out.println("n3 = "+n3);
		}
		System.out.println("suma 2: "+n1+" + "+n2+" + "+n3);
		int res = n1 + n2 + n3;
		
		System.out.println(res);
		
			Long ticks = 20L;
			Long i = ticks*60* (r.nextInt(30)+10);
		
			System.out.println(i);
		
			System.out.println(i/20);
			
			System.out.println((i/20)/60);
	}
}
