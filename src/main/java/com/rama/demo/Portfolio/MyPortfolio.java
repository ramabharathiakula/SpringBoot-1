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
                <p>Iam pro efficient in</p>
                <ul>
                    <li>Data science<li>
                    <li>Machine learning</li>
                    <li>Software testing</li>
                    <li>Data Structures And Algorithms</li>
                    <li>cpp</li>
                   
                
                </ul>""";
    }
    @GetMapping("/education")
    public String Education(){
        return """
            
            <h1>Education</h1>
            <p>Iam Studying Btech in cse in 4th year</p>
            """;


    }
    @GetMapping("/projects")
    public String Projects(){
        return"""
                <h1>Projects</h1>
                <p>Real-Time Water Supply Tracker is a smart water distribution monitoring system developed using C++, Data Structures & Algorithms, HTML, CSS, and JavaScript. It models the water supply network as a graph and uses BFS, DFS, and Dijkstra's Algorithm to determine efficient water distribution routes. The application provides real-time visualization of pipelines, tanks, and supply status through an interactive web interface. It helps optimize water distribution, reduce delays, and improve resource management in urban water supply networks.</p>
                """;
                

    }
}