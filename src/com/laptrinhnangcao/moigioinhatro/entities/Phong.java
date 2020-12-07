package com.laptrinhnangcao.moigioinhatro.entities;
// Generated Dec 6, 2020, 3:59:30 PM by Hibernate Tools 5.4.21.Final

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Phong generated by hbm2java
 */
public class Phong implements java.io.Serializable {

	private Integer maPhong;
	private KhuVuc khuVuc;
	private LoaiPhong loaiPhong;
	private Serializable tenPhong;
	private double dienTich;
	private Integer sucChua;
	private Serializable diaChi;
	private Serializable moTaThem;
	private Set phieuDangPhongs = new HashSet(0);

	public Phong() {
	}

	public Phong(Serializable tenPhong, double dienTich, Serializable diaChi) {
		this.tenPhong = tenPhong;
		this.dienTich = dienTich;
		this.diaChi = diaChi;
	}

	public Phong(KhuVuc khuVuc, LoaiPhong loaiPhong, Serializable tenPhong, double dienTich, Integer sucChua,
			Serializable diaChi, Serializable moTaThem, Set phieuDangPhongs) {
		this.khuVuc = khuVuc;
		this.loaiPhong = loaiPhong;
		this.tenPhong = tenPhong;
		this.dienTich = dienTich;
		this.sucChua = sucChua;
		this.diaChi = diaChi;
		this.moTaThem = moTaThem;
		this.phieuDangPhongs = phieuDangPhongs;
	}

	public Integer getMaPhong() {
		return this.maPhong;
	}

	public void setMaPhong(Integer maPhong) {
		this.maPhong = maPhong;
	}

	public KhuVuc getKhuVuc() {
		return this.khuVuc;
	}

	public void setKhuVuc(KhuVuc khuVuc) {
		this.khuVuc = khuVuc;
	}

	public LoaiPhong getLoaiPhong() {
		return this.loaiPhong;
	}

	public void setLoaiPhong(LoaiPhong loaiPhong) {
		this.loaiPhong = loaiPhong;
	}

	public Serializable getTenPhong() {
		return this.tenPhong;
	}

	public void setTenPhong(Serializable tenPhong) {
		this.tenPhong = tenPhong;
	}

	public double getDienTich() {
		return this.dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	public Integer getSucChua() {
		return this.sucChua;
	}

	public void setSucChua(Integer sucChua) {
		this.sucChua = sucChua;
	}

	public Serializable getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(Serializable diaChi) {
		this.diaChi = diaChi;
	}

	public Serializable getMoTaThem() {
		return this.moTaThem;
	}

	public void setMoTaThem(Serializable moTaThem) {
		this.moTaThem = moTaThem;
	}

	public Set getPhieuDangPhongs() {
		return this.phieuDangPhongs;
	}

	public void setPhieuDangPhongs(Set phieuDangPhongs) {
		this.phieuDangPhongs = phieuDangPhongs;
	}

}