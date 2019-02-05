import java.util.*;
import java.io.*;

public class Concrete {
	// Member-variables
	private String concrete_type;
	private String cement_type;
	private double cement_quant;
	private String portland_cement_type;
	private double portland_cement_quant;
	private double water_quant;
	private double sand_quant;
	private double crushed_stone_quant;
	private double rubble_quant;
	private double silica_fume_quant;
	private double perlit_quant;
	private double termozit_quant;

	// Constructor
	public Concrete() {
		this.concrete_type = null;
		this.cement_type = null;
		this.cement_quant = 0.00;
		this.portland_cement_type = null;
		this.portland_cement_quant = 0.00;
		this.water_quant = 0.00;
		this.sand_quant = 0.00;
		this.crushed_stone_quant = 0.00;
		this.rubble_quant = 0.00;
		this.silica_fume_quant = 0.00;
		this.perlit_quant = 0.00;
		this.termozit_quant = 0.00;
	}

	// Set method for Concrete type
	public void setConcreteType(String concrete_t) {
		this.concrete_type = concrete_t;
	}

	// Set method for Cement type
	public void setCementeType(String cement_t) {
		this.cement_type = cement_t;
	}

	// Set method for Cement quantity
	public void setCementQuant(double cement_q) {
		this.cement_quant = cement_q;
	}

	// Set method for Portland cement type
	public void setPortlandCementType(String portland_cement_t) {
		this.portland_cement_type = portland_cement_t;
	}

	// Set method for Portland cement quantity
	public void setPortlandCementQuant(double portland_cement_q) {
		this.portland_cement_quant = portland_cement_q;
	}

	// Set method for Water quantity
	public void setWaterQuant(double water_q) {
		this.water_quant = water_q;
	}

	// Set method for Sand quantity
	public void setSandQuant(double sand_q) {
		this.sand_quant = sand_q;
	}

	// Set method for Crushed stone quantity
	public void setCrushedStoneQuant(double crushed_stone_q) {
		this.crushed_stone_quant = crushed_stone_q;
	}

	// Set method for Ruble quantity
	public void setRubbleQuant(double rubble_q) {
		this.rubble_quant = rubble_q;
	}

	// Set method for Silica fume quantity
	public void setSilicaFumeQuant(double silica_fume_q) {
		this.silica_fume_quant = silica_fume_q;
	}

	// Set method for Perlit quantity
	public void setPerlitQuant(double perlit_q) {
		this.perlit_quant = perlit_q;
	}

	// Set method for Termozit quantity
	public void setTermozitQuant(double termozit_q) {
		this.termozit_quant = termozit_q;
	}

	// Get method for Concrete type
	public String getConcreteType() {
		return this.concrete_type;
	}

	// Get method for Cement type
	public String getCementType() {
		return this.cement_type;
	}

	// Get method for Cement quantity
	public double getCementQuant() {
		return this.cement_quant;
	}

	// Get method for Portland cement type
	public String getPortlandCementType() {
		return this.portland_cement_type;
	}

	// Get method for Portland cement quantity
	public double getPortlandCementQuant() {
		return this.portland_cement_quant;
	}

	// Get method for Water quantity
	public double getWaterQuant() {
		return this.water_quant;
	}

	// Get method for Sand quantity
	public double getSandQuant() {
		return this.sand_quant;
	}

	// Get method for Crushed stone quantity
	public double getCrushedStoneQuant() {
		return this.crushed_stone_quant;
	}

	// Get method for Ruble quantity
	public double getRubbleQuant() {
		return this.rubble_quant;
	}

	// Get method for Silica fume quantity
	public double getSilicaFumeQuant() {
		return this.silica_fume_quant;
	}

	// Get method for Perlit quantity
	public double getPerlitQuant() {
		return this.perlit_quant;
	}

	// Get method for Termozit quantity
	public double getTermozitQuant() {
		return this.termozit_quant;
	}

	// Method "calculate" for calculate total value
	public double calculate() {
		double total;
		total = this.getCementQuant() + this.getPortlandCementQuant()
				+ this.getWaterQuant() + this.getSandQuant()
				+ this.getCrushedStoneQuant() + this.getRubbleQuant()
				+ this.getSilicaFumeQuant() + this.getPerlitQuant()
				+ this.getTermozitQuant();
		return total;
	}

