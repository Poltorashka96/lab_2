package laba2;

//класс Motorcycle наследуется от базового класса Transport 
public class Motorcycle extends Transport{

	//конструктор
	public Motorcycle(String mark, String model, int max_mass, int number_of_passenders, int max_speed, int max_speed_in_city) {
		super(mark, model, max_mass, number_of_passenders, max_speed, max_speed_in_city);
	}
	
	//переопределяем функцию для формирования строки из базового класса
	@Override
	public String GetProperties() {
		return "Мотоцикл" + '\n' + super.GetProperties();
	}
	
	//функция для добавления прицепа
	@Override
	public void AddTrailer(Trailer trailer) {
		super.AddTrailer(trailer);
	}
}
