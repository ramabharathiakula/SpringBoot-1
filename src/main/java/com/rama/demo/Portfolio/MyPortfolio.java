package com.rama.demo.Portfolio;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {
    MyPortfolio(){
        System.out.println("Hello Rama");
    }



    @GetMapping("/")
    public String Myself(){

        return """
                <h1>Myself</h1>
                <p>I am Akula Rama Bharathi</p>
                <ul>
                    <li>Github:https://github.com/ramabharathiakula</li>
                    <li>Linkdin:link</li>
                
                </ul>""";
    }
    @GetMapping("/skills")
    public String Skills(){
        return """
                <h1>Skills</h1>
                <p>I have cloud and security skills</p>
                <ul>
                    <li>Data science<li>
                    <li>Machine learning</li>
                    <li>Software testing</li>
                    <li>Data Structures And Algorithms</li>
                    <li>cpp</li>
                   
                
                </ul>""";
    }
    @GetMapping("/education")
    void Education(){
    }
    @GetMapping("/projects")
    void Project(){

    }
}