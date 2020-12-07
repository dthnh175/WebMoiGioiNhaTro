package com.laptrinhnangcao.moigioinhatro.entities;
// Generated Dec 6, 2020, 3:59:30 PM by Hibernate Tools 5.4.21.Final

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * LoaiPhong generated by hbm2java
 */
@Entity
@Table(name = "LOAI_PHONG")
public class LoaiPhong implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ma_loai_phong")
	private Integer maLoaiPhong;
	
	@Column(name = "ten_loai_phong")
	private String tenLoaiPhong;
	
//	@Column
	@OneToMany(mappedBy = "loaiPhong")
	private Set<Phong> phongs = new HashSet<Phong>(0);

	public LoaiPhong() {
	}

	public LoaiPhong(String tenLoaiPhong, Set<Phong> phongs) {
		this.tenLoaiPhong = tenLoaiPhong;
		this.phongs = phongs;
	}

	public Integer getMaLoaiPhong() {
		return this.maLoaiPhong;
	}

	public void setMaLoaiPhong(Integer maLoaiPhong) {
		this.maLoaiPhong = maLoaiPhong;
	}

	public Serializable getTenLoaiPhong() {
		return this.tenLoaiPhong;
	}

	public void setTenLoaiPhong(String tenLoaiPhong) {
		this.tenLoaiPhong = tenLoaiPhong;
	}

	public Set<Phong> getPhongs() {
		return this.phongs;
	}

	public void setPhongs(Set<Phong> phongs) {
		this.phongs = phongs;
	}

}
