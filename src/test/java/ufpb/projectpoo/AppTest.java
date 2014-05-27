package ufpb.projectpoo;

import org.junit.*;


public class AppTest {
	
	@Test
	public void testeAluno () {
		
		Aluno aluno = new Aluno();
		aluno.setCpf("12345678909");
		aluno.setNome("Maria");
		aluno.setSexo(false);
		aluno.setSobrenome("Fandas");
		assertEquals("12345678909", aluno.getCpf());
		assertEquals("Maria", aluno.getNome());
		assertFalse(aluno.isSexo());
		assertEquals("Fandas", aluno.getSobrenome());
		
		Assert.assertTrue(true);
	}

	private void assertFalse(Object sexo) {
		// TODO Auto-generated method stub
		
	}

	private void assertEquals(String string, String cpf) {
		// TODO Auto-generated method stub
		
	}
	
	
}
	
	
	
	