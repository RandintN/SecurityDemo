package simple.software.learn.clidemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping(path = "/")
  public ResponseEntity<String> hello() {
    return ResponseEntity.ok().body("Tudo que o Robson toca vira ouro!");
  }
}
