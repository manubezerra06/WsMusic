package service;

import java.util.ArrayList;
import java.util.List;

import model.Album;
import model.Band;
import model.Music;

public class BandDb {

	public static List<Band> bands;

	static {

		bands = new ArrayList<Band>();
		Band band = new Band();
		band.setNome("Led Zeppelin");
		Album album = new Album();
		album.setAno(1969);
		album.setNome("Led Zeppelin I");

		Music musica1 = new Music();
		Music musica2 = new Music();

		musica1.setNome("Good Times Bad Times");
		musica2.setNome("You Shook Me");

		List<Music> musics = new ArrayList<Music>();
		musics.add(musica1);
		musics.add(musica2);

		album.setMusics(musics);
		band.setAlbum(album);
		
		bands.add(band);

	}

	public static List<Band> getAll() {

		return bands;

	}

	public static Band getByName(String name) {

		for (Band b : bands) {
			if (b.getNome().equals(name))
				return b;
		}
		return null;

	}
}