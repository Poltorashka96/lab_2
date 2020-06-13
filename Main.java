package laba2;

/*Разработать иерархию классов – транспортных средств: мотоцикл, автомобиль, грузовик,
автобус, прицеп. У объектов – ТС имеются следующие свойства: марка, модель, максимальная допустимая масса перевозимого груза, кол-во пассажиров, максимальная скорость.
2. Задать методы, с помощью которых можно получить значения свойств.
3. Разработать программу для демонстрации классов.
Необходимо учесть, что у ТС с прицепом общая допустимая снаряженная масса состоит из суммы
значений буксирующего ТС и прицепа. Так же необходимо учесть, что по ПДД максимальная разрешенная скорость ТС с прицепом по на 20км/ч чем без него.*/

public class Main {

	public static void main(String[] args) {
		
		//cоздание объектов класса
		Motorcycle motorcycle = new Motorcycle("Suzuki", "Katana", 150, 2, 210, 60);
		Car car = new Car("Honda", "Civic", 200, 5, 195, 60);
		Track track = new Track("Hyundai", "Mighty", 5000, 3, 119, 60);
		Bus bus = new Bus("ГолАЗ", "4244", 2000, 33, 105, 60);
		Trailer trailer = new Trailer("САЗ", "8299", 550, 0, 0, 0);
		
		//вывод на экран данных о транспортных средствах без прицепа
		System.out.print("Транспортные средства без прицепа: " + '\n' + '\n');
		System.out.print(motorcycle.GetProperties());
		System.out.print(car.GetProperties());
		System.out.print(track.GetProperties());
		System.out.print(bus.GetProperties());
		
		//вывод на экран данных о транспортных средствах c прицепом
		System.out.print("Транспортные средства с прицепом: " + '\n' + '\n');
		System.out.print("Информация о прицепе : " + '\n' + '\n');
		System.out.print(trailer.GetProperties());
		motorcycle.AddTrailer(trailer);
		System.out.print(motorcycle.GetProperties());
		car.AddTrailer(trailer);
		System.out.print(car.GetProperties());
		track.AddTrailer(trailer);
		System.out.print(track.GetProperties());
		bus.AddTrailer(trailer);
		System.out.print(bus.GetProperties());
	}

}
