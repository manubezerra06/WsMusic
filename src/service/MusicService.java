package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Band;

@Path("/band")
public class MusicService {

	@GET
	@Path("/{nome}")
	@Produces(MediaType.APPLICATION_XML)
	public Band getBands(@PathParam("nome") String nome) {

		return BandDb.getByName(nome);
	}
}
