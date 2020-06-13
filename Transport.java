package laba2;

//������� ����� ����������� �����������, ��� ������, ��� ��� ������ ��� �� �������� ������������ (�������� ����������� ������� � �++), 
//�.�. ������ ����������� � ������� �������, � � �������-�����������  ����� ����������������
public abstract class Transport {
	//���������� ����������� ����� ���������� � ������� �����, ��������� ������ ����� �� �����������
	//���������� ������ ����� ������������ private, ��� ������, ��� ������ � ��� ����� �������� ������ �� ������ ������
	private String mark;
	private String model;
	private int max_mass;
	private int number_of_passenders;
	private int max_speed;
	private int max_speed_in_city;
	private Trailer trailer;
	
	//�����������
	//�������� ����� this �������� ������� �� ��������� ������, ��������� ��� �� ��������� �� ��, ��� ����������
	//������ � ���������� ������, � �� � ������ ���������� � ����� �� ������
	public Transport (String mark, String model, int max_mass, int number_of_passenders, int max_speed, int max_speed_in_city) {
		this.mark = mark;
		this.model = model;
		this.max_mass = max_mass;
		this.number_of_passenders = number_of_passenders;
		this.max_speed = max_speed;
		this.max_speed_in_city = max_speed_in_city;
	}
	
	//������ ��� ��������� ����� �������. �.�. ��� ���������, �� �� ����� �������� � ��� ������ ������ ���,
	//������� �� ������� �������, ������� ���������� ��������, ����� ����� �������� �� ����� ��� 
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
	
	//�������, ������� ���������, � ����� ���������� ������, � ������� ����� ����������� �������� ������
	public String GetProperties() {
		String properties = "�����: " + GetMark() + '\n' + "������: " + GetModel() + '\n'
				+ "������������ ���������� ����� ������������ �����: " + GetMaxMass() + " ��" + '\n'
				+ "���������� ����������: " + GetNumberOfPassenders() + '\n' 
				+ "������������ ��������: " + GetMaxSpeed() + " ��/�" + '\n'
				+ "����������� ����������� �������� ��������  �� ������: " + GetMaxSpeedInCity() + " ��/�" + '\n'
				+ "#######################################################" + '\n';
		return properties;
	}
	
	//������� ��� ���������� �������
	public void AddTrailer(Trailer trailer) {
		this.trailer = trailer;
		
	}
}
