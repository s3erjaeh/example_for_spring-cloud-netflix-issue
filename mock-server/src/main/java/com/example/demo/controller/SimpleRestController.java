package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;

import static java.util.Arrays.asList;

@RestController
public class SimpleRestController {

  @PostMapping(path = "test", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
  public String handleFileUpload(@RequestParam String name) {
    System.out.println("name = " + name);
    return "200";
  }
}
