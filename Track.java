package laba2;

//����� Track ����������� �� �������� ������ Transport 
public class Track extends Transport {

	//�����������
	public Track(String mark, String model, int max_mass, int number_of_passenders, int max_speed, int max_speed_in_city) {
		super(mark, model, max_mass, number_of_passenders, max_speed, max_speed_in_city);
	}
	
	//�������������� ������� ��� ������������ ������ �� �������� ������
	@Override
	public String GetProperties() {
		return "��������" + '\n' + super.GetProperties();
	}
	//������� ��� ���������� �������
	@Override
	public void AddTrailer(Trailer trailer) {
		super.AddTrailer(trailer);
	}
}
