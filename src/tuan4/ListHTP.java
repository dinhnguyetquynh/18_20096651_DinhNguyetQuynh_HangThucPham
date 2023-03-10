package tuan4;

import java.util.ArrayList;
import java.util.List;

public class ListHTP {
	List<HangThucPham> ls;
	public ListHTP() {
		// TODO Auto-generated constructor stub
		ls = new ArrayList<HangThucPham>();
		
	}
	public boolean themHTP(HangThucPham htp) {
		return ls.add(htp);
	}
	

}
