package laba2;

/*����������� �������� ������� � ������������ �������: ��������, ����������, ��������,
�������, ������. � �������� � �� ������� ��������� ��������: �����, ������, ������������ ���������� ����� ������������ �����, ���-�� ����������, ������������ ��������.
2. ������ ������, � ������� ������� ����� �������� �������� �������.
3. ����������� ��������� ��� ������������ �������.
���������� ������, ��� � �� � �������� ����� ���������� ����������� ����� ������� �� �����
�������� ������������ �� � �������. ��� �� ���������� ������, ��� �� ��� ������������ ����������� �������� �� � �������� �� �� 20��/� ��� ��� ����.*/

public class Main {

	public static void main(String[] args) {
		
		//c������� �������� ������
		Motorcycle motorcycle = new Motorcycle("Suzuki", "Katana", 150, 2, 210, 60);
		Car car = new Car("Honda", "Civic", 200, 5, 195, 60);
		Track track = new Track("Hyundai", "Mighty", 5000, 3, 119, 60);
		Bus bus = new Bus("�����", "4244", 2000, 33, 105, 60);
		Trailer trailer = new Trailer("���", "8299", 550, 0, 0, 0);
		
		//����� �� ����� ������ � ������������ ��������� ��� �������
		System.out.print("������������ �������� ��� �������: " + '\n' + '\n');
		System.out.print(motorcycle.GetProperties());
		System.out.print(car.GetProperties());
		System.out.print(track.GetProperties());
		System.out.print(bus.GetProperties());
		
		//����� �� ����� ������ � ������������ ��������� c ��������
		System.out.print("������������ �������� � ��������: " + '\n' + '\n');
		System.out.print("���������� � ������� : " + '\n' + '\n');
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
