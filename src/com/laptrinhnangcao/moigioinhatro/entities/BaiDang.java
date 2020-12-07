package com.laptrinhnangcao.moigioinhatro.entities;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BaiDang implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer maPhong;
	private String tieude = "Phong doi pham van dong";
	private KhuVuc khuVuc;
	private LoaiPhong loaiPhong;
	public String HienThi() {
		return tieude;
}
	
}
