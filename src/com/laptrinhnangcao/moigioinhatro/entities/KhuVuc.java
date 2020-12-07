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
 * KhuVuc generated by hbm2java
 */
@Entity
@Table(name = "KHU_VUC")
public class KhuVuc implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ma_khu_vuc")
	private Integer maKhuVuc;
	
	@Column(name = "ten_khu_vuc")
	private String tenKhuVuc;
	
//	@Column
	@OneToMany(mappedBy = "khuVuc")
	private Set<Phong> phongs = new HashSet<Phong>(0);

	public KhuVuc() {
	}

	public KhuVuc(String tenKhuVuc, Set<Phong> phongs) {
		this.tenKhuVuc = tenKhuVuc;
		this.phongs = phongs;
	}

	public Integer getMaKhuVuc() {
		return this.maKhuVuc;
	}

	public void setMaKhuVuc(Integer maKhuVuc) {
		this.maKhuVuc = maKhuVuc;
	}

	public Serializable getTenKhuVuc() {
		return this.tenKhuVuc;
	}

	public void setTenKhuVuc(String tenKhuVuc) {
		this.tenKhuVuc = tenKhuVuc;
	}

	public Set<Phong> getPhongs() {
		return this.phongs;
	}

	public void setPhongs(Set<Phong> phongs) {
		this.phongs = phongs;
	}

}
