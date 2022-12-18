package com.univlittoral.philippe.dto;

import java.util.List;

public class HomeDto {
	private List<LivreDto> livres;
	private IndicateursDto indicateurs;
	private List<AuteurDto> auteurs;
	private AuteurDto auteur;
	
	public AuteurDto getAuteur() {
		return auteur;
	}
	public void setAuteur(AuteurDto auteur) {
		this.auteur = auteur;
	}
	public List<AuteurDto> getAuteurs() {
		return auteurs;
	}
	public void setAuteurs(List<AuteurDto> auteurs) {
		this.auteurs = auteurs;
	}
	public List<LivreDto> getLivres() {
		return livres;
	}
	public void setLivres(List<LivreDto> livres) {
		this.livres = livres;
	}
	public IndicateursDto getIndicateurs() {
		return indicateurs;
	}
	public void setIndicateurs(IndicateursDto indicateurs) {
		this.indicateurs = indicateurs;
	}
}
