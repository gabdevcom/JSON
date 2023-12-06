import com.fasterxml.jackson.databind.ObjectMapper;


public class TesteJSON {

	public static void main(String[] args) {
		try {
			ObjectMapper objeto = new ObjectMapper();
			Pessoa p1 = new Pessoa("Taylor", 33); //objt para utilizar na serealização
			String json = objeto.writeValueAsString(p1);
			System.out.println("Objeto serializado");
			System.out.println(json);
			Pessoa desPessoa = objeto.readValue(json, Pessoa.class);
			System.out.println("JSON disserializado para obj Pessoa");
			System.out.println("Nome: " +  desPessoa.getNome());
			System.out.println("Idade: " + desPessoa.getIdade());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
