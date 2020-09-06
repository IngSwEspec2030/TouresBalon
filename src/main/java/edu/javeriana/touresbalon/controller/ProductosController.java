package edu.javeriana.touresbalon.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import java.io.IOException;

@RestController
@RequestMapping("api/v1/productos")
@Slf4j
public class ProductosController {


    @Operation(summary = "Upload a file")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "File uploaded successfully",
                    content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = String.class))}),
            @ApiResponse(responseCode = "400", description = "Invalid file type",
                    content = @Content),
            @ApiResponse(responseCode = "500", description = "Error saving file",
                    content = @Content)})
    @PostMapping(value = "/upload")
    public ResponseEntity<?> uploadFile(@NotNull @RequestParam("file") MultipartFile file) {

        return null;
    }

    @Operation(summary = "List files in server")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Gets the filenames"),
            @ApiResponse(responseCode = "500", description = "Error reading files",
                    content = @Content)})
    @GetMapping(value = "/")
    public ResponseEntity<?> listUploadedFiles() throws IOException {

        return null;
    }

    @Operation(summary = "Deletes a file")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "File deleted successfully"),
            @ApiResponse(responseCode = "400", description = "Filename is invalid",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "File not found",
                    content = @Content),
            @ApiResponse(responseCode = "500", description = "Error deleting file",
                    content = @Content)})
    @DeleteMapping(value = "/{fileName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteFile(@PathVariable("fileName") String fileName) throws IOException {
        return null;

    }

}
