package laba2;

//����� Trailer ����������� �� �������� ������ Transport 
public class Trailer extends Transport{

	//�����������
	public Trailer(String mark, String model, int max_mass, int number_of_passenders, int max_speed, int max_speed_in_city) {
		super(mark, model, max_mass, number_of_passenders, max_speed,max_speed_in_city);
	}
	
	//�������������� ������� ��� ������������ ������ �� �������� ������
	@Override
	public String GetProperties() {
		return "������" + '\n' + super.GetProperties();
	}
}
