package com.laptrinhnangcao.moigioinhatro.beans;

import java.util.List;

import javax.faces.bean.*;

import com.laptrinhnangcao.moigioinhatro.entities.Phong;
import com.laptrinhnangcao.moigioinhatro.models.PhongModel;

@ManagedBean(name = "phongManagedBean")
@SessionScoped
public class PhongManagedBean {
	private List<Phong> phongs;

	public List<Phong> getPhongs() {
		return phongs;
	}

	public void setPhongs(List<Phong> phongs) {
		this.phongs = phongs;
	}

	public PhongManagedBean() {
		PhongModel phongModel = new PhongModel();
		this.phongs = phongModel.findAll();
	}

}
