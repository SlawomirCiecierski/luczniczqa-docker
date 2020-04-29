package pl.bydgoszcz.ciecierski.dockerluczniczqa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Luczniczqa {

    @GetMapping("/luczniczqa")
    public String hello() {
        String s="";
        s+="<p style=\"text-align: center\">";
        s+="ŁUCZNICZQA";
//        <img src="ścieżka dostępu" alt="Tekst alternatywny">
        s+="<img src=\"luczniczqa.jpg\" alt=\":)\">";
        s+="ŁUCZNICZQA";
        s+="</p>";
        return s;
    }

}
