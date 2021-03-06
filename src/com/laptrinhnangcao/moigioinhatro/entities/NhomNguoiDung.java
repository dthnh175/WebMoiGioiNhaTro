package com.laptrinhnangcao.moigioinhatro.entities;
// Generated Dec 6, 2020, 3:59:30 PM by Hibernate Tools 5.4.21.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * NhomNguoiDung generated by hbm2java
 */
public class NhomNguoiDung implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ma_nhom_nguoi_dung")
	private Integer maNhomNguoiDung;
	
	@JoinColumn(name = "ma_quyen")
	@ManyToOne
	private Quyen quyen;
	
	@Column(name = "ten_nhom_nguoi_dung")
	private String tenNhomNguoiDung;
	
	@OneToMany(mappedBy = "nhomNguoiDung")
	private Set<QuyenNguoiDung> quyenNguoiDungs = new HashSet<QuyenNguoiDung>(0);

	public NhomNguoiDung() {
	}

	public NhomNguoiDung(Quyen quyen, String tenNhomNguoiDung, Set<QuyenNguoiDung> quyenNguoiDungs) {
		this.quyen = quyen;
		this.tenNhomNguoiDung = tenNhomNguoiDung;
		this.quyenNguoiDungs = quyenNguoiDungs;
	}

	public Integer getMaNhomNguoiDung() {
		return this.maNhomNguoiDung;
	}

	public void setMaNhomNguoiDung(Integer maNhomNguoiDung) {
		this.maNhomNguoiDung = maNhomNguoiDung;
	}

	public Quyen getQuyen() {
		return this.quyen;
	}

	public void setQuyen(Quyen quyen) {
		this.quyen = quyen;
	}

	public String getTenNhomNguoiDung() {
		return this.tenNhomNguoiDung;
	}

	public void setTenNhomNguoiDung(String tenNhomNguoiDung) {
		this.tenNhomNguoiDung = tenNhomNguoiDung;
	}

	public Set<QuyenNguoiDung> getQuyenNguoiDungs() {
		return this.quyenNguoiDungs;
	}

	public void setQuyenNguoiDungs(Set<QuyenNguoiDung> quyenNguoiDungs) {
		this.quyenNguoiDungs = quyenNguoiDungs;
	}

}