	public static void main(String[] args) throws IOException {
		Concrete conc = new Concrete();
		int choice;
		Scanner sc = new Scanner(System.in);
		File out=new File(".\\data\\output.txt");
		out.createNewFile();
		PrintStream output=new PrintStream(out,"UTF-8");
		String con_t, cement_t, port_cement_t;
		double cement_q, port_cement_q, water_q, sand_q, crushed_stone_q, rubble_q, silica_fume_q, perlit_q, termozit_q;
		double total_result;
		System.out.println("Моля въведете типа бетона, който ще се произвежда:");
		System.out.println("1 - Дребнозърнест");
		System.out.println("2 - Среднозърнест");
		System.out.println("3 - Едрозърнест");
		choice=sc.nextInt();
		switch (choice) {
		case 1:
			con_t = "Дребнозърнест";
			conc.setConcreteType(con_t);
			break;
		case 2:
			con_t = "Среднозърнест";
			conc.setConcreteType(con_t);
			break;
		case 3:
			con_t = "Едрозърнест";
			conc.setConcreteType(con_t);
			break;
		default:
			System.out.println("Въведена е грешна стойност за типа на бетона.");
		}
		System.out.println("Въведете вида на използвания вид цимент:");
		System.out.println("1 - Пуцоланов");
		System.out.println("2 - Шлаков");
		System.out.println("3 - Глиноземен");
		System.out.println("4 - Цветен");
		System.out.println("5 - Сулфатно-устойчив");
		System.out.println("6 - Нискотермичен");
		choice=sc.nextInt();
		switch (choice) {
		case 1:
			cement_t = "Пуцоланов";
			conc.setCementeType(cement_t);
			break;
		case 2:
			cement_t = "Шлаков";
			conc.setCementeType(cement_t);
			break;
		case 3:
			cement_t = "Глиноземен";
			conc.setCementeType(cement_t);
			break;
		case 4:
			cement_t = "Цветен";
			conc.setCementeType(cement_t);
			break;
		case 5:
			cement_t = "Сулфатно-устойчив";
			conc.setCementeType(cement_t);
			break;
		case 6:
			cement_t = "Нискотермичен";
			conc.setCementeType(cement_t);
			break;
		default:
			System.out.println("Въведена е грешна стойност за вида на цимента.");
		}
		System.out.print("Въведете количеството на цимента:");
		cement_q=sc.nextDouble();
		conc.setCementQuant(cement_q);
		System.out.println("Въведете вида на Портландцимента:");
		System.out.println("1 - Пуцоланов");
		System.out.println("2 - Шлаков");
		System.out.println("3 - Бял");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			port_cement_t="Пуцоланов";
			conc.setPortlandCementType(port_cement_t);
			break;
		case 2:
			port_cement_t="Шлаков";
			conc.setPortlandCementType(port_cement_t);
			break;
		case 3:
			port_cement_t="Бял";
			conc.setPortlandCementType(port_cement_t);
			break;
		default:
			System.out.println("Въведена е грешна стойност за вида на портландцимента.");
		}
		System.out.print("Въведете количеството на портландцимента:");
		port_cement_q=sc.nextDouble();
		conc.setPortlandCementQuant(port_cement_q);
		System.out.print("Въведете необходимото количество вода:");
		water_q=sc.nextDouble();
		conc.setWaterQuant(water_q);
		System.out.print("Въведете количеството на пясъка:");
		sand_q=sc.nextDouble();
		conc.setSandQuant(sand_q);
		System.out.print("Въведете количество трошен камък:");
		crushed_stone_q=sc.nextDouble();
		conc.setCrushedStoneQuant(crushed_stone_q);
		System.out.print("Въведете количество чакъл:");
		rubble_q=sc.nextDouble();
		conc.setRubbleQuant(rubble_q);
		System.out.print("Въведете количеството на използвания микросилициев прах:");
		silica_fume_q=sc.nextDouble();
		conc.setSilicaFumeQuant(silica_fume_q);
		System.out.print("Въведете количество перлит:");
		perlit_q=sc.nextDouble();
		conc.setPerlitQuant(perlit_q);
		System.out.print("Въведете количество термозит:");
		termozit_q=sc.nextDouble();
		conc.setTermozitQuant(termozit_q);
		sc.close();
		total_result=conc.calculate();
		output.print("Типа на бетона е - ");
		output.println(conc.getConcreteType());
		output.print("Вида на използвания цимент - ");
		output.println(conc.getCementType());
		output.print("Количество цимент - ");
		output.println(conc.getCementQuant());
		output.print("Вид на Портландцимент - ");
		output.println(conc.getPortlandCementType());
		output.print("Количество Портландцимент - ");
		output.println(conc.getPortlandCementQuant());
		output.print("Количество вода - ");
		output.println(conc.getWaterQuant());
		output.print("Количество пясък - ");
		output.println(conc.getSandQuant());
		output.print("Количество трошен камък - ");
		output.println(conc.getCrushedStoneQuant());
		output.print("Количество чакъл - ");
		output.println(conc.getRubbleQuant());
		output.print("Количество микросилициев прах - ");
		output.println(conc.getSilicaFumeQuant());
		output.print("Количество перлит - ");
		output.println(conc.getPerlitQuant());
		output.print("Количество термозит - ");
		output.println(conc.getTermozitQuant());
		output.printf("Общото количество материали за производство на бетон е %f", total_result);
		output.close();
	}

}
