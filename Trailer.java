package laba2;

//класс Trailer наследуется от базового класса Transport 
public class Trailer extends Transport{

	//конструктор
	public Trailer(String mark, String model, int max_mass, int number_of_passenders, int max_speed, int max_speed_in_city) {
		super(mark, model, max_mass, number_of_passenders, max_speed,max_speed_in_city);
	}
	
	//переопределяем функцию для формирования строки из базового класса
	@Override
	public String GetProperties() {
		return "Прицеп" + '\n' + super.GetProperties();
	}
}
