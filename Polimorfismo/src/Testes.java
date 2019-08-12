public class Testes {
	
	public static void main (String[] args) { 
	    Tecnologo tec = new Tecnologo();
		tec.setDescricao("Curso Tecnico");
		tec.setPeriodo(4);
		System.out.println(tec.exibirMedia(5.5, 7.0));
		tec.calcularMensalidade(1.5);
		tec.setPlanoEstendido(true);
		System.out.println(tec.getTudo());
		
		Bacharelado bac = new Bacharelado(); 
		bac.setDescricao("Curso de 4 anos de duração");
		bac.setPeriodo(8);
		System.out.println(bac.exibirMedia(2.0, 5.0));
		bac.setProjetoConclusao("Filosofia das Borboletas");
		bac.setCargaHorariaEstagio(20);
		bac.calcularMensalidade(1.5);
		System.out.println(bac.getTudo());
		
		Medio med = new Medio(); 
		med.setDescricao("Curso tecnico de 3 anos");
		med.setPeriodo(6);
		System.out.println(med.exibirMedia(8.0, 2.0, 4.0, 6.0));
		med.setTipo("Tecnico");
		med.calcularMensalidade(1.5);
		System.out.println(med.getTudo());
		
		
	}
}
