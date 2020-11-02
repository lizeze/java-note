package com.example.demo.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：lzz
 * @BelongsProject: com.example.demo.api
 * @date ：Created in 2020/10/27
 * @description ：
 * @modified By：
 */
@RestController
@RequestMapping("/api/first")
public class FirstController {

//    @GetMapping("/")
//    public ResponseEntity HelloWorld() {
//
//        return ResponseEntity.status(HttpStatus.OK).body("Hello World");
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity GetMetnod() {
        return ResponseEntity.status(HttpStatus.OK).body("get method");
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity PostMetnod() {
        return ResponseEntity.status(HttpStatus.OK).body("post method");
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public ResponseEntity PutMetnod() {
        return ResponseEntity.status(HttpStatus.OK).body("put method");
    }


    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public ResponseEntity DeleteMetnod() {
        return ResponseEntity.status(HttpStatus.OK).body("delete method");
    }

}
