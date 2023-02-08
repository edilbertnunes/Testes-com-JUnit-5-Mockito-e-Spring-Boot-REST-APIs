package br.comdicasdeumdev.api.resources;


import br.comdicasdeumdev.api.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @GetMapping(value = "/{id}")
    public ResponseEntity<User>findById(@PathVariable Integer id) {

        return ResponseEntity.ok(new User(1, "Edilbert","email@email.com", "123"));

    }


}
