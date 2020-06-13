package laba2;

//класс Track наследуется от базового класса Transport 
public class Track extends Transport {

	//конструктор
	public Track(String mark, String model, int max_mass, int number_of_passenders, int max_speed, int max_speed_in_city) {
		super(mark, model, max_mass, number_of_passenders, max_speed, max_speed_in_city);
	}
	
	//переопределяем функцию для формирования строки из базового класса
	@Override
	public String GetProperties() {
		return "Грузовик" + '\n' + super.GetProperties();
	}
	//функция для добавления прицепа
	@Override
	public void AddTrailer(Trailer trailer) {
		super.AddTrailer(trailer);
	}
}
