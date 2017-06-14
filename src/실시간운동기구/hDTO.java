package 실시간운동기구;

public class hDTO {

	private String 운동기구; 
	private String 사용여부;
	
	public hDTO() {
		super();
	}

	public hDTO(String 운동기구, String 사용여부) {
		super();
		this.운동기구 = 운동기구;
		this.사용여부 = 사용여부;
	}
	
	public String get운동기구() {
		return 운동기구;
	}
	public void set운동기구(String 운동기구) {
		this.운동기구 = 운동기구;
	}
	public String get사용여부() {
		return 사용여부;
	}
	public void set사용여부(String 사용여부) {
		this.사용여부 = 사용여부;
	}

	@Override
	public String toString() {
		return "hDTO [운동기구=" + 운동기구 + ", 사용여부=" + 사용여부 + "]";
	}
	
}

}
