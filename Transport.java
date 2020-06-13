package laba2;

//Базовый класс объявляется абстрактным, это значит, что его методы так же являются абстрактными (аналогия виртуальных функций в С++), 
//т.е. методы объявляются в базовых классах, а в классах-наследниках  могут переопределяться
public abstract class Transport {
	//объявление экземпляров класа происходит в базовом класе, остальные классы будут их наследовать
	//Экземпляры класса имеют спецификатор private, это значит, что доступ к ним будет доступен только из самого класса
	private String mark;
	private String model;
	private int max_mass;
	private int number_of_passenders;
	private int max_speed;
	private int max_speed_in_city;
	private Trailer trailer;
	
	//конструктор
	//ключевое слово this является ссылкой на экземпляр класса, используя его мы указываем на то, что обращаемся
	//именно к экземпляру класса, а не к другой переменной с таким же именем
	public Transport (String mark, String model, int max_mass, int number_of_passenders, int max_speed, int max_speed_in_city) {
		this.mark = mark;
		this.model = model;
		this.max_mass = max_mass;
		this.number_of_passenders = number_of_passenders;
		this.max_speed = max_speed;
		this.max_speed_in_city = max_speed_in_city;
	}
	
	//Методы для получения наших свойств. Т.к. они приватные, мы не можем получить к ним доступ просто так,
	//поэтому мы создаем функцию, которая возвращает значения, чтобы потом получить их через нее 
	public String GetMark() {
		return mark;
	}
	
	public String GetModel() {
		return model;
	}
	
	public int GetMaxMass() {
		if (trailer == null) return max_mass;
		else return max_mass + trailer.GetMaxMass();
	}
	
	public  int GetNumberOfPassenders() {
		return number_of_passenders;
	}
	
	public int GetMaxSpeed() {
		 return max_speed;
	}
	
	public int GetMaxSpeedInCity() {
		if (trailer == null) return max_speed_in_city;
		else return max_speed_in_city - 20;
	}
	
	//Функция, которая формирует, а затем возвращает строку, в которой будут содержаться выходные данные
	public String GetProperties() {
		String properties = "Марка: " + GetMark() + '\n' + "Модель: " + GetModel() + '\n'
				+ "Максимальная допустимая масса перевозимого груза: " + GetMaxMass() + " кг" + '\n'
				+ "Количество пассажиров: " + GetNumberOfPassenders() + '\n' 
				+ "Максимальная скорость: " + GetMaxSpeed() + " км/ч" + '\n'
				+ "Максимально разрешенная скорость движения  по городу: " + GetMaxSpeedInCity() + " км/ч" + '\n'
				+ "#######################################################" + '\n';
		return properties;
	}
	
	//функция для добавления прицепа
	public void AddTrailer(Trailer trailer) {
		this.trailer = trailer;
		
	}
}
