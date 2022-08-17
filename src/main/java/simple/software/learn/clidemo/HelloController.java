package simple.software.learn.clidemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping(path = "/")
  public ResponseEntity<String> hello(@RequestParam(value = "name", defaultValue = "Robson") String name) {
    return ResponseEntity.ok().body(String.format("Tudo que o %s toca vira ouro!", name));
  }
}
