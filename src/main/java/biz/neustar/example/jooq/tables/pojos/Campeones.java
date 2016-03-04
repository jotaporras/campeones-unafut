/**
 * This class is generated by jOOQ
 */
package biz.neustar.example.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Campeones implements Serializable {

	private static final long serialVersionUID = -1552436696;

	private Integer id;
	private String  temporada;
	private Integer campeonId;

	public Campeones() {}

	public Campeones(Campeones value) {
		this.id = value.id;
		this.temporada = value.temporada;
		this.campeonId = value.campeonId;
	}

	public Campeones(
		Integer id,
		String  temporada,
		Integer campeonId
	) {
		this.id = id;
		this.temporada = temporada;
		this.campeonId = campeonId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTemporada() {
		return this.temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public Integer getCampeonId() {
		return this.campeonId;
	}

	public void setCampeonId(Integer campeonId) {
		this.campeonId = campeonId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Campeones (");

		sb.append(id);
		sb.append(", ").append(temporada);
		sb.append(", ").append(campeonId);

		sb.append(")");
		return sb.toString();
	}
}