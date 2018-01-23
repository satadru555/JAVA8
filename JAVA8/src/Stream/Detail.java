package Stream;

import java.util.List;

public class Detail {

	private int detail_id;
	private List<String> parts;
	public Detail(int detail_id, List<String> parts) {
		super();
		this.detail_id = detail_id;
		this.parts = parts;
	}
	public int getDetail_id() {
		return detail_id;
	}
	public void setDetail_id(int detail_id) {
		this.detail_id = detail_id;
	}
	public List<String> getParts() {
		return parts;
	}
	public void setParts(List<String> parts) {
		this.parts = parts;
	}
	@Override
	public String toString() {
		return "Detail [detail_id=" + detail_id + ", parts=" + parts + "]";
	}
	
	
	
}
