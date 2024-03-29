package com.github.projetoifsc.estagios.app.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@JsonPropertyOrder(value = {"id", "titulo", "entidade", "links"})
@Schema(name="Vaga")
@Validated
public class VagaDTO extends DTO {

	@JsonProperty("id")
	@Schema(accessMode = Schema.AccessMode.READ_ONLY, example = "1")
	private String id;

	@JsonProperty("criadorId")
	@Schema(accessMode = Schema.AccessMode.READ_ONLY)
	@NotNull
	@Valid
	private OrgDTO owner;

	@JsonProperty("titulo")
	@Schema(example="Vaga de desenhista Junior")
	@NotBlank
	private String title;

	public VagaDTO() {}

	public VagaDTO(String id, OrgDTO owner, String title) {
		this.id = id;
		this.owner = owner;
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public OrgDTO getOwner() {
		return owner;
	}

	public void setOwner(OrgDTO owner) {
		this.owner = owner;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	@Override
	public void addHypermediaLinks() {
		//
	}
}
