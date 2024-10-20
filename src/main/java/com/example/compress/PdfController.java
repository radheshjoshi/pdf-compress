package com.example.compress;

import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/")
public class PdfController {

    @RequestMapping(value = "/_upload", method = RequestMethod.POST)
    public ResponseEntity<Resource> uploadPdf(@RequestParam MultipartFile file){

        return null;
    }
}
