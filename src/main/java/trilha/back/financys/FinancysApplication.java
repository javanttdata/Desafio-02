package trilha.back.financys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import trilha.back.financys.entities.Category;
import trilha.back.financys.entities.Entry;

@SpringBootApplication
public class FinancysApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancysApplication.class, args);

		Category categoria1 = new Category(1, "Lazer", "gamepass");

		Category categoria2 = new Category();
			categoria2.setId(2);
			categoria2.setName("Salário");
			categoria2.setDescription("Recebimento de Salário");

		Entry lançamento1 = new Entry(3, "mensalidade", "gamepass", "despesa", "29,9",
				"10/10/2021", true,1 );

		Entry lançamento2 = new Entry();
			lançamento2.setId(4);
			lançamento2.setName("Salário da Empresa X");
			lançamento2.setDescription("40% do salário");
			lançamento2.setType("receita");
			lançamento2.setAmount("R$ 3000,00");
			lançamento2.setDate("15/10/2021");
			lançamento2.setPaid(true);
			lançamento2.setCategoryId(2);

		System.out.println(categoria1);
		System.out.println(categoria2);
		System.out.println(lançamento1);
		System.out.println(lançamento2);

		}

}

