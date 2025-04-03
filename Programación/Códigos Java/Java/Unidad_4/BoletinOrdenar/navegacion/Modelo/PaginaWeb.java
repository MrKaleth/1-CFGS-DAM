package navegacion.Modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class PaginaWeb implements Comparable<PaginaWeb> {
	private String url;
	private LocalDate fechaVisita;
	private LocalTime horaVisita;

	public PaginaWeb(String url, LocalDate fechaVisita, LocalTime horaVisita) {
		super();
		this.url = url;
		this.fechaVisita = fechaVisita;
		this.horaVisita = horaVisita;
	}

	protected String getUrl() {
		return url;
	}

	protected void setUrl(String url) {
		this.url = url;
	}

	protected LocalDate getFechaVisita() {
		return fechaVisita;
	}

	protected void setFechaVisita(LocalDate fechaVisita) {
		this.fechaVisita = fechaVisita;
	}

	protected LocalTime getHoraVisita() {
		return horaVisita;
	}

	protected void setHoraVisita(LocalTime horaVisita) {
		this.horaVisita = horaVisita;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaVisita, horaVisita, url);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaginaWeb other = (PaginaWeb) obj;
		return Objects.equals(fechaVisita, other.fechaVisita) && Objects.equals(horaVisita, other.horaVisita)
				&& Objects.equals(url, other.url);
	}

	@Override
	public String toString() {
		return "PaginaWeb [url=" + url + ", fechaVisita=" + fechaVisita + ", horaVisita=" + horaVisita + "]";
	}

	@Override
	public int compareTo(PaginaWeb o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
