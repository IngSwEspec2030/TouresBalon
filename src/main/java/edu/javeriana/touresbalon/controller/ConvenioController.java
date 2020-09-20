package edu.javeriana.touresbalon.controller;

import edu.javeriana.touresbalon.model.ConvenioObject;
import edu.javeriana.touresbalon.model.ConvenioResponse;
import edu.javeriana.touresbalon.service.ConvenioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/convenio")
public class ConvenioController {

  private ConvenioService cs;

  @Autowired
  public ConvenioController(ConvenioService cs) {
    this.cs = cs;
  }

  @Operation(summary = "Obtiene un convenio por id")
  @ApiResponses(value = {
          @ApiResponse(responseCode = "200", description = "Se obtuvo el convenio satisfactoriamente",
                  content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                          schema = @Schema(implementation = String.class))}),
          @ApiResponse(responseCode = "400", description = "Peticion incorrecta",
                  content = @Content),
          @ApiResponse(responseCode = "404", description = "convenio no encontrado",
                  content = @Content),
          @ApiResponse(responseCode = "500", description = "Error obteniendo el convenio",
                  content = @Content)})
  @GetMapping(path = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ConvenioResponse getConvenioById(@PathVariable("id") Integer id) {
    return cs.getConvenioById(id);
  }

  @Operation(summary = "Obtiene un convenio por nombre")
  @ApiResponses(value = {
          @ApiResponse(responseCode = "200", description = "Se obtuvo el convenio satisfactoriamente",
                  content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                          schema = @Schema(implementation = String.class))}),
          @ApiResponse(responseCode = "400", description = "Peticion incorrecta",
                  content = @Content),
          @ApiResponse(responseCode = "404", description = "convenio no encontrado",
                  content = @Content),
          @ApiResponse(responseCode = "500", description = "Error obteniendo el convenio",
                  content = @Content)})
  @GetMapping(path = "/nombre/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
  public List<ConvenioResponse> getConvenioByName(@PathVariable("name") String name) {
    return cs.getConvenioByName(name);
  }

  @Operation(summary = "Obtiene la informacion del convenio")
  @ApiResponses(value = {
          @ApiResponse(responseCode = "200", description = "Se obtuvo el convenio satisfactoriamente",
                  content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                          schema = @Schema(implementation = String.class))}),
          @ApiResponse(responseCode = "400", description = "Peticion incorrecta",
                  content = @Content),
          @ApiResponse(responseCode = "404", description = "convenio no encontrado",
                  content = @Content),
          @ApiResponse(responseCode = "500", description = "Error obteniendo el convenio",
                  content = @Content)})
  @GetMapping(path = "/info/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ConvenioObject getInfoConvenio(@PathVariable("id") Integer id) {
    return cs.getInfoConvenio(id);
  }

}
